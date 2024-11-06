package proto.rpc.webrtc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A SignalingService provides the means to have one client "call" another
 * client using the Session Description Protocol (SDP).
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: proto/rpc/webrtc/v1/signaling.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SignalingServiceGrpc {

  private SignalingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.rpc.webrtc.v1.SignalingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.rpc.webrtc.v1.Signaling.CallRequest,
      proto.rpc.webrtc.v1.Signaling.CallResponse> getCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Call",
      requestType = proto.rpc.webrtc.v1.Signaling.CallRequest.class,
      responseType = proto.rpc.webrtc.v1.Signaling.CallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<proto.rpc.webrtc.v1.Signaling.CallRequest,
      proto.rpc.webrtc.v1.Signaling.CallResponse> getCallMethod() {
    io.grpc.MethodDescriptor<proto.rpc.webrtc.v1.Signaling.CallRequest, proto.rpc.webrtc.v1.Signaling.CallResponse> getCallMethod;
    if ((getCallMethod = SignalingServiceGrpc.getCallMethod) == null) {
      synchronized (SignalingServiceGrpc.class) {
        if ((getCallMethod = SignalingServiceGrpc.getCallMethod) == null) {
          SignalingServiceGrpc.getCallMethod = getCallMethod =
              io.grpc.MethodDescriptor.<proto.rpc.webrtc.v1.Signaling.CallRequest, proto.rpc.webrtc.v1.Signaling.CallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Call"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.webrtc.v1.Signaling.CallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.webrtc.v1.Signaling.CallResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.rpc.webrtc.v1.Signaling.CallUpdateRequest,
      proto.rpc.webrtc.v1.Signaling.CallUpdateResponse> getCallUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallUpdate",
      requestType = proto.rpc.webrtc.v1.Signaling.CallUpdateRequest.class,
      responseType = proto.rpc.webrtc.v1.Signaling.CallUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.rpc.webrtc.v1.Signaling.CallUpdateRequest,
      proto.rpc.webrtc.v1.Signaling.CallUpdateResponse> getCallUpdateMethod() {
    io.grpc.MethodDescriptor<proto.rpc.webrtc.v1.Signaling.CallUpdateRequest, proto.rpc.webrtc.v1.Signaling.CallUpdateResponse> getCallUpdateMethod;
    if ((getCallUpdateMethod = SignalingServiceGrpc.getCallUpdateMethod) == null) {
      synchronized (SignalingServiceGrpc.class) {
        if ((getCallUpdateMethod = SignalingServiceGrpc.getCallUpdateMethod) == null) {
          SignalingServiceGrpc.getCallUpdateMethod = getCallUpdateMethod =
              io.grpc.MethodDescriptor.<proto.rpc.webrtc.v1.Signaling.CallUpdateRequest, proto.rpc.webrtc.v1.Signaling.CallUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.webrtc.v1.Signaling.CallUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.webrtc.v1.Signaling.CallUpdateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCallUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.rpc.webrtc.v1.Signaling.AnswerResponse,
      proto.rpc.webrtc.v1.Signaling.AnswerRequest> getAnswerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Answer",
      requestType = proto.rpc.webrtc.v1.Signaling.AnswerResponse.class,
      responseType = proto.rpc.webrtc.v1.Signaling.AnswerRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<proto.rpc.webrtc.v1.Signaling.AnswerResponse,
      proto.rpc.webrtc.v1.Signaling.AnswerRequest> getAnswerMethod() {
    io.grpc.MethodDescriptor<proto.rpc.webrtc.v1.Signaling.AnswerResponse, proto.rpc.webrtc.v1.Signaling.AnswerRequest> getAnswerMethod;
    if ((getAnswerMethod = SignalingServiceGrpc.getAnswerMethod) == null) {
      synchronized (SignalingServiceGrpc.class) {
        if ((getAnswerMethod = SignalingServiceGrpc.getAnswerMethod) == null) {
          SignalingServiceGrpc.getAnswerMethod = getAnswerMethod =
              io.grpc.MethodDescriptor.<proto.rpc.webrtc.v1.Signaling.AnswerResponse, proto.rpc.webrtc.v1.Signaling.AnswerRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Answer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.webrtc.v1.Signaling.AnswerResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.webrtc.v1.Signaling.AnswerRequest.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAnswerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigRequest,
      proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigResponse> getOptionalWebRTCConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OptionalWebRTCConfig",
      requestType = proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigRequest.class,
      responseType = proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigRequest,
      proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigResponse> getOptionalWebRTCConfigMethod() {
    io.grpc.MethodDescriptor<proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigRequest, proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigResponse> getOptionalWebRTCConfigMethod;
    if ((getOptionalWebRTCConfigMethod = SignalingServiceGrpc.getOptionalWebRTCConfigMethod) == null) {
      synchronized (SignalingServiceGrpc.class) {
        if ((getOptionalWebRTCConfigMethod = SignalingServiceGrpc.getOptionalWebRTCConfigMethod) == null) {
          SignalingServiceGrpc.getOptionalWebRTCConfigMethod = getOptionalWebRTCConfigMethod =
              io.grpc.MethodDescriptor.<proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigRequest, proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OptionalWebRTCConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getOptionalWebRTCConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SignalingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SignalingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SignalingServiceStub>() {
        @java.lang.Override
        public SignalingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SignalingServiceStub(channel, callOptions);
        }
      };
    return SignalingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SignalingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SignalingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SignalingServiceBlockingStub>() {
        @java.lang.Override
        public SignalingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SignalingServiceBlockingStub(channel, callOptions);
        }
      };
    return SignalingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SignalingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SignalingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SignalingServiceFutureStub>() {
        @java.lang.Override
        public SignalingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SignalingServiceFutureStub(channel, callOptions);
        }
      };
    return SignalingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A SignalingService provides the means to have one client "call" another
   * client using the Session Description Protocol (SDP).
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Call makes an offer to a client that it expects an answer to. The host
     * of the client in question should be identified in the rpc-host metadata
     * field.
     * Note: Based on how this is a server streaming responnse to the caller,
     * we do not have a good way of knowing if the caller has disappeared.
     * Depending on answerer timeouts and concurrency limits, this can result in
     * hangs on the answerer waiting for a connection to establish, which in turn
     * can result in the caller waiting for an answerer to be listening.
     * </pre>
     */
    default void call(proto.rpc.webrtc.v1.Signaling.CallRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.CallResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallMethod(), responseObserver);
    }

    /**
     * <pre>
     * CallUpdate is used to send additional info in relation to a Call.
     * The host of the client for the call in question should be identified
     * in the rpc-host metadata field.
     * In a world where https://github.com/grpc/grpc-web/issues/24 is fixed,
     * this should be removed in favor of a bidirectional stream on Call.
     * </pre>
     */
    default void callUpdate(proto.rpc.webrtc.v1.Signaling.CallUpdateRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.CallUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Answer sets up an answering service where the caller answers call offers
     * and responds with answers.
     * The host(s) to answer for should be in the rpc-host metadata field.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.AnswerResponse> answer(
        io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.AnswerRequest> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAnswerMethod(), responseObserver);
    }

    /**
     * <pre>
     * OptionalWebRTCConfig returns any WebRTC configuration the caller may want to use.
     * The host to get a config for must be in the rpc-host metadata field.
     * </pre>
     */
    default void optionalWebRTCConfig(proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOptionalWebRTCConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SignalingService.
   * <pre>
   * A SignalingService provides the means to have one client "call" another
   * client using the Session Description Protocol (SDP).
   * </pre>
   */
  public static abstract class SignalingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SignalingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SignalingService.
   * <pre>
   * A SignalingService provides the means to have one client "call" another
   * client using the Session Description Protocol (SDP).
   * </pre>
   */
  public static final class SignalingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SignalingServiceStub> {
    private SignalingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignalingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SignalingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Call makes an offer to a client that it expects an answer to. The host
     * of the client in question should be identified in the rpc-host metadata
     * field.
     * Note: Based on how this is a server streaming responnse to the caller,
     * we do not have a good way of knowing if the caller has disappeared.
     * Depending on answerer timeouts and concurrency limits, this can result in
     * hangs on the answerer waiting for a connection to establish, which in turn
     * can result in the caller waiting for an answerer to be listening.
     * </pre>
     */
    public void call(proto.rpc.webrtc.v1.Signaling.CallRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.CallResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CallUpdate is used to send additional info in relation to a Call.
     * The host of the client for the call in question should be identified
     * in the rpc-host metadata field.
     * In a world where https://github.com/grpc/grpc-web/issues/24 is fixed,
     * this should be removed in favor of a bidirectional stream on Call.
     * </pre>
     */
    public void callUpdate(proto.rpc.webrtc.v1.Signaling.CallUpdateRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.CallUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Answer sets up an answering service where the caller answers call offers
     * and responds with answers.
     * The host(s) to answer for should be in the rpc-host metadata field.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.AnswerResponse> answer(
        io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.AnswerRequest> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAnswerMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * OptionalWebRTCConfig returns any WebRTC configuration the caller may want to use.
     * The host to get a config for must be in the rpc-host metadata field.
     * </pre>
     */
    public void optionalWebRTCConfig(proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOptionalWebRTCConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SignalingService.
   * <pre>
   * A SignalingService provides the means to have one client "call" another
   * client using the Session Description Protocol (SDP).
   * </pre>
   */
  public static final class SignalingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SignalingServiceBlockingStub> {
    private SignalingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignalingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SignalingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Call makes an offer to a client that it expects an answer to. The host
     * of the client in question should be identified in the rpc-host metadata
     * field.
     * Note: Based on how this is a server streaming responnse to the caller,
     * we do not have a good way of knowing if the caller has disappeared.
     * Depending on answerer timeouts and concurrency limits, this can result in
     * hangs on the answerer waiting for a connection to establish, which in turn
     * can result in the caller waiting for an answerer to be listening.
     * </pre>
     */
    public java.util.Iterator<proto.rpc.webrtc.v1.Signaling.CallResponse> call(
        proto.rpc.webrtc.v1.Signaling.CallRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CallUpdate is used to send additional info in relation to a Call.
     * The host of the client for the call in question should be identified
     * in the rpc-host metadata field.
     * In a world where https://github.com/grpc/grpc-web/issues/24 is fixed,
     * this should be removed in favor of a bidirectional stream on Call.
     * </pre>
     */
    public proto.rpc.webrtc.v1.Signaling.CallUpdateResponse callUpdate(proto.rpc.webrtc.v1.Signaling.CallUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OptionalWebRTCConfig returns any WebRTC configuration the caller may want to use.
     * The host to get a config for must be in the rpc-host metadata field.
     * </pre>
     */
    public proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigResponse optionalWebRTCConfig(proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOptionalWebRTCConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SignalingService.
   * <pre>
   * A SignalingService provides the means to have one client "call" another
   * client using the Session Description Protocol (SDP).
   * </pre>
   */
  public static final class SignalingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SignalingServiceFutureStub> {
    private SignalingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignalingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SignalingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CallUpdate is used to send additional info in relation to a Call.
     * The host of the client for the call in question should be identified
     * in the rpc-host metadata field.
     * In a world where https://github.com/grpc/grpc-web/issues/24 is fixed,
     * this should be removed in favor of a bidirectional stream on Call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.rpc.webrtc.v1.Signaling.CallUpdateResponse> callUpdate(
        proto.rpc.webrtc.v1.Signaling.CallUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OptionalWebRTCConfig returns any WebRTC configuration the caller may want to use.
     * The host to get a config for must be in the rpc-host metadata field.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigResponse> optionalWebRTCConfig(
        proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOptionalWebRTCConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALL = 0;
  private static final int METHODID_CALL_UPDATE = 1;
  private static final int METHODID_OPTIONAL_WEB_RTCCONFIG = 2;
  private static final int METHODID_ANSWER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALL:
          serviceImpl.call((proto.rpc.webrtc.v1.Signaling.CallRequest) request,
              (io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.CallResponse>) responseObserver);
          break;
        case METHODID_CALL_UPDATE:
          serviceImpl.callUpdate((proto.rpc.webrtc.v1.Signaling.CallUpdateRequest) request,
              (io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.CallUpdateResponse>) responseObserver);
          break;
        case METHODID_OPTIONAL_WEB_RTCCONFIG:
          serviceImpl.optionalWebRTCConfig((proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigRequest) request,
              (io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ANSWER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.answer(
              (io.grpc.stub.StreamObserver<proto.rpc.webrtc.v1.Signaling.AnswerRequest>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCallMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              proto.rpc.webrtc.v1.Signaling.CallRequest,
              proto.rpc.webrtc.v1.Signaling.CallResponse>(
                service, METHODID_CALL)))
        .addMethod(
          getCallUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.rpc.webrtc.v1.Signaling.CallUpdateRequest,
              proto.rpc.webrtc.v1.Signaling.CallUpdateResponse>(
                service, METHODID_CALL_UPDATE)))
        .addMethod(
          getAnswerMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              proto.rpc.webrtc.v1.Signaling.AnswerResponse,
              proto.rpc.webrtc.v1.Signaling.AnswerRequest>(
                service, METHODID_ANSWER)))
        .addMethod(
          getOptionalWebRTCConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigRequest,
              proto.rpc.webrtc.v1.Signaling.OptionalWebRTCConfigResponse>(
                service, METHODID_OPTIONAL_WEB_RTCCONFIG)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SignalingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCallMethod())
              .addMethod(getCallUpdateMethod())
              .addMethod(getAnswerMethod())
              .addMethod(getOptionalWebRTCConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
