package com.viam.service.shell.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A ShellService service allows access to an interactive shell experience.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: service/shell/v1/shell.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ShellServiceGrpc {

  private ShellServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.service.shell.v1.ShellService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.service.shell.v1.Shell.ShellRequest,
      com.viam.service.shell.v1.Shell.ShellResponse> getShellMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Shell",
      requestType = com.viam.service.shell.v1.Shell.ShellRequest.class,
      responseType = com.viam.service.shell.v1.Shell.ShellResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.viam.service.shell.v1.Shell.ShellRequest,
      com.viam.service.shell.v1.Shell.ShellResponse> getShellMethod() {
    io.grpc.MethodDescriptor<com.viam.service.shell.v1.Shell.ShellRequest, com.viam.service.shell.v1.Shell.ShellResponse> getShellMethod;
    if ((getShellMethod = ShellServiceGrpc.getShellMethod) == null) {
      synchronized (ShellServiceGrpc.class) {
        if ((getShellMethod = ShellServiceGrpc.getShellMethod) == null) {
          ShellServiceGrpc.getShellMethod = getShellMethod =
              io.grpc.MethodDescriptor.<com.viam.service.shell.v1.Shell.ShellRequest, com.viam.service.shell.v1.Shell.ShellResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Shell"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.shell.v1.Shell.ShellRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.shell.v1.Shell.ShellResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShellServiceMethodDescriptorSupplier("Shell"))
              .build();
        }
      }
    }
    return getShellMethod;
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
    if ((getDoCommandMethod = ShellServiceGrpc.getDoCommandMethod) == null) {
      synchronized (ShellServiceGrpc.class) {
        if ((getDoCommandMethod = ShellServiceGrpc.getDoCommandMethod) == null) {
          ShellServiceGrpc.getDoCommandMethod = getDoCommandMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.DoCommandRequest, com.viam.common.v1.Common.DoCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShellServiceMethodDescriptorSupplier("DoCommand"))
              .build();
        }
      }
    }
    return getDoCommandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShellServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShellServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShellServiceStub>() {
        @java.lang.Override
        public ShellServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShellServiceStub(channel, callOptions);
        }
      };
    return ShellServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShellServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShellServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShellServiceBlockingStub>() {
        @java.lang.Override
        public ShellServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShellServiceBlockingStub(channel, callOptions);
        }
      };
    return ShellServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShellServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShellServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShellServiceFutureStub>() {
        @java.lang.Override
        public ShellServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShellServiceFutureStub(channel, callOptions);
        }
      };
    return ShellServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A ShellService service allows access to an interactive shell experience.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Shell starts a shell with an input and output pipe.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.ShellRequest> shell(
        io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.ShellResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getShellMethod(), responseObserver);
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
   * Base class for the server implementation of the service ShellService.
   * <pre>
   * A ShellService service allows access to an interactive shell experience.
   * </pre>
   */
  public static abstract class ShellServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ShellServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ShellService.
   * <pre>
   * A ShellService service allows access to an interactive shell experience.
   * </pre>
   */
  public static final class ShellServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ShellServiceStub> {
    private ShellServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShellServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShellServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Shell starts a shell with an input and output pipe.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.ShellRequest> shell(
        io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.ShellResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getShellMethod(), getCallOptions()), responseObserver);
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
   * A stub to allow clients to do synchronous rpc calls to service ShellService.
   * <pre>
   * A ShellService service allows access to an interactive shell experience.
   * </pre>
   */
  public static final class ShellServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ShellServiceBlockingStub> {
    private ShellServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShellServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShellServiceBlockingStub(channel, callOptions);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ShellService.
   * <pre>
   * A ShellService service allows access to an interactive shell experience.
   * </pre>
   */
  public static final class ShellServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ShellServiceFutureStub> {
    private ShellServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShellServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShellServiceFutureStub(channel, callOptions);
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

  private static final int METHODID_DO_COMMAND = 0;
  private static final int METHODID_SHELL = 1;

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
        case METHODID_SHELL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.shell(
              (io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.ShellResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getShellMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.viam.service.shell.v1.Shell.ShellRequest,
              com.viam.service.shell.v1.Shell.ShellResponse>(
                service, METHODID_SHELL)))
        .addMethod(
          getDoCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.DoCommandRequest,
              com.viam.common.v1.Common.DoCommandResponse>(
                service, METHODID_DO_COMMAND)))
        .build();
  }

  private static abstract class ShellServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShellServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.service.shell.v1.Shell.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShellService");
    }
  }

  private static final class ShellServiceFileDescriptorSupplier
      extends ShellServiceBaseDescriptorSupplier {
    ShellServiceFileDescriptorSupplier() {}
  }

  private static final class ShellServiceMethodDescriptorSupplier
      extends ShellServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ShellServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ShellServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShellServiceFileDescriptorSupplier())
              .addMethod(getShellMethod())
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
