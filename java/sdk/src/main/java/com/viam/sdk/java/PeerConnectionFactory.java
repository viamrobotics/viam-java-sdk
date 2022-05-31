package com.viam.sdk.java;

import static com.viam.sdk.core.webrtc.PeerConnection.ICEConnectionState.CHECKING;
import static com.viam.sdk.core.webrtc.PeerConnection.ICEConnectionState.COMPLETED;
import static com.viam.sdk.core.webrtc.PeerConnection.ICEConnectionState.CONNECTED;
import static com.viam.sdk.core.webrtc.PeerConnection.ICEConnectionState.DISCONNECTED;
import static com.viam.sdk.core.webrtc.PeerConnection.ICEConnectionState.FAILED;
import static com.viam.sdk.core.webrtc.PeerConnection.ICEConnectionState.NEW;
import static com.viam.sdk.core.webrtc.PeerConnection.ICEGatheringState.COMPLETE;
import static com.viam.sdk.core.webrtc.PeerConnection.ICEGatheringState.GATHERING;
import static com.viam.sdk.core.webrtc.PeerConnection.SignalingState.CLOSED;
import static com.viam.sdk.core.webrtc.PeerConnection.SignalingState.HAVE_LOCAL_OFFER;
import static com.viam.sdk.core.webrtc.PeerConnection.SignalingState.HAVE_LOCAL_PRANSWER;
import static com.viam.sdk.core.webrtc.PeerConnection.SignalingState.HAVE_REMOTE_OFFER;
import static com.viam.sdk.core.webrtc.PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER;
import static com.viam.sdk.core.webrtc.PeerConnection.SignalingState.STABLE;

import com.viam.sdk.core.webrtc.ICECandidate;
import dev.onvoid.webrtc.*;
import dev.onvoid.webrtc.media.MediaStream;

import java.util.Collections;

public class PeerConnectionFactory extends com.viam.sdk.core.webrtc.PeerConnectionFactory<MediaStream> {
    private final dev.onvoid.webrtc.PeerConnectionFactory peerConnFactory;

    public PeerConnectionFactory() {
        super();
        this.peerConnFactory = new dev.onvoid.webrtc.PeerConnectionFactory();
    }

    @Override
    public void close() {
        this.peerConnFactory.dispose();
    }

    @Override
    public com.viam.sdk.core.webrtc.PeerConnection createPeerConnection(
            final PeerConnection.RTCConfiguration rtcConfig,
            final PeerConnection.Observer<MediaStream> observer) {
        return new PeerConnection(this.peerConnFactory.createPeerConnection(
                toNativeRTCConfiguration(rtcConfig),
                toNativePeerConnectionObserver(observer)));
    }

    private static RTCConfiguration toNativeRTCConfiguration(final PeerConnection.RTCConfiguration rtcConfiguration) {
        final RTCConfiguration nativeConfig = new RTCConfiguration();
        if (rtcConfiguration.iceServers.size() != 0) {
            for (int i = 0 ; i < rtcConfiguration.iceServers.size(); i++) {
                final PeerConnection.ICEServer server = rtcConfiguration.iceServers.get(i);
                final RTCIceServer iceServer = new RTCIceServer();
                iceServer.urls = Collections.singletonList(server.uri);
                if (server.username != null) {
                    iceServer.username = server.username;
                }
                if (server.password != null) {
                    iceServer.password = server.password;
                }
                nativeConfig.iceServers.add(iceServer);
            }
        }
        if (rtcConfiguration.bundlePolicy != null) {
            switch (rtcConfiguration.bundlePolicy) {
                case BALANCED:
                    nativeConfig.bundlePolicy = RTCBundlePolicy.BALANCED;
                    break;
                case MAXBUNDLE:
                    nativeConfig.bundlePolicy = RTCBundlePolicy.MAX_BUNDLE;
                    break;
                case MAXCOMPAT:
                    nativeConfig.bundlePolicy = RTCBundlePolicy.MAX_COMPAT;
                    break;
            }
        }
        return nativeConfig;
    }

    private static PeerConnectionObserver toNativePeerConnectionObserver(final PeerConnection.Observer<MediaStream> observer) {
        return new PeerConnectionObserver() {
            @Override
            public void onSignalingChange(final RTCSignalingState state) {
                final PeerConnection.SignalingState ourState;
                switch (state) {
                    case STABLE:
                        ourState = STABLE;
                        break;
                    case HAVE_LOCAL_OFFER:
                        ourState = HAVE_LOCAL_OFFER;
                        break;
                    case HAVE_LOCAL_PR_ANSWER:
                        ourState = HAVE_LOCAL_PRANSWER;
                        break;
                    case HAVE_REMOTE_OFFER:
                        ourState = HAVE_REMOTE_OFFER;
                        break;
                    case HAVE_REMOTE_PR_ANSWER:
                        ourState = HAVE_REMOTE_PRANSWER;
                        break;
                    case CLOSED:
                        ourState = CLOSED;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown state: " + state);
                }
                observer.onSignalingChange(ourState);
            }

            @Override
            public void onConnectionChange(final RTCPeerConnectionState state) {
                final com.viam.sdk.core.webrtc.PeerConnection.State ourState;
                switch (state) {
                    case NEW:
                        ourState = com.viam.sdk.core.webrtc.PeerConnection.State.NEW;
                        break;
                    case CONNECTING:
                        ourState = com.viam.sdk.core.webrtc.PeerConnection.State.CONNECTING;
                        break;
                    case CONNECTED:
                        ourState = com.viam.sdk.core.webrtc.PeerConnection.State.CONNECTED;
                        break;
                    case DISCONNECTED:
                        ourState = com.viam.sdk.core.webrtc.PeerConnection.State.DISCONNECTED;
                        break;
                    case FAILED:
                        ourState = com.viam.sdk.core.webrtc.PeerConnection.State.FAILED;
                        break;
                    case CLOSED:
                        ourState = com.viam.sdk.core.webrtc.PeerConnection.State.CLOSED;
                        break;
                    default:
                        throw new IllegalStateException("unknown state: " + state);
                }
                observer.onConnectionChange(ourState);
            }

            @Override
            public void onIceConnectionChange(final RTCIceConnectionState state) {
                final PeerConnection.ICEConnectionState ourState;
                switch (state) {
                    case NEW:
                        ourState = NEW;
                        break;
                    case CHECKING:
                        ourState = CHECKING;
                        break;
                    case CONNECTED:
                        ourState =  CONNECTED;
                        break;
                    case COMPLETED:
                        ourState =  COMPLETED;
                        break;
                    case FAILED:
                        ourState = FAILED;
                        break;
                    case DISCONNECTED:
                        ourState = DISCONNECTED;
                        break;
                    case CLOSED:
                        ourState = PeerConnection.ICEConnectionState.CLOSED;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown state: " + state);
                }
                observer.onICEConnectionChange(ourState);
            }

            @Override
            public void onIceGatheringChange(final RTCIceGatheringState state) {
                final PeerConnection.ICEGatheringState ourState;
                switch (state) {
                    case NEW:
                        ourState = PeerConnection.ICEGatheringState.NEW;
                        break;
                    case GATHERING:
                        ourState = GATHERING;
                        break;
                    case COMPLETE:
                        ourState = COMPLETE;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown state: " + state);
                }
                observer.onICEGatheringChange(ourState);
            }

            @Override
            public void onIceCandidate(final RTCIceCandidate candidate) {
                observer.onICECandidate(toICECandidate(candidate));
            }

            @Override
            public void onIceCandidatesRemoved(final RTCIceCandidate[] candidates) {
                final ICECandidate[] ourCandidates = new ICECandidate[candidates.length];
                for (int i = 0; i < candidates.length; i++) {
                    ourCandidates[i] = toICECandidate(candidates[i]);
                }
                observer.onICECandidatesRemoved(ourCandidates);
            }

            @Override
            public void onAddStream(final MediaStream mediaStream) {
                observer.onAddStream(mediaStream);
            }

            @Override
            public void onRemoveStream(final MediaStream mediaStream) {
                observer.onRemoveStream(mediaStream);
            }

            @Override
            public void onDataChannel(final RTCDataChannel dataChannel) {
                observer.onDataChannel(new DataChannel(dataChannel));
            }

            @Override
            public void onRenegotiationNeeded() {
                observer.onRenegotiationNeeded();
            }

            @Override
            public void onAddTrack(final RTCRtpReceiver receiver, final MediaStream[] mediaStreams) {
                observer.onAddTrack();
            }

            @Override
            public void onRemoveTrack(final RTCRtpReceiver receiver) {
                observer.onRemoveTrack();
            }

            @Override
            public void onTrack(final RTCRtpTransceiver transceiver) {
                observer.onTrack();
            }
        };
    }

    private static ICECandidate toICECandidate(final RTCIceCandidate nativeCandidate) {
        return new ICECandidate(nativeCandidate.sdpMid, nativeCandidate.sdpMLineIndex, nativeCandidate.sdp);
    }
}
