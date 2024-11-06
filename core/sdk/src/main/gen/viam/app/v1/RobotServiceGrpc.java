package viam.app.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * RobotService is used by robots to retrieve configs, report logs, etc...
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: app/v1/robot.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RobotServiceGrpc {

  private RobotServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.app.v1.RobotService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.v1.Robot.ConfigRequest,
      viam.app.v1.Robot.ConfigResponse> getConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Config",
      requestType = viam.app.v1.Robot.ConfigRequest.class,
      responseType = viam.app.v1.Robot.ConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.Robot.ConfigRequest,
      viam.app.v1.Robot.ConfigResponse> getConfigMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.Robot.ConfigRequest, viam.app.v1.Robot.ConfigResponse> getConfigMethod;
    if ((getConfigMethod = RobotServiceGrpc.getConfigMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getConfigMethod = RobotServiceGrpc.getConfigMethod) == null) {
          RobotServiceGrpc.getConfigMethod = getConfigMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.Robot.ConfigRequest, viam.app.v1.Robot.ConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Config"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Robot.ConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Robot.ConfigResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.Robot.CertificateRequest,
      viam.app.v1.Robot.CertificateResponse> getCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Certificate",
      requestType = viam.app.v1.Robot.CertificateRequest.class,
      responseType = viam.app.v1.Robot.CertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.Robot.CertificateRequest,
      viam.app.v1.Robot.CertificateResponse> getCertificateMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.Robot.CertificateRequest, viam.app.v1.Robot.CertificateResponse> getCertificateMethod;
    if ((getCertificateMethod = RobotServiceGrpc.getCertificateMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getCertificateMethod = RobotServiceGrpc.getCertificateMethod) == null) {
          RobotServiceGrpc.getCertificateMethod = getCertificateMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.Robot.CertificateRequest, viam.app.v1.Robot.CertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Certificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Robot.CertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Robot.CertificateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.Robot.LogRequest,
      viam.app.v1.Robot.LogResponse> getLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Log",
      requestType = viam.app.v1.Robot.LogRequest.class,
      responseType = viam.app.v1.Robot.LogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.Robot.LogRequest,
      viam.app.v1.Robot.LogResponse> getLogMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.Robot.LogRequest, viam.app.v1.Robot.LogResponse> getLogMethod;
    if ((getLogMethod = RobotServiceGrpc.getLogMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getLogMethod = RobotServiceGrpc.getLogMethod) == null) {
          RobotServiceGrpc.getLogMethod = getLogMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.Robot.LogRequest, viam.app.v1.Robot.LogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Log"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Robot.LogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Robot.LogResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.Robot.NeedsRestartRequest,
      viam.app.v1.Robot.NeedsRestartResponse> getNeedsRestartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NeedsRestart",
      requestType = viam.app.v1.Robot.NeedsRestartRequest.class,
      responseType = viam.app.v1.Robot.NeedsRestartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.Robot.NeedsRestartRequest,
      viam.app.v1.Robot.NeedsRestartResponse> getNeedsRestartMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.Robot.NeedsRestartRequest, viam.app.v1.Robot.NeedsRestartResponse> getNeedsRestartMethod;
    if ((getNeedsRestartMethod = RobotServiceGrpc.getNeedsRestartMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getNeedsRestartMethod = RobotServiceGrpc.getNeedsRestartMethod) == null) {
          RobotServiceGrpc.getNeedsRestartMethod = getNeedsRestartMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.Robot.NeedsRestartRequest, viam.app.v1.Robot.NeedsRestartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NeedsRestart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Robot.NeedsRestartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Robot.NeedsRestartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getNeedsRestartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RobotServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RobotServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RobotServiceStub>() {
        @java.lang.Override
        public RobotServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RobotServiceStub(channel, callOptions);
        }
      };
    return RobotServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RobotServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RobotServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RobotServiceBlockingStub>() {
        @java.lang.Override
        public RobotServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RobotServiceBlockingStub(channel, callOptions);
        }
      };
    return RobotServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RobotServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RobotServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RobotServiceFutureStub>() {
        @java.lang.Override
        public RobotServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RobotServiceFutureStub(channel, callOptions);
        }
      };
    return RobotServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RobotService is used by robots to retrieve configs, report logs, etc...
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Config requests the current robot config
     * </pre>
     */
    default void config(viam.app.v1.Robot.ConfigRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Robot.ConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Certificate requests the current robot certificate
     * </pre>
     */
    default void certificate(viam.app.v1.Robot.CertificateRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Robot.CertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Log insert log entries associated with the robot. Allows up to 1000 entries to be added in one request.
     * </pre>
     */
    default void log(viam.app.v1.Robot.LogRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Robot.LogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogMethod(), responseObserver);
    }

    /**
     * <pre>
     * NeedsRestart returns if the robot should restart and the interval it should check to restart.
     * </pre>
     */
    default void needsRestart(viam.app.v1.Robot.NeedsRestartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Robot.NeedsRestartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNeedsRestartMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RobotService.
   * <pre>
   * RobotService is used by robots to retrieve configs, report logs, etc...
   * </pre>
   */
  public static abstract class RobotServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RobotServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RobotService.
   * <pre>
   * RobotService is used by robots to retrieve configs, report logs, etc...
   * </pre>
   */
  public static final class RobotServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RobotServiceStub> {
    private RobotServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RobotServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RobotServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Config requests the current robot config
     * </pre>
     */
    public void config(viam.app.v1.Robot.ConfigRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Robot.ConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Certificate requests the current robot certificate
     * </pre>
     */
    public void certificate(viam.app.v1.Robot.CertificateRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Robot.CertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Log insert log entries associated with the robot. Allows up to 1000 entries to be added in one request.
     * </pre>
     */
    public void log(viam.app.v1.Robot.LogRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Robot.LogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NeedsRestart returns if the robot should restart and the interval it should check to restart.
     * </pre>
     */
    public void needsRestart(viam.app.v1.Robot.NeedsRestartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Robot.NeedsRestartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNeedsRestartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RobotService.
   * <pre>
   * RobotService is used by robots to retrieve configs, report logs, etc...
   * </pre>
   */
  public static final class RobotServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RobotServiceBlockingStub> {
    private RobotServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RobotServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RobotServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Config requests the current robot config
     * </pre>
     */
    public viam.app.v1.Robot.ConfigResponse config(viam.app.v1.Robot.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Certificate requests the current robot certificate
     * </pre>
     */
    public viam.app.v1.Robot.CertificateResponse certificate(viam.app.v1.Robot.CertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Log insert log entries associated with the robot. Allows up to 1000 entries to be added in one request.
     * </pre>
     */
    public viam.app.v1.Robot.LogResponse log(viam.app.v1.Robot.LogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NeedsRestart returns if the robot should restart and the interval it should check to restart.
     * </pre>
     */
    public viam.app.v1.Robot.NeedsRestartResponse needsRestart(viam.app.v1.Robot.NeedsRestartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNeedsRestartMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RobotService.
   * <pre>
   * RobotService is used by robots to retrieve configs, report logs, etc...
   * </pre>
   */
  public static final class RobotServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RobotServiceFutureStub> {
    private RobotServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RobotServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RobotServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Config requests the current robot config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.Robot.ConfigResponse> config(
        viam.app.v1.Robot.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Certificate requests the current robot certificate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.Robot.CertificateResponse> certificate(
        viam.app.v1.Robot.CertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Log insert log entries associated with the robot. Allows up to 1000 entries to be added in one request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.Robot.LogResponse> log(
        viam.app.v1.Robot.LogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NeedsRestart returns if the robot should restart and the interval it should check to restart.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.Robot.NeedsRestartResponse> needsRestart(
        viam.app.v1.Robot.NeedsRestartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNeedsRestartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONFIG = 0;
  private static final int METHODID_CERTIFICATE = 1;
  private static final int METHODID_LOG = 2;
  private static final int METHODID_NEEDS_RESTART = 3;

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
        case METHODID_CONFIG:
          serviceImpl.config((viam.app.v1.Robot.ConfigRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.Robot.ConfigResponse>) responseObserver);
          break;
        case METHODID_CERTIFICATE:
          serviceImpl.certificate((viam.app.v1.Robot.CertificateRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.Robot.CertificateResponse>) responseObserver);
          break;
        case METHODID_LOG:
          serviceImpl.log((viam.app.v1.Robot.LogRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.Robot.LogResponse>) responseObserver);
          break;
        case METHODID_NEEDS_RESTART:
          serviceImpl.needsRestart((viam.app.v1.Robot.NeedsRestartRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.Robot.NeedsRestartResponse>) responseObserver);
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
          getConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.Robot.ConfigRequest,
              viam.app.v1.Robot.ConfigResponse>(
                service, METHODID_CONFIG)))
        .addMethod(
          getCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.Robot.CertificateRequest,
              viam.app.v1.Robot.CertificateResponse>(
                service, METHODID_CERTIFICATE)))
        .addMethod(
          getLogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.Robot.LogRequest,
              viam.app.v1.Robot.LogResponse>(
                service, METHODID_LOG)))
        .addMethod(
          getNeedsRestartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.Robot.NeedsRestartRequest,
              viam.app.v1.Robot.NeedsRestartResponse>(
                service, METHODID_NEEDS_RESTART)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RobotServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getConfigMethod())
              .addMethod(getCertificateMethod())
              .addMethod(getLogMethod())
              .addMethod(getNeedsRestartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
