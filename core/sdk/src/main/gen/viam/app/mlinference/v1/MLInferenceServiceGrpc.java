package viam.app.mlinference.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: app/mlinference/v1/ml_inference.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MLInferenceServiceGrpc {

  private MLInferenceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.app.mlinference.v1.MLInferenceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.mlinference.v1.MlInference.GetInferenceRequest,
      viam.app.mlinference.v1.MlInference.GetInferenceResponse> getGetInferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInference",
      requestType = viam.app.mlinference.v1.MlInference.GetInferenceRequest.class,
      responseType = viam.app.mlinference.v1.MlInference.GetInferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.mlinference.v1.MlInference.GetInferenceRequest,
      viam.app.mlinference.v1.MlInference.GetInferenceResponse> getGetInferenceMethod() {
    io.grpc.MethodDescriptor<viam.app.mlinference.v1.MlInference.GetInferenceRequest, viam.app.mlinference.v1.MlInference.GetInferenceResponse> getGetInferenceMethod;
    if ((getGetInferenceMethod = MLInferenceServiceGrpc.getGetInferenceMethod) == null) {
      synchronized (MLInferenceServiceGrpc.class) {
        if ((getGetInferenceMethod = MLInferenceServiceGrpc.getGetInferenceMethod) == null) {
          MLInferenceServiceGrpc.getGetInferenceMethod = getGetInferenceMethod =
              io.grpc.MethodDescriptor.<viam.app.mlinference.v1.MlInference.GetInferenceRequest, viam.app.mlinference.v1.MlInference.GetInferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mlinference.v1.MlInference.GetInferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mlinference.v1.MlInference.GetInferenceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetInferenceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MLInferenceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MLInferenceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MLInferenceServiceStub>() {
        @java.lang.Override
        public MLInferenceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MLInferenceServiceStub(channel, callOptions);
        }
      };
    return MLInferenceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MLInferenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MLInferenceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MLInferenceServiceBlockingStub>() {
        @java.lang.Override
        public MLInferenceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MLInferenceServiceBlockingStub(channel, callOptions);
        }
      };
    return MLInferenceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MLInferenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MLInferenceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MLInferenceServiceFutureStub>() {
        @java.lang.Override
        public MLInferenceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MLInferenceServiceFutureStub(channel, callOptions);
        }
      };
    return MLInferenceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getInference(viam.app.mlinference.v1.MlInference.GetInferenceRequest request,
        io.grpc.stub.StreamObserver<viam.app.mlinference.v1.MlInference.GetInferenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInferenceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MLInferenceService.
   */
  public static abstract class MLInferenceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MLInferenceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MLInferenceService.
   */
  public static final class MLInferenceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MLInferenceServiceStub> {
    private MLInferenceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MLInferenceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MLInferenceServiceStub(channel, callOptions);
    }

    /**
     */
    public void getInference(viam.app.mlinference.v1.MlInference.GetInferenceRequest request,
        io.grpc.stub.StreamObserver<viam.app.mlinference.v1.MlInference.GetInferenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInferenceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MLInferenceService.
   */
  public static final class MLInferenceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MLInferenceServiceBlockingStub> {
    private MLInferenceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MLInferenceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MLInferenceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public viam.app.mlinference.v1.MlInference.GetInferenceResponse getInference(viam.app.mlinference.v1.MlInference.GetInferenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInferenceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MLInferenceService.
   */
  public static final class MLInferenceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MLInferenceServiceFutureStub> {
    private MLInferenceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MLInferenceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MLInferenceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.mlinference.v1.MlInference.GetInferenceResponse> getInference(
        viam.app.mlinference.v1.MlInference.GetInferenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInferenceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INFERENCE = 0;

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
        case METHODID_GET_INFERENCE:
          serviceImpl.getInference((viam.app.mlinference.v1.MlInference.GetInferenceRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.mlinference.v1.MlInference.GetInferenceResponse>) responseObserver);
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
          getGetInferenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.mlinference.v1.MlInference.GetInferenceRequest,
              viam.app.mlinference.v1.MlInference.GetInferenceResponse>(
                service, METHODID_GET_INFERENCE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MLInferenceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetInferenceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
