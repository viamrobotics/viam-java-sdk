package com.viam.service.navigation.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A NavigationService declares the gRPC contract for a Navigation service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: service/navigation/v1/navigation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NavigationServiceGrpc {

  private NavigationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.service.navigation.v1.NavigationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetModeRequest,
      com.viam.service.navigation.v1.Navigation.GetModeResponse> getGetModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMode",
      requestType = com.viam.service.navigation.v1.Navigation.GetModeRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GetModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetModeRequest,
      com.viam.service.navigation.v1.Navigation.GetModeResponse> getGetModeMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetModeRequest, com.viam.service.navigation.v1.Navigation.GetModeResponse> getGetModeMethod;
    if ((getGetModeMethod = NavigationServiceGrpc.getGetModeMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetModeMethod = NavigationServiceGrpc.getGetModeMethod) == null) {
          NavigationServiceGrpc.getGetModeMethod = getGetModeMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GetModeRequest, com.viam.service.navigation.v1.Navigation.GetModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetModeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("GetMode"))
              .build();
        }
      }
    }
    return getGetModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.SetModeRequest,
      com.viam.service.navigation.v1.Navigation.SetModeResponse> getSetModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMode",
      requestType = com.viam.service.navigation.v1.Navigation.SetModeRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.SetModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.SetModeRequest,
      com.viam.service.navigation.v1.Navigation.SetModeResponse> getSetModeMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.SetModeRequest, com.viam.service.navigation.v1.Navigation.SetModeResponse> getSetModeMethod;
    if ((getSetModeMethod = NavigationServiceGrpc.getSetModeMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getSetModeMethod = NavigationServiceGrpc.getSetModeMethod) == null) {
          NavigationServiceGrpc.getSetModeMethod = getSetModeMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.SetModeRequest, com.viam.service.navigation.v1.Navigation.SetModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.SetModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.SetModeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("SetMode"))
              .build();
        }
      }
    }
    return getSetModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetLocationRequest,
      com.viam.service.navigation.v1.Navigation.GetLocationResponse> getGetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocation",
      requestType = com.viam.service.navigation.v1.Navigation.GetLocationRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GetLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetLocationRequest,
      com.viam.service.navigation.v1.Navigation.GetLocationResponse> getGetLocationMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetLocationRequest, com.viam.service.navigation.v1.Navigation.GetLocationResponse> getGetLocationMethod;
    if ((getGetLocationMethod = NavigationServiceGrpc.getGetLocationMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetLocationMethod = NavigationServiceGrpc.getGetLocationMethod) == null) {
          NavigationServiceGrpc.getGetLocationMethod = getGetLocationMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GetLocationRequest, com.viam.service.navigation.v1.Navigation.GetLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetLocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("GetLocation"))
              .build();
        }
      }
    }
    return getGetLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetWaypointsRequest,
      com.viam.service.navigation.v1.Navigation.GetWaypointsResponse> getGetWaypointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaypoints",
      requestType = com.viam.service.navigation.v1.Navigation.GetWaypointsRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GetWaypointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetWaypointsRequest,
      com.viam.service.navigation.v1.Navigation.GetWaypointsResponse> getGetWaypointsMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetWaypointsRequest, com.viam.service.navigation.v1.Navigation.GetWaypointsResponse> getGetWaypointsMethod;
    if ((getGetWaypointsMethod = NavigationServiceGrpc.getGetWaypointsMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetWaypointsMethod = NavigationServiceGrpc.getGetWaypointsMethod) == null) {
          NavigationServiceGrpc.getGetWaypointsMethod = getGetWaypointsMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GetWaypointsRequest, com.viam.service.navigation.v1.Navigation.GetWaypointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWaypoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetWaypointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetWaypointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("GetWaypoints"))
              .build();
        }
      }
    }
    return getGetWaypointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.AddWaypointRequest,
      com.viam.service.navigation.v1.Navigation.AddWaypointResponse> getAddWaypointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddWaypoint",
      requestType = com.viam.service.navigation.v1.Navigation.AddWaypointRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.AddWaypointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.AddWaypointRequest,
      com.viam.service.navigation.v1.Navigation.AddWaypointResponse> getAddWaypointMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.AddWaypointRequest, com.viam.service.navigation.v1.Navigation.AddWaypointResponse> getAddWaypointMethod;
    if ((getAddWaypointMethod = NavigationServiceGrpc.getAddWaypointMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getAddWaypointMethod = NavigationServiceGrpc.getAddWaypointMethod) == null) {
          NavigationServiceGrpc.getAddWaypointMethod = getAddWaypointMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.AddWaypointRequest, com.viam.service.navigation.v1.Navigation.AddWaypointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddWaypoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.AddWaypointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.AddWaypointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("AddWaypoint"))
              .build();
        }
      }
    }
    return getAddWaypointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.RemoveWaypointRequest,
      com.viam.service.navigation.v1.Navigation.RemoveWaypointResponse> getRemoveWaypointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveWaypoint",
      requestType = com.viam.service.navigation.v1.Navigation.RemoveWaypointRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.RemoveWaypointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.RemoveWaypointRequest,
      com.viam.service.navigation.v1.Navigation.RemoveWaypointResponse> getRemoveWaypointMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.RemoveWaypointRequest, com.viam.service.navigation.v1.Navigation.RemoveWaypointResponse> getRemoveWaypointMethod;
    if ((getRemoveWaypointMethod = NavigationServiceGrpc.getRemoveWaypointMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getRemoveWaypointMethod = NavigationServiceGrpc.getRemoveWaypointMethod) == null) {
          NavigationServiceGrpc.getRemoveWaypointMethod = getRemoveWaypointMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.RemoveWaypointRequest, com.viam.service.navigation.v1.Navigation.RemoveWaypointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveWaypoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.RemoveWaypointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.RemoveWaypointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("RemoveWaypoint"))
              .build();
        }
      }
    }
    return getRemoveWaypointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetObstaclesRequest,
      com.viam.service.navigation.v1.Navigation.GetObstaclesResponse> getGetObstaclesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObstacles",
      requestType = com.viam.service.navigation.v1.Navigation.GetObstaclesRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GetObstaclesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetObstaclesRequest,
      com.viam.service.navigation.v1.Navigation.GetObstaclesResponse> getGetObstaclesMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetObstaclesRequest, com.viam.service.navigation.v1.Navigation.GetObstaclesResponse> getGetObstaclesMethod;
    if ((getGetObstaclesMethod = NavigationServiceGrpc.getGetObstaclesMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetObstaclesMethod = NavigationServiceGrpc.getGetObstaclesMethod) == null) {
          NavigationServiceGrpc.getGetObstaclesMethod = getGetObstaclesMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GetObstaclesRequest, com.viam.service.navigation.v1.Navigation.GetObstaclesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObstacles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetObstaclesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetObstaclesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("GetObstacles"))
              .build();
        }
      }
    }
    return getGetObstaclesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetPathsRequest,
      com.viam.service.navigation.v1.Navigation.GetPathsResponse> getGetPathsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaths",
      requestType = com.viam.service.navigation.v1.Navigation.GetPathsRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GetPathsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetPathsRequest,
      com.viam.service.navigation.v1.Navigation.GetPathsResponse> getGetPathsMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetPathsRequest, com.viam.service.navigation.v1.Navigation.GetPathsResponse> getGetPathsMethod;
    if ((getGetPathsMethod = NavigationServiceGrpc.getGetPathsMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetPathsMethod = NavigationServiceGrpc.getGetPathsMethod) == null) {
          NavigationServiceGrpc.getGetPathsMethod = getGetPathsMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GetPathsRequest, com.viam.service.navigation.v1.Navigation.GetPathsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaths"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetPathsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetPathsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("GetPaths"))
              .build();
        }
      }
    }
    return getGetPathsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetPropertiesRequest,
      com.viam.service.navigation.v1.Navigation.GetPropertiesResponse> getGetPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProperties",
      requestType = com.viam.service.navigation.v1.Navigation.GetPropertiesRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GetPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetPropertiesRequest,
      com.viam.service.navigation.v1.Navigation.GetPropertiesResponse> getGetPropertiesMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetPropertiesRequest, com.viam.service.navigation.v1.Navigation.GetPropertiesResponse> getGetPropertiesMethod;
    if ((getGetPropertiesMethod = NavigationServiceGrpc.getGetPropertiesMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetPropertiesMethod = NavigationServiceGrpc.getGetPropertiesMethod) == null) {
          NavigationServiceGrpc.getGetPropertiesMethod = getGetPropertiesMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GetPropertiesRequest, com.viam.service.navigation.v1.Navigation.GetPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetPropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetPropertiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("GetProperties"))
              .build();
        }
      }
    }
    return getGetPropertiesMethod;
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
    if ((getDoCommandMethod = NavigationServiceGrpc.getDoCommandMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getDoCommandMethod = NavigationServiceGrpc.getDoCommandMethod) == null) {
          NavigationServiceGrpc.getDoCommandMethod = getDoCommandMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.DoCommandRequest, com.viam.common.v1.Common.DoCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigationServiceMethodDescriptorSupplier("DoCommand"))
              .build();
        }
      }
    }
    return getDoCommandMethod;
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
  public interface AsyncService {

    /**
     */
    default void getMode(com.viam.service.navigation.v1.Navigation.GetModeRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModeMethod(), responseObserver);
    }

    /**
     */
    default void setMode(com.viam.service.navigation.v1.Navigation.SetModeRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.SetModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetModeMethod(), responseObserver);
    }

    /**
     */
    default void getLocation(com.viam.service.navigation.v1.Navigation.GetLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationMethod(), responseObserver);
    }

    /**
     */
    default void getWaypoints(com.viam.service.navigation.v1.Navigation.GetWaypointsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetWaypointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWaypointsMethod(), responseObserver);
    }

    /**
     */
    default void addWaypoint(com.viam.service.navigation.v1.Navigation.AddWaypointRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.AddWaypointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddWaypointMethod(), responseObserver);
    }

    /**
     */
    default void removeWaypoint(com.viam.service.navigation.v1.Navigation.RemoveWaypointRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.RemoveWaypointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveWaypointMethod(), responseObserver);
    }

    /**
     */
    default void getObstacles(com.viam.service.navigation.v1.Navigation.GetObstaclesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetObstaclesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObstaclesMethod(), responseObserver);
    }

    /**
     */
    default void getPaths(com.viam.service.navigation.v1.Navigation.GetPathsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetPathsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPathsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProperties returns properties of the current navigation service, including the
     * map_type being operated on.
     * </pre>
     */
    default void getProperties(com.viam.service.navigation.v1.Navigation.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPropertiesMethod(), responseObserver);
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
   * Base class for the server implementation of the service NavigationService.
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service
   * </pre>
   */
  public static abstract class NavigationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NavigationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NavigationService.
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service
   * </pre>
   */
  public static final class NavigationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<NavigationServiceStub> {
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
    public void getMode(com.viam.service.navigation.v1.Navigation.GetModeRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setMode(com.viam.service.navigation.v1.Navigation.SetModeRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.SetModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocation(com.viam.service.navigation.v1.Navigation.GetLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWaypoints(com.viam.service.navigation.v1.Navigation.GetWaypointsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetWaypointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWaypointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addWaypoint(com.viam.service.navigation.v1.Navigation.AddWaypointRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.AddWaypointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddWaypointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeWaypoint(com.viam.service.navigation.v1.Navigation.RemoveWaypointRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.RemoveWaypointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveWaypointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObstacles(com.viam.service.navigation.v1.Navigation.GetObstaclesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetObstaclesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObstaclesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaths(com.viam.service.navigation.v1.Navigation.GetPathsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetPathsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPathsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProperties returns properties of the current navigation service, including the
     * map_type being operated on.
     * </pre>
     */
    public void getProperties(com.viam.service.navigation.v1.Navigation.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request, responseObserver);
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
   * A stub to allow clients to do synchronous rpc calls to service NavigationService.
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service
   * </pre>
   */
  public static final class NavigationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NavigationServiceBlockingStub> {
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
    public com.viam.service.navigation.v1.Navigation.GetModeResponse getMode(com.viam.service.navigation.v1.Navigation.GetModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.service.navigation.v1.Navigation.SetModeResponse setMode(com.viam.service.navigation.v1.Navigation.SetModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetModeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.service.navigation.v1.Navigation.GetLocationResponse getLocation(com.viam.service.navigation.v1.Navigation.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.service.navigation.v1.Navigation.GetWaypointsResponse getWaypoints(com.viam.service.navigation.v1.Navigation.GetWaypointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWaypointsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.service.navigation.v1.Navigation.AddWaypointResponse addWaypoint(com.viam.service.navigation.v1.Navigation.AddWaypointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddWaypointMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.service.navigation.v1.Navigation.RemoveWaypointResponse removeWaypoint(com.viam.service.navigation.v1.Navigation.RemoveWaypointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveWaypointMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.service.navigation.v1.Navigation.GetObstaclesResponse getObstacles(com.viam.service.navigation.v1.Navigation.GetObstaclesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObstaclesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.service.navigation.v1.Navigation.GetPathsResponse getPaths(com.viam.service.navigation.v1.Navigation.GetPathsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPathsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProperties returns properties of the current navigation service, including the
     * map_type being operated on.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetPropertiesResponse getProperties(com.viam.service.navigation.v1.Navigation.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPropertiesMethod(), getCallOptions(), request);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NavigationService.
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service
   * </pre>
   */
  public static final class NavigationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<NavigationServiceFutureStub> {
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
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GetModeResponse> getMode(
        com.viam.service.navigation.v1.Navigation.GetModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.SetModeResponse> setMode(
        com.viam.service.navigation.v1.Navigation.SetModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetModeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GetLocationResponse> getLocation(
        com.viam.service.navigation.v1.Navigation.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GetWaypointsResponse> getWaypoints(
        com.viam.service.navigation.v1.Navigation.GetWaypointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWaypointsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.AddWaypointResponse> addWaypoint(
        com.viam.service.navigation.v1.Navigation.AddWaypointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddWaypointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.RemoveWaypointResponse> removeWaypoint(
        com.viam.service.navigation.v1.Navigation.RemoveWaypointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveWaypointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GetObstaclesResponse> getObstacles(
        com.viam.service.navigation.v1.Navigation.GetObstaclesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObstaclesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GetPathsResponse> getPaths(
        com.viam.service.navigation.v1.Navigation.GetPathsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPathsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProperties returns properties of the current navigation service, including the
     * map_type being operated on.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GetPropertiesResponse> getProperties(
        com.viam.service.navigation.v1.Navigation.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request);
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

  private static final int METHODID_GET_MODE = 0;
  private static final int METHODID_SET_MODE = 1;
  private static final int METHODID_GET_LOCATION = 2;
  private static final int METHODID_GET_WAYPOINTS = 3;
  private static final int METHODID_ADD_WAYPOINT = 4;
  private static final int METHODID_REMOVE_WAYPOINT = 5;
  private static final int METHODID_GET_OBSTACLES = 6;
  private static final int METHODID_GET_PATHS = 7;
  private static final int METHODID_GET_PROPERTIES = 8;
  private static final int METHODID_DO_COMMAND = 9;

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
        case METHODID_GET_MODE:
          serviceImpl.getMode((com.viam.service.navigation.v1.Navigation.GetModeRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetModeResponse>) responseObserver);
          break;
        case METHODID_SET_MODE:
          serviceImpl.setMode((com.viam.service.navigation.v1.Navigation.SetModeRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.SetModeResponse>) responseObserver);
          break;
        case METHODID_GET_LOCATION:
          serviceImpl.getLocation((com.viam.service.navigation.v1.Navigation.GetLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetLocationResponse>) responseObserver);
          break;
        case METHODID_GET_WAYPOINTS:
          serviceImpl.getWaypoints((com.viam.service.navigation.v1.Navigation.GetWaypointsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetWaypointsResponse>) responseObserver);
          break;
        case METHODID_ADD_WAYPOINT:
          serviceImpl.addWaypoint((com.viam.service.navigation.v1.Navigation.AddWaypointRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.AddWaypointResponse>) responseObserver);
          break;
        case METHODID_REMOVE_WAYPOINT:
          serviceImpl.removeWaypoint((com.viam.service.navigation.v1.Navigation.RemoveWaypointRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.RemoveWaypointResponse>) responseObserver);
          break;
        case METHODID_GET_OBSTACLES:
          serviceImpl.getObstacles((com.viam.service.navigation.v1.Navigation.GetObstaclesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetObstaclesResponse>) responseObserver);
          break;
        case METHODID_GET_PATHS:
          serviceImpl.getPaths((com.viam.service.navigation.v1.Navigation.GetPathsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetPathsResponse>) responseObserver);
          break;
        case METHODID_GET_PROPERTIES:
          serviceImpl.getProperties((com.viam.service.navigation.v1.Navigation.GetPropertiesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetPropertiesResponse>) responseObserver);
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
          getGetModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GetModeRequest,
              com.viam.service.navigation.v1.Navigation.GetModeResponse>(
                service, METHODID_GET_MODE)))
        .addMethod(
          getSetModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.SetModeRequest,
              com.viam.service.navigation.v1.Navigation.SetModeResponse>(
                service, METHODID_SET_MODE)))
        .addMethod(
          getGetLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GetLocationRequest,
              com.viam.service.navigation.v1.Navigation.GetLocationResponse>(
                service, METHODID_GET_LOCATION)))
        .addMethod(
          getGetWaypointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GetWaypointsRequest,
              com.viam.service.navigation.v1.Navigation.GetWaypointsResponse>(
                service, METHODID_GET_WAYPOINTS)))
        .addMethod(
          getAddWaypointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.AddWaypointRequest,
              com.viam.service.navigation.v1.Navigation.AddWaypointResponse>(
                service, METHODID_ADD_WAYPOINT)))
        .addMethod(
          getRemoveWaypointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.RemoveWaypointRequest,
              com.viam.service.navigation.v1.Navigation.RemoveWaypointResponse>(
                service, METHODID_REMOVE_WAYPOINT)))
        .addMethod(
          getGetObstaclesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GetObstaclesRequest,
              com.viam.service.navigation.v1.Navigation.GetObstaclesResponse>(
                service, METHODID_GET_OBSTACLES)))
        .addMethod(
          getGetPathsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GetPathsRequest,
              com.viam.service.navigation.v1.Navigation.GetPathsResponse>(
                service, METHODID_GET_PATHS)))
        .addMethod(
          getGetPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GetPropertiesRequest,
              com.viam.service.navigation.v1.Navigation.GetPropertiesResponse>(
                service, METHODID_GET_PROPERTIES)))
        .addMethod(
          getDoCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.DoCommandRequest,
              com.viam.common.v1.Common.DoCommandResponse>(
                service, METHODID_DO_COMMAND)))
        .build();
  }

  private static abstract class NavigationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NavigationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.service.navigation.v1.Navigation.getDescriptor();
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
    private final java.lang.String methodName;

    NavigationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getGetObstaclesMethod())
              .addMethod(getGetPathsMethod())
              .addMethod(getGetPropertiesMethod())
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
