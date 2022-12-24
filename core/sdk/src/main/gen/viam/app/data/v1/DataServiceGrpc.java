package viam.app.data.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DataService is used to query robot data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: app/data/v1/data.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataServiceGrpc {

  private DataServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.app.data.v1.DataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.TabularDataByFilterRequest,
      viam.app.data.v1.Data.TabularDataByFilterResponse> getTabularDataByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TabularDataByFilter",
      requestType = viam.app.data.v1.Data.TabularDataByFilterRequest.class,
      responseType = viam.app.data.v1.Data.TabularDataByFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.TabularDataByFilterRequest,
      viam.app.data.v1.Data.TabularDataByFilterResponse> getTabularDataByFilterMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.TabularDataByFilterRequest, viam.app.data.v1.Data.TabularDataByFilterResponse> getTabularDataByFilterMethod;
    if ((getTabularDataByFilterMethod = DataServiceGrpc.getTabularDataByFilterMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getTabularDataByFilterMethod = DataServiceGrpc.getTabularDataByFilterMethod) == null) {
          DataServiceGrpc.getTabularDataByFilterMethod = getTabularDataByFilterMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.TabularDataByFilterRequest, viam.app.data.v1.Data.TabularDataByFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TabularDataByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.TabularDataByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.TabularDataByFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("TabularDataByFilter"))
              .build();
        }
      }
    }
    return getTabularDataByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.BinaryDataByFilterRequest,
      viam.app.data.v1.Data.BinaryDataByFilterResponse> getBinaryDataByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BinaryDataByFilter",
      requestType = viam.app.data.v1.Data.BinaryDataByFilterRequest.class,
      responseType = viam.app.data.v1.Data.BinaryDataByFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.BinaryDataByFilterRequest,
      viam.app.data.v1.Data.BinaryDataByFilterResponse> getBinaryDataByFilterMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.BinaryDataByFilterRequest, viam.app.data.v1.Data.BinaryDataByFilterResponse> getBinaryDataByFilterMethod;
    if ((getBinaryDataByFilterMethod = DataServiceGrpc.getBinaryDataByFilterMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getBinaryDataByFilterMethod = DataServiceGrpc.getBinaryDataByFilterMethod) == null) {
          DataServiceGrpc.getBinaryDataByFilterMethod = getBinaryDataByFilterMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.BinaryDataByFilterRequest, viam.app.data.v1.Data.BinaryDataByFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BinaryDataByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.BinaryDataByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.BinaryDataByFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("BinaryDataByFilter"))
              .build();
        }
      }
    }
    return getBinaryDataByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.BinaryDataByIDsRequest,
      viam.app.data.v1.Data.BinaryDataByIDsResponse> getBinaryDataByIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BinaryDataByIDs",
      requestType = viam.app.data.v1.Data.BinaryDataByIDsRequest.class,
      responseType = viam.app.data.v1.Data.BinaryDataByIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.BinaryDataByIDsRequest,
      viam.app.data.v1.Data.BinaryDataByIDsResponse> getBinaryDataByIDsMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.BinaryDataByIDsRequest, viam.app.data.v1.Data.BinaryDataByIDsResponse> getBinaryDataByIDsMethod;
    if ((getBinaryDataByIDsMethod = DataServiceGrpc.getBinaryDataByIDsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getBinaryDataByIDsMethod = DataServiceGrpc.getBinaryDataByIDsMethod) == null) {
          DataServiceGrpc.getBinaryDataByIDsMethod = getBinaryDataByIDsMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.BinaryDataByIDsRequest, viam.app.data.v1.Data.BinaryDataByIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BinaryDataByIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.BinaryDataByIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.BinaryDataByIDsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("BinaryDataByIDs"))
              .build();
        }
      }
    }
    return getBinaryDataByIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteTabularDataByFilterRequest,
      viam.app.data.v1.Data.DeleteTabularDataByFilterResponse> getDeleteTabularDataByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTabularDataByFilter",
      requestType = viam.app.data.v1.Data.DeleteTabularDataByFilterRequest.class,
      responseType = viam.app.data.v1.Data.DeleteTabularDataByFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteTabularDataByFilterRequest,
      viam.app.data.v1.Data.DeleteTabularDataByFilterResponse> getDeleteTabularDataByFilterMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteTabularDataByFilterRequest, viam.app.data.v1.Data.DeleteTabularDataByFilterResponse> getDeleteTabularDataByFilterMethod;
    if ((getDeleteTabularDataByFilterMethod = DataServiceGrpc.getDeleteTabularDataByFilterMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDeleteTabularDataByFilterMethod = DataServiceGrpc.getDeleteTabularDataByFilterMethod) == null) {
          DataServiceGrpc.getDeleteTabularDataByFilterMethod = getDeleteTabularDataByFilterMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.DeleteTabularDataByFilterRequest, viam.app.data.v1.Data.DeleteTabularDataByFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTabularDataByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.DeleteTabularDataByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.DeleteTabularDataByFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DeleteTabularDataByFilter"))
              .build();
        }
      }
    }
    return getDeleteTabularDataByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest,
      viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse> getDeleteBinaryDataByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBinaryDataByFilter",
      requestType = viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest.class,
      responseType = viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest,
      viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse> getDeleteBinaryDataByFilterMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest, viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse> getDeleteBinaryDataByFilterMethod;
    if ((getDeleteBinaryDataByFilterMethod = DataServiceGrpc.getDeleteBinaryDataByFilterMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDeleteBinaryDataByFilterMethod = DataServiceGrpc.getDeleteBinaryDataByFilterMethod) == null) {
          DataServiceGrpc.getDeleteBinaryDataByFilterMethod = getDeleteBinaryDataByFilterMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest, viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBinaryDataByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DeleteBinaryDataByFilter"))
              .build();
        }
      }
    }
    return getDeleteBinaryDataByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest,
      viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse> getDeleteBinaryDataByIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBinaryDataByIDs",
      requestType = viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest.class,
      responseType = viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest,
      viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse> getDeleteBinaryDataByIDsMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest, viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse> getDeleteBinaryDataByIDsMethod;
    if ((getDeleteBinaryDataByIDsMethod = DataServiceGrpc.getDeleteBinaryDataByIDsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDeleteBinaryDataByIDsMethod = DataServiceGrpc.getDeleteBinaryDataByIDsMethod) == null) {
          DataServiceGrpc.getDeleteBinaryDataByIDsMethod = getDeleteBinaryDataByIDsMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest, viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBinaryDataByIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DeleteBinaryDataByIDs"))
              .build();
        }
      }
    }
    return getDeleteBinaryDataByIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsRequest,
      viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsResponse> getAddTagsToBinaryDataByFileIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTagsToBinaryDataByFileIDs",
      requestType = viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsRequest.class,
      responseType = viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsRequest,
      viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsResponse> getAddTagsToBinaryDataByFileIDsMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsRequest, viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsResponse> getAddTagsToBinaryDataByFileIDsMethod;
    if ((getAddTagsToBinaryDataByFileIDsMethod = DataServiceGrpc.getAddTagsToBinaryDataByFileIDsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getAddTagsToBinaryDataByFileIDsMethod = DataServiceGrpc.getAddTagsToBinaryDataByFileIDsMethod) == null) {
          DataServiceGrpc.getAddTagsToBinaryDataByFileIDsMethod = getAddTagsToBinaryDataByFileIDsMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsRequest, viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTagsToBinaryDataByFileIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("AddTagsToBinaryDataByFileIDs"))
              .build();
        }
      }
    }
    return getAddTagsToBinaryDataByFileIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest,
      viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse> getAddTagsToBinaryDataByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTagsToBinaryDataByFilter",
      requestType = viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest.class,
      responseType = viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest,
      viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse> getAddTagsToBinaryDataByFilterMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest, viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse> getAddTagsToBinaryDataByFilterMethod;
    if ((getAddTagsToBinaryDataByFilterMethod = DataServiceGrpc.getAddTagsToBinaryDataByFilterMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getAddTagsToBinaryDataByFilterMethod = DataServiceGrpc.getAddTagsToBinaryDataByFilterMethod) == null) {
          DataServiceGrpc.getAddTagsToBinaryDataByFilterMethod = getAddTagsToBinaryDataByFilterMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest, viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTagsToBinaryDataByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("AddTagsToBinaryDataByFilter"))
              .build();
        }
      }
    }
    return getAddTagsToBinaryDataByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsRequest,
      viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsResponse> getRemoveTagsFromBinaryDataByFileIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTagsFromBinaryDataByFileIDs",
      requestType = viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsRequest.class,
      responseType = viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsRequest,
      viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsResponse> getRemoveTagsFromBinaryDataByFileIDsMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsRequest, viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsResponse> getRemoveTagsFromBinaryDataByFileIDsMethod;
    if ((getRemoveTagsFromBinaryDataByFileIDsMethod = DataServiceGrpc.getRemoveTagsFromBinaryDataByFileIDsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getRemoveTagsFromBinaryDataByFileIDsMethod = DataServiceGrpc.getRemoveTagsFromBinaryDataByFileIDsMethod) == null) {
          DataServiceGrpc.getRemoveTagsFromBinaryDataByFileIDsMethod = getRemoveTagsFromBinaryDataByFileIDsMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsRequest, viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTagsFromBinaryDataByFileIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("RemoveTagsFromBinaryDataByFileIDs"))
              .build();
        }
      }
    }
    return getRemoveTagsFromBinaryDataByFileIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest,
      viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse> getRemoveTagsFromBinaryDataByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTagsFromBinaryDataByFilter",
      requestType = viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest.class,
      responseType = viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest,
      viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse> getRemoveTagsFromBinaryDataByFilterMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest, viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse> getRemoveTagsFromBinaryDataByFilterMethod;
    if ((getRemoveTagsFromBinaryDataByFilterMethod = DataServiceGrpc.getRemoveTagsFromBinaryDataByFilterMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getRemoveTagsFromBinaryDataByFilterMethod = DataServiceGrpc.getRemoveTagsFromBinaryDataByFilterMethod) == null) {
          DataServiceGrpc.getRemoveTagsFromBinaryDataByFilterMethod = getRemoveTagsFromBinaryDataByFilterMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest, viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTagsFromBinaryDataByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("RemoveTagsFromBinaryDataByFilter"))
              .build();
        }
      }
    }
    return getRemoveTagsFromBinaryDataByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.TagsByFilterRequest,
      viam.app.data.v1.Data.TagsByFilterResponse> getTagsByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TagsByFilter",
      requestType = viam.app.data.v1.Data.TagsByFilterRequest.class,
      responseType = viam.app.data.v1.Data.TagsByFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.TagsByFilterRequest,
      viam.app.data.v1.Data.TagsByFilterResponse> getTagsByFilterMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.TagsByFilterRequest, viam.app.data.v1.Data.TagsByFilterResponse> getTagsByFilterMethod;
    if ((getTagsByFilterMethod = DataServiceGrpc.getTagsByFilterMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getTagsByFilterMethod = DataServiceGrpc.getTagsByFilterMethod) == null) {
          DataServiceGrpc.getTagsByFilterMethod = getTagsByFilterMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.TagsByFilterRequest, viam.app.data.v1.Data.TagsByFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TagsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.TagsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.data.v1.Data.TagsByFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("TagsByFilter"))
              .build();
        }
      }
    }
    return getTagsByFilterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceStub>() {
        @java.lang.Override
        public DataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceStub(channel, callOptions);
        }
      };
    return DataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceBlockingStub>() {
        @java.lang.Override
        public DataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceBlockingStub(channel, callOptions);
        }
      };
    return DataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceFutureStub>() {
        @java.lang.Override
        public DataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceFutureStub(channel, callOptions);
        }
      };
    return DataServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * DataService is used to query robot data.
   * </pre>
   */
  public static abstract class DataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * TabularDataByFilter queries tabular data and metadata based on given filters.
     * </pre>
     */
    public void tabularDataByFilter(viam.app.data.v1.Data.TabularDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TabularDataByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTabularDataByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * BinaryDataByFilter queries binary data and metadata based on given filters.
     * </pre>
     */
    public void binaryDataByFilter(viam.app.data.v1.Data.BinaryDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.BinaryDataByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBinaryDataByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * BinaryDataByIDs queries binary data and metadata based on given IDs.
     * </pre>
     */
    public void binaryDataByIDs(viam.app.data.v1.Data.BinaryDataByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.BinaryDataByIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBinaryDataByIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteTabularDataByFilter deletes tabular data based on given filters.
     * </pre>
     */
    public void deleteTabularDataByFilter(viam.app.data.v1.Data.DeleteTabularDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteTabularDataByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTabularDataByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteBinaryDataByFilter deletes binary data based on given filters.
     * </pre>
     */
    public void deleteBinaryDataByFilter(viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBinaryDataByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteBinaryDataByIDs deletes binary data based on given IDs.
     * </pre>
     */
    public void deleteBinaryDataByIDs(viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBinaryDataByIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddTagsToBinaryDataByFileIDs adds string tags, unless the tags are already present, to binary data based on given IDs.
     * </pre>
     */
    public void addTagsToBinaryDataByFileIDs(viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTagsToBinaryDataByFileIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddTagsToBinaryDataByFilter adds string tags, unless the tags are already present, to binary data based on the given filter.
     * </pre>
     */
    public void addTagsToBinaryDataByFilter(viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTagsToBinaryDataByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByFileIDs removes string tags from binary data based on given IDs.
     * </pre>
     */
    public void removeTagsFromBinaryDataByFileIDs(viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTagsFromBinaryDataByFileIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByFilter removes string tags from binary data based on the given filter.
     * </pre>
     */
    public void removeTagsFromBinaryDataByFilter(viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTagsFromBinaryDataByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * TagsByFilter gets all unique tags from data based on given filter.
     * </pre>
     */
    public void tagsByFilter(viam.app.data.v1.Data.TagsByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TagsByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTagsByFilterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTabularDataByFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.data.v1.Data.TabularDataByFilterRequest,
                viam.app.data.v1.Data.TabularDataByFilterResponse>(
                  this, METHODID_TABULAR_DATA_BY_FILTER)))
          .addMethod(
            getBinaryDataByFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.data.v1.Data.BinaryDataByFilterRequest,
                viam.app.data.v1.Data.BinaryDataByFilterResponse>(
                  this, METHODID_BINARY_DATA_BY_FILTER)))
          .addMethod(
            getBinaryDataByIDsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.data.v1.Data.BinaryDataByIDsRequest,
                viam.app.data.v1.Data.BinaryDataByIDsResponse>(
                  this, METHODID_BINARY_DATA_BY_IDS)))
          .addMethod(
            getDeleteTabularDataByFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.data.v1.Data.DeleteTabularDataByFilterRequest,
                viam.app.data.v1.Data.DeleteTabularDataByFilterResponse>(
                  this, METHODID_DELETE_TABULAR_DATA_BY_FILTER)))
          .addMethod(
            getDeleteBinaryDataByFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest,
                viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse>(
                  this, METHODID_DELETE_BINARY_DATA_BY_FILTER)))
          .addMethod(
            getDeleteBinaryDataByIDsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest,
                viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse>(
                  this, METHODID_DELETE_BINARY_DATA_BY_IDS)))
          .addMethod(
            getAddTagsToBinaryDataByFileIDsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsRequest,
                viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsResponse>(
                  this, METHODID_ADD_TAGS_TO_BINARY_DATA_BY_FILE_IDS)))
          .addMethod(
            getAddTagsToBinaryDataByFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest,
                viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse>(
                  this, METHODID_ADD_TAGS_TO_BINARY_DATA_BY_FILTER)))
          .addMethod(
            getRemoveTagsFromBinaryDataByFileIDsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsRequest,
                viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsResponse>(
                  this, METHODID_REMOVE_TAGS_FROM_BINARY_DATA_BY_FILE_IDS)))
          .addMethod(
            getRemoveTagsFromBinaryDataByFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest,
                viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse>(
                  this, METHODID_REMOVE_TAGS_FROM_BINARY_DATA_BY_FILTER)))
          .addMethod(
            getTagsByFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.data.v1.Data.TagsByFilterRequest,
                viam.app.data.v1.Data.TagsByFilterResponse>(
                  this, METHODID_TAGS_BY_FILTER)))
          .build();
    }
  }

  /**
   * <pre>
   * DataService is used to query robot data.
   * </pre>
   */
  public static final class DataServiceStub extends io.grpc.stub.AbstractAsyncStub<DataServiceStub> {
    private DataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * TabularDataByFilter queries tabular data and metadata based on given filters.
     * </pre>
     */
    public void tabularDataByFilter(viam.app.data.v1.Data.TabularDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TabularDataByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTabularDataByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BinaryDataByFilter queries binary data and metadata based on given filters.
     * </pre>
     */
    public void binaryDataByFilter(viam.app.data.v1.Data.BinaryDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.BinaryDataByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBinaryDataByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BinaryDataByIDs queries binary data and metadata based on given IDs.
     * </pre>
     */
    public void binaryDataByIDs(viam.app.data.v1.Data.BinaryDataByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.BinaryDataByIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBinaryDataByIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteTabularDataByFilter deletes tabular data based on given filters.
     * </pre>
     */
    public void deleteTabularDataByFilter(viam.app.data.v1.Data.DeleteTabularDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteTabularDataByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTabularDataByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteBinaryDataByFilter deletes binary data based on given filters.
     * </pre>
     */
    public void deleteBinaryDataByFilter(viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBinaryDataByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteBinaryDataByIDs deletes binary data based on given IDs.
     * </pre>
     */
    public void deleteBinaryDataByIDs(viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBinaryDataByIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddTagsToBinaryDataByFileIDs adds string tags, unless the tags are already present, to binary data based on given IDs.
     * </pre>
     */
    public void addTagsToBinaryDataByFileIDs(viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTagsToBinaryDataByFileIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddTagsToBinaryDataByFilter adds string tags, unless the tags are already present, to binary data based on the given filter.
     * </pre>
     */
    public void addTagsToBinaryDataByFilter(viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTagsToBinaryDataByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByFileIDs removes string tags from binary data based on given IDs.
     * </pre>
     */
    public void removeTagsFromBinaryDataByFileIDs(viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTagsFromBinaryDataByFileIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByFilter removes string tags from binary data based on the given filter.
     * </pre>
     */
    public void removeTagsFromBinaryDataByFilter(viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTagsFromBinaryDataByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TagsByFilter gets all unique tags from data based on given filter.
     * </pre>
     */
    public void tagsByFilter(viam.app.data.v1.Data.TagsByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TagsByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTagsByFilterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * DataService is used to query robot data.
   * </pre>
   */
  public static final class DataServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DataServiceBlockingStub> {
    private DataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * TabularDataByFilter queries tabular data and metadata based on given filters.
     * </pre>
     */
    public viam.app.data.v1.Data.TabularDataByFilterResponse tabularDataByFilter(viam.app.data.v1.Data.TabularDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTabularDataByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BinaryDataByFilter queries binary data and metadata based on given filters.
     * </pre>
     */
    public viam.app.data.v1.Data.BinaryDataByFilterResponse binaryDataByFilter(viam.app.data.v1.Data.BinaryDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBinaryDataByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BinaryDataByIDs queries binary data and metadata based on given IDs.
     * </pre>
     */
    public viam.app.data.v1.Data.BinaryDataByIDsResponse binaryDataByIDs(viam.app.data.v1.Data.BinaryDataByIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBinaryDataByIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteTabularDataByFilter deletes tabular data based on given filters.
     * </pre>
     */
    public viam.app.data.v1.Data.DeleteTabularDataByFilterResponse deleteTabularDataByFilter(viam.app.data.v1.Data.DeleteTabularDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTabularDataByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteBinaryDataByFilter deletes binary data based on given filters.
     * </pre>
     */
    public viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse deleteBinaryDataByFilter(viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBinaryDataByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteBinaryDataByIDs deletes binary data based on given IDs.
     * </pre>
     */
    public viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse deleteBinaryDataByIDs(viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBinaryDataByIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddTagsToBinaryDataByFileIDs adds string tags, unless the tags are already present, to binary data based on given IDs.
     * </pre>
     */
    public viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsResponse addTagsToBinaryDataByFileIDs(viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTagsToBinaryDataByFileIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddTagsToBinaryDataByFilter adds string tags, unless the tags are already present, to binary data based on the given filter.
     * </pre>
     */
    public viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse addTagsToBinaryDataByFilter(viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTagsToBinaryDataByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByFileIDs removes string tags from binary data based on given IDs.
     * </pre>
     */
    public viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsResponse removeTagsFromBinaryDataByFileIDs(viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTagsFromBinaryDataByFileIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByFilter removes string tags from binary data based on the given filter.
     * </pre>
     */
    public viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse removeTagsFromBinaryDataByFilter(viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTagsFromBinaryDataByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TagsByFilter gets all unique tags from data based on given filter.
     * </pre>
     */
    public viam.app.data.v1.Data.TagsByFilterResponse tagsByFilter(viam.app.data.v1.Data.TagsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTagsByFilterMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * DataService is used to query robot data.
   * </pre>
   */
  public static final class DataServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DataServiceFutureStub> {
    private DataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * TabularDataByFilter queries tabular data and metadata based on given filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.TabularDataByFilterResponse> tabularDataByFilter(
        viam.app.data.v1.Data.TabularDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTabularDataByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BinaryDataByFilter queries binary data and metadata based on given filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.BinaryDataByFilterResponse> binaryDataByFilter(
        viam.app.data.v1.Data.BinaryDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBinaryDataByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BinaryDataByIDs queries binary data and metadata based on given IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.BinaryDataByIDsResponse> binaryDataByIDs(
        viam.app.data.v1.Data.BinaryDataByIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBinaryDataByIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteTabularDataByFilter deletes tabular data based on given filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.DeleteTabularDataByFilterResponse> deleteTabularDataByFilter(
        viam.app.data.v1.Data.DeleteTabularDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTabularDataByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteBinaryDataByFilter deletes binary data based on given filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse> deleteBinaryDataByFilter(
        viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBinaryDataByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteBinaryDataByIDs deletes binary data based on given IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse> deleteBinaryDataByIDs(
        viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBinaryDataByIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddTagsToBinaryDataByFileIDs adds string tags, unless the tags are already present, to binary data based on given IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsResponse> addTagsToBinaryDataByFileIDs(
        viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTagsToBinaryDataByFileIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddTagsToBinaryDataByFilter adds string tags, unless the tags are already present, to binary data based on the given filter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse> addTagsToBinaryDataByFilter(
        viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTagsToBinaryDataByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByFileIDs removes string tags from binary data based on given IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsResponse> removeTagsFromBinaryDataByFileIDs(
        viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTagsFromBinaryDataByFileIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByFilter removes string tags from binary data based on the given filter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse> removeTagsFromBinaryDataByFilter(
        viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTagsFromBinaryDataByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TagsByFilter gets all unique tags from data based on given filter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.TagsByFilterResponse> tagsByFilter(
        viam.app.data.v1.Data.TagsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTagsByFilterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TABULAR_DATA_BY_FILTER = 0;
  private static final int METHODID_BINARY_DATA_BY_FILTER = 1;
  private static final int METHODID_BINARY_DATA_BY_IDS = 2;
  private static final int METHODID_DELETE_TABULAR_DATA_BY_FILTER = 3;
  private static final int METHODID_DELETE_BINARY_DATA_BY_FILTER = 4;
  private static final int METHODID_DELETE_BINARY_DATA_BY_IDS = 5;
  private static final int METHODID_ADD_TAGS_TO_BINARY_DATA_BY_FILE_IDS = 6;
  private static final int METHODID_ADD_TAGS_TO_BINARY_DATA_BY_FILTER = 7;
  private static final int METHODID_REMOVE_TAGS_FROM_BINARY_DATA_BY_FILE_IDS = 8;
  private static final int METHODID_REMOVE_TAGS_FROM_BINARY_DATA_BY_FILTER = 9;
  private static final int METHODID_TAGS_BY_FILTER = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TABULAR_DATA_BY_FILTER:
          serviceImpl.tabularDataByFilter((viam.app.data.v1.Data.TabularDataByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TabularDataByFilterResponse>) responseObserver);
          break;
        case METHODID_BINARY_DATA_BY_FILTER:
          serviceImpl.binaryDataByFilter((viam.app.data.v1.Data.BinaryDataByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.BinaryDataByFilterResponse>) responseObserver);
          break;
        case METHODID_BINARY_DATA_BY_IDS:
          serviceImpl.binaryDataByIDs((viam.app.data.v1.Data.BinaryDataByIDsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.BinaryDataByIDsResponse>) responseObserver);
          break;
        case METHODID_DELETE_TABULAR_DATA_BY_FILTER:
          serviceImpl.deleteTabularDataByFilter((viam.app.data.v1.Data.DeleteTabularDataByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteTabularDataByFilterResponse>) responseObserver);
          break;
        case METHODID_DELETE_BINARY_DATA_BY_FILTER:
          serviceImpl.deleteBinaryDataByFilter((viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse>) responseObserver);
          break;
        case METHODID_DELETE_BINARY_DATA_BY_IDS:
          serviceImpl.deleteBinaryDataByIDs((viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse>) responseObserver);
          break;
        case METHODID_ADD_TAGS_TO_BINARY_DATA_BY_FILE_IDS:
          serviceImpl.addTagsToBinaryDataByFileIDs((viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddTagsToBinaryDataByFileIDsResponse>) responseObserver);
          break;
        case METHODID_ADD_TAGS_TO_BINARY_DATA_BY_FILTER:
          serviceImpl.addTagsToBinaryDataByFilter((viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse>) responseObserver);
          break;
        case METHODID_REMOVE_TAGS_FROM_BINARY_DATA_BY_FILE_IDS:
          serviceImpl.removeTagsFromBinaryDataByFileIDs((viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFileIDsResponse>) responseObserver);
          break;
        case METHODID_REMOVE_TAGS_FROM_BINARY_DATA_BY_FILTER:
          serviceImpl.removeTagsFromBinaryDataByFilter((viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse>) responseObserver);
          break;
        case METHODID_TAGS_BY_FILTER:
          serviceImpl.tagsByFilter((viam.app.data.v1.Data.TagsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TagsByFilterResponse>) responseObserver);
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

  private static abstract class DataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return viam.app.data.v1.Data.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataService");
    }
  }

  private static final class DataServiceFileDescriptorSupplier
      extends DataServiceBaseDescriptorSupplier {
    DataServiceFileDescriptorSupplier() {}
  }

  private static final class DataServiceMethodDescriptorSupplier
      extends DataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataServiceFileDescriptorSupplier())
              .addMethod(getTabularDataByFilterMethod())
              .addMethod(getBinaryDataByFilterMethod())
              .addMethod(getBinaryDataByIDsMethod())
              .addMethod(getDeleteTabularDataByFilterMethod())
              .addMethod(getDeleteBinaryDataByFilterMethod())
              .addMethod(getDeleteBinaryDataByIDsMethod())
              .addMethod(getAddTagsToBinaryDataByFileIDsMethod())
              .addMethod(getAddTagsToBinaryDataByFilterMethod())
              .addMethod(getRemoveTagsFromBinaryDataByFileIDsMethod())
              .addMethod(getRemoveTagsFromBinaryDataByFilterMethod())
              .addMethod(getTagsByFilterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
