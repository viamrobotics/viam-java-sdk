package com.viam.rdk.proto.api.service.status.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A StatusService services keeps track of all status associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/api/service/status/v1/status.proto")
public final class StatusServiceGrpc {

  private StatusServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.api.service.status.v1.StatusService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusRequest,
      com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusResponse> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatus",
      requestType = com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusRequest.class,
      responseType = com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusRequest,
      com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusResponse> getGetStatusMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusRequest, com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusResponse> getGetStatusMethod;
    if ((getGetStatusMethod = StatusServiceGrpc.getGetStatusMethod) == null) {
      synchronized (StatusServiceGrpc.class) {
        if ((getGetStatusMethod = StatusServiceGrpc.getGetStatusMethod) == null) {
          StatusServiceGrpc.getGetStatusMethod = getGetStatusMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusRequest, com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StatusServiceMethodDescriptorSupplier("GetStatus"))
              .build();
        }
      }
    }
    return getGetStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusRequest,
      com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusResponse> getStreamStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamStatus",
      requestType = com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusRequest.class,
      responseType = com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusRequest,
      com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusResponse> getStreamStatusMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusRequest, com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusResponse> getStreamStatusMethod;
    if ((getStreamStatusMethod = StatusServiceGrpc.getStreamStatusMethod) == null) {
      synchronized (StatusServiceGrpc.class) {
        if ((getStreamStatusMethod = StatusServiceGrpc.getStreamStatusMethod) == null) {
          StatusServiceGrpc.getStreamStatusMethod = getStreamStatusMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusRequest, com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StatusServiceMethodDescriptorSupplier("StreamStatus"))
              .build();
        }
      }
    }
    return getStreamStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StatusServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatusServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatusServiceStub>() {
        @java.lang.Override
        public StatusServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatusServiceStub(channel, callOptions);
        }
      };
    return StatusServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StatusServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatusServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatusServiceBlockingStub>() {
        @java.lang.Override
        public StatusServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatusServiceBlockingStub(channel, callOptions);
        }
      };
    return StatusServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StatusServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatusServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatusServiceFutureStub>() {
        @java.lang.Override
        public StatusServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatusServiceFutureStub(channel, callOptions);
        }
      };
    return StatusServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A StatusService services keeps track of all status associated with a robot
   * </pre>
   */
  public static abstract class StatusServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetStatus returns the list of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public void getStatus(com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * StreamStatus periodically sends the status of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public void streamStatus(com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusRequest,
                com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusResponse>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            getStreamStatusMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusRequest,
                com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusResponse>(
                  this, METHODID_STREAM_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * A StatusService services keeps track of all status associated with a robot
   * </pre>
   */
  public static final class StatusServiceStub extends io.grpc.stub.AbstractAsyncStub<StatusServiceStub> {
    private StatusServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatusServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatusServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetStatus returns the list of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public void getStatus(com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StreamStatus periodically sends the status of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public void streamStatus(com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A StatusService services keeps track of all status associated with a robot
   * </pre>
   */
  public static final class StatusServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StatusServiceBlockingStub> {
    private StatusServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatusServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatusServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetStatus returns the list of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusResponse getStatus(com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StreamStatus periodically sends the status of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public java.util.Iterator<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusResponse> streamStatus(
        com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A StatusService services keeps track of all status associated with a robot
   * </pre>
   */
  public static final class StatusServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StatusServiceFutureStub> {
    private StatusServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatusServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatusServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetStatus returns the list of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusResponse> getStatus(
        com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATUS = 0;
  private static final int METHODID_STREAM_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StatusServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StatusServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.GetStatusResponse>) responseObserver);
          break;
        case METHODID_STREAM_STATUS:
          serviceImpl.streamStatus((com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.StreamStatusResponse>) responseObserver);
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

  private static abstract class StatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StatusServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.rdk.proto.api.service.status.v1.StatusOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StatusService");
    }
  }

  private static final class StatusServiceFileDescriptorSupplier
      extends StatusServiceBaseDescriptorSupplier {
    StatusServiceFileDescriptorSupplier() {}
  }

  private static final class StatusServiceMethodDescriptorSupplier
      extends StatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StatusServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StatusServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StatusServiceFileDescriptorSupplier())
              .addMethod(getGetStatusMethod())
              .addMethod(getStreamStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
