package viam.app.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: app/v1/app.proto")
public final class AppServiceGrpc {

  private AppServiceGrpc() {}

  public static final String SERVICE_NAME = "viam.app.v1.AppService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.CreateLocationRequest,
      viam.app.v1.App.CreateLocationResponse> getCreateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLocation",
      requestType = viam.app.v1.App.CreateLocationRequest.class,
      responseType = viam.app.v1.App.CreateLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.CreateLocationRequest,
      viam.app.v1.App.CreateLocationResponse> getCreateLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.CreateLocationRequest, viam.app.v1.App.CreateLocationResponse> getCreateLocationMethod;
    if ((getCreateLocationMethod = AppServiceGrpc.getCreateLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateLocationMethod = AppServiceGrpc.getCreateLocationMethod) == null) {
          AppServiceGrpc.getCreateLocationMethod = getCreateLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.CreateLocationRequest, viam.app.v1.App.CreateLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.CreateLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.CreateLocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("CreateLocation"))
              .build();
        }
      }
    }
    return getCreateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ListOrganizationsRequest,
      viam.app.v1.App.ListOrganizationsResponse> getListOrganizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizations",
      requestType = viam.app.v1.App.ListOrganizationsRequest.class,
      responseType = viam.app.v1.App.ListOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ListOrganizationsRequest,
      viam.app.v1.App.ListOrganizationsResponse> getListOrganizationsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ListOrganizationsRequest, viam.app.v1.App.ListOrganizationsResponse> getListOrganizationsMethod;
    if ((getListOrganizationsMethod = AppServiceGrpc.getListOrganizationsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListOrganizationsMethod = AppServiceGrpc.getListOrganizationsMethod) == null) {
          AppServiceGrpc.getListOrganizationsMethod = getListOrganizationsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ListOrganizationsRequest, viam.app.v1.App.ListOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.ListOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.ListOrganizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("ListOrganizations"))
              .build();
        }
      }
    }
    return getListOrganizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ListLocationsRequest,
      viam.app.v1.App.ListLocationsResponse> getListLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLocations",
      requestType = viam.app.v1.App.ListLocationsRequest.class,
      responseType = viam.app.v1.App.ListLocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ListLocationsRequest,
      viam.app.v1.App.ListLocationsResponse> getListLocationsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ListLocationsRequest, viam.app.v1.App.ListLocationsResponse> getListLocationsMethod;
    if ((getListLocationsMethod = AppServiceGrpc.getListLocationsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListLocationsMethod = AppServiceGrpc.getListLocationsMethod) == null) {
          AppServiceGrpc.getListLocationsMethod = getListLocationsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ListLocationsRequest, viam.app.v1.App.ListLocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.ListLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.ListLocationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("ListLocations"))
              .build();
        }
      }
    }
    return getListLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ShareLocationRequest,
      viam.app.v1.App.ShareLocationResponse> getShareLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShareLocation",
      requestType = viam.app.v1.App.ShareLocationRequest.class,
      responseType = viam.app.v1.App.ShareLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ShareLocationRequest,
      viam.app.v1.App.ShareLocationResponse> getShareLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ShareLocationRequest, viam.app.v1.App.ShareLocationResponse> getShareLocationMethod;
    if ((getShareLocationMethod = AppServiceGrpc.getShareLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getShareLocationMethod = AppServiceGrpc.getShareLocationMethod) == null) {
          AppServiceGrpc.getShareLocationMethod = getShareLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ShareLocationRequest, viam.app.v1.App.ShareLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShareLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.ShareLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.ShareLocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("ShareLocation"))
              .build();
        }
      }
    }
    return getShareLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UnshareLocationRequest,
      viam.app.v1.App.UnshareLocationResponse> getUnshareLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnshareLocation",
      requestType = viam.app.v1.App.UnshareLocationRequest.class,
      responseType = viam.app.v1.App.UnshareLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UnshareLocationRequest,
      viam.app.v1.App.UnshareLocationResponse> getUnshareLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UnshareLocationRequest, viam.app.v1.App.UnshareLocationResponse> getUnshareLocationMethod;
    if ((getUnshareLocationMethod = AppServiceGrpc.getUnshareLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUnshareLocationMethod = AppServiceGrpc.getUnshareLocationMethod) == null) {
          AppServiceGrpc.getUnshareLocationMethod = getUnshareLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UnshareLocationRequest, viam.app.v1.App.UnshareLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnshareLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.UnshareLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.UnshareLocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("UnshareLocation"))
              .build();
        }
      }
    }
    return getUnshareLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.LocationAuthRequest,
      viam.app.v1.App.LocationAuthResponse> getLocationAuthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LocationAuth",
      requestType = viam.app.v1.App.LocationAuthRequest.class,
      responseType = viam.app.v1.App.LocationAuthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.LocationAuthRequest,
      viam.app.v1.App.LocationAuthResponse> getLocationAuthMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.LocationAuthRequest, viam.app.v1.App.LocationAuthResponse> getLocationAuthMethod;
    if ((getLocationAuthMethod = AppServiceGrpc.getLocationAuthMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getLocationAuthMethod = AppServiceGrpc.getLocationAuthMethod) == null) {
          AppServiceGrpc.getLocationAuthMethod = getLocationAuthMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.LocationAuthRequest, viam.app.v1.App.LocationAuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LocationAuth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.LocationAuthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.LocationAuthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("LocationAuth"))
              .build();
        }
      }
    }
    return getLocationAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.CreateLocationSecretRequest,
      viam.app.v1.App.CreateLocationSecretResponse> getCreateLocationSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLocationSecret",
      requestType = viam.app.v1.App.CreateLocationSecretRequest.class,
      responseType = viam.app.v1.App.CreateLocationSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.CreateLocationSecretRequest,
      viam.app.v1.App.CreateLocationSecretResponse> getCreateLocationSecretMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.CreateLocationSecretRequest, viam.app.v1.App.CreateLocationSecretResponse> getCreateLocationSecretMethod;
    if ((getCreateLocationSecretMethod = AppServiceGrpc.getCreateLocationSecretMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateLocationSecretMethod = AppServiceGrpc.getCreateLocationSecretMethod) == null) {
          AppServiceGrpc.getCreateLocationSecretMethod = getCreateLocationSecretMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.CreateLocationSecretRequest, viam.app.v1.App.CreateLocationSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLocationSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.CreateLocationSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.CreateLocationSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("CreateLocationSecret"))
              .build();
        }
      }
    }
    return getCreateLocationSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DeleteLocationSecretRequest,
      viam.app.v1.App.DeleteLocationSecretResponse> getDeleteLocationSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLocationSecret",
      requestType = viam.app.v1.App.DeleteLocationSecretRequest.class,
      responseType = viam.app.v1.App.DeleteLocationSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DeleteLocationSecretRequest,
      viam.app.v1.App.DeleteLocationSecretResponse> getDeleteLocationSecretMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DeleteLocationSecretRequest, viam.app.v1.App.DeleteLocationSecretResponse> getDeleteLocationSecretMethod;
    if ((getDeleteLocationSecretMethod = AppServiceGrpc.getDeleteLocationSecretMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteLocationSecretMethod = AppServiceGrpc.getDeleteLocationSecretMethod) == null) {
          AppServiceGrpc.getDeleteLocationSecretMethod = getDeleteLocationSecretMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DeleteLocationSecretRequest, viam.app.v1.App.DeleteLocationSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLocationSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.DeleteLocationSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.DeleteLocationSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("DeleteLocationSecret"))
              .build();
        }
      }
    }
    return getDeleteLocationSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotRequest,
      viam.app.v1.App.GetRobotResponse> getGetRobotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobot",
      requestType = viam.app.v1.App.GetRobotRequest.class,
      responseType = viam.app.v1.App.GetRobotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotRequest,
      viam.app.v1.App.GetRobotResponse> getGetRobotMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotRequest, viam.app.v1.App.GetRobotResponse> getGetRobotMethod;
    if ((getGetRobotMethod = AppServiceGrpc.getGetRobotMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotMethod = AppServiceGrpc.getGetRobotMethod) == null) {
          AppServiceGrpc.getGetRobotMethod = getGetRobotMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetRobotRequest, viam.app.v1.App.GetRobotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.GetRobotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.GetRobotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("GetRobot"))
              .build();
        }
      }
    }
    return getGetRobotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartsRequest,
      viam.app.v1.App.GetRobotPartsResponse> getGetRobotPartsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotParts",
      requestType = viam.app.v1.App.GetRobotPartsRequest.class,
      responseType = viam.app.v1.App.GetRobotPartsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartsRequest,
      viam.app.v1.App.GetRobotPartsResponse> getGetRobotPartsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartsRequest, viam.app.v1.App.GetRobotPartsResponse> getGetRobotPartsMethod;
    if ((getGetRobotPartsMethod = AppServiceGrpc.getGetRobotPartsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotPartsMethod = AppServiceGrpc.getGetRobotPartsMethod) == null) {
          AppServiceGrpc.getGetRobotPartsMethod = getGetRobotPartsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetRobotPartsRequest, viam.app.v1.App.GetRobotPartsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotParts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.GetRobotPartsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.GetRobotPartsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("GetRobotParts"))
              .build();
        }
      }
    }
    return getGetRobotPartsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartRequest,
      viam.app.v1.App.GetRobotPartResponse> getGetRobotPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotPart",
      requestType = viam.app.v1.App.GetRobotPartRequest.class,
      responseType = viam.app.v1.App.GetRobotPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartRequest,
      viam.app.v1.App.GetRobotPartResponse> getGetRobotPartMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartRequest, viam.app.v1.App.GetRobotPartResponse> getGetRobotPartMethod;
    if ((getGetRobotPartMethod = AppServiceGrpc.getGetRobotPartMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotPartMethod = AppServiceGrpc.getGetRobotPartMethod) == null) {
          AppServiceGrpc.getGetRobotPartMethod = getGetRobotPartMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetRobotPartRequest, viam.app.v1.App.GetRobotPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.GetRobotPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.GetRobotPartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("GetRobotPart"))
              .build();
        }
      }
    }
    return getGetRobotPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartLogsRequest,
      viam.app.v1.App.GetRobotPartLogsResponse> getGetRobotPartLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotPartLogs",
      requestType = viam.app.v1.App.GetRobotPartLogsRequest.class,
      responseType = viam.app.v1.App.GetRobotPartLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartLogsRequest,
      viam.app.v1.App.GetRobotPartLogsResponse> getGetRobotPartLogsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartLogsRequest, viam.app.v1.App.GetRobotPartLogsResponse> getGetRobotPartLogsMethod;
    if ((getGetRobotPartLogsMethod = AppServiceGrpc.getGetRobotPartLogsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotPartLogsMethod = AppServiceGrpc.getGetRobotPartLogsMethod) == null) {
          AppServiceGrpc.getGetRobotPartLogsMethod = getGetRobotPartLogsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetRobotPartLogsRequest, viam.app.v1.App.GetRobotPartLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotPartLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.GetRobotPartLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.GetRobotPartLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("GetRobotPartLogs"))
              .build();
        }
      }
    }
    return getGetRobotPartLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.TailRobotPartLogsRequest,
      viam.app.v1.App.TailRobotPartLogsResponse> getTailRobotPartLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TailRobotPartLogs",
      requestType = viam.app.v1.App.TailRobotPartLogsRequest.class,
      responseType = viam.app.v1.App.TailRobotPartLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.TailRobotPartLogsRequest,
      viam.app.v1.App.TailRobotPartLogsResponse> getTailRobotPartLogsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.TailRobotPartLogsRequest, viam.app.v1.App.TailRobotPartLogsResponse> getTailRobotPartLogsMethod;
    if ((getTailRobotPartLogsMethod = AppServiceGrpc.getTailRobotPartLogsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getTailRobotPartLogsMethod = AppServiceGrpc.getTailRobotPartLogsMethod) == null) {
          AppServiceGrpc.getTailRobotPartLogsMethod = getTailRobotPartLogsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.TailRobotPartLogsRequest, viam.app.v1.App.TailRobotPartLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TailRobotPartLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.TailRobotPartLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.TailRobotPartLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("TailRobotPartLogs"))
              .build();
        }
      }
    }
    return getTailRobotPartLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartHistoryRequest,
      viam.app.v1.App.GetRobotPartHistoryResponse> getGetRobotPartHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotPartHistory",
      requestType = viam.app.v1.App.GetRobotPartHistoryRequest.class,
      responseType = viam.app.v1.App.GetRobotPartHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartHistoryRequest,
      viam.app.v1.App.GetRobotPartHistoryResponse> getGetRobotPartHistoryMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartHistoryRequest, viam.app.v1.App.GetRobotPartHistoryResponse> getGetRobotPartHistoryMethod;
    if ((getGetRobotPartHistoryMethod = AppServiceGrpc.getGetRobotPartHistoryMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotPartHistoryMethod = AppServiceGrpc.getGetRobotPartHistoryMethod) == null) {
          AppServiceGrpc.getGetRobotPartHistoryMethod = getGetRobotPartHistoryMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetRobotPartHistoryRequest, viam.app.v1.App.GetRobotPartHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotPartHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.GetRobotPartHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.GetRobotPartHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("GetRobotPartHistory"))
              .build();
        }
      }
    }
    return getGetRobotPartHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRobotPartRequest,
      viam.app.v1.App.UpdateRobotPartResponse> getUpdateRobotPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRobotPart",
      requestType = viam.app.v1.App.UpdateRobotPartRequest.class,
      responseType = viam.app.v1.App.UpdateRobotPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRobotPartRequest,
      viam.app.v1.App.UpdateRobotPartResponse> getUpdateRobotPartMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRobotPartRequest, viam.app.v1.App.UpdateRobotPartResponse> getUpdateRobotPartMethod;
    if ((getUpdateRobotPartMethod = AppServiceGrpc.getUpdateRobotPartMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateRobotPartMethod = AppServiceGrpc.getUpdateRobotPartMethod) == null) {
          AppServiceGrpc.getUpdateRobotPartMethod = getUpdateRobotPartMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateRobotPartRequest, viam.app.v1.App.UpdateRobotPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRobotPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.UpdateRobotPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.UpdateRobotPartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("UpdateRobotPart"))
              .build();
        }
      }
    }
    return getUpdateRobotPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.NewRobotPartRequest,
      viam.app.v1.App.NewRobotPartResponse> getNewRobotPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewRobotPart",
      requestType = viam.app.v1.App.NewRobotPartRequest.class,
      responseType = viam.app.v1.App.NewRobotPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.NewRobotPartRequest,
      viam.app.v1.App.NewRobotPartResponse> getNewRobotPartMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.NewRobotPartRequest, viam.app.v1.App.NewRobotPartResponse> getNewRobotPartMethod;
    if ((getNewRobotPartMethod = AppServiceGrpc.getNewRobotPartMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getNewRobotPartMethod = AppServiceGrpc.getNewRobotPartMethod) == null) {
          AppServiceGrpc.getNewRobotPartMethod = getNewRobotPartMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.NewRobotPartRequest, viam.app.v1.App.NewRobotPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewRobotPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.NewRobotPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.NewRobotPartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("NewRobotPart"))
              .build();
        }
      }
    }
    return getNewRobotPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DeleteRobotPartRequest,
      viam.app.v1.App.DeleteRobotPartResponse> getDeleteRobotPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRobotPart",
      requestType = viam.app.v1.App.DeleteRobotPartRequest.class,
      responseType = viam.app.v1.App.DeleteRobotPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DeleteRobotPartRequest,
      viam.app.v1.App.DeleteRobotPartResponse> getDeleteRobotPartMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DeleteRobotPartRequest, viam.app.v1.App.DeleteRobotPartResponse> getDeleteRobotPartMethod;
    if ((getDeleteRobotPartMethod = AppServiceGrpc.getDeleteRobotPartMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteRobotPartMethod = AppServiceGrpc.getDeleteRobotPartMethod) == null) {
          AppServiceGrpc.getDeleteRobotPartMethod = getDeleteRobotPartMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DeleteRobotPartRequest, viam.app.v1.App.DeleteRobotPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRobotPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.DeleteRobotPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.DeleteRobotPartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("DeleteRobotPart"))
              .build();
        }
      }
    }
    return getDeleteRobotPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.MarkPartAsMainRequest,
      viam.app.v1.App.MarkPartAsMainResponse> getMarkPartAsMainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkPartAsMain",
      requestType = viam.app.v1.App.MarkPartAsMainRequest.class,
      responseType = viam.app.v1.App.MarkPartAsMainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.MarkPartAsMainRequest,
      viam.app.v1.App.MarkPartAsMainResponse> getMarkPartAsMainMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.MarkPartAsMainRequest, viam.app.v1.App.MarkPartAsMainResponse> getMarkPartAsMainMethod;
    if ((getMarkPartAsMainMethod = AppServiceGrpc.getMarkPartAsMainMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getMarkPartAsMainMethod = AppServiceGrpc.getMarkPartAsMainMethod) == null) {
          AppServiceGrpc.getMarkPartAsMainMethod = getMarkPartAsMainMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.MarkPartAsMainRequest, viam.app.v1.App.MarkPartAsMainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkPartAsMain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.MarkPartAsMainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.MarkPartAsMainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("MarkPartAsMain"))
              .build();
        }
      }
    }
    return getMarkPartAsMainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.CreateRobotPartSecretRequest,
      viam.app.v1.App.CreateRobotPartSecretResponse> getCreateRobotPartSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRobotPartSecret",
      requestType = viam.app.v1.App.CreateRobotPartSecretRequest.class,
      responseType = viam.app.v1.App.CreateRobotPartSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.CreateRobotPartSecretRequest,
      viam.app.v1.App.CreateRobotPartSecretResponse> getCreateRobotPartSecretMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.CreateRobotPartSecretRequest, viam.app.v1.App.CreateRobotPartSecretResponse> getCreateRobotPartSecretMethod;
    if ((getCreateRobotPartSecretMethod = AppServiceGrpc.getCreateRobotPartSecretMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateRobotPartSecretMethod = AppServiceGrpc.getCreateRobotPartSecretMethod) == null) {
          AppServiceGrpc.getCreateRobotPartSecretMethod = getCreateRobotPartSecretMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.CreateRobotPartSecretRequest, viam.app.v1.App.CreateRobotPartSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRobotPartSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.CreateRobotPartSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.CreateRobotPartSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("CreateRobotPartSecret"))
              .build();
        }
      }
    }
    return getCreateRobotPartSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DeleteRobotPartSecretRequest,
      viam.app.v1.App.DeleteRobotPartSecretResponse> getDeleteRobotPartSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRobotPartSecret",
      requestType = viam.app.v1.App.DeleteRobotPartSecretRequest.class,
      responseType = viam.app.v1.App.DeleteRobotPartSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DeleteRobotPartSecretRequest,
      viam.app.v1.App.DeleteRobotPartSecretResponse> getDeleteRobotPartSecretMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DeleteRobotPartSecretRequest, viam.app.v1.App.DeleteRobotPartSecretResponse> getDeleteRobotPartSecretMethod;
    if ((getDeleteRobotPartSecretMethod = AppServiceGrpc.getDeleteRobotPartSecretMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteRobotPartSecretMethod = AppServiceGrpc.getDeleteRobotPartSecretMethod) == null) {
          AppServiceGrpc.getDeleteRobotPartSecretMethod = getDeleteRobotPartSecretMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DeleteRobotPartSecretRequest, viam.app.v1.App.DeleteRobotPartSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRobotPartSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.DeleteRobotPartSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.DeleteRobotPartSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("DeleteRobotPartSecret"))
              .build();
        }
      }
    }
    return getDeleteRobotPartSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.FindRobotsRequest,
      viam.app.v1.App.FindRobotsResponse> getFindRobotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindRobots",
      requestType = viam.app.v1.App.FindRobotsRequest.class,
      responseType = viam.app.v1.App.FindRobotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.FindRobotsRequest,
      viam.app.v1.App.FindRobotsResponse> getFindRobotsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.FindRobotsRequest, viam.app.v1.App.FindRobotsResponse> getFindRobotsMethod;
    if ((getFindRobotsMethod = AppServiceGrpc.getFindRobotsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getFindRobotsMethod = AppServiceGrpc.getFindRobotsMethod) == null) {
          AppServiceGrpc.getFindRobotsMethod = getFindRobotsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.FindRobotsRequest, viam.app.v1.App.FindRobotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindRobots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.FindRobotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.FindRobotsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("FindRobots"))
              .build();
        }
      }
    }
    return getFindRobotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.NewRobotRequest,
      viam.app.v1.App.NewRobotResponse> getNewRobotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewRobot",
      requestType = viam.app.v1.App.NewRobotRequest.class,
      responseType = viam.app.v1.App.NewRobotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.NewRobotRequest,
      viam.app.v1.App.NewRobotResponse> getNewRobotMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.NewRobotRequest, viam.app.v1.App.NewRobotResponse> getNewRobotMethod;
    if ((getNewRobotMethod = AppServiceGrpc.getNewRobotMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getNewRobotMethod = AppServiceGrpc.getNewRobotMethod) == null) {
          AppServiceGrpc.getNewRobotMethod = getNewRobotMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.NewRobotRequest, viam.app.v1.App.NewRobotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewRobot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.NewRobotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.NewRobotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("NewRobot"))
              .build();
        }
      }
    }
    return getNewRobotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRobotRequest,
      viam.app.v1.App.UpdateRobotResponse> getUpdateRobotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRobot",
      requestType = viam.app.v1.App.UpdateRobotRequest.class,
      responseType = viam.app.v1.App.UpdateRobotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRobotRequest,
      viam.app.v1.App.UpdateRobotResponse> getUpdateRobotMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRobotRequest, viam.app.v1.App.UpdateRobotResponse> getUpdateRobotMethod;
    if ((getUpdateRobotMethod = AppServiceGrpc.getUpdateRobotMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateRobotMethod = AppServiceGrpc.getUpdateRobotMethod) == null) {
          AppServiceGrpc.getUpdateRobotMethod = getUpdateRobotMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateRobotRequest, viam.app.v1.App.UpdateRobotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRobot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.UpdateRobotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.UpdateRobotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("UpdateRobot"))
              .build();
        }
      }
    }
    return getUpdateRobotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DeleteRobotRequest,
      viam.app.v1.App.DeleteRobotResponse> getDeleteRobotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRobot",
      requestType = viam.app.v1.App.DeleteRobotRequest.class,
      responseType = viam.app.v1.App.DeleteRobotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DeleteRobotRequest,
      viam.app.v1.App.DeleteRobotResponse> getDeleteRobotMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DeleteRobotRequest, viam.app.v1.App.DeleteRobotResponse> getDeleteRobotMethod;
    if ((getDeleteRobotMethod = AppServiceGrpc.getDeleteRobotMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteRobotMethod = AppServiceGrpc.getDeleteRobotMethod) == null) {
          AppServiceGrpc.getDeleteRobotMethod = getDeleteRobotMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DeleteRobotRequest, viam.app.v1.App.DeleteRobotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRobot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.DeleteRobotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  viam.app.v1.App.DeleteRobotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppServiceMethodDescriptorSupplier("DeleteRobot"))
              .build();
        }
      }
    }
    return getDeleteRobotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppServiceStub>() {
        @java.lang.Override
        public AppServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppServiceStub(channel, callOptions);
        }
      };
    return AppServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppServiceBlockingStub>() {
        @java.lang.Override
        public AppServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppServiceBlockingStub(channel, callOptions);
        }
      };
    return AppServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppServiceFutureStub>() {
        @java.lang.Override
        public AppServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppServiceFutureStub(channel, callOptions);
        }
      };
    return AppServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AppServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createLocation(viam.app.v1.App.CreateLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLocationMethod(), responseObserver);
    }

    /**
     */
    public void listOrganizations(viam.app.v1.App.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListOrganizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationsMethod(), responseObserver);
    }

    /**
     */
    public void listLocations(viam.app.v1.App.ListLocationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListLocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLocationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Share a location with an organization
     * </pre>
     */
    public void shareLocation(viam.app.v1.App.ShareLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ShareLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShareLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop sharing a location with an organization
     * </pre>
     */
    public void unshareLocation(viam.app.v1.App.UnshareLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UnshareLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnshareLocationMethod(), responseObserver);
    }

    /**
     */
    public void locationAuth(viam.app.v1.App.LocationAuthRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.LocationAuthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLocationAuthMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Location.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public void createLocationSecret(viam.app.v1.App.CreateLocationSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateLocationSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLocationSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a Secret from the Location.
     * </pre>
     */
    public void deleteLocationSecret(viam.app.v1.App.DeleteLocationSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteLocationSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLocationSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot by ID
     * </pre>
     */
    public void getRobot(viam.app.v1.App.GetRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotMethod(), responseObserver);
    }

    /**
     */
    public void getRobotParts(viam.app.v1.App.GetRobotPartsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot part by ID
     * </pre>
     */
    public void getRobotPart(viam.app.v1.App.GetRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartMethod(), responseObserver);
    }

    /**
     */
    public void getRobotPartLogs(viam.app.v1.App.GetRobotPartLogsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartLogsMethod(), responseObserver);
    }

    /**
     */
    public void tailRobotPartLogs(viam.app.v1.App.TailRobotPartLogsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.TailRobotPartLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTailRobotPartLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot part histy by ID
     * </pre>
     */
    public void getRobotPartHistory(viam.app.v1.App.GetRobotPartHistoryRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a robot
     * </pre>
     */
    public void updateRobotPart(viam.app.v1.App.UpdateRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRobotPartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new robot part
     * </pre>
     */
    public void newRobotPart(viam.app.v1.App.NewRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.NewRobotPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewRobotPartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a robot part
     * </pre>
     */
    public void deleteRobotPart(viam.app.v1.App.DeleteRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRobotPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRobotPartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Marks the given part as the main part, and all the others as not
     * </pre>
     */
    public void markPartAsMain(viam.app.v1.App.MarkPartAsMainRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.MarkPartAsMainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkPartAsMainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Robot Part.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public void createRobotPartSecret(viam.app.v1.App.CreateRobotPartSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateRobotPartSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRobotPartSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a Secret from the RobotPart.
     * </pre>
     */
    public void deleteRobotPartSecret(viam.app.v1.App.DeleteRobotPartSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRobotPartSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRobotPartSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * Finds robots given a query
     * </pre>
     */
    public void findRobots(viam.app.v1.App.FindRobotsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.FindRobotsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindRobotsMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewRobot creates a new robot
     * </pre>
     */
    public void newRobot(viam.app.v1.App.NewRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.NewRobotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewRobotMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRobot updates a robot
     * </pre>
     */
    public void updateRobot(viam.app.v1.App.UpdateRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRobotMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRobot deletes a robot
     * </pre>
     */
    public void deleteRobot(viam.app.v1.App.DeleteRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRobotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRobotMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateLocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.CreateLocationRequest,
                viam.app.v1.App.CreateLocationResponse>(
                  this, METHODID_CREATE_LOCATION)))
          .addMethod(
            getListOrganizationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.ListOrganizationsRequest,
                viam.app.v1.App.ListOrganizationsResponse>(
                  this, METHODID_LIST_ORGANIZATIONS)))
          .addMethod(
            getListLocationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.ListLocationsRequest,
                viam.app.v1.App.ListLocationsResponse>(
                  this, METHODID_LIST_LOCATIONS)))
          .addMethod(
            getShareLocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.ShareLocationRequest,
                viam.app.v1.App.ShareLocationResponse>(
                  this, METHODID_SHARE_LOCATION)))
          .addMethod(
            getUnshareLocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.UnshareLocationRequest,
                viam.app.v1.App.UnshareLocationResponse>(
                  this, METHODID_UNSHARE_LOCATION)))
          .addMethod(
            getLocationAuthMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.LocationAuthRequest,
                viam.app.v1.App.LocationAuthResponse>(
                  this, METHODID_LOCATION_AUTH)))
          .addMethod(
            getCreateLocationSecretMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.CreateLocationSecretRequest,
                viam.app.v1.App.CreateLocationSecretResponse>(
                  this, METHODID_CREATE_LOCATION_SECRET)))
          .addMethod(
            getDeleteLocationSecretMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.DeleteLocationSecretRequest,
                viam.app.v1.App.DeleteLocationSecretResponse>(
                  this, METHODID_DELETE_LOCATION_SECRET)))
          .addMethod(
            getGetRobotMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.GetRobotRequest,
                viam.app.v1.App.GetRobotResponse>(
                  this, METHODID_GET_ROBOT)))
          .addMethod(
            getGetRobotPartsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.GetRobotPartsRequest,
                viam.app.v1.App.GetRobotPartsResponse>(
                  this, METHODID_GET_ROBOT_PARTS)))
          .addMethod(
            getGetRobotPartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.GetRobotPartRequest,
                viam.app.v1.App.GetRobotPartResponse>(
                  this, METHODID_GET_ROBOT_PART)))
          .addMethod(
            getGetRobotPartLogsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.GetRobotPartLogsRequest,
                viam.app.v1.App.GetRobotPartLogsResponse>(
                  this, METHODID_GET_ROBOT_PART_LOGS)))
          .addMethod(
            getTailRobotPartLogsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                viam.app.v1.App.TailRobotPartLogsRequest,
                viam.app.v1.App.TailRobotPartLogsResponse>(
                  this, METHODID_TAIL_ROBOT_PART_LOGS)))
          .addMethod(
            getGetRobotPartHistoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.GetRobotPartHistoryRequest,
                viam.app.v1.App.GetRobotPartHistoryResponse>(
                  this, METHODID_GET_ROBOT_PART_HISTORY)))
          .addMethod(
            getUpdateRobotPartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.UpdateRobotPartRequest,
                viam.app.v1.App.UpdateRobotPartResponse>(
                  this, METHODID_UPDATE_ROBOT_PART)))
          .addMethod(
            getNewRobotPartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.NewRobotPartRequest,
                viam.app.v1.App.NewRobotPartResponse>(
                  this, METHODID_NEW_ROBOT_PART)))
          .addMethod(
            getDeleteRobotPartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.DeleteRobotPartRequest,
                viam.app.v1.App.DeleteRobotPartResponse>(
                  this, METHODID_DELETE_ROBOT_PART)))
          .addMethod(
            getMarkPartAsMainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.MarkPartAsMainRequest,
                viam.app.v1.App.MarkPartAsMainResponse>(
                  this, METHODID_MARK_PART_AS_MAIN)))
          .addMethod(
            getCreateRobotPartSecretMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.CreateRobotPartSecretRequest,
                viam.app.v1.App.CreateRobotPartSecretResponse>(
                  this, METHODID_CREATE_ROBOT_PART_SECRET)))
          .addMethod(
            getDeleteRobotPartSecretMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.DeleteRobotPartSecretRequest,
                viam.app.v1.App.DeleteRobotPartSecretResponse>(
                  this, METHODID_DELETE_ROBOT_PART_SECRET)))
          .addMethod(
            getFindRobotsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.FindRobotsRequest,
                viam.app.v1.App.FindRobotsResponse>(
                  this, METHODID_FIND_ROBOTS)))
          .addMethod(
            getNewRobotMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.NewRobotRequest,
                viam.app.v1.App.NewRobotResponse>(
                  this, METHODID_NEW_ROBOT)))
          .addMethod(
            getUpdateRobotMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.UpdateRobotRequest,
                viam.app.v1.App.UpdateRobotResponse>(
                  this, METHODID_UPDATE_ROBOT)))
          .addMethod(
            getDeleteRobotMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                viam.app.v1.App.DeleteRobotRequest,
                viam.app.v1.App.DeleteRobotResponse>(
                  this, METHODID_DELETE_ROBOT)))
          .build();
    }
  }

  /**
   */
  public static final class AppServiceStub extends io.grpc.stub.AbstractAsyncStub<AppServiceStub> {
    private AppServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppServiceStub(channel, callOptions);
    }

    /**
     */
    public void createLocation(viam.app.v1.App.CreateLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOrganizations(viam.app.v1.App.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListOrganizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listLocations(viam.app.v1.App.ListLocationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListLocationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Share a location with an organization
     * </pre>
     */
    public void shareLocation(viam.app.v1.App.ShareLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ShareLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShareLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop sharing a location with an organization
     * </pre>
     */
    public void unshareLocation(viam.app.v1.App.UnshareLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UnshareLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnshareLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void locationAuth(viam.app.v1.App.LocationAuthRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.LocationAuthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLocationAuthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Location.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public void createLocationSecret(viam.app.v1.App.CreateLocationSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateLocationSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLocationSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a Secret from the Location.
     * </pre>
     */
    public void deleteLocationSecret(viam.app.v1.App.DeleteLocationSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteLocationSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLocationSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot by ID
     * </pre>
     */
    public void getRobot(viam.app.v1.App.GetRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRobotParts(viam.app.v1.App.GetRobotPartsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotPartsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot part by ID
     * </pre>
     */
    public void getRobotPart(viam.app.v1.App.GetRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRobotPartLogs(viam.app.v1.App.GetRobotPartLogsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotPartLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tailRobotPartLogs(viam.app.v1.App.TailRobotPartLogsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.TailRobotPartLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getTailRobotPartLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot part histy by ID
     * </pre>
     */
    public void getRobotPartHistory(viam.app.v1.App.GetRobotPartHistoryRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotPartHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a robot
     * </pre>
     */
    public void updateRobotPart(viam.app.v1.App.UpdateRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRobotPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new robot part
     * </pre>
     */
    public void newRobotPart(viam.app.v1.App.NewRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.NewRobotPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewRobotPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a robot part
     * </pre>
     */
    public void deleteRobotPart(viam.app.v1.App.DeleteRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRobotPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRobotPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Marks the given part as the main part, and all the others as not
     * </pre>
     */
    public void markPartAsMain(viam.app.v1.App.MarkPartAsMainRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.MarkPartAsMainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkPartAsMainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Robot Part.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public void createRobotPartSecret(viam.app.v1.App.CreateRobotPartSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateRobotPartSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRobotPartSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a Secret from the RobotPart.
     * </pre>
     */
    public void deleteRobotPartSecret(viam.app.v1.App.DeleteRobotPartSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRobotPartSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRobotPartSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Finds robots given a query
     * </pre>
     */
    public void findRobots(viam.app.v1.App.FindRobotsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.FindRobotsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindRobotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewRobot creates a new robot
     * </pre>
     */
    public void newRobot(viam.app.v1.App.NewRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.NewRobotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewRobotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateRobot updates a robot
     * </pre>
     */
    public void updateRobot(viam.app.v1.App.UpdateRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRobotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRobot deletes a robot
     * </pre>
     */
    public void deleteRobot(viam.app.v1.App.DeleteRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRobotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRobotMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AppServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AppServiceBlockingStub> {
    private AppServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public viam.app.v1.App.CreateLocationResponse createLocation(viam.app.v1.App.CreateLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.ListOrganizationsResponse listOrganizations(viam.app.v1.App.ListOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.ListLocationsResponse listLocations(viam.app.v1.App.ListLocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Share a location with an organization
     * </pre>
     */
    public viam.app.v1.App.ShareLocationResponse shareLocation(viam.app.v1.App.ShareLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShareLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop sharing a location with an organization
     * </pre>
     */
    public viam.app.v1.App.UnshareLocationResponse unshareLocation(viam.app.v1.App.UnshareLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnshareLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.LocationAuthResponse locationAuth(viam.app.v1.App.LocationAuthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLocationAuthMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Location.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public viam.app.v1.App.CreateLocationSecretResponse createLocationSecret(viam.app.v1.App.CreateLocationSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLocationSecretMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a Secret from the Location.
     * </pre>
     */
    public viam.app.v1.App.DeleteLocationSecretResponse deleteLocationSecret(viam.app.v1.App.DeleteLocationSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLocationSecretMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific robot by ID
     * </pre>
     */
    public viam.app.v1.App.GetRobotResponse getRobot(viam.app.v1.App.GetRobotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.GetRobotPartsResponse getRobotParts(viam.app.v1.App.GetRobotPartsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotPartsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific robot part by ID
     * </pre>
     */
    public viam.app.v1.App.GetRobotPartResponse getRobotPart(viam.app.v1.App.GetRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotPartMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.GetRobotPartLogsResponse getRobotPartLogs(viam.app.v1.App.GetRobotPartLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotPartLogsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<viam.app.v1.App.TailRobotPartLogsResponse> tailRobotPartLogs(
        viam.app.v1.App.TailRobotPartLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getTailRobotPartLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific robot part histy by ID
     * </pre>
     */
    public viam.app.v1.App.GetRobotPartHistoryResponse getRobotPartHistory(viam.app.v1.App.GetRobotPartHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotPartHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a robot
     * </pre>
     */
    public viam.app.v1.App.UpdateRobotPartResponse updateRobotPart(viam.app.v1.App.UpdateRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRobotPartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new robot part
     * </pre>
     */
    public viam.app.v1.App.NewRobotPartResponse newRobotPart(viam.app.v1.App.NewRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewRobotPartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a robot part
     * </pre>
     */
    public viam.app.v1.App.DeleteRobotPartResponse deleteRobotPart(viam.app.v1.App.DeleteRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRobotPartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Marks the given part as the main part, and all the others as not
     * </pre>
     */
    public viam.app.v1.App.MarkPartAsMainResponse markPartAsMain(viam.app.v1.App.MarkPartAsMainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkPartAsMainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Robot Part.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public viam.app.v1.App.CreateRobotPartSecretResponse createRobotPartSecret(viam.app.v1.App.CreateRobotPartSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRobotPartSecretMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a Secret from the RobotPart.
     * </pre>
     */
    public viam.app.v1.App.DeleteRobotPartSecretResponse deleteRobotPartSecret(viam.app.v1.App.DeleteRobotPartSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRobotPartSecretMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Finds robots given a query
     * </pre>
     */
    public viam.app.v1.App.FindRobotsResponse findRobots(viam.app.v1.App.FindRobotsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindRobotsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewRobot creates a new robot
     * </pre>
     */
    public viam.app.v1.App.NewRobotResponse newRobot(viam.app.v1.App.NewRobotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewRobotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRobot updates a robot
     * </pre>
     */
    public viam.app.v1.App.UpdateRobotResponse updateRobot(viam.app.v1.App.UpdateRobotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRobotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRobot deletes a robot
     * </pre>
     */
    public viam.app.v1.App.DeleteRobotResponse deleteRobot(viam.app.v1.App.DeleteRobotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRobotMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AppServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AppServiceFutureStub> {
    private AppServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.CreateLocationResponse> createLocation(
        viam.app.v1.App.CreateLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ListOrganizationsResponse> listOrganizations(
        viam.app.v1.App.ListOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ListLocationsResponse> listLocations(
        viam.app.v1.App.ListLocationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLocationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Share a location with an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ShareLocationResponse> shareLocation(
        viam.app.v1.App.ShareLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShareLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop sharing a location with an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UnshareLocationResponse> unshareLocation(
        viam.app.v1.App.UnshareLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnshareLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.LocationAuthResponse> locationAuth(
        viam.app.v1.App.LocationAuthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLocationAuthMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Location.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.CreateLocationSecretResponse> createLocationSecret(
        viam.app.v1.App.CreateLocationSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLocationSecretMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a Secret from the Location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DeleteLocationSecretResponse> deleteLocationSecret(
        viam.app.v1.App.DeleteLocationSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLocationSecretMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific robot by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetRobotResponse> getRobot(
        viam.app.v1.App.GetRobotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetRobotPartsResponse> getRobotParts(
        viam.app.v1.App.GetRobotPartsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotPartsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific robot part by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetRobotPartResponse> getRobotPart(
        viam.app.v1.App.GetRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotPartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetRobotPartLogsResponse> getRobotPartLogs(
        viam.app.v1.App.GetRobotPartLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotPartLogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific robot part histy by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetRobotPartHistoryResponse> getRobotPartHistory(
        viam.app.v1.App.GetRobotPartHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotPartHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateRobotPartResponse> updateRobotPart(
        viam.app.v1.App.UpdateRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRobotPartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new robot part
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.NewRobotPartResponse> newRobotPart(
        viam.app.v1.App.NewRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewRobotPartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a robot part
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DeleteRobotPartResponse> deleteRobotPart(
        viam.app.v1.App.DeleteRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRobotPartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Marks the given part as the main part, and all the others as not
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.MarkPartAsMainResponse> markPartAsMain(
        viam.app.v1.App.MarkPartAsMainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkPartAsMainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Robot Part.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.CreateRobotPartSecretResponse> createRobotPartSecret(
        viam.app.v1.App.CreateRobotPartSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRobotPartSecretMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a Secret from the RobotPart.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DeleteRobotPartSecretResponse> deleteRobotPartSecret(
        viam.app.v1.App.DeleteRobotPartSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRobotPartSecretMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Finds robots given a query
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.FindRobotsResponse> findRobots(
        viam.app.v1.App.FindRobotsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindRobotsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewRobot creates a new robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.NewRobotResponse> newRobot(
        viam.app.v1.App.NewRobotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewRobotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateRobot updates a robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateRobotResponse> updateRobot(
        viam.app.v1.App.UpdateRobotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRobotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRobot deletes a robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DeleteRobotResponse> deleteRobot(
        viam.app.v1.App.DeleteRobotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRobotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_LOCATION = 0;
  private static final int METHODID_LIST_ORGANIZATIONS = 1;
  private static final int METHODID_LIST_LOCATIONS = 2;
  private static final int METHODID_SHARE_LOCATION = 3;
  private static final int METHODID_UNSHARE_LOCATION = 4;
  private static final int METHODID_LOCATION_AUTH = 5;
  private static final int METHODID_CREATE_LOCATION_SECRET = 6;
  private static final int METHODID_DELETE_LOCATION_SECRET = 7;
  private static final int METHODID_GET_ROBOT = 8;
  private static final int METHODID_GET_ROBOT_PARTS = 9;
  private static final int METHODID_GET_ROBOT_PART = 10;
  private static final int METHODID_GET_ROBOT_PART_LOGS = 11;
  private static final int METHODID_TAIL_ROBOT_PART_LOGS = 12;
  private static final int METHODID_GET_ROBOT_PART_HISTORY = 13;
  private static final int METHODID_UPDATE_ROBOT_PART = 14;
  private static final int METHODID_NEW_ROBOT_PART = 15;
  private static final int METHODID_DELETE_ROBOT_PART = 16;
  private static final int METHODID_MARK_PART_AS_MAIN = 17;
  private static final int METHODID_CREATE_ROBOT_PART_SECRET = 18;
  private static final int METHODID_DELETE_ROBOT_PART_SECRET = 19;
  private static final int METHODID_FIND_ROBOTS = 20;
  private static final int METHODID_NEW_ROBOT = 21;
  private static final int METHODID_UPDATE_ROBOT = 22;
  private static final int METHODID_DELETE_ROBOT = 23;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AppServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AppServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_LOCATION:
          serviceImpl.createLocation((viam.app.v1.App.CreateLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CreateLocationResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATIONS:
          serviceImpl.listOrganizations((viam.app.v1.App.ListOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ListOrganizationsResponse>) responseObserver);
          break;
        case METHODID_LIST_LOCATIONS:
          serviceImpl.listLocations((viam.app.v1.App.ListLocationsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ListLocationsResponse>) responseObserver);
          break;
        case METHODID_SHARE_LOCATION:
          serviceImpl.shareLocation((viam.app.v1.App.ShareLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ShareLocationResponse>) responseObserver);
          break;
        case METHODID_UNSHARE_LOCATION:
          serviceImpl.unshareLocation((viam.app.v1.App.UnshareLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UnshareLocationResponse>) responseObserver);
          break;
        case METHODID_LOCATION_AUTH:
          serviceImpl.locationAuth((viam.app.v1.App.LocationAuthRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.LocationAuthResponse>) responseObserver);
          break;
        case METHODID_CREATE_LOCATION_SECRET:
          serviceImpl.createLocationSecret((viam.app.v1.App.CreateLocationSecretRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CreateLocationSecretResponse>) responseObserver);
          break;
        case METHODID_DELETE_LOCATION_SECRET:
          serviceImpl.deleteLocationSecret((viam.app.v1.App.DeleteLocationSecretRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteLocationSecretResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT:
          serviceImpl.getRobot((viam.app.v1.App.GetRobotRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT_PARTS:
          serviceImpl.getRobotParts((viam.app.v1.App.GetRobotPartsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartsResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT_PART:
          serviceImpl.getRobotPart((viam.app.v1.App.GetRobotPartRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT_PART_LOGS:
          serviceImpl.getRobotPartLogs((viam.app.v1.App.GetRobotPartLogsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartLogsResponse>) responseObserver);
          break;
        case METHODID_TAIL_ROBOT_PART_LOGS:
          serviceImpl.tailRobotPartLogs((viam.app.v1.App.TailRobotPartLogsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.TailRobotPartLogsResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT_PART_HISTORY:
          serviceImpl.getRobotPartHistory((viam.app.v1.App.GetRobotPartHistoryRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartHistoryResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROBOT_PART:
          serviceImpl.updateRobotPart((viam.app.v1.App.UpdateRobotPartRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotPartResponse>) responseObserver);
          break;
        case METHODID_NEW_ROBOT_PART:
          serviceImpl.newRobotPart((viam.app.v1.App.NewRobotPartRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.NewRobotPartResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROBOT_PART:
          serviceImpl.deleteRobotPart((viam.app.v1.App.DeleteRobotPartRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRobotPartResponse>) responseObserver);
          break;
        case METHODID_MARK_PART_AS_MAIN:
          serviceImpl.markPartAsMain((viam.app.v1.App.MarkPartAsMainRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.MarkPartAsMainResponse>) responseObserver);
          break;
        case METHODID_CREATE_ROBOT_PART_SECRET:
          serviceImpl.createRobotPartSecret((viam.app.v1.App.CreateRobotPartSecretRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CreateRobotPartSecretResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROBOT_PART_SECRET:
          serviceImpl.deleteRobotPartSecret((viam.app.v1.App.DeleteRobotPartSecretRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRobotPartSecretResponse>) responseObserver);
          break;
        case METHODID_FIND_ROBOTS:
          serviceImpl.findRobots((viam.app.v1.App.FindRobotsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.FindRobotsResponse>) responseObserver);
          break;
        case METHODID_NEW_ROBOT:
          serviceImpl.newRobot((viam.app.v1.App.NewRobotRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.NewRobotResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROBOT:
          serviceImpl.updateRobot((viam.app.v1.App.UpdateRobotRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROBOT:
          serviceImpl.deleteRobot((viam.app.v1.App.DeleteRobotRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRobotResponse>) responseObserver);
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

  private static abstract class AppServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return viam.app.v1.App.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppService");
    }
  }

  private static final class AppServiceFileDescriptorSupplier
      extends AppServiceBaseDescriptorSupplier {
    AppServiceFileDescriptorSupplier() {}
  }

  private static final class AppServiceMethodDescriptorSupplier
      extends AppServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AppServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppServiceFileDescriptorSupplier())
              .addMethod(getCreateLocationMethod())
              .addMethod(getListOrganizationsMethod())
              .addMethod(getListLocationsMethod())
              .addMethod(getShareLocationMethod())
              .addMethod(getUnshareLocationMethod())
              .addMethod(getLocationAuthMethod())
              .addMethod(getCreateLocationSecretMethod())
              .addMethod(getDeleteLocationSecretMethod())
              .addMethod(getGetRobotMethod())
              .addMethod(getGetRobotPartsMethod())
              .addMethod(getGetRobotPartMethod())
              .addMethod(getGetRobotPartLogsMethod())
              .addMethod(getTailRobotPartLogsMethod())
              .addMethod(getGetRobotPartHistoryMethod())
              .addMethod(getUpdateRobotPartMethod())
              .addMethod(getNewRobotPartMethod())
              .addMethod(getDeleteRobotPartMethod())
              .addMethod(getMarkPartAsMainMethod())
              .addMethod(getCreateRobotPartSecretMethod())
              .addMethod(getDeleteRobotPartSecretMethod())
              .addMethod(getFindRobotsMethod())
              .addMethod(getNewRobotMethod())
              .addMethod(getUpdateRobotMethod())
              .addMethod(getDeleteRobotMethod())
              .build();
        }
      }
    }
    return result;
  }
}
