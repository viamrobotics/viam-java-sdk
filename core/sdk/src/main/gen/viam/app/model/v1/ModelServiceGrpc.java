package viam.app.model.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: app/model/v1/model.proto")
public final class ModelServiceGrpc {

  private ModelServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.app.model.v1.ModelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.model.v1.ModelOuterClass.UploadRequest,
      viam.app.model.v1.ModelOuterClass.UploadResponse> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = viam.app.model.v1.ModelOuterClass.UploadRequest.class,
      responseType = viam.app.model.v1.ModelOuterClass.UploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<viam.app.model.v1.ModelOuterClass.UploadRequest,
      viam.app.model.v1.ModelOuterClass.UploadResponse> getUploadMethod() {
    io.grpc.MethodDescriptor<viam.app.model.v1.ModelOuterClass.UploadRequest, viam.app.model.v1.ModelOuterClass.UploadResponse> getUploadMethod;
    if ((getUploadMethod = ModelServiceGrpc.getUploadMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getUploadMethod = ModelServiceGrpc.getUploadMethod) == null) {
          ModelServiceGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<viam.app.model.v1.ModelOuterClass.UploadRequest, viam.app.model.v1.ModelOuterClass.UploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.model.v1.ModelOuterClass.UploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.model.v1.ModelOuterClass.UploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("Upload"))
              .build();
        }
      }
    }
    return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.model.v1.ModelOuterClass.DeleteRequest,
      viam.app.model.v1.ModelOuterClass.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = viam.app.model.v1.ModelOuterClass.DeleteRequest.class,
      responseType = viam.app.model.v1.ModelOuterClass.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.model.v1.ModelOuterClass.DeleteRequest,
      viam.app.model.v1.ModelOuterClass.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<viam.app.model.v1.ModelOuterClass.DeleteRequest, viam.app.model.v1.ModelOuterClass.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ModelServiceGrpc.getDeleteMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getDeleteMethod = ModelServiceGrpc.getDeleteMethod) == null) {
          ModelServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<viam.app.model.v1.ModelOuterClass.DeleteRequest, viam.app.model.v1.ModelOuterClass.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.model.v1.ModelOuterClass.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.model.v1.ModelOuterClass.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.model.v1.ModelOuterClass.DeployRequest,
      viam.app.model.v1.ModelOuterClass.DeployResponse> getDeployMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deploy",
      requestType = viam.app.model.v1.ModelOuterClass.DeployRequest.class,
      responseType = viam.app.model.v1.ModelOuterClass.DeployResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.model.v1.ModelOuterClass.DeployRequest,
      viam.app.model.v1.ModelOuterClass.DeployResponse> getDeployMethod() {
    io.grpc.MethodDescriptor<viam.app.model.v1.ModelOuterClass.DeployRequest, viam.app.model.v1.ModelOuterClass.DeployResponse> getDeployMethod;
    if ((getDeployMethod = ModelServiceGrpc.getDeployMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getDeployMethod = ModelServiceGrpc.getDeployMethod) == null) {
          ModelServiceGrpc.getDeployMethod = getDeployMethod =
              io.grpc.MethodDescriptor.<viam.app.model.v1.ModelOuterClass.DeployRequest, viam.app.model.v1.ModelOuterClass.DeployResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deploy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.model.v1.ModelOuterClass.DeployRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.model.v1.ModelOuterClass.DeployResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("Deploy"))
              .build();
        }
      }
    }
    return getDeployMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.model.v1.ModelOuterClass.InfoRequest,
      viam.app.model.v1.ModelOuterClass.InfoResponse> getInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Info",
      requestType = viam.app.model.v1.ModelOuterClass.InfoRequest.class,
      responseType = viam.app.model.v1.ModelOuterClass.InfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.model.v1.ModelOuterClass.InfoRequest,
      viam.app.model.v1.ModelOuterClass.InfoResponse> getInfoMethod() {
    io.grpc.MethodDescriptor<viam.app.model.v1.ModelOuterClass.InfoRequest, viam.app.model.v1.ModelOuterClass.InfoResponse> getInfoMethod;
    if ((getInfoMethod = ModelServiceGrpc.getInfoMethod) == null) {
      synchronized (ModelServiceGrpc.class) {
        if ((getInfoMethod = ModelServiceGrpc.getInfoMethod) == null) {
          ModelServiceGrpc.getInfoMethod = getInfoMethod =
              io.grpc.MethodDescriptor.<viam.app.model.v1.ModelOuterClass.InfoRequest, viam.app.model.v1.ModelOuterClass.InfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.model.v1.ModelOuterClass.InfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.model.v1.ModelOuterClass.InfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelServiceMethodDescriptorSupplier("Info"))
              .build();
        }
      }
    }
    return getInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ModelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModelServiceStub>() {
        @java.lang.Override
        public ModelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModelServiceStub(channel, callOptions);
        }
      };
    return ModelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ModelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModelServiceBlockingStub>() {
        @java.lang.Override
        public ModelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModelServiceBlockingStub(channel, callOptions);
        }
      };
    return ModelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ModelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModelServiceFutureStub>() {
        @java.lang.Override
        public ModelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModelServiceFutureStub(channel, callOptions);
        }
      };
    return ModelServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ModelServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.UploadRequest> upload(
        io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.UploadResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadMethod(), responseObserver);
    }

    /**
     */
    public void delete(viam.app.model.v1.ModelOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void deploy(viam.app.model.v1.ModelOuterClass.DeployRequest request,
        io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.DeployResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeployMethod(), responseObserver);
    }

    /**
     */
    public void info(viam.app.model.v1.ModelOuterClass.InfoRequest request,
        io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.InfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                viam.app.model.v1.ModelOuterClass.UploadRequest,
                viam.app.model.v1.ModelOuterClass.UploadResponse>(
                  this, METHODID_UPLOAD)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.model.v1.ModelOuterClass.DeleteRequest,
                viam.app.model.v1.ModelOuterClass.DeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getDeployMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.model.v1.ModelOuterClass.DeployRequest,
                viam.app.model.v1.ModelOuterClass.DeployResponse>(
                  this, METHODID_DEPLOY)))
          .addMethod(
            getInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.model.v1.ModelOuterClass.InfoRequest,
                viam.app.model.v1.ModelOuterClass.InfoResponse>(
                  this, METHODID_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class ModelServiceStub extends io.grpc.stub.AbstractAsyncStub<ModelServiceStub> {
    private ModelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModelServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.UploadRequest> upload(
        io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.UploadResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void delete(viam.app.model.v1.ModelOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deploy(viam.app.model.v1.ModelOuterClass.DeployRequest request,
        io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.DeployResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeployMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void info(viam.app.model.v1.ModelOuterClass.InfoRequest request,
        io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.InfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ModelServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ModelServiceBlockingStub> {
    private ModelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModelServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public viam.app.model.v1.ModelOuterClass.DeleteResponse delete(viam.app.model.v1.ModelOuterClass.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.model.v1.ModelOuterClass.DeployResponse deploy(viam.app.model.v1.ModelOuterClass.DeployRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeployMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.model.v1.ModelOuterClass.InfoResponse info(viam.app.model.v1.ModelOuterClass.InfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ModelServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ModelServiceFutureStub> {
    private ModelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModelServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.model.v1.ModelOuterClass.DeleteResponse> delete(
        viam.app.model.v1.ModelOuterClass.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.model.v1.ModelOuterClass.DeployResponse> deploy(
        viam.app.model.v1.ModelOuterClass.DeployRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeployMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.model.v1.ModelOuterClass.InfoResponse> info(
        viam.app.model.v1.ModelOuterClass.InfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE = 0;
  private static final int METHODID_DEPLOY = 1;
  private static final int METHODID_INFO = 2;
  private static final int METHODID_UPLOAD = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ModelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ModelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE:
          serviceImpl.delete((viam.app.model.v1.ModelOuterClass.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.DeleteResponse>) responseObserver);
          break;
        case METHODID_DEPLOY:
          serviceImpl.deploy((viam.app.model.v1.ModelOuterClass.DeployRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.DeployResponse>) responseObserver);
          break;
        case METHODID_INFO:
          serviceImpl.info((viam.app.model.v1.ModelOuterClass.InfoRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.InfoResponse>) responseObserver);
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
        case METHODID_UPLOAD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.upload(
              (io.grpc.stub.StreamObserver<viam.app.model.v1.ModelOuterClass.UploadResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ModelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ModelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return viam.app.model.v1.ModelOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ModelService");
    }
  }

  private static final class ModelServiceFileDescriptorSupplier
      extends ModelServiceBaseDescriptorSupplier {
    ModelServiceFileDescriptorSupplier() {}
  }

  private static final class ModelServiceMethodDescriptorSupplier
      extends ModelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ModelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ModelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ModelServiceFileDescriptorSupplier())
              .addMethod(getUploadMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getDeployMethod())
              .addMethod(getInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
