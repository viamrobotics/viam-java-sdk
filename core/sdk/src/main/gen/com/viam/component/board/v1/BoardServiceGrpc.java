package com.viam.component.board.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * BoardService services all Boards associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: component/board/v1/board.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BoardServiceGrpc {

  private BoardServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.component.board.v1.BoardService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.StatusRequest,
      com.viam.component.board.v1.Board.StatusResponse> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = com.viam.component.board.v1.Board.StatusRequest.class,
      responseType = com.viam.component.board.v1.Board.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.StatusRequest,
      com.viam.component.board.v1.Board.StatusResponse> getStatusMethod() {
    io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.StatusRequest, com.viam.component.board.v1.Board.StatusResponse> getStatusMethod;
    if ((getStatusMethod = BoardServiceGrpc.getStatusMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getStatusMethod = BoardServiceGrpc.getStatusMethod) == null) {
          BoardServiceGrpc.getStatusMethod = getStatusMethod =
              io.grpc.MethodDescriptor.<com.viam.component.board.v1.Board.StatusRequest, com.viam.component.board.v1.Board.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("Status"))
              .build();
        }
      }
    }
    return getStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.SetGPIORequest,
      com.viam.component.board.v1.Board.SetGPIOResponse> getSetGPIOMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetGPIO",
      requestType = com.viam.component.board.v1.Board.SetGPIORequest.class,
      responseType = com.viam.component.board.v1.Board.SetGPIOResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.SetGPIORequest,
      com.viam.component.board.v1.Board.SetGPIOResponse> getSetGPIOMethod() {
    io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.SetGPIORequest, com.viam.component.board.v1.Board.SetGPIOResponse> getSetGPIOMethod;
    if ((getSetGPIOMethod = BoardServiceGrpc.getSetGPIOMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getSetGPIOMethod = BoardServiceGrpc.getSetGPIOMethod) == null) {
          BoardServiceGrpc.getSetGPIOMethod = getSetGPIOMethod =
              io.grpc.MethodDescriptor.<com.viam.component.board.v1.Board.SetGPIORequest, com.viam.component.board.v1.Board.SetGPIOResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetGPIO"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.SetGPIORequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.SetGPIOResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("SetGPIO"))
              .build();
        }
      }
    }
    return getSetGPIOMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.GetGPIORequest,
      com.viam.component.board.v1.Board.GetGPIOResponse> getGetGPIOMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGPIO",
      requestType = com.viam.component.board.v1.Board.GetGPIORequest.class,
      responseType = com.viam.component.board.v1.Board.GetGPIOResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.GetGPIORequest,
      com.viam.component.board.v1.Board.GetGPIOResponse> getGetGPIOMethod() {
    io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.GetGPIORequest, com.viam.component.board.v1.Board.GetGPIOResponse> getGetGPIOMethod;
    if ((getGetGPIOMethod = BoardServiceGrpc.getGetGPIOMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getGetGPIOMethod = BoardServiceGrpc.getGetGPIOMethod) == null) {
          BoardServiceGrpc.getGetGPIOMethod = getGetGPIOMethod =
              io.grpc.MethodDescriptor.<com.viam.component.board.v1.Board.GetGPIORequest, com.viam.component.board.v1.Board.GetGPIOResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGPIO"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.GetGPIORequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.GetGPIOResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("GetGPIO"))
              .build();
        }
      }
    }
    return getGetGPIOMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.PWMRequest,
      com.viam.component.board.v1.Board.PWMResponse> getPWMMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PWM",
      requestType = com.viam.component.board.v1.Board.PWMRequest.class,
      responseType = com.viam.component.board.v1.Board.PWMResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.PWMRequest,
      com.viam.component.board.v1.Board.PWMResponse> getPWMMethod() {
    io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.PWMRequest, com.viam.component.board.v1.Board.PWMResponse> getPWMMethod;
    if ((getPWMMethod = BoardServiceGrpc.getPWMMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getPWMMethod = BoardServiceGrpc.getPWMMethod) == null) {
          BoardServiceGrpc.getPWMMethod = getPWMMethod =
              io.grpc.MethodDescriptor.<com.viam.component.board.v1.Board.PWMRequest, com.viam.component.board.v1.Board.PWMResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PWM"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.PWMRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.PWMResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("PWM"))
              .build();
        }
      }
    }
    return getPWMMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.SetPWMRequest,
      com.viam.component.board.v1.Board.SetPWMResponse> getSetPWMMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPWM",
      requestType = com.viam.component.board.v1.Board.SetPWMRequest.class,
      responseType = com.viam.component.board.v1.Board.SetPWMResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.SetPWMRequest,
      com.viam.component.board.v1.Board.SetPWMResponse> getSetPWMMethod() {
    io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.SetPWMRequest, com.viam.component.board.v1.Board.SetPWMResponse> getSetPWMMethod;
    if ((getSetPWMMethod = BoardServiceGrpc.getSetPWMMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getSetPWMMethod = BoardServiceGrpc.getSetPWMMethod) == null) {
          BoardServiceGrpc.getSetPWMMethod = getSetPWMMethod =
              io.grpc.MethodDescriptor.<com.viam.component.board.v1.Board.SetPWMRequest, com.viam.component.board.v1.Board.SetPWMResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPWM"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.SetPWMRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.SetPWMResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("SetPWM"))
              .build();
        }
      }
    }
    return getSetPWMMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.PWMFrequencyRequest,
      com.viam.component.board.v1.Board.PWMFrequencyResponse> getPWMFrequencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PWMFrequency",
      requestType = com.viam.component.board.v1.Board.PWMFrequencyRequest.class,
      responseType = com.viam.component.board.v1.Board.PWMFrequencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.PWMFrequencyRequest,
      com.viam.component.board.v1.Board.PWMFrequencyResponse> getPWMFrequencyMethod() {
    io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.PWMFrequencyRequest, com.viam.component.board.v1.Board.PWMFrequencyResponse> getPWMFrequencyMethod;
    if ((getPWMFrequencyMethod = BoardServiceGrpc.getPWMFrequencyMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getPWMFrequencyMethod = BoardServiceGrpc.getPWMFrequencyMethod) == null) {
          BoardServiceGrpc.getPWMFrequencyMethod = getPWMFrequencyMethod =
              io.grpc.MethodDescriptor.<com.viam.component.board.v1.Board.PWMFrequencyRequest, com.viam.component.board.v1.Board.PWMFrequencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PWMFrequency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.PWMFrequencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.PWMFrequencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("PWMFrequency"))
              .build();
        }
      }
    }
    return getPWMFrequencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.SetPWMFrequencyRequest,
      com.viam.component.board.v1.Board.SetPWMFrequencyResponse> getSetPWMFrequencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPWMFrequency",
      requestType = com.viam.component.board.v1.Board.SetPWMFrequencyRequest.class,
      responseType = com.viam.component.board.v1.Board.SetPWMFrequencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.SetPWMFrequencyRequest,
      com.viam.component.board.v1.Board.SetPWMFrequencyResponse> getSetPWMFrequencyMethod() {
    io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.SetPWMFrequencyRequest, com.viam.component.board.v1.Board.SetPWMFrequencyResponse> getSetPWMFrequencyMethod;
    if ((getSetPWMFrequencyMethod = BoardServiceGrpc.getSetPWMFrequencyMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getSetPWMFrequencyMethod = BoardServiceGrpc.getSetPWMFrequencyMethod) == null) {
          BoardServiceGrpc.getSetPWMFrequencyMethod = getSetPWMFrequencyMethod =
              io.grpc.MethodDescriptor.<com.viam.component.board.v1.Board.SetPWMFrequencyRequest, com.viam.component.board.v1.Board.SetPWMFrequencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPWMFrequency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.SetPWMFrequencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.SetPWMFrequencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("SetPWMFrequency"))
              .build();
        }
      }
    }
    return getSetPWMFrequencyMethod;
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
    if ((getDoCommandMethod = BoardServiceGrpc.getDoCommandMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getDoCommandMethod = BoardServiceGrpc.getDoCommandMethod) == null) {
          BoardServiceGrpc.getDoCommandMethod = getDoCommandMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.DoCommandRequest, com.viam.common.v1.Common.DoCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("DoCommand"))
              .build();
        }
      }
    }
    return getDoCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.ReadAnalogReaderRequest,
      com.viam.component.board.v1.Board.ReadAnalogReaderResponse> getReadAnalogReaderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadAnalogReader",
      requestType = com.viam.component.board.v1.Board.ReadAnalogReaderRequest.class,
      responseType = com.viam.component.board.v1.Board.ReadAnalogReaderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.ReadAnalogReaderRequest,
      com.viam.component.board.v1.Board.ReadAnalogReaderResponse> getReadAnalogReaderMethod() {
    io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.ReadAnalogReaderRequest, com.viam.component.board.v1.Board.ReadAnalogReaderResponse> getReadAnalogReaderMethod;
    if ((getReadAnalogReaderMethod = BoardServiceGrpc.getReadAnalogReaderMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getReadAnalogReaderMethod = BoardServiceGrpc.getReadAnalogReaderMethod) == null) {
          BoardServiceGrpc.getReadAnalogReaderMethod = getReadAnalogReaderMethod =
              io.grpc.MethodDescriptor.<com.viam.component.board.v1.Board.ReadAnalogReaderRequest, com.viam.component.board.v1.Board.ReadAnalogReaderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadAnalogReader"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.ReadAnalogReaderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.ReadAnalogReaderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("ReadAnalogReader"))
              .build();
        }
      }
    }
    return getReadAnalogReaderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.WriteAnalogRequest,
      com.viam.component.board.v1.Board.WriteAnalogResponse> getWriteAnalogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteAnalog",
      requestType = com.viam.component.board.v1.Board.WriteAnalogRequest.class,
      responseType = com.viam.component.board.v1.Board.WriteAnalogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.WriteAnalogRequest,
      com.viam.component.board.v1.Board.WriteAnalogResponse> getWriteAnalogMethod() {
    io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.WriteAnalogRequest, com.viam.component.board.v1.Board.WriteAnalogResponse> getWriteAnalogMethod;
    if ((getWriteAnalogMethod = BoardServiceGrpc.getWriteAnalogMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getWriteAnalogMethod = BoardServiceGrpc.getWriteAnalogMethod) == null) {
          BoardServiceGrpc.getWriteAnalogMethod = getWriteAnalogMethod =
              io.grpc.MethodDescriptor.<com.viam.component.board.v1.Board.WriteAnalogRequest, com.viam.component.board.v1.Board.WriteAnalogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteAnalog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.WriteAnalogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.WriteAnalogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("WriteAnalog"))
              .build();
        }
      }
    }
    return getWriteAnalogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.GetDigitalInterruptValueRequest,
      com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse> getGetDigitalInterruptValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDigitalInterruptValue",
      requestType = com.viam.component.board.v1.Board.GetDigitalInterruptValueRequest.class,
      responseType = com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.GetDigitalInterruptValueRequest,
      com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse> getGetDigitalInterruptValueMethod() {
    io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.GetDigitalInterruptValueRequest, com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse> getGetDigitalInterruptValueMethod;
    if ((getGetDigitalInterruptValueMethod = BoardServiceGrpc.getGetDigitalInterruptValueMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getGetDigitalInterruptValueMethod = BoardServiceGrpc.getGetDigitalInterruptValueMethod) == null) {
          BoardServiceGrpc.getGetDigitalInterruptValueMethod = getGetDigitalInterruptValueMethod =
              io.grpc.MethodDescriptor.<com.viam.component.board.v1.Board.GetDigitalInterruptValueRequest, com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDigitalInterruptValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.GetDigitalInterruptValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("GetDigitalInterruptValue"))
              .build();
        }
      }
    }
    return getGetDigitalInterruptValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.SetPowerModeRequest,
      com.viam.component.board.v1.Board.SetPowerModeResponse> getSetPowerModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPowerMode",
      requestType = com.viam.component.board.v1.Board.SetPowerModeRequest.class,
      responseType = com.viam.component.board.v1.Board.SetPowerModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.SetPowerModeRequest,
      com.viam.component.board.v1.Board.SetPowerModeResponse> getSetPowerModeMethod() {
    io.grpc.MethodDescriptor<com.viam.component.board.v1.Board.SetPowerModeRequest, com.viam.component.board.v1.Board.SetPowerModeResponse> getSetPowerModeMethod;
    if ((getSetPowerModeMethod = BoardServiceGrpc.getSetPowerModeMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getSetPowerModeMethod = BoardServiceGrpc.getSetPowerModeMethod) == null) {
          BoardServiceGrpc.getSetPowerModeMethod = getSetPowerModeMethod =
              io.grpc.MethodDescriptor.<com.viam.component.board.v1.Board.SetPowerModeRequest, com.viam.component.board.v1.Board.SetPowerModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPowerMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.SetPowerModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.board.v1.Board.SetPowerModeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("SetPowerMode"))
              .build();
        }
      }
    }
    return getSetPowerModeMethod;
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
    if ((getGetGeometriesMethod = BoardServiceGrpc.getGetGeometriesMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getGetGeometriesMethod = BoardServiceGrpc.getGetGeometriesMethod) == null) {
          BoardServiceGrpc.getGetGeometriesMethod = getGetGeometriesMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.GetGeometriesRequest, com.viam.common.v1.Common.GetGeometriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGeometries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.GetGeometriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.common.v1.Common.GetGeometriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("GetGeometries"))
              .build();
        }
      }
    }
    return getGetGeometriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BoardServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BoardServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BoardServiceStub>() {
        @java.lang.Override
        public BoardServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BoardServiceStub(channel, callOptions);
        }
      };
    return BoardServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BoardServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BoardServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BoardServiceBlockingStub>() {
        @java.lang.Override
        public BoardServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BoardServiceBlockingStub(channel, callOptions);
        }
      };
    return BoardServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BoardServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BoardServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BoardServiceFutureStub>() {
        @java.lang.Override
        public BoardServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BoardServiceFutureStub(channel, callOptions);
        }
      };
    return BoardServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * BoardService services all Boards associated with a robot
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void status(com.viam.component.board.v1.Board.StatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    /**
     */
    default void setGPIO(com.viam.component.board.v1.Board.SetGPIORequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.SetGPIOResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetGPIOMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetGPIO gets the high/low state of the given pin of a board of the underlying robot.
     * </pre>
     */
    default void getGPIO(com.viam.component.board.v1.Board.GetGPIORequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.GetGPIOResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGPIOMethod(), responseObserver);
    }

    /**
     * <pre>
     * PWM gets the duty cycle of the given pin of a board of the underlying robot.
     * </pre>
     */
    default void pWM(com.viam.component.board.v1.Board.PWMRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.PWMResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPWMMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetPWM sets the given pin of a board of the underlying robot to the given duty cycle.
     * </pre>
     */
    default void setPWM(com.viam.component.board.v1.Board.SetPWMRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.SetPWMResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPWMMethod(), responseObserver);
    }

    /**
     * <pre>
     * PWMFrequency gets the PWM frequency of the given pin of a board of the underlying robot.
     * </pre>
     */
    default void pWMFrequency(com.viam.component.board.v1.Board.PWMFrequencyRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.PWMFrequencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPWMFrequencyMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetPWMFrequency sets the given pin of a board of the underlying robot to the given PWM frequency. 0 will use the board's default PWM frequency.
     * </pre>
     */
    default void setPWMFrequency(com.viam.component.board.v1.Board.SetPWMFrequencyRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.SetPWMFrequencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPWMFrequencyMethod(), responseObserver);
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
     * ReadAnalogReader reads off the current value of an analog reader of a board of the underlying robot.
     * </pre>
     */
    default void readAnalogReader(com.viam.component.board.v1.Board.ReadAnalogReaderRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.ReadAnalogReaderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadAnalogReaderMethod(), responseObserver);
    }

    /**
     * <pre>
     * WriteAnalog writes the value to the analog writer of the board.
     * </pre>
     */
    default void writeAnalog(com.viam.component.board.v1.Board.WriteAnalogRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.WriteAnalogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteAnalogMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDigitalInterruptValue returns the current value of the interrupt which is based on the type of interrupt.
     * </pre>
     */
    default void getDigitalInterruptValue(com.viam.component.board.v1.Board.GetDigitalInterruptValueRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDigitalInterruptValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * `SetPowerMode` sets the power consumption mode of the board to the requested setting for the given duration.
     * </pre>
     */
    default void setPowerMode(com.viam.component.board.v1.Board.SetPowerModeRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.SetPowerModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPowerModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration.
     * </pre>
     */
    default void getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGeometriesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BoardService.
   * <pre>
   * BoardService services all Boards associated with a robot
   * </pre>
   */
  public static abstract class BoardServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BoardServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BoardService.
   * <pre>
   * BoardService services all Boards associated with a robot
   * </pre>
   */
  public static final class BoardServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BoardServiceStub> {
    private BoardServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BoardServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BoardServiceStub(channel, callOptions);
    }

    /**
     */
    public void status(com.viam.component.board.v1.Board.StatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setGPIO(com.viam.component.board.v1.Board.SetGPIORequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.SetGPIOResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetGPIOMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetGPIO gets the high/low state of the given pin of a board of the underlying robot.
     * </pre>
     */
    public void getGPIO(com.viam.component.board.v1.Board.GetGPIORequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.GetGPIOResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGPIOMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PWM gets the duty cycle of the given pin of a board of the underlying robot.
     * </pre>
     */
    public void pWM(com.viam.component.board.v1.Board.PWMRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.PWMResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPWMMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetPWM sets the given pin of a board of the underlying robot to the given duty cycle.
     * </pre>
     */
    public void setPWM(com.viam.component.board.v1.Board.SetPWMRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.SetPWMResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPWMMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PWMFrequency gets the PWM frequency of the given pin of a board of the underlying robot.
     * </pre>
     */
    public void pWMFrequency(com.viam.component.board.v1.Board.PWMFrequencyRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.PWMFrequencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPWMFrequencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetPWMFrequency sets the given pin of a board of the underlying robot to the given PWM frequency. 0 will use the board's default PWM frequency.
     * </pre>
     */
    public void setPWMFrequency(com.viam.component.board.v1.Board.SetPWMFrequencyRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.SetPWMFrequencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPWMFrequencyMethod(), getCallOptions()), request, responseObserver);
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
     * ReadAnalogReader reads off the current value of an analog reader of a board of the underlying robot.
     * </pre>
     */
    public void readAnalogReader(com.viam.component.board.v1.Board.ReadAnalogReaderRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.ReadAnalogReaderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadAnalogReaderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WriteAnalog writes the value to the analog writer of the board.
     * </pre>
     */
    public void writeAnalog(com.viam.component.board.v1.Board.WriteAnalogRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.WriteAnalogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteAnalogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDigitalInterruptValue returns the current value of the interrupt which is based on the type of interrupt.
     * </pre>
     */
    public void getDigitalInterruptValue(com.viam.component.board.v1.Board.GetDigitalInterruptValueRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDigitalInterruptValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * `SetPowerMode` sets the power consumption mode of the board to the requested setting for the given duration.
     * </pre>
     */
    public void setPowerMode(com.viam.component.board.v1.Board.SetPowerModeRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.SetPowerModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPowerModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration.
     * </pre>
     */
    public void getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGeometriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BoardService.
   * <pre>
   * BoardService services all Boards associated with a robot
   * </pre>
   */
  public static final class BoardServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BoardServiceBlockingStub> {
    private BoardServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BoardServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BoardServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.viam.component.board.v1.Board.StatusResponse status(com.viam.component.board.v1.Board.StatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.component.board.v1.Board.SetGPIOResponse setGPIO(com.viam.component.board.v1.Board.SetGPIORequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetGPIOMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetGPIO gets the high/low state of the given pin of a board of the underlying robot.
     * </pre>
     */
    public com.viam.component.board.v1.Board.GetGPIOResponse getGPIO(com.viam.component.board.v1.Board.GetGPIORequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGPIOMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PWM gets the duty cycle of the given pin of a board of the underlying robot.
     * </pre>
     */
    public com.viam.component.board.v1.Board.PWMResponse pWM(com.viam.component.board.v1.Board.PWMRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPWMMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetPWM sets the given pin of a board of the underlying robot to the given duty cycle.
     * </pre>
     */
    public com.viam.component.board.v1.Board.SetPWMResponse setPWM(com.viam.component.board.v1.Board.SetPWMRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPWMMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PWMFrequency gets the PWM frequency of the given pin of a board of the underlying robot.
     * </pre>
     */
    public com.viam.component.board.v1.Board.PWMFrequencyResponse pWMFrequency(com.viam.component.board.v1.Board.PWMFrequencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPWMFrequencyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetPWMFrequency sets the given pin of a board of the underlying robot to the given PWM frequency. 0 will use the board's default PWM frequency.
     * </pre>
     */
    public com.viam.component.board.v1.Board.SetPWMFrequencyResponse setPWMFrequency(com.viam.component.board.v1.Board.SetPWMFrequencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPWMFrequencyMethod(), getCallOptions(), request);
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
     * ReadAnalogReader reads off the current value of an analog reader of a board of the underlying robot.
     * </pre>
     */
    public com.viam.component.board.v1.Board.ReadAnalogReaderResponse readAnalogReader(com.viam.component.board.v1.Board.ReadAnalogReaderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadAnalogReaderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WriteAnalog writes the value to the analog writer of the board.
     * </pre>
     */
    public com.viam.component.board.v1.Board.WriteAnalogResponse writeAnalog(com.viam.component.board.v1.Board.WriteAnalogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteAnalogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDigitalInterruptValue returns the current value of the interrupt which is based on the type of interrupt.
     * </pre>
     */
    public com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse getDigitalInterruptValue(com.viam.component.board.v1.Board.GetDigitalInterruptValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDigitalInterruptValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * `SetPowerMode` sets the power consumption mode of the board to the requested setting for the given duration.
     * </pre>
     */
    public com.viam.component.board.v1.Board.SetPowerModeResponse setPowerMode(com.viam.component.board.v1.Board.SetPowerModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPowerModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration.
     * </pre>
     */
    public com.viam.common.v1.Common.GetGeometriesResponse getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGeometriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BoardService.
   * <pre>
   * BoardService services all Boards associated with a robot
   * </pre>
   */
  public static final class BoardServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BoardServiceFutureStub> {
    private BoardServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BoardServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BoardServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.board.v1.Board.StatusResponse> status(
        com.viam.component.board.v1.Board.StatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.board.v1.Board.SetGPIOResponse> setGPIO(
        com.viam.component.board.v1.Board.SetGPIORequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetGPIOMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetGPIO gets the high/low state of the given pin of a board of the underlying robot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.board.v1.Board.GetGPIOResponse> getGPIO(
        com.viam.component.board.v1.Board.GetGPIORequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGPIOMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PWM gets the duty cycle of the given pin of a board of the underlying robot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.board.v1.Board.PWMResponse> pWM(
        com.viam.component.board.v1.Board.PWMRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPWMMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetPWM sets the given pin of a board of the underlying robot to the given duty cycle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.board.v1.Board.SetPWMResponse> setPWM(
        com.viam.component.board.v1.Board.SetPWMRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPWMMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PWMFrequency gets the PWM frequency of the given pin of a board of the underlying robot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.board.v1.Board.PWMFrequencyResponse> pWMFrequency(
        com.viam.component.board.v1.Board.PWMFrequencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPWMFrequencyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetPWMFrequency sets the given pin of a board of the underlying robot to the given PWM frequency. 0 will use the board's default PWM frequency.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.board.v1.Board.SetPWMFrequencyResponse> setPWMFrequency(
        com.viam.component.board.v1.Board.SetPWMFrequencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPWMFrequencyMethod(), getCallOptions()), request);
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
     * ReadAnalogReader reads off the current value of an analog reader of a board of the underlying robot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.board.v1.Board.ReadAnalogReaderResponse> readAnalogReader(
        com.viam.component.board.v1.Board.ReadAnalogReaderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadAnalogReaderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WriteAnalog writes the value to the analog writer of the board.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.board.v1.Board.WriteAnalogResponse> writeAnalog(
        com.viam.component.board.v1.Board.WriteAnalogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteAnalogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDigitalInterruptValue returns the current value of the interrupt which is based on the type of interrupt.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse> getDigitalInterruptValue(
        com.viam.component.board.v1.Board.GetDigitalInterruptValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDigitalInterruptValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * `SetPowerMode` sets the power consumption mode of the board to the requested setting for the given duration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.board.v1.Board.SetPowerModeResponse> setPowerMode(
        com.viam.component.board.v1.Board.SetPowerModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPowerModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetGeometries returns the geometries of the component in their current configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.GetGeometriesResponse> getGeometries(
        com.viam.common.v1.Common.GetGeometriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGeometriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STATUS = 0;
  private static final int METHODID_SET_GPIO = 1;
  private static final int METHODID_GET_GPIO = 2;
  private static final int METHODID_PWM = 3;
  private static final int METHODID_SET_PWM = 4;
  private static final int METHODID_PWMFREQUENCY = 5;
  private static final int METHODID_SET_PWMFREQUENCY = 6;
  private static final int METHODID_DO_COMMAND = 7;
  private static final int METHODID_READ_ANALOG_READER = 8;
  private static final int METHODID_WRITE_ANALOG = 9;
  private static final int METHODID_GET_DIGITAL_INTERRUPT_VALUE = 10;
  private static final int METHODID_SET_POWER_MODE = 11;
  private static final int METHODID_GET_GEOMETRIES = 12;

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
        case METHODID_STATUS:
          serviceImpl.status((com.viam.component.board.v1.Board.StatusRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.StatusResponse>) responseObserver);
          break;
        case METHODID_SET_GPIO:
          serviceImpl.setGPIO((com.viam.component.board.v1.Board.SetGPIORequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.SetGPIOResponse>) responseObserver);
          break;
        case METHODID_GET_GPIO:
          serviceImpl.getGPIO((com.viam.component.board.v1.Board.GetGPIORequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.GetGPIOResponse>) responseObserver);
          break;
        case METHODID_PWM:
          serviceImpl.pWM((com.viam.component.board.v1.Board.PWMRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.PWMResponse>) responseObserver);
          break;
        case METHODID_SET_PWM:
          serviceImpl.setPWM((com.viam.component.board.v1.Board.SetPWMRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.SetPWMResponse>) responseObserver);
          break;
        case METHODID_PWMFREQUENCY:
          serviceImpl.pWMFrequency((com.viam.component.board.v1.Board.PWMFrequencyRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.PWMFrequencyResponse>) responseObserver);
          break;
        case METHODID_SET_PWMFREQUENCY:
          serviceImpl.setPWMFrequency((com.viam.component.board.v1.Board.SetPWMFrequencyRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.SetPWMFrequencyResponse>) responseObserver);
          break;
        case METHODID_DO_COMMAND:
          serviceImpl.doCommand((com.viam.common.v1.Common.DoCommandRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse>) responseObserver);
          break;
        case METHODID_READ_ANALOG_READER:
          serviceImpl.readAnalogReader((com.viam.component.board.v1.Board.ReadAnalogReaderRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.ReadAnalogReaderResponse>) responseObserver);
          break;
        case METHODID_WRITE_ANALOG:
          serviceImpl.writeAnalog((com.viam.component.board.v1.Board.WriteAnalogRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.WriteAnalogResponse>) responseObserver);
          break;
        case METHODID_GET_DIGITAL_INTERRUPT_VALUE:
          serviceImpl.getDigitalInterruptValue((com.viam.component.board.v1.Board.GetDigitalInterruptValueRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse>) responseObserver);
          break;
        case METHODID_SET_POWER_MODE:
          serviceImpl.setPowerMode((com.viam.component.board.v1.Board.SetPowerModeRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.board.v1.Board.SetPowerModeResponse>) responseObserver);
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
          getStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.board.v1.Board.StatusRequest,
              com.viam.component.board.v1.Board.StatusResponse>(
                service, METHODID_STATUS)))
        .addMethod(
          getSetGPIOMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.board.v1.Board.SetGPIORequest,
              com.viam.component.board.v1.Board.SetGPIOResponse>(
                service, METHODID_SET_GPIO)))
        .addMethod(
          getGetGPIOMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.board.v1.Board.GetGPIORequest,
              com.viam.component.board.v1.Board.GetGPIOResponse>(
                service, METHODID_GET_GPIO)))
        .addMethod(
          getPWMMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.board.v1.Board.PWMRequest,
              com.viam.component.board.v1.Board.PWMResponse>(
                service, METHODID_PWM)))
        .addMethod(
          getSetPWMMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.board.v1.Board.SetPWMRequest,
              com.viam.component.board.v1.Board.SetPWMResponse>(
                service, METHODID_SET_PWM)))
        .addMethod(
          getPWMFrequencyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.board.v1.Board.PWMFrequencyRequest,
              com.viam.component.board.v1.Board.PWMFrequencyResponse>(
                service, METHODID_PWMFREQUENCY)))
        .addMethod(
          getSetPWMFrequencyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.board.v1.Board.SetPWMFrequencyRequest,
              com.viam.component.board.v1.Board.SetPWMFrequencyResponse>(
                service, METHODID_SET_PWMFREQUENCY)))
        .addMethod(
          getDoCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.DoCommandRequest,
              com.viam.common.v1.Common.DoCommandResponse>(
                service, METHODID_DO_COMMAND)))
        .addMethod(
          getReadAnalogReaderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.board.v1.Board.ReadAnalogReaderRequest,
              com.viam.component.board.v1.Board.ReadAnalogReaderResponse>(
                service, METHODID_READ_ANALOG_READER)))
        .addMethod(
          getWriteAnalogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.board.v1.Board.WriteAnalogRequest,
              com.viam.component.board.v1.Board.WriteAnalogResponse>(
                service, METHODID_WRITE_ANALOG)))
        .addMethod(
          getGetDigitalInterruptValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.board.v1.Board.GetDigitalInterruptValueRequest,
              com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse>(
                service, METHODID_GET_DIGITAL_INTERRUPT_VALUE)))
        .addMethod(
          getSetPowerModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.component.board.v1.Board.SetPowerModeRequest,
              com.viam.component.board.v1.Board.SetPowerModeResponse>(
                service, METHODID_SET_POWER_MODE)))
        .addMethod(
          getGetGeometriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.GetGeometriesRequest,
              com.viam.common.v1.Common.GetGeometriesResponse>(
                service, METHODID_GET_GEOMETRIES)))
        .build();
  }

  private static abstract class BoardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BoardServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.component.board.v1.Board.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BoardService");
    }
  }

  private static final class BoardServiceFileDescriptorSupplier
      extends BoardServiceBaseDescriptorSupplier {
    BoardServiceFileDescriptorSupplier() {}
  }

  private static final class BoardServiceMethodDescriptorSupplier
      extends BoardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BoardServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BoardServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BoardServiceFileDescriptorSupplier())
              .addMethod(getStatusMethod())
              .addMethod(getSetGPIOMethod())
              .addMethod(getGetGPIOMethod())
              .addMethod(getPWMMethod())
              .addMethod(getSetPWMMethod())
              .addMethod(getPWMFrequencyMethod())
              .addMethod(getSetPWMFrequencyMethod())
              .addMethod(getDoCommandMethod())
              .addMethod(getReadAnalogReaderMethod())
              .addMethod(getWriteAnalogMethod())
              .addMethod(getGetDigitalInterruptValueMethod())
              .addMethod(getSetPowerModeMethod())
              .addMethod(getGetGeometriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
