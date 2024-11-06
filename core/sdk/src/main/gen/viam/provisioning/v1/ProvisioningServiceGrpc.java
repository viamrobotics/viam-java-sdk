package viam.provisioning.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ProvisioningService is used by viam-agent to retrieve the smart machine info.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: provisioning/v1/provisioning.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProvisioningServiceGrpc {

  private ProvisioningServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.provisioning.v1.ProvisioningService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.provisioning.v1.Provisioning.GetSmartMachineStatusRequest,
      viam.provisioning.v1.Provisioning.GetSmartMachineStatusResponse> getGetSmartMachineStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSmartMachineStatus",
      requestType = viam.provisioning.v1.Provisioning.GetSmartMachineStatusRequest.class,
      responseType = viam.provisioning.v1.Provisioning.GetSmartMachineStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.provisioning.v1.Provisioning.GetSmartMachineStatusRequest,
      viam.provisioning.v1.Provisioning.GetSmartMachineStatusResponse> getGetSmartMachineStatusMethod() {
    io.grpc.MethodDescriptor<viam.provisioning.v1.Provisioning.GetSmartMachineStatusRequest, viam.provisioning.v1.Provisioning.GetSmartMachineStatusResponse> getGetSmartMachineStatusMethod;
    if ((getGetSmartMachineStatusMethod = ProvisioningServiceGrpc.getGetSmartMachineStatusMethod) == null) {
      synchronized (ProvisioningServiceGrpc.class) {
        if ((getGetSmartMachineStatusMethod = ProvisioningServiceGrpc.getGetSmartMachineStatusMethod) == null) {
          ProvisioningServiceGrpc.getGetSmartMachineStatusMethod = getGetSmartMachineStatusMethod =
              io.grpc.MethodDescriptor.<viam.provisioning.v1.Provisioning.GetSmartMachineStatusRequest, viam.provisioning.v1.Provisioning.GetSmartMachineStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSmartMachineStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.provisioning.v1.Provisioning.GetSmartMachineStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.provisioning.v1.Provisioning.GetSmartMachineStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetSmartMachineStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.provisioning.v1.Provisioning.SetNetworkCredentialsRequest,
      viam.provisioning.v1.Provisioning.SetNetworkCredentialsResponse> getSetNetworkCredentialsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetNetworkCredentials",
      requestType = viam.provisioning.v1.Provisioning.SetNetworkCredentialsRequest.class,
      responseType = viam.provisioning.v1.Provisioning.SetNetworkCredentialsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.provisioning.v1.Provisioning.SetNetworkCredentialsRequest,
      viam.provisioning.v1.Provisioning.SetNetworkCredentialsResponse> getSetNetworkCredentialsMethod() {
    io.grpc.MethodDescriptor<viam.provisioning.v1.Provisioning.SetNetworkCredentialsRequest, viam.provisioning.v1.Provisioning.SetNetworkCredentialsResponse> getSetNetworkCredentialsMethod;
    if ((getSetNetworkCredentialsMethod = ProvisioningServiceGrpc.getSetNetworkCredentialsMethod) == null) {
      synchronized (ProvisioningServiceGrpc.class) {
        if ((getSetNetworkCredentialsMethod = ProvisioningServiceGrpc.getSetNetworkCredentialsMethod) == null) {
          ProvisioningServiceGrpc.getSetNetworkCredentialsMethod = getSetNetworkCredentialsMethod =
              io.grpc.MethodDescriptor.<viam.provisioning.v1.Provisioning.SetNetworkCredentialsRequest, viam.provisioning.v1.Provisioning.SetNetworkCredentialsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetNetworkCredentials"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.provisioning.v1.Provisioning.SetNetworkCredentialsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.provisioning.v1.Provisioning.SetNetworkCredentialsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetNetworkCredentialsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsRequest,
      viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsResponse> getSetSmartMachineCredentialsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSmartMachineCredentials",
      requestType = viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsRequest.class,
      responseType = viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsRequest,
      viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsResponse> getSetSmartMachineCredentialsMethod() {
    io.grpc.MethodDescriptor<viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsRequest, viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsResponse> getSetSmartMachineCredentialsMethod;
    if ((getSetSmartMachineCredentialsMethod = ProvisioningServiceGrpc.getSetSmartMachineCredentialsMethod) == null) {
      synchronized (ProvisioningServiceGrpc.class) {
        if ((getSetSmartMachineCredentialsMethod = ProvisioningServiceGrpc.getSetSmartMachineCredentialsMethod) == null) {
          ProvisioningServiceGrpc.getSetSmartMachineCredentialsMethod = getSetSmartMachineCredentialsMethod =
              io.grpc.MethodDescriptor.<viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsRequest, viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetSmartMachineCredentials"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetSmartMachineCredentialsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.provisioning.v1.Provisioning.GetNetworkListRequest,
      viam.provisioning.v1.Provisioning.GetNetworkListResponse> getGetNetworkListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNetworkList",
      requestType = viam.provisioning.v1.Provisioning.GetNetworkListRequest.class,
      responseType = viam.provisioning.v1.Provisioning.GetNetworkListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.provisioning.v1.Provisioning.GetNetworkListRequest,
      viam.provisioning.v1.Provisioning.GetNetworkListResponse> getGetNetworkListMethod() {
    io.grpc.MethodDescriptor<viam.provisioning.v1.Provisioning.GetNetworkListRequest, viam.provisioning.v1.Provisioning.GetNetworkListResponse> getGetNetworkListMethod;
    if ((getGetNetworkListMethod = ProvisioningServiceGrpc.getGetNetworkListMethod) == null) {
      synchronized (ProvisioningServiceGrpc.class) {
        if ((getGetNetworkListMethod = ProvisioningServiceGrpc.getGetNetworkListMethod) == null) {
          ProvisioningServiceGrpc.getGetNetworkListMethod = getGetNetworkListMethod =
              io.grpc.MethodDescriptor.<viam.provisioning.v1.Provisioning.GetNetworkListRequest, viam.provisioning.v1.Provisioning.GetNetworkListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNetworkList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.provisioning.v1.Provisioning.GetNetworkListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.provisioning.v1.Provisioning.GetNetworkListResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetNetworkListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProvisioningServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProvisioningServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProvisioningServiceStub>() {
        @java.lang.Override
        public ProvisioningServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProvisioningServiceStub(channel, callOptions);
        }
      };
    return ProvisioningServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProvisioningServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProvisioningServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProvisioningServiceBlockingStub>() {
        @java.lang.Override
        public ProvisioningServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProvisioningServiceBlockingStub(channel, callOptions);
        }
      };
    return ProvisioningServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProvisioningServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProvisioningServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProvisioningServiceFutureStub>() {
        @java.lang.Override
        public ProvisioningServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProvisioningServiceFutureStub(channel, callOptions);
        }
      };
    return ProvisioningServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ProvisioningService is used by viam-agent to retrieve the smart machine info.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetSmartMachineStatus is for retrieving the status of the smart machine including networking.
     * </pre>
     */
    default void getSmartMachineStatus(viam.provisioning.v1.Provisioning.GetSmartMachineStatusRequest request,
        io.grpc.stub.StreamObserver<viam.provisioning.v1.Provisioning.GetSmartMachineStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSmartMachineStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetNetworkCredentials is to set the wifi credentials.
     * </pre>
     */
    default void setNetworkCredentials(viam.provisioning.v1.Provisioning.SetNetworkCredentialsRequest request,
        io.grpc.stub.StreamObserver<viam.provisioning.v1.Provisioning.SetNetworkCredentialsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetNetworkCredentialsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetSmartMachineCredentials is to set the smart machine credentials.
     * </pre>
     */
    default void setSmartMachineCredentials(viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsRequest request,
        io.grpc.stub.StreamObserver<viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetSmartMachineCredentialsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetNetworkList is to retrieve the list of networks that are visible to the smart machine.
     * </pre>
     */
    default void getNetworkList(viam.provisioning.v1.Provisioning.GetNetworkListRequest request,
        io.grpc.stub.StreamObserver<viam.provisioning.v1.Provisioning.GetNetworkListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNetworkListMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProvisioningService.
   * <pre>
   * ProvisioningService is used by viam-agent to retrieve the smart machine info.
   * </pre>
   */
  public static abstract class ProvisioningServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProvisioningServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProvisioningService.
   * <pre>
   * ProvisioningService is used by viam-agent to retrieve the smart machine info.
   * </pre>
   */
  public static final class ProvisioningServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProvisioningServiceStub> {
    private ProvisioningServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProvisioningServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProvisioningServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSmartMachineStatus is for retrieving the status of the smart machine including networking.
     * </pre>
     */
    public void getSmartMachineStatus(viam.provisioning.v1.Provisioning.GetSmartMachineStatusRequest request,
        io.grpc.stub.StreamObserver<viam.provisioning.v1.Provisioning.GetSmartMachineStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSmartMachineStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetNetworkCredentials is to set the wifi credentials.
     * </pre>
     */
    public void setNetworkCredentials(viam.provisioning.v1.Provisioning.SetNetworkCredentialsRequest request,
        io.grpc.stub.StreamObserver<viam.provisioning.v1.Provisioning.SetNetworkCredentialsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetNetworkCredentialsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetSmartMachineCredentials is to set the smart machine credentials.
     * </pre>
     */
    public void setSmartMachineCredentials(viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsRequest request,
        io.grpc.stub.StreamObserver<viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetSmartMachineCredentialsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetNetworkList is to retrieve the list of networks that are visible to the smart machine.
     * </pre>
     */
    public void getNetworkList(viam.provisioning.v1.Provisioning.GetNetworkListRequest request,
        io.grpc.stub.StreamObserver<viam.provisioning.v1.Provisioning.GetNetworkListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNetworkListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProvisioningService.
   * <pre>
   * ProvisioningService is used by viam-agent to retrieve the smart machine info.
   * </pre>
   */
  public static final class ProvisioningServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProvisioningServiceBlockingStub> {
    private ProvisioningServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProvisioningServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProvisioningServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSmartMachineStatus is for retrieving the status of the smart machine including networking.
     * </pre>
     */
    public viam.provisioning.v1.Provisioning.GetSmartMachineStatusResponse getSmartMachineStatus(viam.provisioning.v1.Provisioning.GetSmartMachineStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSmartMachineStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetNetworkCredentials is to set the wifi credentials.
     * </pre>
     */
    public viam.provisioning.v1.Provisioning.SetNetworkCredentialsResponse setNetworkCredentials(viam.provisioning.v1.Provisioning.SetNetworkCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetNetworkCredentialsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetSmartMachineCredentials is to set the smart machine credentials.
     * </pre>
     */
    public viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsResponse setSmartMachineCredentials(viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetSmartMachineCredentialsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetNetworkList is to retrieve the list of networks that are visible to the smart machine.
     * </pre>
     */
    public viam.provisioning.v1.Provisioning.GetNetworkListResponse getNetworkList(viam.provisioning.v1.Provisioning.GetNetworkListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNetworkListMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProvisioningService.
   * <pre>
   * ProvisioningService is used by viam-agent to retrieve the smart machine info.
   * </pre>
   */
  public static final class ProvisioningServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProvisioningServiceFutureStub> {
    private ProvisioningServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProvisioningServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProvisioningServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSmartMachineStatus is for retrieving the status of the smart machine including networking.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.provisioning.v1.Provisioning.GetSmartMachineStatusResponse> getSmartMachineStatus(
        viam.provisioning.v1.Provisioning.GetSmartMachineStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSmartMachineStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetNetworkCredentials is to set the wifi credentials.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.provisioning.v1.Provisioning.SetNetworkCredentialsResponse> setNetworkCredentials(
        viam.provisioning.v1.Provisioning.SetNetworkCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetNetworkCredentialsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetSmartMachineCredentials is to set the smart machine credentials.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsResponse> setSmartMachineCredentials(
        viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetSmartMachineCredentialsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetNetworkList is to retrieve the list of networks that are visible to the smart machine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.provisioning.v1.Provisioning.GetNetworkListResponse> getNetworkList(
        viam.provisioning.v1.Provisioning.GetNetworkListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNetworkListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SMART_MACHINE_STATUS = 0;
  private static final int METHODID_SET_NETWORK_CREDENTIALS = 1;
  private static final int METHODID_SET_SMART_MACHINE_CREDENTIALS = 2;
  private static final int METHODID_GET_NETWORK_LIST = 3;

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
        case METHODID_GET_SMART_MACHINE_STATUS:
          serviceImpl.getSmartMachineStatus((viam.provisioning.v1.Provisioning.GetSmartMachineStatusRequest) request,
              (io.grpc.stub.StreamObserver<viam.provisioning.v1.Provisioning.GetSmartMachineStatusResponse>) responseObserver);
          break;
        case METHODID_SET_NETWORK_CREDENTIALS:
          serviceImpl.setNetworkCredentials((viam.provisioning.v1.Provisioning.SetNetworkCredentialsRequest) request,
              (io.grpc.stub.StreamObserver<viam.provisioning.v1.Provisioning.SetNetworkCredentialsResponse>) responseObserver);
          break;
        case METHODID_SET_SMART_MACHINE_CREDENTIALS:
          serviceImpl.setSmartMachineCredentials((viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsRequest) request,
              (io.grpc.stub.StreamObserver<viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsResponse>) responseObserver);
          break;
        case METHODID_GET_NETWORK_LIST:
          serviceImpl.getNetworkList((viam.provisioning.v1.Provisioning.GetNetworkListRequest) request,
              (io.grpc.stub.StreamObserver<viam.provisioning.v1.Provisioning.GetNetworkListResponse>) responseObserver);
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
          getGetSmartMachineStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.provisioning.v1.Provisioning.GetSmartMachineStatusRequest,
              viam.provisioning.v1.Provisioning.GetSmartMachineStatusResponse>(
                service, METHODID_GET_SMART_MACHINE_STATUS)))
        .addMethod(
          getSetNetworkCredentialsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.provisioning.v1.Provisioning.SetNetworkCredentialsRequest,
              viam.provisioning.v1.Provisioning.SetNetworkCredentialsResponse>(
                service, METHODID_SET_NETWORK_CREDENTIALS)))
        .addMethod(
          getSetSmartMachineCredentialsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsRequest,
              viam.provisioning.v1.Provisioning.SetSmartMachineCredentialsResponse>(
                service, METHODID_SET_SMART_MACHINE_CREDENTIALS)))
        .addMethod(
          getGetNetworkListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.provisioning.v1.Provisioning.GetNetworkListRequest,
              viam.provisioning.v1.Provisioning.GetNetworkListResponse>(
                service, METHODID_GET_NETWORK_LIST)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProvisioningServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetSmartMachineStatusMethod())
              .addMethod(getSetNetworkCredentialsMethod())
              .addMethod(getSetSmartMachineCredentialsMethod())
              .addMethod(getGetNetworkListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
