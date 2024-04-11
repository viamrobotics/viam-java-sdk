package com.viam.service.mlmodel.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * MLModelService declares the gRPC contract for a service that takes in a map of input arrays/tensors,
 * runs them through an ML inference engine, and outputs a map of array/tensors.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: service/mlmodel/v1/mlmodel.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MLModelServiceGrpc {

  private MLModelServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.service.mlmodel.v1.MLModelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.service.mlmodel.v1.Mlmodel.InferRequest,
      com.viam.service.mlmodel.v1.Mlmodel.InferResponse> getInferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Infer",
      requestType = com.viam.service.mlmodel.v1.Mlmodel.InferRequest.class,
      responseType = com.viam.service.mlmodel.v1.Mlmodel.InferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.mlmodel.v1.Mlmodel.InferRequest,
      com.viam.service.mlmodel.v1.Mlmodel.InferResponse> getInferMethod() {
    io.grpc.MethodDescriptor<com.viam.service.mlmodel.v1.Mlmodel.InferRequest, com.viam.service.mlmodel.v1.Mlmodel.InferResponse> getInferMethod;
    if ((getInferMethod = MLModelServiceGrpc.getInferMethod) == null) {
      synchronized (MLModelServiceGrpc.class) {
        if ((getInferMethod = MLModelServiceGrpc.getInferMethod) == null) {
          MLModelServiceGrpc.getInferMethod = getInferMethod =
              io.grpc.MethodDescriptor.<com.viam.service.mlmodel.v1.Mlmodel.InferRequest, com.viam.service.mlmodel.v1.Mlmodel.InferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Infer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.mlmodel.v1.Mlmodel.InferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.mlmodel.v1.Mlmodel.InferResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getInferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest,
      com.viam.service.mlmodel.v1.Mlmodel.MetadataResponse> getMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Metadata",
      requestType = com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest.class,
      responseType = com.viam.service.mlmodel.v1.Mlmodel.MetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest,
      com.viam.service.mlmodel.v1.Mlmodel.MetadataResponse> getMetadataMethod() {
    io.grpc.MethodDescriptor<com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest, com.viam.service.mlmodel.v1.Mlmodel.MetadataResponse> getMetadataMethod;
    if ((getMetadataMethod = MLModelServiceGrpc.getMetadataMethod) == null) {
      synchronized (MLModelServiceGrpc.class) {
        if ((getMetadataMethod = MLModelServiceGrpc.getMetadataMethod) == null) {
          MLModelServiceGrpc.getMetadataMethod = getMetadataMethod =
              io.grpc.MethodDescriptor.<com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest, com.viam.service.mlmodel.v1.Mlmodel.MetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Metadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.mlmodel.v1.Mlmodel.MetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getMetadataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MLModelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MLModelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MLModelServiceStub>() {
        @java.lang.Override
        public MLModelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MLModelServiceStub(channel, callOptions);
        }
      };
    return MLModelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MLModelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MLModelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MLModelServiceBlockingStub>() {
        @java.lang.Override
        public MLModelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MLModelServiceBlockingStub(channel, callOptions);
        }
      };
    return MLModelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MLModelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MLModelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MLModelServiceFutureStub>() {
        @java.lang.Override
        public MLModelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MLModelServiceFutureStub(channel, callOptions);
        }
      };
    return MLModelServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * MLModelService declares the gRPC contract for a service that takes in a map of input arrays/tensors,
   * runs them through an ML inference engine, and outputs a map of array/tensors.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Infer takes an already ordered input tensor as a map, makes an inference on the model, and returns an output data map.
     * </pre>
     */
    default void infer(com.viam.service.mlmodel.v1.Mlmodel.InferRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.mlmodel.v1.Mlmodel.InferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInferMethod(), responseObserver);
    }

    /**
     * <pre>
     * Metadata returns the metadata associated with the ML model.
     * </pre>
     */
    default void metadata(com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.mlmodel.v1.Mlmodel.MetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMetadataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MLModelService.
   * <pre>
   * MLModelService declares the gRPC contract for a service that takes in a map of input arrays/tensors,
   * runs them through an ML inference engine, and outputs a map of array/tensors.
   * </pre>
   */
  public static abstract class MLModelServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MLModelServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MLModelService.
   * <pre>
   * MLModelService declares the gRPC contract for a service that takes in a map of input arrays/tensors,
   * runs them through an ML inference engine, and outputs a map of array/tensors.
   * </pre>
   */
  public static final class MLModelServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MLModelServiceStub> {
    private MLModelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MLModelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MLModelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Infer takes an already ordered input tensor as a map, makes an inference on the model, and returns an output data map.
     * </pre>
     */
    public void infer(com.viam.service.mlmodel.v1.Mlmodel.InferRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.mlmodel.v1.Mlmodel.InferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Metadata returns the metadata associated with the ML model.
     * </pre>
     */
    public void metadata(com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.mlmodel.v1.Mlmodel.MetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMetadataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MLModelService.
   * <pre>
   * MLModelService declares the gRPC contract for a service that takes in a map of input arrays/tensors,
   * runs them through an ML inference engine, and outputs a map of array/tensors.
   * </pre>
   */
  public static final class MLModelServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MLModelServiceBlockingStub> {
    private MLModelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MLModelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MLModelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Infer takes an already ordered input tensor as a map, makes an inference on the model, and returns an output data map.
     * </pre>
     */
    public com.viam.service.mlmodel.v1.Mlmodel.InferResponse infer(com.viam.service.mlmodel.v1.Mlmodel.InferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Metadata returns the metadata associated with the ML model.
     * </pre>
     */
    public com.viam.service.mlmodel.v1.Mlmodel.MetadataResponse metadata(com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMetadataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MLModelService.
   * <pre>
   * MLModelService declares the gRPC contract for a service that takes in a map of input arrays/tensors,
   * runs them through an ML inference engine, and outputs a map of array/tensors.
   * </pre>
   */
  public static final class MLModelServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MLModelServiceFutureStub> {
    private MLModelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MLModelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MLModelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Infer takes an already ordered input tensor as a map, makes an inference on the model, and returns an output data map.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.mlmodel.v1.Mlmodel.InferResponse> infer(
        com.viam.service.mlmodel.v1.Mlmodel.InferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Metadata returns the metadata associated with the ML model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.mlmodel.v1.Mlmodel.MetadataResponse> metadata(
        com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMetadataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INFER = 0;
  private static final int METHODID_METADATA = 1;

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
        case METHODID_INFER:
          serviceImpl.infer((com.viam.service.mlmodel.v1.Mlmodel.InferRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.mlmodel.v1.Mlmodel.InferResponse>) responseObserver);
          break;
        case METHODID_METADATA:
          serviceImpl.metadata((com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.mlmodel.v1.Mlmodel.MetadataResponse>) responseObserver);
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
          getInferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.mlmodel.v1.Mlmodel.InferRequest,
              com.viam.service.mlmodel.v1.Mlmodel.InferResponse>(
                service, METHODID_INFER)))
        .addMethod(
          getMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest,
              com.viam.service.mlmodel.v1.Mlmodel.MetadataResponse>(
                service, METHODID_METADATA)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MLModelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getInferMethod())
              .addMethod(getMetadataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
