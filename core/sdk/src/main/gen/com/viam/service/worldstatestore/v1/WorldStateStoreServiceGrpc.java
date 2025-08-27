package com.viam.service.worldstatestore.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: service/worldstatestore/v1/world_state_store.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorldStateStoreServiceGrpc {

  private WorldStateStoreServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.service.worldstatestore.v1.WorldStateStoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsRequest,
      com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsResponse> getListUUIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUUIDs",
      requestType = com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsRequest.class,
      responseType = com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsRequest,
      com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsResponse> getListUUIDsMethod() {
    io.grpc.MethodDescriptor<com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsRequest, com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsResponse> getListUUIDsMethod;
    if ((getListUUIDsMethod = WorldStateStoreServiceGrpc.getListUUIDsMethod) == null) {
      synchronized (WorldStateStoreServiceGrpc.class) {
        if ((getListUUIDsMethod = WorldStateStoreServiceGrpc.getListUUIDsMethod) == null) {
          WorldStateStoreServiceGrpc.getListUUIDsMethod = getListUUIDsMethod =
              io.grpc.MethodDescriptor.<com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsRequest, com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUUIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListUUIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformRequest,
      com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformResponse> getGetTransformMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransform",
      requestType = com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformRequest.class,
      responseType = com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformRequest,
      com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformResponse> getGetTransformMethod() {
    io.grpc.MethodDescriptor<com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformRequest, com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformResponse> getGetTransformMethod;
    if ((getGetTransformMethod = WorldStateStoreServiceGrpc.getGetTransformMethod) == null) {
      synchronized (WorldStateStoreServiceGrpc.class) {
        if ((getGetTransformMethod = WorldStateStoreServiceGrpc.getGetTransformMethod) == null) {
          WorldStateStoreServiceGrpc.getGetTransformMethod = getGetTransformMethod =
              io.grpc.MethodDescriptor.<com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformRequest, com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransform"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTransformMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesRequest,
      com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesResponse> getStreamTransformChangesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamTransformChanges",
      requestType = com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesRequest.class,
      responseType = com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesRequest,
      com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesResponse> getStreamTransformChangesMethod() {
    io.grpc.MethodDescriptor<com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesRequest, com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesResponse> getStreamTransformChangesMethod;
    if ((getStreamTransformChangesMethod = WorldStateStoreServiceGrpc.getStreamTransformChangesMethod) == null) {
      synchronized (WorldStateStoreServiceGrpc.class) {
        if ((getStreamTransformChangesMethod = WorldStateStoreServiceGrpc.getStreamTransformChangesMethod) == null) {
          WorldStateStoreServiceGrpc.getStreamTransformChangesMethod = getStreamTransformChangesMethod =
              io.grpc.MethodDescriptor.<com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesRequest, com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamTransformChanges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStreamTransformChangesMethod;
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
    if ((getDoCommandMethod = WorldStateStoreServiceGrpc.getDoCommandMethod) == null) {
      synchronized (WorldStateStoreServiceGrpc.class) {
        if ((getDoCommandMethod = WorldStateStoreServiceGrpc.getDoCommandMethod) == null) {
          WorldStateStoreServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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
  public static WorldStateStoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorldStateStoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorldStateStoreServiceStub>() {
        @java.lang.Override
        public WorldStateStoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorldStateStoreServiceStub(channel, callOptions);
        }
      };
    return WorldStateStoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorldStateStoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorldStateStoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorldStateStoreServiceBlockingStub>() {
        @java.lang.Override
        public WorldStateStoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorldStateStoreServiceBlockingStub(channel, callOptions);
        }
      };
    return WorldStateStoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorldStateStoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorldStateStoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorldStateStoreServiceFutureStub>() {
        @java.lang.Override
        public WorldStateStoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorldStateStoreServiceFutureStub(channel, callOptions);
        }
      };
    return WorldStateStoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * ListUUIDs returns all world state transform UUIDs
     * </pre>
     */
    default void listUUIDs(com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUUIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTransform returns a world state transform by uuid
     * </pre>
     */
    default void getTransform(com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransformMethod(), responseObserver);
    }

    /**
     * <pre>
     * StreamTransformChanges streams changes to world state transforms
     * </pre>
     */
    default void streamTransformChanges(com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamTransformChangesMethod(), responseObserver);
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
   * Base class for the server implementation of the service WorldStateStoreService.
   */
  public static abstract class WorldStateStoreServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WorldStateStoreServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WorldStateStoreService.
   */
  public static final class WorldStateStoreServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WorldStateStoreServiceStub> {
    private WorldStateStoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorldStateStoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorldStateStoreServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListUUIDs returns all world state transform UUIDs
     * </pre>
     */
    public void listUUIDs(com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUUIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTransform returns a world state transform by uuid
     * </pre>
     */
    public void getTransform(com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransformMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StreamTransformChanges streams changes to world state transforms
     * </pre>
     */
    public void streamTransformChanges(com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamTransformChangesMethod(), getCallOptions()), request, responseObserver);
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
   * A stub to allow clients to do synchronous rpc calls to service WorldStateStoreService.
   */
  public static final class WorldStateStoreServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WorldStateStoreServiceBlockingStub> {
    private WorldStateStoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorldStateStoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorldStateStoreServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListUUIDs returns all world state transform UUIDs
     * </pre>
     */
    public com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsResponse listUUIDs(com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUUIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTransform returns a world state transform by uuid
     * </pre>
     */
    public com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformResponse getTransform(com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransformMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StreamTransformChanges streams changes to world state transforms
     * </pre>
     */
    public java.util.Iterator<com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesResponse> streamTransformChanges(
        com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamTransformChangesMethod(), getCallOptions(), request);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WorldStateStoreService.
   */
  public static final class WorldStateStoreServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WorldStateStoreServiceFutureStub> {
    private WorldStateStoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorldStateStoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorldStateStoreServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListUUIDs returns all world state transform UUIDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsResponse> listUUIDs(
        com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUUIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTransform returns a world state transform by uuid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformResponse> getTransform(
        com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransformMethod(), getCallOptions()), request);
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

  private static final int METHODID_LIST_UUIDS = 0;
  private static final int METHODID_GET_TRANSFORM = 1;
  private static final int METHODID_STREAM_TRANSFORM_CHANGES = 2;
  private static final int METHODID_DO_COMMAND = 3;

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
        case METHODID_LIST_UUIDS:
          serviceImpl.listUUIDs((com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSFORM:
          serviceImpl.getTransform((com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformResponse>) responseObserver);
          break;
        case METHODID_STREAM_TRANSFORM_CHANGES:
          serviceImpl.streamTransformChanges((com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesResponse>) responseObserver);
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
          getListUUIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsRequest,
              com.viam.service.worldstatestore.v1.WorldStateStore.ListUUIDsResponse>(
                service, METHODID_LIST_UUIDS)))
        .addMethod(
          getGetTransformMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformRequest,
              com.viam.service.worldstatestore.v1.WorldStateStore.GetTransformResponse>(
                service, METHODID_GET_TRANSFORM)))
        .addMethod(
          getStreamTransformChangesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesRequest,
              com.viam.service.worldstatestore.v1.WorldStateStore.StreamTransformChangesResponse>(
                service, METHODID_STREAM_TRANSFORM_CHANGES)))
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
      synchronized (WorldStateStoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getListUUIDsMethod())
              .addMethod(getGetTransformMethod())
              .addMethod(getStreamTransformChangesMethod())
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
