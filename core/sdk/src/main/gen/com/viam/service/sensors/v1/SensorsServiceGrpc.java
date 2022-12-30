package com.viam.service.sensors.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A SensorsService services keeps track of all sensors associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: service/sensors/v1/sensors.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SensorsServiceGrpc {

  private SensorsServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.service.sensors.v1.SensorsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.service.sensors.v1.Sensors.GetSensorsRequest,
      com.viam.service.sensors.v1.Sensors.GetSensorsResponse> getGetSensorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSensors",
      requestType = com.viam.service.sensors.v1.Sensors.GetSensorsRequest.class,
      responseType = com.viam.service.sensors.v1.Sensors.GetSensorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.sensors.v1.Sensors.GetSensorsRequest,
      com.viam.service.sensors.v1.Sensors.GetSensorsResponse> getGetSensorsMethod() {
    io.grpc.MethodDescriptor<com.viam.service.sensors.v1.Sensors.GetSensorsRequest, com.viam.service.sensors.v1.Sensors.GetSensorsResponse> getGetSensorsMethod;
    if ((getGetSensorsMethod = SensorsServiceGrpc.getGetSensorsMethod) == null) {
      synchronized (SensorsServiceGrpc.class) {
        if ((getGetSensorsMethod = SensorsServiceGrpc.getGetSensorsMethod) == null) {
          SensorsServiceGrpc.getGetSensorsMethod = getGetSensorsMethod =
              io.grpc.MethodDescriptor.<com.viam.service.sensors.v1.Sensors.GetSensorsRequest, com.viam.service.sensors.v1.Sensors.GetSensorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSensors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.sensors.v1.Sensors.GetSensorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.sensors.v1.Sensors.GetSensorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SensorsServiceMethodDescriptorSupplier("GetSensors"))
              .build();
        }
      }
    }
    return getGetSensorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.sensors.v1.Sensors.GetReadingsRequest,
      com.viam.service.sensors.v1.Sensors.GetReadingsResponse> getGetReadingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReadings",
      requestType = com.viam.service.sensors.v1.Sensors.GetReadingsRequest.class,
      responseType = com.viam.service.sensors.v1.Sensors.GetReadingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.sensors.v1.Sensors.GetReadingsRequest,
      com.viam.service.sensors.v1.Sensors.GetReadingsResponse> getGetReadingsMethod() {
    io.grpc.MethodDescriptor<com.viam.service.sensors.v1.Sensors.GetReadingsRequest, com.viam.service.sensors.v1.Sensors.GetReadingsResponse> getGetReadingsMethod;
    if ((getGetReadingsMethod = SensorsServiceGrpc.getGetReadingsMethod) == null) {
      synchronized (SensorsServiceGrpc.class) {
        if ((getGetReadingsMethod = SensorsServiceGrpc.getGetReadingsMethod) == null) {
          SensorsServiceGrpc.getGetReadingsMethod = getGetReadingsMethod =
              io.grpc.MethodDescriptor.<com.viam.service.sensors.v1.Sensors.GetReadingsRequest, com.viam.service.sensors.v1.Sensors.GetReadingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReadings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.sensors.v1.Sensors.GetReadingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.service.sensors.v1.Sensors.GetReadingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SensorsServiceMethodDescriptorSupplier("GetReadings"))
              .build();
        }
      }
    }
    return getGetReadingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SensorsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorsServiceStub>() {
        @java.lang.Override
        public SensorsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorsServiceStub(channel, callOptions);
        }
      };
    return SensorsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SensorsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorsServiceBlockingStub>() {
        @java.lang.Override
        public SensorsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorsServiceBlockingStub(channel, callOptions);
        }
      };
    return SensorsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SensorsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorsServiceFutureStub>() {
        @java.lang.Override
        public SensorsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorsServiceFutureStub(channel, callOptions);
        }
      };
    return SensorsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A SensorsService services keeps track of all sensors associated with a robot
   * </pre>
   */
  public static abstract class SensorsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetSensors returns the list of all sensors.
     * </pre>
     */
    public void getSensors(com.viam.service.sensors.v1.Sensors.GetSensorsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.sensors.v1.Sensors.GetSensorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSensorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetReadings returns the list of readings for all sensors specified.
     * </pre>
     */
    public void getReadings(com.viam.service.sensors.v1.Sensors.GetReadingsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.sensors.v1.Sensors.GetReadingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReadingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSensorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.sensors.v1.Sensors.GetSensorsRequest,
                com.viam.service.sensors.v1.Sensors.GetSensorsResponse>(
                  this, METHODID_GET_SENSORS)))
          .addMethod(
            getGetReadingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.service.sensors.v1.Sensors.GetReadingsRequest,
                com.viam.service.sensors.v1.Sensors.GetReadingsResponse>(
                  this, METHODID_GET_READINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * A SensorsService services keeps track of all sensors associated with a robot
   * </pre>
   */
  public static final class SensorsServiceStub extends io.grpc.stub.AbstractAsyncStub<SensorsServiceStub> {
    private SensorsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSensors returns the list of all sensors.
     * </pre>
     */
    public void getSensors(com.viam.service.sensors.v1.Sensors.GetSensorsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.sensors.v1.Sensors.GetSensorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSensorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetReadings returns the list of readings for all sensors specified.
     * </pre>
     */
    public void getReadings(com.viam.service.sensors.v1.Sensors.GetReadingsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.sensors.v1.Sensors.GetReadingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReadingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A SensorsService services keeps track of all sensors associated with a robot
   * </pre>
   */
  public static final class SensorsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SensorsServiceBlockingStub> {
    private SensorsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSensors returns the list of all sensors.
     * </pre>
     */
    public com.viam.service.sensors.v1.Sensors.GetSensorsResponse getSensors(com.viam.service.sensors.v1.Sensors.GetSensorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSensorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetReadings returns the list of readings for all sensors specified.
     * </pre>
     */
    public com.viam.service.sensors.v1.Sensors.GetReadingsResponse getReadings(com.viam.service.sensors.v1.Sensors.GetReadingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReadingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A SensorsService services keeps track of all sensors associated with a robot
   * </pre>
   */
  public static final class SensorsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SensorsServiceFutureStub> {
    private SensorsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSensors returns the list of all sensors.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.sensors.v1.Sensors.GetSensorsResponse> getSensors(
        com.viam.service.sensors.v1.Sensors.GetSensorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSensorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetReadings returns the list of readings for all sensors specified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.sensors.v1.Sensors.GetReadingsResponse> getReadings(
        com.viam.service.sensors.v1.Sensors.GetReadingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReadingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SENSORS = 0;
  private static final int METHODID_GET_READINGS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SensorsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SensorsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SENSORS:
          serviceImpl.getSensors((com.viam.service.sensors.v1.Sensors.GetSensorsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.sensors.v1.Sensors.GetSensorsResponse>) responseObserver);
          break;
        case METHODID_GET_READINGS:
          serviceImpl.getReadings((com.viam.service.sensors.v1.Sensors.GetReadingsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.sensors.v1.Sensors.GetReadingsResponse>) responseObserver);
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

  private static abstract class SensorsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SensorsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.service.sensors.v1.Sensors.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SensorsService");
    }
  }

  private static final class SensorsServiceFileDescriptorSupplier
      extends SensorsServiceBaseDescriptorSupplier {
    SensorsServiceFileDescriptorSupplier() {}
  }

  private static final class SensorsServiceMethodDescriptorSupplier
      extends SensorsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SensorsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SensorsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SensorsServiceFileDescriptorSupplier())
              .addMethod(getGetSensorsMethod())
              .addMethod(getGetReadingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
