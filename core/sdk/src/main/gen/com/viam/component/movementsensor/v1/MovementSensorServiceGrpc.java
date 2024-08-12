package com.viam.component.movementsensor.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: component/movementsensor/v1/movementsensor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MovementSensorServiceGrpc {

  private MovementSensorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.movementsensor.v1.MovementSensorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityResponse> getGetLinearVelocityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLinearVelocity",
      requestType = com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest.class,
      responseType = com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityResponse> getGetLinearVelocityMethod() {
    io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest, com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityResponse> getGetLinearVelocityMethod;
    if ((getGetLinearVelocityMethod = MovementSensorServiceGrpc.getGetLinearVelocityMethod) == null) {
      synchronized (MovementSensorServiceGrpc.class) {
        if ((getGetLinearVelocityMethod = MovementSensorServiceGrpc.getGetLinearVelocityMethod) == null) {
          MovementSensorServiceGrpc.getGetLinearVelocityMethod = getGetLinearVelocityMethod =
              io.grpc.MethodDescriptor.<com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest, com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLinearVelocity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetLinearVelocityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityResponse> getGetAngularVelocityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAngularVelocity",
      requestType = com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest.class,
      responseType = com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityResponse> getGetAngularVelocityMethod() {
    io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest, com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityResponse> getGetAngularVelocityMethod;
    if ((getGetAngularVelocityMethod = MovementSensorServiceGrpc.getGetAngularVelocityMethod) == null) {
      synchronized (MovementSensorServiceGrpc.class) {
        if ((getGetAngularVelocityMethod = MovementSensorServiceGrpc.getGetAngularVelocityMethod) == null) {
          MovementSensorServiceGrpc.getGetAngularVelocityMethod = getGetAngularVelocityMethod =
              io.grpc.MethodDescriptor.<com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest, com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAngularVelocity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetAngularVelocityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingResponse> getGetCompassHeadingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCompassHeading",
      requestType = com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest.class,
      responseType = com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingResponse> getGetCompassHeadingMethod() {
    io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest, com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingResponse> getGetCompassHeadingMethod;
    if ((getGetCompassHeadingMethod = MovementSensorServiceGrpc.getGetCompassHeadingMethod) == null) {
      synchronized (MovementSensorServiceGrpc.class) {
        if ((getGetCompassHeadingMethod = MovementSensorServiceGrpc.getGetCompassHeadingMethod) == null) {
          MovementSensorServiceGrpc.getGetCompassHeadingMethod = getGetCompassHeadingMethod =
              io.grpc.MethodDescriptor.<com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest, com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCompassHeading"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCompassHeadingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetOrientationResponse> getGetOrientationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrientation",
      requestType = com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest.class,
      responseType = com.viam.component.movementsensor.v1.Movementsensor.GetOrientationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetOrientationResponse> getGetOrientationMethod() {
    io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest, com.viam.component.movementsensor.v1.Movementsensor.GetOrientationResponse> getGetOrientationMethod;
    if ((getGetOrientationMethod = MovementSensorServiceGrpc.getGetOrientationMethod) == null) {
      synchronized (MovementSensorServiceGrpc.class) {
        if ((getGetOrientationMethod = MovementSensorServiceGrpc.getGetOrientationMethod) == null) {
          MovementSensorServiceGrpc.getGetOrientationMethod = getGetOrientationMethod =
              io.grpc.MethodDescriptor.<com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest, com.viam.component.movementsensor.v1.Movementsensor.GetOrientationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrientation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetOrientationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOrientationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse> getGetPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPosition",
      requestType = com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest.class,
      responseType = com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse> getGetPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest, com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse> getGetPositionMethod;
    if ((getGetPositionMethod = MovementSensorServiceGrpc.getGetPositionMethod) == null) {
      synchronized (MovementSensorServiceGrpc.class) {
        if ((getGetPositionMethod = MovementSensorServiceGrpc.getGetPositionMethod) == null) {
          MovementSensorServiceGrpc.getGetPositionMethod = getGetPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest, com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse> getGetPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProperties",
      requestType = com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest.class,
      responseType = com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse> getGetPropertiesMethod() {
    io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest, com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse> getGetPropertiesMethod;
    if ((getGetPropertiesMethod = MovementSensorServiceGrpc.getGetPropertiesMethod) == null) {
      synchronized (MovementSensorServiceGrpc.class) {
        if ((getGetPropertiesMethod = MovementSensorServiceGrpc.getGetPropertiesMethod) == null) {
          MovementSensorServiceGrpc.getGetPropertiesMethod = getGetPropertiesMethod =
              io.grpc.MethodDescriptor.<com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest, com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse> getGetAccuracyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccuracy",
      requestType = com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest.class,
      responseType = com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse> getGetAccuracyMethod() {
    io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest, com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse> getGetAccuracyMethod;
    if ((getGetAccuracyMethod = MovementSensorServiceGrpc.getGetAccuracyMethod) == null) {
      synchronized (MovementSensorServiceGrpc.class) {
        if ((getGetAccuracyMethod = MovementSensorServiceGrpc.getGetAccuracyMethod) == null) {
          MovementSensorServiceGrpc.getGetAccuracyMethod = getGetAccuracyMethod =
              io.grpc.MethodDescriptor.<com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest, com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccuracy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetAccuracyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationResponse> getGetLinearAccelerationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLinearAcceleration",
      requestType = com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest.class,
      responseType = com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest,
      com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationResponse> getGetLinearAccelerationMethod() {
    io.grpc.MethodDescriptor<com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest, com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationResponse> getGetLinearAccelerationMethod;
    if ((getGetLinearAccelerationMethod = MovementSensorServiceGrpc.getGetLinearAccelerationMethod) == null) {
      synchronized (MovementSensorServiceGrpc.class) {
        if ((getGetLinearAccelerationMethod = MovementSensorServiceGrpc.getGetLinearAccelerationMethod) == null) {
          MovementSensorServiceGrpc.getGetLinearAccelerationMethod = getGetLinearAccelerationMethod =
              io.grpc.MethodDescriptor.<com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest, com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLinearAcceleration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetLinearAccelerationMethod;
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
    if ((getDoCommandMethod = MovementSensorServiceGrpc.getDoCommandMethod) == null) {
      synchronized (MovementSensorServiceGrpc.class) {
        if ((getDoCommandMethod = MovementSensorServiceGrpc.getDoCommandMethod) == null) {
          MovementSensorServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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
    if ((getGetGeometriesMethod = MovementSensorServiceGrpc.getGetGeometriesMethod) == null) {
      synchronized (MovementSensorServiceGrpc.class) {
        if ((getGetGeometriesMethod = MovementSensorServiceGrpc.getGetGeometriesMethod) == null) {
          MovementSensorServiceGrpc.getGetGeometriesMethod = getGetGeometriesMethod =
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

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetReadingsRequest,
      com.viam.common.v1.Common.GetReadingsResponse> getGetReadingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReadings",
      requestType = com.viam.common.v1.Common.GetReadingsRequest.class,
      responseType = com.viam.common.v1.Common.GetReadingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetReadingsRequest,
      com.viam.common.v1.Common.GetReadingsResponse> getGetReadingsMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetReadingsRequest, com.viam.common.v1.Common.GetReadingsResponse> getGetReadingsMethod;
    if ((getGetReadingsMethod = MovementSensorServiceGrpc.getGetReadingsMethod) == null) {
      synchronized (MovementSensorServiceGrpc.class) {
        if ((getGetReadingsMethod = MovementSensorServiceGrpc.getGetReadingsMethod) == null) {
          MovementSensorServiceGrpc.getGetReadingsMethod = getGetReadingsMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.GetReadingsRequest, com.viam.common.v1.Common.GetReadingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReadings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetReadingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetReadingsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetReadingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovementSensorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovementSensorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovementSensorServiceStub>() {
        @java.lang.Override
        public MovementSensorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovementSensorServiceStub(channel, callOptions);
        }
      };
    return MovementSensorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovementSensorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovementSensorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovementSensorServiceBlockingStub>() {
        @java.lang.Override
        public MovementSensorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovementSensorServiceBlockingStub(channel, callOptions);
        }
      };
    return MovementSensorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovementSensorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovementSensorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovementSensorServiceFutureStub>() {
        @java.lang.Override
        public MovementSensorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovementSensorServiceFutureStub(channel, callOptions);
        }
      };
    return MovementSensorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getLinearVelocity(com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLinearVelocityMethod(), responseObserver);
    }

    /**
     */
    default void getAngularVelocity(com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAngularVelocityMethod(), responseObserver);
    }

    /**
     */
    default void getCompassHeading(com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCompassHeadingMethod(), responseObserver);
    }

    /**
     */
    default void getOrientation(com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetOrientationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrientationMethod(), responseObserver);
    }

    /**
     */
    default void getPosition(com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPositionMethod(), responseObserver);
    }

    /**
     */
    default void getProperties(com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPropertiesMethod(), responseObserver);
    }

    /**
     */
    default void getAccuracy(com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccuracyMethod(), responseObserver);
    }

    /**
     */
    default void getLinearAcceleration(com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLinearAccelerationMethod(), responseObserver);
    }

    /**
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

    /**
     * <pre>
     * GetReadings returns the readings of a sensor of the underlying robot.
     * </pre>
     */
    default void getReadings(com.viam.common.v1.Common.GetReadingsRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetReadingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReadingsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MovementSensorService.
   */
  public static abstract class MovementSensorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MovementSensorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MovementSensorService.
   */
  public static final class MovementSensorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MovementSensorServiceStub> {
    private MovementSensorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovementSensorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovementSensorServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLinearVelocity(com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLinearVelocityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAngularVelocity(com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAngularVelocityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCompassHeading(com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCompassHeadingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrientation(com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetOrientationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrientationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPosition(com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProperties(com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccuracy(com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccuracyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLinearAcceleration(com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLinearAccelerationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
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

    /**
     * <pre>
     * GetReadings returns the readings of a sensor of the underlying robot.
     * </pre>
     */
    public void getReadings(com.viam.common.v1.Common.GetReadingsRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetReadingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReadingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MovementSensorService.
   */
  public static final class MovementSensorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MovementSensorServiceBlockingStub> {
    private MovementSensorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovementSensorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovementSensorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityResponse getLinearVelocity(com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLinearVelocityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityResponse getAngularVelocity(com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAngularVelocityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingResponse getCompassHeading(com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCompassHeadingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.component.movementsensor.v1.Movementsensor.GetOrientationResponse getOrientation(com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrientationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse getPosition(com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPositionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse getProperties(com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPropertiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse getAccuracy(com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccuracyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationResponse getLinearAcceleration(com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLinearAccelerationMethod(), getCallOptions(), request);
    }

    /**
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

    /**
     * <pre>
     * GetReadings returns the readings of a sensor of the underlying robot.
     * </pre>
     */
    public com.viam.common.v1.Common.GetReadingsResponse getReadings(com.viam.common.v1.Common.GetReadingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReadingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MovementSensorService.
   */
  public static final class MovementSensorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MovementSensorServiceFutureStub> {
    private MovementSensorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovementSensorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovementSensorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityResponse> getLinearVelocity(
        com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLinearVelocityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityResponse> getAngularVelocity(
        com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAngularVelocityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingResponse> getCompassHeading(
        com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCompassHeadingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.movementsensor.v1.Movementsensor.GetOrientationResponse> getOrientation(
        com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrientationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse> getPosition(
        com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse> getProperties(
        com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse> getAccuracy(
        com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccuracyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationResponse> getLinearAcceleration(
        com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLinearAccelerationMethod(), getCallOptions()), request);
    }

    /**
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

    /**
     * <pre>
     * GetReadings returns the readings of a sensor of the underlying robot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.GetReadingsResponse> getReadings(
        com.viam.common.v1.Common.GetReadingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReadingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LINEAR_VELOCITY = 0;
  private static final int METHODID_GET_ANGULAR_VELOCITY = 1;
  private static final int METHODID_GET_COMPASS_HEADING = 2;
  private static final int METHODID_GET_ORIENTATION = 3;
  private static final int METHODID_GET_POSITION = 4;
  private static final int METHODID_GET_PROPERTIES = 5;
  private static final int METHODID_GET_ACCURACY = 6;
  private static final int METHODID_GET_LINEAR_ACCELERATION = 7;
  private static final int METHODID_DO_COMMAND = 8;
  private static final int METHODID_GET_GEOMETRIES = 9;
  private static final int METHODID_GET_READINGS = 10;

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
        case METHODID_GET_LINEAR_VELOCITY:
          serviceImpl.getLinearVelocity((com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityResponse>) responseObserver);
          break;
        case METHODID_GET_ANGULAR_VELOCITY:
          serviceImpl.getAngularVelocity((com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityResponse>) responseObserver);
          break;
        case METHODID_GET_COMPASS_HEADING:
          serviceImpl.getCompassHeading((com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingResponse>) responseObserver);
          break;
        case METHODID_GET_ORIENTATION:
          serviceImpl.getOrientation((com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetOrientationResponse>) responseObserver);
          break;
        case METHODID_GET_POSITION:
          serviceImpl.getPosition((com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse>) responseObserver);
          break;
        case METHODID_GET_PROPERTIES:
          serviceImpl.getProperties((com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse>) responseObserver);
          break;
        case METHODID_GET_ACCURACY:
          serviceImpl.getAccuracy((com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse>) responseObserver);
          break;
        case METHODID_GET_LINEAR_ACCELERATION:
          serviceImpl.getLinearAcceleration((com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationResponse>) responseObserver);
          break;
        case METHODID_DO_COMMAND:
          serviceImpl.doCommand((com.viam.common.v1.Common.DoCommandRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse>) responseObserver);
          break;
        case METHODID_GET_GEOMETRIES:
          serviceImpl.getGeometries((com.viam.common.v1.Common.GetGeometriesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse>) responseObserver);
          break;
        case METHODID_GET_READINGS:
          serviceImpl.getReadings((com.viam.common.v1.Common.GetReadingsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetReadingsResponse>) responseObserver);
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
          getGetLinearVelocityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest,
              com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityResponse>(
                service, METHODID_GET_LINEAR_VELOCITY)))
        .addMethod(
          getGetAngularVelocityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest,
              com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityResponse>(
                service, METHODID_GET_ANGULAR_VELOCITY)))
        .addMethod(
          getGetCompassHeadingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest,
              com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingResponse>(
                service, METHODID_GET_COMPASS_HEADING)))
        .addMethod(
          getGetOrientationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest,
              com.viam.component.movementsensor.v1.Movementsensor.GetOrientationResponse>(
                service, METHODID_GET_ORIENTATION)))
        .addMethod(
          getGetPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest,
              com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse>(
                service, METHODID_GET_POSITION)))
        .addMethod(
          getGetPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest,
              com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse>(
                service, METHODID_GET_PROPERTIES)))
        .addMethod(
          getGetAccuracyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest,
              com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse>(
                service, METHODID_GET_ACCURACY)))
        .addMethod(
          getGetLinearAccelerationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest,
              com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationResponse>(
                service, METHODID_GET_LINEAR_ACCELERATION)))
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
        .addMethod(
          getGetReadingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.GetReadingsRequest,
              com.viam.common.v1.Common.GetReadingsResponse>(
                service, METHODID_GET_READINGS)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MovementSensorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetLinearVelocityMethod())
              .addMethod(getGetAngularVelocityMethod())
              .addMethod(getGetCompassHeadingMethod())
              .addMethod(getGetOrientationMethod())
              .addMethod(getGetPositionMethod())
              .addMethod(getGetPropertiesMethod())
              .addMethod(getGetAccuracyMethod())
              .addMethod(getGetLinearAccelerationMethod())
              .addMethod(getDoCommandMethod())
              .addMethod(getGetGeometriesMethod())
              .addMethod(getGetReadingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
