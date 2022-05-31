package com.viam.rdk.proto.api.component.base.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/api/component/base/v1/base.proto")
public final class BaseServiceGrpc {

  private BaseServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.api.component.base.v1.BaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightRequest,
      com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightResponse> getMoveStraightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveStraight",
      requestType = com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightRequest.class,
      responseType = com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightRequest,
      com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightResponse> getMoveStraightMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightRequest, com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightResponse> getMoveStraightMethod;
    if ((getMoveStraightMethod = BaseServiceGrpc.getMoveStraightMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getMoveStraightMethod = BaseServiceGrpc.getMoveStraightMethod) == null) {
          BaseServiceGrpc.getMoveStraightMethod = getMoveStraightMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightRequest, com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveStraight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaseServiceMethodDescriptorSupplier("MoveStraight"))
              .build();
        }
      }
    }
    return getMoveStraightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.MoveArcRequest,
      com.viam.rdk.proto.api.component.base.v1.Base.MoveArcResponse> getMoveArcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveArc",
      requestType = com.viam.rdk.proto.api.component.base.v1.Base.MoveArcRequest.class,
      responseType = com.viam.rdk.proto.api.component.base.v1.Base.MoveArcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.MoveArcRequest,
      com.viam.rdk.proto.api.component.base.v1.Base.MoveArcResponse> getMoveArcMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.MoveArcRequest, com.viam.rdk.proto.api.component.base.v1.Base.MoveArcResponse> getMoveArcMethod;
    if ((getMoveArcMethod = BaseServiceGrpc.getMoveArcMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getMoveArcMethod = BaseServiceGrpc.getMoveArcMethod) == null) {
          BaseServiceGrpc.getMoveArcMethod = getMoveArcMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.base.v1.Base.MoveArcRequest, com.viam.rdk.proto.api.component.base.v1.Base.MoveArcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveArc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.base.v1.Base.MoveArcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.base.v1.Base.MoveArcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaseServiceMethodDescriptorSupplier("MoveArc"))
              .build();
        }
      }
    }
    return getMoveArcMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.SpinRequest,
      com.viam.rdk.proto.api.component.base.v1.Base.SpinResponse> getSpinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Spin",
      requestType = com.viam.rdk.proto.api.component.base.v1.Base.SpinRequest.class,
      responseType = com.viam.rdk.proto.api.component.base.v1.Base.SpinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.SpinRequest,
      com.viam.rdk.proto.api.component.base.v1.Base.SpinResponse> getSpinMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.SpinRequest, com.viam.rdk.proto.api.component.base.v1.Base.SpinResponse> getSpinMethod;
    if ((getSpinMethod = BaseServiceGrpc.getSpinMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getSpinMethod = BaseServiceGrpc.getSpinMethod) == null) {
          BaseServiceGrpc.getSpinMethod = getSpinMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.base.v1.Base.SpinRequest, com.viam.rdk.proto.api.component.base.v1.Base.SpinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Spin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.base.v1.Base.SpinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.base.v1.Base.SpinResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaseServiceMethodDescriptorSupplier("Spin"))
              .build();
        }
      }
    }
    return getSpinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.SetPowerRequest,
      com.viam.rdk.proto.api.component.base.v1.Base.SetPowerResponse> getSetPowerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPower",
      requestType = com.viam.rdk.proto.api.component.base.v1.Base.SetPowerRequest.class,
      responseType = com.viam.rdk.proto.api.component.base.v1.Base.SetPowerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.SetPowerRequest,
      com.viam.rdk.proto.api.component.base.v1.Base.SetPowerResponse> getSetPowerMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.SetPowerRequest, com.viam.rdk.proto.api.component.base.v1.Base.SetPowerResponse> getSetPowerMethod;
    if ((getSetPowerMethod = BaseServiceGrpc.getSetPowerMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getSetPowerMethod = BaseServiceGrpc.getSetPowerMethod) == null) {
          BaseServiceGrpc.getSetPowerMethod = getSetPowerMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.base.v1.Base.SetPowerRequest, com.viam.rdk.proto.api.component.base.v1.Base.SetPowerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPower"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.base.v1.Base.SetPowerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.base.v1.Base.SetPowerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaseServiceMethodDescriptorSupplier("SetPower"))
              .build();
        }
      }
    }
    return getSetPowerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.StopRequest,
      com.viam.rdk.proto.api.component.base.v1.Base.StopResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = com.viam.rdk.proto.api.component.base.v1.Base.StopRequest.class,
      responseType = com.viam.rdk.proto.api.component.base.v1.Base.StopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.StopRequest,
      com.viam.rdk.proto.api.component.base.v1.Base.StopResponse> getStopMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.base.v1.Base.StopRequest, com.viam.rdk.proto.api.component.base.v1.Base.StopResponse> getStopMethod;
    if ((getStopMethod = BaseServiceGrpc.getStopMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getStopMethod = BaseServiceGrpc.getStopMethod) == null) {
          BaseServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.base.v1.Base.StopRequest, com.viam.rdk.proto.api.component.base.v1.Base.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.base.v1.Base.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.base.v1.Base.StopResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaseServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BaseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BaseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BaseServiceStub>() {
        @java.lang.Override
        public BaseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BaseServiceStub(channel, callOptions);
        }
      };
    return BaseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BaseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BaseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BaseServiceBlockingStub>() {
        @java.lang.Override
        public BaseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BaseServiceBlockingStub(channel, callOptions);
        }
      };
    return BaseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BaseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BaseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BaseServiceFutureStub>() {
        @java.lang.Override
        public BaseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BaseServiceFutureStub(channel, callOptions);
        }
      };
    return BaseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BaseServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * MoveStraight moves a robot's base in a straight line by a given distance, expressed in millimeters
     * and a given speed, expressed in millimeters per second
     * This method blocks until completed or cancelled
     * </pre>
     */
    public void moveStraight(com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveStraightMethod(), responseObserver);
    }

    /**
     * <pre>
     * MoveArc moves the robot's base in an arc by a given distance, expressed in millimeters,
     * a given speed, expressed in millimeters per second of movement, and a given angle expressed in degrees
     * This method blocks until completed or cancelled
     * </pre>
     */
    public void moveArc(com.viam.rdk.proto.api.component.base.v1.Base.MoveArcRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.MoveArcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveArcMethod(), responseObserver);
    }

    /**
     * <pre>
     * Spin spins a robot's base by an given angle, expressed in degrees, and a given 
     * angular speed, expressed in degrees per second
     * This method blocks until completed or cancelled
     * </pre>
     */
    public void spin(com.viam.rdk.proto.api.component.base.v1.Base.SpinRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.SpinResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpinMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetPower sets the linear and angular velocity of a base
     * </pre>
     */
    public void setPower(com.viam.rdk.proto.api.component.base.v1.Base.SetPowerRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.SetPowerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPowerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's base 
     * </pre>
     */
    public void stop(com.viam.rdk.proto.api.component.base.v1.Base.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.StopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMoveStraightMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightRequest,
                com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightResponse>(
                  this, METHODID_MOVE_STRAIGHT)))
          .addMethod(
            getMoveArcMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.base.v1.Base.MoveArcRequest,
                com.viam.rdk.proto.api.component.base.v1.Base.MoveArcResponse>(
                  this, METHODID_MOVE_ARC)))
          .addMethod(
            getSpinMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.base.v1.Base.SpinRequest,
                com.viam.rdk.proto.api.component.base.v1.Base.SpinResponse>(
                  this, METHODID_SPIN)))
          .addMethod(
            getSetPowerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.base.v1.Base.SetPowerRequest,
                com.viam.rdk.proto.api.component.base.v1.Base.SetPowerResponse>(
                  this, METHODID_SET_POWER)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.base.v1.Base.StopRequest,
                com.viam.rdk.proto.api.component.base.v1.Base.StopResponse>(
                  this, METHODID_STOP)))
          .build();
    }
  }

  /**
   */
  public static final class BaseServiceStub extends io.grpc.stub.AbstractAsyncStub<BaseServiceStub> {
    private BaseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BaseServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * MoveStraight moves a robot's base in a straight line by a given distance, expressed in millimeters
     * and a given speed, expressed in millimeters per second
     * This method blocks until completed or cancelled
     * </pre>
     */
    public void moveStraight(com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveStraightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MoveArc moves the robot's base in an arc by a given distance, expressed in millimeters,
     * a given speed, expressed in millimeters per second of movement, and a given angle expressed in degrees
     * This method blocks until completed or cancelled
     * </pre>
     */
    public void moveArc(com.viam.rdk.proto.api.component.base.v1.Base.MoveArcRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.MoveArcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveArcMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Spin spins a robot's base by an given angle, expressed in degrees, and a given 
     * angular speed, expressed in degrees per second
     * This method blocks until completed or cancelled
     * </pre>
     */
    public void spin(com.viam.rdk.proto.api.component.base.v1.Base.SpinRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.SpinResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetPower sets the linear and angular velocity of a base
     * </pre>
     */
    public void setPower(com.viam.rdk.proto.api.component.base.v1.Base.SetPowerRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.SetPowerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPowerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's base 
     * </pre>
     */
    public void stop(com.viam.rdk.proto.api.component.base.v1.Base.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.StopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BaseServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BaseServiceBlockingStub> {
    private BaseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BaseServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * MoveStraight moves a robot's base in a straight line by a given distance, expressed in millimeters
     * and a given speed, expressed in millimeters per second
     * This method blocks until completed or cancelled
     * </pre>
     */
    public com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightResponse moveStraight(com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveStraightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MoveArc moves the robot's base in an arc by a given distance, expressed in millimeters,
     * a given speed, expressed in millimeters per second of movement, and a given angle expressed in degrees
     * This method blocks until completed or cancelled
     * </pre>
     */
    public com.viam.rdk.proto.api.component.base.v1.Base.MoveArcResponse moveArc(com.viam.rdk.proto.api.component.base.v1.Base.MoveArcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveArcMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Spin spins a robot's base by an given angle, expressed in degrees, and a given 
     * angular speed, expressed in degrees per second
     * This method blocks until completed or cancelled
     * </pre>
     */
    public com.viam.rdk.proto.api.component.base.v1.Base.SpinResponse spin(com.viam.rdk.proto.api.component.base.v1.Base.SpinRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpinMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetPower sets the linear and angular velocity of a base
     * </pre>
     */
    public com.viam.rdk.proto.api.component.base.v1.Base.SetPowerResponse setPower(com.viam.rdk.proto.api.component.base.v1.Base.SetPowerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPowerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop stops a robot's base 
     * </pre>
     */
    public com.viam.rdk.proto.api.component.base.v1.Base.StopResponse stop(com.viam.rdk.proto.api.component.base.v1.Base.StopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BaseServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BaseServiceFutureStub> {
    private BaseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BaseServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * MoveStraight moves a robot's base in a straight line by a given distance, expressed in millimeters
     * and a given speed, expressed in millimeters per second
     * This method blocks until completed or cancelled
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightResponse> moveStraight(
        com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveStraightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MoveArc moves the robot's base in an arc by a given distance, expressed in millimeters,
     * a given speed, expressed in millimeters per second of movement, and a given angle expressed in degrees
     * This method blocks until completed or cancelled
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.base.v1.Base.MoveArcResponse> moveArc(
        com.viam.rdk.proto.api.component.base.v1.Base.MoveArcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveArcMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Spin spins a robot's base by an given angle, expressed in degrees, and a given 
     * angular speed, expressed in degrees per second
     * This method blocks until completed or cancelled
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.base.v1.Base.SpinResponse> spin(
        com.viam.rdk.proto.api.component.base.v1.Base.SpinRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpinMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetPower sets the linear and angular velocity of a base
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.base.v1.Base.SetPowerResponse> setPower(
        com.viam.rdk.proto.api.component.base.v1.Base.SetPowerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPowerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop stops a robot's base 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.base.v1.Base.StopResponse> stop(
        com.viam.rdk.proto.api.component.base.v1.Base.StopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MOVE_STRAIGHT = 0;
  private static final int METHODID_MOVE_ARC = 1;
  private static final int METHODID_SPIN = 2;
  private static final int METHODID_SET_POWER = 3;
  private static final int METHODID_STOP = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BaseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BaseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MOVE_STRAIGHT:
          serviceImpl.moveStraight((com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.MoveStraightResponse>) responseObserver);
          break;
        case METHODID_MOVE_ARC:
          serviceImpl.moveArc((com.viam.rdk.proto.api.component.base.v1.Base.MoveArcRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.MoveArcResponse>) responseObserver);
          break;
        case METHODID_SPIN:
          serviceImpl.spin((com.viam.rdk.proto.api.component.base.v1.Base.SpinRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.SpinResponse>) responseObserver);
          break;
        case METHODID_SET_POWER:
          serviceImpl.setPower((com.viam.rdk.proto.api.component.base.v1.Base.SetPowerRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.SetPowerResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((com.viam.rdk.proto.api.component.base.v1.Base.StopRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.base.v1.Base.StopResponse>) responseObserver);
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

  private static abstract class BaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BaseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.rdk.proto.api.component.base.v1.Base.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BaseService");
    }
  }

  private static final class BaseServiceFileDescriptorSupplier
      extends BaseServiceBaseDescriptorSupplier {
    BaseServiceFileDescriptorSupplier() {}
  }

  private static final class BaseServiceMethodDescriptorSupplier
      extends BaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BaseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BaseServiceFileDescriptorSupplier())
              .addMethod(getMoveStraightMethod())
              .addMethod(getMoveArcMethod())
              .addMethod(getSpinMethod())
              .addMethod(getSetPowerMethod())
              .addMethod(getStopMethod())
              .build();
        }
      }
    }
    return result;
  }
}
