package com.viam.sdk.core.webrtc;

import java.nio.ByteBuffer;

public interface DataChannel {

    void registerObserver(final Observer observer);

    void unregisterObserver();

    boolean send(final Buffer message);

    void close();

    State state();

    class Init {
        public boolean ordered = true;
        public int maxRetransmitTimeMs = -1;
        public int maxRetransmits = -1;
        public String protocol = "";
        public boolean negotiated;
        public int id = -1;

        public Init() {
        }
    }

    interface Observer {
        void onBufferedAmountChange(long previousAmount);
        void onStateChange();
        void onMessage(final Buffer message);
    }

    class Buffer {
        public final ByteBuffer data;
        public final boolean binary;

        public Buffer(final ByteBuffer data, final boolean binary) {
            this.data = data;
            this.binary = binary;
        }
    }

    enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        State() {
        }
    }
}
