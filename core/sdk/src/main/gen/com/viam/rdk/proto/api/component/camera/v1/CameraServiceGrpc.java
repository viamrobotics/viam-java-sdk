package com.viam.rdk.proto.api.component.camera.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A CameraService services all cameras associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/api/component/camera/v1/camera.proto")
public final class CameraServiceGrpc {

  private CameraServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.api.component.camera.v1.CameraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameRequest,
      com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameResponse> getGetFrameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFrame",
      requestType = com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameRequest.class,
      responseType = com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameRequest,
      com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameResponse> getGetFrameMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameRequest, com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameResponse> getGetFrameMethod;
    if ((getGetFrameMethod = CameraServiceGrpc.getGetFrameMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getGetFrameMethod = CameraServiceGrpc.getGetFrameMethod) == null) {
          CameraServiceGrpc.getGetFrameMethod = getGetFrameMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameRequest, com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFrame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CameraServiceMethodDescriptorSupplier("GetFrame"))
              .build();
        }
      }
    }
    return getGetFrameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.camera.v1.Camera.RenderFrameRequest,
      com.google.api.HttpBody> getRenderFrameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenderFrame",
      requestType = com.viam.rdk.proto.api.component.camera.v1.Camera.RenderFrameRequest.class,
      responseType = com.google.api.HttpBody.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.camera.v1.Camera.RenderFrameRequest,
      com.google.api.HttpBody> getRenderFrameMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.camera.v1.Camera.RenderFrameRequest, com.google.api.HttpBody> getRenderFrameMethod;
    if ((getRenderFrameMethod = CameraServiceGrpc.getRenderFrameMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getRenderFrameMethod = CameraServiceGrpc.getRenderFrameMethod) == null) {
          CameraServiceGrpc.getRenderFrameMethod = getRenderFrameMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.camera.v1.Camera.RenderFrameRequest, com.google.api.HttpBody>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenderFrame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.camera.v1.Camera.RenderFrameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.api.HttpBody.getDefaultInstance()))
              .setSchemaDescriptor(new CameraServiceMethodDescriptorSupplier("RenderFrame"))
              .build();
        }
      }
    }
    return getRenderFrameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudRequest,
      com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudResponse> getGetPointCloudMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPointCloud",
      requestType = com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudRequest.class,
      responseType = com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudRequest,
      com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudResponse> getGetPointCloudMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudRequest, com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudResponse> getGetPointCloudMethod;
    if ((getGetPointCloudMethod = CameraServiceGrpc.getGetPointCloudMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getGetPointCloudMethod = CameraServiceGrpc.getGetPointCloudMethod) == null) {
          CameraServiceGrpc.getGetPointCloudMethod = getGetPointCloudMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudRequest, com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPointCloud"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CameraServiceMethodDescriptorSupplier("GetPointCloud"))
              .build();
        }
      }
    }
    return getGetPointCloudMethod;
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
  public static abstract class CameraServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetFrame returns a frame from a camera of the underlying robot. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public void getFrame(com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFrameMethod(), responseObserver);
    }

    /**
     * <pre>
     * RenderFrame renders a frame from a camera of the underlying robot to an HTTP response. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public void renderFrame(com.viam.rdk.proto.api.component.camera.v1.Camera.RenderFrameRequest request,
        io.grpc.stub.StreamObserver<com.google.api.HttpBody> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenderFrameMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPointCloud returns a point cloud from a camera of the underlying robot. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public void getPointCloud(com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPointCloudMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFrameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameRequest,
                com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameResponse>(
                  this, METHODID_GET_FRAME)))
          .addMethod(
            getRenderFrameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.camera.v1.Camera.RenderFrameRequest,
                com.google.api.HttpBody>(
                  this, METHODID_RENDER_FRAME)))
          .addMethod(
            getGetPointCloudMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudRequest,
                com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudResponse>(
                  this, METHODID_GET_POINT_CLOUD)))
          .build();
    }
  }

  /**
   * <pre>
   * A CameraService services all cameras associated with a robot
   * </pre>
   */
  public static final class CameraServiceStub extends io.grpc.stub.AbstractAsyncStub<CameraServiceStub> {
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
     * <pre>
     * GetFrame returns a frame from a camera of the underlying robot. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public void getFrame(com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFrameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RenderFrame renders a frame from a camera of the underlying robot to an HTTP response. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public void renderFrame(com.viam.rdk.proto.api.component.camera.v1.Camera.RenderFrameRequest request,
        io.grpc.stub.StreamObserver<com.google.api.HttpBody> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenderFrameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPointCloud returns a point cloud from a camera of the underlying robot. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public void getPointCloud(com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPointCloudMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A CameraService services all cameras associated with a robot
   * </pre>
   */
  public static final class CameraServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CameraServiceBlockingStub> {
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
     * <pre>
     * GetFrame returns a frame from a camera of the underlying robot. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameResponse getFrame(com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFrameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RenderFrame renders a frame from a camera of the underlying robot to an HTTP response. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public com.google.api.HttpBody renderFrame(com.viam.rdk.proto.api.component.camera.v1.Camera.RenderFrameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenderFrameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPointCloud returns a point cloud from a camera of the underlying robot. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudResponse getPointCloud(com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPointCloudMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A CameraService services all cameras associated with a robot
   * </pre>
   */
  public static final class CameraServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CameraServiceFutureStub> {
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
     * <pre>
     * GetFrame returns a frame from a camera of the underlying robot. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameResponse> getFrame(
        com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFrameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RenderFrame renders a frame from a camera of the underlying robot to an HTTP response. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.api.HttpBody> renderFrame(
        com.viam.rdk.proto.api.component.camera.v1.Camera.RenderFrameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenderFrameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPointCloud returns a point cloud from a camera of the underlying robot. A specific MIME type
     * can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudResponse> getPointCloud(
        com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPointCloudMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FRAME = 0;
  private static final int METHODID_RENDER_FRAME = 1;
  private static final int METHODID_GET_POINT_CLOUD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CameraServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CameraServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FRAME:
          serviceImpl.getFrame((com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.camera.v1.Camera.GetFrameResponse>) responseObserver);
          break;
        case METHODID_RENDER_FRAME:
          serviceImpl.renderFrame((com.viam.rdk.proto.api.component.camera.v1.Camera.RenderFrameRequest) request,
              (io.grpc.stub.StreamObserver<com.google.api.HttpBody>) responseObserver);
          break;
        case METHODID_GET_POINT_CLOUD:
          serviceImpl.getPointCloud((com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.camera.v1.Camera.GetPointCloudResponse>) responseObserver);
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

  private static abstract class CameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CameraServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.rdk.proto.api.component.camera.v1.Camera.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CameraService");
    }
  }

  private static final class CameraServiceFileDescriptorSupplier
      extends CameraServiceBaseDescriptorSupplier {
    CameraServiceFileDescriptorSupplier() {}
  }

  private static final class CameraServiceMethodDescriptorSupplier
      extends CameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CameraServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CameraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CameraServiceFileDescriptorSupplier())
              .addMethod(getGetFrameMethod())
              .addMethod(getRenderFrameMethod())
              .addMethod(getGetPointCloudMethod())
              .build();
        }
      }
    }
    return result;
  }
}
