package com.viam.component.gantry.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An GantryService services all gantries associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: component/gantry/v1/gantry.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GantryServiceGrpc {

  private GantryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.gantry.v1.GantryService";

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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.GetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.GetPositionResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.MoveToPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.MoveToPositionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getMoveToPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.HomeRequest,
      com.viam.component.gantry.v1.Gantry.HomeResponse> getHomeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Home",
      requestType = com.viam.component.gantry.v1.Gantry.HomeRequest.class,
      responseType = com.viam.component.gantry.v1.Gantry.HomeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.HomeRequest,
      com.viam.component.gantry.v1.Gantry.HomeResponse> getHomeMethod() {
    io.grpc.MethodDescriptor<com.viam.component.gantry.v1.Gantry.HomeRequest, com.viam.component.gantry.v1.Gantry.HomeResponse> getHomeMethod;
    if ((getHomeMethod = GantryServiceGrpc.getHomeMethod) == null) {
      synchronized (GantryServiceGrpc.class) {
        if ((getHomeMethod = GantryServiceGrpc.getHomeMethod) == null) {
          GantryServiceGrpc.getHomeMethod = getHomeMethod =
              io.grpc.MethodDescriptor.<com.viam.component.gantry.v1.Gantry.HomeRequest, com.viam.component.gantry.v1.Gantry.HomeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Home"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.HomeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.HomeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getHomeMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.GetLengthsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.GetLengthsResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.StopResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.IsMovingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.gantry.v1.Gantry.IsMovingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsMovingMethod;
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
    if ((getDoCommandMethod = GantryServiceGrpc.getDoCommandMethod) == null) {
      synchronized (GantryServiceGrpc.class) {
        if ((getDoCommandMethod = GantryServiceGrpc.getDoCommandMethod) == null) {
          GantryServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetKinematicsRequest,
      com.viam.common.v1.Common.GetKinematicsResponse> getGetKinematicsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKinematics",
      requestType = com.viam.common.v1.Common.GetKinematicsRequest.class,
      responseType = com.viam.common.v1.Common.GetKinematicsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetKinematicsRequest,
      com.viam.common.v1.Common.GetKinematicsResponse> getGetKinematicsMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetKinematicsRequest, com.viam.common.v1.Common.GetKinematicsResponse> getGetKinematicsMethod;
    if ((getGetKinematicsMethod = GantryServiceGrpc.getGetKinematicsMethod) == null) {
      synchronized (GantryServiceGrpc.class) {
        if ((getGetKinematicsMethod = GantryServiceGrpc.getGetKinematicsMethod) == null) {
          GantryServiceGrpc.getGetKinematicsMethod = getGetKinematicsMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.GetKinematicsRequest, com.viam.common.v1.Common.GetKinematicsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKinematics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetKinematicsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetKinematicsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetKinematicsMethod;
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
    if ((getGetGeometriesMethod = GantryServiceGrpc.getGetGeometriesMethod) == null) {
      synchronized (GantryServiceGrpc.class) {
        if ((getGetGeometriesMethod = GantryServiceGrpc.getGetGeometriesMethod) == null) {
          GantryServiceGrpc.getGetGeometriesMethod = getGetGeometriesMethod =
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
  public interface AsyncService {

    /**
     * <pre>
     * GetPosition gets the current position of a gantry of the underlying robot.
     * </pre>
     */
    default void getPosition(com.viam.component.gantry.v1.Gantry.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.GetPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * MoveToPosition moves a gantry of the underlying robot to the requested position.
     * </pre>
     */
    default void moveToPosition(com.viam.component.gantry.v1.Gantry.MoveToPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.MoveToPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveToPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Home runs the homing sequence of a gantry and returns true once it's completed.
     * </pre>
     */
    default void home(com.viam.component.gantry.v1.Gantry.HomeRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.HomeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHomeMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLengths gets the lengths of a gantry of the underlying robot.
     * </pre>
     */
    default void getLengths(com.viam.component.gantry.v1.Gantry.GetLengthsRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.GetLengthsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLengthsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop stops a robot's gantry
     * </pre>
     */
    default void stop(com.viam.component.gantry.v1.Gantry.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.StopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    default void isMoving(com.viam.component.gantry.v1.Gantry.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.IsMovingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsMovingMethod(), responseObserver);
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
     */
    default void getKinematics(com.viam.common.v1.Common.GetKinematicsRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetKinematicsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKinematicsMethod(), responseObserver);
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
   * Base class for the server implementation of the service GantryService.
   * <pre>
   * An GantryService services all gantries associated with a robot
   * </pre>
   */
  public static abstract class GantryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GantryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GantryService.
   * <pre>
   * An GantryService services all gantries associated with a robot
   * </pre>
   */
  public static final class GantryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GantryServiceStub> {
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
     * Home runs the homing sequence of a gantry and returns true once it's completed.
     * </pre>
     */
    public void home(com.viam.component.gantry.v1.Gantry.HomeRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.HomeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHomeMethod(), getCallOptions()), request, responseObserver);
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
     */
    public void getKinematics(com.viam.common.v1.Common.GetKinematicsRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetKinematicsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKinematicsMethod(), getCallOptions()), request, responseObserver);
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
   * A stub to allow clients to do synchronous rpc calls to service GantryService.
   * <pre>
   * An GantryService services all gantries associated with a robot
   * </pre>
   */
  public static final class GantryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GantryServiceBlockingStub> {
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
     * Home runs the homing sequence of a gantry and returns true once it's completed.
     * </pre>
     */
    public com.viam.component.gantry.v1.Gantry.HomeResponse home(com.viam.component.gantry.v1.Gantry.HomeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHomeMethod(), getCallOptions(), request);
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
     */
    public com.viam.common.v1.Common.GetKinematicsResponse getKinematics(com.viam.common.v1.Common.GetKinematicsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKinematicsMethod(), getCallOptions(), request);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GantryService.
   * <pre>
   * An GantryService services all gantries associated with a robot
   * </pre>
   */
  public static final class GantryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GantryServiceFutureStub> {
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
     * Home runs the homing sequence of a gantry and returns true once it's completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.gantry.v1.Gantry.HomeResponse> home(
        com.viam.component.gantry.v1.Gantry.HomeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHomeMethod(), getCallOptions()), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.GetKinematicsResponse> getKinematics(
        com.viam.common.v1.Common.GetKinematicsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKinematicsMethod(), getCallOptions()), request);
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

  private static final int METHODID_GET_POSITION = 0;
  private static final int METHODID_MOVE_TO_POSITION = 1;
  private static final int METHODID_HOME = 2;
  private static final int METHODID_GET_LENGTHS = 3;
  private static final int METHODID_STOP = 4;
  private static final int METHODID_IS_MOVING = 5;
  private static final int METHODID_DO_COMMAND = 6;
  private static final int METHODID_GET_KINEMATICS = 7;
  private static final int METHODID_GET_GEOMETRIES = 8;

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
        case METHODID_GET_POSITION:
          serviceImpl.getPosition((com.viam.component.gantry.v1.Gantry.GetPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.GetPositionResponse>) responseObserver);
          break;
        case METHODID_MOVE_TO_POSITION:
          serviceImpl.moveToPosition((com.viam.component.gantry.v1.Gantry.MoveToPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.MoveToPositionResponse>) responseObserver);
          break;
        case METHODID_HOME:
          serviceImpl.home((com.viam.component.gantry.v1.Gantry.HomeRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.gantry.v1.Gantry.HomeResponse>) responseObserver);
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
        case METHODID_DO_COMMAND:
          serviceImpl.doCommand((com.viam.common.v1.Common.DoCommandRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse>) responseObserver);
          break;
        case METHODID_GET_KINEMATICS:
          serviceImpl.getKinematics((com.viam.common.v1.Common.GetKinematicsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetKinematicsResponse>) responseObserver);
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
          getGetPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.gantry.v1.Gantry.GetPositionRequest,
              com.viam.component.gantry.v1.Gantry.GetPositionResponse>(
                service, METHODID_GET_POSITION)))
        .addMethod(
          getMoveToPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.gantry.v1.Gantry.MoveToPositionRequest,
              com.viam.component.gantry.v1.Gantry.MoveToPositionResponse>(
                service, METHODID_MOVE_TO_POSITION)))
        .addMethod(
          getHomeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.gantry.v1.Gantry.HomeRequest,
              com.viam.component.gantry.v1.Gantry.HomeResponse>(
                service, METHODID_HOME)))
        .addMethod(
          getGetLengthsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.gantry.v1.Gantry.GetLengthsRequest,
              com.viam.component.gantry.v1.Gantry.GetLengthsResponse>(
                service, METHODID_GET_LENGTHS)))
        .addMethod(
          getStopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.gantry.v1.Gantry.StopRequest,
              com.viam.component.gantry.v1.Gantry.StopResponse>(
                service, METHODID_STOP)))
        .addMethod(
          getIsMovingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.gantry.v1.Gantry.IsMovingRequest,
              com.viam.component.gantry.v1.Gantry.IsMovingResponse>(
                service, METHODID_IS_MOVING)))
        .addMethod(
          getDoCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.DoCommandRequest,
              com.viam.common.v1.Common.DoCommandResponse>(
                service, METHODID_DO_COMMAND)))
        .addMethod(
          getGetKinematicsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.GetKinematicsRequest,
              com.viam.common.v1.Common.GetKinematicsResponse>(
                service, METHODID_GET_KINEMATICS)))
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
      synchronized (GantryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetPositionMethod())
              .addMethod(getMoveToPositionMethod())
              .addMethod(getHomeMethod())
              .addMethod(getGetLengthsMethod())
              .addMethod(getStopMethod())
              .addMethod(getIsMovingMethod())
              .addMethod(getDoCommandMethod())
              .addMethod(getGetKinematicsMethod())
              .addMethod(getGetGeometriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
