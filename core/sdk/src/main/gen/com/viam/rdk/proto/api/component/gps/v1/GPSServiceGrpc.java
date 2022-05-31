package com.viam.rdk.proto.api.component.gps.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * GPSService services all GPSs associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/api/component/gps/v1/gps.proto")
public final class GPSServiceGrpc {

  private GPSServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.api.component.gps.v1.GPSService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationRequest,
      com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationResponse> getReadLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadLocation",
      requestType = com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationRequest.class,
      responseType = com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationRequest,
      com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationResponse> getReadLocationMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationRequest, com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationResponse> getReadLocationMethod;
    if ((getReadLocationMethod = GPSServiceGrpc.getReadLocationMethod) == null) {
      synchronized (GPSServiceGrpc.class) {
        if ((getReadLocationMethod = GPSServiceGrpc.getReadLocationMethod) == null) {
          GPSServiceGrpc.getReadLocationMethod = getReadLocationMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationRequest, com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GPSServiceMethodDescriptorSupplier("ReadLocation"))
              .build();
        }
      }
    }
    return getReadLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeRequest,
      com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeResponse> getReadAltitudeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadAltitude",
      requestType = com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeRequest.class,
      responseType = com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeRequest,
      com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeResponse> getReadAltitudeMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeRequest, com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeResponse> getReadAltitudeMethod;
    if ((getReadAltitudeMethod = GPSServiceGrpc.getReadAltitudeMethod) == null) {
      synchronized (GPSServiceGrpc.class) {
        if ((getReadAltitudeMethod = GPSServiceGrpc.getReadAltitudeMethod) == null) {
          GPSServiceGrpc.getReadAltitudeMethod = getReadAltitudeMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeRequest, com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadAltitude"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GPSServiceMethodDescriptorSupplier("ReadAltitude"))
              .build();
        }
      }
    }
    return getReadAltitudeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedRequest,
      com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedResponse> getReadSpeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadSpeed",
      requestType = com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedRequest.class,
      responseType = com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedRequest,
      com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedResponse> getReadSpeedMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedRequest, com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedResponse> getReadSpeedMethod;
    if ((getReadSpeedMethod = GPSServiceGrpc.getReadSpeedMethod) == null) {
      synchronized (GPSServiceGrpc.class) {
        if ((getReadSpeedMethod = GPSServiceGrpc.getReadSpeedMethod) == null) {
          GPSServiceGrpc.getReadSpeedMethod = getReadSpeedMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedRequest, com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadSpeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GPSServiceMethodDescriptorSupplier("ReadSpeed"))
              .build();
        }
      }
    }
    return getReadSpeedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GPSServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GPSServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GPSServiceStub>() {
        @java.lang.Override
        public GPSServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GPSServiceStub(channel, callOptions);
        }
      };
    return GPSServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GPSServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GPSServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GPSServiceBlockingStub>() {
        @java.lang.Override
        public GPSServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GPSServiceBlockingStub(channel, callOptions);
        }
      };
    return GPSServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GPSServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GPSServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GPSServiceFutureStub>() {
        @java.lang.Override
        public GPSServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GPSServiceFutureStub(channel, callOptions);
        }
      };
    return GPSServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * GPSService services all GPSs associated with a robot
   * </pre>
   */
  public static abstract class GPSServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ReadLocation returns the most recent location from the given GPS.
     * </pre>
     */
    public void readLocation(com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReadAltitude returns the most recent altitude from the given GPS.
     * </pre>
     */
    public void readAltitude(com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadAltitudeMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReadSpeed returns the most recent speed from the given GPS.
     * </pre>
     */
    public void readSpeed(com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadSpeedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadLocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationRequest,
                com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationResponse>(
                  this, METHODID_READ_LOCATION)))
          .addMethod(
            getReadAltitudeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeRequest,
                com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeResponse>(
                  this, METHODID_READ_ALTITUDE)))
          .addMethod(
            getReadSpeedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedRequest,
                com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedResponse>(
                  this, METHODID_READ_SPEED)))
          .build();
    }
  }

  /**
   * <pre>
   * GPSService services all GPSs associated with a robot
   * </pre>
   */
  public static final class GPSServiceStub extends io.grpc.stub.AbstractAsyncStub<GPSServiceStub> {
    private GPSServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GPSServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GPSServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ReadLocation returns the most recent location from the given GPS.
     * </pre>
     */
    public void readLocation(com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReadAltitude returns the most recent altitude from the given GPS.
     * </pre>
     */
    public void readAltitude(com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadAltitudeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReadSpeed returns the most recent speed from the given GPS.
     * </pre>
     */
    public void readSpeed(com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadSpeedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * GPSService services all GPSs associated with a robot
   * </pre>
   */
  public static final class GPSServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GPSServiceBlockingStub> {
    private GPSServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GPSServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GPSServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ReadLocation returns the most recent location from the given GPS.
     * </pre>
     */
    public com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationResponse readLocation(com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReadAltitude returns the most recent altitude from the given GPS.
     * </pre>
     */
    public com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeResponse readAltitude(com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadAltitudeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReadSpeed returns the most recent speed from the given GPS.
     * </pre>
     */
    public com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedResponse readSpeed(com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadSpeedMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * GPSService services all GPSs associated with a robot
   * </pre>
   */
  public static final class GPSServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GPSServiceFutureStub> {
    private GPSServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GPSServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GPSServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ReadLocation returns the most recent location from the given GPS.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationResponse> readLocation(
        com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReadAltitude returns the most recent altitude from the given GPS.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeResponse> readAltitude(
        com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadAltitudeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReadSpeed returns the most recent speed from the given GPS.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedResponse> readSpeed(
        com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadSpeedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ_LOCATION = 0;
  private static final int METHODID_READ_ALTITUDE = 1;
  private static final int METHODID_READ_SPEED = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GPSServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GPSServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ_LOCATION:
          serviceImpl.readLocation((com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadLocationResponse>) responseObserver);
          break;
        case METHODID_READ_ALTITUDE:
          serviceImpl.readAltitude((com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadAltitudeResponse>) responseObserver);
          break;
        case METHODID_READ_SPEED:
          serviceImpl.readSpeed((com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.gps.v1.Gps.ReadSpeedResponse>) responseObserver);
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

  private static abstract class GPSServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GPSServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.rdk.proto.api.component.gps.v1.Gps.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GPSService");
    }
  }

  private static final class GPSServiceFileDescriptorSupplier
      extends GPSServiceBaseDescriptorSupplier {
    GPSServiceFileDescriptorSupplier() {}
  }

  private static final class GPSServiceMethodDescriptorSupplier
      extends GPSServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GPSServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GPSServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GPSServiceFileDescriptorSupplier())
              .addMethod(getReadLocationMethod())
              .addMethod(getReadAltitudeMethod())
              .addMethod(getReadSpeedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
