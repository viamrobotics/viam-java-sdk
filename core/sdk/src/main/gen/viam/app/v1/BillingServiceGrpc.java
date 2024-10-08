package viam.app.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: app/v1/billing.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BillingServiceGrpc {

  private BillingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.app.v1.BillingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.v1.Billing.GetCurrentMonthUsageRequest,
      viam.app.v1.Billing.GetCurrentMonthUsageResponse> getGetCurrentMonthUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentMonthUsage",
      requestType = viam.app.v1.Billing.GetCurrentMonthUsageRequest.class,
      responseType = viam.app.v1.Billing.GetCurrentMonthUsageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.Billing.GetCurrentMonthUsageRequest,
      viam.app.v1.Billing.GetCurrentMonthUsageResponse> getGetCurrentMonthUsageMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.Billing.GetCurrentMonthUsageRequest, viam.app.v1.Billing.GetCurrentMonthUsageResponse> getGetCurrentMonthUsageMethod;
    if ((getGetCurrentMonthUsageMethod = BillingServiceGrpc.getGetCurrentMonthUsageMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetCurrentMonthUsageMethod = BillingServiceGrpc.getGetCurrentMonthUsageMethod) == null) {
          BillingServiceGrpc.getGetCurrentMonthUsageMethod = getGetCurrentMonthUsageMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.Billing.GetCurrentMonthUsageRequest, viam.app.v1.Billing.GetCurrentMonthUsageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentMonthUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Billing.GetCurrentMonthUsageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Billing.GetCurrentMonthUsageResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCurrentMonthUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.Billing.GetOrgBillingInformationRequest,
      viam.app.v1.Billing.GetOrgBillingInformationResponse> getGetOrgBillingInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrgBillingInformation",
      requestType = viam.app.v1.Billing.GetOrgBillingInformationRequest.class,
      responseType = viam.app.v1.Billing.GetOrgBillingInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.Billing.GetOrgBillingInformationRequest,
      viam.app.v1.Billing.GetOrgBillingInformationResponse> getGetOrgBillingInformationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.Billing.GetOrgBillingInformationRequest, viam.app.v1.Billing.GetOrgBillingInformationResponse> getGetOrgBillingInformationMethod;
    if ((getGetOrgBillingInformationMethod = BillingServiceGrpc.getGetOrgBillingInformationMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetOrgBillingInformationMethod = BillingServiceGrpc.getGetOrgBillingInformationMethod) == null) {
          BillingServiceGrpc.getGetOrgBillingInformationMethod = getGetOrgBillingInformationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.Billing.GetOrgBillingInformationRequest, viam.app.v1.Billing.GetOrgBillingInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrgBillingInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Billing.GetOrgBillingInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Billing.GetOrgBillingInformationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOrgBillingInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.Billing.GetInvoicesSummaryRequest,
      viam.app.v1.Billing.GetInvoicesSummaryResponse> getGetInvoicesSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInvoicesSummary",
      requestType = viam.app.v1.Billing.GetInvoicesSummaryRequest.class,
      responseType = viam.app.v1.Billing.GetInvoicesSummaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.Billing.GetInvoicesSummaryRequest,
      viam.app.v1.Billing.GetInvoicesSummaryResponse> getGetInvoicesSummaryMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.Billing.GetInvoicesSummaryRequest, viam.app.v1.Billing.GetInvoicesSummaryResponse> getGetInvoicesSummaryMethod;
    if ((getGetInvoicesSummaryMethod = BillingServiceGrpc.getGetInvoicesSummaryMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetInvoicesSummaryMethod = BillingServiceGrpc.getGetInvoicesSummaryMethod) == null) {
          BillingServiceGrpc.getGetInvoicesSummaryMethod = getGetInvoicesSummaryMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.Billing.GetInvoicesSummaryRequest, viam.app.v1.Billing.GetInvoicesSummaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInvoicesSummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Billing.GetInvoicesSummaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Billing.GetInvoicesSummaryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetInvoicesSummaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.Billing.GetInvoicePdfRequest,
      viam.app.v1.Billing.GetInvoicePdfResponse> getGetInvoicePdfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInvoicePdf",
      requestType = viam.app.v1.Billing.GetInvoicePdfRequest.class,
      responseType = viam.app.v1.Billing.GetInvoicePdfResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<viam.app.v1.Billing.GetInvoicePdfRequest,
      viam.app.v1.Billing.GetInvoicePdfResponse> getGetInvoicePdfMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.Billing.GetInvoicePdfRequest, viam.app.v1.Billing.GetInvoicePdfResponse> getGetInvoicePdfMethod;
    if ((getGetInvoicePdfMethod = BillingServiceGrpc.getGetInvoicePdfMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetInvoicePdfMethod = BillingServiceGrpc.getGetInvoicePdfMethod) == null) {
          BillingServiceGrpc.getGetInvoicePdfMethod = getGetInvoicePdfMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.Billing.GetInvoicePdfRequest, viam.app.v1.Billing.GetInvoicePdfResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInvoicePdf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Billing.GetInvoicePdfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Billing.GetInvoicePdfResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetInvoicePdfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.Billing.SendPaymentRequiredEmailRequest,
      viam.app.v1.Billing.SendPaymentRequiredEmailResponse> getSendPaymentRequiredEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendPaymentRequiredEmail",
      requestType = viam.app.v1.Billing.SendPaymentRequiredEmailRequest.class,
      responseType = viam.app.v1.Billing.SendPaymentRequiredEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.Billing.SendPaymentRequiredEmailRequest,
      viam.app.v1.Billing.SendPaymentRequiredEmailResponse> getSendPaymentRequiredEmailMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.Billing.SendPaymentRequiredEmailRequest, viam.app.v1.Billing.SendPaymentRequiredEmailResponse> getSendPaymentRequiredEmailMethod;
    if ((getSendPaymentRequiredEmailMethod = BillingServiceGrpc.getSendPaymentRequiredEmailMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getSendPaymentRequiredEmailMethod = BillingServiceGrpc.getSendPaymentRequiredEmailMethod) == null) {
          BillingServiceGrpc.getSendPaymentRequiredEmailMethod = getSendPaymentRequiredEmailMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.Billing.SendPaymentRequiredEmailRequest, viam.app.v1.Billing.SendPaymentRequiredEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendPaymentRequiredEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Billing.SendPaymentRequiredEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.Billing.SendPaymentRequiredEmailResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSendPaymentRequiredEmailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BillingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceStub>() {
        @java.lang.Override
        public BillingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceStub(channel, callOptions);
        }
      };
    return BillingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BillingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceBlockingStub>() {
        @java.lang.Override
        public BillingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceBlockingStub(channel, callOptions);
        }
      };
    return BillingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BillingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceFutureStub>() {
        @java.lang.Override
        public BillingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceFutureStub(channel, callOptions);
        }
      };
    return BillingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Detailed breakdown of current month's costs
     * </pre>
     */
    default void getCurrentMonthUsage(viam.app.v1.Billing.GetCurrentMonthUsageRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Billing.GetCurrentMonthUsageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentMonthUsageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Org-level information (like billing email and payment details)
     * </pre>
     */
    default void getOrgBillingInformation(viam.app.v1.Billing.GetOrgBillingInformationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Billing.GetOrgBillingInformationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrgBillingInformationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Total outstanding balance and previous invoices
     * </pre>
     */
    default void getInvoicesSummary(viam.app.v1.Billing.GetInvoicesSummaryRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Billing.GetInvoicesSummaryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInvoicesSummaryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download a PDF invoice
     * </pre>
     */
    default void getInvoicePdf(viam.app.v1.Billing.GetInvoicePdfRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Billing.GetInvoicePdfResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInvoicePdfMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send an email with a prompt to the user's org's billing page.
     * </pre>
     */
    default void sendPaymentRequiredEmail(viam.app.v1.Billing.SendPaymentRequiredEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Billing.SendPaymentRequiredEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendPaymentRequiredEmailMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BillingService.
   */
  public static abstract class BillingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BillingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BillingService.
   */
  public static final class BillingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BillingServiceStub> {
    private BillingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Detailed breakdown of current month's costs
     * </pre>
     */
    public void getCurrentMonthUsage(viam.app.v1.Billing.GetCurrentMonthUsageRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Billing.GetCurrentMonthUsageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentMonthUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Org-level information (like billing email and payment details)
     * </pre>
     */
    public void getOrgBillingInformation(viam.app.v1.Billing.GetOrgBillingInformationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Billing.GetOrgBillingInformationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrgBillingInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Total outstanding balance and previous invoices
     * </pre>
     */
    public void getInvoicesSummary(viam.app.v1.Billing.GetInvoicesSummaryRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Billing.GetInvoicesSummaryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInvoicesSummaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download a PDF invoice
     * </pre>
     */
    public void getInvoicePdf(viam.app.v1.Billing.GetInvoicePdfRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Billing.GetInvoicePdfResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetInvoicePdfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send an email with a prompt to the user's org's billing page.
     * </pre>
     */
    public void sendPaymentRequiredEmail(viam.app.v1.Billing.SendPaymentRequiredEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.Billing.SendPaymentRequiredEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendPaymentRequiredEmailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BillingService.
   */
  public static final class BillingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BillingServiceBlockingStub> {
    private BillingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Detailed breakdown of current month's costs
     * </pre>
     */
    public viam.app.v1.Billing.GetCurrentMonthUsageResponse getCurrentMonthUsage(viam.app.v1.Billing.GetCurrentMonthUsageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentMonthUsageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Org-level information (like billing email and payment details)
     * </pre>
     */
    public viam.app.v1.Billing.GetOrgBillingInformationResponse getOrgBillingInformation(viam.app.v1.Billing.GetOrgBillingInformationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrgBillingInformationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Total outstanding balance and previous invoices
     * </pre>
     */
    public viam.app.v1.Billing.GetInvoicesSummaryResponse getInvoicesSummary(viam.app.v1.Billing.GetInvoicesSummaryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInvoicesSummaryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download a PDF invoice
     * </pre>
     */
    public java.util.Iterator<viam.app.v1.Billing.GetInvoicePdfResponse> getInvoicePdf(
        viam.app.v1.Billing.GetInvoicePdfRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetInvoicePdfMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send an email with a prompt to the user's org's billing page.
     * </pre>
     */
    public viam.app.v1.Billing.SendPaymentRequiredEmailResponse sendPaymentRequiredEmail(viam.app.v1.Billing.SendPaymentRequiredEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendPaymentRequiredEmailMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BillingService.
   */
  public static final class BillingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BillingServiceFutureStub> {
    private BillingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Detailed breakdown of current month's costs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.Billing.GetCurrentMonthUsageResponse> getCurrentMonthUsage(
        viam.app.v1.Billing.GetCurrentMonthUsageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentMonthUsageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Org-level information (like billing email and payment details)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.Billing.GetOrgBillingInformationResponse> getOrgBillingInformation(
        viam.app.v1.Billing.GetOrgBillingInformationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrgBillingInformationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Total outstanding balance and previous invoices
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.Billing.GetInvoicesSummaryResponse> getInvoicesSummary(
        viam.app.v1.Billing.GetInvoicesSummaryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInvoicesSummaryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send an email with a prompt to the user's org's billing page.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.Billing.SendPaymentRequiredEmailResponse> sendPaymentRequiredEmail(
        viam.app.v1.Billing.SendPaymentRequiredEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendPaymentRequiredEmailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENT_MONTH_USAGE = 0;
  private static final int METHODID_GET_ORG_BILLING_INFORMATION = 1;
  private static final int METHODID_GET_INVOICES_SUMMARY = 2;
  private static final int METHODID_GET_INVOICE_PDF = 3;
  private static final int METHODID_SEND_PAYMENT_REQUIRED_EMAIL = 4;

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
        case METHODID_GET_CURRENT_MONTH_USAGE:
          serviceImpl.getCurrentMonthUsage((viam.app.v1.Billing.GetCurrentMonthUsageRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.Billing.GetCurrentMonthUsageResponse>) responseObserver);
          break;
        case METHODID_GET_ORG_BILLING_INFORMATION:
          serviceImpl.getOrgBillingInformation((viam.app.v1.Billing.GetOrgBillingInformationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.Billing.GetOrgBillingInformationResponse>) responseObserver);
          break;
        case METHODID_GET_INVOICES_SUMMARY:
          serviceImpl.getInvoicesSummary((viam.app.v1.Billing.GetInvoicesSummaryRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.Billing.GetInvoicesSummaryResponse>) responseObserver);
          break;
        case METHODID_GET_INVOICE_PDF:
          serviceImpl.getInvoicePdf((viam.app.v1.Billing.GetInvoicePdfRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.Billing.GetInvoicePdfResponse>) responseObserver);
          break;
        case METHODID_SEND_PAYMENT_REQUIRED_EMAIL:
          serviceImpl.sendPaymentRequiredEmail((viam.app.v1.Billing.SendPaymentRequiredEmailRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.Billing.SendPaymentRequiredEmailResponse>) responseObserver);
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
          getGetCurrentMonthUsageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.Billing.GetCurrentMonthUsageRequest,
              viam.app.v1.Billing.GetCurrentMonthUsageResponse>(
                service, METHODID_GET_CURRENT_MONTH_USAGE)))
        .addMethod(
          getGetOrgBillingInformationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.Billing.GetOrgBillingInformationRequest,
              viam.app.v1.Billing.GetOrgBillingInformationResponse>(
                service, METHODID_GET_ORG_BILLING_INFORMATION)))
        .addMethod(
          getGetInvoicesSummaryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.Billing.GetInvoicesSummaryRequest,
              viam.app.v1.Billing.GetInvoicesSummaryResponse>(
                service, METHODID_GET_INVOICES_SUMMARY)))
        .addMethod(
          getGetInvoicePdfMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              viam.app.v1.Billing.GetInvoicePdfRequest,
              viam.app.v1.Billing.GetInvoicePdfResponse>(
                service, METHODID_GET_INVOICE_PDF)))
        .addMethod(
          getSendPaymentRequiredEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.Billing.SendPaymentRequiredEmailRequest,
              viam.app.v1.Billing.SendPaymentRequiredEmailResponse>(
                service, METHODID_SEND_PAYMENT_REQUIRED_EMAIL)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BillingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetCurrentMonthUsageMethod())
              .addMethod(getGetOrgBillingInformationMethod())
              .addMethod(getGetInvoicesSummaryMethod())
              .addMethod(getGetInvoicePdfMethod())
              .addMethod(getSendPaymentRequiredEmailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
