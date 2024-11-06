package com.viam.service.motion.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A MotionService declares the gRPC contract for a motion service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: service/motion/v1/motion.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MotionServiceGrpc {

  private MotionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.service.motion.v1.MotionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.MoveRequest,
      com.viam.service.motion.v1.Motion.MoveResponse> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = com.viam.service.motion.v1.Motion.MoveRequest.class,
      responseType = com.viam.service.motion.v1.Motion.MoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.MoveRequest,
      com.viam.service.motion.v1.Motion.MoveResponse> getMoveMethod() {
    io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.MoveRequest, com.viam.service.motion.v1.Motion.MoveResponse> getMoveMethod;
    if ((getMoveMethod = MotionServiceGrpc.getMoveMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getMoveMethod = MotionServiceGrpc.getMoveMethod) == null) {
          MotionServiceGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<com.viam.service.motion.v1.Motion.MoveRequest, com.viam.service.motion.v1.Motion.MoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.MoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.MoveResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.MoveOnMapRequest,
      com.viam.service.motion.v1.Motion.MoveOnMapResponse> getMoveOnMapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveOnMap",
      requestType = com.viam.service.motion.v1.Motion.MoveOnMapRequest.class,
      responseType = com.viam.service.motion.v1.Motion.MoveOnMapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.MoveOnMapRequest,
      com.viam.service.motion.v1.Motion.MoveOnMapResponse> getMoveOnMapMethod() {
    io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.MoveOnMapRequest, com.viam.service.motion.v1.Motion.MoveOnMapResponse> getMoveOnMapMethod;
    if ((getMoveOnMapMethod = MotionServiceGrpc.getMoveOnMapMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getMoveOnMapMethod = MotionServiceGrpc.getMoveOnMapMethod) == null) {
          MotionServiceGrpc.getMoveOnMapMethod = getMoveOnMapMethod =
              io.grpc.MethodDescriptor.<com.viam.service.motion.v1.Motion.MoveOnMapRequest, com.viam.service.motion.v1.Motion.MoveOnMapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveOnMap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.MoveOnMapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.MoveOnMapResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getMoveOnMapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.MoveOnGlobeRequest,
      com.viam.service.motion.v1.Motion.MoveOnGlobeResponse> getMoveOnGlobeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveOnGlobe",
      requestType = com.viam.service.motion.v1.Motion.MoveOnGlobeRequest.class,
      responseType = com.viam.service.motion.v1.Motion.MoveOnGlobeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.MoveOnGlobeRequest,
      com.viam.service.motion.v1.Motion.MoveOnGlobeResponse> getMoveOnGlobeMethod() {
    io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.MoveOnGlobeRequest, com.viam.service.motion.v1.Motion.MoveOnGlobeResponse> getMoveOnGlobeMethod;
    if ((getMoveOnGlobeMethod = MotionServiceGrpc.getMoveOnGlobeMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getMoveOnGlobeMethod = MotionServiceGrpc.getMoveOnGlobeMethod) == null) {
          MotionServiceGrpc.getMoveOnGlobeMethod = getMoveOnGlobeMethod =
              io.grpc.MethodDescriptor.<com.viam.service.motion.v1.Motion.MoveOnGlobeRequest, com.viam.service.motion.v1.Motion.MoveOnGlobeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveOnGlobe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.MoveOnGlobeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.MoveOnGlobeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getMoveOnGlobeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.GetPoseRequest,
      com.viam.service.motion.v1.Motion.GetPoseResponse> getGetPoseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPose",
      requestType = com.viam.service.motion.v1.Motion.GetPoseRequest.class,
      responseType = com.viam.service.motion.v1.Motion.GetPoseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.GetPoseRequest,
      com.viam.service.motion.v1.Motion.GetPoseResponse> getGetPoseMethod() {
    io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.GetPoseRequest, com.viam.service.motion.v1.Motion.GetPoseResponse> getGetPoseMethod;
    if ((getGetPoseMethod = MotionServiceGrpc.getGetPoseMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getGetPoseMethod = MotionServiceGrpc.getGetPoseMethod) == null) {
          MotionServiceGrpc.getGetPoseMethod = getGetPoseMethod =
              io.grpc.MethodDescriptor.<com.viam.service.motion.v1.Motion.GetPoseRequest, com.viam.service.motion.v1.Motion.GetPoseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.GetPoseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.GetPoseResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPoseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.StopPlanRequest,
      com.viam.service.motion.v1.Motion.StopPlanResponse> getStopPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopPlan",
      requestType = com.viam.service.motion.v1.Motion.StopPlanRequest.class,
      responseType = com.viam.service.motion.v1.Motion.StopPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.StopPlanRequest,
      com.viam.service.motion.v1.Motion.StopPlanResponse> getStopPlanMethod() {
    io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.StopPlanRequest, com.viam.service.motion.v1.Motion.StopPlanResponse> getStopPlanMethod;
    if ((getStopPlanMethod = MotionServiceGrpc.getStopPlanMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getStopPlanMethod = MotionServiceGrpc.getStopPlanMethod) == null) {
          MotionServiceGrpc.getStopPlanMethod = getStopPlanMethod =
              io.grpc.MethodDescriptor.<com.viam.service.motion.v1.Motion.StopPlanRequest, com.viam.service.motion.v1.Motion.StopPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.StopPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.StopPlanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.ListPlanStatusesRequest,
      com.viam.service.motion.v1.Motion.ListPlanStatusesResponse> getListPlanStatusesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPlanStatuses",
      requestType = com.viam.service.motion.v1.Motion.ListPlanStatusesRequest.class,
      responseType = com.viam.service.motion.v1.Motion.ListPlanStatusesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.ListPlanStatusesRequest,
      com.viam.service.motion.v1.Motion.ListPlanStatusesResponse> getListPlanStatusesMethod() {
    io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.ListPlanStatusesRequest, com.viam.service.motion.v1.Motion.ListPlanStatusesResponse> getListPlanStatusesMethod;
    if ((getListPlanStatusesMethod = MotionServiceGrpc.getListPlanStatusesMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getListPlanStatusesMethod = MotionServiceGrpc.getListPlanStatusesMethod) == null) {
          MotionServiceGrpc.getListPlanStatusesMethod = getListPlanStatusesMethod =
              io.grpc.MethodDescriptor.<com.viam.service.motion.v1.Motion.ListPlanStatusesRequest, com.viam.service.motion.v1.Motion.ListPlanStatusesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPlanStatuses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.ListPlanStatusesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.ListPlanStatusesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListPlanStatusesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.GetPlanRequest,
      com.viam.service.motion.v1.Motion.GetPlanResponse> getGetPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlan",
      requestType = com.viam.service.motion.v1.Motion.GetPlanRequest.class,
      responseType = com.viam.service.motion.v1.Motion.GetPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.GetPlanRequest,
      com.viam.service.motion.v1.Motion.GetPlanResponse> getGetPlanMethod() {
    io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.GetPlanRequest, com.viam.service.motion.v1.Motion.GetPlanResponse> getGetPlanMethod;
    if ((getGetPlanMethod = MotionServiceGrpc.getGetPlanMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getGetPlanMethod = MotionServiceGrpc.getGetPlanMethod) == null) {
          MotionServiceGrpc.getGetPlanMethod = getGetPlanMethod =
              io.grpc.MethodDescriptor.<com.viam.service.motion.v1.Motion.GetPlanRequest, com.viam.service.motion.v1.Motion.GetPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.GetPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.motion.v1.Motion.GetPlanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPlanMethod;
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
    if ((getDoCommandMethod = MotionServiceGrpc.getDoCommandMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getDoCommandMethod = MotionServiceGrpc.getDoCommandMethod) == null) {
          MotionServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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
  public static MotionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MotionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MotionServiceStub>() {
        @java.lang.Override
        public MotionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MotionServiceStub(channel, callOptions);
        }
      };
    return MotionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MotionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MotionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MotionServiceBlockingStub>() {
        @java.lang.Override
        public MotionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MotionServiceBlockingStub(channel, callOptions);
        }
      };
    return MotionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MotionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MotionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MotionServiceFutureStub>() {
        @java.lang.Override
        public MotionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MotionServiceFutureStub(channel, callOptions);
        }
      };
    return MotionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A MotionService declares the gRPC contract for a motion service
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void move(com.viam.service.motion.v1.Motion.MoveRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.MoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate a plan and move a component to a specific pose
     * with respect to the SLAM map's origin.
     * May replan to avoid obstacles
     * </pre>
     */
    default void moveOnMap(com.viam.service.motion.v1.Motion.MoveOnMapRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.MoveOnMapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveOnMapMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate and begin executing an execution to move a component
     * to a specific GPS coordinate.
     * May replan to avoid obstacles &amp; account for location drift.
     * Creates a new plan upon replanning.
     * </pre>
     */
    default void moveOnGlobe(com.viam.service.motion.v1.Motion.MoveOnGlobeRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.MoveOnGlobeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveOnGlobeMethod(), responseObserver);
    }

    /**
     */
    default void getPose(com.viam.service.motion.v1.Motion.GetPoseRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.GetPoseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPoseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops a Plan
     * </pre>
     */
    default void stopPlan(com.viam.service.motion.v1.Motion.StopPlanRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.StopPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the status of plans created by requests to move components
     * that are executing OR are part of an execution which changed it state
     * within the a 24HR TTL OR until the robot reinitializes.
     * This currently only returns plans for MoveOnGlobe and MoveOnMap.
     * </pre>
     */
    default void listPlanStatuses(com.viam.service.motion.v1.Motion.ListPlanStatusesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.ListPlanStatusesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPlanStatusesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the plan(s) &amp; state history of the most recent execution to move a
     * component. Returns a result if the last execution is still executing OR
     * changed state within the last 24 hours AND the robot has not reinitialized.
     * Plans are never mutated.
     * Replans always create new plans.
     * Replans share the execution_id of the previously executing plan.
     * This currently only returns plans for MoveOnGlobe and MoveOnMap.
     * </pre>
     */
    default void getPlan(com.viam.service.motion.v1.Motion.GetPlanRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.GetPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlanMethod(), responseObserver);
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
   * Base class for the server implementation of the service MotionService.
   * <pre>
   * A MotionService declares the gRPC contract for a motion service
   * </pre>
   */
  public static abstract class MotionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MotionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MotionService.
   * <pre>
   * A MotionService declares the gRPC contract for a motion service
   * </pre>
   */
  public static final class MotionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MotionServiceStub> {
    private MotionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MotionServiceStub(channel, callOptions);
    }

    /**
     */
    public void move(com.viam.service.motion.v1.Motion.MoveRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.MoveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate a plan and move a component to a specific pose
     * with respect to the SLAM map's origin.
     * May replan to avoid obstacles
     * </pre>
     */
    public void moveOnMap(com.viam.service.motion.v1.Motion.MoveOnMapRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.MoveOnMapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveOnMapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate and begin executing an execution to move a component
     * to a specific GPS coordinate.
     * May replan to avoid obstacles &amp; account for location drift.
     * Creates a new plan upon replanning.
     * </pre>
     */
    public void moveOnGlobe(com.viam.service.motion.v1.Motion.MoveOnGlobeRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.MoveOnGlobeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveOnGlobeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPose(com.viam.service.motion.v1.Motion.GetPoseRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.GetPoseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPoseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops a Plan
     * </pre>
     */
    public void stopPlan(com.viam.service.motion.v1.Motion.StopPlanRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.StopPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the status of plans created by requests to move components
     * that are executing OR are part of an execution which changed it state
     * within the a 24HR TTL OR until the robot reinitializes.
     * This currently only returns plans for MoveOnGlobe and MoveOnMap.
     * </pre>
     */
    public void listPlanStatuses(com.viam.service.motion.v1.Motion.ListPlanStatusesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.ListPlanStatusesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPlanStatusesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the plan(s) &amp; state history of the most recent execution to move a
     * component. Returns a result if the last execution is still executing OR
     * changed state within the last 24 hours AND the robot has not reinitialized.
     * Plans are never mutated.
     * Replans always create new plans.
     * Replans share the execution_id of the previously executing plan.
     * This currently only returns plans for MoveOnGlobe and MoveOnMap.
     * </pre>
     */
    public void getPlan(com.viam.service.motion.v1.Motion.GetPlanRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.GetPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlanMethod(), getCallOptions()), request, responseObserver);
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
   * A stub to allow clients to do synchronous rpc calls to service MotionService.
   * <pre>
   * A MotionService declares the gRPC contract for a motion service
   * </pre>
   */
  public static final class MotionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MotionServiceBlockingStub> {
    private MotionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MotionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.viam.service.motion.v1.Motion.MoveResponse move(com.viam.service.motion.v1.Motion.MoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate a plan and move a component to a specific pose
     * with respect to the SLAM map's origin.
     * May replan to avoid obstacles
     * </pre>
     */
    public com.viam.service.motion.v1.Motion.MoveOnMapResponse moveOnMap(com.viam.service.motion.v1.Motion.MoveOnMapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveOnMapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate and begin executing an execution to move a component
     * to a specific GPS coordinate.
     * May replan to avoid obstacles &amp; account for location drift.
     * Creates a new plan upon replanning.
     * </pre>
     */
    public com.viam.service.motion.v1.Motion.MoveOnGlobeResponse moveOnGlobe(com.viam.service.motion.v1.Motion.MoveOnGlobeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveOnGlobeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.service.motion.v1.Motion.GetPoseResponse getPose(com.viam.service.motion.v1.Motion.GetPoseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPoseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops a Plan
     * </pre>
     */
    public com.viam.service.motion.v1.Motion.StopPlanResponse stopPlan(com.viam.service.motion.v1.Motion.StopPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the status of plans created by requests to move components
     * that are executing OR are part of an execution which changed it state
     * within the a 24HR TTL OR until the robot reinitializes.
     * This currently only returns plans for MoveOnGlobe and MoveOnMap.
     * </pre>
     */
    public com.viam.service.motion.v1.Motion.ListPlanStatusesResponse listPlanStatuses(com.viam.service.motion.v1.Motion.ListPlanStatusesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPlanStatusesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the plan(s) &amp; state history of the most recent execution to move a
     * component. Returns a result if the last execution is still executing OR
     * changed state within the last 24 hours AND the robot has not reinitialized.
     * Plans are never mutated.
     * Replans always create new plans.
     * Replans share the execution_id of the previously executing plan.
     * This currently only returns plans for MoveOnGlobe and MoveOnMap.
     * </pre>
     */
    public com.viam.service.motion.v1.Motion.GetPlanResponse getPlan(com.viam.service.motion.v1.Motion.GetPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlanMethod(), getCallOptions(), request);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MotionService.
   * <pre>
   * A MotionService declares the gRPC contract for a motion service
   * </pre>
   */
  public static final class MotionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MotionServiceFutureStub> {
    private MotionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MotionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.motion.v1.Motion.MoveResponse> move(
        com.viam.service.motion.v1.Motion.MoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate a plan and move a component to a specific pose
     * with respect to the SLAM map's origin.
     * May replan to avoid obstacles
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.motion.v1.Motion.MoveOnMapResponse> moveOnMap(
        com.viam.service.motion.v1.Motion.MoveOnMapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveOnMapMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate and begin executing an execution to move a component
     * to a specific GPS coordinate.
     * May replan to avoid obstacles &amp; account for location drift.
     * Creates a new plan upon replanning.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.motion.v1.Motion.MoveOnGlobeResponse> moveOnGlobe(
        com.viam.service.motion.v1.Motion.MoveOnGlobeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveOnGlobeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.motion.v1.Motion.GetPoseResponse> getPose(
        com.viam.service.motion.v1.Motion.GetPoseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPoseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops a Plan
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.motion.v1.Motion.StopPlanResponse> stopPlan(
        com.viam.service.motion.v1.Motion.StopPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the status of plans created by requests to move components
     * that are executing OR are part of an execution which changed it state
     * within the a 24HR TTL OR until the robot reinitializes.
     * This currently only returns plans for MoveOnGlobe and MoveOnMap.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.motion.v1.Motion.ListPlanStatusesResponse> listPlanStatuses(
        com.viam.service.motion.v1.Motion.ListPlanStatusesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPlanStatusesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the plan(s) &amp; state history of the most recent execution to move a
     * component. Returns a result if the last execution is still executing OR
     * changed state within the last 24 hours AND the robot has not reinitialized.
     * Plans are never mutated.
     * Replans always create new plans.
     * Replans share the execution_id of the previously executing plan.
     * This currently only returns plans for MoveOnGlobe and MoveOnMap.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.motion.v1.Motion.GetPlanResponse> getPlan(
        com.viam.service.motion.v1.Motion.GetPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlanMethod(), getCallOptions()), request);
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

  private static final int METHODID_MOVE = 0;
  private static final int METHODID_MOVE_ON_MAP = 1;
  private static final int METHODID_MOVE_ON_GLOBE = 2;
  private static final int METHODID_GET_POSE = 3;
  private static final int METHODID_STOP_PLAN = 4;
  private static final int METHODID_LIST_PLAN_STATUSES = 5;
  private static final int METHODID_GET_PLAN = 6;
  private static final int METHODID_DO_COMMAND = 7;

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
          serviceImpl.move((com.viam.service.motion.v1.Motion.MoveRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.MoveResponse>) responseObserver);
          break;
        case METHODID_MOVE_ON_MAP:
          serviceImpl.moveOnMap((com.viam.service.motion.v1.Motion.MoveOnMapRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.MoveOnMapResponse>) responseObserver);
          break;
        case METHODID_MOVE_ON_GLOBE:
          serviceImpl.moveOnGlobe((com.viam.service.motion.v1.Motion.MoveOnGlobeRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.MoveOnGlobeResponse>) responseObserver);
          break;
        case METHODID_GET_POSE:
          serviceImpl.getPose((com.viam.service.motion.v1.Motion.GetPoseRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.GetPoseResponse>) responseObserver);
          break;
        case METHODID_STOP_PLAN:
          serviceImpl.stopPlan((com.viam.service.motion.v1.Motion.StopPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.StopPlanResponse>) responseObserver);
          break;
        case METHODID_LIST_PLAN_STATUSES:
          serviceImpl.listPlanStatuses((com.viam.service.motion.v1.Motion.ListPlanStatusesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.ListPlanStatusesResponse>) responseObserver);
          break;
        case METHODID_GET_PLAN:
          serviceImpl.getPlan((com.viam.service.motion.v1.Motion.GetPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.GetPlanResponse>) responseObserver);
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
          getMoveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.motion.v1.Motion.MoveRequest,
              com.viam.service.motion.v1.Motion.MoveResponse>(
                service, METHODID_MOVE)))
        .addMethod(
          getMoveOnMapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.motion.v1.Motion.MoveOnMapRequest,
              com.viam.service.motion.v1.Motion.MoveOnMapResponse>(
                service, METHODID_MOVE_ON_MAP)))
        .addMethod(
          getMoveOnGlobeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.motion.v1.Motion.MoveOnGlobeRequest,
              com.viam.service.motion.v1.Motion.MoveOnGlobeResponse>(
                service, METHODID_MOVE_ON_GLOBE)))
        .addMethod(
          getGetPoseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.motion.v1.Motion.GetPoseRequest,
              com.viam.service.motion.v1.Motion.GetPoseResponse>(
                service, METHODID_GET_POSE)))
        .addMethod(
          getStopPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.motion.v1.Motion.StopPlanRequest,
              com.viam.service.motion.v1.Motion.StopPlanResponse>(
                service, METHODID_STOP_PLAN)))
        .addMethod(
          getListPlanStatusesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.motion.v1.Motion.ListPlanStatusesRequest,
              com.viam.service.motion.v1.Motion.ListPlanStatusesResponse>(
                service, METHODID_LIST_PLAN_STATUSES)))
        .addMethod(
          getGetPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.motion.v1.Motion.GetPlanRequest,
              com.viam.service.motion.v1.Motion.GetPlanResponse>(
                service, METHODID_GET_PLAN)))
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
      synchronized (MotionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getMoveMethod())
              .addMethod(getMoveOnMapMethod())
              .addMethod(getMoveOnGlobeMethod())
              .addMethod(getGetPoseMethod())
              .addMethod(getStopPlanMethod())
              .addMethod(getListPlanStatusesMethod())
              .addMethod(getGetPlanMethod())
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
