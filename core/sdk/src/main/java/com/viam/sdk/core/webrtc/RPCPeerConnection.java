package com.viam.sdk.core.webrtc;

public class RPCPeerConnection {
    final public PeerConnection peerConnection;
    final public DataChannel dataChannel;
    private final DataChannel negChan;

    public RPCPeerConnection(final PeerConnection peerConnection, final DataChannel dataChannel, final DataChannel negChan) {
        this.peerConnection = peerConnection;
        this.dataChannel = dataChannel;
        this.negChan = negChan;
    }

    public void close() {
        this.negChan.unregisterObserver();
        this.negChan.close();
        this.dataChannel.unregisterObserver();
        this.dataChannel.close();
        this.peerConnection.close();
    }
}
