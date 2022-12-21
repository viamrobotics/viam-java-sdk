package proto.rpc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An AuthService is intended to be used as a means to perform application level
 * authentication. Its sole Authenticate method should be used prior to any
 * other services that a gRPC server has to offer.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/rpc/v1/auth.proto")
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.rpc.v1.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.rpc.v1.Auth.AuthenticateRequest,
      proto.rpc.v1.Auth.AuthenticateResponse> getAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authenticate",
      requestType = proto.rpc.v1.Auth.AuthenticateRequest.class,
      responseType = proto.rpc.v1.Auth.AuthenticateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.rpc.v1.Auth.AuthenticateRequest,
      proto.rpc.v1.Auth.AuthenticateResponse> getAuthenticateMethod() {
    io.grpc.MethodDescriptor<proto.rpc.v1.Auth.AuthenticateRequest, proto.rpc.v1.Auth.AuthenticateResponse> getAuthenticateMethod;
    if ((getAuthenticateMethod = AuthServiceGrpc.getAuthenticateMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAuthenticateMethod = AuthServiceGrpc.getAuthenticateMethod) == null) {
          AuthServiceGrpc.getAuthenticateMethod = getAuthenticateMethod =
              io.grpc.MethodDescriptor.<proto.rpc.v1.Auth.AuthenticateRequest, proto.rpc.v1.Auth.AuthenticateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Authenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.rpc.v1.Auth.AuthenticateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.rpc.v1.Auth.AuthenticateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("Authenticate"))
              .build();
        }
      }
    }
    return getAuthenticateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An AuthService is intended to be used as a means to perform application level
   * authentication. Its sole Authenticate method should be used prior to any
   * other services that a gRPC server has to offer.
   * </pre>
   */
  public static abstract class AuthServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Authenticate attempts to authenticate the caller. The resulting
     * response contains an access token that should be used for future
     * requests.
     * </pre>
     */
    public void authenticate(proto.rpc.v1.Auth.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.v1.Auth.AuthenticateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthenticateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.rpc.v1.Auth.AuthenticateRequest,
                proto.rpc.v1.Auth.AuthenticateResponse>(
                  this, METHODID_AUTHENTICATE)))
          .build();
    }
  }

  /**
   * <pre>
   * An AuthService is intended to be used as a means to perform application level
   * authentication. Its sole Authenticate method should be used prior to any
   * other services that a gRPC server has to offer.
   * </pre>
   */
  public static final class AuthServiceStub extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Authenticate attempts to authenticate the caller. The resulting
     * response contains an access token that should be used for future
     * requests.
     * </pre>
     */
    public void authenticate(proto.rpc.v1.Auth.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<proto.rpc.v1.Auth.AuthenticateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * An AuthService is intended to be used as a means to perform application level
   * authentication. Its sole Authenticate method should be used prior to any
   * other services that a gRPC server has to offer.
   * </pre>
   */
  public static final class AuthServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Authenticate attempts to authenticate the caller. The resulting
     * response contains an access token that should be used for future
     * requests.
     * </pre>
     */
    public proto.rpc.v1.Auth.AuthenticateResponse authenticate(proto.rpc.v1.Auth.AuthenticateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * An AuthService is intended to be used as a means to perform application level
   * authentication. Its sole Authenticate method should be used prior to any
   * other services that a gRPC server has to offer.
   * </pre>
   */
  public static final class AuthServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Authenticate attempts to authenticate the caller. The resulting
     * response contains an access token that should be used for future
     * requests.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.rpc.v1.Auth.AuthenticateResponse> authenticate(
        proto.rpc.v1.Auth.AuthenticateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHENTICATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHENTICATE:
          serviceImpl.authenticate((proto.rpc.v1.Auth.AuthenticateRequest) request,
              (io.grpc.stub.StreamObserver<proto.rpc.v1.Auth.AuthenticateResponse>) responseObserver);
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

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.rpc.v1.Auth.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getAuthenticateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
