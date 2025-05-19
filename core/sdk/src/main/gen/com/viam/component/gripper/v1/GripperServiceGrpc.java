package com.viam.component.gripper.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An GripperService services all grippers associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: component/gripper/v1/gripper.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GripperServiceGrpc {

  private GripperServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.gripper.v1.GripperService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.gripper.v1.Gripper.OpenRequest,
      com.viam.component.gripper.v1.Gripper.OpenResponse> getOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Open",
      requestType = com.viam.component.gripper.v1.Gripper.OpenRequest.class,
      responseType = com.viam.component.gripper.v1.Gripper.OpenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.gripper.v1.Gripper.OpenRequest,
      com.viam.component.gripper.v1.Gripper.OpenResponse> getOpenMethod() {
    io.grpc.MethodDescriptor<com.viam.component.gripper.v1.Gripper.OpenRequest, com.viam.component.gripper.v1.Gripper.OpenResponse> getOpenMethod;
    if ((getOpenMethod = GripperServiceGrpc.getOpenMethod) == null) {
      synchronized (GripperServiceGrpc.class) {
        if ((getOpenMethod = GripperServiceGrpc.getOpenMethod) == null) {
          GripperServiceGrpc.getOpenMethod = getOpenMethod =
              io.grpc.MethodDescriptor.<com.viam.component.gripper.v1.Gripper.OpenRequest, com.viam.component.gripper.v1.Gripper.OpenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Open"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gripper.v1.Gripper.OpenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gripper.v1.Gripper.OpenResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.gripper.v1.Gripper.GrabRequest,
      com.viam.component.gripper.v1.Gripper.GrabResponse> getGrabMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Grab",
      requestType = com.viam.component.gripper.v1.Gripper.GrabRequest.class,
      responseType = com.viam.component.gripper.v1.Gripper.GrabResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.gripper.v1.Gripper.GrabRequest,
      com.viam.component.gripper.v1.Gripper.GrabResponse> getGrabMethod() {
    io.grpc.MethodDescriptor<com.viam.component.gripper.v1.Gripper.GrabRequest, com.viam.component.gripper.v1.Gripper.GrabResponse> getGrabMethod;
    if ((getGrabMethod = GripperServiceGrpc.getGrabMethod) == null) {
      synchronized (GripperServiceGrpc.class) {
        if ((getGrabMethod = GripperServiceGrpc.getGrabMethod) == null) {
          GripperServiceGrpc.getGrabMethod = getGrabMethod =
              io.grpc.MethodDescriptor.<com.viam.component.gripper.v1.Gripper.GrabRequest, com.viam.component.gripper.v1.Gripper.GrabResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Grab"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gripper.v1.Gripper.GrabRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gripper.v1.Gripper.GrabResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGrabMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.gripper.v1.Gripper.StopRequest,
      com.viam.component.gripper.v1.Gripper.StopResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = com.viam.component.gripper.v1.Gripper.StopRequest.class,
      responseType = com.viam.component.gripper.v1.Gripper.StopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.gripper.v1.Gripper.StopRequest,
      com.viam.component.gripper.v1.Gripper.StopResponse> getStopMethod() {
    io.grpc.MethodDescriptor<com.viam.component.gripper.v1.Gripper.StopRequest, com.viam.component.gripper.v1.Gripper.StopResponse> getStopMethod;
    if ((getStopMethod = GripperServiceGrpc.getStopMethod) == null) {
      synchronized (GripperServiceGrpc.class) {
        if ((getStopMethod = GripperServiceGrpc.getStopMethod) == null) {
          GripperServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<com.viam.component.gripper.v1.Gripper.StopRequest, com.viam.component.gripper.v1.Gripper.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gripper.v1.Gripper.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gripper.v1.Gripper.StopResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.gripper.v1.Gripper.IsMovingRequest,
      com.viam.component.gripper.v1.Gripper.IsMovingResponse> getIsMovingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsMoving",
      requestType = com.viam.component.gripper.v1.Gripper.IsMovingRequest.class,
      responseType = com.viam.component.gripper.v1.Gripper.IsMovingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.gripper.v1.Gripper.IsMovingRequest,
      com.viam.component.gripper.v1.Gripper.IsMovingResponse> getIsMovingMethod() {
    io.grpc.MethodDescriptor<com.viam.component.gripper.v1.Gripper.IsMovingRequest, com.viam.component.gripper.v1.Gripper.IsMovingResponse> getIsMovingMethod;
    if ((getIsMovingMethod = GripperServiceGrpc.getIsMovingMethod) == null) {
      synchronized (GripperServiceGrpc.class) {
        if ((getIsMovingMethod = GripperServiceGrpc.getIsMovingMethod) == null) {
          GripperServiceGrpc.getIsMovingMethod = getIsMovingMethod =
              io.grpc.MethodDescriptor.<com.viam.component.gripper.v1.Gripper.IsMovingRequest, com.viam.component.gripper.v1.Gripper.IsMovingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsMoving"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gripper.v1.Gripper.IsMovingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gripper.v1.Gripper.IsMovingResponse.getDefaultInstance()))
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
    if ((getDoCommandMethod = GripperServiceGrpc.getDoCommandMethod) == null) {
      synchronized (GripperServiceGrpc.class) {
        if ((getDoCommandMethod = GripperServiceGrpc.getDoCommandMethod) == null) {
          GripperServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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
    if ((getGetGeometriesMethod = GripperServiceGrpc.getGetGeometriesMethod) == null) {
      synchronized (GripperServiceGrpc.class) {
        if ((getGetGeometriesMethod = GripperServiceGrpc.getGetGeometriesMethod) == null) {
          GripperServiceGrpc.getGetGeometriesMethod = getGetGeometriesMethod =
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

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetKinematicsRequest,
      com.viam.common.v1.Common.GetKinematicsResponse> getGetKinematicsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKinematics",
      requestType = com.viam.common.v1.Common.GetKinematicsRequest.class,
      responseType = com.viam.common.v1.Common.GetKinematicsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetKinematicsRequest,
      com.viam.common.v1.Common.GetKinematicsResponse> getGetKinematicsMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetKinematicsRequest, com.viam.common.v1.Common.GetKinematicsResponse> getGetKinematicsMethod;
    if ((getGetKinematicsMethod = GripperServiceGrpc.getGetKinematicsMethod) == null) {
      synchronized (GripperServiceGrpc.class) {
        if ((getGetKinematicsMethod = GripperServiceGrpc.getGetKinematicsMethod) == null) {
          GripperServiceGrpc.getGetKinematicsMethod = getGetKinematicsMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.GetKinematicsRequest, com.viam.common.v1.Common.GetKinematicsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKinematics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetKinematicsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetKinematicsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetKinematicsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GripperServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GripperServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GripperServiceStub>() {
        @java.lang.Override
        public GripperServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GripperServiceStub(channel, callOptions);
        }
      };
    return GripperServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GripperServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GripperServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GripperServiceBlockingStub>() {
        @java.lang.Override
        public GripperServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GripperServiceBlockingStub(channel, callOptions);
        }
      };
    return GripperServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GripperServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GripperServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GripperServiceFutureStub>() {
        @java.lang.Override
        public GripperServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GripperServiceFutureStub(channel, callOptions);
        }
      };
    return GripperServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An GripperService services all grippers associated with a robot
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Open opens a gripper of the underlying robot.
     * </pre>
     */
    default void open(com.viam.component.gripper.v1.Gripper.OpenRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gripper.v1.Gripper.OpenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Grab requests a gripper of the underlying robot to grab.
     * </pre>
     */
    default void grab(com.viam.component.gripper.v1.Gripper.GrabRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gripper.v1.Gripper.GrabResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGrabMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's gripper
     * </pre>
     */
    default void stop(com.viam.component.gripper.v1.Gripper.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gripper.v1.Gripper.StopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    default void isMoving(com.viam.component.gripper.v1.Gripper.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gripper.v1.Gripper.IsMovingResponse> responseObserver) {
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
     * GetKinematics returns the kinematics file for the component
     * </pre>
     */
    default void getKinematics(com.viam.common.v1.Common.GetKinematicsRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetKinematicsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKinematicsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GripperService.
   * <pre>
   * An GripperService services all grippers associated with a robot
   * </pre>
   */
  public static abstract class GripperServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GripperServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GripperService.
   * <pre>
   * An GripperService services all grippers associated with a robot
   * </pre>
   */
  public static final class GripperServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GripperServiceStub> {
    private GripperServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GripperServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GripperServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Open opens a gripper of the underlying robot.
     * </pre>
     */
    public void open(com.viam.component.gripper.v1.Gripper.OpenRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gripper.v1.Gripper.OpenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Grab requests a gripper of the underlying robot to grab.
     * </pre>
     */
    public void grab(com.viam.component.gripper.v1.Gripper.GrabRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gripper.v1.Gripper.GrabResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGrabMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's gripper
     * </pre>
     */
    public void stop(com.viam.component.gripper.v1.Gripper.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gripper.v1.Gripper.StopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public void isMoving(com.viam.component.gripper.v1.Gripper.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gripper.v1.Gripper.IsMovingResponse> responseObserver) {
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
     * GetKinematics returns the kinematics file for the component
     * </pre>
     */
    public void getKinematics(com.viam.common.v1.Common.GetKinematicsRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetKinematicsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKinematicsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GripperService.
   * <pre>
   * An GripperService services all grippers associated with a robot
   * </pre>
   */
  public static final class GripperServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GripperServiceBlockingStub> {
    private GripperServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GripperServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GripperServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Open opens a gripper of the underlying robot.
     * </pre>
     */
    public com.viam.component.gripper.v1.Gripper.OpenResponse open(com.viam.component.gripper.v1.Gripper.OpenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Grab requests a gripper of the underlying robot to grab.
     * </pre>
     */
    public com.viam.component.gripper.v1.Gripper.GrabResponse grab(com.viam.component.gripper.v1.Gripper.GrabRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGrabMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop stops a robot's gripper
     * </pre>
     */
    public com.viam.component.gripper.v1.Gripper.StopResponse stop(com.viam.component.gripper.v1.Gripper.StopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public com.viam.component.gripper.v1.Gripper.IsMovingResponse isMoving(com.viam.component.gripper.v1.Gripper.IsMovingRequest request) {
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
     * GetKinematics returns the kinematics file for the component
     * </pre>
     */
    public com.viam.common.v1.Common.GetKinematicsResponse getKinematics(com.viam.common.v1.Common.GetKinematicsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKinematicsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GripperService.
   * <pre>
   * An GripperService services all grippers associated with a robot
   * </pre>
   */
  public static final class GripperServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GripperServiceFutureStub> {
    private GripperServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GripperServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GripperServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Open opens a gripper of the underlying robot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.gripper.v1.Gripper.OpenResponse> open(
        com.viam.component.gripper.v1.Gripper.OpenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Grab requests a gripper of the underlying robot to grab.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.gripper.v1.Gripper.GrabResponse> grab(
        com.viam.component.gripper.v1.Gripper.GrabRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGrabMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop stops a robot's gripper
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.gripper.v1.Gripper.StopResponse> stop(
        com.viam.component.gripper.v1.Gripper.StopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.gripper.v1.Gripper.IsMovingResponse> isMoving(
        com.viam.component.gripper.v1.Gripper.IsMovingRequest request) {
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
     * GetKinematics returns the kinematics file for the component
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.GetKinematicsResponse> getKinematics(
        com.viam.common.v1.Common.GetKinematicsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKinematicsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN = 0;
  private static final int METHODID_GRAB = 1;
  private static final int METHODID_STOP = 2;
  private static final int METHODID_IS_MOVING = 3;
  private static final int METHODID_DO_COMMAND = 4;
  private static final int METHODID_GET_GEOMETRIES = 5;
  private static final int METHODID_GET_KINEMATICS = 6;

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
        case METHODID_OPEN:
          serviceImpl.open((com.viam.component.gripper.v1.Gripper.OpenRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.gripper.v1.Gripper.OpenResponse>) responseObserver);
          break;
        case METHODID_GRAB:
          serviceImpl.grab((com.viam.component.gripper.v1.Gripper.GrabRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.gripper.v1.Gripper.GrabResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((com.viam.component.gripper.v1.Gripper.StopRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.gripper.v1.Gripper.StopResponse>) responseObserver);
          break;
        case METHODID_IS_MOVING:
          serviceImpl.isMoving((com.viam.component.gripper.v1.Gripper.IsMovingRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.gripper.v1.Gripper.IsMovingResponse>) responseObserver);
          break;
        case METHODID_DO_COMMAND:
          serviceImpl.doCommand((com.viam.common.v1.Common.DoCommandRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse>) responseObserver);
          break;
        case METHODID_GET_GEOMETRIES:
          serviceImpl.getGeometries((com.viam.common.v1.Common.GetGeometriesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse>) responseObserver);
          break;
        case METHODID_GET_KINEMATICS:
          serviceImpl.getKinematics((com.viam.common.v1.Common.GetKinematicsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetKinematicsResponse>) responseObserver);
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
          getOpenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.gripper.v1.Gripper.OpenRequest,
              com.viam.component.gripper.v1.Gripper.OpenResponse>(
                service, METHODID_OPEN)))
        .addMethod(
          getGrabMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.gripper.v1.Gripper.GrabRequest,
              com.viam.component.gripper.v1.Gripper.GrabResponse>(
                service, METHODID_GRAB)))
        .addMethod(
          getStopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.gripper.v1.Gripper.StopRequest,
              com.viam.component.gripper.v1.Gripper.StopResponse>(
                service, METHODID_STOP)))
        .addMethod(
          getIsMovingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.gripper.v1.Gripper.IsMovingRequest,
              com.viam.component.gripper.v1.Gripper.IsMovingResponse>(
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
          getGetKinematicsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.GetKinematicsRequest,
              com.viam.common.v1.Common.GetKinematicsResponse>(
                service, METHODID_GET_KINEMATICS)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GripperServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getOpenMethod())
              .addMethod(getGrabMethod())
              .addMethod(getStopMethod())
              .addMethod(getIsMovingMethod())
              .addMethod(getDoCommandMethod())
              .addMethod(getGetGeometriesMethod())
              .addMethod(getGetKinematicsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
