package com.viam.component.motor.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A MotorService maintains all motors associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: component/motor/v1/motor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MotorServiceGrpc {

  private MotorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.motor.v1.MotorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.SetPowerRequest,
      com.viam.component.motor.v1.Motor.SetPowerResponse> getSetPowerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPower",
      requestType = com.viam.component.motor.v1.Motor.SetPowerRequest.class,
      responseType = com.viam.component.motor.v1.Motor.SetPowerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.SetPowerRequest,
      com.viam.component.motor.v1.Motor.SetPowerResponse> getSetPowerMethod() {
    io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.SetPowerRequest, com.viam.component.motor.v1.Motor.SetPowerResponse> getSetPowerMethod;
    if ((getSetPowerMethod = MotorServiceGrpc.getSetPowerMethod) == null) {
      synchronized (MotorServiceGrpc.class) {
        if ((getSetPowerMethod = MotorServiceGrpc.getSetPowerMethod) == null) {
          MotorServiceGrpc.getSetPowerMethod = getSetPowerMethod =
              io.grpc.MethodDescriptor.<com.viam.component.motor.v1.Motor.SetPowerRequest, com.viam.component.motor.v1.Motor.SetPowerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPower"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.SetPowerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.SetPowerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetPowerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.GoForRequest,
      com.viam.component.motor.v1.Motor.GoForResponse> getGoForMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GoFor",
      requestType = com.viam.component.motor.v1.Motor.GoForRequest.class,
      responseType = com.viam.component.motor.v1.Motor.GoForResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.GoForRequest,
      com.viam.component.motor.v1.Motor.GoForResponse> getGoForMethod() {
    io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.GoForRequest, com.viam.component.motor.v1.Motor.GoForResponse> getGoForMethod;
    if ((getGoForMethod = MotorServiceGrpc.getGoForMethod) == null) {
      synchronized (MotorServiceGrpc.class) {
        if ((getGoForMethod = MotorServiceGrpc.getGoForMethod) == null) {
          MotorServiceGrpc.getGoForMethod = getGoForMethod =
              io.grpc.MethodDescriptor.<com.viam.component.motor.v1.Motor.GoForRequest, com.viam.component.motor.v1.Motor.GoForResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GoFor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.GoForRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.GoForResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGoForMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.GoToRequest,
      com.viam.component.motor.v1.Motor.GoToResponse> getGoToMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GoTo",
      requestType = com.viam.component.motor.v1.Motor.GoToRequest.class,
      responseType = com.viam.component.motor.v1.Motor.GoToResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.GoToRequest,
      com.viam.component.motor.v1.Motor.GoToResponse> getGoToMethod() {
    io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.GoToRequest, com.viam.component.motor.v1.Motor.GoToResponse> getGoToMethod;
    if ((getGoToMethod = MotorServiceGrpc.getGoToMethod) == null) {
      synchronized (MotorServiceGrpc.class) {
        if ((getGoToMethod = MotorServiceGrpc.getGoToMethod) == null) {
          MotorServiceGrpc.getGoToMethod = getGoToMethod =
              io.grpc.MethodDescriptor.<com.viam.component.motor.v1.Motor.GoToRequest, com.viam.component.motor.v1.Motor.GoToResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GoTo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.GoToRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.GoToResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGoToMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.SetRPMRequest,
      com.viam.component.motor.v1.Motor.SetRPMResponse> getSetRPMMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRPM",
      requestType = com.viam.component.motor.v1.Motor.SetRPMRequest.class,
      responseType = com.viam.component.motor.v1.Motor.SetRPMResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.SetRPMRequest,
      com.viam.component.motor.v1.Motor.SetRPMResponse> getSetRPMMethod() {
    io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.SetRPMRequest, com.viam.component.motor.v1.Motor.SetRPMResponse> getSetRPMMethod;
    if ((getSetRPMMethod = MotorServiceGrpc.getSetRPMMethod) == null) {
      synchronized (MotorServiceGrpc.class) {
        if ((getSetRPMMethod = MotorServiceGrpc.getSetRPMMethod) == null) {
          MotorServiceGrpc.getSetRPMMethod = getSetRPMMethod =
              io.grpc.MethodDescriptor.<com.viam.component.motor.v1.Motor.SetRPMRequest, com.viam.component.motor.v1.Motor.SetRPMResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRPM"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.SetRPMRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.SetRPMResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRPMMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.ResetZeroPositionRequest,
      com.viam.component.motor.v1.Motor.ResetZeroPositionResponse> getResetZeroPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetZeroPosition",
      requestType = com.viam.component.motor.v1.Motor.ResetZeroPositionRequest.class,
      responseType = com.viam.component.motor.v1.Motor.ResetZeroPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.ResetZeroPositionRequest,
      com.viam.component.motor.v1.Motor.ResetZeroPositionResponse> getResetZeroPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.ResetZeroPositionRequest, com.viam.component.motor.v1.Motor.ResetZeroPositionResponse> getResetZeroPositionMethod;
    if ((getResetZeroPositionMethod = MotorServiceGrpc.getResetZeroPositionMethod) == null) {
      synchronized (MotorServiceGrpc.class) {
        if ((getResetZeroPositionMethod = MotorServiceGrpc.getResetZeroPositionMethod) == null) {
          MotorServiceGrpc.getResetZeroPositionMethod = getResetZeroPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.component.motor.v1.Motor.ResetZeroPositionRequest, com.viam.component.motor.v1.Motor.ResetZeroPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetZeroPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.ResetZeroPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.ResetZeroPositionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getResetZeroPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.GetPositionRequest,
      com.viam.component.motor.v1.Motor.GetPositionResponse> getGetPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPosition",
      requestType = com.viam.component.motor.v1.Motor.GetPositionRequest.class,
      responseType = com.viam.component.motor.v1.Motor.GetPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.GetPositionRequest,
      com.viam.component.motor.v1.Motor.GetPositionResponse> getGetPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.GetPositionRequest, com.viam.component.motor.v1.Motor.GetPositionResponse> getGetPositionMethod;
    if ((getGetPositionMethod = MotorServiceGrpc.getGetPositionMethod) == null) {
      synchronized (MotorServiceGrpc.class) {
        if ((getGetPositionMethod = MotorServiceGrpc.getGetPositionMethod) == null) {
          MotorServiceGrpc.getGetPositionMethod = getGetPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.component.motor.v1.Motor.GetPositionRequest, com.viam.component.motor.v1.Motor.GetPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.GetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.GetPositionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.GetPropertiesRequest,
      com.viam.component.motor.v1.Motor.GetPropertiesResponse> getGetPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProperties",
      requestType = com.viam.component.motor.v1.Motor.GetPropertiesRequest.class,
      responseType = com.viam.component.motor.v1.Motor.GetPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.GetPropertiesRequest,
      com.viam.component.motor.v1.Motor.GetPropertiesResponse> getGetPropertiesMethod() {
    io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.GetPropertiesRequest, com.viam.component.motor.v1.Motor.GetPropertiesResponse> getGetPropertiesMethod;
    if ((getGetPropertiesMethod = MotorServiceGrpc.getGetPropertiesMethod) == null) {
      synchronized (MotorServiceGrpc.class) {
        if ((getGetPropertiesMethod = MotorServiceGrpc.getGetPropertiesMethod) == null) {
          MotorServiceGrpc.getGetPropertiesMethod = getGetPropertiesMethod =
              io.grpc.MethodDescriptor.<com.viam.component.motor.v1.Motor.GetPropertiesRequest, com.viam.component.motor.v1.Motor.GetPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.GetPropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.GetPropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.StopRequest,
      com.viam.component.motor.v1.Motor.StopResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = com.viam.component.motor.v1.Motor.StopRequest.class,
      responseType = com.viam.component.motor.v1.Motor.StopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.StopRequest,
      com.viam.component.motor.v1.Motor.StopResponse> getStopMethod() {
    io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.StopRequest, com.viam.component.motor.v1.Motor.StopResponse> getStopMethod;
    if ((getStopMethod = MotorServiceGrpc.getStopMethod) == null) {
      synchronized (MotorServiceGrpc.class) {
        if ((getStopMethod = MotorServiceGrpc.getStopMethod) == null) {
          MotorServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<com.viam.component.motor.v1.Motor.StopRequest, com.viam.component.motor.v1.Motor.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.StopResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.IsPoweredRequest,
      com.viam.component.motor.v1.Motor.IsPoweredResponse> getIsPoweredMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsPowered",
      requestType = com.viam.component.motor.v1.Motor.IsPoweredRequest.class,
      responseType = com.viam.component.motor.v1.Motor.IsPoweredResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.IsPoweredRequest,
      com.viam.component.motor.v1.Motor.IsPoweredResponse> getIsPoweredMethod() {
    io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.IsPoweredRequest, com.viam.component.motor.v1.Motor.IsPoweredResponse> getIsPoweredMethod;
    if ((getIsPoweredMethod = MotorServiceGrpc.getIsPoweredMethod) == null) {
      synchronized (MotorServiceGrpc.class) {
        if ((getIsPoweredMethod = MotorServiceGrpc.getIsPoweredMethod) == null) {
          MotorServiceGrpc.getIsPoweredMethod = getIsPoweredMethod =
              io.grpc.MethodDescriptor.<com.viam.component.motor.v1.Motor.IsPoweredRequest, com.viam.component.motor.v1.Motor.IsPoweredResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsPowered"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.IsPoweredRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.IsPoweredResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsPoweredMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.IsMovingRequest,
      com.viam.component.motor.v1.Motor.IsMovingResponse> getIsMovingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsMoving",
      requestType = com.viam.component.motor.v1.Motor.IsMovingRequest.class,
      responseType = com.viam.component.motor.v1.Motor.IsMovingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.IsMovingRequest,
      com.viam.component.motor.v1.Motor.IsMovingResponse> getIsMovingMethod() {
    io.grpc.MethodDescriptor<com.viam.component.motor.v1.Motor.IsMovingRequest, com.viam.component.motor.v1.Motor.IsMovingResponse> getIsMovingMethod;
    if ((getIsMovingMethod = MotorServiceGrpc.getIsMovingMethod) == null) {
      synchronized (MotorServiceGrpc.class) {
        if ((getIsMovingMethod = MotorServiceGrpc.getIsMovingMethod) == null) {
          MotorServiceGrpc.getIsMovingMethod = getIsMovingMethod =
              io.grpc.MethodDescriptor.<com.viam.component.motor.v1.Motor.IsMovingRequest, com.viam.component.motor.v1.Motor.IsMovingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsMoving"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.IsMovingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.component.motor.v1.Motor.IsMovingResponse.getDefaultInstance()))
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
    if ((getDoCommandMethod = MotorServiceGrpc.getDoCommandMethod) == null) {
      synchronized (MotorServiceGrpc.class) {
        if ((getDoCommandMethod = MotorServiceGrpc.getDoCommandMethod) == null) {
          MotorServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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
    if ((getGetGeometriesMethod = MotorServiceGrpc.getGetGeometriesMethod) == null) {
      synchronized (MotorServiceGrpc.class) {
        if ((getGetGeometriesMethod = MotorServiceGrpc.getGetGeometriesMethod) == null) {
          MotorServiceGrpc.getGetGeometriesMethod = getGetGeometriesMethod =
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
  public static MotorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MotorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MotorServiceStub>() {
        @java.lang.Override
        public MotorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MotorServiceStub(channel, callOptions);
        }
      };
    return MotorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MotorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MotorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MotorServiceBlockingStub>() {
        @java.lang.Override
        public MotorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MotorServiceBlockingStub(channel, callOptions);
        }
      };
    return MotorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MotorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MotorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MotorServiceFutureStub>() {
        @java.lang.Override
        public MotorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MotorServiceFutureStub(channel, callOptions);
        }
      };
    return MotorServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A MotorService maintains all motors associated with a robot
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * SetPower sets the percentage of the motor's total power that should be employed
     * expressed a value between -1 and 1 where negative values indicate a backwards
     * direction and positive values a forward direction
     * </pre>
     */
    default void setPower(com.viam.component.motor.v1.Motor.SetPowerRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.SetPowerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPowerMethod(), responseObserver);
    }

    /**
     * <pre>
     * GoFor instructs the motor to turn at a specified speed, which is expressed in RPM,
     * for a specified number of rotations relative to its starting position
     * This method will return an error if position reporting is not supported
     * If revolutions != 0, this will block until the number of revolutions has been completed or another operation comes in.
     * Deprecated: If revolutions is 0, this will run the motor at rpm indefinitely.
     * </pre>
     */
    default void goFor(com.viam.component.motor.v1.Motor.GoForRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.GoForResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGoForMethod(), responseObserver);
    }

    /**
     * <pre>
     * GoTo requests the robot's motor to move to a specific position that
     * is relative to its home position at a specified speed which is expressed in RPM
     * This method will return an error if position reporting is not supported
     * </pre>
     */
    default void goTo(com.viam.component.motor.v1.Motor.GoToRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.GoToResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGoToMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetRPM instructs the motor to move at the specified RPM indefinitely.
     * </pre>
     */
    default void setRPM(com.viam.component.motor.v1.Motor.SetRPMRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.SetRPMResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRPMMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResetZeroPosition sets the current position of the motor as the new zero position
     * This method will return an error if position reporting is not supported
     * </pre>
     */
    default void resetZeroPosition(com.viam.component.motor.v1.Motor.ResetZeroPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.ResetZeroPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetZeroPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Position reports the position of the robot's motor relative to its zero position
     * This method will return an error if position reporting is not supported
     * </pre>
     */
    default void getPosition(com.viam.component.motor.v1.Motor.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.GetPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProperties returns a message of booleans indicating which optional features the robot's motor supports
     * </pre>
     */
    default void getProperties(com.viam.component.motor.v1.Motor.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop turns the robot's motor off
     * </pre>
     */
    default void stop(com.viam.component.motor.v1.Motor.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.StopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * IsPowered returns true if the robot's motor is on
     * </pre>
     */
    default void isPowered(com.viam.component.motor.v1.Motor.IsPoweredRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.IsPoweredResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsPoweredMethod(), responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    default void isMoving(com.viam.component.motor.v1.Motor.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.IsMovingResponse> responseObserver) {
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
   * Base class for the server implementation of the service MotorService.
   * <pre>
   * A MotorService maintains all motors associated with a robot
   * </pre>
   */
  public static abstract class MotorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MotorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MotorService.
   * <pre>
   * A MotorService maintains all motors associated with a robot
   * </pre>
   */
  public static final class MotorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MotorServiceStub> {
    private MotorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MotorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * SetPower sets the percentage of the motor's total power that should be employed
     * expressed a value between -1 and 1 where negative values indicate a backwards
     * direction and positive values a forward direction
     * </pre>
     */
    public void setPower(com.viam.component.motor.v1.Motor.SetPowerRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.SetPowerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPowerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GoFor instructs the motor to turn at a specified speed, which is expressed in RPM,
     * for a specified number of rotations relative to its starting position
     * This method will return an error if position reporting is not supported
     * If revolutions != 0, this will block until the number of revolutions has been completed or another operation comes in.
     * Deprecated: If revolutions is 0, this will run the motor at rpm indefinitely.
     * </pre>
     */
    public void goFor(com.viam.component.motor.v1.Motor.GoForRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.GoForResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGoForMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GoTo requests the robot's motor to move to a specific position that
     * is relative to its home position at a specified speed which is expressed in RPM
     * This method will return an error if position reporting is not supported
     * </pre>
     */
    public void goTo(com.viam.component.motor.v1.Motor.GoToRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.GoToResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGoToMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetRPM instructs the motor to move at the specified RPM indefinitely.
     * </pre>
     */
    public void setRPM(com.viam.component.motor.v1.Motor.SetRPMRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.SetRPMResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRPMMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResetZeroPosition sets the current position of the motor as the new zero position
     * This method will return an error if position reporting is not supported
     * </pre>
     */
    public void resetZeroPosition(com.viam.component.motor.v1.Motor.ResetZeroPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.ResetZeroPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetZeroPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Position reports the position of the robot's motor relative to its zero position
     * This method will return an error if position reporting is not supported
     * </pre>
     */
    public void getPosition(com.viam.component.motor.v1.Motor.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.GetPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProperties returns a message of booleans indicating which optional features the robot's motor supports
     * </pre>
     */
    public void getProperties(com.viam.component.motor.v1.Motor.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop turns the robot's motor off
     * </pre>
     */
    public void stop(com.viam.component.motor.v1.Motor.StopRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.StopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IsPowered returns true if the robot's motor is on
     * </pre>
     */
    public void isPowered(com.viam.component.motor.v1.Motor.IsPoweredRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.IsPoweredResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsPoweredMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public void isMoving(com.viam.component.motor.v1.Motor.IsMovingRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.IsMovingResponse> responseObserver) {
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
   * A stub to allow clients to do synchronous rpc calls to service MotorService.
   * <pre>
   * A MotorService maintains all motors associated with a robot
   * </pre>
   */
  public static final class MotorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MotorServiceBlockingStub> {
    private MotorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MotorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * SetPower sets the percentage of the motor's total power that should be employed
     * expressed a value between -1 and 1 where negative values indicate a backwards
     * direction and positive values a forward direction
     * </pre>
     */
    public com.viam.component.motor.v1.Motor.SetPowerResponse setPower(com.viam.component.motor.v1.Motor.SetPowerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPowerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GoFor instructs the motor to turn at a specified speed, which is expressed in RPM,
     * for a specified number of rotations relative to its starting position
     * This method will return an error if position reporting is not supported
     * If revolutions != 0, this will block until the number of revolutions has been completed or another operation comes in.
     * Deprecated: If revolutions is 0, this will run the motor at rpm indefinitely.
     * </pre>
     */
    public com.viam.component.motor.v1.Motor.GoForResponse goFor(com.viam.component.motor.v1.Motor.GoForRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGoForMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GoTo requests the robot's motor to move to a specific position that
     * is relative to its home position at a specified speed which is expressed in RPM
     * This method will return an error if position reporting is not supported
     * </pre>
     */
    public com.viam.component.motor.v1.Motor.GoToResponse goTo(com.viam.component.motor.v1.Motor.GoToRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGoToMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetRPM instructs the motor to move at the specified RPM indefinitely.
     * </pre>
     */
    public com.viam.component.motor.v1.Motor.SetRPMResponse setRPM(com.viam.component.motor.v1.Motor.SetRPMRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRPMMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResetZeroPosition sets the current position of the motor as the new zero position
     * This method will return an error if position reporting is not supported
     * </pre>
     */
    public com.viam.component.motor.v1.Motor.ResetZeroPositionResponse resetZeroPosition(com.viam.component.motor.v1.Motor.ResetZeroPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetZeroPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Position reports the position of the robot's motor relative to its zero position
     * This method will return an error if position reporting is not supported
     * </pre>
     */
    public com.viam.component.motor.v1.Motor.GetPositionResponse getPosition(com.viam.component.motor.v1.Motor.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProperties returns a message of booleans indicating which optional features the robot's motor supports
     * </pre>
     */
    public com.viam.component.motor.v1.Motor.GetPropertiesResponse getProperties(com.viam.component.motor.v1.Motor.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop turns the robot's motor off
     * </pre>
     */
    public com.viam.component.motor.v1.Motor.StopResponse stop(com.viam.component.motor.v1.Motor.StopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IsPowered returns true if the robot's motor is on
     * </pre>
     */
    public com.viam.component.motor.v1.Motor.IsPoweredResponse isPowered(com.viam.component.motor.v1.Motor.IsPoweredRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsPoweredMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public com.viam.component.motor.v1.Motor.IsMovingResponse isMoving(com.viam.component.motor.v1.Motor.IsMovingRequest request) {
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MotorService.
   * <pre>
   * A MotorService maintains all motors associated with a robot
   * </pre>
   */
  public static final class MotorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MotorServiceFutureStub> {
    private MotorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MotorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * SetPower sets the percentage of the motor's total power that should be employed
     * expressed a value between -1 and 1 where negative values indicate a backwards
     * direction and positive values a forward direction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.motor.v1.Motor.SetPowerResponse> setPower(
        com.viam.component.motor.v1.Motor.SetPowerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPowerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GoFor instructs the motor to turn at a specified speed, which is expressed in RPM,
     * for a specified number of rotations relative to its starting position
     * This method will return an error if position reporting is not supported
     * If revolutions != 0, this will block until the number of revolutions has been completed or another operation comes in.
     * Deprecated: If revolutions is 0, this will run the motor at rpm indefinitely.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.motor.v1.Motor.GoForResponse> goFor(
        com.viam.component.motor.v1.Motor.GoForRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGoForMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GoTo requests the robot's motor to move to a specific position that
     * is relative to its home position at a specified speed which is expressed in RPM
     * This method will return an error if position reporting is not supported
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.motor.v1.Motor.GoToResponse> goTo(
        com.viam.component.motor.v1.Motor.GoToRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGoToMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetRPM instructs the motor to move at the specified RPM indefinitely.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.motor.v1.Motor.SetRPMResponse> setRPM(
        com.viam.component.motor.v1.Motor.SetRPMRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRPMMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResetZeroPosition sets the current position of the motor as the new zero position
     * This method will return an error if position reporting is not supported
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.motor.v1.Motor.ResetZeroPositionResponse> resetZeroPosition(
        com.viam.component.motor.v1.Motor.ResetZeroPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetZeroPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Position reports the position of the robot's motor relative to its zero position
     * This method will return an error if position reporting is not supported
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.motor.v1.Motor.GetPositionResponse> getPosition(
        com.viam.component.motor.v1.Motor.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProperties returns a message of booleans indicating which optional features the robot's motor supports
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.motor.v1.Motor.GetPropertiesResponse> getProperties(
        com.viam.component.motor.v1.Motor.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop turns the robot's motor off
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.motor.v1.Motor.StopResponse> stop(
        com.viam.component.motor.v1.Motor.StopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IsPowered returns true if the robot's motor is on
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.motor.v1.Motor.IsPoweredResponse> isPowered(
        com.viam.component.motor.v1.Motor.IsPoweredRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsPoweredMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IsMoving reports if a component is in motion
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.motor.v1.Motor.IsMovingResponse> isMoving(
        com.viam.component.motor.v1.Motor.IsMovingRequest request) {
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

  private static final int METHODID_SET_POWER = 0;
  private static final int METHODID_GO_FOR = 1;
  private static final int METHODID_GO_TO = 2;
  private static final int METHODID_SET_RPM = 3;
  private static final int METHODID_RESET_ZERO_POSITION = 4;
  private static final int METHODID_GET_POSITION = 5;
  private static final int METHODID_GET_PROPERTIES = 6;
  private static final int METHODID_STOP = 7;
  private static final int METHODID_IS_POWERED = 8;
  private static final int METHODID_IS_MOVING = 9;
  private static final int METHODID_DO_COMMAND = 10;
  private static final int METHODID_GET_GEOMETRIES = 11;

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
        case METHODID_SET_POWER:
          serviceImpl.setPower((com.viam.component.motor.v1.Motor.SetPowerRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.SetPowerResponse>) responseObserver);
          break;
        case METHODID_GO_FOR:
          serviceImpl.goFor((com.viam.component.motor.v1.Motor.GoForRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.GoForResponse>) responseObserver);
          break;
        case METHODID_GO_TO:
          serviceImpl.goTo((com.viam.component.motor.v1.Motor.GoToRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.GoToResponse>) responseObserver);
          break;
        case METHODID_SET_RPM:
          serviceImpl.setRPM((com.viam.component.motor.v1.Motor.SetRPMRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.SetRPMResponse>) responseObserver);
          break;
        case METHODID_RESET_ZERO_POSITION:
          serviceImpl.resetZeroPosition((com.viam.component.motor.v1.Motor.ResetZeroPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.ResetZeroPositionResponse>) responseObserver);
          break;
        case METHODID_GET_POSITION:
          serviceImpl.getPosition((com.viam.component.motor.v1.Motor.GetPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.GetPositionResponse>) responseObserver);
          break;
        case METHODID_GET_PROPERTIES:
          serviceImpl.getProperties((com.viam.component.motor.v1.Motor.GetPropertiesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.GetPropertiesResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((com.viam.component.motor.v1.Motor.StopRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.StopResponse>) responseObserver);
          break;
        case METHODID_IS_POWERED:
          serviceImpl.isPowered((com.viam.component.motor.v1.Motor.IsPoweredRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.IsPoweredResponse>) responseObserver);
          break;
        case METHODID_IS_MOVING:
          serviceImpl.isMoving((com.viam.component.motor.v1.Motor.IsMovingRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.motor.v1.Motor.IsMovingResponse>) responseObserver);
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
          getSetPowerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.motor.v1.Motor.SetPowerRequest,
              com.viam.component.motor.v1.Motor.SetPowerResponse>(
                service, METHODID_SET_POWER)))
        .addMethod(
          getGoForMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.motor.v1.Motor.GoForRequest,
              com.viam.component.motor.v1.Motor.GoForResponse>(
                service, METHODID_GO_FOR)))
        .addMethod(
          getGoToMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.motor.v1.Motor.GoToRequest,
              com.viam.component.motor.v1.Motor.GoToResponse>(
                service, METHODID_GO_TO)))
        .addMethod(
          getSetRPMMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.motor.v1.Motor.SetRPMRequest,
              com.viam.component.motor.v1.Motor.SetRPMResponse>(
                service, METHODID_SET_RPM)))
        .addMethod(
          getResetZeroPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.motor.v1.Motor.ResetZeroPositionRequest,
              com.viam.component.motor.v1.Motor.ResetZeroPositionResponse>(
                service, METHODID_RESET_ZERO_POSITION)))
        .addMethod(
          getGetPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.motor.v1.Motor.GetPositionRequest,
              com.viam.component.motor.v1.Motor.GetPositionResponse>(
                service, METHODID_GET_POSITION)))
        .addMethod(
          getGetPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.motor.v1.Motor.GetPropertiesRequest,
              com.viam.component.motor.v1.Motor.GetPropertiesResponse>(
                service, METHODID_GET_PROPERTIES)))
        .addMethod(
          getStopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.motor.v1.Motor.StopRequest,
              com.viam.component.motor.v1.Motor.StopResponse>(
                service, METHODID_STOP)))
        .addMethod(
          getIsPoweredMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.motor.v1.Motor.IsPoweredRequest,
              com.viam.component.motor.v1.Motor.IsPoweredResponse>(
                service, METHODID_IS_POWERED)))
        .addMethod(
          getIsMovingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.motor.v1.Motor.IsMovingRequest,
              com.viam.component.motor.v1.Motor.IsMovingResponse>(
                service, METHODID_IS_MOVING)))
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
      synchronized (MotorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSetPowerMethod())
              .addMethod(getGoForMethod())
              .addMethod(getGoToMethod())
              .addMethod(getSetRPMMethod())
              .addMethod(getResetZeroPositionMethod())
              .addMethod(getGetPositionMethod())
              .addMethod(getGetPropertiesMethod())
              .addMethod(getStopMethod())
              .addMethod(getIsPoweredMethod())
              .addMethod(getIsMovingMethod())
              .addMethod(getDoCommandMethod())
              .addMethod(getGetGeometriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
