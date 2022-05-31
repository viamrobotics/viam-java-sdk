package com.viam.rdk.proto.api.robot.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A RobotService encompasses all functionality of some robot comprised of parts, local and remote.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/api/robot/v1/robot.proto")
public final class RobotServiceGrpc {

  private RobotServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.api.robot.v1.RobotService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsRequest,
      com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsResponse> getGetOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOperations",
      requestType = com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsRequest.class,
      responseType = com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsRequest,
      com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsResponse> getGetOperationsMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsRequest, com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsResponse> getGetOperationsMethod;
    if ((getGetOperationsMethod = RobotServiceGrpc.getGetOperationsMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getGetOperationsMethod = RobotServiceGrpc.getGetOperationsMethod) == null) {
          RobotServiceGrpc.getGetOperationsMethod = getGetOperationsMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsRequest, com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("GetOperations"))
              .build();
        }
      }
    }
    return getGetOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesRequest,
      com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesResponse> getResourceNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResourceNames",
      requestType = com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesRequest.class,
      responseType = com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesRequest,
      com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesResponse> getResourceNamesMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesRequest, com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesResponse> getResourceNamesMethod;
    if ((getResourceNamesMethod = RobotServiceGrpc.getResourceNamesMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getResourceNamesMethod = RobotServiceGrpc.getResourceNamesMethod) == null) {
          RobotServiceGrpc.getResourceNamesMethod = getResourceNamesMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesRequest, com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResourceNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("ResourceNames"))
              .build();
        }
      }
    }
    return getResourceNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationRequest,
      com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationResponse> getCancelOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOperation",
      requestType = com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationRequest.class,
      responseType = com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationRequest,
      com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationResponse> getCancelOperationMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationRequest, com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationResponse> getCancelOperationMethod;
    if ((getCancelOperationMethod = RobotServiceGrpc.getCancelOperationMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getCancelOperationMethod = RobotServiceGrpc.getCancelOperationMethod) == null) {
          RobotServiceGrpc.getCancelOperationMethod = getCancelOperationMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationRequest, com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOperation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("CancelOperation"))
              .build();
        }
      }
    }
    return getCancelOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationRequest,
      com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationResponse> getBlockForOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockForOperation",
      requestType = com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationRequest.class,
      responseType = com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationRequest,
      com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationResponse> getBlockForOperationMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationRequest, com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationResponse> getBlockForOperationMethod;
    if ((getBlockForOperationMethod = RobotServiceGrpc.getBlockForOperationMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getBlockForOperationMethod = RobotServiceGrpc.getBlockForOperationMethod) == null) {
          RobotServiceGrpc.getBlockForOperationMethod = getBlockForOperationMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationRequest, com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlockForOperation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("BlockForOperation"))
              .build();
        }
      }
    }
    return getBlockForOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigRequest,
      com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigResponse> getFrameSystemConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FrameSystemConfig",
      requestType = com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigRequest.class,
      responseType = com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigRequest,
      com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigResponse> getFrameSystemConfigMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigRequest, com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigResponse> getFrameSystemConfigMethod;
    if ((getFrameSystemConfigMethod = RobotServiceGrpc.getFrameSystemConfigMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getFrameSystemConfigMethod = RobotServiceGrpc.getFrameSystemConfigMethod) == null) {
          RobotServiceGrpc.getFrameSystemConfigMethod = getFrameSystemConfigMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigRequest, com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FrameSystemConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("FrameSystemConfig"))
              .build();
        }
      }
    }
    return getFrameSystemConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseRequest,
      com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseResponse> getTransformPoseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransformPose",
      requestType = com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseRequest.class,
      responseType = com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseRequest,
      com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseResponse> getTransformPoseMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseRequest, com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseResponse> getTransformPoseMethod;
    if ((getTransformPoseMethod = RobotServiceGrpc.getTransformPoseMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getTransformPoseMethod = RobotServiceGrpc.getTransformPoseMethod) == null) {
          RobotServiceGrpc.getTransformPoseMethod = getTransformPoseMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseRequest, com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransformPose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("TransformPose"))
              .build();
        }
      }
    }
    return getTransformPoseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RobotServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RobotServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RobotServiceStub>() {
        @java.lang.Override
        public RobotServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RobotServiceStub(channel, callOptions);
        }
      };
    return RobotServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RobotServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RobotServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RobotServiceBlockingStub>() {
        @java.lang.Override
        public RobotServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RobotServiceBlockingStub(channel, callOptions);
        }
      };
    return RobotServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RobotServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RobotServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RobotServiceFutureStub>() {
        @java.lang.Override
        public RobotServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RobotServiceFutureStub(channel, callOptions);
        }
      };
    return RobotServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A RobotService encompasses all functionality of some robot comprised of parts, local and remote.
   * </pre>
   */
  public static abstract class RobotServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getOperations(com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResourceNames returns the list of all resources.
     * </pre>
     */
    public void resourceNames(com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResourceNamesMethod(), responseObserver);
    }

    /**
     */
    public void cancelOperation(com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelOperationMethod(), responseObserver);
    }

    /**
     */
    public void blockForOperation(com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlockForOperationMethod(), responseObserver);
    }

    /**
     */
    public void frameSystemConfig(com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFrameSystemConfigMethod(), responseObserver);
    }

    /**
     */
    public void transformPose(com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransformPoseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsRequest,
                com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsResponse>(
                  this, METHODID_GET_OPERATIONS)))
          .addMethod(
            getResourceNamesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesRequest,
                com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesResponse>(
                  this, METHODID_RESOURCE_NAMES)))
          .addMethod(
            getCancelOperationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationRequest,
                com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationResponse>(
                  this, METHODID_CANCEL_OPERATION)))
          .addMethod(
            getBlockForOperationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationRequest,
                com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationResponse>(
                  this, METHODID_BLOCK_FOR_OPERATION)))
          .addMethod(
            getFrameSystemConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigRequest,
                com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigResponse>(
                  this, METHODID_FRAME_SYSTEM_CONFIG)))
          .addMethod(
            getTransformPoseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseRequest,
                com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseResponse>(
                  this, METHODID_TRANSFORM_POSE)))
          .build();
    }
  }

  /**
   * <pre>
   * A RobotService encompasses all functionality of some robot comprised of parts, local and remote.
   * </pre>
   */
  public static final class RobotServiceStub extends io.grpc.stub.AbstractAsyncStub<RobotServiceStub> {
    private RobotServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RobotServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RobotServiceStub(channel, callOptions);
    }

    /**
     */
    public void getOperations(com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResourceNames returns the list of all resources.
     * </pre>
     */
    public void resourceNames(com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResourceNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelOperation(com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelOperationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void blockForOperation(com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlockForOperationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void frameSystemConfig(com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFrameSystemConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transformPose(com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransformPoseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A RobotService encompasses all functionality of some robot comprised of parts, local and remote.
   * </pre>
   */
  public static final class RobotServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RobotServiceBlockingStub> {
    private RobotServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RobotServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RobotServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsResponse getOperations(com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResourceNames returns the list of all resources.
     * </pre>
     */
    public com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesResponse resourceNames(com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResourceNamesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationResponse cancelOperation(com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelOperationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationResponse blockForOperation(com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlockForOperationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigResponse frameSystemConfig(com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFrameSystemConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseResponse transformPose(com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransformPoseMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A RobotService encompasses all functionality of some robot comprised of parts, local and remote.
   * </pre>
   */
  public static final class RobotServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RobotServiceFutureStub> {
    private RobotServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RobotServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RobotServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsResponse> getOperations(
        com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResourceNames returns the list of all resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesResponse> resourceNames(
        com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResourceNamesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationResponse> cancelOperation(
        com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelOperationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationResponse> blockForOperation(
        com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlockForOperationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigResponse> frameSystemConfig(
        com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFrameSystemConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseResponse> transformPose(
        com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransformPoseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OPERATIONS = 0;
  private static final int METHODID_RESOURCE_NAMES = 1;
  private static final int METHODID_CANCEL_OPERATION = 2;
  private static final int METHODID_BLOCK_FOR_OPERATION = 3;
  private static final int METHODID_FRAME_SYSTEM_CONFIG = 4;
  private static final int METHODID_TRANSFORM_POSE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RobotServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RobotServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_OPERATIONS:
          serviceImpl.getOperations((com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.GetOperationsResponse>) responseObserver);
          break;
        case METHODID_RESOURCE_NAMES:
          serviceImpl.resourceNames((com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.ResourceNamesResponse>) responseObserver);
          break;
        case METHODID_CANCEL_OPERATION:
          serviceImpl.cancelOperation((com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.CancelOperationResponse>) responseObserver);
          break;
        case METHODID_BLOCK_FOR_OPERATION:
          serviceImpl.blockForOperation((com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.BlockForOperationResponse>) responseObserver);
          break;
        case METHODID_FRAME_SYSTEM_CONFIG:
          serviceImpl.frameSystemConfig((com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.FrameSystemConfigResponse>) responseObserver);
          break;
        case METHODID_TRANSFORM_POSE:
          serviceImpl.transformPose((com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.robot.v1.Robot.TransformPoseResponse>) responseObserver);
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

  private static abstract class RobotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RobotServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.rdk.proto.api.robot.v1.Robot.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RobotService");
    }
  }

  private static final class RobotServiceFileDescriptorSupplier
      extends RobotServiceBaseDescriptorSupplier {
    RobotServiceFileDescriptorSupplier() {}
  }

  private static final class RobotServiceMethodDescriptorSupplier
      extends RobotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RobotServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RobotServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RobotServiceFileDescriptorSupplier())
              .addMethod(getGetOperationsMethod())
              .addMethod(getResourceNamesMethod())
              .addMethod(getCancelOperationMethod())
              .addMethod(getBlockForOperationMethod())
              .addMethod(getFrameSystemConfigMethod())
              .addMethod(getTransformPoseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
