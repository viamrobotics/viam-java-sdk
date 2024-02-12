package com.viam.sdk.core.webrtc;

import org.json.JSONException;
import org.json.JSONObject;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Logger;

public abstract class PeerConnectionFactory<MediaStreamT> {
    protected abstract PeerConnection createPeerConnection(
            final PeerConnection.RTCConfiguration rtcConfig,
            final PeerConnection.Observer<MediaStreamT> observer);

    public abstract void close();

    public CompletableFuture<RPCPeerConnection> newPeerConnectionForClient(
            final boolean disableTrickle,
            PeerConnection.RTCConfiguration rtcConfig,
            final PeerConnection.Observer<MediaStreamT> peerConnectionObserver,
            final Logger logger
    ) {
        final PeerConnection.ICEServer iceServer = new PeerConnection.ICEServer("stun:global.stun.twilio.com:3478");
        if (rtcConfig == null || rtcConfig.iceServers.size() == 0) {
            rtcConfig = new PeerConnection.RTCConfiguration(Collections.singletonList(iceServer));
            rtcConfig.bundlePolicy = PeerConnection.BundlePolicy.MAXCOMPAT;
            rtcConfig.sdpSemantics = PeerConnection.SDPSemantics.UNIFIED_PLAN;
        }


        final CompletableFuture<Void> done = new CompletableFuture<>();
        if (disableTrickle) {
            throw new IllegalStateException("cannot provide connection observer and disable trickle");
        }
        final PeerConnection peerConnection = this.createPeerConnection(rtcConfig, peerConnectionObserver);

        final DataChannel.Init dataChanInit = new DataChannel.Init();
        dataChanInit.id = 0;
        dataChanInit.negotiated = true;
        dataChanInit.ordered = true;
        final DataChannel dataChannel = peerConnection.createDataChannel("data", dataChanInit);

        final DataChannel.Init negChanInit = new DataChannel.Init();
        negChanInit.id = 1;
        negChanInit.negotiated = true;
        negChanInit.ordered = true;
        final DataChannel negChan =  peerConnection.createDataChannel("negotiation", negChanInit);

        final RPCPeerConnection rpcConn = new RPCPeerConnection(peerConnection, dataChannel, negChan);
        negChan.registerObserver(new DataChannel.Observer() {
            @Override
            public void onStateChange() {

            }

            @Override
            public void onMessage(DataChannel.Buffer buffer) {
                byte[] data = new byte[buffer.data.remaining()];
                buffer.data.get(data);

                final JSONObject remoteSDPObj;
                try {
                    remoteSDPObj = new JSONObject(new String(Base64.getDecoder().decode(data)));
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
                final SessionDescription.Type remoteSDPType;
                final String remoteSDPTypeStr;
                try {
                    remoteSDPTypeStr = remoteSDPObj.getString("type");
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
                switch (remoteSDPTypeStr) {
                    case "offer":
                        remoteSDPType = SessionDescription.Type.OFFER;
                        break;
                    case "pranswer":
                        remoteSDPType = SessionDescription.Type.PRANSWER;
                        break;
                    case "answer":
                        remoteSDPType = SessionDescription.Type.ANSWER;
                        break;
                    case "rollback":
                        remoteSDPType = SessionDescription.Type.ROLLBACK;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown sdp type: " + remoteSDPTypeStr);
                }
                final String remoteSDPStr;
                try {
                    remoteSDPStr = remoteSDPObj.getString("sdp");
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
                final SessionDescription remoteSDP = new SessionDescription(
                        remoteSDPType,
                        remoteSDPStr);

                rpcConn.peerConnection.setRemoteDescription(new SessionDescription.Observer() {
                    @Override
                    public void onCreateSuccess(SessionDescription sessionDescription) {

                    }

                    @Override
                    public void onSetSuccess() {
                        rpcConn.peerConnection.createAnswer(new SessionDescription.Observer() {
                            @Override
                            public void onCreateSuccess(SessionDescription sessionDescription) {
                                rpcConn.peerConnection.setLocalDescription(new SessionDescription.Observer() {
                                    @Override
                                    public void onCreateSuccess(SessionDescription sessionDescription) {

                                    }

                                    @Override
                                    public void onSetSuccess() {
                                        final SessionDescription localDesc = rpcConn.peerConnection.getLocalDescription();
                                        final JSONObject localDescJSON = new JSONObject();
                                        final String sdpTypeStr;
                                        switch (localDesc.type) {
                                            case OFFER:
                                                sdpTypeStr = "offer";
                                                break;
                                            case PRANSWER:
                                                sdpTypeStr = "pranswer";
                                                break;
                                            case ANSWER:
                                                sdpTypeStr = "answer";
                                                break;
                                            case ROLLBACK:
                                                sdpTypeStr = "rollback";
                                                break;
                                            default:
                                                throw new IllegalArgumentException("unknown sdp type: " + localDesc.type);
                                        }
                                        try {
                                            localDescJSON.put("type", sdpTypeStr);
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }
                                        try {
                                            localDescJSON.put("sdp", localDesc.description);
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }
                                        final byte[] sdpEncoded = Base64.getEncoder().encode(localDescJSON.toString().getBytes(StandardCharsets.UTF_8));
                                        try {
                                            negChan.send(new DataChannel.Buffer(ByteBuffer.wrap(sdpEncoded), true));
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    }

                                    @Override
                                    public void onCreateFailure(String s) {

                                    }

                                    @Override
                                    public void onSetFailure(String s) {
                                        logger.warning("onSetFailure: " + s);
                                    }
                                }, sessionDescription);
                            }

                            @Override
                            public void onSetSuccess() {

                            }

                            @Override
                            public void onCreateFailure(String s) {
                                logger.warning("onCreateFailure: " + s);
                            }

                            @Override
                            public void onSetFailure(String s) {

                            }
                        });
                    }

                    @Override
                    public void onCreateFailure(String s) {

                    }

                    @Override
                    public void onSetFailure(String s) {
                        logger.warning("onSetFailure: " + s);
                    }
                }, remoteSDP);
            }
        });

        //noinspection ConstantValue
        if (!disableTrickle) {
            return CompletableFuture.completedFuture(rpcConn);
        }

        final CompletableFuture<RPCPeerConnection> createDone = new CompletableFuture<>();
        rpcConn.peerConnection.createOffer(new SessionDescription.Observer() {
            @Override
            public void onCreateSuccess(SessionDescription sessionDescription) {
                rpcConn.peerConnection.setLocalDescription(this, sessionDescription);
            }

            @Override
            public void onSetSuccess() {
                createDone.complete(rpcConn);
            }

            @Override
            public void onCreateFailure(String s) {
                createDone.completeExceptionally(new Exception(s));
            }

            @Override
            public void onSetFailure(String s) {
                createDone.completeExceptionally(new Exception(s));
            }
        });

        return done.thenCompose((Void) -> createDone);
    }
}
