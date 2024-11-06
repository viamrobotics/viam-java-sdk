package com.viam.component.powersensor.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * PowerSensorService services all power sensors associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: component/powersensor/v1/powersensor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PowerSensorServiceGrpc {

  private PowerSensorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.powersensor.v1.PowerSensorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.powersensor.v1.Powersensor.GetVoltageRequest,
      com.viam.component.powersensor.v1.Powersensor.GetVoltageResponse> getGetVoltageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVoltage",
      requestType = com.viam.component.powersensor.v1.Powersensor.GetVoltageRequest.class,
      responseType = com.viam.component.powersensor.v1.Powersensor.GetVoltageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.powersensor.v1.Powersensor.GetVoltageRequest,
      com.viam.component.powersensor.v1.Powersensor.GetVoltageResponse> getGetVoltageMethod() {
    io.grpc.MethodDescriptor<com.viam.component.powersensor.v1.Powersensor.GetVoltageRequest, com.viam.component.powersensor.v1.Powersensor.GetVoltageResponse> getGetVoltageMethod;
    if ((getGetVoltageMethod = PowerSensorServiceGrpc.getGetVoltageMethod) == null) {
      synchronized (PowerSensorServiceGrpc.class) {
        if ((getGetVoltageMethod = PowerSensorServiceGrpc.getGetVoltageMethod) == null) {
          PowerSensorServiceGrpc.getGetVoltageMethod = getGetVoltageMethod =
              io.grpc.MethodDescriptor.<com.viam.component.powersensor.v1.Powersensor.GetVoltageRequest, com.viam.component.powersensor.v1.Powersensor.GetVoltageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVoltage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.powersensor.v1.Powersensor.GetVoltageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.powersensor.v1.Powersensor.GetVoltageResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetVoltageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.powersensor.v1.Powersensor.GetCurrentRequest,
      com.viam.component.powersensor.v1.Powersensor.GetCurrentResponse> getGetCurrentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrent",
      requestType = com.viam.component.powersensor.v1.Powersensor.GetCurrentRequest.class,
      responseType = com.viam.component.powersensor.v1.Powersensor.GetCurrentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.powersensor.v1.Powersensor.GetCurrentRequest,
      com.viam.component.powersensor.v1.Powersensor.GetCurrentResponse> getGetCurrentMethod() {
    io.grpc.MethodDescriptor<com.viam.component.powersensor.v1.Powersensor.GetCurrentRequest, com.viam.component.powersensor.v1.Powersensor.GetCurrentResponse> getGetCurrentMethod;
    if ((getGetCurrentMethod = PowerSensorServiceGrpc.getGetCurrentMethod) == null) {
      synchronized (PowerSensorServiceGrpc.class) {
        if ((getGetCurrentMethod = PowerSensorServiceGrpc.getGetCurrentMethod) == null) {
          PowerSensorServiceGrpc.getGetCurrentMethod = getGetCurrentMethod =
              io.grpc.MethodDescriptor.<com.viam.component.powersensor.v1.Powersensor.GetCurrentRequest, com.viam.component.powersensor.v1.Powersensor.GetCurrentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.powersensor.v1.Powersensor.GetCurrentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.powersensor.v1.Powersensor.GetCurrentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCurrentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.powersensor.v1.Powersensor.GetPowerRequest,
      com.viam.component.powersensor.v1.Powersensor.GetPowerResponse> getGetPowerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPower",
      requestType = com.viam.component.powersensor.v1.Powersensor.GetPowerRequest.class,
      responseType = com.viam.component.powersensor.v1.Powersensor.GetPowerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.powersensor.v1.Powersensor.GetPowerRequest,
      com.viam.component.powersensor.v1.Powersensor.GetPowerResponse> getGetPowerMethod() {
    io.grpc.MethodDescriptor<com.viam.component.powersensor.v1.Powersensor.GetPowerRequest, com.viam.component.powersensor.v1.Powersensor.GetPowerResponse> getGetPowerMethod;
    if ((getGetPowerMethod = PowerSensorServiceGrpc.getGetPowerMethod) == null) {
      synchronized (PowerSensorServiceGrpc.class) {
        if ((getGetPowerMethod = PowerSensorServiceGrpc.getGetPowerMethod) == null) {
          PowerSensorServiceGrpc.getGetPowerMethod = getGetPowerMethod =
              io.grpc.MethodDescriptor.<com.viam.component.powersensor.v1.Powersensor.GetPowerRequest, com.viam.component.powersensor.v1.Powersensor.GetPowerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPower"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.powersensor.v1.Powersensor.GetPowerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.powersensor.v1.Powersensor.GetPowerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPowerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetReadingsRequest,
      com.viam.common.v1.Common.GetReadingsResponse> getGetReadingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReadings",
      requestType = com.viam.common.v1.Common.GetReadingsRequest.class,
      responseType = com.viam.common.v1.Common.GetReadingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetReadingsRequest,
      com.viam.common.v1.Common.GetReadingsResponse> getGetReadingsMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetReadingsRequest, com.viam.common.v1.Common.GetReadingsResponse> getGetReadingsMethod;
    if ((getGetReadingsMethod = PowerSensorServiceGrpc.getGetReadingsMethod) == null) {
      synchronized (PowerSensorServiceGrpc.class) {
        if ((getGetReadingsMethod = PowerSensorServiceGrpc.getGetReadingsMethod) == null) {
          PowerSensorServiceGrpc.getGetReadingsMethod = getGetReadingsMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.GetReadingsRequest, com.viam.common.v1.Common.GetReadingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReadings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetReadingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetReadingsResponse.getDefaultInstance()))
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
    if ((getDoCommandMethod = PowerSensorServiceGrpc.getDoCommandMethod) == null) {
      synchronized (PowerSensorServiceGrpc.class) {
        if ((getDoCommandMethod = PowerSensorServiceGrpc.getDoCommandMethod) == null) {
          PowerSensorServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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
  public static PowerSensorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PowerSensorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PowerSensorServiceStub>() {
        @java.lang.Override
        public PowerSensorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PowerSensorServiceStub(channel, callOptions);
        }
      };
    return PowerSensorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PowerSensorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PowerSensorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PowerSensorServiceBlockingStub>() {
        @java.lang.Override
        public PowerSensorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PowerSensorServiceBlockingStub(channel, callOptions);
        }
      };
    return PowerSensorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PowerSensorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PowerSensorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PowerSensorServiceFutureStub>() {
        @java.lang.Override
        public PowerSensorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PowerSensorServiceFutureStub(channel, callOptions);
        }
      };
    return PowerSensorServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * PowerSensorService services all power sensors associated with a robot
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetVoltage returns the voltage reading of a power sensor in volts
     * </pre>
     */
    default void getVoltage(com.viam.component.powersensor.v1.Powersensor.GetVoltageRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.powersensor.v1.Powersensor.GetVoltageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVoltageMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCurrent returns the current reading of a power sensor in amperes
     * </pre>
     */
    default void getCurrent(com.viam.component.powersensor.v1.Powersensor.GetCurrentRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.powersensor.v1.Powersensor.GetCurrentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPower returns the power reading of a power sensor in watts
     * </pre>
     */
    default void getPower(com.viam.component.powersensor.v1.Powersensor.GetPowerRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.powersensor.v1.Powersensor.GetPowerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPowerMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetReadings returns the readings of a sensor of the underlying robot.
     * </pre>
     */
    default void getReadings(com.viam.common.v1.Common.GetReadingsRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetReadingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReadingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    default void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoCommandMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PowerSensorService.
   * <pre>
   * PowerSensorService services all power sensors associated with a robot
   * </pre>
   */
  public static abstract class PowerSensorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PowerSensorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PowerSensorService.
   * <pre>
   * PowerSensorService services all power sensors associated with a robot
   * </pre>
   */
  public static final class PowerSensorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PowerSensorServiceStub> {
    private PowerSensorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerSensorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PowerSensorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetVoltage returns the voltage reading of a power sensor in volts
     * </pre>
     */
    public void getVoltage(com.viam.component.powersensor.v1.Powersensor.GetVoltageRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.powersensor.v1.Powersensor.GetVoltageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVoltageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCurrent returns the current reading of a power sensor in amperes
     * </pre>
     */
    public void getCurrent(com.viam.component.powersensor.v1.Powersensor.GetCurrentRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.powersensor.v1.Powersensor.GetCurrentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPower returns the power reading of a power sensor in watts
     * </pre>
     */
    public void getPower(com.viam.component.powersensor.v1.Powersensor.GetPowerRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.powersensor.v1.Powersensor.GetPowerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPowerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetReadings returns the readings of a sensor of the underlying robot.
     * </pre>
     */
    public void getReadings(com.viam.common.v1.Common.GetReadingsRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetReadingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReadingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    public void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PowerSensorService.
   * <pre>
   * PowerSensorService services all power sensors associated with a robot
   * </pre>
   */
  public static final class PowerSensorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PowerSensorServiceBlockingStub> {
    private PowerSensorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerSensorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PowerSensorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetVoltage returns the voltage reading of a power sensor in volts
     * </pre>
     */
    public com.viam.component.powersensor.v1.Powersensor.GetVoltageResponse getVoltage(com.viam.component.powersensor.v1.Powersensor.GetVoltageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVoltageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCurrent returns the current reading of a power sensor in amperes
     * </pre>
     */
    public com.viam.component.powersensor.v1.Powersensor.GetCurrentResponse getCurrent(com.viam.component.powersensor.v1.Powersensor.GetCurrentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPower returns the power reading of a power sensor in watts
     * </pre>
     */
    public com.viam.component.powersensor.v1.Powersensor.GetPowerResponse getPower(com.viam.component.powersensor.v1.Powersensor.GetPowerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPowerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetReadings returns the readings of a sensor of the underlying robot.
     * </pre>
     */
    public com.viam.common.v1.Common.GetReadingsResponse getReadings(com.viam.common.v1.Common.GetReadingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReadingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    public com.viam.common.v1.Common.DoCommandResponse doCommand(com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoCommandMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PowerSensorService.
   * <pre>
   * PowerSensorService services all power sensors associated with a robot
   * </pre>
   */
  public static final class PowerSensorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PowerSensorServiceFutureStub> {
    private PowerSensorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerSensorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PowerSensorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetVoltage returns the voltage reading of a power sensor in volts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.powersensor.v1.Powersensor.GetVoltageResponse> getVoltage(
        com.viam.component.powersensor.v1.Powersensor.GetVoltageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVoltageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCurrent returns the current reading of a power sensor in amperes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.powersensor.v1.Powersensor.GetCurrentResponse> getCurrent(
        com.viam.component.powersensor.v1.Powersensor.GetCurrentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPower returns the power reading of a power sensor in watts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.powersensor.v1.Powersensor.GetPowerResponse> getPower(
        com.viam.component.powersensor.v1.Powersensor.GetPowerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPowerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetReadings returns the readings of a sensor of the underlying robot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.GetReadingsResponse> getReadings(
        com.viam.common.v1.Common.GetReadingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReadingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.DoCommandResponse> doCommand(
        com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VOLTAGE = 0;
  private static final int METHODID_GET_CURRENT = 1;
  private static final int METHODID_GET_POWER = 2;
  private static final int METHODID_GET_READINGS = 3;
  private static final int METHODID_DO_COMMAND = 4;

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
        case METHODID_GET_VOLTAGE:
          serviceImpl.getVoltage((com.viam.component.powersensor.v1.Powersensor.GetVoltageRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.powersensor.v1.Powersensor.GetVoltageResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT:
          serviceImpl.getCurrent((com.viam.component.powersensor.v1.Powersensor.GetCurrentRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.powersensor.v1.Powersensor.GetCurrentResponse>) responseObserver);
          break;
        case METHODID_GET_POWER:
          serviceImpl.getPower((com.viam.component.powersensor.v1.Powersensor.GetPowerRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.powersensor.v1.Powersensor.GetPowerResponse>) responseObserver);
          break;
        case METHODID_GET_READINGS:
          serviceImpl.getReadings((com.viam.common.v1.Common.GetReadingsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetReadingsResponse>) responseObserver);
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
          getGetVoltageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.powersensor.v1.Powersensor.GetVoltageRequest,
              com.viam.component.powersensor.v1.Powersensor.GetVoltageResponse>(
                service, METHODID_GET_VOLTAGE)))
        .addMethod(
          getGetCurrentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.powersensor.v1.Powersensor.GetCurrentRequest,
              com.viam.component.powersensor.v1.Powersensor.GetCurrentResponse>(
                service, METHODID_GET_CURRENT)))
        .addMethod(
          getGetPowerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.powersensor.v1.Powersensor.GetPowerRequest,
              com.viam.component.powersensor.v1.Powersensor.GetPowerResponse>(
                service, METHODID_GET_POWER)))
        .addMethod(
          getGetReadingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.GetReadingsRequest,
              com.viam.common.v1.Common.GetReadingsResponse>(
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
      synchronized (PowerSensorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetVoltageMethod())
              .addMethod(getGetCurrentMethod())
              .addMethod(getGetPowerMethod())
              .addMethod(getGetReadingsMethod())
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
