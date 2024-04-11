package viam.app.cloudslam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: app/cloudslam/v1/cloud_slam.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CloudSLAMServiceGrpc {

  private CloudSLAMServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.app.cloudslam.v1.CloudSLAMService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.StartMappingSessionRequest,
      viam.app.cloudslam.v1.CloudSlam.StartMappingSessionResponse> getStartMappingSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartMappingSession",
      requestType = viam.app.cloudslam.v1.CloudSlam.StartMappingSessionRequest.class,
      responseType = viam.app.cloudslam.v1.CloudSlam.StartMappingSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.StartMappingSessionRequest,
      viam.app.cloudslam.v1.CloudSlam.StartMappingSessionResponse> getStartMappingSessionMethod() {
    io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.StartMappingSessionRequest, viam.app.cloudslam.v1.CloudSlam.StartMappingSessionResponse> getStartMappingSessionMethod;
    if ((getStartMappingSessionMethod = CloudSLAMServiceGrpc.getStartMappingSessionMethod) == null) {
      synchronized (CloudSLAMServiceGrpc.class) {
        if ((getStartMappingSessionMethod = CloudSLAMServiceGrpc.getStartMappingSessionMethod) == null) {
          CloudSLAMServiceGrpc.getStartMappingSessionMethod = getStartMappingSessionMethod =
              io.grpc.MethodDescriptor.<viam.app.cloudslam.v1.CloudSlam.StartMappingSessionRequest, viam.app.cloudslam.v1.CloudSlam.StartMappingSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartMappingSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.cloudslam.v1.CloudSlam.StartMappingSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.cloudslam.v1.CloudSlam.StartMappingSessionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartMappingSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotRequest,
      viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotResponse> getGetActiveMappingSessionsForRobotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetActiveMappingSessionsForRobot",
      requestType = viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotRequest.class,
      responseType = viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotRequest,
      viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotResponse> getGetActiveMappingSessionsForRobotMethod() {
    io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotRequest, viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotResponse> getGetActiveMappingSessionsForRobotMethod;
    if ((getGetActiveMappingSessionsForRobotMethod = CloudSLAMServiceGrpc.getGetActiveMappingSessionsForRobotMethod) == null) {
      synchronized (CloudSLAMServiceGrpc.class) {
        if ((getGetActiveMappingSessionsForRobotMethod = CloudSLAMServiceGrpc.getGetActiveMappingSessionsForRobotMethod) == null) {
          CloudSLAMServiceGrpc.getGetActiveMappingSessionsForRobotMethod = getGetActiveMappingSessionsForRobotMethod =
              io.grpc.MethodDescriptor.<viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotRequest, viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetActiveMappingSessionsForRobot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetActiveMappingSessionsForRobotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudRequest,
      viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudResponse> getGetMappingSessionPointCloudMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMappingSessionPointCloud",
      requestType = viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudRequest.class,
      responseType = viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudRequest,
      viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudResponse> getGetMappingSessionPointCloudMethod() {
    io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudRequest, viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudResponse> getGetMappingSessionPointCloudMethod;
    if ((getGetMappingSessionPointCloudMethod = CloudSLAMServiceGrpc.getGetMappingSessionPointCloudMethod) == null) {
      synchronized (CloudSLAMServiceGrpc.class) {
        if ((getGetMappingSessionPointCloudMethod = CloudSLAMServiceGrpc.getGetMappingSessionPointCloudMethod) == null) {
          CloudSLAMServiceGrpc.getGetMappingSessionPointCloudMethod = getGetMappingSessionPointCloudMethod =
              io.grpc.MethodDescriptor.<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudRequest, viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMappingSessionPointCloud"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetMappingSessionPointCloudMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsRequest,
      viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsResponse> getListMappingSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMappingSessions",
      requestType = viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsRequest.class,
      responseType = viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsRequest,
      viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsResponse> getListMappingSessionsMethod() {
    io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsRequest, viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsResponse> getListMappingSessionsMethod;
    if ((getListMappingSessionsMethod = CloudSLAMServiceGrpc.getListMappingSessionsMethod) == null) {
      synchronized (CloudSLAMServiceGrpc.class) {
        if ((getListMappingSessionsMethod = CloudSLAMServiceGrpc.getListMappingSessionsMethod) == null) {
          CloudSLAMServiceGrpc.getListMappingSessionsMethod = getListMappingSessionsMethod =
              io.grpc.MethodDescriptor.<viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsRequest, viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMappingSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListMappingSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.StopMappingSessionRequest,
      viam.app.cloudslam.v1.CloudSlam.StopMappingSessionResponse> getStopMappingSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopMappingSession",
      requestType = viam.app.cloudslam.v1.CloudSlam.StopMappingSessionRequest.class,
      responseType = viam.app.cloudslam.v1.CloudSlam.StopMappingSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.StopMappingSessionRequest,
      viam.app.cloudslam.v1.CloudSlam.StopMappingSessionResponse> getStopMappingSessionMethod() {
    io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.StopMappingSessionRequest, viam.app.cloudslam.v1.CloudSlam.StopMappingSessionResponse> getStopMappingSessionMethod;
    if ((getStopMappingSessionMethod = CloudSLAMServiceGrpc.getStopMappingSessionMethod) == null) {
      synchronized (CloudSLAMServiceGrpc.class) {
        if ((getStopMappingSessionMethod = CloudSLAMServiceGrpc.getStopMappingSessionMethod) == null) {
          CloudSLAMServiceGrpc.getStopMappingSessionMethod = getStopMappingSessionMethod =
              io.grpc.MethodDescriptor.<viam.app.cloudslam.v1.CloudSlam.StopMappingSessionRequest, viam.app.cloudslam.v1.CloudSlam.StopMappingSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopMappingSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.cloudslam.v1.CloudSlam.StopMappingSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.cloudslam.v1.CloudSlam.StopMappingSessionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopMappingSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDRequest,
      viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDResponse> getGetMappingSessionMetadataByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMappingSessionMetadataByID",
      requestType = viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDRequest.class,
      responseType = viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDRequest,
      viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDResponse> getGetMappingSessionMetadataByIDMethod() {
    io.grpc.MethodDescriptor<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDRequest, viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDResponse> getGetMappingSessionMetadataByIDMethod;
    if ((getGetMappingSessionMetadataByIDMethod = CloudSLAMServiceGrpc.getGetMappingSessionMetadataByIDMethod) == null) {
      synchronized (CloudSLAMServiceGrpc.class) {
        if ((getGetMappingSessionMetadataByIDMethod = CloudSLAMServiceGrpc.getGetMappingSessionMetadataByIDMethod) == null) {
          CloudSLAMServiceGrpc.getGetMappingSessionMetadataByIDMethod = getGetMappingSessionMetadataByIDMethod =
              io.grpc.MethodDescriptor.<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDRequest, viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMappingSessionMetadataByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetMappingSessionMetadataByIDMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CloudSLAMServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudSLAMServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CloudSLAMServiceStub>() {
        @java.lang.Override
        public CloudSLAMServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CloudSLAMServiceStub(channel, callOptions);
        }
      };
    return CloudSLAMServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CloudSLAMServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudSLAMServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CloudSLAMServiceBlockingStub>() {
        @java.lang.Override
        public CloudSLAMServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CloudSLAMServiceBlockingStub(channel, callOptions);
        }
      };
    return CloudSLAMServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CloudSLAMServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudSLAMServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CloudSLAMServiceFutureStub>() {
        @java.lang.Override
        public CloudSLAMServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CloudSLAMServiceFutureStub(channel, callOptions);
        }
      };
    return CloudSLAMServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void startMappingSession(viam.app.cloudslam.v1.CloudSlam.StartMappingSessionRequest request,
        io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.StartMappingSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMappingSessionMethod(), responseObserver);
    }

    /**
     */
    default void getActiveMappingSessionsForRobot(viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetActiveMappingSessionsForRobotMethod(), responseObserver);
    }

    /**
     */
    default void getMappingSessionPointCloud(viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudRequest request,
        io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMappingSessionPointCloudMethod(), responseObserver);
    }

    /**
     */
    default void listMappingSessions(viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsRequest request,
        io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMappingSessionsMethod(), responseObserver);
    }

    /**
     */
    default void stopMappingSession(viam.app.cloudslam.v1.CloudSlam.StopMappingSessionRequest request,
        io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.StopMappingSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMappingSessionMethod(), responseObserver);
    }

    /**
     */
    default void getMappingSessionMetadataByID(viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDRequest request,
        io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMappingSessionMetadataByIDMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CloudSLAMService.
   */
  public static abstract class CloudSLAMServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CloudSLAMServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CloudSLAMService.
   */
  public static final class CloudSLAMServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CloudSLAMServiceStub> {
    private CloudSLAMServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudSLAMServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudSLAMServiceStub(channel, callOptions);
    }

    /**
     */
    public void startMappingSession(viam.app.cloudslam.v1.CloudSlam.StartMappingSessionRequest request,
        io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.StartMappingSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMappingSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getActiveMappingSessionsForRobot(viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetActiveMappingSessionsForRobotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMappingSessionPointCloud(viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudRequest request,
        io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMappingSessionPointCloudMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listMappingSessions(viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsRequest request,
        io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMappingSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopMappingSession(viam.app.cloudslam.v1.CloudSlam.StopMappingSessionRequest request,
        io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.StopMappingSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMappingSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMappingSessionMetadataByID(viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDRequest request,
        io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMappingSessionMetadataByIDMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CloudSLAMService.
   */
  public static final class CloudSLAMServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CloudSLAMServiceBlockingStub> {
    private CloudSLAMServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudSLAMServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudSLAMServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public viam.app.cloudslam.v1.CloudSlam.StartMappingSessionResponse startMappingSession(viam.app.cloudslam.v1.CloudSlam.StartMappingSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMappingSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotResponse getActiveMappingSessionsForRobot(viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetActiveMappingSessionsForRobotMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudResponse getMappingSessionPointCloud(viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMappingSessionPointCloudMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsResponse listMappingSessions(viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMappingSessionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.cloudslam.v1.CloudSlam.StopMappingSessionResponse stopMappingSession(viam.app.cloudslam.v1.CloudSlam.StopMappingSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMappingSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDResponse getMappingSessionMetadataByID(viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMappingSessionMetadataByIDMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CloudSLAMService.
   */
  public static final class CloudSLAMServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CloudSLAMServiceFutureStub> {
    private CloudSLAMServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudSLAMServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudSLAMServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.cloudslam.v1.CloudSlam.StartMappingSessionResponse> startMappingSession(
        viam.app.cloudslam.v1.CloudSlam.StartMappingSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMappingSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotResponse> getActiveMappingSessionsForRobot(
        viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetActiveMappingSessionsForRobotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudResponse> getMappingSessionPointCloud(
        viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMappingSessionPointCloudMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsResponse> listMappingSessions(
        viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMappingSessionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.cloudslam.v1.CloudSlam.StopMappingSessionResponse> stopMappingSession(
        viam.app.cloudslam.v1.CloudSlam.StopMappingSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMappingSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDResponse> getMappingSessionMetadataByID(
        viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMappingSessionMetadataByIDMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_MAPPING_SESSION = 0;
  private static final int METHODID_GET_ACTIVE_MAPPING_SESSIONS_FOR_ROBOT = 1;
  private static final int METHODID_GET_MAPPING_SESSION_POINT_CLOUD = 2;
  private static final int METHODID_LIST_MAPPING_SESSIONS = 3;
  private static final int METHODID_STOP_MAPPING_SESSION = 4;
  private static final int METHODID_GET_MAPPING_SESSION_METADATA_BY_ID = 5;

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
        case METHODID_START_MAPPING_SESSION:
          serviceImpl.startMappingSession((viam.app.cloudslam.v1.CloudSlam.StartMappingSessionRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.StartMappingSessionResponse>) responseObserver);
          break;
        case METHODID_GET_ACTIVE_MAPPING_SESSIONS_FOR_ROBOT:
          serviceImpl.getActiveMappingSessionsForRobot((viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotResponse>) responseObserver);
          break;
        case METHODID_GET_MAPPING_SESSION_POINT_CLOUD:
          serviceImpl.getMappingSessionPointCloud((viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudResponse>) responseObserver);
          break;
        case METHODID_LIST_MAPPING_SESSIONS:
          serviceImpl.listMappingSessions((viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsResponse>) responseObserver);
          break;
        case METHODID_STOP_MAPPING_SESSION:
          serviceImpl.stopMappingSession((viam.app.cloudslam.v1.CloudSlam.StopMappingSessionRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.StopMappingSessionResponse>) responseObserver);
          break;
        case METHODID_GET_MAPPING_SESSION_METADATA_BY_ID:
          serviceImpl.getMappingSessionMetadataByID((viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDResponse>) responseObserver);
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
          getStartMappingSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.cloudslam.v1.CloudSlam.StartMappingSessionRequest,
              viam.app.cloudslam.v1.CloudSlam.StartMappingSessionResponse>(
                service, METHODID_START_MAPPING_SESSION)))
        .addMethod(
          getGetActiveMappingSessionsForRobotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotRequest,
              viam.app.cloudslam.v1.CloudSlam.GetActiveMappingSessionsForRobotResponse>(
                service, METHODID_GET_ACTIVE_MAPPING_SESSIONS_FOR_ROBOT)))
        .addMethod(
          getGetMappingSessionPointCloudMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudRequest,
              viam.app.cloudslam.v1.CloudSlam.GetMappingSessionPointCloudResponse>(
                service, METHODID_GET_MAPPING_SESSION_POINT_CLOUD)))
        .addMethod(
          getListMappingSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsRequest,
              viam.app.cloudslam.v1.CloudSlam.ListMappingSessionsResponse>(
                service, METHODID_LIST_MAPPING_SESSIONS)))
        .addMethod(
          getStopMappingSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.cloudslam.v1.CloudSlam.StopMappingSessionRequest,
              viam.app.cloudslam.v1.CloudSlam.StopMappingSessionResponse>(
                service, METHODID_STOP_MAPPING_SESSION)))
        .addMethod(
          getGetMappingSessionMetadataByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDRequest,
              viam.app.cloudslam.v1.CloudSlam.GetMappingSessionMetadataByIDResponse>(
                service, METHODID_GET_MAPPING_SESSION_METADATA_BY_ID)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CloudSLAMServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getStartMappingSessionMethod())
              .addMethod(getGetActiveMappingSessionsForRobotMethod())
              .addMethod(getGetMappingSessionPointCloudMethod())
              .addMethod(getListMappingSessionsMethod())
              .addMethod(getStopMappingSessionMethod())
              .addMethod(getGetMappingSessionMetadataByIDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
