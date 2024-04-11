package viam.module.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ModuleService deals with modular resource registration
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: module/v1/module.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ModuleServiceGrpc {

  private ModuleServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.module.v1.ModuleService";

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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.module.v1.Module.AddResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.module.v1.Module.AddResourceResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.module.v1.Module.ReconfigureResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.module.v1.Module.ReconfigureResourceResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.module.v1.Module.RemoveResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.module.v1.Module.RemoveResourceResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.module.v1.Module.ReadyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.module.v1.Module.ReadyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getReadyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.module.v1.Module.ValidateConfigRequest,
      viam.module.v1.Module.ValidateConfigResponse> getValidateConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateConfig",
      requestType = viam.module.v1.Module.ValidateConfigRequest.class,
      responseType = viam.module.v1.Module.ValidateConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.module.v1.Module.ValidateConfigRequest,
      viam.module.v1.Module.ValidateConfigResponse> getValidateConfigMethod() {
    io.grpc.MethodDescriptor<viam.module.v1.Module.ValidateConfigRequest, viam.module.v1.Module.ValidateConfigResponse> getValidateConfigMethod;
    if ((getValidateConfigMethod = ModuleServiceGrpc.getValidateConfigMethod) == null) {
      synchronized (ModuleServiceGrpc.class) {
        if ((getValidateConfigMethod = ModuleServiceGrpc.getValidateConfigMethod) == null) {
          ModuleServiceGrpc.getValidateConfigMethod = getValidateConfigMethod =
              io.grpc.MethodDescriptor.<viam.module.v1.Module.ValidateConfigRequest, viam.module.v1.Module.ValidateConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.module.v1.Module.ValidateConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.module.v1.Module.ValidateConfigResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getValidateConfigMethod;
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
  public interface AsyncService {

    /**
     * <pre>
     * AddResource tells a module about a new resource to handle
     * </pre>
     */
    default void addResource(viam.module.v1.Module.AddResourceRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.AddResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReconfigureResource tells a module to reconfigure an existing resource
     * </pre>
     */
    default void reconfigureResource(viam.module.v1.Module.ReconfigureResourceRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.ReconfigureResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReconfigureResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveResource tells a module to close/stop a component/service and remove it
     * </pre>
     */
    default void removeResource(viam.module.v1.Module.RemoveResourceRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.RemoveResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Ready determines if the server is started and ready to recieve resource configurations.
     * </pre>
     */
    default void ready(viam.module.v1.Module.ReadyRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.ReadyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadyMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidateConfig determines whether the given config is valid and registers/returns implicit
     * dependencies.
     * </pre>
     */
    default void validateConfig(viam.module.v1.Module.ValidateConfigRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.ValidateConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ModuleService.
   * <pre>
   * ModuleService deals with modular resource registration
   * </pre>
   */
  public static abstract class ModuleServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ModuleServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ModuleService.
   * <pre>
   * ModuleService deals with modular resource registration
   * </pre>
   */
  public static final class ModuleServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ModuleServiceStub> {
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

    /**
     * <pre>
     * ValidateConfig determines whether the given config is valid and registers/returns implicit
     * dependencies.
     * </pre>
     */
    public void validateConfig(viam.module.v1.Module.ValidateConfigRequest request,
        io.grpc.stub.StreamObserver<viam.module.v1.Module.ValidateConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ModuleService.
   * <pre>
   * ModuleService deals with modular resource registration
   * </pre>
   */
  public static final class ModuleServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ModuleServiceBlockingStub> {
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

    /**
     * <pre>
     * ValidateConfig determines whether the given config is valid and registers/returns implicit
     * dependencies.
     * </pre>
     */
    public viam.module.v1.Module.ValidateConfigResponse validateConfig(viam.module.v1.Module.ValidateConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ModuleService.
   * <pre>
   * ModuleService deals with modular resource registration
   * </pre>
   */
  public static final class ModuleServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ModuleServiceFutureStub> {
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

    /**
     * <pre>
     * ValidateConfig determines whether the given config is valid and registers/returns implicit
     * dependencies.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.module.v1.Module.ValidateConfigResponse> validateConfig(
        viam.module.v1.Module.ValidateConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_RESOURCE = 0;
  private static final int METHODID_RECONFIGURE_RESOURCE = 1;
  private static final int METHODID_REMOVE_RESOURCE = 2;
  private static final int METHODID_READY = 3;
  private static final int METHODID_VALIDATE_CONFIG = 4;

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
        case METHODID_VALIDATE_CONFIG:
          serviceImpl.validateConfig((viam.module.v1.Module.ValidateConfigRequest) request,
              (io.grpc.stub.StreamObserver<viam.module.v1.Module.ValidateConfigResponse>) responseObserver);
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
          getAddResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.module.v1.Module.AddResourceRequest,
              viam.module.v1.Module.AddResourceResponse>(
                service, METHODID_ADD_RESOURCE)))
        .addMethod(
          getReconfigureResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.module.v1.Module.ReconfigureResourceRequest,
              viam.module.v1.Module.ReconfigureResourceResponse>(
                service, METHODID_RECONFIGURE_RESOURCE)))
        .addMethod(
          getRemoveResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.module.v1.Module.RemoveResourceRequest,
              viam.module.v1.Module.RemoveResourceResponse>(
                service, METHODID_REMOVE_RESOURCE)))
        .addMethod(
          getReadyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.module.v1.Module.ReadyRequest,
              viam.module.v1.Module.ReadyResponse>(
                service, METHODID_READY)))
        .addMethod(
          getValidateConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.module.v1.Module.ValidateConfigRequest,
              viam.module.v1.Module.ValidateConfigResponse>(
                service, METHODID_VALIDATE_CONFIG)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ModuleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getAddResourceMethod())
              .addMethod(getReconfigureResourceMethod())
              .addMethod(getRemoveResourceMethod())
              .addMethod(getReadyMethod())
              .addMethod(getValidateConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
