package com.viam.robot.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A RobotService encompasses all functionality of some robot comprised of parts, local and remote.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: robot/v1/robot.proto")
public final class RobotServiceGrpc {

  private RobotServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.robot.v1.RobotService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.GetOperationsRequest,
      com.viam.robot.v1.Robot.GetOperationsResponse> getGetOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOperations",
      requestType = com.viam.robot.v1.Robot.GetOperationsRequest.class,
      responseType = com.viam.robot.v1.Robot.GetOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.GetOperationsRequest,
      com.viam.robot.v1.Robot.GetOperationsResponse> getGetOperationsMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.GetOperationsRequest, com.viam.robot.v1.Robot.GetOperationsResponse> getGetOperationsMethod;
    if ((getGetOperationsMethod = RobotServiceGrpc.getGetOperationsMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getGetOperationsMethod = RobotServiceGrpc.getGetOperationsMethod) == null) {
          RobotServiceGrpc.getGetOperationsMethod = getGetOperationsMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.GetOperationsRequest, com.viam.robot.v1.Robot.GetOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.GetOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.GetOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("GetOperations"))
              .build();
        }
      }
    }
    return getGetOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.GetSessionsRequest,
      com.viam.robot.v1.Robot.GetSessionsResponse> getGetSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSessions",
      requestType = com.viam.robot.v1.Robot.GetSessionsRequest.class,
      responseType = com.viam.robot.v1.Robot.GetSessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.GetSessionsRequest,
      com.viam.robot.v1.Robot.GetSessionsResponse> getGetSessionsMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.GetSessionsRequest, com.viam.robot.v1.Robot.GetSessionsResponse> getGetSessionsMethod;
    if ((getGetSessionsMethod = RobotServiceGrpc.getGetSessionsMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getGetSessionsMethod = RobotServiceGrpc.getGetSessionsMethod) == null) {
          RobotServiceGrpc.getGetSessionsMethod = getGetSessionsMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.GetSessionsRequest, com.viam.robot.v1.Robot.GetSessionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.GetSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.GetSessionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("GetSessions"))
              .build();
        }
      }
    }
    return getGetSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.ResourceNamesRequest,
      com.viam.robot.v1.Robot.ResourceNamesResponse> getResourceNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResourceNames",
      requestType = com.viam.robot.v1.Robot.ResourceNamesRequest.class,
      responseType = com.viam.robot.v1.Robot.ResourceNamesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.ResourceNamesRequest,
      com.viam.robot.v1.Robot.ResourceNamesResponse> getResourceNamesMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.ResourceNamesRequest, com.viam.robot.v1.Robot.ResourceNamesResponse> getResourceNamesMethod;
    if ((getResourceNamesMethod = RobotServiceGrpc.getResourceNamesMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getResourceNamesMethod = RobotServiceGrpc.getResourceNamesMethod) == null) {
          RobotServiceGrpc.getResourceNamesMethod = getResourceNamesMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.ResourceNamesRequest, com.viam.robot.v1.Robot.ResourceNamesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResourceNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.ResourceNamesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.ResourceNamesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("ResourceNames"))
              .build();
        }
      }
    }
    return getResourceNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.ResourceRPCSubtypesRequest,
      com.viam.robot.v1.Robot.ResourceRPCSubtypesResponse> getResourceRPCSubtypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResourceRPCSubtypes",
      requestType = com.viam.robot.v1.Robot.ResourceRPCSubtypesRequest.class,
      responseType = com.viam.robot.v1.Robot.ResourceRPCSubtypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.ResourceRPCSubtypesRequest,
      com.viam.robot.v1.Robot.ResourceRPCSubtypesResponse> getResourceRPCSubtypesMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.ResourceRPCSubtypesRequest, com.viam.robot.v1.Robot.ResourceRPCSubtypesResponse> getResourceRPCSubtypesMethod;
    if ((getResourceRPCSubtypesMethod = RobotServiceGrpc.getResourceRPCSubtypesMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getResourceRPCSubtypesMethod = RobotServiceGrpc.getResourceRPCSubtypesMethod) == null) {
          RobotServiceGrpc.getResourceRPCSubtypesMethod = getResourceRPCSubtypesMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.ResourceRPCSubtypesRequest, com.viam.robot.v1.Robot.ResourceRPCSubtypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResourceRPCSubtypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.ResourceRPCSubtypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.ResourceRPCSubtypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("ResourceRPCSubtypes"))
              .build();
        }
      }
    }
    return getResourceRPCSubtypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.CancelOperationRequest,
      com.viam.robot.v1.Robot.CancelOperationResponse> getCancelOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOperation",
      requestType = com.viam.robot.v1.Robot.CancelOperationRequest.class,
      responseType = com.viam.robot.v1.Robot.CancelOperationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.CancelOperationRequest,
      com.viam.robot.v1.Robot.CancelOperationResponse> getCancelOperationMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.CancelOperationRequest, com.viam.robot.v1.Robot.CancelOperationResponse> getCancelOperationMethod;
    if ((getCancelOperationMethod = RobotServiceGrpc.getCancelOperationMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getCancelOperationMethod = RobotServiceGrpc.getCancelOperationMethod) == null) {
          RobotServiceGrpc.getCancelOperationMethod = getCancelOperationMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.CancelOperationRequest, com.viam.robot.v1.Robot.CancelOperationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOperation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.CancelOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.CancelOperationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("CancelOperation"))
              .build();
        }
      }
    }
    return getCancelOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.BlockForOperationRequest,
      com.viam.robot.v1.Robot.BlockForOperationResponse> getBlockForOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockForOperation",
      requestType = com.viam.robot.v1.Robot.BlockForOperationRequest.class,
      responseType = com.viam.robot.v1.Robot.BlockForOperationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.BlockForOperationRequest,
      com.viam.robot.v1.Robot.BlockForOperationResponse> getBlockForOperationMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.BlockForOperationRequest, com.viam.robot.v1.Robot.BlockForOperationResponse> getBlockForOperationMethod;
    if ((getBlockForOperationMethod = RobotServiceGrpc.getBlockForOperationMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getBlockForOperationMethod = RobotServiceGrpc.getBlockForOperationMethod) == null) {
          RobotServiceGrpc.getBlockForOperationMethod = getBlockForOperationMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.BlockForOperationRequest, com.viam.robot.v1.Robot.BlockForOperationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlockForOperation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.BlockForOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.BlockForOperationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("BlockForOperation"))
              .build();
        }
      }
    }
    return getBlockForOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.DiscoverComponentsRequest,
      com.viam.robot.v1.Robot.DiscoverComponentsResponse> getDiscoverComponentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DiscoverComponents",
      requestType = com.viam.robot.v1.Robot.DiscoverComponentsRequest.class,
      responseType = com.viam.robot.v1.Robot.DiscoverComponentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.DiscoverComponentsRequest,
      com.viam.robot.v1.Robot.DiscoverComponentsResponse> getDiscoverComponentsMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.DiscoverComponentsRequest, com.viam.robot.v1.Robot.DiscoverComponentsResponse> getDiscoverComponentsMethod;
    if ((getDiscoverComponentsMethod = RobotServiceGrpc.getDiscoverComponentsMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getDiscoverComponentsMethod = RobotServiceGrpc.getDiscoverComponentsMethod) == null) {
          RobotServiceGrpc.getDiscoverComponentsMethod = getDiscoverComponentsMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.DiscoverComponentsRequest, com.viam.robot.v1.Robot.DiscoverComponentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DiscoverComponents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.DiscoverComponentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.DiscoverComponentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("DiscoverComponents"))
              .build();
        }
      }
    }
    return getDiscoverComponentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.FrameSystemConfigRequest,
      com.viam.robot.v1.Robot.FrameSystemConfigResponse> getFrameSystemConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FrameSystemConfig",
      requestType = com.viam.robot.v1.Robot.FrameSystemConfigRequest.class,
      responseType = com.viam.robot.v1.Robot.FrameSystemConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.FrameSystemConfigRequest,
      com.viam.robot.v1.Robot.FrameSystemConfigResponse> getFrameSystemConfigMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.FrameSystemConfigRequest, com.viam.robot.v1.Robot.FrameSystemConfigResponse> getFrameSystemConfigMethod;
    if ((getFrameSystemConfigMethod = RobotServiceGrpc.getFrameSystemConfigMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getFrameSystemConfigMethod = RobotServiceGrpc.getFrameSystemConfigMethod) == null) {
          RobotServiceGrpc.getFrameSystemConfigMethod = getFrameSystemConfigMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.FrameSystemConfigRequest, com.viam.robot.v1.Robot.FrameSystemConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FrameSystemConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.FrameSystemConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.FrameSystemConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("FrameSystemConfig"))
              .build();
        }
      }
    }
    return getFrameSystemConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.TransformPoseRequest,
      com.viam.robot.v1.Robot.TransformPoseResponse> getTransformPoseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransformPose",
      requestType = com.viam.robot.v1.Robot.TransformPoseRequest.class,
      responseType = com.viam.robot.v1.Robot.TransformPoseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.TransformPoseRequest,
      com.viam.robot.v1.Robot.TransformPoseResponse> getTransformPoseMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.TransformPoseRequest, com.viam.robot.v1.Robot.TransformPoseResponse> getTransformPoseMethod;
    if ((getTransformPoseMethod = RobotServiceGrpc.getTransformPoseMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getTransformPoseMethod = RobotServiceGrpc.getTransformPoseMethod) == null) {
          RobotServiceGrpc.getTransformPoseMethod = getTransformPoseMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.TransformPoseRequest, com.viam.robot.v1.Robot.TransformPoseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransformPose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.TransformPoseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.TransformPoseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("TransformPose"))
              .build();
        }
      }
    }
    return getTransformPoseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.GetStatusRequest,
      com.viam.robot.v1.Robot.GetStatusResponse> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatus",
      requestType = com.viam.robot.v1.Robot.GetStatusRequest.class,
      responseType = com.viam.robot.v1.Robot.GetStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.GetStatusRequest,
      com.viam.robot.v1.Robot.GetStatusResponse> getGetStatusMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.GetStatusRequest, com.viam.robot.v1.Robot.GetStatusResponse> getGetStatusMethod;
    if ((getGetStatusMethod = RobotServiceGrpc.getGetStatusMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getGetStatusMethod = RobotServiceGrpc.getGetStatusMethod) == null) {
          RobotServiceGrpc.getGetStatusMethod = getGetStatusMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.GetStatusRequest, com.viam.robot.v1.Robot.GetStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.GetStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.GetStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("GetStatus"))
              .build();
        }
      }
    }
    return getGetStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.StreamStatusRequest,
      com.viam.robot.v1.Robot.StreamStatusResponse> getStreamStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamStatus",
      requestType = com.viam.robot.v1.Robot.StreamStatusRequest.class,
      responseType = com.viam.robot.v1.Robot.StreamStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.StreamStatusRequest,
      com.viam.robot.v1.Robot.StreamStatusResponse> getStreamStatusMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.StreamStatusRequest, com.viam.robot.v1.Robot.StreamStatusResponse> getStreamStatusMethod;
    if ((getStreamStatusMethod = RobotServiceGrpc.getStreamStatusMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getStreamStatusMethod = RobotServiceGrpc.getStreamStatusMethod) == null) {
          RobotServiceGrpc.getStreamStatusMethod = getStreamStatusMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.StreamStatusRequest, com.viam.robot.v1.Robot.StreamStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.StreamStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.StreamStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("StreamStatus"))
              .build();
        }
      }
    }
    return getStreamStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.StopAllRequest,
      com.viam.robot.v1.Robot.StopAllResponse> getStopAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopAll",
      requestType = com.viam.robot.v1.Robot.StopAllRequest.class,
      responseType = com.viam.robot.v1.Robot.StopAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.StopAllRequest,
      com.viam.robot.v1.Robot.StopAllResponse> getStopAllMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.StopAllRequest, com.viam.robot.v1.Robot.StopAllResponse> getStopAllMethod;
    if ((getStopAllMethod = RobotServiceGrpc.getStopAllMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getStopAllMethod = RobotServiceGrpc.getStopAllMethod) == null) {
          RobotServiceGrpc.getStopAllMethod = getStopAllMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.StopAllRequest, com.viam.robot.v1.Robot.StopAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.StopAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.StopAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("StopAll"))
              .build();
        }
      }
    }
    return getStopAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.StartSessionRequest,
      com.viam.robot.v1.Robot.StartSessionResponse> getStartSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartSession",
      requestType = com.viam.robot.v1.Robot.StartSessionRequest.class,
      responseType = com.viam.robot.v1.Robot.StartSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.StartSessionRequest,
      com.viam.robot.v1.Robot.StartSessionResponse> getStartSessionMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.StartSessionRequest, com.viam.robot.v1.Robot.StartSessionResponse> getStartSessionMethod;
    if ((getStartSessionMethod = RobotServiceGrpc.getStartSessionMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getStartSessionMethod = RobotServiceGrpc.getStartSessionMethod) == null) {
          RobotServiceGrpc.getStartSessionMethod = getStartSessionMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.StartSessionRequest, com.viam.robot.v1.Robot.StartSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.StartSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.StartSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("StartSession"))
              .build();
        }
      }
    }
    return getStartSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.SendSessionHeartbeatRequest,
      com.viam.robot.v1.Robot.SendSessionHeartbeatResponse> getSendSessionHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendSessionHeartbeat",
      requestType = com.viam.robot.v1.Robot.SendSessionHeartbeatRequest.class,
      responseType = com.viam.robot.v1.Robot.SendSessionHeartbeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.SendSessionHeartbeatRequest,
      com.viam.robot.v1.Robot.SendSessionHeartbeatResponse> getSendSessionHeartbeatMethod() {
    io.grpc.MethodDescriptor<com.viam.robot.v1.Robot.SendSessionHeartbeatRequest, com.viam.robot.v1.Robot.SendSessionHeartbeatResponse> getSendSessionHeartbeatMethod;
    if ((getSendSessionHeartbeatMethod = RobotServiceGrpc.getSendSessionHeartbeatMethod) == null) {
      synchronized (RobotServiceGrpc.class) {
        if ((getSendSessionHeartbeatMethod = RobotServiceGrpc.getSendSessionHeartbeatMethod) == null) {
          RobotServiceGrpc.getSendSessionHeartbeatMethod = getSendSessionHeartbeatMethod =
              io.grpc.MethodDescriptor.<com.viam.robot.v1.Robot.SendSessionHeartbeatRequest, com.viam.robot.v1.Robot.SendSessionHeartbeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendSessionHeartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.SendSessionHeartbeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.robot.v1.Robot.SendSessionHeartbeatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RobotServiceMethodDescriptorSupplier("SendSessionHeartbeat"))
              .build();
        }
      }
    }
    return getSendSessionHeartbeatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RobotServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RobotServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RobotServiceStub>() {
        @java.lang.Override
        public RobotServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RobotServiceStub(channel, callOptions);
        }
      };
    return RobotServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RobotServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RobotServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RobotServiceBlockingStub>() {
        @java.lang.Override
        public RobotServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RobotServiceBlockingStub(channel, callOptions);
        }
      };
    return RobotServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RobotServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RobotServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RobotServiceFutureStub>() {
        @java.lang.Override
        public RobotServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RobotServiceFutureStub(channel, callOptions);
        }
      };
    return RobotServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A RobotService encompasses all functionality of some robot comprised of parts, local and remote.
   * </pre>
   */
  public static abstract class RobotServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getOperations(com.viam.robot.v1.Robot.GetOperationsRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.GetOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOperationsMethod(), responseObserver);
    }

    /**
     */
    public void getSessions(com.viam.robot.v1.Robot.GetSessionsRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.GetSessionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResourceNames returns the list of all resources.
     * </pre>
     */
    public void resourceNames(com.viam.robot.v1.Robot.ResourceNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.ResourceNamesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResourceNamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResourceRPCSubtypes returns the list of all resource types.
     * </pre>
     */
    public void resourceRPCSubtypes(com.viam.robot.v1.Robot.ResourceRPCSubtypesRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.ResourceRPCSubtypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResourceRPCSubtypesMethod(), responseObserver);
    }

    /**
     */
    public void cancelOperation(com.viam.robot.v1.Robot.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.CancelOperationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelOperationMethod(), responseObserver);
    }

    /**
     */
    public void blockForOperation(com.viam.robot.v1.Robot.BlockForOperationRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.BlockForOperationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlockForOperationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DiscoverComponents returns the list of discovered component configurations.
     * </pre>
     */
    public void discoverComponents(com.viam.robot.v1.Robot.DiscoverComponentsRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.DiscoverComponentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDiscoverComponentsMethod(), responseObserver);
    }

    /**
     */
    public void frameSystemConfig(com.viam.robot.v1.Robot.FrameSystemConfigRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.FrameSystemConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFrameSystemConfigMethod(), responseObserver);
    }

    /**
     */
    public void transformPose(com.viam.robot.v1.Robot.TransformPoseRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.TransformPoseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransformPoseMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetStatus returns the list of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public void getStatus(com.viam.robot.v1.Robot.GetStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.GetStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * StreamStatus periodically sends the status of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public void streamStatus(com.viam.robot.v1.Robot.StreamStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.StreamStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * StopAll will stop all current and outstanding operations for the robot and stops all actuators and movement
     * </pre>
     */
    public void stopAll(com.viam.robot.v1.Robot.StopAllRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.StopAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * StartSession creates a new session that expects at least one heartbeat within the returned window.
     * If the window lapses, any resources that have safety heart monitored methods, where this session was
     * the last caller on the resource, will be stopped.
     * </pre>
     */
    public void startSession(com.viam.robot.v1.Robot.StartSessionRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.StartSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendSessionHeartbeat sends a heartbeat to the given session. If the session has expired, a
     * SESSION_EXPIRED error will be returned.
     * </pre>
     */
    public void sendSessionHeartbeat(com.viam.robot.v1.Robot.SendSessionHeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.SendSessionHeartbeatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendSessionHeartbeatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetOperationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.GetOperationsRequest,
                com.viam.robot.v1.Robot.GetOperationsResponse>(
                  this, METHODID_GET_OPERATIONS)))
          .addMethod(
            getGetSessionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.GetSessionsRequest,
                com.viam.robot.v1.Robot.GetSessionsResponse>(
                  this, METHODID_GET_SESSIONS)))
          .addMethod(
            getResourceNamesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.ResourceNamesRequest,
                com.viam.robot.v1.Robot.ResourceNamesResponse>(
                  this, METHODID_RESOURCE_NAMES)))
          .addMethod(
            getResourceRPCSubtypesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.ResourceRPCSubtypesRequest,
                com.viam.robot.v1.Robot.ResourceRPCSubtypesResponse>(
                  this, METHODID_RESOURCE_RPCSUBTYPES)))
          .addMethod(
            getCancelOperationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.CancelOperationRequest,
                com.viam.robot.v1.Robot.CancelOperationResponse>(
                  this, METHODID_CANCEL_OPERATION)))
          .addMethod(
            getBlockForOperationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.BlockForOperationRequest,
                com.viam.robot.v1.Robot.BlockForOperationResponse>(
                  this, METHODID_BLOCK_FOR_OPERATION)))
          .addMethod(
            getDiscoverComponentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.DiscoverComponentsRequest,
                com.viam.robot.v1.Robot.DiscoverComponentsResponse>(
                  this, METHODID_DISCOVER_COMPONENTS)))
          .addMethod(
            getFrameSystemConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.FrameSystemConfigRequest,
                com.viam.robot.v1.Robot.FrameSystemConfigResponse>(
                  this, METHODID_FRAME_SYSTEM_CONFIG)))
          .addMethod(
            getTransformPoseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.TransformPoseRequest,
                com.viam.robot.v1.Robot.TransformPoseResponse>(
                  this, METHODID_TRANSFORM_POSE)))
          .addMethod(
            getGetStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.GetStatusRequest,
                com.viam.robot.v1.Robot.GetStatusResponse>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            getStreamStatusMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.StreamStatusRequest,
                com.viam.robot.v1.Robot.StreamStatusResponse>(
                  this, METHODID_STREAM_STATUS)))
          .addMethod(
            getStopAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.StopAllRequest,
                com.viam.robot.v1.Robot.StopAllResponse>(
                  this, METHODID_STOP_ALL)))
          .addMethod(
            getStartSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.StartSessionRequest,
                com.viam.robot.v1.Robot.StartSessionResponse>(
                  this, METHODID_START_SESSION)))
          .addMethod(
            getSendSessionHeartbeatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.robot.v1.Robot.SendSessionHeartbeatRequest,
                com.viam.robot.v1.Robot.SendSessionHeartbeatResponse>(
                  this, METHODID_SEND_SESSION_HEARTBEAT)))
          .build();
    }
  }

  /**
   * <pre>
   * A RobotService encompasses all functionality of some robot comprised of parts, local and remote.
   * </pre>
   */
  public static final class RobotServiceStub extends io.grpc.stub.AbstractAsyncStub<RobotServiceStub> {
    private RobotServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RobotServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RobotServiceStub(channel, callOptions);
    }

    /**
     */
    public void getOperations(com.viam.robot.v1.Robot.GetOperationsRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.GetOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSessions(com.viam.robot.v1.Robot.GetSessionsRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.GetSessionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResourceNames returns the list of all resources.
     * </pre>
     */
    public void resourceNames(com.viam.robot.v1.Robot.ResourceNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.ResourceNamesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResourceNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResourceRPCSubtypes returns the list of all resource types.
     * </pre>
     */
    public void resourceRPCSubtypes(com.viam.robot.v1.Robot.ResourceRPCSubtypesRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.ResourceRPCSubtypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResourceRPCSubtypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelOperation(com.viam.robot.v1.Robot.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.CancelOperationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelOperationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void blockForOperation(com.viam.robot.v1.Robot.BlockForOperationRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.BlockForOperationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlockForOperationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DiscoverComponents returns the list of discovered component configurations.
     * </pre>
     */
    public void discoverComponents(com.viam.robot.v1.Robot.DiscoverComponentsRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.DiscoverComponentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDiscoverComponentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void frameSystemConfig(com.viam.robot.v1.Robot.FrameSystemConfigRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.FrameSystemConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFrameSystemConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transformPose(com.viam.robot.v1.Robot.TransformPoseRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.TransformPoseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransformPoseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetStatus returns the list of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public void getStatus(com.viam.robot.v1.Robot.GetStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.GetStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StreamStatus periodically sends the status of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public void streamStatus(com.viam.robot.v1.Robot.StreamStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.StreamStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StopAll will stop all current and outstanding operations for the robot and stops all actuators and movement
     * </pre>
     */
    public void stopAll(com.viam.robot.v1.Robot.StopAllRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.StopAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StartSession creates a new session that expects at least one heartbeat within the returned window.
     * If the window lapses, any resources that have safety heart monitored methods, where this session was
     * the last caller on the resource, will be stopped.
     * </pre>
     */
    public void startSession(com.viam.robot.v1.Robot.StartSessionRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.StartSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendSessionHeartbeat sends a heartbeat to the given session. If the session has expired, a
     * SESSION_EXPIRED error will be returned.
     * </pre>
     */
    public void sendSessionHeartbeat(com.viam.robot.v1.Robot.SendSessionHeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.SendSessionHeartbeatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendSessionHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A RobotService encompasses all functionality of some robot comprised of parts, local and remote.
   * </pre>
   */
  public static final class RobotServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RobotServiceBlockingStub> {
    private RobotServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RobotServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RobotServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.viam.robot.v1.Robot.GetOperationsResponse getOperations(com.viam.robot.v1.Robot.GetOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOperationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.robot.v1.Robot.GetSessionsResponse getSessions(com.viam.robot.v1.Robot.GetSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResourceNames returns the list of all resources.
     * </pre>
     */
    public com.viam.robot.v1.Robot.ResourceNamesResponse resourceNames(com.viam.robot.v1.Robot.ResourceNamesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResourceNamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResourceRPCSubtypes returns the list of all resource types.
     * </pre>
     */
    public com.viam.robot.v1.Robot.ResourceRPCSubtypesResponse resourceRPCSubtypes(com.viam.robot.v1.Robot.ResourceRPCSubtypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResourceRPCSubtypesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.robot.v1.Robot.CancelOperationResponse cancelOperation(com.viam.robot.v1.Robot.CancelOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelOperationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.robot.v1.Robot.BlockForOperationResponse blockForOperation(com.viam.robot.v1.Robot.BlockForOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlockForOperationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DiscoverComponents returns the list of discovered component configurations.
     * </pre>
     */
    public com.viam.robot.v1.Robot.DiscoverComponentsResponse discoverComponents(com.viam.robot.v1.Robot.DiscoverComponentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDiscoverComponentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.robot.v1.Robot.FrameSystemConfigResponse frameSystemConfig(com.viam.robot.v1.Robot.FrameSystemConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFrameSystemConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.robot.v1.Robot.TransformPoseResponse transformPose(com.viam.robot.v1.Robot.TransformPoseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransformPoseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetStatus returns the list of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public com.viam.robot.v1.Robot.GetStatusResponse getStatus(com.viam.robot.v1.Robot.GetStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StreamStatus periodically sends the status of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public java.util.Iterator<com.viam.robot.v1.Robot.StreamStatusResponse> streamStatus(
        com.viam.robot.v1.Robot.StreamStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StopAll will stop all current and outstanding operations for the robot and stops all actuators and movement
     * </pre>
     */
    public com.viam.robot.v1.Robot.StopAllResponse stopAll(com.viam.robot.v1.Robot.StopAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StartSession creates a new session that expects at least one heartbeat within the returned window.
     * If the window lapses, any resources that have safety heart monitored methods, where this session was
     * the last caller on the resource, will be stopped.
     * </pre>
     */
    public com.viam.robot.v1.Robot.StartSessionResponse startSession(com.viam.robot.v1.Robot.StartSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendSessionHeartbeat sends a heartbeat to the given session. If the session has expired, a
     * SESSION_EXPIRED error will be returned.
     * </pre>
     */
    public com.viam.robot.v1.Robot.SendSessionHeartbeatResponse sendSessionHeartbeat(com.viam.robot.v1.Robot.SendSessionHeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendSessionHeartbeatMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A RobotService encompasses all functionality of some robot comprised of parts, local and remote.
   * </pre>
   */
  public static final class RobotServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RobotServiceFutureStub> {
    private RobotServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RobotServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RobotServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.robot.v1.Robot.GetOperationsResponse> getOperations(
        com.viam.robot.v1.Robot.GetOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOperationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.robot.v1.Robot.GetSessionsResponse> getSessions(
        com.viam.robot.v1.Robot.GetSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResourceNames returns the list of all resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.robot.v1.Robot.ResourceNamesResponse> resourceNames(
        com.viam.robot.v1.Robot.ResourceNamesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResourceNamesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResourceRPCSubtypes returns the list of all resource types.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.robot.v1.Robot.ResourceRPCSubtypesResponse> resourceRPCSubtypes(
        com.viam.robot.v1.Robot.ResourceRPCSubtypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResourceRPCSubtypesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.robot.v1.Robot.CancelOperationResponse> cancelOperation(
        com.viam.robot.v1.Robot.CancelOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelOperationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.robot.v1.Robot.BlockForOperationResponse> blockForOperation(
        com.viam.robot.v1.Robot.BlockForOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlockForOperationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DiscoverComponents returns the list of discovered component configurations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.robot.v1.Robot.DiscoverComponentsResponse> discoverComponents(
        com.viam.robot.v1.Robot.DiscoverComponentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDiscoverComponentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.robot.v1.Robot.FrameSystemConfigResponse> frameSystemConfig(
        com.viam.robot.v1.Robot.FrameSystemConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFrameSystemConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.robot.v1.Robot.TransformPoseResponse> transformPose(
        com.viam.robot.v1.Robot.TransformPoseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransformPoseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetStatus returns the list of all statuses requested. An empty request signifies all resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.robot.v1.Robot.GetStatusResponse> getStatus(
        com.viam.robot.v1.Robot.GetStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StopAll will stop all current and outstanding operations for the robot and stops all actuators and movement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.robot.v1.Robot.StopAllResponse> stopAll(
        com.viam.robot.v1.Robot.StopAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StartSession creates a new session that expects at least one heartbeat within the returned window.
     * If the window lapses, any resources that have safety heart monitored methods, where this session was
     * the last caller on the resource, will be stopped.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.robot.v1.Robot.StartSessionResponse> startSession(
        com.viam.robot.v1.Robot.StartSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendSessionHeartbeat sends a heartbeat to the given session. If the session has expired, a
     * SESSION_EXPIRED error will be returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.robot.v1.Robot.SendSessionHeartbeatResponse> sendSessionHeartbeat(
        com.viam.robot.v1.Robot.SendSessionHeartbeatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendSessionHeartbeatMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OPERATIONS = 0;
  private static final int METHODID_GET_SESSIONS = 1;
  private static final int METHODID_RESOURCE_NAMES = 2;
  private static final int METHODID_RESOURCE_RPCSUBTYPES = 3;
  private static final int METHODID_CANCEL_OPERATION = 4;
  private static final int METHODID_BLOCK_FOR_OPERATION = 5;
  private static final int METHODID_DISCOVER_COMPONENTS = 6;
  private static final int METHODID_FRAME_SYSTEM_CONFIG = 7;
  private static final int METHODID_TRANSFORM_POSE = 8;
  private static final int METHODID_GET_STATUS = 9;
  private static final int METHODID_STREAM_STATUS = 10;
  private static final int METHODID_STOP_ALL = 11;
  private static final int METHODID_START_SESSION = 12;
  private static final int METHODID_SEND_SESSION_HEARTBEAT = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RobotServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RobotServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_OPERATIONS:
          serviceImpl.getOperations((com.viam.robot.v1.Robot.GetOperationsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.GetOperationsResponse>) responseObserver);
          break;
        case METHODID_GET_SESSIONS:
          serviceImpl.getSessions((com.viam.robot.v1.Robot.GetSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.GetSessionsResponse>) responseObserver);
          break;
        case METHODID_RESOURCE_NAMES:
          serviceImpl.resourceNames((com.viam.robot.v1.Robot.ResourceNamesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.ResourceNamesResponse>) responseObserver);
          break;
        case METHODID_RESOURCE_RPCSUBTYPES:
          serviceImpl.resourceRPCSubtypes((com.viam.robot.v1.Robot.ResourceRPCSubtypesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.ResourceRPCSubtypesResponse>) responseObserver);
          break;
        case METHODID_CANCEL_OPERATION:
          serviceImpl.cancelOperation((com.viam.robot.v1.Robot.CancelOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.CancelOperationResponse>) responseObserver);
          break;
        case METHODID_BLOCK_FOR_OPERATION:
          serviceImpl.blockForOperation((com.viam.robot.v1.Robot.BlockForOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.BlockForOperationResponse>) responseObserver);
          break;
        case METHODID_DISCOVER_COMPONENTS:
          serviceImpl.discoverComponents((com.viam.robot.v1.Robot.DiscoverComponentsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.DiscoverComponentsResponse>) responseObserver);
          break;
        case METHODID_FRAME_SYSTEM_CONFIG:
          serviceImpl.frameSystemConfig((com.viam.robot.v1.Robot.FrameSystemConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.FrameSystemConfigResponse>) responseObserver);
          break;
        case METHODID_TRANSFORM_POSE:
          serviceImpl.transformPose((com.viam.robot.v1.Robot.TransformPoseRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.TransformPoseResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((com.viam.robot.v1.Robot.GetStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.GetStatusResponse>) responseObserver);
          break;
        case METHODID_STREAM_STATUS:
          serviceImpl.streamStatus((com.viam.robot.v1.Robot.StreamStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.StreamStatusResponse>) responseObserver);
          break;
        case METHODID_STOP_ALL:
          serviceImpl.stopAll((com.viam.robot.v1.Robot.StopAllRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.StopAllResponse>) responseObserver);
          break;
        case METHODID_START_SESSION:
          serviceImpl.startSession((com.viam.robot.v1.Robot.StartSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.StartSessionResponse>) responseObserver);
          break;
        case METHODID_SEND_SESSION_HEARTBEAT:
          serviceImpl.sendSessionHeartbeat((com.viam.robot.v1.Robot.SendSessionHeartbeatRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.robot.v1.Robot.SendSessionHeartbeatResponse>) responseObserver);
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

  private static abstract class RobotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RobotServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.robot.v1.Robot.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RobotService");
    }
  }

  private static final class RobotServiceFileDescriptorSupplier
      extends RobotServiceBaseDescriptorSupplier {
    RobotServiceFileDescriptorSupplier() {}
  }

  private static final class RobotServiceMethodDescriptorSupplier
      extends RobotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RobotServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RobotServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RobotServiceFileDescriptorSupplier())
              .addMethod(getGetOperationsMethod())
              .addMethod(getGetSessionsMethod())
              .addMethod(getResourceNamesMethod())
              .addMethod(getResourceRPCSubtypesMethod())
              .addMethod(getCancelOperationMethod())
              .addMethod(getBlockForOperationMethod())
              .addMethod(getDiscoverComponentsMethod())
              .addMethod(getFrameSystemConfigMethod())
              .addMethod(getTransformPoseMethod())
              .addMethod(getGetStatusMethod())
              .addMethod(getStreamStatusMethod())
              .addMethod(getStopAllMethod())
              .addMethod(getStartSessionMethod())
              .addMethod(getSendSessionHeartbeatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
