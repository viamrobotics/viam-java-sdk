package viam.module.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ModuleService deals with modular resource registration
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: module/v1/module.proto")
public final class ModuleServiceGrpc {

  private ModuleServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.module.v1.ModuleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.module.v1.Module.AddResourceRequest,
      viam.module.v1.Module.AddResourceResponse> getAddResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddResource",
      requestType = viam.module.v1.Module.AddResourceRequest.class,
      responseType = viam.module.v1.Module.AddResourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.module.v1.Module.AddResourceRequest,
      viam.module.v1.Module.AddResourceResponse> getAddResourceMethod() {
    io.grpc.MethodDescriptor<viam.module.v1.Module.AddResourceRequest, viam.module.v1.Module.AddResourceResponse> getAddResourceMethod;
    if ((getAddResourceMethod = ModuleServiceGrpc.getAddResourceMethod) == null) {
      synchronized (ModuleServiceGrpc.class) {
        if ((getAddResourceMethod = ModuleServiceGrpc.getAddResourceMethod) == null) {
          ModuleServiceGrpc.getAddResourceMethod = getAddResourceMethod =
              io.grpc.MethodDescriptor.<viam.module.v1.Module.AddResourceRequest, viam.module.v1.Module.AddResourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.module.v1.Module.AddResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.module.v1.Module.AddResourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModuleServiceMethodDescriptorSupplier("AddResource"))
              .build();
        }
      }
    }
    return getAddResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.module.v1.Module.ReconfigureResourceRequest,
      viam.module.v1.Module.ReconfigureResourceResponse> getReconfigureResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReconfigureResource",
      requestType = viam.module.v1.Module.ReconfigureResourceRequest.class,
      responseType = viam.module.v1.Module.ReconfigureResourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.module.v1.Module.ReconfigureResourceRequest,
      viam.module.v1.Module.ReconfigureResourceResponse> getReconfigureResourceMethod() {
    io.grpc.MethodDescriptor<viam.module.v1.Module.ReconfigureResourceRequest, viam.module.v1.Module.ReconfigureResourceResponse> getReconfigureResourceMethod;
    if ((getReconfigureResourceMethod = ModuleServiceGrpc.getReconfigureResourceMethod) == null) {
      synchronized (ModuleServiceGrpc.class) {
        if ((getReconfigureResourceMethod = ModuleServiceGrpc.getReconfigureResourceMethod) == null) {
          ModuleServiceGrpc.getReconfigureResourceMethod = getReconfigureResourceMethod =
              io.grpc.MethodDescriptor.<viam.module.v1.Module.ReconfigureResourceRequest, viam.module.v1.Module.ReconfigureResourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReconfigureResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.module.v1.Module.ReconfigureResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.module.v1.Module.ReconfigureResourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModuleServiceMethodDescriptorSupplier("ReconfigureResource"))
              .build();
        }
      }
    }
    return getReconfigureResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.module.v1.Module.RemoveResourceRequest,
      viam.module.v1.Module.RemoveResourceResponse> getRemoveResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveResource",
      requestType = viam.module.v1.Module.RemoveResourceRequest.class,
      responseType = viam.module.v1.Module.RemoveResourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.module.v1.Module.RemoveResourceRequest,
      viam.module.v1.Module.RemoveResourceResponse> getRemoveResourceMethod() {
    io.grpc.MethodDescriptor<viam.module.v1.Module.RemoveResourceRequest, viam.module.v1.Module.RemoveResourceResponse> getRemoveResourceMethod;
    if ((getRemoveResourceMethod = ModuleServiceGrpc.getRemoveResourceMethod) == null) {
      synchronized (ModuleServiceGrpc.class) {
        if ((getRemoveResourceMethod = ModuleServiceGrpc.getRemoveResourceMethod) == null) {
          ModuleServiceGrpc.getRemoveResourceMethod = getRemoveResourceMethod =
              io.grpc.MethodDescriptor.<viam.module.v1.Module.RemoveResourceRequest, viam.module.v1.Module.RemoveResourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.module.v1.Module.RemoveResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.module.v1.Module.RemoveResourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModuleServiceMethodDescriptorSupplier("RemoveResource"))
              .build();
        }
      }
    }
    return getRemoveResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.module.v1.Module.ReadyRequest,
      viam.module.v1.Module.ReadyResponse> getReadyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ready",
      requestType = viam.module.v1.Module.ReadyRequest.class,
      responseType = viam.module.v1.Module.ReadyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.module.v1.Module.ReadyRequest,
      viam.module.v1.Module.ReadyResponse> getReadyMethod() {
    io.grpc.MethodDescriptor<viam.module.v1.Module.ReadyRequest, viam.module.v1.Module.ReadyResponse> getReadyMethod;
    if ((getReadyMethod = ModuleServiceGrpc.getReadyMethod) == null) {
      synchronized (ModuleServiceGrpc.class) {
        if ((getReadyMethod = ModuleServiceGrpc.getReadyMethod) == null) {
          ModuleServiceGrpc.getReadyMethod = getReadyMethod =
              io.grpc.MethodDescriptor.<viam.module.v1.Module.ReadyRequest, viam.module.v1.Module.ReadyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ready"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.module.v1.Module.ReadyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.module.v1.Module.ReadyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModuleServiceMethodDescriptorSupplier("Ready"))
              .build();
        }
      }
    }
    return getReadyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ModuleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModuleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModuleServiceStub>() {
        @java.lang.Override
        public ModuleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModuleServiceStub(channel, callOptions);
        }
      };
    return ModuleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ModuleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModuleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModuleServiceBlockingStub>() {
        @java.lang.Override
        public ModuleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModuleServiceBlockingStub(channel, callOptions);
        }
      };
    return ModuleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ModuleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModuleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModuleServiceFutureStub>() {
        @java.lang.Override
        public ModuleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModuleServiceFutureStub(channel, callOptions);
        }
      };
    return ModuleServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ModuleService deals with modular resource registration
   * </pre>
   */
  public static abstract class ModuleServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * AddResource tells a module about a new resource to handle
     * </pre>
     */
    public void addResource(viam.module.v1.Module.AddResourceRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.AddResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReconfigureResource tells a module to reconfigure an existing resource
     * </pre>
     */
    public void reconfigureResource(viam.module.v1.Module.ReconfigureResourceRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.ReconfigureResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReconfigureResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveResource tells a module to close/stop a component/service and remove it
     * </pre>
     */
    public void removeResource(viam.module.v1.Module.RemoveResourceRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.RemoveResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Ready determines if the server is started and ready to recieve resource configurations.
     * </pre>
     */
    public void ready(viam.module.v1.Module.ReadyRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.ReadyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddResourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.module.v1.Module.AddResourceRequest,
                viam.module.v1.Module.AddResourceResponse>(
                  this, METHODID_ADD_RESOURCE)))
          .addMethod(
            getReconfigureResourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.module.v1.Module.ReconfigureResourceRequest,
                viam.module.v1.Module.ReconfigureResourceResponse>(
                  this, METHODID_RECONFIGURE_RESOURCE)))
          .addMethod(
            getRemoveResourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.module.v1.Module.RemoveResourceRequest,
                viam.module.v1.Module.RemoveResourceResponse>(
                  this, METHODID_REMOVE_RESOURCE)))
          .addMethod(
            getReadyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.module.v1.Module.ReadyRequest,
                viam.module.v1.Module.ReadyResponse>(
                  this, METHODID_READY)))
          .build();
    }
  }

  /**
   * <pre>
   * ModuleService deals with modular resource registration
   * </pre>
   */
  public static final class ModuleServiceStub extends io.grpc.stub.AbstractAsyncStub<ModuleServiceStub> {
    private ModuleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModuleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModuleServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * AddResource tells a module about a new resource to handle
     * </pre>
     */
    public void addResource(viam.module.v1.Module.AddResourceRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.AddResourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReconfigureResource tells a module to reconfigure an existing resource
     * </pre>
     */
    public void reconfigureResource(viam.module.v1.Module.ReconfigureResourceRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.ReconfigureResourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReconfigureResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveResource tells a module to close/stop a component/service and remove it
     * </pre>
     */
    public void removeResource(viam.module.v1.Module.RemoveResourceRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.RemoveResourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Ready determines if the server is started and ready to recieve resource configurations.
     * </pre>
     */
    public void ready(viam.module.v1.Module.ReadyRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.ReadyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ModuleService deals with modular resource registration
   * </pre>
   */
  public static final class ModuleServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ModuleServiceBlockingStub> {
    private ModuleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModuleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModuleServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * AddResource tells a module about a new resource to handle
     * </pre>
     */
    public viam.module.v1.Module.AddResourceResponse addResource(viam.module.v1.Module.AddResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReconfigureResource tells a module to reconfigure an existing resource
     * </pre>
     */
    public viam.module.v1.Module.ReconfigureResourceResponse reconfigureResource(viam.module.v1.Module.ReconfigureResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReconfigureResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveResource tells a module to close/stop a component/service and remove it
     * </pre>
     */
    public viam.module.v1.Module.RemoveResourceResponse removeResource(viam.module.v1.Module.RemoveResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ready determines if the server is started and ready to recieve resource configurations.
     * </pre>
     */
    public viam.module.v1.Module.ReadyResponse ready(viam.module.v1.Module.ReadyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ModuleService deals with modular resource registration
   * </pre>
   */
  public static final class ModuleServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ModuleServiceFutureStub> {
    private ModuleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModuleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModuleServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * AddResource tells a module about a new resource to handle
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.module.v1.Module.AddResourceResponse> addResource(
        viam.module.v1.Module.AddResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddResourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReconfigureResource tells a module to reconfigure an existing resource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.module.v1.Module.ReconfigureResourceResponse> reconfigureResource(
        viam.module.v1.Module.ReconfigureResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReconfigureResourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveResource tells a module to close/stop a component/service and remove it
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.module.v1.Module.RemoveResourceResponse> removeResource(
        viam.module.v1.Module.RemoveResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveResourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Ready determines if the server is started and ready to recieve resource configurations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.module.v1.Module.ReadyResponse> ready(
        viam.module.v1.Module.ReadyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_RESOURCE = 0;
  private static final int METHODID_RECONFIGURE_RESOURCE = 1;
  private static final int METHODID_REMOVE_RESOURCE = 2;
  private static final int METHODID_READY = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ModuleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ModuleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_RESOURCE:
          serviceImpl.addResource((viam.module.v1.Module.AddResourceRequest) request,
              (io.grpc.stub.StreamObserver<viam.module.v1.Module.AddResourceResponse>) responseObserver);
          break;
        case METHODID_RECONFIGURE_RESOURCE:
          serviceImpl.reconfigureResource((viam.module.v1.Module.ReconfigureResourceRequest) request,
              (io.grpc.stub.StreamObserver<viam.module.v1.Module.ReconfigureResourceResponse>) responseObserver);
          break;
        case METHODID_REMOVE_RESOURCE:
          serviceImpl.removeResource((viam.module.v1.Module.RemoveResourceRequest) request,
              (io.grpc.stub.StreamObserver<viam.module.v1.Module.RemoveResourceResponse>) responseObserver);
          break;
        case METHODID_READY:
          serviceImpl.ready((viam.module.v1.Module.ReadyRequest) request,
              (io.grpc.stub.StreamObserver<viam.module.v1.Module.ReadyResponse>) responseObserver);
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

  private static abstract class ModuleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ModuleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return viam.module.v1.Module.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ModuleService");
    }
  }

  private static final class ModuleServiceFileDescriptorSupplier
      extends ModuleServiceBaseDescriptorSupplier {
    ModuleServiceFileDescriptorSupplier() {}
  }

  private static final class ModuleServiceMethodDescriptorSupplier
      extends ModuleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ModuleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ModuleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ModuleServiceFileDescriptorSupplier())
              .addMethod(getAddResourceMethod())
              .addMethod(getReconfigureResourceMethod())
              .addMethod(getRemoveResourceMethod())
              .addMethod(getReadyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
