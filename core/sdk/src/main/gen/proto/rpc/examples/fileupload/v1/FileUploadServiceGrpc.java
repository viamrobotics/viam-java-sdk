package proto.rpc.examples.fileupload.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: proto/rpc/examples/fileupload/v1/fileupload.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FileUploadServiceGrpc {

  private FileUploadServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.rpc.examples.fileupload.v1.FileUploadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest,
      proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse> getUploadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadFile",
      requestType = proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest.class,
      responseType = proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest,
      proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse> getUploadFileMethod() {
    io.grpc.MethodDescriptor<proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest, proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse> getUploadFileMethod;
    if ((getUploadFileMethod = FileUploadServiceGrpc.getUploadFileMethod) == null) {
      synchronized (FileUploadServiceGrpc.class) {
        if ((getUploadFileMethod = FileUploadServiceGrpc.getUploadFileMethod) == null) {
          FileUploadServiceGrpc.getUploadFileMethod = getUploadFileMethod =
              io.grpc.MethodDescriptor.<proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest, proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUploadFileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileUploadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileUploadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileUploadServiceStub>() {
        @java.lang.Override
        public FileUploadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileUploadServiceStub(channel, callOptions);
        }
      };
    return FileUploadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileUploadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileUploadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileUploadServiceBlockingStub>() {
        @java.lang.Override
        public FileUploadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileUploadServiceBlockingStub(channel, callOptions);
        }
      };
    return FileUploadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileUploadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileUploadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileUploadServiceFutureStub>() {
        @java.lang.Override
        public FileUploadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileUploadServiceFutureStub(channel, callOptions);
        }
      };
    return FileUploadServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest> uploadFile(
        io.grpc.stub.StreamObserver<proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadFileMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FileUploadService.
   */
  public static abstract class FileUploadServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FileUploadServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FileUploadService.
   */
  public static final class FileUploadServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FileUploadServiceStub> {
    private FileUploadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileUploadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileUploadServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest> uploadFile(
        io.grpc.stub.StreamObserver<proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadFileMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FileUploadService.
   */
  public static final class FileUploadServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FileUploadServiceBlockingStub> {
    private FileUploadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileUploadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileUploadServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FileUploadService.
   */
  public static final class FileUploadServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FileUploadServiceFutureStub> {
    private FileUploadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileUploadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileUploadServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_UPLOAD_FILE = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_FILE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadFile(
              (io.grpc.stub.StreamObserver<proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getUploadFileMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest,
              proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse>(
                service, METHODID_UPLOAD_FILE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FileUploadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getUploadFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
