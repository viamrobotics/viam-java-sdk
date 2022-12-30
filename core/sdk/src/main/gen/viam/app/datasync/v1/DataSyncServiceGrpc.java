package viam.app.datasync.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: app/datasync/v1/data_sync.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataSyncServiceGrpc {

  private DataSyncServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.app.datasync.v1.DataSyncService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.datasync.v1.DataSync.UploadRequest,
      viam.app.datasync.v1.DataSync.UploadResponse> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = viam.app.datasync.v1.DataSync.UploadRequest.class,
      responseType = viam.app.datasync.v1.DataSync.UploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<viam.app.datasync.v1.DataSync.UploadRequest,
      viam.app.datasync.v1.DataSync.UploadResponse> getUploadMethod() {
    io.grpc.MethodDescriptor<viam.app.datasync.v1.DataSync.UploadRequest, viam.app.datasync.v1.DataSync.UploadResponse> getUploadMethod;
    if ((getUploadMethod = DataSyncServiceGrpc.getUploadMethod) == null) {
      synchronized (DataSyncServiceGrpc.class) {
        if ((getUploadMethod = DataSyncServiceGrpc.getUploadMethod) == null) {
          DataSyncServiceGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<viam.app.datasync.v1.DataSync.UploadRequest, viam.app.datasync.v1.DataSync.UploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.datasync.v1.DataSync.UploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.datasync.v1.DataSync.UploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataSyncServiceMethodDescriptorSupplier("Upload"))
              .build();
        }
      }
    }
    return getUploadMethod;
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
  public static abstract class DataSyncServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.UploadRequest> upload(
        io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.UploadResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                viam.app.datasync.v1.DataSync.UploadRequest,
                viam.app.datasync.v1.DataSync.UploadResponse>(
                  this, METHODID_UPLOAD)))
          .build();
    }
  }

  /**
   */
  public static final class DataSyncServiceStub extends io.grpc.stub.AbstractAsyncStub<DataSyncServiceStub> {
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
     */
    public io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.UploadRequest> upload(
        io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.UploadResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class DataSyncServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DataSyncServiceBlockingStub> {
    private DataSyncServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSyncServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSyncServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class DataSyncServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DataSyncServiceFutureStub> {
    private DataSyncServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSyncServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSyncServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_UPLOAD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataSyncServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataSyncServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.upload(
              (io.grpc.stub.StreamObserver<viam.app.datasync.v1.DataSync.UploadResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DataSyncServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataSyncServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return viam.app.datasync.v1.DataSync.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataSyncService");
    }
  }

  private static final class DataSyncServiceFileDescriptorSupplier
      extends DataSyncServiceBaseDescriptorSupplier {
    DataSyncServiceFileDescriptorSupplier() {}
  }

  private static final class DataSyncServiceMethodDescriptorSupplier
      extends DataSyncServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataSyncServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataSyncServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataSyncServiceFileDescriptorSupplier())
              .addMethod(getUploadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
