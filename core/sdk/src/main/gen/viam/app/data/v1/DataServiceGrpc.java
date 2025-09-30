package viam.app.data.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DataService is used to query robot data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: app/data/v1/data.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataServiceGrpc {

  private DataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.app.data.v1.DataService";

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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.TabularDataByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.TabularDataByFilterResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTabularDataByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.TabularDataBySQLRequest,
      viam.app.data.v1.Data.TabularDataBySQLResponse> getTabularDataBySQLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TabularDataBySQL",
      requestType = viam.app.data.v1.Data.TabularDataBySQLRequest.class,
      responseType = viam.app.data.v1.Data.TabularDataBySQLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.TabularDataBySQLRequest,
      viam.app.data.v1.Data.TabularDataBySQLResponse> getTabularDataBySQLMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.TabularDataBySQLRequest, viam.app.data.v1.Data.TabularDataBySQLResponse> getTabularDataBySQLMethod;
    if ((getTabularDataBySQLMethod = DataServiceGrpc.getTabularDataBySQLMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getTabularDataBySQLMethod = DataServiceGrpc.getTabularDataBySQLMethod) == null) {
          DataServiceGrpc.getTabularDataBySQLMethod = getTabularDataBySQLMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.TabularDataBySQLRequest, viam.app.data.v1.Data.TabularDataBySQLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TabularDataBySQL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.TabularDataBySQLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.TabularDataBySQLResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTabularDataBySQLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.TabularDataByMQLRequest,
      viam.app.data.v1.Data.TabularDataByMQLResponse> getTabularDataByMQLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TabularDataByMQL",
      requestType = viam.app.data.v1.Data.TabularDataByMQLRequest.class,
      responseType = viam.app.data.v1.Data.TabularDataByMQLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.TabularDataByMQLRequest,
      viam.app.data.v1.Data.TabularDataByMQLResponse> getTabularDataByMQLMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.TabularDataByMQLRequest, viam.app.data.v1.Data.TabularDataByMQLResponse> getTabularDataByMQLMethod;
    if ((getTabularDataByMQLMethod = DataServiceGrpc.getTabularDataByMQLMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getTabularDataByMQLMethod = DataServiceGrpc.getTabularDataByMQLMethod) == null) {
          DataServiceGrpc.getTabularDataByMQLMethod = getTabularDataByMQLMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.TabularDataByMQLRequest, viam.app.data.v1.Data.TabularDataByMQLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TabularDataByMQL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.TabularDataByMQLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.TabularDataByMQLResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTabularDataByMQLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.ExportTabularDataRequest,
      viam.app.data.v1.Data.ExportTabularDataResponse> getExportTabularDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportTabularData",
      requestType = viam.app.data.v1.Data.ExportTabularDataRequest.class,
      responseType = viam.app.data.v1.Data.ExportTabularDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.ExportTabularDataRequest,
      viam.app.data.v1.Data.ExportTabularDataResponse> getExportTabularDataMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.ExportTabularDataRequest, viam.app.data.v1.Data.ExportTabularDataResponse> getExportTabularDataMethod;
    if ((getExportTabularDataMethod = DataServiceGrpc.getExportTabularDataMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getExportTabularDataMethod = DataServiceGrpc.getExportTabularDataMethod) == null) {
          DataServiceGrpc.getExportTabularDataMethod = getExportTabularDataMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.ExportTabularDataRequest, viam.app.data.v1.Data.ExportTabularDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportTabularData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.ExportTabularDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.ExportTabularDataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getExportTabularDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.GetLatestTabularDataRequest,
      viam.app.data.v1.Data.GetLatestTabularDataResponse> getGetLatestTabularDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestTabularData",
      requestType = viam.app.data.v1.Data.GetLatestTabularDataRequest.class,
      responseType = viam.app.data.v1.Data.GetLatestTabularDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.GetLatestTabularDataRequest,
      viam.app.data.v1.Data.GetLatestTabularDataResponse> getGetLatestTabularDataMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.GetLatestTabularDataRequest, viam.app.data.v1.Data.GetLatestTabularDataResponse> getGetLatestTabularDataMethod;
    if ((getGetLatestTabularDataMethod = DataServiceGrpc.getGetLatestTabularDataMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getGetLatestTabularDataMethod = DataServiceGrpc.getGetLatestTabularDataMethod) == null) {
          DataServiceGrpc.getGetLatestTabularDataMethod = getGetLatestTabularDataMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.GetLatestTabularDataRequest, viam.app.data.v1.Data.GetLatestTabularDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestTabularData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.GetLatestTabularDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.GetLatestTabularDataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetLatestTabularDataMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.BinaryDataByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.BinaryDataByFilterResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.BinaryDataByIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.BinaryDataByIDsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getBinaryDataByIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteTabularDataRequest,
      viam.app.data.v1.Data.DeleteTabularDataResponse> getDeleteTabularDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTabularData",
      requestType = viam.app.data.v1.Data.DeleteTabularDataRequest.class,
      responseType = viam.app.data.v1.Data.DeleteTabularDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteTabularDataRequest,
      viam.app.data.v1.Data.DeleteTabularDataResponse> getDeleteTabularDataMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteTabularDataRequest, viam.app.data.v1.Data.DeleteTabularDataResponse> getDeleteTabularDataMethod;
    if ((getDeleteTabularDataMethod = DataServiceGrpc.getDeleteTabularDataMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDeleteTabularDataMethod = DataServiceGrpc.getDeleteTabularDataMethod) == null) {
          DataServiceGrpc.getDeleteTabularDataMethod = getDeleteTabularDataMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.DeleteTabularDataRequest, viam.app.data.v1.Data.DeleteTabularDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTabularData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.DeleteTabularDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.DeleteTabularDataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteTabularDataMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteBinaryDataByIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddTagsToBinaryDataByIDsRequest,
      viam.app.data.v1.Data.AddTagsToBinaryDataByIDsResponse> getAddTagsToBinaryDataByIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTagsToBinaryDataByIDs",
      requestType = viam.app.data.v1.Data.AddTagsToBinaryDataByIDsRequest.class,
      responseType = viam.app.data.v1.Data.AddTagsToBinaryDataByIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddTagsToBinaryDataByIDsRequest,
      viam.app.data.v1.Data.AddTagsToBinaryDataByIDsResponse> getAddTagsToBinaryDataByIDsMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddTagsToBinaryDataByIDsRequest, viam.app.data.v1.Data.AddTagsToBinaryDataByIDsResponse> getAddTagsToBinaryDataByIDsMethod;
    if ((getAddTagsToBinaryDataByIDsMethod = DataServiceGrpc.getAddTagsToBinaryDataByIDsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getAddTagsToBinaryDataByIDsMethod = DataServiceGrpc.getAddTagsToBinaryDataByIDsMethod) == null) {
          DataServiceGrpc.getAddTagsToBinaryDataByIDsMethod = getAddTagsToBinaryDataByIDsMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.AddTagsToBinaryDataByIDsRequest, viam.app.data.v1.Data.AddTagsToBinaryDataByIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTagsToBinaryDataByIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.AddTagsToBinaryDataByIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.AddTagsToBinaryDataByIDsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddTagsToBinaryDataByIDsMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddTagsToBinaryDataByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsRequest,
      viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsResponse> getRemoveTagsFromBinaryDataByIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTagsFromBinaryDataByIDs",
      requestType = viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsRequest.class,
      responseType = viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsRequest,
      viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsResponse> getRemoveTagsFromBinaryDataByIDsMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsRequest, viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsResponse> getRemoveTagsFromBinaryDataByIDsMethod;
    if ((getRemoveTagsFromBinaryDataByIDsMethod = DataServiceGrpc.getRemoveTagsFromBinaryDataByIDsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getRemoveTagsFromBinaryDataByIDsMethod = DataServiceGrpc.getRemoveTagsFromBinaryDataByIDsMethod) == null) {
          DataServiceGrpc.getRemoveTagsFromBinaryDataByIDsMethod = getRemoveTagsFromBinaryDataByIDsMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsRequest, viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTagsFromBinaryDataByIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveTagsFromBinaryDataByIDsMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.TagsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.TagsByFilterResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTagsByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddBoundingBoxToImageByIDRequest,
      viam.app.data.v1.Data.AddBoundingBoxToImageByIDResponse> getAddBoundingBoxToImageByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBoundingBoxToImageByID",
      requestType = viam.app.data.v1.Data.AddBoundingBoxToImageByIDRequest.class,
      responseType = viam.app.data.v1.Data.AddBoundingBoxToImageByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddBoundingBoxToImageByIDRequest,
      viam.app.data.v1.Data.AddBoundingBoxToImageByIDResponse> getAddBoundingBoxToImageByIDMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddBoundingBoxToImageByIDRequest, viam.app.data.v1.Data.AddBoundingBoxToImageByIDResponse> getAddBoundingBoxToImageByIDMethod;
    if ((getAddBoundingBoxToImageByIDMethod = DataServiceGrpc.getAddBoundingBoxToImageByIDMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getAddBoundingBoxToImageByIDMethod = DataServiceGrpc.getAddBoundingBoxToImageByIDMethod) == null) {
          DataServiceGrpc.getAddBoundingBoxToImageByIDMethod = getAddBoundingBoxToImageByIDMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.AddBoundingBoxToImageByIDRequest, viam.app.data.v1.Data.AddBoundingBoxToImageByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddBoundingBoxToImageByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.AddBoundingBoxToImageByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.AddBoundingBoxToImageByIDResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddBoundingBoxToImageByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDRequest,
      viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDResponse> getRemoveBoundingBoxFromImageByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveBoundingBoxFromImageByID",
      requestType = viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDRequest.class,
      responseType = viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDRequest,
      viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDResponse> getRemoveBoundingBoxFromImageByIDMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDRequest, viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDResponse> getRemoveBoundingBoxFromImageByIDMethod;
    if ((getRemoveBoundingBoxFromImageByIDMethod = DataServiceGrpc.getRemoveBoundingBoxFromImageByIDMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getRemoveBoundingBoxFromImageByIDMethod = DataServiceGrpc.getRemoveBoundingBoxFromImageByIDMethod) == null) {
          DataServiceGrpc.getRemoveBoundingBoxFromImageByIDMethod = getRemoveBoundingBoxFromImageByIDMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDRequest, viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveBoundingBoxFromImageByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveBoundingBoxFromImageByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.BoundingBoxLabelsByFilterRequest,
      viam.app.data.v1.Data.BoundingBoxLabelsByFilterResponse> getBoundingBoxLabelsByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BoundingBoxLabelsByFilter",
      requestType = viam.app.data.v1.Data.BoundingBoxLabelsByFilterRequest.class,
      responseType = viam.app.data.v1.Data.BoundingBoxLabelsByFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.BoundingBoxLabelsByFilterRequest,
      viam.app.data.v1.Data.BoundingBoxLabelsByFilterResponse> getBoundingBoxLabelsByFilterMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.BoundingBoxLabelsByFilterRequest, viam.app.data.v1.Data.BoundingBoxLabelsByFilterResponse> getBoundingBoxLabelsByFilterMethod;
    if ((getBoundingBoxLabelsByFilterMethod = DataServiceGrpc.getBoundingBoxLabelsByFilterMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getBoundingBoxLabelsByFilterMethod = DataServiceGrpc.getBoundingBoxLabelsByFilterMethod) == null) {
          DataServiceGrpc.getBoundingBoxLabelsByFilterMethod = getBoundingBoxLabelsByFilterMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.BoundingBoxLabelsByFilterRequest, viam.app.data.v1.Data.BoundingBoxLabelsByFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BoundingBoxLabelsByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.BoundingBoxLabelsByFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.BoundingBoxLabelsByFilterResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getBoundingBoxLabelsByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.UpdateBoundingBoxRequest,
      viam.app.data.v1.Data.UpdateBoundingBoxResponse> getUpdateBoundingBoxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBoundingBox",
      requestType = viam.app.data.v1.Data.UpdateBoundingBoxRequest.class,
      responseType = viam.app.data.v1.Data.UpdateBoundingBoxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.UpdateBoundingBoxRequest,
      viam.app.data.v1.Data.UpdateBoundingBoxResponse> getUpdateBoundingBoxMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.UpdateBoundingBoxRequest, viam.app.data.v1.Data.UpdateBoundingBoxResponse> getUpdateBoundingBoxMethod;
    if ((getUpdateBoundingBoxMethod = DataServiceGrpc.getUpdateBoundingBoxMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getUpdateBoundingBoxMethod = DataServiceGrpc.getUpdateBoundingBoxMethod) == null) {
          DataServiceGrpc.getUpdateBoundingBoxMethod = getUpdateBoundingBoxMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.UpdateBoundingBoxRequest, viam.app.data.v1.Data.UpdateBoundingBoxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBoundingBox"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.UpdateBoundingBoxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.UpdateBoundingBoxResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateBoundingBoxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.GetDatabaseConnectionRequest,
      viam.app.data.v1.Data.GetDatabaseConnectionResponse> getGetDatabaseConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatabaseConnection",
      requestType = viam.app.data.v1.Data.GetDatabaseConnectionRequest.class,
      responseType = viam.app.data.v1.Data.GetDatabaseConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.GetDatabaseConnectionRequest,
      viam.app.data.v1.Data.GetDatabaseConnectionResponse> getGetDatabaseConnectionMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.GetDatabaseConnectionRequest, viam.app.data.v1.Data.GetDatabaseConnectionResponse> getGetDatabaseConnectionMethod;
    if ((getGetDatabaseConnectionMethod = DataServiceGrpc.getGetDatabaseConnectionMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getGetDatabaseConnectionMethod = DataServiceGrpc.getGetDatabaseConnectionMethod) == null) {
          DataServiceGrpc.getGetDatabaseConnectionMethod = getGetDatabaseConnectionMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.GetDatabaseConnectionRequest, viam.app.data.v1.Data.GetDatabaseConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatabaseConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.GetDatabaseConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.GetDatabaseConnectionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetDatabaseConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.ConfigureDatabaseUserRequest,
      viam.app.data.v1.Data.ConfigureDatabaseUserResponse> getConfigureDatabaseUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureDatabaseUser",
      requestType = viam.app.data.v1.Data.ConfigureDatabaseUserRequest.class,
      responseType = viam.app.data.v1.Data.ConfigureDatabaseUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.ConfigureDatabaseUserRequest,
      viam.app.data.v1.Data.ConfigureDatabaseUserResponse> getConfigureDatabaseUserMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.ConfigureDatabaseUserRequest, viam.app.data.v1.Data.ConfigureDatabaseUserResponse> getConfigureDatabaseUserMethod;
    if ((getConfigureDatabaseUserMethod = DataServiceGrpc.getConfigureDatabaseUserMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getConfigureDatabaseUserMethod = DataServiceGrpc.getConfigureDatabaseUserMethod) == null) {
          DataServiceGrpc.getConfigureDatabaseUserMethod = getConfigureDatabaseUserMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.ConfigureDatabaseUserRequest, viam.app.data.v1.Data.ConfigureDatabaseUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureDatabaseUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.ConfigureDatabaseUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.ConfigureDatabaseUserResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getConfigureDatabaseUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsRequest,
      viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsResponse> getAddBinaryDataToDatasetByIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBinaryDataToDatasetByIDs",
      requestType = viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsRequest.class,
      responseType = viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsRequest,
      viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsResponse> getAddBinaryDataToDatasetByIDsMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsRequest, viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsResponse> getAddBinaryDataToDatasetByIDsMethod;
    if ((getAddBinaryDataToDatasetByIDsMethod = DataServiceGrpc.getAddBinaryDataToDatasetByIDsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getAddBinaryDataToDatasetByIDsMethod = DataServiceGrpc.getAddBinaryDataToDatasetByIDsMethod) == null) {
          DataServiceGrpc.getAddBinaryDataToDatasetByIDsMethod = getAddBinaryDataToDatasetByIDsMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsRequest, viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddBinaryDataToDatasetByIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddBinaryDataToDatasetByIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsRequest,
      viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsResponse> getRemoveBinaryDataFromDatasetByIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveBinaryDataFromDatasetByIDs",
      requestType = viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsRequest.class,
      responseType = viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsRequest,
      viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsResponse> getRemoveBinaryDataFromDatasetByIDsMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsRequest, viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsResponse> getRemoveBinaryDataFromDatasetByIDsMethod;
    if ((getRemoveBinaryDataFromDatasetByIDsMethod = DataServiceGrpc.getRemoveBinaryDataFromDatasetByIDsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getRemoveBinaryDataFromDatasetByIDsMethod = DataServiceGrpc.getRemoveBinaryDataFromDatasetByIDsMethod) == null) {
          DataServiceGrpc.getRemoveBinaryDataFromDatasetByIDsMethod = getRemoveBinaryDataFromDatasetByIDsMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsRequest, viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveBinaryDataFromDatasetByIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveBinaryDataFromDatasetByIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.CreateIndexRequest,
      viam.app.data.v1.Data.CreateIndexResponse> getCreateIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIndex",
      requestType = viam.app.data.v1.Data.CreateIndexRequest.class,
      responseType = viam.app.data.v1.Data.CreateIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.CreateIndexRequest,
      viam.app.data.v1.Data.CreateIndexResponse> getCreateIndexMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.CreateIndexRequest, viam.app.data.v1.Data.CreateIndexResponse> getCreateIndexMethod;
    if ((getCreateIndexMethod = DataServiceGrpc.getCreateIndexMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCreateIndexMethod = DataServiceGrpc.getCreateIndexMethod) == null) {
          DataServiceGrpc.getCreateIndexMethod = getCreateIndexMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.CreateIndexRequest, viam.app.data.v1.Data.CreateIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.CreateIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.CreateIndexResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.ListIndexesRequest,
      viam.app.data.v1.Data.ListIndexesResponse> getListIndexesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIndexes",
      requestType = viam.app.data.v1.Data.ListIndexesRequest.class,
      responseType = viam.app.data.v1.Data.ListIndexesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.ListIndexesRequest,
      viam.app.data.v1.Data.ListIndexesResponse> getListIndexesMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.ListIndexesRequest, viam.app.data.v1.Data.ListIndexesResponse> getListIndexesMethod;
    if ((getListIndexesMethod = DataServiceGrpc.getListIndexesMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getListIndexesMethod = DataServiceGrpc.getListIndexesMethod) == null) {
          DataServiceGrpc.getListIndexesMethod = getListIndexesMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.ListIndexesRequest, viam.app.data.v1.Data.ListIndexesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIndexes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.ListIndexesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.ListIndexesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListIndexesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteIndexRequest,
      viam.app.data.v1.Data.DeleteIndexResponse> getDeleteIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteIndex",
      requestType = viam.app.data.v1.Data.DeleteIndexRequest.class,
      responseType = viam.app.data.v1.Data.DeleteIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteIndexRequest,
      viam.app.data.v1.Data.DeleteIndexResponse> getDeleteIndexMethod() {
    io.grpc.MethodDescriptor<viam.app.data.v1.Data.DeleteIndexRequest, viam.app.data.v1.Data.DeleteIndexResponse> getDeleteIndexMethod;
    if ((getDeleteIndexMethod = DataServiceGrpc.getDeleteIndexMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDeleteIndexMethod = DataServiceGrpc.getDeleteIndexMethod) == null) {
          DataServiceGrpc.getDeleteIndexMethod = getDeleteIndexMethod =
              io.grpc.MethodDescriptor.<viam.app.data.v1.Data.DeleteIndexRequest, viam.app.data.v1.Data.DeleteIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.DeleteIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.data.v1.Data.DeleteIndexResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteIndexMethod;
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
  public interface AsyncService {

    /**
     * <pre>
     * TabularDataByFilter queries tabular data and metadata based on given filters.
     * </pre>
     */
    @java.lang.Deprecated
    default void tabularDataByFilter(viam.app.data.v1.Data.TabularDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TabularDataByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTabularDataByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * TabularDataBySQL queries tabular data with a SQL query.
     * </pre>
     */
    default void tabularDataBySQL(viam.app.data.v1.Data.TabularDataBySQLRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TabularDataBySQLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTabularDataBySQLMethod(), responseObserver);
    }

    /**
     * <pre>
     * TabularDataByMQL queries tabular data with an MQL (MongoDB Query Language) query.
     * </pre>
     */
    default void tabularDataByMQL(viam.app.data.v1.Data.TabularDataByMQLRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TabularDataByMQLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTabularDataByMQLMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExportTabularData queries tabular data from the specified data source.
     * </pre>
     */
    default void exportTabularData(viam.app.data.v1.Data.ExportTabularDataRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.ExportTabularDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportTabularDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLatestTabularData gets the most recent tabular data captured from the specified data source.
     * </pre>
     */
    default void getLatestTabularData(viam.app.data.v1.Data.GetLatestTabularDataRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.GetLatestTabularDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLatestTabularDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * BinaryDataByFilter queries binary data and metadata based on given filters.
     * </pre>
     */
    default void binaryDataByFilter(viam.app.data.v1.Data.BinaryDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.BinaryDataByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBinaryDataByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * BinaryDataByIDs queries binary data and metadata based on given IDs.
     * </pre>
     */
    default void binaryDataByIDs(viam.app.data.v1.Data.BinaryDataByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.BinaryDataByIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBinaryDataByIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteTabularData deletes tabular data older than a number of days, based on the given organization ID.
     * </pre>
     */
    default void deleteTabularData(viam.app.data.v1.Data.DeleteTabularDataRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteTabularDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTabularDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteBinaryDataByFilter deletes binary data based on given filters.
     * </pre>
     */
    default void deleteBinaryDataByFilter(viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBinaryDataByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteBinaryDataByIDs deletes binary data based on given IDs.
     * </pre>
     */
    default void deleteBinaryDataByIDs(viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBinaryDataByIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddTagsToBinaryDataByIDs adds string tags, unless the tags are already present, to binary data based on given IDs.
     * </pre>
     */
    default void addTagsToBinaryDataByIDs(viam.app.data.v1.Data.AddTagsToBinaryDataByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddTagsToBinaryDataByIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTagsToBinaryDataByIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddTagsToBinaryDataByFilter adds string tags, unless the tags are already present, to binary data based on the given filter.
     * </pre>
     */
    @java.lang.Deprecated
    default void addTagsToBinaryDataByFilter(viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTagsToBinaryDataByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByIDs removes string tags from binary data based on given IDs.
     * </pre>
     */
    default void removeTagsFromBinaryDataByIDs(viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTagsFromBinaryDataByIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByFilter removes string tags from binary data based on the given filter.
     * </pre>
     */
    @java.lang.Deprecated
    default void removeTagsFromBinaryDataByFilter(viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTagsFromBinaryDataByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * TagsByFilter gets all unique tags from data based on given filter.
     * </pre>
     */
    @java.lang.Deprecated
    default void tagsByFilter(viam.app.data.v1.Data.TagsByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TagsByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTagsByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddBoundingBoxToImageByID adds a bounding box to an image with the given ID.
     * </pre>
     */
    default void addBoundingBoxToImageByID(viam.app.data.v1.Data.AddBoundingBoxToImageByIDRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddBoundingBoxToImageByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddBoundingBoxToImageByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveBoundingBoxFromImageByID removes a bounding box from an image with the given ID.
     * </pre>
     */
    default void removeBoundingBoxFromImageByID(viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveBoundingBoxFromImageByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * BoundingBoxLabelsByFilter gets all string labels for bounding boxes from data based on given filter.
     * </pre>
     */
    @java.lang.Deprecated
    default void boundingBoxLabelsByFilter(viam.app.data.v1.Data.BoundingBoxLabelsByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.BoundingBoxLabelsByFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBoundingBoxLabelsByFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBoundingBox updates the bounding box associated with a given binary ID and bounding box ID.
     * </pre>
     */
    default void updateBoundingBox(viam.app.data.v1.Data.UpdateBoundingBoxRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.UpdateBoundingBoxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBoundingBoxMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDatabaseConnection gets a connection to access a MongoDB Atlas Data Federation instance. It
     * returns the hostname of the federated database.
     * </pre>
     */
    default void getDatabaseConnection(viam.app.data.v1.Data.GetDatabaseConnectionRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.GetDatabaseConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatabaseConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConfigureDatabaseUser configures a database user for the Viam organization's MongoDB Atlas Data
     * Federation instance. It can also be used to reset the password of the existing database user.
     * </pre>
     */
    default void configureDatabaseUser(viam.app.data.v1.Data.ConfigureDatabaseUserRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.ConfigureDatabaseUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureDatabaseUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddBinaryDataToDatasetByIDs adds the binary data with the given binary IDs to the dataset.
     * </pre>
     */
    default void addBinaryDataToDatasetByIDs(viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddBinaryDataToDatasetByIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveBinaryDataFromDatasetByIDs removes the binary data with the given binary IDs from the dataset.
     * </pre>
     */
    default void removeBinaryDataFromDatasetByIDs(viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveBinaryDataFromDatasetByIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateIndex starts a custom index build
     * </pre>
     */
    default void createIndex(viam.app.data.v1.Data.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.CreateIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListIndexes returns all the indexes for a given collection
     * </pre>
     */
    default void listIndexes(viam.app.data.v1.Data.ListIndexesRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.ListIndexesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIndexesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteIndex drops the specified custom index from a collection
     * </pre>
     */
    default void deleteIndex(viam.app.data.v1.Data.DeleteIndexRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteIndexMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataService.
   * <pre>
   * DataService is used to query robot data.
   * </pre>
   */
  public static abstract class DataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataService.
   * <pre>
   * DataService is used to query robot data.
   * </pre>
   */
  public static final class DataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataServiceStub> {
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
    @java.lang.Deprecated
    public void tabularDataByFilter(viam.app.data.v1.Data.TabularDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TabularDataByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTabularDataByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TabularDataBySQL queries tabular data with a SQL query.
     * </pre>
     */
    public void tabularDataBySQL(viam.app.data.v1.Data.TabularDataBySQLRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TabularDataBySQLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTabularDataBySQLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TabularDataByMQL queries tabular data with an MQL (MongoDB Query Language) query.
     * </pre>
     */
    public void tabularDataByMQL(viam.app.data.v1.Data.TabularDataByMQLRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TabularDataByMQLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTabularDataByMQLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExportTabularData queries tabular data from the specified data source.
     * </pre>
     */
    public void exportTabularData(viam.app.data.v1.Data.ExportTabularDataRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.ExportTabularDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getExportTabularDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLatestTabularData gets the most recent tabular data captured from the specified data source.
     * </pre>
     */
    public void getLatestTabularData(viam.app.data.v1.Data.GetLatestTabularDataRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.GetLatestTabularDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLatestTabularDataMethod(), getCallOptions()), request, responseObserver);
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
     * DeleteTabularData deletes tabular data older than a number of days, based on the given organization ID.
     * </pre>
     */
    public void deleteTabularData(viam.app.data.v1.Data.DeleteTabularDataRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteTabularDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTabularDataMethod(), getCallOptions()), request, responseObserver);
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
     * AddTagsToBinaryDataByIDs adds string tags, unless the tags are already present, to binary data based on given IDs.
     * </pre>
     */
    public void addTagsToBinaryDataByIDs(viam.app.data.v1.Data.AddTagsToBinaryDataByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddTagsToBinaryDataByIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTagsToBinaryDataByIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddTagsToBinaryDataByFilter adds string tags, unless the tags are already present, to binary data based on the given filter.
     * </pre>
     */
    @java.lang.Deprecated
    public void addTagsToBinaryDataByFilter(viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTagsToBinaryDataByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByIDs removes string tags from binary data based on given IDs.
     * </pre>
     */
    public void removeTagsFromBinaryDataByIDs(viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTagsFromBinaryDataByIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByFilter removes string tags from binary data based on the given filter.
     * </pre>
     */
    @java.lang.Deprecated
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
    @java.lang.Deprecated
    public void tagsByFilter(viam.app.data.v1.Data.TagsByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TagsByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTagsByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddBoundingBoxToImageByID adds a bounding box to an image with the given ID.
     * </pre>
     */
    public void addBoundingBoxToImageByID(viam.app.data.v1.Data.AddBoundingBoxToImageByIDRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddBoundingBoxToImageByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddBoundingBoxToImageByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveBoundingBoxFromImageByID removes a bounding box from an image with the given ID.
     * </pre>
     */
    public void removeBoundingBoxFromImageByID(viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveBoundingBoxFromImageByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BoundingBoxLabelsByFilter gets all string labels for bounding boxes from data based on given filter.
     * </pre>
     */
    @java.lang.Deprecated
    public void boundingBoxLabelsByFilter(viam.app.data.v1.Data.BoundingBoxLabelsByFilterRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.BoundingBoxLabelsByFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBoundingBoxLabelsByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBoundingBox updates the bounding box associated with a given binary ID and bounding box ID.
     * </pre>
     */
    public void updateBoundingBox(viam.app.data.v1.Data.UpdateBoundingBoxRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.UpdateBoundingBoxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBoundingBoxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDatabaseConnection gets a connection to access a MongoDB Atlas Data Federation instance. It
     * returns the hostname of the federated database.
     * </pre>
     */
    public void getDatabaseConnection(viam.app.data.v1.Data.GetDatabaseConnectionRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.GetDatabaseConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatabaseConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConfigureDatabaseUser configures a database user for the Viam organization's MongoDB Atlas Data
     * Federation instance. It can also be used to reset the password of the existing database user.
     * </pre>
     */
    public void configureDatabaseUser(viam.app.data.v1.Data.ConfigureDatabaseUserRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.ConfigureDatabaseUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureDatabaseUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddBinaryDataToDatasetByIDs adds the binary data with the given binary IDs to the dataset.
     * </pre>
     */
    public void addBinaryDataToDatasetByIDs(viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddBinaryDataToDatasetByIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveBinaryDataFromDatasetByIDs removes the binary data with the given binary IDs from the dataset.
     * </pre>
     */
    public void removeBinaryDataFromDatasetByIDs(viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveBinaryDataFromDatasetByIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateIndex starts a custom index build
     * </pre>
     */
    public void createIndex(viam.app.data.v1.Data.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.CreateIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListIndexes returns all the indexes for a given collection
     * </pre>
     */
    public void listIndexes(viam.app.data.v1.Data.ListIndexesRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.ListIndexesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIndexesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteIndex drops the specified custom index from a collection
     * </pre>
     */
    public void deleteIndex(viam.app.data.v1.Data.DeleteIndexRequest request,
        io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteIndexMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataService.
   * <pre>
   * DataService is used to query robot data.
   * </pre>
   */
  public static final class DataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataServiceBlockingStub> {
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
    @java.lang.Deprecated
    public viam.app.data.v1.Data.TabularDataByFilterResponse tabularDataByFilter(viam.app.data.v1.Data.TabularDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTabularDataByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TabularDataBySQL queries tabular data with a SQL query.
     * </pre>
     */
    public viam.app.data.v1.Data.TabularDataBySQLResponse tabularDataBySQL(viam.app.data.v1.Data.TabularDataBySQLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTabularDataBySQLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TabularDataByMQL queries tabular data with an MQL (MongoDB Query Language) query.
     * </pre>
     */
    public viam.app.data.v1.Data.TabularDataByMQLResponse tabularDataByMQL(viam.app.data.v1.Data.TabularDataByMQLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTabularDataByMQLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExportTabularData queries tabular data from the specified data source.
     * </pre>
     */
    public java.util.Iterator<viam.app.data.v1.Data.ExportTabularDataResponse> exportTabularData(
        viam.app.data.v1.Data.ExportTabularDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getExportTabularDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLatestTabularData gets the most recent tabular data captured from the specified data source.
     * </pre>
     */
    public viam.app.data.v1.Data.GetLatestTabularDataResponse getLatestTabularData(viam.app.data.v1.Data.GetLatestTabularDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestTabularDataMethod(), getCallOptions(), request);
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
     * DeleteTabularData deletes tabular data older than a number of days, based on the given organization ID.
     * </pre>
     */
    public viam.app.data.v1.Data.DeleteTabularDataResponse deleteTabularData(viam.app.data.v1.Data.DeleteTabularDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTabularDataMethod(), getCallOptions(), request);
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
     * AddTagsToBinaryDataByIDs adds string tags, unless the tags are already present, to binary data based on given IDs.
     * </pre>
     */
    public viam.app.data.v1.Data.AddTagsToBinaryDataByIDsResponse addTagsToBinaryDataByIDs(viam.app.data.v1.Data.AddTagsToBinaryDataByIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTagsToBinaryDataByIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddTagsToBinaryDataByFilter adds string tags, unless the tags are already present, to binary data based on the given filter.
     * </pre>
     */
    @java.lang.Deprecated
    public viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse addTagsToBinaryDataByFilter(viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTagsToBinaryDataByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByIDs removes string tags from binary data based on given IDs.
     * </pre>
     */
    public viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsResponse removeTagsFromBinaryDataByIDs(viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTagsFromBinaryDataByIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByFilter removes string tags from binary data based on the given filter.
     * </pre>
     */
    @java.lang.Deprecated
    public viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse removeTagsFromBinaryDataByFilter(viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTagsFromBinaryDataByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TagsByFilter gets all unique tags from data based on given filter.
     * </pre>
     */
    @java.lang.Deprecated
    public viam.app.data.v1.Data.TagsByFilterResponse tagsByFilter(viam.app.data.v1.Data.TagsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTagsByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddBoundingBoxToImageByID adds a bounding box to an image with the given ID.
     * </pre>
     */
    public viam.app.data.v1.Data.AddBoundingBoxToImageByIDResponse addBoundingBoxToImageByID(viam.app.data.v1.Data.AddBoundingBoxToImageByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddBoundingBoxToImageByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveBoundingBoxFromImageByID removes a bounding box from an image with the given ID.
     * </pre>
     */
    public viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDResponse removeBoundingBoxFromImageByID(viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveBoundingBoxFromImageByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BoundingBoxLabelsByFilter gets all string labels for bounding boxes from data based on given filter.
     * </pre>
     */
    @java.lang.Deprecated
    public viam.app.data.v1.Data.BoundingBoxLabelsByFilterResponse boundingBoxLabelsByFilter(viam.app.data.v1.Data.BoundingBoxLabelsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBoundingBoxLabelsByFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBoundingBox updates the bounding box associated with a given binary ID and bounding box ID.
     * </pre>
     */
    public viam.app.data.v1.Data.UpdateBoundingBoxResponse updateBoundingBox(viam.app.data.v1.Data.UpdateBoundingBoxRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBoundingBoxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDatabaseConnection gets a connection to access a MongoDB Atlas Data Federation instance. It
     * returns the hostname of the federated database.
     * </pre>
     */
    public viam.app.data.v1.Data.GetDatabaseConnectionResponse getDatabaseConnection(viam.app.data.v1.Data.GetDatabaseConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatabaseConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConfigureDatabaseUser configures a database user for the Viam organization's MongoDB Atlas Data
     * Federation instance. It can also be used to reset the password of the existing database user.
     * </pre>
     */
    public viam.app.data.v1.Data.ConfigureDatabaseUserResponse configureDatabaseUser(viam.app.data.v1.Data.ConfigureDatabaseUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureDatabaseUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddBinaryDataToDatasetByIDs adds the binary data with the given binary IDs to the dataset.
     * </pre>
     */
    public viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsResponse addBinaryDataToDatasetByIDs(viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddBinaryDataToDatasetByIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveBinaryDataFromDatasetByIDs removes the binary data with the given binary IDs from the dataset.
     * </pre>
     */
    public viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsResponse removeBinaryDataFromDatasetByIDs(viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveBinaryDataFromDatasetByIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateIndex starts a custom index build
     * </pre>
     */
    public viam.app.data.v1.Data.CreateIndexResponse createIndex(viam.app.data.v1.Data.CreateIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListIndexes returns all the indexes for a given collection
     * </pre>
     */
    public viam.app.data.v1.Data.ListIndexesResponse listIndexes(viam.app.data.v1.Data.ListIndexesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIndexesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteIndex drops the specified custom index from a collection
     * </pre>
     */
    public viam.app.data.v1.Data.DeleteIndexResponse deleteIndex(viam.app.data.v1.Data.DeleteIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteIndexMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataService.
   * <pre>
   * DataService is used to query robot data.
   * </pre>
   */
  public static final class DataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataServiceFutureStub> {
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
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.TabularDataByFilterResponse> tabularDataByFilter(
        viam.app.data.v1.Data.TabularDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTabularDataByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TabularDataBySQL queries tabular data with a SQL query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.TabularDataBySQLResponse> tabularDataBySQL(
        viam.app.data.v1.Data.TabularDataBySQLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTabularDataBySQLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TabularDataByMQL queries tabular data with an MQL (MongoDB Query Language) query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.TabularDataByMQLResponse> tabularDataByMQL(
        viam.app.data.v1.Data.TabularDataByMQLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTabularDataByMQLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLatestTabularData gets the most recent tabular data captured from the specified data source.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.GetLatestTabularDataResponse> getLatestTabularData(
        viam.app.data.v1.Data.GetLatestTabularDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLatestTabularDataMethod(), getCallOptions()), request);
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
     * DeleteTabularData deletes tabular data older than a number of days, based on the given organization ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.DeleteTabularDataResponse> deleteTabularData(
        viam.app.data.v1.Data.DeleteTabularDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTabularDataMethod(), getCallOptions()), request);
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
     * AddTagsToBinaryDataByIDs adds string tags, unless the tags are already present, to binary data based on given IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.AddTagsToBinaryDataByIDsResponse> addTagsToBinaryDataByIDs(
        viam.app.data.v1.Data.AddTagsToBinaryDataByIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTagsToBinaryDataByIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddTagsToBinaryDataByFilter adds string tags, unless the tags are already present, to binary data based on the given filter.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse> addTagsToBinaryDataByFilter(
        viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTagsToBinaryDataByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByIDs removes string tags from binary data based on given IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsResponse> removeTagsFromBinaryDataByIDs(
        viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTagsFromBinaryDataByIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveTagsToBinaryDataByFilter removes string tags from binary data based on the given filter.
     * </pre>
     */
    @java.lang.Deprecated
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
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.TagsByFilterResponse> tagsByFilter(
        viam.app.data.v1.Data.TagsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTagsByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddBoundingBoxToImageByID adds a bounding box to an image with the given ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.AddBoundingBoxToImageByIDResponse> addBoundingBoxToImageByID(
        viam.app.data.v1.Data.AddBoundingBoxToImageByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddBoundingBoxToImageByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveBoundingBoxFromImageByID removes a bounding box from an image with the given ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDResponse> removeBoundingBoxFromImageByID(
        viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveBoundingBoxFromImageByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BoundingBoxLabelsByFilter gets all string labels for bounding boxes from data based on given filter.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.BoundingBoxLabelsByFilterResponse> boundingBoxLabelsByFilter(
        viam.app.data.v1.Data.BoundingBoxLabelsByFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBoundingBoxLabelsByFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBoundingBox updates the bounding box associated with a given binary ID and bounding box ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.UpdateBoundingBoxResponse> updateBoundingBox(
        viam.app.data.v1.Data.UpdateBoundingBoxRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBoundingBoxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDatabaseConnection gets a connection to access a MongoDB Atlas Data Federation instance. It
     * returns the hostname of the federated database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.GetDatabaseConnectionResponse> getDatabaseConnection(
        viam.app.data.v1.Data.GetDatabaseConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatabaseConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConfigureDatabaseUser configures a database user for the Viam organization's MongoDB Atlas Data
     * Federation instance. It can also be used to reset the password of the existing database user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.ConfigureDatabaseUserResponse> configureDatabaseUser(
        viam.app.data.v1.Data.ConfigureDatabaseUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureDatabaseUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddBinaryDataToDatasetByIDs adds the binary data with the given binary IDs to the dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsResponse> addBinaryDataToDatasetByIDs(
        viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddBinaryDataToDatasetByIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveBinaryDataFromDatasetByIDs removes the binary data with the given binary IDs from the dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsResponse> removeBinaryDataFromDatasetByIDs(
        viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveBinaryDataFromDatasetByIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateIndex starts a custom index build
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.CreateIndexResponse> createIndex(
        viam.app.data.v1.Data.CreateIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListIndexes returns all the indexes for a given collection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.ListIndexesResponse> listIndexes(
        viam.app.data.v1.Data.ListIndexesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIndexesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteIndex drops the specified custom index from a collection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.data.v1.Data.DeleteIndexResponse> deleteIndex(
        viam.app.data.v1.Data.DeleteIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteIndexMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TABULAR_DATA_BY_FILTER = 0;
  private static final int METHODID_TABULAR_DATA_BY_SQL = 1;
  private static final int METHODID_TABULAR_DATA_BY_MQL = 2;
  private static final int METHODID_EXPORT_TABULAR_DATA = 3;
  private static final int METHODID_GET_LATEST_TABULAR_DATA = 4;
  private static final int METHODID_BINARY_DATA_BY_FILTER = 5;
  private static final int METHODID_BINARY_DATA_BY_IDS = 6;
  private static final int METHODID_DELETE_TABULAR_DATA = 7;
  private static final int METHODID_DELETE_BINARY_DATA_BY_FILTER = 8;
  private static final int METHODID_DELETE_BINARY_DATA_BY_IDS = 9;
  private static final int METHODID_ADD_TAGS_TO_BINARY_DATA_BY_IDS = 10;
  private static final int METHODID_ADD_TAGS_TO_BINARY_DATA_BY_FILTER = 11;
  private static final int METHODID_REMOVE_TAGS_FROM_BINARY_DATA_BY_IDS = 12;
  private static final int METHODID_REMOVE_TAGS_FROM_BINARY_DATA_BY_FILTER = 13;
  private static final int METHODID_TAGS_BY_FILTER = 14;
  private static final int METHODID_ADD_BOUNDING_BOX_TO_IMAGE_BY_ID = 15;
  private static final int METHODID_REMOVE_BOUNDING_BOX_FROM_IMAGE_BY_ID = 16;
  private static final int METHODID_BOUNDING_BOX_LABELS_BY_FILTER = 17;
  private static final int METHODID_UPDATE_BOUNDING_BOX = 18;
  private static final int METHODID_GET_DATABASE_CONNECTION = 19;
  private static final int METHODID_CONFIGURE_DATABASE_USER = 20;
  private static final int METHODID_ADD_BINARY_DATA_TO_DATASET_BY_IDS = 21;
  private static final int METHODID_REMOVE_BINARY_DATA_FROM_DATASET_BY_IDS = 22;
  private static final int METHODID_CREATE_INDEX = 23;
  private static final int METHODID_LIST_INDEXES = 24;
  private static final int METHODID_DELETE_INDEX = 25;

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
        case METHODID_TABULAR_DATA_BY_FILTER:
          serviceImpl.tabularDataByFilter((viam.app.data.v1.Data.TabularDataByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TabularDataByFilterResponse>) responseObserver);
          break;
        case METHODID_TABULAR_DATA_BY_SQL:
          serviceImpl.tabularDataBySQL((viam.app.data.v1.Data.TabularDataBySQLRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TabularDataBySQLResponse>) responseObserver);
          break;
        case METHODID_TABULAR_DATA_BY_MQL:
          serviceImpl.tabularDataByMQL((viam.app.data.v1.Data.TabularDataByMQLRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TabularDataByMQLResponse>) responseObserver);
          break;
        case METHODID_EXPORT_TABULAR_DATA:
          serviceImpl.exportTabularData((viam.app.data.v1.Data.ExportTabularDataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.ExportTabularDataResponse>) responseObserver);
          break;
        case METHODID_GET_LATEST_TABULAR_DATA:
          serviceImpl.getLatestTabularData((viam.app.data.v1.Data.GetLatestTabularDataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.GetLatestTabularDataResponse>) responseObserver);
          break;
        case METHODID_BINARY_DATA_BY_FILTER:
          serviceImpl.binaryDataByFilter((viam.app.data.v1.Data.BinaryDataByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.BinaryDataByFilterResponse>) responseObserver);
          break;
        case METHODID_BINARY_DATA_BY_IDS:
          serviceImpl.binaryDataByIDs((viam.app.data.v1.Data.BinaryDataByIDsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.BinaryDataByIDsResponse>) responseObserver);
          break;
        case METHODID_DELETE_TABULAR_DATA:
          serviceImpl.deleteTabularData((viam.app.data.v1.Data.DeleteTabularDataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteTabularDataResponse>) responseObserver);
          break;
        case METHODID_DELETE_BINARY_DATA_BY_FILTER:
          serviceImpl.deleteBinaryDataByFilter((viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse>) responseObserver);
          break;
        case METHODID_DELETE_BINARY_DATA_BY_IDS:
          serviceImpl.deleteBinaryDataByIDs((viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse>) responseObserver);
          break;
        case METHODID_ADD_TAGS_TO_BINARY_DATA_BY_IDS:
          serviceImpl.addTagsToBinaryDataByIDs((viam.app.data.v1.Data.AddTagsToBinaryDataByIDsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddTagsToBinaryDataByIDsResponse>) responseObserver);
          break;
        case METHODID_ADD_TAGS_TO_BINARY_DATA_BY_FILTER:
          serviceImpl.addTagsToBinaryDataByFilter((viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse>) responseObserver);
          break;
        case METHODID_REMOVE_TAGS_FROM_BINARY_DATA_BY_IDS:
          serviceImpl.removeTagsFromBinaryDataByIDs((viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsResponse>) responseObserver);
          break;
        case METHODID_REMOVE_TAGS_FROM_BINARY_DATA_BY_FILTER:
          serviceImpl.removeTagsFromBinaryDataByFilter((viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse>) responseObserver);
          break;
        case METHODID_TAGS_BY_FILTER:
          serviceImpl.tagsByFilter((viam.app.data.v1.Data.TagsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.TagsByFilterResponse>) responseObserver);
          break;
        case METHODID_ADD_BOUNDING_BOX_TO_IMAGE_BY_ID:
          serviceImpl.addBoundingBoxToImageByID((viam.app.data.v1.Data.AddBoundingBoxToImageByIDRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddBoundingBoxToImageByIDResponse>) responseObserver);
          break;
        case METHODID_REMOVE_BOUNDING_BOX_FROM_IMAGE_BY_ID:
          serviceImpl.removeBoundingBoxFromImageByID((viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDResponse>) responseObserver);
          break;
        case METHODID_BOUNDING_BOX_LABELS_BY_FILTER:
          serviceImpl.boundingBoxLabelsByFilter((viam.app.data.v1.Data.BoundingBoxLabelsByFilterRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.BoundingBoxLabelsByFilterResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BOUNDING_BOX:
          serviceImpl.updateBoundingBox((viam.app.data.v1.Data.UpdateBoundingBoxRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.UpdateBoundingBoxResponse>) responseObserver);
          break;
        case METHODID_GET_DATABASE_CONNECTION:
          serviceImpl.getDatabaseConnection((viam.app.data.v1.Data.GetDatabaseConnectionRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.GetDatabaseConnectionResponse>) responseObserver);
          break;
        case METHODID_CONFIGURE_DATABASE_USER:
          serviceImpl.configureDatabaseUser((viam.app.data.v1.Data.ConfigureDatabaseUserRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.ConfigureDatabaseUserResponse>) responseObserver);
          break;
        case METHODID_ADD_BINARY_DATA_TO_DATASET_BY_IDS:
          serviceImpl.addBinaryDataToDatasetByIDs((viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsResponse>) responseObserver);
          break;
        case METHODID_REMOVE_BINARY_DATA_FROM_DATASET_BY_IDS:
          serviceImpl.removeBinaryDataFromDatasetByIDs((viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsResponse>) responseObserver);
          break;
        case METHODID_CREATE_INDEX:
          serviceImpl.createIndex((viam.app.data.v1.Data.CreateIndexRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.CreateIndexResponse>) responseObserver);
          break;
        case METHODID_LIST_INDEXES:
          serviceImpl.listIndexes((viam.app.data.v1.Data.ListIndexesRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.ListIndexesResponse>) responseObserver);
          break;
        case METHODID_DELETE_INDEX:
          serviceImpl.deleteIndex((viam.app.data.v1.Data.DeleteIndexRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.data.v1.Data.DeleteIndexResponse>) responseObserver);
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
          getTabularDataByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.TabularDataByFilterRequest,
              viam.app.data.v1.Data.TabularDataByFilterResponse>(
                service, METHODID_TABULAR_DATA_BY_FILTER)))
        .addMethod(
          getTabularDataBySQLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.TabularDataBySQLRequest,
              viam.app.data.v1.Data.TabularDataBySQLResponse>(
                service, METHODID_TABULAR_DATA_BY_SQL)))
        .addMethod(
          getTabularDataByMQLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.TabularDataByMQLRequest,
              viam.app.data.v1.Data.TabularDataByMQLResponse>(
                service, METHODID_TABULAR_DATA_BY_MQL)))
        .addMethod(
          getExportTabularDataMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              viam.app.data.v1.Data.ExportTabularDataRequest,
              viam.app.data.v1.Data.ExportTabularDataResponse>(
                service, METHODID_EXPORT_TABULAR_DATA)))
        .addMethod(
          getGetLatestTabularDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.GetLatestTabularDataRequest,
              viam.app.data.v1.Data.GetLatestTabularDataResponse>(
                service, METHODID_GET_LATEST_TABULAR_DATA)))
        .addMethod(
          getBinaryDataByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.BinaryDataByFilterRequest,
              viam.app.data.v1.Data.BinaryDataByFilterResponse>(
                service, METHODID_BINARY_DATA_BY_FILTER)))
        .addMethod(
          getBinaryDataByIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.BinaryDataByIDsRequest,
              viam.app.data.v1.Data.BinaryDataByIDsResponse>(
                service, METHODID_BINARY_DATA_BY_IDS)))
        .addMethod(
          getDeleteTabularDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.DeleteTabularDataRequest,
              viam.app.data.v1.Data.DeleteTabularDataResponse>(
                service, METHODID_DELETE_TABULAR_DATA)))
        .addMethod(
          getDeleteBinaryDataByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.DeleteBinaryDataByFilterRequest,
              viam.app.data.v1.Data.DeleteBinaryDataByFilterResponse>(
                service, METHODID_DELETE_BINARY_DATA_BY_FILTER)))
        .addMethod(
          getDeleteBinaryDataByIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.DeleteBinaryDataByIDsRequest,
              viam.app.data.v1.Data.DeleteBinaryDataByIDsResponse>(
                service, METHODID_DELETE_BINARY_DATA_BY_IDS)))
        .addMethod(
          getAddTagsToBinaryDataByIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.AddTagsToBinaryDataByIDsRequest,
              viam.app.data.v1.Data.AddTagsToBinaryDataByIDsResponse>(
                service, METHODID_ADD_TAGS_TO_BINARY_DATA_BY_IDS)))
        .addMethod(
          getAddTagsToBinaryDataByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.AddTagsToBinaryDataByFilterRequest,
              viam.app.data.v1.Data.AddTagsToBinaryDataByFilterResponse>(
                service, METHODID_ADD_TAGS_TO_BINARY_DATA_BY_FILTER)))
        .addMethod(
          getRemoveTagsFromBinaryDataByIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsRequest,
              viam.app.data.v1.Data.RemoveTagsFromBinaryDataByIDsResponse>(
                service, METHODID_REMOVE_TAGS_FROM_BINARY_DATA_BY_IDS)))
        .addMethod(
          getRemoveTagsFromBinaryDataByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterRequest,
              viam.app.data.v1.Data.RemoveTagsFromBinaryDataByFilterResponse>(
                service, METHODID_REMOVE_TAGS_FROM_BINARY_DATA_BY_FILTER)))
        .addMethod(
          getTagsByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.TagsByFilterRequest,
              viam.app.data.v1.Data.TagsByFilterResponse>(
                service, METHODID_TAGS_BY_FILTER)))
        .addMethod(
          getAddBoundingBoxToImageByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.AddBoundingBoxToImageByIDRequest,
              viam.app.data.v1.Data.AddBoundingBoxToImageByIDResponse>(
                service, METHODID_ADD_BOUNDING_BOX_TO_IMAGE_BY_ID)))
        .addMethod(
          getRemoveBoundingBoxFromImageByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDRequest,
              viam.app.data.v1.Data.RemoveBoundingBoxFromImageByIDResponse>(
                service, METHODID_REMOVE_BOUNDING_BOX_FROM_IMAGE_BY_ID)))
        .addMethod(
          getBoundingBoxLabelsByFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.BoundingBoxLabelsByFilterRequest,
              viam.app.data.v1.Data.BoundingBoxLabelsByFilterResponse>(
                service, METHODID_BOUNDING_BOX_LABELS_BY_FILTER)))
        .addMethod(
          getUpdateBoundingBoxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.UpdateBoundingBoxRequest,
              viam.app.data.v1.Data.UpdateBoundingBoxResponse>(
                service, METHODID_UPDATE_BOUNDING_BOX)))
        .addMethod(
          getGetDatabaseConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.GetDatabaseConnectionRequest,
              viam.app.data.v1.Data.GetDatabaseConnectionResponse>(
                service, METHODID_GET_DATABASE_CONNECTION)))
        .addMethod(
          getConfigureDatabaseUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.ConfigureDatabaseUserRequest,
              viam.app.data.v1.Data.ConfigureDatabaseUserResponse>(
                service, METHODID_CONFIGURE_DATABASE_USER)))
        .addMethod(
          getAddBinaryDataToDatasetByIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsRequest,
              viam.app.data.v1.Data.AddBinaryDataToDatasetByIDsResponse>(
                service, METHODID_ADD_BINARY_DATA_TO_DATASET_BY_IDS)))
        .addMethod(
          getRemoveBinaryDataFromDatasetByIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsRequest,
              viam.app.data.v1.Data.RemoveBinaryDataFromDatasetByIDsResponse>(
                service, METHODID_REMOVE_BINARY_DATA_FROM_DATASET_BY_IDS)))
        .addMethod(
          getCreateIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.CreateIndexRequest,
              viam.app.data.v1.Data.CreateIndexResponse>(
                service, METHODID_CREATE_INDEX)))
        .addMethod(
          getListIndexesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.ListIndexesRequest,
              viam.app.data.v1.Data.ListIndexesResponse>(
                service, METHODID_LIST_INDEXES)))
        .addMethod(
          getDeleteIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.data.v1.Data.DeleteIndexRequest,
              viam.app.data.v1.Data.DeleteIndexResponse>(
                service, METHODID_DELETE_INDEX)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getTabularDataByFilterMethod())
              .addMethod(getTabularDataBySQLMethod())
              .addMethod(getTabularDataByMQLMethod())
              .addMethod(getExportTabularDataMethod())
              .addMethod(getGetLatestTabularDataMethod())
              .addMethod(getBinaryDataByFilterMethod())
              .addMethod(getBinaryDataByIDsMethod())
              .addMethod(getDeleteTabularDataMethod())
              .addMethod(getDeleteBinaryDataByFilterMethod())
              .addMethod(getDeleteBinaryDataByIDsMethod())
              .addMethod(getAddTagsToBinaryDataByIDsMethod())
              .addMethod(getAddTagsToBinaryDataByFilterMethod())
              .addMethod(getRemoveTagsFromBinaryDataByIDsMethod())
              .addMethod(getRemoveTagsFromBinaryDataByFilterMethod())
              .addMethod(getTagsByFilterMethod())
              .addMethod(getAddBoundingBoxToImageByIDMethod())
              .addMethod(getRemoveBoundingBoxFromImageByIDMethod())
              .addMethod(getBoundingBoxLabelsByFilterMethod())
              .addMethod(getUpdateBoundingBoxMethod())
              .addMethod(getGetDatabaseConnectionMethod())
              .addMethod(getConfigureDatabaseUserMethod())
              .addMethod(getAddBinaryDataToDatasetByIDsMethod())
              .addMethod(getRemoveBinaryDataFromDatasetByIDsMethod())
              .addMethod(getCreateIndexMethod())
              .addMethod(getListIndexesMethod())
              .addMethod(getDeleteIndexMethod())
              .build();
        }
      }
    }
    return result;
  }
}
