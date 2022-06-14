package com.viam.sdk.core;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.rpc.Code;
import com.google.rpc.Status;
import com.viam.sdk.core.webrtc.ClientChannel;
import com.viam.sdk.core.webrtc.DataChannel;
import com.viam.sdk.core.webrtc.DialWebRTCOptions;
import com.viam.sdk.core.webrtc.ICECandidate;
import com.viam.sdk.core.webrtc.PeerConnection;
import com.viam.sdk.core.webrtc.PeerConnectionFactory;
import com.viam.sdk.core.webrtc.SessionDescription;

import org.json.JSONException;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Logger;

import io.grpc.CallCredentials;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import proto.rpc.v1.Auth;
import proto.rpc.v1.AuthServiceGrpc;
import proto.rpc.webrtc.v1.Signaling;
import proto.rpc.webrtc.v1.SignalingServiceGrpc;

public abstract class Dialer<MediaStreamT, T extends PeerConnectionFactory<MediaStreamT>> {
    private final T peerConnectionFactory;

    protected Dialer(final T peerConnectionFactory) {
        this.peerConnectionFactory = peerConnectionFactory;
    }

    public void close() {
        this.peerConnectionFactory.close();
    }

    protected T getPeerConnectionFactory() {
        return peerConnectionFactory;
    }

    public Channel dialDirectGRPC(
            final String address,
            final DialOptions opts) {

        ManagedChannelBuilder<?> channelBuilder = ManagedChannelBuilder.forTarget(address);
        if (opts != null && opts.insecure) {
            channelBuilder = channelBuilder.usePlaintext();
        }
        if (opts != null && opts.authority != null) {
            channelBuilder = channelBuilder.overrideAuthority(opts.authority);
        }

        final ManagedChannel channel = channelBuilder.build();
        if (opts == null || opts.credentials == null) {
            return new BasicManagedChannel(channel);
        }

        final AtomicReference<String> accessToken = new AtomicReference<>("");
        final CallCredentials callCreds = new CallCredentials() {
            @Override
            public void applyRequestMetadata(RequestInfo requestInfo, Executor appExecutor, MetadataApplier applier) {
                if (accessToken.get().isEmpty()) {
                    // TODO(erd): can use same channel in pure java and android?
                    ManagedChannelBuilder<?> channelBuilder = ManagedChannelBuilder.forTarget(address);
                    if (opts.insecure) {
                        channelBuilder = channelBuilder.usePlaintext();
                    }
                    final ManagedChannel channel = channelBuilder.build();
                    final Auth.AuthenticateRequest.Builder authReqBuilder = Auth.AuthenticateRequest.newBuilder();
                    if (opts.authEntity == null) {
                        authReqBuilder.setEntity(address);
                    } else {
                        authReqBuilder.setEntity(opts.authEntity);
                    }
                    authReqBuilder.setCredentials(Auth.Credentials.newBuilder()
                            .setType(opts.credentials.getType())
                            .setPayload(opts.credentials.getPayload()));
                    try {
                        final AuthServiceGrpc.AuthServiceBlockingStub authClient = AuthServiceGrpc.newBlockingStub(channel);
                        Auth.AuthenticateResponse authResp = authClient.authenticate(authReqBuilder.build());
                        accessToken.set(authResp.getAccessToken());
                    } finally {
                        channel.shutdownNow();
                    }
                }

                final Metadata md = new Metadata();
                md.put(Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + accessToken.get());
                applier.apply(md);
            }

            @Override
            public void thisUsesUnstableApi() {
                // yes I know
            }
        };

        return new BasicManagedChannel(channel, callCreds);
    }

    public abstract CompletableFuture<Channel> dialWebRTC(
            final String signalingAddress,
            final String host,
            final DialOptions opts);

    public CompletableFuture<Channel> dialWebRTC(
            final String signalingAddress,
            final String host,
            final DialOptions opts,
            final Executor executor,
            final PeerConnection.MediaStreamObserver<MediaStreamT> mediaStreamObserver,
            final Logger logger
    ) {
        final Metadata md = new Metadata();
        md.put(Metadata.Key.of("rpc-host", Metadata.ASCII_STRING_MARSHALLER), host);

        final DialOptions optsCopy = opts.clone();

        optsCopy.insecure = opts.webrtcOptions != null && opts.webrtcOptions.signalingInsecure;
        if (optsCopy.webrtcOptions == null) {
            optsCopy.webrtcOptions = new DialWebRTCOptions();
        }
        optsCopy.webrtcOptions.signalingServerAddress = signalingAddress;
        if (opts.webrtcOptions != null) {
            optsCopy.credentials = opts.webrtcOptions.signalingCredentials;
            optsCopy.externalAuthAddress = opts.webrtcOptions.signalingExternalAuthAddress;
            optsCopy.externalAuthToEntity = opts.webrtcOptions.signalingExternalAuthToEntity;
            optsCopy.externalAuthInsecure = opts.webrtcOptions.signalingExternalAuthInsecure;
            optsCopy.authority = opts.webrtcOptions.authority;
        }

        if (optsCopy.authEntity == null || optsCopy.authEntity.isEmpty()) {
            if (optsCopy.externalAuthAddress == null || optsCopy.externalAuthAddress.isEmpty()) {
                optsCopy.authEntity = host;
            } else {
                optsCopy.authEntity = optsCopy.externalAuthToEntity;
            }
        }

        ManagedChannelBuilder<?> signalChannelBuilder = ManagedChannelBuilder.forTarget(signalingAddress);
        if (optsCopy.insecure) {
            signalChannelBuilder = signalChannelBuilder.usePlaintext();
        }
        if (optsCopy.authority != null) {
            signalChannelBuilder = signalChannelBuilder.overrideAuthority(optsCopy.authority);
        }
        final ManagedChannel signalingChannel = signalChannelBuilder.build();
        boolean inAsync = false;
        try {
            final AtomicReference<String> accessToken = new AtomicReference<>("");
            CallCredentials callCreds = null;
            if (optsCopy.credentials != null) {
                callCreds = new CallCredentials() {
                    @Override
                    public void applyRequestMetadata(RequestInfo requestInfo, Executor appExecutor, MetadataApplier applier) {
                        if (accessToken.get().isEmpty()) {
                            ManagedChannelBuilder<?> signalChannelBuilder = ManagedChannelBuilder.forTarget(signalingAddress);
                            if (optsCopy.insecure) {
                                signalChannelBuilder = signalChannelBuilder.usePlaintext();
                            }
                            if (optsCopy.authority != null) {
                                signalChannelBuilder = signalChannelBuilder.overrideAuthority(optsCopy.authority);
                            }
                            final ManagedChannel signalingChannel = signalChannelBuilder.build();
                            try {
                                final AuthServiceGrpc.AuthServiceBlockingStub authClient = AuthServiceGrpc.newBlockingStub(signalingChannel);
                                Auth.AuthenticateResponse authResp = authClient.authenticate(Auth.AuthenticateRequest.newBuilder()
                                        .setEntity(host)
                                        .setCredentials(Auth.Credentials.newBuilder()
                                                .setType(optsCopy.credentials.getType())
                                                .setPayload(optsCopy.credentials.getPayload()))
                                        .build());
                                accessToken.set(authResp.getAccessToken());
                            } finally {
                                signalingChannel.shutdownNow();
                            }
                        }

                        final Metadata md = new Metadata();
                        md.put(Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + accessToken.get());
                        applier.apply(md);
                    }

                    @Override
                    public void thisUsesUnstableApi() {
                        // yes I know
                    }
                };
            }

            SignalingServiceGrpc.SignalingServiceFutureStub signalingClient =
                    SignalingServiceGrpc.newFutureStub(signalingChannel)
                            .withExecutor(executor)
                            .withInterceptors(MetadataUtils.newAttachHeadersInterceptor(md));
            SignalingServiceGrpc.SignalingServiceBlockingStub signalingClientBlock =
                    SignalingServiceGrpc.newBlockingStub(signalingChannel)
                            .withInterceptors(MetadataUtils.newAttachHeadersInterceptor(md));
            if (callCreds != null) {
                signalingClient = signalingClient.withCallCredentials(callCreds);
                signalingClientBlock = signalingClientBlock.withCallCredentials(callCreds);
            }

            final CompletableFuture<Void> gotConfig = new CompletableFuture<>();
            final ListenableFuture<Signaling.OptionalWebRTCConfigResponse> respFut = signalingClient
                    .optionalWebRTCConfig(
                            Signaling.OptionalWebRTCConfigRequest.newBuilder().build());

            PeerConnection.RTCConfiguration rtcConfiguration = new PeerConnection.RTCConfiguration(new ArrayList<>());
            Futures.addCallback(respFut, new FutureCallback<>() {
                @Override
                public void onSuccess(Signaling.OptionalWebRTCConfigResponse result) {
                    for (int i = 0; i < result.getConfig().getAdditionalIceServersCount(); i++) {
                        final Signaling.ICEServer server = result.getConfig().getAdditionalIceServers(i);
                        final PeerConnection.ICEServer iceServer = new PeerConnection.ICEServer(server.getUrlsList().get(0));
                        if (!server.getUsername().isEmpty()) {
                            iceServer.username = server.getUsername();
                        }
                        if (!server.getCredential().isEmpty()) {
                            iceServer.password = server.getCredential();
                        }
                        rtcConfiguration.iceServers.add(iceServer);
                    }
                    gotConfig.complete(null);
                }

                @Override
                public void onFailure(final Throwable t) {
                    gotConfig.completeExceptionally(t);
                }
            }, executor);

            final CompletableFuture<Void> remoteDescSet = new CompletableFuture<>();
            final SignalingServiceGrpc.SignalingServiceBlockingStub finalSignalingClientBlock = signalingClientBlock;
            AtomicBoolean exchangeDone = new AtomicBoolean(false);
            AtomicBoolean iceComplete = new AtomicBoolean(false);
            AtomicReference<String> uuid = new AtomicReference<>("");

            // only send once since exchange may end or ICE may end
            final Object exchangeMu = new Object();
            final AtomicBoolean sentDoneOrError = new AtomicBoolean(false);
            final Callable<Void> sendDone = () -> {
                synchronized (exchangeMu) {
                    if (sentDoneOrError.get() || exchangeDone.get()) {
                        return null;
                    }
                    sentDoneOrError.set(true);
                }
                finalSignalingClientBlock.callUpdate(Signaling.CallUpdateRequest.newBuilder()
                        .setUuid(uuid.get())
                        .setDone(true)
                        .build());
                return null;
            };
            final Function<String, Void> sendError = (msg) -> {
                synchronized (exchangeMu) {
                    if (sentDoneOrError.get() || exchangeDone.get()) {
                        return null;
                    }
                    sentDoneOrError.set(true);
                }
                finalSignalingClientBlock.callUpdate(Signaling.CallUpdateRequest.newBuilder()
                        .setUuid(uuid.get())
                        .setError(Status.newBuilder()
                                .setCode(Code.UNKNOWN.getNumber())
                                .setMessage(msg).build())
                        .build());
                return null;
            };

            final PeerConnection.Observer<MediaStreamT> observer;
            if (optsCopy.webrtcOptions.disableTrickleICE) {
                observer = null;
            } else {
                observer = new PeerConnection.Observer<>() {
                    @Override
                    public void onSignalingChange(PeerConnection.SignalingState signalingState) {
                        logger.fine("onSignalingChange: " + signalingState);
                    }

                    @Override
                    public void onICEConnectionChange(PeerConnection.ICEConnectionState iceConnectionState) {
                        logger.fine("onIceConnectionChange: " + iceConnectionState);
                    }

                    @Override
                    public void onICEGatheringChange(PeerConnection.ICEGatheringState state) {
                        logger.fine("onIceGatheringChange: " + state);
                        remoteDescSet.thenApplyAsync((Void) -> {
                            synchronized (exchangeMu) {
                                if (exchangeDone.get()) {
                                    return null;
                                }
                            }

                            if (state == PeerConnection.ICEGatheringState.COMPLETE) {
                                iceComplete.set(true);
                                try {
                                    sendDone.call();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                return null;
                            }
                            return null;
                        });
                    }

                    @Override
                    public void onICECandidate(final ICECandidate candidate) {
                        logger.fine("onIceCandidate: " + candidate);
                        remoteDescSet.thenApplyAsync((Void) -> {
                            synchronized (exchangeMu) {
                                if (exchangeDone.get()) {
                                    return null;
                                }
                            }

                            final Signaling.ICECandidate iProto = iceCandidateToProto(candidate);
                            finalSignalingClientBlock.callUpdate(Signaling.CallUpdateRequest.newBuilder()
                                    .setUuid(uuid.get())
                                    .setCandidate(iProto)
                                    .build());
                            return null;
                        });
                    }

                    @Override
                    public void onICECandidatesRemoved(final ICECandidate[] iceCandidates) {
                        logger.fine("onIceCandidatesRemoved: " + Arrays.toString(iceCandidates));
                    }

                    @Override
                    public void onDataChannel(final DataChannel dataChannel) {
                        logger.fine("onDataChannel: " + dataChannel);
                    }

                    @Override
                    public void onRenegotiationNeeded() {
                        logger.fine("onRenegotiationNeeded");
                    }

                    @Override
                    public void onAddStream(final MediaStreamT mediaStream) {
                        logger.fine("onAddStream: " + mediaStream);
                        if (mediaStreamObserver != null) {
                            mediaStreamObserver.onAddStream(mediaStream);
                        }
                    }

                    @Override
                    public void onRemoveStream(final MediaStreamT mediaStream) {
                        logger.fine("onRemoveStream: " + mediaStream);
                        if (mediaStreamObserver != null) {
                            mediaStreamObserver.onRemoveStream(mediaStream);
                        }
                    }

                    @Override
                    public void onAddTrack() {
                        logger.fine("onAddTrack");
                        if (mediaStreamObserver != null) {
                            mediaStreamObserver.onAddTrack();
                        }
                    }

                    @Override
                    public void onRemoveTrack() {
                        logger.fine("onRemoveTrack");
                        if (mediaStreamObserver != null) {
                            mediaStreamObserver.onRemoveTrack();
                        }
                    }

                    @Override
                    public void onTrack() {
                        logger.fine("onTrack");
                        if (mediaStreamObserver != null) {
                            mediaStreamObserver.onTrack();
                        }
                    }
                };
            }

            inAsync = true;
            return gotConfig
                    .thenCompose((Void) -> peerConnectionFactory
                            .newPeerConnectionForClient(
                                    optsCopy.webrtcOptions.disableTrickleICE,
                                    rtcConfiguration,
                                    observer,
                                    logger))
                    .thenCompose((peerConn) -> {
                        final ClientChannel cc = new ClientChannel(peerConn, logger);

                        final CompletableFuture<Void> createDone = new CompletableFuture<>();
                        if (!optsCopy.webrtcOptions.disableTrickleICE) {
                            peerConn.peerConnection.createOffer(new SessionDescription.Observer() {
                                @Override
                                public void onCreateSuccess(final SessionDescription sessionDescription) {
                                    peerConn.peerConnection.setLocalDescription(this, sessionDescription);
                                }

                                @Override
                                public void onSetSuccess() {
                                    createDone.complete(null);
                                }

                                @Override
                                public void onCreateFailure(String error) {
                                    createDone.completeExceptionally(new Exception(error));
                                }

                                @Override
                                public void onSetFailure(String error) {
                                    createDone.completeExceptionally(new Exception(error));
                                }
                            });
                        }

                        // TODO(erd): probably make async
                        try {
                            createDone.get();
                        } catch (ExecutionException | InterruptedException e) {
                            e.printStackTrace();
                        }

                        final SessionDescription localDesc = peerConn.peerConnection.getLocalDescription();
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
                            throw new RuntimeException(e);
                        }
                        try {
                            localDescJSON.put("sdp", localDesc.description);
                        } catch (JSONException e) {
                            e.printStackTrace();
                            throw new RuntimeException(e);
                        }
                        logger.finest("LOCAL SDP: " + localDesc.description);
                        final String sdpEncoded = Base64.getEncoder().encodeToString(localDescJSON.toString().getBytes(StandardCharsets.UTF_8));

                        final Signaling.CallRequest callRequest = Signaling.CallRequest.newBuilder().
                                setSdp(sdpEncoded).
                                setDisableTrickle(optsCopy.webrtcOptions.disableTrickleICE).
                                build();

                        final Iterator<Signaling.CallResponse> callRespIter = finalSignalingClientBlock.call(callRequest);

                        boolean haveInit = false;

                        while (callRespIter.hasNext()) {
                            final Signaling.CallResponse callResp = callRespIter.next();

                            if (callResp.hasInit()) {
                                if (haveInit) {
                                    final String msg = "got init stage more than once";
                                    sendError.apply(msg);
                                    return CompletableFuture.failedFuture(new Exception(msg));
                                }

                                final Signaling.CallResponseInitStage init = callResp.getInit();
                                haveInit = true;
                                uuid.set(callResp.getUuid());

                                final JSONObject remoteSDPObj;
                                try {
                                    remoteSDPObj = new JSONObject(new String(Base64.getDecoder().decode(init.getSdp())));
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                    throw new RuntimeException(e);
                                }
                                final SessionDescription.Type remoteSDPType;
                                final String remoteSDPTypeStr;
                                try {
                                    remoteSDPTypeStr = remoteSDPObj.getString("type");
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                    throw new RuntimeException(e);
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
                                    throw new RuntimeException(e);
                                }
                                logger.finest("REMOTE SDP: " + remoteSDPStr);
                                final SessionDescription remoteSDP = new SessionDescription(
                                        remoteSDPType,
                                        remoteSDPStr);
                                peerConn.peerConnection.setRemoteDescription(new SessionDescription.Observer() {
                                    @Override
                                    public void onCreateSuccess(final SessionDescription sessionDescription) {

                                    }

                                    @Override
                                    public void onSetSuccess() {
                                        remoteDescSet.complete(null);
                                    }

                                    @Override
                                    public void onCreateFailure(String error) {

                                    }

                                    @Override
                                    public void onSetFailure(String error) {
                                        logger.warning("onSetFailure: " + error);
                                        remoteDescSet.completeExceptionally(new Exception(error));
                                    }
                                }, remoteSDP);

                                if (optsCopy.webrtcOptions.disableTrickleICE) {
                                    exchangeDone.set(true);
                                    try {
                                        sendDone.call();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                            } else if (callResp.hasUpdate()) {
                                if (!haveInit) {
                                    final String msg = "got update stage before init stage";
                                    sendError.apply(msg);
                                    return CompletableFuture.failedFuture(new Exception(msg));
                                }
                                if (!callResp.getUuid().equals(uuid.get())) {
                                    final String msg = String.format("uuid mismatch; have=%s want=%s", callResp.getUuid(), uuid);
                                    sendError.apply(msg);
                                    return CompletableFuture.failedFuture(new Exception(msg));
                                }
                                final Signaling.CallResponseUpdateStage update = callResp.getUpdate();
                                final ICECandidate candidate = iceCandidateFromProto(update.getCandidate());
                                peerConn.peerConnection.addIceCandidate(candidate);
                            }
                        }

                        return cc.ready().thenApply((Void) -> {
                            try {
                                sendDone.call();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            return (Channel) cc;
                        });
                    }).whenComplete((cc, t) -> {
                        synchronized (exchangeMu) {
                            exchangeDone.set(true);
                        }
                        signalingChannel.shutdown();
                    });
        } finally {
            if (!inAsync) {
                signalingChannel.shutdown();
            }
        }
    }

    public static ICECandidate iceCandidateFromProto(final Signaling.ICECandidate i) {
        return new ICECandidate(i.getSdpMid(), i.getSdpmLineIndex(), i.getCandidate());
    }

    public static Signaling.ICECandidate iceCandidateToProto(final ICECandidate i) {
        return Signaling.ICECandidate.newBuilder()
                .setCandidate(i.sdp)
                .setSdpMid(i.sdpMid)
                .setSdpmLineIndex(i.sdpMLineIndex)
                .build();
    }
}
