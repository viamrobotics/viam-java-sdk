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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.EndUser.IsLegalAcceptedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.EndUser.IsLegalAcceptedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EndUserServiceMethodDescriptorSupplier("IsLegalAccepted"))
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.EndUser.AcceptLegalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.EndUser.AcceptLegalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EndUserServiceMethodDescriptorSupplier("AcceptLegal"))
              .build();
        }
      }
    }
    return getAcceptLegalMethod;
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
  }

  private static final int METHODID_IS_LEGAL_ACCEPTED = 0;
  private static final int METHODID_ACCEPT_LEGAL = 1;

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
        .build();
  }

  private static abstract class EndUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EndUserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return viam.app.v1.EndUser.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EndUserService");
    }
  }

  private static final class EndUserServiceFileDescriptorSupplier
      extends EndUserServiceBaseDescriptorSupplier {
    EndUserServiceFileDescriptorSupplier() {}
  }

  private static final class EndUserServiceMethodDescriptorSupplier
      extends EndUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EndUserServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EndUserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EndUserServiceFileDescriptorSupplier())
              .addMethod(getIsLegalAcceptedMethod())
              .addMethod(getAcceptLegalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
