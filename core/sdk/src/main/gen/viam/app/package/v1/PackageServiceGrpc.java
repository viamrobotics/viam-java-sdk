package viam.app.package.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: app/package/v1/package.proto")
public final class PackageServiceGrpc {

  private PackageServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.app.package.v1.PackageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.package.v1.PackageOuterClass.CreatePackageRequest,
      viam.app.package.v1.PackageOuterClass.CreatePackageResponse> getCreatePackageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePackage",
      requestType = viam.app.package.v1.PackageOuterClass.CreatePackageRequest.class,
      responseType = viam.app.package.v1.PackageOuterClass.CreatePackageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<viam.app.package.v1.PackageOuterClass.CreatePackageRequest,
      viam.app.package.v1.PackageOuterClass.CreatePackageResponse> getCreatePackageMethod() {
    io.grpc.MethodDescriptor<viam.app.package.v1.PackageOuterClass.CreatePackageRequest, viam.app.package.v1.PackageOuterClass.CreatePackageResponse> getCreatePackageMethod;
    if ((getCreatePackageMethod = PackageServiceGrpc.getCreatePackageMethod) == null) {
      synchronized (PackageServiceGrpc.class) {
        if ((getCreatePackageMethod = PackageServiceGrpc.getCreatePackageMethod) == null) {
          PackageServiceGrpc.getCreatePackageMethod = getCreatePackageMethod =
              io.grpc.MethodDescriptor.<viam.app.package.v1.PackageOuterClass.CreatePackageRequest, viam.app.package.v1.PackageOuterClass.CreatePackageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePackage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.package.v1.PackageOuterClass.CreatePackageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.package.v1.PackageOuterClass.CreatePackageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PackageServiceMethodDescriptorSupplier("CreatePackage"))
              .build();
        }
      }
    }
    return getCreatePackageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.package.v1.PackageOuterClass.DeletePackageRequest,
      viam.app.package.v1.PackageOuterClass.DeletePackageResponse> getDeletePackageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePackage",
      requestType = viam.app.package.v1.PackageOuterClass.DeletePackageRequest.class,
      responseType = viam.app.package.v1.PackageOuterClass.DeletePackageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.package.v1.PackageOuterClass.DeletePackageRequest,
      viam.app.package.v1.PackageOuterClass.DeletePackageResponse> getDeletePackageMethod() {
    io.grpc.MethodDescriptor<viam.app.package.v1.PackageOuterClass.DeletePackageRequest, viam.app.package.v1.PackageOuterClass.DeletePackageResponse> getDeletePackageMethod;
    if ((getDeletePackageMethod = PackageServiceGrpc.getDeletePackageMethod) == null) {
      synchronized (PackageServiceGrpc.class) {
        if ((getDeletePackageMethod = PackageServiceGrpc.getDeletePackageMethod) == null) {
          PackageServiceGrpc.getDeletePackageMethod = getDeletePackageMethod =
              io.grpc.MethodDescriptor.<viam.app.package.v1.PackageOuterClass.DeletePackageRequest, viam.app.package.v1.PackageOuterClass.DeletePackageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePackage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.package.v1.PackageOuterClass.DeletePackageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.package.v1.PackageOuterClass.DeletePackageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PackageServiceMethodDescriptorSupplier("DeletePackage"))
              .build();
        }
      }
    }
    return getDeletePackageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.package.v1.PackageOuterClass.GetPackageRequest,
      viam.app.package.v1.PackageOuterClass.GetPackageResponse> getGetPackageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPackage",
      requestType = viam.app.package.v1.PackageOuterClass.GetPackageRequest.class,
      responseType = viam.app.package.v1.PackageOuterClass.GetPackageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.package.v1.PackageOuterClass.GetPackageRequest,
      viam.app.package.v1.PackageOuterClass.GetPackageResponse> getGetPackageMethod() {
    io.grpc.MethodDescriptor<viam.app.package.v1.PackageOuterClass.GetPackageRequest, viam.app.package.v1.PackageOuterClass.GetPackageResponse> getGetPackageMethod;
    if ((getGetPackageMethod = PackageServiceGrpc.getGetPackageMethod) == null) {
      synchronized (PackageServiceGrpc.class) {
        if ((getGetPackageMethod = PackageServiceGrpc.getGetPackageMethod) == null) {
          PackageServiceGrpc.getGetPackageMethod = getGetPackageMethod =
              io.grpc.MethodDescriptor.<viam.app.package.v1.PackageOuterClass.GetPackageRequest, viam.app.package.v1.PackageOuterClass.GetPackageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPackage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.package.v1.PackageOuterClass.GetPackageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.package.v1.PackageOuterClass.GetPackageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PackageServiceMethodDescriptorSupplier("GetPackage"))
              .build();
        }
      }
    }
    return getGetPackageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.package.v1.PackageOuterClass.ListPackagesRequest,
      viam.app.package.v1.PackageOuterClass.ListPackagesResponse> getListPackagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPackages",
      requestType = viam.app.package.v1.PackageOuterClass.ListPackagesRequest.class,
      responseType = viam.app.package.v1.PackageOuterClass.ListPackagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.package.v1.PackageOuterClass.ListPackagesRequest,
      viam.app.package.v1.PackageOuterClass.ListPackagesResponse> getListPackagesMethod() {
    io.grpc.MethodDescriptor<viam.app.package.v1.PackageOuterClass.ListPackagesRequest, viam.app.package.v1.PackageOuterClass.ListPackagesResponse> getListPackagesMethod;
    if ((getListPackagesMethod = PackageServiceGrpc.getListPackagesMethod) == null) {
      synchronized (PackageServiceGrpc.class) {
        if ((getListPackagesMethod = PackageServiceGrpc.getListPackagesMethod) == null) {
          PackageServiceGrpc.getListPackagesMethod = getListPackagesMethod =
              io.grpc.MethodDescriptor.<viam.app.package.v1.PackageOuterClass.ListPackagesRequest, viam.app.package.v1.PackageOuterClass.ListPackagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPackages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.package.v1.PackageOuterClass.ListPackagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.package.v1.PackageOuterClass.ListPackagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PackageServiceMethodDescriptorSupplier("ListPackages"))
              .build();
        }
      }
    }
    return getListPackagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PackageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PackageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PackageServiceStub>() {
        @java.lang.Override
        public PackageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PackageServiceStub(channel, callOptions);
        }
      };
    return PackageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PackageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PackageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PackageServiceBlockingStub>() {
        @java.lang.Override
        public PackageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PackageServiceBlockingStub(channel, callOptions);
        }
      };
    return PackageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PackageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PackageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PackageServiceFutureStub>() {
        @java.lang.Override
        public PackageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PackageServiceFutureStub(channel, callOptions);
        }
      };
    return PackageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PackageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreatePackage uploads a package to the cloud
     * </pre>
     */
    public io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.CreatePackageRequest> createPackage(
        io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.CreatePackageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreatePackageMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeletePackage removes the given package versions
     * </pre>
     */
    public void deletePackage(viam.app.package.v1.PackageOuterClass.DeletePackageRequest request,
        io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.DeletePackageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePackageMethod(), responseObserver);
    }

    /**
     * <pre>
     * // GetPackage returns the URL and metadata for a requested package version
     * </pre>
     */
    public void getPackage(viam.app.package.v1.PackageOuterClass.GetPackageRequest request,
        io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.GetPackageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPackageMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListPackages get the URLs and metadata for requested packages. Include package name, version, and/or type to filter beyond the required organization_id.
     * </pre>
     */
    public void listPackages(viam.app.package.v1.PackageOuterClass.ListPackagesRequest request,
        io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.ListPackagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPackagesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePackageMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                viam.app.package.v1.PackageOuterClass.CreatePackageRequest,
                viam.app.package.v1.PackageOuterClass.CreatePackageResponse>(
                  this, METHODID_CREATE_PACKAGE)))
          .addMethod(
            getDeletePackageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.package.v1.PackageOuterClass.DeletePackageRequest,
                viam.app.package.v1.PackageOuterClass.DeletePackageResponse>(
                  this, METHODID_DELETE_PACKAGE)))
          .addMethod(
            getGetPackageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.package.v1.PackageOuterClass.GetPackageRequest,
                viam.app.package.v1.PackageOuterClass.GetPackageResponse>(
                  this, METHODID_GET_PACKAGE)))
          .addMethod(
            getListPackagesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.package.v1.PackageOuterClass.ListPackagesRequest,
                viam.app.package.v1.PackageOuterClass.ListPackagesResponse>(
                  this, METHODID_LIST_PACKAGES)))
          .build();
    }
  }

  /**
   */
  public static final class PackageServiceStub extends io.grpc.stub.AbstractAsyncStub<PackageServiceStub> {
    private PackageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PackageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PackageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreatePackage uploads a package to the cloud
     * </pre>
     */
    public io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.CreatePackageRequest> createPackage(
        io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.CreatePackageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreatePackageMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * DeletePackage removes the given package versions
     * </pre>
     */
    public void deletePackage(viam.app.package.v1.PackageOuterClass.DeletePackageRequest request,
        io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.DeletePackageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePackageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * // GetPackage returns the URL and metadata for a requested package version
     * </pre>
     */
    public void getPackage(viam.app.package.v1.PackageOuterClass.GetPackageRequest request,
        io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.GetPackageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPackageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListPackages get the URLs and metadata for requested packages. Include package name, version, and/or type to filter beyond the required organization_id.
     * </pre>
     */
    public void listPackages(viam.app.package.v1.PackageOuterClass.ListPackagesRequest request,
        io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.ListPackagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPackagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PackageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PackageServiceBlockingStub> {
    private PackageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PackageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PackageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeletePackage removes the given package versions
     * </pre>
     */
    public viam.app.package.v1.PackageOuterClass.DeletePackageResponse deletePackage(viam.app.package.v1.PackageOuterClass.DeletePackageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePackageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * // GetPackage returns the URL and metadata for a requested package version
     * </pre>
     */
    public viam.app.package.v1.PackageOuterClass.GetPackageResponse getPackage(viam.app.package.v1.PackageOuterClass.GetPackageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPackageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListPackages get the URLs and metadata for requested packages. Include package name, version, and/or type to filter beyond the required organization_id.
     * </pre>
     */
    public viam.app.package.v1.PackageOuterClass.ListPackagesResponse listPackages(viam.app.package.v1.PackageOuterClass.ListPackagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPackagesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PackageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PackageServiceFutureStub> {
    private PackageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PackageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PackageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeletePackage removes the given package versions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.package.v1.PackageOuterClass.DeletePackageResponse> deletePackage(
        viam.app.package.v1.PackageOuterClass.DeletePackageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePackageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * // GetPackage returns the URL and metadata for a requested package version
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.package.v1.PackageOuterClass.GetPackageResponse> getPackage(
        viam.app.package.v1.PackageOuterClass.GetPackageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPackageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListPackages get the URLs and metadata for requested packages. Include package name, version, and/or type to filter beyond the required organization_id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.package.v1.PackageOuterClass.ListPackagesResponse> listPackages(
        viam.app.package.v1.PackageOuterClass.ListPackagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPackagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_PACKAGE = 0;
  private static final int METHODID_GET_PACKAGE = 1;
  private static final int METHODID_LIST_PACKAGES = 2;
  private static final int METHODID_CREATE_PACKAGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PackageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PackageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE_PACKAGE:
          serviceImpl.deletePackage((viam.app.package.v1.PackageOuterClass.DeletePackageRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.DeletePackageResponse>) responseObserver);
          break;
        case METHODID_GET_PACKAGE:
          serviceImpl.getPackage((viam.app.package.v1.PackageOuterClass.GetPackageRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.GetPackageResponse>) responseObserver);
          break;
        case METHODID_LIST_PACKAGES:
          serviceImpl.listPackages((viam.app.package.v1.PackageOuterClass.ListPackagesRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.ListPackagesResponse>) responseObserver);
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
        case METHODID_CREATE_PACKAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createPackage(
              (io.grpc.stub.StreamObserver<viam.app.package.v1.PackageOuterClass.CreatePackageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PackageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PackageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return viam.app.package.v1.PackageOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PackageService");
    }
  }

  private static final class PackageServiceFileDescriptorSupplier
      extends PackageServiceBaseDescriptorSupplier {
    PackageServiceFileDescriptorSupplier() {}
  }

  private static final class PackageServiceMethodDescriptorSupplier
      extends PackageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PackageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PackageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PackageServiceFileDescriptorSupplier())
              .addMethod(getCreatePackageMethod())
              .addMethod(getDeletePackageMethod())
              .addMethod(getGetPackageMethod())
              .addMethod(getListPackagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
