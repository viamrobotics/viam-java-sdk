package com.viam.component.camera.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A CameraService services all cameras associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: component/camera/v1/camera.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CameraServiceGrpc {

  private CameraServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.camera.v1.CameraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.camera.v1.Camera.GetImagesRequest,
      com.viam.component.camera.v1.Camera.GetImagesResponse> getGetImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImages",
      requestType = com.viam.component.camera.v1.Camera.GetImagesRequest.class,
      responseType = com.viam.component.camera.v1.Camera.GetImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.camera.v1.Camera.GetImagesRequest,
      com.viam.component.camera.v1.Camera.GetImagesResponse> getGetImagesMethod() {
    io.grpc.MethodDescriptor<com.viam.component.camera.v1.Camera.GetImagesRequest, com.viam.component.camera.v1.Camera.GetImagesResponse> getGetImagesMethod;
    if ((getGetImagesMethod = CameraServiceGrpc.getGetImagesMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getGetImagesMethod = CameraServiceGrpc.getGetImagesMethod) == null) {
          CameraServiceGrpc.getGetImagesMethod = getGetImagesMethod =
              io.grpc.MethodDescriptor.<com.viam.component.camera.v1.Camera.GetImagesRequest, com.viam.component.camera.v1.Camera.GetImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.camera.v1.Camera.GetImagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.camera.v1.Camera.GetImagesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetImagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.camera.v1.Camera.GetPointCloudRequest,
      com.viam.component.camera.v1.Camera.GetPointCloudResponse> getGetPointCloudMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPointCloud",
      requestType = com.viam.component.camera.v1.Camera.GetPointCloudRequest.class,
      responseType = com.viam.component.camera.v1.Camera.GetPointCloudResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.camera.v1.Camera.GetPointCloudRequest,
      com.viam.component.camera.v1.Camera.GetPointCloudResponse> getGetPointCloudMethod() {
    io.grpc.MethodDescriptor<com.viam.component.camera.v1.Camera.GetPointCloudRequest, com.viam.component.camera.v1.Camera.GetPointCloudResponse> getGetPointCloudMethod;
    if ((getGetPointCloudMethod = CameraServiceGrpc.getGetPointCloudMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getGetPointCloudMethod = CameraServiceGrpc.getGetPointCloudMethod) == null) {
          CameraServiceGrpc.getGetPointCloudMethod = getGetPointCloudMethod =
              io.grpc.MethodDescriptor.<com.viam.component.camera.v1.Camera.GetPointCloudRequest, com.viam.component.camera.v1.Camera.GetPointCloudResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPointCloud"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.camera.v1.Camera.GetPointCloudRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.camera.v1.Camera.GetPointCloudResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPointCloudMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.camera.v1.Camera.GetPropertiesRequest,
      com.viam.component.camera.v1.Camera.GetPropertiesResponse> getGetPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProperties",
      requestType = com.viam.component.camera.v1.Camera.GetPropertiesRequest.class,
      responseType = com.viam.component.camera.v1.Camera.GetPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.camera.v1.Camera.GetPropertiesRequest,
      com.viam.component.camera.v1.Camera.GetPropertiesResponse> getGetPropertiesMethod() {
    io.grpc.MethodDescriptor<com.viam.component.camera.v1.Camera.GetPropertiesRequest, com.viam.component.camera.v1.Camera.GetPropertiesResponse> getGetPropertiesMethod;
    if ((getGetPropertiesMethod = CameraServiceGrpc.getGetPropertiesMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getGetPropertiesMethod = CameraServiceGrpc.getGetPropertiesMethod) == null) {
          CameraServiceGrpc.getGetPropertiesMethod = getGetPropertiesMethod =
              io.grpc.MethodDescriptor.<com.viam.component.camera.v1.Camera.GetPropertiesRequest, com.viam.component.camera.v1.Camera.GetPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.camera.v1.Camera.GetPropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.camera.v1.Camera.GetPropertiesResponse.getDefaultInstance()))
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
    if ((getDoCommandMethod = CameraServiceGrpc.getDoCommandMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getDoCommandMethod = CameraServiceGrpc.getDoCommandMethod) == null) {
          CameraServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetStatusRequest,
      com.viam.common.v1.Common.GetStatusResponse> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatus",
      requestType = com.viam.common.v1.Common.GetStatusRequest.class,
      responseType = com.viam.common.v1.Common.GetStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetStatusRequest,
      com.viam.common.v1.Common.GetStatusResponse> getGetStatusMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetStatusRequest, com.viam.common.v1.Common.GetStatusResponse> getGetStatusMethod;
    if ((getGetStatusMethod = CameraServiceGrpc.getGetStatusMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getGetStatusMethod = CameraServiceGrpc.getGetStatusMethod) == null) {
          CameraServiceGrpc.getGetStatusMethod = getGetStatusMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.GetStatusRequest, com.viam.common.v1.Common.GetStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetStatusMethod;
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
    if ((getGetGeometriesMethod = CameraServiceGrpc.getGetGeometriesMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getGetGeometriesMethod = CameraServiceGrpc.getGetGeometriesMethod) == null) {
          CameraServiceGrpc.getGetGeometriesMethod = getGetGeometriesMethod =
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

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CameraServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServiceStub>() {
        @java.lang.Override
        public CameraServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServiceStub(channel, callOptions);
        }
      };
    return CameraServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CameraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServiceBlockingStub>() {
        @java.lang.Override
        public CameraServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServiceBlockingStub(channel, callOptions);
        }
      };
    return CameraServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CameraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServiceFutureStub>() {
        @java.lang.Override
        public CameraServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServiceFutureStub(channel, callOptions);
        }
      };
    return CameraServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A CameraService services all cameras associated with a robot
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getImages(com.viam.component.camera.v1.Camera.GetImagesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.camera.v1.Camera.GetImagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetImagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPointCloud returns a point cloud from a camera of the underlying robot. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    default void getPointCloud(com.viam.component.camera.v1.Camera.GetPointCloudRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.camera.v1.Camera.GetPointCloudResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPointCloudMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProperties returns the camera intrinsic parameters, camera distortion parameters, and extrinsic parameters from a camera of the underlying robot, if available.
     * </pre>
     */
    default void getProperties(com.viam.component.camera.v1.Camera.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.camera.v1.Camera.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPropertiesMethod(), responseObserver);
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
     * GetStatus returns the status of the resource
     * </pre>
     */
    default void getStatus(com.viam.common.v1.Common.GetStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
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
   * Base class for the server implementation of the service CameraService.
   * <pre>
   * A CameraService services all cameras associated with a robot
   * </pre>
   */
  public static abstract class CameraServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CameraServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CameraService.
   * <pre>
   * A CameraService services all cameras associated with a robot
   * </pre>
   */
  public static final class CameraServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CameraServiceStub> {
    private CameraServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServiceStub(channel, callOptions);
    }

    /**
     */
    public void getImages(com.viam.component.camera.v1.Camera.GetImagesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.camera.v1.Camera.GetImagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetImagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPointCloud returns a point cloud from a camera of the underlying robot. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public void getPointCloud(com.viam.component.camera.v1.Camera.GetPointCloudRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.camera.v1.Camera.GetPointCloudResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPointCloudMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProperties returns the camera intrinsic parameters, camera distortion parameters, and extrinsic parameters from a camera of the underlying robot, if available.
     * </pre>
     */
    public void getProperties(com.viam.component.camera.v1.Camera.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.camera.v1.Camera.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request, responseObserver);
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
     * GetStatus returns the status of the resource
     * </pre>
     */
    public void getStatus(com.viam.common.v1.Common.GetStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
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
   * A stub to allow clients to do synchronous rpc calls to service CameraService.
   * <pre>
   * A CameraService services all cameras associated with a robot
   * </pre>
   */
  public static final class CameraServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CameraServiceBlockingStub> {
    private CameraServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.viam.component.camera.v1.Camera.GetImagesResponse getImages(com.viam.component.camera.v1.Camera.GetImagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetImagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPointCloud returns a point cloud from a camera of the underlying robot. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public com.viam.component.camera.v1.Camera.GetPointCloudResponse getPointCloud(com.viam.component.camera.v1.Camera.GetPointCloudRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPointCloudMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProperties returns the camera intrinsic parameters, camera distortion parameters, and extrinsic parameters from a camera of the underlying robot, if available.
     * </pre>
     */
    public com.viam.component.camera.v1.Camera.GetPropertiesResponse getProperties(com.viam.component.camera.v1.Camera.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPropertiesMethod(), getCallOptions(), request);
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
     * GetStatus returns the status of the resource
     * </pre>
     */
    public com.viam.common.v1.Common.GetStatusResponse getStatus(com.viam.common.v1.Common.GetStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CameraService.
   * <pre>
   * A CameraService services all cameras associated with a robot
   * </pre>
   */
  public static final class CameraServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CameraServiceFutureStub> {
    private CameraServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.camera.v1.Camera.GetImagesResponse> getImages(
        com.viam.component.camera.v1.Camera.GetImagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetImagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPointCloud returns a point cloud from a camera of the underlying robot. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.camera.v1.Camera.GetPointCloudResponse> getPointCloud(
        com.viam.component.camera.v1.Camera.GetPointCloudRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPointCloudMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProperties returns the camera intrinsic parameters, camera distortion parameters, and extrinsic parameters from a camera of the underlying robot, if available.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.camera.v1.Camera.GetPropertiesResponse> getProperties(
        com.viam.component.camera.v1.Camera.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request);
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
     * GetStatus returns the status of the resource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.GetStatusResponse> getStatus(
        com.viam.common.v1.Common.GetStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
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

  private static final int METHODID_GET_IMAGES = 0;
  private static final int METHODID_GET_POINT_CLOUD = 1;
  private static final int METHODID_GET_PROPERTIES = 2;
  private static final int METHODID_DO_COMMAND = 3;
  private static final int METHODID_GET_STATUS = 4;
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
        case METHODID_GET_IMAGES:
          serviceImpl.getImages((com.viam.component.camera.v1.Camera.GetImagesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.camera.v1.Camera.GetImagesResponse>) responseObserver);
          break;
        case METHODID_GET_POINT_CLOUD:
          serviceImpl.getPointCloud((com.viam.component.camera.v1.Camera.GetPointCloudRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.camera.v1.Camera.GetPointCloudResponse>) responseObserver);
          break;
        case METHODID_GET_PROPERTIES:
          serviceImpl.getProperties((com.viam.component.camera.v1.Camera.GetPropertiesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.camera.v1.Camera.GetPropertiesResponse>) responseObserver);
          break;
        case METHODID_DO_COMMAND:
          serviceImpl.doCommand((com.viam.common.v1.Common.DoCommandRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((com.viam.common.v1.Common.GetStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetStatusResponse>) responseObserver);
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
          getGetImagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.camera.v1.Camera.GetImagesRequest,
              com.viam.component.camera.v1.Camera.GetImagesResponse>(
                service, METHODID_GET_IMAGES)))
        .addMethod(
          getGetPointCloudMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.camera.v1.Camera.GetPointCloudRequest,
              com.viam.component.camera.v1.Camera.GetPointCloudResponse>(
                service, METHODID_GET_POINT_CLOUD)))
        .addMethod(
          getGetPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.camera.v1.Camera.GetPropertiesRequest,
              com.viam.component.camera.v1.Camera.GetPropertiesResponse>(
                service, METHODID_GET_PROPERTIES)))
        .addMethod(
          getDoCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.DoCommandRequest,
              com.viam.common.v1.Common.DoCommandResponse>(
                service, METHODID_DO_COMMAND)))
        .addMethod(
          getGetStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.GetStatusRequest,
              com.viam.common.v1.Common.GetStatusResponse>(
                service, METHODID_GET_STATUS)))
        .addMethod(
          getGetGeometriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.GetGeometriesRequest,
              com.viam.common.v1.Common.GetGeometriesResponse>(
                service, METHODID_GET_GEOMETRIES)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CameraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetImagesMethod())
              .addMethod(getGetPointCloudMethod())
              .addMethod(getGetPropertiesMethod())
              .addMethod(getDoCommandMethod())
              .addMethod(getGetStatusMethod())
              .addMethod(getGetGeometriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
