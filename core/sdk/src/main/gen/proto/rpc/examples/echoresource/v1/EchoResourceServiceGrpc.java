package proto.rpc.examples.echoresource.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: proto/rpc/examples/echoresource/v1/echoresource.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EchoResourceServiceGrpc {

  private EchoResourceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.rpc.examples.echoresource.v1.EchoResourceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceRequest,
      proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceResponse> getEchoResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoResource",
      requestType = proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceRequest.class,
      responseType = proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceRequest,
      proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceResponse> getEchoResourceMethod() {
    io.grpc.MethodDescriptor<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceRequest, proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceResponse> getEchoResourceMethod;
    if ((getEchoResourceMethod = EchoResourceServiceGrpc.getEchoResourceMethod) == null) {
      synchronized (EchoResourceServiceGrpc.class) {
        if ((getEchoResourceMethod = EchoResourceServiceGrpc.getEchoResourceMethod) == null) {
          EchoResourceServiceGrpc.getEchoResourceMethod = getEchoResourceMethod =
              io.grpc.MethodDescriptor.<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceRequest, proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEchoResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleRequest,
      proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleResponse> getEchoResourceMultipleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoResourceMultiple",
      requestType = proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleRequest.class,
      responseType = proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleRequest,
      proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleResponse> getEchoResourceMultipleMethod() {
    io.grpc.MethodDescriptor<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleRequest, proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleResponse> getEchoResourceMultipleMethod;
    if ((getEchoResourceMultipleMethod = EchoResourceServiceGrpc.getEchoResourceMultipleMethod) == null) {
      synchronized (EchoResourceServiceGrpc.class) {
        if ((getEchoResourceMultipleMethod = EchoResourceServiceGrpc.getEchoResourceMultipleMethod) == null) {
          EchoResourceServiceGrpc.getEchoResourceMultipleMethod = getEchoResourceMultipleMethod =
              io.grpc.MethodDescriptor.<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleRequest, proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoResourceMultiple"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEchoResourceMultipleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiRequest,
      proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiResponse> getEchoResourceBiDiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoResourceBiDi",
      requestType = proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiRequest.class,
      responseType = proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiRequest,
      proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiResponse> getEchoResourceBiDiMethod() {
    io.grpc.MethodDescriptor<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiRequest, proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiResponse> getEchoResourceBiDiMethod;
    if ((getEchoResourceBiDiMethod = EchoResourceServiceGrpc.getEchoResourceBiDiMethod) == null) {
      synchronized (EchoResourceServiceGrpc.class) {
        if ((getEchoResourceBiDiMethod = EchoResourceServiceGrpc.getEchoResourceBiDiMethod) == null) {
          EchoResourceServiceGrpc.getEchoResourceBiDiMethod = getEchoResourceBiDiMethod =
              io.grpc.MethodDescriptor.<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiRequest, proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoResourceBiDi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEchoResourceBiDiMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EchoResourceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoResourceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoResourceServiceStub>() {
        @java.lang.Override
        public EchoResourceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoResourceServiceStub(channel, callOptions);
        }
      };
    return EchoResourceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EchoResourceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoResourceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoResourceServiceBlockingStub>() {
        @java.lang.Override
        public EchoResourceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoResourceServiceBlockingStub(channel, callOptions);
        }
      };
    return EchoResourceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EchoResourceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoResourceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoResourceServiceFutureStub>() {
        @java.lang.Override
        public EchoResourceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoResourceServiceFutureStub(channel, callOptions);
        }
      };
    return EchoResourceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void echoResource(proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoResourceMethod(), responseObserver);
    }

    /**
     */
    default void echoResourceMultiple(proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoResourceMultipleMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiRequest> echoResourceBiDi(
        io.grpc.stub.StreamObserver<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEchoResourceBiDiMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EchoResourceService.
   */
  public static abstract class EchoResourceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EchoResourceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EchoResourceService.
   */
  public static final class EchoResourceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EchoResourceServiceStub> {
    private EchoResourceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoResourceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoResourceServiceStub(channel, callOptions);
    }

    /**
     */
    public void echoResource(proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void echoResourceMultiple(proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEchoResourceMultipleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiRequest> echoResourceBiDi(
        io.grpc.stub.StreamObserver<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getEchoResourceBiDiMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EchoResourceService.
   */
  public static final class EchoResourceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EchoResourceServiceBlockingStub> {
    private EchoResourceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoResourceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoResourceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceResponse echoResource(proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleResponse> echoResourceMultiple(
        proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEchoResourceMultipleMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EchoResourceService.
   */
  public static final class EchoResourceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EchoResourceServiceFutureStub> {
    private EchoResourceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoResourceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoResourceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceResponse> echoResource(
        proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoResourceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO_RESOURCE = 0;
  private static final int METHODID_ECHO_RESOURCE_MULTIPLE = 1;
  private static final int METHODID_ECHO_RESOURCE_BI_DI = 2;

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
        case METHODID_ECHO_RESOURCE:
          serviceImpl.echoResource((proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceRequest) request,
              (io.grpc.stub.StreamObserver<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceResponse>) responseObserver);
          break;
        case METHODID_ECHO_RESOURCE_MULTIPLE:
          serviceImpl.echoResourceMultiple((proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleRequest) request,
              (io.grpc.stub.StreamObserver<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleResponse>) responseObserver);
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
        case METHODID_ECHO_RESOURCE_BI_DI:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.echoResourceBiDi(
              (io.grpc.stub.StreamObserver<proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getEchoResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceRequest,
              proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceResponse>(
                service, METHODID_ECHO_RESOURCE)))
        .addMethod(
          getEchoResourceMultipleMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleRequest,
              proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceMultipleResponse>(
                service, METHODID_ECHO_RESOURCE_MULTIPLE)))
        .addMethod(
          getEchoResourceBiDiMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiRequest,
              proto.rpc.examples.echoresource.v1.Echoresource.EchoResourceBiDiResponse>(
                service, METHODID_ECHO_RESOURCE_BI_DI)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EchoResourceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getEchoResourceMethod())
              .addMethod(getEchoResourceMultipleMethod())
              .addMethod(getEchoResourceBiDiMethod())
              .build();
        }
      }
    }
    return result;
  }
}
