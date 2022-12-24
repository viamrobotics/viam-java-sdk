package com.viam.component.gantry.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An GantryService services all gantries associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: component/gantry/v1/gantry.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GantryServiceGrpc {

  private GantryServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.component.gantry.v1.GantryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.GetPositionRequest,
      com.viam.component.gantry.v1.Gantry.GetPositionResponse> getGetPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPosition",
      requestType = com.viam.component.gantry.v1.Gantry.GetPositionRequest.class,
      responseType = com.viam.component.gantry.v1.Gantry.GetPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.GetPositionRequest,
      com.viam.component.gantry.v1.Gantry.GetPositionResponse> getGetPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.GetPositionRequest, com.viam.component.gantry.v1.Gantry.GetPositionResponse> getGetPositionMethod;
    if ((getGetPositionMethod = GantryServiceGrpc.getGetPositionMethod) == null) {
      synchronized (GantryServiceGrpc.class) {
        if ((getGetPositionMethod = GantryServiceGrpc.getGetPositionMethod) == null) {
          GantryServiceGrpc.getGetPositionMethod = getGetPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.component.gantry.v1.Gantry.GetPositionRequest, com.viam.component.gantry.v1.Gantry.GetPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.GetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.GetPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GantryServiceMethodDescriptorSupplier("GetPosition"))
              .build();
        }
      }
    }
    return getGetPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.MoveToPositionRequest,
      com.viam.component.gantry.v1.Gantry.MoveToPositionResponse> getMoveToPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveToPosition",
      requestType = com.viam.component.gantry.v1.Gantry.MoveToPositionRequest.class,
      responseType = com.viam.component.gantry.v1.Gantry.MoveToPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.MoveToPositionRequest,
      com.viam.component.gantry.v1.Gantry.MoveToPositionResponse> getMoveToPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.MoveToPositionRequest, com.viam.component.gantry.v1.Gantry.MoveToPositionResponse> getMoveToPositionMethod;
    if ((getMoveToPositionMethod = GantryServiceGrpc.getMoveToPositionMethod) == null) {
      synchronized (GantryServiceGrpc.class) {
        if ((getMoveToPositionMethod = GantryServiceGrpc.getMoveToPositionMethod) == null) {
          GantryServiceGrpc.getMoveToPositionMethod = getMoveToPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.component.gantry.v1.Gantry.MoveToPositionRequest, com.viam.component.gantry.v1.Gantry.MoveToPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveToPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.MoveToPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.MoveToPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GantryServiceMethodDescriptorSupplier("MoveToPosition"))
              .build();
        }
      }
    }
    return getMoveToPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.GetLengthsRequest,
      com.viam.component.gantry.v1.Gantry.GetLengthsResponse> getGetLengthsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLengths",
      requestType = com.viam.component.gantry.v1.Gantry.GetLengthsRequest.class,
      responseType = com.viam.component.gantry.v1.Gantry.GetLengthsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.GetLengthsRequest,
      com.viam.component.gantry.v1.Gantry.GetLengthsResponse> getGetLengthsMethod() {
    io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.GetLengthsRequest, com.viam.component.gantry.v1.Gantry.GetLengthsResponse> getGetLengthsMethod;
    if ((getGetLengthsMethod = GantryServiceGrpc.getGetLengthsMethod) == null) {
      synchronized (GantryServiceGrpc.class) {
        if ((getGetLengthsMethod = GantryServiceGrpc.getGetLengthsMethod) == null) {
          GantryServiceGrpc.getGetLengthsMethod = getGetLengthsMethod =
              io.grpc.MethodDescriptor.<com.viam.component.gantry.v1.Gantry.GetLengthsRequest, com.viam.component.gantry.v1.Gantry.GetLengthsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLengths"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.GetLengthsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.GetLengthsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GantryServiceMethodDescriptorSupplier("GetLengths"))
              .build();
        }
      }
    }
    return getGetLengthsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.StopRequest,
      com.viam.component.gantry.v1.Gantry.StopResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = com.viam.component.gantry.v1.Gantry.StopRequest.class,
      responseType = com.viam.component.gantry.v1.Gantry.StopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.StopRequest,
      com.viam.component.gantry.v1.Gantry.StopResponse> getStopMethod() {
    io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.StopRequest, com.viam.component.gantry.v1.Gantry.StopResponse> getStopMethod;
    if ((getStopMethod = GantryServiceGrpc.getStopMethod) == null) {
      synchronized (GantryServiceGrpc.class) {
        if ((getStopMethod = GantryServiceGrpc.getStopMethod) == null) {
          GantryServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<com.viam.component.gantry.v1.Gantry.StopRequest, com.viam.component.gantry.v1.Gantry.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.StopResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GantryServiceMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.IsMovingRequest,
      com.viam.component.gantry.v1.Gantry.IsMovingResponse> getIsMovingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsMoving",
      requestType = com.viam.component.gantry.v1.Gantry.IsMovingRequest.class,
      responseType = com.viam.component.gantry.v1.Gantry.IsMovingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.IsMovingRequest,
      com.viam.component.gantry.v1.Gantry.IsMovingResponse> getIsMovingMethod() {
    io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.IsMovingRequest, com.viam.component.gantry.v1.Gantry.IsMovingResponse> getIsMovingMethod;
    if ((getIsMovingMethod = GantryServiceGrpc.getIsMovingMethod) == null) {
      synchronized (GantryServiceGrpc.class) {
        if ((getIsMovingMethod = GantryServiceGrpc.getIsMovingMethod) == null) {
          GantryServiceGrpc.getIsMovingMethod = getIsMovingMethod =
              io.grpc.MethodDescriptor.<com.viam.component.gantry.v1.Gantry.IsMovingRequest, com.viam.component.gantry.v1.Gantry.IsMovingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsMoving"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.IsMovingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.IsMovingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GantryServiceMethodDescriptorSupplier("IsMoving"))
              .build();
        }
      }
    }
    return getIsMovingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GantryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GantryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GantryServiceStub>() {
        @java.lang.Override
        public GantryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GantryServiceStub(channel, callOptions);
        }
      };
    return GantryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GantryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GantryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GantryServiceBlockingStub>() {
        @java.lang.Override
        public GantryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GantryServiceBlockingStub(channel, callOptions);
        }
      };
    return GantryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GantryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GantryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GantryServiceFutureStub>() {
        @java.lang.Override
        public GantryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GantryServiceFutureStub(channel, callOptions);
        }
      };
    return GantryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An GantryService services all gantries associated with a robot
   * </pre>
   */
  public static abstract class GantryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetPosition gets the current position of a gantry of the underlying robot.
     * </pre>
     */
    public void getPosition(com.viam.component.gantry.v1.Gantry.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.GetPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * MoveToPosition moves a gantry of the underlying robot to the requested position.
     * </pre>
     */
    public void moveToPosition(com.viam.component.gantry.v1.Gantry.MoveToPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.MoveToPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveToPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLengths gets the lengths of a gantry of the underlying robot.
     * </pre>
     */
    public void getLengths(com.viam.component.gantry.v1.Gantry.GetLengthsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.GetLengthsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLengthsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's gantry
     * </pre>
     */
    public void stop(com.viam.component.gantry.v1.Gantry.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.StopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public void isMoving(com.viam.component.gantry.v1.Gantry.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.IsMovingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsMovingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPositionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.gantry.v1.Gantry.GetPositionRequest,
                com.viam.component.gantry.v1.Gantry.GetPositionResponse>(
                  this, METHODID_GET_POSITION)))
          .addMethod(
            getMoveToPositionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.gantry.v1.Gantry.MoveToPositionRequest,
                com.viam.component.gantry.v1.Gantry.MoveToPositionResponse>(
                  this, METHODID_MOVE_TO_POSITION)))
          .addMethod(
            getGetLengthsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.gantry.v1.Gantry.GetLengthsRequest,
                com.viam.component.gantry.v1.Gantry.GetLengthsResponse>(
                  this, METHODID_GET_LENGTHS)))
          .addMethod(
            getStopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.gantry.v1.Gantry.StopRequest,
                com.viam.component.gantry.v1.Gantry.StopResponse>(
                  this, METHODID_STOP)))
          .addMethod(
            getIsMovingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.gantry.v1.Gantry.IsMovingRequest,
                com.viam.component.gantry.v1.Gantry.IsMovingResponse>(
                  this, METHODID_IS_MOVING)))
          .build();
    }
  }

  /**
   * <pre>
   * An GantryService services all gantries associated with a robot
   * </pre>
   */
  public static final class GantryServiceStub extends io.grpc.stub.AbstractAsyncStub<GantryServiceStub> {
    private GantryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GantryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GantryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPosition gets the current position of a gantry of the underlying robot.
     * </pre>
     */
    public void getPosition(com.viam.component.gantry.v1.Gantry.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.GetPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MoveToPosition moves a gantry of the underlying robot to the requested position.
     * </pre>
     */
    public void moveToPosition(com.viam.component.gantry.v1.Gantry.MoveToPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.MoveToPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveToPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLengths gets the lengths of a gantry of the underlying robot.
     * </pre>
     */
    public void getLengths(com.viam.component.gantry.v1.Gantry.GetLengthsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.GetLengthsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLengthsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's gantry
     * </pre>
     */
    public void stop(com.viam.component.gantry.v1.Gantry.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.StopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public void isMoving(com.viam.component.gantry.v1.Gantry.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.IsMovingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsMovingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * An GantryService services all gantries associated with a robot
   * </pre>
   */
  public static final class GantryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GantryServiceBlockingStub> {
    private GantryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GantryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GantryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPosition gets the current position of a gantry of the underlying robot.
     * </pre>
     */
    public com.viam.component.gantry.v1.Gantry.GetPositionResponse getPosition(com.viam.component.gantry.v1.Gantry.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MoveToPosition moves a gantry of the underlying robot to the requested position.
     * </pre>
     */
    public com.viam.component.gantry.v1.Gantry.MoveToPositionResponse moveToPosition(com.viam.component.gantry.v1.Gantry.MoveToPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveToPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLengths gets the lengths of a gantry of the underlying robot.
     * </pre>
     */
    public com.viam.component.gantry.v1.Gantry.GetLengthsResponse getLengths(com.viam.component.gantry.v1.Gantry.GetLengthsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLengthsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop stops a robot's gantry
     * </pre>
     */
    public com.viam.component.gantry.v1.Gantry.StopResponse stop(com.viam.component.gantry.v1.Gantry.StopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public com.viam.component.gantry.v1.Gantry.IsMovingResponse isMoving(com.viam.component.gantry.v1.Gantry.IsMovingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsMovingMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * An GantryService services all gantries associated with a robot
   * </pre>
   */
  public static final class GantryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GantryServiceFutureStub> {
    private GantryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GantryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GantryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPosition gets the current position of a gantry of the underlying robot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.gantry.v1.Gantry.GetPositionResponse> getPosition(
        com.viam.component.gantry.v1.Gantry.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MoveToPosition moves a gantry of the underlying robot to the requested position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.gantry.v1.Gantry.MoveToPositionResponse> moveToPosition(
        com.viam.component.gantry.v1.Gantry.MoveToPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveToPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLengths gets the lengths of a gantry of the underlying robot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.gantry.v1.Gantry.GetLengthsResponse> getLengths(
        com.viam.component.gantry.v1.Gantry.GetLengthsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLengthsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop stops a robot's gantry
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.gantry.v1.Gantry.StopResponse> stop(
        com.viam.component.gantry.v1.Gantry.StopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.gantry.v1.Gantry.IsMovingResponse> isMoving(
        com.viam.component.gantry.v1.Gantry.IsMovingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsMovingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POSITION = 0;
  private static final int METHODID_MOVE_TO_POSITION = 1;
  private static final int METHODID_GET_LENGTHS = 2;
  private static final int METHODID_STOP = 3;
  private static final int METHODID_IS_MOVING = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GantryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GantryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POSITION:
          serviceImpl.getPosition((com.viam.component.gantry.v1.Gantry.GetPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.GetPositionResponse>) responseObserver);
          break;
        case METHODID_MOVE_TO_POSITION:
          serviceImpl.moveToPosition((com.viam.component.gantry.v1.Gantry.MoveToPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.MoveToPositionResponse>) responseObserver);
          break;
        case METHODID_GET_LENGTHS:
          serviceImpl.getLengths((com.viam.component.gantry.v1.Gantry.GetLengthsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.GetLengthsResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((com.viam.component.gantry.v1.Gantry.StopRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.StopResponse>) responseObserver);
          break;
        case METHODID_IS_MOVING:
          serviceImpl.isMoving((com.viam.component.gantry.v1.Gantry.IsMovingRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.IsMovingResponse>) responseObserver);
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

  private static abstract class GantryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GantryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.component.gantry.v1.Gantry.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GantryService");
    }
  }

  private static final class GantryServiceFileDescriptorSupplier
      extends GantryServiceBaseDescriptorSupplier {
    GantryServiceFileDescriptorSupplier() {}
  }

  private static final class GantryServiceMethodDescriptorSupplier
      extends GantryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GantryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GantryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GantryServiceFileDescriptorSupplier())
              .addMethod(getGetPositionMethod())
              .addMethod(getMoveToPositionMethod())
              .addMethod(getGetLengthsMethod())
              .addMethod(getStopMethod())
              .addMethod(getIsMovingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
