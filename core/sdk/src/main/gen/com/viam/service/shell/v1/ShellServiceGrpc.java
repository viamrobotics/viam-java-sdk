package com.viam.service.shell.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A ShellService service allows access to an interactive shell experience, including
 * utilities commonly found in tandem with other secure shells.
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.shell.v1.Shell.ShellRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.shell.v1.Shell.ShellResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getShellMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.shell.v1.Shell.CopyFilesToMachineRequest,
      com.viam.service.shell.v1.Shell.CopyFilesToMachineResponse> getCopyFilesToMachineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyFilesToMachine",
      requestType = com.viam.service.shell.v1.Shell.CopyFilesToMachineRequest.class,
      responseType = com.viam.service.shell.v1.Shell.CopyFilesToMachineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.viam.service.shell.v1.Shell.CopyFilesToMachineRequest,
      com.viam.service.shell.v1.Shell.CopyFilesToMachineResponse> getCopyFilesToMachineMethod() {
    io.grpc.MethodDescriptor<com.viam.service.shell.v1.Shell.CopyFilesToMachineRequest, com.viam.service.shell.v1.Shell.CopyFilesToMachineResponse> getCopyFilesToMachineMethod;
    if ((getCopyFilesToMachineMethod = ShellServiceGrpc.getCopyFilesToMachineMethod) == null) {
      synchronized (ShellServiceGrpc.class) {
        if ((getCopyFilesToMachineMethod = ShellServiceGrpc.getCopyFilesToMachineMethod) == null) {
          ShellServiceGrpc.getCopyFilesToMachineMethod = getCopyFilesToMachineMethod =
              io.grpc.MethodDescriptor.<com.viam.service.shell.v1.Shell.CopyFilesToMachineRequest, com.viam.service.shell.v1.Shell.CopyFilesToMachineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyFilesToMachine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.shell.v1.Shell.CopyFilesToMachineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.shell.v1.Shell.CopyFilesToMachineResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCopyFilesToMachineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.shell.v1.Shell.CopyFilesFromMachineRequest,
      com.viam.service.shell.v1.Shell.CopyFilesFromMachineResponse> getCopyFilesFromMachineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyFilesFromMachine",
      requestType = com.viam.service.shell.v1.Shell.CopyFilesFromMachineRequest.class,
      responseType = com.viam.service.shell.v1.Shell.CopyFilesFromMachineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.viam.service.shell.v1.Shell.CopyFilesFromMachineRequest,
      com.viam.service.shell.v1.Shell.CopyFilesFromMachineResponse> getCopyFilesFromMachineMethod() {
    io.grpc.MethodDescriptor<com.viam.service.shell.v1.Shell.CopyFilesFromMachineRequest, com.viam.service.shell.v1.Shell.CopyFilesFromMachineResponse> getCopyFilesFromMachineMethod;
    if ((getCopyFilesFromMachineMethod = ShellServiceGrpc.getCopyFilesFromMachineMethod) == null) {
      synchronized (ShellServiceGrpc.class) {
        if ((getCopyFilesFromMachineMethod = ShellServiceGrpc.getCopyFilesFromMachineMethod) == null) {
          ShellServiceGrpc.getCopyFilesFromMachineMethod = getCopyFilesFromMachineMethod =
              io.grpc.MethodDescriptor.<com.viam.service.shell.v1.Shell.CopyFilesFromMachineRequest, com.viam.service.shell.v1.Shell.CopyFilesFromMachineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyFilesFromMachine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.shell.v1.Shell.CopyFilesFromMachineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.shell.v1.Shell.CopyFilesFromMachineResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCopyFilesFromMachineMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandResponse.getDefaultInstance()))
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
   * A ShellService service allows access to an interactive shell experience, including
   * utilities commonly found in tandem with other secure shells.
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
     * CopyFilesToMachines copies a stream of files from a client to the connected-to machine.
     * Initially, metadata is sent to describe the destination in the filesystem in addition
     * to what kind of file(s) are being sent.
     * Once metadata is sent, the file transfer can proceed where one-by-one, file data is sent
     * until EOF per file.
     * After each file is sent, the machine must respond with an ACK before the next file can
     * be sent. This provides back-pressure and ordering.
     * The order in which individual files are sent does not matter; that is, if traversing a
     * directory, copying depth-first, breadth-first, or any other algorithm does not matter.
     * Permissions and metadata on files copied are only preserved if the preserve option is
     * set in the initial request metadata.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.CopyFilesToMachineRequest> copyFilesToMachine(
        io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.CopyFilesToMachineResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCopyFilesToMachineMethod(), responseObserver);
    }

    /**
     * <pre>
     * CopyFilesFromMachine copies a stream of files from a connected-to machine to the calling client.
     * Essentially, it is the inverse of CopyFilesToMachine with the same ACK mechanism in reverse.
     * The initial metadata request will request the paths to copy along with if permissions should
     * be preserved (and consequently sent over the wire).
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.CopyFilesFromMachineRequest> copyFilesFromMachine(
        io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.CopyFilesFromMachineResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCopyFilesFromMachineMethod(), responseObserver);
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
   * A ShellService service allows access to an interactive shell experience, including
   * utilities commonly found in tandem with other secure shells.
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
   * A ShellService service allows access to an interactive shell experience, including
   * utilities commonly found in tandem with other secure shells.
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
     * CopyFilesToMachines copies a stream of files from a client to the connected-to machine.
     * Initially, metadata is sent to describe the destination in the filesystem in addition
     * to what kind of file(s) are being sent.
     * Once metadata is sent, the file transfer can proceed where one-by-one, file data is sent
     * until EOF per file.
     * After each file is sent, the machine must respond with an ACK before the next file can
     * be sent. This provides back-pressure and ordering.
     * The order in which individual files are sent does not matter; that is, if traversing a
     * directory, copying depth-first, breadth-first, or any other algorithm does not matter.
     * Permissions and metadata on files copied are only preserved if the preserve option is
     * set in the initial request metadata.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.CopyFilesToMachineRequest> copyFilesToMachine(
        io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.CopyFilesToMachineResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCopyFilesToMachineMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * CopyFilesFromMachine copies a stream of files from a connected-to machine to the calling client.
     * Essentially, it is the inverse of CopyFilesToMachine with the same ACK mechanism in reverse.
     * The initial metadata request will request the paths to copy along with if permissions should
     * be preserved (and consequently sent over the wire).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.CopyFilesFromMachineRequest> copyFilesFromMachine(
        io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.CopyFilesFromMachineResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCopyFilesFromMachineMethod(), getCallOptions()), responseObserver);
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
   * A ShellService service allows access to an interactive shell experience, including
   * utilities commonly found in tandem with other secure shells.
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
   * A ShellService service allows access to an interactive shell experience, including
   * utilities commonly found in tandem with other secure shells.
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
  private static final int METHODID_COPY_FILES_TO_MACHINE = 2;
  private static final int METHODID_COPY_FILES_FROM_MACHINE = 3;

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
        case METHODID_COPY_FILES_TO_MACHINE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.copyFilesToMachine(
              (io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.CopyFilesToMachineResponse>) responseObserver);
        case METHODID_COPY_FILES_FROM_MACHINE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.copyFilesFromMachine(
              (io.grpc.stub.StreamObserver<com.viam.service.shell.v1.Shell.CopyFilesFromMachineResponse>) responseObserver);
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
          getCopyFilesToMachineMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.viam.service.shell.v1.Shell.CopyFilesToMachineRequest,
              com.viam.service.shell.v1.Shell.CopyFilesToMachineResponse>(
                service, METHODID_COPY_FILES_TO_MACHINE)))
        .addMethod(
          getCopyFilesFromMachineMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.viam.service.shell.v1.Shell.CopyFilesFromMachineRequest,
              com.viam.service.shell.v1.Shell.CopyFilesFromMachineResponse>(
                service, METHODID_COPY_FILES_FROM_MACHINE)))
        .addMethod(
          getDoCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.DoCommandRequest,
              com.viam.common.v1.Common.DoCommandResponse>(
                service, METHODID_DO_COMMAND)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ShellServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getShellMethod())
              .addMethod(getCopyFilesToMachineMethod())
              .addMethod(getCopyFilesFromMachineMethod())
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
