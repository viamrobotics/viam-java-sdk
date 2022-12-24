package com.viam.component.audioinput.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An AudioInputService services all audio inputs associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: component/audioinput/v1/audioinput.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AudioInputServiceGrpc {

  private AudioInputServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.component.audioinput.v1.AudioInputService";

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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.audioinput.v1.Audioinput.ChunksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.audioinput.v1.Audioinput.ChunksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AudioInputServiceMethodDescriptorSupplier("Chunks"))
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.audioinput.v1.Audioinput.PropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.audioinput.v1.Audioinput.PropertiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AudioInputServiceMethodDescriptorSupplier("Properties"))
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.audioinput.v1.Audioinput.RecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.api.HttpBody.getDefaultInstance()))
              .setSchemaDescriptor(new AudioInputServiceMethodDescriptorSupplier("Record"))
              .build();
        }
      }
    }
    return getRecordMethod;
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
  public static abstract class AudioInputServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Chunks returns audio chunks forever from an audio input of the underlying robot.
     * </pre>
     */
    public void chunks(com.viam.component.audioinput.v1.Audioinput.ChunksRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.audioinput.v1.Audioinput.ChunksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChunksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Properties returns properties of an audio input of the underlying robot.
     * </pre>
     */
    public void properties(com.viam.component.audioinput.v1.Audioinput.PropertiesRequest request,
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
    public void record(com.viam.component.audioinput.v1.Audioinput.RecordRequest request,
        io.grpc.stub.StreamObserver<com.google.api.HttpBody> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getChunksMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.viam.component.audioinput.v1.Audioinput.ChunksRequest,
                com.viam.component.audioinput.v1.Audioinput.ChunksResponse>(
                  this, METHODID_CHUNKS)))
          .addMethod(
            getPropertiesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.audioinput.v1.Audioinput.PropertiesRequest,
                com.viam.component.audioinput.v1.Audioinput.PropertiesResponse>(
                  this, METHODID_PROPERTIES)))
          .addMethod(
            getRecordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.audioinput.v1.Audioinput.RecordRequest,
                com.google.api.HttpBody>(
                  this, METHODID_RECORD)))
          .build();
    }
  }

  /**
   * <pre>
   * An AudioInputService services all audio inputs associated with a robot
   * </pre>
   */
  public static final class AudioInputServiceStub extends io.grpc.stub.AbstractAsyncStub<AudioInputServiceStub> {
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
  }

  /**
   * <pre>
   * An AudioInputService services all audio inputs associated with a robot
   * </pre>
   */
  public static final class AudioInputServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AudioInputServiceBlockingStub> {
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
  }

  /**
   * <pre>
   * An AudioInputService services all audio inputs associated with a robot
   * </pre>
   */
  public static final class AudioInputServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AudioInputServiceFutureStub> {
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
  }

  private static final int METHODID_CHUNKS = 0;
  private static final int METHODID_PROPERTIES = 1;
  private static final int METHODID_RECORD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AudioInputServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AudioInputServiceImplBase serviceImpl, int methodId) {
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

  private static abstract class AudioInputServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AudioInputServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.component.audioinput.v1.Audioinput.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AudioInputService");
    }
  }

  private static final class AudioInputServiceFileDescriptorSupplier
      extends AudioInputServiceBaseDescriptorSupplier {
    AudioInputServiceFileDescriptorSupplier() {}
  }

  private static final class AudioInputServiceMethodDescriptorSupplier
      extends AudioInputServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AudioInputServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AudioInputServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AudioInputServiceFileDescriptorSupplier())
              .addMethod(getChunksMethod())
              .addMethod(getPropertiesMethod())
              .addMethod(getRecordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
