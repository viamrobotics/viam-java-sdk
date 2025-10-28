package com.viam.component.audioout.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An AudioOutService services all audio outputs associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: component/audioout/v1/audioout.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AudioOutServiceGrpc {

  private AudioOutServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.audioout.v1.AudioOutService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.audioout.v1.Audioout.PlayRequest,
      com.viam.component.audioout.v1.Audioout.PlayResponse> getPlayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Play",
      requestType = com.viam.component.audioout.v1.Audioout.PlayRequest.class,
      responseType = com.viam.component.audioout.v1.Audioout.PlayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.audioout.v1.Audioout.PlayRequest,
      com.viam.component.audioout.v1.Audioout.PlayResponse> getPlayMethod() {
    io.grpc.MethodDescriptor<com.viam.component.audioout.v1.Audioout.PlayRequest, com.viam.component.audioout.v1.Audioout.PlayResponse> getPlayMethod;
    if ((getPlayMethod = AudioOutServiceGrpc.getPlayMethod) == null) {
      synchronized (AudioOutServiceGrpc.class) {
        if ((getPlayMethod = AudioOutServiceGrpc.getPlayMethod) == null) {
          AudioOutServiceGrpc.getPlayMethod = getPlayMethod =
              io.grpc.MethodDescriptor.<com.viam.component.audioout.v1.Audioout.PlayRequest, com.viam.component.audioout.v1.Audioout.PlayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Play"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.audioout.v1.Audioout.PlayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.audioout.v1.Audioout.PlayResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPlayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetPropertiesRequest,
      com.viam.common.v1.Common.GetPropertiesResponse> getGetPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProperties",
      requestType = com.viam.common.v1.Common.GetPropertiesRequest.class,
      responseType = com.viam.common.v1.Common.GetPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetPropertiesRequest,
      com.viam.common.v1.Common.GetPropertiesResponse> getGetPropertiesMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetPropertiesRequest, com.viam.common.v1.Common.GetPropertiesResponse> getGetPropertiesMethod;
    if ((getGetPropertiesMethod = AudioOutServiceGrpc.getGetPropertiesMethod) == null) {
      synchronized (AudioOutServiceGrpc.class) {
        if ((getGetPropertiesMethod = AudioOutServiceGrpc.getGetPropertiesMethod) == null) {
          AudioOutServiceGrpc.getGetPropertiesMethod = getGetPropertiesMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.GetPropertiesRequest, com.viam.common.v1.Common.GetPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetPropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetPropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.DoCommandRequest,
      com.viam.common.v1.Common.DoCommandResponse> getDoCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoCommand",
      requestType = com.viam.common.v1.Common.DoCommandRequest.class,
      responseType = com.viam.common.v1.Common.DoCommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.DoCommandRequest,
      com.viam.common.v1.Common.DoCommandResponse> getDoCommandMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.DoCommandRequest, com.viam.common.v1.Common.DoCommandResponse> getDoCommandMethod;
    if ((getDoCommandMethod = AudioOutServiceGrpc.getDoCommandMethod) == null) {
      synchronized (AudioOutServiceGrpc.class) {
        if ((getDoCommandMethod = AudioOutServiceGrpc.getDoCommandMethod) == null) {
          AudioOutServiceGrpc.getDoCommandMethod = getDoCommandMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.DoCommandRequest, com.viam.common.v1.Common.DoCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDoCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetGeometriesRequest,
      com.viam.common.v1.Common.GetGeometriesResponse> getGetGeometriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGeometries",
      requestType = com.viam.common.v1.Common.GetGeometriesRequest.class,
      responseType = com.viam.common.v1.Common.GetGeometriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetGeometriesRequest,
      com.viam.common.v1.Common.GetGeometriesResponse> getGetGeometriesMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetGeometriesRequest, com.viam.common.v1.Common.GetGeometriesResponse> getGetGeometriesMethod;
    if ((getGetGeometriesMethod = AudioOutServiceGrpc.getGetGeometriesMethod) == null) {
      synchronized (AudioOutServiceGrpc.class) {
        if ((getGetGeometriesMethod = AudioOutServiceGrpc.getGetGeometriesMethod) == null) {
          AudioOutServiceGrpc.getGetGeometriesMethod = getGetGeometriesMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.GetGeometriesRequest, com.viam.common.v1.Common.GetGeometriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGeometries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetGeometriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetGeometriesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetGeometriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AudioOutServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioOutServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioOutServiceStub>() {
        @java.lang.Override
        public AudioOutServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioOutServiceStub(channel, callOptions);
        }
      };
    return AudioOutServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AudioOutServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioOutServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioOutServiceBlockingStub>() {
        @java.lang.Override
        public AudioOutServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioOutServiceBlockingStub(channel, callOptions);
        }
      };
    return AudioOutServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AudioOutServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioOutServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioOutServiceFutureStub>() {
        @java.lang.Override
        public AudioOutServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioOutServiceFutureStub(channel, callOptions);
        }
      };
    return AudioOutServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An AudioOutService services all audio outputs associated with a robot
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Play plays audio from the audioout component.
     * </pre>
     */
    default void play(com.viam.component.audioout.v1.Audioout.PlayRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.audioout.v1.Audioout.PlayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProperties returns the properties of the audioout.
     * </pre>
     */
    default void getProperties(com.viam.common.v1.Common.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    default void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoCommandMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    default void getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGeometriesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AudioOutService.
   * <pre>
   * An AudioOutService services all audio outputs associated with a robot
   * </pre>
   */
  public static abstract class AudioOutServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AudioOutServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AudioOutService.
   * <pre>
   * An AudioOutService services all audio outputs associated with a robot
   * </pre>
   */
  public static final class AudioOutServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AudioOutServiceStub> {
    private AudioOutServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioOutServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioOutServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Play plays audio from the audioout component.
     * </pre>
     */
    public void play(com.viam.component.audioout.v1.Audioout.PlayRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.audioout.v1.Audioout.PlayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProperties returns the properties of the audioout.
     * </pre>
     */
    public void getProperties(com.viam.common.v1.Common.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    public void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    public void getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGeometriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AudioOutService.
   * <pre>
   * An AudioOutService services all audio outputs associated with a robot
   * </pre>
   */
  public static final class AudioOutServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AudioOutServiceBlockingStub> {
    private AudioOutServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioOutServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioOutServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Play plays audio from the audioout component.
     * </pre>
     */
    public com.viam.component.audioout.v1.Audioout.PlayResponse play(com.viam.component.audioout.v1.Audioout.PlayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProperties returns the properties of the audioout.
     * </pre>
     */
    public com.viam.common.v1.Common.GetPropertiesResponse getProperties(com.viam.common.v1.Common.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    public com.viam.common.v1.Common.DoCommandResponse doCommand(com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoCommandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    public com.viam.common.v1.Common.GetGeometriesResponse getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGeometriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AudioOutService.
   * <pre>
   * An AudioOutService services all audio outputs associated with a robot
   * </pre>
   */
  public static final class AudioOutServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AudioOutServiceFutureStub> {
    private AudioOutServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioOutServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioOutServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Play plays audio from the audioout component.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.audioout.v1.Audioout.PlayResponse> play(
        com.viam.component.audioout.v1.Audioout.PlayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProperties returns the properties of the audioout.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.GetPropertiesResponse> getProperties(
        com.viam.common.v1.Common.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.DoCommandResponse> doCommand(
        com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.GetGeometriesResponse> getGeometries(
        com.viam.common.v1.Common.GetGeometriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGeometriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY = 0;
  private static final int METHODID_GET_PROPERTIES = 1;
  private static final int METHODID_DO_COMMAND = 2;
  private static final int METHODID_GET_GEOMETRIES = 3;

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
        case METHODID_PLAY:
          serviceImpl.play((com.viam.component.audioout.v1.Audioout.PlayRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.audioout.v1.Audioout.PlayResponse>) responseObserver);
          break;
        case METHODID_GET_PROPERTIES:
          serviceImpl.getProperties((com.viam.common.v1.Common.GetPropertiesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetPropertiesResponse>) responseObserver);
          break;
        case METHODID_DO_COMMAND:
          serviceImpl.doCommand((com.viam.common.v1.Common.DoCommandRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse>) responseObserver);
          break;
        case METHODID_GET_GEOMETRIES:
          serviceImpl.getGeometries((com.viam.common.v1.Common.GetGeometriesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse>) responseObserver);
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
          getPlayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.audioout.v1.Audioout.PlayRequest,
              com.viam.component.audioout.v1.Audioout.PlayResponse>(
                service, METHODID_PLAY)))
        .addMethod(
          getGetPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.GetPropertiesRequest,
              com.viam.common.v1.Common.GetPropertiesResponse>(
                service, METHODID_GET_PROPERTIES)))
        .addMethod(
          getDoCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.DoCommandRequest,
              com.viam.common.v1.Common.DoCommandResponse>(
                service, METHODID_DO_COMMAND)))
        .addMethod(
          getGetGeometriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.GetGeometriesRequest,
              com.viam.common.v1.Common.GetGeometriesResponse>(
                service, METHODID_GET_GEOMETRIES)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AudioOutServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getPlayMethod())
              .addMethod(getGetPropertiesMethod())
              .addMethod(getDoCommandMethod())
              .addMethod(getGetGeometriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
