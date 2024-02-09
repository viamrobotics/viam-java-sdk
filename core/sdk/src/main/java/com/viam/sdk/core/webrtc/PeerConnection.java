package com.viam.sdk.core.webrtc;

import java.util.List;
import java.util.logging.Logger;

public interface PeerConnection {
    DataChannel createDataChannel(final String label, final DataChannel.Init dataChanInit);
    SessionDescription getLocalDescription();

    SessionDescription getRemoteDescription();

    void createOffer(final SessionDescription.Observer observer);

    void createAnswer(final SessionDescription.Observer observer);

    void setLocalDescription(final SessionDescription.Observer observer, final SessionDescription sdp);

    void setRemoteDescription(final SessionDescription.Observer observer, final SessionDescription sdp);

    void addIceCandidate(final ICECandidate candidate);

    void close();

    class RTCConfiguration {
        public final List<ICEServer> iceServers;
        public BundlePolicy bundlePolicy;
        public SDPSemantics sdpSemantics;

        public RTCConfiguration(final List<ICEServer> iceServers) {
            this.iceServers = iceServers;
        }
    }

    class ICEServer {
        public final String uri;
        public String username;
        public String password;

        public ICEServer(final String uri) {
            this(uri, "", "");
        }

        public ICEServer(final String uri, final String username, final String password) {
            this.uri = uri;
            this.username = username;
            this.password = password;
        }
    }

    enum SDPSemantics {
        PLAN_B,
        UNIFIED_PLAN;
        SDPSemantics() {
        }
    }

    enum BundlePolicy {
        BALANCED,
        MAXBUNDLE,
        MAXCOMPAT;
        BundlePolicy() {
        }
    }

    enum SignalingState {
        STABLE,
        HAVE_LOCAL_OFFER,
        HAVE_LOCAL_PRANSWER,
        HAVE_REMOTE_OFFER,
        HAVE_REMOTE_PRANSWER,
        CLOSED;

        SignalingState() {
        }
    }

    enum ICEConnectionState {
        NEW,
        CHECKING,
        CONNECTED,
        COMPLETED,
        FAILED,
        DISCONNECTED,
        CLOSED;

        ICEConnectionState() {
        }
    }

    enum State {
        NEW,
        CONNECTING,
        CONNECTED,
        DISCONNECTED,
        FAILED,
        CLOSED;

        State() {
        }
    }

    enum ICEGatheringState {
        NEW,
        GATHERING,
        COMPLETE;

        ICEGatheringState() {
        }
    }

    interface Observer<MediaStreamT> {
        void onSignalingChange(final SignalingState newState);

        void onICEConnectionChange(final ICEConnectionState newState);

        default void onConnectionChange(final State ignoredNewState) {
        }

        void onICEGatheringChange(final ICEGatheringState newState);

        void onICECandidate(final ICECandidate candidate);

        default void onICECandidateError(ICECandidateErrorEvent ignoredEvent) {
        }

        void onICECandidatesRemoved(final ICECandidate[] candidates);

        void onRenegotiationNeeded();

        void onDataChannel(final DataChannel dataChannel);

        void onAddStream(MediaStreamT var1);

        void onRemoveStream(MediaStreamT var1);

        default void onAddTrack() {
            Logger.getAnonymousLogger().finest("onAddTrack: not yet implemented");
        }

        default void onRemoveTrack() {
            Logger.getAnonymousLogger().finest("onRemoveTrack: not yet implemented");
        }

        default void onTrack() {
            Logger.getAnonymousLogger().finest("onTrack: not yet implemented");
        }
    }

    interface MediaStreamObserver<MediaStreamT> {
        void onAddStream(MediaStreamT var1);

        void onRemoveStream(MediaStreamT var1);

        default void onAddTrack() {
            Logger.getAnonymousLogger().finest("onAddTrack: not yet implemented");
        }

        default void onRemoveTrack() {
            Logger.getAnonymousLogger().finest("onRemoveTrack: not yet implemented");
        }

        default void onTrack() {
            Logger.getAnonymousLogger().finest("onTrack: not yet implemented");
        }
    }
}
