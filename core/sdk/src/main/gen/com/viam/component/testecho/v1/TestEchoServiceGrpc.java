package com.viam.component.testecho.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: component/testecho/v1/testecho.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TestEchoServiceGrpc {

  private TestEchoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.testecho.v1.TestEchoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.testecho.v1.Testecho.EchoRequest,
      com.viam.component.testecho.v1.Testecho.EchoResponse> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = com.viam.component.testecho.v1.Testecho.EchoRequest.class,
      responseType = com.viam.component.testecho.v1.Testecho.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.testecho.v1.Testecho.EchoRequest,
      com.viam.component.testecho.v1.Testecho.EchoResponse> getEchoMethod() {
    io.grpc.MethodDescriptor<com.viam.component.testecho.v1.Testecho.EchoRequest, com.viam.component.testecho.v1.Testecho.EchoResponse> getEchoMethod;
    if ((getEchoMethod = TestEchoServiceGrpc.getEchoMethod) == null) {
      synchronized (TestEchoServiceGrpc.class) {
        if ((getEchoMethod = TestEchoServiceGrpc.getEchoMethod) == null) {
          TestEchoServiceGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<com.viam.component.testecho.v1.Testecho.EchoRequest, com.viam.component.testecho.v1.Testecho.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.testecho.v1.Testecho.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.testecho.v1.Testecho.EchoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.testecho.v1.Testecho.EchoMultipleRequest,
      com.viam.component.testecho.v1.Testecho.EchoMultipleResponse> getEchoMultipleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoMultiple",
      requestType = com.viam.component.testecho.v1.Testecho.EchoMultipleRequest.class,
      responseType = com.viam.component.testecho.v1.Testecho.EchoMultipleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.viam.component.testecho.v1.Testecho.EchoMultipleRequest,
      com.viam.component.testecho.v1.Testecho.EchoMultipleResponse> getEchoMultipleMethod() {
    io.grpc.MethodDescriptor<com.viam.component.testecho.v1.Testecho.EchoMultipleRequest, com.viam.component.testecho.v1.Testecho.EchoMultipleResponse> getEchoMultipleMethod;
    if ((getEchoMultipleMethod = TestEchoServiceGrpc.getEchoMultipleMethod) == null) {
      synchronized (TestEchoServiceGrpc.class) {
        if ((getEchoMultipleMethod = TestEchoServiceGrpc.getEchoMultipleMethod) == null) {
          TestEchoServiceGrpc.getEchoMultipleMethod = getEchoMultipleMethod =
              io.grpc.MethodDescriptor.<com.viam.component.testecho.v1.Testecho.EchoMultipleRequest, com.viam.component.testecho.v1.Testecho.EchoMultipleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoMultiple"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.testecho.v1.Testecho.EchoMultipleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.testecho.v1.Testecho.EchoMultipleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEchoMultipleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.testecho.v1.Testecho.EchoBiDiRequest,
      com.viam.component.testecho.v1.Testecho.EchoBiDiResponse> getEchoBiDiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoBiDi",
      requestType = com.viam.component.testecho.v1.Testecho.EchoBiDiRequest.class,
      responseType = com.viam.component.testecho.v1.Testecho.EchoBiDiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.viam.component.testecho.v1.Testecho.EchoBiDiRequest,
      com.viam.component.testecho.v1.Testecho.EchoBiDiResponse> getEchoBiDiMethod() {
    io.grpc.MethodDescriptor<com.viam.component.testecho.v1.Testecho.EchoBiDiRequest, com.viam.component.testecho.v1.Testecho.EchoBiDiResponse> getEchoBiDiMethod;
    if ((getEchoBiDiMethod = TestEchoServiceGrpc.getEchoBiDiMethod) == null) {
      synchronized (TestEchoServiceGrpc.class) {
        if ((getEchoBiDiMethod = TestEchoServiceGrpc.getEchoBiDiMethod) == null) {
          TestEchoServiceGrpc.getEchoBiDiMethod = getEchoBiDiMethod =
              io.grpc.MethodDescriptor.<com.viam.component.testecho.v1.Testecho.EchoBiDiRequest, com.viam.component.testecho.v1.Testecho.EchoBiDiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoBiDi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.testecho.v1.Testecho.EchoBiDiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.testecho.v1.Testecho.EchoBiDiResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEchoBiDiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.testecho.v1.Testecho.StopRequest,
      com.viam.component.testecho.v1.Testecho.StopResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = com.viam.component.testecho.v1.Testecho.StopRequest.class,
      responseType = com.viam.component.testecho.v1.Testecho.StopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.testecho.v1.Testecho.StopRequest,
      com.viam.component.testecho.v1.Testecho.StopResponse> getStopMethod() {
    io.grpc.MethodDescriptor<com.viam.component.testecho.v1.Testecho.StopRequest, com.viam.component.testecho.v1.Testecho.StopResponse> getStopMethod;
    if ((getStopMethod = TestEchoServiceGrpc.getStopMethod) == null) {
      synchronized (TestEchoServiceGrpc.class) {
        if ((getStopMethod = TestEchoServiceGrpc.getStopMethod) == null) {
          TestEchoServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<com.viam.component.testecho.v1.Testecho.StopRequest, com.viam.component.testecho.v1.Testecho.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.testecho.v1.Testecho.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.testecho.v1.Testecho.StopResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestEchoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestEchoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestEchoServiceStub>() {
        @java.lang.Override
        public TestEchoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestEchoServiceStub(channel, callOptions);
        }
      };
    return TestEchoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestEchoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestEchoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestEchoServiceBlockingStub>() {
        @java.lang.Override
        public TestEchoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestEchoServiceBlockingStub(channel, callOptions);
        }
      };
    return TestEchoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestEchoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestEchoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestEchoServiceFutureStub>() {
        @java.lang.Override
        public TestEchoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestEchoServiceFutureStub(channel, callOptions);
        }
      };
    return TestEchoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void echo(com.viam.component.testecho.v1.Testecho.EchoRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.EchoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    /**
     */
    default void echoMultiple(com.viam.component.testecho.v1.Testecho.EchoMultipleRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.EchoMultipleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoMultipleMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.EchoBiDiRequest> echoBiDi(
        io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.EchoBiDiResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEchoBiDiMethod(), responseObserver);
    }

    /**
     */
    default void stop(com.viam.component.testecho.v1.Testecho.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.StopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TestEchoService.
   */
  public static abstract class TestEchoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TestEchoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TestEchoService.
   */
  public static final class TestEchoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TestEchoServiceStub> {
    private TestEchoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestEchoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestEchoServiceStub(channel, callOptions);
    }

    /**
     */
    public void echo(com.viam.component.testecho.v1.Testecho.EchoRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.EchoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void echoMultiple(com.viam.component.testecho.v1.Testecho.EchoMultipleRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.EchoMultipleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEchoMultipleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.EchoBiDiRequest> echoBiDi(
        io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.EchoBiDiResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getEchoBiDiMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void stop(com.viam.component.testecho.v1.Testecho.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.StopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TestEchoService.
   */
  public static final class TestEchoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TestEchoServiceBlockingStub> {
    private TestEchoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestEchoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestEchoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.viam.component.testecho.v1.Testecho.EchoResponse echo(com.viam.component.testecho.v1.Testecho.EchoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.viam.component.testecho.v1.Testecho.EchoMultipleResponse> echoMultiple(
        com.viam.component.testecho.v1.Testecho.EchoMultipleRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEchoMultipleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.component.testecho.v1.Testecho.StopResponse stop(com.viam.component.testecho.v1.Testecho.StopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TestEchoService.
   */
  public static final class TestEchoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TestEchoServiceFutureStub> {
    private TestEchoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestEchoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestEchoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.testecho.v1.Testecho.EchoResponse> echo(
        com.viam.component.testecho.v1.Testecho.EchoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.testecho.v1.Testecho.StopResponse> stop(
        com.viam.component.testecho.v1.Testecho.StopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO = 0;
  private static final int METHODID_ECHO_MULTIPLE = 1;
  private static final int METHODID_STOP = 2;
  private static final int METHODID_ECHO_BI_DI = 3;

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
        case METHODID_ECHO:
          serviceImpl.echo((com.viam.component.testecho.v1.Testecho.EchoRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.EchoResponse>) responseObserver);
          break;
        case METHODID_ECHO_MULTIPLE:
          serviceImpl.echoMultiple((com.viam.component.testecho.v1.Testecho.EchoMultipleRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.EchoMultipleResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((com.viam.component.testecho.v1.Testecho.StopRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.StopResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<com.viam.component.testecho.v1.Testecho.EchoBiDiResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getEchoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.testecho.v1.Testecho.EchoRequest,
              com.viam.component.testecho.v1.Testecho.EchoResponse>(
                service, METHODID_ECHO)))
        .addMethod(
          getEchoMultipleMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.viam.component.testecho.v1.Testecho.EchoMultipleRequest,
              com.viam.component.testecho.v1.Testecho.EchoMultipleResponse>(
                service, METHODID_ECHO_MULTIPLE)))
        .addMethod(
          getEchoBiDiMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.viam.component.testecho.v1.Testecho.EchoBiDiRequest,
              com.viam.component.testecho.v1.Testecho.EchoBiDiResponse>(
                service, METHODID_ECHO_BI_DI)))
        .addMethod(
          getStopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.testecho.v1.Testecho.StopRequest,
              com.viam.component.testecho.v1.Testecho.StopResponse>(
                service, METHODID_STOP)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TestEchoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getEchoMethod())
              .addMethod(getEchoMultipleMethod())
              .addMethod(getEchoBiDiMethod())
              .addMethod(getStopMethod())
              .build();
        }
      }
    }
    return result;
  }
}
