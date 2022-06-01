package com.viam.sdk.android;

import com.viam.sdk.core.webrtc.ICECandidate;
import com.viam.sdk.core.webrtc.SessionDescription;

import org.webrtc.IceCandidate;
import org.webrtc.MediaConstraints;
import org.webrtc.SdpObserver;

public class PeerConnection implements com.viam.sdk.core.webrtc.PeerConnection {

    private final org.webrtc.PeerConnection nativePeerConnection;

    public PeerConnection(final org.webrtc.PeerConnection nativePeerConnection) {
        this.nativePeerConnection = nativePeerConnection;
    }

    @Override
    public DataChannel createDataChannel(final String label, final DataChannel.Init dataChanInit) {
        final org.webrtc.DataChannel.Init nativeInit = new org.webrtc.DataChannel.Init();
        nativeInit.ordered = dataChanInit.ordered;
        nativeInit.maxRetransmitTimeMs = dataChanInit.maxRetransmitTimeMs;
        nativeInit.maxRetransmits = dataChanInit.maxRetransmits;
        nativeInit.protocol = dataChanInit.protocol;
        nativeInit.negotiated = dataChanInit.negotiated;
        nativeInit.id = dataChanInit.id;

        return new DataChannel(nativePeerConnection.createDataChannel(label, nativeInit));
    }

    @Override
    public SessionDescription getLocalDescription() {
        return toSessionDescription(this.nativePeerConnection.getLocalDescription());
    }

    @Override
    public SessionDescription getRemoteDescription() {
        return toSessionDescription(this.nativePeerConnection.getRemoteDescription());
    }

    @Override
    public void createOffer(final SessionDescription.Observer observer) {
        this.nativePeerConnection.createOffer(toNativeSDPObserver(observer), new MediaConstraints());
    }

    @Override
    public void createAnswer(final SessionDescription.Observer observer) {
        this.nativePeerConnection.createAnswer(toNativeSDPObserver(observer), new MediaConstraints());
    }

    @Override
    public void setLocalDescription(final SessionDescription.Observer observer, SessionDescription sdp) {
        this.nativePeerConnection.setLocalDescription(toNativeSDPObserver(observer), toNativeSessionDescription(sdp));
    }

    @Override
    public void setRemoteDescription(final SessionDescription.Observer observer, final SessionDescription sdp) {
        this.nativePeerConnection.setRemoteDescription(toNativeSDPObserver(observer), toNativeSessionDescription(sdp));
    }

    @Override
    public void addIceCandidate(final ICECandidate candidate) {
        this.nativePeerConnection.addIceCandidate(new IceCandidate(candidate.sdpMid, candidate.sdpMLineIndex, candidate.sdp));
    }

    @Override
    public void close() {
        this.nativePeerConnection.close();
    }

    private SdpObserver toNativeSDPObserver(final SessionDescription.Observer observer) {
        return new SdpObserver() {
            @Override
            public void onCreateSuccess(final org.webrtc.SessionDescription sessionDescription) {
                observer.onCreateSuccess(toSessionDescription(sessionDescription));
            }

            @Override
            public void onSetSuccess() {
                observer.onSetSuccess();
            }

            @Override
            public void onCreateFailure(final String s) {
                observer.onCreateFailure(s);
            }

            @Override
            public void onSetFailure(final String s) {
                observer.onSetFailure(s);
            }
        };
    }

    private static SessionDescription toSessionDescription(final org.webrtc.SessionDescription sessionDescription) {
        final SessionDescription.Type ourType;
        switch (sessionDescription.type) {
            case OFFER:
                ourType = SessionDescription.Type.OFFER;
                break;
            case PRANSWER:
                ourType = SessionDescription.Type.PRANSWER;
                break;
            case ANSWER:
                ourType = SessionDescription.Type.ANSWER;
                break;
            case ROLLBACK:
                ourType = SessionDescription.Type.ROLLBACK;
                break;
            default:
                throw new IllegalStateException("unknown sdp type: " + sessionDescription.type);
        }
        return new SessionDescription(ourType, sessionDescription.description);
    }

    private static org.webrtc.SessionDescription toNativeSessionDescription(final SessionDescription sessionDescription) {
        final org.webrtc.SessionDescription.Type sdpType;
        switch (sessionDescription.type) {
            case OFFER:
                sdpType = org.webrtc.SessionDescription.Type.OFFER;
                break;
            case PRANSWER:
                sdpType = org.webrtc.SessionDescription.Type.PRANSWER;
                break;
            case ANSWER:
                sdpType = org.webrtc.SessionDescription.Type.ANSWER;
                break;
            case ROLLBACK:
                sdpType = org.webrtc.SessionDescription.Type.ROLLBACK;
                break;
            default:
                throw new IllegalStateException("unknown sdp type: " + sessionDescription.type);
        }
        return new org.webrtc.SessionDescription(sdpType, sessionDescription.description);
    }
}
