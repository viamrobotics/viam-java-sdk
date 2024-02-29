package com.viam.sdk.core.webrtc;

import java.nio.ByteBuffer;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class BaseChannel implements DataChannel.Observer {

  private final RPCPeerConnection rpcConn;
  private final Consumer<DataChannel.Buffer> onMessage;
  private final CompletableFuture<Void> ready;
  private boolean closed = false;
  private Exception closedReason = null;

  public BaseChannel(RPCPeerConnection rpcConn, Consumer<DataChannel.Buffer> onMessage) {
    this.rpcConn = rpcConn;
    this.onMessage = onMessage;

    this.ready = new CompletableFuture<>();

    rpcConn.dataChannel.registerObserver(this);
  }

  public CompletableFuture<Void> ready() {
    return this.ready;
  }

  public void close() {
    this.closeWithReason(null);
  }

  public boolean isClosed() {
    return this.closed;
  }

  public Optional<Exception> isClosedReason() {
    return Optional.of(this.closedReason);
  }

  private void closeWithReason(final Exception err) {
    if (this.closed) {
      return;
    }
    this.closed = true;
    this.closedReason = err;
    this.rpcConn.close();
  }

  private void onChannelOpen() {
    this.ready.complete(null);
  }

  private void onChannelClose() {
    this.closeWithReason(new Exception("data channel closed"));
  }

  protected void write(final com.google.protobuf.GeneratedMessageV3 msg) {
    final DataChannel.Buffer buf = new DataChannel.Buffer(ByteBuffer.wrap(msg.toByteArray()), true);
    try {
      this.rpcConn.dataChannel.send(buf);
    } catch (final Exception e) {
      this.closeWithReason(e);
    }
  }

  @Override
  public void onStateChange() {
    switch (this.rpcConn.dataChannel.state()) {
      case CONNECTING:
      case CLOSING:
        break;
      case OPEN:
        this.onChannelOpen();
        break;
      case CLOSED:
        this.onChannelClose();
        break;
    }
  }

  @Override
  public void onMessage(DataChannel.Buffer buffer) {
    this.onMessage.accept(buffer);
  }
}
