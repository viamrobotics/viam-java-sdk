package com.viam.rdk.proto.api.component.gripper.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An GripperService services all grippers associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/api/component/gripper/v1/gripper.proto")
public final class GripperServiceGrpc {

  private GripperServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.api.component.gripper.v1.GripperService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenRequest,
      com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenResponse> getOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Open",
      requestType = com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenRequest.class,
      responseType = com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenRequest,
      com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenResponse> getOpenMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenRequest, com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenResponse> getOpenMethod;
    if ((getOpenMethod = GripperServiceGrpc.getOpenMethod) == null) {
      synchronized (GripperServiceGrpc.class) {
        if ((getOpenMethod = GripperServiceGrpc.getOpenMethod) == null) {
          GripperServiceGrpc.getOpenMethod = getOpenMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenRequest, com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Open"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GripperServiceMethodDescriptorSupplier("Open"))
              .build();
        }
      }
    }
    return getOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabRequest,
      com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabResponse> getGrabMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Grab",
      requestType = com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabRequest.class,
      responseType = com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabRequest,
      com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabResponse> getGrabMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabRequest, com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabResponse> getGrabMethod;
    if ((getGrabMethod = GripperServiceGrpc.getGrabMethod) == null) {
      synchronized (GripperServiceGrpc.class) {
        if ((getGrabMethod = GripperServiceGrpc.getGrabMethod) == null) {
          GripperServiceGrpc.getGrabMethod = getGrabMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabRequest, com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Grab"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GripperServiceMethodDescriptorSupplier("Grab"))
              .build();
        }
      }
    }
    return getGrabMethod;
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
  public static abstract class GripperServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Open opens a gripper of the underlying robot.
     * </pre>
     */
    public void open(com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Grab requests a gripper of the underlying robot to grab.
     * </pre>
     */
    public void grab(com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGrabMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenRequest,
                com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenResponse>(
                  this, METHODID_OPEN)))
          .addMethod(
            getGrabMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabRequest,
                com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabResponse>(
                  this, METHODID_GRAB)))
          .build();
    }
  }

  /**
   * <pre>
   * An GripperService services all grippers associated with a robot
   * </pre>
   */
  public static final class GripperServiceStub extends io.grpc.stub.AbstractAsyncStub<GripperServiceStub> {
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
    public void open(com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Grab requests a gripper of the underlying robot to grab.
     * </pre>
     */
    public void grab(com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGrabMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * An GripperService services all grippers associated with a robot
   * </pre>
   */
  public static final class GripperServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GripperServiceBlockingStub> {
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
    public com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenResponse open(com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Grab requests a gripper of the underlying robot to grab.
     * </pre>
     */
    public com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabResponse grab(com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGrabMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * An GripperService services all grippers associated with a robot
   * </pre>
   */
  public static final class GripperServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GripperServiceFutureStub> {
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
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenResponse> open(
        com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Grab requests a gripper of the underlying robot to grab.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabResponse> grab(
        com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGrabMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN = 0;
  private static final int METHODID_GRAB = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GripperServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GripperServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN:
          serviceImpl.open((com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gripper.v1.Gripper.OpenResponse>) responseObserver);
          break;
        case METHODID_GRAB:
          serviceImpl.grab((com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gripper.v1.Gripper.GrabResponse>) responseObserver);
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

  private static abstract class GripperServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GripperServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.rdk.proto.api.component.gripper.v1.Gripper.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GripperService");
    }
  }

  private static final class GripperServiceFileDescriptorSupplier
      extends GripperServiceBaseDescriptorSupplier {
    GripperServiceFileDescriptorSupplier() {}
  }

  private static final class GripperServiceMethodDescriptorSupplier
      extends GripperServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GripperServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GripperServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GripperServiceFileDescriptorSupplier())
              .addMethod(getOpenMethod())
              .addMethod(getGrabMethod())
              .build();
        }
      }
    }
    return result;
  }
}
