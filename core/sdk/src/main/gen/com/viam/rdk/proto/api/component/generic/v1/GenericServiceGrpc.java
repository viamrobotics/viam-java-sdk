package com.viam.rdk.proto.api.component.generic.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * GenericService services all generic commands associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto/api/component/generic/v1/generic.proto")
public final class GenericServiceGrpc {

  private GenericServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.api.component.generic.v1.GenericService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.generic.v1.Generic.DoRequest,
      com.viam.rdk.proto.api.component.generic.v1.Generic.DoResponse> getDoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Do",
      requestType = com.viam.rdk.proto.api.component.generic.v1.Generic.DoRequest.class,
      responseType = com.viam.rdk.proto.api.component.generic.v1.Generic.DoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.generic.v1.Generic.DoRequest,
      com.viam.rdk.proto.api.component.generic.v1.Generic.DoResponse> getDoMethod() {
    io.grpc.MethodDescriptor<com.viam.rdk.proto.api.component.generic.v1.Generic.DoRequest, com.viam.rdk.proto.api.component.generic.v1.Generic.DoResponse> getDoMethod;
    if ((getDoMethod = GenericServiceGrpc.getDoMethod) == null) {
      synchronized (GenericServiceGrpc.class) {
        if ((getDoMethod = GenericServiceGrpc.getDoMethod) == null) {
          GenericServiceGrpc.getDoMethod = getDoMethod =
              io.grpc.MethodDescriptor.<com.viam.rdk.proto.api.component.generic.v1.Generic.DoRequest, com.viam.rdk.proto.api.component.generic.v1.Generic.DoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.generic.v1.Generic.DoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.rdk.proto.api.component.generic.v1.Generic.DoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GenericServiceMethodDescriptorSupplier("Do"))
              .build();
        }
      }
    }
    return getDoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GenericServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenericServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenericServiceStub>() {
        @java.lang.Override
        public GenericServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenericServiceStub(channel, callOptions);
        }
      };
    return GenericServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GenericServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenericServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenericServiceBlockingStub>() {
        @java.lang.Override
        public GenericServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenericServiceBlockingStub(channel, callOptions);
        }
      };
    return GenericServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GenericServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenericServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenericServiceFutureStub>() {
        @java.lang.Override
        public GenericServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenericServiceFutureStub(channel, callOptions);
        }
      };
    return GenericServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * GenericService services all generic commands associated with a robot
   * </pre>
   */
  public static abstract class GenericServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Do sends/recieves arbitrary commands
     * </pre>
     */
    public void do_(com.viam.rdk.proto.api.component.generic.v1.Generic.DoRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.generic.v1.Generic.DoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.rdk.proto.api.component.generic.v1.Generic.DoRequest,
                com.viam.rdk.proto.api.component.generic.v1.Generic.DoResponse>(
                  this, METHODID_DO)))
          .build();
    }
  }

  /**
   * <pre>
   * GenericService services all generic commands associated with a robot
   * </pre>
   */
  public static final class GenericServiceStub extends io.grpc.stub.AbstractAsyncStub<GenericServiceStub> {
    private GenericServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenericServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenericServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Do sends/recieves arbitrary commands
     * </pre>
     */
    public void do_(com.viam.rdk.proto.api.component.generic.v1.Generic.DoRequest request,
        io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.generic.v1.Generic.DoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * GenericService services all generic commands associated with a robot
   * </pre>
   */
  public static final class GenericServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GenericServiceBlockingStub> {
    private GenericServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenericServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenericServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Do sends/recieves arbitrary commands
     * </pre>
     */
    public com.viam.rdk.proto.api.component.generic.v1.Generic.DoResponse do_(com.viam.rdk.proto.api.component.generic.v1.Generic.DoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * GenericService services all generic commands associated with a robot
   * </pre>
   */
  public static final class GenericServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GenericServiceFutureStub> {
    private GenericServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenericServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenericServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Do sends/recieves arbitrary commands
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.rdk.proto.api.component.generic.v1.Generic.DoResponse> do_(
        com.viam.rdk.proto.api.component.generic.v1.Generic.DoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GenericServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GenericServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO:
          serviceImpl.do_((com.viam.rdk.proto.api.component.generic.v1.Generic.DoRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.rdk.proto.api.component.generic.v1.Generic.DoResponse>) responseObserver);
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

  private static abstract class GenericServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GenericServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viam.rdk.proto.api.component.generic.v1.Generic.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GenericService");
    }
  }

  private static final class GenericServiceFileDescriptorSupplier
      extends GenericServiceBaseDescriptorSupplier {
    GenericServiceFileDescriptorSupplier() {}
  }

  private static final class GenericServiceMethodDescriptorSupplier
      extends GenericServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GenericServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GenericServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GenericServiceFileDescriptorSupplier())
              .addMethod(getDoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
