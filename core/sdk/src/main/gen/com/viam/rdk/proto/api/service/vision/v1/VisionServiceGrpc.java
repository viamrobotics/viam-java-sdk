package com.viam.rdk.proto.api.service.vision.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * VisionService declares the gRPC contract for a vision service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/api/service/vision/v1/vision.proto")
public final class VisionServiceGrpc {

  private VisionServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.api.service.vision.v1.VisionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesRequest,
      com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesResponse> getGetDetectorNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDetectorNames",
      requestType = com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesRequest.class,
      responseType = com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesRequest,
      com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesResponse> getGetDetectorNamesMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesRequest, com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesResponse> getGetDetectorNamesMethod;
    if ((getGetDetectorNamesMethod = VisionServiceGrpc.getGetDetectorNamesMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetDetectorNamesMethod = VisionServiceGrpc.getGetDetectorNamesMethod) == null) {
          VisionServiceGrpc.getGetDetectorNamesMethod = getGetDetectorNamesMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesRequest, com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDetectorNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("GetDetectorNames"))
              .build();
        }
      }
    }
    return getGetDetectorNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorRequest,
      com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorResponse> getAddDetectorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDetector",
      requestType = com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorRequest.class,
      responseType = com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorRequest,
      com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorResponse> getAddDetectorMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorRequest, com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorResponse> getAddDetectorMethod;
    if ((getAddDetectorMethod = VisionServiceGrpc.getAddDetectorMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getAddDetectorMethod = VisionServiceGrpc.getAddDetectorMethod) == null) {
          VisionServiceGrpc.getAddDetectorMethod = getAddDetectorMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorRequest, com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDetector"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("AddDetector"))
              .build();
        }
      }
    }
    return getAddDetectorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsRequest,
      com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsResponse> getGetDetectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDetections",
      requestType = com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsRequest.class,
      responseType = com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsRequest,
      com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsResponse> getGetDetectionsMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsRequest, com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsResponse> getGetDetectionsMethod;
    if ((getGetDetectionsMethod = VisionServiceGrpc.getGetDetectionsMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetDetectionsMethod = VisionServiceGrpc.getGetDetectionsMethod) == null) {
          VisionServiceGrpc.getGetDetectionsMethod = getGetDetectionsMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsRequest, com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDetections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("GetDetections"))
              .build();
        }
      }
    }
    return getGetDetectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesRequest,
      com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesResponse> getGetSegmenterNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSegmenterNames",
      requestType = com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesRequest.class,
      responseType = com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesRequest,
      com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesResponse> getGetSegmenterNamesMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesRequest, com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesResponse> getGetSegmenterNamesMethod;
    if ((getGetSegmenterNamesMethod = VisionServiceGrpc.getGetSegmenterNamesMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetSegmenterNamesMethod = VisionServiceGrpc.getGetSegmenterNamesMethod) == null) {
          VisionServiceGrpc.getGetSegmenterNamesMethod = getGetSegmenterNamesMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesRequest, com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSegmenterNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("GetSegmenterNames"))
              .build();
        }
      }
    }
    return getGetSegmenterNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersRequest,
      com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersResponse> getGetSegmenterParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSegmenterParameters",
      requestType = com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersRequest.class,
      responseType = com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersRequest,
      com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersResponse> getGetSegmenterParametersMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersRequest, com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersResponse> getGetSegmenterParametersMethod;
    if ((getGetSegmenterParametersMethod = VisionServiceGrpc.getGetSegmenterParametersMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetSegmenterParametersMethod = VisionServiceGrpc.getGetSegmenterParametersMethod) == null) {
          VisionServiceGrpc.getGetSegmenterParametersMethod = getGetSegmenterParametersMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersRequest, com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSegmenterParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisionServiceMethodDescriptorSupplier("GetSegmenterParameters"))
              .build();
        }
      }
    }
    return getGetSegmenterParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsRequest,
      com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsResponse> getGetObjectPointCloudsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectPointClouds",
      requestType = com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsRequest.class,
      responseType = com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsRequest,
      com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsResponse> getGetObjectPointCloudsMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsRequest, com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsResponse> getGetObjectPointCloudsMethod;
    if ((getGetObjectPointCloudsMethod = VisionServiceGrpc.getGetObjectPointCloudsMethod) == null) {
      synchronized (VisionServiceGrpc.class) {
        if ((getGetObjectPointCloudsMethod = VisionServiceGrpc.getGetObjectPointCloudsMethod) == null) {
          VisionServiceGrpc.getGetObjectPointCloudsMethod = getGetObjectPointCloudsMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsRequest, com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectPointClouds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsResponse.getDefaultInstance()))
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
     * GetDetectorNames returns the list of detectors in the registry.
     * </pre>
     */
    public void getDetectorNames(com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDetectorNamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddDetector adds a new detector to the registry.
     * </pre>
     */
    public void addDetector(com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDetectorMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDetections will return a list of detections in the next image given a camera and a detector
     * </pre>
     */
    public void getDetections(com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDetectionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSegmenterNames returns the list of segmenters in the registry.
     * </pre>
     */
    public void getSegmenterNames(com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSegmenterNamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSegmenterParameters returns the parameter fields needed for the given segmenter.
     * </pre>
     */
    public void getSegmenterParameters(com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSegmenterParametersMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectPointClouds returns all the found objects in a pointcloud from a camera of the underlying robot,
     * as well as the 3-vector center of each of the found objects.
     * A specific MIME type can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public void getObjectPointClouds(com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectPointCloudsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDetectorNamesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesRequest,
                com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesResponse>(
                  this, METHODID_GET_DETECTOR_NAMES)))
          .addMethod(
            getAddDetectorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorRequest,
                com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorResponse>(
                  this, METHODID_ADD_DETECTOR)))
          .addMethod(
            getGetDetectionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsRequest,
                com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsResponse>(
                  this, METHODID_GET_DETECTIONS)))
          .addMethod(
            getGetSegmenterNamesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesRequest,
                com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesResponse>(
                  this, METHODID_GET_SEGMENTER_NAMES)))
          .addMethod(
            getGetSegmenterParametersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersRequest,
                com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersResponse>(
                  this, METHODID_GET_SEGMENTER_PARAMETERS)))
          .addMethod(
            getGetObjectPointCloudsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsRequest,
                com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsResponse>(
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
     * GetDetectorNames returns the list of detectors in the registry.
     * </pre>
     */
    public void getDetectorNames(com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDetectorNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddDetector adds a new detector to the registry.
     * </pre>
     */
    public void addDetector(com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDetectorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDetections will return a list of detections in the next image given a camera and a detector
     * </pre>
     */
    public void getDetections(com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDetectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSegmenterNames returns the list of segmenters in the registry.
     * </pre>
     */
    public void getSegmenterNames(com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSegmenterNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSegmenterParameters returns the parameter fields needed for the given segmenter.
     * </pre>
     */
    public void getSegmenterParameters(com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSegmenterParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectPointClouds returns all the found objects in a pointcloud from a camera of the underlying robot,
     * as well as the 3-vector center of each of the found objects.
     * A specific MIME type can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public void getObjectPointClouds(com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsResponse> responseObserver) {
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
     * GetDetectorNames returns the list of detectors in the registry.
     * </pre>
     */
    public com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesResponse getDetectorNames(com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDetectorNamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddDetector adds a new detector to the registry.
     * </pre>
     */
    public com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorResponse addDetector(com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDetectorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDetections will return a list of detections in the next image given a camera and a detector
     * </pre>
     */
    public com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsResponse getDetections(com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDetectionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSegmenterNames returns the list of segmenters in the registry.
     * </pre>
     */
    public com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesResponse getSegmenterNames(com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSegmenterNamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSegmenterParameters returns the parameter fields needed for the given segmenter.
     * </pre>
     */
    public com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersResponse getSegmenterParameters(com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSegmenterParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectPointClouds returns all the found objects in a pointcloud from a camera of the underlying robot,
     * as well as the 3-vector center of each of the found objects.
     * A specific MIME type can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsResponse getObjectPointClouds(com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsRequest request) {
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
     * GetDetectorNames returns the list of detectors in the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesResponse> getDetectorNames(
        com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDetectorNamesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddDetector adds a new detector to the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorResponse> addDetector(
        com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDetectorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDetections will return a list of detections in the next image given a camera and a detector
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsResponse> getDetections(
        com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDetectionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSegmenterNames returns the list of segmenters in the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesResponse> getSegmenterNames(
        com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSegmenterNamesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSegmenterParameters returns the parameter fields needed for the given segmenter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersResponse> getSegmenterParameters(
        com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSegmenterParametersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectPointClouds returns all the found objects in a pointcloud from a camera of the underlying robot,
     * as well as the 3-vector center of each of the found objects.
     * A specific MIME type can be requested but may not necessarily be the same one returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsResponse> getObjectPointClouds(
        com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectPointCloudsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DETECTOR_NAMES = 0;
  private static final int METHODID_ADD_DETECTOR = 1;
  private static final int METHODID_GET_DETECTIONS = 2;
  private static final int METHODID_GET_SEGMENTER_NAMES = 3;
  private static final int METHODID_GET_SEGMENTER_PARAMETERS = 4;
  private static final int METHODID_GET_OBJECT_POINT_CLOUDS = 5;

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
        case METHODID_GET_DETECTOR_NAMES:
          serviceImpl.getDetectorNames((com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectorNamesResponse>) responseObserver);
          break;
        case METHODID_ADD_DETECTOR:
          serviceImpl.addDetector((com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.AddDetectorResponse>) responseObserver);
          break;
        case METHODID_GET_DETECTIONS:
          serviceImpl.getDetections((com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetDetectionsResponse>) responseObserver);
          break;
        case METHODID_GET_SEGMENTER_NAMES:
          serviceImpl.getSegmenterNames((com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterNamesResponse>) responseObserver);
          break;
        case METHODID_GET_SEGMENTER_PARAMETERS:
          serviceImpl.getSegmenterParameters((com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetSegmenterParametersResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_POINT_CLOUDS:
          serviceImpl.getObjectPointClouds((com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.service.vision.v1.Vision.GetObjectPointCloudsResponse>) responseObserver);
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
      return com.viam.rdk.proto.api.service.vision.v1.Vision.getDescriptor();
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
              .addMethod(getGetDetectorNamesMethod())
              .addMethod(getAddDetectorMethod())
              .addMethod(getGetDetectionsMethod())
              .addMethod(getGetSegmenterNamesMethod())
              .addMethod(getGetSegmenterParametersMethod())
              .addMethod(getGetObjectPointCloudsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
