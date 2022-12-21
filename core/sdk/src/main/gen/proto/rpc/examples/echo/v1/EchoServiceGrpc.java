package proto.rpc.examples.echo.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/rpc/examples/echo/v1/echo.proto")
public final class EchoServiceGrpc {

  private EchoServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.rpc.examples.echo.v1.EchoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.rpc.examples.echo.v1.Echo.EchoRequest,
      proto.rpc.examples.echo.v1.Echo.EchoResponse> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = proto.rpc.examples.echo.v1.Echo.EchoRequest.class,
      responseType = proto.rpc.examples.echo.v1.Echo.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.rpc.examples.echo.v1.Echo.EchoRequest,
      proto.rpc.examples.echo.v1.Echo.EchoResponse> getEchoMethod() {
    io.grpc.MethodDescriptor<proto.rpc.examples.echo.v1.Echo.EchoRequest, proto.rpc.examples.echo.v1.Echo.EchoResponse> getEchoMethod;
    if ((getEchoMethod = EchoServiceGrpc.getEchoMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getEchoMethod = EchoServiceGrpc.getEchoMethod) == null) {
          EchoServiceGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<proto.rpc.examples.echo.v1.Echo.EchoRequest, proto.rpc.examples.echo.v1.Echo.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.rpc.examples.echo.v1.Echo.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.rpc.examples.echo.v1.Echo.EchoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("Echo"))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.rpc.examples.echo.v1.Echo.EchoMultipleRequest,
      proto.rpc.examples.echo.v1.Echo.EchoMultipleResponse> getEchoMultipleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoMultiple",
      requestType = proto.rpc.examples.echo.v1.Echo.EchoMultipleRequest.class,
      responseType = proto.rpc.examples.echo.v1.Echo.EchoMultipleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<proto.rpc.examples.echo.v1.Echo.EchoMultipleRequest,
      proto.rpc.examples.echo.v1.Echo.EchoMultipleResponse> getEchoMultipleMethod() {
    io.grpc.MethodDescriptor<proto.rpc.examples.echo.v1.Echo.EchoMultipleRequest, proto.rpc.examples.echo.v1.Echo.EchoMultipleResponse> getEchoMultipleMethod;
    if ((getEchoMultipleMethod = EchoServiceGrpc.getEchoMultipleMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getEchoMultipleMethod = EchoServiceGrpc.getEchoMultipleMethod) == null) {
          EchoServiceGrpc.getEchoMultipleMethod = getEchoMultipleMethod =
              io.grpc.MethodDescriptor.<proto.rpc.examples.echo.v1.Echo.EchoMultipleRequest, proto.rpc.examples.echo.v1.Echo.EchoMultipleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoMultiple"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.rpc.examples.echo.v1.Echo.EchoMultipleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.rpc.examples.echo.v1.Echo.EchoMultipleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("EchoMultiple"))
              .build();
        }
      }
    }
    return getEchoMultipleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.rpc.examples.echo.v1.Echo.EchoBiDiRequest,
      proto.rpc.examples.echo.v1.Echo.EchoBiDiResponse> getEchoBiDiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoBiDi",
      requestType = proto.rpc.examples.echo.v1.Echo.EchoBiDiRequest.class,
      responseType = proto.rpc.examples.echo.v1.Echo.EchoBiDiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<proto.rpc.examples.echo.v1.Echo.EchoBiDiRequest,
      proto.rpc.examples.echo.v1.Echo.EchoBiDiResponse> getEchoBiDiMethod() {
    io.grpc.MethodDescriptor<proto.rpc.examples.echo.v1.Echo.EchoBiDiRequest, proto.rpc.examples.echo.v1.Echo.EchoBiDiResponse> getEchoBiDiMethod;
    if ((getEchoBiDiMethod = EchoServiceGrpc.getEchoBiDiMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getEchoBiDiMethod = EchoServiceGrpc.getEchoBiDiMethod) == null) {
          EchoServiceGrpc.getEchoBiDiMethod = getEchoBiDiMethod =
              io.grpc.MethodDescriptor.<proto.rpc.examples.echo.v1.Echo.EchoBiDiRequest, proto.rpc.examples.echo.v1.Echo.EchoBiDiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoBiDi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.rpc.examples.echo.v1.Echo.EchoBiDiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.rpc.examples.echo.v1.Echo.EchoBiDiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("EchoBiDi"))
              .build();
        }
      }
    }
    return getEchoBiDiMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EchoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoServiceStub>() {
        @java.lang.Override
        public EchoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoServiceStub(channel, callOptions);
        }
      };
    return EchoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EchoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoServiceBlockingStub>() {
        @java.lang.Override
        public EchoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoServiceBlockingStub(channel, callOptions);
        }
      };
    return EchoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EchoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoServiceFutureStub>() {
        @java.lang.Override
        public EchoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoServiceFutureStub(channel, callOptions);
        }
      };
    return EchoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EchoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void echo(proto.rpc.examples.echo.v1.Echo.EchoRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.examples.echo.v1.Echo.EchoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    /**
     */
    public void echoMultiple(proto.rpc.examples.echo.v1.Echo.EchoMultipleRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.examples.echo.v1.Echo.EchoMultipleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoMultipleMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.rpc.examples.echo.v1.Echo.EchoBiDiRequest> echoBiDi(
        io.grpc.stub.StreamObserver<proto.rpc.examples.echo.v1.Echo.EchoBiDiResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEchoBiDiMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEchoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.rpc.examples.echo.v1.Echo.EchoRequest,
                proto.rpc.examples.echo.v1.Echo.EchoResponse>(
                  this, METHODID_ECHO)))
          .addMethod(
            getEchoMultipleMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                proto.rpc.examples.echo.v1.Echo.EchoMultipleRequest,
                proto.rpc.examples.echo.v1.Echo.EchoMultipleResponse>(
                  this, METHODID_ECHO_MULTIPLE)))
          .addMethod(
            getEchoBiDiMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                proto.rpc.examples.echo.v1.Echo.EchoBiDiRequest,
                proto.rpc.examples.echo.v1.Echo.EchoBiDiResponse>(
                  this, METHODID_ECHO_BI_DI)))
          .build();
    }
  }

  /**
   */
  public static final class EchoServiceStub extends io.grpc.stub.AbstractAsyncStub<EchoServiceStub> {
    private EchoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoServiceStub(channel, callOptions);
    }

    /**
     */
    public void echo(proto.rpc.examples.echo.v1.Echo.EchoRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.examples.echo.v1.Echo.EchoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void echoMultiple(proto.rpc.examples.echo.v1.Echo.EchoMultipleRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.examples.echo.v1.Echo.EchoMultipleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEchoMultipleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.rpc.examples.echo.v1.Echo.EchoBiDiRequest> echoBiDi(
        io.grpc.stub.StreamObserver<proto.rpc.examples.echo.v1.Echo.EchoBiDiResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getEchoBiDiMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EchoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EchoServiceBlockingStub> {
    private EchoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.rpc.examples.echo.v1.Echo.EchoResponse echo(proto.rpc.examples.echo.v1.Echo.EchoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<proto.rpc.examples.echo.v1.Echo.EchoMultipleResponse> echoMultiple(
        proto.rpc.examples.echo.v1.Echo.EchoMultipleRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEchoMultipleMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EchoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EchoServiceFutureStub> {
    private EchoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.rpc.examples.echo.v1.Echo.EchoResponse> echo(
        proto.rpc.examples.echo.v1.Echo.EchoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO = 0;
  private static final int METHODID_ECHO_MULTIPLE = 1;
  private static final int METHODID_ECHO_BI_DI = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EchoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EchoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ECHO:
          serviceImpl.echo((proto.rpc.examples.echo.v1.Echo.EchoRequest) request,
              (io.grpc.stub.StreamObserver<proto.rpc.examples.echo.v1.Echo.EchoResponse>) responseObserver);
          break;
        case METHODID_ECHO_MULTIPLE:
          serviceImpl.echoMultiple((proto.rpc.examples.echo.v1.Echo.EchoMultipleRequest) request,
              (io.grpc.stub.StreamObserver<proto.rpc.examples.echo.v1.Echo.EchoMultipleResponse>) responseObserver);
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
        case METHODID_ECHO_BI_DI:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.echoBiDi(
              (io.grpc.stub.StreamObserver<proto.rpc.examples.echo.v1.Echo.EchoBiDiResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EchoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EchoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.rpc.examples.echo.v1.Echo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EchoService");
    }
  }

  private static final class EchoServiceFileDescriptorSupplier
      extends EchoServiceBaseDescriptorSupplier {
    EchoServiceFileDescriptorSupplier() {}
  }

  private static final class EchoServiceMethodDescriptorSupplier
      extends EchoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EchoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EchoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EchoServiceFileDescriptorSupplier())
              .addMethod(getEchoMethod())
              .addMethod(getEchoMultipleMethod())
              .addMethod(getEchoBiDiMethod())
              .build();
        }
      }
    }
    return result;
  }
}
