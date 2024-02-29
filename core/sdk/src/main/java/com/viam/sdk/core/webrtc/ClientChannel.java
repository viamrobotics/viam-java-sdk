package com.viam.sdk.core.webrtc;

import com.google.protobuf.InvalidProtocolBufferException;
import com.viam.sdk.core.rpc.Channel;
import io.grpc.CallCredentials;
import io.grpc.CallOptions;
import io.grpc.ClientCall;
import io.grpc.MethodDescriptor;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Logger;
import proto.rpc.webrtc.v1.Grpc;

public class ClientChannel extends Channel {

  // MaxStreamCount is the max number of streams a channel can have.
  public static final int MaxStreamCount = 256;

  protected final RPCPeerConnection rpcConn;
  private final Map<Long, ClientStream<?, ?>> streams = new HashMap<>();
  private final BaseChannel baseChannel;
  private final Logger logger;
  private long streamIDCounter = 0;

  public ClientChannel(final RPCPeerConnection rpcConn, final Logger logger) {
    this.rpcConn = rpcConn;
    this.baseChannel = new BaseChannel(rpcConn, this::onChannelMessage);
    this.logger = logger;
  }

  private synchronized void onChannelMessage(DataChannel.Buffer buf) {
    final Grpc.Response resp;
    try {
      resp = Grpc.Response.parseFrom(buf.data);
    } catch (InvalidProtocolBufferException e) {
      e.printStackTrace();
      return;
    }

    if (!resp.hasStream()) {
      logger.warning("no stream id; discarding");
      return;
    }
    final Grpc.Stream stream = resp.getStream();

    final long id = stream.getId();
    final ClientStream<?, ?> activeStream = this.streams.get(id);
    if (activeStream == null) {
      logger.warning("no stream for id; discarding: id=" + id);
      return;
    }
    activeStream.onResponse(resp);
  }

  public CompletableFuture<Void> ready() {
    return this.baseChannel.ready();
  }

  private synchronized Grpc.Stream nextStreamID() {
    return Grpc.Stream.newBuilder().setId(this.streamIDCounter++).build();
  }

  @Override
  @SuppressWarnings("unchecked")
  public synchronized <RequestT, ResponseT> ClientCall<RequestT, ResponseT> newCall(
      MethodDescriptor<RequestT, ResponseT> methodDescriptor, CallOptions callOptions) {
    final Grpc.Stream stream = nextStreamID();
    ClientStream<?, ?> activeStream = this.streams.get(stream.getId());
    if (activeStream == null) {
      if (this.streams.size() > MaxStreamCount) {
        throw new Error("stream limit hit");
      }
      activeStream = new ClientStream<>(
          methodDescriptor,
          this,
          stream,
          (final Long id) -> {
            this.removeStreamByID(id);
            return null;
          },
          callOptions,
          logger
      );
      this.streams.put(stream.getId(), activeStream);
    }
    return (ClientCall<RequestT, ResponseT>) activeStream;
  }

  private synchronized void removeStreamByID(final long number) {
    this.streams.remove(number);
  }

  public void writeHeaders(Grpc.Stream stream, Grpc.RequestHeaders headers) {
    final Grpc.Request request = Grpc.Request.newBuilder()
        .setStream(stream)
        .setHeaders(headers)
        .build();
    this.baseChannel.write(request);
  }

  public void writeMessage(Grpc.Stream stream, Grpc.RequestMessage msg) {
    final Grpc.Request request = Grpc.Request.newBuilder()
        .setStream(stream)
        .setMessage(msg)
        .build();
    this.baseChannel.write(request);
  }

  @Override
  public String authority() {
    return "rpc";
  }

  @Override
  public void close() {
    this.rpcConn.close();
  }

  @Override
  public Optional<CallCredentials> getCallCredentials() {
    return Optional.empty();
  }
}
