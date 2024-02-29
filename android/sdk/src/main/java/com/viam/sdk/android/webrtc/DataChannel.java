package com.viam.sdk.android.webrtc;

public class DataChannel implements com.viam.sdk.core.webrtc.DataChannel {

  private final org.webrtc.DataChannel nativeDataChannel;

  public DataChannel(final org.webrtc.DataChannel nativeDataChannel) {
    this.nativeDataChannel = nativeDataChannel;
  }

  private static org.webrtc.DataChannel.Observer toNativeDataChannelObserver(
      final DataChannel.Observer observer) {
    return new org.webrtc.DataChannel.Observer() {

      public void onBufferedAmountChange(long previousAmount) {
        observer.onBufferedAmountChange(previousAmount);
      }

      @Override
      public void onStateChange() {
        observer.onStateChange();
      }

      @Override
      public void onMessage(org.webrtc.DataChannel.Buffer buffer) {
        observer.onMessage(new Buffer(buffer.data, buffer.binary));
      }
    };
  }

  @Override
  public void registerObserver(final Observer observer) {
    this.nativeDataChannel.registerObserver(toNativeDataChannelObserver(observer));
  }

  @Override
  public void unregisterObserver() {
    this.nativeDataChannel.unregisterObserver();
  }

  @Override
  public void send(final Buffer message) {
    this.nativeDataChannel.send(new org.webrtc.DataChannel.Buffer(message.data, message.binary));
  }

  @Override
  public void close() {
    this.nativeDataChannel.close();
  }

  @Override
  public State state() {
    final State ourState;
    switch (this.nativeDataChannel.state()) {
      case CONNECTING:
        ourState = State.CONNECTING;
        break;
      case OPEN:
        ourState = State.OPEN;
        break;
      case CLOSING:
        ourState = State.CLOSING;
        break;
      case CLOSED:
        ourState = State.CLOSED;
        break;
      default:
        throw new IllegalStateException("unknown state: " + this.nativeDataChannel.state());
    }
    return ourState;
  }
}
