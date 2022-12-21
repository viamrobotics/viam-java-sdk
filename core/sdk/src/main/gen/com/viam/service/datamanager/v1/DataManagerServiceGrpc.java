package com.viam.service.datamanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A DataManagerService service manages data between the robot and the cloud.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: service/datamanager/v1/data_manager.proto")
public final class DataManagerServiceGrpc {

  private DataManagerServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.service.datamanager.v1.DataManagerService";

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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.datamanager.v1.DataManager.SyncRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.datamanager.v1.DataManager.SyncResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataManagerServiceMethodDescriptorSupplier("Sync"))
              .build();
        }
      }
    }
    return getSyncMethod;
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
  public static abstract class DataManagerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sync performs a sync of the non-synced files for the specified service name,
     * </pre>
     */
    public void sync(com.viam.service.datamanager.v1.DataManager.SyncRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.datamanager.v1.DataManager.SyncResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.datamanager.v1.DataManager.SyncRequest,
                com.viam.service.datamanager.v1.DataManager.SyncResponse>(
                  this, METHODID_SYNC)))
          .build();
    }
  }

  /**
   * <pre>
   * A DataManagerService service manages data between the robot and the cloud.
   * </pre>
   */
  public static final class DataManagerServiceStub extends io.grpc.stub.AbstractAsyncStub<DataManagerServiceStub> {
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
  }

  /**
   * <pre>
   * A DataManagerService service manages data between the robot and the cloud.
   * </pre>
   */
  public static final class DataManagerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DataManagerServiceBlockingStub> {
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
  }

  /**
   * <pre>
   * A DataManagerService service manages data between the robot and the cloud.
   * </pre>
   */
  public static final class DataManagerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DataManagerServiceFutureStub> {
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
  }

  private static final int METHODID_SYNC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataManagerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataManagerServiceImplBase serviceImpl, int methodId) {
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

  private static abstract class DataManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.service.datamanager.v1.DataManager.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataManagerService");
    }
  }

  private static final class DataManagerServiceFileDescriptorSupplier
      extends DataManagerServiceBaseDescriptorSupplier {
    DataManagerServiceFileDescriptorSupplier() {}
  }

  private static final class DataManagerServiceMethodDescriptorSupplier
      extends DataManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataManagerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataManagerServiceFileDescriptorSupplier())
              .addMethod(getSyncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
