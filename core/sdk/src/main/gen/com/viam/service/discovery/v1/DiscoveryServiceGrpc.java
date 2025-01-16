package com.viam.service.discovery.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: service/discovery/v1/discovery.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DiscoveryServiceGrpc {

  private DiscoveryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.service.discovery.v1.DiscoveryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.service.discovery.v1.Discovery.DiscoverResourcesRequest,
      com.viam.service.discovery.v1.Discovery.DiscoverResourcesResponse> getDiscoverResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DiscoverResources",
      requestType = com.viam.service.discovery.v1.Discovery.DiscoverResourcesRequest.class,
      responseType = com.viam.service.discovery.v1.Discovery.DiscoverResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.discovery.v1.Discovery.DiscoverResourcesRequest,
      com.viam.service.discovery.v1.Discovery.DiscoverResourcesResponse> getDiscoverResourcesMethod() {
    io.grpc.MethodDescriptor<com.viam.service.discovery.v1.Discovery.DiscoverResourcesRequest, com.viam.service.discovery.v1.Discovery.DiscoverResourcesResponse> getDiscoverResourcesMethod;
    if ((getDiscoverResourcesMethod = DiscoveryServiceGrpc.getDiscoverResourcesMethod) == null) {
      synchronized (DiscoveryServiceGrpc.class) {
        if ((getDiscoverResourcesMethod = DiscoveryServiceGrpc.getDiscoverResourcesMethod) == null) {
          DiscoveryServiceGrpc.getDiscoverResourcesMethod = getDiscoverResourcesMethod =
              io.grpc.MethodDescriptor.<com.viam.service.discovery.v1.Discovery.DiscoverResourcesRequest, com.viam.service.discovery.v1.Discovery.DiscoverResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DiscoverResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.discovery.v1.Discovery.DiscoverResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.discovery.v1.Discovery.DiscoverResourcesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDiscoverResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.DoCommandRequest,
      com.viam.common.v1.Common.DoCommandResponse> getDoCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoCommand",
      requestType = com.viam.common.v1.Common.DoCommandRequest.class,
      responseType = com.viam.common.v1.Common.DoCommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.DoCommandRequest,
      com.viam.common.v1.Common.DoCommandResponse> getDoCommandMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.DoCommandRequest, com.viam.common.v1.Common.DoCommandResponse> getDoCommandMethod;
    if ((getDoCommandMethod = DiscoveryServiceGrpc.getDoCommandMethod) == null) {
      synchronized (DiscoveryServiceGrpc.class) {
        if ((getDoCommandMethod = DiscoveryServiceGrpc.getDoCommandMethod) == null) {
          DiscoveryServiceGrpc.getDoCommandMethod = getDoCommandMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.DoCommandRequest, com.viam.common.v1.Common.DoCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDoCommandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiscoveryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscoveryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscoveryServiceStub>() {
        @java.lang.Override
        public DiscoveryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscoveryServiceStub(channel, callOptions);
        }
      };
    return DiscoveryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiscoveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscoveryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscoveryServiceBlockingStub>() {
        @java.lang.Override
        public DiscoveryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscoveryServiceBlockingStub(channel, callOptions);
        }
      };
    return DiscoveryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiscoveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscoveryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscoveryServiceFutureStub>() {
        @java.lang.Override
        public DiscoveryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscoveryServiceFutureStub(channel, callOptions);
        }
      };
    return DiscoveryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * DiscoverResources returns the list of all discovered viam resources connected to the viam-server machine.
     * </pre>
     */
    default void discoverResources(com.viam.service.discovery.v1.Discovery.DiscoverResourcesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.discovery.v1.Discovery.DiscoverResourcesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDiscoverResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    default void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoCommandMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DiscoveryService.
   */
  public static abstract class DiscoveryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DiscoveryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DiscoveryService.
   */
  public static final class DiscoveryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DiscoveryServiceStub> {
    private DiscoveryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscoveryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * DiscoverResources returns the list of all discovered viam resources connected to the viam-server machine.
     * </pre>
     */
    public void discoverResources(com.viam.service.discovery.v1.Discovery.DiscoverResourcesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.discovery.v1.Discovery.DiscoverResourcesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDiscoverResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    public void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DiscoveryService.
   */
  public static final class DiscoveryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DiscoveryServiceBlockingStub> {
    private DiscoveryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscoveryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * DiscoverResources returns the list of all discovered viam resources connected to the viam-server machine.
     * </pre>
     */
    public com.viam.service.discovery.v1.Discovery.DiscoverResourcesResponse discoverResources(com.viam.service.discovery.v1.Discovery.DiscoverResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDiscoverResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    public com.viam.common.v1.Common.DoCommandResponse doCommand(com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoCommandMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DiscoveryService.
   */
  public static final class DiscoveryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DiscoveryServiceFutureStub> {
    private DiscoveryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscoveryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * DiscoverResources returns the list of all discovered viam resources connected to the viam-server machine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.discovery.v1.Discovery.DiscoverResourcesResponse> discoverResources(
        com.viam.service.discovery.v1.Discovery.DiscoverResourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDiscoverResourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.DoCommandResponse> doCommand(
        com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DISCOVER_RESOURCES = 0;
  private static final int METHODID_DO_COMMAND = 1;

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
        case METHODID_DISCOVER_RESOURCES:
          serviceImpl.discoverResources((com.viam.service.discovery.v1.Discovery.DiscoverResourcesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.discovery.v1.Discovery.DiscoverResourcesResponse>) responseObserver);
          break;
        case METHODID_DO_COMMAND:
          serviceImpl.doCommand((com.viam.common.v1.Common.DoCommandRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse>) responseObserver);
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
          getDiscoverResourcesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.discovery.v1.Discovery.DiscoverResourcesRequest,
              com.viam.service.discovery.v1.Discovery.DiscoverResourcesResponse>(
                service, METHODID_DISCOVER_RESOURCES)))
        .addMethod(
          getDoCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.DoCommandRequest,
              com.viam.common.v1.Common.DoCommandResponse>(
                service, METHODID_DO_COMMAND)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DiscoveryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getDiscoverResourcesMethod())
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
