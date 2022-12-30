package com.viam.service.slam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A SlamService declares the gRPC contract for a slam service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: service/slam/v1/slam.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SLAMServiceGrpc {

  private SLAMServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.service.slam.v1.SLAMService";

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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.slam.v1.Slam.GetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.slam.v1.Slam.GetPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SLAMServiceMethodDescriptorSupplier("GetPosition"))
              .build();
        }
      }
    }
    return getGetPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetMapRequest,
      com.viam.service.slam.v1.Slam.GetMapResponse> getGetMapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMap",
      requestType = com.viam.service.slam.v1.Slam.GetMapRequest.class,
      responseType = com.viam.service.slam.v1.Slam.GetMapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetMapRequest,
      com.viam.service.slam.v1.Slam.GetMapResponse> getGetMapMethod() {
    io.grpc.MethodDescriptor<com.viam.service.slam.v1.Slam.GetMapRequest, com.viam.service.slam.v1.Slam.GetMapResponse> getGetMapMethod;
    if ((getGetMapMethod = SLAMServiceGrpc.getGetMapMethod) == null) {
      synchronized (SLAMServiceGrpc.class) {
        if ((getGetMapMethod = SLAMServiceGrpc.getGetMapMethod) == null) {
          SLAMServiceGrpc.getGetMapMethod = getGetMapMethod =
              io.grpc.MethodDescriptor.<com.viam.service.slam.v1.Slam.GetMapRequest, com.viam.service.slam.v1.Slam.GetMapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.slam.v1.Slam.GetMapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.slam.v1.Slam.GetMapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SLAMServiceMethodDescriptorSupplier("GetMap"))
              .build();
        }
      }
    }
    return getGetMapMethod;
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
  public static abstract class SLAMServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetPosition returns the current estimated position of the robot with
     * respect to the "origin" of the map.
     * </pre>
     */
    public void getPosition(com.viam.service.slam.v1.Slam.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMap returns the latest map image or point cloud generated by the
     * SLAM library
     * </pre>
     */
    public void getMap(com.viam.service.slam.v1.Slam.GetMapRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetMapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMapMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPositionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.slam.v1.Slam.GetPositionRequest,
                com.viam.service.slam.v1.Slam.GetPositionResponse>(
                  this, METHODID_GET_POSITION)))
          .addMethod(
            getGetMapMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.slam.v1.Slam.GetMapRequest,
                com.viam.service.slam.v1.Slam.GetMapResponse>(
                  this, METHODID_GET_MAP)))
          .build();
    }
  }

  /**
   * <pre>
   * A SlamService declares the gRPC contract for a slam service
   * </pre>
   */
  public static final class SLAMServiceStub extends io.grpc.stub.AbstractAsyncStub<SLAMServiceStub> {
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
     * respect to the "origin" of the map.
     * </pre>
     */
    public void getPosition(com.viam.service.slam.v1.Slam.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMap returns the latest map image or point cloud generated by the
     * SLAM library
     * </pre>
     */
    public void getMap(com.viam.service.slam.v1.Slam.GetMapRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetMapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMapMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A SlamService declares the gRPC contract for a slam service
   * </pre>
   */
  public static final class SLAMServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SLAMServiceBlockingStub> {
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
     * respect to the "origin" of the map.
     * </pre>
     */
    public com.viam.service.slam.v1.Slam.GetPositionResponse getPosition(com.viam.service.slam.v1.Slam.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMap returns the latest map image or point cloud generated by the
     * SLAM library
     * </pre>
     */
    public com.viam.service.slam.v1.Slam.GetMapResponse getMap(com.viam.service.slam.v1.Slam.GetMapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMapMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A SlamService declares the gRPC contract for a slam service
   * </pre>
   */
  public static final class SLAMServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SLAMServiceFutureStub> {
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
     * respect to the "origin" of the map.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.slam.v1.Slam.GetPositionResponse> getPosition(
        com.viam.service.slam.v1.Slam.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetMap returns the latest map image or point cloud generated by the
     * SLAM library
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.slam.v1.Slam.GetMapResponse> getMap(
        com.viam.service.slam.v1.Slam.GetMapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMapMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POSITION = 0;
  private static final int METHODID_GET_MAP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SLAMServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SLAMServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_GET_MAP:
          serviceImpl.getMap((com.viam.service.slam.v1.Slam.GetMapRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.slam.v1.Slam.GetMapResponse>) responseObserver);
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

  private static abstract class SLAMServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SLAMServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.service.slam.v1.Slam.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SLAMService");
    }
  }

  private static final class SLAMServiceFileDescriptorSupplier
      extends SLAMServiceBaseDescriptorSupplier {
    SLAMServiceFileDescriptorSupplier() {}
  }

  private static final class SLAMServiceMethodDescriptorSupplier
      extends SLAMServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SLAMServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SLAMServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SLAMServiceFileDescriptorSupplier())
              .addMethod(getGetPositionMethod())
              .addMethod(getGetMapMethod())
              .build();
        }
      }
    }
    return result;
  }
}
