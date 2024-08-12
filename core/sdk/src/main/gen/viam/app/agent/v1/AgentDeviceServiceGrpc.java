package viam.app.agent.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: app/agent/v1/agent.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgentDeviceServiceGrpc {

  private AgentDeviceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.app.agent.v1.AgentDeviceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.agent.v1.Agent.DeviceAgentConfigRequest,
      viam.app.agent.v1.Agent.DeviceAgentConfigResponse> getDeviceAgentConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeviceAgentConfig",
      requestType = viam.app.agent.v1.Agent.DeviceAgentConfigRequest.class,
      responseType = viam.app.agent.v1.Agent.DeviceAgentConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.agent.v1.Agent.DeviceAgentConfigRequest,
      viam.app.agent.v1.Agent.DeviceAgentConfigResponse> getDeviceAgentConfigMethod() {
    io.grpc.MethodDescriptor<viam.app.agent.v1.Agent.DeviceAgentConfigRequest, viam.app.agent.v1.Agent.DeviceAgentConfigResponse> getDeviceAgentConfigMethod;
    if ((getDeviceAgentConfigMethod = AgentDeviceServiceGrpc.getDeviceAgentConfigMethod) == null) {
      synchronized (AgentDeviceServiceGrpc.class) {
        if ((getDeviceAgentConfigMethod = AgentDeviceServiceGrpc.getDeviceAgentConfigMethod) == null) {
          AgentDeviceServiceGrpc.getDeviceAgentConfigMethod = getDeviceAgentConfigMethod =
              io.grpc.MethodDescriptor.<viam.app.agent.v1.Agent.DeviceAgentConfigRequest, viam.app.agent.v1.Agent.DeviceAgentConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeviceAgentConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.agent.v1.Agent.DeviceAgentConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.agent.v1.Agent.DeviceAgentConfigResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeviceAgentConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentDeviceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentDeviceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentDeviceServiceStub>() {
        @java.lang.Override
        public AgentDeviceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentDeviceServiceStub(channel, callOptions);
        }
      };
    return AgentDeviceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentDeviceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentDeviceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentDeviceServiceBlockingStub>() {
        @java.lang.Override
        public AgentDeviceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentDeviceServiceBlockingStub(channel, callOptions);
        }
      };
    return AgentDeviceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentDeviceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentDeviceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentDeviceServiceFutureStub>() {
        @java.lang.Override
        public AgentDeviceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentDeviceServiceFutureStub(channel, callOptions);
        }
      };
    return AgentDeviceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * DeviceAgentConfig is for retrieving config by the on-device agent.
     * </pre>
     */
    default void deviceAgentConfig(viam.app.agent.v1.Agent.DeviceAgentConfigRequest request,
        io.grpc.stub.StreamObserver<viam.app.agent.v1.Agent.DeviceAgentConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeviceAgentConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AgentDeviceService.
   */
  public static abstract class AgentDeviceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AgentDeviceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AgentDeviceService.
   */
  public static final class AgentDeviceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AgentDeviceServiceStub> {
    private AgentDeviceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentDeviceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentDeviceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeviceAgentConfig is for retrieving config by the on-device agent.
     * </pre>
     */
    public void deviceAgentConfig(viam.app.agent.v1.Agent.DeviceAgentConfigRequest request,
        io.grpc.stub.StreamObserver<viam.app.agent.v1.Agent.DeviceAgentConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeviceAgentConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AgentDeviceService.
   */
  public static final class AgentDeviceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AgentDeviceServiceBlockingStub> {
    private AgentDeviceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentDeviceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentDeviceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeviceAgentConfig is for retrieving config by the on-device agent.
     * </pre>
     */
    public viam.app.agent.v1.Agent.DeviceAgentConfigResponse deviceAgentConfig(viam.app.agent.v1.Agent.DeviceAgentConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeviceAgentConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AgentDeviceService.
   */
  public static final class AgentDeviceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AgentDeviceServiceFutureStub> {
    private AgentDeviceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentDeviceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentDeviceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeviceAgentConfig is for retrieving config by the on-device agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.agent.v1.Agent.DeviceAgentConfigResponse> deviceAgentConfig(
        viam.app.agent.v1.Agent.DeviceAgentConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeviceAgentConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEVICE_AGENT_CONFIG = 0;

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
        case METHODID_DEVICE_AGENT_CONFIG:
          serviceImpl.deviceAgentConfig((viam.app.agent.v1.Agent.DeviceAgentConfigRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.agent.v1.Agent.DeviceAgentConfigResponse>) responseObserver);
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
          getDeviceAgentConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.agent.v1.Agent.DeviceAgentConfigRequest,
              viam.app.agent.v1.Agent.DeviceAgentConfigResponse>(
                service, METHODID_DEVICE_AGENT_CONFIG)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AgentDeviceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getDeviceAgentConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
