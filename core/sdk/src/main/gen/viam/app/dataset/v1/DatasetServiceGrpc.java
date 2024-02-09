package viam.app.dataset.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DatasetService is used to manage datasets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: app/dataset/v1/dataset.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DatasetServiceGrpc {

  private DatasetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.app.dataset.v1.DatasetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.CreateDatasetRequest,
      viam.app.dataset.v1.DatasetOuterClass.CreateDatasetResponse> getCreateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataset",
      requestType = viam.app.dataset.v1.DatasetOuterClass.CreateDatasetRequest.class,
      responseType = viam.app.dataset.v1.DatasetOuterClass.CreateDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.CreateDatasetRequest,
      viam.app.dataset.v1.DatasetOuterClass.CreateDatasetResponse> getCreateDatasetMethod() {
    io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.CreateDatasetRequest, viam.app.dataset.v1.DatasetOuterClass.CreateDatasetResponse> getCreateDatasetMethod;
    if ((getCreateDatasetMethod = DatasetServiceGrpc.getCreateDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getCreateDatasetMethod = DatasetServiceGrpc.getCreateDatasetMethod) == null) {
          DatasetServiceGrpc.getCreateDatasetMethod = getCreateDatasetMethod =
              io.grpc.MethodDescriptor.<viam.app.dataset.v1.DatasetOuterClass.CreateDatasetRequest, viam.app.dataset.v1.DatasetOuterClass.CreateDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.dataset.v1.DatasetOuterClass.CreateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.dataset.v1.DatasetOuterClass.CreateDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("CreateDataset"))
              .build();
        }
      }
    }
    return getCreateDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetRequest,
      viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetResponse> getDeleteDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataset",
      requestType = viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetRequest.class,
      responseType = viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetRequest,
      viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetResponse> getDeleteDatasetMethod() {
    io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetRequest, viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetResponse> getDeleteDatasetMethod;
    if ((getDeleteDatasetMethod = DatasetServiceGrpc.getDeleteDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getDeleteDatasetMethod = DatasetServiceGrpc.getDeleteDatasetMethod) == null) {
          DatasetServiceGrpc.getDeleteDatasetMethod = getDeleteDatasetMethod =
              io.grpc.MethodDescriptor.<viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetRequest, viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("DeleteDataset"))
              .build();
        }
      }
    }
    return getDeleteDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.RenameDatasetRequest,
      viam.app.dataset.v1.DatasetOuterClass.RenameDatasetResponse> getRenameDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenameDataset",
      requestType = viam.app.dataset.v1.DatasetOuterClass.RenameDatasetRequest.class,
      responseType = viam.app.dataset.v1.DatasetOuterClass.RenameDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.RenameDatasetRequest,
      viam.app.dataset.v1.DatasetOuterClass.RenameDatasetResponse> getRenameDatasetMethod() {
    io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.RenameDatasetRequest, viam.app.dataset.v1.DatasetOuterClass.RenameDatasetResponse> getRenameDatasetMethod;
    if ((getRenameDatasetMethod = DatasetServiceGrpc.getRenameDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getRenameDatasetMethod = DatasetServiceGrpc.getRenameDatasetMethod) == null) {
          DatasetServiceGrpc.getRenameDatasetMethod = getRenameDatasetMethod =
              io.grpc.MethodDescriptor.<viam.app.dataset.v1.DatasetOuterClass.RenameDatasetRequest, viam.app.dataset.v1.DatasetOuterClass.RenameDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenameDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.dataset.v1.DatasetOuterClass.RenameDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.dataset.v1.DatasetOuterClass.RenameDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("RenameDataset"))
              .build();
        }
      }
    }
    return getRenameDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDRequest,
      viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDResponse> getListDatasetsByOrganizationIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDatasetsByOrganizationID",
      requestType = viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDRequest.class,
      responseType = viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDRequest,
      viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDResponse> getListDatasetsByOrganizationIDMethod() {
    io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDRequest, viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDResponse> getListDatasetsByOrganizationIDMethod;
    if ((getListDatasetsByOrganizationIDMethod = DatasetServiceGrpc.getListDatasetsByOrganizationIDMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getListDatasetsByOrganizationIDMethod = DatasetServiceGrpc.getListDatasetsByOrganizationIDMethod) == null) {
          DatasetServiceGrpc.getListDatasetsByOrganizationIDMethod = getListDatasetsByOrganizationIDMethod =
              io.grpc.MethodDescriptor.<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDRequest, viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDatasetsByOrganizationID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("ListDatasetsByOrganizationID"))
              .build();
        }
      }
    }
    return getListDatasetsByOrganizationIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsRequest,
      viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsResponse> getListDatasetsByIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDatasetsByIDs",
      requestType = viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsRequest.class,
      responseType = viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsRequest,
      viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsResponse> getListDatasetsByIDsMethod() {
    io.grpc.MethodDescriptor<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsRequest, viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsResponse> getListDatasetsByIDsMethod;
    if ((getListDatasetsByIDsMethod = DatasetServiceGrpc.getListDatasetsByIDsMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getListDatasetsByIDsMethod = DatasetServiceGrpc.getListDatasetsByIDsMethod) == null) {
          DatasetServiceGrpc.getListDatasetsByIDsMethod = getListDatasetsByIDsMethod =
              io.grpc.MethodDescriptor.<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsRequest, viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDatasetsByIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("ListDatasetsByIDs"))
              .build();
        }
      }
    }
    return getListDatasetsByIDsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatasetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetServiceStub>() {
        @java.lang.Override
        public DatasetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetServiceStub(channel, callOptions);
        }
      };
    return DatasetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatasetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetServiceBlockingStub>() {
        @java.lang.Override
        public DatasetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetServiceBlockingStub(channel, callOptions);
        }
      };
    return DatasetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatasetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetServiceFutureStub>() {
        @java.lang.Override
        public DatasetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetServiceFutureStub(channel, callOptions);
        }
      };
    return DatasetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * DatasetService is used to manage datasets.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateDataset makes a new dataset.
     * </pre>
     */
    default void createDataset(viam.app.dataset.v1.DatasetOuterClass.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.CreateDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteDatasets deletes an existing dataset.
     * </pre>
     */
    default void deleteDataset(viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * RenameDataset modifies the name of an existing dataset.
     * </pre>
     */
    default void renameDataset(viam.app.dataset.v1.DatasetOuterClass.RenameDatasetRequest request,
        io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.RenameDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenameDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListDatasetsByOrganizationID lists all of the datasets for an organization.
     * </pre>
     */
    default void listDatasetsByOrganizationID(viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDRequest request,
        io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDatasetsByOrganizationIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListDatasetsByIDs lists all of the datasets specified by the given dataset IDs.
     * </pre>
     */
    default void listDatasetsByIDs(viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDatasetsByIDsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DatasetService.
   * <pre>
   * DatasetService is used to manage datasets.
   * </pre>
   */
  public static abstract class DatasetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DatasetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DatasetService.
   * <pre>
   * DatasetService is used to manage datasets.
   * </pre>
   */
  public static final class DatasetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DatasetServiceStub> {
    private DatasetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateDataset makes a new dataset.
     * </pre>
     */
    public void createDataset(viam.app.dataset.v1.DatasetOuterClass.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.CreateDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteDatasets deletes an existing dataset.
     * </pre>
     */
    public void deleteDataset(viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RenameDataset modifies the name of an existing dataset.
     * </pre>
     */
    public void renameDataset(viam.app.dataset.v1.DatasetOuterClass.RenameDatasetRequest request,
        io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.RenameDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenameDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListDatasetsByOrganizationID lists all of the datasets for an organization.
     * </pre>
     */
    public void listDatasetsByOrganizationID(viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDRequest request,
        io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDatasetsByOrganizationIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListDatasetsByIDs lists all of the datasets specified by the given dataset IDs.
     * </pre>
     */
    public void listDatasetsByIDs(viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDatasetsByIDsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DatasetService.
   * <pre>
   * DatasetService is used to manage datasets.
   * </pre>
   */
  public static final class DatasetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DatasetServiceBlockingStub> {
    private DatasetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateDataset makes a new dataset.
     * </pre>
     */
    public viam.app.dataset.v1.DatasetOuterClass.CreateDatasetResponse createDataset(viam.app.dataset.v1.DatasetOuterClass.CreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteDatasets deletes an existing dataset.
     * </pre>
     */
    public viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetResponse deleteDataset(viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RenameDataset modifies the name of an existing dataset.
     * </pre>
     */
    public viam.app.dataset.v1.DatasetOuterClass.RenameDatasetResponse renameDataset(viam.app.dataset.v1.DatasetOuterClass.RenameDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenameDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListDatasetsByOrganizationID lists all of the datasets for an organization.
     * </pre>
     */
    public viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDResponse listDatasetsByOrganizationID(viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDatasetsByOrganizationIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListDatasetsByIDs lists all of the datasets specified by the given dataset IDs.
     * </pre>
     */
    public viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsResponse listDatasetsByIDs(viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDatasetsByIDsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DatasetService.
   * <pre>
   * DatasetService is used to manage datasets.
   * </pre>
   */
  public static final class DatasetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DatasetServiceFutureStub> {
    private DatasetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateDataset makes a new dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.dataset.v1.DatasetOuterClass.CreateDatasetResponse> createDataset(
        viam.app.dataset.v1.DatasetOuterClass.CreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteDatasets deletes an existing dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetResponse> deleteDataset(
        viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RenameDataset modifies the name of an existing dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.dataset.v1.DatasetOuterClass.RenameDatasetResponse> renameDataset(
        viam.app.dataset.v1.DatasetOuterClass.RenameDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenameDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListDatasetsByOrganizationID lists all of the datasets for an organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDResponse> listDatasetsByOrganizationID(
        viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDatasetsByOrganizationIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListDatasetsByIDs lists all of the datasets specified by the given dataset IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsResponse> listDatasetsByIDs(
        viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDatasetsByIDsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DATASET = 0;
  private static final int METHODID_DELETE_DATASET = 1;
  private static final int METHODID_RENAME_DATASET = 2;
  private static final int METHODID_LIST_DATASETS_BY_ORGANIZATION_ID = 3;
  private static final int METHODID_LIST_DATASETS_BY_IDS = 4;

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
        case METHODID_CREATE_DATASET:
          serviceImpl.createDataset((viam.app.dataset.v1.DatasetOuterClass.CreateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.CreateDatasetResponse>) responseObserver);
          break;
        case METHODID_DELETE_DATASET:
          serviceImpl.deleteDataset((viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetResponse>) responseObserver);
          break;
        case METHODID_RENAME_DATASET:
          serviceImpl.renameDataset((viam.app.dataset.v1.DatasetOuterClass.RenameDatasetRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.RenameDatasetResponse>) responseObserver);
          break;
        case METHODID_LIST_DATASETS_BY_ORGANIZATION_ID:
          serviceImpl.listDatasetsByOrganizationID((viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDResponse>) responseObserver);
          break;
        case METHODID_LIST_DATASETS_BY_IDS:
          serviceImpl.listDatasetsByIDs((viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsResponse>) responseObserver);
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
          getCreateDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.dataset.v1.DatasetOuterClass.CreateDatasetRequest,
              viam.app.dataset.v1.DatasetOuterClass.CreateDatasetResponse>(
                service, METHODID_CREATE_DATASET)))
        .addMethod(
          getDeleteDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetRequest,
              viam.app.dataset.v1.DatasetOuterClass.DeleteDatasetResponse>(
                service, METHODID_DELETE_DATASET)))
        .addMethod(
          getRenameDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.dataset.v1.DatasetOuterClass.RenameDatasetRequest,
              viam.app.dataset.v1.DatasetOuterClass.RenameDatasetResponse>(
                service, METHODID_RENAME_DATASET)))
        .addMethod(
          getListDatasetsByOrganizationIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDRequest,
              viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByOrganizationIDResponse>(
                service, METHODID_LIST_DATASETS_BY_ORGANIZATION_ID)))
        .addMethod(
          getListDatasetsByIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsRequest,
              viam.app.dataset.v1.DatasetOuterClass.ListDatasetsByIDsResponse>(
                service, METHODID_LIST_DATASETS_BY_IDS)))
        .build();
  }

  private static abstract class DatasetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatasetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return viam.app.dataset.v1.DatasetOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DatasetService");
    }
  }

  private static final class DatasetServiceFileDescriptorSupplier
      extends DatasetServiceBaseDescriptorSupplier {
    DatasetServiceFileDescriptorSupplier() {}
  }

  private static final class DatasetServiceMethodDescriptorSupplier
      extends DatasetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DatasetServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DatasetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatasetServiceFileDescriptorSupplier())
              .addMethod(getCreateDatasetMethod())
              .addMethod(getDeleteDatasetMethod())
              .addMethod(getRenameDatasetMethod())
              .addMethod(getListDatasetsByOrganizationIDMethod())
              .addMethod(getListDatasetsByIDsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
