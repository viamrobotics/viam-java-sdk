package com.viam.service.vision.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * VisionService declares the gRPC contract for a vision service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: service/vision/v1/vision.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VisionServiceGrpc {

  private VisionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.service.vision.v1.VisionService";

  // Static method descriptors that strictly reflect the proto.
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetDetectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetDetectionsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetDetectionsMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetClassificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetClassificationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetClassificationsMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetObjectPointCloudsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetPropertiesRequest,
      com.viam.service.vision.v1.Vision.GetPropertiesResponse> getGetPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProperties",
      requestType = com.viam.service.vision.v1.Vision.GetPropertiesRequest.class,
      responseType = com.viam.service.vision.v1.Vision.GetPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetPropertiesRequest,
      com.viam.service.vision.v1.Vision.GetPropertiesResponse> getGetPropertiesMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.GetPropertiesRequest, com.viam.service.vision.v1.Vision.GetPropertiesResponse> getGetPropertiesMethod;
    if ((getGetPropertiesMethod = VisionServiceGrpc.getGetPropertiesMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetPropertiesMethod = VisionServiceGrpc.getGetPropertiesMethod) == null) {
          VisionServiceGrpc.getGetPropertiesMethod = getGetPropertiesMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.GetPropertiesRequest, com.viam.service.vision.v1.Vision.GetPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetPropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.GetPropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.CaptureAllFromCameraRequest,
      com.viam.service.vision.v1.Vision.CaptureAllFromCameraResponse> getCaptureAllFromCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CaptureAllFromCamera",
      requestType = com.viam.service.vision.v1.Vision.CaptureAllFromCameraRequest.class,
      responseType = com.viam.service.vision.v1.Vision.CaptureAllFromCameraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.CaptureAllFromCameraRequest,
      com.viam.service.vision.v1.Vision.CaptureAllFromCameraResponse> getCaptureAllFromCameraMethod() {
    io.grpc.MethodDescriptor<com.viam.service.vision.v1.Vision.CaptureAllFromCameraRequest, com.viam.service.vision.v1.Vision.CaptureAllFromCameraResponse> getCaptureAllFromCameraMethod;
    if ((getCaptureAllFromCameraMethod = VisionServiceGrpc.getCaptureAllFromCameraMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getCaptureAllFromCameraMethod = VisionServiceGrpc.getCaptureAllFromCameraMethod) == null) {
          VisionServiceGrpc.getCaptureAllFromCameraMethod = getCaptureAllFromCameraMethod =
              io.grpc.MethodDescriptor.<com.viam.service.vision.v1.Vision.CaptureAllFromCameraRequest, com.viam.service.vision.v1.Vision.CaptureAllFromCameraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CaptureAllFromCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.CaptureAllFromCameraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.vision.v1.Vision.CaptureAllFromCameraResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCaptureAllFromCameraMethod;
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
    if ((getDoCommandMethod = VisionServiceGrpc.getDoCommandMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getDoCommandMethod = VisionServiceGrpc.getDoCommandMethod) == null) {
          VisionServiceGrpc.getDoCommandMethod = getDoCommandMethod =
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
  public interface AsyncService {

    /**
     * <pre>
     * GetDetectionsFromCamera will return a list of detections in the next image given a camera and a detector
     * </pre>
     */
    default void getDetectionsFromCamera(com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDetectionsFromCameraMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDetections will return a list of detections in the next image given the image bytes and a detector
     * </pre>
     */
    default void getDetections(com.viam.service.vision.v1.Vision.GetDetectionsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetDetectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDetectionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetClassificationsFromCamera will return a list of classifications in the next image given a camera and a classifier
     * </pre>
     */
    default void getClassificationsFromCamera(com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClassificationsFromCameraMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetClassifications will return a list of classifications in the next image given the image bytes and a classifier
     * </pre>
     */
    default void getClassifications(com.viam.service.vision.v1.Vision.GetClassificationsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetClassificationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClassificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectPointClouds returns all the found objects in a pointcloud from a camera of the underlying robot,
     * as well as the 3-vector center of each of the found objects.
     * A specific MIME type can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    default void getObjectPointClouds(com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectPointCloudsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProperties will return the properties as booleans given the name of the vision service
     * </pre>
     */
    default void getProperties(com.viam.service.vision.v1.Vision.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPropertiesMethod(), responseObserver);
    }

    /**
     */
    default void captureAllFromCamera(com.viam.service.vision.v1.Vision.CaptureAllFromCameraRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.CaptureAllFromCameraResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCaptureAllFromCameraMethod(), responseObserver);
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
   * Base class for the server implementation of the service VisionService.
   * <pre>
   * VisionService declares the gRPC contract for a vision service
   * </pre>
   */
  public static abstract class VisionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VisionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VisionService.
   * <pre>
   * VisionService declares the gRPC contract for a vision service
   * </pre>
   */
  public static final class VisionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VisionServiceStub> {
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

    /**
     * <pre>
     * GetProperties will return the properties as booleans given the name of the vision service
     * </pre>
     */
    public void getProperties(com.viam.service.vision.v1.Vision.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void captureAllFromCamera(com.viam.service.vision.v1.Vision.CaptureAllFromCameraRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.CaptureAllFromCameraResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCaptureAllFromCameraMethod(), getCallOptions()), request, responseObserver);
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
   * A stub to allow clients to do synchronous rpc calls to service VisionService.
   * <pre>
   * VisionService declares the gRPC contract for a vision service
   * </pre>
   */
  public static final class VisionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VisionServiceBlockingStub> {
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
     * GetObjectPointClouds returns all the found objects in a pointcloud from a camera of the underlying robot,
     * as well as the 3-vector center of each of the found objects.
     * A specific MIME type can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse getObjectPointClouds(com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectPointCloudsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProperties will return the properties as booleans given the name of the vision service
     * </pre>
     */
    public com.viam.service.vision.v1.Vision.GetPropertiesResponse getProperties(com.viam.service.vision.v1.Vision.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPropertiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.viam.service.vision.v1.Vision.CaptureAllFromCameraResponse captureAllFromCamera(com.viam.service.vision.v1.Vision.CaptureAllFromCameraRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCaptureAllFromCameraMethod(), getCallOptions(), request);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VisionService.
   * <pre>
   * VisionService declares the gRPC contract for a vision service
   * </pre>
   */
  public static final class VisionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VisionServiceFutureStub> {
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

    /**
     * <pre>
     * GetProperties will return the properties as booleans given the name of the vision service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.GetPropertiesResponse> getProperties(
        com.viam.service.vision.v1.Vision.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.vision.v1.Vision.CaptureAllFromCameraResponse> captureAllFromCamera(
        com.viam.service.vision.v1.Vision.CaptureAllFromCameraRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCaptureAllFromCameraMethod(), getCallOptions()), request);
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

  private static final int METHODID_GET_DETECTIONS_FROM_CAMERA = 0;
  private static final int METHODID_GET_DETECTIONS = 1;
  private static final int METHODID_GET_CLASSIFICATIONS_FROM_CAMERA = 2;
  private static final int METHODID_GET_CLASSIFICATIONS = 3;
  private static final int METHODID_GET_OBJECT_POINT_CLOUDS = 4;
  private static final int METHODID_GET_PROPERTIES = 5;
  private static final int METHODID_CAPTURE_ALL_FROM_CAMERA = 6;
  private static final int METHODID_DO_COMMAND = 7;

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
        case METHODID_GET_DETECTIONS_FROM_CAMERA:
          serviceImpl.getDetectionsFromCamera((com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse>) responseObserver);
          break;
        case METHODID_GET_DETECTIONS:
          serviceImpl.getDetections((com.viam.service.vision.v1.Vision.GetDetectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetDetectionsResponse>) responseObserver);
          break;
        case METHODID_GET_CLASSIFICATIONS_FROM_CAMERA:
          serviceImpl.getClassificationsFromCamera((com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse>) responseObserver);
          break;
        case METHODID_GET_CLASSIFICATIONS:
          serviceImpl.getClassifications((com.viam.service.vision.v1.Vision.GetClassificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetClassificationsResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_POINT_CLOUDS:
          serviceImpl.getObjectPointClouds((com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse>) responseObserver);
          break;
        case METHODID_GET_PROPERTIES:
          serviceImpl.getProperties((com.viam.service.vision.v1.Vision.GetPropertiesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.GetPropertiesResponse>) responseObserver);
          break;
        case METHODID_CAPTURE_ALL_FROM_CAMERA:
          serviceImpl.captureAllFromCamera((com.viam.service.vision.v1.Vision.CaptureAllFromCameraRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.vision.v1.Vision.CaptureAllFromCameraResponse>) responseObserver);
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
          getGetDetectionsFromCameraMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.vision.v1.Vision.GetDetectionsFromCameraRequest,
              com.viam.service.vision.v1.Vision.GetDetectionsFromCameraResponse>(
                service, METHODID_GET_DETECTIONS_FROM_CAMERA)))
        .addMethod(
          getGetDetectionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.vision.v1.Vision.GetDetectionsRequest,
              com.viam.service.vision.v1.Vision.GetDetectionsResponse>(
                service, METHODID_GET_DETECTIONS)))
        .addMethod(
          getGetClassificationsFromCameraMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.vision.v1.Vision.GetClassificationsFromCameraRequest,
              com.viam.service.vision.v1.Vision.GetClassificationsFromCameraResponse>(
                service, METHODID_GET_CLASSIFICATIONS_FROM_CAMERA)))
        .addMethod(
          getGetClassificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.vision.v1.Vision.GetClassificationsRequest,
              com.viam.service.vision.v1.Vision.GetClassificationsResponse>(
                service, METHODID_GET_CLASSIFICATIONS)))
        .addMethod(
          getGetObjectPointCloudsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.vision.v1.Vision.GetObjectPointCloudsRequest,
              com.viam.service.vision.v1.Vision.GetObjectPointCloudsResponse>(
                service, METHODID_GET_OBJECT_POINT_CLOUDS)))
        .addMethod(
          getGetPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.vision.v1.Vision.GetPropertiesRequest,
              com.viam.service.vision.v1.Vision.GetPropertiesResponse>(
                service, METHODID_GET_PROPERTIES)))
        .addMethod(
          getCaptureAllFromCameraMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.vision.v1.Vision.CaptureAllFromCameraRequest,
              com.viam.service.vision.v1.Vision.CaptureAllFromCameraResponse>(
                service, METHODID_CAPTURE_ALL_FROM_CAMERA)))
        .addMethod(
          getDoCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.DoCommandRequest,
              com.viam.common.v1.Common.DoCommandResponse>(
                service, METHODID_DO_COMMAND)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (VisionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetDetectionsFromCameraMethod())
              .addMethod(getGetDetectionsMethod())
              .addMethod(getGetClassificationsFromCameraMethod())
              .addMethod(getGetClassificationsMethod())
              .addMethod(getGetObjectPointCloudsMethod())
              .addMethod(getGetPropertiesMethod())
              .addMethod(getCaptureAllFromCameraMethod())
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
