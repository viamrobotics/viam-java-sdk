package com.viam.component.servo.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A ServoService maintains all servos associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: component/servo/v1/servo.proto")
public final class ServoServiceGrpc {

  private ServoServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.component.servo.v1.ServoService";

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
  public static abstract class ServoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Move requests the servo of the underlying robot to move.
     * This will block until done or a new operation cancels this one
     * </pre>
     */
    public void move(com.viam.component.servo.v1.Servo.MoveRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.MoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPosition returns the current set angle (degrees) of the servo of the underlying robot.
     * </pre>
     */
    public void getPosition(com.viam.component.servo.v1.Servo.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.GetPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's servo
     * </pre>
     */
    public void stop(com.viam.component.servo.v1.Servo.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.StopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public void isMoving(com.viam.component.servo.v1.Servo.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.servo.v1.Servo.IsMovingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsMovingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.servo.v1.Servo.MoveRequest,
                com.viam.component.servo.v1.Servo.MoveResponse>(
                  this, METHODID_MOVE)))
          .addMethod(
            getGetPositionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.servo.v1.Servo.GetPositionRequest,
                com.viam.component.servo.v1.Servo.GetPositionResponse>(
                  this, METHODID_GET_POSITION)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.servo.v1.Servo.StopRequest,
                com.viam.component.servo.v1.Servo.StopResponse>(
                  this, METHODID_STOP)))
          .addMethod(
            getIsMovingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.servo.v1.Servo.IsMovingRequest,
                com.viam.component.servo.v1.Servo.IsMovingResponse>(
                  this, METHODID_IS_MOVING)))
          .build();
    }
  }

  /**
   * <pre>
   * A ServoService maintains all servos associated with a robot
   * </pre>
   */
  public static final class ServoServiceStub extends io.grpc.stub.AbstractAsyncStub<ServoServiceStub> {
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
  }

  /**
   * <pre>
   * A ServoService maintains all servos associated with a robot
   * </pre>
   */
  public static final class ServoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServoServiceBlockingStub> {
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
  }

  /**
   * <pre>
   * A ServoService maintains all servos associated with a robot
   * </pre>
   */
  public static final class ServoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ServoServiceFutureStub> {
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
  }

  private static final int METHODID_MOVE = 0;
  private static final int METHODID_GET_POSITION = 1;
  private static final int METHODID_STOP = 2;
  private static final int METHODID_IS_MOVING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServoServiceImplBase serviceImpl, int methodId) {
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
    private final String methodName;

    ServoServiceMethodDescriptorSupplier(String methodName) {
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
              .build();
        }
      }
    }
    return result;
  }
}
