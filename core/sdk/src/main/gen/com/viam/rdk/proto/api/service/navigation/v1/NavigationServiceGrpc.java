package com.viam.rdk.proto.api.service.navigation.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A NavigationService declares the gRPC contract for a Navigation service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/api/service/navigation/v1/navigation.proto")
public final class NavigationServiceGrpc {

  private NavigationServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.api.service.navigation.v1.NavigationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeRequest,
      com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeResponse> getGetModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMode",
      requestType = com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeRequest.class,
      responseType = com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeRequest,
      com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeResponse> getGetModeMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeRequest, com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeResponse> getGetModeMethod;
    if ((getGetModeMethod = NavigationServiceGrpc.getGetModeMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetModeMethod = NavigationServiceGrpc.getGetModeMethod) == null) {
          NavigationServiceGrpc.getGetModeMethod = getGetModeMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeRequest, com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("GetMode"))
              .build();
        }
      }
    }
    return getGetModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeRequest,
      com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeResponse> getSetModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMode",
      requestType = com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeRequest.class,
      responseType = com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeRequest,
      com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeResponse> getSetModeMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeRequest, com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeResponse> getSetModeMethod;
    if ((getSetModeMethod = NavigationServiceGrpc.getSetModeMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getSetModeMethod = NavigationServiceGrpc.getSetModeMethod) == null) {
          NavigationServiceGrpc.getSetModeMethod = getSetModeMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeRequest, com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("SetMode"))
              .build();
        }
      }
    }
    return getSetModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationRequest,
      com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationResponse> getGetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocation",
      requestType = com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationRequest.class,
      responseType = com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationRequest,
      com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationResponse> getGetLocationMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationRequest, com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationResponse> getGetLocationMethod;
    if ((getGetLocationMethod = NavigationServiceGrpc.getGetLocationMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetLocationMethod = NavigationServiceGrpc.getGetLocationMethod) == null) {
          NavigationServiceGrpc.getGetLocationMethod = getGetLocationMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationRequest, com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("GetLocation"))
              .build();
        }
      }
    }
    return getGetLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsRequest,
      com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsResponse> getGetWaypointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaypoints",
      requestType = com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsRequest.class,
      responseType = com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsRequest,
      com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsResponse> getGetWaypointsMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsRequest, com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsResponse> getGetWaypointsMethod;
    if ((getGetWaypointsMethod = NavigationServiceGrpc.getGetWaypointsMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetWaypointsMethod = NavigationServiceGrpc.getGetWaypointsMethod) == null) {
          NavigationServiceGrpc.getGetWaypointsMethod = getGetWaypointsMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsRequest, com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWaypoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("GetWaypoints"))
              .build();
        }
      }
    }
    return getGetWaypointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointRequest,
      com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointResponse> getAddWaypointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddWaypoint",
      requestType = com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointRequest.class,
      responseType = com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointRequest,
      com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointResponse> getAddWaypointMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointRequest, com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointResponse> getAddWaypointMethod;
    if ((getAddWaypointMethod = NavigationServiceGrpc.getAddWaypointMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getAddWaypointMethod = NavigationServiceGrpc.getAddWaypointMethod) == null) {
          NavigationServiceGrpc.getAddWaypointMethod = getAddWaypointMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointRequest, com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddWaypoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("AddWaypoint"))
              .build();
        }
      }
    }
    return getAddWaypointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointRequest,
      com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointResponse> getRemoveWaypointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveWaypoint",
      requestType = com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointRequest.class,
      responseType = com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointRequest,
      com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointResponse> getRemoveWaypointMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointRequest, com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointResponse> getRemoveWaypointMethod;
    if ((getRemoveWaypointMethod = NavigationServiceGrpc.getRemoveWaypointMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getRemoveWaypointMethod = NavigationServiceGrpc.getRemoveWaypointMethod) == null) {
          NavigationServiceGrpc.getRemoveWaypointMethod = getRemoveWaypointMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointRequest, com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveWaypoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("RemoveWaypoint"))
              .build();
        }
      }
    }
    return getRemoveWaypointMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NavigationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NavigationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NavigationServiceStub>() {
        @java.lang.Override
        public NavigationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NavigationServiceStub(channel, callOptions);
        }
      };
    return NavigationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NavigationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NavigationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NavigationServiceBlockingStub>() {
        @java.lang.Override
        public NavigationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NavigationServiceBlockingStub(channel, callOptions);
        }
      };
    return NavigationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NavigationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NavigationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NavigationServiceFutureStub>() {
        @java.lang.Override
        public NavigationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NavigationServiceFutureStub(channel, callOptions);
        }
      };
    return NavigationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service
   * </pre>
   */
  public static abstract class NavigationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMode(com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModeMethod(), responseObserver);
    }

    /**
     */
    public void setMode(com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetModeMethod(), responseObserver);
    }

    /**
     */
    public void getLocation(com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationMethod(), responseObserver);
    }

    /**
     */
    public void getWaypoints(com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWaypointsMethod(), responseObserver);
    }

    /**
     */
    public void addWaypoint(com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddWaypointMethod(), responseObserver);
    }

    /**
     */
    public void removeWaypoint(com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveWaypointMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetModeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeRequest,
                com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeResponse>(
                  this, METHODID_GET_MODE)))
          .addMethod(
            getSetModeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeRequest,
                com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeResponse>(
                  this, METHODID_SET_MODE)))
          .addMethod(
            getGetLocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationRequest,
                com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationResponse>(
                  this, METHODID_GET_LOCATION)))
          .addMethod(
            getGetWaypointsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsRequest,
                com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsResponse>(
                  this, METHODID_GET_WAYPOINTS)))
          .addMethod(
            getAddWaypointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointRequest,
                com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointResponse>(
                  this, METHODID_ADD_WAYPOINT)))
          .addMethod(
            getRemoveWaypointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointRequest,
                com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointResponse>(
                  this, METHODID_REMOVE_WAYPOINT)))
          .build();
    }
  }

  /**
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service
   * </pre>
   */
  public static final class NavigationServiceStub extends io.grpc.stub.AbstractAsyncStub<NavigationServiceStub> {
    private NavigationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavigationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NavigationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getMode(com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setMode(com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocation(com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWaypoints(com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWaypointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addWaypoint(com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddWaypointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeWaypoint(com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveWaypointMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service
   * </pre>
   */
  public static final class NavigationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NavigationServiceBlockingStub> {
    private NavigationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavigationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NavigationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeResponse getMode(com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeResponse setMode(com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetModeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationResponse getLocation(com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsResponse getWaypoints(com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWaypointsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointResponse addWaypoint(com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddWaypointMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointResponse removeWaypoint(com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveWaypointMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service
   * </pre>
   */
  public static final class NavigationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NavigationServiceFutureStub> {
    private NavigationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavigationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NavigationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeResponse> getMode(
        com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeResponse> setMode(
        com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetModeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationResponse> getLocation(
        com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsResponse> getWaypoints(
        com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWaypointsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointResponse> addWaypoint(
        com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddWaypointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointResponse> removeWaypoint(
        com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveWaypointMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MODE = 0;
  private static final int METHODID_SET_MODE = 1;
  private static final int METHODID_GET_LOCATION = 2;
  private static final int METHODID_GET_WAYPOINTS = 3;
  private static final int METHODID_ADD_WAYPOINT = 4;
  private static final int METHODID_REMOVE_WAYPOINT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NavigationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NavigationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MODE:
          serviceImpl.getMode((com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetModeResponse>) responseObserver);
          break;
        case METHODID_SET_MODE:
          serviceImpl.setMode((com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.SetModeResponse>) responseObserver);
          break;
        case METHODID_GET_LOCATION:
          serviceImpl.getLocation((com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetLocationResponse>) responseObserver);
          break;
        case METHODID_GET_WAYPOINTS:
          serviceImpl.getWaypoints((com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.GetWaypointsResponse>) responseObserver);
          break;
        case METHODID_ADD_WAYPOINT:
          serviceImpl.addWaypoint((com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.AddWaypointResponse>) responseObserver);
          break;
        case METHODID_REMOVE_WAYPOINT:
          serviceImpl.removeWaypoint((com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.navigation.v1.Navigation.RemoveWaypointResponse>) responseObserver);
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

  private static abstract class NavigationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NavigationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.rdk.proto.api.service.navigation.v1.Navigation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NavigationService");
    }
  }

  private static final class NavigationServiceFileDescriptorSupplier
      extends NavigationServiceBaseDescriptorSupplier {
    NavigationServiceFileDescriptorSupplier() {}
  }

  private static final class NavigationServiceMethodDescriptorSupplier
      extends NavigationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NavigationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NavigationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NavigationServiceFileDescriptorSupplier())
              .addMethod(getGetModeMethod())
              .addMethod(getSetModeMethod())
              .addMethod(getGetLocationMethod())
              .addMethod(getGetWaypointsMethod())
              .addMethod(getAddWaypointMethod())
              .addMethod(getRemoveWaypointMethod())
              .build();
        }
      }
    }
    return result;
  }
}
