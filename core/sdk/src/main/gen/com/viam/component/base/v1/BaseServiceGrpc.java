package com.viam.component.base.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: component/base/v1/base.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BaseServiceGrpc {

  private BaseServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.base.v1.BaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.MoveStraightRequest,
      com.viam.component.base.v1.Base.MoveStraightResponse> getMoveStraightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveStraight",
      requestType = com.viam.component.base.v1.Base.MoveStraightRequest.class,
      responseType = com.viam.component.base.v1.Base.MoveStraightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.MoveStraightRequest,
      com.viam.component.base.v1.Base.MoveStraightResponse> getMoveStraightMethod() {
    io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.MoveStraightRequest, com.viam.component.base.v1.Base.MoveStraightResponse> getMoveStraightMethod;
    if ((getMoveStraightMethod = BaseServiceGrpc.getMoveStraightMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getMoveStraightMethod = BaseServiceGrpc.getMoveStraightMethod) == null) {
          BaseServiceGrpc.getMoveStraightMethod = getMoveStraightMethod =
              io.grpc.MethodDescriptor.<com.viam.component.base.v1.Base.MoveStraightRequest, com.viam.component.base.v1.Base.MoveStraightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveStraight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.MoveStraightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.MoveStraightResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getMoveStraightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.SpinRequest,
      com.viam.component.base.v1.Base.SpinResponse> getSpinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Spin",
      requestType = com.viam.component.base.v1.Base.SpinRequest.class,
      responseType = com.viam.component.base.v1.Base.SpinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.SpinRequest,
      com.viam.component.base.v1.Base.SpinResponse> getSpinMethod() {
    io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.SpinRequest, com.viam.component.base.v1.Base.SpinResponse> getSpinMethod;
    if ((getSpinMethod = BaseServiceGrpc.getSpinMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getSpinMethod = BaseServiceGrpc.getSpinMethod) == null) {
          BaseServiceGrpc.getSpinMethod = getSpinMethod =
              io.grpc.MethodDescriptor.<com.viam.component.base.v1.Base.SpinRequest, com.viam.component.base.v1.Base.SpinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Spin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.SpinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.SpinResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSpinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.SetPowerRequest,
      com.viam.component.base.v1.Base.SetPowerResponse> getSetPowerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPower",
      requestType = com.viam.component.base.v1.Base.SetPowerRequest.class,
      responseType = com.viam.component.base.v1.Base.SetPowerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.SetPowerRequest,
      com.viam.component.base.v1.Base.SetPowerResponse> getSetPowerMethod() {
    io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.SetPowerRequest, com.viam.component.base.v1.Base.SetPowerResponse> getSetPowerMethod;
    if ((getSetPowerMethod = BaseServiceGrpc.getSetPowerMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getSetPowerMethod = BaseServiceGrpc.getSetPowerMethod) == null) {
          BaseServiceGrpc.getSetPowerMethod = getSetPowerMethod =
              io.grpc.MethodDescriptor.<com.viam.component.base.v1.Base.SetPowerRequest, com.viam.component.base.v1.Base.SetPowerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPower"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.SetPowerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.SetPowerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetPowerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.SetVelocityRequest,
      com.viam.component.base.v1.Base.SetVelocityResponse> getSetVelocityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetVelocity",
      requestType = com.viam.component.base.v1.Base.SetVelocityRequest.class,
      responseType = com.viam.component.base.v1.Base.SetVelocityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.SetVelocityRequest,
      com.viam.component.base.v1.Base.SetVelocityResponse> getSetVelocityMethod() {
    io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.SetVelocityRequest, com.viam.component.base.v1.Base.SetVelocityResponse> getSetVelocityMethod;
    if ((getSetVelocityMethod = BaseServiceGrpc.getSetVelocityMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getSetVelocityMethod = BaseServiceGrpc.getSetVelocityMethod) == null) {
          BaseServiceGrpc.getSetVelocityMethod = getSetVelocityMethod =
              io.grpc.MethodDescriptor.<com.viam.component.base.v1.Base.SetVelocityRequest, com.viam.component.base.v1.Base.SetVelocityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetVelocity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.SetVelocityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.SetVelocityResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetVelocityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.StopRequest,
      com.viam.component.base.v1.Base.StopResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = com.viam.component.base.v1.Base.StopRequest.class,
      responseType = com.viam.component.base.v1.Base.StopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.StopRequest,
      com.viam.component.base.v1.Base.StopResponse> getStopMethod() {
    io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.StopRequest, com.viam.component.base.v1.Base.StopResponse> getStopMethod;
    if ((getStopMethod = BaseServiceGrpc.getStopMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getStopMethod = BaseServiceGrpc.getStopMethod) == null) {
          BaseServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<com.viam.component.base.v1.Base.StopRequest, com.viam.component.base.v1.Base.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.StopResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.IsMovingRequest,
      com.viam.component.base.v1.Base.IsMovingResponse> getIsMovingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsMoving",
      requestType = com.viam.component.base.v1.Base.IsMovingRequest.class,
      responseType = com.viam.component.base.v1.Base.IsMovingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.IsMovingRequest,
      com.viam.component.base.v1.Base.IsMovingResponse> getIsMovingMethod() {
    io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.IsMovingRequest, com.viam.component.base.v1.Base.IsMovingResponse> getIsMovingMethod;
    if ((getIsMovingMethod = BaseServiceGrpc.getIsMovingMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getIsMovingMethod = BaseServiceGrpc.getIsMovingMethod) == null) {
          BaseServiceGrpc.getIsMovingMethod = getIsMovingMethod =
              io.grpc.MethodDescriptor.<com.viam.component.base.v1.Base.IsMovingRequest, com.viam.component.base.v1.Base.IsMovingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsMoving"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.IsMovingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.IsMovingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsMovingMethod;
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
    if ((getDoCommandMethod = BaseServiceGrpc.getDoCommandMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getDoCommandMethod = BaseServiceGrpc.getDoCommandMethod) == null) {
          BaseServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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
    if ((getGetGeometriesMethod = BaseServiceGrpc.getGetGeometriesMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getGetGeometriesMethod = BaseServiceGrpc.getGetGeometriesMethod) == null) {
          BaseServiceGrpc.getGetGeometriesMethod = getGetGeometriesMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.GetGeometriesRequest, com.viam.common.v1.Common.GetGeometriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGeometries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetGeometriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetGeometriesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetGeometriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.GetPropertiesRequest,
      com.viam.component.base.v1.Base.GetPropertiesResponse> getGetPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProperties",
      requestType = com.viam.component.base.v1.Base.GetPropertiesRequest.class,
      responseType = com.viam.component.base.v1.Base.GetPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.GetPropertiesRequest,
      com.viam.component.base.v1.Base.GetPropertiesResponse> getGetPropertiesMethod() {
    io.grpc.MethodDescriptor<com.viam.component.base.v1.Base.GetPropertiesRequest, com.viam.component.base.v1.Base.GetPropertiesResponse> getGetPropertiesMethod;
    if ((getGetPropertiesMethod = BaseServiceGrpc.getGetPropertiesMethod) == null) {
      synchronized (BaseServiceGrpc.class) {
        if ((getGetPropertiesMethod = BaseServiceGrpc.getGetPropertiesMethod) == null) {
          BaseServiceGrpc.getGetPropertiesMethod = getGetPropertiesMethod =
              io.grpc.MethodDescriptor.<com.viam.component.base.v1.Base.GetPropertiesRequest, com.viam.component.base.v1.Base.GetPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.GetPropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.base.v1.Base.GetPropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPropertiesMethod;
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
  public interface AsyncService {

    /**
     * <pre>
     * MoveStraight moves a robot's base in a straight line by a given distance, expressed in millimeters
     * and a given speed, expressed in millimeters per second
     * This method blocks until completed or cancelled
     * </pre>
     */
    default void moveStraight(com.viam.component.base.v1.Base.MoveStraightRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.MoveStraightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveStraightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Spin spins a robot's base by an given angle, expressed in degrees, and a given
     * angular speed, expressed in degrees per second
     * This method blocks until completed or cancelled
     * </pre>
     */
    default void spin(com.viam.component.base.v1.Base.SpinRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.SpinResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpinMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetPower sets the linear and angular power of a base
     * -1 -&gt; 1 in terms of power for each direction
     * </pre>
     */
    default void setPower(com.viam.component.base.v1.Base.SetPowerRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.SetPowerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPowerMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetVelocity sets the linear and angular velocity of a base
     * </pre>
     */
    default void setVelocity(com.viam.component.base.v1.Base.SetVelocityRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.SetVelocityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetVelocityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's base
     * </pre>
     */
    default void stop(com.viam.component.base.v1.Base.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.StopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    default void isMoving(com.viam.component.base.v1.Base.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.IsMovingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsMovingMethod(), responseObserver);
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

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    default void getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGeometriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProperties returns the properties of a base in its current configuration
     * </pre>
     */
    default void getProperties(com.viam.component.base.v1.Base.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPropertiesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BaseService.
   */
  public static abstract class BaseServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BaseServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BaseService.
   */
  public static final class BaseServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BaseServiceStub> {
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
    public void moveStraight(com.viam.component.base.v1.Base.MoveStraightRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.MoveStraightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveStraightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Spin spins a robot's base by an given angle, expressed in degrees, and a given
     * angular speed, expressed in degrees per second
     * This method blocks until completed or cancelled
     * </pre>
     */
    public void spin(com.viam.component.base.v1.Base.SpinRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.SpinResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetPower sets the linear and angular power of a base
     * -1 -&gt; 1 in terms of power for each direction
     * </pre>
     */
    public void setPower(com.viam.component.base.v1.Base.SetPowerRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.SetPowerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPowerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetVelocity sets the linear and angular velocity of a base
     * </pre>
     */
    public void setVelocity(com.viam.component.base.v1.Base.SetVelocityRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.SetVelocityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetVelocityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's base
     * </pre>
     */
    public void stop(com.viam.component.base.v1.Base.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.StopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public void isMoving(com.viam.component.base.v1.Base.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.IsMovingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsMovingMethod(), getCallOptions()), request, responseObserver);
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

    /**
     * <pre>
     * GetProperties returns the properties of a base in its current configuration
     * </pre>
     */
    public void getProperties(com.viam.component.base.v1.Base.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BaseService.
   */
  public static final class BaseServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BaseServiceBlockingStub> {
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
    public com.viam.component.base.v1.Base.MoveStraightResponse moveStraight(com.viam.component.base.v1.Base.MoveStraightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveStraightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Spin spins a robot's base by an given angle, expressed in degrees, and a given
     * angular speed, expressed in degrees per second
     * This method blocks until completed or cancelled
     * </pre>
     */
    public com.viam.component.base.v1.Base.SpinResponse spin(com.viam.component.base.v1.Base.SpinRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpinMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetPower sets the linear and angular power of a base
     * -1 -&gt; 1 in terms of power for each direction
     * </pre>
     */
    public com.viam.component.base.v1.Base.SetPowerResponse setPower(com.viam.component.base.v1.Base.SetPowerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPowerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetVelocity sets the linear and angular velocity of a base
     * </pre>
     */
    public com.viam.component.base.v1.Base.SetVelocityResponse setVelocity(com.viam.component.base.v1.Base.SetVelocityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetVelocityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop stops a robot's base
     * </pre>
     */
    public com.viam.component.base.v1.Base.StopResponse stop(com.viam.component.base.v1.Base.StopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public com.viam.component.base.v1.Base.IsMovingResponse isMoving(com.viam.component.base.v1.Base.IsMovingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsMovingMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    public com.viam.common.v1.Common.GetGeometriesResponse getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGeometriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProperties returns the properties of a base in its current configuration
     * </pre>
     */
    public com.viam.component.base.v1.Base.GetPropertiesResponse getProperties(com.viam.component.base.v1.Base.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPropertiesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BaseService.
   */
  public static final class BaseServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BaseServiceFutureStub> {
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
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.base.v1.Base.MoveStraightResponse> moveStraight(
        com.viam.component.base.v1.Base.MoveStraightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveStraightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Spin spins a robot's base by an given angle, expressed in degrees, and a given
     * angular speed, expressed in degrees per second
     * This method blocks until completed or cancelled
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.base.v1.Base.SpinResponse> spin(
        com.viam.component.base.v1.Base.SpinRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpinMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetPower sets the linear and angular power of a base
     * -1 -&gt; 1 in terms of power for each direction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.base.v1.Base.SetPowerResponse> setPower(
        com.viam.component.base.v1.Base.SetPowerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPowerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetVelocity sets the linear and angular velocity of a base
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.base.v1.Base.SetVelocityResponse> setVelocity(
        com.viam.component.base.v1.Base.SetVelocityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetVelocityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop stops a robot's base
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.base.v1.Base.StopResponse> stop(
        com.viam.component.base.v1.Base.StopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.base.v1.Base.IsMovingResponse> isMoving(
        com.viam.component.base.v1.Base.IsMovingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsMovingMethod(), getCallOptions()), request);
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

    /**
     * <pre>
     * GetProperties returns the properties of a base in its current configuration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.base.v1.Base.GetPropertiesResponse> getProperties(
        com.viam.component.base.v1.Base.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MOVE_STRAIGHT = 0;
  private static final int METHODID_SPIN = 1;
  private static final int METHODID_SET_POWER = 2;
  private static final int METHODID_SET_VELOCITY = 3;
  private static final int METHODID_STOP = 4;
  private static final int METHODID_IS_MOVING = 5;
  private static final int METHODID_DO_COMMAND = 6;
  private static final int METHODID_GET_GEOMETRIES = 7;
  private static final int METHODID_GET_PROPERTIES = 8;

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
        case METHODID_MOVE_STRAIGHT:
          serviceImpl.moveStraight((com.viam.component.base.v1.Base.MoveStraightRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.MoveStraightResponse>) responseObserver);
          break;
        case METHODID_SPIN:
          serviceImpl.spin((com.viam.component.base.v1.Base.SpinRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.SpinResponse>) responseObserver);
          break;
        case METHODID_SET_POWER:
          serviceImpl.setPower((com.viam.component.base.v1.Base.SetPowerRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.SetPowerResponse>) responseObserver);
          break;
        case METHODID_SET_VELOCITY:
          serviceImpl.setVelocity((com.viam.component.base.v1.Base.SetVelocityRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.SetVelocityResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((com.viam.component.base.v1.Base.StopRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.StopResponse>) responseObserver);
          break;
        case METHODID_IS_MOVING:
          serviceImpl.isMoving((com.viam.component.base.v1.Base.IsMovingRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.IsMovingResponse>) responseObserver);
          break;
        case METHODID_DO_COMMAND:
          serviceImpl.doCommand((com.viam.common.v1.Common.DoCommandRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse>) responseObserver);
          break;
        case METHODID_GET_GEOMETRIES:
          serviceImpl.getGeometries((com.viam.common.v1.Common.GetGeometriesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse>) responseObserver);
          break;
        case METHODID_GET_PROPERTIES:
          serviceImpl.getProperties((com.viam.component.base.v1.Base.GetPropertiesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.base.v1.Base.GetPropertiesResponse>) responseObserver);
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
          getMoveStraightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.base.v1.Base.MoveStraightRequest,
              com.viam.component.base.v1.Base.MoveStraightResponse>(
                service, METHODID_MOVE_STRAIGHT)))
        .addMethod(
          getSpinMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.base.v1.Base.SpinRequest,
              com.viam.component.base.v1.Base.SpinResponse>(
                service, METHODID_SPIN)))
        .addMethod(
          getSetPowerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.base.v1.Base.SetPowerRequest,
              com.viam.component.base.v1.Base.SetPowerResponse>(
                service, METHODID_SET_POWER)))
        .addMethod(
          getSetVelocityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.base.v1.Base.SetVelocityRequest,
              com.viam.component.base.v1.Base.SetVelocityResponse>(
                service, METHODID_SET_VELOCITY)))
        .addMethod(
          getStopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.base.v1.Base.StopRequest,
              com.viam.component.base.v1.Base.StopResponse>(
                service, METHODID_STOP)))
        .addMethod(
          getIsMovingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.base.v1.Base.IsMovingRequest,
              com.viam.component.base.v1.Base.IsMovingResponse>(
                service, METHODID_IS_MOVING)))
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
        .addMethod(
          getGetPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.base.v1.Base.GetPropertiesRequest,
              com.viam.component.base.v1.Base.GetPropertiesResponse>(
                service, METHODID_GET_PROPERTIES)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getMoveStraightMethod())
              .addMethod(getSpinMethod())
              .addMethod(getSetPowerMethod())
              .addMethod(getSetVelocityMethod())
              .addMethod(getStopMethod())
              .addMethod(getIsMovingMethod())
              .addMethod(getDoCommandMethod())
              .addMethod(getGetGeometriesMethod())
              .addMethod(getGetPropertiesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
