package proto.rpc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An ExternalAuthService is intended to be used as a means to perform application level
 * authentication but for an external entity that it is responsible for handling auth for.
 * An example of its use would be for a entity that only trusts an external source to
 * perform authentication for it.
 * Its sole AuthenticateTo method should be used prior to any other services that the external
 * entity's gRPC server has to offer.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/rpc/v1/auth.proto")
public final class ExternalAuthServiceGrpc {

  private ExternalAuthServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.rpc.v1.ExternalAuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.rpc.v1.Auth.AuthenticateToRequest,
      proto.rpc.v1.Auth.AuthenticateToResponse> getAuthenticateToMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthenticateTo",
      requestType = proto.rpc.v1.Auth.AuthenticateToRequest.class,
      responseType = proto.rpc.v1.Auth.AuthenticateToResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.rpc.v1.Auth.AuthenticateToRequest,
      proto.rpc.v1.Auth.AuthenticateToResponse> getAuthenticateToMethod() {
    io.grpc.MethodDescriptor<proto.rpc.v1.Auth.AuthenticateToRequest, proto.rpc.v1.Auth.AuthenticateToResponse> getAuthenticateToMethod;
    if ((getAuthenticateToMethod = ExternalAuthServiceGrpc.getAuthenticateToMethod) == null) {
      synchronized (ExternalAuthServiceGrpc.class) {
        if ((getAuthenticateToMethod = ExternalAuthServiceGrpc.getAuthenticateToMethod) == null) {
          ExternalAuthServiceGrpc.getAuthenticateToMethod = getAuthenticateToMethod =
              io.grpc.MethodDescriptor.<proto.rpc.v1.Auth.AuthenticateToRequest, proto.rpc.v1.Auth.AuthenticateToResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthenticateTo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.rpc.v1.Auth.AuthenticateToRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.rpc.v1.Auth.AuthenticateToResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExternalAuthServiceMethodDescriptorSupplier("AuthenticateTo"))
              .build();
        }
      }
    }
    return getAuthenticateToMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExternalAuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExternalAuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExternalAuthServiceStub>() {
        @java.lang.Override
        public ExternalAuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExternalAuthServiceStub(channel, callOptions);
        }
      };
    return ExternalAuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExternalAuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExternalAuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExternalAuthServiceBlockingStub>() {
        @java.lang.Override
        public ExternalAuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExternalAuthServiceBlockingStub(channel, callOptions);
        }
      };
    return ExternalAuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExternalAuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExternalAuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExternalAuthServiceFutureStub>() {
        @java.lang.Override
        public ExternalAuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExternalAuthServiceFutureStub(channel, callOptions);
        }
      };
    return ExternalAuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An ExternalAuthService is intended to be used as a means to perform application level
   * authentication but for an external entity that it is responsible for handling auth for.
   * An example of its use would be for a entity that only trusts an external source to
   * perform authentication for it.
   * Its sole AuthenticateTo method should be used prior to any other services that the external
   * entity's gRPC server has to offer.
   * </pre>
   */
  public static abstract class ExternalAuthServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * AuthenticateTo attempts to authenticate the caller on behalf of an entity.
     * The resulting response contains an access token that should be used for future
     * requests. This assumes that the caller is already authenticated to the
     * server implementing this service.
     * </pre>
     */
    public void authenticateTo(proto.rpc.v1.Auth.AuthenticateToRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.v1.Auth.AuthenticateToResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateToMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthenticateToMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.rpc.v1.Auth.AuthenticateToRequest,
                proto.rpc.v1.Auth.AuthenticateToResponse>(
                  this, METHODID_AUTHENTICATE_TO)))
          .build();
    }
  }

  /**
   * <pre>
   * An ExternalAuthService is intended to be used as a means to perform application level
   * authentication but for an external entity that it is responsible for handling auth for.
   * An example of its use would be for a entity that only trusts an external source to
   * perform authentication for it.
   * Its sole AuthenticateTo method should be used prior to any other services that the external
   * entity's gRPC server has to offer.
   * </pre>
   */
  public static final class ExternalAuthServiceStub extends io.grpc.stub.AbstractAsyncStub<ExternalAuthServiceStub> {
    private ExternalAuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExternalAuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExternalAuthServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * AuthenticateTo attempts to authenticate the caller on behalf of an entity.
     * The resulting response contains an access token that should be used for future
     * requests. This assumes that the caller is already authenticated to the
     * server implementing this service.
     * </pre>
     */
    public void authenticateTo(proto.rpc.v1.Auth.AuthenticateToRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.v1.Auth.AuthenticateToResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateToMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * An ExternalAuthService is intended to be used as a means to perform application level
   * authentication but for an external entity that it is responsible for handling auth for.
   * An example of its use would be for a entity that only trusts an external source to
   * perform authentication for it.
   * Its sole AuthenticateTo method should be used prior to any other services that the external
   * entity's gRPC server has to offer.
   * </pre>
   */
  public static final class ExternalAuthServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExternalAuthServiceBlockingStub> {
    private ExternalAuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExternalAuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExternalAuthServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * AuthenticateTo attempts to authenticate the caller on behalf of an entity.
     * The resulting response contains an access token that should be used for future
     * requests. This assumes that the caller is already authenticated to the
     * server implementing this service.
     * </pre>
     */
    public proto.rpc.v1.Auth.AuthenticateToResponse authenticateTo(proto.rpc.v1.Auth.AuthenticateToRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateToMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * An ExternalAuthService is intended to be used as a means to perform application level
   * authentication but for an external entity that it is responsible for handling auth for.
   * An example of its use would be for a entity that only trusts an external source to
   * perform authentication for it.
   * Its sole AuthenticateTo method should be used prior to any other services that the external
   * entity's gRPC server has to offer.
   * </pre>
   */
  public static final class ExternalAuthServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ExternalAuthServiceFutureStub> {
    private ExternalAuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExternalAuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExternalAuthServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * AuthenticateTo attempts to authenticate the caller on behalf of an entity.
     * The resulting response contains an access token that should be used for future
     * requests. This assumes that the caller is already authenticated to the
     * server implementing this service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.rpc.v1.Auth.AuthenticateToResponse> authenticateTo(
        proto.rpc.v1.Auth.AuthenticateToRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateToMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHENTICATE_TO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExternalAuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExternalAuthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHENTICATE_TO:
          serviceImpl.authenticateTo((proto.rpc.v1.Auth.AuthenticateToRequest) request,
              (io.grpc.stub.StreamObserver<proto.rpc.v1.Auth.AuthenticateToResponse>) responseObserver);
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

  private static abstract class ExternalAuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExternalAuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.rpc.v1.Auth.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExternalAuthService");
    }
  }

  private static final class ExternalAuthServiceFileDescriptorSupplier
      extends ExternalAuthServiceBaseDescriptorSupplier {
    ExternalAuthServiceFileDescriptorSupplier() {}
  }

  private static final class ExternalAuthServiceMethodDescriptorSupplier
      extends ExternalAuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExternalAuthServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExternalAuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExternalAuthServiceFileDescriptorSupplier())
              .addMethod(getAuthenticateToMethod())
              .build();
        }
      }
    }
    return result;
  }
}
