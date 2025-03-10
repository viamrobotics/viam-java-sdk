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
  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetUserIDByEmailRequest,
      viam.app.v1.App.GetUserIDByEmailResponse> getGetUserIDByEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserIDByEmail",
      requestType = viam.app.v1.App.GetUserIDByEmailRequest.class,
      responseType = viam.app.v1.App.GetUserIDByEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetUserIDByEmailRequest,
      viam.app.v1.App.GetUserIDByEmailResponse> getGetUserIDByEmailMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetUserIDByEmailRequest, viam.app.v1.App.GetUserIDByEmailResponse> getGetUserIDByEmailMethod;
    if ((getGetUserIDByEmailMethod = AppServiceGrpc.getGetUserIDByEmailMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetUserIDByEmailMethod = AppServiceGrpc.getGetUserIDByEmailMethod) == null) {
          AppServiceGrpc.getGetUserIDByEmailMethod = getGetUserIDByEmailMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetUserIDByEmailRequest, viam.app.v1.App.GetUserIDByEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserIDByEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetUserIDByEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetUserIDByEmailResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetUserIDByEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.CreateOrganizationRequest,
      viam.app.v1.App.CreateOrganizationResponse> getCreateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganization",
      requestType = viam.app.v1.App.CreateOrganizationRequest.class,
      responseType = viam.app.v1.App.CreateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.CreateOrganizationRequest,
      viam.app.v1.App.CreateOrganizationResponse> getCreateOrganizationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.CreateOrganizationRequest, viam.app.v1.App.CreateOrganizationResponse> getCreateOrganizationMethod;
    if ((getCreateOrganizationMethod = AppServiceGrpc.getCreateOrganizationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateOrganizationMethod = AppServiceGrpc.getCreateOrganizationMethod) == null) {
          AppServiceGrpc.getCreateOrganizationMethod = getCreateOrganizationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.CreateOrganizationRequest, viam.app.v1.App.CreateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateOrganizationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateOrganizationMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListOrganizationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListOrganizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetOrganizationsWithAccessToLocationRequest,
      viam.app.v1.App.GetOrganizationsWithAccessToLocationResponse> getGetOrganizationsWithAccessToLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationsWithAccessToLocation",
      requestType = viam.app.v1.App.GetOrganizationsWithAccessToLocationRequest.class,
      responseType = viam.app.v1.App.GetOrganizationsWithAccessToLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetOrganizationsWithAccessToLocationRequest,
      viam.app.v1.App.GetOrganizationsWithAccessToLocationResponse> getGetOrganizationsWithAccessToLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetOrganizationsWithAccessToLocationRequest, viam.app.v1.App.GetOrganizationsWithAccessToLocationResponse> getGetOrganizationsWithAccessToLocationMethod;
    if ((getGetOrganizationsWithAccessToLocationMethod = AppServiceGrpc.getGetOrganizationsWithAccessToLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetOrganizationsWithAccessToLocationMethod = AppServiceGrpc.getGetOrganizationsWithAccessToLocationMethod) == null) {
          AppServiceGrpc.getGetOrganizationsWithAccessToLocationMethod = getGetOrganizationsWithAccessToLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetOrganizationsWithAccessToLocationRequest, viam.app.v1.App.GetOrganizationsWithAccessToLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationsWithAccessToLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetOrganizationsWithAccessToLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetOrganizationsWithAccessToLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOrganizationsWithAccessToLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ListOrganizationsByUserRequest,
      viam.app.v1.App.ListOrganizationsByUserResponse> getListOrganizationsByUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizationsByUser",
      requestType = viam.app.v1.App.ListOrganizationsByUserRequest.class,
      responseType = viam.app.v1.App.ListOrganizationsByUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ListOrganizationsByUserRequest,
      viam.app.v1.App.ListOrganizationsByUserResponse> getListOrganizationsByUserMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ListOrganizationsByUserRequest, viam.app.v1.App.ListOrganizationsByUserResponse> getListOrganizationsByUserMethod;
    if ((getListOrganizationsByUserMethod = AppServiceGrpc.getListOrganizationsByUserMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListOrganizationsByUserMethod = AppServiceGrpc.getListOrganizationsByUserMethod) == null) {
          AppServiceGrpc.getListOrganizationsByUserMethod = getListOrganizationsByUserMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ListOrganizationsByUserRequest, viam.app.v1.App.ListOrganizationsByUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizationsByUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListOrganizationsByUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListOrganizationsByUserResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListOrganizationsByUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.SearchOrganizationsRequest,
      viam.app.v1.App.SearchOrganizationsResponse> getSearchOrganizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchOrganizations",
      requestType = viam.app.v1.App.SearchOrganizationsRequest.class,
      responseType = viam.app.v1.App.SearchOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.SearchOrganizationsRequest,
      viam.app.v1.App.SearchOrganizationsResponse> getSearchOrganizationsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.SearchOrganizationsRequest, viam.app.v1.App.SearchOrganizationsResponse> getSearchOrganizationsMethod;
    if ((getSearchOrganizationsMethod = AppServiceGrpc.getSearchOrganizationsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getSearchOrganizationsMethod = AppServiceGrpc.getSearchOrganizationsMethod) == null) {
          AppServiceGrpc.getSearchOrganizationsMethod = getSearchOrganizationsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.SearchOrganizationsRequest, viam.app.v1.App.SearchOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchOrganizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.SearchOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.SearchOrganizationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSearchOrganizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetOrganizationRequest,
      viam.app.v1.App.GetOrganizationResponse> getGetOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganization",
      requestType = viam.app.v1.App.GetOrganizationRequest.class,
      responseType = viam.app.v1.App.GetOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetOrganizationRequest,
      viam.app.v1.App.GetOrganizationResponse> getGetOrganizationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetOrganizationRequest, viam.app.v1.App.GetOrganizationResponse> getGetOrganizationMethod;
    if ((getGetOrganizationMethod = AppServiceGrpc.getGetOrganizationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetOrganizationMethod = AppServiceGrpc.getGetOrganizationMethod) == null) {
          AppServiceGrpc.getGetOrganizationMethod = getGetOrganizationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetOrganizationRequest, viam.app.v1.App.GetOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetOrganizationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetOrganizationNamespaceAvailabilityRequest,
      viam.app.v1.App.GetOrganizationNamespaceAvailabilityResponse> getGetOrganizationNamespaceAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationNamespaceAvailability",
      requestType = viam.app.v1.App.GetOrganizationNamespaceAvailabilityRequest.class,
      responseType = viam.app.v1.App.GetOrganizationNamespaceAvailabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetOrganizationNamespaceAvailabilityRequest,
      viam.app.v1.App.GetOrganizationNamespaceAvailabilityResponse> getGetOrganizationNamespaceAvailabilityMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetOrganizationNamespaceAvailabilityRequest, viam.app.v1.App.GetOrganizationNamespaceAvailabilityResponse> getGetOrganizationNamespaceAvailabilityMethod;
    if ((getGetOrganizationNamespaceAvailabilityMethod = AppServiceGrpc.getGetOrganizationNamespaceAvailabilityMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetOrganizationNamespaceAvailabilityMethod = AppServiceGrpc.getGetOrganizationNamespaceAvailabilityMethod) == null) {
          AppServiceGrpc.getGetOrganizationNamespaceAvailabilityMethod = getGetOrganizationNamespaceAvailabilityMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetOrganizationNamespaceAvailabilityRequest, viam.app.v1.App.GetOrganizationNamespaceAvailabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationNamespaceAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetOrganizationNamespaceAvailabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetOrganizationNamespaceAvailabilityResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOrganizationNamespaceAvailabilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateOrganizationRequest,
      viam.app.v1.App.UpdateOrganizationResponse> getUpdateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganization",
      requestType = viam.app.v1.App.UpdateOrganizationRequest.class,
      responseType = viam.app.v1.App.UpdateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateOrganizationRequest,
      viam.app.v1.App.UpdateOrganizationResponse> getUpdateOrganizationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateOrganizationRequest, viam.app.v1.App.UpdateOrganizationResponse> getUpdateOrganizationMethod;
    if ((getUpdateOrganizationMethod = AppServiceGrpc.getUpdateOrganizationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateOrganizationMethod = AppServiceGrpc.getUpdateOrganizationMethod) == null) {
          AppServiceGrpc.getUpdateOrganizationMethod = getUpdateOrganizationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateOrganizationRequest, viam.app.v1.App.UpdateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateOrganizationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DeleteOrganizationRequest,
      viam.app.v1.App.DeleteOrganizationResponse> getDeleteOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrganization",
      requestType = viam.app.v1.App.DeleteOrganizationRequest.class,
      responseType = viam.app.v1.App.DeleteOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DeleteOrganizationRequest,
      viam.app.v1.App.DeleteOrganizationResponse> getDeleteOrganizationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DeleteOrganizationRequest, viam.app.v1.App.DeleteOrganizationResponse> getDeleteOrganizationMethod;
    if ((getDeleteOrganizationMethod = AppServiceGrpc.getDeleteOrganizationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteOrganizationMethod = AppServiceGrpc.getDeleteOrganizationMethod) == null) {
          AppServiceGrpc.getDeleteOrganizationMethod = getDeleteOrganizationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DeleteOrganizationRequest, viam.app.v1.App.DeleteOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteOrganizationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetOrganizationMetadataRequest,
      viam.app.v1.App.GetOrganizationMetadataResponse> getGetOrganizationMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationMetadata",
      requestType = viam.app.v1.App.GetOrganizationMetadataRequest.class,
      responseType = viam.app.v1.App.GetOrganizationMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetOrganizationMetadataRequest,
      viam.app.v1.App.GetOrganizationMetadataResponse> getGetOrganizationMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetOrganizationMetadataRequest, viam.app.v1.App.GetOrganizationMetadataResponse> getGetOrganizationMetadataMethod;
    if ((getGetOrganizationMetadataMethod = AppServiceGrpc.getGetOrganizationMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetOrganizationMetadataMethod = AppServiceGrpc.getGetOrganizationMetadataMethod) == null) {
          AppServiceGrpc.getGetOrganizationMetadataMethod = getGetOrganizationMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetOrganizationMetadataRequest, viam.app.v1.App.GetOrganizationMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetOrganizationMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetOrganizationMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOrganizationMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateOrganizationMetadataRequest,
      viam.app.v1.App.UpdateOrganizationMetadataResponse> getUpdateOrganizationMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganizationMetadata",
      requestType = viam.app.v1.App.UpdateOrganizationMetadataRequest.class,
      responseType = viam.app.v1.App.UpdateOrganizationMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateOrganizationMetadataRequest,
      viam.app.v1.App.UpdateOrganizationMetadataResponse> getUpdateOrganizationMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateOrganizationMetadataRequest, viam.app.v1.App.UpdateOrganizationMetadataResponse> getUpdateOrganizationMetadataMethod;
    if ((getUpdateOrganizationMetadataMethod = AppServiceGrpc.getUpdateOrganizationMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateOrganizationMetadataMethod = AppServiceGrpc.getUpdateOrganizationMetadataMethod) == null) {
          AppServiceGrpc.getUpdateOrganizationMetadataMethod = getUpdateOrganizationMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateOrganizationMetadataRequest, viam.app.v1.App.UpdateOrganizationMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganizationMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateOrganizationMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateOrganizationMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateOrganizationMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ListOrganizationMembersRequest,
      viam.app.v1.App.ListOrganizationMembersResponse> getListOrganizationMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizationMembers",
      requestType = viam.app.v1.App.ListOrganizationMembersRequest.class,
      responseType = viam.app.v1.App.ListOrganizationMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ListOrganizationMembersRequest,
      viam.app.v1.App.ListOrganizationMembersResponse> getListOrganizationMembersMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ListOrganizationMembersRequest, viam.app.v1.App.ListOrganizationMembersResponse> getListOrganizationMembersMethod;
    if ((getListOrganizationMembersMethod = AppServiceGrpc.getListOrganizationMembersMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListOrganizationMembersMethod = AppServiceGrpc.getListOrganizationMembersMethod) == null) {
          AppServiceGrpc.getListOrganizationMembersMethod = getListOrganizationMembersMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ListOrganizationMembersRequest, viam.app.v1.App.ListOrganizationMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizationMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListOrganizationMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListOrganizationMembersResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListOrganizationMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.CreateOrganizationInviteRequest,
      viam.app.v1.App.CreateOrganizationInviteResponse> getCreateOrganizationInviteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganizationInvite",
      requestType = viam.app.v1.App.CreateOrganizationInviteRequest.class,
      responseType = viam.app.v1.App.CreateOrganizationInviteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.CreateOrganizationInviteRequest,
      viam.app.v1.App.CreateOrganizationInviteResponse> getCreateOrganizationInviteMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.CreateOrganizationInviteRequest, viam.app.v1.App.CreateOrganizationInviteResponse> getCreateOrganizationInviteMethod;
    if ((getCreateOrganizationInviteMethod = AppServiceGrpc.getCreateOrganizationInviteMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateOrganizationInviteMethod = AppServiceGrpc.getCreateOrganizationInviteMethod) == null) {
          AppServiceGrpc.getCreateOrganizationInviteMethod = getCreateOrganizationInviteMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.CreateOrganizationInviteRequest, viam.app.v1.App.CreateOrganizationInviteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganizationInvite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateOrganizationInviteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateOrganizationInviteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateOrganizationInviteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateOrganizationInviteAuthorizationsRequest,
      viam.app.v1.App.UpdateOrganizationInviteAuthorizationsResponse> getUpdateOrganizationInviteAuthorizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganizationInviteAuthorizations",
      requestType = viam.app.v1.App.UpdateOrganizationInviteAuthorizationsRequest.class,
      responseType = viam.app.v1.App.UpdateOrganizationInviteAuthorizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateOrganizationInviteAuthorizationsRequest,
      viam.app.v1.App.UpdateOrganizationInviteAuthorizationsResponse> getUpdateOrganizationInviteAuthorizationsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateOrganizationInviteAuthorizationsRequest, viam.app.v1.App.UpdateOrganizationInviteAuthorizationsResponse> getUpdateOrganizationInviteAuthorizationsMethod;
    if ((getUpdateOrganizationInviteAuthorizationsMethod = AppServiceGrpc.getUpdateOrganizationInviteAuthorizationsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateOrganizationInviteAuthorizationsMethod = AppServiceGrpc.getUpdateOrganizationInviteAuthorizationsMethod) == null) {
          AppServiceGrpc.getUpdateOrganizationInviteAuthorizationsMethod = getUpdateOrganizationInviteAuthorizationsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateOrganizationInviteAuthorizationsRequest, viam.app.v1.App.UpdateOrganizationInviteAuthorizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganizationInviteAuthorizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateOrganizationInviteAuthorizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateOrganizationInviteAuthorizationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateOrganizationInviteAuthorizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DeleteOrganizationMemberRequest,
      viam.app.v1.App.DeleteOrganizationMemberResponse> getDeleteOrganizationMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrganizationMember",
      requestType = viam.app.v1.App.DeleteOrganizationMemberRequest.class,
      responseType = viam.app.v1.App.DeleteOrganizationMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DeleteOrganizationMemberRequest,
      viam.app.v1.App.DeleteOrganizationMemberResponse> getDeleteOrganizationMemberMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DeleteOrganizationMemberRequest, viam.app.v1.App.DeleteOrganizationMemberResponse> getDeleteOrganizationMemberMethod;
    if ((getDeleteOrganizationMemberMethod = AppServiceGrpc.getDeleteOrganizationMemberMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteOrganizationMemberMethod = AppServiceGrpc.getDeleteOrganizationMemberMethod) == null) {
          AppServiceGrpc.getDeleteOrganizationMemberMethod = getDeleteOrganizationMemberMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DeleteOrganizationMemberRequest, viam.app.v1.App.DeleteOrganizationMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrganizationMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteOrganizationMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteOrganizationMemberResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteOrganizationMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DeleteOrganizationInviteRequest,
      viam.app.v1.App.DeleteOrganizationInviteResponse> getDeleteOrganizationInviteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrganizationInvite",
      requestType = viam.app.v1.App.DeleteOrganizationInviteRequest.class,
      responseType = viam.app.v1.App.DeleteOrganizationInviteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DeleteOrganizationInviteRequest,
      viam.app.v1.App.DeleteOrganizationInviteResponse> getDeleteOrganizationInviteMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DeleteOrganizationInviteRequest, viam.app.v1.App.DeleteOrganizationInviteResponse> getDeleteOrganizationInviteMethod;
    if ((getDeleteOrganizationInviteMethod = AppServiceGrpc.getDeleteOrganizationInviteMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteOrganizationInviteMethod = AppServiceGrpc.getDeleteOrganizationInviteMethod) == null) {
          AppServiceGrpc.getDeleteOrganizationInviteMethod = getDeleteOrganizationInviteMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DeleteOrganizationInviteRequest, viam.app.v1.App.DeleteOrganizationInviteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrganizationInvite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteOrganizationInviteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteOrganizationInviteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteOrganizationInviteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ResendOrganizationInviteRequest,
      viam.app.v1.App.ResendOrganizationInviteResponse> getResendOrganizationInviteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendOrganizationInvite",
      requestType = viam.app.v1.App.ResendOrganizationInviteRequest.class,
      responseType = viam.app.v1.App.ResendOrganizationInviteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ResendOrganizationInviteRequest,
      viam.app.v1.App.ResendOrganizationInviteResponse> getResendOrganizationInviteMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ResendOrganizationInviteRequest, viam.app.v1.App.ResendOrganizationInviteResponse> getResendOrganizationInviteMethod;
    if ((getResendOrganizationInviteMethod = AppServiceGrpc.getResendOrganizationInviteMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getResendOrganizationInviteMethod = AppServiceGrpc.getResendOrganizationInviteMethod) == null) {
          AppServiceGrpc.getResendOrganizationInviteMethod = getResendOrganizationInviteMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ResendOrganizationInviteRequest, viam.app.v1.App.ResendOrganizationInviteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendOrganizationInvite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ResendOrganizationInviteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ResendOrganizationInviteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getResendOrganizationInviteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.EnableBillingServiceRequest,
      viam.app.v1.App.EnableBillingServiceResponse> getEnableBillingServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableBillingService",
      requestType = viam.app.v1.App.EnableBillingServiceRequest.class,
      responseType = viam.app.v1.App.EnableBillingServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.EnableBillingServiceRequest,
      viam.app.v1.App.EnableBillingServiceResponse> getEnableBillingServiceMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.EnableBillingServiceRequest, viam.app.v1.App.EnableBillingServiceResponse> getEnableBillingServiceMethod;
    if ((getEnableBillingServiceMethod = AppServiceGrpc.getEnableBillingServiceMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getEnableBillingServiceMethod = AppServiceGrpc.getEnableBillingServiceMethod) == null) {
          AppServiceGrpc.getEnableBillingServiceMethod = getEnableBillingServiceMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.EnableBillingServiceRequest, viam.app.v1.App.EnableBillingServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableBillingService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.EnableBillingServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.EnableBillingServiceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEnableBillingServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DisableBillingServiceRequest,
      viam.app.v1.App.DisableBillingServiceResponse> getDisableBillingServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableBillingService",
      requestType = viam.app.v1.App.DisableBillingServiceRequest.class,
      responseType = viam.app.v1.App.DisableBillingServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DisableBillingServiceRequest,
      viam.app.v1.App.DisableBillingServiceResponse> getDisableBillingServiceMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DisableBillingServiceRequest, viam.app.v1.App.DisableBillingServiceResponse> getDisableBillingServiceMethod;
    if ((getDisableBillingServiceMethod = AppServiceGrpc.getDisableBillingServiceMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDisableBillingServiceMethod = AppServiceGrpc.getDisableBillingServiceMethod) == null) {
          AppServiceGrpc.getDisableBillingServiceMethod = getDisableBillingServiceMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DisableBillingServiceRequest, viam.app.v1.App.DisableBillingServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableBillingService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DisableBillingServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DisableBillingServiceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisableBillingServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateBillingServiceRequest,
      viam.app.v1.App.UpdateBillingServiceResponse> getUpdateBillingServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBillingService",
      requestType = viam.app.v1.App.UpdateBillingServiceRequest.class,
      responseType = viam.app.v1.App.UpdateBillingServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateBillingServiceRequest,
      viam.app.v1.App.UpdateBillingServiceResponse> getUpdateBillingServiceMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateBillingServiceRequest, viam.app.v1.App.UpdateBillingServiceResponse> getUpdateBillingServiceMethod;
    if ((getUpdateBillingServiceMethod = AppServiceGrpc.getUpdateBillingServiceMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateBillingServiceMethod = AppServiceGrpc.getUpdateBillingServiceMethod) == null) {
          AppServiceGrpc.getUpdateBillingServiceMethod = getUpdateBillingServiceMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateBillingServiceRequest, viam.app.v1.App.UpdateBillingServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBillingService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateBillingServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateBillingServiceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateBillingServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetBillingServiceConfigRequest,
      viam.app.v1.App.GetBillingServiceConfigResponse> getGetBillingServiceConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingServiceConfig",
      requestType = viam.app.v1.App.GetBillingServiceConfigRequest.class,
      responseType = viam.app.v1.App.GetBillingServiceConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetBillingServiceConfigRequest,
      viam.app.v1.App.GetBillingServiceConfigResponse> getGetBillingServiceConfigMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetBillingServiceConfigRequest, viam.app.v1.App.GetBillingServiceConfigResponse> getGetBillingServiceConfigMethod;
    if ((getGetBillingServiceConfigMethod = AppServiceGrpc.getGetBillingServiceConfigMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetBillingServiceConfigMethod = AppServiceGrpc.getGetBillingServiceConfigMethod) == null) {
          AppServiceGrpc.getGetBillingServiceConfigMethod = getGetBillingServiceConfigMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetBillingServiceConfigRequest, viam.app.v1.App.GetBillingServiceConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingServiceConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetBillingServiceConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetBillingServiceConfigResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetBillingServiceConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.OrganizationSetSupportEmailRequest,
      viam.app.v1.App.OrganizationSetSupportEmailResponse> getOrganizationSetSupportEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrganizationSetSupportEmail",
      requestType = viam.app.v1.App.OrganizationSetSupportEmailRequest.class,
      responseType = viam.app.v1.App.OrganizationSetSupportEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.OrganizationSetSupportEmailRequest,
      viam.app.v1.App.OrganizationSetSupportEmailResponse> getOrganizationSetSupportEmailMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.OrganizationSetSupportEmailRequest, viam.app.v1.App.OrganizationSetSupportEmailResponse> getOrganizationSetSupportEmailMethod;
    if ((getOrganizationSetSupportEmailMethod = AppServiceGrpc.getOrganizationSetSupportEmailMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getOrganizationSetSupportEmailMethod = AppServiceGrpc.getOrganizationSetSupportEmailMethod) == null) {
          AppServiceGrpc.getOrganizationSetSupportEmailMethod = getOrganizationSetSupportEmailMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.OrganizationSetSupportEmailRequest, viam.app.v1.App.OrganizationSetSupportEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrganizationSetSupportEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.OrganizationSetSupportEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.OrganizationSetSupportEmailResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getOrganizationSetSupportEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.OrganizationGetSupportEmailRequest,
      viam.app.v1.App.OrganizationGetSupportEmailResponse> getOrganizationGetSupportEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrganizationGetSupportEmail",
      requestType = viam.app.v1.App.OrganizationGetSupportEmailRequest.class,
      responseType = viam.app.v1.App.OrganizationGetSupportEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.OrganizationGetSupportEmailRequest,
      viam.app.v1.App.OrganizationGetSupportEmailResponse> getOrganizationGetSupportEmailMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.OrganizationGetSupportEmailRequest, viam.app.v1.App.OrganizationGetSupportEmailResponse> getOrganizationGetSupportEmailMethod;
    if ((getOrganizationGetSupportEmailMethod = AppServiceGrpc.getOrganizationGetSupportEmailMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getOrganizationGetSupportEmailMethod = AppServiceGrpc.getOrganizationGetSupportEmailMethod) == null) {
          AppServiceGrpc.getOrganizationGetSupportEmailMethod = getOrganizationGetSupportEmailMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.OrganizationGetSupportEmailRequest, viam.app.v1.App.OrganizationGetSupportEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrganizationGetSupportEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.OrganizationGetSupportEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.OrganizationGetSupportEmailResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getOrganizationGetSupportEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.OrganizationSetLogoRequest,
      viam.app.v1.App.OrganizationSetLogoResponse> getOrganizationSetLogoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrganizationSetLogo",
      requestType = viam.app.v1.App.OrganizationSetLogoRequest.class,
      responseType = viam.app.v1.App.OrganizationSetLogoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.OrganizationSetLogoRequest,
      viam.app.v1.App.OrganizationSetLogoResponse> getOrganizationSetLogoMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.OrganizationSetLogoRequest, viam.app.v1.App.OrganizationSetLogoResponse> getOrganizationSetLogoMethod;
    if ((getOrganizationSetLogoMethod = AppServiceGrpc.getOrganizationSetLogoMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getOrganizationSetLogoMethod = AppServiceGrpc.getOrganizationSetLogoMethod) == null) {
          AppServiceGrpc.getOrganizationSetLogoMethod = getOrganizationSetLogoMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.OrganizationSetLogoRequest, viam.app.v1.App.OrganizationSetLogoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrganizationSetLogo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.OrganizationSetLogoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.OrganizationSetLogoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getOrganizationSetLogoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.OrganizationGetLogoRequest,
      viam.app.v1.App.OrganizationGetLogoResponse> getOrganizationGetLogoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrganizationGetLogo",
      requestType = viam.app.v1.App.OrganizationGetLogoRequest.class,
      responseType = viam.app.v1.App.OrganizationGetLogoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.OrganizationGetLogoRequest,
      viam.app.v1.App.OrganizationGetLogoResponse> getOrganizationGetLogoMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.OrganizationGetLogoRequest, viam.app.v1.App.OrganizationGetLogoResponse> getOrganizationGetLogoMethod;
    if ((getOrganizationGetLogoMethod = AppServiceGrpc.getOrganizationGetLogoMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getOrganizationGetLogoMethod = AppServiceGrpc.getOrganizationGetLogoMethod) == null) {
          AppServiceGrpc.getOrganizationGetLogoMethod = getOrganizationGetLogoMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.OrganizationGetLogoRequest, viam.app.v1.App.OrganizationGetLogoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrganizationGetLogo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.OrganizationGetLogoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.OrganizationGetLogoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getOrganizationGetLogoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.EnableAuthServiceRequest,
      viam.app.v1.App.EnableAuthServiceResponse> getEnableAuthServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableAuthService",
      requestType = viam.app.v1.App.EnableAuthServiceRequest.class,
      responseType = viam.app.v1.App.EnableAuthServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.EnableAuthServiceRequest,
      viam.app.v1.App.EnableAuthServiceResponse> getEnableAuthServiceMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.EnableAuthServiceRequest, viam.app.v1.App.EnableAuthServiceResponse> getEnableAuthServiceMethod;
    if ((getEnableAuthServiceMethod = AppServiceGrpc.getEnableAuthServiceMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getEnableAuthServiceMethod = AppServiceGrpc.getEnableAuthServiceMethod) == null) {
          AppServiceGrpc.getEnableAuthServiceMethod = getEnableAuthServiceMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.EnableAuthServiceRequest, viam.app.v1.App.EnableAuthServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableAuthService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.EnableAuthServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.EnableAuthServiceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEnableAuthServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DisableAuthServiceRequest,
      viam.app.v1.App.DisableAuthServiceResponse> getDisableAuthServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableAuthService",
      requestType = viam.app.v1.App.DisableAuthServiceRequest.class,
      responseType = viam.app.v1.App.DisableAuthServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DisableAuthServiceRequest,
      viam.app.v1.App.DisableAuthServiceResponse> getDisableAuthServiceMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DisableAuthServiceRequest, viam.app.v1.App.DisableAuthServiceResponse> getDisableAuthServiceMethod;
    if ((getDisableAuthServiceMethod = AppServiceGrpc.getDisableAuthServiceMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDisableAuthServiceMethod = AppServiceGrpc.getDisableAuthServiceMethod) == null) {
          AppServiceGrpc.getDisableAuthServiceMethod = getDisableAuthServiceMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DisableAuthServiceRequest, viam.app.v1.App.DisableAuthServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableAuthService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DisableAuthServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DisableAuthServiceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisableAuthServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.CreateOAuthAppRequest,
      viam.app.v1.App.CreateOAuthAppResponse> getCreateOAuthAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOAuthApp",
      requestType = viam.app.v1.App.CreateOAuthAppRequest.class,
      responseType = viam.app.v1.App.CreateOAuthAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.CreateOAuthAppRequest,
      viam.app.v1.App.CreateOAuthAppResponse> getCreateOAuthAppMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.CreateOAuthAppRequest, viam.app.v1.App.CreateOAuthAppResponse> getCreateOAuthAppMethod;
    if ((getCreateOAuthAppMethod = AppServiceGrpc.getCreateOAuthAppMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateOAuthAppMethod = AppServiceGrpc.getCreateOAuthAppMethod) == null) {
          AppServiceGrpc.getCreateOAuthAppMethod = getCreateOAuthAppMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.CreateOAuthAppRequest, viam.app.v1.App.CreateOAuthAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOAuthApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateOAuthAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateOAuthAppResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateOAuthAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ReadOAuthAppRequest,
      viam.app.v1.App.ReadOAuthAppResponse> getReadOAuthAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadOAuthApp",
      requestType = viam.app.v1.App.ReadOAuthAppRequest.class,
      responseType = viam.app.v1.App.ReadOAuthAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ReadOAuthAppRequest,
      viam.app.v1.App.ReadOAuthAppResponse> getReadOAuthAppMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ReadOAuthAppRequest, viam.app.v1.App.ReadOAuthAppResponse> getReadOAuthAppMethod;
    if ((getReadOAuthAppMethod = AppServiceGrpc.getReadOAuthAppMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getReadOAuthAppMethod = AppServiceGrpc.getReadOAuthAppMethod) == null) {
          AppServiceGrpc.getReadOAuthAppMethod = getReadOAuthAppMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ReadOAuthAppRequest, viam.app.v1.App.ReadOAuthAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadOAuthApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ReadOAuthAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ReadOAuthAppResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getReadOAuthAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateOAuthAppRequest,
      viam.app.v1.App.UpdateOAuthAppResponse> getUpdateOAuthAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOAuthApp",
      requestType = viam.app.v1.App.UpdateOAuthAppRequest.class,
      responseType = viam.app.v1.App.UpdateOAuthAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateOAuthAppRequest,
      viam.app.v1.App.UpdateOAuthAppResponse> getUpdateOAuthAppMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateOAuthAppRequest, viam.app.v1.App.UpdateOAuthAppResponse> getUpdateOAuthAppMethod;
    if ((getUpdateOAuthAppMethod = AppServiceGrpc.getUpdateOAuthAppMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateOAuthAppMethod = AppServiceGrpc.getUpdateOAuthAppMethod) == null) {
          AppServiceGrpc.getUpdateOAuthAppMethod = getUpdateOAuthAppMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateOAuthAppRequest, viam.app.v1.App.UpdateOAuthAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOAuthApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateOAuthAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateOAuthAppResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateOAuthAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DeleteOAuthAppRequest,
      viam.app.v1.App.DeleteOAuthAppResponse> getDeleteOAuthAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOAuthApp",
      requestType = viam.app.v1.App.DeleteOAuthAppRequest.class,
      responseType = viam.app.v1.App.DeleteOAuthAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DeleteOAuthAppRequest,
      viam.app.v1.App.DeleteOAuthAppResponse> getDeleteOAuthAppMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DeleteOAuthAppRequest, viam.app.v1.App.DeleteOAuthAppResponse> getDeleteOAuthAppMethod;
    if ((getDeleteOAuthAppMethod = AppServiceGrpc.getDeleteOAuthAppMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteOAuthAppMethod = AppServiceGrpc.getDeleteOAuthAppMethod) == null) {
          AppServiceGrpc.getDeleteOAuthAppMethod = getDeleteOAuthAppMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DeleteOAuthAppRequest, viam.app.v1.App.DeleteOAuthAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOAuthApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteOAuthAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteOAuthAppResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteOAuthAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ListOAuthAppsRequest,
      viam.app.v1.App.ListOAuthAppsResponse> getListOAuthAppsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOAuthApps",
      requestType = viam.app.v1.App.ListOAuthAppsRequest.class,
      responseType = viam.app.v1.App.ListOAuthAppsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ListOAuthAppsRequest,
      viam.app.v1.App.ListOAuthAppsResponse> getListOAuthAppsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ListOAuthAppsRequest, viam.app.v1.App.ListOAuthAppsResponse> getListOAuthAppsMethod;
    if ((getListOAuthAppsMethod = AppServiceGrpc.getListOAuthAppsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListOAuthAppsMethod = AppServiceGrpc.getListOAuthAppsMethod) == null) {
          AppServiceGrpc.getListOAuthAppsMethod = getListOAuthAppsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ListOAuthAppsRequest, viam.app.v1.App.ListOAuthAppsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOAuthApps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListOAuthAppsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListOAuthAppsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListOAuthAppsMethod;
  }

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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetLocationRequest,
      viam.app.v1.App.GetLocationResponse> getGetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocation",
      requestType = viam.app.v1.App.GetLocationRequest.class,
      responseType = viam.app.v1.App.GetLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetLocationRequest,
      viam.app.v1.App.GetLocationResponse> getGetLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetLocationRequest, viam.app.v1.App.GetLocationResponse> getGetLocationMethod;
    if ((getGetLocationMethod = AppServiceGrpc.getGetLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetLocationMethod = AppServiceGrpc.getGetLocationMethod) == null) {
          AppServiceGrpc.getGetLocationMethod = getGetLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetLocationRequest, viam.app.v1.App.GetLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateLocationRequest,
      viam.app.v1.App.UpdateLocationResponse> getUpdateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLocation",
      requestType = viam.app.v1.App.UpdateLocationRequest.class,
      responseType = viam.app.v1.App.UpdateLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateLocationRequest,
      viam.app.v1.App.UpdateLocationResponse> getUpdateLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateLocationRequest, viam.app.v1.App.UpdateLocationResponse> getUpdateLocationMethod;
    if ((getUpdateLocationMethod = AppServiceGrpc.getUpdateLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateLocationMethod = AppServiceGrpc.getUpdateLocationMethod) == null) {
          AppServiceGrpc.getUpdateLocationMethod = getUpdateLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateLocationRequest, viam.app.v1.App.UpdateLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DeleteLocationRequest,
      viam.app.v1.App.DeleteLocationResponse> getDeleteLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLocation",
      requestType = viam.app.v1.App.DeleteLocationRequest.class,
      responseType = viam.app.v1.App.DeleteLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DeleteLocationRequest,
      viam.app.v1.App.DeleteLocationResponse> getDeleteLocationMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DeleteLocationRequest, viam.app.v1.App.DeleteLocationResponse> getDeleteLocationMethod;
    if ((getDeleteLocationMethod = AppServiceGrpc.getDeleteLocationMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteLocationMethod = AppServiceGrpc.getDeleteLocationMethod) == null) {
          AppServiceGrpc.getDeleteLocationMethod = getDeleteLocationMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DeleteLocationRequest, viam.app.v1.App.DeleteLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetLocationMetadataRequest,
      viam.app.v1.App.GetLocationMetadataResponse> getGetLocationMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocationMetadata",
      requestType = viam.app.v1.App.GetLocationMetadataRequest.class,
      responseType = viam.app.v1.App.GetLocationMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetLocationMetadataRequest,
      viam.app.v1.App.GetLocationMetadataResponse> getGetLocationMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetLocationMetadataRequest, viam.app.v1.App.GetLocationMetadataResponse> getGetLocationMetadataMethod;
    if ((getGetLocationMetadataMethod = AppServiceGrpc.getGetLocationMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetLocationMetadataMethod = AppServiceGrpc.getGetLocationMetadataMethod) == null) {
          AppServiceGrpc.getGetLocationMetadataMethod = getGetLocationMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetLocationMetadataRequest, viam.app.v1.App.GetLocationMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLocationMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetLocationMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetLocationMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetLocationMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateLocationMetadataRequest,
      viam.app.v1.App.UpdateLocationMetadataResponse> getUpdateLocationMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLocationMetadata",
      requestType = viam.app.v1.App.UpdateLocationMetadataRequest.class,
      responseType = viam.app.v1.App.UpdateLocationMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateLocationMetadataRequest,
      viam.app.v1.App.UpdateLocationMetadataResponse> getUpdateLocationMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateLocationMetadataRequest, viam.app.v1.App.UpdateLocationMetadataResponse> getUpdateLocationMetadataMethod;
    if ((getUpdateLocationMetadataMethod = AppServiceGrpc.getUpdateLocationMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateLocationMetadataMethod = AppServiceGrpc.getUpdateLocationMetadataMethod) == null) {
          AppServiceGrpc.getUpdateLocationMetadataMethod = getUpdateLocationMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateLocationMetadataRequest, viam.app.v1.App.UpdateLocationMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLocationMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateLocationMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateLocationMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateLocationMetadataMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListLocationsResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ShareLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ShareLocationResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UnshareLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UnshareLocationResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.LocationAuthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.LocationAuthResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateLocationSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateLocationSecretResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteLocationSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteLocationSecretResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRobotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotMetadataRequest,
      viam.app.v1.App.GetRobotMetadataResponse> getGetRobotMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotMetadata",
      requestType = viam.app.v1.App.GetRobotMetadataRequest.class,
      responseType = viam.app.v1.App.GetRobotMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotMetadataRequest,
      viam.app.v1.App.GetRobotMetadataResponse> getGetRobotMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotMetadataRequest, viam.app.v1.App.GetRobotMetadataResponse> getGetRobotMetadataMethod;
    if ((getGetRobotMetadataMethod = AppServiceGrpc.getGetRobotMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotMetadataMethod = AppServiceGrpc.getGetRobotMetadataMethod) == null) {
          AppServiceGrpc.getGetRobotMetadataMethod = getGetRobotMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetRobotMetadataRequest, viam.app.v1.App.GetRobotMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRobotMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRobotMetadataRequest,
      viam.app.v1.App.UpdateRobotMetadataResponse> getUpdateRobotMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRobotMetadata",
      requestType = viam.app.v1.App.UpdateRobotMetadataRequest.class,
      responseType = viam.app.v1.App.UpdateRobotMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRobotMetadataRequest,
      viam.app.v1.App.UpdateRobotMetadataResponse> getUpdateRobotMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRobotMetadataRequest, viam.app.v1.App.UpdateRobotMetadataResponse> getUpdateRobotMetadataMethod;
    if ((getUpdateRobotMetadataMethod = AppServiceGrpc.getUpdateRobotMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateRobotMetadataMethod = AppServiceGrpc.getUpdateRobotMetadataMethod) == null) {
          AppServiceGrpc.getUpdateRobotMetadataMethod = getUpdateRobotMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateRobotMetadataRequest, viam.app.v1.App.UpdateRobotMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRobotMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateRobotMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateRobotMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateRobotMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetRoverRentalRobotsRequest,
      viam.app.v1.App.GetRoverRentalRobotsResponse> getGetRoverRentalRobotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoverRentalRobots",
      requestType = viam.app.v1.App.GetRoverRentalRobotsRequest.class,
      responseType = viam.app.v1.App.GetRoverRentalRobotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetRoverRentalRobotsRequest,
      viam.app.v1.App.GetRoverRentalRobotsResponse> getGetRoverRentalRobotsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetRoverRentalRobotsRequest, viam.app.v1.App.GetRoverRentalRobotsResponse> getGetRoverRentalRobotsMethod;
    if ((getGetRoverRentalRobotsMethod = AppServiceGrpc.getGetRoverRentalRobotsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRoverRentalRobotsMethod = AppServiceGrpc.getGetRoverRentalRobotsMethod) == null) {
          AppServiceGrpc.getGetRoverRentalRobotsMethod = getGetRoverRentalRobotsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetRoverRentalRobotsRequest, viam.app.v1.App.GetRoverRentalRobotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRoverRentalRobots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRoverRentalRobotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRoverRentalRobotsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRoverRentalRobotsMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotPartsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotPartsResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotPartResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotPartLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotPartLogsResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.TailRobotPartLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.TailRobotPartLogsResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotPartHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotPartHistoryResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateRobotPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateRobotPartResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.NewRobotPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.NewRobotPartResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteRobotPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteRobotPartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteRobotPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartMetadataRequest,
      viam.app.v1.App.GetRobotPartMetadataResponse> getGetRobotPartMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotPartMetadata",
      requestType = viam.app.v1.App.GetRobotPartMetadataRequest.class,
      responseType = viam.app.v1.App.GetRobotPartMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartMetadataRequest,
      viam.app.v1.App.GetRobotPartMetadataResponse> getGetRobotPartMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotPartMetadataRequest, viam.app.v1.App.GetRobotPartMetadataResponse> getGetRobotPartMetadataMethod;
    if ((getGetRobotPartMetadataMethod = AppServiceGrpc.getGetRobotPartMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotPartMetadataMethod = AppServiceGrpc.getGetRobotPartMetadataMethod) == null) {
          AppServiceGrpc.getGetRobotPartMetadataMethod = getGetRobotPartMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetRobotPartMetadataRequest, viam.app.v1.App.GetRobotPartMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotPartMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotPartMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotPartMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRobotPartMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRobotPartMetadataRequest,
      viam.app.v1.App.UpdateRobotPartMetadataResponse> getUpdateRobotPartMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRobotPartMetadata",
      requestType = viam.app.v1.App.UpdateRobotPartMetadataRequest.class,
      responseType = viam.app.v1.App.UpdateRobotPartMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRobotPartMetadataRequest,
      viam.app.v1.App.UpdateRobotPartMetadataResponse> getUpdateRobotPartMetadataMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRobotPartMetadataRequest, viam.app.v1.App.UpdateRobotPartMetadataResponse> getUpdateRobotPartMetadataMethod;
    if ((getUpdateRobotPartMetadataMethod = AppServiceGrpc.getUpdateRobotPartMetadataMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateRobotPartMetadataMethod = AppServiceGrpc.getUpdateRobotPartMetadataMethod) == null) {
          AppServiceGrpc.getUpdateRobotPartMetadataMethod = getUpdateRobotPartMetadataMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateRobotPartMetadataRequest, viam.app.v1.App.UpdateRobotPartMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRobotPartMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateRobotPartMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateRobotPartMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateRobotPartMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotAPIKeysRequest,
      viam.app.v1.App.GetRobotAPIKeysResponse> getGetRobotAPIKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRobotAPIKeys",
      requestType = viam.app.v1.App.GetRobotAPIKeysRequest.class,
      responseType = viam.app.v1.App.GetRobotAPIKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotAPIKeysRequest,
      viam.app.v1.App.GetRobotAPIKeysResponse> getGetRobotAPIKeysMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetRobotAPIKeysRequest, viam.app.v1.App.GetRobotAPIKeysResponse> getGetRobotAPIKeysMethod;
    if ((getGetRobotAPIKeysMethod = AppServiceGrpc.getGetRobotAPIKeysMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRobotAPIKeysMethod = AppServiceGrpc.getGetRobotAPIKeysMethod) == null) {
          AppServiceGrpc.getGetRobotAPIKeysMethod = getGetRobotAPIKeysMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetRobotAPIKeysRequest, viam.app.v1.App.GetRobotAPIKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRobotAPIKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotAPIKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRobotAPIKeysResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRobotAPIKeysMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.MarkPartAsMainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.MarkPartAsMainResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getMarkPartAsMainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.MarkPartForRestartRequest,
      viam.app.v1.App.MarkPartForRestartResponse> getMarkPartForRestartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkPartForRestart",
      requestType = viam.app.v1.App.MarkPartForRestartRequest.class,
      responseType = viam.app.v1.App.MarkPartForRestartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.MarkPartForRestartRequest,
      viam.app.v1.App.MarkPartForRestartResponse> getMarkPartForRestartMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.MarkPartForRestartRequest, viam.app.v1.App.MarkPartForRestartResponse> getMarkPartForRestartMethod;
    if ((getMarkPartForRestartMethod = AppServiceGrpc.getMarkPartForRestartMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getMarkPartForRestartMethod = AppServiceGrpc.getMarkPartForRestartMethod) == null) {
          AppServiceGrpc.getMarkPartForRestartMethod = getMarkPartForRestartMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.MarkPartForRestartRequest, viam.app.v1.App.MarkPartForRestartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkPartForRestart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.MarkPartForRestartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.MarkPartForRestartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getMarkPartForRestartMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateRobotPartSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateRobotPartSecretResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteRobotPartSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteRobotPartSecretResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteRobotPartSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ListRobotsRequest,
      viam.app.v1.App.ListRobotsResponse> getListRobotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRobots",
      requestType = viam.app.v1.App.ListRobotsRequest.class,
      responseType = viam.app.v1.App.ListRobotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ListRobotsRequest,
      viam.app.v1.App.ListRobotsResponse> getListRobotsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ListRobotsRequest, viam.app.v1.App.ListRobotsResponse> getListRobotsMethod;
    if ((getListRobotsMethod = AppServiceGrpc.getListRobotsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListRobotsMethod = AppServiceGrpc.getListRobotsMethod) == null) {
          AppServiceGrpc.getListRobotsMethod = getListRobotsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ListRobotsRequest, viam.app.v1.App.ListRobotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRobots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListRobotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListRobotsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListRobotsMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.NewRobotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.NewRobotResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateRobotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateRobotResponse.getDefaultInstance()))
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
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteRobotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteRobotResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteRobotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ListFragmentsRequest,
      viam.app.v1.App.ListFragmentsResponse> getListFragmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFragments",
      requestType = viam.app.v1.App.ListFragmentsRequest.class,
      responseType = viam.app.v1.App.ListFragmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ListFragmentsRequest,
      viam.app.v1.App.ListFragmentsResponse> getListFragmentsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ListFragmentsRequest, viam.app.v1.App.ListFragmentsResponse> getListFragmentsMethod;
    if ((getListFragmentsMethod = AppServiceGrpc.getListFragmentsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListFragmentsMethod = AppServiceGrpc.getListFragmentsMethod) == null) {
          AppServiceGrpc.getListFragmentsMethod = getListFragmentsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ListFragmentsRequest, viam.app.v1.App.ListFragmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFragments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListFragmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListFragmentsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListFragmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetFragmentRequest,
      viam.app.v1.App.GetFragmentResponse> getGetFragmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFragment",
      requestType = viam.app.v1.App.GetFragmentRequest.class,
      responseType = viam.app.v1.App.GetFragmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetFragmentRequest,
      viam.app.v1.App.GetFragmentResponse> getGetFragmentMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetFragmentRequest, viam.app.v1.App.GetFragmentResponse> getGetFragmentMethod;
    if ((getGetFragmentMethod = AppServiceGrpc.getGetFragmentMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetFragmentMethod = AppServiceGrpc.getGetFragmentMethod) == null) {
          AppServiceGrpc.getGetFragmentMethod = getGetFragmentMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetFragmentRequest, viam.app.v1.App.GetFragmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFragment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetFragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetFragmentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetFragmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.CreateFragmentRequest,
      viam.app.v1.App.CreateFragmentResponse> getCreateFragmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFragment",
      requestType = viam.app.v1.App.CreateFragmentRequest.class,
      responseType = viam.app.v1.App.CreateFragmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.CreateFragmentRequest,
      viam.app.v1.App.CreateFragmentResponse> getCreateFragmentMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.CreateFragmentRequest, viam.app.v1.App.CreateFragmentResponse> getCreateFragmentMethod;
    if ((getCreateFragmentMethod = AppServiceGrpc.getCreateFragmentMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateFragmentMethod = AppServiceGrpc.getCreateFragmentMethod) == null) {
          AppServiceGrpc.getCreateFragmentMethod = getCreateFragmentMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.CreateFragmentRequest, viam.app.v1.App.CreateFragmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFragment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateFragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateFragmentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateFragmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateFragmentRequest,
      viam.app.v1.App.UpdateFragmentResponse> getUpdateFragmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFragment",
      requestType = viam.app.v1.App.UpdateFragmentRequest.class,
      responseType = viam.app.v1.App.UpdateFragmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateFragmentRequest,
      viam.app.v1.App.UpdateFragmentResponse> getUpdateFragmentMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateFragmentRequest, viam.app.v1.App.UpdateFragmentResponse> getUpdateFragmentMethod;
    if ((getUpdateFragmentMethod = AppServiceGrpc.getUpdateFragmentMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateFragmentMethod = AppServiceGrpc.getUpdateFragmentMethod) == null) {
          AppServiceGrpc.getUpdateFragmentMethod = getUpdateFragmentMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateFragmentRequest, viam.app.v1.App.UpdateFragmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFragment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateFragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateFragmentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateFragmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DeleteFragmentRequest,
      viam.app.v1.App.DeleteFragmentResponse> getDeleteFragmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFragment",
      requestType = viam.app.v1.App.DeleteFragmentRequest.class,
      responseType = viam.app.v1.App.DeleteFragmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DeleteFragmentRequest,
      viam.app.v1.App.DeleteFragmentResponse> getDeleteFragmentMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DeleteFragmentRequest, viam.app.v1.App.DeleteFragmentResponse> getDeleteFragmentMethod;
    if ((getDeleteFragmentMethod = AppServiceGrpc.getDeleteFragmentMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteFragmentMethod = AppServiceGrpc.getDeleteFragmentMethod) == null) {
          AppServiceGrpc.getDeleteFragmentMethod = getDeleteFragmentMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DeleteFragmentRequest, viam.app.v1.App.DeleteFragmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFragment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteFragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteFragmentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteFragmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ListMachineFragmentsRequest,
      viam.app.v1.App.ListMachineFragmentsResponse> getListMachineFragmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMachineFragments",
      requestType = viam.app.v1.App.ListMachineFragmentsRequest.class,
      responseType = viam.app.v1.App.ListMachineFragmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ListMachineFragmentsRequest,
      viam.app.v1.App.ListMachineFragmentsResponse> getListMachineFragmentsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ListMachineFragmentsRequest, viam.app.v1.App.ListMachineFragmentsResponse> getListMachineFragmentsMethod;
    if ((getListMachineFragmentsMethod = AppServiceGrpc.getListMachineFragmentsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListMachineFragmentsMethod = AppServiceGrpc.getListMachineFragmentsMethod) == null) {
          AppServiceGrpc.getListMachineFragmentsMethod = getListMachineFragmentsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ListMachineFragmentsRequest, viam.app.v1.App.ListMachineFragmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMachineFragments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListMachineFragmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListMachineFragmentsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListMachineFragmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetFragmentHistoryRequest,
      viam.app.v1.App.GetFragmentHistoryResponse> getGetFragmentHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFragmentHistory",
      requestType = viam.app.v1.App.GetFragmentHistoryRequest.class,
      responseType = viam.app.v1.App.GetFragmentHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetFragmentHistoryRequest,
      viam.app.v1.App.GetFragmentHistoryResponse> getGetFragmentHistoryMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetFragmentHistoryRequest, viam.app.v1.App.GetFragmentHistoryResponse> getGetFragmentHistoryMethod;
    if ((getGetFragmentHistoryMethod = AppServiceGrpc.getGetFragmentHistoryMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetFragmentHistoryMethod = AppServiceGrpc.getGetFragmentHistoryMethod) == null) {
          AppServiceGrpc.getGetFragmentHistoryMethod = getGetFragmentHistoryMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetFragmentHistoryRequest, viam.app.v1.App.GetFragmentHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFragmentHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetFragmentHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetFragmentHistoryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetFragmentHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetFragmentUsageRequest,
      viam.app.v1.App.GetFragmentUsageResponse> getGetFragmentUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFragmentUsage",
      requestType = viam.app.v1.App.GetFragmentUsageRequest.class,
      responseType = viam.app.v1.App.GetFragmentUsageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetFragmentUsageRequest,
      viam.app.v1.App.GetFragmentUsageResponse> getGetFragmentUsageMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetFragmentUsageRequest, viam.app.v1.App.GetFragmentUsageResponse> getGetFragmentUsageMethod;
    if ((getGetFragmentUsageMethod = AppServiceGrpc.getGetFragmentUsageMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetFragmentUsageMethod = AppServiceGrpc.getGetFragmentUsageMethod) == null) {
          AppServiceGrpc.getGetFragmentUsageMethod = getGetFragmentUsageMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetFragmentUsageRequest, viam.app.v1.App.GetFragmentUsageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFragmentUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetFragmentUsageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetFragmentUsageResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetFragmentUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.SetFragmentTagRequest,
      viam.app.v1.App.SetFragmentTagResponse> getSetFragmentTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetFragmentTag",
      requestType = viam.app.v1.App.SetFragmentTagRequest.class,
      responseType = viam.app.v1.App.SetFragmentTagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.SetFragmentTagRequest,
      viam.app.v1.App.SetFragmentTagResponse> getSetFragmentTagMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.SetFragmentTagRequest, viam.app.v1.App.SetFragmentTagResponse> getSetFragmentTagMethod;
    if ((getSetFragmentTagMethod = AppServiceGrpc.getSetFragmentTagMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getSetFragmentTagMethod = AppServiceGrpc.getSetFragmentTagMethod) == null) {
          AppServiceGrpc.getSetFragmentTagMethod = getSetFragmentTagMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.SetFragmentTagRequest, viam.app.v1.App.SetFragmentTagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetFragmentTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.SetFragmentTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.SetFragmentTagResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetFragmentTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DeleteFragmentTagRequest,
      viam.app.v1.App.DeleteFragmentTagResponse> getDeleteFragmentTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFragmentTag",
      requestType = viam.app.v1.App.DeleteFragmentTagRequest.class,
      responseType = viam.app.v1.App.DeleteFragmentTagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DeleteFragmentTagRequest,
      viam.app.v1.App.DeleteFragmentTagResponse> getDeleteFragmentTagMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DeleteFragmentTagRequest, viam.app.v1.App.DeleteFragmentTagResponse> getDeleteFragmentTagMethod;
    if ((getDeleteFragmentTagMethod = AppServiceGrpc.getDeleteFragmentTagMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteFragmentTagMethod = AppServiceGrpc.getDeleteFragmentTagMethod) == null) {
          AppServiceGrpc.getDeleteFragmentTagMethod = getDeleteFragmentTagMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DeleteFragmentTagRequest, viam.app.v1.App.DeleteFragmentTagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFragmentTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteFragmentTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteFragmentTagResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteFragmentTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.AddRoleRequest,
      viam.app.v1.App.AddRoleResponse> getAddRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRole",
      requestType = viam.app.v1.App.AddRoleRequest.class,
      responseType = viam.app.v1.App.AddRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.AddRoleRequest,
      viam.app.v1.App.AddRoleResponse> getAddRoleMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.AddRoleRequest, viam.app.v1.App.AddRoleResponse> getAddRoleMethod;
    if ((getAddRoleMethod = AppServiceGrpc.getAddRoleMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getAddRoleMethod = AppServiceGrpc.getAddRoleMethod) == null) {
          AppServiceGrpc.getAddRoleMethod = getAddRoleMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.AddRoleRequest, viam.app.v1.App.AddRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.AddRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.AddRoleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.RemoveRoleRequest,
      viam.app.v1.App.RemoveRoleResponse> getRemoveRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveRole",
      requestType = viam.app.v1.App.RemoveRoleRequest.class,
      responseType = viam.app.v1.App.RemoveRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.RemoveRoleRequest,
      viam.app.v1.App.RemoveRoleResponse> getRemoveRoleMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.RemoveRoleRequest, viam.app.v1.App.RemoveRoleResponse> getRemoveRoleMethod;
    if ((getRemoveRoleMethod = AppServiceGrpc.getRemoveRoleMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getRemoveRoleMethod = AppServiceGrpc.getRemoveRoleMethod) == null) {
          AppServiceGrpc.getRemoveRoleMethod = getRemoveRoleMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.RemoveRoleRequest, viam.app.v1.App.RemoveRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.RemoveRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.RemoveRoleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ChangeRoleRequest,
      viam.app.v1.App.ChangeRoleResponse> getChangeRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeRole",
      requestType = viam.app.v1.App.ChangeRoleRequest.class,
      responseType = viam.app.v1.App.ChangeRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ChangeRoleRequest,
      viam.app.v1.App.ChangeRoleResponse> getChangeRoleMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ChangeRoleRequest, viam.app.v1.App.ChangeRoleResponse> getChangeRoleMethod;
    if ((getChangeRoleMethod = AppServiceGrpc.getChangeRoleMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getChangeRoleMethod = AppServiceGrpc.getChangeRoleMethod) == null) {
          AppServiceGrpc.getChangeRoleMethod = getChangeRoleMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ChangeRoleRequest, viam.app.v1.App.ChangeRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ChangeRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ChangeRoleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getChangeRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ListAuthorizationsRequest,
      viam.app.v1.App.ListAuthorizationsResponse> getListAuthorizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAuthorizations",
      requestType = viam.app.v1.App.ListAuthorizationsRequest.class,
      responseType = viam.app.v1.App.ListAuthorizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ListAuthorizationsRequest,
      viam.app.v1.App.ListAuthorizationsResponse> getListAuthorizationsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ListAuthorizationsRequest, viam.app.v1.App.ListAuthorizationsResponse> getListAuthorizationsMethod;
    if ((getListAuthorizationsMethod = AppServiceGrpc.getListAuthorizationsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListAuthorizationsMethod = AppServiceGrpc.getListAuthorizationsMethod) == null) {
          AppServiceGrpc.getListAuthorizationsMethod = getListAuthorizationsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ListAuthorizationsRequest, viam.app.v1.App.ListAuthorizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAuthorizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListAuthorizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListAuthorizationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListAuthorizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.CheckPermissionsRequest,
      viam.app.v1.App.CheckPermissionsResponse> getCheckPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckPermissions",
      requestType = viam.app.v1.App.CheckPermissionsRequest.class,
      responseType = viam.app.v1.App.CheckPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.CheckPermissionsRequest,
      viam.app.v1.App.CheckPermissionsResponse> getCheckPermissionsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.CheckPermissionsRequest, viam.app.v1.App.CheckPermissionsResponse> getCheckPermissionsMethod;
    if ((getCheckPermissionsMethod = AppServiceGrpc.getCheckPermissionsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCheckPermissionsMethod = AppServiceGrpc.getCheckPermissionsMethod) == null) {
          AppServiceGrpc.getCheckPermissionsMethod = getCheckPermissionsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.CheckPermissionsRequest, viam.app.v1.App.CheckPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CheckPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CheckPermissionsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCheckPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetRegistryItemRequest,
      viam.app.v1.App.GetRegistryItemResponse> getGetRegistryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegistryItem",
      requestType = viam.app.v1.App.GetRegistryItemRequest.class,
      responseType = viam.app.v1.App.GetRegistryItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetRegistryItemRequest,
      viam.app.v1.App.GetRegistryItemResponse> getGetRegistryItemMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetRegistryItemRequest, viam.app.v1.App.GetRegistryItemResponse> getGetRegistryItemMethod;
    if ((getGetRegistryItemMethod = AppServiceGrpc.getGetRegistryItemMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetRegistryItemMethod = AppServiceGrpc.getGetRegistryItemMethod) == null) {
          AppServiceGrpc.getGetRegistryItemMethod = getGetRegistryItemMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetRegistryItemRequest, viam.app.v1.App.GetRegistryItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegistryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRegistryItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetRegistryItemResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRegistryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.CreateRegistryItemRequest,
      viam.app.v1.App.CreateRegistryItemResponse> getCreateRegistryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRegistryItem",
      requestType = viam.app.v1.App.CreateRegistryItemRequest.class,
      responseType = viam.app.v1.App.CreateRegistryItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.CreateRegistryItemRequest,
      viam.app.v1.App.CreateRegistryItemResponse> getCreateRegistryItemMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.CreateRegistryItemRequest, viam.app.v1.App.CreateRegistryItemResponse> getCreateRegistryItemMethod;
    if ((getCreateRegistryItemMethod = AppServiceGrpc.getCreateRegistryItemMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateRegistryItemMethod = AppServiceGrpc.getCreateRegistryItemMethod) == null) {
          AppServiceGrpc.getCreateRegistryItemMethod = getCreateRegistryItemMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.CreateRegistryItemRequest, viam.app.v1.App.CreateRegistryItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRegistryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateRegistryItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateRegistryItemResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateRegistryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRegistryItemRequest,
      viam.app.v1.App.UpdateRegistryItemResponse> getUpdateRegistryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRegistryItem",
      requestType = viam.app.v1.App.UpdateRegistryItemRequest.class,
      responseType = viam.app.v1.App.UpdateRegistryItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRegistryItemRequest,
      viam.app.v1.App.UpdateRegistryItemResponse> getUpdateRegistryItemMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateRegistryItemRequest, viam.app.v1.App.UpdateRegistryItemResponse> getUpdateRegistryItemMethod;
    if ((getUpdateRegistryItemMethod = AppServiceGrpc.getUpdateRegistryItemMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateRegistryItemMethod = AppServiceGrpc.getUpdateRegistryItemMethod) == null) {
          AppServiceGrpc.getUpdateRegistryItemMethod = getUpdateRegistryItemMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateRegistryItemRequest, viam.app.v1.App.UpdateRegistryItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRegistryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateRegistryItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateRegistryItemResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateRegistryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ListRegistryItemsRequest,
      viam.app.v1.App.ListRegistryItemsResponse> getListRegistryItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRegistryItems",
      requestType = viam.app.v1.App.ListRegistryItemsRequest.class,
      responseType = viam.app.v1.App.ListRegistryItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ListRegistryItemsRequest,
      viam.app.v1.App.ListRegistryItemsResponse> getListRegistryItemsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ListRegistryItemsRequest, viam.app.v1.App.ListRegistryItemsResponse> getListRegistryItemsMethod;
    if ((getListRegistryItemsMethod = AppServiceGrpc.getListRegistryItemsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListRegistryItemsMethod = AppServiceGrpc.getListRegistryItemsMethod) == null) {
          AppServiceGrpc.getListRegistryItemsMethod = getListRegistryItemsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ListRegistryItemsRequest, viam.app.v1.App.ListRegistryItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRegistryItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListRegistryItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListRegistryItemsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListRegistryItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DeleteRegistryItemRequest,
      viam.app.v1.App.DeleteRegistryItemResponse> getDeleteRegistryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRegistryItem",
      requestType = viam.app.v1.App.DeleteRegistryItemRequest.class,
      responseType = viam.app.v1.App.DeleteRegistryItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DeleteRegistryItemRequest,
      viam.app.v1.App.DeleteRegistryItemResponse> getDeleteRegistryItemMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DeleteRegistryItemRequest, viam.app.v1.App.DeleteRegistryItemResponse> getDeleteRegistryItemMethod;
    if ((getDeleteRegistryItemMethod = AppServiceGrpc.getDeleteRegistryItemMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteRegistryItemMethod = AppServiceGrpc.getDeleteRegistryItemMethod) == null) {
          AppServiceGrpc.getDeleteRegistryItemMethod = getDeleteRegistryItemMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DeleteRegistryItemRequest, viam.app.v1.App.DeleteRegistryItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRegistryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteRegistryItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteRegistryItemResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteRegistryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.TransferRegistryItemRequest,
      viam.app.v1.App.TransferRegistryItemResponse> getTransferRegistryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferRegistryItem",
      requestType = viam.app.v1.App.TransferRegistryItemRequest.class,
      responseType = viam.app.v1.App.TransferRegistryItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.TransferRegistryItemRequest,
      viam.app.v1.App.TransferRegistryItemResponse> getTransferRegistryItemMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.TransferRegistryItemRequest, viam.app.v1.App.TransferRegistryItemResponse> getTransferRegistryItemMethod;
    if ((getTransferRegistryItemMethod = AppServiceGrpc.getTransferRegistryItemMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getTransferRegistryItemMethod = AppServiceGrpc.getTransferRegistryItemMethod) == null) {
          AppServiceGrpc.getTransferRegistryItemMethod = getTransferRegistryItemMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.TransferRegistryItemRequest, viam.app.v1.App.TransferRegistryItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferRegistryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.TransferRegistryItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.TransferRegistryItemResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTransferRegistryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.CreateModuleRequest,
      viam.app.v1.App.CreateModuleResponse> getCreateModuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateModule",
      requestType = viam.app.v1.App.CreateModuleRequest.class,
      responseType = viam.app.v1.App.CreateModuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.CreateModuleRequest,
      viam.app.v1.App.CreateModuleResponse> getCreateModuleMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.CreateModuleRequest, viam.app.v1.App.CreateModuleResponse> getCreateModuleMethod;
    if ((getCreateModuleMethod = AppServiceGrpc.getCreateModuleMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateModuleMethod = AppServiceGrpc.getCreateModuleMethod) == null) {
          AppServiceGrpc.getCreateModuleMethod = getCreateModuleMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.CreateModuleRequest, viam.app.v1.App.CreateModuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateModule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateModuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateModuleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateModuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UpdateModuleRequest,
      viam.app.v1.App.UpdateModuleResponse> getUpdateModuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateModule",
      requestType = viam.app.v1.App.UpdateModuleRequest.class,
      responseType = viam.app.v1.App.UpdateModuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UpdateModuleRequest,
      viam.app.v1.App.UpdateModuleResponse> getUpdateModuleMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UpdateModuleRequest, viam.app.v1.App.UpdateModuleResponse> getUpdateModuleMethod;
    if ((getUpdateModuleMethod = AppServiceGrpc.getUpdateModuleMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUpdateModuleMethod = AppServiceGrpc.getUpdateModuleMethod) == null) {
          AppServiceGrpc.getUpdateModuleMethod = getUpdateModuleMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UpdateModuleRequest, viam.app.v1.App.UpdateModuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateModule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateModuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UpdateModuleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateModuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.UploadModuleFileRequest,
      viam.app.v1.App.UploadModuleFileResponse> getUploadModuleFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadModuleFile",
      requestType = viam.app.v1.App.UploadModuleFileRequest.class,
      responseType = viam.app.v1.App.UploadModuleFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.UploadModuleFileRequest,
      viam.app.v1.App.UploadModuleFileResponse> getUploadModuleFileMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.UploadModuleFileRequest, viam.app.v1.App.UploadModuleFileResponse> getUploadModuleFileMethod;
    if ((getUploadModuleFileMethod = AppServiceGrpc.getUploadModuleFileMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getUploadModuleFileMethod = AppServiceGrpc.getUploadModuleFileMethod) == null) {
          AppServiceGrpc.getUploadModuleFileMethod = getUploadModuleFileMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.UploadModuleFileRequest, viam.app.v1.App.UploadModuleFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadModuleFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UploadModuleFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.UploadModuleFileResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUploadModuleFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.GetModuleRequest,
      viam.app.v1.App.GetModuleResponse> getGetModuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModule",
      requestType = viam.app.v1.App.GetModuleRequest.class,
      responseType = viam.app.v1.App.GetModuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.GetModuleRequest,
      viam.app.v1.App.GetModuleResponse> getGetModuleMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.GetModuleRequest, viam.app.v1.App.GetModuleResponse> getGetModuleMethod;
    if ((getGetModuleMethod = AppServiceGrpc.getGetModuleMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getGetModuleMethod = AppServiceGrpc.getGetModuleMethod) == null) {
          AppServiceGrpc.getGetModuleMethod = getGetModuleMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.GetModuleRequest, viam.app.v1.App.GetModuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetModuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.GetModuleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetModuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ListModulesRequest,
      viam.app.v1.App.ListModulesResponse> getListModulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModules",
      requestType = viam.app.v1.App.ListModulesRequest.class,
      responseType = viam.app.v1.App.ListModulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ListModulesRequest,
      viam.app.v1.App.ListModulesResponse> getListModulesMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ListModulesRequest, viam.app.v1.App.ListModulesResponse> getListModulesMethod;
    if ((getListModulesMethod = AppServiceGrpc.getListModulesMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListModulesMethod = AppServiceGrpc.getListModulesMethod) == null) {
          AppServiceGrpc.getListModulesMethod = getListModulesMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ListModulesRequest, viam.app.v1.App.ListModulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListModulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListModulesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListModulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.CreateKeyRequest,
      viam.app.v1.App.CreateKeyResponse> getCreateKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateKey",
      requestType = viam.app.v1.App.CreateKeyRequest.class,
      responseType = viam.app.v1.App.CreateKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.CreateKeyRequest,
      viam.app.v1.App.CreateKeyResponse> getCreateKeyMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.CreateKeyRequest, viam.app.v1.App.CreateKeyResponse> getCreateKeyMethod;
    if ((getCreateKeyMethod = AppServiceGrpc.getCreateKeyMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateKeyMethod = AppServiceGrpc.getCreateKeyMethod) == null) {
          AppServiceGrpc.getCreateKeyMethod = getCreateKeyMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.CreateKeyRequest, viam.app.v1.App.CreateKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateKeyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.DeleteKeyRequest,
      viam.app.v1.App.DeleteKeyResponse> getDeleteKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteKey",
      requestType = viam.app.v1.App.DeleteKeyRequest.class,
      responseType = viam.app.v1.App.DeleteKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.DeleteKeyRequest,
      viam.app.v1.App.DeleteKeyResponse> getDeleteKeyMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.DeleteKeyRequest, viam.app.v1.App.DeleteKeyResponse> getDeleteKeyMethod;
    if ((getDeleteKeyMethod = AppServiceGrpc.getDeleteKeyMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getDeleteKeyMethod = AppServiceGrpc.getDeleteKeyMethod) == null) {
          AppServiceGrpc.getDeleteKeyMethod = getDeleteKeyMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.DeleteKeyRequest, viam.app.v1.App.DeleteKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.DeleteKeyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.ListKeysRequest,
      viam.app.v1.App.ListKeysResponse> getListKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListKeys",
      requestType = viam.app.v1.App.ListKeysRequest.class,
      responseType = viam.app.v1.App.ListKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.ListKeysRequest,
      viam.app.v1.App.ListKeysResponse> getListKeysMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.ListKeysRequest, viam.app.v1.App.ListKeysResponse> getListKeysMethod;
    if ((getListKeysMethod = AppServiceGrpc.getListKeysMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getListKeysMethod = AppServiceGrpc.getListKeysMethod) == null) {
          AppServiceGrpc.getListKeysMethod = getListKeysMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.ListKeysRequest, viam.app.v1.App.ListKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.ListKeysResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.RenameKeyRequest,
      viam.app.v1.App.RenameKeyResponse> getRenameKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenameKey",
      requestType = viam.app.v1.App.RenameKeyRequest.class,
      responseType = viam.app.v1.App.RenameKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.RenameKeyRequest,
      viam.app.v1.App.RenameKeyResponse> getRenameKeyMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.RenameKeyRequest, viam.app.v1.App.RenameKeyResponse> getRenameKeyMethod;
    if ((getRenameKeyMethod = AppServiceGrpc.getRenameKeyMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getRenameKeyMethod = AppServiceGrpc.getRenameKeyMethod) == null) {
          AppServiceGrpc.getRenameKeyMethod = getRenameKeyMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.RenameKeyRequest, viam.app.v1.App.RenameKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenameKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.RenameKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.RenameKeyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRenameKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.RotateKeyRequest,
      viam.app.v1.App.RotateKeyResponse> getRotateKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RotateKey",
      requestType = viam.app.v1.App.RotateKeyRequest.class,
      responseType = viam.app.v1.App.RotateKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.RotateKeyRequest,
      viam.app.v1.App.RotateKeyResponse> getRotateKeyMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.RotateKeyRequest, viam.app.v1.App.RotateKeyResponse> getRotateKeyMethod;
    if ((getRotateKeyMethod = AppServiceGrpc.getRotateKeyMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getRotateKeyMethod = AppServiceGrpc.getRotateKeyMethod) == null) {
          AppServiceGrpc.getRotateKeyMethod = getRotateKeyMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.RotateKeyRequest, viam.app.v1.App.RotateKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RotateKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.RotateKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.RotateKeyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRotateKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsRequest,
      viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsResponse> getCreateKeyFromExistingKeyAuthorizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateKeyFromExistingKeyAuthorizations",
      requestType = viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsRequest.class,
      responseType = viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsRequest,
      viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsResponse> getCreateKeyFromExistingKeyAuthorizationsMethod() {
    io.grpc.MethodDescriptor<viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsRequest, viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsResponse> getCreateKeyFromExistingKeyAuthorizationsMethod;
    if ((getCreateKeyFromExistingKeyAuthorizationsMethod = AppServiceGrpc.getCreateKeyFromExistingKeyAuthorizationsMethod) == null) {
      synchronized (AppServiceGrpc.class) {
        if ((getCreateKeyFromExistingKeyAuthorizationsMethod = AppServiceGrpc.getCreateKeyFromExistingKeyAuthorizationsMethod) == null) {
          AppServiceGrpc.getCreateKeyFromExistingKeyAuthorizationsMethod = getCreateKeyFromExistingKeyAuthorizationsMethod =
              io.grpc.MethodDescriptor.<viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsRequest, viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateKeyFromExistingKeyAuthorizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateKeyFromExistingKeyAuthorizationsMethod;
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
    default void getUserIDByEmail(viam.app.v1.App.GetUserIDByEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetUserIDByEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserIDByEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new organization
     * </pre>
     */
    default void createOrganization(viam.app.v1.App.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List organizations
     * </pre>
     */
    default void listOrganizations(viam.app.v1.App.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListOrganizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all organizations that have access to a location.
     * </pre>
     */
    default void getOrganizationsWithAccessToLocation(viam.app.v1.App.GetOrganizationsWithAccessToLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetOrganizationsWithAccessToLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationsWithAccessToLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List the organizations a user belongs to
     * </pre>
     */
    default void listOrganizationsByUser(viam.app.v1.App.ListOrganizationsByUserRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListOrganizationsByUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationsByUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search organizations by a couple fields
     * </pre>
     */
    default void searchOrganizations(viam.app.v1.App.SearchOrganizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.SearchOrganizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchOrganizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an organization
     * </pre>
     */
    default void getOrganization(viam.app.v1.App.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks for namespace availablity throughout all orgs.
     * </pre>
     */
    default void getOrganizationNamespaceAvailability(viam.app.v1.App.GetOrganizationNamespaceAvailabilityRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetOrganizationNamespaceAvailabilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationNamespaceAvailabilityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an organization
     * </pre>
     */
    default void updateOrganization(viam.app.v1.App.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an organization
     * </pre>
     */
    default void deleteOrganization(viam.app.v1.App.DeleteOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for an organization
     * </pre>
     */
    default void getOrganizationMetadata(viam.app.v1.App.GetOrganizationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetOrganizationMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for an organization
     * </pre>
     */
    default void updateOrganizationMetadata(viam.app.v1.App.UpdateOrganizationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateOrganizationMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all members of an organization and all invited members to the organization.
     * </pre>
     */
    default void listOrganizationMembers(viam.app.v1.App.ListOrganizationMembersRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListOrganizationMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an organization invite to an organization
     * </pre>
     */
    default void createOrganizationInvite(viam.app.v1.App.CreateOrganizationInviteRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateOrganizationInviteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationInviteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the authorizations attached to an organization invite
     * </pre>
     */
    default void updateOrganizationInviteAuthorizations(viam.app.v1.App.UpdateOrganizationInviteAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateOrganizationInviteAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationInviteAuthorizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an organization member from an organization
     * </pre>
     */
    default void deleteOrganizationMember(viam.app.v1.App.DeleteOrganizationMemberRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteOrganizationMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOrganizationMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an organization invite
     * </pre>
     */
    default void deleteOrganizationInvite(viam.app.v1.App.DeleteOrganizationInviteRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteOrganizationInviteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOrganizationInviteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resend an organization invite
     * </pre>
     */
    default void resendOrganizationInvite(viam.app.v1.App.ResendOrganizationInviteRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ResendOrganizationInviteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendOrganizationInviteMethod(), responseObserver);
    }

    /**
     */
    default void enableBillingService(viam.app.v1.App.EnableBillingServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.EnableBillingServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableBillingServiceMethod(), responseObserver);
    }

    /**
     */
    default void disableBillingService(viam.app.v1.App.DisableBillingServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DisableBillingServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableBillingServiceMethod(), responseObserver);
    }

    /**
     */
    default void updateBillingService(viam.app.v1.App.UpdateBillingServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateBillingServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBillingServiceMethod(), responseObserver);
    }

    /**
     */
    default void getBillingServiceConfig(viam.app.v1.App.GetBillingServiceConfigRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetBillingServiceConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingServiceConfigMethod(), responseObserver);
    }

    /**
     */
    default void organizationSetSupportEmail(viam.app.v1.App.OrganizationSetSupportEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.OrganizationSetSupportEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrganizationSetSupportEmailMethod(), responseObserver);
    }

    /**
     */
    default void organizationGetSupportEmail(viam.app.v1.App.OrganizationGetSupportEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.OrganizationGetSupportEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrganizationGetSupportEmailMethod(), responseObserver);
    }

    /**
     */
    default void organizationSetLogo(viam.app.v1.App.OrganizationSetLogoRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.OrganizationSetLogoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrganizationSetLogoMethod(), responseObserver);
    }

    /**
     */
    default void organizationGetLogo(viam.app.v1.App.OrganizationGetLogoRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.OrganizationGetLogoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrganizationGetLogoMethod(), responseObserver);
    }

    /**
     */
    default void enableAuthService(viam.app.v1.App.EnableAuthServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.EnableAuthServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableAuthServiceMethod(), responseObserver);
    }

    /**
     */
    default void disableAuthService(viam.app.v1.App.DisableAuthServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DisableAuthServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableAuthServiceMethod(), responseObserver);
    }

    /**
     */
    default void createOAuthApp(viam.app.v1.App.CreateOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateOAuthAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOAuthAppMethod(), responseObserver);
    }

    /**
     */
    default void readOAuthApp(viam.app.v1.App.ReadOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ReadOAuthAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadOAuthAppMethod(), responseObserver);
    }

    /**
     */
    default void updateOAuthApp(viam.app.v1.App.UpdateOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateOAuthAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOAuthAppMethod(), responseObserver);
    }

    /**
     */
    default void deleteOAuthApp(viam.app.v1.App.DeleteOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteOAuthAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOAuthAppMethod(), responseObserver);
    }

    /**
     */
    default void listOAuthApps(viam.app.v1.App.ListOAuthAppsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListOAuthAppsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOAuthAppsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a location
     * </pre>
     */
    default void createLocation(viam.app.v1.App.CreateLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a location
     * </pre>
     */
    default void getLocation(viam.app.v1.App.GetLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a location
     * </pre>
     */
    default void updateLocation(viam.app.v1.App.UpdateLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a location
     * </pre>
     */
    default void deleteLocation(viam.app.v1.App.DeleteLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for a location
     * </pre>
     */
    default void getLocationMetadata(viam.app.v1.App.GetLocationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetLocationMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for a location
     * </pre>
     */
    default void updateLocationMetadata(viam.app.v1.App.UpdateLocationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateLocationMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLocationMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a list of locations
     * </pre>
     */
    default void listLocations(viam.app.v1.App.ListLocationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListLocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLocationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Share a location with an organization
     * </pre>
     */
    default void shareLocation(viam.app.v1.App.ShareLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ShareLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShareLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop sharing a location with an organization
     * </pre>
     */
    default void unshareLocation(viam.app.v1.App.UnshareLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UnshareLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnshareLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a location's authorization secrets
     * </pre>
     */
    default void locationAuth(viam.app.v1.App.LocationAuthRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.LocationAuthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLocationAuthMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Location.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    default void createLocationSecret(viam.app.v1.App.CreateLocationSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateLocationSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLocationSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a Secret from the Location.
     * </pre>
     */
    default void deleteLocationSecret(viam.app.v1.App.DeleteLocationSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteLocationSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLocationSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot by ID
     * </pre>
     */
    default void getRobot(viam.app.v1.App.GetRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for a robot
     * </pre>
     */
    default void getRobotMetadata(viam.app.v1.App.GetRobotMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot
     * </pre>
     */
    default void updateRobotMetadata(viam.app.v1.App.UpdateRobotMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRobotMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get Rover Rental Location Robots
     * </pre>
     */
    default void getRoverRentalRobots(viam.app.v1.App.GetRoverRentalRobotsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRoverRentalRobotsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoverRentalRobotsMethod(), responseObserver);
    }

    /**
     */
    default void getRobotParts(viam.app.v1.App.GetRobotPartsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot part by ID
     * </pre>
     */
    default void getRobotPart(viam.app.v1.App.GetRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartMethod(), responseObserver);
    }

    /**
     */
    default void getRobotPartLogs(viam.app.v1.App.GetRobotPartLogsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartLogsMethod(), responseObserver);
    }

    /**
     */
    default void tailRobotPartLogs(viam.app.v1.App.TailRobotPartLogsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.TailRobotPartLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTailRobotPartLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific robot part histy by ID
     * </pre>
     */
    default void getRobotPartHistory(viam.app.v1.App.GetRobotPartHistoryRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a robot
     * </pre>
     */
    default void updateRobotPart(viam.app.v1.App.UpdateRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRobotPartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new robot part
     * </pre>
     */
    default void newRobotPart(viam.app.v1.App.NewRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.NewRobotPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewRobotPartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a robot part
     * </pre>
     */
    default void deleteRobotPart(viam.app.v1.App.DeleteRobotPartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRobotPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRobotPartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for a robot part
     * </pre>
     */
    default void getRobotPartMetadata(viam.app.v1.App.GetRobotPartMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotPartMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot part
     * </pre>
     */
    default void updateRobotPartMetadata(viam.app.v1.App.UpdateRobotPartMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotPartMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRobotPartMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the Robot API Keys for the robot
     * </pre>
     */
    default void getRobotAPIKeys(viam.app.v1.App.GetRobotAPIKeysRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotAPIKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRobotAPIKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Marks the given part as the main part, and all the others as not
     * </pre>
     */
    default void markPartAsMain(viam.app.v1.App.MarkPartAsMainRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.MarkPartAsMainResponse> responseObserver) {
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
    default void markPartForRestart(viam.app.v1.App.MarkPartForRestartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.MarkPartForRestartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkPartForRestartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new generated Secret in the Robot Part.
     *  - Succeeds if there are no more than 2 active secrets after creation.
     * </pre>
     */
    default void createRobotPartSecret(viam.app.v1.App.CreateRobotPartSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateRobotPartSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRobotPartSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a Secret from the RobotPart.
     * </pre>
     */
    default void deleteRobotPartSecret(viam.app.v1.App.DeleteRobotPartSecretRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRobotPartSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRobotPartSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a list of robots
     * </pre>
     */
    default void listRobots(viam.app.v1.App.ListRobotsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListRobotsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRobotsMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewRobot creates a new robot
     * </pre>
     */
    default void newRobot(viam.app.v1.App.NewRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.NewRobotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewRobotMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRobot updates a robot
     * </pre>
     */
    default void updateRobot(viam.app.v1.App.UpdateRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRobotMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRobot deletes a robot
     * </pre>
     */
    default void deleteRobot(viam.app.v1.App.DeleteRobotRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRobotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRobotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a list of fragments
     * </pre>
     */
    default void listFragments(viam.app.v1.App.ListFragmentsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListFragmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFragmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a single fragment
     * </pre>
     */
    default void getFragment(viam.app.v1.App.GetFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetFragmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFragmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a fragment
     * </pre>
     */
    default void createFragment(viam.app.v1.App.CreateFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateFragmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFragmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a fragment
     * </pre>
     */
    default void updateFragment(viam.app.v1.App.UpdateFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateFragmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFragmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a fragment
     * </pre>
     */
    default void deleteFragment(viam.app.v1.App.DeleteFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteFragmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFragmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets top level and nested fragments for a machine, as well as any other specified fragment ids
     * </pre>
     */
    default void listMachineFragments(viam.app.v1.App.ListMachineFragmentsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListMachineFragmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMachineFragmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets fragment history
     * </pre>
     */
    default void getFragmentHistory(viam.app.v1.App.GetFragmentHistoryRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetFragmentHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFragmentHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets usage for a fragment across versions
     * </pre>
     */
    default void getFragmentUsage(viam.app.v1.App.GetFragmentUsageRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetFragmentUsageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFragmentUsageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets a fragment tag to a revision
     * </pre>
     */
    default void setFragmentTag(viam.app.v1.App.SetFragmentTagRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.SetFragmentTagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetFragmentTagMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a fragment tag
     * </pre>
     */
    default void deleteFragmentTag(viam.app.v1.App.DeleteFragmentTagRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteFragmentTagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFragmentTagMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an IdentityAuthorization
     * </pre>
     */
    default void addRole(viam.app.v1.App.AddRoleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.AddRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an IdentityAuthorization
     * </pre>
     */
    default void removeRole(viam.app.v1.App.RemoveRoleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.RemoveRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Changes an IdentityAuthorization to a new IdentityAuthorization
     * </pre>
     */
    default void changeRole(viam.app.v1.App.ChangeRoleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ChangeRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all authorization roles for a given resource
     * </pre>
     */
    default void listAuthorizations(viam.app.v1.App.ListAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAuthorizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validates a permission for the current user
     * </pre>
     */
    default void checkPermissions(viam.app.v1.App.CheckPermissionsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CheckPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckPermissionsMethod(), responseObserver);
    }

    /**
     */
    default void getRegistryItem(viam.app.v1.App.GetRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRegistryItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegistryItemMethod(), responseObserver);
    }

    /**
     */
    default void createRegistryItem(viam.app.v1.App.CreateRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateRegistryItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRegistryItemMethod(), responseObserver);
    }

    /**
     */
    default void updateRegistryItem(viam.app.v1.App.UpdateRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRegistryItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRegistryItemMethod(), responseObserver);
    }

    /**
     */
    default void listRegistryItems(viam.app.v1.App.ListRegistryItemsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListRegistryItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRegistryItemsMethod(), responseObserver);
    }

    /**
     */
    default void deleteRegistryItem(viam.app.v1.App.DeleteRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRegistryItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRegistryItemMethod(), responseObserver);
    }

    /**
     */
    default void transferRegistryItem(viam.app.v1.App.TransferRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.TransferRegistryItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferRegistryItemMethod(), responseObserver);
    }

    /**
     */
    default void createModule(viam.app.v1.App.CreateModuleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateModuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateModuleMethod(), responseObserver);
    }

    /**
     */
    default void updateModule(viam.app.v1.App.UpdateModuleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateModuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateModuleMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<viam.app.v1.App.UploadModuleFileRequest> uploadModuleFile(
        io.grpc.stub.StreamObserver<viam.app.v1.App.UploadModuleFileResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadModuleFileMethod(), responseObserver);
    }

    /**
     */
    default void getModule(viam.app.v1.App.GetModuleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetModuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModuleMethod(), responseObserver);
    }

    /**
     */
    default void listModules(viam.app.v1.App.ListModulesRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListModulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModulesMethod(), responseObserver);
    }

    /**
     */
    default void createKey(viam.app.v1.App.CreateKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateKeyMethod(), responseObserver);
    }

    /**
     */
    default void deleteKey(viam.app.v1.App.DeleteKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteKeyMethod(), responseObserver);
    }

    /**
     */
    default void listKeys(viam.app.v1.App.ListKeysRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListKeysMethod(), responseObserver);
    }

    /**
     */
    default void renameKey(viam.app.v1.App.RenameKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.RenameKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenameKeyMethod(), responseObserver);
    }

    /**
     */
    default void rotateKey(viam.app.v1.App.RotateKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.RotateKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRotateKeyMethod(), responseObserver);
    }

    /**
     */
    default void createKeyFromExistingKeyAuthorizations(viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateKeyFromExistingKeyAuthorizationsMethod(), responseObserver);
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
    public void getUserIDByEmail(viam.app.v1.App.GetUserIDByEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetUserIDByEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserIDByEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new organization
     * </pre>
     */
    public void createOrganization(viam.app.v1.App.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List organizations
     * </pre>
     */
    public void listOrganizations(viam.app.v1.App.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListOrganizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all organizations that have access to a location.
     * </pre>
     */
    public void getOrganizationsWithAccessToLocation(viam.app.v1.App.GetOrganizationsWithAccessToLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetOrganizationsWithAccessToLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationsWithAccessToLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List the organizations a user belongs to
     * </pre>
     */
    public void listOrganizationsByUser(viam.app.v1.App.ListOrganizationsByUserRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListOrganizationsByUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationsByUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search organizations by a couple fields
     * </pre>
     */
    public void searchOrganizations(viam.app.v1.App.SearchOrganizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.SearchOrganizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an organization
     * </pre>
     */
    public void getOrganization(viam.app.v1.App.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks for namespace availablity throughout all orgs.
     * </pre>
     */
    public void getOrganizationNamespaceAvailability(viam.app.v1.App.GetOrganizationNamespaceAvailabilityRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetOrganizationNamespaceAvailabilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationNamespaceAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an organization
     * </pre>
     */
    public void updateOrganization(viam.app.v1.App.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an organization
     * </pre>
     */
    public void deleteOrganization(viam.app.v1.App.DeleteOrganizationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for an organization
     * </pre>
     */
    public void getOrganizationMetadata(viam.app.v1.App.GetOrganizationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetOrganizationMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for an organization
     * </pre>
     */
    public void updateOrganizationMetadata(viam.app.v1.App.UpdateOrganizationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateOrganizationMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all members of an organization and all invited members to the organization.
     * </pre>
     */
    public void listOrganizationMembers(viam.app.v1.App.ListOrganizationMembersRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListOrganizationMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an organization invite to an organization
     * </pre>
     */
    public void createOrganizationInvite(viam.app.v1.App.CreateOrganizationInviteRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateOrganizationInviteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationInviteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the authorizations attached to an organization invite
     * </pre>
     */
    public void updateOrganizationInviteAuthorizations(viam.app.v1.App.UpdateOrganizationInviteAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateOrganizationInviteAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationInviteAuthorizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an organization member from an organization
     * </pre>
     */
    public void deleteOrganizationMember(viam.app.v1.App.DeleteOrganizationMemberRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteOrganizationMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOrganizationMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an organization invite
     * </pre>
     */
    public void deleteOrganizationInvite(viam.app.v1.App.DeleteOrganizationInviteRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteOrganizationInviteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOrganizationInviteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resend an organization invite
     * </pre>
     */
    public void resendOrganizationInvite(viam.app.v1.App.ResendOrganizationInviteRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ResendOrganizationInviteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendOrganizationInviteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableBillingService(viam.app.v1.App.EnableBillingServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.EnableBillingServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableBillingServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableBillingService(viam.app.v1.App.DisableBillingServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DisableBillingServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableBillingServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBillingService(viam.app.v1.App.UpdateBillingServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateBillingServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBillingServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBillingServiceConfig(viam.app.v1.App.GetBillingServiceConfigRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetBillingServiceConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingServiceConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void organizationSetSupportEmail(viam.app.v1.App.OrganizationSetSupportEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.OrganizationSetSupportEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrganizationSetSupportEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void organizationGetSupportEmail(viam.app.v1.App.OrganizationGetSupportEmailRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.OrganizationGetSupportEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrganizationGetSupportEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void organizationSetLogo(viam.app.v1.App.OrganizationSetLogoRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.OrganizationSetLogoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrganizationSetLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void organizationGetLogo(viam.app.v1.App.OrganizationGetLogoRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.OrganizationGetLogoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrganizationGetLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableAuthService(viam.app.v1.App.EnableAuthServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.EnableAuthServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableAuthServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableAuthService(viam.app.v1.App.DisableAuthServiceRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DisableAuthServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableAuthServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOAuthApp(viam.app.v1.App.CreateOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateOAuthAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOAuthAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readOAuthApp(viam.app.v1.App.ReadOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ReadOAuthAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadOAuthAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOAuthApp(viam.app.v1.App.UpdateOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateOAuthAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOAuthAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOAuthApp(viam.app.v1.App.DeleteOAuthAppRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteOAuthAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOAuthAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOAuthApps(viam.app.v1.App.ListOAuthAppsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListOAuthAppsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOAuthAppsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a location
     * </pre>
     */
    public void createLocation(viam.app.v1.App.CreateLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a location
     * </pre>
     */
    public void getLocation(viam.app.v1.App.GetLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a location
     * </pre>
     */
    public void updateLocation(viam.app.v1.App.UpdateLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a location
     * </pre>
     */
    public void deleteLocation(viam.app.v1.App.DeleteLocationRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get user-defined metadata for a location
     * </pre>
     */
    public void getLocationMetadata(viam.app.v1.App.GetLocationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetLocationMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocationMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for a location
     * </pre>
     */
    public void updateLocationMetadata(viam.app.v1.App.UpdateLocationMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateLocationMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLocationMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a list of locations
     * </pre>
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
     * <pre>
     * Get a location's authorization secrets
     * </pre>
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
     * <pre>
     * Get user-defined metadata for a robot
     * </pre>
     */
    public void getRobotMetadata(viam.app.v1.App.GetRobotMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot
     * </pre>
     */
    public void updateRobotMetadata(viam.app.v1.App.UpdateRobotMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRobotMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Rover Rental Location Robots
     * </pre>
     */
    public void getRoverRentalRobots(viam.app.v1.App.GetRoverRentalRobotsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRoverRentalRobotsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoverRentalRobotsMethod(), getCallOptions()), request, responseObserver);
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
     * Get user-defined metadata for a robot part
     * </pre>
     */
    public void getRobotPartMetadata(viam.app.v1.App.GetRobotPartMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotPartMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot part
     * </pre>
     */
    public void updateRobotPartMetadata(viam.app.v1.App.UpdateRobotPartMetadataRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotPartMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRobotPartMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the Robot API Keys for the robot
     * </pre>
     */
    public void getRobotAPIKeys(viam.app.v1.App.GetRobotAPIKeysRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotAPIKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRobotAPIKeysMethod(), getCallOptions()), request, responseObserver);
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
     * Marks part for restart. Once the robot part checks-in with the app the flag
     * is reset on the robot part. Calling this multiple times before a robot part
     * checks-in has no affect.
     * Note: This API may be removed in the near future.
     * TODO(APP-388): Remove
     * </pre>
     */
    public void markPartForRestart(viam.app.v1.App.MarkPartForRestartRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.MarkPartForRestartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkPartForRestartMethod(), getCallOptions()), request, responseObserver);
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
     * Get a list of robots
     * </pre>
     */
    public void listRobots(viam.app.v1.App.ListRobotsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListRobotsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRobotsMethod(), getCallOptions()), request, responseObserver);
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

    /**
     * <pre>
     * Gets a list of fragments
     * </pre>
     */
    public void listFragments(viam.app.v1.App.ListFragmentsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListFragmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFragmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a single fragment
     * </pre>
     */
    public void getFragment(viam.app.v1.App.GetFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetFragmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFragmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a fragment
     * </pre>
     */
    public void createFragment(viam.app.v1.App.CreateFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateFragmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFragmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a fragment
     * </pre>
     */
    public void updateFragment(viam.app.v1.App.UpdateFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateFragmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFragmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a fragment
     * </pre>
     */
    public void deleteFragment(viam.app.v1.App.DeleteFragmentRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteFragmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFragmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets top level and nested fragments for a machine, as well as any other specified fragment ids
     * </pre>
     */
    public void listMachineFragments(viam.app.v1.App.ListMachineFragmentsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListMachineFragmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMachineFragmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets fragment history
     * </pre>
     */
    public void getFragmentHistory(viam.app.v1.App.GetFragmentHistoryRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetFragmentHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFragmentHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets usage for a fragment across versions
     * </pre>
     */
    public void getFragmentUsage(viam.app.v1.App.GetFragmentUsageRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetFragmentUsageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFragmentUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets a fragment tag to a revision
     * </pre>
     */
    public void setFragmentTag(viam.app.v1.App.SetFragmentTagRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.SetFragmentTagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetFragmentTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a fragment tag
     * </pre>
     */
    public void deleteFragmentTag(viam.app.v1.App.DeleteFragmentTagRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteFragmentTagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFragmentTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an IdentityAuthorization
     * </pre>
     */
    public void addRole(viam.app.v1.App.AddRoleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.AddRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an IdentityAuthorization
     * </pre>
     */
    public void removeRole(viam.app.v1.App.RemoveRoleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.RemoveRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Changes an IdentityAuthorization to a new IdentityAuthorization
     * </pre>
     */
    public void changeRole(viam.app.v1.App.ChangeRoleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ChangeRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all authorization roles for a given resource
     * </pre>
     */
    public void listAuthorizations(viam.app.v1.App.ListAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAuthorizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validates a permission for the current user
     * </pre>
     */
    public void checkPermissions(viam.app.v1.App.CheckPermissionsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CheckPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRegistryItem(viam.app.v1.App.GetRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetRegistryItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegistryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRegistryItem(viam.app.v1.App.CreateRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateRegistryItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRegistryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRegistryItem(viam.app.v1.App.UpdateRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRegistryItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRegistryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRegistryItems(viam.app.v1.App.ListRegistryItemsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListRegistryItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRegistryItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRegistryItem(viam.app.v1.App.DeleteRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRegistryItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRegistryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferRegistryItem(viam.app.v1.App.TransferRegistryItemRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.TransferRegistryItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferRegistryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createModule(viam.app.v1.App.CreateModuleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateModuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateModuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateModule(viam.app.v1.App.UpdateModuleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateModuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateModuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<viam.app.v1.App.UploadModuleFileRequest> uploadModuleFile(
        io.grpc.stub.StreamObserver<viam.app.v1.App.UploadModuleFileResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadModuleFileMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getModule(viam.app.v1.App.GetModuleRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.GetModuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listModules(viam.app.v1.App.ListModulesRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListModulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createKey(viam.app.v1.App.CreateKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteKey(viam.app.v1.App.DeleteKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listKeys(viam.app.v1.App.ListKeysRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.ListKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void renameKey(viam.app.v1.App.RenameKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.RenameKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenameKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rotateKey(viam.app.v1.App.RotateKeyRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.RotateKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRotateKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createKeyFromExistingKeyAuthorizations(viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateKeyFromExistingKeyAuthorizationsMethod(), getCallOptions()), request, responseObserver);
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
    public viam.app.v1.App.GetUserIDByEmailResponse getUserIDByEmail(viam.app.v1.App.GetUserIDByEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserIDByEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new organization
     * </pre>
     */
    public viam.app.v1.App.CreateOrganizationResponse createOrganization(viam.app.v1.App.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List organizations
     * </pre>
     */
    public viam.app.v1.App.ListOrganizationsResponse listOrganizations(viam.app.v1.App.ListOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all organizations that have access to a location.
     * </pre>
     */
    public viam.app.v1.App.GetOrganizationsWithAccessToLocationResponse getOrganizationsWithAccessToLocation(viam.app.v1.App.GetOrganizationsWithAccessToLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationsWithAccessToLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List the organizations a user belongs to
     * </pre>
     */
    public viam.app.v1.App.ListOrganizationsByUserResponse listOrganizationsByUser(viam.app.v1.App.ListOrganizationsByUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationsByUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search organizations by a couple fields
     * </pre>
     */
    public viam.app.v1.App.SearchOrganizationsResponse searchOrganizations(viam.app.v1.App.SearchOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an organization
     * </pre>
     */
    public viam.app.v1.App.GetOrganizationResponse getOrganization(viam.app.v1.App.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks for namespace availablity throughout all orgs.
     * </pre>
     */
    public viam.app.v1.App.GetOrganizationNamespaceAvailabilityResponse getOrganizationNamespaceAvailability(viam.app.v1.App.GetOrganizationNamespaceAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationNamespaceAvailabilityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an organization
     * </pre>
     */
    public viam.app.v1.App.UpdateOrganizationResponse updateOrganization(viam.app.v1.App.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an organization
     * </pre>
     */
    public viam.app.v1.App.DeleteOrganizationResponse deleteOrganization(viam.app.v1.App.DeleteOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get user-defined metadata for an organization
     * </pre>
     */
    public viam.app.v1.App.GetOrganizationMetadataResponse getOrganizationMetadata(viam.app.v1.App.GetOrganizationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for an organization
     * </pre>
     */
    public viam.app.v1.App.UpdateOrganizationMetadataResponse updateOrganizationMetadata(viam.app.v1.App.UpdateOrganizationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all members of an organization and all invited members to the organization.
     * </pre>
     */
    public viam.app.v1.App.ListOrganizationMembersResponse listOrganizationMembers(viam.app.v1.App.ListOrganizationMembersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an organization invite to an organization
     * </pre>
     */
    public viam.app.v1.App.CreateOrganizationInviteResponse createOrganizationInvite(viam.app.v1.App.CreateOrganizationInviteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationInviteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the authorizations attached to an organization invite
     * </pre>
     */
    public viam.app.v1.App.UpdateOrganizationInviteAuthorizationsResponse updateOrganizationInviteAuthorizations(viam.app.v1.App.UpdateOrganizationInviteAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationInviteAuthorizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an organization member from an organization
     * </pre>
     */
    public viam.app.v1.App.DeleteOrganizationMemberResponse deleteOrganizationMember(viam.app.v1.App.DeleteOrganizationMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOrganizationMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an organization invite
     * </pre>
     */
    public viam.app.v1.App.DeleteOrganizationInviteResponse deleteOrganizationInvite(viam.app.v1.App.DeleteOrganizationInviteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOrganizationInviteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resend an organization invite
     * </pre>
     */
    public viam.app.v1.App.ResendOrganizationInviteResponse resendOrganizationInvite(viam.app.v1.App.ResendOrganizationInviteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendOrganizationInviteMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.EnableBillingServiceResponse enableBillingService(viam.app.v1.App.EnableBillingServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableBillingServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.DisableBillingServiceResponse disableBillingService(viam.app.v1.App.DisableBillingServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableBillingServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.UpdateBillingServiceResponse updateBillingService(viam.app.v1.App.UpdateBillingServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBillingServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.GetBillingServiceConfigResponse getBillingServiceConfig(viam.app.v1.App.GetBillingServiceConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingServiceConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.OrganizationSetSupportEmailResponse organizationSetSupportEmail(viam.app.v1.App.OrganizationSetSupportEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrganizationSetSupportEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.OrganizationGetSupportEmailResponse organizationGetSupportEmail(viam.app.v1.App.OrganizationGetSupportEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrganizationGetSupportEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.OrganizationSetLogoResponse organizationSetLogo(viam.app.v1.App.OrganizationSetLogoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrganizationSetLogoMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.OrganizationGetLogoResponse organizationGetLogo(viam.app.v1.App.OrganizationGetLogoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrganizationGetLogoMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.EnableAuthServiceResponse enableAuthService(viam.app.v1.App.EnableAuthServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableAuthServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.DisableAuthServiceResponse disableAuthService(viam.app.v1.App.DisableAuthServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableAuthServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.CreateOAuthAppResponse createOAuthApp(viam.app.v1.App.CreateOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOAuthAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.ReadOAuthAppResponse readOAuthApp(viam.app.v1.App.ReadOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadOAuthAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.UpdateOAuthAppResponse updateOAuthApp(viam.app.v1.App.UpdateOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOAuthAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.DeleteOAuthAppResponse deleteOAuthApp(viam.app.v1.App.DeleteOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOAuthAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.ListOAuthAppsResponse listOAuthApps(viam.app.v1.App.ListOAuthAppsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOAuthAppsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a location
     * </pre>
     */
    public viam.app.v1.App.CreateLocationResponse createLocation(viam.app.v1.App.CreateLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a location
     * </pre>
     */
    public viam.app.v1.App.GetLocationResponse getLocation(viam.app.v1.App.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a location
     * </pre>
     */
    public viam.app.v1.App.UpdateLocationResponse updateLocation(viam.app.v1.App.UpdateLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a location
     * </pre>
     */
    public viam.app.v1.App.DeleteLocationResponse deleteLocation(viam.app.v1.App.DeleteLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get user-defined metadata for a location
     * </pre>
     */
    public viam.app.v1.App.GetLocationMetadataResponse getLocationMetadata(viam.app.v1.App.GetLocationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocationMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for a location
     * </pre>
     */
    public viam.app.v1.App.UpdateLocationMetadataResponse updateLocationMetadata(viam.app.v1.App.UpdateLocationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLocationMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a list of locations
     * </pre>
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
     * <pre>
     * Get a location's authorization secrets
     * </pre>
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
     * <pre>
     * Get user-defined metadata for a robot
     * </pre>
     */
    public viam.app.v1.App.GetRobotMetadataResponse getRobotMetadata(viam.app.v1.App.GetRobotMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot
     * </pre>
     */
    public viam.app.v1.App.UpdateRobotMetadataResponse updateRobotMetadata(viam.app.v1.App.UpdateRobotMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRobotMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Rover Rental Location Robots
     * </pre>
     */
    public viam.app.v1.App.GetRoverRentalRobotsResponse getRoverRentalRobots(viam.app.v1.App.GetRoverRentalRobotsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoverRentalRobotsMethod(), getCallOptions(), request);
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
     * Get user-defined metadata for a robot part
     * </pre>
     */
    public viam.app.v1.App.GetRobotPartMetadataResponse getRobotPartMetadata(viam.app.v1.App.GetRobotPartMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotPartMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot part
     * </pre>
     */
    public viam.app.v1.App.UpdateRobotPartMetadataResponse updateRobotPartMetadata(viam.app.v1.App.UpdateRobotPartMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRobotPartMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the Robot API Keys for the robot
     * </pre>
     */
    public viam.app.v1.App.GetRobotAPIKeysResponse getRobotAPIKeys(viam.app.v1.App.GetRobotAPIKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRobotAPIKeysMethod(), getCallOptions(), request);
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
     * Marks part for restart. Once the robot part checks-in with the app the flag
     * is reset on the robot part. Calling this multiple times before a robot part
     * checks-in has no affect.
     * Note: This API may be removed in the near future.
     * TODO(APP-388): Remove
     * </pre>
     */
    public viam.app.v1.App.MarkPartForRestartResponse markPartForRestart(viam.app.v1.App.MarkPartForRestartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkPartForRestartMethod(), getCallOptions(), request);
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
     * Get a list of robots
     * </pre>
     */
    public viam.app.v1.App.ListRobotsResponse listRobots(viam.app.v1.App.ListRobotsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRobotsMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     * Gets a list of fragments
     * </pre>
     */
    public viam.app.v1.App.ListFragmentsResponse listFragments(viam.app.v1.App.ListFragmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFragmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single fragment
     * </pre>
     */
    public viam.app.v1.App.GetFragmentResponse getFragment(viam.app.v1.App.GetFragmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFragmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a fragment
     * </pre>
     */
    public viam.app.v1.App.CreateFragmentResponse createFragment(viam.app.v1.App.CreateFragmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFragmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a fragment
     * </pre>
     */
    public viam.app.v1.App.UpdateFragmentResponse updateFragment(viam.app.v1.App.UpdateFragmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFragmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a fragment
     * </pre>
     */
    public viam.app.v1.App.DeleteFragmentResponse deleteFragment(viam.app.v1.App.DeleteFragmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFragmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets top level and nested fragments for a machine, as well as any other specified fragment ids
     * </pre>
     */
    public viam.app.v1.App.ListMachineFragmentsResponse listMachineFragments(viam.app.v1.App.ListMachineFragmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMachineFragmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets fragment history
     * </pre>
     */
    public viam.app.v1.App.GetFragmentHistoryResponse getFragmentHistory(viam.app.v1.App.GetFragmentHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFragmentHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets usage for a fragment across versions
     * </pre>
     */
    public viam.app.v1.App.GetFragmentUsageResponse getFragmentUsage(viam.app.v1.App.GetFragmentUsageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFragmentUsageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets a fragment tag to a revision
     * </pre>
     */
    public viam.app.v1.App.SetFragmentTagResponse setFragmentTag(viam.app.v1.App.SetFragmentTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetFragmentTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a fragment tag
     * </pre>
     */
    public viam.app.v1.App.DeleteFragmentTagResponse deleteFragmentTag(viam.app.v1.App.DeleteFragmentTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFragmentTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an IdentityAuthorization
     * </pre>
     */
    public viam.app.v1.App.AddRoleResponse addRole(viam.app.v1.App.AddRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an IdentityAuthorization
     * </pre>
     */
    public viam.app.v1.App.RemoveRoleResponse removeRole(viam.app.v1.App.RemoveRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Changes an IdentityAuthorization to a new IdentityAuthorization
     * </pre>
     */
    public viam.app.v1.App.ChangeRoleResponse changeRole(viam.app.v1.App.ChangeRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all authorization roles for a given resource
     * </pre>
     */
    public viam.app.v1.App.ListAuthorizationsResponse listAuthorizations(viam.app.v1.App.ListAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAuthorizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validates a permission for the current user
     * </pre>
     */
    public viam.app.v1.App.CheckPermissionsResponse checkPermissions(viam.app.v1.App.CheckPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckPermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.GetRegistryItemResponse getRegistryItem(viam.app.v1.App.GetRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegistryItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.CreateRegistryItemResponse createRegistryItem(viam.app.v1.App.CreateRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRegistryItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.UpdateRegistryItemResponse updateRegistryItem(viam.app.v1.App.UpdateRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRegistryItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.ListRegistryItemsResponse listRegistryItems(viam.app.v1.App.ListRegistryItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRegistryItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.DeleteRegistryItemResponse deleteRegistryItem(viam.app.v1.App.DeleteRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRegistryItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.TransferRegistryItemResponse transferRegistryItem(viam.app.v1.App.TransferRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferRegistryItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.CreateModuleResponse createModule(viam.app.v1.App.CreateModuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateModuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.UpdateModuleResponse updateModule(viam.app.v1.App.UpdateModuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateModuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.GetModuleResponse getModule(viam.app.v1.App.GetModuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.ListModulesResponse listModules(viam.app.v1.App.ListModulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.CreateKeyResponse createKey(viam.app.v1.App.CreateKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.DeleteKeyResponse deleteKey(viam.app.v1.App.DeleteKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.ListKeysResponse listKeys(viam.app.v1.App.ListKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListKeysMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.RenameKeyResponse renameKey(viam.app.v1.App.RenameKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenameKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.RotateKeyResponse rotateKey(viam.app.v1.App.RotateKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRotateKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsResponse createKeyFromExistingKeyAuthorizations(viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateKeyFromExistingKeyAuthorizationsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetUserIDByEmailResponse> getUserIDByEmail(
        viam.app.v1.App.GetUserIDByEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserIDByEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.CreateOrganizationResponse> createOrganization(
        viam.app.v1.App.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List organizations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ListOrganizationsResponse> listOrganizations(
        viam.app.v1.App.ListOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all organizations that have access to a location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetOrganizationsWithAccessToLocationResponse> getOrganizationsWithAccessToLocation(
        viam.app.v1.App.GetOrganizationsWithAccessToLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationsWithAccessToLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List the organizations a user belongs to
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ListOrganizationsByUserResponse> listOrganizationsByUser(
        viam.app.v1.App.ListOrganizationsByUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationsByUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search organizations by a couple fields
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.SearchOrganizationsResponse> searchOrganizations(
        viam.app.v1.App.SearchOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchOrganizationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetOrganizationResponse> getOrganization(
        viam.app.v1.App.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks for namespace availablity throughout all orgs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetOrganizationNamespaceAvailabilityResponse> getOrganizationNamespaceAvailability(
        viam.app.v1.App.GetOrganizationNamespaceAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationNamespaceAvailabilityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateOrganizationResponse> updateOrganization(
        viam.app.v1.App.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DeleteOrganizationResponse> deleteOrganization(
        viam.app.v1.App.DeleteOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get user-defined metadata for an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetOrganizationMetadataResponse> getOrganizationMetadata(
        viam.app.v1.App.GetOrganizationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateOrganizationMetadataResponse> updateOrganizationMetadata(
        viam.app.v1.App.UpdateOrganizationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all members of an organization and all invited members to the organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ListOrganizationMembersResponse> listOrganizationMembers(
        viam.app.v1.App.ListOrganizationMembersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an organization invite to an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.CreateOrganizationInviteResponse> createOrganizationInvite(
        viam.app.v1.App.CreateOrganizationInviteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationInviteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the authorizations attached to an organization invite
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateOrganizationInviteAuthorizationsResponse> updateOrganizationInviteAuthorizations(
        viam.app.v1.App.UpdateOrganizationInviteAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationInviteAuthorizationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an organization member from an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DeleteOrganizationMemberResponse> deleteOrganizationMember(
        viam.app.v1.App.DeleteOrganizationMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOrganizationMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an organization invite
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DeleteOrganizationInviteResponse> deleteOrganizationInvite(
        viam.app.v1.App.DeleteOrganizationInviteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOrganizationInviteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resend an organization invite
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ResendOrganizationInviteResponse> resendOrganizationInvite(
        viam.app.v1.App.ResendOrganizationInviteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendOrganizationInviteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.EnableBillingServiceResponse> enableBillingService(
        viam.app.v1.App.EnableBillingServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableBillingServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DisableBillingServiceResponse> disableBillingService(
        viam.app.v1.App.DisableBillingServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableBillingServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateBillingServiceResponse> updateBillingService(
        viam.app.v1.App.UpdateBillingServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBillingServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetBillingServiceConfigResponse> getBillingServiceConfig(
        viam.app.v1.App.GetBillingServiceConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingServiceConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.OrganizationSetSupportEmailResponse> organizationSetSupportEmail(
        viam.app.v1.App.OrganizationSetSupportEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrganizationSetSupportEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.OrganizationGetSupportEmailResponse> organizationGetSupportEmail(
        viam.app.v1.App.OrganizationGetSupportEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrganizationGetSupportEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.OrganizationSetLogoResponse> organizationSetLogo(
        viam.app.v1.App.OrganizationSetLogoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrganizationSetLogoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.OrganizationGetLogoResponse> organizationGetLogo(
        viam.app.v1.App.OrganizationGetLogoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrganizationGetLogoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.EnableAuthServiceResponse> enableAuthService(
        viam.app.v1.App.EnableAuthServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableAuthServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DisableAuthServiceResponse> disableAuthService(
        viam.app.v1.App.DisableAuthServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableAuthServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.CreateOAuthAppResponse> createOAuthApp(
        viam.app.v1.App.CreateOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOAuthAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ReadOAuthAppResponse> readOAuthApp(
        viam.app.v1.App.ReadOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadOAuthAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateOAuthAppResponse> updateOAuthApp(
        viam.app.v1.App.UpdateOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOAuthAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DeleteOAuthAppResponse> deleteOAuthApp(
        viam.app.v1.App.DeleteOAuthAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOAuthAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ListOAuthAppsResponse> listOAuthApps(
        viam.app.v1.App.ListOAuthAppsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOAuthAppsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a location
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.CreateLocationResponse> createLocation(
        viam.app.v1.App.CreateLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a location
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetLocationResponse> getLocation(
        viam.app.v1.App.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a location
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateLocationResponse> updateLocation(
        viam.app.v1.App.UpdateLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a location
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DeleteLocationResponse> deleteLocation(
        viam.app.v1.App.DeleteLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get user-defined metadata for a location
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetLocationMetadataResponse> getLocationMetadata(
        viam.app.v1.App.GetLocationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocationMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for a location
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateLocationMetadataResponse> updateLocationMetadata(
        viam.app.v1.App.UpdateLocationMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLocationMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a list of locations
     * </pre>
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
     * <pre>
     * Get a location's authorization secrets
     * </pre>
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
     * <pre>
     * Get user-defined metadata for a robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetRobotMetadataResponse> getRobotMetadata(
        viam.app.v1.App.GetRobotMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateRobotMetadataResponse> updateRobotMetadata(
        viam.app.v1.App.UpdateRobotMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRobotMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get Rover Rental Location Robots
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetRoverRentalRobotsResponse> getRoverRentalRobots(
        viam.app.v1.App.GetRoverRentalRobotsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoverRentalRobotsMethod(), getCallOptions()), request);
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
     * Get user-defined metadata for a robot part
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetRobotPartMetadataResponse> getRobotPartMetadata(
        viam.app.v1.App.GetRobotPartMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotPartMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update user-defined metadata for an robot part
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateRobotPartMetadataResponse> updateRobotPartMetadata(
        viam.app.v1.App.UpdateRobotPartMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRobotPartMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the Robot API Keys for the robot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetRobotAPIKeysResponse> getRobotAPIKeys(
        viam.app.v1.App.GetRobotAPIKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRobotAPIKeysMethod(), getCallOptions()), request);
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
     * Marks part for restart. Once the robot part checks-in with the app the flag
     * is reset on the robot part. Calling this multiple times before a robot part
     * checks-in has no affect.
     * Note: This API may be removed in the near future.
     * TODO(APP-388): Remove
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.MarkPartForRestartResponse> markPartForRestart(
        viam.app.v1.App.MarkPartForRestartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkPartForRestartMethod(), getCallOptions()), request);
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
     * Get a list of robots
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ListRobotsResponse> listRobots(
        viam.app.v1.App.ListRobotsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRobotsMethod(), getCallOptions()), request);
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

    /**
     * <pre>
     * Gets a list of fragments
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ListFragmentsResponse> listFragments(
        viam.app.v1.App.ListFragmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFragmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a single fragment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetFragmentResponse> getFragment(
        viam.app.v1.App.GetFragmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFragmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a fragment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.CreateFragmentResponse> createFragment(
        viam.app.v1.App.CreateFragmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFragmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a fragment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateFragmentResponse> updateFragment(
        viam.app.v1.App.UpdateFragmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFragmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a fragment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DeleteFragmentResponse> deleteFragment(
        viam.app.v1.App.DeleteFragmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFragmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets top level and nested fragments for a machine, as well as any other specified fragment ids
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ListMachineFragmentsResponse> listMachineFragments(
        viam.app.v1.App.ListMachineFragmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMachineFragmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets fragment history
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetFragmentHistoryResponse> getFragmentHistory(
        viam.app.v1.App.GetFragmentHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFragmentHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets usage for a fragment across versions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetFragmentUsageResponse> getFragmentUsage(
        viam.app.v1.App.GetFragmentUsageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFragmentUsageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets a fragment tag to a revision
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.SetFragmentTagResponse> setFragmentTag(
        viam.app.v1.App.SetFragmentTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetFragmentTagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a fragment tag
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DeleteFragmentTagResponse> deleteFragmentTag(
        viam.app.v1.App.DeleteFragmentTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFragmentTagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an IdentityAuthorization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.AddRoleResponse> addRole(
        viam.app.v1.App.AddRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an IdentityAuthorization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.RemoveRoleResponse> removeRole(
        viam.app.v1.App.RemoveRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Changes an IdentityAuthorization to a new IdentityAuthorization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ChangeRoleResponse> changeRole(
        viam.app.v1.App.ChangeRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all authorization roles for a given resource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ListAuthorizationsResponse> listAuthorizations(
        viam.app.v1.App.ListAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAuthorizationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validates a permission for the current user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.CheckPermissionsResponse> checkPermissions(
        viam.app.v1.App.CheckPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckPermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetRegistryItemResponse> getRegistryItem(
        viam.app.v1.App.GetRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegistryItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.CreateRegistryItemResponse> createRegistryItem(
        viam.app.v1.App.CreateRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRegistryItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateRegistryItemResponse> updateRegistryItem(
        viam.app.v1.App.UpdateRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRegistryItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ListRegistryItemsResponse> listRegistryItems(
        viam.app.v1.App.ListRegistryItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRegistryItemsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DeleteRegistryItemResponse> deleteRegistryItem(
        viam.app.v1.App.DeleteRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRegistryItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.TransferRegistryItemResponse> transferRegistryItem(
        viam.app.v1.App.TransferRegistryItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferRegistryItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.CreateModuleResponse> createModule(
        viam.app.v1.App.CreateModuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateModuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.UpdateModuleResponse> updateModule(
        viam.app.v1.App.UpdateModuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateModuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.GetModuleResponse> getModule(
        viam.app.v1.App.GetModuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ListModulesResponse> listModules(
        viam.app.v1.App.ListModulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.CreateKeyResponse> createKey(
        viam.app.v1.App.CreateKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.DeleteKeyResponse> deleteKey(
        viam.app.v1.App.DeleteKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.ListKeysResponse> listKeys(
        viam.app.v1.App.ListKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListKeysMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.RenameKeyResponse> renameKey(
        viam.app.v1.App.RenameKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenameKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.RotateKeyResponse> rotateKey(
        viam.app.v1.App.RotateKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRotateKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsResponse> createKeyFromExistingKeyAuthorizations(
        viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateKeyFromExistingKeyAuthorizationsMethod(), getCallOptions()), request);
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
  private static final int METHODID_DELETE_ORGANIZATION = 9;
  private static final int METHODID_GET_ORGANIZATION_METADATA = 10;
  private static final int METHODID_UPDATE_ORGANIZATION_METADATA = 11;
  private static final int METHODID_LIST_ORGANIZATION_MEMBERS = 12;
  private static final int METHODID_CREATE_ORGANIZATION_INVITE = 13;
  private static final int METHODID_UPDATE_ORGANIZATION_INVITE_AUTHORIZATIONS = 14;
  private static final int METHODID_DELETE_ORGANIZATION_MEMBER = 15;
  private static final int METHODID_DELETE_ORGANIZATION_INVITE = 16;
  private static final int METHODID_RESEND_ORGANIZATION_INVITE = 17;
  private static final int METHODID_ENABLE_BILLING_SERVICE = 18;
  private static final int METHODID_DISABLE_BILLING_SERVICE = 19;
  private static final int METHODID_UPDATE_BILLING_SERVICE = 20;
  private static final int METHODID_GET_BILLING_SERVICE_CONFIG = 21;
  private static final int METHODID_ORGANIZATION_SET_SUPPORT_EMAIL = 22;
  private static final int METHODID_ORGANIZATION_GET_SUPPORT_EMAIL = 23;
  private static final int METHODID_ORGANIZATION_SET_LOGO = 24;
  private static final int METHODID_ORGANIZATION_GET_LOGO = 25;
  private static final int METHODID_ENABLE_AUTH_SERVICE = 26;
  private static final int METHODID_DISABLE_AUTH_SERVICE = 27;
  private static final int METHODID_CREATE_OAUTH_APP = 28;
  private static final int METHODID_READ_OAUTH_APP = 29;
  private static final int METHODID_UPDATE_OAUTH_APP = 30;
  private static final int METHODID_DELETE_OAUTH_APP = 31;
  private static final int METHODID_LIST_OAUTH_APPS = 32;
  private static final int METHODID_CREATE_LOCATION = 33;
  private static final int METHODID_GET_LOCATION = 34;
  private static final int METHODID_UPDATE_LOCATION = 35;
  private static final int METHODID_DELETE_LOCATION = 36;
  private static final int METHODID_GET_LOCATION_METADATA = 37;
  private static final int METHODID_UPDATE_LOCATION_METADATA = 38;
  private static final int METHODID_LIST_LOCATIONS = 39;
  private static final int METHODID_SHARE_LOCATION = 40;
  private static final int METHODID_UNSHARE_LOCATION = 41;
  private static final int METHODID_LOCATION_AUTH = 42;
  private static final int METHODID_CREATE_LOCATION_SECRET = 43;
  private static final int METHODID_DELETE_LOCATION_SECRET = 44;
  private static final int METHODID_GET_ROBOT = 45;
  private static final int METHODID_GET_ROBOT_METADATA = 46;
  private static final int METHODID_UPDATE_ROBOT_METADATA = 47;
  private static final int METHODID_GET_ROVER_RENTAL_ROBOTS = 48;
  private static final int METHODID_GET_ROBOT_PARTS = 49;
  private static final int METHODID_GET_ROBOT_PART = 50;
  private static final int METHODID_GET_ROBOT_PART_LOGS = 51;
  private static final int METHODID_TAIL_ROBOT_PART_LOGS = 52;
  private static final int METHODID_GET_ROBOT_PART_HISTORY = 53;
  private static final int METHODID_UPDATE_ROBOT_PART = 54;
  private static final int METHODID_NEW_ROBOT_PART = 55;
  private static final int METHODID_DELETE_ROBOT_PART = 56;
  private static final int METHODID_GET_ROBOT_PART_METADATA = 57;
  private static final int METHODID_UPDATE_ROBOT_PART_METADATA = 58;
  private static final int METHODID_GET_ROBOT_APIKEYS = 59;
  private static final int METHODID_MARK_PART_AS_MAIN = 60;
  private static final int METHODID_MARK_PART_FOR_RESTART = 61;
  private static final int METHODID_CREATE_ROBOT_PART_SECRET = 62;
  private static final int METHODID_DELETE_ROBOT_PART_SECRET = 63;
  private static final int METHODID_LIST_ROBOTS = 64;
  private static final int METHODID_NEW_ROBOT = 65;
  private static final int METHODID_UPDATE_ROBOT = 66;
  private static final int METHODID_DELETE_ROBOT = 67;
  private static final int METHODID_LIST_FRAGMENTS = 68;
  private static final int METHODID_GET_FRAGMENT = 69;
  private static final int METHODID_CREATE_FRAGMENT = 70;
  private static final int METHODID_UPDATE_FRAGMENT = 71;
  private static final int METHODID_DELETE_FRAGMENT = 72;
  private static final int METHODID_LIST_MACHINE_FRAGMENTS = 73;
  private static final int METHODID_GET_FRAGMENT_HISTORY = 74;
  private static final int METHODID_GET_FRAGMENT_USAGE = 75;
  private static final int METHODID_SET_FRAGMENT_TAG = 76;
  private static final int METHODID_DELETE_FRAGMENT_TAG = 77;
  private static final int METHODID_ADD_ROLE = 78;
  private static final int METHODID_REMOVE_ROLE = 79;
  private static final int METHODID_CHANGE_ROLE = 80;
  private static final int METHODID_LIST_AUTHORIZATIONS = 81;
  private static final int METHODID_CHECK_PERMISSIONS = 82;
  private static final int METHODID_GET_REGISTRY_ITEM = 83;
  private static final int METHODID_CREATE_REGISTRY_ITEM = 84;
  private static final int METHODID_UPDATE_REGISTRY_ITEM = 85;
  private static final int METHODID_LIST_REGISTRY_ITEMS = 86;
  private static final int METHODID_DELETE_REGISTRY_ITEM = 87;
  private static final int METHODID_TRANSFER_REGISTRY_ITEM = 88;
  private static final int METHODID_CREATE_MODULE = 89;
  private static final int METHODID_UPDATE_MODULE = 90;
  private static final int METHODID_GET_MODULE = 91;
  private static final int METHODID_LIST_MODULES = 92;
  private static final int METHODID_CREATE_KEY = 93;
  private static final int METHODID_DELETE_KEY = 94;
  private static final int METHODID_LIST_KEYS = 95;
  private static final int METHODID_RENAME_KEY = 96;
  private static final int METHODID_ROTATE_KEY = 97;
  private static final int METHODID_CREATE_KEY_FROM_EXISTING_KEY_AUTHORIZATIONS = 98;
  private static final int METHODID_UPLOAD_MODULE_FILE = 99;

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
          serviceImpl.getUserIDByEmail((viam.app.v1.App.GetUserIDByEmailRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetUserIDByEmailResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORGANIZATION:
          serviceImpl.createOrganization((viam.app.v1.App.CreateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CreateOrganizationResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATIONS:
          serviceImpl.listOrganizations((viam.app.v1.App.ListOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ListOrganizationsResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATIONS_WITH_ACCESS_TO_LOCATION:
          serviceImpl.getOrganizationsWithAccessToLocation((viam.app.v1.App.GetOrganizationsWithAccessToLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetOrganizationsWithAccessToLocationResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATIONS_BY_USER:
          serviceImpl.listOrganizationsByUser((viam.app.v1.App.ListOrganizationsByUserRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ListOrganizationsByUserResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ORGANIZATIONS:
          serviceImpl.searchOrganizations((viam.app.v1.App.SearchOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.SearchOrganizationsResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION:
          serviceImpl.getOrganization((viam.app.v1.App.GetOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetOrganizationResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_NAMESPACE_AVAILABILITY:
          serviceImpl.getOrganizationNamespaceAvailability((viam.app.v1.App.GetOrganizationNamespaceAvailabilityRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetOrganizationNamespaceAvailabilityResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION:
          serviceImpl.updateOrganization((viam.app.v1.App.UpdateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateOrganizationResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORGANIZATION:
          serviceImpl.deleteOrganization((viam.app.v1.App.DeleteOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteOrganizationResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_METADATA:
          serviceImpl.getOrganizationMetadata((viam.app.v1.App.GetOrganizationMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetOrganizationMetadataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION_METADATA:
          serviceImpl.updateOrganizationMetadata((viam.app.v1.App.UpdateOrganizationMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateOrganizationMetadataResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATION_MEMBERS:
          serviceImpl.listOrganizationMembers((viam.app.v1.App.ListOrganizationMembersRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ListOrganizationMembersResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORGANIZATION_INVITE:
          serviceImpl.createOrganizationInvite((viam.app.v1.App.CreateOrganizationInviteRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CreateOrganizationInviteResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION_INVITE_AUTHORIZATIONS:
          serviceImpl.updateOrganizationInviteAuthorizations((viam.app.v1.App.UpdateOrganizationInviteAuthorizationsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateOrganizationInviteAuthorizationsResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORGANIZATION_MEMBER:
          serviceImpl.deleteOrganizationMember((viam.app.v1.App.DeleteOrganizationMemberRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteOrganizationMemberResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORGANIZATION_INVITE:
          serviceImpl.deleteOrganizationInvite((viam.app.v1.App.DeleteOrganizationInviteRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteOrganizationInviteResponse>) responseObserver);
          break;
        case METHODID_RESEND_ORGANIZATION_INVITE:
          serviceImpl.resendOrganizationInvite((viam.app.v1.App.ResendOrganizationInviteRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ResendOrganizationInviteResponse>) responseObserver);
          break;
        case METHODID_ENABLE_BILLING_SERVICE:
          serviceImpl.enableBillingService((viam.app.v1.App.EnableBillingServiceRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.EnableBillingServiceResponse>) responseObserver);
          break;
        case METHODID_DISABLE_BILLING_SERVICE:
          serviceImpl.disableBillingService((viam.app.v1.App.DisableBillingServiceRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DisableBillingServiceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BILLING_SERVICE:
          serviceImpl.updateBillingService((viam.app.v1.App.UpdateBillingServiceRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateBillingServiceResponse>) responseObserver);
          break;
        case METHODID_GET_BILLING_SERVICE_CONFIG:
          serviceImpl.getBillingServiceConfig((viam.app.v1.App.GetBillingServiceConfigRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetBillingServiceConfigResponse>) responseObserver);
          break;
        case METHODID_ORGANIZATION_SET_SUPPORT_EMAIL:
          serviceImpl.organizationSetSupportEmail((viam.app.v1.App.OrganizationSetSupportEmailRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.OrganizationSetSupportEmailResponse>) responseObserver);
          break;
        case METHODID_ORGANIZATION_GET_SUPPORT_EMAIL:
          serviceImpl.organizationGetSupportEmail((viam.app.v1.App.OrganizationGetSupportEmailRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.OrganizationGetSupportEmailResponse>) responseObserver);
          break;
        case METHODID_ORGANIZATION_SET_LOGO:
          serviceImpl.organizationSetLogo((viam.app.v1.App.OrganizationSetLogoRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.OrganizationSetLogoResponse>) responseObserver);
          break;
        case METHODID_ORGANIZATION_GET_LOGO:
          serviceImpl.organizationGetLogo((viam.app.v1.App.OrganizationGetLogoRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.OrganizationGetLogoResponse>) responseObserver);
          break;
        case METHODID_ENABLE_AUTH_SERVICE:
          serviceImpl.enableAuthService((viam.app.v1.App.EnableAuthServiceRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.EnableAuthServiceResponse>) responseObserver);
          break;
        case METHODID_DISABLE_AUTH_SERVICE:
          serviceImpl.disableAuthService((viam.app.v1.App.DisableAuthServiceRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DisableAuthServiceResponse>) responseObserver);
          break;
        case METHODID_CREATE_OAUTH_APP:
          serviceImpl.createOAuthApp((viam.app.v1.App.CreateOAuthAppRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CreateOAuthAppResponse>) responseObserver);
          break;
        case METHODID_READ_OAUTH_APP:
          serviceImpl.readOAuthApp((viam.app.v1.App.ReadOAuthAppRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ReadOAuthAppResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OAUTH_APP:
          serviceImpl.updateOAuthApp((viam.app.v1.App.UpdateOAuthAppRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateOAuthAppResponse>) responseObserver);
          break;
        case METHODID_DELETE_OAUTH_APP:
          serviceImpl.deleteOAuthApp((viam.app.v1.App.DeleteOAuthAppRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteOAuthAppResponse>) responseObserver);
          break;
        case METHODID_LIST_OAUTH_APPS:
          serviceImpl.listOAuthApps((viam.app.v1.App.ListOAuthAppsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ListOAuthAppsResponse>) responseObserver);
          break;
        case METHODID_CREATE_LOCATION:
          serviceImpl.createLocation((viam.app.v1.App.CreateLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CreateLocationResponse>) responseObserver);
          break;
        case METHODID_GET_LOCATION:
          serviceImpl.getLocation((viam.app.v1.App.GetLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetLocationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LOCATION:
          serviceImpl.updateLocation((viam.app.v1.App.UpdateLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateLocationResponse>) responseObserver);
          break;
        case METHODID_DELETE_LOCATION:
          serviceImpl.deleteLocation((viam.app.v1.App.DeleteLocationRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteLocationResponse>) responseObserver);
          break;
        case METHODID_GET_LOCATION_METADATA:
          serviceImpl.getLocationMetadata((viam.app.v1.App.GetLocationMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetLocationMetadataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LOCATION_METADATA:
          serviceImpl.updateLocationMetadata((viam.app.v1.App.UpdateLocationMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateLocationMetadataResponse>) responseObserver);
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
        case METHODID_GET_ROBOT_METADATA:
          serviceImpl.getRobotMetadata((viam.app.v1.App.GetRobotMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotMetadataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROBOT_METADATA:
          serviceImpl.updateRobotMetadata((viam.app.v1.App.UpdateRobotMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotMetadataResponse>) responseObserver);
          break;
        case METHODID_GET_ROVER_RENTAL_ROBOTS:
          serviceImpl.getRoverRentalRobots((viam.app.v1.App.GetRoverRentalRobotsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetRoverRentalRobotsResponse>) responseObserver);
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
        case METHODID_GET_ROBOT_PART_METADATA:
          serviceImpl.getRobotPartMetadata((viam.app.v1.App.GetRobotPartMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotPartMetadataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROBOT_PART_METADATA:
          serviceImpl.updateRobotPartMetadata((viam.app.v1.App.UpdateRobotPartMetadataRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRobotPartMetadataResponse>) responseObserver);
          break;
        case METHODID_GET_ROBOT_APIKEYS:
          serviceImpl.getRobotAPIKeys((viam.app.v1.App.GetRobotAPIKeysRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetRobotAPIKeysResponse>) responseObserver);
          break;
        case METHODID_MARK_PART_AS_MAIN:
          serviceImpl.markPartAsMain((viam.app.v1.App.MarkPartAsMainRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.MarkPartAsMainResponse>) responseObserver);
          break;
        case METHODID_MARK_PART_FOR_RESTART:
          serviceImpl.markPartForRestart((viam.app.v1.App.MarkPartForRestartRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.MarkPartForRestartResponse>) responseObserver);
          break;
        case METHODID_CREATE_ROBOT_PART_SECRET:
          serviceImpl.createRobotPartSecret((viam.app.v1.App.CreateRobotPartSecretRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CreateRobotPartSecretResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROBOT_PART_SECRET:
          serviceImpl.deleteRobotPartSecret((viam.app.v1.App.DeleteRobotPartSecretRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRobotPartSecretResponse>) responseObserver);
          break;
        case METHODID_LIST_ROBOTS:
          serviceImpl.listRobots((viam.app.v1.App.ListRobotsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ListRobotsResponse>) responseObserver);
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
        case METHODID_LIST_FRAGMENTS:
          serviceImpl.listFragments((viam.app.v1.App.ListFragmentsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ListFragmentsResponse>) responseObserver);
          break;
        case METHODID_GET_FRAGMENT:
          serviceImpl.getFragment((viam.app.v1.App.GetFragmentRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetFragmentResponse>) responseObserver);
          break;
        case METHODID_CREATE_FRAGMENT:
          serviceImpl.createFragment((viam.app.v1.App.CreateFragmentRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CreateFragmentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FRAGMENT:
          serviceImpl.updateFragment((viam.app.v1.App.UpdateFragmentRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateFragmentResponse>) responseObserver);
          break;
        case METHODID_DELETE_FRAGMENT:
          serviceImpl.deleteFragment((viam.app.v1.App.DeleteFragmentRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteFragmentResponse>) responseObserver);
          break;
        case METHODID_LIST_MACHINE_FRAGMENTS:
          serviceImpl.listMachineFragments((viam.app.v1.App.ListMachineFragmentsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ListMachineFragmentsResponse>) responseObserver);
          break;
        case METHODID_GET_FRAGMENT_HISTORY:
          serviceImpl.getFragmentHistory((viam.app.v1.App.GetFragmentHistoryRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetFragmentHistoryResponse>) responseObserver);
          break;
        case METHODID_GET_FRAGMENT_USAGE:
          serviceImpl.getFragmentUsage((viam.app.v1.App.GetFragmentUsageRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetFragmentUsageResponse>) responseObserver);
          break;
        case METHODID_SET_FRAGMENT_TAG:
          serviceImpl.setFragmentTag((viam.app.v1.App.SetFragmentTagRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.SetFragmentTagResponse>) responseObserver);
          break;
        case METHODID_DELETE_FRAGMENT_TAG:
          serviceImpl.deleteFragmentTag((viam.app.v1.App.DeleteFragmentTagRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteFragmentTagResponse>) responseObserver);
          break;
        case METHODID_ADD_ROLE:
          serviceImpl.addRole((viam.app.v1.App.AddRoleRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.AddRoleResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ROLE:
          serviceImpl.removeRole((viam.app.v1.App.RemoveRoleRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.RemoveRoleResponse>) responseObserver);
          break;
        case METHODID_CHANGE_ROLE:
          serviceImpl.changeRole((viam.app.v1.App.ChangeRoleRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ChangeRoleResponse>) responseObserver);
          break;
        case METHODID_LIST_AUTHORIZATIONS:
          serviceImpl.listAuthorizations((viam.app.v1.App.ListAuthorizationsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ListAuthorizationsResponse>) responseObserver);
          break;
        case METHODID_CHECK_PERMISSIONS:
          serviceImpl.checkPermissions((viam.app.v1.App.CheckPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CheckPermissionsResponse>) responseObserver);
          break;
        case METHODID_GET_REGISTRY_ITEM:
          serviceImpl.getRegistryItem((viam.app.v1.App.GetRegistryItemRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetRegistryItemResponse>) responseObserver);
          break;
        case METHODID_CREATE_REGISTRY_ITEM:
          serviceImpl.createRegistryItem((viam.app.v1.App.CreateRegistryItemRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CreateRegistryItemResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REGISTRY_ITEM:
          serviceImpl.updateRegistryItem((viam.app.v1.App.UpdateRegistryItemRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateRegistryItemResponse>) responseObserver);
          break;
        case METHODID_LIST_REGISTRY_ITEMS:
          serviceImpl.listRegistryItems((viam.app.v1.App.ListRegistryItemsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ListRegistryItemsResponse>) responseObserver);
          break;
        case METHODID_DELETE_REGISTRY_ITEM:
          serviceImpl.deleteRegistryItem((viam.app.v1.App.DeleteRegistryItemRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteRegistryItemResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_REGISTRY_ITEM:
          serviceImpl.transferRegistryItem((viam.app.v1.App.TransferRegistryItemRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.TransferRegistryItemResponse>) responseObserver);
          break;
        case METHODID_CREATE_MODULE:
          serviceImpl.createModule((viam.app.v1.App.CreateModuleRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CreateModuleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MODULE:
          serviceImpl.updateModule((viam.app.v1.App.UpdateModuleRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UpdateModuleResponse>) responseObserver);
          break;
        case METHODID_GET_MODULE:
          serviceImpl.getModule((viam.app.v1.App.GetModuleRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.GetModuleResponse>) responseObserver);
          break;
        case METHODID_LIST_MODULES:
          serviceImpl.listModules((viam.app.v1.App.ListModulesRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ListModulesResponse>) responseObserver);
          break;
        case METHODID_CREATE_KEY:
          serviceImpl.createKey((viam.app.v1.App.CreateKeyRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CreateKeyResponse>) responseObserver);
          break;
        case METHODID_DELETE_KEY:
          serviceImpl.deleteKey((viam.app.v1.App.DeleteKeyRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.DeleteKeyResponse>) responseObserver);
          break;
        case METHODID_LIST_KEYS:
          serviceImpl.listKeys((viam.app.v1.App.ListKeysRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.ListKeysResponse>) responseObserver);
          break;
        case METHODID_RENAME_KEY:
          serviceImpl.renameKey((viam.app.v1.App.RenameKeyRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.RenameKeyResponse>) responseObserver);
          break;
        case METHODID_ROTATE_KEY:
          serviceImpl.rotateKey((viam.app.v1.App.RotateKeyRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.RotateKeyResponse>) responseObserver);
          break;
        case METHODID_CREATE_KEY_FROM_EXISTING_KEY_AUTHORIZATIONS:
          serviceImpl.createKeyFromExistingKeyAuthorizations((viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsRequest) request,
              (io.grpc.stub.StreamObserver<viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<viam.app.v1.App.UploadModuleFileResponse>) responseObserver);
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
              viam.app.v1.App.GetUserIDByEmailRequest,
              viam.app.v1.App.GetUserIDByEmailResponse>(
                service, METHODID_GET_USER_IDBY_EMAIL)))
        .addMethod(
          getCreateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.CreateOrganizationRequest,
              viam.app.v1.App.CreateOrganizationResponse>(
                service, METHODID_CREATE_ORGANIZATION)))
        .addMethod(
          getListOrganizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ListOrganizationsRequest,
              viam.app.v1.App.ListOrganizationsResponse>(
                service, METHODID_LIST_ORGANIZATIONS)))
        .addMethod(
          getGetOrganizationsWithAccessToLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetOrganizationsWithAccessToLocationRequest,
              viam.app.v1.App.GetOrganizationsWithAccessToLocationResponse>(
                service, METHODID_GET_ORGANIZATIONS_WITH_ACCESS_TO_LOCATION)))
        .addMethod(
          getListOrganizationsByUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ListOrganizationsByUserRequest,
              viam.app.v1.App.ListOrganizationsByUserResponse>(
                service, METHODID_LIST_ORGANIZATIONS_BY_USER)))
        .addMethod(
          getSearchOrganizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.SearchOrganizationsRequest,
              viam.app.v1.App.SearchOrganizationsResponse>(
                service, METHODID_SEARCH_ORGANIZATIONS)))
        .addMethod(
          getGetOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetOrganizationRequest,
              viam.app.v1.App.GetOrganizationResponse>(
                service, METHODID_GET_ORGANIZATION)))
        .addMethod(
          getGetOrganizationNamespaceAvailabilityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetOrganizationNamespaceAvailabilityRequest,
              viam.app.v1.App.GetOrganizationNamespaceAvailabilityResponse>(
                service, METHODID_GET_ORGANIZATION_NAMESPACE_AVAILABILITY)))
        .addMethod(
          getUpdateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateOrganizationRequest,
              viam.app.v1.App.UpdateOrganizationResponse>(
                service, METHODID_UPDATE_ORGANIZATION)))
        .addMethod(
          getDeleteOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DeleteOrganizationRequest,
              viam.app.v1.App.DeleteOrganizationResponse>(
                service, METHODID_DELETE_ORGANIZATION)))
        .addMethod(
          getGetOrganizationMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetOrganizationMetadataRequest,
              viam.app.v1.App.GetOrganizationMetadataResponse>(
                service, METHODID_GET_ORGANIZATION_METADATA)))
        .addMethod(
          getUpdateOrganizationMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateOrganizationMetadataRequest,
              viam.app.v1.App.UpdateOrganizationMetadataResponse>(
                service, METHODID_UPDATE_ORGANIZATION_METADATA)))
        .addMethod(
          getListOrganizationMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ListOrganizationMembersRequest,
              viam.app.v1.App.ListOrganizationMembersResponse>(
                service, METHODID_LIST_ORGANIZATION_MEMBERS)))
        .addMethod(
          getCreateOrganizationInviteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.CreateOrganizationInviteRequest,
              viam.app.v1.App.CreateOrganizationInviteResponse>(
                service, METHODID_CREATE_ORGANIZATION_INVITE)))
        .addMethod(
          getUpdateOrganizationInviteAuthorizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateOrganizationInviteAuthorizationsRequest,
              viam.app.v1.App.UpdateOrganizationInviteAuthorizationsResponse>(
                service, METHODID_UPDATE_ORGANIZATION_INVITE_AUTHORIZATIONS)))
        .addMethod(
          getDeleteOrganizationMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DeleteOrganizationMemberRequest,
              viam.app.v1.App.DeleteOrganizationMemberResponse>(
                service, METHODID_DELETE_ORGANIZATION_MEMBER)))
        .addMethod(
          getDeleteOrganizationInviteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DeleteOrganizationInviteRequest,
              viam.app.v1.App.DeleteOrganizationInviteResponse>(
                service, METHODID_DELETE_ORGANIZATION_INVITE)))
        .addMethod(
          getResendOrganizationInviteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ResendOrganizationInviteRequest,
              viam.app.v1.App.ResendOrganizationInviteResponse>(
                service, METHODID_RESEND_ORGANIZATION_INVITE)))
        .addMethod(
          getEnableBillingServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.EnableBillingServiceRequest,
              viam.app.v1.App.EnableBillingServiceResponse>(
                service, METHODID_ENABLE_BILLING_SERVICE)))
        .addMethod(
          getDisableBillingServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DisableBillingServiceRequest,
              viam.app.v1.App.DisableBillingServiceResponse>(
                service, METHODID_DISABLE_BILLING_SERVICE)))
        .addMethod(
          getUpdateBillingServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateBillingServiceRequest,
              viam.app.v1.App.UpdateBillingServiceResponse>(
                service, METHODID_UPDATE_BILLING_SERVICE)))
        .addMethod(
          getGetBillingServiceConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetBillingServiceConfigRequest,
              viam.app.v1.App.GetBillingServiceConfigResponse>(
                service, METHODID_GET_BILLING_SERVICE_CONFIG)))
        .addMethod(
          getOrganizationSetSupportEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.OrganizationSetSupportEmailRequest,
              viam.app.v1.App.OrganizationSetSupportEmailResponse>(
                service, METHODID_ORGANIZATION_SET_SUPPORT_EMAIL)))
        .addMethod(
          getOrganizationGetSupportEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.OrganizationGetSupportEmailRequest,
              viam.app.v1.App.OrganizationGetSupportEmailResponse>(
                service, METHODID_ORGANIZATION_GET_SUPPORT_EMAIL)))
        .addMethod(
          getOrganizationSetLogoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.OrganizationSetLogoRequest,
              viam.app.v1.App.OrganizationSetLogoResponse>(
                service, METHODID_ORGANIZATION_SET_LOGO)))
        .addMethod(
          getOrganizationGetLogoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.OrganizationGetLogoRequest,
              viam.app.v1.App.OrganizationGetLogoResponse>(
                service, METHODID_ORGANIZATION_GET_LOGO)))
        .addMethod(
          getEnableAuthServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.EnableAuthServiceRequest,
              viam.app.v1.App.EnableAuthServiceResponse>(
                service, METHODID_ENABLE_AUTH_SERVICE)))
        .addMethod(
          getDisableAuthServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DisableAuthServiceRequest,
              viam.app.v1.App.DisableAuthServiceResponse>(
                service, METHODID_DISABLE_AUTH_SERVICE)))
        .addMethod(
          getCreateOAuthAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.CreateOAuthAppRequest,
              viam.app.v1.App.CreateOAuthAppResponse>(
                service, METHODID_CREATE_OAUTH_APP)))
        .addMethod(
          getReadOAuthAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ReadOAuthAppRequest,
              viam.app.v1.App.ReadOAuthAppResponse>(
                service, METHODID_READ_OAUTH_APP)))
        .addMethod(
          getUpdateOAuthAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateOAuthAppRequest,
              viam.app.v1.App.UpdateOAuthAppResponse>(
                service, METHODID_UPDATE_OAUTH_APP)))
        .addMethod(
          getDeleteOAuthAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DeleteOAuthAppRequest,
              viam.app.v1.App.DeleteOAuthAppResponse>(
                service, METHODID_DELETE_OAUTH_APP)))
        .addMethod(
          getListOAuthAppsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ListOAuthAppsRequest,
              viam.app.v1.App.ListOAuthAppsResponse>(
                service, METHODID_LIST_OAUTH_APPS)))
        .addMethod(
          getCreateLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.CreateLocationRequest,
              viam.app.v1.App.CreateLocationResponse>(
                service, METHODID_CREATE_LOCATION)))
        .addMethod(
          getGetLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetLocationRequest,
              viam.app.v1.App.GetLocationResponse>(
                service, METHODID_GET_LOCATION)))
        .addMethod(
          getUpdateLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateLocationRequest,
              viam.app.v1.App.UpdateLocationResponse>(
                service, METHODID_UPDATE_LOCATION)))
        .addMethod(
          getDeleteLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DeleteLocationRequest,
              viam.app.v1.App.DeleteLocationResponse>(
                service, METHODID_DELETE_LOCATION)))
        .addMethod(
          getGetLocationMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetLocationMetadataRequest,
              viam.app.v1.App.GetLocationMetadataResponse>(
                service, METHODID_GET_LOCATION_METADATA)))
        .addMethod(
          getUpdateLocationMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateLocationMetadataRequest,
              viam.app.v1.App.UpdateLocationMetadataResponse>(
                service, METHODID_UPDATE_LOCATION_METADATA)))
        .addMethod(
          getListLocationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ListLocationsRequest,
              viam.app.v1.App.ListLocationsResponse>(
                service, METHODID_LIST_LOCATIONS)))
        .addMethod(
          getShareLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ShareLocationRequest,
              viam.app.v1.App.ShareLocationResponse>(
                service, METHODID_SHARE_LOCATION)))
        .addMethod(
          getUnshareLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UnshareLocationRequest,
              viam.app.v1.App.UnshareLocationResponse>(
                service, METHODID_UNSHARE_LOCATION)))
        .addMethod(
          getLocationAuthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.LocationAuthRequest,
              viam.app.v1.App.LocationAuthResponse>(
                service, METHODID_LOCATION_AUTH)))
        .addMethod(
          getCreateLocationSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.CreateLocationSecretRequest,
              viam.app.v1.App.CreateLocationSecretResponse>(
                service, METHODID_CREATE_LOCATION_SECRET)))
        .addMethod(
          getDeleteLocationSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DeleteLocationSecretRequest,
              viam.app.v1.App.DeleteLocationSecretResponse>(
                service, METHODID_DELETE_LOCATION_SECRET)))
        .addMethod(
          getGetRobotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetRobotRequest,
              viam.app.v1.App.GetRobotResponse>(
                service, METHODID_GET_ROBOT)))
        .addMethod(
          getGetRobotMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetRobotMetadataRequest,
              viam.app.v1.App.GetRobotMetadataResponse>(
                service, METHODID_GET_ROBOT_METADATA)))
        .addMethod(
          getUpdateRobotMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateRobotMetadataRequest,
              viam.app.v1.App.UpdateRobotMetadataResponse>(
                service, METHODID_UPDATE_ROBOT_METADATA)))
        .addMethod(
          getGetRoverRentalRobotsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetRoverRentalRobotsRequest,
              viam.app.v1.App.GetRoverRentalRobotsResponse>(
                service, METHODID_GET_ROVER_RENTAL_ROBOTS)))
        .addMethod(
          getGetRobotPartsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetRobotPartsRequest,
              viam.app.v1.App.GetRobotPartsResponse>(
                service, METHODID_GET_ROBOT_PARTS)))
        .addMethod(
          getGetRobotPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetRobotPartRequest,
              viam.app.v1.App.GetRobotPartResponse>(
                service, METHODID_GET_ROBOT_PART)))
        .addMethod(
          getGetRobotPartLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetRobotPartLogsRequest,
              viam.app.v1.App.GetRobotPartLogsResponse>(
                service, METHODID_GET_ROBOT_PART_LOGS)))
        .addMethod(
          getTailRobotPartLogsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              viam.app.v1.App.TailRobotPartLogsRequest,
              viam.app.v1.App.TailRobotPartLogsResponse>(
                service, METHODID_TAIL_ROBOT_PART_LOGS)))
        .addMethod(
          getGetRobotPartHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetRobotPartHistoryRequest,
              viam.app.v1.App.GetRobotPartHistoryResponse>(
                service, METHODID_GET_ROBOT_PART_HISTORY)))
        .addMethod(
          getUpdateRobotPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateRobotPartRequest,
              viam.app.v1.App.UpdateRobotPartResponse>(
                service, METHODID_UPDATE_ROBOT_PART)))
        .addMethod(
          getNewRobotPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.NewRobotPartRequest,
              viam.app.v1.App.NewRobotPartResponse>(
                service, METHODID_NEW_ROBOT_PART)))
        .addMethod(
          getDeleteRobotPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DeleteRobotPartRequest,
              viam.app.v1.App.DeleteRobotPartResponse>(
                service, METHODID_DELETE_ROBOT_PART)))
        .addMethod(
          getGetRobotPartMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetRobotPartMetadataRequest,
              viam.app.v1.App.GetRobotPartMetadataResponse>(
                service, METHODID_GET_ROBOT_PART_METADATA)))
        .addMethod(
          getUpdateRobotPartMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateRobotPartMetadataRequest,
              viam.app.v1.App.UpdateRobotPartMetadataResponse>(
                service, METHODID_UPDATE_ROBOT_PART_METADATA)))
        .addMethod(
          getGetRobotAPIKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetRobotAPIKeysRequest,
              viam.app.v1.App.GetRobotAPIKeysResponse>(
                service, METHODID_GET_ROBOT_APIKEYS)))
        .addMethod(
          getMarkPartAsMainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.MarkPartAsMainRequest,
              viam.app.v1.App.MarkPartAsMainResponse>(
                service, METHODID_MARK_PART_AS_MAIN)))
        .addMethod(
          getMarkPartForRestartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.MarkPartForRestartRequest,
              viam.app.v1.App.MarkPartForRestartResponse>(
                service, METHODID_MARK_PART_FOR_RESTART)))
        .addMethod(
          getCreateRobotPartSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.CreateRobotPartSecretRequest,
              viam.app.v1.App.CreateRobotPartSecretResponse>(
                service, METHODID_CREATE_ROBOT_PART_SECRET)))
        .addMethod(
          getDeleteRobotPartSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DeleteRobotPartSecretRequest,
              viam.app.v1.App.DeleteRobotPartSecretResponse>(
                service, METHODID_DELETE_ROBOT_PART_SECRET)))
        .addMethod(
          getListRobotsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ListRobotsRequest,
              viam.app.v1.App.ListRobotsResponse>(
                service, METHODID_LIST_ROBOTS)))
        .addMethod(
          getNewRobotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.NewRobotRequest,
              viam.app.v1.App.NewRobotResponse>(
                service, METHODID_NEW_ROBOT)))
        .addMethod(
          getUpdateRobotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateRobotRequest,
              viam.app.v1.App.UpdateRobotResponse>(
                service, METHODID_UPDATE_ROBOT)))
        .addMethod(
          getDeleteRobotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DeleteRobotRequest,
              viam.app.v1.App.DeleteRobotResponse>(
                service, METHODID_DELETE_ROBOT)))
        .addMethod(
          getListFragmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ListFragmentsRequest,
              viam.app.v1.App.ListFragmentsResponse>(
                service, METHODID_LIST_FRAGMENTS)))
        .addMethod(
          getGetFragmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetFragmentRequest,
              viam.app.v1.App.GetFragmentResponse>(
                service, METHODID_GET_FRAGMENT)))
        .addMethod(
          getCreateFragmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.CreateFragmentRequest,
              viam.app.v1.App.CreateFragmentResponse>(
                service, METHODID_CREATE_FRAGMENT)))
        .addMethod(
          getUpdateFragmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateFragmentRequest,
              viam.app.v1.App.UpdateFragmentResponse>(
                service, METHODID_UPDATE_FRAGMENT)))
        .addMethod(
          getDeleteFragmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DeleteFragmentRequest,
              viam.app.v1.App.DeleteFragmentResponse>(
                service, METHODID_DELETE_FRAGMENT)))
        .addMethod(
          getListMachineFragmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ListMachineFragmentsRequest,
              viam.app.v1.App.ListMachineFragmentsResponse>(
                service, METHODID_LIST_MACHINE_FRAGMENTS)))
        .addMethod(
          getGetFragmentHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetFragmentHistoryRequest,
              viam.app.v1.App.GetFragmentHistoryResponse>(
                service, METHODID_GET_FRAGMENT_HISTORY)))
        .addMethod(
          getGetFragmentUsageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetFragmentUsageRequest,
              viam.app.v1.App.GetFragmentUsageResponse>(
                service, METHODID_GET_FRAGMENT_USAGE)))
        .addMethod(
          getSetFragmentTagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.SetFragmentTagRequest,
              viam.app.v1.App.SetFragmentTagResponse>(
                service, METHODID_SET_FRAGMENT_TAG)))
        .addMethod(
          getDeleteFragmentTagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DeleteFragmentTagRequest,
              viam.app.v1.App.DeleteFragmentTagResponse>(
                service, METHODID_DELETE_FRAGMENT_TAG)))
        .addMethod(
          getAddRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.AddRoleRequest,
              viam.app.v1.App.AddRoleResponse>(
                service, METHODID_ADD_ROLE)))
        .addMethod(
          getRemoveRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.RemoveRoleRequest,
              viam.app.v1.App.RemoveRoleResponse>(
                service, METHODID_REMOVE_ROLE)))
        .addMethod(
          getChangeRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ChangeRoleRequest,
              viam.app.v1.App.ChangeRoleResponse>(
                service, METHODID_CHANGE_ROLE)))
        .addMethod(
          getListAuthorizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ListAuthorizationsRequest,
              viam.app.v1.App.ListAuthorizationsResponse>(
                service, METHODID_LIST_AUTHORIZATIONS)))
        .addMethod(
          getCheckPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.CheckPermissionsRequest,
              viam.app.v1.App.CheckPermissionsResponse>(
                service, METHODID_CHECK_PERMISSIONS)))
        .addMethod(
          getGetRegistryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetRegistryItemRequest,
              viam.app.v1.App.GetRegistryItemResponse>(
                service, METHODID_GET_REGISTRY_ITEM)))
        .addMethod(
          getCreateRegistryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.CreateRegistryItemRequest,
              viam.app.v1.App.CreateRegistryItemResponse>(
                service, METHODID_CREATE_REGISTRY_ITEM)))
        .addMethod(
          getUpdateRegistryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateRegistryItemRequest,
              viam.app.v1.App.UpdateRegistryItemResponse>(
                service, METHODID_UPDATE_REGISTRY_ITEM)))
        .addMethod(
          getListRegistryItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ListRegistryItemsRequest,
              viam.app.v1.App.ListRegistryItemsResponse>(
                service, METHODID_LIST_REGISTRY_ITEMS)))
        .addMethod(
          getDeleteRegistryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DeleteRegistryItemRequest,
              viam.app.v1.App.DeleteRegistryItemResponse>(
                service, METHODID_DELETE_REGISTRY_ITEM)))
        .addMethod(
          getTransferRegistryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.TransferRegistryItemRequest,
              viam.app.v1.App.TransferRegistryItemResponse>(
                service, METHODID_TRANSFER_REGISTRY_ITEM)))
        .addMethod(
          getCreateModuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.CreateModuleRequest,
              viam.app.v1.App.CreateModuleResponse>(
                service, METHODID_CREATE_MODULE)))
        .addMethod(
          getUpdateModuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.UpdateModuleRequest,
              viam.app.v1.App.UpdateModuleResponse>(
                service, METHODID_UPDATE_MODULE)))
        .addMethod(
          getUploadModuleFileMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              viam.app.v1.App.UploadModuleFileRequest,
              viam.app.v1.App.UploadModuleFileResponse>(
                service, METHODID_UPLOAD_MODULE_FILE)))
        .addMethod(
          getGetModuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.GetModuleRequest,
              viam.app.v1.App.GetModuleResponse>(
                service, METHODID_GET_MODULE)))
        .addMethod(
          getListModulesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ListModulesRequest,
              viam.app.v1.App.ListModulesResponse>(
                service, METHODID_LIST_MODULES)))
        .addMethod(
          getCreateKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.CreateKeyRequest,
              viam.app.v1.App.CreateKeyResponse>(
                service, METHODID_CREATE_KEY)))
        .addMethod(
          getDeleteKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.DeleteKeyRequest,
              viam.app.v1.App.DeleteKeyResponse>(
                service, METHODID_DELETE_KEY)))
        .addMethod(
          getListKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.ListKeysRequest,
              viam.app.v1.App.ListKeysResponse>(
                service, METHODID_LIST_KEYS)))
        .addMethod(
          getRenameKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.RenameKeyRequest,
              viam.app.v1.App.RenameKeyResponse>(
                service, METHODID_RENAME_KEY)))
        .addMethod(
          getRotateKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.RotateKeyRequest,
              viam.app.v1.App.RotateKeyResponse>(
                service, METHODID_ROTATE_KEY)))
        .addMethod(
          getCreateKeyFromExistingKeyAuthorizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsRequest,
              viam.app.v1.App.CreateKeyFromExistingKeyAuthorizationsResponse>(
                service, METHODID_CREATE_KEY_FROM_EXISTING_KEY_AUTHORIZATIONS)))
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
              .addMethod(getListMachineFragmentsMethod())
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
              .build();
        }
      }
    }
    return result;
  }
}
