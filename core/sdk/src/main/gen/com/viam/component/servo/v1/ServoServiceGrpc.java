package com.viam.component.servo.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A ServoService maintains all servos associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: component/servo/v1/servo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServoServiceGrpc {

  private ServoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.servo.v1.ServoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.servo.v1.Servo.MoveRequest,
      com.viam.component.servo.v1.Servo.MoveResponse> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = com.viam.component.servo.v1.Servo.MoveRequest.class,
      responseType = com.viam.component.servo.v1.Servo.MoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.servo.v1.Servo.MoveRequest,
      com.viam.component.servo.v1.Servo.MoveResponse> getMoveMethod() {
    io.grpc.MethodDescriptor<com.viam.component.servo.v1.Servo.MoveRequest, com.viam.component.servo.v1.Servo.MoveResponse> getMoveMethod;
    if ((getMoveMethod = ServoServiceGrpc.getMoveMethod) == null) {
      synchronized (ServoServiceGrpc.class) {
        if ((getMoveMethod = ServoServiceGrpc.getMoveMethod) == null) {
          ServoServiceGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<com.viam.component.servo.v1.Servo.MoveRequest, com.viam.component.servo.v1.Servo.MoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.servo.v1.Servo.MoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.servo.v1.Servo.MoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServoServiceMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.servo.v1.Servo.GetPositionRequest,
      com.viam.component.servo.v1.Servo.GetPositionResponse> getGetPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPosition",
      requestType = com.viam.component.servo.v1.Servo.GetPositionRequest.class,
      responseType = com.viam.component.servo.v1.Servo.GetPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.servo.v1.Servo.GetPositionRequest,
      com.viam.component.servo.v1.Servo.GetPositionResponse> getGetPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.component.servo.v1.Servo.GetPositionRequest, com.viam.component.servo.v1.Servo.GetPositionResponse> getGetPositionMethod;
    if ((getGetPositionMethod = ServoServiceGrpc.getGetPositionMethod) == null) {
      synchronized (ServoServiceGrpc.class) {
        if ((getGetPositionMethod = ServoServiceGrpc.getGetPositionMethod) == null) {
          ServoServiceGrpc.getGetPositionMethod = getGetPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.component.servo.v1.Servo.GetPositionRequest, com.viam.component.servo.v1.Servo.GetPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.servo.v1.Servo.GetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.servo.v1.Servo.GetPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServoServiceMethodDescriptorSupplier("GetPosition"))
              .build();
        }
      }
    }
    return getGetPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.servo.v1.Servo.StopRequest,
      com.viam.component.servo.v1.Servo.StopResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = com.viam.component.servo.v1.Servo.StopRequest.class,
      responseType = com.viam.component.servo.v1.Servo.StopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.servo.v1.Servo.StopRequest,
      com.viam.component.servo.v1.Servo.StopResponse> getStopMethod() {
    io.grpc.MethodDescriptor<com.viam.component.servo.v1.Servo.StopRequest, com.viam.component.servo.v1.Servo.StopResponse> getStopMethod;
    if ((getStopMethod = ServoServiceGrpc.getStopMethod) == null) {
      synchronized (ServoServiceGrpc.class) {
        if ((getStopMethod = ServoServiceGrpc.getStopMethod) == null) {
          ServoServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<com.viam.component.servo.v1.Servo.StopRequest, com.viam.component.servo.v1.Servo.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.servo.v1.Servo.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.servo.v1.Servo.StopResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServoServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.servo.v1.Servo.IsMovingRequest,
      com.viam.component.servo.v1.Servo.IsMovingResponse> getIsMovingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsMoving",
      requestType = com.viam.component.servo.v1.Servo.IsMovingRequest.class,
      responseType = com.viam.component.servo.v1.Servo.IsMovingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.servo.v1.Servo.IsMovingRequest,
      com.viam.component.servo.v1.Servo.IsMovingResponse> getIsMovingMethod() {
    io.grpc.MethodDescriptor<com.viam.component.servo.v1.Servo.IsMovingRequest, com.viam.component.servo.v1.Servo.IsMovingResponse> getIsMovingMethod;
    if ((getIsMovingMethod = ServoServiceGrpc.getIsMovingMethod) == null) {
      synchronized (ServoServiceGrpc.class) {
        if ((getIsMovingMethod = ServoServiceGrpc.getIsMovingMethod) == null) {
          ServoServiceGrpc.getIsMovingMethod = getIsMovingMethod =
              io.grpc.MethodDescriptor.<com.viam.component.servo.v1.Servo.IsMovingRequest, com.viam.component.servo.v1.Servo.IsMovingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsMoving"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.servo.v1.Servo.IsMovingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.servo.v1.Servo.IsMovingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServoServiceMethodDescriptorSupplier("IsMoving"))
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
    if ((getDoCommandMethod = ServoServiceGrpc.getDoCommandMethod) == null) {
      synchronized (ServoServiceGrpc.class) {
        if ((getDoCommandMethod = ServoServiceGrpc.getDoCommandMethod) == null) {
          ServoServiceGrpc.getDoCommandMethod = getDoCommandMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.DoCommandRequest, com.viam.common.v1.Common.DoCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServoServiceMethodDescriptorSupplier("DoCommand"))
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
    if ((getGetGeometriesMethod = ServoServiceGrpc.getGetGeometriesMethod) == null) {
      synchronized (ServoServiceGrpc.class) {
        if ((getGetGeometriesMethod = ServoServiceGrpc.getGetGeometriesMethod) == null) {
          ServoServiceGrpc.getGetGeometriesMethod = getGetGeometriesMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.GetGeometriesRequest, com.viam.common.v1.Common.GetGeometriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGeometries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.GetGeometriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.GetGeometriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServoServiceMethodDescriptorSupplier("GetGeometries"))
              .build();
        }
      }
    }
    return getGetGeometriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServoServiceStub>() {
        @java.lang.Override
        public ServoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServoServiceStub(channel, callOptions);
        }
      };
    return ServoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServoServiceBlockingStub>() {
        @java.lang.Override
        public ServoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServoServiceBlockingStub(channel, callOptions);
        }
      };
    return ServoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServoServiceFutureStub>() {
        @java.lang.Override
        public ServoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServoServiceFutureStub(channel, callOptions);
        }
      };
    return ServoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A ServoService maintains all servos associated with a robot
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Move requests the servo of the underlying robot to move.
     * This will block until done or a new operation cancels this one
     * </pre>
     */
    default void move(com.viam.component.servo.v1.Servo.MoveRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.MoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPosition returns the current set angle (degrees) of the servo of the underlying robot.
     * </pre>
     */
    default void getPosition(com.viam.component.servo.v1.Servo.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.GetPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's servo
     * </pre>
     */
    default void stop(com.viam.component.servo.v1.Servo.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.StopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    default void isMoving(com.viam.component.servo.v1.Servo.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.IsMovingResponse> responseObserver) {
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
  }

  /**
   * Base class for the server implementation of the service ServoService.
   * <pre>
   * A ServoService maintains all servos associated with a robot
   * </pre>
   */
  public static abstract class ServoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServoService.
   * <pre>
   * A ServoService maintains all servos associated with a robot
   * </pre>
   */
  public static final class ServoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServoServiceStub> {
    private ServoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Move requests the servo of the underlying robot to move.
     * This will block until done or a new operation cancels this one
     * </pre>
     */
    public void move(com.viam.component.servo.v1.Servo.MoveRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.MoveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPosition returns the current set angle (degrees) of the servo of the underlying robot.
     * </pre>
     */
    public void getPosition(com.viam.component.servo.v1.Servo.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.GetPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's servo
     * </pre>
     */
    public void stop(com.viam.component.servo.v1.Servo.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.StopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public void isMoving(com.viam.component.servo.v1.Servo.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.IsMovingResponse> responseObserver) {
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
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServoService.
   * <pre>
   * A ServoService maintains all servos associated with a robot
   * </pre>
   */
  public static final class ServoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServoServiceBlockingStub> {
    private ServoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Move requests the servo of the underlying robot to move.
     * This will block until done or a new operation cancels this one
     * </pre>
     */
    public com.viam.component.servo.v1.Servo.MoveResponse move(com.viam.component.servo.v1.Servo.MoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPosition returns the current set angle (degrees) of the servo of the underlying robot.
     * </pre>
     */
    public com.viam.component.servo.v1.Servo.GetPositionResponse getPosition(com.viam.component.servo.v1.Servo.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop stops a robot's servo
     * </pre>
     */
    public com.viam.component.servo.v1.Servo.StopResponse stop(com.viam.component.servo.v1.Servo.StopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public com.viam.component.servo.v1.Servo.IsMovingResponse isMoving(com.viam.component.servo.v1.Servo.IsMovingRequest request) {
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
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServoService.
   * <pre>
   * A ServoService maintains all servos associated with a robot
   * </pre>
   */
  public static final class ServoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServoServiceFutureStub> {
    private ServoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Move requests the servo of the underlying robot to move.
     * This will block until done or a new operation cancels this one
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.servo.v1.Servo.MoveResponse> move(
        com.viam.component.servo.v1.Servo.MoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPosition returns the current set angle (degrees) of the servo of the underlying robot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.servo.v1.Servo.GetPositionResponse> getPosition(
        com.viam.component.servo.v1.Servo.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop stops a robot's servo
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.servo.v1.Servo.StopResponse> stop(
        com.viam.component.servo.v1.Servo.StopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.servo.v1.Servo.IsMovingResponse> isMoving(
        com.viam.component.servo.v1.Servo.IsMovingRequest request) {
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
  }

  private static final int METHODID_MOVE = 0;
  private static final int METHODID_GET_POSITION = 1;
  private static final int METHODID_STOP = 2;
  private static final int METHODID_IS_MOVING = 3;
  private static final int METHODID_DO_COMMAND = 4;
  private static final int METHODID_GET_GEOMETRIES = 5;

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
        case METHODID_MOVE:
          serviceImpl.move((com.viam.component.servo.v1.Servo.MoveRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.MoveResponse>) responseObserver);
          break;
        case METHODID_GET_POSITION:
          serviceImpl.getPosition((com.viam.component.servo.v1.Servo.GetPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.GetPositionResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((com.viam.component.servo.v1.Servo.StopRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.StopResponse>) responseObserver);
          break;
        case METHODID_IS_MOVING:
          serviceImpl.isMoving((com.viam.component.servo.v1.Servo.IsMovingRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.IsMovingResponse>) responseObserver);
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
          getMoveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.servo.v1.Servo.MoveRequest,
              com.viam.component.servo.v1.Servo.MoveResponse>(
                service, METHODID_MOVE)))
        .addMethod(
          getGetPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.servo.v1.Servo.GetPositionRequest,
              com.viam.component.servo.v1.Servo.GetPositionResponse>(
                service, METHODID_GET_POSITION)))
        .addMethod(
          getStopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.servo.v1.Servo.StopRequest,
              com.viam.component.servo.v1.Servo.StopResponse>(
                service, METHODID_STOP)))
        .addMethod(
          getIsMovingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.servo.v1.Servo.IsMovingRequest,
              com.viam.component.servo.v1.Servo.IsMovingResponse>(
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
        .build();
  }

  private static abstract class ServoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.component.servo.v1.Servo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServoService");
    }
  }

  private static final class ServoServiceFileDescriptorSupplier
      extends ServoServiceBaseDescriptorSupplier {
    ServoServiceFileDescriptorSupplier() {}
  }

  private static final class ServoServiceMethodDescriptorSupplier
      extends ServoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServoServiceFileDescriptorSupplier())
              .addMethod(getMoveMethod())
              .addMethod(getGetPositionMethod())
              .addMethod(getStopMethod())
              .addMethod(getIsMovingMethod())
              .addMethod(getDoCommandMethod())
              .addMethod(getGetGeometriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
