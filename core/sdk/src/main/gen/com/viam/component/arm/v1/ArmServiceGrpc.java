package com.viam.component.arm.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An ArmService services all arms associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: component/arm/v1/arm.proto")
public final class ArmServiceGrpc {

  private ArmServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.component.arm.v1.ArmService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.GetEndPositionRequest,
      com.viam.component.arm.v1.Arm.GetEndPositionResponse> getGetEndPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEndPosition",
      requestType = com.viam.component.arm.v1.Arm.GetEndPositionRequest.class,
      responseType = com.viam.component.arm.v1.Arm.GetEndPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.GetEndPositionRequest,
      com.viam.component.arm.v1.Arm.GetEndPositionResponse> getGetEndPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.GetEndPositionRequest, com.viam.component.arm.v1.Arm.GetEndPositionResponse> getGetEndPositionMethod;
    if ((getGetEndPositionMethod = ArmServiceGrpc.getGetEndPositionMethod) == null) {
      synchronized (ArmServiceGrpc.class) {
        if ((getGetEndPositionMethod = ArmServiceGrpc.getGetEndPositionMethod) == null) {
          ArmServiceGrpc.getGetEndPositionMethod = getGetEndPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.component.arm.v1.Arm.GetEndPositionRequest, com.viam.component.arm.v1.Arm.GetEndPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEndPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.arm.v1.Arm.GetEndPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.arm.v1.Arm.GetEndPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArmServiceMethodDescriptorSupplier("GetEndPosition"))
              .build();
        }
      }
    }
    return getGetEndPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.MoveToPositionRequest,
      com.viam.component.arm.v1.Arm.MoveToPositionResponse> getMoveToPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveToPosition",
      requestType = com.viam.component.arm.v1.Arm.MoveToPositionRequest.class,
      responseType = com.viam.component.arm.v1.Arm.MoveToPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.MoveToPositionRequest,
      com.viam.component.arm.v1.Arm.MoveToPositionResponse> getMoveToPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.MoveToPositionRequest, com.viam.component.arm.v1.Arm.MoveToPositionResponse> getMoveToPositionMethod;
    if ((getMoveToPositionMethod = ArmServiceGrpc.getMoveToPositionMethod) == null) {
      synchronized (ArmServiceGrpc.class) {
        if ((getMoveToPositionMethod = ArmServiceGrpc.getMoveToPositionMethod) == null) {
          ArmServiceGrpc.getMoveToPositionMethod = getMoveToPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.component.arm.v1.Arm.MoveToPositionRequest, com.viam.component.arm.v1.Arm.MoveToPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveToPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.arm.v1.Arm.MoveToPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.arm.v1.Arm.MoveToPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArmServiceMethodDescriptorSupplier("MoveToPosition"))
              .build();
        }
      }
    }
    return getMoveToPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.GetJointPositionsRequest,
      com.viam.component.arm.v1.Arm.GetJointPositionsResponse> getGetJointPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJointPositions",
      requestType = com.viam.component.arm.v1.Arm.GetJointPositionsRequest.class,
      responseType = com.viam.component.arm.v1.Arm.GetJointPositionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.GetJointPositionsRequest,
      com.viam.component.arm.v1.Arm.GetJointPositionsResponse> getGetJointPositionsMethod() {
    io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.GetJointPositionsRequest, com.viam.component.arm.v1.Arm.GetJointPositionsResponse> getGetJointPositionsMethod;
    if ((getGetJointPositionsMethod = ArmServiceGrpc.getGetJointPositionsMethod) == null) {
      synchronized (ArmServiceGrpc.class) {
        if ((getGetJointPositionsMethod = ArmServiceGrpc.getGetJointPositionsMethod) == null) {
          ArmServiceGrpc.getGetJointPositionsMethod = getGetJointPositionsMethod =
              io.grpc.MethodDescriptor.<com.viam.component.arm.v1.Arm.GetJointPositionsRequest, com.viam.component.arm.v1.Arm.GetJointPositionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJointPositions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.arm.v1.Arm.GetJointPositionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.arm.v1.Arm.GetJointPositionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArmServiceMethodDescriptorSupplier("GetJointPositions"))
              .build();
        }
      }
    }
    return getGetJointPositionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.MoveToJointPositionsRequest,
      com.viam.component.arm.v1.Arm.MoveToJointPositionsResponse> getMoveToJointPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveToJointPositions",
      requestType = com.viam.component.arm.v1.Arm.MoveToJointPositionsRequest.class,
      responseType = com.viam.component.arm.v1.Arm.MoveToJointPositionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.MoveToJointPositionsRequest,
      com.viam.component.arm.v1.Arm.MoveToJointPositionsResponse> getMoveToJointPositionsMethod() {
    io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.MoveToJointPositionsRequest, com.viam.component.arm.v1.Arm.MoveToJointPositionsResponse> getMoveToJointPositionsMethod;
    if ((getMoveToJointPositionsMethod = ArmServiceGrpc.getMoveToJointPositionsMethod) == null) {
      synchronized (ArmServiceGrpc.class) {
        if ((getMoveToJointPositionsMethod = ArmServiceGrpc.getMoveToJointPositionsMethod) == null) {
          ArmServiceGrpc.getMoveToJointPositionsMethod = getMoveToJointPositionsMethod =
              io.grpc.MethodDescriptor.<com.viam.component.arm.v1.Arm.MoveToJointPositionsRequest, com.viam.component.arm.v1.Arm.MoveToJointPositionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveToJointPositions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.arm.v1.Arm.MoveToJointPositionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.arm.v1.Arm.MoveToJointPositionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArmServiceMethodDescriptorSupplier("MoveToJointPositions"))
              .build();
        }
      }
    }
    return getMoveToJointPositionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.StopRequest,
      com.viam.component.arm.v1.Arm.StopResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = com.viam.component.arm.v1.Arm.StopRequest.class,
      responseType = com.viam.component.arm.v1.Arm.StopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.StopRequest,
      com.viam.component.arm.v1.Arm.StopResponse> getStopMethod() {
    io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.StopRequest, com.viam.component.arm.v1.Arm.StopResponse> getStopMethod;
    if ((getStopMethod = ArmServiceGrpc.getStopMethod) == null) {
      synchronized (ArmServiceGrpc.class) {
        if ((getStopMethod = ArmServiceGrpc.getStopMethod) == null) {
          ArmServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<com.viam.component.arm.v1.Arm.StopRequest, com.viam.component.arm.v1.Arm.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.arm.v1.Arm.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.arm.v1.Arm.StopResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArmServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.IsMovingRequest,
      com.viam.component.arm.v1.Arm.IsMovingResponse> getIsMovingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsMoving",
      requestType = com.viam.component.arm.v1.Arm.IsMovingRequest.class,
      responseType = com.viam.component.arm.v1.Arm.IsMovingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.IsMovingRequest,
      com.viam.component.arm.v1.Arm.IsMovingResponse> getIsMovingMethod() {
    io.grpc.MethodDescriptor<com.viam.component.arm.v1.Arm.IsMovingRequest, com.viam.component.arm.v1.Arm.IsMovingResponse> getIsMovingMethod;
    if ((getIsMovingMethod = ArmServiceGrpc.getIsMovingMethod) == null) {
      synchronized (ArmServiceGrpc.class) {
        if ((getIsMovingMethod = ArmServiceGrpc.getIsMovingMethod) == null) {
          ArmServiceGrpc.getIsMovingMethod = getIsMovingMethod =
              io.grpc.MethodDescriptor.<com.viam.component.arm.v1.Arm.IsMovingRequest, com.viam.component.arm.v1.Arm.IsMovingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsMoving"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.arm.v1.Arm.IsMovingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.arm.v1.Arm.IsMovingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArmServiceMethodDescriptorSupplier("IsMoving"))
              .build();
        }
      }
    }
    return getIsMovingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArmServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArmServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArmServiceStub>() {
        @java.lang.Override
        public ArmServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArmServiceStub(channel, callOptions);
        }
      };
    return ArmServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArmServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArmServiceBlockingStub>() {
        @java.lang.Override
        public ArmServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArmServiceBlockingStub(channel, callOptions);
        }
      };
    return ArmServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArmServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArmServiceFutureStub>() {
        @java.lang.Override
        public ArmServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArmServiceFutureStub(channel, callOptions);
        }
      };
    return ArmServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An ArmService services all arms associated with a robot
   * </pre>
   */
  public static abstract class ArmServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetEndPosition gets the current position the end of the robot's arm expressed as X,Y,Z,ox,oy,oz,theta
     * </pre>
     */
    public void getEndPosition(com.viam.component.arm.v1.Arm.GetEndPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.GetEndPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEndPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * MoveToPosition moves the mount point of the robot's end effector to the requested position.
     * This will block until done or a new operation cancels this one
     * </pre>
     */
    public void moveToPosition(com.viam.component.arm.v1.Arm.MoveToPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.MoveToPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveToPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetJointPositions lists the joint positions (in degrees) of every joint on a robot
     * </pre>
     */
    public void getJointPositions(com.viam.component.arm.v1.Arm.GetJointPositionsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.GetJointPositionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJointPositionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * MoveToJointPositions moves every joint on a robot's arm to specified angles which are expressed in degrees
     * This will block until done or a new operation cancels this one
     * </pre>
     */
    public void moveToJointPositions(com.viam.component.arm.v1.Arm.MoveToJointPositionsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.MoveToJointPositionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveToJointPositionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's arm
     * </pre>
     */
    public void stop(com.viam.component.arm.v1.Arm.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.StopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public void isMoving(com.viam.component.arm.v1.Arm.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.IsMovingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsMovingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEndPositionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.arm.v1.Arm.GetEndPositionRequest,
                com.viam.component.arm.v1.Arm.GetEndPositionResponse>(
                  this, METHODID_GET_END_POSITION)))
          .addMethod(
            getMoveToPositionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.arm.v1.Arm.MoveToPositionRequest,
                com.viam.component.arm.v1.Arm.MoveToPositionResponse>(
                  this, METHODID_MOVE_TO_POSITION)))
          .addMethod(
            getGetJointPositionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.arm.v1.Arm.GetJointPositionsRequest,
                com.viam.component.arm.v1.Arm.GetJointPositionsResponse>(
                  this, METHODID_GET_JOINT_POSITIONS)))
          .addMethod(
            getMoveToJointPositionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.arm.v1.Arm.MoveToJointPositionsRequest,
                com.viam.component.arm.v1.Arm.MoveToJointPositionsResponse>(
                  this, METHODID_MOVE_TO_JOINT_POSITIONS)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.arm.v1.Arm.StopRequest,
                com.viam.component.arm.v1.Arm.StopResponse>(
                  this, METHODID_STOP)))
          .addMethod(
            getIsMovingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.arm.v1.Arm.IsMovingRequest,
                com.viam.component.arm.v1.Arm.IsMovingResponse>(
                  this, METHODID_IS_MOVING)))
          .build();
    }
  }

  /**
   * <pre>
   * An ArmService services all arms associated with a robot
   * </pre>
   */
  public static final class ArmServiceStub extends io.grpc.stub.AbstractAsyncStub<ArmServiceStub> {
    private ArmServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArmServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArmServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetEndPosition gets the current position the end of the robot's arm expressed as X,Y,Z,ox,oy,oz,theta
     * </pre>
     */
    public void getEndPosition(com.viam.component.arm.v1.Arm.GetEndPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.GetEndPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEndPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MoveToPosition moves the mount point of the robot's end effector to the requested position.
     * This will block until done or a new operation cancels this one
     * </pre>
     */
    public void moveToPosition(com.viam.component.arm.v1.Arm.MoveToPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.MoveToPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveToPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetJointPositions lists the joint positions (in degrees) of every joint on a robot
     * </pre>
     */
    public void getJointPositions(com.viam.component.arm.v1.Arm.GetJointPositionsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.GetJointPositionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJointPositionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MoveToJointPositions moves every joint on a robot's arm to specified angles which are expressed in degrees
     * This will block until done or a new operation cancels this one
     * </pre>
     */
    public void moveToJointPositions(com.viam.component.arm.v1.Arm.MoveToJointPositionsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.MoveToJointPositionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveToJointPositionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's arm
     * </pre>
     */
    public void stop(com.viam.component.arm.v1.Arm.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.StopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public void isMoving(com.viam.component.arm.v1.Arm.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.IsMovingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsMovingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * An ArmService services all arms associated with a robot
   * </pre>
   */
  public static final class ArmServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ArmServiceBlockingStub> {
    private ArmServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArmServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArmServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetEndPosition gets the current position the end of the robot's arm expressed as X,Y,Z,ox,oy,oz,theta
     * </pre>
     */
    public com.viam.component.arm.v1.Arm.GetEndPositionResponse getEndPosition(com.viam.component.arm.v1.Arm.GetEndPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEndPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MoveToPosition moves the mount point of the robot's end effector to the requested position.
     * This will block until done or a new operation cancels this one
     * </pre>
     */
    public com.viam.component.arm.v1.Arm.MoveToPositionResponse moveToPosition(com.viam.component.arm.v1.Arm.MoveToPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveToPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetJointPositions lists the joint positions (in degrees) of every joint on a robot
     * </pre>
     */
    public com.viam.component.arm.v1.Arm.GetJointPositionsResponse getJointPositions(com.viam.component.arm.v1.Arm.GetJointPositionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJointPositionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MoveToJointPositions moves every joint on a robot's arm to specified angles which are expressed in degrees
     * This will block until done or a new operation cancels this one
     * </pre>
     */
    public com.viam.component.arm.v1.Arm.MoveToJointPositionsResponse moveToJointPositions(com.viam.component.arm.v1.Arm.MoveToJointPositionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveToJointPositionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop stops a robot's arm
     * </pre>
     */
    public com.viam.component.arm.v1.Arm.StopResponse stop(com.viam.component.arm.v1.Arm.StopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public com.viam.component.arm.v1.Arm.IsMovingResponse isMoving(com.viam.component.arm.v1.Arm.IsMovingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsMovingMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * An ArmService services all arms associated with a robot
   * </pre>
   */
  public static final class ArmServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ArmServiceFutureStub> {
    private ArmServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArmServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArmServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetEndPosition gets the current position the end of the robot's arm expressed as X,Y,Z,ox,oy,oz,theta
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.arm.v1.Arm.GetEndPositionResponse> getEndPosition(
        com.viam.component.arm.v1.Arm.GetEndPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEndPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MoveToPosition moves the mount point of the robot's end effector to the requested position.
     * This will block until done or a new operation cancels this one
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.arm.v1.Arm.MoveToPositionResponse> moveToPosition(
        com.viam.component.arm.v1.Arm.MoveToPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveToPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetJointPositions lists the joint positions (in degrees) of every joint on a robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.arm.v1.Arm.GetJointPositionsResponse> getJointPositions(
        com.viam.component.arm.v1.Arm.GetJointPositionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJointPositionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MoveToJointPositions moves every joint on a robot's arm to specified angles which are expressed in degrees
     * This will block until done or a new operation cancels this one
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.arm.v1.Arm.MoveToJointPositionsResponse> moveToJointPositions(
        com.viam.component.arm.v1.Arm.MoveToJointPositionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveToJointPositionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop stops a robot's arm
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.arm.v1.Arm.StopResponse> stop(
        com.viam.component.arm.v1.Arm.StopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.arm.v1.Arm.IsMovingResponse> isMoving(
        com.viam.component.arm.v1.Arm.IsMovingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsMovingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_END_POSITION = 0;
  private static final int METHODID_MOVE_TO_POSITION = 1;
  private static final int METHODID_GET_JOINT_POSITIONS = 2;
  private static final int METHODID_MOVE_TO_JOINT_POSITIONS = 3;
  private static final int METHODID_STOP = 4;
  private static final int METHODID_IS_MOVING = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArmServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ArmServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_END_POSITION:
          serviceImpl.getEndPosition((com.viam.component.arm.v1.Arm.GetEndPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.GetEndPositionResponse>) responseObserver);
          break;
        case METHODID_MOVE_TO_POSITION:
          serviceImpl.moveToPosition((com.viam.component.arm.v1.Arm.MoveToPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.MoveToPositionResponse>) responseObserver);
          break;
        case METHODID_GET_JOINT_POSITIONS:
          serviceImpl.getJointPositions((com.viam.component.arm.v1.Arm.GetJointPositionsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.GetJointPositionsResponse>) responseObserver);
          break;
        case METHODID_MOVE_TO_JOINT_POSITIONS:
          serviceImpl.moveToJointPositions((com.viam.component.arm.v1.Arm.MoveToJointPositionsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.MoveToJointPositionsResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((com.viam.component.arm.v1.Arm.StopRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.StopResponse>) responseObserver);
          break;
        case METHODID_IS_MOVING:
          serviceImpl.isMoving((com.viam.component.arm.v1.Arm.IsMovingRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.arm.v1.Arm.IsMovingResponse>) responseObserver);
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

  private static abstract class ArmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ArmServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.component.arm.v1.Arm.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ArmService");
    }
  }

  private static final class ArmServiceFileDescriptorSupplier
      extends ArmServiceBaseDescriptorSupplier {
    ArmServiceFileDescriptorSupplier() {}
  }

  private static final class ArmServiceMethodDescriptorSupplier
      extends ArmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ArmServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ArmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ArmServiceFileDescriptorSupplier())
              .addMethod(getGetEndPositionMethod())
              .addMethod(getMoveToPositionMethod())
              .addMethod(getGetJointPositionsMethod())
              .addMethod(getMoveToJointPositionsMethod())
              .addMethod(getStopMethod())
              .addMethod(getIsMovingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
