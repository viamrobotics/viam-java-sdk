package com.viam.rdk.proto.api.component.inputcontroller.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * InputControllerService servicestains all input controller associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/api/component/inputcontroller/v1/input_controller.proto")
public final class InputControllerServiceGrpc {

  private InputControllerServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.api.component.inputcontroller.v1.InputControllerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsRequest,
      com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsResponse> getGetControlsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetControls",
      requestType = com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsRequest.class,
      responseType = com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsRequest,
      com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsResponse> getGetControlsMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsRequest, com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsResponse> getGetControlsMethod;
    if ((getGetControlsMethod = InputControllerServiceGrpc.getGetControlsMethod) == null) {
      synchronized (InputControllerServiceGrpc.class) {
        if ((getGetControlsMethod = InputControllerServiceGrpc.getGetControlsMethod) == null) {
          InputControllerServiceGrpc.getGetControlsMethod = getGetControlsMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsRequest, com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetControls"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InputControllerServiceMethodDescriptorSupplier("GetControls"))
              .build();
        }
      }
    }
    return getGetControlsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsRequest,
      com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsResponse> getGetEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvents",
      requestType = com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsRequest.class,
      responseType = com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsRequest,
      com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsResponse> getGetEventsMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsRequest, com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsResponse> getGetEventsMethod;
    if ((getGetEventsMethod = InputControllerServiceGrpc.getGetEventsMethod) == null) {
      synchronized (InputControllerServiceGrpc.class) {
        if ((getGetEventsMethod = InputControllerServiceGrpc.getGetEventsMethod) == null) {
          InputControllerServiceGrpc.getGetEventsMethod = getGetEventsMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsRequest, com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InputControllerServiceMethodDescriptorSupplier("GetEvents"))
              .build();
        }
      }
    }
    return getGetEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsRequest,
      com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsResponse> getStreamEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamEvents",
      requestType = com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsRequest.class,
      responseType = com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsRequest,
      com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsResponse> getStreamEventsMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsRequest, com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsResponse> getStreamEventsMethod;
    if ((getStreamEventsMethod = InputControllerServiceGrpc.getStreamEventsMethod) == null) {
      synchronized (InputControllerServiceGrpc.class) {
        if ((getStreamEventsMethod = InputControllerServiceGrpc.getStreamEventsMethod) == null) {
          InputControllerServiceGrpc.getStreamEventsMethod = getStreamEventsMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsRequest, com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InputControllerServiceMethodDescriptorSupplier("StreamEvents"))
              .build();
        }
      }
    }
    return getStreamEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventRequest,
      com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventResponse> getTriggerEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerEvent",
      requestType = com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventRequest.class,
      responseType = com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventRequest,
      com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventResponse> getTriggerEventMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventRequest, com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventResponse> getTriggerEventMethod;
    if ((getTriggerEventMethod = InputControllerServiceGrpc.getTriggerEventMethod) == null) {
      synchronized (InputControllerServiceGrpc.class) {
        if ((getTriggerEventMethod = InputControllerServiceGrpc.getTriggerEventMethod) == null) {
          InputControllerServiceGrpc.getTriggerEventMethod = getTriggerEventMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventRequest, com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InputControllerServiceMethodDescriptorSupplier("TriggerEvent"))
              .build();
        }
      }
    }
    return getTriggerEventMethod;
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
  public static abstract class InputControllerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetControls returns a list of GetControls provided by the Controller
     * </pre>
     */
    public void getControls(com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetControlsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEvents returns a list of events representing the last event on each control of a give Input Controller
     * </pre>
     */
    public void getEvents(com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * StreamEvents starts a stream of InputControllerEvents for the given controls (buttons/axes) on a robot's input controller 
     * </pre>
     */
    public void streamEvents(com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TriggerEvent, where supported, injects an InputControllerEvent into an input controller to (virtually) generate events 
     * like button presses or axis movements  
     * </pre>
     */
    public void triggerEvent(com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTriggerEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetControlsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsRequest,
                com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsResponse>(
                  this, METHODID_GET_CONTROLS)))
          .addMethod(
            getGetEventsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsRequest,
                com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsResponse>(
                  this, METHODID_GET_EVENTS)))
          .addMethod(
            getStreamEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsRequest,
                com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsResponse>(
                  this, METHODID_STREAM_EVENTS)))
          .addMethod(
            getTriggerEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventRequest,
                com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventResponse>(
                  this, METHODID_TRIGGER_EVENT)))
          .build();
    }
  }

  /**
   * <pre>
   * InputControllerService servicestains all input controller associated with a robot
   * </pre>
   */
  public static final class InputControllerServiceStub extends io.grpc.stub.AbstractAsyncStub<InputControllerServiceStub> {
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
    public void getControls(com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetControlsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEvents returns a list of events representing the last event on each control of a give Input Controller
     * </pre>
     */
    public void getEvents(com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StreamEvents starts a stream of InputControllerEvents for the given controls (buttons/axes) on a robot's input controller 
     * </pre>
     */
    public void streamEvents(com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TriggerEvent, where supported, injects an InputControllerEvent into an input controller to (virtually) generate events 
     * like button presses or axis movements  
     * </pre>
     */
    public void triggerEvent(com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTriggerEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * InputControllerService servicestains all input controller associated with a robot
   * </pre>
   */
  public static final class InputControllerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<InputControllerServiceBlockingStub> {
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
    public com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsResponse getControls(com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetControlsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEvents returns a list of events representing the last event on each control of a give Input Controller
     * </pre>
     */
    public com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsResponse getEvents(com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StreamEvents starts a stream of InputControllerEvents for the given controls (buttons/axes) on a robot's input controller 
     * </pre>
     */
    public java.util.Iterator<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsResponse> streamEvents(
        com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TriggerEvent, where supported, injects an InputControllerEvent into an input controller to (virtually) generate events 
     * like button presses or axis movements  
     * </pre>
     */
    public com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventResponse triggerEvent(com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTriggerEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * InputControllerService servicestains all input controller associated with a robot
   * </pre>
   */
  public static final class InputControllerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<InputControllerServiceFutureStub> {
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
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsResponse> getControls(
        com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetControlsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEvents returns a list of events representing the last event on each control of a give Input Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsResponse> getEvents(
        com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TriggerEvent, where supported, injects an InputControllerEvent into an input controller to (virtually) generate events 
     * like button presses or axis movements  
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventResponse> triggerEvent(
        com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTriggerEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CONTROLS = 0;
  private static final int METHODID_GET_EVENTS = 1;
  private static final int METHODID_STREAM_EVENTS = 2;
  private static final int METHODID_TRIGGER_EVENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InputControllerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InputControllerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CONTROLS:
          serviceImpl.getControls((com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetControlsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS:
          serviceImpl.getEvents((com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.GetEventsResponse>) responseObserver);
          break;
        case METHODID_STREAM_EVENTS:
          serviceImpl.streamEvents((com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.StreamEventsResponse>) responseObserver);
          break;
        case METHODID_TRIGGER_EVENT:
          serviceImpl.triggerEvent((com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.TriggerEventResponse>) responseObserver);
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

  private static abstract class InputControllerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InputControllerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.rdk.proto.api.component.inputcontroller.v1.InputController.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InputControllerService");
    }
  }

  private static final class InputControllerServiceFileDescriptorSupplier
      extends InputControllerServiceBaseDescriptorSupplier {
    InputControllerServiceFileDescriptorSupplier() {}
  }

  private static final class InputControllerServiceMethodDescriptorSupplier
      extends InputControllerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InputControllerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InputControllerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InputControllerServiceFileDescriptorSupplier())
              .addMethod(getGetControlsMethod())
              .addMethod(getGetEventsMethod())
              .addMethod(getStreamEventsMethod())
              .addMethod(getTriggerEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
