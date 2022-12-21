package com.viam.component.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A PoseTrackerService maintains all pose trackers associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: component/posetracker/v1/pose_tracker.proto")
public final class PoseTrackerServiceGrpc {

  private PoseTrackerServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.component.posetracker.v1.PoseTrackerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.v1.PoseTracker.GetPosesRequest,
      com.viam.component.v1.PoseTracker.GetPosesResponse> getGetPosesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPoses",
      requestType = com.viam.component.v1.PoseTracker.GetPosesRequest.class,
      responseType = com.viam.component.v1.PoseTracker.GetPosesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.v1.PoseTracker.GetPosesRequest,
      com.viam.component.v1.PoseTracker.GetPosesResponse> getGetPosesMethod() {
    io.grpc.MethodDescriptor<com.viam.component.v1.PoseTracker.GetPosesRequest, com.viam.component.v1.PoseTracker.GetPosesResponse> getGetPosesMethod;
    if ((getGetPosesMethod = PoseTrackerServiceGrpc.getGetPosesMethod) == null) {
      synchronized (PoseTrackerServiceGrpc.class) {
        if ((getGetPosesMethod = PoseTrackerServiceGrpc.getGetPosesMethod) == null) {
          PoseTrackerServiceGrpc.getGetPosesMethod = getGetPosesMethod =
              io.grpc.MethodDescriptor.<com.viam.component.v1.PoseTracker.GetPosesRequest, com.viam.component.v1.PoseTracker.GetPosesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPoses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.v1.PoseTracker.GetPosesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.v1.PoseTracker.GetPosesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoseTrackerServiceMethodDescriptorSupplier("GetPoses"))
              .build();
        }
      }
    }
    return getGetPosesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PoseTrackerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PoseTrackerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PoseTrackerServiceStub>() {
        @java.lang.Override
        public PoseTrackerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PoseTrackerServiceStub(channel, callOptions);
        }
      };
    return PoseTrackerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PoseTrackerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PoseTrackerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PoseTrackerServiceBlockingStub>() {
        @java.lang.Override
        public PoseTrackerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PoseTrackerServiceBlockingStub(channel, callOptions);
        }
      };
    return PoseTrackerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PoseTrackerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PoseTrackerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PoseTrackerServiceFutureStub>() {
        @java.lang.Override
        public PoseTrackerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PoseTrackerServiceFutureStub(channel, callOptions);
        }
      };
    return PoseTrackerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A PoseTrackerService maintains all pose trackers associated with a robot
   * </pre>
   */
  public static abstract class PoseTrackerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetPoses returns the current pose of each body tracked by the pose tracker
     * </pre>
     */
    public void getPoses(com.viam.component.v1.PoseTracker.GetPosesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.v1.PoseTracker.GetPosesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPosesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPosesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.v1.PoseTracker.GetPosesRequest,
                com.viam.component.v1.PoseTracker.GetPosesResponse>(
                  this, METHODID_GET_POSES)))
          .build();
    }
  }

  /**
   * <pre>
   * A PoseTrackerService maintains all pose trackers associated with a robot
   * </pre>
   */
  public static final class PoseTrackerServiceStub extends io.grpc.stub.AbstractAsyncStub<PoseTrackerServiceStub> {
    private PoseTrackerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoseTrackerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PoseTrackerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPoses returns the current pose of each body tracked by the pose tracker
     * </pre>
     */
    public void getPoses(com.viam.component.v1.PoseTracker.GetPosesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.v1.PoseTracker.GetPosesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPosesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A PoseTrackerService maintains all pose trackers associated with a robot
   * </pre>
   */
  public static final class PoseTrackerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PoseTrackerServiceBlockingStub> {
    private PoseTrackerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoseTrackerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PoseTrackerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPoses returns the current pose of each body tracked by the pose tracker
     * </pre>
     */
    public com.viam.component.v1.PoseTracker.GetPosesResponse getPoses(com.viam.component.v1.PoseTracker.GetPosesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPosesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A PoseTrackerService maintains all pose trackers associated with a robot
   * </pre>
   */
  public static final class PoseTrackerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PoseTrackerServiceFutureStub> {
    private PoseTrackerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoseTrackerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PoseTrackerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPoses returns the current pose of each body tracked by the pose tracker
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.v1.PoseTracker.GetPosesResponse> getPoses(
        com.viam.component.v1.PoseTracker.GetPosesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPosesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POSES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PoseTrackerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PoseTrackerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POSES:
          serviceImpl.getPoses((com.viam.component.v1.PoseTracker.GetPosesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.v1.PoseTracker.GetPosesResponse>) responseObserver);
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

  private static abstract class PoseTrackerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PoseTrackerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.component.v1.PoseTracker.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PoseTrackerService");
    }
  }

  private static final class PoseTrackerServiceFileDescriptorSupplier
      extends PoseTrackerServiceBaseDescriptorSupplier {
    PoseTrackerServiceFileDescriptorSupplier() {}
  }

  private static final class PoseTrackerServiceMethodDescriptorSupplier
      extends PoseTrackerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PoseTrackerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PoseTrackerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PoseTrackerServiceFileDescriptorSupplier())
              .addMethod(getGetPosesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
