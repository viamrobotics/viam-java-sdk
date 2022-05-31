package com.google.api.expr.conformance.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Access a CEL implementation from another process or machine.
 * A CEL implementation is decomposed as a parser, a static checker,
 * and an evaluator.  Every CEL implementation is expected to provide
 * a server for this API.  The API will be used for conformance testing
 * and other utilities.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: google/api/expr/conformance/v1alpha1/conformance_service.proto")
public final class ConformanceServiceGrpc {

  private ConformanceServiceGrpc() {}

  public static final String SERVICE_NAME = "google.api.expr.conformance.v1alpha1.ConformanceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.api.expr.conformance.v1alpha1.ParseRequest,
      com.google.api.expr.conformance.v1alpha1.ParseResponse> getParseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Parse",
      requestType = com.google.api.expr.conformance.v1alpha1.ParseRequest.class,
      responseType = com.google.api.expr.conformance.v1alpha1.ParseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.api.expr.conformance.v1alpha1.ParseRequest,
      com.google.api.expr.conformance.v1alpha1.ParseResponse> getParseMethod() {
    io.grpc.MethodDescriptor<com.google.api.expr.conformance.v1alpha1.ParseRequest, com.google.api.expr.conformance.v1alpha1.ParseResponse> getParseMethod;
    if ((getParseMethod = ConformanceServiceGrpc.getParseMethod) == null) {
      synchronized (ConformanceServiceGrpc.class) {
        if ((getParseMethod = ConformanceServiceGrpc.getParseMethod) == null) {
          ConformanceServiceGrpc.getParseMethod = getParseMethod =
              io.grpc.MethodDescriptor.<com.google.api.expr.conformance.v1alpha1.ParseRequest, com.google.api.expr.conformance.v1alpha1.ParseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Parse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.api.expr.conformance.v1alpha1.ParseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.api.expr.conformance.v1alpha1.ParseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConformanceServiceMethodDescriptorSupplier("Parse"))
              .build();
        }
      }
    }
    return getParseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.api.expr.conformance.v1alpha1.CheckRequest,
      com.google.api.expr.conformance.v1alpha1.CheckResponse> getCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Check",
      requestType = com.google.api.expr.conformance.v1alpha1.CheckRequest.class,
      responseType = com.google.api.expr.conformance.v1alpha1.CheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.api.expr.conformance.v1alpha1.CheckRequest,
      com.google.api.expr.conformance.v1alpha1.CheckResponse> getCheckMethod() {
    io.grpc.MethodDescriptor<com.google.api.expr.conformance.v1alpha1.CheckRequest, com.google.api.expr.conformance.v1alpha1.CheckResponse> getCheckMethod;
    if ((getCheckMethod = ConformanceServiceGrpc.getCheckMethod) == null) {
      synchronized (ConformanceServiceGrpc.class) {
        if ((getCheckMethod = ConformanceServiceGrpc.getCheckMethod) == null) {
          ConformanceServiceGrpc.getCheckMethod = getCheckMethod =
              io.grpc.MethodDescriptor.<com.google.api.expr.conformance.v1alpha1.CheckRequest, com.google.api.expr.conformance.v1alpha1.CheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.api.expr.conformance.v1alpha1.CheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.api.expr.conformance.v1alpha1.CheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConformanceServiceMethodDescriptorSupplier("Check"))
              .build();
        }
      }
    }
    return getCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.api.expr.conformance.v1alpha1.EvalRequest,
      com.google.api.expr.conformance.v1alpha1.EvalResponse> getEvalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Eval",
      requestType = com.google.api.expr.conformance.v1alpha1.EvalRequest.class,
      responseType = com.google.api.expr.conformance.v1alpha1.EvalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.api.expr.conformance.v1alpha1.EvalRequest,
      com.google.api.expr.conformance.v1alpha1.EvalResponse> getEvalMethod() {
    io.grpc.MethodDescriptor<com.google.api.expr.conformance.v1alpha1.EvalRequest, com.google.api.expr.conformance.v1alpha1.EvalResponse> getEvalMethod;
    if ((getEvalMethod = ConformanceServiceGrpc.getEvalMethod) == null) {
      synchronized (ConformanceServiceGrpc.class) {
        if ((getEvalMethod = ConformanceServiceGrpc.getEvalMethod) == null) {
          ConformanceServiceGrpc.getEvalMethod = getEvalMethod =
              io.grpc.MethodDescriptor.<com.google.api.expr.conformance.v1alpha1.EvalRequest, com.google.api.expr.conformance.v1alpha1.EvalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Eval"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.api.expr.conformance.v1alpha1.EvalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.api.expr.conformance.v1alpha1.EvalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConformanceServiceMethodDescriptorSupplier("Eval"))
              .build();
        }
      }
    }
    return getEvalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConformanceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConformanceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConformanceServiceStub>() {
        @java.lang.Override
        public ConformanceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConformanceServiceStub(channel, callOptions);
        }
      };
    return ConformanceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConformanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConformanceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConformanceServiceBlockingStub>() {
        @java.lang.Override
        public ConformanceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConformanceServiceBlockingStub(channel, callOptions);
        }
      };
    return ConformanceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConformanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConformanceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConformanceServiceFutureStub>() {
        @java.lang.Override
        public ConformanceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConformanceServiceFutureStub(channel, callOptions);
        }
      };
    return ConformanceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Access a CEL implementation from another process or machine.
   * A CEL implementation is decomposed as a parser, a static checker,
   * and an evaluator.  Every CEL implementation is expected to provide
   * a server for this API.  The API will be used for conformance testing
   * and other utilities.
   * </pre>
   */
  public static abstract class ConformanceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Transforms CEL source text into a parsed representation.
     * </pre>
     */
    public void parse(com.google.api.expr.conformance.v1alpha1.ParseRequest request,
        io.grpc.stub.StreamObserver<com.google.api.expr.conformance.v1alpha1.ParseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Runs static checks on a parsed CEL representation and return
     * an annotated representation, or a set of issues.
     * </pre>
     */
    public void check(com.google.api.expr.conformance.v1alpha1.CheckRequest request,
        io.grpc.stub.StreamObserver<com.google.api.expr.conformance.v1alpha1.CheckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * Evaluates a parsed or annotation CEL representation given
     * values of external bindings.
     * </pre>
     */
    public void eval(com.google.api.expr.conformance.v1alpha1.EvalRequest request,
        io.grpc.stub.StreamObserver<com.google.api.expr.conformance.v1alpha1.EvalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEvalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.api.expr.conformance.v1alpha1.ParseRequest,
                com.google.api.expr.conformance.v1alpha1.ParseResponse>(
                  this, METHODID_PARSE)))
          .addMethod(
            getCheckMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.api.expr.conformance.v1alpha1.CheckRequest,
                com.google.api.expr.conformance.v1alpha1.CheckResponse>(
                  this, METHODID_CHECK)))
          .addMethod(
            getEvalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.api.expr.conformance.v1alpha1.EvalRequest,
                com.google.api.expr.conformance.v1alpha1.EvalResponse>(
                  this, METHODID_EVAL)))
          .build();
    }
  }

  /**
   * <pre>
   * Access a CEL implementation from another process or machine.
   * A CEL implementation is decomposed as a parser, a static checker,
   * and an evaluator.  Every CEL implementation is expected to provide
   * a server for this API.  The API will be used for conformance testing
   * and other utilities.
   * </pre>
   */
  public static final class ConformanceServiceStub extends io.grpc.stub.AbstractAsyncStub<ConformanceServiceStub> {
    private ConformanceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConformanceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConformanceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transforms CEL source text into a parsed representation.
     * </pre>
     */
    public void parse(com.google.api.expr.conformance.v1alpha1.ParseRequest request,
        io.grpc.stub.StreamObserver<com.google.api.expr.conformance.v1alpha1.ParseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Runs static checks on a parsed CEL representation and return
     * an annotated representation, or a set of issues.
     * </pre>
     */
    public void check(com.google.api.expr.conformance.v1alpha1.CheckRequest request,
        io.grpc.stub.StreamObserver<com.google.api.expr.conformance.v1alpha1.CheckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Evaluates a parsed or annotation CEL representation given
     * values of external bindings.
     * </pre>
     */
    public void eval(com.google.api.expr.conformance.v1alpha1.EvalRequest request,
        io.grpc.stub.StreamObserver<com.google.api.expr.conformance.v1alpha1.EvalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEvalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Access a CEL implementation from another process or machine.
   * A CEL implementation is decomposed as a parser, a static checker,
   * and an evaluator.  Every CEL implementation is expected to provide
   * a server for this API.  The API will be used for conformance testing
   * and other utilities.
   * </pre>
   */
  public static final class ConformanceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConformanceServiceBlockingStub> {
    private ConformanceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConformanceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConformanceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transforms CEL source text into a parsed representation.
     * </pre>
     */
    public com.google.api.expr.conformance.v1alpha1.ParseResponse parse(com.google.api.expr.conformance.v1alpha1.ParseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs static checks on a parsed CEL representation and return
     * an annotated representation, or a set of issues.
     * </pre>
     */
    public com.google.api.expr.conformance.v1alpha1.CheckResponse check(com.google.api.expr.conformance.v1alpha1.CheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Evaluates a parsed or annotation CEL representation given
     * values of external bindings.
     * </pre>
     */
    public com.google.api.expr.conformance.v1alpha1.EvalResponse eval(com.google.api.expr.conformance.v1alpha1.EvalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEvalMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Access a CEL implementation from another process or machine.
   * A CEL implementation is decomposed as a parser, a static checker,
   * and an evaluator.  Every CEL implementation is expected to provide
   * a server for this API.  The API will be used for conformance testing
   * and other utilities.
   * </pre>
   */
  public static final class ConformanceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConformanceServiceFutureStub> {
    private ConformanceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConformanceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConformanceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transforms CEL source text into a parsed representation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.api.expr.conformance.v1alpha1.ParseResponse> parse(
        com.google.api.expr.conformance.v1alpha1.ParseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Runs static checks on a parsed CEL representation and return
     * an annotated representation, or a set of issues.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.api.expr.conformance.v1alpha1.CheckResponse> check(
        com.google.api.expr.conformance.v1alpha1.CheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Evaluates a parsed or annotation CEL representation given
     * values of external bindings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.api.expr.conformance.v1alpha1.EvalResponse> eval(
        com.google.api.expr.conformance.v1alpha1.EvalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEvalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARSE = 0;
  private static final int METHODID_CHECK = 1;
  private static final int METHODID_EVAL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConformanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConformanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PARSE:
          serviceImpl.parse((com.google.api.expr.conformance.v1alpha1.ParseRequest) request,
              (io.grpc.stub.StreamObserver<com.google.api.expr.conformance.v1alpha1.ParseResponse>) responseObserver);
          break;
        case METHODID_CHECK:
          serviceImpl.check((com.google.api.expr.conformance.v1alpha1.CheckRequest) request,
              (io.grpc.stub.StreamObserver<com.google.api.expr.conformance.v1alpha1.CheckResponse>) responseObserver);
          break;
        case METHODID_EVAL:
          serviceImpl.eval((com.google.api.expr.conformance.v1alpha1.EvalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.api.expr.conformance.v1alpha1.EvalResponse>) responseObserver);
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

  private static abstract class ConformanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConformanceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.api.expr.conformance.v1alpha1.ConformanceServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConformanceService");
    }
  }

  private static final class ConformanceServiceFileDescriptorSupplier
      extends ConformanceServiceBaseDescriptorSupplier {
    ConformanceServiceFileDescriptorSupplier() {}
  }

  private static final class ConformanceServiceMethodDescriptorSupplier
      extends ConformanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConformanceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConformanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConformanceServiceFileDescriptorSupplier())
              .addMethod(getParseMethod())
              .addMethod(getCheckMethod())
              .addMethod(getEvalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
