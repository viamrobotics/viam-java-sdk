package viam.app.mltraining.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: app/mltraining/v1/ml_training.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MLTrainingServiceGrpc {

  private MLTrainingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.app.mltraining.v1.MLTrainingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.SubmitTrainingJobRequest,
      viam.app.mltraining.v1.MlTraining.SubmitTrainingJobResponse> getSubmitTrainingJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitTrainingJob",
      requestType = viam.app.mltraining.v1.MlTraining.SubmitTrainingJobRequest.class,
      responseType = viam.app.mltraining.v1.MlTraining.SubmitTrainingJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.SubmitTrainingJobRequest,
      viam.app.mltraining.v1.MlTraining.SubmitTrainingJobResponse> getSubmitTrainingJobMethod() {
    io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.SubmitTrainingJobRequest, viam.app.mltraining.v1.MlTraining.SubmitTrainingJobResponse> getSubmitTrainingJobMethod;
    if ((getSubmitTrainingJobMethod = MLTrainingServiceGrpc.getSubmitTrainingJobMethod) == null) {
      synchronized (MLTrainingServiceGrpc.class) {
        if ((getSubmitTrainingJobMethod = MLTrainingServiceGrpc.getSubmitTrainingJobMethod) == null) {
          MLTrainingServiceGrpc.getSubmitTrainingJobMethod = getSubmitTrainingJobMethod =
              io.grpc.MethodDescriptor.<viam.app.mltraining.v1.MlTraining.SubmitTrainingJobRequest, viam.app.mltraining.v1.MlTraining.SubmitTrainingJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitTrainingJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mltraining.v1.MlTraining.SubmitTrainingJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mltraining.v1.MlTraining.SubmitTrainingJobResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubmitTrainingJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobRequest,
      viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobResponse> getSubmitCustomTrainingJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitCustomTrainingJob",
      requestType = viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobRequest.class,
      responseType = viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobRequest,
      viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobResponse> getSubmitCustomTrainingJobMethod() {
    io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobRequest, viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobResponse> getSubmitCustomTrainingJobMethod;
    if ((getSubmitCustomTrainingJobMethod = MLTrainingServiceGrpc.getSubmitCustomTrainingJobMethod) == null) {
      synchronized (MLTrainingServiceGrpc.class) {
        if ((getSubmitCustomTrainingJobMethod = MLTrainingServiceGrpc.getSubmitCustomTrainingJobMethod) == null) {
          MLTrainingServiceGrpc.getSubmitCustomTrainingJobMethod = getSubmitCustomTrainingJobMethod =
              io.grpc.MethodDescriptor.<viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobRequest, viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitCustomTrainingJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubmitCustomTrainingJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.GetTrainingJobRequest,
      viam.app.mltraining.v1.MlTraining.GetTrainingJobResponse> getGetTrainingJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTrainingJob",
      requestType = viam.app.mltraining.v1.MlTraining.GetTrainingJobRequest.class,
      responseType = viam.app.mltraining.v1.MlTraining.GetTrainingJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.GetTrainingJobRequest,
      viam.app.mltraining.v1.MlTraining.GetTrainingJobResponse> getGetTrainingJobMethod() {
    io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.GetTrainingJobRequest, viam.app.mltraining.v1.MlTraining.GetTrainingJobResponse> getGetTrainingJobMethod;
    if ((getGetTrainingJobMethod = MLTrainingServiceGrpc.getGetTrainingJobMethod) == null) {
      synchronized (MLTrainingServiceGrpc.class) {
        if ((getGetTrainingJobMethod = MLTrainingServiceGrpc.getGetTrainingJobMethod) == null) {
          MLTrainingServiceGrpc.getGetTrainingJobMethod = getGetTrainingJobMethod =
              io.grpc.MethodDescriptor.<viam.app.mltraining.v1.MlTraining.GetTrainingJobRequest, viam.app.mltraining.v1.MlTraining.GetTrainingJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTrainingJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mltraining.v1.MlTraining.GetTrainingJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mltraining.v1.MlTraining.GetTrainingJobResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTrainingJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.ListTrainingJobsRequest,
      viam.app.mltraining.v1.MlTraining.ListTrainingJobsResponse> getListTrainingJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTrainingJobs",
      requestType = viam.app.mltraining.v1.MlTraining.ListTrainingJobsRequest.class,
      responseType = viam.app.mltraining.v1.MlTraining.ListTrainingJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.ListTrainingJobsRequest,
      viam.app.mltraining.v1.MlTraining.ListTrainingJobsResponse> getListTrainingJobsMethod() {
    io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.ListTrainingJobsRequest, viam.app.mltraining.v1.MlTraining.ListTrainingJobsResponse> getListTrainingJobsMethod;
    if ((getListTrainingJobsMethod = MLTrainingServiceGrpc.getListTrainingJobsMethod) == null) {
      synchronized (MLTrainingServiceGrpc.class) {
        if ((getListTrainingJobsMethod = MLTrainingServiceGrpc.getListTrainingJobsMethod) == null) {
          MLTrainingServiceGrpc.getListTrainingJobsMethod = getListTrainingJobsMethod =
              io.grpc.MethodDescriptor.<viam.app.mltraining.v1.MlTraining.ListTrainingJobsRequest, viam.app.mltraining.v1.MlTraining.ListTrainingJobsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTrainingJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mltraining.v1.MlTraining.ListTrainingJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mltraining.v1.MlTraining.ListTrainingJobsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListTrainingJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.CancelTrainingJobRequest,
      viam.app.mltraining.v1.MlTraining.CancelTrainingJobResponse> getCancelTrainingJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelTrainingJob",
      requestType = viam.app.mltraining.v1.MlTraining.CancelTrainingJobRequest.class,
      responseType = viam.app.mltraining.v1.MlTraining.CancelTrainingJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.CancelTrainingJobRequest,
      viam.app.mltraining.v1.MlTraining.CancelTrainingJobResponse> getCancelTrainingJobMethod() {
    io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.CancelTrainingJobRequest, viam.app.mltraining.v1.MlTraining.CancelTrainingJobResponse> getCancelTrainingJobMethod;
    if ((getCancelTrainingJobMethod = MLTrainingServiceGrpc.getCancelTrainingJobMethod) == null) {
      synchronized (MLTrainingServiceGrpc.class) {
        if ((getCancelTrainingJobMethod = MLTrainingServiceGrpc.getCancelTrainingJobMethod) == null) {
          MLTrainingServiceGrpc.getCancelTrainingJobMethod = getCancelTrainingJobMethod =
              io.grpc.MethodDescriptor.<viam.app.mltraining.v1.MlTraining.CancelTrainingJobRequest, viam.app.mltraining.v1.MlTraining.CancelTrainingJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelTrainingJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mltraining.v1.MlTraining.CancelTrainingJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mltraining.v1.MlTraining.CancelTrainingJobResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCancelTrainingJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobRequest,
      viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobResponse> getDeleteCompletedTrainingJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCompletedTrainingJob",
      requestType = viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobRequest.class,
      responseType = viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobRequest,
      viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobResponse> getDeleteCompletedTrainingJobMethod() {
    io.grpc.MethodDescriptor<viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobRequest, viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobResponse> getDeleteCompletedTrainingJobMethod;
    if ((getDeleteCompletedTrainingJobMethod = MLTrainingServiceGrpc.getDeleteCompletedTrainingJobMethod) == null) {
      synchronized (MLTrainingServiceGrpc.class) {
        if ((getDeleteCompletedTrainingJobMethod = MLTrainingServiceGrpc.getDeleteCompletedTrainingJobMethod) == null) {
          MLTrainingServiceGrpc.getDeleteCompletedTrainingJobMethod = getDeleteCompletedTrainingJobMethod =
              io.grpc.MethodDescriptor.<viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobRequest, viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCompletedTrainingJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteCompletedTrainingJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MLTrainingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MLTrainingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MLTrainingServiceStub>() {
        @java.lang.Override
        public MLTrainingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MLTrainingServiceStub(channel, callOptions);
        }
      };
    return MLTrainingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MLTrainingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MLTrainingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MLTrainingServiceBlockingStub>() {
        @java.lang.Override
        public MLTrainingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MLTrainingServiceBlockingStub(channel, callOptions);
        }
      };
    return MLTrainingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MLTrainingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MLTrainingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MLTrainingServiceFutureStub>() {
        @java.lang.Override
        public MLTrainingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MLTrainingServiceFutureStub(channel, callOptions);
        }
      };
    return MLTrainingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * SubmitTrainingJob submits a training job request.
     * </pre>
     */
    default void submitTrainingJob(viam.app.mltraining.v1.MlTraining.SubmitTrainingJobRequest request,
        io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.SubmitTrainingJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitTrainingJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * SubmitCustomTrainingJob submits a custom training job request.
     * </pre>
     */
    default void submitCustomTrainingJob(viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobRequest request,
        io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitCustomTrainingJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTrainingJob retrieves a training job by its ID.
     * </pre>
     */
    default void getTrainingJob(viam.app.mltraining.v1.MlTraining.GetTrainingJobRequest request,
        io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.GetTrainingJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTrainingJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListTrainingJobs lists training jobs for a given organization ID and training status.
     * </pre>
     */
    default void listTrainingJobs(viam.app.mltraining.v1.MlTraining.ListTrainingJobsRequest request,
        io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.ListTrainingJobsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTrainingJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelTrainingJob cancels a training job that has not yet completed.
     * </pre>
     */
    default void cancelTrainingJob(viam.app.mltraining.v1.MlTraining.CancelTrainingJobRequest request,
        io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.CancelTrainingJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelTrainingJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteCompletedTrainingJob removes a completed training job from the database, whether the job succeeded or failed.
     * </pre>
     */
    default void deleteCompletedTrainingJob(viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobRequest request,
        io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCompletedTrainingJobMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MLTrainingService.
   */
  public static abstract class MLTrainingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MLTrainingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MLTrainingService.
   */
  public static final class MLTrainingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MLTrainingServiceStub> {
    private MLTrainingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MLTrainingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MLTrainingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * SubmitTrainingJob submits a training job request.
     * </pre>
     */
    public void submitTrainingJob(viam.app.mltraining.v1.MlTraining.SubmitTrainingJobRequest request,
        io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.SubmitTrainingJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitTrainingJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SubmitCustomTrainingJob submits a custom training job request.
     * </pre>
     */
    public void submitCustomTrainingJob(viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobRequest request,
        io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitCustomTrainingJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTrainingJob retrieves a training job by its ID.
     * </pre>
     */
    public void getTrainingJob(viam.app.mltraining.v1.MlTraining.GetTrainingJobRequest request,
        io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.GetTrainingJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTrainingJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListTrainingJobs lists training jobs for a given organization ID and training status.
     * </pre>
     */
    public void listTrainingJobs(viam.app.mltraining.v1.MlTraining.ListTrainingJobsRequest request,
        io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.ListTrainingJobsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTrainingJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelTrainingJob cancels a training job that has not yet completed.
     * </pre>
     */
    public void cancelTrainingJob(viam.app.mltraining.v1.MlTraining.CancelTrainingJobRequest request,
        io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.CancelTrainingJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelTrainingJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteCompletedTrainingJob removes a completed training job from the database, whether the job succeeded or failed.
     * </pre>
     */
    public void deleteCompletedTrainingJob(viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobRequest request,
        io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCompletedTrainingJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MLTrainingService.
   */
  public static final class MLTrainingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MLTrainingServiceBlockingStub> {
    private MLTrainingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MLTrainingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MLTrainingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * SubmitTrainingJob submits a training job request.
     * </pre>
     */
    public viam.app.mltraining.v1.MlTraining.SubmitTrainingJobResponse submitTrainingJob(viam.app.mltraining.v1.MlTraining.SubmitTrainingJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitTrainingJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SubmitCustomTrainingJob submits a custom training job request.
     * </pre>
     */
    public viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobResponse submitCustomTrainingJob(viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitCustomTrainingJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTrainingJob retrieves a training job by its ID.
     * </pre>
     */
    public viam.app.mltraining.v1.MlTraining.GetTrainingJobResponse getTrainingJob(viam.app.mltraining.v1.MlTraining.GetTrainingJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTrainingJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListTrainingJobs lists training jobs for a given organization ID and training status.
     * </pre>
     */
    public viam.app.mltraining.v1.MlTraining.ListTrainingJobsResponse listTrainingJobs(viam.app.mltraining.v1.MlTraining.ListTrainingJobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTrainingJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelTrainingJob cancels a training job that has not yet completed.
     * </pre>
     */
    public viam.app.mltraining.v1.MlTraining.CancelTrainingJobResponse cancelTrainingJob(viam.app.mltraining.v1.MlTraining.CancelTrainingJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelTrainingJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteCompletedTrainingJob removes a completed training job from the database, whether the job succeeded or failed.
     * </pre>
     */
    public viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobResponse deleteCompletedTrainingJob(viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCompletedTrainingJobMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MLTrainingService.
   */
  public static final class MLTrainingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MLTrainingServiceFutureStub> {
    private MLTrainingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MLTrainingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MLTrainingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * SubmitTrainingJob submits a training job request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.mltraining.v1.MlTraining.SubmitTrainingJobResponse> submitTrainingJob(
        viam.app.mltraining.v1.MlTraining.SubmitTrainingJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitTrainingJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SubmitCustomTrainingJob submits a custom training job request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobResponse> submitCustomTrainingJob(
        viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitCustomTrainingJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTrainingJob retrieves a training job by its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.mltraining.v1.MlTraining.GetTrainingJobResponse> getTrainingJob(
        viam.app.mltraining.v1.MlTraining.GetTrainingJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTrainingJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListTrainingJobs lists training jobs for a given organization ID and training status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.mltraining.v1.MlTraining.ListTrainingJobsResponse> listTrainingJobs(
        viam.app.mltraining.v1.MlTraining.ListTrainingJobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTrainingJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelTrainingJob cancels a training job that has not yet completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.mltraining.v1.MlTraining.CancelTrainingJobResponse> cancelTrainingJob(
        viam.app.mltraining.v1.MlTraining.CancelTrainingJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelTrainingJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteCompletedTrainingJob removes a completed training job from the database, whether the job succeeded or failed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobResponse> deleteCompletedTrainingJob(
        viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCompletedTrainingJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_TRAINING_JOB = 0;
  private static final int METHODID_SUBMIT_CUSTOM_TRAINING_JOB = 1;
  private static final int METHODID_GET_TRAINING_JOB = 2;
  private static final int METHODID_LIST_TRAINING_JOBS = 3;
  private static final int METHODID_CANCEL_TRAINING_JOB = 4;
  private static final int METHODID_DELETE_COMPLETED_TRAINING_JOB = 5;

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
        case METHODID_SUBMIT_TRAINING_JOB:
          serviceImpl.submitTrainingJob((viam.app.mltraining.v1.MlTraining.SubmitTrainingJobRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.SubmitTrainingJobResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_CUSTOM_TRAINING_JOB:
          serviceImpl.submitCustomTrainingJob((viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobResponse>) responseObserver);
          break;
        case METHODID_GET_TRAINING_JOB:
          serviceImpl.getTrainingJob((viam.app.mltraining.v1.MlTraining.GetTrainingJobRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.GetTrainingJobResponse>) responseObserver);
          break;
        case METHODID_LIST_TRAINING_JOBS:
          serviceImpl.listTrainingJobs((viam.app.mltraining.v1.MlTraining.ListTrainingJobsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.ListTrainingJobsResponse>) responseObserver);
          break;
        case METHODID_CANCEL_TRAINING_JOB:
          serviceImpl.cancelTrainingJob((viam.app.mltraining.v1.MlTraining.CancelTrainingJobRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.CancelTrainingJobResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMPLETED_TRAINING_JOB:
          serviceImpl.deleteCompletedTrainingJob((viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobResponse>) responseObserver);
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
          getSubmitTrainingJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.mltraining.v1.MlTraining.SubmitTrainingJobRequest,
              viam.app.mltraining.v1.MlTraining.SubmitTrainingJobResponse>(
                service, METHODID_SUBMIT_TRAINING_JOB)))
        .addMethod(
          getSubmitCustomTrainingJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobRequest,
              viam.app.mltraining.v1.MlTraining.SubmitCustomTrainingJobResponse>(
                service, METHODID_SUBMIT_CUSTOM_TRAINING_JOB)))
        .addMethod(
          getGetTrainingJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.mltraining.v1.MlTraining.GetTrainingJobRequest,
              viam.app.mltraining.v1.MlTraining.GetTrainingJobResponse>(
                service, METHODID_GET_TRAINING_JOB)))
        .addMethod(
          getListTrainingJobsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.mltraining.v1.MlTraining.ListTrainingJobsRequest,
              viam.app.mltraining.v1.MlTraining.ListTrainingJobsResponse>(
                service, METHODID_LIST_TRAINING_JOBS)))
        .addMethod(
          getCancelTrainingJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.mltraining.v1.MlTraining.CancelTrainingJobRequest,
              viam.app.mltraining.v1.MlTraining.CancelTrainingJobResponse>(
                service, METHODID_CANCEL_TRAINING_JOB)))
        .addMethod(
          getDeleteCompletedTrainingJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobRequest,
              viam.app.mltraining.v1.MlTraining.DeleteCompletedTrainingJobResponse>(
                service, METHODID_DELETE_COMPLETED_TRAINING_JOB)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MLTrainingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSubmitTrainingJobMethod())
              .addMethod(getSubmitCustomTrainingJobMethod())
              .addMethod(getGetTrainingJobMethod())
              .addMethod(getListTrainingJobsMethod())
              .addMethod(getCancelTrainingJobMethod())
              .addMethod(getDeleteCompletedTrainingJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
