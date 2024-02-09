package viam.app.agent.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * AgentService is used by viam-agent to retrieve update info for subsystems.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: app/agent/v1/agent.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgentAppServiceGrpc {

  private AgentAppServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.app.agent.v1.AgentAppService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.agent.v1.Agent.GetAgentConfigRequest,
      viam.app.agent.v1.Agent.GetAgentConfigResponse> getGetAgentConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentConfig",
      requestType = viam.app.agent.v1.Agent.GetAgentConfigRequest.class,
      responseType = viam.app.agent.v1.Agent.GetAgentConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.agent.v1.Agent.GetAgentConfigRequest,
      viam.app.agent.v1.Agent.GetAgentConfigResponse> getGetAgentConfigMethod() {
    io.grpc.MethodDescriptor<viam.app.agent.v1.Agent.GetAgentConfigRequest, viam.app.agent.v1.Agent.GetAgentConfigResponse> getGetAgentConfigMethod;
    if ((getGetAgentConfigMethod = AgentAppServiceGrpc.getGetAgentConfigMethod) == null) {
      synchronized (AgentAppServiceGrpc.class) {
        if ((getGetAgentConfigMethod = AgentAppServiceGrpc.getGetAgentConfigMethod) == null) {
          AgentAppServiceGrpc.getGetAgentConfigMethod = getGetAgentConfigMethod =
              io.grpc.MethodDescriptor.<viam.app.agent.v1.Agent.GetAgentConfigRequest, viam.app.agent.v1.Agent.GetAgentConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.agent.v1.Agent.GetAgentConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.agent.v1.Agent.GetAgentConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentAppServiceMethodDescriptorSupplier("GetAgentConfig"))
              .build();
        }
      }
    }
    return getGetAgentConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.agent.v1.Agent.UpdateAgentConfigRequest,
      viam.app.agent.v1.Agent.UpdateAgentConfigResponse> getUpdateAgentConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentConfig",
      requestType = viam.app.agent.v1.Agent.UpdateAgentConfigRequest.class,
      responseType = viam.app.agent.v1.Agent.UpdateAgentConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.agent.v1.Agent.UpdateAgentConfigRequest,
      viam.app.agent.v1.Agent.UpdateAgentConfigResponse> getUpdateAgentConfigMethod() {
    io.grpc.MethodDescriptor<viam.app.agent.v1.Agent.UpdateAgentConfigRequest, viam.app.agent.v1.Agent.UpdateAgentConfigResponse> getUpdateAgentConfigMethod;
    if ((getUpdateAgentConfigMethod = AgentAppServiceGrpc.getUpdateAgentConfigMethod) == null) {
      synchronized (AgentAppServiceGrpc.class) {
        if ((getUpdateAgentConfigMethod = AgentAppServiceGrpc.getUpdateAgentConfigMethod) == null) {
          AgentAppServiceGrpc.getUpdateAgentConfigMethod = getUpdateAgentConfigMethod =
              io.grpc.MethodDescriptor.<viam.app.agent.v1.Agent.UpdateAgentConfigRequest, viam.app.agent.v1.Agent.UpdateAgentConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgentConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.agent.v1.Agent.UpdateAgentConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.agent.v1.Agent.UpdateAgentConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentAppServiceMethodDescriptorSupplier("UpdateAgentConfig"))
              .build();
        }
      }
    }
    return getUpdateAgentConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentAppServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentAppServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentAppServiceStub>() {
        @java.lang.Override
        public AgentAppServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentAppServiceStub(channel, callOptions);
        }
      };
    return AgentAppServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentAppServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentAppServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentAppServiceBlockingStub>() {
        @java.lang.Override
        public AgentAppServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentAppServiceBlockingStub(channel, callOptions);
        }
      };
    return AgentAppServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentAppServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentAppServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentAppServiceFutureStub>() {
        @java.lang.Override
        public AgentAppServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentAppServiceFutureStub(channel, callOptions);
        }
      };
    return AgentAppServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AgentService is used by viam-agent to retrieve update info for subsystems.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetAgentConfig is for retrieving config in App.
     * </pre>
     */
    default void getAgentConfig(viam.app.agent.v1.Agent.GetAgentConfigRequest request,
        io.grpc.stub.StreamObserver<viam.app.agent.v1.Agent.GetAgentConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentConfig is for editing config in App.
     * </pre>
     */
    default void updateAgentConfig(viam.app.agent.v1.Agent.UpdateAgentConfigRequest request,
        io.grpc.stub.StreamObserver<viam.app.agent.v1.Agent.UpdateAgentConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AgentAppService.
   * <pre>
   * AgentService is used by viam-agent to retrieve update info for subsystems.
   * </pre>
   */
  public static abstract class AgentAppServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AgentAppServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AgentAppService.
   * <pre>
   * AgentService is used by viam-agent to retrieve update info for subsystems.
   * </pre>
   */
  public static final class AgentAppServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AgentAppServiceStub> {
    private AgentAppServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentAppServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentAppServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetAgentConfig is for retrieving config in App.
     * </pre>
     */
    public void getAgentConfig(viam.app.agent.v1.Agent.GetAgentConfigRequest request,
        io.grpc.stub.StreamObserver<viam.app.agent.v1.Agent.GetAgentConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentConfig is for editing config in App.
     * </pre>
     */
    public void updateAgentConfig(viam.app.agent.v1.Agent.UpdateAgentConfigRequest request,
        io.grpc.stub.StreamObserver<viam.app.agent.v1.Agent.UpdateAgentConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AgentAppService.
   * <pre>
   * AgentService is used by viam-agent to retrieve update info for subsystems.
   * </pre>
   */
  public static final class AgentAppServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AgentAppServiceBlockingStub> {
    private AgentAppServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentAppServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentAppServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetAgentConfig is for retrieving config in App.
     * </pre>
     */
    public viam.app.agent.v1.Agent.GetAgentConfigResponse getAgentConfig(viam.app.agent.v1.Agent.GetAgentConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAgentConfig is for editing config in App.
     * </pre>
     */
    public viam.app.agent.v1.Agent.UpdateAgentConfigResponse updateAgentConfig(viam.app.agent.v1.Agent.UpdateAgentConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AgentAppService.
   * <pre>
   * AgentService is used by viam-agent to retrieve update info for subsystems.
   * </pre>
   */
  public static final class AgentAppServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AgentAppServiceFutureStub> {
    private AgentAppServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentAppServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentAppServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetAgentConfig is for retrieving config in App.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.agent.v1.Agent.GetAgentConfigResponse> getAgentConfig(
        viam.app.agent.v1.Agent.GetAgentConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAgentConfig is for editing config in App.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.agent.v1.Agent.UpdateAgentConfigResponse> updateAgentConfig(
        viam.app.agent.v1.Agent.UpdateAgentConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AGENT_CONFIG = 0;
  private static final int METHODID_UPDATE_AGENT_CONFIG = 1;

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
        case METHODID_GET_AGENT_CONFIG:
          serviceImpl.getAgentConfig((viam.app.agent.v1.Agent.GetAgentConfigRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.agent.v1.Agent.GetAgentConfigResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_CONFIG:
          serviceImpl.updateAgentConfig((viam.app.agent.v1.Agent.UpdateAgentConfigRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.agent.v1.Agent.UpdateAgentConfigResponse>) responseObserver);
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
          getGetAgentConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.agent.v1.Agent.GetAgentConfigRequest,
              viam.app.agent.v1.Agent.GetAgentConfigResponse>(
                service, METHODID_GET_AGENT_CONFIG)))
        .addMethod(
          getUpdateAgentConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.agent.v1.Agent.UpdateAgentConfigRequest,
              viam.app.agent.v1.Agent.UpdateAgentConfigResponse>(
                service, METHODID_UPDATE_AGENT_CONFIG)))
        .build();
  }

  private static abstract class AgentAppServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentAppServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return viam.app.agent.v1.Agent.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AgentAppService");
    }
  }

  private static final class AgentAppServiceFileDescriptorSupplier
      extends AgentAppServiceBaseDescriptorSupplier {
    AgentAppServiceFileDescriptorSupplier() {}
  }

  private static final class AgentAppServiceMethodDescriptorSupplier
      extends AgentAppServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AgentAppServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AgentAppServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentAppServiceFileDescriptorSupplier())
              .addMethod(getGetAgentConfigMethod())
              .addMethod(getUpdateAgentConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
