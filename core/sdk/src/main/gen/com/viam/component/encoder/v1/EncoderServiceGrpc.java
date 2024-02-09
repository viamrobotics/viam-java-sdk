package com.viam.component.encoder.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: component/encoder/v1/encoder.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EncoderServiceGrpc {

  private EncoderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.encoder.v1.EncoderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.encoder.v1.Encoder.GetPositionRequest,
      com.viam.component.encoder.v1.Encoder.GetPositionResponse> getGetPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPosition",
      requestType = com.viam.component.encoder.v1.Encoder.GetPositionRequest.class,
      responseType = com.viam.component.encoder.v1.Encoder.GetPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.encoder.v1.Encoder.GetPositionRequest,
      com.viam.component.encoder.v1.Encoder.GetPositionResponse> getGetPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.component.encoder.v1.Encoder.GetPositionRequest, com.viam.component.encoder.v1.Encoder.GetPositionResponse> getGetPositionMethod;
    if ((getGetPositionMethod = EncoderServiceGrpc.getGetPositionMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getGetPositionMethod = EncoderServiceGrpc.getGetPositionMethod) == null) {
          EncoderServiceGrpc.getGetPositionMethod = getGetPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.component.encoder.v1.Encoder.GetPositionRequest, com.viam.component.encoder.v1.Encoder.GetPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.encoder.v1.Encoder.GetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.encoder.v1.Encoder.GetPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("GetPosition"))
              .build();
        }
      }
    }
    return getGetPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.encoder.v1.Encoder.ResetPositionRequest,
      com.viam.component.encoder.v1.Encoder.ResetPositionResponse> getResetPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetPosition",
      requestType = com.viam.component.encoder.v1.Encoder.ResetPositionRequest.class,
      responseType = com.viam.component.encoder.v1.Encoder.ResetPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.encoder.v1.Encoder.ResetPositionRequest,
      com.viam.component.encoder.v1.Encoder.ResetPositionResponse> getResetPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.component.encoder.v1.Encoder.ResetPositionRequest, com.viam.component.encoder.v1.Encoder.ResetPositionResponse> getResetPositionMethod;
    if ((getResetPositionMethod = EncoderServiceGrpc.getResetPositionMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getResetPositionMethod = EncoderServiceGrpc.getResetPositionMethod) == null) {
          EncoderServiceGrpc.getResetPositionMethod = getResetPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.component.encoder.v1.Encoder.ResetPositionRequest, com.viam.component.encoder.v1.Encoder.ResetPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.encoder.v1.Encoder.ResetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.encoder.v1.Encoder.ResetPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("ResetPosition"))
              .build();
        }
      }
    }
    return getResetPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.encoder.v1.Encoder.GetPropertiesRequest,
      com.viam.component.encoder.v1.Encoder.GetPropertiesResponse> getGetPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProperties",
      requestType = com.viam.component.encoder.v1.Encoder.GetPropertiesRequest.class,
      responseType = com.viam.component.encoder.v1.Encoder.GetPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.encoder.v1.Encoder.GetPropertiesRequest,
      com.viam.component.encoder.v1.Encoder.GetPropertiesResponse> getGetPropertiesMethod() {
    io.grpc.MethodDescriptor<com.viam.component.encoder.v1.Encoder.GetPropertiesRequest, com.viam.component.encoder.v1.Encoder.GetPropertiesResponse> getGetPropertiesMethod;
    if ((getGetPropertiesMethod = EncoderServiceGrpc.getGetPropertiesMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getGetPropertiesMethod = EncoderServiceGrpc.getGetPropertiesMethod) == null) {
          EncoderServiceGrpc.getGetPropertiesMethod = getGetPropertiesMethod =
              io.grpc.MethodDescriptor.<com.viam.component.encoder.v1.Encoder.GetPropertiesRequest, com.viam.component.encoder.v1.Encoder.GetPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.encoder.v1.Encoder.GetPropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.encoder.v1.Encoder.GetPropertiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("GetProperties"))
              .build();
        }
      }
    }
    return getGetPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.DoCommandRequest,
      com.viam.common.v1.Common.DoCommandResponse> getDoCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoCommand",
      requestType = com.viam.common.v1.Common.DoCommandRequest.class,
      responseType = com.viam.common.v1.Common.DoCommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.DoCommandRequest,
      com.viam.common.v1.Common.DoCommandResponse> getDoCommandMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.DoCommandRequest, com.viam.common.v1.Common.DoCommandResponse> getDoCommandMethod;
    if ((getDoCommandMethod = EncoderServiceGrpc.getDoCommandMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getDoCommandMethod = EncoderServiceGrpc.getDoCommandMethod) == null) {
          EncoderServiceGrpc.getDoCommandMethod = getDoCommandMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.DoCommandRequest, com.viam.common.v1.Common.DoCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("DoCommand"))
              .build();
        }
      }
    }
    return getDoCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetGeometriesRequest,
      com.viam.common.v1.Common.GetGeometriesResponse> getGetGeometriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGeometries",
      requestType = com.viam.common.v1.Common.GetGeometriesRequest.class,
      responseType = com.viam.common.v1.Common.GetGeometriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetGeometriesRequest,
      com.viam.common.v1.Common.GetGeometriesResponse> getGetGeometriesMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetGeometriesRequest, com.viam.common.v1.Common.GetGeometriesResponse> getGetGeometriesMethod;
    if ((getGetGeometriesMethod = EncoderServiceGrpc.getGetGeometriesMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getGetGeometriesMethod = EncoderServiceGrpc.getGetGeometriesMethod) == null) {
          EncoderServiceGrpc.getGetGeometriesMethod = getGetGeometriesMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.GetGeometriesRequest, com.viam.common.v1.Common.GetGeometriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGeometries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.GetGeometriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.GetGeometriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("GetGeometries"))
              .build();
        }
      }
    }
    return getGetGeometriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EncoderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EncoderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EncoderServiceStub>() {
        @java.lang.Override
        public EncoderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EncoderServiceStub(channel, callOptions);
        }
      };
    return EncoderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EncoderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EncoderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EncoderServiceBlockingStub>() {
        @java.lang.Override
        public EncoderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EncoderServiceBlockingStub(channel, callOptions);
        }
      };
    return EncoderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EncoderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EncoderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EncoderServiceFutureStub>() {
        @java.lang.Override
        public EncoderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EncoderServiceFutureStub(channel, callOptions);
        }
      };
    return EncoderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns position of the encoder which can either be ticks since last
     * zeroing for an incremental encoder or degrees for an absolute encoder.
     * </pre>
     */
    default void getPosition(com.viam.component.encoder.v1.Encoder.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.encoder.v1.Encoder.GetPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPositionMethod(), responseObserver);
    }

    /**
     */
    default void resetPosition(com.viam.component.encoder.v1.Encoder.ResetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.encoder.v1.Encoder.ResetPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of all the methods that are
     * supported by a given robot.
     * </pre>
     */
    default void getProperties(com.viam.component.encoder.v1.Encoder.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.encoder.v1.Encoder.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPropertiesMethod(), responseObserver);
    }

    /**
     */
    default void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoCommandMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    default void getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGeometriesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EncoderService.
   */
  public static abstract class EncoderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EncoderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EncoderService.
   */
  public static final class EncoderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EncoderServiceStub> {
    private EncoderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EncoderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EncoderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns position of the encoder which can either be ticks since last
     * zeroing for an incremental encoder or degrees for an absolute encoder.
     * </pre>
     */
    public void getPosition(com.viam.component.encoder.v1.Encoder.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.encoder.v1.Encoder.GetPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetPosition(com.viam.component.encoder.v1.Encoder.ResetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.encoder.v1.Encoder.ResetPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of all the methods that are
     * supported by a given robot.
     * </pre>
     */
    public void getProperties(com.viam.component.encoder.v1.Encoder.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.encoder.v1.Encoder.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    public void getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGeometriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EncoderService.
   */
  public static final class EncoderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EncoderServiceBlockingStub> {
    private EncoderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EncoderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EncoderServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns position of the encoder which can either be ticks since last
     * zeroing for an incremental encoder or degrees for an absolute encoder.
     * </pre>
     */
    public com.viam.component.encoder.v1.Encoder.GetPositionResponse getPosition(com.viam.component.encoder.v1.Encoder.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPositionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.component.encoder.v1.Encoder.ResetPositionResponse resetPosition(com.viam.component.encoder.v1.Encoder.ResetPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of all the methods that are
     * supported by a given robot.
     * </pre>
     */
    public com.viam.component.encoder.v1.Encoder.GetPropertiesResponse getProperties(com.viam.component.encoder.v1.Encoder.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPropertiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.common.v1.Common.DoCommandResponse doCommand(com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoCommandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    public com.viam.common.v1.Common.GetGeometriesResponse getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGeometriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EncoderService.
   */
  public static final class EncoderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EncoderServiceFutureStub> {
    private EncoderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EncoderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EncoderServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns position of the encoder which can either be ticks since last
     * zeroing for an incremental encoder or degrees for an absolute encoder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.encoder.v1.Encoder.GetPositionResponse> getPosition(
        com.viam.component.encoder.v1.Encoder.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.encoder.v1.Encoder.ResetPositionResponse> resetPosition(
        com.viam.component.encoder.v1.Encoder.ResetPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of all the methods that are
     * supported by a given robot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.encoder.v1.Encoder.GetPropertiesResponse> getProperties(
        com.viam.component.encoder.v1.Encoder.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.DoCommandResponse> doCommand(
        com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.GetGeometriesResponse> getGeometries(
        com.viam.common.v1.Common.GetGeometriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGeometriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POSITION = 0;
  private static final int METHODID_RESET_POSITION = 1;
  private static final int METHODID_GET_PROPERTIES = 2;
  private static final int METHODID_DO_COMMAND = 3;
  private static final int METHODID_GET_GEOMETRIES = 4;

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
        case METHODID_GET_POSITION:
          serviceImpl.getPosition((com.viam.component.encoder.v1.Encoder.GetPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.encoder.v1.Encoder.GetPositionResponse>) responseObserver);
          break;
        case METHODID_RESET_POSITION:
          serviceImpl.resetPosition((com.viam.component.encoder.v1.Encoder.ResetPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.encoder.v1.Encoder.ResetPositionResponse>) responseObserver);
          break;
        case METHODID_GET_PROPERTIES:
          serviceImpl.getProperties((com.viam.component.encoder.v1.Encoder.GetPropertiesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.encoder.v1.Encoder.GetPropertiesResponse>) responseObserver);
          break;
        case METHODID_DO_COMMAND:
          serviceImpl.doCommand((com.viam.common.v1.Common.DoCommandRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse>) responseObserver);
          break;
        case METHODID_GET_GEOMETRIES:
          serviceImpl.getGeometries((com.viam.common.v1.Common.GetGeometriesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse>) responseObserver);
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
          getGetPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.encoder.v1.Encoder.GetPositionRequest,
              com.viam.component.encoder.v1.Encoder.GetPositionResponse>(
                service, METHODID_GET_POSITION)))
        .addMethod(
          getResetPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.encoder.v1.Encoder.ResetPositionRequest,
              com.viam.component.encoder.v1.Encoder.ResetPositionResponse>(
                service, METHODID_RESET_POSITION)))
        .addMethod(
          getGetPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.encoder.v1.Encoder.GetPropertiesRequest,
              com.viam.component.encoder.v1.Encoder.GetPropertiesResponse>(
                service, METHODID_GET_PROPERTIES)))
        .addMethod(
          getDoCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.DoCommandRequest,
              com.viam.common.v1.Common.DoCommandResponse>(
                service, METHODID_DO_COMMAND)))
        .addMethod(
          getGetGeometriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.GetGeometriesRequest,
              com.viam.common.v1.Common.GetGeometriesResponse>(
                service, METHODID_GET_GEOMETRIES)))
        .build();
  }

  private static abstract class EncoderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EncoderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.component.encoder.v1.Encoder.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EncoderService");
    }
  }

  private static final class EncoderServiceFileDescriptorSupplier
      extends EncoderServiceBaseDescriptorSupplier {
    EncoderServiceFileDescriptorSupplier() {}
  }

  private static final class EncoderServiceMethodDescriptorSupplier
      extends EncoderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EncoderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EncoderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EncoderServiceFileDescriptorSupplier())
              .addMethod(getGetPositionMethod())
              .addMethod(getResetPositionMethod())
              .addMethod(getGetPropertiesMethod())
              .addMethod(getDoCommandMethod())
              .addMethod(getGetGeometriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
