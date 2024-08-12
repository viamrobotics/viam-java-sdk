package com.viam.service.datamanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A DataManagerService service manages data between the robot and the cloud.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: service/datamanager/v1/data_manager.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataManagerServiceGrpc {

  private DataManagerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.service.datamanager.v1.DataManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.service.datamanager.v1.DataManager.SyncRequest,
      com.viam.service.datamanager.v1.DataManager.SyncResponse> getSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sync",
      requestType = com.viam.service.datamanager.v1.DataManager.SyncRequest.class,
      responseType = com.viam.service.datamanager.v1.DataManager.SyncResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.datamanager.v1.DataManager.SyncRequest,
      com.viam.service.datamanager.v1.DataManager.SyncResponse> getSyncMethod() {
    io.grpc.MethodDescriptor<com.viam.service.datamanager.v1.DataManager.SyncRequest, com.viam.service.datamanager.v1.DataManager.SyncResponse> getSyncMethod;
    if ((getSyncMethod = DataManagerServiceGrpc.getSyncMethod) == null) {
      synchronized (DataManagerServiceGrpc.class) {
        if ((getSyncMethod = DataManagerServiceGrpc.getSyncMethod) == null) {
          DataManagerServiceGrpc.getSyncMethod = getSyncMethod =
              io.grpc.MethodDescriptor.<com.viam.service.datamanager.v1.DataManager.SyncRequest, com.viam.service.datamanager.v1.DataManager.SyncResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.datamanager.v1.DataManager.SyncRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.datamanager.v1.DataManager.SyncResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSyncMethod;
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
    if ((getDoCommandMethod = DataManagerServiceGrpc.getDoCommandMethod) == null) {
      synchronized (DataManagerServiceGrpc.class) {
        if ((getDoCommandMethod = DataManagerServiceGrpc.getDoCommandMethod) == null) {
          DataManagerServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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
  public static DataManagerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataManagerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataManagerServiceStub>() {
        @java.lang.Override
        public DataManagerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataManagerServiceStub(channel, callOptions);
        }
      };
    return DataManagerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataManagerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataManagerServiceBlockingStub>() {
        @java.lang.Override
        public DataManagerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataManagerServiceBlockingStub(channel, callOptions);
        }
      };
    return DataManagerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataManagerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataManagerServiceFutureStub>() {
        @java.lang.Override
        public DataManagerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataManagerServiceFutureStub(channel, callOptions);
        }
      };
    return DataManagerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A DataManagerService service manages data between the robot and the cloud.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sync performs a sync of the non-synced files for the specified service name,
     * </pre>
     */
    default void sync(com.viam.service.datamanager.v1.DataManager.SyncRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.datamanager.v1.DataManager.SyncResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncMethod(), responseObserver);
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
   * Base class for the server implementation of the service DataManagerService.
   * <pre>
   * A DataManagerService service manages data between the robot and the cloud.
   * </pre>
   */
  public static abstract class DataManagerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataManagerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataManagerService.
   * <pre>
   * A DataManagerService service manages data between the robot and the cloud.
   * </pre>
   */
  public static final class DataManagerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataManagerServiceStub> {
    private DataManagerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataManagerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataManagerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sync performs a sync of the non-synced files for the specified service name,
     * </pre>
     */
    public void sync(com.viam.service.datamanager.v1.DataManager.SyncRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.datamanager.v1.DataManager.SyncResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyncMethod(), getCallOptions()), request, responseObserver);
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
   * A stub to allow clients to do synchronous rpc calls to service DataManagerService.
   * <pre>
   * A DataManagerService service manages data between the robot and the cloud.
   * </pre>
   */
  public static final class DataManagerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataManagerServiceBlockingStub> {
    private DataManagerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataManagerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sync performs a sync of the non-synced files for the specified service name,
     * </pre>
     */
    public com.viam.service.datamanager.v1.DataManager.SyncResponse sync(com.viam.service.datamanager.v1.DataManager.SyncRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyncMethod(), getCallOptions(), request);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataManagerService.
   * <pre>
   * A DataManagerService service manages data between the robot and the cloud.
   * </pre>
   */
  public static final class DataManagerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataManagerServiceFutureStub> {
    private DataManagerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataManagerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataManagerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sync performs a sync of the non-synced files for the specified service name,
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.datamanager.v1.DataManager.SyncResponse> sync(
        com.viam.service.datamanager.v1.DataManager.SyncRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyncMethod(), getCallOptions()), request);
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

  private static final int METHODID_SYNC = 0;
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
        case METHODID_SYNC:
          serviceImpl.sync((com.viam.service.datamanager.v1.DataManager.SyncRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.datamanager.v1.DataManager.SyncResponse>) responseObserver);
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
          getSyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.datamanager.v1.DataManager.SyncRequest,
              com.viam.service.datamanager.v1.DataManager.SyncResponse>(
                service, METHODID_SYNC)))
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
      synchronized (DataManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSyncMethod())
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
