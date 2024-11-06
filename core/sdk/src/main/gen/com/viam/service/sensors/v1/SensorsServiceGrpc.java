package com.viam.service.sensors.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A SensorsService services keeps track of all sensors associated with a robot
 * This service is deprecated
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: service/sensors/v1/sensors.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SensorsServiceGrpc {

  private SensorsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.service.sensors.v1.SensorsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.service.sensors.v1.Sensors.GetSensorsRequest,
      com.viam.service.sensors.v1.Sensors.GetSensorsResponse> getGetSensorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSensors",
      requestType = com.viam.service.sensors.v1.Sensors.GetSensorsRequest.class,
      responseType = com.viam.service.sensors.v1.Sensors.GetSensorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.sensors.v1.Sensors.GetSensorsRequest,
      com.viam.service.sensors.v1.Sensors.GetSensorsResponse> getGetSensorsMethod() {
    io.grpc.MethodDescriptor<com.viam.service.sensors.v1.Sensors.GetSensorsRequest, com.viam.service.sensors.v1.Sensors.GetSensorsResponse> getGetSensorsMethod;
    if ((getGetSensorsMethod = SensorsServiceGrpc.getGetSensorsMethod) == null) {
      synchronized (SensorsServiceGrpc.class) {
        if ((getGetSensorsMethod = SensorsServiceGrpc.getGetSensorsMethod) == null) {
          SensorsServiceGrpc.getGetSensorsMethod = getGetSensorsMethod =
              io.grpc.MethodDescriptor.<com.viam.service.sensors.v1.Sensors.GetSensorsRequest, com.viam.service.sensors.v1.Sensors.GetSensorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSensors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.sensors.v1.Sensors.GetSensorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.sensors.v1.Sensors.GetSensorsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetSensorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.sensors.v1.Sensors.GetReadingsRequest,
      com.viam.service.sensors.v1.Sensors.GetReadingsResponse> getGetReadingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReadings",
      requestType = com.viam.service.sensors.v1.Sensors.GetReadingsRequest.class,
      responseType = com.viam.service.sensors.v1.Sensors.GetReadingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.sensors.v1.Sensors.GetReadingsRequest,
      com.viam.service.sensors.v1.Sensors.GetReadingsResponse> getGetReadingsMethod() {
    io.grpc.MethodDescriptor<com.viam.service.sensors.v1.Sensors.GetReadingsRequest, com.viam.service.sensors.v1.Sensors.GetReadingsResponse> getGetReadingsMethod;
    if ((getGetReadingsMethod = SensorsServiceGrpc.getGetReadingsMethod) == null) {
      synchronized (SensorsServiceGrpc.class) {
        if ((getGetReadingsMethod = SensorsServiceGrpc.getGetReadingsMethod) == null) {
          SensorsServiceGrpc.getGetReadingsMethod = getGetReadingsMethod =
              io.grpc.MethodDescriptor.<com.viam.service.sensors.v1.Sensors.GetReadingsRequest, com.viam.service.sensors.v1.Sensors.GetReadingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReadings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.sensors.v1.Sensors.GetReadingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.sensors.v1.Sensors.GetReadingsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetReadingsMethod;
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
    if ((getDoCommandMethod = SensorsServiceGrpc.getDoCommandMethod) == null) {
      synchronized (SensorsServiceGrpc.class) {
        if ((getDoCommandMethod = SensorsServiceGrpc.getDoCommandMethod) == null) {
          SensorsServiceGrpc.getDoCommandMethod = getDoCommandMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.DoCommandRequest, com.viam.common.v1.Common.DoCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDoCommandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SensorsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorsServiceStub>() {
        @java.lang.Override
        public SensorsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorsServiceStub(channel, callOptions);
        }
      };
    return SensorsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SensorsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorsServiceBlockingStub>() {
        @java.lang.Override
        public SensorsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorsServiceBlockingStub(channel, callOptions);
        }
      };
    return SensorsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SensorsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorsServiceFutureStub>() {
        @java.lang.Override
        public SensorsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorsServiceFutureStub(channel, callOptions);
        }
      };
    return SensorsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A SensorsService services keeps track of all sensors associated with a robot
   * This service is deprecated
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetSensors returns the list of all sensors.
     * </pre>
     */
    @java.lang.Deprecated
    default void getSensors(com.viam.service.sensors.v1.Sensors.GetSensorsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.sensors.v1.Sensors.GetSensorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSensorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetReadings returns the list of readings for all sensors specified.
     * </pre>
     */
    @java.lang.Deprecated
    default void getReadings(com.viam.service.sensors.v1.Sensors.GetReadingsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.sensors.v1.Sensors.GetReadingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReadingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    @java.lang.Deprecated
    default void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoCommandMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SensorsService.
   * <pre>
   * A SensorsService services keeps track of all sensors associated with a robot
   * This service is deprecated
   * </pre>
   */
  public static abstract class SensorsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SensorsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SensorsService.
   * <pre>
   * A SensorsService services keeps track of all sensors associated with a robot
   * This service is deprecated
   * </pre>
   */
  public static final class SensorsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SensorsServiceStub> {
    private SensorsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSensors returns the list of all sensors.
     * </pre>
     */
    @java.lang.Deprecated
    public void getSensors(com.viam.service.sensors.v1.Sensors.GetSensorsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.sensors.v1.Sensors.GetSensorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSensorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetReadings returns the list of readings for all sensors specified.
     * </pre>
     */
    @java.lang.Deprecated
    public void getReadings(com.viam.service.sensors.v1.Sensors.GetReadingsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.sensors.v1.Sensors.GetReadingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReadingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    @java.lang.Deprecated
    public void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SensorsService.
   * <pre>
   * A SensorsService services keeps track of all sensors associated with a robot
   * This service is deprecated
   * </pre>
   */
  public static final class SensorsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SensorsServiceBlockingStub> {
    private SensorsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSensors returns the list of all sensors.
     * </pre>
     */
    @java.lang.Deprecated
    public com.viam.service.sensors.v1.Sensors.GetSensorsResponse getSensors(com.viam.service.sensors.v1.Sensors.GetSensorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSensorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetReadings returns the list of readings for all sensors specified.
     * </pre>
     */
    @java.lang.Deprecated
    public com.viam.service.sensors.v1.Sensors.GetReadingsResponse getReadings(com.viam.service.sensors.v1.Sensors.GetReadingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReadingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    @java.lang.Deprecated
    public com.viam.common.v1.Common.DoCommandResponse doCommand(com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoCommandMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SensorsService.
   * <pre>
   * A SensorsService services keeps track of all sensors associated with a robot
   * This service is deprecated
   * </pre>
   */
  public static final class SensorsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SensorsServiceFutureStub> {
    private SensorsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSensors returns the list of all sensors.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.sensors.v1.Sensors.GetSensorsResponse> getSensors(
        com.viam.service.sensors.v1.Sensors.GetSensorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSensorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetReadings returns the list of readings for all sensors specified.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.sensors.v1.Sensors.GetReadingsResponse> getReadings(
        com.viam.service.sensors.v1.Sensors.GetReadingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReadingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.DoCommandResponse> doCommand(
        com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SENSORS = 0;
  private static final int METHODID_GET_READINGS = 1;
  private static final int METHODID_DO_COMMAND = 2;

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
        case METHODID_GET_SENSORS:
          serviceImpl.getSensors((com.viam.service.sensors.v1.Sensors.GetSensorsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.sensors.v1.Sensors.GetSensorsResponse>) responseObserver);
          break;
        case METHODID_GET_READINGS:
          serviceImpl.getReadings((com.viam.service.sensors.v1.Sensors.GetReadingsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.sensors.v1.Sensors.GetReadingsResponse>) responseObserver);
          break;
        case METHODID_DO_COMMAND:
          serviceImpl.doCommand((com.viam.common.v1.Common.DoCommandRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse>) responseObserver);
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
          getGetSensorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.sensors.v1.Sensors.GetSensorsRequest,
              com.viam.service.sensors.v1.Sensors.GetSensorsResponse>(
                service, METHODID_GET_SENSORS)))
        .addMethod(
          getGetReadingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.sensors.v1.Sensors.GetReadingsRequest,
              com.viam.service.sensors.v1.Sensors.GetReadingsResponse>(
                service, METHODID_GET_READINGS)))
        .addMethod(
          getDoCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.DoCommandRequest,
              com.viam.common.v1.Common.DoCommandResponse>(
                service, METHODID_DO_COMMAND)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SensorsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetSensorsMethod())
              .addMethod(getGetReadingsMethod())
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
