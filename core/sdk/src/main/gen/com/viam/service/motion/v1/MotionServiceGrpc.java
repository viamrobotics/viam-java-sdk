package com.viam.service.motion.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A MotionService declares the gRPC contract for a motion service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: service/motion/v1/motion.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MotionServiceGrpc {

  private MotionServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.service.motion.v1.MotionService";

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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.motion.v1.Motion.MoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.motion.v1.Motion.MoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.MoveSingleComponentRequest,
      com.viam.service.motion.v1.Motion.MoveSingleComponentResponse> getMoveSingleComponentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveSingleComponent",
      requestType = com.viam.service.motion.v1.Motion.MoveSingleComponentRequest.class,
      responseType = com.viam.service.motion.v1.Motion.MoveSingleComponentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.MoveSingleComponentRequest,
      com.viam.service.motion.v1.Motion.MoveSingleComponentResponse> getMoveSingleComponentMethod() {
    io.grpc.MethodDescriptor<com.viam.service.motion.v1.Motion.MoveSingleComponentRequest, com.viam.service.motion.v1.Motion.MoveSingleComponentResponse> getMoveSingleComponentMethod;
    if ((getMoveSingleComponentMethod = MotionServiceGrpc.getMoveSingleComponentMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getMoveSingleComponentMethod = MotionServiceGrpc.getMoveSingleComponentMethod) == null) {
          MotionServiceGrpc.getMoveSingleComponentMethod = getMoveSingleComponentMethod =
              io.grpc.MethodDescriptor.<com.viam.service.motion.v1.Motion.MoveSingleComponentRequest, com.viam.service.motion.v1.Motion.MoveSingleComponentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveSingleComponent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.motion.v1.Motion.MoveSingleComponentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.motion.v1.Motion.MoveSingleComponentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("MoveSingleComponent"))
              .build();
        }
      }
    }
    return getMoveSingleComponentMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.motion.v1.Motion.GetPoseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.motion.v1.Motion.GetPoseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("GetPose"))
              .build();
        }
      }
    }
    return getGetPoseMethod;
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
  public static abstract class MotionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void move(com.viam.service.motion.v1.Motion.MoveRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.MoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     */
    public void moveSingleComponent(com.viam.service.motion.v1.Motion.MoveSingleComponentRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.MoveSingleComponentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveSingleComponentMethod(), responseObserver);
    }

    /**
     */
    public void getPose(com.viam.service.motion.v1.Motion.GetPoseRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.GetPoseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPoseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.motion.v1.Motion.MoveRequest,
                com.viam.service.motion.v1.Motion.MoveResponse>(
                  this, METHODID_MOVE)))
          .addMethod(
            getMoveSingleComponentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.motion.v1.Motion.MoveSingleComponentRequest,
                com.viam.service.motion.v1.Motion.MoveSingleComponentResponse>(
                  this, METHODID_MOVE_SINGLE_COMPONENT)))
          .addMethod(
            getGetPoseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.motion.v1.Motion.GetPoseRequest,
                com.viam.service.motion.v1.Motion.GetPoseResponse>(
                  this, METHODID_GET_POSE)))
          .build();
    }
  }

  /**
   * <pre>
   * A MotionService declares the gRPC contract for a motion service
   * </pre>
   */
  public static final class MotionServiceStub extends io.grpc.stub.AbstractAsyncStub<MotionServiceStub> {
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
     */
    public void moveSingleComponent(com.viam.service.motion.v1.Motion.MoveSingleComponentRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.MoveSingleComponentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveSingleComponentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPose(com.viam.service.motion.v1.Motion.GetPoseRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.GetPoseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPoseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A MotionService declares the gRPC contract for a motion service
   * </pre>
   */
  public static final class MotionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MotionServiceBlockingStub> {
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
     */
    public com.viam.service.motion.v1.Motion.MoveSingleComponentResponse moveSingleComponent(com.viam.service.motion.v1.Motion.MoveSingleComponentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveSingleComponentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.service.motion.v1.Motion.GetPoseResponse getPose(com.viam.service.motion.v1.Motion.GetPoseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPoseMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A MotionService declares the gRPC contract for a motion service
   * </pre>
   */
  public static final class MotionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MotionServiceFutureStub> {
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.motion.v1.Motion.MoveSingleComponentResponse> moveSingleComponent(
        com.viam.service.motion.v1.Motion.MoveSingleComponentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveSingleComponentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.motion.v1.Motion.GetPoseResponse> getPose(
        com.viam.service.motion.v1.Motion.GetPoseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPoseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MOVE = 0;
  private static final int METHODID_MOVE_SINGLE_COMPONENT = 1;
  private static final int METHODID_GET_POSE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MotionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MotionServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_MOVE_SINGLE_COMPONENT:
          serviceImpl.moveSingleComponent((com.viam.service.motion.v1.Motion.MoveSingleComponentRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.MoveSingleComponentResponse>) responseObserver);
          break;
        case METHODID_GET_POSE:
          serviceImpl.getPose((com.viam.service.motion.v1.Motion.GetPoseRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.motion.v1.Motion.GetPoseResponse>) responseObserver);
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

  private static abstract class MotionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MotionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.service.motion.v1.Motion.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MotionService");
    }
  }

  private static final class MotionServiceFileDescriptorSupplier
      extends MotionServiceBaseDescriptorSupplier {
    MotionServiceFileDescriptorSupplier() {}
  }

  private static final class MotionServiceMethodDescriptorSupplier
      extends MotionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MotionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MotionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MotionServiceFileDescriptorSupplier())
              .addMethod(getMoveMethod())
              .addMethod(getMoveSingleComponentMethod())
              .addMethod(getGetPoseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
