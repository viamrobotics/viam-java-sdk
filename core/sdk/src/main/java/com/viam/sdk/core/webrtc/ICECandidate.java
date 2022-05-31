package com.viam.sdk.core.webrtc;

public class ICECandidate {
    public final String sdpMid;
    public final int sdpMLineIndex;
    public final String sdp;

    public ICECandidate(final String sdpMid, final int sdpMLineIndex, final String sdp) {
        this.sdpMid = sdpMid;
        this.sdpMLineIndex = sdpMLineIndex;
        this.sdp = sdp;
    }
}
