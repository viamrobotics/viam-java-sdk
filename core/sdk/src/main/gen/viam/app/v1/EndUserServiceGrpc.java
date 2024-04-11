package viam.app.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: app/v1/end_user.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EndUserServiceGrpc {

  private EndUserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.app.v1.EndUserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.v1.EndUser.IsLegalAcceptedRequest,
      viam.app.v1.EndUser.IsLegalAcceptedResponse> getIsLegalAcceptedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsLegalAccepted",
      requestType = viam.app.v1.EndUser.IsLegalAcceptedRequest.class,
      responseType = viam.app.v1.EndUser.IsLegalAcceptedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.EndUser.IsLegalAcceptedRequest,
      viam.app.v1.EndUser.IsLegalAcceptedResponse> getIsLegalAcceptedMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.EndUser.IsLegalAcceptedRequest, viam.app.v1.EndUser.IsLegalAcceptedResponse> getIsLegalAcceptedMethod;
    if ((getIsLegalAcceptedMethod = EndUserServiceGrpc.getIsLegalAcceptedMethod) == null) {
      synchronized (EndUserServiceGrpc.class) {
        if ((getIsLegalAcceptedMethod = EndUserServiceGrpc.getIsLegalAcceptedMethod) == null) {
          EndUserServiceGrpc.getIsLegalAcceptedMethod = getIsLegalAcceptedMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.EndUser.IsLegalAcceptedRequest, viam.app.v1.EndUser.IsLegalAcceptedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsLegalAccepted"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.EndUser.IsLegalAcceptedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.EndUser.IsLegalAcceptedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsLegalAcceptedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.EndUser.AcceptLegalRequest,
      viam.app.v1.EndUser.AcceptLegalResponse> getAcceptLegalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcceptLegal",
      requestType = viam.app.v1.EndUser.AcceptLegalRequest.class,
      responseType = viam.app.v1.EndUser.AcceptLegalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.EndUser.AcceptLegalRequest,
      viam.app.v1.EndUser.AcceptLegalResponse> getAcceptLegalMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.EndUser.AcceptLegalRequest, viam.app.v1.EndUser.AcceptLegalResponse> getAcceptLegalMethod;
    if ((getAcceptLegalMethod = EndUserServiceGrpc.getAcceptLegalMethod) == null) {
      synchronized (EndUserServiceGrpc.class) {
        if ((getAcceptLegalMethod = EndUserServiceGrpc.getAcceptLegalMethod) == null) {
          EndUserServiceGrpc.getAcceptLegalMethod = getAcceptLegalMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.EndUser.AcceptLegalRequest, viam.app.v1.EndUser.AcceptLegalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcceptLegal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.EndUser.AcceptLegalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.EndUser.AcceptLegalResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAcceptLegalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.EndUser.RegisterAuthApplicationRequest,
      viam.app.v1.EndUser.RegisterAuthApplicationResponse> getRegisterAuthApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterAuthApplication",
      requestType = viam.app.v1.EndUser.RegisterAuthApplicationRequest.class,
      responseType = viam.app.v1.EndUser.RegisterAuthApplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.EndUser.RegisterAuthApplicationRequest,
      viam.app.v1.EndUser.RegisterAuthApplicationResponse> getRegisterAuthApplicationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.EndUser.RegisterAuthApplicationRequest, viam.app.v1.EndUser.RegisterAuthApplicationResponse> getRegisterAuthApplicationMethod;
    if ((getRegisterAuthApplicationMethod = EndUserServiceGrpc.getRegisterAuthApplicationMethod) == null) {
      synchronized (EndUserServiceGrpc.class) {
        if ((getRegisterAuthApplicationMethod = EndUserServiceGrpc.getRegisterAuthApplicationMethod) == null) {
          EndUserServiceGrpc.getRegisterAuthApplicationMethod = getRegisterAuthApplicationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.EndUser.RegisterAuthApplicationRequest, viam.app.v1.EndUser.RegisterAuthApplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterAuthApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.EndUser.RegisterAuthApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.EndUser.RegisterAuthApplicationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRegisterAuthApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.EndUser.UpdateAuthApplicationRequest,
      viam.app.v1.EndUser.UpdateAuthApplicationResponse> getUpdateAuthApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAuthApplication",
      requestType = viam.app.v1.EndUser.UpdateAuthApplicationRequest.class,
      responseType = viam.app.v1.EndUser.UpdateAuthApplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.EndUser.UpdateAuthApplicationRequest,
      viam.app.v1.EndUser.UpdateAuthApplicationResponse> getUpdateAuthApplicationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.EndUser.UpdateAuthApplicationRequest, viam.app.v1.EndUser.UpdateAuthApplicationResponse> getUpdateAuthApplicationMethod;
    if ((getUpdateAuthApplicationMethod = EndUserServiceGrpc.getUpdateAuthApplicationMethod) == null) {
      synchronized (EndUserServiceGrpc.class) {
        if ((getUpdateAuthApplicationMethod = EndUserServiceGrpc.getUpdateAuthApplicationMethod) == null) {
          EndUserServiceGrpc.getUpdateAuthApplicationMethod = getUpdateAuthApplicationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.EndUser.UpdateAuthApplicationRequest, viam.app.v1.EndUser.UpdateAuthApplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAuthApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.EndUser.UpdateAuthApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.EndUser.UpdateAuthApplicationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateAuthApplicationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EndUserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EndUserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EndUserServiceStub>() {
        @java.lang.Override
        public EndUserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EndUserServiceStub(channel, callOptions);
        }
      };
    return EndUserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EndUserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EndUserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EndUserServiceBlockingStub>() {
        @java.lang.Override
        public EndUserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EndUserServiceBlockingStub(channel, callOptions);
        }
      };
    return EndUserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EndUserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EndUserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EndUserServiceFutureStub>() {
        @java.lang.Override
        public EndUserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EndUserServiceFutureStub(channel, callOptions);
        }
      };
    return EndUserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns whether the specified user has accepted end user license agreements.
     * If false, the user should not be able to use the application.
     * </pre>
     */
    default void isLegalAccepted(viam.app.v1.EndUser.IsLegalAcceptedRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.EndUser.IsLegalAcceptedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsLegalAcceptedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Marks that the specified user has accepted end user license agreements.
     * </pre>
     */
    default void acceptLegal(viam.app.v1.EndUser.AcceptLegalRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.EndUser.AcceptLegalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcceptLegalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Allows users to register third party auth applications using Viam linked to the indicated organization
     * </pre>
     */
    default void registerAuthApplication(viam.app.v1.EndUser.RegisterAuthApplicationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.EndUser.RegisterAuthApplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterAuthApplicationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Allows users to update their third party auth applications
     * </pre>
     */
    default void updateAuthApplication(viam.app.v1.EndUser.UpdateAuthApplicationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.EndUser.UpdateAuthApplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAuthApplicationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EndUserService.
   */
  public static abstract class EndUserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EndUserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EndUserService.
   */
  public static final class EndUserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EndUserServiceStub> {
    private EndUserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EndUserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EndUserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns whether the specified user has accepted end user license agreements.
     * If false, the user should not be able to use the application.
     * </pre>
     */
    public void isLegalAccepted(viam.app.v1.EndUser.IsLegalAcceptedRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.EndUser.IsLegalAcceptedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsLegalAcceptedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Marks that the specified user has accepted end user license agreements.
     * </pre>
     */
    public void acceptLegal(viam.app.v1.EndUser.AcceptLegalRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.EndUser.AcceptLegalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcceptLegalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Allows users to register third party auth applications using Viam linked to the indicated organization
     * </pre>
     */
    public void registerAuthApplication(viam.app.v1.EndUser.RegisterAuthApplicationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.EndUser.RegisterAuthApplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterAuthApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Allows users to update their third party auth applications
     * </pre>
     */
    public void updateAuthApplication(viam.app.v1.EndUser.UpdateAuthApplicationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.EndUser.UpdateAuthApplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAuthApplicationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EndUserService.
   */
  public static final class EndUserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EndUserServiceBlockingStub> {
    private EndUserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EndUserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EndUserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns whether the specified user has accepted end user license agreements.
     * If false, the user should not be able to use the application.
     * </pre>
     */
    public viam.app.v1.EndUser.IsLegalAcceptedResponse isLegalAccepted(viam.app.v1.EndUser.IsLegalAcceptedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsLegalAcceptedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Marks that the specified user has accepted end user license agreements.
     * </pre>
     */
    public viam.app.v1.EndUser.AcceptLegalResponse acceptLegal(viam.app.v1.EndUser.AcceptLegalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcceptLegalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Allows users to register third party auth applications using Viam linked to the indicated organization
     * </pre>
     */
    public viam.app.v1.EndUser.RegisterAuthApplicationResponse registerAuthApplication(viam.app.v1.EndUser.RegisterAuthApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterAuthApplicationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Allows users to update their third party auth applications
     * </pre>
     */
    public viam.app.v1.EndUser.UpdateAuthApplicationResponse updateAuthApplication(viam.app.v1.EndUser.UpdateAuthApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAuthApplicationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EndUserService.
   */
  public static final class EndUserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EndUserServiceFutureStub> {
    private EndUserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EndUserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EndUserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns whether the specified user has accepted end user license agreements.
     * If false, the user should not be able to use the application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.EndUser.IsLegalAcceptedResponse> isLegalAccepted(
        viam.app.v1.EndUser.IsLegalAcceptedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsLegalAcceptedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Marks that the specified user has accepted end user license agreements.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.EndUser.AcceptLegalResponse> acceptLegal(
        viam.app.v1.EndUser.AcceptLegalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcceptLegalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Allows users to register third party auth applications using Viam linked to the indicated organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.EndUser.RegisterAuthApplicationResponse> registerAuthApplication(
        viam.app.v1.EndUser.RegisterAuthApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterAuthApplicationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Allows users to update their third party auth applications
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.EndUser.UpdateAuthApplicationResponse> updateAuthApplication(
        viam.app.v1.EndUser.UpdateAuthApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAuthApplicationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IS_LEGAL_ACCEPTED = 0;
  private static final int METHODID_ACCEPT_LEGAL = 1;
  private static final int METHODID_REGISTER_AUTH_APPLICATION = 2;
  private static final int METHODID_UPDATE_AUTH_APPLICATION = 3;

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
        case METHODID_IS_LEGAL_ACCEPTED:
          serviceImpl.isLegalAccepted((viam.app.v1.EndUser.IsLegalAcceptedRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.EndUser.IsLegalAcceptedResponse>) responseObserver);
          break;
        case METHODID_ACCEPT_LEGAL:
          serviceImpl.acceptLegal((viam.app.v1.EndUser.AcceptLegalRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.EndUser.AcceptLegalResponse>) responseObserver);
          break;
        case METHODID_REGISTER_AUTH_APPLICATION:
          serviceImpl.registerAuthApplication((viam.app.v1.EndUser.RegisterAuthApplicationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.EndUser.RegisterAuthApplicationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AUTH_APPLICATION:
          serviceImpl.updateAuthApplication((viam.app.v1.EndUser.UpdateAuthApplicationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.EndUser.UpdateAuthApplicationResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getIsLegalAcceptedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.EndUser.IsLegalAcceptedRequest,
              viam.app.v1.EndUser.IsLegalAcceptedResponse>(
                service, METHODID_IS_LEGAL_ACCEPTED)))
        .addMethod(
          getAcceptLegalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.EndUser.AcceptLegalRequest,
              viam.app.v1.EndUser.AcceptLegalResponse>(
                service, METHODID_ACCEPT_LEGAL)))
        .addMethod(
          getRegisterAuthApplicationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.EndUser.RegisterAuthApplicationRequest,
              viam.app.v1.EndUser.RegisterAuthApplicationResponse>(
                service, METHODID_REGISTER_AUTH_APPLICATION)))
        .addMethod(
          getUpdateAuthApplicationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.EndUser.UpdateAuthApplicationRequest,
              viam.app.v1.EndUser.UpdateAuthApplicationResponse>(
                service, METHODID_UPDATE_AUTH_APPLICATION)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EndUserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getIsLegalAcceptedMethod())
              .addMethod(getAcceptLegalMethod())
              .addMethod(getRegisterAuthApplicationMethod())
              .addMethod(getUpdateAuthApplicationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
