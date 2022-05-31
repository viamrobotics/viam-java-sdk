package proto.stream.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A StreamService is used to coordinate with a WebRTC the listing,
 * addition, and removal of registered video streams.
 * TODO(erd): support removal
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/stream/v1/stream.proto")
public final class StreamServiceGrpc {

  private StreamServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.stream.v1.StreamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.stream.v1.Stream.ListStreamsRequest,
      proto.stream.v1.Stream.ListStreamsResponse> getListStreamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListStreams",
      requestType = proto.stream.v1.Stream.ListStreamsRequest.class,
      responseType = proto.stream.v1.Stream.ListStreamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.stream.v1.Stream.ListStreamsRequest,
      proto.stream.v1.Stream.ListStreamsResponse> getListStreamsMethod() {
    io.grpc.MethodDescriptor<proto.stream.v1.Stream.ListStreamsRequest, proto.stream.v1.Stream.ListStreamsResponse> getListStreamsMethod;
    if ((getListStreamsMethod = StreamServiceGrpc.getListStreamsMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getListStreamsMethod = StreamServiceGrpc.getListStreamsMethod) == null) {
          StreamServiceGrpc.getListStreamsMethod = getListStreamsMethod =
              io.grpc.MethodDescriptor.<proto.stream.v1.Stream.ListStreamsRequest, proto.stream.v1.Stream.ListStreamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListStreams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.stream.v1.Stream.ListStreamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.stream.v1.Stream.ListStreamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("ListStreams"))
              .build();
        }
      }
    }
    return getListStreamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.stream.v1.Stream.AddStreamRequest,
      proto.stream.v1.Stream.AddStreamResponse> getAddStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStream",
      requestType = proto.stream.v1.Stream.AddStreamRequest.class,
      responseType = proto.stream.v1.Stream.AddStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.stream.v1.Stream.AddStreamRequest,
      proto.stream.v1.Stream.AddStreamResponse> getAddStreamMethod() {
    io.grpc.MethodDescriptor<proto.stream.v1.Stream.AddStreamRequest, proto.stream.v1.Stream.AddStreamResponse> getAddStreamMethod;
    if ((getAddStreamMethod = StreamServiceGrpc.getAddStreamMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getAddStreamMethod = StreamServiceGrpc.getAddStreamMethod) == null) {
          StreamServiceGrpc.getAddStreamMethod = getAddStreamMethod =
              io.grpc.MethodDescriptor.<proto.stream.v1.Stream.AddStreamRequest, proto.stream.v1.Stream.AddStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.stream.v1.Stream.AddStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.stream.v1.Stream.AddStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("AddStream"))
              .build();
        }
      }
    }
    return getAddStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamServiceStub>() {
        @java.lang.Override
        public StreamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamServiceStub(channel, callOptions);
        }
      };
    return StreamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamServiceBlockingStub>() {
        @java.lang.Override
        public StreamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamServiceBlockingStub(channel, callOptions);
        }
      };
    return StreamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StreamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamServiceFutureStub>() {
        @java.lang.Override
        public StreamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamServiceFutureStub(channel, callOptions);
        }
      };
    return StreamServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A StreamService is used to coordinate with a WebRTC the listing,
   * addition, and removal of registered video streams.
   * TODO(erd): support removal
   * </pre>
   */
  public static abstract class StreamServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ListStreams returns all streams registered.
     * </pre>
     */
    public void listStreams(proto.stream.v1.Stream.ListStreamsRequest request,
        io.grpc.stub.StreamObserver<proto.stream.v1.Stream.ListStreamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListStreamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddStream requests a particular stream be added.
     * </pre>
     */
    public void addStream(proto.stream.v1.Stream.AddStreamRequest request,
        io.grpc.stub.StreamObserver<proto.stream.v1.Stream.AddStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListStreamsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.stream.v1.Stream.ListStreamsRequest,
                proto.stream.v1.Stream.ListStreamsResponse>(
                  this, METHODID_LIST_STREAMS)))
          .addMethod(
            getAddStreamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.stream.v1.Stream.AddStreamRequest,
                proto.stream.v1.Stream.AddStreamResponse>(
                  this, METHODID_ADD_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * A StreamService is used to coordinate with a WebRTC the listing,
   * addition, and removal of registered video streams.
   * TODO(erd): support removal
   * </pre>
   */
  public static final class StreamServiceStub extends io.grpc.stub.AbstractAsyncStub<StreamServiceStub> {
    private StreamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListStreams returns all streams registered.
     * </pre>
     */
    public void listStreams(proto.stream.v1.Stream.ListStreamsRequest request,
        io.grpc.stub.StreamObserver<proto.stream.v1.Stream.ListStreamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListStreamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddStream requests a particular stream be added.
     * </pre>
     */
    public void addStream(proto.stream.v1.Stream.AddStreamRequest request,
        io.grpc.stub.StreamObserver<proto.stream.v1.Stream.AddStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A StreamService is used to coordinate with a WebRTC the listing,
   * addition, and removal of registered video streams.
   * TODO(erd): support removal
   * </pre>
   */
  public static final class StreamServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StreamServiceBlockingStub> {
    private StreamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListStreams returns all streams registered.
     * </pre>
     */
    public proto.stream.v1.Stream.ListStreamsResponse listStreams(proto.stream.v1.Stream.ListStreamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListStreamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddStream requests a particular stream be added.
     * </pre>
     */
    public proto.stream.v1.Stream.AddStreamResponse addStream(proto.stream.v1.Stream.AddStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A StreamService is used to coordinate with a WebRTC the listing,
   * addition, and removal of registered video streams.
   * TODO(erd): support removal
   * </pre>
   */
  public static final class StreamServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StreamServiceFutureStub> {
    private StreamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListStreams returns all streams registered.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.stream.v1.Stream.ListStreamsResponse> listStreams(
        proto.stream.v1.Stream.ListStreamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListStreamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddStream requests a particular stream be added.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.stream.v1.Stream.AddStreamResponse> addStream(
        proto.stream.v1.Stream.AddStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddStreamMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_STREAMS = 0;
  private static final int METHODID_ADD_STREAM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StreamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_STREAMS:
          serviceImpl.listStreams((proto.stream.v1.Stream.ListStreamsRequest) request,
              (io.grpc.stub.StreamObserver<proto.stream.v1.Stream.ListStreamsResponse>) responseObserver);
          break;
        case METHODID_ADD_STREAM:
          serviceImpl.addStream((proto.stream.v1.Stream.AddStreamRequest) request,
              (io.grpc.stub.StreamObserver<proto.stream.v1.Stream.AddStreamResponse>) responseObserver);
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

  private static abstract class StreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.stream.v1.Stream.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StreamService");
    }
  }

  private static final class StreamServiceFileDescriptorSupplier
      extends StreamServiceBaseDescriptorSupplier {
    StreamServiceFileDescriptorSupplier() {}
  }

  private static final class StreamServiceMethodDescriptorSupplier
      extends StreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StreamServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreamServiceFileDescriptorSupplier())
              .addMethod(getListStreamsMethod())
              .addMethod(getAddStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
