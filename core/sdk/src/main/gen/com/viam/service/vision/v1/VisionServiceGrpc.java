package com.viam.service.vision.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * VisionService declares the gRPC contract for a vision service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: service/vision/v1/vision.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VisionServiceGrpc {

  private VisionServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.service.vision.v1.VisionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetModelParameterSchemaRequest,
      com.viam.service.vision.v1.Vision.GetModelParameterSchemaResponse> getGetModelParameterSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModelParameterSchema",
      requestType = com.viam.service.vision.v1.Vision.GetModelParameterSchemaRequest.class,
      responseType = com.viam.service.vision.v1.Vision.GetModelParameterSchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetModelParameterSchemaRequest,
      com.viam.service.vision.v1.Vision.GetModelParameterSchemaResponse> getGetModelParameterSchemaMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetModelParameterSchemaRequest, com.viam.service.vision.v1.Vision.GetModelParameterSchemaResponse> getGetModelParameterSchemaMethod;
    if ((getGetModelParameterSchemaMethod = VisionServiceGrpc.getGetModelParameterSchemaMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetModelParameterSchemaMethod = VisionServiceGrpc.getGetModelParameterSchemaMethod) == null) {
          VisionServiceGrpc.getGetModelParameterSchemaMethod = getGetModelParameterSchemaMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.GetModelParameterSchemaRequest, com.viam.service.vision.v1.Vision.GetModelParameterSchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModelParameterSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetModelParameterSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetModelParameterSchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("GetModelParameterSchema"))
              .build();
        }
      }
    }
    return getGetModelParameterSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetDetectorNamesRequest,
      com.viam.service.vision.v1.Vision.GetDetectorNamesResponse> getGetDetectorNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDetectorNames",
      requestType = com.viam.service.vision.v1.Vision.GetDetectorNamesRequest.class,
      responseType = com.viam.service.vision.v1.Vision.GetDetectorNamesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetDetectorNamesRequest,
      com.viam.service.vision.v1.Vision.GetDetectorNamesResponse> getGetDetectorNamesMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetDetectorNamesRequest, com.viam.service.vision.v1.Vision.GetDetectorNamesResponse> getGetDetectorNamesMethod;
    if ((getGetDetectorNamesMethod = VisionServiceGrpc.getGetDetectorNamesMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetDetectorNamesMethod = VisionServiceGrpc.getGetDetectorNamesMethod) == null) {
          VisionServiceGrpc.getGetDetectorNamesMethod = getGetDetectorNamesMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.GetDetectorNamesRequest, com.viam.service.vision.v1.Vision.GetDetectorNamesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDetectorNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetDetectorNamesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetDetectorNamesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("GetDetectorNames"))
              .build();
        }
      }
    }
    return getGetDetectorNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.AddDetectorRequest,
      com.viam.service.vision.v1.Vision.AddDetectorResponse> getAddDetectorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDetector",
      requestType = com.viam.service.vision.v1.Vision.AddDetectorRequest.class,
      responseType = com.viam.service.vision.v1.Vision.AddDetectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.AddDetectorRequest,
      com.viam.service.vision.v1.Vision.AddDetectorResponse> getAddDetectorMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.AddDetectorRequest, com.viam.service.vision.v1.Vision.AddDetectorResponse> getAddDetectorMethod;
    if ((getAddDetectorMethod = VisionServiceGrpc.getAddDetectorMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getAddDetectorMethod = VisionServiceGrpc.getAddDetectorMethod) == null) {
          VisionServiceGrpc.getAddDetectorMethod = getAddDetectorMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.AddDetectorRequest, com.viam.service.vision.v1.Vision.AddDetectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDetector"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.AddDetectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.AddDetectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("AddDetector"))
              .build();
        }
      }
    }
    return getAddDetectorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.RemoveDetectorRequest,
      com.viam.service.vision.v1.Vision.RemoveDetectorResponse> getRemoveDetectorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveDetector",
      requestType = com.viam.service.vision.v1.Vision.RemoveDetectorRequest.class,
      responseType = com.viam.service.vision.v1.Vision.RemoveDetectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.RemoveDetectorRequest,
      com.viam.service.vision.v1.Vision.RemoveDetectorResponse> getRemoveDetectorMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.RemoveDetectorRequest, com.viam.service.vision.v1.Vision.RemoveDetectorResponse> getRemoveDetectorMethod;
    if ((getRemoveDetectorMethod = VisionServiceGrpc.getRemoveDetectorMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getRemoveDetectorMethod = VisionServiceGrpc.getRemoveDetectorMethod) == null) {
          VisionServiceGrpc.getRemoveDetectorMethod = getRemoveDetectorMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.RemoveDetectorRequest, com.viam.service.vision.v1.Vision.RemoveDetectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveDetector"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.RemoveDetectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.RemoveDetectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("RemoveDetector"))
              .build();
        }
      }
    }
    return getRemoveDetectorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest,
      com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse> getGetDetectionsFromCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDetectionsFromCamera",
      requestType = com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest.class,
      responseType = com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest,
      com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse> getGetDetectionsFromCameraMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest, com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse> getGetDetectionsFromCameraMethod;
    if ((getGetDetectionsFromCameraMethod = VisionServiceGrpc.getGetDetectionsFromCameraMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetDetectionsFromCameraMethod = VisionServiceGrpc.getGetDetectionsFromCameraMethod) == null) {
          VisionServiceGrpc.getGetDetectionsFromCameraMethod = getGetDetectionsFromCameraMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest, com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDetectionsFromCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("GetDetectionsFromCamera"))
              .build();
        }
      }
    }
    return getGetDetectionsFromCameraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetDetectionsRequest,
      com.viam.service.vision.v1.Vision.GetDetectionsResponse> getGetDetectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDetections",
      requestType = com.viam.service.vision.v1.Vision.GetDetectionsRequest.class,
      responseType = com.viam.service.vision.v1.Vision.GetDetectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetDetectionsRequest,
      com.viam.service.vision.v1.Vision.GetDetectionsResponse> getGetDetectionsMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetDetectionsRequest, com.viam.service.vision.v1.Vision.GetDetectionsResponse> getGetDetectionsMethod;
    if ((getGetDetectionsMethod = VisionServiceGrpc.getGetDetectionsMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetDetectionsMethod = VisionServiceGrpc.getGetDetectionsMethod) == null) {
          VisionServiceGrpc.getGetDetectionsMethod = getGetDetectionsMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.GetDetectionsRequest, com.viam.service.vision.v1.Vision.GetDetectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDetections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetDetectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetDetectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("GetDetections"))
              .build();
        }
      }
    }
    return getGetDetectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetClassifierNamesRequest,
      com.viam.service.vision.v1.Vision.GetClassifierNamesResponse> getGetClassifierNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClassifierNames",
      requestType = com.viam.service.vision.v1.Vision.GetClassifierNamesRequest.class,
      responseType = com.viam.service.vision.v1.Vision.GetClassifierNamesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetClassifierNamesRequest,
      com.viam.service.vision.v1.Vision.GetClassifierNamesResponse> getGetClassifierNamesMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetClassifierNamesRequest, com.viam.service.vision.v1.Vision.GetClassifierNamesResponse> getGetClassifierNamesMethod;
    if ((getGetClassifierNamesMethod = VisionServiceGrpc.getGetClassifierNamesMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetClassifierNamesMethod = VisionServiceGrpc.getGetClassifierNamesMethod) == null) {
          VisionServiceGrpc.getGetClassifierNamesMethod = getGetClassifierNamesMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.GetClassifierNamesRequest, com.viam.service.vision.v1.Vision.GetClassifierNamesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClassifierNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetClassifierNamesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetClassifierNamesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("GetClassifierNames"))
              .build();
        }
      }
    }
    return getGetClassifierNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.AddClassifierRequest,
      com.viam.service.vision.v1.Vision.AddClassifierResponse> getAddClassifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddClassifier",
      requestType = com.viam.service.vision.v1.Vision.AddClassifierRequest.class,
      responseType = com.viam.service.vision.v1.Vision.AddClassifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.AddClassifierRequest,
      com.viam.service.vision.v1.Vision.AddClassifierResponse> getAddClassifierMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.AddClassifierRequest, com.viam.service.vision.v1.Vision.AddClassifierResponse> getAddClassifierMethod;
    if ((getAddClassifierMethod = VisionServiceGrpc.getAddClassifierMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getAddClassifierMethod = VisionServiceGrpc.getAddClassifierMethod) == null) {
          VisionServiceGrpc.getAddClassifierMethod = getAddClassifierMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.AddClassifierRequest, com.viam.service.vision.v1.Vision.AddClassifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddClassifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.AddClassifierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.AddClassifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("AddClassifier"))
              .build();
        }
      }
    }
    return getAddClassifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.RemoveClassifierRequest,
      com.viam.service.vision.v1.Vision.RemoveClassifierResponse> getRemoveClassifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveClassifier",
      requestType = com.viam.service.vision.v1.Vision.RemoveClassifierRequest.class,
      responseType = com.viam.service.vision.v1.Vision.RemoveClassifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.RemoveClassifierRequest,
      com.viam.service.vision.v1.Vision.RemoveClassifierResponse> getRemoveClassifierMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.RemoveClassifierRequest, com.viam.service.vision.v1.Vision.RemoveClassifierResponse> getRemoveClassifierMethod;
    if ((getRemoveClassifierMethod = VisionServiceGrpc.getRemoveClassifierMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getRemoveClassifierMethod = VisionServiceGrpc.getRemoveClassifierMethod) == null) {
          VisionServiceGrpc.getRemoveClassifierMethod = getRemoveClassifierMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.RemoveClassifierRequest, com.viam.service.vision.v1.Vision.RemoveClassifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveClassifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.RemoveClassifierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.RemoveClassifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("RemoveClassifier"))
              .build();
        }
      }
    }
    return getRemoveClassifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest,
      com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse> getGetClassificationsFromCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClassificationsFromCamera",
      requestType = com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest.class,
      responseType = com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest,
      com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse> getGetClassificationsFromCameraMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest, com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse> getGetClassificationsFromCameraMethod;
    if ((getGetClassificationsFromCameraMethod = VisionServiceGrpc.getGetClassificationsFromCameraMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetClassificationsFromCameraMethod = VisionServiceGrpc.getGetClassificationsFromCameraMethod) == null) {
          VisionServiceGrpc.getGetClassificationsFromCameraMethod = getGetClassificationsFromCameraMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest, com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClassificationsFromCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("GetClassificationsFromCamera"))
              .build();
        }
      }
    }
    return getGetClassificationsFromCameraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetClassificationsRequest,
      com.viam.service.vision.v1.Vision.GetClassificationsResponse> getGetClassificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClassifications",
      requestType = com.viam.service.vision.v1.Vision.GetClassificationsRequest.class,
      responseType = com.viam.service.vision.v1.Vision.GetClassificationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetClassificationsRequest,
      com.viam.service.vision.v1.Vision.GetClassificationsResponse> getGetClassificationsMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetClassificationsRequest, com.viam.service.vision.v1.Vision.GetClassificationsResponse> getGetClassificationsMethod;
    if ((getGetClassificationsMethod = VisionServiceGrpc.getGetClassificationsMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetClassificationsMethod = VisionServiceGrpc.getGetClassificationsMethod) == null) {
          VisionServiceGrpc.getGetClassificationsMethod = getGetClassificationsMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.GetClassificationsRequest, com.viam.service.vision.v1.Vision.GetClassificationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClassifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetClassificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetClassificationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("GetClassifications"))
              .build();
        }
      }
    }
    return getGetClassificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetSegmenterNamesRequest,
      com.viam.service.vision.v1.Vision.GetSegmenterNamesResponse> getGetSegmenterNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSegmenterNames",
      requestType = com.viam.service.vision.v1.Vision.GetSegmenterNamesRequest.class,
      responseType = com.viam.service.vision.v1.Vision.GetSegmenterNamesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetSegmenterNamesRequest,
      com.viam.service.vision.v1.Vision.GetSegmenterNamesResponse> getGetSegmenterNamesMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetSegmenterNamesRequest, com.viam.service.vision.v1.Vision.GetSegmenterNamesResponse> getGetSegmenterNamesMethod;
    if ((getGetSegmenterNamesMethod = VisionServiceGrpc.getGetSegmenterNamesMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetSegmenterNamesMethod = VisionServiceGrpc.getGetSegmenterNamesMethod) == null) {
          VisionServiceGrpc.getGetSegmenterNamesMethod = getGetSegmenterNamesMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.GetSegmenterNamesRequest, com.viam.service.vision.v1.Vision.GetSegmenterNamesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSegmenterNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetSegmenterNamesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetSegmenterNamesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("GetSegmenterNames"))
              .build();
        }
      }
    }
    return getGetSegmenterNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.AddSegmenterRequest,
      com.viam.service.vision.v1.Vision.AddSegmenterResponse> getAddSegmenterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSegmenter",
      requestType = com.viam.service.vision.v1.Vision.AddSegmenterRequest.class,
      responseType = com.viam.service.vision.v1.Vision.AddSegmenterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.AddSegmenterRequest,
      com.viam.service.vision.v1.Vision.AddSegmenterResponse> getAddSegmenterMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.AddSegmenterRequest, com.viam.service.vision.v1.Vision.AddSegmenterResponse> getAddSegmenterMethod;
    if ((getAddSegmenterMethod = VisionServiceGrpc.getAddSegmenterMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getAddSegmenterMethod = VisionServiceGrpc.getAddSegmenterMethod) == null) {
          VisionServiceGrpc.getAddSegmenterMethod = getAddSegmenterMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.AddSegmenterRequest, com.viam.service.vision.v1.Vision.AddSegmenterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSegmenter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.AddSegmenterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.AddSegmenterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("AddSegmenter"))
              .build();
        }
      }
    }
    return getAddSegmenterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.RemoveSegmenterRequest,
      com.viam.service.vision.v1.Vision.RemoveSegmenterResponse> getRemoveSegmenterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveSegmenter",
      requestType = com.viam.service.vision.v1.Vision.RemoveSegmenterRequest.class,
      responseType = com.viam.service.vision.v1.Vision.RemoveSegmenterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.RemoveSegmenterRequest,
      com.viam.service.vision.v1.Vision.RemoveSegmenterResponse> getRemoveSegmenterMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.RemoveSegmenterRequest, com.viam.service.vision.v1.Vision.RemoveSegmenterResponse> getRemoveSegmenterMethod;
    if ((getRemoveSegmenterMethod = VisionServiceGrpc.getRemoveSegmenterMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getRemoveSegmenterMethod = VisionServiceGrpc.getRemoveSegmenterMethod) == null) {
          VisionServiceGrpc.getRemoveSegmenterMethod = getRemoveSegmenterMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.RemoveSegmenterRequest, com.viam.service.vision.v1.Vision.RemoveSegmenterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveSegmenter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.RemoveSegmenterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.RemoveSegmenterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("RemoveSegmenter"))
              .build();
        }
      }
    }
    return getRemoveSegmenterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest,
      com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse> getGetObjectPointCloudsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectPointClouds",
      requestType = com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest.class,
      responseType = com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest,
      com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse> getGetObjectPointCloudsMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest, com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse> getGetObjectPointCloudsMethod;
    if ((getGetObjectPointCloudsMethod = VisionServiceGrpc.getGetObjectPointCloudsMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetObjectPointCloudsMethod = VisionServiceGrpc.getGetObjectPointCloudsMethod) == null) {
          VisionServiceGrpc.getGetObjectPointCloudsMethod = getGetObjectPointCloudsMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest, com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectPointClouds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("GetObjectPointClouds"))
              .build();
        }
      }
    }
    return getGetObjectPointCloudsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VisionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VisionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VisionServiceStub>() {
        @java.lang.Override
        public VisionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VisionServiceStub(channel, callOptions);
        }
      };
    return VisionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VisionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VisionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VisionServiceBlockingStub>() {
        @java.lang.Override
        public VisionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VisionServiceBlockingStub(channel, callOptions);
        }
      };
    return VisionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VisionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VisionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VisionServiceFutureStub>() {
        @java.lang.Override
        public VisionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VisionServiceFutureStub(channel, callOptions);
        }
      };
    return VisionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * VisionService declares the gRPC contract for a vision service
   * </pre>
   */
  public static abstract class VisionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetModelParameterSchema takes the model name and returns the parameters needed to add one to the vision registry.
     * </pre>
     */
    public void getModelParameterSchema(com.viam.service.vision.v1.Vision.GetModelParameterSchemaRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetModelParameterSchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModelParameterSchemaMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDetectorNames returns the list of detectors in the registry.
     * </pre>
     */
    public void getDetectorNames(com.viam.service.vision.v1.Vision.GetDetectorNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetDetectorNamesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDetectorNamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddDetector adds a new detector to the registry.
     * </pre>
     */
    public void addDetector(com.viam.service.vision.v1.Vision.AddDetectorRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.AddDetectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDetectorMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveDetector removes a detector from the registry.
     * </pre>
     */
    public void removeDetector(com.viam.service.vision.v1.Vision.RemoveDetectorRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.RemoveDetectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveDetectorMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDetectionsFromCamera will return a list of detections in the next image given a camera and a detector
     * </pre>
     */
    public void getDetectionsFromCamera(com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDetectionsFromCameraMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDetections will return a list of detections in the next image given the image bytes and a detector
     * </pre>
     */
    public void getDetections(com.viam.service.vision.v1.Vision.GetDetectionsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetDetectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDetectionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetClassifierNames returns the list of classifiers in the registry.
     * </pre>
     */
    public void getClassifierNames(com.viam.service.vision.v1.Vision.GetClassifierNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetClassifierNamesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClassifierNamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddClassifier adds a new classifier to the registry.
     * </pre>
     */
    public void addClassifier(com.viam.service.vision.v1.Vision.AddClassifierRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.AddClassifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddClassifierMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveClassifier adds a new classifier to the registry.
     * </pre>
     */
    public void removeClassifier(com.viam.service.vision.v1.Vision.RemoveClassifierRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.RemoveClassifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveClassifierMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetClassificationsFromCamera will return a list of classifications in the next image given a camera and a classifier
     * </pre>
     */
    public void getClassificationsFromCamera(com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClassificationsFromCameraMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetClassifications will return a list of classifications in the next image given the image bytes and a classifier
     * </pre>
     */
    public void getClassifications(com.viam.service.vision.v1.Vision.GetClassificationsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetClassificationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClassificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSegmenterNames returns the list of segmenters in the registry.
     * </pre>
     */
    public void getSegmenterNames(com.viam.service.vision.v1.Vision.GetSegmenterNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetSegmenterNamesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSegmenterNamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddSegmenter adds a new segmenter to the registry.
     * </pre>
     */
    public void addSegmenter(com.viam.service.vision.v1.Vision.AddSegmenterRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.AddSegmenterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSegmenterMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveSegmenter removes a segmenter from the registry.
     * </pre>
     */
    public void removeSegmenter(com.viam.service.vision.v1.Vision.RemoveSegmenterRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.RemoveSegmenterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveSegmenterMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectPointClouds returns all the found objects in a pointcloud from a camera of the underlying robot,
     * as well as the 3-vector center of each of the found objects.
     * A specific MIME type can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public void getObjectPointClouds(com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectPointCloudsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetModelParameterSchemaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.GetModelParameterSchemaRequest,
                com.viam.service.vision.v1.Vision.GetModelParameterSchemaResponse>(
                  this, METHODID_GET_MODEL_PARAMETER_SCHEMA)))
          .addMethod(
            getGetDetectorNamesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.GetDetectorNamesRequest,
                com.viam.service.vision.v1.Vision.GetDetectorNamesResponse>(
                  this, METHODID_GET_DETECTOR_NAMES)))
          .addMethod(
            getAddDetectorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.AddDetectorRequest,
                com.viam.service.vision.v1.Vision.AddDetectorResponse>(
                  this, METHODID_ADD_DETECTOR)))
          .addMethod(
            getRemoveDetectorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.RemoveDetectorRequest,
                com.viam.service.vision.v1.Vision.RemoveDetectorResponse>(
                  this, METHODID_REMOVE_DETECTOR)))
          .addMethod(
            getGetDetectionsFromCameraMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest,
                com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse>(
                  this, METHODID_GET_DETECTIONS_FROM_CAMERA)))
          .addMethod(
            getGetDetectionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.GetDetectionsRequest,
                com.viam.service.vision.v1.Vision.GetDetectionsResponse>(
                  this, METHODID_GET_DETECTIONS)))
          .addMethod(
            getGetClassifierNamesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.GetClassifierNamesRequest,
                com.viam.service.vision.v1.Vision.GetClassifierNamesResponse>(
                  this, METHODID_GET_CLASSIFIER_NAMES)))
          .addMethod(
            getAddClassifierMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.AddClassifierRequest,
                com.viam.service.vision.v1.Vision.AddClassifierResponse>(
                  this, METHODID_ADD_CLASSIFIER)))
          .addMethod(
            getRemoveClassifierMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.RemoveClassifierRequest,
                com.viam.service.vision.v1.Vision.RemoveClassifierResponse>(
                  this, METHODID_REMOVE_CLASSIFIER)))
          .addMethod(
            getGetClassificationsFromCameraMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest,
                com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse>(
                  this, METHODID_GET_CLASSIFICATIONS_FROM_CAMERA)))
          .addMethod(
            getGetClassificationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.GetClassificationsRequest,
                com.viam.service.vision.v1.Vision.GetClassificationsResponse>(
                  this, METHODID_GET_CLASSIFICATIONS)))
          .addMethod(
            getGetSegmenterNamesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.GetSegmenterNamesRequest,
                com.viam.service.vision.v1.Vision.GetSegmenterNamesResponse>(
                  this, METHODID_GET_SEGMENTER_NAMES)))
          .addMethod(
            getAddSegmenterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.AddSegmenterRequest,
                com.viam.service.vision.v1.Vision.AddSegmenterResponse>(
                  this, METHODID_ADD_SEGMENTER)))
          .addMethod(
            getRemoveSegmenterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.RemoveSegmenterRequest,
                com.viam.service.vision.v1.Vision.RemoveSegmenterResponse>(
                  this, METHODID_REMOVE_SEGMENTER)))
          .addMethod(
            getGetObjectPointCloudsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest,
                com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse>(
                  this, METHODID_GET_OBJECT_POINT_CLOUDS)))
          .build();
    }
  }

  /**
   * <pre>
   * VisionService declares the gRPC contract for a vision service
   * </pre>
   */
  public static final class VisionServiceStub extends io.grpc.stub.AbstractAsyncStub<VisionServiceStub> {
    private VisionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VisionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VisionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetModelParameterSchema takes the model name and returns the parameters needed to add one to the vision registry.
     * </pre>
     */
    public void getModelParameterSchema(com.viam.service.vision.v1.Vision.GetModelParameterSchemaRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetModelParameterSchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModelParameterSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDetectorNames returns the list of detectors in the registry.
     * </pre>
     */
    public void getDetectorNames(com.viam.service.vision.v1.Vision.GetDetectorNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetDetectorNamesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDetectorNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddDetector adds a new detector to the registry.
     * </pre>
     */
    public void addDetector(com.viam.service.vision.v1.Vision.AddDetectorRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.AddDetectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDetectorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveDetector removes a detector from the registry.
     * </pre>
     */
    public void removeDetector(com.viam.service.vision.v1.Vision.RemoveDetectorRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.RemoveDetectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveDetectorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDetectionsFromCamera will return a list of detections in the next image given a camera and a detector
     * </pre>
     */
    public void getDetectionsFromCamera(com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDetectionsFromCameraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDetections will return a list of detections in the next image given the image bytes and a detector
     * </pre>
     */
    public void getDetections(com.viam.service.vision.v1.Vision.GetDetectionsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetDetectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDetectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetClassifierNames returns the list of classifiers in the registry.
     * </pre>
     */
    public void getClassifierNames(com.viam.service.vision.v1.Vision.GetClassifierNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetClassifierNamesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClassifierNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddClassifier adds a new classifier to the registry.
     * </pre>
     */
    public void addClassifier(com.viam.service.vision.v1.Vision.AddClassifierRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.AddClassifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddClassifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveClassifier adds a new classifier to the registry.
     * </pre>
     */
    public void removeClassifier(com.viam.service.vision.v1.Vision.RemoveClassifierRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.RemoveClassifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveClassifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetClassificationsFromCamera will return a list of classifications in the next image given a camera and a classifier
     * </pre>
     */
    public void getClassificationsFromCamera(com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClassificationsFromCameraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetClassifications will return a list of classifications in the next image given the image bytes and a classifier
     * </pre>
     */
    public void getClassifications(com.viam.service.vision.v1.Vision.GetClassificationsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetClassificationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClassificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSegmenterNames returns the list of segmenters in the registry.
     * </pre>
     */
    public void getSegmenterNames(com.viam.service.vision.v1.Vision.GetSegmenterNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetSegmenterNamesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSegmenterNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddSegmenter adds a new segmenter to the registry.
     * </pre>
     */
    public void addSegmenter(com.viam.service.vision.v1.Vision.AddSegmenterRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.AddSegmenterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSegmenterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveSegmenter removes a segmenter from the registry.
     * </pre>
     */
    public void removeSegmenter(com.viam.service.vision.v1.Vision.RemoveSegmenterRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.RemoveSegmenterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveSegmenterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectPointClouds returns all the found objects in a pointcloud from a camera of the underlying robot,
     * as well as the 3-vector center of each of the found objects.
     * A specific MIME type can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public void getObjectPointClouds(com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectPointCloudsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * VisionService declares the gRPC contract for a vision service
   * </pre>
   */
  public static final class VisionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VisionServiceBlockingStub> {
    private VisionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VisionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VisionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetModelParameterSchema takes the model name and returns the parameters needed to add one to the vision registry.
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.GetModelParameterSchemaResponse getModelParameterSchema(com.viam.service.vision.v1.Vision.GetModelParameterSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModelParameterSchemaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDetectorNames returns the list of detectors in the registry.
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.GetDetectorNamesResponse getDetectorNames(com.viam.service.vision.v1.Vision.GetDetectorNamesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDetectorNamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddDetector adds a new detector to the registry.
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.AddDetectorResponse addDetector(com.viam.service.vision.v1.Vision.AddDetectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDetectorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveDetector removes a detector from the registry.
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.RemoveDetectorResponse removeDetector(com.viam.service.vision.v1.Vision.RemoveDetectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveDetectorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDetectionsFromCamera will return a list of detections in the next image given a camera and a detector
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse getDetectionsFromCamera(com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDetectionsFromCameraMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDetections will return a list of detections in the next image given the image bytes and a detector
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.GetDetectionsResponse getDetections(com.viam.service.vision.v1.Vision.GetDetectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDetectionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetClassifierNames returns the list of classifiers in the registry.
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.GetClassifierNamesResponse getClassifierNames(com.viam.service.vision.v1.Vision.GetClassifierNamesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClassifierNamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddClassifier adds a new classifier to the registry.
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.AddClassifierResponse addClassifier(com.viam.service.vision.v1.Vision.AddClassifierRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddClassifierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveClassifier adds a new classifier to the registry.
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.RemoveClassifierResponse removeClassifier(com.viam.service.vision.v1.Vision.RemoveClassifierRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveClassifierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetClassificationsFromCamera will return a list of classifications in the next image given a camera and a classifier
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse getClassificationsFromCamera(com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClassificationsFromCameraMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetClassifications will return a list of classifications in the next image given the image bytes and a classifier
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.GetClassificationsResponse getClassifications(com.viam.service.vision.v1.Vision.GetClassificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClassificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSegmenterNames returns the list of segmenters in the registry.
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.GetSegmenterNamesResponse getSegmenterNames(com.viam.service.vision.v1.Vision.GetSegmenterNamesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSegmenterNamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddSegmenter adds a new segmenter to the registry.
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.AddSegmenterResponse addSegmenter(com.viam.service.vision.v1.Vision.AddSegmenterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSegmenterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveSegmenter removes a segmenter from the registry.
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.RemoveSegmenterResponse removeSegmenter(com.viam.service.vision.v1.Vision.RemoveSegmenterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveSegmenterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectPointClouds returns all the found objects in a pointcloud from a camera of the underlying robot,
     * as well as the 3-vector center of each of the found objects.
     * A specific MIME type can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse getObjectPointClouds(com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectPointCloudsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * VisionService declares the gRPC contract for a vision service
   * </pre>
   */
  public static final class VisionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VisionServiceFutureStub> {
    private VisionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VisionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VisionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetModelParameterSchema takes the model name and returns the parameters needed to add one to the vision registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.GetModelParameterSchemaResponse> getModelParameterSchema(
        com.viam.service.vision.v1.Vision.GetModelParameterSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModelParameterSchemaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDetectorNames returns the list of detectors in the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.GetDetectorNamesResponse> getDetectorNames(
        com.viam.service.vision.v1.Vision.GetDetectorNamesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDetectorNamesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddDetector adds a new detector to the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.AddDetectorResponse> addDetector(
        com.viam.service.vision.v1.Vision.AddDetectorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDetectorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveDetector removes a detector from the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.RemoveDetectorResponse> removeDetector(
        com.viam.service.vision.v1.Vision.RemoveDetectorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveDetectorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDetectionsFromCamera will return a list of detections in the next image given a camera and a detector
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse> getDetectionsFromCamera(
        com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDetectionsFromCameraMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDetections will return a list of detections in the next image given the image bytes and a detector
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.GetDetectionsResponse> getDetections(
        com.viam.service.vision.v1.Vision.GetDetectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDetectionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetClassifierNames returns the list of classifiers in the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.GetClassifierNamesResponse> getClassifierNames(
        com.viam.service.vision.v1.Vision.GetClassifierNamesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClassifierNamesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddClassifier adds a new classifier to the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.AddClassifierResponse> addClassifier(
        com.viam.service.vision.v1.Vision.AddClassifierRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddClassifierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveClassifier adds a new classifier to the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.RemoveClassifierResponse> removeClassifier(
        com.viam.service.vision.v1.Vision.RemoveClassifierRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveClassifierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetClassificationsFromCamera will return a list of classifications in the next image given a camera and a classifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse> getClassificationsFromCamera(
        com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClassificationsFromCameraMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetClassifications will return a list of classifications in the next image given the image bytes and a classifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.GetClassificationsResponse> getClassifications(
        com.viam.service.vision.v1.Vision.GetClassificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClassificationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSegmenterNames returns the list of segmenters in the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.GetSegmenterNamesResponse> getSegmenterNames(
        com.viam.service.vision.v1.Vision.GetSegmenterNamesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSegmenterNamesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddSegmenter adds a new segmenter to the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.AddSegmenterResponse> addSegmenter(
        com.viam.service.vision.v1.Vision.AddSegmenterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSegmenterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveSegmenter removes a segmenter from the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.RemoveSegmenterResponse> removeSegmenter(
        com.viam.service.vision.v1.Vision.RemoveSegmenterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveSegmenterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectPointClouds returns all the found objects in a pointcloud from a camera of the underlying robot,
     * as well as the 3-vector center of each of the found objects.
     * A specific MIME type can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse> getObjectPointClouds(
        com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectPointCloudsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MODEL_PARAMETER_SCHEMA = 0;
  private static final int METHODID_GET_DETECTOR_NAMES = 1;
  private static final int METHODID_ADD_DETECTOR = 2;
  private static final int METHODID_REMOVE_DETECTOR = 3;
  private static final int METHODID_GET_DETECTIONS_FROM_CAMERA = 4;
  private static final int METHODID_GET_DETECTIONS = 5;
  private static final int METHODID_GET_CLASSIFIER_NAMES = 6;
  private static final int METHODID_ADD_CLASSIFIER = 7;
  private static final int METHODID_REMOVE_CLASSIFIER = 8;
  private static final int METHODID_GET_CLASSIFICATIONS_FROM_CAMERA = 9;
  private static final int METHODID_GET_CLASSIFICATIONS = 10;
  private static final int METHODID_GET_SEGMENTER_NAMES = 11;
  private static final int METHODID_ADD_SEGMENTER = 12;
  private static final int METHODID_REMOVE_SEGMENTER = 13;
  private static final int METHODID_GET_OBJECT_POINT_CLOUDS = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VisionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VisionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MODEL_PARAMETER_SCHEMA:
          serviceImpl.getModelParameterSchema((com.viam.service.vision.v1.Vision.GetModelParameterSchemaRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetModelParameterSchemaResponse>) responseObserver);
          break;
        case METHODID_GET_DETECTOR_NAMES:
          serviceImpl.getDetectorNames((com.viam.service.vision.v1.Vision.GetDetectorNamesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetDetectorNamesResponse>) responseObserver);
          break;
        case METHODID_ADD_DETECTOR:
          serviceImpl.addDetector((com.viam.service.vision.v1.Vision.AddDetectorRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.AddDetectorResponse>) responseObserver);
          break;
        case METHODID_REMOVE_DETECTOR:
          serviceImpl.removeDetector((com.viam.service.vision.v1.Vision.RemoveDetectorRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.RemoveDetectorResponse>) responseObserver);
          break;
        case METHODID_GET_DETECTIONS_FROM_CAMERA:
          serviceImpl.getDetectionsFromCamera((com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse>) responseObserver);
          break;
        case METHODID_GET_DETECTIONS:
          serviceImpl.getDetections((com.viam.service.vision.v1.Vision.GetDetectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetDetectionsResponse>) responseObserver);
          break;
        case METHODID_GET_CLASSIFIER_NAMES:
          serviceImpl.getClassifierNames((com.viam.service.vision.v1.Vision.GetClassifierNamesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetClassifierNamesResponse>) responseObserver);
          break;
        case METHODID_ADD_CLASSIFIER:
          serviceImpl.addClassifier((com.viam.service.vision.v1.Vision.AddClassifierRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.AddClassifierResponse>) responseObserver);
          break;
        case METHODID_REMOVE_CLASSIFIER:
          serviceImpl.removeClassifier((com.viam.service.vision.v1.Vision.RemoveClassifierRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.RemoveClassifierResponse>) responseObserver);
          break;
        case METHODID_GET_CLASSIFICATIONS_FROM_CAMERA:
          serviceImpl.getClassificationsFromCamera((com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse>) responseObserver);
          break;
        case METHODID_GET_CLASSIFICATIONS:
          serviceImpl.getClassifications((com.viam.service.vision.v1.Vision.GetClassificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetClassificationsResponse>) responseObserver);
          break;
        case METHODID_GET_SEGMENTER_NAMES:
          serviceImpl.getSegmenterNames((com.viam.service.vision.v1.Vision.GetSegmenterNamesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetSegmenterNamesResponse>) responseObserver);
          break;
        case METHODID_ADD_SEGMENTER:
          serviceImpl.addSegmenter((com.viam.service.vision.v1.Vision.AddSegmenterRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.AddSegmenterResponse>) responseObserver);
          break;
        case METHODID_REMOVE_SEGMENTER:
          serviceImpl.removeSegmenter((com.viam.service.vision.v1.Vision.RemoveSegmenterRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.RemoveSegmenterResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_POINT_CLOUDS:
          serviceImpl.getObjectPointClouds((com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse>) responseObserver);
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

  private static abstract class VisionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VisionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.service.vision.v1.Vision.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VisionService");
    }
  }

  private static final class VisionServiceFileDescriptorSupplier
      extends VisionServiceBaseDescriptorSupplier {
    VisionServiceFileDescriptorSupplier() {}
  }

  private static final class VisionServiceMethodDescriptorSupplier
      extends VisionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VisionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VisionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VisionServiceFileDescriptorSupplier())
              .addMethod(getGetModelParameterSchemaMethod())
              .addMethod(getGetDetectorNamesMethod())
              .addMethod(getAddDetectorMethod())
              .addMethod(getRemoveDetectorMethod())
              .addMethod(getGetDetectionsFromCameraMethod())
              .addMethod(getGetDetectionsMethod())
              .addMethod(getGetClassifierNamesMethod())
              .addMethod(getAddClassifierMethod())
              .addMethod(getRemoveClassifierMethod())
              .addMethod(getGetClassificationsFromCameraMethod())
              .addMethod(getGetClassificationsMethod())
              .addMethod(getGetSegmenterNamesMethod())
              .addMethod(getAddSegmenterMethod())
              .addMethod(getRemoveSegmenterMethod())
              .addMethod(getGetObjectPointCloudsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
