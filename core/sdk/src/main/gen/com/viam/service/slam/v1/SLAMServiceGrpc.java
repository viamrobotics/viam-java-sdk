package com.viam.service.slam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A SlamService declares the gRPC contract for a slam service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: service/slam/v1/slam.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SLAMServiceGrpc {

  private SLAMServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.service.slam.v1.SLAMService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetPositionRequest,
      com.viam.service.slam.v1.Slam.GetPositionResponse> getGetPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPosition",
      requestType = com.viam.service.slam.v1.Slam.GetPositionRequest.class,
      responseType = com.viam.service.slam.v1.Slam.GetPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetPositionRequest,
      com.viam.service.slam.v1.Slam.GetPositionResponse> getGetPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetPositionRequest, com.viam.service.slam.v1.Slam.GetPositionResponse> getGetPositionMethod;
    if ((getGetPositionMethod = SLAMServiceGrpc.getGetPositionMethod) == null) {
      synchronized (SLAMServiceGrpc.class) {
        if ((getGetPositionMethod = SLAMServiceGrpc.getGetPositionMethod) == null) {
          SLAMServiceGrpc.getGetPositionMethod = getGetPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.service.slam.v1.Slam.GetPositionRequest, com.viam.service.slam.v1.Slam.GetPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.slam.v1.Slam.GetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.slam.v1.Slam.GetPositionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetPointCloudMapRequest,
      com.viam.service.slam.v1.Slam.GetPointCloudMapResponse> getGetPointCloudMapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPointCloudMap",
      requestType = com.viam.service.slam.v1.Slam.GetPointCloudMapRequest.class,
      responseType = com.viam.service.slam.v1.Slam.GetPointCloudMapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetPointCloudMapRequest,
      com.viam.service.slam.v1.Slam.GetPointCloudMapResponse> getGetPointCloudMapMethod() {
    io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetPointCloudMapRequest, com.viam.service.slam.v1.Slam.GetPointCloudMapResponse> getGetPointCloudMapMethod;
    if ((getGetPointCloudMapMethod = SLAMServiceGrpc.getGetPointCloudMapMethod) == null) {
      synchronized (SLAMServiceGrpc.class) {
        if ((getGetPointCloudMapMethod = SLAMServiceGrpc.getGetPointCloudMapMethod) == null) {
          SLAMServiceGrpc.getGetPointCloudMapMethod = getGetPointCloudMapMethod =
              io.grpc.MethodDescriptor.<com.viam.service.slam.v1.Slam.GetPointCloudMapRequest, com.viam.service.slam.v1.Slam.GetPointCloudMapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPointCloudMap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.slam.v1.Slam.GetPointCloudMapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.slam.v1.Slam.GetPointCloudMapResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPointCloudMapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetInternalStateRequest,
      com.viam.service.slam.v1.Slam.GetInternalStateResponse> getGetInternalStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInternalState",
      requestType = com.viam.service.slam.v1.Slam.GetInternalStateRequest.class,
      responseType = com.viam.service.slam.v1.Slam.GetInternalStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetInternalStateRequest,
      com.viam.service.slam.v1.Slam.GetInternalStateResponse> getGetInternalStateMethod() {
    io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetInternalStateRequest, com.viam.service.slam.v1.Slam.GetInternalStateResponse> getGetInternalStateMethod;
    if ((getGetInternalStateMethod = SLAMServiceGrpc.getGetInternalStateMethod) == null) {
      synchronized (SLAMServiceGrpc.class) {
        if ((getGetInternalStateMethod = SLAMServiceGrpc.getGetInternalStateMethod) == null) {
          SLAMServiceGrpc.getGetInternalStateMethod = getGetInternalStateMethod =
              io.grpc.MethodDescriptor.<com.viam.service.slam.v1.Slam.GetInternalStateRequest, com.viam.service.slam.v1.Slam.GetInternalStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInternalState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.slam.v1.Slam.GetInternalStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.slam.v1.Slam.GetInternalStateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetInternalStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetPropertiesRequest,
      com.viam.service.slam.v1.Slam.GetPropertiesResponse> getGetPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProperties",
      requestType = com.viam.service.slam.v1.Slam.GetPropertiesRequest.class,
      responseType = com.viam.service.slam.v1.Slam.GetPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetPropertiesRequest,
      com.viam.service.slam.v1.Slam.GetPropertiesResponse> getGetPropertiesMethod() {
    io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetPropertiesRequest, com.viam.service.slam.v1.Slam.GetPropertiesResponse> getGetPropertiesMethod;
    if ((getGetPropertiesMethod = SLAMServiceGrpc.getGetPropertiesMethod) == null) {
      synchronized (SLAMServiceGrpc.class) {
        if ((getGetPropertiesMethod = SLAMServiceGrpc.getGetPropertiesMethod) == null) {
          SLAMServiceGrpc.getGetPropertiesMethod = getGetPropertiesMethod =
              io.grpc.MethodDescriptor.<com.viam.service.slam.v1.Slam.GetPropertiesRequest, com.viam.service.slam.v1.Slam.GetPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.slam.v1.Slam.GetPropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.slam.v1.Slam.GetPropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPropertiesMethod;
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
    if ((getDoCommandMethod = SLAMServiceGrpc.getDoCommandMethod) == null) {
      synchronized (SLAMServiceGrpc.class) {
        if ((getDoCommandMethod = SLAMServiceGrpc.getDoCommandMethod) == null) {
          SLAMServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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
  public static SLAMServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SLAMServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SLAMServiceStub>() {
        @java.lang.Override
        public SLAMServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SLAMServiceStub(channel, callOptions);
        }
      };
    return SLAMServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SLAMServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SLAMServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SLAMServiceBlockingStub>() {
        @java.lang.Override
        public SLAMServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SLAMServiceBlockingStub(channel, callOptions);
        }
      };
    return SLAMServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SLAMServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SLAMServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SLAMServiceFutureStub>() {
        @java.lang.Override
        public SLAMServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SLAMServiceFutureStub(channel, callOptions);
        }
      };
    return SLAMServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A SlamService declares the gRPC contract for a slam service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetPosition returns the current estimated position of the robot with
     * respect to a returned component reference.
     * </pre>
     */
    default void getPosition(com.viam.service.slam.v1.Slam.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPointCloudMap returns the latest pointcloud map available where XY is the ground
     * plane and positive Z is up, following the Right Hand Rule.
     * </pre>
     */
    default void getPointCloudMap(com.viam.service.slam.v1.Slam.GetPointCloudMapRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetPointCloudMapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPointCloudMapMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetInternalState returns the internal map as defined by the specified slam
     * algorithm required to continue mapping/localizing.
     * This endpoint is not intended for end users.
     * </pre>
     */
    default void getInternalState(com.viam.service.slam.v1.Slam.GetInternalStateRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetInternalStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInternalStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProperties returns properties of the current slam service including mapping_mode
     * and cloud_slam, where mapping_mode is the type of mapping/localizing being performed
     * and cloud_slam is a boolean representing if this SLAM service is being run in the cloud.
     * </pre>
     */
    default void getProperties(com.viam.service.slam.v1.Slam.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands.
     * </pre>
     */
    default void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoCommandMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SLAMService.
   * <pre>
   * A SlamService declares the gRPC contract for a slam service
   * </pre>
   */
  public static abstract class SLAMServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SLAMServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SLAMService.
   * <pre>
   * A SlamService declares the gRPC contract for a slam service
   * </pre>
   */
  public static final class SLAMServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SLAMServiceStub> {
    private SLAMServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SLAMServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SLAMServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPosition returns the current estimated position of the robot with
     * respect to a returned component reference.
     * </pre>
     */
    public void getPosition(com.viam.service.slam.v1.Slam.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPointCloudMap returns the latest pointcloud map available where XY is the ground
     * plane and positive Z is up, following the Right Hand Rule.
     * </pre>
     */
    public void getPointCloudMap(com.viam.service.slam.v1.Slam.GetPointCloudMapRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetPointCloudMapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetPointCloudMapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetInternalState returns the internal map as defined by the specified slam
     * algorithm required to continue mapping/localizing.
     * This endpoint is not intended for end users.
     * </pre>
     */
    public void getInternalState(com.viam.service.slam.v1.Slam.GetInternalStateRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetInternalStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetInternalStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProperties returns properties of the current slam service including mapping_mode
     * and cloud_slam, where mapping_mode is the type of mapping/localizing being performed
     * and cloud_slam is a boolean representing if this SLAM service is being run in the cloud.
     * </pre>
     */
    public void getProperties(com.viam.service.slam.v1.Slam.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands.
     * </pre>
     */
    public void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SLAMService.
   * <pre>
   * A SlamService declares the gRPC contract for a slam service
   * </pre>
   */
  public static final class SLAMServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SLAMServiceBlockingStub> {
    private SLAMServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SLAMServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SLAMServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPosition returns the current estimated position of the robot with
     * respect to a returned component reference.
     * </pre>
     */
    public com.viam.service.slam.v1.Slam.GetPositionResponse getPosition(com.viam.service.slam.v1.Slam.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPointCloudMap returns the latest pointcloud map available where XY is the ground
     * plane and positive Z is up, following the Right Hand Rule.
     * </pre>
     */
    public java.util.Iterator<com.viam.service.slam.v1.Slam.GetPointCloudMapResponse> getPointCloudMap(
        com.viam.service.slam.v1.Slam.GetPointCloudMapRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetPointCloudMapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetInternalState returns the internal map as defined by the specified slam
     * algorithm required to continue mapping/localizing.
     * This endpoint is not intended for end users.
     * </pre>
     */
    public java.util.Iterator<com.viam.service.slam.v1.Slam.GetInternalStateResponse> getInternalState(
        com.viam.service.slam.v1.Slam.GetInternalStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetInternalStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProperties returns properties of the current slam service including mapping_mode
     * and cloud_slam, where mapping_mode is the type of mapping/localizing being performed
     * and cloud_slam is a boolean representing if this SLAM service is being run in the cloud.
     * </pre>
     */
    public com.viam.service.slam.v1.Slam.GetPropertiesResponse getProperties(com.viam.service.slam.v1.Slam.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands.
     * </pre>
     */
    public com.viam.common.v1.Common.DoCommandResponse doCommand(com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoCommandMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SLAMService.
   * <pre>
   * A SlamService declares the gRPC contract for a slam service
   * </pre>
   */
  public static final class SLAMServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SLAMServiceFutureStub> {
    private SLAMServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SLAMServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SLAMServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPosition returns the current estimated position of the robot with
     * respect to a returned component reference.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.slam.v1.Slam.GetPositionResponse> getPosition(
        com.viam.service.slam.v1.Slam.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProperties returns properties of the current slam service including mapping_mode
     * and cloud_slam, where mapping_mode is the type of mapping/localizing being performed
     * and cloud_slam is a boolean representing if this SLAM service is being run in the cloud.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.slam.v1.Slam.GetPropertiesResponse> getProperties(
        com.viam.service.slam.v1.Slam.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.DoCommandResponse> doCommand(
        com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POSITION = 0;
  private static final int METHODID_GET_POINT_CLOUD_MAP = 1;
  private static final int METHODID_GET_INTERNAL_STATE = 2;
  private static final int METHODID_GET_PROPERTIES = 3;
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
        case METHODID_GET_POSITION:
          serviceImpl.getPosition((com.viam.service.slam.v1.Slam.GetPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetPositionResponse>) responseObserver);
          break;
        case METHODID_GET_POINT_CLOUD_MAP:
          serviceImpl.getPointCloudMap((com.viam.service.slam.v1.Slam.GetPointCloudMapRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetPointCloudMapResponse>) responseObserver);
          break;
        case METHODID_GET_INTERNAL_STATE:
          serviceImpl.getInternalState((com.viam.service.slam.v1.Slam.GetInternalStateRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetInternalStateResponse>) responseObserver);
          break;
        case METHODID_GET_PROPERTIES:
          serviceImpl.getProperties((com.viam.service.slam.v1.Slam.GetPropertiesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetPropertiesResponse>) responseObserver);
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
          getGetPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.slam.v1.Slam.GetPositionRequest,
              com.viam.service.slam.v1.Slam.GetPositionResponse>(
                service, METHODID_GET_POSITION)))
        .addMethod(
          getGetPointCloudMapMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.viam.service.slam.v1.Slam.GetPointCloudMapRequest,
              com.viam.service.slam.v1.Slam.GetPointCloudMapResponse>(
                service, METHODID_GET_POINT_CLOUD_MAP)))
        .addMethod(
          getGetInternalStateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.viam.service.slam.v1.Slam.GetInternalStateRequest,
              com.viam.service.slam.v1.Slam.GetInternalStateResponse>(
                service, METHODID_GET_INTERNAL_STATE)))
        .addMethod(
          getGetPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.slam.v1.Slam.GetPropertiesRequest,
              com.viam.service.slam.v1.Slam.GetPropertiesResponse>(
                service, METHODID_GET_PROPERTIES)))
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
      synchronized (SLAMServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetPositionMethod())
              .addMethod(getGetPointCloudMapMethod())
              .addMethod(getGetInternalStateMethod())
              .addMethod(getGetPropertiesMethod())
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
