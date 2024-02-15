package com.viam.sdk.java.webrtc;

import dev.onvoid.webrtc.RTCDataChannel;
import dev.onvoid.webrtc.RTCDataChannelBuffer;
import dev.onvoid.webrtc.RTCDataChannelObserver;

public class DataChannel implements com.viam.sdk.core.webrtc.DataChannel {

  private final RTCDataChannel nativeDataChannel;

  public DataChannel(final RTCDataChannel nativeDataChannel) {
    this.nativeDataChannel = nativeDataChannel;
  }

  private static RTCDataChannelObserver toNativeDataChannelObserver(final Observer observer) {
    return new RTCDataChannelObserver() {

      @Override
      public void onBufferedAmountChange(long previousAmount) {
        observer.onBufferedAmountChange(previousAmount);
      }

      @Override
      public void onStateChange() {
        observer.onStateChange();
      }

      @Override
      public void onMessage(RTCDataChannelBuffer buffer) {
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
    try {
      this.nativeDataChannel.send(new RTCDataChannelBuffer(message.data, message.binary));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void close() {
    this.nativeDataChannel.close();
    this.nativeDataChannel.dispose();
  }

  @Override
  public State state() {
    final State ourState;
    switch (this.nativeDataChannel.getState()) {
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
        throw new IllegalStateException("unknown state: " + this.nativeDataChannel.getState());
    }
    return ourState;
  }
}
