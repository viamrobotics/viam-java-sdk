package viam.app.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Users
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: app/v1/app.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AppServiceGrpc {

  private AppServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.app.v1.AppService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetUserIDByEmailRequest,
      viam.app.v1.AppOuterClass.GetUserIDByEmailResponse> getGetUserIDByEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserIDByEmail",
      requestType = viam.app.v1.AppOuterClass.GetUserIDByEmailRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetUserIDByEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetUserIDByEmailRequest,
      viam.app.v1.AppOuterClass.GetUserIDByEmailResponse> getGetUserIDByEmailMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetUserIDByEmailRequest, viam.app.v1.AppOuterClass.GetUserIDByEmailResponse> getGetUserIDByEmailMethod;
    if ((getGetUserIDByEmailMethod = AppServiceGrpc.getGetUserIDByEmailMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetUserIDByEmailMethod = AppServiceGrpc.getGetUserIDByEmailMethod) == null) {
          AppServiceGrpc.getGetUserIDByEmailMethod = getGetUserIDByEmailMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetUserIDByEmailRequest, viam.app.v1.AppOuterClass.GetUserIDByEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserIDByEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetUserIDByEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetUserIDByEmailResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetUserIDByEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateOrganizationRequest,
      viam.app.v1.AppOuterClass.CreateOrganizationResponse> getCreateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganization",
      requestType = viam.app.v1.AppOuterClass.CreateOrganizationRequest.class,
      responseType = viam.app.v1.AppOuterClass.CreateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateOrganizationRequest,
      viam.app.v1.AppOuterClass.CreateOrganizationResponse> getCreateOrganizationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateOrganizationRequest, viam.app.v1.AppOuterClass.CreateOrganizationResponse> getCreateOrganizationMethod;
    if ((getCreateOrganizationMethod = AppServiceGrpc.getCreateOrganizationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateOrganizationMethod = AppServiceGrpc.getCreateOrganizationMethod) == null) {
          AppServiceGrpc.getCreateOrganizationMethod = getCreateOrganizationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.CreateOrganizationRequest, viam.app.v1.AppOuterClass.CreateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateOrganizationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListOrganizationsRequest,
      viam.app.v1.AppOuterClass.ListOrganizationsResponse> getListOrganizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizations",
      requestType = viam.app.v1.AppOuterClass.ListOrganizationsRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListOrganizationsRequest,
      viam.app.v1.AppOuterClass.ListOrganizationsResponse> getListOrganizationsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListOrganizationsRequest, viam.app.v1.AppOuterClass.ListOrganizationsResponse> getListOrganizationsMethod;
    if ((getListOrganizationsMethod = AppServiceGrpc.getListOrganizationsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListOrganizationsMethod = AppServiceGrpc.getListOrganizationsMethod) == null) {
          AppServiceGrpc.getListOrganizationsMethod = getListOrganizationsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListOrganizationsRequest, viam.app.v1.AppOuterClass.ListOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListOrganizationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListOrganizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationRequest,
      viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationResponse> getGetOrganizationsWithAccessToLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationsWithAccessToLocation",
      requestType = viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationRequest,
      viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationResponse> getGetOrganizationsWithAccessToLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationRequest, viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationResponse> getGetOrganizationsWithAccessToLocationMethod;
    if ((getGetOrganizationsWithAccessToLocationMethod = AppServiceGrpc.getGetOrganizationsWithAccessToLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetOrganizationsWithAccessToLocationMethod = AppServiceGrpc.getGetOrganizationsWithAccessToLocationMethod) == null) {
          AppServiceGrpc.getGetOrganizationsWithAccessToLocationMethod = getGetOrganizationsWithAccessToLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationRequest, viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationsWithAccessToLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOrganizationsWithAccessToLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListOrganizationsByUserRequest,
      viam.app.v1.AppOuterClass.ListOrganizationsByUserResponse> getListOrganizationsByUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizationsByUser",
      requestType = viam.app.v1.AppOuterClass.ListOrganizationsByUserRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListOrganizationsByUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListOrganizationsByUserRequest,
      viam.app.v1.AppOuterClass.ListOrganizationsByUserResponse> getListOrganizationsByUserMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListOrganizationsByUserRequest, viam.app.v1.AppOuterClass.ListOrganizationsByUserResponse> getListOrganizationsByUserMethod;
    if ((getListOrganizationsByUserMethod = AppServiceGrpc.getListOrganizationsByUserMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListOrganizationsByUserMethod = AppServiceGrpc.getListOrganizationsByUserMethod) == null) {
          AppServiceGrpc.getListOrganizationsByUserMethod = getListOrganizationsByUserMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListOrganizationsByUserRequest, viam.app.v1.AppOuterClass.ListOrganizationsByUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizationsByUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListOrganizationsByUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListOrganizationsByUserResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListOrganizationsByUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.SearchOrganizationsRequest,
      viam.app.v1.AppOuterClass.SearchOrganizationsResponse> getSearchOrganizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchOrganizations",
      requestType = viam.app.v1.AppOuterClass.SearchOrganizationsRequest.class,
      responseType = viam.app.v1.AppOuterClass.SearchOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.SearchOrganizationsRequest,
      viam.app.v1.AppOuterClass.SearchOrganizationsResponse> getSearchOrganizationsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.SearchOrganizationsRequest, viam.app.v1.AppOuterClass.SearchOrganizationsResponse> getSearchOrganizationsMethod;
    if ((getSearchOrganizationsMethod = AppServiceGrpc.getSearchOrganizationsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getSearchOrganizationsMethod = AppServiceGrpc.getSearchOrganizationsMethod) == null) {
          AppServiceGrpc.getSearchOrganizationsMethod = getSearchOrganizationsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.SearchOrganizationsRequest, viam.app.v1.AppOuterClass.SearchOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchOrganizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.SearchOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.SearchOrganizationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSearchOrganizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetOrganizationRequest,
      viam.app.v1.AppOuterClass.GetOrganizationResponse> getGetOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganization",
      requestType = viam.app.v1.AppOuterClass.GetOrganizationRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetOrganizationRequest,
      viam.app.v1.AppOuterClass.GetOrganizationResponse> getGetOrganizationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetOrganizationRequest, viam.app.v1.AppOuterClass.GetOrganizationResponse> getGetOrganizationMethod;
    if ((getGetOrganizationMethod = AppServiceGrpc.getGetOrganizationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetOrganizationMethod = AppServiceGrpc.getGetOrganizationMethod) == null) {
          AppServiceGrpc.getGetOrganizationMethod = getGetOrganizationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetOrganizationRequest, viam.app.v1.AppOuterClass.GetOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetOrganizationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityRequest,
      viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityResponse> getGetOrganizationNamespaceAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationNamespaceAvailability",
      requestType = viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityRequest,
      viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityResponse> getGetOrganizationNamespaceAvailabilityMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityRequest, viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityResponse> getGetOrganizationNamespaceAvailabilityMethod;
    if ((getGetOrganizationNamespaceAvailabilityMethod = AppServiceGrpc.getGetOrganizationNamespaceAvailabilityMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetOrganizationNamespaceAvailabilityMethod = AppServiceGrpc.getGetOrganizationNamespaceAvailabilityMethod) == null) {
          AppServiceGrpc.getGetOrganizationNamespaceAvailabilityMethod = getGetOrganizationNamespaceAvailabilityMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityRequest, viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationNamespaceAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOrganizationNamespaceAvailabilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOrganizationRequest,
      viam.app.v1.AppOuterClass.UpdateOrganizationResponse> getUpdateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganization",
      requestType = viam.app.v1.AppOuterClass.UpdateOrganizationRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOrganizationRequest,
      viam.app.v1.AppOuterClass.UpdateOrganizationResponse> getUpdateOrganizationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOrganizationRequest, viam.app.v1.AppOuterClass.UpdateOrganizationResponse> getUpdateOrganizationMethod;
    if ((getUpdateOrganizationMethod = AppServiceGrpc.getUpdateOrganizationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateOrganizationMethod = AppServiceGrpc.getUpdateOrganizationMethod) == null) {
          AppServiceGrpc.getUpdateOrganizationMethod = getUpdateOrganizationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateOrganizationRequest, viam.app.v1.AppOuterClass.UpdateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateOrganizationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceRequest,
      viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceResponse> getUpdateOrganizationNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganizationNamespace",
      requestType = viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceRequest,
      viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceResponse> getUpdateOrganizationNamespaceMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceRequest, viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceResponse> getUpdateOrganizationNamespaceMethod;
    if ((getUpdateOrganizationNamespaceMethod = AppServiceGrpc.getUpdateOrganizationNamespaceMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateOrganizationNamespaceMethod = AppServiceGrpc.getUpdateOrganizationNamespaceMethod) == null) {
          AppServiceGrpc.getUpdateOrganizationNamespaceMethod = getUpdateOrganizationNamespaceMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceRequest, viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganizationNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateOrganizationNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteOrganizationRequest,
      viam.app.v1.AppOuterClass.DeleteOrganizationResponse> getDeleteOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrganization",
      requestType = viam.app.v1.AppOuterClass.DeleteOrganizationRequest.class,
      responseType = viam.app.v1.AppOuterClass.DeleteOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteOrganizationRequest,
      viam.app.v1.AppOuterClass.DeleteOrganizationResponse> getDeleteOrganizationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteOrganizationRequest, viam.app.v1.AppOuterClass.DeleteOrganizationResponse> getDeleteOrganizationMethod;
    if ((getDeleteOrganizationMethod = AppServiceGrpc.getDeleteOrganizationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteOrganizationMethod = AppServiceGrpc.getDeleteOrganizationMethod) == null) {
          AppServiceGrpc.getDeleteOrganizationMethod = getDeleteOrganizationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DeleteOrganizationRequest, viam.app.v1.AppOuterClass.DeleteOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteOrganizationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetOrganizationMetadataRequest,
      viam.app.v1.AppOuterClass.GetOrganizationMetadataResponse> getGetOrganizationMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationMetadata",
      requestType = viam.app.v1.AppOuterClass.GetOrganizationMetadataRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetOrganizationMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetOrganizationMetadataRequest,
      viam.app.v1.AppOuterClass.GetOrganizationMetadataResponse> getGetOrganizationMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetOrganizationMetadataRequest, viam.app.v1.AppOuterClass.GetOrganizationMetadataResponse> getGetOrganizationMetadataMethod;
    if ((getGetOrganizationMetadataMethod = AppServiceGrpc.getGetOrganizationMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetOrganizationMetadataMethod = AppServiceGrpc.getGetOrganizationMetadataMethod) == null) {
          AppServiceGrpc.getGetOrganizationMetadataMethod = getGetOrganizationMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetOrganizationMetadataRequest, viam.app.v1.AppOuterClass.GetOrganizationMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetOrganizationMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetOrganizationMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOrganizationMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOrganizationMetadataRequest,
      viam.app.v1.AppOuterClass.UpdateOrganizationMetadataResponse> getUpdateOrganizationMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganizationMetadata",
      requestType = viam.app.v1.AppOuterClass.UpdateOrganizationMetadataRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateOrganizationMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOrganizationMetadataRequest,
      viam.app.v1.AppOuterClass.UpdateOrganizationMetadataResponse> getUpdateOrganizationMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOrganizationMetadataRequest, viam.app.v1.AppOuterClass.UpdateOrganizationMetadataResponse> getUpdateOrganizationMetadataMethod;
    if ((getUpdateOrganizationMetadataMethod = AppServiceGrpc.getUpdateOrganizationMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateOrganizationMetadataMethod = AppServiceGrpc.getUpdateOrganizationMetadataMethod) == null) {
          AppServiceGrpc.getUpdateOrganizationMetadataMethod = getUpdateOrganizationMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateOrganizationMetadataRequest, viam.app.v1.AppOuterClass.UpdateOrganizationMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganizationMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateOrganizationMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateOrganizationMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateOrganizationMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListOrganizationMembersRequest,
      viam.app.v1.AppOuterClass.ListOrganizationMembersResponse> getListOrganizationMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizationMembers",
      requestType = viam.app.v1.AppOuterClass.ListOrganizationMembersRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListOrganizationMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListOrganizationMembersRequest,
      viam.app.v1.AppOuterClass.ListOrganizationMembersResponse> getListOrganizationMembersMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListOrganizationMembersRequest, viam.app.v1.AppOuterClass.ListOrganizationMembersResponse> getListOrganizationMembersMethod;
    if ((getListOrganizationMembersMethod = AppServiceGrpc.getListOrganizationMembersMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListOrganizationMembersMethod = AppServiceGrpc.getListOrganizationMembersMethod) == null) {
          AppServiceGrpc.getListOrganizationMembersMethod = getListOrganizationMembersMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListOrganizationMembersRequest, viam.app.v1.AppOuterClass.ListOrganizationMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizationMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListOrganizationMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListOrganizationMembersResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListOrganizationMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateOrganizationInviteRequest,
      viam.app.v1.AppOuterClass.CreateOrganizationInviteResponse> getCreateOrganizationInviteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganizationInvite",
      requestType = viam.app.v1.AppOuterClass.CreateOrganizationInviteRequest.class,
      responseType = viam.app.v1.AppOuterClass.CreateOrganizationInviteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateOrganizationInviteRequest,
      viam.app.v1.AppOuterClass.CreateOrganizationInviteResponse> getCreateOrganizationInviteMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateOrganizationInviteRequest, viam.app.v1.AppOuterClass.CreateOrganizationInviteResponse> getCreateOrganizationInviteMethod;
    if ((getCreateOrganizationInviteMethod = AppServiceGrpc.getCreateOrganizationInviteMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateOrganizationInviteMethod = AppServiceGrpc.getCreateOrganizationInviteMethod) == null) {
          AppServiceGrpc.getCreateOrganizationInviteMethod = getCreateOrganizationInviteMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.CreateOrganizationInviteRequest, viam.app.v1.AppOuterClass.CreateOrganizationInviteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganizationInvite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateOrganizationInviteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateOrganizationInviteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateOrganizationInviteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsRequest,
      viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsResponse> getUpdateOrganizationInviteAuthorizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganizationInviteAuthorizations",
      requestType = viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsRequest,
      viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsResponse> getUpdateOrganizationInviteAuthorizationsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsRequest, viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsResponse> getUpdateOrganizationInviteAuthorizationsMethod;
    if ((getUpdateOrganizationInviteAuthorizationsMethod = AppServiceGrpc.getUpdateOrganizationInviteAuthorizationsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateOrganizationInviteAuthorizationsMethod = AppServiceGrpc.getUpdateOrganizationInviteAuthorizationsMethod) == null) {
          AppServiceGrpc.getUpdateOrganizationInviteAuthorizationsMethod = getUpdateOrganizationInviteAuthorizationsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsRequest, viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganizationInviteAuthorizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateOrganizationInviteAuthorizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteOrganizationMemberRequest,
      viam.app.v1.AppOuterClass.DeleteOrganizationMemberResponse> getDeleteOrganizationMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrganizationMember",
      requestType = viam.app.v1.AppOuterClass.DeleteOrganizationMemberRequest.class,
      responseType = viam.app.v1.AppOuterClass.DeleteOrganizationMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteOrganizationMemberRequest,
      viam.app.v1.AppOuterClass.DeleteOrganizationMemberResponse> getDeleteOrganizationMemberMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteOrganizationMemberRequest, viam.app.v1.AppOuterClass.DeleteOrganizationMemberResponse> getDeleteOrganizationMemberMethod;
    if ((getDeleteOrganizationMemberMethod = AppServiceGrpc.getDeleteOrganizationMemberMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteOrganizationMemberMethod = AppServiceGrpc.getDeleteOrganizationMemberMethod) == null) {
          AppServiceGrpc.getDeleteOrganizationMemberMethod = getDeleteOrganizationMemberMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DeleteOrganizationMemberRequest, viam.app.v1.AppOuterClass.DeleteOrganizationMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrganizationMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteOrganizationMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteOrganizationMemberResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteOrganizationMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteOrganizationInviteRequest,
      viam.app.v1.AppOuterClass.DeleteOrganizationInviteResponse> getDeleteOrganizationInviteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrganizationInvite",
      requestType = viam.app.v1.AppOuterClass.DeleteOrganizationInviteRequest.class,
      responseType = viam.app.v1.AppOuterClass.DeleteOrganizationInviteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteOrganizationInviteRequest,
      viam.app.v1.AppOuterClass.DeleteOrganizationInviteResponse> getDeleteOrganizationInviteMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteOrganizationInviteRequest, viam.app.v1.AppOuterClass.DeleteOrganizationInviteResponse> getDeleteOrganizationInviteMethod;
    if ((getDeleteOrganizationInviteMethod = AppServiceGrpc.getDeleteOrganizationInviteMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteOrganizationInviteMethod = AppServiceGrpc.getDeleteOrganizationInviteMethod) == null) {
          AppServiceGrpc.getDeleteOrganizationInviteMethod = getDeleteOrganizationInviteMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DeleteOrganizationInviteRequest, viam.app.v1.AppOuterClass.DeleteOrganizationInviteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrganizationInvite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteOrganizationInviteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteOrganizationInviteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteOrganizationInviteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ResendOrganizationInviteRequest,
      viam.app.v1.AppOuterClass.ResendOrganizationInviteResponse> getResendOrganizationInviteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendOrganizationInvite",
      requestType = viam.app.v1.AppOuterClass.ResendOrganizationInviteRequest.class,
      responseType = viam.app.v1.AppOuterClass.ResendOrganizationInviteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ResendOrganizationInviteRequest,
      viam.app.v1.AppOuterClass.ResendOrganizationInviteResponse> getResendOrganizationInviteMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ResendOrganizationInviteRequest, viam.app.v1.AppOuterClass.ResendOrganizationInviteResponse> getResendOrganizationInviteMethod;
    if ((getResendOrganizationInviteMethod = AppServiceGrpc.getResendOrganizationInviteMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getResendOrganizationInviteMethod = AppServiceGrpc.getResendOrganizationInviteMethod) == null) {
          AppServiceGrpc.getResendOrganizationInviteMethod = getResendOrganizationInviteMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ResendOrganizationInviteRequest, viam.app.v1.AppOuterClass.ResendOrganizationInviteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendOrganizationInvite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ResendOrganizationInviteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ResendOrganizationInviteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getResendOrganizationInviteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.EnableBillingServiceRequest,
      viam.app.v1.AppOuterClass.EnableBillingServiceResponse> getEnableBillingServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableBillingService",
      requestType = viam.app.v1.AppOuterClass.EnableBillingServiceRequest.class,
      responseType = viam.app.v1.AppOuterClass.EnableBillingServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.EnableBillingServiceRequest,
      viam.app.v1.AppOuterClass.EnableBillingServiceResponse> getEnableBillingServiceMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.EnableBillingServiceRequest, viam.app.v1.AppOuterClass.EnableBillingServiceResponse> getEnableBillingServiceMethod;
    if ((getEnableBillingServiceMethod = AppServiceGrpc.getEnableBillingServiceMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getEnableBillingServiceMethod = AppServiceGrpc.getEnableBillingServiceMethod) == null) {
          AppServiceGrpc.getEnableBillingServiceMethod = getEnableBillingServiceMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.EnableBillingServiceRequest, viam.app.v1.AppOuterClass.EnableBillingServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableBillingService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.EnableBillingServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.EnableBillingServiceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEnableBillingServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DisableBillingServiceRequest,
      viam.app.v1.AppOuterClass.DisableBillingServiceResponse> getDisableBillingServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableBillingService",
      requestType = viam.app.v1.AppOuterClass.DisableBillingServiceRequest.class,
      responseType = viam.app.v1.AppOuterClass.DisableBillingServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DisableBillingServiceRequest,
      viam.app.v1.AppOuterClass.DisableBillingServiceResponse> getDisableBillingServiceMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DisableBillingServiceRequest, viam.app.v1.AppOuterClass.DisableBillingServiceResponse> getDisableBillingServiceMethod;
    if ((getDisableBillingServiceMethod = AppServiceGrpc.getDisableBillingServiceMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDisableBillingServiceMethod = AppServiceGrpc.getDisableBillingServiceMethod) == null) {
          AppServiceGrpc.getDisableBillingServiceMethod = getDisableBillingServiceMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DisableBillingServiceRequest, viam.app.v1.AppOuterClass.DisableBillingServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableBillingService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DisableBillingServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DisableBillingServiceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisableBillingServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateBillingServiceRequest,
      viam.app.v1.AppOuterClass.UpdateBillingServiceResponse> getUpdateBillingServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBillingService",
      requestType = viam.app.v1.AppOuterClass.UpdateBillingServiceRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateBillingServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateBillingServiceRequest,
      viam.app.v1.AppOuterClass.UpdateBillingServiceResponse> getUpdateBillingServiceMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateBillingServiceRequest, viam.app.v1.AppOuterClass.UpdateBillingServiceResponse> getUpdateBillingServiceMethod;
    if ((getUpdateBillingServiceMethod = AppServiceGrpc.getUpdateBillingServiceMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateBillingServiceMethod = AppServiceGrpc.getUpdateBillingServiceMethod) == null) {
          AppServiceGrpc.getUpdateBillingServiceMethod = getUpdateBillingServiceMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateBillingServiceRequest, viam.app.v1.AppOuterClass.UpdateBillingServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBillingService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateBillingServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateBillingServiceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateBillingServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetBillingServiceConfigRequest,
      viam.app.v1.AppOuterClass.GetBillingServiceConfigResponse> getGetBillingServiceConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingServiceConfig",
      requestType = viam.app.v1.AppOuterClass.GetBillingServiceConfigRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetBillingServiceConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetBillingServiceConfigRequest,
      viam.app.v1.AppOuterClass.GetBillingServiceConfigResponse> getGetBillingServiceConfigMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetBillingServiceConfigRequest, viam.app.v1.AppOuterClass.GetBillingServiceConfigResponse> getGetBillingServiceConfigMethod;
    if ((getGetBillingServiceConfigMethod = AppServiceGrpc.getGetBillingServiceConfigMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetBillingServiceConfigMethod = AppServiceGrpc.getGetBillingServiceConfigMethod) == null) {
          AppServiceGrpc.getGetBillingServiceConfigMethod = getGetBillingServiceConfigMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetBillingServiceConfigRequest, viam.app.v1.AppOuterClass.GetBillingServiceConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingServiceConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetBillingServiceConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetBillingServiceConfigResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetBillingServiceConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.OrganizationSetSupportEmailRequest,
      viam.app.v1.AppOuterClass.OrganizationSetSupportEmailResponse> getOrganizationSetSupportEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrganizationSetSupportEmail",
      requestType = viam.app.v1.AppOuterClass.OrganizationSetSupportEmailRequest.class,
      responseType = viam.app.v1.AppOuterClass.OrganizationSetSupportEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.OrganizationSetSupportEmailRequest,
      viam.app.v1.AppOuterClass.OrganizationSetSupportEmailResponse> getOrganizationSetSupportEmailMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.OrganizationSetSupportEmailRequest, viam.app.v1.AppOuterClass.OrganizationSetSupportEmailResponse> getOrganizationSetSupportEmailMethod;
    if ((getOrganizationSetSupportEmailMethod = AppServiceGrpc.getOrganizationSetSupportEmailMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getOrganizationSetSupportEmailMethod = AppServiceGrpc.getOrganizationSetSupportEmailMethod) == null) {
          AppServiceGrpc.getOrganizationSetSupportEmailMethod = getOrganizationSetSupportEmailMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.OrganizationSetSupportEmailRequest, viam.app.v1.AppOuterClass.OrganizationSetSupportEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrganizationSetSupportEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.OrganizationSetSupportEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.OrganizationSetSupportEmailResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getOrganizationSetSupportEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.OrganizationGetSupportEmailRequest,
      viam.app.v1.AppOuterClass.OrganizationGetSupportEmailResponse> getOrganizationGetSupportEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrganizationGetSupportEmail",
      requestType = viam.app.v1.AppOuterClass.OrganizationGetSupportEmailRequest.class,
      responseType = viam.app.v1.AppOuterClass.OrganizationGetSupportEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.OrganizationGetSupportEmailRequest,
      viam.app.v1.AppOuterClass.OrganizationGetSupportEmailResponse> getOrganizationGetSupportEmailMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.OrganizationGetSupportEmailRequest, viam.app.v1.AppOuterClass.OrganizationGetSupportEmailResponse> getOrganizationGetSupportEmailMethod;
    if ((getOrganizationGetSupportEmailMethod = AppServiceGrpc.getOrganizationGetSupportEmailMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getOrganizationGetSupportEmailMethod = AppServiceGrpc.getOrganizationGetSupportEmailMethod) == null) {
          AppServiceGrpc.getOrganizationGetSupportEmailMethod = getOrganizationGetSupportEmailMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.OrganizationGetSupportEmailRequest, viam.app.v1.AppOuterClass.OrganizationGetSupportEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrganizationGetSupportEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.OrganizationGetSupportEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.OrganizationGetSupportEmailResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getOrganizationGetSupportEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.OrganizationSetLogoRequest,
      viam.app.v1.AppOuterClass.OrganizationSetLogoResponse> getOrganizationSetLogoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrganizationSetLogo",
      requestType = viam.app.v1.AppOuterClass.OrganizationSetLogoRequest.class,
      responseType = viam.app.v1.AppOuterClass.OrganizationSetLogoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.OrganizationSetLogoRequest,
      viam.app.v1.AppOuterClass.OrganizationSetLogoResponse> getOrganizationSetLogoMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.OrganizationSetLogoRequest, viam.app.v1.AppOuterClass.OrganizationSetLogoResponse> getOrganizationSetLogoMethod;
    if ((getOrganizationSetLogoMethod = AppServiceGrpc.getOrganizationSetLogoMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getOrganizationSetLogoMethod = AppServiceGrpc.getOrganizationSetLogoMethod) == null) {
          AppServiceGrpc.getOrganizationSetLogoMethod = getOrganizationSetLogoMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.OrganizationSetLogoRequest, viam.app.v1.AppOuterClass.OrganizationSetLogoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrganizationSetLogo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.OrganizationSetLogoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.OrganizationSetLogoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getOrganizationSetLogoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.OrganizationGetLogoRequest,
      viam.app.v1.AppOuterClass.OrganizationGetLogoResponse> getOrganizationGetLogoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrganizationGetLogo",
      requestType = viam.app.v1.AppOuterClass.OrganizationGetLogoRequest.class,
      responseType = viam.app.v1.AppOuterClass.OrganizationGetLogoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.OrganizationGetLogoRequest,
      viam.app.v1.AppOuterClass.OrganizationGetLogoResponse> getOrganizationGetLogoMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.OrganizationGetLogoRequest, viam.app.v1.AppOuterClass.OrganizationGetLogoResponse> getOrganizationGetLogoMethod;
    if ((getOrganizationGetLogoMethod = AppServiceGrpc.getOrganizationGetLogoMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getOrganizationGetLogoMethod = AppServiceGrpc.getOrganizationGetLogoMethod) == null) {
          AppServiceGrpc.getOrganizationGetLogoMethod = getOrganizationGetLogoMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.OrganizationGetLogoRequest, viam.app.v1.AppOuterClass.OrganizationGetLogoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrganizationGetLogo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.OrganizationGetLogoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.OrganizationGetLogoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getOrganizationGetLogoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.EnableAuthServiceRequest,
      viam.app.v1.AppOuterClass.EnableAuthServiceResponse> getEnableAuthServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableAuthService",
      requestType = viam.app.v1.AppOuterClass.EnableAuthServiceRequest.class,
      responseType = viam.app.v1.AppOuterClass.EnableAuthServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.EnableAuthServiceRequest,
      viam.app.v1.AppOuterClass.EnableAuthServiceResponse> getEnableAuthServiceMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.EnableAuthServiceRequest, viam.app.v1.AppOuterClass.EnableAuthServiceResponse> getEnableAuthServiceMethod;
    if ((getEnableAuthServiceMethod = AppServiceGrpc.getEnableAuthServiceMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getEnableAuthServiceMethod = AppServiceGrpc.getEnableAuthServiceMethod) == null) {
          AppServiceGrpc.getEnableAuthServiceMethod = getEnableAuthServiceMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.EnableAuthServiceRequest, viam.app.v1.AppOuterClass.EnableAuthServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableAuthService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.EnableAuthServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.EnableAuthServiceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEnableAuthServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DisableAuthServiceRequest,
      viam.app.v1.AppOuterClass.DisableAuthServiceResponse> getDisableAuthServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableAuthService",
      requestType = viam.app.v1.AppOuterClass.DisableAuthServiceRequest.class,
      responseType = viam.app.v1.AppOuterClass.DisableAuthServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DisableAuthServiceRequest,
      viam.app.v1.AppOuterClass.DisableAuthServiceResponse> getDisableAuthServiceMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DisableAuthServiceRequest, viam.app.v1.AppOuterClass.DisableAuthServiceResponse> getDisableAuthServiceMethod;
    if ((getDisableAuthServiceMethod = AppServiceGrpc.getDisableAuthServiceMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDisableAuthServiceMethod = AppServiceGrpc.getDisableAuthServiceMethod) == null) {
          AppServiceGrpc.getDisableAuthServiceMethod = getDisableAuthServiceMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DisableAuthServiceRequest, viam.app.v1.AppOuterClass.DisableAuthServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableAuthService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DisableAuthServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DisableAuthServiceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisableAuthServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateOAuthAppRequest,
      viam.app.v1.AppOuterClass.CreateOAuthAppResponse> getCreateOAuthAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOAuthApp",
      requestType = viam.app.v1.AppOuterClass.CreateOAuthAppRequest.class,
      responseType = viam.app.v1.AppOuterClass.CreateOAuthAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateOAuthAppRequest,
      viam.app.v1.AppOuterClass.CreateOAuthAppResponse> getCreateOAuthAppMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateOAuthAppRequest, viam.app.v1.AppOuterClass.CreateOAuthAppResponse> getCreateOAuthAppMethod;
    if ((getCreateOAuthAppMethod = AppServiceGrpc.getCreateOAuthAppMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateOAuthAppMethod = AppServiceGrpc.getCreateOAuthAppMethod) == null) {
          AppServiceGrpc.getCreateOAuthAppMethod = getCreateOAuthAppMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.CreateOAuthAppRequest, viam.app.v1.AppOuterClass.CreateOAuthAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOAuthApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateOAuthAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateOAuthAppResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateOAuthAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ReadOAuthAppRequest,
      viam.app.v1.AppOuterClass.ReadOAuthAppResponse> getReadOAuthAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadOAuthApp",
      requestType = viam.app.v1.AppOuterClass.ReadOAuthAppRequest.class,
      responseType = viam.app.v1.AppOuterClass.ReadOAuthAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ReadOAuthAppRequest,
      viam.app.v1.AppOuterClass.ReadOAuthAppResponse> getReadOAuthAppMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ReadOAuthAppRequest, viam.app.v1.AppOuterClass.ReadOAuthAppResponse> getReadOAuthAppMethod;
    if ((getReadOAuthAppMethod = AppServiceGrpc.getReadOAuthAppMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getReadOAuthAppMethod = AppServiceGrpc.getReadOAuthAppMethod) == null) {
          AppServiceGrpc.getReadOAuthAppMethod = getReadOAuthAppMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ReadOAuthAppRequest, viam.app.v1.AppOuterClass.ReadOAuthAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadOAuthApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ReadOAuthAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ReadOAuthAppResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getReadOAuthAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOAuthAppRequest,
      viam.app.v1.AppOuterClass.UpdateOAuthAppResponse> getUpdateOAuthAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOAuthApp",
      requestType = viam.app.v1.AppOuterClass.UpdateOAuthAppRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateOAuthAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOAuthAppRequest,
      viam.app.v1.AppOuterClass.UpdateOAuthAppResponse> getUpdateOAuthAppMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateOAuthAppRequest, viam.app.v1.AppOuterClass.UpdateOAuthAppResponse> getUpdateOAuthAppMethod;
    if ((getUpdateOAuthAppMethod = AppServiceGrpc.getUpdateOAuthAppMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateOAuthAppMethod = AppServiceGrpc.getUpdateOAuthAppMethod) == null) {
          AppServiceGrpc.getUpdateOAuthAppMethod = getUpdateOAuthAppMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateOAuthAppRequest, viam.app.v1.AppOuterClass.UpdateOAuthAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOAuthApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateOAuthAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateOAuthAppResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateOAuthAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteOAuthAppRequest,
      viam.app.v1.AppOuterClass.DeleteOAuthAppResponse> getDeleteOAuthAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOAuthApp",
      requestType = viam.app.v1.AppOuterClass.DeleteOAuthAppRequest.class,
      responseType = viam.app.v1.AppOuterClass.DeleteOAuthAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteOAuthAppRequest,
      viam.app.v1.AppOuterClass.DeleteOAuthAppResponse> getDeleteOAuthAppMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteOAuthAppRequest, viam.app.v1.AppOuterClass.DeleteOAuthAppResponse> getDeleteOAuthAppMethod;
    if ((getDeleteOAuthAppMethod = AppServiceGrpc.getDeleteOAuthAppMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteOAuthAppMethod = AppServiceGrpc.getDeleteOAuthAppMethod) == null) {
          AppServiceGrpc.getDeleteOAuthAppMethod = getDeleteOAuthAppMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DeleteOAuthAppRequest, viam.app.v1.AppOuterClass.DeleteOAuthAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOAuthApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteOAuthAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteOAuthAppResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteOAuthAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListOAuthAppsRequest,
      viam.app.v1.AppOuterClass.ListOAuthAppsResponse> getListOAuthAppsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOAuthApps",
      requestType = viam.app.v1.AppOuterClass.ListOAuthAppsRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListOAuthAppsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListOAuthAppsRequest,
      viam.app.v1.AppOuterClass.ListOAuthAppsResponse> getListOAuthAppsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListOAuthAppsRequest, viam.app.v1.AppOuterClass.ListOAuthAppsResponse> getListOAuthAppsMethod;
    if ((getListOAuthAppsMethod = AppServiceGrpc.getListOAuthAppsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListOAuthAppsMethod = AppServiceGrpc.getListOAuthAppsMethod) == null) {
          AppServiceGrpc.getListOAuthAppsMethod = getListOAuthAppsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListOAuthAppsRequest, viam.app.v1.AppOuterClass.ListOAuthAppsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOAuthApps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListOAuthAppsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListOAuthAppsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListOAuthAppsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateLocationRequest,
      viam.app.v1.AppOuterClass.CreateLocationResponse> getCreateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLocation",
      requestType = viam.app.v1.AppOuterClass.CreateLocationRequest.class,
      responseType = viam.app.v1.AppOuterClass.CreateLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateLocationRequest,
      viam.app.v1.AppOuterClass.CreateLocationResponse> getCreateLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateLocationRequest, viam.app.v1.AppOuterClass.CreateLocationResponse> getCreateLocationMethod;
    if ((getCreateLocationMethod = AppServiceGrpc.getCreateLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateLocationMethod = AppServiceGrpc.getCreateLocationMethod) == null) {
          AppServiceGrpc.getCreateLocationMethod = getCreateLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.CreateLocationRequest, viam.app.v1.AppOuterClass.CreateLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetLocationRequest,
      viam.app.v1.AppOuterClass.GetLocationResponse> getGetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocation",
      requestType = viam.app.v1.AppOuterClass.GetLocationRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetLocationRequest,
      viam.app.v1.AppOuterClass.GetLocationResponse> getGetLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetLocationRequest, viam.app.v1.AppOuterClass.GetLocationResponse> getGetLocationMethod;
    if ((getGetLocationMethod = AppServiceGrpc.getGetLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetLocationMethod = AppServiceGrpc.getGetLocationMethod) == null) {
          AppServiceGrpc.getGetLocationMethod = getGetLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetLocationRequest, viam.app.v1.AppOuterClass.GetLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateLocationRequest,
      viam.app.v1.AppOuterClass.UpdateLocationResponse> getUpdateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLocation",
      requestType = viam.app.v1.AppOuterClass.UpdateLocationRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateLocationRequest,
      viam.app.v1.AppOuterClass.UpdateLocationResponse> getUpdateLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateLocationRequest, viam.app.v1.AppOuterClass.UpdateLocationResponse> getUpdateLocationMethod;
    if ((getUpdateLocationMethod = AppServiceGrpc.getUpdateLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateLocationMethod = AppServiceGrpc.getUpdateLocationMethod) == null) {
          AppServiceGrpc.getUpdateLocationMethod = getUpdateLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateLocationRequest, viam.app.v1.AppOuterClass.UpdateLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteLocationRequest,
      viam.app.v1.AppOuterClass.DeleteLocationResponse> getDeleteLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLocation",
      requestType = viam.app.v1.AppOuterClass.DeleteLocationRequest.class,
      responseType = viam.app.v1.AppOuterClass.DeleteLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteLocationRequest,
      viam.app.v1.AppOuterClass.DeleteLocationResponse> getDeleteLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteLocationRequest, viam.app.v1.AppOuterClass.DeleteLocationResponse> getDeleteLocationMethod;
    if ((getDeleteLocationMethod = AppServiceGrpc.getDeleteLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteLocationMethod = AppServiceGrpc.getDeleteLocationMethod) == null) {
          AppServiceGrpc.getDeleteLocationMethod = getDeleteLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DeleteLocationRequest, viam.app.v1.AppOuterClass.DeleteLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetLocationMetadataRequest,
      viam.app.v1.AppOuterClass.GetLocationMetadataResponse> getGetLocationMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocationMetadata",
      requestType = viam.app.v1.AppOuterClass.GetLocationMetadataRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetLocationMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetLocationMetadataRequest,
      viam.app.v1.AppOuterClass.GetLocationMetadataResponse> getGetLocationMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetLocationMetadataRequest, viam.app.v1.AppOuterClass.GetLocationMetadataResponse> getGetLocationMetadataMethod;
    if ((getGetLocationMetadataMethod = AppServiceGrpc.getGetLocationMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetLocationMetadataMethod = AppServiceGrpc.getGetLocationMetadataMethod) == null) {
          AppServiceGrpc.getGetLocationMetadataMethod = getGetLocationMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetLocationMetadataRequest, viam.app.v1.AppOuterClass.GetLocationMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLocationMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetLocationMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetLocationMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetLocationMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateLocationMetadataRequest,
      viam.app.v1.AppOuterClass.UpdateLocationMetadataResponse> getUpdateLocationMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLocationMetadata",
      requestType = viam.app.v1.AppOuterClass.UpdateLocationMetadataRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateLocationMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateLocationMetadataRequest,
      viam.app.v1.AppOuterClass.UpdateLocationMetadataResponse> getUpdateLocationMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateLocationMetadataRequest, viam.app.v1.AppOuterClass.UpdateLocationMetadataResponse> getUpdateLocationMetadataMethod;
    if ((getUpdateLocationMetadataMethod = AppServiceGrpc.getUpdateLocationMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateLocationMetadataMethod = AppServiceGrpc.getUpdateLocationMetadataMethod) == null) {
          AppServiceGrpc.getUpdateLocationMetadataMethod = getUpdateLocationMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateLocationMetadataRequest, viam.app.v1.AppOuterClass.UpdateLocationMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLocationMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateLocationMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateLocationMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateLocationMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListLocationsRequest,
      viam.app.v1.AppOuterClass.ListLocationsResponse> getListLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLocations",
      requestType = viam.app.v1.AppOuterClass.ListLocationsRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListLocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListLocationsRequest,
      viam.app.v1.AppOuterClass.ListLocationsResponse> getListLocationsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListLocationsRequest, viam.app.v1.AppOuterClass.ListLocationsResponse> getListLocationsMethod;
    if ((getListLocationsMethod = AppServiceGrpc.getListLocationsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListLocationsMethod = AppServiceGrpc.getListLocationsMethod) == null) {
          AppServiceGrpc.getListLocationsMethod = getListLocationsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListLocationsRequest, viam.app.v1.AppOuterClass.ListLocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListLocationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ShareLocationRequest,
      viam.app.v1.AppOuterClass.ShareLocationResponse> getShareLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShareLocation",
      requestType = viam.app.v1.AppOuterClass.ShareLocationRequest.class,
      responseType = viam.app.v1.AppOuterClass.ShareLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ShareLocationRequest,
      viam.app.v1.AppOuterClass.ShareLocationResponse> getShareLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ShareLocationRequest, viam.app.v1.AppOuterClass.ShareLocationResponse> getShareLocationMethod;
    if ((getShareLocationMethod = AppServiceGrpc.getShareLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getShareLocationMethod = AppServiceGrpc.getShareLocationMethod) == null) {
          AppServiceGrpc.getShareLocationMethod = getShareLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ShareLocationRequest, viam.app.v1.AppOuterClass.ShareLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShareLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ShareLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ShareLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getShareLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UnshareLocationRequest,
      viam.app.v1.AppOuterClass.UnshareLocationResponse> getUnshareLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnshareLocation",
      requestType = viam.app.v1.AppOuterClass.UnshareLocationRequest.class,
      responseType = viam.app.v1.AppOuterClass.UnshareLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UnshareLocationRequest,
      viam.app.v1.AppOuterClass.UnshareLocationResponse> getUnshareLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UnshareLocationRequest, viam.app.v1.AppOuterClass.UnshareLocationResponse> getUnshareLocationMethod;
    if ((getUnshareLocationMethod = AppServiceGrpc.getUnshareLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUnshareLocationMethod = AppServiceGrpc.getUnshareLocationMethod) == null) {
          AppServiceGrpc.getUnshareLocationMethod = getUnshareLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UnshareLocationRequest, viam.app.v1.AppOuterClass.UnshareLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnshareLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UnshareLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UnshareLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUnshareLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.LocationAuthRequest,
      viam.app.v1.AppOuterClass.LocationAuthResponse> getLocationAuthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LocationAuth",
      requestType = viam.app.v1.AppOuterClass.LocationAuthRequest.class,
      responseType = viam.app.v1.AppOuterClass.LocationAuthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.LocationAuthRequest,
      viam.app.v1.AppOuterClass.LocationAuthResponse> getLocationAuthMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.LocationAuthRequest, viam.app.v1.AppOuterClass.LocationAuthResponse> getLocationAuthMethod;
    if ((getLocationAuthMethod = AppServiceGrpc.getLocationAuthMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getLocationAuthMethod = AppServiceGrpc.getLocationAuthMethod) == null) {
          AppServiceGrpc.getLocationAuthMethod = getLocationAuthMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.LocationAuthRequest, viam.app.v1.AppOuterClass.LocationAuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LocationAuth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.LocationAuthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.LocationAuthResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getLocationAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateLocationSecretRequest,
      viam.app.v1.AppOuterClass.CreateLocationSecretResponse> getCreateLocationSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLocationSecret",
      requestType = viam.app.v1.AppOuterClass.CreateLocationSecretRequest.class,
      responseType = viam.app.v1.AppOuterClass.CreateLocationSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateLocationSecretRequest,
      viam.app.v1.AppOuterClass.CreateLocationSecretResponse> getCreateLocationSecretMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateLocationSecretRequest, viam.app.v1.AppOuterClass.CreateLocationSecretResponse> getCreateLocationSecretMethod;
    if ((getCreateLocationSecretMethod = AppServiceGrpc.getCreateLocationSecretMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateLocationSecretMethod = AppServiceGrpc.getCreateLocationSecretMethod) == null) {
          AppServiceGrpc.getCreateLocationSecretMethod = getCreateLocationSecretMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.CreateLocationSecretRequest, viam.app.v1.AppOuterClass.CreateLocationSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLocationSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateLocationSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateLocationSecretResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateLocationSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteLocationSecretRequest,
      viam.app.v1.AppOuterClass.DeleteLocationSecretResponse> getDeleteLocationSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLocationSecret",
      requestType = viam.app.v1.AppOuterClass.DeleteLocationSecretRequest.class,
      responseType = viam.app.v1.AppOuterClass.DeleteLocationSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteLocationSecretRequest,
      viam.app.v1.AppOuterClass.DeleteLocationSecretResponse> getDeleteLocationSecretMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteLocationSecretRequest, viam.app.v1.AppOuterClass.DeleteLocationSecretResponse> getDeleteLocationSecretMethod;
    if ((getDeleteLocationSecretMethod = AppServiceGrpc.getDeleteLocationSecretMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteLocationSecretMethod = AppServiceGrpc.getDeleteLocationSecretMethod) == null) {
          AppServiceGrpc.getDeleteLocationSecretMethod = getDeleteLocationSecretMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DeleteLocationSecretRequest, viam.app.v1.AppOuterClass.DeleteLocationSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLocationSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteLocationSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteLocationSecretResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteLocationSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotRequest,
      viam.app.v1.AppOuterClass.GetRobotResponse> getGetRobotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobot",
      requestType = viam.app.v1.AppOuterClass.GetRobotRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetRobotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotRequest,
      viam.app.v1.AppOuterClass.GetRobotResponse> getGetRobotMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotRequest, viam.app.v1.AppOuterClass.GetRobotResponse> getGetRobotMethod;
    if ((getGetRobotMethod = AppServiceGrpc.getGetRobotMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotMethod = AppServiceGrpc.getGetRobotMethod) == null) {
          AppServiceGrpc.getGetRobotMethod = getGetRobotMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetRobotRequest, viam.app.v1.AppOuterClass.GetRobotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRobotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotMetadataRequest,
      viam.app.v1.AppOuterClass.GetRobotMetadataResponse> getGetRobotMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotMetadata",
      requestType = viam.app.v1.AppOuterClass.GetRobotMetadataRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetRobotMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotMetadataRequest,
      viam.app.v1.AppOuterClass.GetRobotMetadataResponse> getGetRobotMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotMetadataRequest, viam.app.v1.AppOuterClass.GetRobotMetadataResponse> getGetRobotMetadataMethod;
    if ((getGetRobotMetadataMethod = AppServiceGrpc.getGetRobotMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotMetadataMethod = AppServiceGrpc.getGetRobotMetadataMethod) == null) {
          AppServiceGrpc.getGetRobotMetadataMethod = getGetRobotMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetRobotMetadataRequest, viam.app.v1.AppOuterClass.GetRobotMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRobotMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRobotMetadataRequest,
      viam.app.v1.AppOuterClass.UpdateRobotMetadataResponse> getUpdateRobotMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRobotMetadata",
      requestType = viam.app.v1.AppOuterClass.UpdateRobotMetadataRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateRobotMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRobotMetadataRequest,
      viam.app.v1.AppOuterClass.UpdateRobotMetadataResponse> getUpdateRobotMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRobotMetadataRequest, viam.app.v1.AppOuterClass.UpdateRobotMetadataResponse> getUpdateRobotMetadataMethod;
    if ((getUpdateRobotMetadataMethod = AppServiceGrpc.getUpdateRobotMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateRobotMetadataMethod = AppServiceGrpc.getUpdateRobotMetadataMethod) == null) {
          AppServiceGrpc.getUpdateRobotMetadataMethod = getUpdateRobotMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateRobotMetadataRequest, viam.app.v1.AppOuterClass.UpdateRobotMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRobotMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateRobotMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateRobotMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateRobotMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRoverRentalRobotsRequest,
      viam.app.v1.AppOuterClass.GetRoverRentalRobotsResponse> getGetRoverRentalRobotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoverRentalRobots",
      requestType = viam.app.v1.AppOuterClass.GetRoverRentalRobotsRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetRoverRentalRobotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRoverRentalRobotsRequest,
      viam.app.v1.AppOuterClass.GetRoverRentalRobotsResponse> getGetRoverRentalRobotsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRoverRentalRobotsRequest, viam.app.v1.AppOuterClass.GetRoverRentalRobotsResponse> getGetRoverRentalRobotsMethod;
    if ((getGetRoverRentalRobotsMethod = AppServiceGrpc.getGetRoverRentalRobotsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRoverRentalRobotsMethod = AppServiceGrpc.getGetRoverRentalRobotsMethod) == null) {
          AppServiceGrpc.getGetRoverRentalRobotsMethod = getGetRoverRentalRobotsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetRoverRentalRobotsRequest, viam.app.v1.AppOuterClass.GetRoverRentalRobotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRoverRentalRobots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRoverRentalRobotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRoverRentalRobotsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRoverRentalRobotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartsRequest,
      viam.app.v1.AppOuterClass.GetRobotPartsResponse> getGetRobotPartsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotParts",
      requestType = viam.app.v1.AppOuterClass.GetRobotPartsRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetRobotPartsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartsRequest,
      viam.app.v1.AppOuterClass.GetRobotPartsResponse> getGetRobotPartsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartsRequest, viam.app.v1.AppOuterClass.GetRobotPartsResponse> getGetRobotPartsMethod;
    if ((getGetRobotPartsMethod = AppServiceGrpc.getGetRobotPartsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotPartsMethod = AppServiceGrpc.getGetRobotPartsMethod) == null) {
          AppServiceGrpc.getGetRobotPartsMethod = getGetRobotPartsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetRobotPartsRequest, viam.app.v1.AppOuterClass.GetRobotPartsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotParts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotPartsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotPartsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRobotPartsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartRequest,
      viam.app.v1.AppOuterClass.GetRobotPartResponse> getGetRobotPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotPart",
      requestType = viam.app.v1.AppOuterClass.GetRobotPartRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetRobotPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartRequest,
      viam.app.v1.AppOuterClass.GetRobotPartResponse> getGetRobotPartMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartRequest, viam.app.v1.AppOuterClass.GetRobotPartResponse> getGetRobotPartMethod;
    if ((getGetRobotPartMethod = AppServiceGrpc.getGetRobotPartMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotPartMethod = AppServiceGrpc.getGetRobotPartMethod) == null) {
          AppServiceGrpc.getGetRobotPartMethod = getGetRobotPartMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetRobotPartRequest, viam.app.v1.AppOuterClass.GetRobotPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotPartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRobotPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationRequest,
      viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationResponse> getGetRobotPartByNameAndLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotPartByNameAndLocation",
      requestType = viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationRequest,
      viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationResponse> getGetRobotPartByNameAndLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationRequest, viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationResponse> getGetRobotPartByNameAndLocationMethod;
    if ((getGetRobotPartByNameAndLocationMethod = AppServiceGrpc.getGetRobotPartByNameAndLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotPartByNameAndLocationMethod = AppServiceGrpc.getGetRobotPartByNameAndLocationMethod) == null) {
          AppServiceGrpc.getGetRobotPartByNameAndLocationMethod = getGetRobotPartByNameAndLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationRequest, viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotPartByNameAndLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRobotPartByNameAndLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartLogsRequest,
      viam.app.v1.AppOuterClass.GetRobotPartLogsResponse> getGetRobotPartLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotPartLogs",
      requestType = viam.app.v1.AppOuterClass.GetRobotPartLogsRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetRobotPartLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartLogsRequest,
      viam.app.v1.AppOuterClass.GetRobotPartLogsResponse> getGetRobotPartLogsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartLogsRequest, viam.app.v1.AppOuterClass.GetRobotPartLogsResponse> getGetRobotPartLogsMethod;
    if ((getGetRobotPartLogsMethod = AppServiceGrpc.getGetRobotPartLogsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotPartLogsMethod = AppServiceGrpc.getGetRobotPartLogsMethod) == null) {
          AppServiceGrpc.getGetRobotPartLogsMethod = getGetRobotPartLogsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetRobotPartLogsRequest, viam.app.v1.AppOuterClass.GetRobotPartLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotPartLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotPartLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotPartLogsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRobotPartLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.TailRobotPartLogsRequest,
      viam.app.v1.AppOuterClass.TailRobotPartLogsResponse> getTailRobotPartLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TailRobotPartLogs",
      requestType = viam.app.v1.AppOuterClass.TailRobotPartLogsRequest.class,
      responseType = viam.app.v1.AppOuterClass.TailRobotPartLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.TailRobotPartLogsRequest,
      viam.app.v1.AppOuterClass.TailRobotPartLogsResponse> getTailRobotPartLogsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.TailRobotPartLogsRequest, viam.app.v1.AppOuterClass.TailRobotPartLogsResponse> getTailRobotPartLogsMethod;
    if ((getTailRobotPartLogsMethod = AppServiceGrpc.getTailRobotPartLogsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getTailRobotPartLogsMethod = AppServiceGrpc.getTailRobotPartLogsMethod) == null) {
          AppServiceGrpc.getTailRobotPartLogsMethod = getTailRobotPartLogsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.TailRobotPartLogsRequest, viam.app.v1.AppOuterClass.TailRobotPartLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TailRobotPartLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.TailRobotPartLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.TailRobotPartLogsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTailRobotPartLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartHistoryRequest,
      viam.app.v1.AppOuterClass.GetRobotPartHistoryResponse> getGetRobotPartHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotPartHistory",
      requestType = viam.app.v1.AppOuterClass.GetRobotPartHistoryRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetRobotPartHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartHistoryRequest,
      viam.app.v1.AppOuterClass.GetRobotPartHistoryResponse> getGetRobotPartHistoryMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartHistoryRequest, viam.app.v1.AppOuterClass.GetRobotPartHistoryResponse> getGetRobotPartHistoryMethod;
    if ((getGetRobotPartHistoryMethod = AppServiceGrpc.getGetRobotPartHistoryMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotPartHistoryMethod = AppServiceGrpc.getGetRobotPartHistoryMethod) == null) {
          AppServiceGrpc.getGetRobotPartHistoryMethod = getGetRobotPartHistoryMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetRobotPartHistoryRequest, viam.app.v1.AppOuterClass.GetRobotPartHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotPartHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotPartHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotPartHistoryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRobotPartHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRobotPartRequest,
      viam.app.v1.AppOuterClass.UpdateRobotPartResponse> getUpdateRobotPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRobotPart",
      requestType = viam.app.v1.AppOuterClass.UpdateRobotPartRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateRobotPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRobotPartRequest,
      viam.app.v1.AppOuterClass.UpdateRobotPartResponse> getUpdateRobotPartMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRobotPartRequest, viam.app.v1.AppOuterClass.UpdateRobotPartResponse> getUpdateRobotPartMethod;
    if ((getUpdateRobotPartMethod = AppServiceGrpc.getUpdateRobotPartMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateRobotPartMethod = AppServiceGrpc.getUpdateRobotPartMethod) == null) {
          AppServiceGrpc.getUpdateRobotPartMethod = getUpdateRobotPartMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateRobotPartRequest, viam.app.v1.AppOuterClass.UpdateRobotPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRobotPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateRobotPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateRobotPartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateRobotPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.NewRobotPartRequest,
      viam.app.v1.AppOuterClass.NewRobotPartResponse> getNewRobotPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewRobotPart",
      requestType = viam.app.v1.AppOuterClass.NewRobotPartRequest.class,
      responseType = viam.app.v1.AppOuterClass.NewRobotPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.NewRobotPartRequest,
      viam.app.v1.AppOuterClass.NewRobotPartResponse> getNewRobotPartMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.NewRobotPartRequest, viam.app.v1.AppOuterClass.NewRobotPartResponse> getNewRobotPartMethod;
    if ((getNewRobotPartMethod = AppServiceGrpc.getNewRobotPartMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getNewRobotPartMethod = AppServiceGrpc.getNewRobotPartMethod) == null) {
          AppServiceGrpc.getNewRobotPartMethod = getNewRobotPartMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.NewRobotPartRequest, viam.app.v1.AppOuterClass.NewRobotPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewRobotPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.NewRobotPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.NewRobotPartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getNewRobotPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteRobotPartRequest,
      viam.app.v1.AppOuterClass.DeleteRobotPartResponse> getDeleteRobotPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRobotPart",
      requestType = viam.app.v1.AppOuterClass.DeleteRobotPartRequest.class,
      responseType = viam.app.v1.AppOuterClass.DeleteRobotPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteRobotPartRequest,
      viam.app.v1.AppOuterClass.DeleteRobotPartResponse> getDeleteRobotPartMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteRobotPartRequest, viam.app.v1.AppOuterClass.DeleteRobotPartResponse> getDeleteRobotPartMethod;
    if ((getDeleteRobotPartMethod = AppServiceGrpc.getDeleteRobotPartMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteRobotPartMethod = AppServiceGrpc.getDeleteRobotPartMethod) == null) {
          AppServiceGrpc.getDeleteRobotPartMethod = getDeleteRobotPartMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DeleteRobotPartRequest, viam.app.v1.AppOuterClass.DeleteRobotPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRobotPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteRobotPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteRobotPartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteRobotPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartMetadataRequest,
      viam.app.v1.AppOuterClass.GetRobotPartMetadataResponse> getGetRobotPartMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotPartMetadata",
      requestType = viam.app.v1.AppOuterClass.GetRobotPartMetadataRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetRobotPartMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartMetadataRequest,
      viam.app.v1.AppOuterClass.GetRobotPartMetadataResponse> getGetRobotPartMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotPartMetadataRequest, viam.app.v1.AppOuterClass.GetRobotPartMetadataResponse> getGetRobotPartMetadataMethod;
    if ((getGetRobotPartMetadataMethod = AppServiceGrpc.getGetRobotPartMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotPartMetadataMethod = AppServiceGrpc.getGetRobotPartMetadataMethod) == null) {
          AppServiceGrpc.getGetRobotPartMetadataMethod = getGetRobotPartMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetRobotPartMetadataRequest, viam.app.v1.AppOuterClass.GetRobotPartMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotPartMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotPartMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotPartMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRobotPartMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRobotPartMetadataRequest,
      viam.app.v1.AppOuterClass.UpdateRobotPartMetadataResponse> getUpdateRobotPartMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRobotPartMetadata",
      requestType = viam.app.v1.AppOuterClass.UpdateRobotPartMetadataRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateRobotPartMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRobotPartMetadataRequest,
      viam.app.v1.AppOuterClass.UpdateRobotPartMetadataResponse> getUpdateRobotPartMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRobotPartMetadataRequest, viam.app.v1.AppOuterClass.UpdateRobotPartMetadataResponse> getUpdateRobotPartMetadataMethod;
    if ((getUpdateRobotPartMetadataMethod = AppServiceGrpc.getUpdateRobotPartMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateRobotPartMetadataMethod = AppServiceGrpc.getUpdateRobotPartMetadataMethod) == null) {
          AppServiceGrpc.getUpdateRobotPartMetadataMethod = getUpdateRobotPartMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateRobotPartMetadataRequest, viam.app.v1.AppOuterClass.UpdateRobotPartMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRobotPartMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateRobotPartMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateRobotPartMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateRobotPartMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotAPIKeysRequest,
      viam.app.v1.AppOuterClass.GetRobotAPIKeysResponse> getGetRobotAPIKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotAPIKeys",
      requestType = viam.app.v1.AppOuterClass.GetRobotAPIKeysRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetRobotAPIKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotAPIKeysRequest,
      viam.app.v1.AppOuterClass.GetRobotAPIKeysResponse> getGetRobotAPIKeysMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRobotAPIKeysRequest, viam.app.v1.AppOuterClass.GetRobotAPIKeysResponse> getGetRobotAPIKeysMethod;
    if ((getGetRobotAPIKeysMethod = AppServiceGrpc.getGetRobotAPIKeysMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotAPIKeysMethod = AppServiceGrpc.getGetRobotAPIKeysMethod) == null) {
          AppServiceGrpc.getGetRobotAPIKeysMethod = getGetRobotAPIKeysMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetRobotAPIKeysRequest, viam.app.v1.AppOuterClass.GetRobotAPIKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotAPIKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotAPIKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRobotAPIKeysResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRobotAPIKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.MarkPartAsMainRequest,
      viam.app.v1.AppOuterClass.MarkPartAsMainResponse> getMarkPartAsMainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkPartAsMain",
      requestType = viam.app.v1.AppOuterClass.MarkPartAsMainRequest.class,
      responseType = viam.app.v1.AppOuterClass.MarkPartAsMainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.MarkPartAsMainRequest,
      viam.app.v1.AppOuterClass.MarkPartAsMainResponse> getMarkPartAsMainMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.MarkPartAsMainRequest, viam.app.v1.AppOuterClass.MarkPartAsMainResponse> getMarkPartAsMainMethod;
    if ((getMarkPartAsMainMethod = AppServiceGrpc.getMarkPartAsMainMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getMarkPartAsMainMethod = AppServiceGrpc.getMarkPartAsMainMethod) == null) {
          AppServiceGrpc.getMarkPartAsMainMethod = getMarkPartAsMainMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.MarkPartAsMainRequest, viam.app.v1.AppOuterClass.MarkPartAsMainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkPartAsMain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.MarkPartAsMainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.MarkPartAsMainResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getMarkPartAsMainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.MarkPartForRestartRequest,
      viam.app.v1.AppOuterClass.MarkPartForRestartResponse> getMarkPartForRestartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkPartForRestart",
      requestType = viam.app.v1.AppOuterClass.MarkPartForRestartRequest.class,
      responseType = viam.app.v1.AppOuterClass.MarkPartForRestartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.MarkPartForRestartRequest,
      viam.app.v1.AppOuterClass.MarkPartForRestartResponse> getMarkPartForRestartMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.MarkPartForRestartRequest, viam.app.v1.AppOuterClass.MarkPartForRestartResponse> getMarkPartForRestartMethod;
    if ((getMarkPartForRestartMethod = AppServiceGrpc.getMarkPartForRestartMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getMarkPartForRestartMethod = AppServiceGrpc.getMarkPartForRestartMethod) == null) {
          AppServiceGrpc.getMarkPartForRestartMethod = getMarkPartForRestartMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.MarkPartForRestartRequest, viam.app.v1.AppOuterClass.MarkPartForRestartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkPartForRestart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.MarkPartForRestartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.MarkPartForRestartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getMarkPartForRestartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateRobotPartSecretRequest,
      viam.app.v1.AppOuterClass.CreateRobotPartSecretResponse> getCreateRobotPartSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRobotPartSecret",
      requestType = viam.app.v1.AppOuterClass.CreateRobotPartSecretRequest.class,
      responseType = viam.app.v1.AppOuterClass.CreateRobotPartSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateRobotPartSecretRequest,
      viam.app.v1.AppOuterClass.CreateRobotPartSecretResponse> getCreateRobotPartSecretMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateRobotPartSecretRequest, viam.app.v1.AppOuterClass.CreateRobotPartSecretResponse> getCreateRobotPartSecretMethod;
    if ((getCreateRobotPartSecretMethod = AppServiceGrpc.getCreateRobotPartSecretMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateRobotPartSecretMethod = AppServiceGrpc.getCreateRobotPartSecretMethod) == null) {
          AppServiceGrpc.getCreateRobotPartSecretMethod = getCreateRobotPartSecretMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.CreateRobotPartSecretRequest, viam.app.v1.AppOuterClass.CreateRobotPartSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRobotPartSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateRobotPartSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateRobotPartSecretResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateRobotPartSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteRobotPartSecretRequest,
      viam.app.v1.AppOuterClass.DeleteRobotPartSecretResponse> getDeleteRobotPartSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRobotPartSecret",
      requestType = viam.app.v1.AppOuterClass.DeleteRobotPartSecretRequest.class,
      responseType = viam.app.v1.AppOuterClass.DeleteRobotPartSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteRobotPartSecretRequest,
      viam.app.v1.AppOuterClass.DeleteRobotPartSecretResponse> getDeleteRobotPartSecretMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteRobotPartSecretRequest, viam.app.v1.AppOuterClass.DeleteRobotPartSecretResponse> getDeleteRobotPartSecretMethod;
    if ((getDeleteRobotPartSecretMethod = AppServiceGrpc.getDeleteRobotPartSecretMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteRobotPartSecretMethod = AppServiceGrpc.getDeleteRobotPartSecretMethod) == null) {
          AppServiceGrpc.getDeleteRobotPartSecretMethod = getDeleteRobotPartSecretMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DeleteRobotPartSecretRequest, viam.app.v1.AppOuterClass.DeleteRobotPartSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRobotPartSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteRobotPartSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteRobotPartSecretResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteRobotPartSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListRobotsRequest,
      viam.app.v1.AppOuterClass.ListRobotsResponse> getListRobotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRobots",
      requestType = viam.app.v1.AppOuterClass.ListRobotsRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListRobotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListRobotsRequest,
      viam.app.v1.AppOuterClass.ListRobotsResponse> getListRobotsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListRobotsRequest, viam.app.v1.AppOuterClass.ListRobotsResponse> getListRobotsMethod;
    if ((getListRobotsMethod = AppServiceGrpc.getListRobotsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListRobotsMethod = AppServiceGrpc.getListRobotsMethod) == null) {
          AppServiceGrpc.getListRobotsMethod = getListRobotsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListRobotsRequest, viam.app.v1.AppOuterClass.ListRobotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRobots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListRobotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListRobotsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListRobotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.NewRobotRequest,
      viam.app.v1.AppOuterClass.NewRobotResponse> getNewRobotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewRobot",
      requestType = viam.app.v1.AppOuterClass.NewRobotRequest.class,
      responseType = viam.app.v1.AppOuterClass.NewRobotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.NewRobotRequest,
      viam.app.v1.AppOuterClass.NewRobotResponse> getNewRobotMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.NewRobotRequest, viam.app.v1.AppOuterClass.NewRobotResponse> getNewRobotMethod;
    if ((getNewRobotMethod = AppServiceGrpc.getNewRobotMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getNewRobotMethod = AppServiceGrpc.getNewRobotMethod) == null) {
          AppServiceGrpc.getNewRobotMethod = getNewRobotMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.NewRobotRequest, viam.app.v1.AppOuterClass.NewRobotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewRobot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.NewRobotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.NewRobotResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getNewRobotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRobotRequest,
      viam.app.v1.AppOuterClass.UpdateRobotResponse> getUpdateRobotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRobot",
      requestType = viam.app.v1.AppOuterClass.UpdateRobotRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateRobotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRobotRequest,
      viam.app.v1.AppOuterClass.UpdateRobotResponse> getUpdateRobotMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRobotRequest, viam.app.v1.AppOuterClass.UpdateRobotResponse> getUpdateRobotMethod;
    if ((getUpdateRobotMethod = AppServiceGrpc.getUpdateRobotMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateRobotMethod = AppServiceGrpc.getUpdateRobotMethod) == null) {
          AppServiceGrpc.getUpdateRobotMethod = getUpdateRobotMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateRobotRequest, viam.app.v1.AppOuterClass.UpdateRobotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRobot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateRobotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateRobotResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateRobotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteRobotRequest,
      viam.app.v1.AppOuterClass.DeleteRobotResponse> getDeleteRobotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRobot",
      requestType = viam.app.v1.AppOuterClass.DeleteRobotRequest.class,
      responseType = viam.app.v1.AppOuterClass.DeleteRobotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteRobotRequest,
      viam.app.v1.AppOuterClass.DeleteRobotResponse> getDeleteRobotMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteRobotRequest, viam.app.v1.AppOuterClass.DeleteRobotResponse> getDeleteRobotMethod;
    if ((getDeleteRobotMethod = AppServiceGrpc.getDeleteRobotMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteRobotMethod = AppServiceGrpc.getDeleteRobotMethod) == null) {
          AppServiceGrpc.getDeleteRobotMethod = getDeleteRobotMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DeleteRobotRequest, viam.app.v1.AppOuterClass.DeleteRobotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRobot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteRobotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteRobotResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteRobotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListFragmentsRequest,
      viam.app.v1.AppOuterClass.ListFragmentsResponse> getListFragmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFragments",
      requestType = viam.app.v1.AppOuterClass.ListFragmentsRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListFragmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListFragmentsRequest,
      viam.app.v1.AppOuterClass.ListFragmentsResponse> getListFragmentsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListFragmentsRequest, viam.app.v1.AppOuterClass.ListFragmentsResponse> getListFragmentsMethod;
    if ((getListFragmentsMethod = AppServiceGrpc.getListFragmentsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListFragmentsMethod = AppServiceGrpc.getListFragmentsMethod) == null) {
          AppServiceGrpc.getListFragmentsMethod = getListFragmentsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListFragmentsRequest, viam.app.v1.AppOuterClass.ListFragmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFragments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListFragmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListFragmentsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListFragmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetFragmentRequest,
      viam.app.v1.AppOuterClass.GetFragmentResponse> getGetFragmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFragment",
      requestType = viam.app.v1.AppOuterClass.GetFragmentRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetFragmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetFragmentRequest,
      viam.app.v1.AppOuterClass.GetFragmentResponse> getGetFragmentMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetFragmentRequest, viam.app.v1.AppOuterClass.GetFragmentResponse> getGetFragmentMethod;
    if ((getGetFragmentMethod = AppServiceGrpc.getGetFragmentMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetFragmentMethod = AppServiceGrpc.getGetFragmentMethod) == null) {
          AppServiceGrpc.getGetFragmentMethod = getGetFragmentMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetFragmentRequest, viam.app.v1.AppOuterClass.GetFragmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFragment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetFragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetFragmentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetFragmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateFragmentRequest,
      viam.app.v1.AppOuterClass.CreateFragmentResponse> getCreateFragmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFragment",
      requestType = viam.app.v1.AppOuterClass.CreateFragmentRequest.class,
      responseType = viam.app.v1.AppOuterClass.CreateFragmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateFragmentRequest,
      viam.app.v1.AppOuterClass.CreateFragmentResponse> getCreateFragmentMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateFragmentRequest, viam.app.v1.AppOuterClass.CreateFragmentResponse> getCreateFragmentMethod;
    if ((getCreateFragmentMethod = AppServiceGrpc.getCreateFragmentMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateFragmentMethod = AppServiceGrpc.getCreateFragmentMethod) == null) {
          AppServiceGrpc.getCreateFragmentMethod = getCreateFragmentMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.CreateFragmentRequest, viam.app.v1.AppOuterClass.CreateFragmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFragment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateFragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateFragmentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateFragmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateFragmentRequest,
      viam.app.v1.AppOuterClass.UpdateFragmentResponse> getUpdateFragmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFragment",
      requestType = viam.app.v1.AppOuterClass.UpdateFragmentRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateFragmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateFragmentRequest,
      viam.app.v1.AppOuterClass.UpdateFragmentResponse> getUpdateFragmentMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateFragmentRequest, viam.app.v1.AppOuterClass.UpdateFragmentResponse> getUpdateFragmentMethod;
    if ((getUpdateFragmentMethod = AppServiceGrpc.getUpdateFragmentMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateFragmentMethod = AppServiceGrpc.getUpdateFragmentMethod) == null) {
          AppServiceGrpc.getUpdateFragmentMethod = getUpdateFragmentMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateFragmentRequest, viam.app.v1.AppOuterClass.UpdateFragmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFragment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateFragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateFragmentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateFragmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteFragmentRequest,
      viam.app.v1.AppOuterClass.DeleteFragmentResponse> getDeleteFragmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFragment",
      requestType = viam.app.v1.AppOuterClass.DeleteFragmentRequest.class,
      responseType = viam.app.v1.AppOuterClass.DeleteFragmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteFragmentRequest,
      viam.app.v1.AppOuterClass.DeleteFragmentResponse> getDeleteFragmentMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteFragmentRequest, viam.app.v1.AppOuterClass.DeleteFragmentResponse> getDeleteFragmentMethod;
    if ((getDeleteFragmentMethod = AppServiceGrpc.getDeleteFragmentMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteFragmentMethod = AppServiceGrpc.getDeleteFragmentMethod) == null) {
          AppServiceGrpc.getDeleteFragmentMethod = getDeleteFragmentMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DeleteFragmentRequest, viam.app.v1.AppOuterClass.DeleteFragmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFragment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteFragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteFragmentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteFragmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListNestedFragmentsRequest,
      viam.app.v1.AppOuterClass.ListNestedFragmentsResponse> getListNestedFragmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNestedFragments",
      requestType = viam.app.v1.AppOuterClass.ListNestedFragmentsRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListNestedFragmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListNestedFragmentsRequest,
      viam.app.v1.AppOuterClass.ListNestedFragmentsResponse> getListNestedFragmentsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListNestedFragmentsRequest, viam.app.v1.AppOuterClass.ListNestedFragmentsResponse> getListNestedFragmentsMethod;
    if ((getListNestedFragmentsMethod = AppServiceGrpc.getListNestedFragmentsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListNestedFragmentsMethod = AppServiceGrpc.getListNestedFragmentsMethod) == null) {
          AppServiceGrpc.getListNestedFragmentsMethod = getListNestedFragmentsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListNestedFragmentsRequest, viam.app.v1.AppOuterClass.ListNestedFragmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNestedFragments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListNestedFragmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListNestedFragmentsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListNestedFragmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListMachineFragmentsRequest,
      viam.app.v1.AppOuterClass.ListMachineFragmentsResponse> getListMachineFragmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMachineFragments",
      requestType = viam.app.v1.AppOuterClass.ListMachineFragmentsRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListMachineFragmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListMachineFragmentsRequest,
      viam.app.v1.AppOuterClass.ListMachineFragmentsResponse> getListMachineFragmentsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListMachineFragmentsRequest, viam.app.v1.AppOuterClass.ListMachineFragmentsResponse> getListMachineFragmentsMethod;
    if ((getListMachineFragmentsMethod = AppServiceGrpc.getListMachineFragmentsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListMachineFragmentsMethod = AppServiceGrpc.getListMachineFragmentsMethod) == null) {
          AppServiceGrpc.getListMachineFragmentsMethod = getListMachineFragmentsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListMachineFragmentsRequest, viam.app.v1.AppOuterClass.ListMachineFragmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMachineFragments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListMachineFragmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListMachineFragmentsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListMachineFragmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListMachineSummariesRequest,
      viam.app.v1.AppOuterClass.ListMachineSummariesResponse> getListMachineSummariesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMachineSummaries",
      requestType = viam.app.v1.AppOuterClass.ListMachineSummariesRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListMachineSummariesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListMachineSummariesRequest,
      viam.app.v1.AppOuterClass.ListMachineSummariesResponse> getListMachineSummariesMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListMachineSummariesRequest, viam.app.v1.AppOuterClass.ListMachineSummariesResponse> getListMachineSummariesMethod;
    if ((getListMachineSummariesMethod = AppServiceGrpc.getListMachineSummariesMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListMachineSummariesMethod = AppServiceGrpc.getListMachineSummariesMethod) == null) {
          AppServiceGrpc.getListMachineSummariesMethod = getListMachineSummariesMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListMachineSummariesRequest, viam.app.v1.AppOuterClass.ListMachineSummariesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMachineSummaries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListMachineSummariesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListMachineSummariesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListMachineSummariesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetFragmentHistoryRequest,
      viam.app.v1.AppOuterClass.GetFragmentHistoryResponse> getGetFragmentHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFragmentHistory",
      requestType = viam.app.v1.AppOuterClass.GetFragmentHistoryRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetFragmentHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetFragmentHistoryRequest,
      viam.app.v1.AppOuterClass.GetFragmentHistoryResponse> getGetFragmentHistoryMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetFragmentHistoryRequest, viam.app.v1.AppOuterClass.GetFragmentHistoryResponse> getGetFragmentHistoryMethod;
    if ((getGetFragmentHistoryMethod = AppServiceGrpc.getGetFragmentHistoryMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetFragmentHistoryMethod = AppServiceGrpc.getGetFragmentHistoryMethod) == null) {
          AppServiceGrpc.getGetFragmentHistoryMethod = getGetFragmentHistoryMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetFragmentHistoryRequest, viam.app.v1.AppOuterClass.GetFragmentHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFragmentHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetFragmentHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetFragmentHistoryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetFragmentHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetFragmentUsageRequest,
      viam.app.v1.AppOuterClass.GetFragmentUsageResponse> getGetFragmentUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFragmentUsage",
      requestType = viam.app.v1.AppOuterClass.GetFragmentUsageRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetFragmentUsageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetFragmentUsageRequest,
      viam.app.v1.AppOuterClass.GetFragmentUsageResponse> getGetFragmentUsageMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetFragmentUsageRequest, viam.app.v1.AppOuterClass.GetFragmentUsageResponse> getGetFragmentUsageMethod;
    if ((getGetFragmentUsageMethod = AppServiceGrpc.getGetFragmentUsageMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetFragmentUsageMethod = AppServiceGrpc.getGetFragmentUsageMethod) == null) {
          AppServiceGrpc.getGetFragmentUsageMethod = getGetFragmentUsageMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetFragmentUsageRequest, viam.app.v1.AppOuterClass.GetFragmentUsageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFragmentUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetFragmentUsageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetFragmentUsageResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetFragmentUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.SetFragmentTagRequest,
      viam.app.v1.AppOuterClass.SetFragmentTagResponse> getSetFragmentTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetFragmentTag",
      requestType = viam.app.v1.AppOuterClass.SetFragmentTagRequest.class,
      responseType = viam.app.v1.AppOuterClass.SetFragmentTagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.SetFragmentTagRequest,
      viam.app.v1.AppOuterClass.SetFragmentTagResponse> getSetFragmentTagMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.SetFragmentTagRequest, viam.app.v1.AppOuterClass.SetFragmentTagResponse> getSetFragmentTagMethod;
    if ((getSetFragmentTagMethod = AppServiceGrpc.getSetFragmentTagMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getSetFragmentTagMethod = AppServiceGrpc.getSetFragmentTagMethod) == null) {
          AppServiceGrpc.getSetFragmentTagMethod = getSetFragmentTagMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.SetFragmentTagRequest, viam.app.v1.AppOuterClass.SetFragmentTagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetFragmentTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.SetFragmentTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.SetFragmentTagResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetFragmentTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteFragmentTagRequest,
      viam.app.v1.AppOuterClass.DeleteFragmentTagResponse> getDeleteFragmentTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFragmentTag",
      requestType = viam.app.v1.AppOuterClass.DeleteFragmentTagRequest.class,
      responseType = viam.app.v1.AppOuterClass.DeleteFragmentTagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteFragmentTagRequest,
      viam.app.v1.AppOuterClass.DeleteFragmentTagResponse> getDeleteFragmentTagMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteFragmentTagRequest, viam.app.v1.AppOuterClass.DeleteFragmentTagResponse> getDeleteFragmentTagMethod;
    if ((getDeleteFragmentTagMethod = AppServiceGrpc.getDeleteFragmentTagMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteFragmentTagMethod = AppServiceGrpc.getDeleteFragmentTagMethod) == null) {
          AppServiceGrpc.getDeleteFragmentTagMethod = getDeleteFragmentTagMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DeleteFragmentTagRequest, viam.app.v1.AppOuterClass.DeleteFragmentTagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFragmentTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteFragmentTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteFragmentTagResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteFragmentTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.AddRoleRequest,
      viam.app.v1.AppOuterClass.AddRoleResponse> getAddRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRole",
      requestType = viam.app.v1.AppOuterClass.AddRoleRequest.class,
      responseType = viam.app.v1.AppOuterClass.AddRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.AddRoleRequest,
      viam.app.v1.AppOuterClass.AddRoleResponse> getAddRoleMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.AddRoleRequest, viam.app.v1.AppOuterClass.AddRoleResponse> getAddRoleMethod;
    if ((getAddRoleMethod = AppServiceGrpc.getAddRoleMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getAddRoleMethod = AppServiceGrpc.getAddRoleMethod) == null) {
          AppServiceGrpc.getAddRoleMethod = getAddRoleMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.AddRoleRequest, viam.app.v1.AppOuterClass.AddRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.AddRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.AddRoleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.RemoveRoleRequest,
      viam.app.v1.AppOuterClass.RemoveRoleResponse> getRemoveRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveRole",
      requestType = viam.app.v1.AppOuterClass.RemoveRoleRequest.class,
      responseType = viam.app.v1.AppOuterClass.RemoveRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.RemoveRoleRequest,
      viam.app.v1.AppOuterClass.RemoveRoleResponse> getRemoveRoleMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.RemoveRoleRequest, viam.app.v1.AppOuterClass.RemoveRoleResponse> getRemoveRoleMethod;
    if ((getRemoveRoleMethod = AppServiceGrpc.getRemoveRoleMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getRemoveRoleMethod = AppServiceGrpc.getRemoveRoleMethod) == null) {
          AppServiceGrpc.getRemoveRoleMethod = getRemoveRoleMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.RemoveRoleRequest, viam.app.v1.AppOuterClass.RemoveRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.RemoveRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.RemoveRoleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ChangeRoleRequest,
      viam.app.v1.AppOuterClass.ChangeRoleResponse> getChangeRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeRole",
      requestType = viam.app.v1.AppOuterClass.ChangeRoleRequest.class,
      responseType = viam.app.v1.AppOuterClass.ChangeRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ChangeRoleRequest,
      viam.app.v1.AppOuterClass.ChangeRoleResponse> getChangeRoleMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ChangeRoleRequest, viam.app.v1.AppOuterClass.ChangeRoleResponse> getChangeRoleMethod;
    if ((getChangeRoleMethod = AppServiceGrpc.getChangeRoleMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getChangeRoleMethod = AppServiceGrpc.getChangeRoleMethod) == null) {
          AppServiceGrpc.getChangeRoleMethod = getChangeRoleMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ChangeRoleRequest, viam.app.v1.AppOuterClass.ChangeRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ChangeRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ChangeRoleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getChangeRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListAuthorizationsRequest,
      viam.app.v1.AppOuterClass.ListAuthorizationsResponse> getListAuthorizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAuthorizations",
      requestType = viam.app.v1.AppOuterClass.ListAuthorizationsRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListAuthorizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListAuthorizationsRequest,
      viam.app.v1.AppOuterClass.ListAuthorizationsResponse> getListAuthorizationsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListAuthorizationsRequest, viam.app.v1.AppOuterClass.ListAuthorizationsResponse> getListAuthorizationsMethod;
    if ((getListAuthorizationsMethod = AppServiceGrpc.getListAuthorizationsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListAuthorizationsMethod = AppServiceGrpc.getListAuthorizationsMethod) == null) {
          AppServiceGrpc.getListAuthorizationsMethod = getListAuthorizationsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListAuthorizationsRequest, viam.app.v1.AppOuterClass.ListAuthorizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAuthorizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListAuthorizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListAuthorizationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListAuthorizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CheckPermissionsRequest,
      viam.app.v1.AppOuterClass.CheckPermissionsResponse> getCheckPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckPermissions",
      requestType = viam.app.v1.AppOuterClass.CheckPermissionsRequest.class,
      responseType = viam.app.v1.AppOuterClass.CheckPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CheckPermissionsRequest,
      viam.app.v1.AppOuterClass.CheckPermissionsResponse> getCheckPermissionsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CheckPermissionsRequest, viam.app.v1.AppOuterClass.CheckPermissionsResponse> getCheckPermissionsMethod;
    if ((getCheckPermissionsMethod = AppServiceGrpc.getCheckPermissionsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCheckPermissionsMethod = AppServiceGrpc.getCheckPermissionsMethod) == null) {
          AppServiceGrpc.getCheckPermissionsMethod = getCheckPermissionsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.CheckPermissionsRequest, viam.app.v1.AppOuterClass.CheckPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CheckPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CheckPermissionsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCheckPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRegistryItemRequest,
      viam.app.v1.AppOuterClass.GetRegistryItemResponse> getGetRegistryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegistryItem",
      requestType = viam.app.v1.AppOuterClass.GetRegistryItemRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetRegistryItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRegistryItemRequest,
      viam.app.v1.AppOuterClass.GetRegistryItemResponse> getGetRegistryItemMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetRegistryItemRequest, viam.app.v1.AppOuterClass.GetRegistryItemResponse> getGetRegistryItemMethod;
    if ((getGetRegistryItemMethod = AppServiceGrpc.getGetRegistryItemMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRegistryItemMethod = AppServiceGrpc.getGetRegistryItemMethod) == null) {
          AppServiceGrpc.getGetRegistryItemMethod = getGetRegistryItemMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetRegistryItemRequest, viam.app.v1.AppOuterClass.GetRegistryItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegistryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRegistryItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetRegistryItemResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRegistryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateRegistryItemRequest,
      viam.app.v1.AppOuterClass.CreateRegistryItemResponse> getCreateRegistryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRegistryItem",
      requestType = viam.app.v1.AppOuterClass.CreateRegistryItemRequest.class,
      responseType = viam.app.v1.AppOuterClass.CreateRegistryItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateRegistryItemRequest,
      viam.app.v1.AppOuterClass.CreateRegistryItemResponse> getCreateRegistryItemMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateRegistryItemRequest, viam.app.v1.AppOuterClass.CreateRegistryItemResponse> getCreateRegistryItemMethod;
    if ((getCreateRegistryItemMethod = AppServiceGrpc.getCreateRegistryItemMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateRegistryItemMethod = AppServiceGrpc.getCreateRegistryItemMethod) == null) {
          AppServiceGrpc.getCreateRegistryItemMethod = getCreateRegistryItemMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.CreateRegistryItemRequest, viam.app.v1.AppOuterClass.CreateRegistryItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRegistryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateRegistryItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateRegistryItemResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateRegistryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRegistryItemRequest,
      viam.app.v1.AppOuterClass.UpdateRegistryItemResponse> getUpdateRegistryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRegistryItem",
      requestType = viam.app.v1.AppOuterClass.UpdateRegistryItemRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateRegistryItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRegistryItemRequest,
      viam.app.v1.AppOuterClass.UpdateRegistryItemResponse> getUpdateRegistryItemMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateRegistryItemRequest, viam.app.v1.AppOuterClass.UpdateRegistryItemResponse> getUpdateRegistryItemMethod;
    if ((getUpdateRegistryItemMethod = AppServiceGrpc.getUpdateRegistryItemMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateRegistryItemMethod = AppServiceGrpc.getUpdateRegistryItemMethod) == null) {
          AppServiceGrpc.getUpdateRegistryItemMethod = getUpdateRegistryItemMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateRegistryItemRequest, viam.app.v1.AppOuterClass.UpdateRegistryItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRegistryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateRegistryItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateRegistryItemResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateRegistryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListRegistryItemsRequest,
      viam.app.v1.AppOuterClass.ListRegistryItemsResponse> getListRegistryItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRegistryItems",
      requestType = viam.app.v1.AppOuterClass.ListRegistryItemsRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListRegistryItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListRegistryItemsRequest,
      viam.app.v1.AppOuterClass.ListRegistryItemsResponse> getListRegistryItemsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListRegistryItemsRequest, viam.app.v1.AppOuterClass.ListRegistryItemsResponse> getListRegistryItemsMethod;
    if ((getListRegistryItemsMethod = AppServiceGrpc.getListRegistryItemsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListRegistryItemsMethod = AppServiceGrpc.getListRegistryItemsMethod) == null) {
          AppServiceGrpc.getListRegistryItemsMethod = getListRegistryItemsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListRegistryItemsRequest, viam.app.v1.AppOuterClass.ListRegistryItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRegistryItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListRegistryItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListRegistryItemsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListRegistryItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteRegistryItemRequest,
      viam.app.v1.AppOuterClass.DeleteRegistryItemResponse> getDeleteRegistryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRegistryItem",
      requestType = viam.app.v1.AppOuterClass.DeleteRegistryItemRequest.class,
      responseType = viam.app.v1.AppOuterClass.DeleteRegistryItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteRegistryItemRequest,
      viam.app.v1.AppOuterClass.DeleteRegistryItemResponse> getDeleteRegistryItemMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteRegistryItemRequest, viam.app.v1.AppOuterClass.DeleteRegistryItemResponse> getDeleteRegistryItemMethod;
    if ((getDeleteRegistryItemMethod = AppServiceGrpc.getDeleteRegistryItemMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteRegistryItemMethod = AppServiceGrpc.getDeleteRegistryItemMethod) == null) {
          AppServiceGrpc.getDeleteRegistryItemMethod = getDeleteRegistryItemMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DeleteRegistryItemRequest, viam.app.v1.AppOuterClass.DeleteRegistryItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRegistryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteRegistryItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteRegistryItemResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteRegistryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.RenameRegistryItemRequest,
      viam.app.v1.AppOuterClass.RenameRegistryItemResponse> getRenameRegistryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenameRegistryItem",
      requestType = viam.app.v1.AppOuterClass.RenameRegistryItemRequest.class,
      responseType = viam.app.v1.AppOuterClass.RenameRegistryItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.RenameRegistryItemRequest,
      viam.app.v1.AppOuterClass.RenameRegistryItemResponse> getRenameRegistryItemMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.RenameRegistryItemRequest, viam.app.v1.AppOuterClass.RenameRegistryItemResponse> getRenameRegistryItemMethod;
    if ((getRenameRegistryItemMethod = AppServiceGrpc.getRenameRegistryItemMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getRenameRegistryItemMethod = AppServiceGrpc.getRenameRegistryItemMethod) == null) {
          AppServiceGrpc.getRenameRegistryItemMethod = getRenameRegistryItemMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.RenameRegistryItemRequest, viam.app.v1.AppOuterClass.RenameRegistryItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenameRegistryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.RenameRegistryItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.RenameRegistryItemResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRenameRegistryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.TransferRegistryItemRequest,
      viam.app.v1.AppOuterClass.TransferRegistryItemResponse> getTransferRegistryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferRegistryItem",
      requestType = viam.app.v1.AppOuterClass.TransferRegistryItemRequest.class,
      responseType = viam.app.v1.AppOuterClass.TransferRegistryItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.TransferRegistryItemRequest,
      viam.app.v1.AppOuterClass.TransferRegistryItemResponse> getTransferRegistryItemMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.TransferRegistryItemRequest, viam.app.v1.AppOuterClass.TransferRegistryItemResponse> getTransferRegistryItemMethod;
    if ((getTransferRegistryItemMethod = AppServiceGrpc.getTransferRegistryItemMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getTransferRegistryItemMethod = AppServiceGrpc.getTransferRegistryItemMethod) == null) {
          AppServiceGrpc.getTransferRegistryItemMethod = getTransferRegistryItemMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.TransferRegistryItemRequest, viam.app.v1.AppOuterClass.TransferRegistryItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferRegistryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.TransferRegistryItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.TransferRegistryItemResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTransferRegistryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateModuleRequest,
      viam.app.v1.AppOuterClass.CreateModuleResponse> getCreateModuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateModule",
      requestType = viam.app.v1.AppOuterClass.CreateModuleRequest.class,
      responseType = viam.app.v1.AppOuterClass.CreateModuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateModuleRequest,
      viam.app.v1.AppOuterClass.CreateModuleResponse> getCreateModuleMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateModuleRequest, viam.app.v1.AppOuterClass.CreateModuleResponse> getCreateModuleMethod;
    if ((getCreateModuleMethod = AppServiceGrpc.getCreateModuleMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateModuleMethod = AppServiceGrpc.getCreateModuleMethod) == null) {
          AppServiceGrpc.getCreateModuleMethod = getCreateModuleMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.CreateModuleRequest, viam.app.v1.AppOuterClass.CreateModuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateModule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateModuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateModuleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateModuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateModuleRequest,
      viam.app.v1.AppOuterClass.UpdateModuleResponse> getUpdateModuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateModule",
      requestType = viam.app.v1.AppOuterClass.UpdateModuleRequest.class,
      responseType = viam.app.v1.AppOuterClass.UpdateModuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateModuleRequest,
      viam.app.v1.AppOuterClass.UpdateModuleResponse> getUpdateModuleMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UpdateModuleRequest, viam.app.v1.AppOuterClass.UpdateModuleResponse> getUpdateModuleMethod;
    if ((getUpdateModuleMethod = AppServiceGrpc.getUpdateModuleMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateModuleMethod = AppServiceGrpc.getUpdateModuleMethod) == null) {
          AppServiceGrpc.getUpdateModuleMethod = getUpdateModuleMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UpdateModuleRequest, viam.app.v1.AppOuterClass.UpdateModuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateModule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateModuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UpdateModuleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateModuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UploadModuleFileRequest,
      viam.app.v1.AppOuterClass.UploadModuleFileResponse> getUploadModuleFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadModuleFile",
      requestType = viam.app.v1.AppOuterClass.UploadModuleFileRequest.class,
      responseType = viam.app.v1.AppOuterClass.UploadModuleFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UploadModuleFileRequest,
      viam.app.v1.AppOuterClass.UploadModuleFileResponse> getUploadModuleFileMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.UploadModuleFileRequest, viam.app.v1.AppOuterClass.UploadModuleFileResponse> getUploadModuleFileMethod;
    if ((getUploadModuleFileMethod = AppServiceGrpc.getUploadModuleFileMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUploadModuleFileMethod = AppServiceGrpc.getUploadModuleFileMethod) == null) {
          AppServiceGrpc.getUploadModuleFileMethod = getUploadModuleFileMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.UploadModuleFileRequest, viam.app.v1.AppOuterClass.UploadModuleFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadModuleFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UploadModuleFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.UploadModuleFileResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUploadModuleFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetModuleRequest,
      viam.app.v1.AppOuterClass.GetModuleResponse> getGetModuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModule",
      requestType = viam.app.v1.AppOuterClass.GetModuleRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetModuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetModuleRequest,
      viam.app.v1.AppOuterClass.GetModuleResponse> getGetModuleMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetModuleRequest, viam.app.v1.AppOuterClass.GetModuleResponse> getGetModuleMethod;
    if ((getGetModuleMethod = AppServiceGrpc.getGetModuleMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetModuleMethod = AppServiceGrpc.getGetModuleMethod) == null) {
          AppServiceGrpc.getGetModuleMethod = getGetModuleMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetModuleRequest, viam.app.v1.AppOuterClass.GetModuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetModuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetModuleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetModuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListModulesRequest,
      viam.app.v1.AppOuterClass.ListModulesResponse> getListModulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModules",
      requestType = viam.app.v1.AppOuterClass.ListModulesRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListModulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListModulesRequest,
      viam.app.v1.AppOuterClass.ListModulesResponse> getListModulesMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListModulesRequest, viam.app.v1.AppOuterClass.ListModulesResponse> getListModulesMethod;
    if ((getListModulesMethod = AppServiceGrpc.getListModulesMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListModulesMethod = AppServiceGrpc.getListModulesMethod) == null) {
          AppServiceGrpc.getListModulesMethod = getListModulesMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListModulesRequest, viam.app.v1.AppOuterClass.ListModulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListModulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListModulesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListModulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateKeyRequest,
      viam.app.v1.AppOuterClass.CreateKeyResponse> getCreateKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateKey",
      requestType = viam.app.v1.AppOuterClass.CreateKeyRequest.class,
      responseType = viam.app.v1.AppOuterClass.CreateKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateKeyRequest,
      viam.app.v1.AppOuterClass.CreateKeyResponse> getCreateKeyMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateKeyRequest, viam.app.v1.AppOuterClass.CreateKeyResponse> getCreateKeyMethod;
    if ((getCreateKeyMethod = AppServiceGrpc.getCreateKeyMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateKeyMethod = AppServiceGrpc.getCreateKeyMethod) == null) {
          AppServiceGrpc.getCreateKeyMethod = getCreateKeyMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.CreateKeyRequest, viam.app.v1.AppOuterClass.CreateKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateKeyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteKeyRequest,
      viam.app.v1.AppOuterClass.DeleteKeyResponse> getDeleteKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteKey",
      requestType = viam.app.v1.AppOuterClass.DeleteKeyRequest.class,
      responseType = viam.app.v1.AppOuterClass.DeleteKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteKeyRequest,
      viam.app.v1.AppOuterClass.DeleteKeyResponse> getDeleteKeyMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.DeleteKeyRequest, viam.app.v1.AppOuterClass.DeleteKeyResponse> getDeleteKeyMethod;
    if ((getDeleteKeyMethod = AppServiceGrpc.getDeleteKeyMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteKeyMethod = AppServiceGrpc.getDeleteKeyMethod) == null) {
          AppServiceGrpc.getDeleteKeyMethod = getDeleteKeyMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.DeleteKeyRequest, viam.app.v1.AppOuterClass.DeleteKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.DeleteKeyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListKeysRequest,
      viam.app.v1.AppOuterClass.ListKeysResponse> getListKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListKeys",
      requestType = viam.app.v1.AppOuterClass.ListKeysRequest.class,
      responseType = viam.app.v1.AppOuterClass.ListKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListKeysRequest,
      viam.app.v1.AppOuterClass.ListKeysResponse> getListKeysMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.ListKeysRequest, viam.app.v1.AppOuterClass.ListKeysResponse> getListKeysMethod;
    if ((getListKeysMethod = AppServiceGrpc.getListKeysMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListKeysMethod = AppServiceGrpc.getListKeysMethod) == null) {
          AppServiceGrpc.getListKeysMethod = getListKeysMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.ListKeysRequest, viam.app.v1.AppOuterClass.ListKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.ListKeysResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.RenameKeyRequest,
      viam.app.v1.AppOuterClass.RenameKeyResponse> getRenameKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenameKey",
      requestType = viam.app.v1.AppOuterClass.RenameKeyRequest.class,
      responseType = viam.app.v1.AppOuterClass.RenameKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.RenameKeyRequest,
      viam.app.v1.AppOuterClass.RenameKeyResponse> getRenameKeyMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.RenameKeyRequest, viam.app.v1.AppOuterClass.RenameKeyResponse> getRenameKeyMethod;
    if ((getRenameKeyMethod = AppServiceGrpc.getRenameKeyMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getRenameKeyMethod = AppServiceGrpc.getRenameKeyMethod) == null) {
          AppServiceGrpc.getRenameKeyMethod = getRenameKeyMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.RenameKeyRequest, viam.app.v1.AppOuterClass.RenameKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenameKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.RenameKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.RenameKeyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRenameKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.RotateKeyRequest,
      viam.app.v1.AppOuterClass.RotateKeyResponse> getRotateKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RotateKey",
      requestType = viam.app.v1.AppOuterClass.RotateKeyRequest.class,
      responseType = viam.app.v1.AppOuterClass.RotateKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.RotateKeyRequest,
      viam.app.v1.AppOuterClass.RotateKeyResponse> getRotateKeyMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.RotateKeyRequest, viam.app.v1.AppOuterClass.RotateKeyResponse> getRotateKeyMethod;
    if ((getRotateKeyMethod = AppServiceGrpc.getRotateKeyMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getRotateKeyMethod = AppServiceGrpc.getRotateKeyMethod) == null) {
          AppServiceGrpc.getRotateKeyMethod = getRotateKeyMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.RotateKeyRequest, viam.app.v1.AppOuterClass.RotateKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RotateKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.RotateKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.RotateKeyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRotateKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsRequest,
      viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsResponse> getCreateKeyFromExistingKeyAuthorizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateKeyFromExistingKeyAuthorizations",
      requestType = viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsRequest.class,
      responseType = viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsRequest,
      viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsResponse> getCreateKeyFromExistingKeyAuthorizationsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsRequest, viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsResponse> getCreateKeyFromExistingKeyAuthorizationsMethod;
    if ((getCreateKeyFromExistingKeyAuthorizationsMethod = AppServiceGrpc.getCreateKeyFromExistingKeyAuthorizationsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateKeyFromExistingKeyAuthorizationsMethod = AppServiceGrpc.getCreateKeyFromExistingKeyAuthorizationsMethod) == null) {
          AppServiceGrpc.getCreateKeyFromExistingKeyAuthorizationsMethod = getCreateKeyFromExistingKeyAuthorizationsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsRequest, viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateKeyFromExistingKeyAuthorizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateKeyFromExistingKeyAuthorizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetAppContentRequest,
      viam.app.v1.AppOuterClass.GetAppContentResponse> getGetAppContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppContent",
      requestType = viam.app.v1.AppOuterClass.GetAppContentRequest.class,
      responseType = viam.app.v1.AppOuterClass.GetAppContentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetAppContentRequest,
      viam.app.v1.AppOuterClass.GetAppContentResponse> getGetAppContentMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.AppOuterClass.GetAppContentRequest, viam.app.v1.AppOuterClass.GetAppContentResponse> getGetAppContentMethod;
    if ((getGetAppContentMethod = AppServiceGrpc.getGetAppContentMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetAppContentMethod = AppServiceGrpc.getGetAppContentMethod) == null) {
          AppServiceGrpc.getGetAppContentMethod = getGetAppContentMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.AppOuterClass.GetAppContentRequest, viam.app.v1.AppOuterClass.GetAppContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetAppContentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.AppOuterClass.GetAppContentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetAppContentMethod;
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
   * <pre>
   * Users
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get the id of the user with the email
     * </pre>
     */
    default void getUserIDByEmail(viam.app.v1.AppOuterClass.GetUserIDByEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetUserIDByEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserIDByEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new organization
     * </pre>
     */
    default void createOrganization(viam.app.v1.AppOuterClass.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List organizations
     * </pre>
     */
    default void listOrganizations(viam.app.v1.AppOuterClass.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListOrganizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all organizations that have access to a location.
     * </pre>
     */
    default void getOrganizationsWithAccessToLocation(viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationsWithAccessToLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List the organizations a user belongs to
     * </pre>
     */
    default void listOrganizationsByUser(viam.app.v1.AppOuterClass.ListOrganizationsByUserRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListOrganizationsByUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationsByUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search organizations by a couple fields
     * </pre>
     */
    default void searchOrganizations(viam.app.v1.AppOuterClass.SearchOrganizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.SearchOrganizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchOrganizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an organization
     * </pre>
     */
    default void getOrganization(viam.app.v1.AppOuterClass.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks for namespace availablity throughout all orgs.
     * </pre>
     */
    default void getOrganizationNamespaceAvailability(viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationNamespaceAvailabilityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an organization
     * </pre>
     */
    default void updateOrganization(viam.app.v1.AppOuterClass.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an organization's namespace if it's already been set.
     * </pre>
     */
    default void updateOrganizationNamespace(viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationNamespaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an organization
     * </pre>
     */
    default void deleteOrganization(viam.app.v1.AppOuterClass.DeleteOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for an organization
     * </pre>
     */
    default void getOrganizationMetadata(viam.app.v1.AppOuterClass.GetOrganizationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetOrganizationMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for an organization
     * </pre>
     */
    default void updateOrganizationMetadata(viam.app.v1.AppOuterClass.UpdateOrganizationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOrganizationMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all members of an organization and all invited members to the organization.
     * </pre>
     */
    default void listOrganizationMembers(viam.app.v1.AppOuterClass.ListOrganizationMembersRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListOrganizationMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an organization invite to an organization
     * </pre>
     */
    default void createOrganizationInvite(viam.app.v1.AppOuterClass.CreateOrganizationInviteRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateOrganizationInviteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationInviteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the authorizations attached to an organization invite
     * </pre>
     */
    default void updateOrganizationInviteAuthorizations(viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationInviteAuthorizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an organization member from an organization
     * </pre>
     */
    default void deleteOrganizationMember(viam.app.v1.AppOuterClass.DeleteOrganizationMemberRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteOrganizationMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOrganizationMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an organization invite
     * </pre>
     */
    default void deleteOrganizationInvite(viam.app.v1.AppOuterClass.DeleteOrganizationInviteRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteOrganizationInviteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOrganizationInviteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resend an organization invite
     * </pre>
     */
    default void resendOrganizationInvite(viam.app.v1.AppOuterClass.ResendOrganizationInviteRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ResendOrganizationInviteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendOrganizationInviteMethod(), responseObserver);
    }

    /**
     */
    default void enableBillingService(viam.app.v1.AppOuterClass.EnableBillingServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.EnableBillingServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableBillingServiceMethod(), responseObserver);
    }

    /**
     */
    default void disableBillingService(viam.app.v1.AppOuterClass.DisableBillingServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DisableBillingServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableBillingServiceMethod(), responseObserver);
    }

    /**
     */
    default void updateBillingService(viam.app.v1.AppOuterClass.UpdateBillingServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateBillingServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBillingServiceMethod(), responseObserver);
    }

    /**
     */
    default void getBillingServiceConfig(viam.app.v1.AppOuterClass.GetBillingServiceConfigRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetBillingServiceConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingServiceConfigMethod(), responseObserver);
    }

    /**
     */
    default void organizationSetSupportEmail(viam.app.v1.AppOuterClass.OrganizationSetSupportEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.OrganizationSetSupportEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrganizationSetSupportEmailMethod(), responseObserver);
    }

    /**
     */
    default void organizationGetSupportEmail(viam.app.v1.AppOuterClass.OrganizationGetSupportEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.OrganizationGetSupportEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrganizationGetSupportEmailMethod(), responseObserver);
    }

    /**
     */
    default void organizationSetLogo(viam.app.v1.AppOuterClass.OrganizationSetLogoRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.OrganizationSetLogoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrganizationSetLogoMethod(), responseObserver);
    }

    /**
     */
    default void organizationGetLogo(viam.app.v1.AppOuterClass.OrganizationGetLogoRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.OrganizationGetLogoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrganizationGetLogoMethod(), responseObserver);
    }

    /**
     */
    default void enableAuthService(viam.app.v1.AppOuterClass.EnableAuthServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.EnableAuthServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableAuthServiceMethod(), responseObserver);
    }

    /**
     */
    default void disableAuthService(viam.app.v1.AppOuterClass.DisableAuthServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DisableAuthServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableAuthServiceMethod(), responseObserver);
    }

    /**
     */
    default void createOAuthApp(viam.app.v1.AppOuterClass.CreateOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateOAuthAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOAuthAppMethod(), responseObserver);
    }

    /**
     */
    default void readOAuthApp(viam.app.v1.AppOuterClass.ReadOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ReadOAuthAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadOAuthAppMethod(), responseObserver);
    }

    /**
     */
    default void updateOAuthApp(viam.app.v1.AppOuterClass.UpdateOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOAuthAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOAuthAppMethod(), responseObserver);
    }

    /**
     */
    default void deleteOAuthApp(viam.app.v1.AppOuterClass.DeleteOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteOAuthAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOAuthAppMethod(), responseObserver);
    }

    /**
     */
    default void listOAuthApps(viam.app.v1.AppOuterClass.ListOAuthAppsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListOAuthAppsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOAuthAppsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a location
     * </pre>
     */
    default void createLocation(viam.app.v1.AppOuterClass.CreateLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a location
     * </pre>
     */
    default void getLocation(viam.app.v1.AppOuterClass.GetLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a location
     * </pre>
     */
    default void updateLocation(viam.app.v1.AppOuterClass.UpdateLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a location
     * </pre>
     */
    default void deleteLocation(viam.app.v1.AppOuterClass.DeleteLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for a location
     * </pre>
     */
    default void getLocationMetadata(viam.app.v1.AppOuterClass.GetLocationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetLocationMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for a location
     * </pre>
     */
    default void updateLocationMetadata(viam.app.v1.AppOuterClass.UpdateLocationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateLocationMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLocationMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a list of locations
     * </pre>
     */
    default void listLocations(viam.app.v1.AppOuterClass.ListLocationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListLocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLocationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Share a location with an organization
     * </pre>
     */
    default void shareLocation(viam.app.v1.AppOuterClass.ShareLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ShareLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShareLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop sharing a location with an organization
     * </pre>
     */
    default void unshareLocation(viam.app.v1.AppOuterClass.UnshareLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UnshareLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnshareLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a location's authorization secrets
     * </pre>
     */
    default void locationAuth(viam.app.v1.AppOuterClass.LocationAuthRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.LocationAuthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLocationAuthMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Location.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    default void createLocationSecret(viam.app.v1.AppOuterClass.CreateLocationSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateLocationSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLocationSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a Secret from the Location.
     * </pre>
     */
    default void deleteLocationSecret(viam.app.v1.AppOuterClass.DeleteLocationSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteLocationSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLocationSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot by ID
     * </pre>
     */
    default void getRobot(viam.app.v1.AppOuterClass.GetRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for a robot
     * </pre>
     */
    default void getRobotMetadata(viam.app.v1.AppOuterClass.GetRobotMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot
     * </pre>
     */
    default void updateRobotMetadata(viam.app.v1.AppOuterClass.UpdateRobotMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRobotMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRobotMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get Rover Rental Location Robots
     * </pre>
     */
    default void getRoverRentalRobots(viam.app.v1.AppOuterClass.GetRoverRentalRobotsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRoverRentalRobotsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoverRentalRobotsMethod(), responseObserver);
    }

    /**
     */
    default void getRobotParts(viam.app.v1.AppOuterClass.GetRobotPartsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot part by ID
     * </pre>
     */
    default void getRobotPart(viam.app.v1.AppOuterClass.GetRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot part by name and location
     * </pre>
     */
    default void getRobotPartByNameAndLocation(viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartByNameAndLocationMethod(), responseObserver);
    }

    /**
     */
    default void getRobotPartLogs(viam.app.v1.AppOuterClass.GetRobotPartLogsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartLogsMethod(), responseObserver);
    }

    /**
     */
    default void tailRobotPartLogs(viam.app.v1.AppOuterClass.TailRobotPartLogsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.TailRobotPartLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTailRobotPartLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot part histy by ID
     * </pre>
     */
    default void getRobotPartHistory(viam.app.v1.AppOuterClass.GetRobotPartHistoryRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a robot
     * </pre>
     */
    default void updateRobotPart(viam.app.v1.AppOuterClass.UpdateRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRobotPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRobotPartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new robot part
     * </pre>
     */
    default void newRobotPart(viam.app.v1.AppOuterClass.NewRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.NewRobotPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewRobotPartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a robot part
     * </pre>
     */
    default void deleteRobotPart(viam.app.v1.AppOuterClass.DeleteRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteRobotPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRobotPartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for a robot part
     * </pre>
     */
    default void getRobotPartMetadata(viam.app.v1.AppOuterClass.GetRobotPartMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot part
     * </pre>
     */
    default void updateRobotPartMetadata(viam.app.v1.AppOuterClass.UpdateRobotPartMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRobotPartMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRobotPartMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the Robot API Keys for the robot
     * </pre>
     */
    default void getRobotAPIKeys(viam.app.v1.AppOuterClass.GetRobotAPIKeysRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotAPIKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotAPIKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Marks the given part as the main part, and all the others as not
     * </pre>
     */
    default void markPartAsMain(viam.app.v1.AppOuterClass.MarkPartAsMainRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.MarkPartAsMainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkPartAsMainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Marks part for restart. Once the robot part checks-in with the app the flag
     * is reset on the robot part. Calling this multiple times before a robot part
     * checks-in has no affect.
     * Note: This API may be removed in the near future.
     * TODO(APP-388): Remove
     * </pre>
     */
    default void markPartForRestart(viam.app.v1.AppOuterClass.MarkPartForRestartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.MarkPartForRestartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkPartForRestartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Robot Part.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    default void createRobotPartSecret(viam.app.v1.AppOuterClass.CreateRobotPartSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateRobotPartSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRobotPartSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a Secret from the RobotPart.
     * </pre>
     */
    default void deleteRobotPartSecret(viam.app.v1.AppOuterClass.DeleteRobotPartSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteRobotPartSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRobotPartSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a list of robots
     * </pre>
     */
    default void listRobots(viam.app.v1.AppOuterClass.ListRobotsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListRobotsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRobotsMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewRobot creates a new robot
     * </pre>
     */
    default void newRobot(viam.app.v1.AppOuterClass.NewRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.NewRobotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewRobotMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRobot updates a robot
     * </pre>
     */
    default void updateRobot(viam.app.v1.AppOuterClass.UpdateRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRobotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRobotMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRobot deletes a robot
     * </pre>
     */
    default void deleteRobot(viam.app.v1.AppOuterClass.DeleteRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteRobotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRobotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a list of fragments
     * </pre>
     */
    default void listFragments(viam.app.v1.AppOuterClass.ListFragmentsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListFragmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFragmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a single fragment
     * </pre>
     */
    default void getFragment(viam.app.v1.AppOuterClass.GetFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetFragmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFragmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a fragment
     * </pre>
     */
    default void createFragment(viam.app.v1.AppOuterClass.CreateFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateFragmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFragmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a fragment
     * </pre>
     */
    default void updateFragment(viam.app.v1.AppOuterClass.UpdateFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateFragmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFragmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a fragment
     * </pre>
     */
    default void deleteFragment(viam.app.v1.AppOuterClass.DeleteFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteFragmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFragmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * List nested fragments for a fragment
     * </pre>
     */
    default void listNestedFragments(viam.app.v1.AppOuterClass.ListNestedFragmentsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListNestedFragmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNestedFragmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets top level and nested fragments for a machine, as well as any other specified fragment ids
     * </pre>
     */
    default void listMachineFragments(viam.app.v1.AppOuterClass.ListMachineFragmentsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListMachineFragmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMachineFragmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all machines and their corresponding machine dashboard information
     * </pre>
     */
    default void listMachineSummaries(viam.app.v1.AppOuterClass.ListMachineSummariesRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListMachineSummariesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMachineSummariesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets fragment history
     * </pre>
     */
    default void getFragmentHistory(viam.app.v1.AppOuterClass.GetFragmentHistoryRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetFragmentHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFragmentHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets usage for a fragment across versions
     * </pre>
     */
    default void getFragmentUsage(viam.app.v1.AppOuterClass.GetFragmentUsageRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetFragmentUsageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFragmentUsageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets a fragment tag to a revision
     * </pre>
     */
    default void setFragmentTag(viam.app.v1.AppOuterClass.SetFragmentTagRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.SetFragmentTagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetFragmentTagMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a fragment tag
     * </pre>
     */
    default void deleteFragmentTag(viam.app.v1.AppOuterClass.DeleteFragmentTagRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteFragmentTagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFragmentTagMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an IdentityAuthorization
     * </pre>
     */
    default void addRole(viam.app.v1.AppOuterClass.AddRoleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.AddRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an IdentityAuthorization
     * </pre>
     */
    default void removeRole(viam.app.v1.AppOuterClass.RemoveRoleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.RemoveRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Changes an IdentityAuthorization to a new IdentityAuthorization
     * </pre>
     */
    default void changeRole(viam.app.v1.AppOuterClass.ChangeRoleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ChangeRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all authorization roles for a given resource
     * </pre>
     */
    default void listAuthorizations(viam.app.v1.AppOuterClass.ListAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAuthorizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validates a permission for the current user
     * </pre>
     */
    default void checkPermissions(viam.app.v1.AppOuterClass.CheckPermissionsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CheckPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckPermissionsMethod(), responseObserver);
    }

    /**
     */
    default void getRegistryItem(viam.app.v1.AppOuterClass.GetRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRegistryItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegistryItemMethod(), responseObserver);
    }

    /**
     */
    default void createRegistryItem(viam.app.v1.AppOuterClass.CreateRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateRegistryItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRegistryItemMethod(), responseObserver);
    }

    /**
     */
    default void updateRegistryItem(viam.app.v1.AppOuterClass.UpdateRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRegistryItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRegistryItemMethod(), responseObserver);
    }

    /**
     */
    default void listRegistryItems(viam.app.v1.AppOuterClass.ListRegistryItemsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListRegistryItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRegistryItemsMethod(), responseObserver);
    }

    /**
     */
    default void deleteRegistryItem(viam.app.v1.AppOuterClass.DeleteRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteRegistryItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRegistryItemMethod(), responseObserver);
    }

    /**
     */
    default void renameRegistryItem(viam.app.v1.AppOuterClass.RenameRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.RenameRegistryItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenameRegistryItemMethod(), responseObserver);
    }

    /**
     */
    default void transferRegistryItem(viam.app.v1.AppOuterClass.TransferRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.TransferRegistryItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferRegistryItemMethod(), responseObserver);
    }

    /**
     */
    default void createModule(viam.app.v1.AppOuterClass.CreateModuleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateModuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateModuleMethod(), responseObserver);
    }

    /**
     */
    default void updateModule(viam.app.v1.AppOuterClass.UpdateModuleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateModuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateModuleMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UploadModuleFileRequest> uploadModuleFile(
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UploadModuleFileResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadModuleFileMethod(), responseObserver);
    }

    /**
     */
    default void getModule(viam.app.v1.AppOuterClass.GetModuleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetModuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModuleMethod(), responseObserver);
    }

    /**
     */
    default void listModules(viam.app.v1.AppOuterClass.ListModulesRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListModulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModulesMethod(), responseObserver);
    }

    /**
     */
    default void createKey(viam.app.v1.AppOuterClass.CreateKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateKeyMethod(), responseObserver);
    }

    /**
     */
    default void deleteKey(viam.app.v1.AppOuterClass.DeleteKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteKeyMethod(), responseObserver);
    }

    /**
     */
    default void listKeys(viam.app.v1.AppOuterClass.ListKeysRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListKeysMethod(), responseObserver);
    }

    /**
     */
    default void renameKey(viam.app.v1.AppOuterClass.RenameKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.RenameKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenameKeyMethod(), responseObserver);
    }

    /**
     */
    default void rotateKey(viam.app.v1.AppOuterClass.RotateKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.RotateKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRotateKeyMethod(), responseObserver);
    }

    /**
     */
    default void createKeyFromExistingKeyAuthorizations(viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateKeyFromExistingKeyAuthorizationsMethod(), responseObserver);
    }

    /**
     */
    default void getAppContent(viam.app.v1.AppOuterClass.GetAppContentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetAppContentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppContentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AppService.
   * <pre>
   * Users
   * </pre>
   */
  public static abstract class AppServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AppServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AppService.
   * <pre>
   * Users
   * </pre>
   */
  public static final class AppServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AppServiceStub> {
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
     * <pre>
     * Get the id of the user with the email
     * </pre>
     */
    public void getUserIDByEmail(viam.app.v1.AppOuterClass.GetUserIDByEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetUserIDByEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserIDByEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new organization
     * </pre>
     */
    public void createOrganization(viam.app.v1.AppOuterClass.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List organizations
     * </pre>
     */
    public void listOrganizations(viam.app.v1.AppOuterClass.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListOrganizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all organizations that have access to a location.
     * </pre>
     */
    public void getOrganizationsWithAccessToLocation(viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationsWithAccessToLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List the organizations a user belongs to
     * </pre>
     */
    public void listOrganizationsByUser(viam.app.v1.AppOuterClass.ListOrganizationsByUserRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListOrganizationsByUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationsByUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search organizations by a couple fields
     * </pre>
     */
    public void searchOrganizations(viam.app.v1.AppOuterClass.SearchOrganizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.SearchOrganizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an organization
     * </pre>
     */
    public void getOrganization(viam.app.v1.AppOuterClass.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks for namespace availablity throughout all orgs.
     * </pre>
     */
    public void getOrganizationNamespaceAvailability(viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationNamespaceAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an organization
     * </pre>
     */
    public void updateOrganization(viam.app.v1.AppOuterClass.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an organization's namespace if it's already been set.
     * </pre>
     */
    public void updateOrganizationNamespace(viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an organization
     * </pre>
     */
    public void deleteOrganization(viam.app.v1.AppOuterClass.DeleteOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for an organization
     * </pre>
     */
    public void getOrganizationMetadata(viam.app.v1.AppOuterClass.GetOrganizationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetOrganizationMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for an organization
     * </pre>
     */
    public void updateOrganizationMetadata(viam.app.v1.AppOuterClass.UpdateOrganizationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOrganizationMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all members of an organization and all invited members to the organization.
     * </pre>
     */
    public void listOrganizationMembers(viam.app.v1.AppOuterClass.ListOrganizationMembersRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListOrganizationMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an organization invite to an organization
     * </pre>
     */
    public void createOrganizationInvite(viam.app.v1.AppOuterClass.CreateOrganizationInviteRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateOrganizationInviteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationInviteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the authorizations attached to an organization invite
     * </pre>
     */
    public void updateOrganizationInviteAuthorizations(viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationInviteAuthorizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an organization member from an organization
     * </pre>
     */
    public void deleteOrganizationMember(viam.app.v1.AppOuterClass.DeleteOrganizationMemberRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteOrganizationMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOrganizationMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an organization invite
     * </pre>
     */
    public void deleteOrganizationInvite(viam.app.v1.AppOuterClass.DeleteOrganizationInviteRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteOrganizationInviteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOrganizationInviteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resend an organization invite
     * </pre>
     */
    public void resendOrganizationInvite(viam.app.v1.AppOuterClass.ResendOrganizationInviteRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ResendOrganizationInviteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendOrganizationInviteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableBillingService(viam.app.v1.AppOuterClass.EnableBillingServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.EnableBillingServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableBillingServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableBillingService(viam.app.v1.AppOuterClass.DisableBillingServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DisableBillingServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableBillingServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBillingService(viam.app.v1.AppOuterClass.UpdateBillingServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateBillingServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBillingServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBillingServiceConfig(viam.app.v1.AppOuterClass.GetBillingServiceConfigRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetBillingServiceConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingServiceConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void organizationSetSupportEmail(viam.app.v1.AppOuterClass.OrganizationSetSupportEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.OrganizationSetSupportEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrganizationSetSupportEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void organizationGetSupportEmail(viam.app.v1.AppOuterClass.OrganizationGetSupportEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.OrganizationGetSupportEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrganizationGetSupportEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void organizationSetLogo(viam.app.v1.AppOuterClass.OrganizationSetLogoRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.OrganizationSetLogoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrganizationSetLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void organizationGetLogo(viam.app.v1.AppOuterClass.OrganizationGetLogoRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.OrganizationGetLogoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrganizationGetLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableAuthService(viam.app.v1.AppOuterClass.EnableAuthServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.EnableAuthServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableAuthServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableAuthService(viam.app.v1.AppOuterClass.DisableAuthServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DisableAuthServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableAuthServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOAuthApp(viam.app.v1.AppOuterClass.CreateOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateOAuthAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOAuthAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readOAuthApp(viam.app.v1.AppOuterClass.ReadOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ReadOAuthAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadOAuthAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOAuthApp(viam.app.v1.AppOuterClass.UpdateOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOAuthAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOAuthAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOAuthApp(viam.app.v1.AppOuterClass.DeleteOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteOAuthAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOAuthAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOAuthApps(viam.app.v1.AppOuterClass.ListOAuthAppsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListOAuthAppsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOAuthAppsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a location
     * </pre>
     */
    public void createLocation(viam.app.v1.AppOuterClass.CreateLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a location
     * </pre>
     */
    public void getLocation(viam.app.v1.AppOuterClass.GetLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a location
     * </pre>
     */
    public void updateLocation(viam.app.v1.AppOuterClass.UpdateLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a location
     * </pre>
     */
    public void deleteLocation(viam.app.v1.AppOuterClass.DeleteLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for a location
     * </pre>
     */
    public void getLocationMetadata(viam.app.v1.AppOuterClass.GetLocationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetLocationMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocationMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for a location
     * </pre>
     */
    public void updateLocationMetadata(viam.app.v1.AppOuterClass.UpdateLocationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateLocationMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLocationMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a list of locations
     * </pre>
     */
    public void listLocations(viam.app.v1.AppOuterClass.ListLocationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListLocationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Share a location with an organization
     * </pre>
     */
    public void shareLocation(viam.app.v1.AppOuterClass.ShareLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ShareLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShareLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop sharing a location with an organization
     * </pre>
     */
    public void unshareLocation(viam.app.v1.AppOuterClass.UnshareLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UnshareLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnshareLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a location's authorization secrets
     * </pre>
     */
    public void locationAuth(viam.app.v1.AppOuterClass.LocationAuthRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.LocationAuthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLocationAuthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Location.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public void createLocationSecret(viam.app.v1.AppOuterClass.CreateLocationSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateLocationSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLocationSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a Secret from the Location.
     * </pre>
     */
    public void deleteLocationSecret(viam.app.v1.AppOuterClass.DeleteLocationSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteLocationSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLocationSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot by ID
     * </pre>
     */
    public void getRobot(viam.app.v1.AppOuterClass.GetRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for a robot
     * </pre>
     */
    public void getRobotMetadata(viam.app.v1.AppOuterClass.GetRobotMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot
     * </pre>
     */
    public void updateRobotMetadata(viam.app.v1.AppOuterClass.UpdateRobotMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRobotMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRobotMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Rover Rental Location Robots
     * </pre>
     */
    public void getRoverRentalRobots(viam.app.v1.AppOuterClass.GetRoverRentalRobotsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRoverRentalRobotsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoverRentalRobotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRobotParts(viam.app.v1.AppOuterClass.GetRobotPartsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotPartsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot part by ID
     * </pre>
     */
    public void getRobotPart(viam.app.v1.AppOuterClass.GetRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot part by name and location
     * </pre>
     */
    public void getRobotPartByNameAndLocation(viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotPartByNameAndLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRobotPartLogs(viam.app.v1.AppOuterClass.GetRobotPartLogsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotPartLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tailRobotPartLogs(viam.app.v1.AppOuterClass.TailRobotPartLogsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.TailRobotPartLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getTailRobotPartLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot part histy by ID
     * </pre>
     */
    public void getRobotPartHistory(viam.app.v1.AppOuterClass.GetRobotPartHistoryRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotPartHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a robot
     * </pre>
     */
    public void updateRobotPart(viam.app.v1.AppOuterClass.UpdateRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRobotPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRobotPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new robot part
     * </pre>
     */
    public void newRobotPart(viam.app.v1.AppOuterClass.NewRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.NewRobotPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewRobotPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a robot part
     * </pre>
     */
    public void deleteRobotPart(viam.app.v1.AppOuterClass.DeleteRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteRobotPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRobotPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for a robot part
     * </pre>
     */
    public void getRobotPartMetadata(viam.app.v1.AppOuterClass.GetRobotPartMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotPartMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot part
     * </pre>
     */
    public void updateRobotPartMetadata(viam.app.v1.AppOuterClass.UpdateRobotPartMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRobotPartMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRobotPartMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the Robot API Keys for the robot
     * </pre>
     */
    public void getRobotAPIKeys(viam.app.v1.AppOuterClass.GetRobotAPIKeysRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotAPIKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotAPIKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Marks the given part as the main part, and all the others as not
     * </pre>
     */
    public void markPartAsMain(viam.app.v1.AppOuterClass.MarkPartAsMainRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.MarkPartAsMainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkPartAsMainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Marks part for restart. Once the robot part checks-in with the app the flag
     * is reset on the robot part. Calling this multiple times before a robot part
     * checks-in has no affect.
     * Note: This API may be removed in the near future.
     * TODO(APP-388): Remove
     * </pre>
     */
    public void markPartForRestart(viam.app.v1.AppOuterClass.MarkPartForRestartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.MarkPartForRestartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkPartForRestartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Robot Part.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public void createRobotPartSecret(viam.app.v1.AppOuterClass.CreateRobotPartSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateRobotPartSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRobotPartSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a Secret from the RobotPart.
     * </pre>
     */
    public void deleteRobotPartSecret(viam.app.v1.AppOuterClass.DeleteRobotPartSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteRobotPartSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRobotPartSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a list of robots
     * </pre>
     */
    public void listRobots(viam.app.v1.AppOuterClass.ListRobotsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListRobotsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRobotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewRobot creates a new robot
     * </pre>
     */
    public void newRobot(viam.app.v1.AppOuterClass.NewRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.NewRobotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewRobotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateRobot updates a robot
     * </pre>
     */
    public void updateRobot(viam.app.v1.AppOuterClass.UpdateRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRobotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRobotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRobot deletes a robot
     * </pre>
     */
    public void deleteRobot(viam.app.v1.AppOuterClass.DeleteRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteRobotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRobotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a list of fragments
     * </pre>
     */
    public void listFragments(viam.app.v1.AppOuterClass.ListFragmentsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListFragmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFragmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a single fragment
     * </pre>
     */
    public void getFragment(viam.app.v1.AppOuterClass.GetFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetFragmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFragmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a fragment
     * </pre>
     */
    public void createFragment(viam.app.v1.AppOuterClass.CreateFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateFragmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFragmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a fragment
     * </pre>
     */
    public void updateFragment(viam.app.v1.AppOuterClass.UpdateFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateFragmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFragmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a fragment
     * </pre>
     */
    public void deleteFragment(viam.app.v1.AppOuterClass.DeleteFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteFragmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFragmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List nested fragments for a fragment
     * </pre>
     */
    public void listNestedFragments(viam.app.v1.AppOuterClass.ListNestedFragmentsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListNestedFragmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNestedFragmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets top level and nested fragments for a machine, as well as any other specified fragment ids
     * </pre>
     */
    public void listMachineFragments(viam.app.v1.AppOuterClass.ListMachineFragmentsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListMachineFragmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMachineFragmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all machines and their corresponding machine dashboard information
     * </pre>
     */
    public void listMachineSummaries(viam.app.v1.AppOuterClass.ListMachineSummariesRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListMachineSummariesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMachineSummariesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets fragment history
     * </pre>
     */
    public void getFragmentHistory(viam.app.v1.AppOuterClass.GetFragmentHistoryRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetFragmentHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFragmentHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets usage for a fragment across versions
     * </pre>
     */
    public void getFragmentUsage(viam.app.v1.AppOuterClass.GetFragmentUsageRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetFragmentUsageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFragmentUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets a fragment tag to a revision
     * </pre>
     */
    public void setFragmentTag(viam.app.v1.AppOuterClass.SetFragmentTagRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.SetFragmentTagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetFragmentTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a fragment tag
     * </pre>
     */
    public void deleteFragmentTag(viam.app.v1.AppOuterClass.DeleteFragmentTagRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteFragmentTagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFragmentTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an IdentityAuthorization
     * </pre>
     */
    public void addRole(viam.app.v1.AppOuterClass.AddRoleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.AddRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an IdentityAuthorization
     * </pre>
     */
    public void removeRole(viam.app.v1.AppOuterClass.RemoveRoleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.RemoveRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Changes an IdentityAuthorization to a new IdentityAuthorization
     * </pre>
     */
    public void changeRole(viam.app.v1.AppOuterClass.ChangeRoleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ChangeRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all authorization roles for a given resource
     * </pre>
     */
    public void listAuthorizations(viam.app.v1.AppOuterClass.ListAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAuthorizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validates a permission for the current user
     * </pre>
     */
    public void checkPermissions(viam.app.v1.AppOuterClass.CheckPermissionsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CheckPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRegistryItem(viam.app.v1.AppOuterClass.GetRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRegistryItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegistryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRegistryItem(viam.app.v1.AppOuterClass.CreateRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateRegistryItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRegistryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRegistryItem(viam.app.v1.AppOuterClass.UpdateRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRegistryItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRegistryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRegistryItems(viam.app.v1.AppOuterClass.ListRegistryItemsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListRegistryItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRegistryItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRegistryItem(viam.app.v1.AppOuterClass.DeleteRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteRegistryItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRegistryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void renameRegistryItem(viam.app.v1.AppOuterClass.RenameRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.RenameRegistryItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenameRegistryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferRegistryItem(viam.app.v1.AppOuterClass.TransferRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.TransferRegistryItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferRegistryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createModule(viam.app.v1.AppOuterClass.CreateModuleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateModuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateModuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateModule(viam.app.v1.AppOuterClass.UpdateModuleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateModuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateModuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UploadModuleFileRequest> uploadModuleFile(
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UploadModuleFileResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadModuleFileMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getModule(viam.app.v1.AppOuterClass.GetModuleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetModuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listModules(viam.app.v1.AppOuterClass.ListModulesRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListModulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createKey(viam.app.v1.AppOuterClass.CreateKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteKey(viam.app.v1.AppOuterClass.DeleteKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listKeys(viam.app.v1.AppOuterClass.ListKeysRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void renameKey(viam.app.v1.AppOuterClass.RenameKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.RenameKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenameKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rotateKey(viam.app.v1.AppOuterClass.RotateKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.RotateKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRotateKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createKeyFromExistingKeyAuthorizations(viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateKeyFromExistingKeyAuthorizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAppContent(viam.app.v1.AppOuterClass.GetAppContentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetAppContentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppContentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AppService.
   * <pre>
   * Users
   * </pre>
   */
  public static final class AppServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AppServiceBlockingStub> {
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
     * <pre>
     * Get the id of the user with the email
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetUserIDByEmailResponse getUserIDByEmail(viam.app.v1.AppOuterClass.GetUserIDByEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserIDByEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new organization
     * </pre>
     */
    public viam.app.v1.AppOuterClass.CreateOrganizationResponse createOrganization(viam.app.v1.AppOuterClass.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List organizations
     * </pre>
     */
    public viam.app.v1.AppOuterClass.ListOrganizationsResponse listOrganizations(viam.app.v1.AppOuterClass.ListOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all organizations that have access to a location.
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationResponse getOrganizationsWithAccessToLocation(viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationsWithAccessToLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List the organizations a user belongs to
     * </pre>
     */
    public viam.app.v1.AppOuterClass.ListOrganizationsByUserResponse listOrganizationsByUser(viam.app.v1.AppOuterClass.ListOrganizationsByUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationsByUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search organizations by a couple fields
     * </pre>
     */
    public viam.app.v1.AppOuterClass.SearchOrganizationsResponse searchOrganizations(viam.app.v1.AppOuterClass.SearchOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an organization
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetOrganizationResponse getOrganization(viam.app.v1.AppOuterClass.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks for namespace availablity throughout all orgs.
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityResponse getOrganizationNamespaceAvailability(viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationNamespaceAvailabilityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an organization
     * </pre>
     */
    public viam.app.v1.AppOuterClass.UpdateOrganizationResponse updateOrganization(viam.app.v1.AppOuterClass.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an organization's namespace if it's already been set.
     * </pre>
     */
    public viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceResponse updateOrganizationNamespace(viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationNamespaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an organization
     * </pre>
     */
    public viam.app.v1.AppOuterClass.DeleteOrganizationResponse deleteOrganization(viam.app.v1.AppOuterClass.DeleteOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get user-defined metadata for an organization
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetOrganizationMetadataResponse getOrganizationMetadata(viam.app.v1.AppOuterClass.GetOrganizationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for an organization
     * </pre>
     */
    public viam.app.v1.AppOuterClass.UpdateOrganizationMetadataResponse updateOrganizationMetadata(viam.app.v1.AppOuterClass.UpdateOrganizationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all members of an organization and all invited members to the organization.
     * </pre>
     */
    public viam.app.v1.AppOuterClass.ListOrganizationMembersResponse listOrganizationMembers(viam.app.v1.AppOuterClass.ListOrganizationMembersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an organization invite to an organization
     * </pre>
     */
    public viam.app.v1.AppOuterClass.CreateOrganizationInviteResponse createOrganizationInvite(viam.app.v1.AppOuterClass.CreateOrganizationInviteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationInviteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the authorizations attached to an organization invite
     * </pre>
     */
    public viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsResponse updateOrganizationInviteAuthorizations(viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationInviteAuthorizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an organization member from an organization
     * </pre>
     */
    public viam.app.v1.AppOuterClass.DeleteOrganizationMemberResponse deleteOrganizationMember(viam.app.v1.AppOuterClass.DeleteOrganizationMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOrganizationMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an organization invite
     * </pre>
     */
    public viam.app.v1.AppOuterClass.DeleteOrganizationInviteResponse deleteOrganizationInvite(viam.app.v1.AppOuterClass.DeleteOrganizationInviteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOrganizationInviteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resend an organization invite
     * </pre>
     */
    public viam.app.v1.AppOuterClass.ResendOrganizationInviteResponse resendOrganizationInvite(viam.app.v1.AppOuterClass.ResendOrganizationInviteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendOrganizationInviteMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.EnableBillingServiceResponse enableBillingService(viam.app.v1.AppOuterClass.EnableBillingServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableBillingServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.DisableBillingServiceResponse disableBillingService(viam.app.v1.AppOuterClass.DisableBillingServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableBillingServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.UpdateBillingServiceResponse updateBillingService(viam.app.v1.AppOuterClass.UpdateBillingServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBillingServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.GetBillingServiceConfigResponse getBillingServiceConfig(viam.app.v1.AppOuterClass.GetBillingServiceConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingServiceConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.OrganizationSetSupportEmailResponse organizationSetSupportEmail(viam.app.v1.AppOuterClass.OrganizationSetSupportEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrganizationSetSupportEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.OrganizationGetSupportEmailResponse organizationGetSupportEmail(viam.app.v1.AppOuterClass.OrganizationGetSupportEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrganizationGetSupportEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.OrganizationSetLogoResponse organizationSetLogo(viam.app.v1.AppOuterClass.OrganizationSetLogoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrganizationSetLogoMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.OrganizationGetLogoResponse organizationGetLogo(viam.app.v1.AppOuterClass.OrganizationGetLogoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrganizationGetLogoMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.EnableAuthServiceResponse enableAuthService(viam.app.v1.AppOuterClass.EnableAuthServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableAuthServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.DisableAuthServiceResponse disableAuthService(viam.app.v1.AppOuterClass.DisableAuthServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableAuthServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.CreateOAuthAppResponse createOAuthApp(viam.app.v1.AppOuterClass.CreateOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOAuthAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.ReadOAuthAppResponse readOAuthApp(viam.app.v1.AppOuterClass.ReadOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadOAuthAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.UpdateOAuthAppResponse updateOAuthApp(viam.app.v1.AppOuterClass.UpdateOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOAuthAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.DeleteOAuthAppResponse deleteOAuthApp(viam.app.v1.AppOuterClass.DeleteOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOAuthAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.ListOAuthAppsResponse listOAuthApps(viam.app.v1.AppOuterClass.ListOAuthAppsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOAuthAppsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a location
     * </pre>
     */
    public viam.app.v1.AppOuterClass.CreateLocationResponse createLocation(viam.app.v1.AppOuterClass.CreateLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a location
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetLocationResponse getLocation(viam.app.v1.AppOuterClass.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a location
     * </pre>
     */
    public viam.app.v1.AppOuterClass.UpdateLocationResponse updateLocation(viam.app.v1.AppOuterClass.UpdateLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a location
     * </pre>
     */
    public viam.app.v1.AppOuterClass.DeleteLocationResponse deleteLocation(viam.app.v1.AppOuterClass.DeleteLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get user-defined metadata for a location
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetLocationMetadataResponse getLocationMetadata(viam.app.v1.AppOuterClass.GetLocationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocationMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for a location
     * </pre>
     */
    public viam.app.v1.AppOuterClass.UpdateLocationMetadataResponse updateLocationMetadata(viam.app.v1.AppOuterClass.UpdateLocationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLocationMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a list of locations
     * </pre>
     */
    public viam.app.v1.AppOuterClass.ListLocationsResponse listLocations(viam.app.v1.AppOuterClass.ListLocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Share a location with an organization
     * </pre>
     */
    public viam.app.v1.AppOuterClass.ShareLocationResponse shareLocation(viam.app.v1.AppOuterClass.ShareLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShareLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop sharing a location with an organization
     * </pre>
     */
    public viam.app.v1.AppOuterClass.UnshareLocationResponse unshareLocation(viam.app.v1.AppOuterClass.UnshareLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnshareLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a location's authorization secrets
     * </pre>
     */
    public viam.app.v1.AppOuterClass.LocationAuthResponse locationAuth(viam.app.v1.AppOuterClass.LocationAuthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLocationAuthMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Location.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public viam.app.v1.AppOuterClass.CreateLocationSecretResponse createLocationSecret(viam.app.v1.AppOuterClass.CreateLocationSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLocationSecretMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a Secret from the Location.
     * </pre>
     */
    public viam.app.v1.AppOuterClass.DeleteLocationSecretResponse deleteLocationSecret(viam.app.v1.AppOuterClass.DeleteLocationSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLocationSecretMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific robot by ID
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetRobotResponse getRobot(viam.app.v1.AppOuterClass.GetRobotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get user-defined metadata for a robot
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetRobotMetadataResponse getRobotMetadata(viam.app.v1.AppOuterClass.GetRobotMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot
     * </pre>
     */
    public viam.app.v1.AppOuterClass.UpdateRobotMetadataResponse updateRobotMetadata(viam.app.v1.AppOuterClass.UpdateRobotMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRobotMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Rover Rental Location Robots
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetRoverRentalRobotsResponse getRoverRentalRobots(viam.app.v1.AppOuterClass.GetRoverRentalRobotsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoverRentalRobotsMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.GetRobotPartsResponse getRobotParts(viam.app.v1.AppOuterClass.GetRobotPartsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotPartsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific robot part by ID
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetRobotPartResponse getRobotPart(viam.app.v1.AppOuterClass.GetRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotPartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific robot part by name and location
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationResponse getRobotPartByNameAndLocation(viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotPartByNameAndLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.GetRobotPartLogsResponse getRobotPartLogs(viam.app.v1.AppOuterClass.GetRobotPartLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotPartLogsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<viam.app.v1.AppOuterClass.TailRobotPartLogsResponse> tailRobotPartLogs(
        viam.app.v1.AppOuterClass.TailRobotPartLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getTailRobotPartLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific robot part histy by ID
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetRobotPartHistoryResponse getRobotPartHistory(viam.app.v1.AppOuterClass.GetRobotPartHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotPartHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a robot
     * </pre>
     */
    public viam.app.v1.AppOuterClass.UpdateRobotPartResponse updateRobotPart(viam.app.v1.AppOuterClass.UpdateRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRobotPartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new robot part
     * </pre>
     */
    public viam.app.v1.AppOuterClass.NewRobotPartResponse newRobotPart(viam.app.v1.AppOuterClass.NewRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewRobotPartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a robot part
     * </pre>
     */
    public viam.app.v1.AppOuterClass.DeleteRobotPartResponse deleteRobotPart(viam.app.v1.AppOuterClass.DeleteRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRobotPartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get user-defined metadata for a robot part
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetRobotPartMetadataResponse getRobotPartMetadata(viam.app.v1.AppOuterClass.GetRobotPartMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotPartMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot part
     * </pre>
     */
    public viam.app.v1.AppOuterClass.UpdateRobotPartMetadataResponse updateRobotPartMetadata(viam.app.v1.AppOuterClass.UpdateRobotPartMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRobotPartMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the Robot API Keys for the robot
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetRobotAPIKeysResponse getRobotAPIKeys(viam.app.v1.AppOuterClass.GetRobotAPIKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotAPIKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Marks the given part as the main part, and all the others as not
     * </pre>
     */
    public viam.app.v1.AppOuterClass.MarkPartAsMainResponse markPartAsMain(viam.app.v1.AppOuterClass.MarkPartAsMainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkPartAsMainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Marks part for restart. Once the robot part checks-in with the app the flag
     * is reset on the robot part. Calling this multiple times before a robot part
     * checks-in has no affect.
     * Note: This API may be removed in the near future.
     * TODO(APP-388): Remove
     * </pre>
     */
    public viam.app.v1.AppOuterClass.MarkPartForRestartResponse markPartForRestart(viam.app.v1.AppOuterClass.MarkPartForRestartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkPartForRestartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Robot Part.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public viam.app.v1.AppOuterClass.CreateRobotPartSecretResponse createRobotPartSecret(viam.app.v1.AppOuterClass.CreateRobotPartSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRobotPartSecretMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a Secret from the RobotPart.
     * </pre>
     */
    public viam.app.v1.AppOuterClass.DeleteRobotPartSecretResponse deleteRobotPartSecret(viam.app.v1.AppOuterClass.DeleteRobotPartSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRobotPartSecretMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a list of robots
     * </pre>
     */
    public viam.app.v1.AppOuterClass.ListRobotsResponse listRobots(viam.app.v1.AppOuterClass.ListRobotsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRobotsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewRobot creates a new robot
     * </pre>
     */
    public viam.app.v1.AppOuterClass.NewRobotResponse newRobot(viam.app.v1.AppOuterClass.NewRobotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewRobotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRobot updates a robot
     * </pre>
     */
    public viam.app.v1.AppOuterClass.UpdateRobotResponse updateRobot(viam.app.v1.AppOuterClass.UpdateRobotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRobotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRobot deletes a robot
     * </pre>
     */
    public viam.app.v1.AppOuterClass.DeleteRobotResponse deleteRobot(viam.app.v1.AppOuterClass.DeleteRobotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRobotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a list of fragments
     * </pre>
     */
    public viam.app.v1.AppOuterClass.ListFragmentsResponse listFragments(viam.app.v1.AppOuterClass.ListFragmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFragmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single fragment
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetFragmentResponse getFragment(viam.app.v1.AppOuterClass.GetFragmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFragmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a fragment
     * </pre>
     */
    public viam.app.v1.AppOuterClass.CreateFragmentResponse createFragment(viam.app.v1.AppOuterClass.CreateFragmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFragmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a fragment
     * </pre>
     */
    public viam.app.v1.AppOuterClass.UpdateFragmentResponse updateFragment(viam.app.v1.AppOuterClass.UpdateFragmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFragmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a fragment
     * </pre>
     */
    public viam.app.v1.AppOuterClass.DeleteFragmentResponse deleteFragment(viam.app.v1.AppOuterClass.DeleteFragmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFragmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List nested fragments for a fragment
     * </pre>
     */
    public viam.app.v1.AppOuterClass.ListNestedFragmentsResponse listNestedFragments(viam.app.v1.AppOuterClass.ListNestedFragmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNestedFragmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets top level and nested fragments for a machine, as well as any other specified fragment ids
     * </pre>
     */
    public viam.app.v1.AppOuterClass.ListMachineFragmentsResponse listMachineFragments(viam.app.v1.AppOuterClass.ListMachineFragmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMachineFragmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all machines and their corresponding machine dashboard information
     * </pre>
     */
    public viam.app.v1.AppOuterClass.ListMachineSummariesResponse listMachineSummaries(viam.app.v1.AppOuterClass.ListMachineSummariesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMachineSummariesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets fragment history
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetFragmentHistoryResponse getFragmentHistory(viam.app.v1.AppOuterClass.GetFragmentHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFragmentHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets usage for a fragment across versions
     * </pre>
     */
    public viam.app.v1.AppOuterClass.GetFragmentUsageResponse getFragmentUsage(viam.app.v1.AppOuterClass.GetFragmentUsageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFragmentUsageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets a fragment tag to a revision
     * </pre>
     */
    public viam.app.v1.AppOuterClass.SetFragmentTagResponse setFragmentTag(viam.app.v1.AppOuterClass.SetFragmentTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetFragmentTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a fragment tag
     * </pre>
     */
    public viam.app.v1.AppOuterClass.DeleteFragmentTagResponse deleteFragmentTag(viam.app.v1.AppOuterClass.DeleteFragmentTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFragmentTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an IdentityAuthorization
     * </pre>
     */
    public viam.app.v1.AppOuterClass.AddRoleResponse addRole(viam.app.v1.AppOuterClass.AddRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an IdentityAuthorization
     * </pre>
     */
    public viam.app.v1.AppOuterClass.RemoveRoleResponse removeRole(viam.app.v1.AppOuterClass.RemoveRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Changes an IdentityAuthorization to a new IdentityAuthorization
     * </pre>
     */
    public viam.app.v1.AppOuterClass.ChangeRoleResponse changeRole(viam.app.v1.AppOuterClass.ChangeRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all authorization roles for a given resource
     * </pre>
     */
    public viam.app.v1.AppOuterClass.ListAuthorizationsResponse listAuthorizations(viam.app.v1.AppOuterClass.ListAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAuthorizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validates a permission for the current user
     * </pre>
     */
    public viam.app.v1.AppOuterClass.CheckPermissionsResponse checkPermissions(viam.app.v1.AppOuterClass.CheckPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckPermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.GetRegistryItemResponse getRegistryItem(viam.app.v1.AppOuterClass.GetRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegistryItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.CreateRegistryItemResponse createRegistryItem(viam.app.v1.AppOuterClass.CreateRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRegistryItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.UpdateRegistryItemResponse updateRegistryItem(viam.app.v1.AppOuterClass.UpdateRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRegistryItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.ListRegistryItemsResponse listRegistryItems(viam.app.v1.AppOuterClass.ListRegistryItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRegistryItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.DeleteRegistryItemResponse deleteRegistryItem(viam.app.v1.AppOuterClass.DeleteRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRegistryItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.RenameRegistryItemResponse renameRegistryItem(viam.app.v1.AppOuterClass.RenameRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenameRegistryItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.TransferRegistryItemResponse transferRegistryItem(viam.app.v1.AppOuterClass.TransferRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferRegistryItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.CreateModuleResponse createModule(viam.app.v1.AppOuterClass.CreateModuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateModuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.UpdateModuleResponse updateModule(viam.app.v1.AppOuterClass.UpdateModuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateModuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.GetModuleResponse getModule(viam.app.v1.AppOuterClass.GetModuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.ListModulesResponse listModules(viam.app.v1.AppOuterClass.ListModulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.CreateKeyResponse createKey(viam.app.v1.AppOuterClass.CreateKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.DeleteKeyResponse deleteKey(viam.app.v1.AppOuterClass.DeleteKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.ListKeysResponse listKeys(viam.app.v1.AppOuterClass.ListKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListKeysMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.RenameKeyResponse renameKey(viam.app.v1.AppOuterClass.RenameKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenameKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.RotateKeyResponse rotateKey(viam.app.v1.AppOuterClass.RotateKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRotateKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsResponse createKeyFromExistingKeyAuthorizations(viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateKeyFromExistingKeyAuthorizationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.AppOuterClass.GetAppContentResponse getAppContent(viam.app.v1.AppOuterClass.GetAppContentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppContentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AppService.
   * <pre>
   * Users
   * </pre>
   */
  public static final class AppServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AppServiceFutureStub> {
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
     * <pre>
     * Get the id of the user with the email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetUserIDByEmailResponse> getUserIDByEmail(
        viam.app.v1.AppOuterClass.GetUserIDByEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserIDByEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.CreateOrganizationResponse> createOrganization(
        viam.app.v1.AppOuterClass.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List organizations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListOrganizationsResponse> listOrganizations(
        viam.app.v1.AppOuterClass.ListOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all organizations that have access to a location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationResponse> getOrganizationsWithAccessToLocation(
        viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationsWithAccessToLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List the organizations a user belongs to
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListOrganizationsByUserResponse> listOrganizationsByUser(
        viam.app.v1.AppOuterClass.ListOrganizationsByUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationsByUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search organizations by a couple fields
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.SearchOrganizationsResponse> searchOrganizations(
        viam.app.v1.AppOuterClass.SearchOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchOrganizationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetOrganizationResponse> getOrganization(
        viam.app.v1.AppOuterClass.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks for namespace availablity throughout all orgs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityResponse> getOrganizationNamespaceAvailability(
        viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationNamespaceAvailabilityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateOrganizationResponse> updateOrganization(
        viam.app.v1.AppOuterClass.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an organization's namespace if it's already been set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceResponse> updateOrganizationNamespace(
        viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationNamespaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DeleteOrganizationResponse> deleteOrganization(
        viam.app.v1.AppOuterClass.DeleteOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get user-defined metadata for an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetOrganizationMetadataResponse> getOrganizationMetadata(
        viam.app.v1.AppOuterClass.GetOrganizationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateOrganizationMetadataResponse> updateOrganizationMetadata(
        viam.app.v1.AppOuterClass.UpdateOrganizationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all members of an organization and all invited members to the organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListOrganizationMembersResponse> listOrganizationMembers(
        viam.app.v1.AppOuterClass.ListOrganizationMembersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an organization invite to an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.CreateOrganizationInviteResponse> createOrganizationInvite(
        viam.app.v1.AppOuterClass.CreateOrganizationInviteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationInviteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the authorizations attached to an organization invite
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsResponse> updateOrganizationInviteAuthorizations(
        viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationInviteAuthorizationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an organization member from an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DeleteOrganizationMemberResponse> deleteOrganizationMember(
        viam.app.v1.AppOuterClass.DeleteOrganizationMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOrganizationMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an organization invite
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DeleteOrganizationInviteResponse> deleteOrganizationInvite(
        viam.app.v1.AppOuterClass.DeleteOrganizationInviteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOrganizationInviteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resend an organization invite
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ResendOrganizationInviteResponse> resendOrganizationInvite(
        viam.app.v1.AppOuterClass.ResendOrganizationInviteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendOrganizationInviteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.EnableBillingServiceResponse> enableBillingService(
        viam.app.v1.AppOuterClass.EnableBillingServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableBillingServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DisableBillingServiceResponse> disableBillingService(
        viam.app.v1.AppOuterClass.DisableBillingServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableBillingServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateBillingServiceResponse> updateBillingService(
        viam.app.v1.AppOuterClass.UpdateBillingServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBillingServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetBillingServiceConfigResponse> getBillingServiceConfig(
        viam.app.v1.AppOuterClass.GetBillingServiceConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingServiceConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.OrganizationSetSupportEmailResponse> organizationSetSupportEmail(
        viam.app.v1.AppOuterClass.OrganizationSetSupportEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrganizationSetSupportEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.OrganizationGetSupportEmailResponse> organizationGetSupportEmail(
        viam.app.v1.AppOuterClass.OrganizationGetSupportEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrganizationGetSupportEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.OrganizationSetLogoResponse> organizationSetLogo(
        viam.app.v1.AppOuterClass.OrganizationSetLogoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrganizationSetLogoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.OrganizationGetLogoResponse> organizationGetLogo(
        viam.app.v1.AppOuterClass.OrganizationGetLogoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrganizationGetLogoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.EnableAuthServiceResponse> enableAuthService(
        viam.app.v1.AppOuterClass.EnableAuthServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableAuthServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DisableAuthServiceResponse> disableAuthService(
        viam.app.v1.AppOuterClass.DisableAuthServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableAuthServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.CreateOAuthAppResponse> createOAuthApp(
        viam.app.v1.AppOuterClass.CreateOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOAuthAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ReadOAuthAppResponse> readOAuthApp(
        viam.app.v1.AppOuterClass.ReadOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadOAuthAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateOAuthAppResponse> updateOAuthApp(
        viam.app.v1.AppOuterClass.UpdateOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOAuthAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DeleteOAuthAppResponse> deleteOAuthApp(
        viam.app.v1.AppOuterClass.DeleteOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOAuthAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListOAuthAppsResponse> listOAuthApps(
        viam.app.v1.AppOuterClass.ListOAuthAppsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOAuthAppsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a location
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.CreateLocationResponse> createLocation(
        viam.app.v1.AppOuterClass.CreateLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a location
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetLocationResponse> getLocation(
        viam.app.v1.AppOuterClass.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a location
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateLocationResponse> updateLocation(
        viam.app.v1.AppOuterClass.UpdateLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a location
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DeleteLocationResponse> deleteLocation(
        viam.app.v1.AppOuterClass.DeleteLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get user-defined metadata for a location
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetLocationMetadataResponse> getLocationMetadata(
        viam.app.v1.AppOuterClass.GetLocationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocationMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for a location
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateLocationMetadataResponse> updateLocationMetadata(
        viam.app.v1.AppOuterClass.UpdateLocationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLocationMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a list of locations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListLocationsResponse> listLocations(
        viam.app.v1.AppOuterClass.ListLocationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLocationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Share a location with an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ShareLocationResponse> shareLocation(
        viam.app.v1.AppOuterClass.ShareLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShareLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop sharing a location with an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UnshareLocationResponse> unshareLocation(
        viam.app.v1.AppOuterClass.UnshareLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnshareLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a location's authorization secrets
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.LocationAuthResponse> locationAuth(
        viam.app.v1.AppOuterClass.LocationAuthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLocationAuthMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Location.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.CreateLocationSecretResponse> createLocationSecret(
        viam.app.v1.AppOuterClass.CreateLocationSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLocationSecretMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a Secret from the Location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DeleteLocationSecretResponse> deleteLocationSecret(
        viam.app.v1.AppOuterClass.DeleteLocationSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLocationSecretMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific robot by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetRobotResponse> getRobot(
        viam.app.v1.AppOuterClass.GetRobotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get user-defined metadata for a robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetRobotMetadataResponse> getRobotMetadata(
        viam.app.v1.AppOuterClass.GetRobotMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateRobotMetadataResponse> updateRobotMetadata(
        viam.app.v1.AppOuterClass.UpdateRobotMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRobotMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get Rover Rental Location Robots
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetRoverRentalRobotsResponse> getRoverRentalRobots(
        viam.app.v1.AppOuterClass.GetRoverRentalRobotsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoverRentalRobotsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetRobotPartsResponse> getRobotParts(
        viam.app.v1.AppOuterClass.GetRobotPartsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotPartsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific robot part by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetRobotPartResponse> getRobotPart(
        viam.app.v1.AppOuterClass.GetRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotPartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific robot part by name and location
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationResponse> getRobotPartByNameAndLocation(
        viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotPartByNameAndLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetRobotPartLogsResponse> getRobotPartLogs(
        viam.app.v1.AppOuterClass.GetRobotPartLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotPartLogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific robot part histy by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetRobotPartHistoryResponse> getRobotPartHistory(
        viam.app.v1.AppOuterClass.GetRobotPartHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotPartHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateRobotPartResponse> updateRobotPart(
        viam.app.v1.AppOuterClass.UpdateRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRobotPartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new robot part
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.NewRobotPartResponse> newRobotPart(
        viam.app.v1.AppOuterClass.NewRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewRobotPartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a robot part
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DeleteRobotPartResponse> deleteRobotPart(
        viam.app.v1.AppOuterClass.DeleteRobotPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRobotPartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get user-defined metadata for a robot part
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetRobotPartMetadataResponse> getRobotPartMetadata(
        viam.app.v1.AppOuterClass.GetRobotPartMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotPartMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot part
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateRobotPartMetadataResponse> updateRobotPartMetadata(
        viam.app.v1.AppOuterClass.UpdateRobotPartMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRobotPartMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the Robot API Keys for the robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetRobotAPIKeysResponse> getRobotAPIKeys(
        viam.app.v1.AppOuterClass.GetRobotAPIKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotAPIKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Marks the given part as the main part, and all the others as not
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.MarkPartAsMainResponse> markPartAsMain(
        viam.app.v1.AppOuterClass.MarkPartAsMainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkPartAsMainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Marks part for restart. Once the robot part checks-in with the app the flag
     * is reset on the robot part. Calling this multiple times before a robot part
     * checks-in has no affect.
     * Note: This API may be removed in the near future.
     * TODO(APP-388): Remove
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.MarkPartForRestartResponse> markPartForRestart(
        viam.app.v1.AppOuterClass.MarkPartForRestartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkPartForRestartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Robot Part.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.CreateRobotPartSecretResponse> createRobotPartSecret(
        viam.app.v1.AppOuterClass.CreateRobotPartSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRobotPartSecretMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a Secret from the RobotPart.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DeleteRobotPartSecretResponse> deleteRobotPartSecret(
        viam.app.v1.AppOuterClass.DeleteRobotPartSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRobotPartSecretMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a list of robots
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListRobotsResponse> listRobots(
        viam.app.v1.AppOuterClass.ListRobotsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRobotsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewRobot creates a new robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.NewRobotResponse> newRobot(
        viam.app.v1.AppOuterClass.NewRobotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewRobotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateRobot updates a robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateRobotResponse> updateRobot(
        viam.app.v1.AppOuterClass.UpdateRobotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRobotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRobot deletes a robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DeleteRobotResponse> deleteRobot(
        viam.app.v1.AppOuterClass.DeleteRobotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRobotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a list of fragments
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListFragmentsResponse> listFragments(
        viam.app.v1.AppOuterClass.ListFragmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFragmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a single fragment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetFragmentResponse> getFragment(
        viam.app.v1.AppOuterClass.GetFragmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFragmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a fragment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.CreateFragmentResponse> createFragment(
        viam.app.v1.AppOuterClass.CreateFragmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFragmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a fragment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateFragmentResponse> updateFragment(
        viam.app.v1.AppOuterClass.UpdateFragmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFragmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a fragment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DeleteFragmentResponse> deleteFragment(
        viam.app.v1.AppOuterClass.DeleteFragmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFragmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List nested fragments for a fragment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListNestedFragmentsResponse> listNestedFragments(
        viam.app.v1.AppOuterClass.ListNestedFragmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNestedFragmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets top level and nested fragments for a machine, as well as any other specified fragment ids
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListMachineFragmentsResponse> listMachineFragments(
        viam.app.v1.AppOuterClass.ListMachineFragmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMachineFragmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all machines and their corresponding machine dashboard information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListMachineSummariesResponse> listMachineSummaries(
        viam.app.v1.AppOuterClass.ListMachineSummariesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMachineSummariesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets fragment history
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetFragmentHistoryResponse> getFragmentHistory(
        viam.app.v1.AppOuterClass.GetFragmentHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFragmentHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets usage for a fragment across versions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetFragmentUsageResponse> getFragmentUsage(
        viam.app.v1.AppOuterClass.GetFragmentUsageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFragmentUsageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets a fragment tag to a revision
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.SetFragmentTagResponse> setFragmentTag(
        viam.app.v1.AppOuterClass.SetFragmentTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetFragmentTagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a fragment tag
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DeleteFragmentTagResponse> deleteFragmentTag(
        viam.app.v1.AppOuterClass.DeleteFragmentTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFragmentTagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an IdentityAuthorization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.AddRoleResponse> addRole(
        viam.app.v1.AppOuterClass.AddRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an IdentityAuthorization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.RemoveRoleResponse> removeRole(
        viam.app.v1.AppOuterClass.RemoveRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Changes an IdentityAuthorization to a new IdentityAuthorization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ChangeRoleResponse> changeRole(
        viam.app.v1.AppOuterClass.ChangeRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all authorization roles for a given resource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListAuthorizationsResponse> listAuthorizations(
        viam.app.v1.AppOuterClass.ListAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAuthorizationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validates a permission for the current user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.CheckPermissionsResponse> checkPermissions(
        viam.app.v1.AppOuterClass.CheckPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckPermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetRegistryItemResponse> getRegistryItem(
        viam.app.v1.AppOuterClass.GetRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegistryItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.CreateRegistryItemResponse> createRegistryItem(
        viam.app.v1.AppOuterClass.CreateRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRegistryItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateRegistryItemResponse> updateRegistryItem(
        viam.app.v1.AppOuterClass.UpdateRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRegistryItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListRegistryItemsResponse> listRegistryItems(
        viam.app.v1.AppOuterClass.ListRegistryItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRegistryItemsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DeleteRegistryItemResponse> deleteRegistryItem(
        viam.app.v1.AppOuterClass.DeleteRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRegistryItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.RenameRegistryItemResponse> renameRegistryItem(
        viam.app.v1.AppOuterClass.RenameRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenameRegistryItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.TransferRegistryItemResponse> transferRegistryItem(
        viam.app.v1.AppOuterClass.TransferRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferRegistryItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.CreateModuleResponse> createModule(
        viam.app.v1.AppOuterClass.CreateModuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateModuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.UpdateModuleResponse> updateModule(
        viam.app.v1.AppOuterClass.UpdateModuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateModuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetModuleResponse> getModule(
        viam.app.v1.AppOuterClass.GetModuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListModulesResponse> listModules(
        viam.app.v1.AppOuterClass.ListModulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.CreateKeyResponse> createKey(
        viam.app.v1.AppOuterClass.CreateKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.DeleteKeyResponse> deleteKey(
        viam.app.v1.AppOuterClass.DeleteKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.ListKeysResponse> listKeys(
        viam.app.v1.AppOuterClass.ListKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListKeysMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.RenameKeyResponse> renameKey(
        viam.app.v1.AppOuterClass.RenameKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenameKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.RotateKeyResponse> rotateKey(
        viam.app.v1.AppOuterClass.RotateKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRotateKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsResponse> createKeyFromExistingKeyAuthorizations(
        viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateKeyFromExistingKeyAuthorizationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.AppOuterClass.GetAppContentResponse> getAppContent(
        viam.app.v1.AppOuterClass.GetAppContentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppContentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_IDBY_EMAIL = 0;
  private static final int METHODID_CREATE_ORGANIZATION = 1;
  private static final int METHODID_LIST_ORGANIZATIONS = 2;
  private static final int METHODID_GET_ORGANIZATIONS_WITH_ACCESS_TO_LOCATION = 3;
  private static final int METHODID_LIST_ORGANIZATIONS_BY_USER = 4;
  private static final int METHODID_SEARCH_ORGANIZATIONS = 5;
  private static final int METHODID_GET_ORGANIZATION = 6;
  private static final int METHODID_GET_ORGANIZATION_NAMESPACE_AVAILABILITY = 7;
  private static final int METHODID_UPDATE_ORGANIZATION = 8;
  private static final int METHODID_UPDATE_ORGANIZATION_NAMESPACE = 9;
  private static final int METHODID_DELETE_ORGANIZATION = 10;
  private static final int METHODID_GET_ORGANIZATION_METADATA = 11;
  private static final int METHODID_UPDATE_ORGANIZATION_METADATA = 12;
  private static final int METHODID_LIST_ORGANIZATION_MEMBERS = 13;
  private static final int METHODID_CREATE_ORGANIZATION_INVITE = 14;
  private static final int METHODID_UPDATE_ORGANIZATION_INVITE_AUTHORIZATIONS = 15;
  private static final int METHODID_DELETE_ORGANIZATION_MEMBER = 16;
  private static final int METHODID_DELETE_ORGANIZATION_INVITE = 17;
  private static final int METHODID_RESEND_ORGANIZATION_INVITE = 18;
  private static final int METHODID_ENABLE_BILLING_SERVICE = 19;
  private static final int METHODID_DISABLE_BILLING_SERVICE = 20;
  private static final int METHODID_UPDATE_BILLING_SERVICE = 21;
  private static final int METHODID_GET_BILLING_SERVICE_CONFIG = 22;
  private static final int METHODID_ORGANIZATION_SET_SUPPORT_EMAIL = 23;
  private static final int METHODID_ORGANIZATION_GET_SUPPORT_EMAIL = 24;
  private static final int METHODID_ORGANIZATION_SET_LOGO = 25;
  private static final int METHODID_ORGANIZATION_GET_LOGO = 26;
  private static final int METHODID_ENABLE_AUTH_SERVICE = 27;
  private static final int METHODID_DISABLE_AUTH_SERVICE = 28;
  private static final int METHODID_CREATE_OAUTH_APP = 29;
  private static final int METHODID_READ_OAUTH_APP = 30;
  private static final int METHODID_UPDATE_OAUTH_APP = 31;
  private static final int METHODID_DELETE_OAUTH_APP = 32;
  private static final int METHODID_LIST_OAUTH_APPS = 33;
  private static final int METHODID_CREATE_LOCATION = 34;
  private static final int METHODID_GET_LOCATION = 35;
  private static final int METHODID_UPDATE_LOCATION = 36;
  private static final int METHODID_DELETE_LOCATION = 37;
  private static final int METHODID_GET_LOCATION_METADATA = 38;
  private static final int METHODID_UPDATE_LOCATION_METADATA = 39;
  private static final int METHODID_LIST_LOCATIONS = 40;
  private static final int METHODID_SHARE_LOCATION = 41;
  private static final int METHODID_UNSHARE_LOCATION = 42;
  private static final int METHODID_LOCATION_AUTH = 43;
  private static final int METHODID_CREATE_LOCATION_SECRET = 44;
  private static final int METHODID_DELETE_LOCATION_SECRET = 45;
  private static final int METHODID_GET_ROBOT = 46;
  private static final int METHODID_GET_ROBOT_METADATA = 47;
  private static final int METHODID_UPDATE_ROBOT_METADATA = 48;
  private static final int METHODID_GET_ROVER_RENTAL_ROBOTS = 49;
  private static final int METHODID_GET_ROBOT_PARTS = 50;
  private static final int METHODID_GET_ROBOT_PART = 51;
  private static final int METHODID_GET_ROBOT_PART_BY_NAME_AND_LOCATION = 52;
  private static final int METHODID_GET_ROBOT_PART_LOGS = 53;
  private static final int METHODID_TAIL_ROBOT_PART_LOGS = 54;
  private static final int METHODID_GET_ROBOT_PART_HISTORY = 55;
  private static final int METHODID_UPDATE_ROBOT_PART = 56;
  private static final int METHODID_NEW_ROBOT_PART = 57;
  private static final int METHODID_DELETE_ROBOT_PART = 58;
  private static final int METHODID_GET_ROBOT_PART_METADATA = 59;
  private static final int METHODID_UPDATE_ROBOT_PART_METADATA = 60;
  private static final int METHODID_GET_ROBOT_APIKEYS = 61;
  private static final int METHODID_MARK_PART_AS_MAIN = 62;
  private static final int METHODID_MARK_PART_FOR_RESTART = 63;
  private static final int METHODID_CREATE_ROBOT_PART_SECRET = 64;
  private static final int METHODID_DELETE_ROBOT_PART_SECRET = 65;
  private static final int METHODID_LIST_ROBOTS = 66;
  private static final int METHODID_NEW_ROBOT = 67;
  private static final int METHODID_UPDATE_ROBOT = 68;
  private static final int METHODID_DELETE_ROBOT = 69;
  private static final int METHODID_LIST_FRAGMENTS = 70;
  private static final int METHODID_GET_FRAGMENT = 71;
  private static final int METHODID_CREATE_FRAGMENT = 72;
  private static final int METHODID_UPDATE_FRAGMENT = 73;
  private static final int METHODID_DELETE_FRAGMENT = 74;
  private static final int METHODID_LIST_NESTED_FRAGMENTS = 75;
  private static final int METHODID_LIST_MACHINE_FRAGMENTS = 76;
  private static final int METHODID_LIST_MACHINE_SUMMARIES = 77;
  private static final int METHODID_GET_FRAGMENT_HISTORY = 78;
  private static final int METHODID_GET_FRAGMENT_USAGE = 79;
  private static final int METHODID_SET_FRAGMENT_TAG = 80;
  private static final int METHODID_DELETE_FRAGMENT_TAG = 81;
  private static final int METHODID_ADD_ROLE = 82;
  private static final int METHODID_REMOVE_ROLE = 83;
  private static final int METHODID_CHANGE_ROLE = 84;
  private static final int METHODID_LIST_AUTHORIZATIONS = 85;
  private static final int METHODID_CHECK_PERMISSIONS = 86;
  private static final int METHODID_GET_REGISTRY_ITEM = 87;
  private static final int METHODID_CREATE_REGISTRY_ITEM = 88;
  private static final int METHODID_UPDATE_REGISTRY_ITEM = 89;
  private static final int METHODID_LIST_REGISTRY_ITEMS = 90;
  private static final int METHODID_DELETE_REGISTRY_ITEM = 91;
  private static final int METHODID_RENAME_REGISTRY_ITEM = 92;
  private static final int METHODID_TRANSFER_REGISTRY_ITEM = 93;
  private static final int METHODID_CREATE_MODULE = 94;
  private static final int METHODID_UPDATE_MODULE = 95;
  private static final int METHODID_GET_MODULE = 96;
  private static final int METHODID_LIST_MODULES = 97;
  private static final int METHODID_CREATE_KEY = 98;
  private static final int METHODID_DELETE_KEY = 99;
  private static final int METHODID_LIST_KEYS = 100;
  private static final int METHODID_RENAME_KEY = 101;
  private static final int METHODID_ROTATE_KEY = 102;
  private static final int METHODID_CREATE_KEY_FROM_EXISTING_KEY_AUTHORIZATIONS = 103;
  private static final int METHODID_GET_APP_CONTENT = 104;
  private static final int METHODID_UPLOAD_MODULE_FILE = 105;

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
        case METHODID_GET_USER_IDBY_EMAIL:
          serviceImpl.getUserIDByEmail((viam.app.v1.AppOuterClass.GetUserIDByEmailRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetUserIDByEmailResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORGANIZATION:
          serviceImpl.createOrganization((viam.app.v1.AppOuterClass.CreateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateOrganizationResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATIONS:
          serviceImpl.listOrganizations((viam.app.v1.AppOuterClass.ListOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListOrganizationsResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATIONS_WITH_ACCESS_TO_LOCATION:
          serviceImpl.getOrganizationsWithAccessToLocation((viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATIONS_BY_USER:
          serviceImpl.listOrganizationsByUser((viam.app.v1.AppOuterClass.ListOrganizationsByUserRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListOrganizationsByUserResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ORGANIZATIONS:
          serviceImpl.searchOrganizations((viam.app.v1.AppOuterClass.SearchOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.SearchOrganizationsResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION:
          serviceImpl.getOrganization((viam.app.v1.AppOuterClass.GetOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetOrganizationResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_NAMESPACE_AVAILABILITY:
          serviceImpl.getOrganizationNamespaceAvailability((viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION:
          serviceImpl.updateOrganization((viam.app.v1.AppOuterClass.UpdateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOrganizationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION_NAMESPACE:
          serviceImpl.updateOrganizationNamespace((viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORGANIZATION:
          serviceImpl.deleteOrganization((viam.app.v1.AppOuterClass.DeleteOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteOrganizationResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_METADATA:
          serviceImpl.getOrganizationMetadata((viam.app.v1.AppOuterClass.GetOrganizationMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetOrganizationMetadataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION_METADATA:
          serviceImpl.updateOrganizationMetadata((viam.app.v1.AppOuterClass.UpdateOrganizationMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOrganizationMetadataResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATION_MEMBERS:
          serviceImpl.listOrganizationMembers((viam.app.v1.AppOuterClass.ListOrganizationMembersRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListOrganizationMembersResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORGANIZATION_INVITE:
          serviceImpl.createOrganizationInvite((viam.app.v1.AppOuterClass.CreateOrganizationInviteRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateOrganizationInviteResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION_INVITE_AUTHORIZATIONS:
          serviceImpl.updateOrganizationInviteAuthorizations((viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORGANIZATION_MEMBER:
          serviceImpl.deleteOrganizationMember((viam.app.v1.AppOuterClass.DeleteOrganizationMemberRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteOrganizationMemberResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORGANIZATION_INVITE:
          serviceImpl.deleteOrganizationInvite((viam.app.v1.AppOuterClass.DeleteOrganizationInviteRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteOrganizationInviteResponse>) responseObserver);
          break;
        case METHODID_RESEND_ORGANIZATION_INVITE:
          serviceImpl.resendOrganizationInvite((viam.app.v1.AppOuterClass.ResendOrganizationInviteRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ResendOrganizationInviteResponse>) responseObserver);
          break;
        case METHODID_ENABLE_BILLING_SERVICE:
          serviceImpl.enableBillingService((viam.app.v1.AppOuterClass.EnableBillingServiceRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.EnableBillingServiceResponse>) responseObserver);
          break;
        case METHODID_DISABLE_BILLING_SERVICE:
          serviceImpl.disableBillingService((viam.app.v1.AppOuterClass.DisableBillingServiceRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DisableBillingServiceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BILLING_SERVICE:
          serviceImpl.updateBillingService((viam.app.v1.AppOuterClass.UpdateBillingServiceRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateBillingServiceResponse>) responseObserver);
          break;
        case METHODID_GET_BILLING_SERVICE_CONFIG:
          serviceImpl.getBillingServiceConfig((viam.app.v1.AppOuterClass.GetBillingServiceConfigRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetBillingServiceConfigResponse>) responseObserver);
          break;
        case METHODID_ORGANIZATION_SET_SUPPORT_EMAIL:
          serviceImpl.organizationSetSupportEmail((viam.app.v1.AppOuterClass.OrganizationSetSupportEmailRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.OrganizationSetSupportEmailResponse>) responseObserver);
          break;
        case METHODID_ORGANIZATION_GET_SUPPORT_EMAIL:
          serviceImpl.organizationGetSupportEmail((viam.app.v1.AppOuterClass.OrganizationGetSupportEmailRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.OrganizationGetSupportEmailResponse>) responseObserver);
          break;
        case METHODID_ORGANIZATION_SET_LOGO:
          serviceImpl.organizationSetLogo((viam.app.v1.AppOuterClass.OrganizationSetLogoRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.OrganizationSetLogoResponse>) responseObserver);
          break;
        case METHODID_ORGANIZATION_GET_LOGO:
          serviceImpl.organizationGetLogo((viam.app.v1.AppOuterClass.OrganizationGetLogoRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.OrganizationGetLogoResponse>) responseObserver);
          break;
        case METHODID_ENABLE_AUTH_SERVICE:
          serviceImpl.enableAuthService((viam.app.v1.AppOuterClass.EnableAuthServiceRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.EnableAuthServiceResponse>) responseObserver);
          break;
        case METHODID_DISABLE_AUTH_SERVICE:
          serviceImpl.disableAuthService((viam.app.v1.AppOuterClass.DisableAuthServiceRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DisableAuthServiceResponse>) responseObserver);
          break;
        case METHODID_CREATE_OAUTH_APP:
          serviceImpl.createOAuthApp((viam.app.v1.AppOuterClass.CreateOAuthAppRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateOAuthAppResponse>) responseObserver);
          break;
        case METHODID_READ_OAUTH_APP:
          serviceImpl.readOAuthApp((viam.app.v1.AppOuterClass.ReadOAuthAppRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ReadOAuthAppResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OAUTH_APP:
          serviceImpl.updateOAuthApp((viam.app.v1.AppOuterClass.UpdateOAuthAppRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateOAuthAppResponse>) responseObserver);
          break;
        case METHODID_DELETE_OAUTH_APP:
          serviceImpl.deleteOAuthApp((viam.app.v1.AppOuterClass.DeleteOAuthAppRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteOAuthAppResponse>) responseObserver);
          break;
        case METHODID_LIST_OAUTH_APPS:
          serviceImpl.listOAuthApps((viam.app.v1.AppOuterClass.ListOAuthAppsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListOAuthAppsResponse>) responseObserver);
          break;
        case METHODID_CREATE_LOCATION:
          serviceImpl.createLocation((viam.app.v1.AppOuterClass.CreateLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateLocationResponse>) responseObserver);
          break;
        case METHODID_GET_LOCATION:
          serviceImpl.getLocation((viam.app.v1.AppOuterClass.GetLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetLocationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LOCATION:
          serviceImpl.updateLocation((viam.app.v1.AppOuterClass.UpdateLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateLocationResponse>) responseObserver);
          break;
        case METHODID_DELETE_LOCATION:
          serviceImpl.deleteLocation((viam.app.v1.AppOuterClass.DeleteLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteLocationResponse>) responseObserver);
          break;
        case METHODID_GET_LOCATION_METADATA:
          serviceImpl.getLocationMetadata((viam.app.v1.AppOuterClass.GetLocationMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetLocationMetadataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LOCATION_METADATA:
          serviceImpl.updateLocationMetadata((viam.app.v1.AppOuterClass.UpdateLocationMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateLocationMetadataResponse>) responseObserver);
          break;
        case METHODID_LIST_LOCATIONS:
          serviceImpl.listLocations((viam.app.v1.AppOuterClass.ListLocationsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListLocationsResponse>) responseObserver);
          break;
        case METHODID_SHARE_LOCATION:
          serviceImpl.shareLocation((viam.app.v1.AppOuterClass.ShareLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ShareLocationResponse>) responseObserver);
          break;
        case METHODID_UNSHARE_LOCATION:
          serviceImpl.unshareLocation((viam.app.v1.AppOuterClass.UnshareLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UnshareLocationResponse>) responseObserver);
          break;
        case METHODID_LOCATION_AUTH:
          serviceImpl.locationAuth((viam.app.v1.AppOuterClass.LocationAuthRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.LocationAuthResponse>) responseObserver);
          break;
        case METHODID_CREATE_LOCATION_SECRET:
          serviceImpl.createLocationSecret((viam.app.v1.AppOuterClass.CreateLocationSecretRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateLocationSecretResponse>) responseObserver);
          break;
        case METHODID_DELETE_LOCATION_SECRET:
          serviceImpl.deleteLocationSecret((viam.app.v1.AppOuterClass.DeleteLocationSecretRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteLocationSecretResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT:
          serviceImpl.getRobot((viam.app.v1.AppOuterClass.GetRobotRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT_METADATA:
          serviceImpl.getRobotMetadata((viam.app.v1.AppOuterClass.GetRobotMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotMetadataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROBOT_METADATA:
          serviceImpl.updateRobotMetadata((viam.app.v1.AppOuterClass.UpdateRobotMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRobotMetadataResponse>) responseObserver);
          break;
        case METHODID_GET_ROVER_RENTAL_ROBOTS:
          serviceImpl.getRoverRentalRobots((viam.app.v1.AppOuterClass.GetRoverRentalRobotsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRoverRentalRobotsResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT_PARTS:
          serviceImpl.getRobotParts((viam.app.v1.AppOuterClass.GetRobotPartsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartsResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT_PART:
          serviceImpl.getRobotPart((viam.app.v1.AppOuterClass.GetRobotPartRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT_PART_BY_NAME_AND_LOCATION:
          serviceImpl.getRobotPartByNameAndLocation((viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT_PART_LOGS:
          serviceImpl.getRobotPartLogs((viam.app.v1.AppOuterClass.GetRobotPartLogsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartLogsResponse>) responseObserver);
          break;
        case METHODID_TAIL_ROBOT_PART_LOGS:
          serviceImpl.tailRobotPartLogs((viam.app.v1.AppOuterClass.TailRobotPartLogsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.TailRobotPartLogsResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT_PART_HISTORY:
          serviceImpl.getRobotPartHistory((viam.app.v1.AppOuterClass.GetRobotPartHistoryRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartHistoryResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROBOT_PART:
          serviceImpl.updateRobotPart((viam.app.v1.AppOuterClass.UpdateRobotPartRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRobotPartResponse>) responseObserver);
          break;
        case METHODID_NEW_ROBOT_PART:
          serviceImpl.newRobotPart((viam.app.v1.AppOuterClass.NewRobotPartRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.NewRobotPartResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROBOT_PART:
          serviceImpl.deleteRobotPart((viam.app.v1.AppOuterClass.DeleteRobotPartRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteRobotPartResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT_PART_METADATA:
          serviceImpl.getRobotPartMetadata((viam.app.v1.AppOuterClass.GetRobotPartMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotPartMetadataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROBOT_PART_METADATA:
          serviceImpl.updateRobotPartMetadata((viam.app.v1.AppOuterClass.UpdateRobotPartMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRobotPartMetadataResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT_APIKEYS:
          serviceImpl.getRobotAPIKeys((viam.app.v1.AppOuterClass.GetRobotAPIKeysRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRobotAPIKeysResponse>) responseObserver);
          break;
        case METHODID_MARK_PART_AS_MAIN:
          serviceImpl.markPartAsMain((viam.app.v1.AppOuterClass.MarkPartAsMainRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.MarkPartAsMainResponse>) responseObserver);
          break;
        case METHODID_MARK_PART_FOR_RESTART:
          serviceImpl.markPartForRestart((viam.app.v1.AppOuterClass.MarkPartForRestartRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.MarkPartForRestartResponse>) responseObserver);
          break;
        case METHODID_CREATE_ROBOT_PART_SECRET:
          serviceImpl.createRobotPartSecret((viam.app.v1.AppOuterClass.CreateRobotPartSecretRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateRobotPartSecretResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROBOT_PART_SECRET:
          serviceImpl.deleteRobotPartSecret((viam.app.v1.AppOuterClass.DeleteRobotPartSecretRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteRobotPartSecretResponse>) responseObserver);
          break;
        case METHODID_LIST_ROBOTS:
          serviceImpl.listRobots((viam.app.v1.AppOuterClass.ListRobotsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListRobotsResponse>) responseObserver);
          break;
        case METHODID_NEW_ROBOT:
          serviceImpl.newRobot((viam.app.v1.AppOuterClass.NewRobotRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.NewRobotResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROBOT:
          serviceImpl.updateRobot((viam.app.v1.AppOuterClass.UpdateRobotRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRobotResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROBOT:
          serviceImpl.deleteRobot((viam.app.v1.AppOuterClass.DeleteRobotRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteRobotResponse>) responseObserver);
          break;
        case METHODID_LIST_FRAGMENTS:
          serviceImpl.listFragments((viam.app.v1.AppOuterClass.ListFragmentsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListFragmentsResponse>) responseObserver);
          break;
        case METHODID_GET_FRAGMENT:
          serviceImpl.getFragment((viam.app.v1.AppOuterClass.GetFragmentRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetFragmentResponse>) responseObserver);
          break;
        case METHODID_CREATE_FRAGMENT:
          serviceImpl.createFragment((viam.app.v1.AppOuterClass.CreateFragmentRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateFragmentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FRAGMENT:
          serviceImpl.updateFragment((viam.app.v1.AppOuterClass.UpdateFragmentRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateFragmentResponse>) responseObserver);
          break;
        case METHODID_DELETE_FRAGMENT:
          serviceImpl.deleteFragment((viam.app.v1.AppOuterClass.DeleteFragmentRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteFragmentResponse>) responseObserver);
          break;
        case METHODID_LIST_NESTED_FRAGMENTS:
          serviceImpl.listNestedFragments((viam.app.v1.AppOuterClass.ListNestedFragmentsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListNestedFragmentsResponse>) responseObserver);
          break;
        case METHODID_LIST_MACHINE_FRAGMENTS:
          serviceImpl.listMachineFragments((viam.app.v1.AppOuterClass.ListMachineFragmentsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListMachineFragmentsResponse>) responseObserver);
          break;
        case METHODID_LIST_MACHINE_SUMMARIES:
          serviceImpl.listMachineSummaries((viam.app.v1.AppOuterClass.ListMachineSummariesRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListMachineSummariesResponse>) responseObserver);
          break;
        case METHODID_GET_FRAGMENT_HISTORY:
          serviceImpl.getFragmentHistory((viam.app.v1.AppOuterClass.GetFragmentHistoryRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetFragmentHistoryResponse>) responseObserver);
          break;
        case METHODID_GET_FRAGMENT_USAGE:
          serviceImpl.getFragmentUsage((viam.app.v1.AppOuterClass.GetFragmentUsageRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetFragmentUsageResponse>) responseObserver);
          break;
        case METHODID_SET_FRAGMENT_TAG:
          serviceImpl.setFragmentTag((viam.app.v1.AppOuterClass.SetFragmentTagRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.SetFragmentTagResponse>) responseObserver);
          break;
        case METHODID_DELETE_FRAGMENT_TAG:
          serviceImpl.deleteFragmentTag((viam.app.v1.AppOuterClass.DeleteFragmentTagRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteFragmentTagResponse>) responseObserver);
          break;
        case METHODID_ADD_ROLE:
          serviceImpl.addRole((viam.app.v1.AppOuterClass.AddRoleRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.AddRoleResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ROLE:
          serviceImpl.removeRole((viam.app.v1.AppOuterClass.RemoveRoleRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.RemoveRoleResponse>) responseObserver);
          break;
        case METHODID_CHANGE_ROLE:
          serviceImpl.changeRole((viam.app.v1.AppOuterClass.ChangeRoleRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ChangeRoleResponse>) responseObserver);
          break;
        case METHODID_LIST_AUTHORIZATIONS:
          serviceImpl.listAuthorizations((viam.app.v1.AppOuterClass.ListAuthorizationsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListAuthorizationsResponse>) responseObserver);
          break;
        case METHODID_CHECK_PERMISSIONS:
          serviceImpl.checkPermissions((viam.app.v1.AppOuterClass.CheckPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CheckPermissionsResponse>) responseObserver);
          break;
        case METHODID_GET_REGISTRY_ITEM:
          serviceImpl.getRegistryItem((viam.app.v1.AppOuterClass.GetRegistryItemRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetRegistryItemResponse>) responseObserver);
          break;
        case METHODID_CREATE_REGISTRY_ITEM:
          serviceImpl.createRegistryItem((viam.app.v1.AppOuterClass.CreateRegistryItemRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateRegistryItemResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REGISTRY_ITEM:
          serviceImpl.updateRegistryItem((viam.app.v1.AppOuterClass.UpdateRegistryItemRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateRegistryItemResponse>) responseObserver);
          break;
        case METHODID_LIST_REGISTRY_ITEMS:
          serviceImpl.listRegistryItems((viam.app.v1.AppOuterClass.ListRegistryItemsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListRegistryItemsResponse>) responseObserver);
          break;
        case METHODID_DELETE_REGISTRY_ITEM:
          serviceImpl.deleteRegistryItem((viam.app.v1.AppOuterClass.DeleteRegistryItemRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteRegistryItemResponse>) responseObserver);
          break;
        case METHODID_RENAME_REGISTRY_ITEM:
          serviceImpl.renameRegistryItem((viam.app.v1.AppOuterClass.RenameRegistryItemRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.RenameRegistryItemResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_REGISTRY_ITEM:
          serviceImpl.transferRegistryItem((viam.app.v1.AppOuterClass.TransferRegistryItemRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.TransferRegistryItemResponse>) responseObserver);
          break;
        case METHODID_CREATE_MODULE:
          serviceImpl.createModule((viam.app.v1.AppOuterClass.CreateModuleRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateModuleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MODULE:
          serviceImpl.updateModule((viam.app.v1.AppOuterClass.UpdateModuleRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UpdateModuleResponse>) responseObserver);
          break;
        case METHODID_GET_MODULE:
          serviceImpl.getModule((viam.app.v1.AppOuterClass.GetModuleRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetModuleResponse>) responseObserver);
          break;
        case METHODID_LIST_MODULES:
          serviceImpl.listModules((viam.app.v1.AppOuterClass.ListModulesRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListModulesResponse>) responseObserver);
          break;
        case METHODID_CREATE_KEY:
          serviceImpl.createKey((viam.app.v1.AppOuterClass.CreateKeyRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateKeyResponse>) responseObserver);
          break;
        case METHODID_DELETE_KEY:
          serviceImpl.deleteKey((viam.app.v1.AppOuterClass.DeleteKeyRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.DeleteKeyResponse>) responseObserver);
          break;
        case METHODID_LIST_KEYS:
          serviceImpl.listKeys((viam.app.v1.AppOuterClass.ListKeysRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.ListKeysResponse>) responseObserver);
          break;
        case METHODID_RENAME_KEY:
          serviceImpl.renameKey((viam.app.v1.AppOuterClass.RenameKeyRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.RenameKeyResponse>) responseObserver);
          break;
        case METHODID_ROTATE_KEY:
          serviceImpl.rotateKey((viam.app.v1.AppOuterClass.RotateKeyRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.RotateKeyResponse>) responseObserver);
          break;
        case METHODID_CREATE_KEY_FROM_EXISTING_KEY_AUTHORIZATIONS:
          serviceImpl.createKeyFromExistingKeyAuthorizations((viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsResponse>) responseObserver);
          break;
        case METHODID_GET_APP_CONTENT:
          serviceImpl.getAppContent((viam.app.v1.AppOuterClass.GetAppContentRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.GetAppContentResponse>) responseObserver);
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
        case METHODID_UPLOAD_MODULE_FILE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadModuleFile(
              (io.grpc.stub.StreamObserver<viam.app.v1.AppOuterClass.UploadModuleFileResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetUserIDByEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetUserIDByEmailRequest,
              viam.app.v1.AppOuterClass.GetUserIDByEmailResponse>(
                service, METHODID_GET_USER_IDBY_EMAIL)))
        .addMethod(
          getCreateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.CreateOrganizationRequest,
              viam.app.v1.AppOuterClass.CreateOrganizationResponse>(
                service, METHODID_CREATE_ORGANIZATION)))
        .addMethod(
          getListOrganizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListOrganizationsRequest,
              viam.app.v1.AppOuterClass.ListOrganizationsResponse>(
                service, METHODID_LIST_ORGANIZATIONS)))
        .addMethod(
          getGetOrganizationsWithAccessToLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationRequest,
              viam.app.v1.AppOuterClass.GetOrganizationsWithAccessToLocationResponse>(
                service, METHODID_GET_ORGANIZATIONS_WITH_ACCESS_TO_LOCATION)))
        .addMethod(
          getListOrganizationsByUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListOrganizationsByUserRequest,
              viam.app.v1.AppOuterClass.ListOrganizationsByUserResponse>(
                service, METHODID_LIST_ORGANIZATIONS_BY_USER)))
        .addMethod(
          getSearchOrganizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.SearchOrganizationsRequest,
              viam.app.v1.AppOuterClass.SearchOrganizationsResponse>(
                service, METHODID_SEARCH_ORGANIZATIONS)))
        .addMethod(
          getGetOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetOrganizationRequest,
              viam.app.v1.AppOuterClass.GetOrganizationResponse>(
                service, METHODID_GET_ORGANIZATION)))
        .addMethod(
          getGetOrganizationNamespaceAvailabilityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityRequest,
              viam.app.v1.AppOuterClass.GetOrganizationNamespaceAvailabilityResponse>(
                service, METHODID_GET_ORGANIZATION_NAMESPACE_AVAILABILITY)))
        .addMethod(
          getUpdateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateOrganizationRequest,
              viam.app.v1.AppOuterClass.UpdateOrganizationResponse>(
                service, METHODID_UPDATE_ORGANIZATION)))
        .addMethod(
          getUpdateOrganizationNamespaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceRequest,
              viam.app.v1.AppOuterClass.UpdateOrganizationNamespaceResponse>(
                service, METHODID_UPDATE_ORGANIZATION_NAMESPACE)))
        .addMethod(
          getDeleteOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DeleteOrganizationRequest,
              viam.app.v1.AppOuterClass.DeleteOrganizationResponse>(
                service, METHODID_DELETE_ORGANIZATION)))
        .addMethod(
          getGetOrganizationMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetOrganizationMetadataRequest,
              viam.app.v1.AppOuterClass.GetOrganizationMetadataResponse>(
                service, METHODID_GET_ORGANIZATION_METADATA)))
        .addMethod(
          getUpdateOrganizationMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateOrganizationMetadataRequest,
              viam.app.v1.AppOuterClass.UpdateOrganizationMetadataResponse>(
                service, METHODID_UPDATE_ORGANIZATION_METADATA)))
        .addMethod(
          getListOrganizationMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListOrganizationMembersRequest,
              viam.app.v1.AppOuterClass.ListOrganizationMembersResponse>(
                service, METHODID_LIST_ORGANIZATION_MEMBERS)))
        .addMethod(
          getCreateOrganizationInviteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.CreateOrganizationInviteRequest,
              viam.app.v1.AppOuterClass.CreateOrganizationInviteResponse>(
                service, METHODID_CREATE_ORGANIZATION_INVITE)))
        .addMethod(
          getUpdateOrganizationInviteAuthorizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsRequest,
              viam.app.v1.AppOuterClass.UpdateOrganizationInviteAuthorizationsResponse>(
                service, METHODID_UPDATE_ORGANIZATION_INVITE_AUTHORIZATIONS)))
        .addMethod(
          getDeleteOrganizationMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DeleteOrganizationMemberRequest,
              viam.app.v1.AppOuterClass.DeleteOrganizationMemberResponse>(
                service, METHODID_DELETE_ORGANIZATION_MEMBER)))
        .addMethod(
          getDeleteOrganizationInviteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DeleteOrganizationInviteRequest,
              viam.app.v1.AppOuterClass.DeleteOrganizationInviteResponse>(
                service, METHODID_DELETE_ORGANIZATION_INVITE)))
        .addMethod(
          getResendOrganizationInviteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ResendOrganizationInviteRequest,
              viam.app.v1.AppOuterClass.ResendOrganizationInviteResponse>(
                service, METHODID_RESEND_ORGANIZATION_INVITE)))
        .addMethod(
          getEnableBillingServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.EnableBillingServiceRequest,
              viam.app.v1.AppOuterClass.EnableBillingServiceResponse>(
                service, METHODID_ENABLE_BILLING_SERVICE)))
        .addMethod(
          getDisableBillingServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DisableBillingServiceRequest,
              viam.app.v1.AppOuterClass.DisableBillingServiceResponse>(
                service, METHODID_DISABLE_BILLING_SERVICE)))
        .addMethod(
          getUpdateBillingServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateBillingServiceRequest,
              viam.app.v1.AppOuterClass.UpdateBillingServiceResponse>(
                service, METHODID_UPDATE_BILLING_SERVICE)))
        .addMethod(
          getGetBillingServiceConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetBillingServiceConfigRequest,
              viam.app.v1.AppOuterClass.GetBillingServiceConfigResponse>(
                service, METHODID_GET_BILLING_SERVICE_CONFIG)))
        .addMethod(
          getOrganizationSetSupportEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.OrganizationSetSupportEmailRequest,
              viam.app.v1.AppOuterClass.OrganizationSetSupportEmailResponse>(
                service, METHODID_ORGANIZATION_SET_SUPPORT_EMAIL)))
        .addMethod(
          getOrganizationGetSupportEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.OrganizationGetSupportEmailRequest,
              viam.app.v1.AppOuterClass.OrganizationGetSupportEmailResponse>(
                service, METHODID_ORGANIZATION_GET_SUPPORT_EMAIL)))
        .addMethod(
          getOrganizationSetLogoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.OrganizationSetLogoRequest,
              viam.app.v1.AppOuterClass.OrganizationSetLogoResponse>(
                service, METHODID_ORGANIZATION_SET_LOGO)))
        .addMethod(
          getOrganizationGetLogoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.OrganizationGetLogoRequest,
              viam.app.v1.AppOuterClass.OrganizationGetLogoResponse>(
                service, METHODID_ORGANIZATION_GET_LOGO)))
        .addMethod(
          getEnableAuthServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.EnableAuthServiceRequest,
              viam.app.v1.AppOuterClass.EnableAuthServiceResponse>(
                service, METHODID_ENABLE_AUTH_SERVICE)))
        .addMethod(
          getDisableAuthServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DisableAuthServiceRequest,
              viam.app.v1.AppOuterClass.DisableAuthServiceResponse>(
                service, METHODID_DISABLE_AUTH_SERVICE)))
        .addMethod(
          getCreateOAuthAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.CreateOAuthAppRequest,
              viam.app.v1.AppOuterClass.CreateOAuthAppResponse>(
                service, METHODID_CREATE_OAUTH_APP)))
        .addMethod(
          getReadOAuthAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ReadOAuthAppRequest,
              viam.app.v1.AppOuterClass.ReadOAuthAppResponse>(
                service, METHODID_READ_OAUTH_APP)))
        .addMethod(
          getUpdateOAuthAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateOAuthAppRequest,
              viam.app.v1.AppOuterClass.UpdateOAuthAppResponse>(
                service, METHODID_UPDATE_OAUTH_APP)))
        .addMethod(
          getDeleteOAuthAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DeleteOAuthAppRequest,
              viam.app.v1.AppOuterClass.DeleteOAuthAppResponse>(
                service, METHODID_DELETE_OAUTH_APP)))
        .addMethod(
          getListOAuthAppsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListOAuthAppsRequest,
              viam.app.v1.AppOuterClass.ListOAuthAppsResponse>(
                service, METHODID_LIST_OAUTH_APPS)))
        .addMethod(
          getCreateLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.CreateLocationRequest,
              viam.app.v1.AppOuterClass.CreateLocationResponse>(
                service, METHODID_CREATE_LOCATION)))
        .addMethod(
          getGetLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetLocationRequest,
              viam.app.v1.AppOuterClass.GetLocationResponse>(
                service, METHODID_GET_LOCATION)))
        .addMethod(
          getUpdateLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateLocationRequest,
              viam.app.v1.AppOuterClass.UpdateLocationResponse>(
                service, METHODID_UPDATE_LOCATION)))
        .addMethod(
          getDeleteLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DeleteLocationRequest,
              viam.app.v1.AppOuterClass.DeleteLocationResponse>(
                service, METHODID_DELETE_LOCATION)))
        .addMethod(
          getGetLocationMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetLocationMetadataRequest,
              viam.app.v1.AppOuterClass.GetLocationMetadataResponse>(
                service, METHODID_GET_LOCATION_METADATA)))
        .addMethod(
          getUpdateLocationMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateLocationMetadataRequest,
              viam.app.v1.AppOuterClass.UpdateLocationMetadataResponse>(
                service, METHODID_UPDATE_LOCATION_METADATA)))
        .addMethod(
          getListLocationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListLocationsRequest,
              viam.app.v1.AppOuterClass.ListLocationsResponse>(
                service, METHODID_LIST_LOCATIONS)))
        .addMethod(
          getShareLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ShareLocationRequest,
              viam.app.v1.AppOuterClass.ShareLocationResponse>(
                service, METHODID_SHARE_LOCATION)))
        .addMethod(
          getUnshareLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UnshareLocationRequest,
              viam.app.v1.AppOuterClass.UnshareLocationResponse>(
                service, METHODID_UNSHARE_LOCATION)))
        .addMethod(
          getLocationAuthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.LocationAuthRequest,
              viam.app.v1.AppOuterClass.LocationAuthResponse>(
                service, METHODID_LOCATION_AUTH)))
        .addMethod(
          getCreateLocationSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.CreateLocationSecretRequest,
              viam.app.v1.AppOuterClass.CreateLocationSecretResponse>(
                service, METHODID_CREATE_LOCATION_SECRET)))
        .addMethod(
          getDeleteLocationSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DeleteLocationSecretRequest,
              viam.app.v1.AppOuterClass.DeleteLocationSecretResponse>(
                service, METHODID_DELETE_LOCATION_SECRET)))
        .addMethod(
          getGetRobotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetRobotRequest,
              viam.app.v1.AppOuterClass.GetRobotResponse>(
                service, METHODID_GET_ROBOT)))
        .addMethod(
          getGetRobotMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetRobotMetadataRequest,
              viam.app.v1.AppOuterClass.GetRobotMetadataResponse>(
                service, METHODID_GET_ROBOT_METADATA)))
        .addMethod(
          getUpdateRobotMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateRobotMetadataRequest,
              viam.app.v1.AppOuterClass.UpdateRobotMetadataResponse>(
                service, METHODID_UPDATE_ROBOT_METADATA)))
        .addMethod(
          getGetRoverRentalRobotsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetRoverRentalRobotsRequest,
              viam.app.v1.AppOuterClass.GetRoverRentalRobotsResponse>(
                service, METHODID_GET_ROVER_RENTAL_ROBOTS)))
        .addMethod(
          getGetRobotPartsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetRobotPartsRequest,
              viam.app.v1.AppOuterClass.GetRobotPartsResponse>(
                service, METHODID_GET_ROBOT_PARTS)))
        .addMethod(
          getGetRobotPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetRobotPartRequest,
              viam.app.v1.AppOuterClass.GetRobotPartResponse>(
                service, METHODID_GET_ROBOT_PART)))
        .addMethod(
          getGetRobotPartByNameAndLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationRequest,
              viam.app.v1.AppOuterClass.GetRobotPartByNameAndLocationResponse>(
                service, METHODID_GET_ROBOT_PART_BY_NAME_AND_LOCATION)))
        .addMethod(
          getGetRobotPartLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetRobotPartLogsRequest,
              viam.app.v1.AppOuterClass.GetRobotPartLogsResponse>(
                service, METHODID_GET_ROBOT_PART_LOGS)))
        .addMethod(
          getTailRobotPartLogsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.TailRobotPartLogsRequest,
              viam.app.v1.AppOuterClass.TailRobotPartLogsResponse>(
                service, METHODID_TAIL_ROBOT_PART_LOGS)))
        .addMethod(
          getGetRobotPartHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetRobotPartHistoryRequest,
              viam.app.v1.AppOuterClass.GetRobotPartHistoryResponse>(
                service, METHODID_GET_ROBOT_PART_HISTORY)))
        .addMethod(
          getUpdateRobotPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateRobotPartRequest,
              viam.app.v1.AppOuterClass.UpdateRobotPartResponse>(
                service, METHODID_UPDATE_ROBOT_PART)))
        .addMethod(
          getNewRobotPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.NewRobotPartRequest,
              viam.app.v1.AppOuterClass.NewRobotPartResponse>(
                service, METHODID_NEW_ROBOT_PART)))
        .addMethod(
          getDeleteRobotPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DeleteRobotPartRequest,
              viam.app.v1.AppOuterClass.DeleteRobotPartResponse>(
                service, METHODID_DELETE_ROBOT_PART)))
        .addMethod(
          getGetRobotPartMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetRobotPartMetadataRequest,
              viam.app.v1.AppOuterClass.GetRobotPartMetadataResponse>(
                service, METHODID_GET_ROBOT_PART_METADATA)))
        .addMethod(
          getUpdateRobotPartMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateRobotPartMetadataRequest,
              viam.app.v1.AppOuterClass.UpdateRobotPartMetadataResponse>(
                service, METHODID_UPDATE_ROBOT_PART_METADATA)))
        .addMethod(
          getGetRobotAPIKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetRobotAPIKeysRequest,
              viam.app.v1.AppOuterClass.GetRobotAPIKeysResponse>(
                service, METHODID_GET_ROBOT_APIKEYS)))
        .addMethod(
          getMarkPartAsMainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.MarkPartAsMainRequest,
              viam.app.v1.AppOuterClass.MarkPartAsMainResponse>(
                service, METHODID_MARK_PART_AS_MAIN)))
        .addMethod(
          getMarkPartForRestartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.MarkPartForRestartRequest,
              viam.app.v1.AppOuterClass.MarkPartForRestartResponse>(
                service, METHODID_MARK_PART_FOR_RESTART)))
        .addMethod(
          getCreateRobotPartSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.CreateRobotPartSecretRequest,
              viam.app.v1.AppOuterClass.CreateRobotPartSecretResponse>(
                service, METHODID_CREATE_ROBOT_PART_SECRET)))
        .addMethod(
          getDeleteRobotPartSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DeleteRobotPartSecretRequest,
              viam.app.v1.AppOuterClass.DeleteRobotPartSecretResponse>(
                service, METHODID_DELETE_ROBOT_PART_SECRET)))
        .addMethod(
          getListRobotsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListRobotsRequest,
              viam.app.v1.AppOuterClass.ListRobotsResponse>(
                service, METHODID_LIST_ROBOTS)))
        .addMethod(
          getNewRobotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.NewRobotRequest,
              viam.app.v1.AppOuterClass.NewRobotResponse>(
                service, METHODID_NEW_ROBOT)))
        .addMethod(
          getUpdateRobotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateRobotRequest,
              viam.app.v1.AppOuterClass.UpdateRobotResponse>(
                service, METHODID_UPDATE_ROBOT)))
        .addMethod(
          getDeleteRobotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DeleteRobotRequest,
              viam.app.v1.AppOuterClass.DeleteRobotResponse>(
                service, METHODID_DELETE_ROBOT)))
        .addMethod(
          getListFragmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListFragmentsRequest,
              viam.app.v1.AppOuterClass.ListFragmentsResponse>(
                service, METHODID_LIST_FRAGMENTS)))
        .addMethod(
          getGetFragmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetFragmentRequest,
              viam.app.v1.AppOuterClass.GetFragmentResponse>(
                service, METHODID_GET_FRAGMENT)))
        .addMethod(
          getCreateFragmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.CreateFragmentRequest,
              viam.app.v1.AppOuterClass.CreateFragmentResponse>(
                service, METHODID_CREATE_FRAGMENT)))
        .addMethod(
          getUpdateFragmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateFragmentRequest,
              viam.app.v1.AppOuterClass.UpdateFragmentResponse>(
                service, METHODID_UPDATE_FRAGMENT)))
        .addMethod(
          getDeleteFragmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DeleteFragmentRequest,
              viam.app.v1.AppOuterClass.DeleteFragmentResponse>(
                service, METHODID_DELETE_FRAGMENT)))
        .addMethod(
          getListNestedFragmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListNestedFragmentsRequest,
              viam.app.v1.AppOuterClass.ListNestedFragmentsResponse>(
                service, METHODID_LIST_NESTED_FRAGMENTS)))
        .addMethod(
          getListMachineFragmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListMachineFragmentsRequest,
              viam.app.v1.AppOuterClass.ListMachineFragmentsResponse>(
                service, METHODID_LIST_MACHINE_FRAGMENTS)))
        .addMethod(
          getListMachineSummariesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListMachineSummariesRequest,
              viam.app.v1.AppOuterClass.ListMachineSummariesResponse>(
                service, METHODID_LIST_MACHINE_SUMMARIES)))
        .addMethod(
          getGetFragmentHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetFragmentHistoryRequest,
              viam.app.v1.AppOuterClass.GetFragmentHistoryResponse>(
                service, METHODID_GET_FRAGMENT_HISTORY)))
        .addMethod(
          getGetFragmentUsageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetFragmentUsageRequest,
              viam.app.v1.AppOuterClass.GetFragmentUsageResponse>(
                service, METHODID_GET_FRAGMENT_USAGE)))
        .addMethod(
          getSetFragmentTagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.SetFragmentTagRequest,
              viam.app.v1.AppOuterClass.SetFragmentTagResponse>(
                service, METHODID_SET_FRAGMENT_TAG)))
        .addMethod(
          getDeleteFragmentTagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DeleteFragmentTagRequest,
              viam.app.v1.AppOuterClass.DeleteFragmentTagResponse>(
                service, METHODID_DELETE_FRAGMENT_TAG)))
        .addMethod(
          getAddRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.AddRoleRequest,
              viam.app.v1.AppOuterClass.AddRoleResponse>(
                service, METHODID_ADD_ROLE)))
        .addMethod(
          getRemoveRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.RemoveRoleRequest,
              viam.app.v1.AppOuterClass.RemoveRoleResponse>(
                service, METHODID_REMOVE_ROLE)))
        .addMethod(
          getChangeRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ChangeRoleRequest,
              viam.app.v1.AppOuterClass.ChangeRoleResponse>(
                service, METHODID_CHANGE_ROLE)))
        .addMethod(
          getListAuthorizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListAuthorizationsRequest,
              viam.app.v1.AppOuterClass.ListAuthorizationsResponse>(
                service, METHODID_LIST_AUTHORIZATIONS)))
        .addMethod(
          getCheckPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.CheckPermissionsRequest,
              viam.app.v1.AppOuterClass.CheckPermissionsResponse>(
                service, METHODID_CHECK_PERMISSIONS)))
        .addMethod(
          getGetRegistryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetRegistryItemRequest,
              viam.app.v1.AppOuterClass.GetRegistryItemResponse>(
                service, METHODID_GET_REGISTRY_ITEM)))
        .addMethod(
          getCreateRegistryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.CreateRegistryItemRequest,
              viam.app.v1.AppOuterClass.CreateRegistryItemResponse>(
                service, METHODID_CREATE_REGISTRY_ITEM)))
        .addMethod(
          getUpdateRegistryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateRegistryItemRequest,
              viam.app.v1.AppOuterClass.UpdateRegistryItemResponse>(
                service, METHODID_UPDATE_REGISTRY_ITEM)))
        .addMethod(
          getListRegistryItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListRegistryItemsRequest,
              viam.app.v1.AppOuterClass.ListRegistryItemsResponse>(
                service, METHODID_LIST_REGISTRY_ITEMS)))
        .addMethod(
          getDeleteRegistryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DeleteRegistryItemRequest,
              viam.app.v1.AppOuterClass.DeleteRegistryItemResponse>(
                service, METHODID_DELETE_REGISTRY_ITEM)))
        .addMethod(
          getRenameRegistryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.RenameRegistryItemRequest,
              viam.app.v1.AppOuterClass.RenameRegistryItemResponse>(
                service, METHODID_RENAME_REGISTRY_ITEM)))
        .addMethod(
          getTransferRegistryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.TransferRegistryItemRequest,
              viam.app.v1.AppOuterClass.TransferRegistryItemResponse>(
                service, METHODID_TRANSFER_REGISTRY_ITEM)))
        .addMethod(
          getCreateModuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.CreateModuleRequest,
              viam.app.v1.AppOuterClass.CreateModuleResponse>(
                service, METHODID_CREATE_MODULE)))
        .addMethod(
          getUpdateModuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UpdateModuleRequest,
              viam.app.v1.AppOuterClass.UpdateModuleResponse>(
                service, METHODID_UPDATE_MODULE)))
        .addMethod(
          getUploadModuleFileMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.UploadModuleFileRequest,
              viam.app.v1.AppOuterClass.UploadModuleFileResponse>(
                service, METHODID_UPLOAD_MODULE_FILE)))
        .addMethod(
          getGetModuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetModuleRequest,
              viam.app.v1.AppOuterClass.GetModuleResponse>(
                service, METHODID_GET_MODULE)))
        .addMethod(
          getListModulesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListModulesRequest,
              viam.app.v1.AppOuterClass.ListModulesResponse>(
                service, METHODID_LIST_MODULES)))
        .addMethod(
          getCreateKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.CreateKeyRequest,
              viam.app.v1.AppOuterClass.CreateKeyResponse>(
                service, METHODID_CREATE_KEY)))
        .addMethod(
          getDeleteKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.DeleteKeyRequest,
              viam.app.v1.AppOuterClass.DeleteKeyResponse>(
                service, METHODID_DELETE_KEY)))
        .addMethod(
          getListKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.ListKeysRequest,
              viam.app.v1.AppOuterClass.ListKeysResponse>(
                service, METHODID_LIST_KEYS)))
        .addMethod(
          getRenameKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.RenameKeyRequest,
              viam.app.v1.AppOuterClass.RenameKeyResponse>(
                service, METHODID_RENAME_KEY)))
        .addMethod(
          getRotateKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.RotateKeyRequest,
              viam.app.v1.AppOuterClass.RotateKeyResponse>(
                service, METHODID_ROTATE_KEY)))
        .addMethod(
          getCreateKeyFromExistingKeyAuthorizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsRequest,
              viam.app.v1.AppOuterClass.CreateKeyFromExistingKeyAuthorizationsResponse>(
                service, METHODID_CREATE_KEY_FROM_EXISTING_KEY_AUTHORIZATIONS)))
        .addMethod(
          getGetAppContentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.AppOuterClass.GetAppContentRequest,
              viam.app.v1.AppOuterClass.GetAppContentResponse>(
                service, METHODID_GET_APP_CONTENT)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AppServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetUserIDByEmailMethod())
              .addMethod(getCreateOrganizationMethod())
              .addMethod(getListOrganizationsMethod())
              .addMethod(getGetOrganizationsWithAccessToLocationMethod())
              .addMethod(getListOrganizationsByUserMethod())
              .addMethod(getSearchOrganizationsMethod())
              .addMethod(getGetOrganizationMethod())
              .addMethod(getGetOrganizationNamespaceAvailabilityMethod())
              .addMethod(getUpdateOrganizationMethod())
              .addMethod(getUpdateOrganizationNamespaceMethod())
              .addMethod(getDeleteOrganizationMethod())
              .addMethod(getGetOrganizationMetadataMethod())
              .addMethod(getUpdateOrganizationMetadataMethod())
              .addMethod(getListOrganizationMembersMethod())
              .addMethod(getCreateOrganizationInviteMethod())
              .addMethod(getUpdateOrganizationInviteAuthorizationsMethod())
              .addMethod(getDeleteOrganizationMemberMethod())
              .addMethod(getDeleteOrganizationInviteMethod())
              .addMethod(getResendOrganizationInviteMethod())
              .addMethod(getEnableBillingServiceMethod())
              .addMethod(getDisableBillingServiceMethod())
              .addMethod(getUpdateBillingServiceMethod())
              .addMethod(getGetBillingServiceConfigMethod())
              .addMethod(getOrganizationSetSupportEmailMethod())
              .addMethod(getOrganizationGetSupportEmailMethod())
              .addMethod(getOrganizationSetLogoMethod())
              .addMethod(getOrganizationGetLogoMethod())
              .addMethod(getEnableAuthServiceMethod())
              .addMethod(getDisableAuthServiceMethod())
              .addMethod(getCreateOAuthAppMethod())
              .addMethod(getReadOAuthAppMethod())
              .addMethod(getUpdateOAuthAppMethod())
              .addMethod(getDeleteOAuthAppMethod())
              .addMethod(getListOAuthAppsMethod())
              .addMethod(getCreateLocationMethod())
              .addMethod(getGetLocationMethod())
              .addMethod(getUpdateLocationMethod())
              .addMethod(getDeleteLocationMethod())
              .addMethod(getGetLocationMetadataMethod())
              .addMethod(getUpdateLocationMetadataMethod())
              .addMethod(getListLocationsMethod())
              .addMethod(getShareLocationMethod())
              .addMethod(getUnshareLocationMethod())
              .addMethod(getLocationAuthMethod())
              .addMethod(getCreateLocationSecretMethod())
              .addMethod(getDeleteLocationSecretMethod())
              .addMethod(getGetRobotMethod())
              .addMethod(getGetRobotMetadataMethod())
              .addMethod(getUpdateRobotMetadataMethod())
              .addMethod(getGetRoverRentalRobotsMethod())
              .addMethod(getGetRobotPartsMethod())
              .addMethod(getGetRobotPartMethod())
              .addMethod(getGetRobotPartByNameAndLocationMethod())
              .addMethod(getGetRobotPartLogsMethod())
              .addMethod(getTailRobotPartLogsMethod())
              .addMethod(getGetRobotPartHistoryMethod())
              .addMethod(getUpdateRobotPartMethod())
              .addMethod(getNewRobotPartMethod())
              .addMethod(getDeleteRobotPartMethod())
              .addMethod(getGetRobotPartMetadataMethod())
              .addMethod(getUpdateRobotPartMetadataMethod())
              .addMethod(getGetRobotAPIKeysMethod())
              .addMethod(getMarkPartAsMainMethod())
              .addMethod(getMarkPartForRestartMethod())
              .addMethod(getCreateRobotPartSecretMethod())
              .addMethod(getDeleteRobotPartSecretMethod())
              .addMethod(getListRobotsMethod())
              .addMethod(getNewRobotMethod())
              .addMethod(getUpdateRobotMethod())
              .addMethod(getDeleteRobotMethod())
              .addMethod(getListFragmentsMethod())
              .addMethod(getGetFragmentMethod())
              .addMethod(getCreateFragmentMethod())
              .addMethod(getUpdateFragmentMethod())
              .addMethod(getDeleteFragmentMethod())
              .addMethod(getListNestedFragmentsMethod())
              .addMethod(getListMachineFragmentsMethod())
              .addMethod(getListMachineSummariesMethod())
              .addMethod(getGetFragmentHistoryMethod())
              .addMethod(getGetFragmentUsageMethod())
              .addMethod(getSetFragmentTagMethod())
              .addMethod(getDeleteFragmentTagMethod())
              .addMethod(getAddRoleMethod())
              .addMethod(getRemoveRoleMethod())
              .addMethod(getChangeRoleMethod())
              .addMethod(getListAuthorizationsMethod())
              .addMethod(getCheckPermissionsMethod())
              .addMethod(getGetRegistryItemMethod())
              .addMethod(getCreateRegistryItemMethod())
              .addMethod(getUpdateRegistryItemMethod())
              .addMethod(getListRegistryItemsMethod())
              .addMethod(getDeleteRegistryItemMethod())
              .addMethod(getRenameRegistryItemMethod())
              .addMethod(getTransferRegistryItemMethod())
              .addMethod(getCreateModuleMethod())
              .addMethod(getUpdateModuleMethod())
              .addMethod(getUploadModuleFileMethod())
              .addMethod(getGetModuleMethod())
              .addMethod(getListModulesMethod())
              .addMethod(getCreateKeyMethod())
              .addMethod(getDeleteKeyMethod())
              .addMethod(getListKeysMethod())
              .addMethod(getRenameKeyMethod())
              .addMethod(getRotateKeyMethod())
              .addMethod(getCreateKeyFromExistingKeyAuthorizationsMethod())
              .addMethod(getGetAppContentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
