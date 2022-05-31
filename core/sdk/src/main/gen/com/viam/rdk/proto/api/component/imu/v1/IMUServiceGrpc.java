package com.viam.rdk.proto.api.component.imu.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * IMUService services all IMUs associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/api/component/imu/v1/imu.proto")
public final class IMUServiceGrpc {

  private IMUServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.api.component.imu.v1.IMUService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityRequest,
      com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityResponse> getReadAngularVelocityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadAngularVelocity",
      requestType = com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityRequest.class,
      responseType = com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityRequest,
      com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityResponse> getReadAngularVelocityMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityRequest, com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityResponse> getReadAngularVelocityMethod;
    if ((getReadAngularVelocityMethod = IMUServiceGrpc.getReadAngularVelocityMethod) == null) {
      synchronized (IMUServiceGrpc.class) {
        if ((getReadAngularVelocityMethod = IMUServiceGrpc.getReadAngularVelocityMethod) == null) {
          IMUServiceGrpc.getReadAngularVelocityMethod = getReadAngularVelocityMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityRequest, com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadAngularVelocity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IMUServiceMethodDescriptorSupplier("ReadAngularVelocity"))
              .build();
        }
      }
    }
    return getReadAngularVelocityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationRequest,
      com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationResponse> getReadOrientationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadOrientation",
      requestType = com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationRequest.class,
      responseType = com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationRequest,
      com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationResponse> getReadOrientationMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationRequest, com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationResponse> getReadOrientationMethod;
    if ((getReadOrientationMethod = IMUServiceGrpc.getReadOrientationMethod) == null) {
      synchronized (IMUServiceGrpc.class) {
        if ((getReadOrientationMethod = IMUServiceGrpc.getReadOrientationMethod) == null) {
          IMUServiceGrpc.getReadOrientationMethod = getReadOrientationMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationRequest, com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadOrientation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IMUServiceMethodDescriptorSupplier("ReadOrientation"))
              .build();
        }
      }
    }
    return getReadOrientationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationRequest,
      com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationResponse> getReadAccelerationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadAcceleration",
      requestType = com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationRequest.class,
      responseType = com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationRequest,
      com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationResponse> getReadAccelerationMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationRequest, com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationResponse> getReadAccelerationMethod;
    if ((getReadAccelerationMethod = IMUServiceGrpc.getReadAccelerationMethod) == null) {
      synchronized (IMUServiceGrpc.class) {
        if ((getReadAccelerationMethod = IMUServiceGrpc.getReadAccelerationMethod) == null) {
          IMUServiceGrpc.getReadAccelerationMethod = getReadAccelerationMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationRequest, com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadAcceleration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IMUServiceMethodDescriptorSupplier("ReadAcceleration"))
              .build();
        }
      }
    }
    return getReadAccelerationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerRequest,
      com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerResponse> getReadMagnetometerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadMagnetometer",
      requestType = com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerRequest.class,
      responseType = com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerRequest,
      com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerResponse> getReadMagnetometerMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerRequest, com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerResponse> getReadMagnetometerMethod;
    if ((getReadMagnetometerMethod = IMUServiceGrpc.getReadMagnetometerMethod) == null) {
      synchronized (IMUServiceGrpc.class) {
        if ((getReadMagnetometerMethod = IMUServiceGrpc.getReadMagnetometerMethod) == null) {
          IMUServiceGrpc.getReadMagnetometerMethod = getReadMagnetometerMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerRequest, com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadMagnetometer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IMUServiceMethodDescriptorSupplier("ReadMagnetometer"))
              .build();
        }
      }
    }
    return getReadMagnetometerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IMUServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IMUServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IMUServiceStub>() {
        @java.lang.Override
        public IMUServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IMUServiceStub(channel, callOptions);
        }
      };
    return IMUServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IMUServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IMUServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IMUServiceBlockingStub>() {
        @java.lang.Override
        public IMUServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IMUServiceBlockingStub(channel, callOptions);
        }
      };
    return IMUServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IMUServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IMUServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IMUServiceFutureStub>() {
        @java.lang.Override
        public IMUServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IMUServiceFutureStub(channel, callOptions);
        }
      };
    return IMUServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * IMUService services all IMUs associated with a robot
   * </pre>
   */
  public static abstract class IMUServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ReadAngularVelocity returns the most recent angular velocity reading from the given IMU.
     * </pre>
     */
    public void readAngularVelocity(com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadAngularVelocityMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReadOrientation returns the most recent orientation reading from the given IMU.
     * </pre>
     */
    public void readOrientation(com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadOrientationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReadAcceleration returns the most recent acceleration reading from the given IMU.
     * </pre>
     */
    public void readAcceleration(com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadAccelerationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReadMagnetometer returns the most recent magnetometer reading from the given IMU, if avaiable
     * </pre>
     */
    public void readMagnetometer(com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMagnetometerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadAngularVelocityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityRequest,
                com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityResponse>(
                  this, METHODID_READ_ANGULAR_VELOCITY)))
          .addMethod(
            getReadOrientationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationRequest,
                com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationResponse>(
                  this, METHODID_READ_ORIENTATION)))
          .addMethod(
            getReadAccelerationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationRequest,
                com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationResponse>(
                  this, METHODID_READ_ACCELERATION)))
          .addMethod(
            getReadMagnetometerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerRequest,
                com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerResponse>(
                  this, METHODID_READ_MAGNETOMETER)))
          .build();
    }
  }

  /**
   * <pre>
   * IMUService services all IMUs associated with a robot
   * </pre>
   */
  public static final class IMUServiceStub extends io.grpc.stub.AbstractAsyncStub<IMUServiceStub> {
    private IMUServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IMUServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IMUServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ReadAngularVelocity returns the most recent angular velocity reading from the given IMU.
     * </pre>
     */
    public void readAngularVelocity(com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadAngularVelocityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReadOrientation returns the most recent orientation reading from the given IMU.
     * </pre>
     */
    public void readOrientation(com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadOrientationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReadAcceleration returns the most recent acceleration reading from the given IMU.
     * </pre>
     */
    public void readAcceleration(com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadAccelerationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReadMagnetometer returns the most recent magnetometer reading from the given IMU, if avaiable
     * </pre>
     */
    public void readMagnetometer(com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadMagnetometerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * IMUService services all IMUs associated with a robot
   * </pre>
   */
  public static final class IMUServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<IMUServiceBlockingStub> {
    private IMUServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IMUServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IMUServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ReadAngularVelocity returns the most recent angular velocity reading from the given IMU.
     * </pre>
     */
    public com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityResponse readAngularVelocity(com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadAngularVelocityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReadOrientation returns the most recent orientation reading from the given IMU.
     * </pre>
     */
    public com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationResponse readOrientation(com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadOrientationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReadAcceleration returns the most recent acceleration reading from the given IMU.
     * </pre>
     */
    public com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationResponse readAcceleration(com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadAccelerationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReadMagnetometer returns the most recent magnetometer reading from the given IMU, if avaiable
     * </pre>
     */
    public com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerResponse readMagnetometer(com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadMagnetometerMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * IMUService services all IMUs associated with a robot
   * </pre>
   */
  public static final class IMUServiceFutureStub extends io.grpc.stub.AbstractFutureStub<IMUServiceFutureStub> {
    private IMUServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IMUServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IMUServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ReadAngularVelocity returns the most recent angular velocity reading from the given IMU.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityResponse> readAngularVelocity(
        com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadAngularVelocityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReadOrientation returns the most recent orientation reading from the given IMU.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationResponse> readOrientation(
        com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadOrientationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReadAcceleration returns the most recent acceleration reading from the given IMU.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationResponse> readAcceleration(
        com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadAccelerationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReadMagnetometer returns the most recent magnetometer reading from the given IMU, if avaiable
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerResponse> readMagnetometer(
        com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadMagnetometerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ_ANGULAR_VELOCITY = 0;
  private static final int METHODID_READ_ORIENTATION = 1;
  private static final int METHODID_READ_ACCELERATION = 2;
  private static final int METHODID_READ_MAGNETOMETER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IMUServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IMUServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ_ANGULAR_VELOCITY:
          serviceImpl.readAngularVelocity((com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAngularVelocityResponse>) responseObserver);
          break;
        case METHODID_READ_ORIENTATION:
          serviceImpl.readOrientation((com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadOrientationResponse>) responseObserver);
          break;
        case METHODID_READ_ACCELERATION:
          serviceImpl.readAcceleration((com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadAccelerationResponse>) responseObserver);
          break;
        case METHODID_READ_MAGNETOMETER:
          serviceImpl.readMagnetometer((com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.imu.v1.Imu.ReadMagnetometerResponse>) responseObserver);
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

  private static abstract class IMUServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IMUServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.rdk.proto.api.component.imu.v1.Imu.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IMUService");
    }
  }

  private static final class IMUServiceFileDescriptorSupplier
      extends IMUServiceBaseDescriptorSupplier {
    IMUServiceFileDescriptorSupplier() {}
  }

  private static final class IMUServiceMethodDescriptorSupplier
      extends IMUServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IMUServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IMUServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IMUServiceFileDescriptorSupplier())
              .addMethod(getReadAngularVelocityMethod())
              .addMethod(getReadOrientationMethod())
              .addMethod(getReadAccelerationMethod())
              .addMethod(getReadMagnetometerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
