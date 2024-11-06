package com.google.bytestream;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * #### Introduction
 * The Byte Stream API enables a client to read and write a stream of bytes to
 * and from a resource. Resources have names, and these names are supplied in
 * the API calls below to identify the resource that is being read from or
 * written to.
 * All implementations of the Byte Stream API export the interface defined here:
 * * `Read()`: Reads the contents of a resource.
 * * `Write()`: Writes the contents of a resource. The client can call `Write()`
 *   multiple times with the same resource and can check the status of the write
 *   by calling `QueryWriteStatus()`.
 * #### Service parameters and metadata
 * The ByteStream API provides no direct way to access/modify any metadata
 * associated with the resource.
 * #### Errors
 * The errors returned by the service are in the Google canonical error space.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: google/bytestream/bytestream.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ByteStreamGrpc {

  private ByteStreamGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.bytestream.ByteStream";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.bytestream.ByteStreamProto.ReadRequest,
      com.google.bytestream.ByteStreamProto.ReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = com.google.bytestream.ByteStreamProto.ReadRequest.class,
      responseType = com.google.bytestream.ByteStreamProto.ReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.bytestream.ByteStreamProto.ReadRequest,
      com.google.bytestream.ByteStreamProto.ReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<com.google.bytestream.ByteStreamProto.ReadRequest, com.google.bytestream.ByteStreamProto.ReadResponse> getReadMethod;
    if ((getReadMethod = ByteStreamGrpc.getReadMethod) == null) {
      synchronized (ByteStreamGrpc.class) {
        if ((getReadMethod = ByteStreamGrpc.getReadMethod) == null) {
          ByteStreamGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<com.google.bytestream.ByteStreamProto.ReadRequest, com.google.bytestream.ByteStreamProto.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.bytestream.ByteStreamProto.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.bytestream.ByteStreamProto.ReadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.bytestream.ByteStreamProto.WriteRequest,
      com.google.bytestream.ByteStreamProto.WriteResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = com.google.bytestream.ByteStreamProto.WriteRequest.class,
      responseType = com.google.bytestream.ByteStreamProto.WriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.bytestream.ByteStreamProto.WriteRequest,
      com.google.bytestream.ByteStreamProto.WriteResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<com.google.bytestream.ByteStreamProto.WriteRequest, com.google.bytestream.ByteStreamProto.WriteResponse> getWriteMethod;
    if ((getWriteMethod = ByteStreamGrpc.getWriteMethod) == null) {
      synchronized (ByteStreamGrpc.class) {
        if ((getWriteMethod = ByteStreamGrpc.getWriteMethod) == null) {
          ByteStreamGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<com.google.bytestream.ByteStreamProto.WriteRequest, com.google.bytestream.ByteStreamProto.WriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.bytestream.ByteStreamProto.WriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.bytestream.ByteStreamProto.WriteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.bytestream.ByteStreamProto.QueryWriteStatusRequest,
      com.google.bytestream.ByteStreamProto.QueryWriteStatusResponse> getQueryWriteStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryWriteStatus",
      requestType = com.google.bytestream.ByteStreamProto.QueryWriteStatusRequest.class,
      responseType = com.google.bytestream.ByteStreamProto.QueryWriteStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.bytestream.ByteStreamProto.QueryWriteStatusRequest,
      com.google.bytestream.ByteStreamProto.QueryWriteStatusResponse> getQueryWriteStatusMethod() {
    io.grpc.MethodDescriptor<com.google.bytestream.ByteStreamProto.QueryWriteStatusRequest, com.google.bytestream.ByteStreamProto.QueryWriteStatusResponse> getQueryWriteStatusMethod;
    if ((getQueryWriteStatusMethod = ByteStreamGrpc.getQueryWriteStatusMethod) == null) {
      synchronized (ByteStreamGrpc.class) {
        if ((getQueryWriteStatusMethod = ByteStreamGrpc.getQueryWriteStatusMethod) == null) {
          ByteStreamGrpc.getQueryWriteStatusMethod = getQueryWriteStatusMethod =
              io.grpc.MethodDescriptor.<com.google.bytestream.ByteStreamProto.QueryWriteStatusRequest, com.google.bytestream.ByteStreamProto.QueryWriteStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryWriteStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.bytestream.ByteStreamProto.QueryWriteStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.bytestream.ByteStreamProto.QueryWriteStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getQueryWriteStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ByteStreamStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ByteStreamStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ByteStreamStub>() {
        @java.lang.Override
        public ByteStreamStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ByteStreamStub(channel, callOptions);
        }
      };
    return ByteStreamStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ByteStreamBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ByteStreamBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ByteStreamBlockingStub>() {
        @java.lang.Override
        public ByteStreamBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ByteStreamBlockingStub(channel, callOptions);
        }
      };
    return ByteStreamBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ByteStreamFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ByteStreamFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ByteStreamFutureStub>() {
        @java.lang.Override
        public ByteStreamFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ByteStreamFutureStub(channel, callOptions);
        }
      };
    return ByteStreamFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * #### Introduction
   * The Byte Stream API enables a client to read and write a stream of bytes to
   * and from a resource. Resources have names, and these names are supplied in
   * the API calls below to identify the resource that is being read from or
   * written to.
   * All implementations of the Byte Stream API export the interface defined here:
   * * `Read()`: Reads the contents of a resource.
   * * `Write()`: Writes the contents of a resource. The client can call `Write()`
   *   multiple times with the same resource and can check the status of the write
   *   by calling `QueryWriteStatus()`.
   * #### Service parameters and metadata
   * The ByteStream API provides no direct way to access/modify any metadata
   * associated with the resource.
   * #### Errors
   * The errors returned by the service are in the Google canonical error space.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * `Read()` is used to retrieve the contents of a resource as a sequence
     * of bytes. The bytes are returned in a sequence of responses, and the
     * responses are delivered as the results of a server-side streaming RPC.
     * </pre>
     */
    default void read(com.google.bytestream.ByteStreamProto.ReadRequest request,
        io.grpc.stub.StreamObserver<com.google.bytestream.ByteStreamProto.ReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     * <pre>
     * `Write()` is used to send the contents of a resource as a sequence of
     * bytes. The bytes are sent in a sequence of request protos of a client-side
     * streaming RPC.
     * A `Write()` action is resumable. If there is an error or the connection is
     * broken during the `Write()`, the client should check the status of the
     * `Write()` by calling `QueryWriteStatus()` and continue writing from the
     * returned `committed_size`. This may be less than the amount of data the
     * client previously sent.
     * Calling `Write()` on a resource name that was previously written and
     * finalized could cause an error, depending on whether the underlying service
     * allows over-writing of previously written resources.
     * When the client closes the request channel, the service will respond with
     * a `WriteResponse`. The service will not view the resource as `complete`
     * until the client has sent a `WriteRequest` with `finish_write` set to
     * `true`. Sending any requests on a stream after sending a request with
     * `finish_write` set to `true` will cause an error. The client **should**
     * check the `WriteResponse` it receives to determine how much data the
     * service was able to commit and whether the service views the resource as
     * `complete` or not.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.google.bytestream.ByteStreamProto.WriteRequest> write(
        io.grpc.stub.StreamObserver<com.google.bytestream.ByteStreamProto.WriteResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getWriteMethod(), responseObserver);
    }

    /**
     * <pre>
     * `QueryWriteStatus()` is used to find the `committed_size` for a resource
     * that is being written, which can then be used as the `write_offset` for
     * the next `Write()` call.
     * If the resource does not exist (i.e., the resource has been deleted, or the
     * first `Write()` has not yet reached the service), this method returns the
     * error `NOT_FOUND`.
     * The client **may** call `QueryWriteStatus()` at any time to determine how
     * much data has been processed for this resource. This is useful if the
     * client is buffering data and needs to know which data can be safely
     * evicted. For any sequence of `QueryWriteStatus()` calls for a given
     * resource name, the sequence of returned `committed_size` values will be
     * non-decreasing.
     * </pre>
     */
    default void queryWriteStatus(com.google.bytestream.ByteStreamProto.QueryWriteStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.bytestream.ByteStreamProto.QueryWriteStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryWriteStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ByteStream.
   * <pre>
   * #### Introduction
   * The Byte Stream API enables a client to read and write a stream of bytes to
   * and from a resource. Resources have names, and these names are supplied in
   * the API calls below to identify the resource that is being read from or
   * written to.
   * All implementations of the Byte Stream API export the interface defined here:
   * * `Read()`: Reads the contents of a resource.
   * * `Write()`: Writes the contents of a resource. The client can call `Write()`
   *   multiple times with the same resource and can check the status of the write
   *   by calling `QueryWriteStatus()`.
   * #### Service parameters and metadata
   * The ByteStream API provides no direct way to access/modify any metadata
   * associated with the resource.
   * #### Errors
   * The errors returned by the service are in the Google canonical error space.
   * </pre>
   */
  public static abstract class ByteStreamImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ByteStreamGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ByteStream.
   * <pre>
   * #### Introduction
   * The Byte Stream API enables a client to read and write a stream of bytes to
   * and from a resource. Resources have names, and these names are supplied in
   * the API calls below to identify the resource that is being read from or
   * written to.
   * All implementations of the Byte Stream API export the interface defined here:
   * * `Read()`: Reads the contents of a resource.
   * * `Write()`: Writes the contents of a resource. The client can call `Write()`
   *   multiple times with the same resource and can check the status of the write
   *   by calling `QueryWriteStatus()`.
   * #### Service parameters and metadata
   * The ByteStream API provides no direct way to access/modify any metadata
   * associated with the resource.
   * #### Errors
   * The errors returned by the service are in the Google canonical error space.
   * </pre>
   */
  public static final class ByteStreamStub
      extends io.grpc.stub.AbstractAsyncStub<ByteStreamStub> {
    private ByteStreamStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ByteStreamStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ByteStreamStub(channel, callOptions);
    }

    /**
     * <pre>
     * `Read()` is used to retrieve the contents of a resource as a sequence
     * of bytes. The bytes are returned in a sequence of responses, and the
     * responses are delivered as the results of a server-side streaming RPC.
     * </pre>
     */
    public void read(com.google.bytestream.ByteStreamProto.ReadRequest request,
        io.grpc.stub.StreamObserver<com.google.bytestream.ByteStreamProto.ReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * `Write()` is used to send the contents of a resource as a sequence of
     * bytes. The bytes are sent in a sequence of request protos of a client-side
     * streaming RPC.
     * A `Write()` action is resumable. If there is an error or the connection is
     * broken during the `Write()`, the client should check the status of the
     * `Write()` by calling `QueryWriteStatus()` and continue writing from the
     * returned `committed_size`. This may be less than the amount of data the
     * client previously sent.
     * Calling `Write()` on a resource name that was previously written and
     * finalized could cause an error, depending on whether the underlying service
     * allows over-writing of previously written resources.
     * When the client closes the request channel, the service will respond with
     * a `WriteResponse`. The service will not view the resource as `complete`
     * until the client has sent a `WriteRequest` with `finish_write` set to
     * `true`. Sending any requests on a stream after sending a request with
     * `finish_write` set to `true` will cause an error. The client **should**
     * check the `WriteResponse` it receives to determine how much data the
     * service was able to commit and whether the service views the resource as
     * `complete` or not.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.google.bytestream.ByteStreamProto.WriteRequest> write(
        io.grpc.stub.StreamObserver<com.google.bytestream.ByteStreamProto.WriteResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * `QueryWriteStatus()` is used to find the `committed_size` for a resource
     * that is being written, which can then be used as the `write_offset` for
     * the next `Write()` call.
     * If the resource does not exist (i.e., the resource has been deleted, or the
     * first `Write()` has not yet reached the service), this method returns the
     * error `NOT_FOUND`.
     * The client **may** call `QueryWriteStatus()` at any time to determine how
     * much data has been processed for this resource. This is useful if the
     * client is buffering data and needs to know which data can be safely
     * evicted. For any sequence of `QueryWriteStatus()` calls for a given
     * resource name, the sequence of returned `committed_size` values will be
     * non-decreasing.
     * </pre>
     */
    public void queryWriteStatus(com.google.bytestream.ByteStreamProto.QueryWriteStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.bytestream.ByteStreamProto.QueryWriteStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryWriteStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ByteStream.
   * <pre>
   * #### Introduction
   * The Byte Stream API enables a client to read and write a stream of bytes to
   * and from a resource. Resources have names, and these names are supplied in
   * the API calls below to identify the resource that is being read from or
   * written to.
   * All implementations of the Byte Stream API export the interface defined here:
   * * `Read()`: Reads the contents of a resource.
   * * `Write()`: Writes the contents of a resource. The client can call `Write()`
   *   multiple times with the same resource and can check the status of the write
   *   by calling `QueryWriteStatus()`.
   * #### Service parameters and metadata
   * The ByteStream API provides no direct way to access/modify any metadata
   * associated with the resource.
   * #### Errors
   * The errors returned by the service are in the Google canonical error space.
   * </pre>
   */
  public static final class ByteStreamBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ByteStreamBlockingStub> {
    private ByteStreamBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ByteStreamBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ByteStreamBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * `Read()` is used to retrieve the contents of a resource as a sequence
     * of bytes. The bytes are returned in a sequence of responses, and the
     * responses are delivered as the results of a server-side streaming RPC.
     * </pre>
     */
    public java.util.Iterator<com.google.bytestream.ByteStreamProto.ReadResponse> read(
        com.google.bytestream.ByteStreamProto.ReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * `QueryWriteStatus()` is used to find the `committed_size` for a resource
     * that is being written, which can then be used as the `write_offset` for
     * the next `Write()` call.
     * If the resource does not exist (i.e., the resource has been deleted, or the
     * first `Write()` has not yet reached the service), this method returns the
     * error `NOT_FOUND`.
     * The client **may** call `QueryWriteStatus()` at any time to determine how
     * much data has been processed for this resource. This is useful if the
     * client is buffering data and needs to know which data can be safely
     * evicted. For any sequence of `QueryWriteStatus()` calls for a given
     * resource name, the sequence of returned `committed_size` values will be
     * non-decreasing.
     * </pre>
     */
    public com.google.bytestream.ByteStreamProto.QueryWriteStatusResponse queryWriteStatus(com.google.bytestream.ByteStreamProto.QueryWriteStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryWriteStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ByteStream.
   * <pre>
   * #### Introduction
   * The Byte Stream API enables a client to read and write a stream of bytes to
   * and from a resource. Resources have names, and these names are supplied in
   * the API calls below to identify the resource that is being read from or
   * written to.
   * All implementations of the Byte Stream API export the interface defined here:
   * * `Read()`: Reads the contents of a resource.
   * * `Write()`: Writes the contents of a resource. The client can call `Write()`
   *   multiple times with the same resource and can check the status of the write
   *   by calling `QueryWriteStatus()`.
   * #### Service parameters and metadata
   * The ByteStream API provides no direct way to access/modify any metadata
   * associated with the resource.
   * #### Errors
   * The errors returned by the service are in the Google canonical error space.
   * </pre>
   */
  public static final class ByteStreamFutureStub
      extends io.grpc.stub.AbstractFutureStub<ByteStreamFutureStub> {
    private ByteStreamFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ByteStreamFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ByteStreamFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * `QueryWriteStatus()` is used to find the `committed_size` for a resource
     * that is being written, which can then be used as the `write_offset` for
     * the next `Write()` call.
     * If the resource does not exist (i.e., the resource has been deleted, or the
     * first `Write()` has not yet reached the service), this method returns the
     * error `NOT_FOUND`.
     * The client **may** call `QueryWriteStatus()` at any time to determine how
     * much data has been processed for this resource. This is useful if the
     * client is buffering data and needs to know which data can be safely
     * evicted. For any sequence of `QueryWriteStatus()` calls for a given
     * resource name, the sequence of returned `committed_size` values will be
     * non-decreasing.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.bytestream.ByteStreamProto.QueryWriteStatusResponse> queryWriteStatus(
        com.google.bytestream.ByteStreamProto.QueryWriteStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryWriteStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ = 0;
  private static final int METHODID_QUERY_WRITE_STATUS = 1;
  private static final int METHODID_WRITE = 2;

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
        case METHODID_READ:
          serviceImpl.read((com.google.bytestream.ByteStreamProto.ReadRequest) request,
              (io.grpc.stub.StreamObserver<com.google.bytestream.ByteStreamProto.ReadResponse>) responseObserver);
          break;
        case METHODID_QUERY_WRITE_STATUS:
          serviceImpl.queryWriteStatus((com.google.bytestream.ByteStreamProto.QueryWriteStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.google.bytestream.ByteStreamProto.QueryWriteStatusResponse>) responseObserver);
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
        case METHODID_WRITE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.write(
              (io.grpc.stub.StreamObserver<com.google.bytestream.ByteStreamProto.WriteResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getReadMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.bytestream.ByteStreamProto.ReadRequest,
              com.google.bytestream.ByteStreamProto.ReadResponse>(
                service, METHODID_READ)))
        .addMethod(
          getWriteMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.google.bytestream.ByteStreamProto.WriteRequest,
              com.google.bytestream.ByteStreamProto.WriteResponse>(
                service, METHODID_WRITE)))
        .addMethod(
          getQueryWriteStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.bytestream.ByteStreamProto.QueryWriteStatusRequest,
              com.google.bytestream.ByteStreamProto.QueryWriteStatusResponse>(
                service, METHODID_QUERY_WRITE_STATUS)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ByteStreamGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getReadMethod())
              .addMethod(getWriteMethod())
              .addMethod(getQueryWriteStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
