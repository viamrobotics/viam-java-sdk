package com.viam.component.inputcontroller.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * InputControllerService servicestains all input controller associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: component/inputcontroller/v1/input_controller.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InputControllerServiceGrpc {

  private InputControllerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.inputcontroller.v1.InputControllerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.inputcontroller.v1.InputController.GetControlsRequest,
      com.viam.component.inputcontroller.v1.InputController.GetControlsResponse> getGetControlsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetControls",
      requestType = com.viam.component.inputcontroller.v1.InputController.GetControlsRequest.class,
      responseType = com.viam.component.inputcontroller.v1.InputController.GetControlsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.inputcontroller.v1.InputController.GetControlsRequest,
      com.viam.component.inputcontroller.v1.InputController.GetControlsResponse> getGetControlsMethod() {
    io.grpc.MethodDescriptor<com.viam.component.inputcontroller.v1.InputController.GetControlsRequest, com.viam.component.inputcontroller.v1.InputController.GetControlsResponse> getGetControlsMethod;
    if ((getGetControlsMethod = InputControllerServiceGrpc.getGetControlsMethod) == null) {
      synchronized (InputControllerServiceGrpc.class) {
        if ((getGetControlsMethod = InputControllerServiceGrpc.getGetControlsMethod) == null) {
          InputControllerServiceGrpc.getGetControlsMethod = getGetControlsMethod =
              io.grpc.MethodDescriptor.<com.viam.component.inputcontroller.v1.InputController.GetControlsRequest, com.viam.component.inputcontroller.v1.InputController.GetControlsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetControls"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.inputcontroller.v1.InputController.GetControlsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.inputcontroller.v1.InputController.GetControlsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetControlsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.inputcontroller.v1.InputController.GetEventsRequest,
      com.viam.component.inputcontroller.v1.InputController.GetEventsResponse> getGetEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvents",
      requestType = com.viam.component.inputcontroller.v1.InputController.GetEventsRequest.class,
      responseType = com.viam.component.inputcontroller.v1.InputController.GetEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.inputcontroller.v1.InputController.GetEventsRequest,
      com.viam.component.inputcontroller.v1.InputController.GetEventsResponse> getGetEventsMethod() {
    io.grpc.MethodDescriptor<com.viam.component.inputcontroller.v1.InputController.GetEventsRequest, com.viam.component.inputcontroller.v1.InputController.GetEventsResponse> getGetEventsMethod;
    if ((getGetEventsMethod = InputControllerServiceGrpc.getGetEventsMethod) == null) {
      synchronized (InputControllerServiceGrpc.class) {
        if ((getGetEventsMethod = InputControllerServiceGrpc.getGetEventsMethod) == null) {
          InputControllerServiceGrpc.getGetEventsMethod = getGetEventsMethod =
              io.grpc.MethodDescriptor.<com.viam.component.inputcontroller.v1.InputController.GetEventsRequest, com.viam.component.inputcontroller.v1.InputController.GetEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.inputcontroller.v1.InputController.GetEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.inputcontroller.v1.InputController.GetEventsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.inputcontroller.v1.InputController.StreamEventsRequest,
      com.viam.component.inputcontroller.v1.InputController.StreamEventsResponse> getStreamEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamEvents",
      requestType = com.viam.component.inputcontroller.v1.InputController.StreamEventsRequest.class,
      responseType = com.viam.component.inputcontroller.v1.InputController.StreamEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.viam.component.inputcontroller.v1.InputController.StreamEventsRequest,
      com.viam.component.inputcontroller.v1.InputController.StreamEventsResponse> getStreamEventsMethod() {
    io.grpc.MethodDescriptor<com.viam.component.inputcontroller.v1.InputController.StreamEventsRequest, com.viam.component.inputcontroller.v1.InputController.StreamEventsResponse> getStreamEventsMethod;
    if ((getStreamEventsMethod = InputControllerServiceGrpc.getStreamEventsMethod) == null) {
      synchronized (InputControllerServiceGrpc.class) {
        if ((getStreamEventsMethod = InputControllerServiceGrpc.getStreamEventsMethod) == null) {
          InputControllerServiceGrpc.getStreamEventsMethod = getStreamEventsMethod =
              io.grpc.MethodDescriptor.<com.viam.component.inputcontroller.v1.InputController.StreamEventsRequest, com.viam.component.inputcontroller.v1.InputController.StreamEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.inputcontroller.v1.InputController.StreamEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.inputcontroller.v1.InputController.StreamEventsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStreamEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.inputcontroller.v1.InputController.TriggerEventRequest,
      com.viam.component.inputcontroller.v1.InputController.TriggerEventResponse> getTriggerEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerEvent",
      requestType = com.viam.component.inputcontroller.v1.InputController.TriggerEventRequest.class,
      responseType = com.viam.component.inputcontroller.v1.InputController.TriggerEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.inputcontroller.v1.InputController.TriggerEventRequest,
      com.viam.component.inputcontroller.v1.InputController.TriggerEventResponse> getTriggerEventMethod() {
    io.grpc.MethodDescriptor<com.viam.component.inputcontroller.v1.InputController.TriggerEventRequest, com.viam.component.inputcontroller.v1.InputController.TriggerEventResponse> getTriggerEventMethod;
    if ((getTriggerEventMethod = InputControllerServiceGrpc.getTriggerEventMethod) == null) {
      synchronized (InputControllerServiceGrpc.class) {
        if ((getTriggerEventMethod = InputControllerServiceGrpc.getTriggerEventMethod) == null) {
          InputControllerServiceGrpc.getTriggerEventMethod = getTriggerEventMethod =
              io.grpc.MethodDescriptor.<com.viam.component.inputcontroller.v1.InputController.TriggerEventRequest, com.viam.component.inputcontroller.v1.InputController.TriggerEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.inputcontroller.v1.InputController.TriggerEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.inputcontroller.v1.InputController.TriggerEventResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTriggerEventMethod;
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
    if ((getDoCommandMethod = InputControllerServiceGrpc.getDoCommandMethod) == null) {
      synchronized (InputControllerServiceGrpc.class) {
        if ((getDoCommandMethod = InputControllerServiceGrpc.getDoCommandMethod) == null) {
          InputControllerServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetGeometriesRequest,
      com.viam.common.v1.Common.GetGeometriesResponse> getGetGeometriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGeometries",
      requestType = com.viam.common.v1.Common.GetGeometriesRequest.class,
      responseType = com.viam.common.v1.Common.GetGeometriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetGeometriesRequest,
      com.viam.common.v1.Common.GetGeometriesResponse> getGetGeometriesMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetGeometriesRequest, com.viam.common.v1.Common.GetGeometriesResponse> getGetGeometriesMethod;
    if ((getGetGeometriesMethod = InputControllerServiceGrpc.getGetGeometriesMethod) == null) {
      synchronized (InputControllerServiceGrpc.class) {
        if ((getGetGeometriesMethod = InputControllerServiceGrpc.getGetGeometriesMethod) == null) {
          InputControllerServiceGrpc.getGetGeometriesMethod = getGetGeometriesMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.GetGeometriesRequest, com.viam.common.v1.Common.GetGeometriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGeometries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetGeometriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetGeometriesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetGeometriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InputControllerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InputControllerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InputControllerServiceStub>() {
        @java.lang.Override
        public InputControllerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InputControllerServiceStub(channel, callOptions);
        }
      };
    return InputControllerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InputControllerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InputControllerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InputControllerServiceBlockingStub>() {
        @java.lang.Override
        public InputControllerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InputControllerServiceBlockingStub(channel, callOptions);
        }
      };
    return InputControllerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InputControllerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InputControllerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InputControllerServiceFutureStub>() {
        @java.lang.Override
        public InputControllerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InputControllerServiceFutureStub(channel, callOptions);
        }
      };
    return InputControllerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * InputControllerService servicestains all input controller associated with a robot
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetControls returns a list of GetControls provided by the Controller
     * </pre>
     */
    default void getControls(com.viam.component.inputcontroller.v1.InputController.GetControlsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.inputcontroller.v1.InputController.GetControlsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetControlsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEvents returns a list of events representing the last event on each control of a give Input Controller
     * </pre>
     */
    default void getEvents(com.viam.component.inputcontroller.v1.InputController.GetEventsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.inputcontroller.v1.InputController.GetEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * StreamEvents starts a stream of InputControllerEvents for the given controls (buttons/axes) on a robot's input controller
     * </pre>
     */
    default void streamEvents(com.viam.component.inputcontroller.v1.InputController.StreamEventsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.inputcontroller.v1.InputController.StreamEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TriggerEvent, where supported, injects an InputControllerEvent into an input controller to (virtually) generate events
     * like button presses or axis movements
     * </pre>
     */
    default void triggerEvent(com.viam.component.inputcontroller.v1.InputController.TriggerEventRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.inputcontroller.v1.InputController.TriggerEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTriggerEventMethod(), responseObserver);
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

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    default void getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGeometriesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InputControllerService.
   * <pre>
   * InputControllerService servicestains all input controller associated with a robot
   * </pre>
   */
  public static abstract class InputControllerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InputControllerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InputControllerService.
   * <pre>
   * InputControllerService servicestains all input controller associated with a robot
   * </pre>
   */
  public static final class InputControllerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InputControllerServiceStub> {
    private InputControllerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InputControllerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InputControllerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetControls returns a list of GetControls provided by the Controller
     * </pre>
     */
    public void getControls(com.viam.component.inputcontroller.v1.InputController.GetControlsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.inputcontroller.v1.InputController.GetControlsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetControlsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEvents returns a list of events representing the last event on each control of a give Input Controller
     * </pre>
     */
    public void getEvents(com.viam.component.inputcontroller.v1.InputController.GetEventsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.inputcontroller.v1.InputController.GetEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StreamEvents starts a stream of InputControllerEvents for the given controls (buttons/axes) on a robot's input controller
     * </pre>
     */
    public void streamEvents(com.viam.component.inputcontroller.v1.InputController.StreamEventsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.inputcontroller.v1.InputController.StreamEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TriggerEvent, where supported, injects an InputControllerEvent into an input controller to (virtually) generate events
     * like button presses or axis movements
     * </pre>
     */
    public void triggerEvent(com.viam.component.inputcontroller.v1.InputController.TriggerEventRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.inputcontroller.v1.InputController.TriggerEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTriggerEventMethod(), getCallOptions()), request, responseObserver);
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

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    public void getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGeometriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InputControllerService.
   * <pre>
   * InputControllerService servicestains all input controller associated with a robot
   * </pre>
   */
  public static final class InputControllerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InputControllerServiceBlockingStub> {
    private InputControllerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InputControllerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InputControllerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetControls returns a list of GetControls provided by the Controller
     * </pre>
     */
    public com.viam.component.inputcontroller.v1.InputController.GetControlsResponse getControls(com.viam.component.inputcontroller.v1.InputController.GetControlsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetControlsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEvents returns a list of events representing the last event on each control of a give Input Controller
     * </pre>
     */
    public com.viam.component.inputcontroller.v1.InputController.GetEventsResponse getEvents(com.viam.component.inputcontroller.v1.InputController.GetEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StreamEvents starts a stream of InputControllerEvents for the given controls (buttons/axes) on a robot's input controller
     * </pre>
     */
    public java.util.Iterator<com.viam.component.inputcontroller.v1.InputController.StreamEventsResponse> streamEvents(
        com.viam.component.inputcontroller.v1.InputController.StreamEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TriggerEvent, where supported, injects an InputControllerEvent into an input controller to (virtually) generate events
     * like button presses or axis movements
     * </pre>
     */
    public com.viam.component.inputcontroller.v1.InputController.TriggerEventResponse triggerEvent(com.viam.component.inputcontroller.v1.InputController.TriggerEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTriggerEventMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    public com.viam.common.v1.Common.GetGeometriesResponse getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGeometriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InputControllerService.
   * <pre>
   * InputControllerService servicestains all input controller associated with a robot
   * </pre>
   */
  public static final class InputControllerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InputControllerServiceFutureStub> {
    private InputControllerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InputControllerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InputControllerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetControls returns a list of GetControls provided by the Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.inputcontroller.v1.InputController.GetControlsResponse> getControls(
        com.viam.component.inputcontroller.v1.InputController.GetControlsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetControlsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEvents returns a list of events representing the last event on each control of a give Input Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.inputcontroller.v1.InputController.GetEventsResponse> getEvents(
        com.viam.component.inputcontroller.v1.InputController.GetEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TriggerEvent, where supported, injects an InputControllerEvent into an input controller to (virtually) generate events
     * like button presses or axis movements
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.inputcontroller.v1.InputController.TriggerEventResponse> triggerEvent(
        com.viam.component.inputcontroller.v1.InputController.TriggerEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTriggerEventMethod(), getCallOptions()), request);
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

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.GetGeometriesResponse> getGeometries(
        com.viam.common.v1.Common.GetGeometriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGeometriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CONTROLS = 0;
  private static final int METHODID_GET_EVENTS = 1;
  private static final int METHODID_STREAM_EVENTS = 2;
  private static final int METHODID_TRIGGER_EVENT = 3;
  private static final int METHODID_DO_COMMAND = 4;
  private static final int METHODID_GET_GEOMETRIES = 5;

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
        case METHODID_GET_CONTROLS:
          serviceImpl.getControls((com.viam.component.inputcontroller.v1.InputController.GetControlsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.inputcontroller.v1.InputController.GetControlsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS:
          serviceImpl.getEvents((com.viam.component.inputcontroller.v1.InputController.GetEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.inputcontroller.v1.InputController.GetEventsResponse>) responseObserver);
          break;
        case METHODID_STREAM_EVENTS:
          serviceImpl.streamEvents((com.viam.component.inputcontroller.v1.InputController.StreamEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.inputcontroller.v1.InputController.StreamEventsResponse>) responseObserver);
          break;
        case METHODID_TRIGGER_EVENT:
          serviceImpl.triggerEvent((com.viam.component.inputcontroller.v1.InputController.TriggerEventRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.inputcontroller.v1.InputController.TriggerEventResponse>) responseObserver);
          break;
        case METHODID_DO_COMMAND:
          serviceImpl.doCommand((com.viam.common.v1.Common.DoCommandRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse>) responseObserver);
          break;
        case METHODID_GET_GEOMETRIES:
          serviceImpl.getGeometries((com.viam.common.v1.Common.GetGeometriesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse>) responseObserver);
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
          getGetControlsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.inputcontroller.v1.InputController.GetControlsRequest,
              com.viam.component.inputcontroller.v1.InputController.GetControlsResponse>(
                service, METHODID_GET_CONTROLS)))
        .addMethod(
          getGetEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.inputcontroller.v1.InputController.GetEventsRequest,
              com.viam.component.inputcontroller.v1.InputController.GetEventsResponse>(
                service, METHODID_GET_EVENTS)))
        .addMethod(
          getStreamEventsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.viam.component.inputcontroller.v1.InputController.StreamEventsRequest,
              com.viam.component.inputcontroller.v1.InputController.StreamEventsResponse>(
                service, METHODID_STREAM_EVENTS)))
        .addMethod(
          getTriggerEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.inputcontroller.v1.InputController.TriggerEventRequest,
              com.viam.component.inputcontroller.v1.InputController.TriggerEventResponse>(
                service, METHODID_TRIGGER_EVENT)))
        .addMethod(
          getDoCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.DoCommandRequest,
              com.viam.common.v1.Common.DoCommandResponse>(
                service, METHODID_DO_COMMAND)))
        .addMethod(
          getGetGeometriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.GetGeometriesRequest,
              com.viam.common.v1.Common.GetGeometriesResponse>(
                service, METHODID_GET_GEOMETRIES)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InputControllerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetControlsMethod())
              .addMethod(getGetEventsMethod())
              .addMethod(getStreamEventsMethod())
              .addMethod(getTriggerEventMethod())
              .addMethod(getDoCommandMethod())
              .addMethod(getGetGeometriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
