package com.viam.component.nswitch.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A SwitchService services switches associated with a machine.
 * Switches can have multiple discrete positions - e.g. a simple
 * switch has 2 positions, but a knob could have 10 positions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: component/switch/v1/switch.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SwitchServiceGrpc {

  private SwitchServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.switch.v1.SwitchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.nswitch.v1.Switch.SetPositionRequest,
      com.viam.component.nswitch.v1.Switch.SetPositionResponse> getSetPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPosition",
      requestType = com.viam.component.nswitch.v1.Switch.SetPositionRequest.class,
      responseType = com.viam.component.nswitch.v1.Switch.SetPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.nswitch.v1.Switch.SetPositionRequest,
      com.viam.component.nswitch.v1.Switch.SetPositionResponse> getSetPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.component.nswitch.v1.Switch.SetPositionRequest, com.viam.component.nswitch.v1.Switch.SetPositionResponse> getSetPositionMethod;
    if ((getSetPositionMethod = SwitchServiceGrpc.getSetPositionMethod) == null) {
      synchronized (SwitchServiceGrpc.class) {
        if ((getSetPositionMethod = SwitchServiceGrpc.getSetPositionMethod) == null) {
          SwitchServiceGrpc.getSetPositionMethod = getSetPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.component.nswitch.v1.Switch.SetPositionRequest, com.viam.component.nswitch.v1.Switch.SetPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.nswitch.v1.Switch.SetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.nswitch.v1.Switch.SetPositionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.nswitch.v1.Switch.GetPositionRequest,
      com.viam.component.nswitch.v1.Switch.GetPositionResponse> getGetPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPosition",
      requestType = com.viam.component.nswitch.v1.Switch.GetPositionRequest.class,
      responseType = com.viam.component.nswitch.v1.Switch.GetPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.nswitch.v1.Switch.GetPositionRequest,
      com.viam.component.nswitch.v1.Switch.GetPositionResponse> getGetPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.component.nswitch.v1.Switch.GetPositionRequest, com.viam.component.nswitch.v1.Switch.GetPositionResponse> getGetPositionMethod;
    if ((getGetPositionMethod = SwitchServiceGrpc.getGetPositionMethod) == null) {
      synchronized (SwitchServiceGrpc.class) {
        if ((getGetPositionMethod = SwitchServiceGrpc.getGetPositionMethod) == null) {
          SwitchServiceGrpc.getGetPositionMethod = getGetPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.component.nswitch.v1.Switch.GetPositionRequest, com.viam.component.nswitch.v1.Switch.GetPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.nswitch.v1.Switch.GetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.nswitch.v1.Switch.GetPositionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsRequest,
      com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsResponse> getGetNumberOfPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNumberOfPositions",
      requestType = com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsRequest.class,
      responseType = com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsRequest,
      com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsResponse> getGetNumberOfPositionsMethod() {
    io.grpc.MethodDescriptor<com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsRequest, com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsResponse> getGetNumberOfPositionsMethod;
    if ((getGetNumberOfPositionsMethod = SwitchServiceGrpc.getGetNumberOfPositionsMethod) == null) {
      synchronized (SwitchServiceGrpc.class) {
        if ((getGetNumberOfPositionsMethod = SwitchServiceGrpc.getGetNumberOfPositionsMethod) == null) {
          SwitchServiceGrpc.getGetNumberOfPositionsMethod = getGetNumberOfPositionsMethod =
              io.grpc.MethodDescriptor.<com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsRequest, com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNumberOfPositions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetNumberOfPositionsMethod;
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
    if ((getDoCommandMethod = SwitchServiceGrpc.getDoCommandMethod) == null) {
      synchronized (SwitchServiceGrpc.class) {
        if ((getDoCommandMethod = SwitchServiceGrpc.getDoCommandMethod) == null) {
          SwitchServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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
  public static SwitchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SwitchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SwitchServiceStub>() {
        @java.lang.Override
        public SwitchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SwitchServiceStub(channel, callOptions);
        }
      };
    return SwitchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SwitchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SwitchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SwitchServiceBlockingStub>() {
        @java.lang.Override
        public SwitchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SwitchServiceBlockingStub(channel, callOptions);
        }
      };
    return SwitchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SwitchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SwitchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SwitchServiceFutureStub>() {
        @java.lang.Override
        public SwitchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SwitchServiceFutureStub(channel, callOptions);
        }
      };
    return SwitchServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A SwitchService services switches associated with a machine.
   * Switches can have multiple discrete positions - e.g. a simple
   * switch has 2 positions, but a knob could have 10 positions.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Set the position of the switch
     * </pre>
     */
    default void setPosition(com.viam.component.nswitch.v1.Switch.SetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.nswitch.v1.Switch.SetPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the position of the switch
     * </pre>
     */
    default void getPosition(com.viam.component.nswitch.v1.Switch.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.nswitch.v1.Switch.GetPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the number of positions that the switch supports
     * </pre>
     */
    default void getNumberOfPositions(com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNumberOfPositionsMethod(), responseObserver);
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
   * Base class for the server implementation of the service SwitchService.
   * <pre>
   * A SwitchService services switches associated with a machine.
   * Switches can have multiple discrete positions - e.g. a simple
   * switch has 2 positions, but a knob could have 10 positions.
   * </pre>
   */
  public static abstract class SwitchServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SwitchServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SwitchService.
   * <pre>
   * A SwitchService services switches associated with a machine.
   * Switches can have multiple discrete positions - e.g. a simple
   * switch has 2 positions, but a knob could have 10 positions.
   * </pre>
   */
  public static final class SwitchServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SwitchServiceStub> {
    private SwitchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SwitchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SwitchServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set the position of the switch
     * </pre>
     */
    public void setPosition(com.viam.component.nswitch.v1.Switch.SetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.nswitch.v1.Switch.SetPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the position of the switch
     * </pre>
     */
    public void getPosition(com.viam.component.nswitch.v1.Switch.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.nswitch.v1.Switch.GetPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the number of positions that the switch supports
     * </pre>
     */
    public void getNumberOfPositions(com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNumberOfPositionsMethod(), getCallOptions()), request, responseObserver);
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
   * A stub to allow clients to do synchronous rpc calls to service SwitchService.
   * <pre>
   * A SwitchService services switches associated with a machine.
   * Switches can have multiple discrete positions - e.g. a simple
   * switch has 2 positions, but a knob could have 10 positions.
   * </pre>
   */
  public static final class SwitchServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SwitchServiceBlockingStub> {
    private SwitchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SwitchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SwitchServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set the position of the switch
     * </pre>
     */
    public com.viam.component.nswitch.v1.Switch.SetPositionResponse setPosition(com.viam.component.nswitch.v1.Switch.SetPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the position of the switch
     * </pre>
     */
    public com.viam.component.nswitch.v1.Switch.GetPositionResponse getPosition(com.viam.component.nswitch.v1.Switch.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the number of positions that the switch supports
     * </pre>
     */
    public com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsResponse getNumberOfPositions(com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNumberOfPositionsMethod(), getCallOptions(), request);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SwitchService.
   * <pre>
   * A SwitchService services switches associated with a machine.
   * Switches can have multiple discrete positions - e.g. a simple
   * switch has 2 positions, but a knob could have 10 positions.
   * </pre>
   */
  public static final class SwitchServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SwitchServiceFutureStub> {
    private SwitchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SwitchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SwitchServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set the position of the switch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.nswitch.v1.Switch.SetPositionResponse> setPosition(
        com.viam.component.nswitch.v1.Switch.SetPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the position of the switch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.nswitch.v1.Switch.GetPositionResponse> getPosition(
        com.viam.component.nswitch.v1.Switch.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the number of positions that the switch supports
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsResponse> getNumberOfPositions(
        com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNumberOfPositionsMethod(), getCallOptions()), request);
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

  private static final int METHODID_SET_POSITION = 0;
  private static final int METHODID_GET_POSITION = 1;
  private static final int METHODID_GET_NUMBER_OF_POSITIONS = 2;
  private static final int METHODID_DO_COMMAND = 3;

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
        case METHODID_SET_POSITION:
          serviceImpl.setPosition((com.viam.component.nswitch.v1.Switch.SetPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.nswitch.v1.Switch.SetPositionResponse>) responseObserver);
          break;
        case METHODID_GET_POSITION:
          serviceImpl.getPosition((com.viam.component.nswitch.v1.Switch.GetPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.nswitch.v1.Switch.GetPositionResponse>) responseObserver);
          break;
        case METHODID_GET_NUMBER_OF_POSITIONS:
          serviceImpl.getNumberOfPositions((com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsResponse>) responseObserver);
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
          getSetPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.nswitch.v1.Switch.SetPositionRequest,
              com.viam.component.nswitch.v1.Switch.SetPositionResponse>(
                service, METHODID_SET_POSITION)))
        .addMethod(
          getGetPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.nswitch.v1.Switch.GetPositionRequest,
              com.viam.component.nswitch.v1.Switch.GetPositionResponse>(
                service, METHODID_GET_POSITION)))
        .addMethod(
          getGetNumberOfPositionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsRequest,
              com.viam.component.nswitch.v1.Switch.GetNumberOfPositionsResponse>(
                service, METHODID_GET_NUMBER_OF_POSITIONS)))
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
      synchronized (SwitchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSetPositionMethod())
              .addMethod(getGetPositionMethod())
              .addMethod(getGetNumberOfPositionsMethod())
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
