package com.viam.sdk.core.webrtc;

import java.nio.ByteBuffer;

public interface DataChannel {

  void registerObserver(final Observer observer);

  void unregisterObserver();

  void send(final Buffer message);

  void close();

  State state();

  enum State {
    CONNECTING,
    OPEN,
    CLOSING,
    CLOSED;

    State() {
    }
  }

  interface Observer {

    default void onBufferedAmountChange(long previousAmount) {

    }

    void onStateChange();

    void onMessage(final Buffer message);
  }

  class Init {

    public final int maxRetransmitTimeMs = -1;
    public final int maxRetransmits = -1;
    public final String protocol = "";
    public boolean ordered = true;
    public boolean negotiated;
    public int id = -1;

    public Init() {
    }
  }

  class Buffer {

    public final ByteBuffer data;
    public final boolean binary;

    public Buffer(final ByteBuffer data, final boolean binary) {
      this.data = data;
      this.binary = binary;
    }
  }
}
