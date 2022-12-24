package com.viam.component.generic.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * GenericService services all generic commands associated with a robot
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: component/generic/v1/generic.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GenericServiceGrpc {

  private GenericServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.component.generic.v1.GenericService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.component.generic.v1.Generic.DoCommandRequest,
      com.viam.component.generic.v1.Generic.DoCommandResponse> getDoCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoCommand",
      requestType = com.viam.component.generic.v1.Generic.DoCommandRequest.class,
      responseType = com.viam.component.generic.v1.Generic.DoCommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.component.generic.v1.Generic.DoCommandRequest,
      com.viam.component.generic.v1.Generic.DoCommandResponse> getDoCommandMethod() {
    io.grpc.MethodDescriptor<com.viam.component.generic.v1.Generic.DoCommandRequest, com.viam.component.generic.v1.Generic.DoCommandResponse> getDoCommandMethod;
    if ((getDoCommandMethod = GenericServiceGrpc.getDoCommandMethod) == null) {
      synchronized (GenericServiceGrpc.class) {
        if ((getDoCommandMethod = GenericServiceGrpc.getDoCommandMethod) == null) {
          GenericServiceGrpc.getDoCommandMethod = getDoCommandMethod =
              io.grpc.MethodDescriptor.<com.viam.component.generic.v1.Generic.DoCommandRequest, com.viam.component.generic.v1.Generic.DoCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.generic.v1.Generic.DoCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viam.component.generic.v1.Generic.DoCommandResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GenericServiceMethodDescriptorSupplier("DoCommand"))
              .build();
        }
      }
    }
    return getDoCommandMethod;
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
     * DoCommand sends/recieves arbitrary commands
     * </pre>
     */
    public void doCommand(com.viam.component.generic.v1.Generic.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.generic.v1.Generic.DoCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoCommandMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoCommandMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.viam.component.generic.v1.Generic.DoCommandRequest,
                com.viam.component.generic.v1.Generic.DoCommandResponse>(
                  this, METHODID_DO_COMMAND)))
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
     * DoCommand sends/recieves arbitrary commands
     * </pre>
     */
    public void doCommand(com.viam.component.generic.v1.Generic.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.component.generic.v1.Generic.DoCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request, responseObserver);
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
     * DoCommand sends/recieves arbitrary commands
     * </pre>
     */
    public com.viam.component.generic.v1.Generic.DoCommandResponse doCommand(com.viam.component.generic.v1.Generic.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoCommandMethod(), getCallOptions(), request);
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
     * DoCommand sends/recieves arbitrary commands
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.component.generic.v1.Generic.DoCommandResponse> doCommand(
        com.viam.component.generic.v1.Generic.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_COMMAND = 0;

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
        case METHODID_DO_COMMAND:
          serviceImpl.doCommand((com.viam.component.generic.v1.Generic.DoCommandRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.component.generic.v1.Generic.DoCommandResponse>) responseObserver);
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
      return com.viam.component.generic.v1.Generic.getDescriptor();
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
              .addMethod(getDoCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
