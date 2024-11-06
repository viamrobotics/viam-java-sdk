package com.viam.component.audioinput.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An AudioInputService services all audio inputs associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: component/audioinput/v1/audioinput.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AudioInputServiceGrpc {

  private AudioInputServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.audioinput.v1.AudioInputService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.audioinput.v1.Audioinput.ChunksRequest,
      com.viam.component.audioinput.v1.Audioinput.ChunksResponse> getChunksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Chunks",
      requestType = com.viam.component.audioinput.v1.Audioinput.ChunksRequest.class,
      responseType = com.viam.component.audioinput.v1.Audioinput.ChunksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.viam.component.audioinput.v1.Audioinput.ChunksRequest,
      com.viam.component.audioinput.v1.Audioinput.ChunksResponse> getChunksMethod() {
    io.grpc.MethodDescriptor<com.viam.component.audioinput.v1.Audioinput.ChunksRequest, com.viam.component.audioinput.v1.Audioinput.ChunksResponse> getChunksMethod;
    if ((getChunksMethod = AudioInputServiceGrpc.getChunksMethod) == null) {
      synchronized (AudioInputServiceGrpc.class) {
        if ((getChunksMethod = AudioInputServiceGrpc.getChunksMethod) == null) {
          AudioInputServiceGrpc.getChunksMethod = getChunksMethod =
              io.grpc.MethodDescriptor.<com.viam.component.audioinput.v1.Audioinput.ChunksRequest, com.viam.component.audioinput.v1.Audioinput.ChunksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Chunks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.audioinput.v1.Audioinput.ChunksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.audioinput.v1.Audioinput.ChunksResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getChunksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.audioinput.v1.Audioinput.PropertiesRequest,
      com.viam.component.audioinput.v1.Audioinput.PropertiesResponse> getPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Properties",
      requestType = com.viam.component.audioinput.v1.Audioinput.PropertiesRequest.class,
      responseType = com.viam.component.audioinput.v1.Audioinput.PropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.audioinput.v1.Audioinput.PropertiesRequest,
      com.viam.component.audioinput.v1.Audioinput.PropertiesResponse> getPropertiesMethod() {
    io.grpc.MethodDescriptor<com.viam.component.audioinput.v1.Audioinput.PropertiesRequest, com.viam.component.audioinput.v1.Audioinput.PropertiesResponse> getPropertiesMethod;
    if ((getPropertiesMethod = AudioInputServiceGrpc.getPropertiesMethod) == null) {
      synchronized (AudioInputServiceGrpc.class) {
        if ((getPropertiesMethod = AudioInputServiceGrpc.getPropertiesMethod) == null) {
          AudioInputServiceGrpc.getPropertiesMethod = getPropertiesMethod =
              io.grpc.MethodDescriptor.<com.viam.component.audioinput.v1.Audioinput.PropertiesRequest, com.viam.component.audioinput.v1.Audioinput.PropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Properties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.audioinput.v1.Audioinput.PropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.audioinput.v1.Audioinput.PropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.audioinput.v1.Audioinput.RecordRequest,
      com.google.api.HttpBody> getRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Record",
      requestType = com.viam.component.audioinput.v1.Audioinput.RecordRequest.class,
      responseType = com.google.api.HttpBody.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.audioinput.v1.Audioinput.RecordRequest,
      com.google.api.HttpBody> getRecordMethod() {
    io.grpc.MethodDescriptor<com.viam.component.audioinput.v1.Audioinput.RecordRequest, com.google.api.HttpBody> getRecordMethod;
    if ((getRecordMethod = AudioInputServiceGrpc.getRecordMethod) == null) {
      synchronized (AudioInputServiceGrpc.class) {
        if ((getRecordMethod = AudioInputServiceGrpc.getRecordMethod) == null) {
          AudioInputServiceGrpc.getRecordMethod = getRecordMethod =
              io.grpc.MethodDescriptor.<com.viam.component.audioinput.v1.Audioinput.RecordRequest, com.google.api.HttpBody>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Record"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.audioinput.v1.Audioinput.RecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.api.HttpBody.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRecordMethod;
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
    if ((getDoCommandMethod = AudioInputServiceGrpc.getDoCommandMethod) == null) {
      synchronized (AudioInputServiceGrpc.class) {
        if ((getDoCommandMethod = AudioInputServiceGrpc.getDoCommandMethod) == null) {
          AudioInputServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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
    if ((getGetGeometriesMethod = AudioInputServiceGrpc.getGetGeometriesMethod) == null) {
      synchronized (AudioInputServiceGrpc.class) {
        if ((getGetGeometriesMethod = AudioInputServiceGrpc.getGetGeometriesMethod) == null) {
          AudioInputServiceGrpc.getGetGeometriesMethod = getGetGeometriesMethod =
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
  public static AudioInputServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioInputServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioInputServiceStub>() {
        @java.lang.Override
        public AudioInputServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioInputServiceStub(channel, callOptions);
        }
      };
    return AudioInputServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AudioInputServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioInputServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioInputServiceBlockingStub>() {
        @java.lang.Override
        public AudioInputServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioInputServiceBlockingStub(channel, callOptions);
        }
      };
    return AudioInputServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AudioInputServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioInputServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioInputServiceFutureStub>() {
        @java.lang.Override
        public AudioInputServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioInputServiceFutureStub(channel, callOptions);
        }
      };
    return AudioInputServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An AudioInputService services all audio inputs associated with a robot
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Chunks returns audio chunks forever from an audio input of the underlying robot.
     * </pre>
     */
    default void chunks(com.viam.component.audioinput.v1.Audioinput.ChunksRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.audioinput.v1.Audioinput.ChunksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChunksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Properties returns properties of an audio input of the underlying robot.
     * </pre>
     */
    default void properties(com.viam.component.audioinput.v1.Audioinput.PropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.audioinput.v1.Audioinput.PropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Record records audio from an audio input of the underlying robot
     * to an HTTP response. A specific MIME type cannot be requested and may not necessarily
     * be the same one returned each time.
     * </pre>
     */
    default void record(com.viam.component.audioinput.v1.Audioinput.RecordRequest request,
        io.grpc.stub.StreamObserver<com.google.api.HttpBody> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordMethod(), responseObserver);
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
   * Base class for the server implementation of the service AudioInputService.
   * <pre>
   * An AudioInputService services all audio inputs associated with a robot
   * </pre>
   */
  public static abstract class AudioInputServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AudioInputServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AudioInputService.
   * <pre>
   * An AudioInputService services all audio inputs associated with a robot
   * </pre>
   */
  public static final class AudioInputServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AudioInputServiceStub> {
    private AudioInputServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioInputServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioInputServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Chunks returns audio chunks forever from an audio input of the underlying robot.
     * </pre>
     */
    public void chunks(com.viam.component.audioinput.v1.Audioinput.ChunksRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.audioinput.v1.Audioinput.ChunksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getChunksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Properties returns properties of an audio input of the underlying robot.
     * </pre>
     */
    public void properties(com.viam.component.audioinput.v1.Audioinput.PropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.audioinput.v1.Audioinput.PropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Record records audio from an audio input of the underlying robot
     * to an HTTP response. A specific MIME type cannot be requested and may not necessarily
     * be the same one returned each time.
     * </pre>
     */
    public void record(com.viam.component.audioinput.v1.Audioinput.RecordRequest request,
        io.grpc.stub.StreamObserver<com.google.api.HttpBody> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordMethod(), getCallOptions()), request, responseObserver);
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
   * A stub to allow clients to do synchronous rpc calls to service AudioInputService.
   * <pre>
   * An AudioInputService services all audio inputs associated with a robot
   * </pre>
   */
  public static final class AudioInputServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AudioInputServiceBlockingStub> {
    private AudioInputServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioInputServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioInputServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Chunks returns audio chunks forever from an audio input of the underlying robot.
     * </pre>
     */
    public java.util.Iterator<com.viam.component.audioinput.v1.Audioinput.ChunksResponse> chunks(
        com.viam.component.audioinput.v1.Audioinput.ChunksRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getChunksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Properties returns properties of an audio input of the underlying robot.
     * </pre>
     */
    public com.viam.component.audioinput.v1.Audioinput.PropertiesResponse properties(com.viam.component.audioinput.v1.Audioinput.PropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Record records audio from an audio input of the underlying robot
     * to an HTTP response. A specific MIME type cannot be requested and may not necessarily
     * be the same one returned each time.
     * </pre>
     */
    public com.google.api.HttpBody record(com.viam.component.audioinput.v1.Audioinput.RecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordMethod(), getCallOptions(), request);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AudioInputService.
   * <pre>
   * An AudioInputService services all audio inputs associated with a robot
   * </pre>
   */
  public static final class AudioInputServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AudioInputServiceFutureStub> {
    private AudioInputServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioInputServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioInputServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Properties returns properties of an audio input of the underlying robot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.audioinput.v1.Audioinput.PropertiesResponse> properties(
        com.viam.component.audioinput.v1.Audioinput.PropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Record records audio from an audio input of the underlying robot
     * to an HTTP response. A specific MIME type cannot be requested and may not necessarily
     * be the same one returned each time.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.api.HttpBody> record(
        com.viam.component.audioinput.v1.Audioinput.RecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordMethod(), getCallOptions()), request);
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

  private static final int METHODID_CHUNKS = 0;
  private static final int METHODID_PROPERTIES = 1;
  private static final int METHODID_RECORD = 2;
  private static final int METHODID_DO_COMMAND = 3;
  private static final int METHODID_GET_GEOMETRIES = 4;

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
        case METHODID_CHUNKS:
          serviceImpl.chunks((com.viam.component.audioinput.v1.Audioinput.ChunksRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.audioinput.v1.Audioinput.ChunksResponse>) responseObserver);
          break;
        case METHODID_PROPERTIES:
          serviceImpl.properties((com.viam.component.audioinput.v1.Audioinput.PropertiesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.audioinput.v1.Audioinput.PropertiesResponse>) responseObserver);
          break;
        case METHODID_RECORD:
          serviceImpl.record((com.viam.component.audioinput.v1.Audioinput.RecordRequest) request,
              (io.grpc.stub.StreamObserver<com.google.api.HttpBody>) responseObserver);
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
          getChunksMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.viam.component.audioinput.v1.Audioinput.ChunksRequest,
              com.viam.component.audioinput.v1.Audioinput.ChunksResponse>(
                service, METHODID_CHUNKS)))
        .addMethod(
          getPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.audioinput.v1.Audioinput.PropertiesRequest,
              com.viam.component.audioinput.v1.Audioinput.PropertiesResponse>(
                service, METHODID_PROPERTIES)))
        .addMethod(
          getRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.audioinput.v1.Audioinput.RecordRequest,
              com.google.api.HttpBody>(
                service, METHODID_RECORD)))
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
      synchronized (AudioInputServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getChunksMethod())
              .addMethod(getPropertiesMethod())
              .addMethod(getRecordMethod())
              .addMethod(getDoCommandMethod())
              .addMethod(getGetGeometriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
