package viam.app.datasync.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: app/datasync/v1/data_sync.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataSyncServiceGrpc {

  private DataSyncServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.app.datasync.v1.DataSyncService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.datasync.v1.DataSync.DataCaptureUploadRequest,
      viam.app.datasync.v1.DataSync.DataCaptureUploadResponse> getDataCaptureUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataCaptureUpload",
      requestType = viam.app.datasync.v1.DataSync.DataCaptureUploadRequest.class,
      responseType = viam.app.datasync.v1.DataSync.DataCaptureUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.datasync.v1.DataSync.DataCaptureUploadRequest,
      viam.app.datasync.v1.DataSync.DataCaptureUploadResponse> getDataCaptureUploadMethod() {
    io.grpc.MethodDescriptor<viam.app.datasync.v1.DataSync.DataCaptureUploadRequest, viam.app.datasync.v1.DataSync.DataCaptureUploadResponse> getDataCaptureUploadMethod;
    if ((getDataCaptureUploadMethod = DataSyncServiceGrpc.getDataCaptureUploadMethod) == null) {
      synchronized (DataSyncServiceGrpc.class) {
        if ((getDataCaptureUploadMethod = DataSyncServiceGrpc.getDataCaptureUploadMethod) == null) {
          DataSyncServiceGrpc.getDataCaptureUploadMethod = getDataCaptureUploadMethod =
              io.grpc.MethodDescriptor.<viam.app.datasync.v1.DataSync.DataCaptureUploadRequest, viam.app.datasync.v1.DataSync.DataCaptureUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataCaptureUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datasync.v1.DataSync.DataCaptureUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datasync.v1.DataSync.DataCaptureUploadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDataCaptureUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.datasync.v1.DataSync.FileUploadRequest,
      viam.app.datasync.v1.DataSync.FileUploadResponse> getFileUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FileUpload",
      requestType = viam.app.datasync.v1.DataSync.FileUploadRequest.class,
      responseType = viam.app.datasync.v1.DataSync.FileUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<viam.app.datasync.v1.DataSync.FileUploadRequest,
      viam.app.datasync.v1.DataSync.FileUploadResponse> getFileUploadMethod() {
    io.grpc.MethodDescriptor<viam.app.datasync.v1.DataSync.FileUploadRequest, viam.app.datasync.v1.DataSync.FileUploadResponse> getFileUploadMethod;
    if ((getFileUploadMethod = DataSyncServiceGrpc.getFileUploadMethod) == null) {
      synchronized (DataSyncServiceGrpc.class) {
        if ((getFileUploadMethod = DataSyncServiceGrpc.getFileUploadMethod) == null) {
          DataSyncServiceGrpc.getFileUploadMethod = getFileUploadMethod =
              io.grpc.MethodDescriptor.<viam.app.datasync.v1.DataSync.FileUploadRequest, viam.app.datasync.v1.DataSync.FileUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FileUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datasync.v1.DataSync.FileUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datasync.v1.DataSync.FileUploadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getFileUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadRequest,
      viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadResponse> getStreamingDataCaptureUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamingDataCaptureUpload",
      requestType = viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadRequest.class,
      responseType = viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadRequest,
      viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadResponse> getStreamingDataCaptureUploadMethod() {
    io.grpc.MethodDescriptor<viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadRequest, viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadResponse> getStreamingDataCaptureUploadMethod;
    if ((getStreamingDataCaptureUploadMethod = DataSyncServiceGrpc.getStreamingDataCaptureUploadMethod) == null) {
      synchronized (DataSyncServiceGrpc.class) {
        if ((getStreamingDataCaptureUploadMethod = DataSyncServiceGrpc.getStreamingDataCaptureUploadMethod) == null) {
          DataSyncServiceGrpc.getStreamingDataCaptureUploadMethod = getStreamingDataCaptureUploadMethod =
              io.grpc.MethodDescriptor.<viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadRequest, viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamingDataCaptureUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStreamingDataCaptureUploadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataSyncServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSyncServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSyncServiceStub>() {
        @java.lang.Override
        public DataSyncServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSyncServiceStub(channel, callOptions);
        }
      };
    return DataSyncServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataSyncServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSyncServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSyncServiceBlockingStub>() {
        @java.lang.Override
        public DataSyncServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSyncServiceBlockingStub(channel, callOptions);
        }
      };
    return DataSyncServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataSyncServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSyncServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSyncServiceFutureStub>() {
        @java.lang.Override
        public DataSyncServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSyncServiceFutureStub(channel, callOptions);
        }
      };
    return DataSyncServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * DataCaptureUpload uploads the contents and metadata for tabular data.
     * </pre>
     */
    default void dataCaptureUpload(viam.app.datasync.v1.DataSync.DataCaptureUploadRequest request,
        io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.DataCaptureUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataCaptureUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * FileUpload uploads the contents and metadata for binary (image + file) data,
     * where the first packet must be the UploadMetadata.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.FileUploadRequest> fileUpload(
        io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.FileUploadResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFileUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * StreamingDataCaptureUpload uploads the streaming contents and metadata for streaming binary (image + file) data,
     * where the first packet must be the UploadMetadata.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadRequest> streamingDataCaptureUpload(
        io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamingDataCaptureUploadMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataSyncService.
   */
  public static abstract class DataSyncServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataSyncServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataSyncService.
   */
  public static final class DataSyncServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataSyncServiceStub> {
    private DataSyncServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSyncServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSyncServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * DataCaptureUpload uploads the contents and metadata for tabular data.
     * </pre>
     */
    public void dataCaptureUpload(viam.app.datasync.v1.DataSync.DataCaptureUploadRequest request,
        io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.DataCaptureUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataCaptureUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FileUpload uploads the contents and metadata for binary (image + file) data,
     * where the first packet must be the UploadMetadata.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.FileUploadRequest> fileUpload(
        io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.FileUploadResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getFileUploadMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * StreamingDataCaptureUpload uploads the streaming contents and metadata for streaming binary (image + file) data,
     * where the first packet must be the UploadMetadata.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadRequest> streamingDataCaptureUpload(
        io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStreamingDataCaptureUploadMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataSyncService.
   */
  public static final class DataSyncServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataSyncServiceBlockingStub> {
    private DataSyncServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSyncServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSyncServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * DataCaptureUpload uploads the contents and metadata for tabular data.
     * </pre>
     */
    public viam.app.datasync.v1.DataSync.DataCaptureUploadResponse dataCaptureUpload(viam.app.datasync.v1.DataSync.DataCaptureUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataCaptureUploadMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataSyncService.
   */
  public static final class DataSyncServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataSyncServiceFutureStub> {
    private DataSyncServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSyncServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSyncServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * DataCaptureUpload uploads the contents and metadata for tabular data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.datasync.v1.DataSync.DataCaptureUploadResponse> dataCaptureUpload(
        viam.app.datasync.v1.DataSync.DataCaptureUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataCaptureUploadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DATA_CAPTURE_UPLOAD = 0;
  private static final int METHODID_FILE_UPLOAD = 1;
  private static final int METHODID_STREAMING_DATA_CAPTURE_UPLOAD = 2;

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
        case METHODID_DATA_CAPTURE_UPLOAD:
          serviceImpl.dataCaptureUpload((viam.app.datasync.v1.DataSync.DataCaptureUploadRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.DataCaptureUploadResponse>) responseObserver);
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
        case METHODID_FILE_UPLOAD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fileUpload(
              (io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.FileUploadResponse>) responseObserver);
        case METHODID_STREAMING_DATA_CAPTURE_UPLOAD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamingDataCaptureUpload(
              (io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getDataCaptureUploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.datasync.v1.DataSync.DataCaptureUploadRequest,
              viam.app.datasync.v1.DataSync.DataCaptureUploadResponse>(
                service, METHODID_DATA_CAPTURE_UPLOAD)))
        .addMethod(
          getFileUploadMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              viam.app.datasync.v1.DataSync.FileUploadRequest,
              viam.app.datasync.v1.DataSync.FileUploadResponse>(
                service, METHODID_FILE_UPLOAD)))
        .addMethod(
          getStreamingDataCaptureUploadMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadRequest,
              viam.app.datasync.v1.DataSync.StreamingDataCaptureUploadResponse>(
                service, METHODID_STREAMING_DATA_CAPTURE_UPLOAD)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataSyncServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getDataCaptureUploadMethod())
              .addMethod(getFileUploadMethod())
              .addMethod(getStreamingDataCaptureUploadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
