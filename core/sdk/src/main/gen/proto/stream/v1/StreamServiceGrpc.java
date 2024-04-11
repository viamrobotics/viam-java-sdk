package proto.stream.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A StreamService is used to coordinate with a WebRTC the listing,
 * addition, and removal of registered video streams.
 * TODO(https://github.com/viamrobotics/rdk/issues/509): support removal
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: stream/v1/stream.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StreamServiceGrpc {

  private StreamServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.stream.v1.StreamService";

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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.stream.v1.Stream.ListStreamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.stream.v1.Stream.ListStreamsResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.stream.v1.Stream.AddStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.stream.v1.Stream.AddStreamResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.stream.v1.Stream.RemoveStreamRequest,
      proto.stream.v1.Stream.RemoveStreamResponse> getRemoveStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveStream",
      requestType = proto.stream.v1.Stream.RemoveStreamRequest.class,
      responseType = proto.stream.v1.Stream.RemoveStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.stream.v1.Stream.RemoveStreamRequest,
      proto.stream.v1.Stream.RemoveStreamResponse> getRemoveStreamMethod() {
    io.grpc.MethodDescriptor<proto.stream.v1.Stream.RemoveStreamRequest, proto.stream.v1.Stream.RemoveStreamResponse> getRemoveStreamMethod;
    if ((getRemoveStreamMethod = StreamServiceGrpc.getRemoveStreamMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getRemoveStreamMethod = StreamServiceGrpc.getRemoveStreamMethod) == null) {
          StreamServiceGrpc.getRemoveStreamMethod = getRemoveStreamMethod =
              io.grpc.MethodDescriptor.<proto.stream.v1.Stream.RemoveStreamRequest, proto.stream.v1.Stream.RemoveStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.stream.v1.Stream.RemoveStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.stream.v1.Stream.RemoveStreamResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveStreamMethod;
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
   * TODO(https://github.com/viamrobotics/rdk/issues/509): support removal
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ListStreams returns all streams registered.
     * </pre>
     */
    default void listStreams(proto.stream.v1.Stream.ListStreamsRequest request,
        io.grpc.stub.StreamObserver<proto.stream.v1.Stream.ListStreamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListStreamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddStream requests a particular stream be added.
     * </pre>
     */
    default void addStream(proto.stream.v1.Stream.AddStreamRequest request,
        io.grpc.stub.StreamObserver<proto.stream.v1.Stream.AddStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveStream requests a particular stream be removed. If the calling client
     * is the last to be receiving the stream, it will attempt to be stopped to
     * conserve resources.
     * </pre>
     */
    default void removeStream(proto.stream.v1.Stream.RemoveStreamRequest request,
        io.grpc.stub.StreamObserver<proto.stream.v1.Stream.RemoveStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StreamService.
   * <pre>
   * A StreamService is used to coordinate with a WebRTC the listing,
   * addition, and removal of registered video streams.
   * TODO(https://github.com/viamrobotics/rdk/issues/509): support removal
   * </pre>
   */
  public static abstract class StreamServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StreamServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StreamService.
   * <pre>
   * A StreamService is used to coordinate with a WebRTC the listing,
   * addition, and removal of registered video streams.
   * TODO(https://github.com/viamrobotics/rdk/issues/509): support removal
   * </pre>
   */
  public static final class StreamServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StreamServiceStub> {
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

    /**
     * <pre>
     * RemoveStream requests a particular stream be removed. If the calling client
     * is the last to be receiving the stream, it will attempt to be stopped to
     * conserve resources.
     * </pre>
     */
    public void removeStream(proto.stream.v1.Stream.RemoveStreamRequest request,
        io.grpc.stub.StreamObserver<proto.stream.v1.Stream.RemoveStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StreamService.
   * <pre>
   * A StreamService is used to coordinate with a WebRTC the listing,
   * addition, and removal of registered video streams.
   * TODO(https://github.com/viamrobotics/rdk/issues/509): support removal
   * </pre>
   */
  public static final class StreamServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StreamServiceBlockingStub> {
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

    /**
     * <pre>
     * RemoveStream requests a particular stream be removed. If the calling client
     * is the last to be receiving the stream, it will attempt to be stopped to
     * conserve resources.
     * </pre>
     */
    public proto.stream.v1.Stream.RemoveStreamResponse removeStream(proto.stream.v1.Stream.RemoveStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StreamService.
   * <pre>
   * A StreamService is used to coordinate with a WebRTC the listing,
   * addition, and removal of registered video streams.
   * TODO(https://github.com/viamrobotics/rdk/issues/509): support removal
   * </pre>
   */
  public static final class StreamServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StreamServiceFutureStub> {
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

    /**
     * <pre>
     * RemoveStream requests a particular stream be removed. If the calling client
     * is the last to be receiving the stream, it will attempt to be stopped to
     * conserve resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.stream.v1.Stream.RemoveStreamResponse> removeStream(
        proto.stream.v1.Stream.RemoveStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveStreamMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_STREAMS = 0;
  private static final int METHODID_ADD_STREAM = 1;
  private static final int METHODID_REMOVE_STREAM = 2;

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
        case METHODID_LIST_STREAMS:
          serviceImpl.listStreams((proto.stream.v1.Stream.ListStreamsRequest) request,
              (io.grpc.stub.StreamObserver<proto.stream.v1.Stream.ListStreamsResponse>) responseObserver);
          break;
        case METHODID_ADD_STREAM:
          serviceImpl.addStream((proto.stream.v1.Stream.AddStreamRequest) request,
              (io.grpc.stub.StreamObserver<proto.stream.v1.Stream.AddStreamResponse>) responseObserver);
          break;
        case METHODID_REMOVE_STREAM:
          serviceImpl.removeStream((proto.stream.v1.Stream.RemoveStreamRequest) request,
              (io.grpc.stub.StreamObserver<proto.stream.v1.Stream.RemoveStreamResponse>) responseObserver);
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
          getListStreamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.stream.v1.Stream.ListStreamsRequest,
              proto.stream.v1.Stream.ListStreamsResponse>(
                service, METHODID_LIST_STREAMS)))
        .addMethod(
          getAddStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.stream.v1.Stream.AddStreamRequest,
              proto.stream.v1.Stream.AddStreamResponse>(
                service, METHODID_ADD_STREAM)))
        .addMethod(
          getRemoveStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.stream.v1.Stream.RemoveStreamRequest,
              proto.stream.v1.Stream.RemoveStreamResponse>(
                service, METHODID_REMOVE_STREAM)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getListStreamsMethod())
              .addMethod(getAddStreamMethod())
              .addMethod(getRemoveStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
