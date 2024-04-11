package com.viam.sdk.core.rpc.reflectionv1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: grpc/reflection/v1alpha/reflection.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServerReflectionGrpc {

  private ServerReflectionGrpc() {
  }

  public static final String SERVICE_NAME = "grpc.reflection.v1alpha.ServerReflection";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ServerReflectionRequest,
      ServerReflectionResponse> getServerReflectionInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerReflectionInfo",
      requestType = ServerReflectionRequest.class,
      responseType = ServerReflectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ServerReflectionRequest,
      ServerReflectionResponse> getServerReflectionInfoMethod() {
    io.grpc.MethodDescriptor<ServerReflectionRequest, ServerReflectionResponse> getServerReflectionInfoMethod;
    if ((getServerReflectionInfoMethod = ServerReflectionGrpc.getServerReflectionInfoMethod)
        == null) {
      synchronized (ServerReflectionGrpc.class) {
        if ((getServerReflectionInfoMethod = ServerReflectionGrpc.getServerReflectionInfoMethod)
            == null) {
          ServerReflectionGrpc.getServerReflectionInfoMethod = getServerReflectionInfoMethod =
              io.grpc.MethodDescriptor.<ServerReflectionRequest, ServerReflectionResponse>newBuilder()
                  .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
                  .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerReflectionInfo"))
                  .setSampledToLocalTracing(true)
                  .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                      ServerReflectionRequest.getDefaultInstance()))
                  .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                      ServerReflectionResponse.getDefaultInstance()))
                  .build();
        }
      }
    }
    return getServerReflectionInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerReflectionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerReflectionStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ServerReflectionStub>() {
          @Override
          public ServerReflectionStub newStub(io.grpc.Channel channel,
              io.grpc.CallOptions callOptions) {
            return new ServerReflectionStub(channel, callOptions);
          }
        };
    return ServerReflectionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the
   * service
   */
  public static ServerReflectionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerReflectionBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ServerReflectionBlockingStub>() {
          @Override
          public ServerReflectionBlockingStub newStub(io.grpc.Channel channel,
              io.grpc.CallOptions callOptions) {
            return new ServerReflectionBlockingStub(channel, callOptions);
          }
        };
    return ServerReflectionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerReflectionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerReflectionFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ServerReflectionFutureStub>() {
          @Override
          public ServerReflectionFutureStub newStub(io.grpc.Channel channel,
              io.grpc.CallOptions callOptions) {
            return new ServerReflectionFutureStub(channel, callOptions);
          }
        };
    return ServerReflectionFutureStub.newStub(factory, channel);
  }

  /**
   *
   */
  public interface AsyncService {

    /**
     * <pre>
     * The reflection service is structured as a bidirectional stream, ensuring
     * all related requests go to a single server.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<ServerReflectionRequest> serverReflectionInfo(
        io.grpc.stub.StreamObserver<ServerReflectionResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(
          getServerReflectionInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServerReflection.
   */
  public static abstract class ServerReflectionImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return ServerReflectionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServerReflection.
   */
  public static final class ServerReflectionStub
      extends io.grpc.stub.AbstractAsyncStub<ServerReflectionStub> {

    private ServerReflectionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ServerReflectionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerReflectionStub(channel, callOptions);
    }

    /**
     * <pre>
     * The reflection service is structured as a bidirectional stream, ensuring
     * all related requests go to a single server.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ServerReflectionRequest> serverReflectionInfo(
        io.grpc.stub.StreamObserver<ServerReflectionResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getServerReflectionInfoMethod(), getCallOptions()),
          responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServerReflection.
   */
  public static final class ServerReflectionBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServerReflectionBlockingStub> {

    private ServerReflectionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ServerReflectionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerReflectionBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServerReflection.
   */
  public static final class ServerReflectionFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServerReflectionFutureStub> {

    private ServerReflectionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ServerReflectionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerReflectionFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SERVER_REFLECTION_INFO = 0;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SERVER_REFLECTION_INFO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.serverReflectionInfo(
              (io.grpc.stub.StreamObserver<ServerReflectionResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
            getServerReflectionInfoMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
                new MethodHandlers<
                    ServerReflectionRequest,
                    ServerReflectionResponse>(
                    service, METHODID_SERVER_REFLECTION_INFO)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServerReflectionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getServerReflectionInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
