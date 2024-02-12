package com.viam.sdk.android;

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

import android.content.Context;

import com.viam.sdk.core.webrtc.ICECandidate;

import org.webrtc.DataChannel;
import org.webrtc.DefaultVideoDecoderFactory;
import org.webrtc.DefaultVideoEncoderFactory;
import org.webrtc.EglBase;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoEncoderFactory;

import java.util.ArrayList;

public class PeerConnectionFactory extends com.viam.sdk.core.webrtc.PeerConnectionFactory<MediaStream> {
    private final EglBase eglBase;
    private final org.webrtc.PeerConnectionFactory peerConnFactory;

    public PeerConnectionFactory(final Context applicationContext) {
        super();
        org.webrtc.PeerConnectionFactory.InitializationOptions initializationOptions =
                org.webrtc.PeerConnectionFactory.InitializationOptions.builder(applicationContext)
                        .createInitializationOptions();
        org.webrtc.PeerConnectionFactory.initialize(initializationOptions);

        eglBase = EglBase.create(null, EglBase.CONFIG_PLAIN);
        VideoEncoderFactory encoderFactory = new DefaultVideoEncoderFactory(
                eglBase.getEglBaseContext(), true, true);
        VideoDecoderFactory decoderFactory = new DefaultVideoDecoderFactory(eglBase.getEglBaseContext());

        this.peerConnFactory = org.webrtc.PeerConnectionFactory.builder()
                .setOptions(new org.webrtc.PeerConnectionFactory.Options())
                .setVideoDecoderFactory(decoderFactory)
                .setVideoEncoderFactory(encoderFactory)
                .createPeerConnectionFactory();
    }

    @Override
    public void close() {
        this.peerConnFactory.dispose();
    }

    public EglBase getEGLBase() {
        return this.eglBase;
    }

    @Override
    public com.viam.sdk.core.webrtc.PeerConnection createPeerConnection(
            final PeerConnection.RTCConfiguration rtcConfig,
            final PeerConnection.Observer<MediaStream> observer) {
        return new PeerConnection(this.peerConnFactory.createPeerConnection(
                toNativeRTCConfiguration(rtcConfig),
                toNativePeerConnectionObserver(observer)));
    }

    private static org.webrtc.PeerConnection.RTCConfiguration toNativeRTCConfiguration(final PeerConnection.RTCConfiguration rtcConfiguration) {
        final org.webrtc.PeerConnection.RTCConfiguration nativeConfig = new org.webrtc.PeerConnection.RTCConfiguration(new ArrayList<>());
        if (rtcConfiguration.iceServers.size() != 0) {
            for (int i = 0 ; i < rtcConfiguration.iceServers.size(); i++) {
                final PeerConnection.ICEServer server = rtcConfiguration.iceServers.get(i);
                final org.webrtc.PeerConnection.IceServer.Builder serverBuilder =
                        org.webrtc.PeerConnection.IceServer.builder(server.uri);
                if (server.username != null) {
                    serverBuilder.setUsername(server.username);
                }
                if (server.password != null) {
                    serverBuilder.setPassword(server.password);
                }
                nativeConfig.iceServers.add(serverBuilder.createIceServer());
            }
        }
        if (rtcConfiguration.bundlePolicy != null) {
            switch (rtcConfiguration.bundlePolicy) {
                case BALANCED:
                    nativeConfig.bundlePolicy = org.webrtc.PeerConnection.BundlePolicy.BALANCED;
                    break;
                case MAXBUNDLE:
                    nativeConfig.bundlePolicy = org.webrtc.PeerConnection.BundlePolicy.MAXBUNDLE;
                    break;
                case MAXCOMPAT:
                    nativeConfig.bundlePolicy = org.webrtc.PeerConnection.BundlePolicy.MAXCOMPAT;
                    break;
            }
        }
        if (rtcConfiguration.sdpSemantics != null) {
            switch (rtcConfiguration.sdpSemantics) {
                case PLAN_B:
                    //noinspection deprecation
                    nativeConfig.sdpSemantics = org.webrtc.PeerConnection.SdpSemantics.PLAN_B;
                    break;
                case UNIFIED_PLAN:
                    nativeConfig.sdpSemantics = org.webrtc.PeerConnection.SdpSemantics.UNIFIED_PLAN;
                    break;
            }
        }
        return nativeConfig;
    }

    private static org.webrtc.PeerConnection.Observer toNativePeerConnectionObserver(final PeerConnection.Observer<MediaStream> observer) {
        return new org.webrtc.PeerConnection.Observer() {
            @Override
            public void onSignalingChange(final org.webrtc.PeerConnection.SignalingState signalingState) {
                final PeerConnection.SignalingState ourState;
                switch (signalingState) {
                    case STABLE:
                        ourState = STABLE;
                        break;
                    case HAVE_LOCAL_OFFER:
                        ourState = HAVE_LOCAL_OFFER;
                        break;
                    case HAVE_LOCAL_PRANSWER:
                        ourState = HAVE_LOCAL_PRANSWER;
                        break;
                    case HAVE_REMOTE_OFFER:
                        ourState = HAVE_REMOTE_OFFER;
                        break;
                    case HAVE_REMOTE_PRANSWER:
                        ourState = HAVE_REMOTE_PRANSWER;
                        break;
                    case CLOSED:
                        ourState = CLOSED;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown state: " + signalingState);
                }
                observer.onSignalingChange(ourState);
            }

            @Override
            public void onIceConnectionChange(final org.webrtc.PeerConnection.IceConnectionState iceConnectionState) {
                final PeerConnection.ICEConnectionState ourState;
                switch (iceConnectionState) {
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
                        throw new IllegalArgumentException("unknown state: " + iceConnectionState);
                }
                observer.onICEConnectionChange(ourState);
            }

            @Override
            public void onIceConnectionReceivingChange(final boolean b) {

            }

            @Override
            public void onIceGatheringChange(final org.webrtc.PeerConnection.IceGatheringState iceGatheringState) {
                final PeerConnection.ICEGatheringState ourState;
                switch (iceGatheringState) {
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
                        throw new IllegalArgumentException("unknown state: " + iceGatheringState);
                }
                observer.onICEGatheringChange(ourState);
            }

            @Override
            public void onIceCandidate(final IceCandidate iceCandidate) {
                observer.onICECandidate(toICECandidate(iceCandidate));
            }

            @Override
            public void onIceCandidatesRemoved(final IceCandidate[] iceCandidates) {
                final ICECandidate[] candidates = new ICECandidate[iceCandidates.length];
                for (int i = 0; i < iceCandidates.length; i++) {
                    candidates[i] = toICECandidate(iceCandidates[i]);
                }
                observer.onICECandidatesRemoved(candidates);
            }

            @Override
            public void onDataChannel(final DataChannel dataChannel) {
                observer.onDataChannel(new com.viam.sdk.android.DataChannel(dataChannel));
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
            public void onRenegotiationNeeded() {
                observer.onRenegotiationNeeded();
            }

            @Override
            public void onAddTrack(final RtpReceiver receiver, final MediaStream[] mediaStreams) {
                observer.onAddTrack();
            }

            @Override
            public void onRemoveTrack(final RtpReceiver receiver) {
                observer.onRemoveTrack();
            }

            @Override
            public void onTrack(final RtpTransceiver transceiver) {
                observer.onTrack();
            }
        };
    }

    private static ICECandidate toICECandidate(final IceCandidate nativeCandidate) {
        return new ICECandidate(nativeCandidate.sdpMid, nativeCandidate.sdpMLineIndex, nativeCandidate.sdp);
    }
}
