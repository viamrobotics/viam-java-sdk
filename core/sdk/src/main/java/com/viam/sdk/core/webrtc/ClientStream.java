package com.viam.sdk.core.webrtc;

import com.google.common.io.ByteStreams;
import com.google.common.primitives.Bytes;
import com.google.protobuf.ByteString;
import io.grpc.CallOptions;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import proto.rpc.webrtc.v1.Grpc;

public class ClientStream<RequestT, ResponseT> extends io.grpc.ClientCall<RequestT, ResponseT> {

  // see golang/client_stream.go
  private static final int MAX_REQUEST_MESSAGE_PACKET_DATA_SIZE = 16373;

  private final BaseStream baseStream;
  private final ClientChannel channel;
  private final CallOptions callOptions;
  private final MethodDescriptor<RequestT, ResponseT> methodDescriptor;
  private final Logger logger;
  private boolean headersReceived = false;
  private boolean trailersReceived = false;
  private Listener<ResponseT> responseListener;
  private int numRequests;

  public ClientStream(
      final MethodDescriptor<RequestT, ResponseT> methodDescriptor,
      final ClientChannel channel,
      final Grpc.Stream stream,
      final Function<Long, Void> onDone,
      final CallOptions callOptions,
      final Logger logger
  ) {
    this.methodDescriptor = methodDescriptor;
    this.logger = logger;
    this.baseStream = new BaseStream(stream, onDone, logger);
    this.channel = channel;
    this.callOptions = callOptions;
  }

  // from https://github.com/jsmouret/grpc-over-webrtc/blob/45cd6d6cf516e78b1e262ea7aa741bc7a7a93dbc/client-improbable/src/grtc/webrtcclient.ts#L7
  private static Grpc.Metadata.Builder fromGRPCMetadata(Metadata metadata) {
    final Grpc.Metadata.Builder builder = Grpc.Metadata.newBuilder();
    if (metadata == null) {
      return builder;
    }
    for (String key : metadata.keys()) {
      final Iterable<String> values = metadata.getAll(
          Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER));
      if (values == null) {
        continue;
      }
      final Grpc.Strings.Builder strings = Grpc.Strings.newBuilder();
      for (final String value : values) {
        strings.addValues(value);
      }
      builder.putMd(key, strings.build());
    }
    return builder;
  }

  private static Metadata toGRPCMetadata(final Grpc.Metadata metadata) {
    final Metadata result = new Metadata();
    if (metadata == null) {

      return result;
    }
    metadata.getMdMap().forEach(
        (key, mdValues) -> mdValues.getValuesList().forEach(
            (final String value) -> result.put(
                Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER), value)));
    return result;
  }

  @Override
  public void start(final Listener<ResponseT> responseListener, Metadata headers) {
    this.responseListener = responseListener;
    final String method = "/" + this.methodDescriptor.getFullMethodName();
    final Grpc.RequestHeaders requestHeaders = Grpc.RequestHeaders.newBuilder()
        .setMethod(method)
        .setMetadata(fromGRPCMetadata(headers))
        .build();
    try {
      this.channel.writeHeaders(this.baseStream.stream, requestHeaders);
    } catch (final Exception e) {
      logger.warning("error writing headers: " + e);
      this.baseStream.closeWithRecvError(e);
    }

    if (this.callOptions.getExecutor() == null) {
      this.responseListener.onReady();
    } else {
      this.callOptions.getExecutor().execute(responseListener::onReady);
    }
  }

  @Override
  public synchronized void request(int numMessages) {
    this.numRequests += numMessages;
  }

  @Override
  public void cancel(@Nullable String message, @Nullable Throwable cause) {
    this.baseStream.closeWithRecvError(new Exception(message, cause));
  }

  @Override
  public void halfClose() {
    this.writeMessage(true, null);
  }

  @Override
  public void sendMessage(RequestT message) {
    try {
      if (message == null) {
        this.writeMessage(false, null);
        return;
      }
      final InputStream messageStream = this.methodDescriptor.getRequestMarshaller()
          .stream(message);
      this.writeMessage(false, Bytes.asList(ByteStreams.toByteArray(messageStream)));
    } catch (IOException e) {
      e.printStackTrace();
      this.baseStream.closeWithRecvError(e);
    }
  }

  private void writeMessage(boolean eos, List<Byte> msgBytes) {
    if (msgBytes == null || msgBytes.size() == 0) {
      final Grpc.PacketMessage packet = Grpc.PacketMessage.newBuilder()
          .setEom(true)
          .build();
      final Grpc.RequestMessage requestMessage = Grpc.RequestMessage.newBuilder()
          .setHasMessage(msgBytes != null)
          .setPacketMessage(packet)
          .setEos(eos)
          .build();
      this.channel.writeMessage(this.baseStream.stream, requestMessage);
      return;
    }

    while (msgBytes.size() != 0) {
      final int amountToSend = Math.min(msgBytes.size(), MAX_REQUEST_MESSAGE_PACKET_DATA_SIZE);
      final Grpc.PacketMessage.Builder packetBuilder = Grpc.PacketMessage.newBuilder();
      packetBuilder.setData(ByteString.copyFrom(Bytes.toArray(msgBytes.subList(0, amountToSend))));
      msgBytes = msgBytes.subList(amountToSend, msgBytes.size());
      if (msgBytes.size() == 0) {
        packetBuilder.setEom(true);
      }
      final Grpc.RequestMessage requestMessage = Grpc.RequestMessage.newBuilder()
          .setHasMessage(true)
          .setPacketMessage(packetBuilder.build())
          .setEos(eos)
          .build();
      this.channel.writeMessage(this.baseStream.stream, requestMessage);
    }
  }

  public void onResponse(final Grpc.Response resp) {
    switch (resp.getTypeCase()) {
      case HEADERS:
        if (this.headersReceived) {
          this.baseStream.closeWithRecvError(new Exception("headers already received"));
          return;
        }
        if (this.trailersReceived) {
          this.baseStream.closeWithRecvError(new Exception("headers received after trailers"));
          return;
        }
        this.processHeaders(resp.getHeaders());
        break;
      case MESSAGE:
        if (!this.headersReceived) {
          this.baseStream.closeWithRecvError(new Exception("headers not yet received"));
          return;
        }
        if (this.trailersReceived) {
          this.baseStream.closeWithRecvError(new Exception("headers received after trailers"));
          return;
        }
        this.processMessage(resp.getMessage());
        break;
      case TRAILERS:
        this.processTrailers(resp.getTrailers());
        break;
      default:
        logger.warning("unknown response type: " + resp.getTypeCase());
        break;
    }
  }

  private synchronized void processHeaders(final Grpc.ResponseHeaders headers) {
    this.headersReceived = true;
    final Metadata metadata = toGRPCMetadata(headers.getMetadata());
    if (this.callOptions.getExecutor() == null) {
      this.responseListener.onHeaders(metadata);
    } else {
      this.callOptions.getExecutor().execute(() -> responseListener.onHeaders(metadata));
    }
    // TODO(erd): need?
    // close(s.headersReceived)
  }

  private synchronized void processMessage(final Grpc.ResponseMessage msg) {
    final Optional<List<Byte>> resultOpt = this.baseStream.processPacketMessage(
        msg.getPacketMessage());
    //noinspection SimplifyOptionalCallChains
    if (!resultOpt.isPresent()) {
      return;
    }
    if (this.numRequests == 0) {
      throw new IllegalStateException("no requested messages remaining");
    }
    this.numRequests--;
    final List<Byte> result = resultOpt.get();
    final ResponseT resp = this.methodDescriptor.getResponseMarshaller()
        .parse(new ByteArrayInputStream(Bytes.toArray(result)));

    if (this.callOptions.getExecutor() == null) {
      this.responseListener.onMessage(resp);
    } else {
      this.callOptions.getExecutor().execute(() -> responseListener.onMessage(resp));
    }
  }

  @SuppressWarnings("DefaultLocale")
  private synchronized void processTrailers(Grpc.ResponseTrailers trailers) {
    this.trailersReceived = true;
    final Status status = Status.fromCodeValue(trailers.getStatus().getCode());

    final Metadata metadata = toGRPCMetadata(trailers.getMetadata());
    if (this.callOptions.getExecutor() == null) {
      this.responseListener.onClose(status, metadata);
    } else {
      this.callOptions.getExecutor().execute(() -> responseListener.onClose(status, metadata));
    }

    if (status == Status.OK) {
      this.baseStream.closeWithRecvError(null);
      return;
    }
    this.baseStream.closeWithRecvError(new Exception(
        String.format("Code=%d Message=%s", trailers.getStatus().getCode(),
            trailers.getStatus().getMessage())));
  }
}
