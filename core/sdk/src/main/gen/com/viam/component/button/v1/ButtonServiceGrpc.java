package com.viam.component.button.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A ButtonService services buttons associated with a machine
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: component/button/v1/button.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ButtonServiceGrpc {

  private ButtonServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.button.v1.ButtonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.button.v1.Button.PushRequest,
      com.viam.component.button.v1.Button.PushResponse> getPushMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Push",
      requestType = com.viam.component.button.v1.Button.PushRequest.class,
      responseType = com.viam.component.button.v1.Button.PushResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.button.v1.Button.PushRequest,
      com.viam.component.button.v1.Button.PushResponse> getPushMethod() {
    io.grpc.MethodDescriptor<com.viam.component.button.v1.Button.PushRequest, com.viam.component.button.v1.Button.PushResponse> getPushMethod;
    if ((getPushMethod = ButtonServiceGrpc.getPushMethod) == null) {
      synchronized (ButtonServiceGrpc.class) {
        if ((getPushMethod = ButtonServiceGrpc.getPushMethod) == null) {
          ButtonServiceGrpc.getPushMethod = getPushMethod =
              io.grpc.MethodDescriptor.<com.viam.component.button.v1.Button.PushRequest, com.viam.component.button.v1.Button.PushResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Push"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.button.v1.Button.PushRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.button.v1.Button.PushResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPushMethod;
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
    if ((getDoCommandMethod = ButtonServiceGrpc.getDoCommandMethod) == null) {
      synchronized (ButtonServiceGrpc.class) {
        if ((getDoCommandMethod = ButtonServiceGrpc.getDoCommandMethod) == null) {
          ButtonServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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
  public static ButtonServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ButtonServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ButtonServiceStub>() {
        @java.lang.Override
        public ButtonServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ButtonServiceStub(channel, callOptions);
        }
      };
    return ButtonServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ButtonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ButtonServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ButtonServiceBlockingStub>() {
        @java.lang.Override
        public ButtonServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ButtonServiceBlockingStub(channel, callOptions);
        }
      };
    return ButtonServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ButtonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ButtonServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ButtonServiceFutureStub>() {
        @java.lang.Override
        public ButtonServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ButtonServiceFutureStub(channel, callOptions);
        }
      };
    return ButtonServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A ButtonService services buttons associated with a machine
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Pushes a button
     * </pre>
     */
    default void push(com.viam.component.button.v1.Button.PushRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.button.v1.Button.PushResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPushMethod(), responseObserver);
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
   * Base class for the server implementation of the service ButtonService.
   * <pre>
   * A ButtonService services buttons associated with a machine
   * </pre>
   */
  public static abstract class ButtonServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ButtonServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ButtonService.
   * <pre>
   * A ButtonService services buttons associated with a machine
   * </pre>
   */
  public static final class ButtonServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ButtonServiceStub> {
    private ButtonServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ButtonServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ButtonServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Pushes a button
     * </pre>
     */
    public void push(com.viam.component.button.v1.Button.PushRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.button.v1.Button.PushResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPushMethod(), getCallOptions()), request, responseObserver);
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
   * A stub to allow clients to do synchronous rpc calls to service ButtonService.
   * <pre>
   * A ButtonService services buttons associated with a machine
   * </pre>
   */
  public static final class ButtonServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ButtonServiceBlockingStub> {
    private ButtonServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ButtonServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ButtonServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Pushes a button
     * </pre>
     */
    public com.viam.component.button.v1.Button.PushResponse push(com.viam.component.button.v1.Button.PushRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPushMethod(), getCallOptions(), request);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ButtonService.
   * <pre>
   * A ButtonService services buttons associated with a machine
   * </pre>
   */
  public static final class ButtonServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ButtonServiceFutureStub> {
    private ButtonServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ButtonServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ButtonServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Pushes a button
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.button.v1.Button.PushResponse> push(
        com.viam.component.button.v1.Button.PushRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPushMethod(), getCallOptions()), request);
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

  private static final int METHODID_PUSH = 0;
  private static final int METHODID_DO_COMMAND = 1;

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
        case METHODID_PUSH:
          serviceImpl.push((com.viam.component.button.v1.Button.PushRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.button.v1.Button.PushResponse>) responseObserver);
          break;
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPushMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.button.v1.Button.PushRequest,
              com.viam.component.button.v1.Button.PushResponse>(
                service, METHODID_PUSH)))
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
      synchronized (ButtonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getPushMethod())
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
