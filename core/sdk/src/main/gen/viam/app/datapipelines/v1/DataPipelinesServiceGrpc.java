package viam.app.datapipelines.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DataPipelinesService is used to manage data pipelines.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: app/datapipelines/v1/data_pipelines.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataPipelinesServiceGrpc {

  private DataPipelinesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.app.datapipelines.v1.DataPipelinesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.GetDataPipelineRequest,
      viam.app.datapipelines.v1.DataPipelines.GetDataPipelineResponse> getGetDataPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataPipeline",
      requestType = viam.app.datapipelines.v1.DataPipelines.GetDataPipelineRequest.class,
      responseType = viam.app.datapipelines.v1.DataPipelines.GetDataPipelineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.GetDataPipelineRequest,
      viam.app.datapipelines.v1.DataPipelines.GetDataPipelineResponse> getGetDataPipelineMethod() {
    io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.GetDataPipelineRequest, viam.app.datapipelines.v1.DataPipelines.GetDataPipelineResponse> getGetDataPipelineMethod;
    if ((getGetDataPipelineMethod = DataPipelinesServiceGrpc.getGetDataPipelineMethod) == null) {
      synchronized (DataPipelinesServiceGrpc.class) {
        if ((getGetDataPipelineMethod = DataPipelinesServiceGrpc.getGetDataPipelineMethod) == null) {
          DataPipelinesServiceGrpc.getGetDataPipelineMethod = getGetDataPipelineMethod =
              io.grpc.MethodDescriptor.<viam.app.datapipelines.v1.DataPipelines.GetDataPipelineRequest, viam.app.datapipelines.v1.DataPipelines.GetDataPipelineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.GetDataPipelineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.GetDataPipelineResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetDataPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesRequest,
      viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesResponse> getListDataPipelinesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDataPipelines",
      requestType = viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesRequest.class,
      responseType = viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesRequest,
      viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesResponse> getListDataPipelinesMethod() {
    io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesRequest, viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesResponse> getListDataPipelinesMethod;
    if ((getListDataPipelinesMethod = DataPipelinesServiceGrpc.getListDataPipelinesMethod) == null) {
      synchronized (DataPipelinesServiceGrpc.class) {
        if ((getListDataPipelinesMethod = DataPipelinesServiceGrpc.getListDataPipelinesMethod) == null) {
          DataPipelinesServiceGrpc.getListDataPipelinesMethod = getListDataPipelinesMethod =
              io.grpc.MethodDescriptor.<viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesRequest, viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDataPipelines"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListDataPipelinesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineRequest,
      viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineResponse> getCreateDataPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataPipeline",
      requestType = viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineRequest.class,
      responseType = viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineRequest,
      viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineResponse> getCreateDataPipelineMethod() {
    io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineRequest, viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineResponse> getCreateDataPipelineMethod;
    if ((getCreateDataPipelineMethod = DataPipelinesServiceGrpc.getCreateDataPipelineMethod) == null) {
      synchronized (DataPipelinesServiceGrpc.class) {
        if ((getCreateDataPipelineMethod = DataPipelinesServiceGrpc.getCreateDataPipelineMethod) == null) {
          DataPipelinesServiceGrpc.getCreateDataPipelineMethod = getCreateDataPipelineMethod =
              io.grpc.MethodDescriptor.<viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineRequest, viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateDataPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineRequest,
      viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineResponse> getUpdateDataPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDataPipeline",
      requestType = viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineRequest.class,
      responseType = viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineRequest,
      viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineResponse> getUpdateDataPipelineMethod() {
    io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineRequest, viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineResponse> getUpdateDataPipelineMethod;
    if ((getUpdateDataPipelineMethod = DataPipelinesServiceGrpc.getUpdateDataPipelineMethod) == null) {
      synchronized (DataPipelinesServiceGrpc.class) {
        if ((getUpdateDataPipelineMethod = DataPipelinesServiceGrpc.getUpdateDataPipelineMethod) == null) {
          DataPipelinesServiceGrpc.getUpdateDataPipelineMethod = getUpdateDataPipelineMethod =
              io.grpc.MethodDescriptor.<viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineRequest, viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDataPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateDataPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineRequest,
      viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineResponse> getDeleteDataPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataPipeline",
      requestType = viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineRequest.class,
      responseType = viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineRequest,
      viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineResponse> getDeleteDataPipelineMethod() {
    io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineRequest, viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineResponse> getDeleteDataPipelineMethod;
    if ((getDeleteDataPipelineMethod = DataPipelinesServiceGrpc.getDeleteDataPipelineMethod) == null) {
      synchronized (DataPipelinesServiceGrpc.class) {
        if ((getDeleteDataPipelineMethod = DataPipelinesServiceGrpc.getDeleteDataPipelineMethod) == null) {
          DataPipelinesServiceGrpc.getDeleteDataPipelineMethod = getDeleteDataPipelineMethod =
              io.grpc.MethodDescriptor.<viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineRequest, viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteDataPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineRequest,
      viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineResponse> getEnableDataPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableDataPipeline",
      requestType = viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineRequest.class,
      responseType = viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineRequest,
      viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineResponse> getEnableDataPipelineMethod() {
    io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineRequest, viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineResponse> getEnableDataPipelineMethod;
    if ((getEnableDataPipelineMethod = DataPipelinesServiceGrpc.getEnableDataPipelineMethod) == null) {
      synchronized (DataPipelinesServiceGrpc.class) {
        if ((getEnableDataPipelineMethod = DataPipelinesServiceGrpc.getEnableDataPipelineMethod) == null) {
          DataPipelinesServiceGrpc.getEnableDataPipelineMethod = getEnableDataPipelineMethod =
              io.grpc.MethodDescriptor.<viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineRequest, viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableDataPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEnableDataPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineRequest,
      viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineResponse> getDisableDataPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableDataPipeline",
      requestType = viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineRequest.class,
      responseType = viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineRequest,
      viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineResponse> getDisableDataPipelineMethod() {
    io.grpc.MethodDescriptor<viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineRequest, viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineResponse> getDisableDataPipelineMethod;
    if ((getDisableDataPipelineMethod = DataPipelinesServiceGrpc.getDisableDataPipelineMethod) == null) {
      synchronized (DataPipelinesServiceGrpc.class) {
        if ((getDisableDataPipelineMethod = DataPipelinesServiceGrpc.getDisableDataPipelineMethod) == null) {
          DataPipelinesServiceGrpc.getDisableDataPipelineMethod = getDisableDataPipelineMethod =
              io.grpc.MethodDescriptor.<viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineRequest, viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableDataPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisableDataPipelineMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataPipelinesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataPipelinesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataPipelinesServiceStub>() {
        @java.lang.Override
        public DataPipelinesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataPipelinesServiceStub(channel, callOptions);
        }
      };
    return DataPipelinesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataPipelinesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataPipelinesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataPipelinesServiceBlockingStub>() {
        @java.lang.Override
        public DataPipelinesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataPipelinesServiceBlockingStub(channel, callOptions);
        }
      };
    return DataPipelinesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataPipelinesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataPipelinesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataPipelinesServiceFutureStub>() {
        @java.lang.Override
        public DataPipelinesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataPipelinesServiceFutureStub(channel, callOptions);
        }
      };
    return DataPipelinesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * DataPipelinesService is used to manage data pipelines.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetDataPipeline retrieves a specific data pipeline by its id.
     * </pre>
     */
    default void getDataPipeline(viam.app.datapipelines.v1.DataPipelines.GetDataPipelineRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.GetDataPipelineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDataPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListDataPipelines returns a list of data pipelines based on organization id.
     * </pre>
     */
    default void listDataPipelines(viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDataPipelinesMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateDataPipeline creates a new data pipeline with the provided configuration.
     * </pre>
     */
    default void createDataPipeline(viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDataPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDataPipeline modifies an existing data pipeline's configuration.
     * </pre>
     */
    default void updateDataPipeline(viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDataPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteDataPipeline deletes a data pipeline from the database.
     * </pre>
     */
    default void deleteDataPipeline(viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDataPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * EnableDataPipeline enables a data pipeline.
     * </pre>
     */
    default void enableDataPipeline(viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableDataPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * DisableDataPipeline disables a data pipeline.
     * </pre>
     */
    default void disableDataPipeline(viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableDataPipelineMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataPipelinesService.
   * <pre>
   * DataPipelinesService is used to manage data pipelines.
   * </pre>
   */
  public static abstract class DataPipelinesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataPipelinesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataPipelinesService.
   * <pre>
   * DataPipelinesService is used to manage data pipelines.
   * </pre>
   */
  public static final class DataPipelinesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataPipelinesServiceStub> {
    private DataPipelinesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataPipelinesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataPipelinesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDataPipeline retrieves a specific data pipeline by its id.
     * </pre>
     */
    public void getDataPipeline(viam.app.datapipelines.v1.DataPipelines.GetDataPipelineRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.GetDataPipelineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDataPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListDataPipelines returns a list of data pipelines based on organization id.
     * </pre>
     */
    public void listDataPipelines(viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDataPipelinesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateDataPipeline creates a new data pipeline with the provided configuration.
     * </pre>
     */
    public void createDataPipeline(viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDataPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDataPipeline modifies an existing data pipeline's configuration.
     * </pre>
     */
    public void updateDataPipeline(viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDataPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteDataPipeline deletes a data pipeline from the database.
     * </pre>
     */
    public void deleteDataPipeline(viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDataPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EnableDataPipeline enables a data pipeline.
     * </pre>
     */
    public void enableDataPipeline(viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableDataPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DisableDataPipeline disables a data pipeline.
     * </pre>
     */
    public void disableDataPipeline(viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineRequest request,
        io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableDataPipelineMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataPipelinesService.
   * <pre>
   * DataPipelinesService is used to manage data pipelines.
   * </pre>
   */
  public static final class DataPipelinesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataPipelinesServiceBlockingStub> {
    private DataPipelinesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataPipelinesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataPipelinesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDataPipeline retrieves a specific data pipeline by its id.
     * </pre>
     */
    public viam.app.datapipelines.v1.DataPipelines.GetDataPipelineResponse getDataPipeline(viam.app.datapipelines.v1.DataPipelines.GetDataPipelineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDataPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListDataPipelines returns a list of data pipelines based on organization id.
     * </pre>
     */
    public viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesResponse listDataPipelines(viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDataPipelinesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateDataPipeline creates a new data pipeline with the provided configuration.
     * </pre>
     */
    public viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineResponse createDataPipeline(viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDataPipeline modifies an existing data pipeline's configuration.
     * </pre>
     */
    public viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineResponse updateDataPipeline(viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDataPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteDataPipeline deletes a data pipeline from the database.
     * </pre>
     */
    public viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineResponse deleteDataPipeline(viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDataPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EnableDataPipeline enables a data pipeline.
     * </pre>
     */
    public viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineResponse enableDataPipeline(viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableDataPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DisableDataPipeline disables a data pipeline.
     * </pre>
     */
    public viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineResponse disableDataPipeline(viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableDataPipelineMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataPipelinesService.
   * <pre>
   * DataPipelinesService is used to manage data pipelines.
   * </pre>
   */
  public static final class DataPipelinesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataPipelinesServiceFutureStub> {
    private DataPipelinesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataPipelinesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataPipelinesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDataPipeline retrieves a specific data pipeline by its id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.datapipelines.v1.DataPipelines.GetDataPipelineResponse> getDataPipeline(
        viam.app.datapipelines.v1.DataPipelines.GetDataPipelineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDataPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListDataPipelines returns a list of data pipelines based on organization id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesResponse> listDataPipelines(
        viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDataPipelinesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateDataPipeline creates a new data pipeline with the provided configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineResponse> createDataPipeline(
        viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDataPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDataPipeline modifies an existing data pipeline's configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineResponse> updateDataPipeline(
        viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDataPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteDataPipeline deletes a data pipeline from the database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineResponse> deleteDataPipeline(
        viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDataPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EnableDataPipeline enables a data pipeline.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineResponse> enableDataPipeline(
        viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableDataPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DisableDataPipeline disables a data pipeline.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineResponse> disableDataPipeline(
        viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableDataPipelineMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATA_PIPELINE = 0;
  private static final int METHODID_LIST_DATA_PIPELINES = 1;
  private static final int METHODID_CREATE_DATA_PIPELINE = 2;
  private static final int METHODID_UPDATE_DATA_PIPELINE = 3;
  private static final int METHODID_DELETE_DATA_PIPELINE = 4;
  private static final int METHODID_ENABLE_DATA_PIPELINE = 5;
  private static final int METHODID_DISABLE_DATA_PIPELINE = 6;

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
        case METHODID_GET_DATA_PIPELINE:
          serviceImpl.getDataPipeline((viam.app.datapipelines.v1.DataPipelines.GetDataPipelineRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.GetDataPipelineResponse>) responseObserver);
          break;
        case METHODID_LIST_DATA_PIPELINES:
          serviceImpl.listDataPipelines((viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesResponse>) responseObserver);
          break;
        case METHODID_CREATE_DATA_PIPELINE:
          serviceImpl.createDataPipeline((viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DATA_PIPELINE:
          serviceImpl.updateDataPipeline((viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineResponse>) responseObserver);
          break;
        case METHODID_DELETE_DATA_PIPELINE:
          serviceImpl.deleteDataPipeline((viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineResponse>) responseObserver);
          break;
        case METHODID_ENABLE_DATA_PIPELINE:
          serviceImpl.enableDataPipeline((viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineResponse>) responseObserver);
          break;
        case METHODID_DISABLE_DATA_PIPELINE:
          serviceImpl.disableDataPipeline((viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineResponse>) responseObserver);
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
          getGetDataPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.datapipelines.v1.DataPipelines.GetDataPipelineRequest,
              viam.app.datapipelines.v1.DataPipelines.GetDataPipelineResponse>(
                service, METHODID_GET_DATA_PIPELINE)))
        .addMethod(
          getListDataPipelinesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesRequest,
              viam.app.datapipelines.v1.DataPipelines.ListDataPipelinesResponse>(
                service, METHODID_LIST_DATA_PIPELINES)))
        .addMethod(
          getCreateDataPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineRequest,
              viam.app.datapipelines.v1.DataPipelines.CreateDataPipelineResponse>(
                service, METHODID_CREATE_DATA_PIPELINE)))
        .addMethod(
          getUpdateDataPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineRequest,
              viam.app.datapipelines.v1.DataPipelines.UpdateDataPipelineResponse>(
                service, METHODID_UPDATE_DATA_PIPELINE)))
        .addMethod(
          getDeleteDataPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineRequest,
              viam.app.datapipelines.v1.DataPipelines.DeleteDataPipelineResponse>(
                service, METHODID_DELETE_DATA_PIPELINE)))
        .addMethod(
          getEnableDataPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineRequest,
              viam.app.datapipelines.v1.DataPipelines.EnableDataPipelineResponse>(
                service, METHODID_ENABLE_DATA_PIPELINE)))
        .addMethod(
          getDisableDataPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineRequest,
              viam.app.datapipelines.v1.DataPipelines.DisableDataPipelineResponse>(
                service, METHODID_DISABLE_DATA_PIPELINE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataPipelinesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetDataPipelineMethod())
              .addMethod(getListDataPipelinesMethod())
              .addMethod(getCreateDataPipelineMethod())
              .addMethod(getUpdateDataPipelineMethod())
              .addMethod(getDeleteDataPipelineMethod())
              .addMethod(getEnableDataPipelineMethod())
              .addMethod(getDisableDataPipelineMethod())
              .build();
        }
      }
    }
    return result;
  }
}
