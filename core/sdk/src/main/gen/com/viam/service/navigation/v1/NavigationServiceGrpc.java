package com.viam.service.navigation.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A NavigationService declares the gRPC contract for a Navigation service.
 * Each service instance is bound to exactly one controllable base and one map
 * type (local SLAM or GPS). Apps save named locations, routes, and zones, then
 * navigate with plan-then-drive or direct go-to motion.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class NavigationServiceGrpc {

  private NavigationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viam.service.navigation.v1.NavigationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.AddLocationRequest,
      com.viam.service.navigation.v1.Navigation.AddLocationResponse> getAddLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLocation",
      requestType = com.viam.service.navigation.v1.Navigation.AddLocationRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.AddLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.AddLocationRequest,
      com.viam.service.navigation.v1.Navigation.AddLocationResponse> getAddLocationMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.AddLocationRequest, com.viam.service.navigation.v1.Navigation.AddLocationResponse> getAddLocationMethod;
    if ((getAddLocationMethod = NavigationServiceGrpc.getAddLocationMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getAddLocationMethod = NavigationServiceGrpc.getAddLocationMethod) == null) {
          NavigationServiceGrpc.getAddLocationMethod = getAddLocationMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.AddLocationRequest, com.viam.service.navigation.v1.Navigation.AddLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.AddLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.AddLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetLocationRequest,
      com.viam.service.navigation.v1.Navigation.GetLocationResponse> getGetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocation",
      requestType = com.viam.service.navigation.v1.Navigation.GetLocationRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GetLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetLocationRequest,
      com.viam.service.navigation.v1.Navigation.GetLocationResponse> getGetLocationMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetLocationRequest, com.viam.service.navigation.v1.Navigation.GetLocationResponse> getGetLocationMethod;
    if ((getGetLocationMethod = NavigationServiceGrpc.getGetLocationMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetLocationMethod = NavigationServiceGrpc.getGetLocationMethod) == null) {
          NavigationServiceGrpc.getGetLocationMethod = getGetLocationMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GetLocationRequest, com.viam.service.navigation.v1.Navigation.GetLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ListLocationsRequest,
      com.viam.service.navigation.v1.Navigation.ListLocationsResponse> getListLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLocations",
      requestType = com.viam.service.navigation.v1.Navigation.ListLocationsRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.ListLocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ListLocationsRequest,
      com.viam.service.navigation.v1.Navigation.ListLocationsResponse> getListLocationsMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ListLocationsRequest, com.viam.service.navigation.v1.Navigation.ListLocationsResponse> getListLocationsMethod;
    if ((getListLocationsMethod = NavigationServiceGrpc.getListLocationsMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getListLocationsMethod = NavigationServiceGrpc.getListLocationsMethod) == null) {
          NavigationServiceGrpc.getListLocationsMethod = getListLocationsMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.ListLocationsRequest, com.viam.service.navigation.v1.Navigation.ListLocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.ListLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.ListLocationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.UpdateLocationRequest,
      com.viam.service.navigation.v1.Navigation.UpdateLocationResponse> getUpdateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLocation",
      requestType = com.viam.service.navigation.v1.Navigation.UpdateLocationRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.UpdateLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.UpdateLocationRequest,
      com.viam.service.navigation.v1.Navigation.UpdateLocationResponse> getUpdateLocationMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.UpdateLocationRequest, com.viam.service.navigation.v1.Navigation.UpdateLocationResponse> getUpdateLocationMethod;
    if ((getUpdateLocationMethod = NavigationServiceGrpc.getUpdateLocationMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getUpdateLocationMethod = NavigationServiceGrpc.getUpdateLocationMethod) == null) {
          NavigationServiceGrpc.getUpdateLocationMethod = getUpdateLocationMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.UpdateLocationRequest, com.viam.service.navigation.v1.Navigation.UpdateLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.UpdateLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.UpdateLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.DeleteLocationRequest,
      com.viam.service.navigation.v1.Navigation.DeleteLocationResponse> getDeleteLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLocation",
      requestType = com.viam.service.navigation.v1.Navigation.DeleteLocationRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.DeleteLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.DeleteLocationRequest,
      com.viam.service.navigation.v1.Navigation.DeleteLocationResponse> getDeleteLocationMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.DeleteLocationRequest, com.viam.service.navigation.v1.Navigation.DeleteLocationResponse> getDeleteLocationMethod;
    if ((getDeleteLocationMethod = NavigationServiceGrpc.getDeleteLocationMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getDeleteLocationMethod = NavigationServiceGrpc.getDeleteLocationMethod) == null) {
          NavigationServiceGrpc.getDeleteLocationMethod = getDeleteLocationMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.DeleteLocationRequest, com.viam.service.navigation.v1.Navigation.DeleteLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.DeleteLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.DeleteLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.AddRouteRequest,
      com.viam.service.navigation.v1.Navigation.AddRouteResponse> getAddRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRoute",
      requestType = com.viam.service.navigation.v1.Navigation.AddRouteRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.AddRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.AddRouteRequest,
      com.viam.service.navigation.v1.Navigation.AddRouteResponse> getAddRouteMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.AddRouteRequest, com.viam.service.navigation.v1.Navigation.AddRouteResponse> getAddRouteMethod;
    if ((getAddRouteMethod = NavigationServiceGrpc.getAddRouteMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getAddRouteMethod = NavigationServiceGrpc.getAddRouteMethod) == null) {
          NavigationServiceGrpc.getAddRouteMethod = getAddRouteMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.AddRouteRequest, com.viam.service.navigation.v1.Navigation.AddRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.AddRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.AddRouteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetRouteRequest,
      com.viam.service.navigation.v1.Navigation.GetRouteResponse> getGetRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoute",
      requestType = com.viam.service.navigation.v1.Navigation.GetRouteRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GetRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetRouteRequest,
      com.viam.service.navigation.v1.Navigation.GetRouteResponse> getGetRouteMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetRouteRequest, com.viam.service.navigation.v1.Navigation.GetRouteResponse> getGetRouteMethod;
    if ((getGetRouteMethod = NavigationServiceGrpc.getGetRouteMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetRouteMethod = NavigationServiceGrpc.getGetRouteMethod) == null) {
          NavigationServiceGrpc.getGetRouteMethod = getGetRouteMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GetRouteRequest, com.viam.service.navigation.v1.Navigation.GetRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetRouteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ListRoutesRequest,
      com.viam.service.navigation.v1.Navigation.ListRoutesResponse> getListRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoutes",
      requestType = com.viam.service.navigation.v1.Navigation.ListRoutesRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.ListRoutesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ListRoutesRequest,
      com.viam.service.navigation.v1.Navigation.ListRoutesResponse> getListRoutesMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ListRoutesRequest, com.viam.service.navigation.v1.Navigation.ListRoutesResponse> getListRoutesMethod;
    if ((getListRoutesMethod = NavigationServiceGrpc.getListRoutesMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getListRoutesMethod = NavigationServiceGrpc.getListRoutesMethod) == null) {
          NavigationServiceGrpc.getListRoutesMethod = getListRoutesMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.ListRoutesRequest, com.viam.service.navigation.v1.Navigation.ListRoutesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.ListRoutesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.ListRoutesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.UpdateRouteRequest,
      com.viam.service.navigation.v1.Navigation.UpdateRouteResponse> getUpdateRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRoute",
      requestType = com.viam.service.navigation.v1.Navigation.UpdateRouteRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.UpdateRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.UpdateRouteRequest,
      com.viam.service.navigation.v1.Navigation.UpdateRouteResponse> getUpdateRouteMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.UpdateRouteRequest, com.viam.service.navigation.v1.Navigation.UpdateRouteResponse> getUpdateRouteMethod;
    if ((getUpdateRouteMethod = NavigationServiceGrpc.getUpdateRouteMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getUpdateRouteMethod = NavigationServiceGrpc.getUpdateRouteMethod) == null) {
          NavigationServiceGrpc.getUpdateRouteMethod = getUpdateRouteMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.UpdateRouteRequest, com.viam.service.navigation.v1.Navigation.UpdateRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.UpdateRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.UpdateRouteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.DeleteRouteRequest,
      com.viam.service.navigation.v1.Navigation.DeleteRouteResponse> getDeleteRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRoute",
      requestType = com.viam.service.navigation.v1.Navigation.DeleteRouteRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.DeleteRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.DeleteRouteRequest,
      com.viam.service.navigation.v1.Navigation.DeleteRouteResponse> getDeleteRouteMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.DeleteRouteRequest, com.viam.service.navigation.v1.Navigation.DeleteRouteResponse> getDeleteRouteMethod;
    if ((getDeleteRouteMethod = NavigationServiceGrpc.getDeleteRouteMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getDeleteRouteMethod = NavigationServiceGrpc.getDeleteRouteMethod) == null) {
          NavigationServiceGrpc.getDeleteRouteMethod = getDeleteRouteMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.DeleteRouteRequest, com.viam.service.navigation.v1.Navigation.DeleteRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.DeleteRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.DeleteRouteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.AddZoneRequest,
      com.viam.service.navigation.v1.Navigation.AddZoneResponse> getAddZoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddZone",
      requestType = com.viam.service.navigation.v1.Navigation.AddZoneRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.AddZoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.AddZoneRequest,
      com.viam.service.navigation.v1.Navigation.AddZoneResponse> getAddZoneMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.AddZoneRequest, com.viam.service.navigation.v1.Navigation.AddZoneResponse> getAddZoneMethod;
    if ((getAddZoneMethod = NavigationServiceGrpc.getAddZoneMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getAddZoneMethod = NavigationServiceGrpc.getAddZoneMethod) == null) {
          NavigationServiceGrpc.getAddZoneMethod = getAddZoneMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.AddZoneRequest, com.viam.service.navigation.v1.Navigation.AddZoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddZone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.AddZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.AddZoneResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddZoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetZoneRequest,
      com.viam.service.navigation.v1.Navigation.GetZoneResponse> getGetZoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZone",
      requestType = com.viam.service.navigation.v1.Navigation.GetZoneRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GetZoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetZoneRequest,
      com.viam.service.navigation.v1.Navigation.GetZoneResponse> getGetZoneMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetZoneRequest, com.viam.service.navigation.v1.Navigation.GetZoneResponse> getGetZoneMethod;
    if ((getGetZoneMethod = NavigationServiceGrpc.getGetZoneMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetZoneMethod = NavigationServiceGrpc.getGetZoneMethod) == null) {
          NavigationServiceGrpc.getGetZoneMethod = getGetZoneMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GetZoneRequest, com.viam.service.navigation.v1.Navigation.GetZoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetZoneResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetZoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ListZonesRequest,
      com.viam.service.navigation.v1.Navigation.ListZonesResponse> getListZonesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListZones",
      requestType = com.viam.service.navigation.v1.Navigation.ListZonesRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.ListZonesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ListZonesRequest,
      com.viam.service.navigation.v1.Navigation.ListZonesResponse> getListZonesMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ListZonesRequest, com.viam.service.navigation.v1.Navigation.ListZonesResponse> getListZonesMethod;
    if ((getListZonesMethod = NavigationServiceGrpc.getListZonesMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getListZonesMethod = NavigationServiceGrpc.getListZonesMethod) == null) {
          NavigationServiceGrpc.getListZonesMethod = getListZonesMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.ListZonesRequest, com.viam.service.navigation.v1.Navigation.ListZonesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListZones"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.ListZonesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.ListZonesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListZonesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.UpdateZoneRequest,
      com.viam.service.navigation.v1.Navigation.UpdateZoneResponse> getUpdateZoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateZone",
      requestType = com.viam.service.navigation.v1.Navigation.UpdateZoneRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.UpdateZoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.UpdateZoneRequest,
      com.viam.service.navigation.v1.Navigation.UpdateZoneResponse> getUpdateZoneMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.UpdateZoneRequest, com.viam.service.navigation.v1.Navigation.UpdateZoneResponse> getUpdateZoneMethod;
    if ((getUpdateZoneMethod = NavigationServiceGrpc.getUpdateZoneMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getUpdateZoneMethod = NavigationServiceGrpc.getUpdateZoneMethod) == null) {
          NavigationServiceGrpc.getUpdateZoneMethod = getUpdateZoneMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.UpdateZoneRequest, com.viam.service.navigation.v1.Navigation.UpdateZoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateZone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.UpdateZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.UpdateZoneResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateZoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.DeleteZoneRequest,
      com.viam.service.navigation.v1.Navigation.DeleteZoneResponse> getDeleteZoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteZone",
      requestType = com.viam.service.navigation.v1.Navigation.DeleteZoneRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.DeleteZoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.DeleteZoneRequest,
      com.viam.service.navigation.v1.Navigation.DeleteZoneResponse> getDeleteZoneMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.DeleteZoneRequest, com.viam.service.navigation.v1.Navigation.DeleteZoneResponse> getDeleteZoneMethod;
    if ((getDeleteZoneMethod = NavigationServiceGrpc.getDeleteZoneMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getDeleteZoneMethod = NavigationServiceGrpc.getDeleteZoneMethod) == null) {
          NavigationServiceGrpc.getDeleteZoneMethod = getDeleteZoneMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.DeleteZoneRequest, com.viam.service.navigation.v1.Navigation.DeleteZoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteZone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.DeleteZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.DeleteZoneResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteZoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.NavigateToLocationRequest,
      com.viam.service.navigation.v1.Navigation.NavigateToLocationResponse> getNavigateToLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NavigateToLocation",
      requestType = com.viam.service.navigation.v1.Navigation.NavigateToLocationRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.NavigateToLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.NavigateToLocationRequest,
      com.viam.service.navigation.v1.Navigation.NavigateToLocationResponse> getNavigateToLocationMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.NavigateToLocationRequest, com.viam.service.navigation.v1.Navigation.NavigateToLocationResponse> getNavigateToLocationMethod;
    if ((getNavigateToLocationMethod = NavigationServiceGrpc.getNavigateToLocationMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getNavigateToLocationMethod = NavigationServiceGrpc.getNavigateToLocationMethod) == null) {
          NavigationServiceGrpc.getNavigateToLocationMethod = getNavigateToLocationMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.NavigateToLocationRequest, com.viam.service.navigation.v1.Navigation.NavigateToLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NavigateToLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.NavigateToLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.NavigateToLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getNavigateToLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.NavigateToPointRequest,
      com.viam.service.navigation.v1.Navigation.NavigateToPointResponse> getNavigateToPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NavigateToPoint",
      requestType = com.viam.service.navigation.v1.Navigation.NavigateToPointRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.NavigateToPointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.NavigateToPointRequest,
      com.viam.service.navigation.v1.Navigation.NavigateToPointResponse> getNavigateToPointMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.NavigateToPointRequest, com.viam.service.navigation.v1.Navigation.NavigateToPointResponse> getNavigateToPointMethod;
    if ((getNavigateToPointMethod = NavigationServiceGrpc.getNavigateToPointMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getNavigateToPointMethod = NavigationServiceGrpc.getNavigateToPointMethod) == null) {
          NavigationServiceGrpc.getNavigateToPointMethod = getNavigateToPointMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.NavigateToPointRequest, com.viam.service.navigation.v1.Navigation.NavigateToPointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NavigateToPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.NavigateToPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.NavigateToPointResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getNavigateToPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.NavigateRouteRequest,
      com.viam.service.navigation.v1.Navigation.NavigateRouteResponse> getNavigateRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NavigateRoute",
      requestType = com.viam.service.navigation.v1.Navigation.NavigateRouteRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.NavigateRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.NavigateRouteRequest,
      com.viam.service.navigation.v1.Navigation.NavigateRouteResponse> getNavigateRouteMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.NavigateRouteRequest, com.viam.service.navigation.v1.Navigation.NavigateRouteResponse> getNavigateRouteMethod;
    if ((getNavigateRouteMethod = NavigationServiceGrpc.getNavigateRouteMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getNavigateRouteMethod = NavigationServiceGrpc.getNavigateRouteMethod) == null) {
          NavigationServiceGrpc.getNavigateRouteMethod = getNavigateRouteMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.NavigateRouteRequest, com.viam.service.navigation.v1.Navigation.NavigateRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NavigateRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.NavigateRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.NavigateRouteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getNavigateRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.PlanToPointRequest,
      com.viam.service.navigation.v1.Navigation.PlanToPointResponse> getPlanToPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlanToPoint",
      requestType = com.viam.service.navigation.v1.Navigation.PlanToPointRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.PlanToPointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.PlanToPointRequest,
      com.viam.service.navigation.v1.Navigation.PlanToPointResponse> getPlanToPointMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.PlanToPointRequest, com.viam.service.navigation.v1.Navigation.PlanToPointResponse> getPlanToPointMethod;
    if ((getPlanToPointMethod = NavigationServiceGrpc.getPlanToPointMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getPlanToPointMethod = NavigationServiceGrpc.getPlanToPointMethod) == null) {
          NavigationServiceGrpc.getPlanToPointMethod = getPlanToPointMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.PlanToPointRequest, com.viam.service.navigation.v1.Navigation.PlanToPointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlanToPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.PlanToPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.PlanToPointResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPlanToPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.PlanToLocationRequest,
      com.viam.service.navigation.v1.Navigation.PlanToLocationResponse> getPlanToLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlanToLocation",
      requestType = com.viam.service.navigation.v1.Navigation.PlanToLocationRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.PlanToLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.PlanToLocationRequest,
      com.viam.service.navigation.v1.Navigation.PlanToLocationResponse> getPlanToLocationMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.PlanToLocationRequest, com.viam.service.navigation.v1.Navigation.PlanToLocationResponse> getPlanToLocationMethod;
    if ((getPlanToLocationMethod = NavigationServiceGrpc.getPlanToLocationMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getPlanToLocationMethod = NavigationServiceGrpc.getPlanToLocationMethod) == null) {
          NavigationServiceGrpc.getPlanToLocationMethod = getPlanToLocationMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.PlanToLocationRequest, com.viam.service.navigation.v1.Navigation.PlanToLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlanToLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.PlanToLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.PlanToLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPlanToLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ExecutePlanRequest,
      com.viam.service.navigation.v1.Navigation.ExecutePlanResponse> getExecutePlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecutePlan",
      requestType = com.viam.service.navigation.v1.Navigation.ExecutePlanRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.ExecutePlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ExecutePlanRequest,
      com.viam.service.navigation.v1.Navigation.ExecutePlanResponse> getExecutePlanMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ExecutePlanRequest, com.viam.service.navigation.v1.Navigation.ExecutePlanResponse> getExecutePlanMethod;
    if ((getExecutePlanMethod = NavigationServiceGrpc.getExecutePlanMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getExecutePlanMethod = NavigationServiceGrpc.getExecutePlanMethod) == null) {
          NavigationServiceGrpc.getExecutePlanMethod = getExecutePlanMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.ExecutePlanRequest, com.viam.service.navigation.v1.Navigation.ExecutePlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecutePlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.ExecutePlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.ExecutePlanResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getExecutePlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GoToLocationRequest,
      com.viam.service.navigation.v1.Navigation.GoToLocationResponse> getGoToLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GoToLocation",
      requestType = com.viam.service.navigation.v1.Navigation.GoToLocationRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GoToLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GoToLocationRequest,
      com.viam.service.navigation.v1.Navigation.GoToLocationResponse> getGoToLocationMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GoToLocationRequest, com.viam.service.navigation.v1.Navigation.GoToLocationResponse> getGoToLocationMethod;
    if ((getGoToLocationMethod = NavigationServiceGrpc.getGoToLocationMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGoToLocationMethod = NavigationServiceGrpc.getGoToLocationMethod) == null) {
          NavigationServiceGrpc.getGoToLocationMethod = getGoToLocationMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GoToLocationRequest, com.viam.service.navigation.v1.Navigation.GoToLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GoToLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GoToLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GoToLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGoToLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GoToPointRequest,
      com.viam.service.navigation.v1.Navigation.GoToPointResponse> getGoToPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GoToPoint",
      requestType = com.viam.service.navigation.v1.Navigation.GoToPointRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GoToPointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GoToPointRequest,
      com.viam.service.navigation.v1.Navigation.GoToPointResponse> getGoToPointMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GoToPointRequest, com.viam.service.navigation.v1.Navigation.GoToPointResponse> getGoToPointMethod;
    if ((getGoToPointMethod = NavigationServiceGrpc.getGoToPointMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGoToPointMethod = NavigationServiceGrpc.getGoToPointMethod) == null) {
          NavigationServiceGrpc.getGoToPointMethod = getGoToPointMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GoToPointRequest, com.viam.service.navigation.v1.Navigation.GoToPointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GoToPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GoToPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GoToPointResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGoToPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.SuspendRequest,
      com.viam.service.navigation.v1.Navigation.SuspendResponse> getSuspendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Suspend",
      requestType = com.viam.service.navigation.v1.Navigation.SuspendRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.SuspendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.SuspendRequest,
      com.viam.service.navigation.v1.Navigation.SuspendResponse> getSuspendMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.SuspendRequest, com.viam.service.navigation.v1.Navigation.SuspendResponse> getSuspendMethod;
    if ((getSuspendMethod = NavigationServiceGrpc.getSuspendMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getSuspendMethod = NavigationServiceGrpc.getSuspendMethod) == null) {
          NavigationServiceGrpc.getSuspendMethod = getSuspendMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.SuspendRequest, com.viam.service.navigation.v1.Navigation.SuspendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Suspend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.SuspendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.SuspendResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSuspendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ResumeRequest,
      com.viam.service.navigation.v1.Navigation.ResumeResponse> getResumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Resume",
      requestType = com.viam.service.navigation.v1.Navigation.ResumeRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.ResumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ResumeRequest,
      com.viam.service.navigation.v1.Navigation.ResumeResponse> getResumeMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.ResumeRequest, com.viam.service.navigation.v1.Navigation.ResumeResponse> getResumeMethod;
    if ((getResumeMethod = NavigationServiceGrpc.getResumeMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getResumeMethod = NavigationServiceGrpc.getResumeMethod) == null) {
          NavigationServiceGrpc.getResumeMethod = getResumeMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.ResumeRequest, com.viam.service.navigation.v1.Navigation.ResumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Resume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.ResumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.ResumeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getResumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.CancelRequest,
      com.viam.service.navigation.v1.Navigation.CancelResponse> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = com.viam.service.navigation.v1.Navigation.CancelRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.CancelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.CancelRequest,
      com.viam.service.navigation.v1.Navigation.CancelResponse> getCancelMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.CancelRequest, com.viam.service.navigation.v1.Navigation.CancelResponse> getCancelMethod;
    if ((getCancelMethod = NavigationServiceGrpc.getCancelMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getCancelMethod = NavigationServiceGrpc.getCancelMethod) == null) {
          NavigationServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.CancelRequest, com.viam.service.navigation.v1.Navigation.CancelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.CancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.CancelResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetPositionRequest,
      com.viam.service.navigation.v1.Navigation.GetPositionResponse> getGetPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPosition",
      requestType = com.viam.service.navigation.v1.Navigation.GetPositionRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GetPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetPositionRequest,
      com.viam.service.navigation.v1.Navigation.GetPositionResponse> getGetPositionMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetPositionRequest, com.viam.service.navigation.v1.Navigation.GetPositionResponse> getGetPositionMethod;
    if ((getGetPositionMethod = NavigationServiceGrpc.getGetPositionMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetPositionMethod = NavigationServiceGrpc.getGetPositionMethod) == null) {
          NavigationServiceGrpc.getGetPositionMethod = getGetPositionMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GetPositionRequest, com.viam.service.navigation.v1.Navigation.GetPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetPositionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetNavigationStatusRequest,
      com.viam.service.navigation.v1.Navigation.GetNavigationStatusResponse> getGetNavigationStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNavigationStatus",
      requestType = com.viam.service.navigation.v1.Navigation.GetNavigationStatusRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GetNavigationStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetNavigationStatusRequest,
      com.viam.service.navigation.v1.Navigation.GetNavigationStatusResponse> getGetNavigationStatusMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetNavigationStatusRequest, com.viam.service.navigation.v1.Navigation.GetNavigationStatusResponse> getGetNavigationStatusMethod;
    if ((getGetNavigationStatusMethod = NavigationServiceGrpc.getGetNavigationStatusMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetNavigationStatusMethod = NavigationServiceGrpc.getGetNavigationStatusMethod) == null) {
          NavigationServiceGrpc.getGetNavigationStatusMethod = getGetNavigationStatusMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GetNavigationStatusRequest, com.viam.service.navigation.v1.Navigation.GetNavigationStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNavigationStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetNavigationStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetNavigationStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetNavigationStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetPropertiesRequest,
      com.viam.service.navigation.v1.Navigation.GetPropertiesResponse> getGetPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProperties",
      requestType = com.viam.service.navigation.v1.Navigation.GetPropertiesRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GetPropertiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetPropertiesRequest,
      com.viam.service.navigation.v1.Navigation.GetPropertiesResponse> getGetPropertiesMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetPropertiesRequest, com.viam.service.navigation.v1.Navigation.GetPropertiesResponse> getGetPropertiesMethod;
    if ((getGetPropertiesMethod = NavigationServiceGrpc.getGetPropertiesMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetPropertiesMethod = NavigationServiceGrpc.getGetPropertiesMethod) == null) {
          NavigationServiceGrpc.getGetPropertiesMethod = getGetPropertiesMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GetPropertiesRequest, com.viam.service.navigation.v1.Navigation.GetPropertiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetPropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetPropertiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetCostmapRequest,
      com.viam.service.navigation.v1.Navigation.GetCostmapResponse> getGetCostmapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCostmap",
      requestType = com.viam.service.navigation.v1.Navigation.GetCostmapRequest.class,
      responseType = com.viam.service.navigation.v1.Navigation.GetCostmapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetCostmapRequest,
      com.viam.service.navigation.v1.Navigation.GetCostmapResponse> getGetCostmapMethod() {
    io.grpc.MethodDescriptor<com.viam.service.navigation.v1.Navigation.GetCostmapRequest, com.viam.service.navigation.v1.Navigation.GetCostmapResponse> getGetCostmapMethod;
    if ((getGetCostmapMethod = NavigationServiceGrpc.getGetCostmapMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetCostmapMethod = NavigationServiceGrpc.getGetCostmapMethod) == null) {
          NavigationServiceGrpc.getGetCostmapMethod = getGetCostmapMethod =
              io.grpc.MethodDescriptor.<com.viam.service.navigation.v1.Navigation.GetCostmapRequest, com.viam.service.navigation.v1.Navigation.GetCostmapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCostmap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetCostmapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.service.navigation.v1.Navigation.GetCostmapResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCostmapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.DoCommandRequest,
      com.viam.common.v1.Common.DoCommandResponse> getDoCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoCommand",
      requestType = com.viam.common.v1.Common.DoCommandRequest.class,
      responseType = com.viam.common.v1.Common.DoCommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.DoCommandRequest,
      com.viam.common.v1.Common.DoCommandResponse> getDoCommandMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.DoCommandRequest, com.viam.common.v1.Common.DoCommandResponse> getDoCommandMethod;
    if ((getDoCommandMethod = NavigationServiceGrpc.getDoCommandMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getDoCommandMethod = NavigationServiceGrpc.getDoCommandMethod) == null) {
          NavigationServiceGrpc.getDoCommandMethod = getDoCommandMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.DoCommandRequest, com.viam.common.v1.Common.DoCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.DoCommandResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDoCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetStatusRequest,
      com.viam.common.v1.Common.GetStatusResponse> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatus",
      requestType = com.viam.common.v1.Common.GetStatusRequest.class,
      responseType = com.viam.common.v1.Common.GetStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetStatusRequest,
      com.viam.common.v1.Common.GetStatusResponse> getGetStatusMethod() {
    io.grpc.MethodDescriptor<com.viam.common.v1.Common.GetStatusRequest, com.viam.common.v1.Common.GetStatusResponse> getGetStatusMethod;
    if ((getGetStatusMethod = NavigationServiceGrpc.getGetStatusMethod) == null) {
      synchronized (NavigationServiceGrpc.class) {
        if ((getGetStatusMethod = NavigationServiceGrpc.getGetStatusMethod) == null) {
          NavigationServiceGrpc.getGetStatusMethod = getGetStatusMethod =
              io.grpc.MethodDescriptor.<com.viam.common.v1.Common.GetStatusRequest, com.viam.common.v1.Common.GetStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.viam.common.v1.Common.GetStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NavigationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NavigationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NavigationServiceStub>() {
        @java.lang.Override
        public NavigationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NavigationServiceStub(channel, callOptions);
        }
      };
    return NavigationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static NavigationServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NavigationServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NavigationServiceBlockingV2Stub>() {
        @java.lang.Override
        public NavigationServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NavigationServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return NavigationServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NavigationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NavigationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NavigationServiceBlockingStub>() {
        @java.lang.Override
        public NavigationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NavigationServiceBlockingStub(channel, callOptions);
        }
      };
    return NavigationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NavigationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NavigationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NavigationServiceFutureStub>() {
        @java.lang.Override
        public NavigationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NavigationServiceFutureStub(channel, callOptions);
        }
      };
    return NavigationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service.
   * Each service instance is bound to exactly one controllable base and one map
   * type (local SLAM or GPS). Apps save named locations, routes, and zones, then
   * navigate with plan-then-drive or direct go-to motion.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * AddLocation saves a named position on the active map. If position is
     * omitted, the robot's current position from GetPosition is saved.
     * </pre>
     */
    default void addLocation(com.viam.service.navigation.v1.Navigation.AddLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.AddLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLocation returns a saved location by name. This does not return the
     * robot's current position; use GetPosition for that.
     * </pre>
     */
    default void getLocation(com.viam.service.navigation.v1.Navigation.GetLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListLocations lists all saved locations on the active map.
     * </pre>
     */
    default void listLocations(com.viam.service.navigation.v1.Navigation.ListLocationsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ListLocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLocationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateLocation changes a saved location's position or name. Renaming a
     * location updates every route waypoint that references it.
     * </pre>
     */
    default void updateLocation(com.viam.service.navigation.v1.Navigation.UpdateLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.UpdateLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteLocation deletes a saved location. The location is also removed from
     * every route that references it.
     * </pre>
     */
    default void deleteLocation(com.viam.service.navigation.v1.Navigation.DeleteLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.DeleteLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddRoute creates a named route from an ordered list of waypoints. Every
     * referenced location must already exist.
     * </pre>
     */
    default void addRoute(com.viam.service.navigation.v1.Navigation.AddRouteRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.AddRouteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetRoute returns a route by name.
     * </pre>
     */
    default void getRoute(com.viam.service.navigation.v1.Navigation.GetRouteRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetRouteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListRoutes lists all routes on the active map.
     * </pre>
     */
    default void listRoutes(com.viam.service.navigation.v1.Navigation.ListRoutesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ListRoutesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRoutesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRoute renames a route and/or replaces its waypoints. An unset
     * waypoints list leaves the waypoints unchanged. A set list, including an
     * empty one, replaces them.
     * </pre>
     */
    default void updateRoute(com.viam.service.navigation.v1.Navigation.UpdateRouteRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.UpdateRouteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRoute deletes a route. The locations it references are not affected.
     * </pre>
     */
    default void deleteRoute(com.viam.service.navigation.v1.Navigation.DeleteRouteRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.DeleteRouteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddZone creates a keep-out or speed-limit zone on the active map. The
     * planner avoids keep-out zones and caps speed inside speed-limit zones.
     * </pre>
     */
    default void addZone(com.viam.service.navigation.v1.Navigation.AddZoneRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.AddZoneResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddZoneMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetZone returns a zone by name.
     * </pre>
     */
    default void getZone(com.viam.service.navigation.v1.Navigation.GetZoneRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetZoneResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZoneMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListZones lists zones on the active map, optionally filtered by type.
     * </pre>
     */
    default void listZones(com.viam.service.navigation.v1.Navigation.ListZonesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ListZonesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListZonesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateZone changes a zone's type, geometry, speed limit, or name.
     * </pre>
     */
    default void updateZone(com.viam.service.navigation.v1.Navigation.UpdateZoneRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.UpdateZoneResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateZoneMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteZone deletes a zone.
     * </pre>
     */
    default void deleteZone(com.viam.service.navigation.v1.Navigation.DeleteZoneRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.DeleteZoneResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteZoneMethod(), responseObserver);
    }

    /**
     * <pre>
     * NavigateToLocation plans an obstacle-aware path to a saved location and
     * starts driving it. Returns once the goal is accepted; track progress with
     * GetNavigationStatus.
     * </pre>
     */
    default void navigateToLocation(com.viam.service.navigation.v1.Navigation.NavigateToLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.NavigateToLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNavigateToLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * NavigateToPoint plans an obstacle-aware path to a Position and starts
     * driving it. Returns once the goal is accepted; track progress with
     * GetNavigationStatus. On a Pose, theta defaults to 0 if omitted.
     * </pre>
     */
    default void navigateToPoint(com.viam.service.navigation.v1.Navigation.NavigateToPointRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.NavigateToPointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNavigateToPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * NavigateRoute drives a route one waypoint at a time using the
     * obstacle-aware planner. Provide either route_name (a saved route) or
     * waypoints (an inline list).
     * </pre>
     */
    default void navigateRoute(com.viam.service.navigation.v1.Navigation.NavigateRouteRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.NavigateRouteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNavigateRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * PlanToPoint computes a path from the robot (or a given start) to a
     * Position without moving. Pass a feasible result to ExecutePlan to drive it.
     * Raises an error if no path exists.
     * </pre>
     */
    default void planToPoint(com.viam.service.navigation.v1.Navigation.PlanToPointRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.PlanToPointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlanToPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * PlanToLocation computes a path to a saved location without moving. Accepts
     * the same optional start as PlanToPoint. Raises an error if no path exists.
     * </pre>
     */
    default void planToLocation(com.viam.service.navigation.v1.Navigation.PlanToLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.PlanToLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlanToLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExecutePlan drives a Plan (typically from PlanToPoint or PlanToLocation).
     * While navigating, the active path is available on GetNavigationStatus. Rejected if
     * the path is empty.
     * </pre>
     */
    default void executePlan(com.viam.service.navigation.v1.Navigation.ExecutePlanRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ExecutePlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecutePlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * GoToLocation drives directly to a saved location with a closed-loop
     * controller, without full path planning. Intended for short hops and
     * docking. With wait false, returns immediately while navigating.
     * </pre>
     */
    default void goToLocation(com.viam.service.navigation.v1.Navigation.GoToLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GoToLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGoToLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * GoToPoint drives directly to a Position with a closed-loop controller,
     * without full path planning. Intended for short hops and docking. With wait
     * false, returns immediately while navigating.
     * </pre>
     */
    default void goToPoint(com.viam.service.navigation.v1.Navigation.GoToPointRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GoToPointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGoToPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Suspend stops motion but remembers the current goal, including the current
     * waypoint and loop setting for routes. A suspended goal must be canceled
     * before a new one starts.
     * </pre>
     */
    default void suspend(com.viam.service.navigation.v1.Navigation.SuspendRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.SuspendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuspendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resume resumes the suspended goal the same way it was started: planned
     * navigation, simple go-to, or a route from its current waypoint.
     * </pre>
     */
    default void resume(com.viam.service.navigation.v1.Navigation.ResumeRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ResumeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel stops all motion and discards both the active goal and any
     * suspended goal.
     * </pre>
     */
    default void cancel(com.viam.service.navigation.v1.Navigation.CancelRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.CancelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPosition returns the robot's current position on the active map. Use
     * this for frequent position polling; GetNavigationStatus reports the same position
     * alongside the rest of the navigation state.
     * </pre>
     */
    default void getPosition(com.viam.service.navigation.v1.Navigation.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetNavigationStatus returns the full navigation state, including the robot's
     * current position and the latest goal.
     * </pre>
     */
    default void getNavigationStatus(com.viam.service.navigation.v1.Navigation.GetNavigationStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetNavigationStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNavigationStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProperties returns the map type the service operates on and robot
     * properties. These values do not change while the service is running.
     * </pre>
     */
    default void getProperties(com.viam.service.navigation.v1.Navigation.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCostmap returns the local or global costmap as a downsampled grid, for
     * display in UIs.
     * </pre>
     */
    default void getCostmap(com.viam.service.navigation.v1.Navigation.GetCostmapRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetCostmapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCostmapMethod(), responseObserver);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    default void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoCommandMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetStatus returns the status of the resource
     * </pre>
     */
    default void getStatus(com.viam.common.v1.Common.GetStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NavigationService.
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service.
   * Each service instance is bound to exactly one controllable base and one map
   * type (local SLAM or GPS). Apps save named locations, routes, and zones, then
   * navigate with plan-then-drive or direct go-to motion.
   * </pre>
   */
  public static abstract class NavigationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NavigationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NavigationService.
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service.
   * Each service instance is bound to exactly one controllable base and one map
   * type (local SLAM or GPS). Apps save named locations, routes, and zones, then
   * navigate with plan-then-drive or direct go-to motion.
   * </pre>
   */
  public static final class NavigationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<NavigationServiceStub> {
    private NavigationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavigationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NavigationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * AddLocation saves a named position on the active map. If position is
     * omitted, the robot's current position from GetPosition is saved.
     * </pre>
     */
    public void addLocation(com.viam.service.navigation.v1.Navigation.AddLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.AddLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLocation returns a saved location by name. This does not return the
     * robot's current position; use GetPosition for that.
     * </pre>
     */
    public void getLocation(com.viam.service.navigation.v1.Navigation.GetLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListLocations lists all saved locations on the active map.
     * </pre>
     */
    public void listLocations(com.viam.service.navigation.v1.Navigation.ListLocationsRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ListLocationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateLocation changes a saved location's position or name. Renaming a
     * location updates every route waypoint that references it.
     * </pre>
     */
    public void updateLocation(com.viam.service.navigation.v1.Navigation.UpdateLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.UpdateLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteLocation deletes a saved location. The location is also removed from
     * every route that references it.
     * </pre>
     */
    public void deleteLocation(com.viam.service.navigation.v1.Navigation.DeleteLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.DeleteLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddRoute creates a named route from an ordered list of waypoints. Every
     * referenced location must already exist.
     * </pre>
     */
    public void addRoute(com.viam.service.navigation.v1.Navigation.AddRouteRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.AddRouteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetRoute returns a route by name.
     * </pre>
     */
    public void getRoute(com.viam.service.navigation.v1.Navigation.GetRouteRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetRouteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListRoutes lists all routes on the active map.
     * </pre>
     */
    public void listRoutes(com.viam.service.navigation.v1.Navigation.ListRoutesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ListRoutesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRoutesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateRoute renames a route and/or replaces its waypoints. An unset
     * waypoints list leaves the waypoints unchanged. A set list, including an
     * empty one, replaces them.
     * </pre>
     */
    public void updateRoute(com.viam.service.navigation.v1.Navigation.UpdateRouteRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.UpdateRouteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRoute deletes a route. The locations it references are not affected.
     * </pre>
     */
    public void deleteRoute(com.viam.service.navigation.v1.Navigation.DeleteRouteRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.DeleteRouteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddZone creates a keep-out or speed-limit zone on the active map. The
     * planner avoids keep-out zones and caps speed inside speed-limit zones.
     * </pre>
     */
    public void addZone(com.viam.service.navigation.v1.Navigation.AddZoneRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.AddZoneResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddZoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetZone returns a zone by name.
     * </pre>
     */
    public void getZone(com.viam.service.navigation.v1.Navigation.GetZoneRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetZoneResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListZones lists zones on the active map, optionally filtered by type.
     * </pre>
     */
    public void listZones(com.viam.service.navigation.v1.Navigation.ListZonesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ListZonesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListZonesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateZone changes a zone's type, geometry, speed limit, or name.
     * </pre>
     */
    public void updateZone(com.viam.service.navigation.v1.Navigation.UpdateZoneRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.UpdateZoneResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateZoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteZone deletes a zone.
     * </pre>
     */
    public void deleteZone(com.viam.service.navigation.v1.Navigation.DeleteZoneRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.DeleteZoneResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteZoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NavigateToLocation plans an obstacle-aware path to a saved location and
     * starts driving it. Returns once the goal is accepted; track progress with
     * GetNavigationStatus.
     * </pre>
     */
    public void navigateToLocation(com.viam.service.navigation.v1.Navigation.NavigateToLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.NavigateToLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNavigateToLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NavigateToPoint plans an obstacle-aware path to a Position and starts
     * driving it. Returns once the goal is accepted; track progress with
     * GetNavigationStatus. On a Pose, theta defaults to 0 if omitted.
     * </pre>
     */
    public void navigateToPoint(com.viam.service.navigation.v1.Navigation.NavigateToPointRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.NavigateToPointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNavigateToPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NavigateRoute drives a route one waypoint at a time using the
     * obstacle-aware planner. Provide either route_name (a saved route) or
     * waypoints (an inline list).
     * </pre>
     */
    public void navigateRoute(com.viam.service.navigation.v1.Navigation.NavigateRouteRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.NavigateRouteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNavigateRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PlanToPoint computes a path from the robot (or a given start) to a
     * Position without moving. Pass a feasible result to ExecutePlan to drive it.
     * Raises an error if no path exists.
     * </pre>
     */
    public void planToPoint(com.viam.service.navigation.v1.Navigation.PlanToPointRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.PlanToPointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlanToPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PlanToLocation computes a path to a saved location without moving. Accepts
     * the same optional start as PlanToPoint. Raises an error if no path exists.
     * </pre>
     */
    public void planToLocation(com.viam.service.navigation.v1.Navigation.PlanToLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.PlanToLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlanToLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExecutePlan drives a Plan (typically from PlanToPoint or PlanToLocation).
     * While navigating, the active path is available on GetNavigationStatus. Rejected if
     * the path is empty.
     * </pre>
     */
    public void executePlan(com.viam.service.navigation.v1.Navigation.ExecutePlanRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ExecutePlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecutePlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GoToLocation drives directly to a saved location with a closed-loop
     * controller, without full path planning. Intended for short hops and
     * docking. With wait false, returns immediately while navigating.
     * </pre>
     */
    public void goToLocation(com.viam.service.navigation.v1.Navigation.GoToLocationRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GoToLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGoToLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GoToPoint drives directly to a Position with a closed-loop controller,
     * without full path planning. Intended for short hops and docking. With wait
     * false, returns immediately while navigating.
     * </pre>
     */
    public void goToPoint(com.viam.service.navigation.v1.Navigation.GoToPointRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GoToPointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGoToPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Suspend stops motion but remembers the current goal, including the current
     * waypoint and loop setting for routes. A suspended goal must be canceled
     * before a new one starts.
     * </pre>
     */
    public void suspend(com.viam.service.navigation.v1.Navigation.SuspendRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.SuspendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuspendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resume resumes the suspended goal the same way it was started: planned
     * navigation, simple go-to, or a route from its current waypoint.
     * </pre>
     */
    public void resume(com.viam.service.navigation.v1.Navigation.ResumeRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ResumeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel stops all motion and discards both the active goal and any
     * suspended goal.
     * </pre>
     */
    public void cancel(com.viam.service.navigation.v1.Navigation.CancelRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.CancelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPosition returns the robot's current position on the active map. Use
     * this for frequent position polling; GetNavigationStatus reports the same position
     * alongside the rest of the navigation state.
     * </pre>
     */
    public void getPosition(com.viam.service.navigation.v1.Navigation.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetNavigationStatus returns the full navigation state, including the robot's
     * current position and the latest goal.
     * </pre>
     */
    public void getNavigationStatus(com.viam.service.navigation.v1.Navigation.GetNavigationStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetNavigationStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNavigationStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProperties returns the map type the service operates on and robot
     * properties. These values do not change while the service is running.
     * </pre>
     */
    public void getProperties(com.viam.service.navigation.v1.Navigation.GetPropertiesRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetPropertiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCostmap returns the local or global costmap as a downsampled grid, for
     * display in UIs.
     * </pre>
     */
    public void getCostmap(com.viam.service.navigation.v1.Navigation.GetCostmapRequest request,
        io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetCostmapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCostmapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    public void doCommand(com.viam.common.v1.Common.DoCommandRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetStatus returns the status of the resource
     * </pre>
     */
    public void getStatus(com.viam.common.v1.Common.GetStatusRequest request,
        io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NavigationService.
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service.
   * Each service instance is bound to exactly one controllable base and one map
   * type (local SLAM or GPS). Apps save named locations, routes, and zones, then
   * navigate with plan-then-drive or direct go-to motion.
   * </pre>
   */
  public static final class NavigationServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<NavigationServiceBlockingV2Stub> {
    private NavigationServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavigationServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NavigationServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * AddLocation saves a named position on the active map. If position is
     * omitted, the robot's current position from GetPosition is saved.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.AddLocationResponse addLocation(com.viam.service.navigation.v1.Navigation.AddLocationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLocation returns a saved location by name. This does not return the
     * robot's current position; use GetPosition for that.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetLocationResponse getLocation(com.viam.service.navigation.v1.Navigation.GetLocationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListLocations lists all saved locations on the active map.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.ListLocationsResponse listLocations(com.viam.service.navigation.v1.Navigation.ListLocationsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateLocation changes a saved location's position or name. Renaming a
     * location updates every route waypoint that references it.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.UpdateLocationResponse updateLocation(com.viam.service.navigation.v1.Navigation.UpdateLocationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteLocation deletes a saved location. The location is also removed from
     * every route that references it.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.DeleteLocationResponse deleteLocation(com.viam.service.navigation.v1.Navigation.DeleteLocationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddRoute creates a named route from an ordered list of waypoints. Every
     * referenced location must already exist.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.AddRouteResponse addRoute(com.viam.service.navigation.v1.Navigation.AddRouteRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetRoute returns a route by name.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetRouteResponse getRoute(com.viam.service.navigation.v1.Navigation.GetRouteRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListRoutes lists all routes on the active map.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.ListRoutesResponse listRoutes(com.viam.service.navigation.v1.Navigation.ListRoutesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListRoutesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRoute renames a route and/or replaces its waypoints. An unset
     * waypoints list leaves the waypoints unchanged. A set list, including an
     * empty one, replaces them.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.UpdateRouteResponse updateRoute(com.viam.service.navigation.v1.Navigation.UpdateRouteRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRoute deletes a route. The locations it references are not affected.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.DeleteRouteResponse deleteRoute(com.viam.service.navigation.v1.Navigation.DeleteRouteRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddZone creates a keep-out or speed-limit zone on the active map. The
     * planner avoids keep-out zones and caps speed inside speed-limit zones.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.AddZoneResponse addZone(com.viam.service.navigation.v1.Navigation.AddZoneRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddZoneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetZone returns a zone by name.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetZoneResponse getZone(com.viam.service.navigation.v1.Navigation.GetZoneRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetZoneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListZones lists zones on the active map, optionally filtered by type.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.ListZonesResponse listZones(com.viam.service.navigation.v1.Navigation.ListZonesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListZonesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateZone changes a zone's type, geometry, speed limit, or name.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.UpdateZoneResponse updateZone(com.viam.service.navigation.v1.Navigation.UpdateZoneRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateZoneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteZone deletes a zone.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.DeleteZoneResponse deleteZone(com.viam.service.navigation.v1.Navigation.DeleteZoneRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteZoneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NavigateToLocation plans an obstacle-aware path to a saved location and
     * starts driving it. Returns once the goal is accepted; track progress with
     * GetNavigationStatus.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.NavigateToLocationResponse navigateToLocation(com.viam.service.navigation.v1.Navigation.NavigateToLocationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getNavigateToLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NavigateToPoint plans an obstacle-aware path to a Position and starts
     * driving it. Returns once the goal is accepted; track progress with
     * GetNavigationStatus. On a Pose, theta defaults to 0 if omitted.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.NavigateToPointResponse navigateToPoint(com.viam.service.navigation.v1.Navigation.NavigateToPointRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getNavigateToPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NavigateRoute drives a route one waypoint at a time using the
     * obstacle-aware planner. Provide either route_name (a saved route) or
     * waypoints (an inline list).
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.NavigateRouteResponse navigateRoute(com.viam.service.navigation.v1.Navigation.NavigateRouteRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getNavigateRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PlanToPoint computes a path from the robot (or a given start) to a
     * Position without moving. Pass a feasible result to ExecutePlan to drive it.
     * Raises an error if no path exists.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.PlanToPointResponse planToPoint(com.viam.service.navigation.v1.Navigation.PlanToPointRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPlanToPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PlanToLocation computes a path to a saved location without moving. Accepts
     * the same optional start as PlanToPoint. Raises an error if no path exists.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.PlanToLocationResponse planToLocation(com.viam.service.navigation.v1.Navigation.PlanToLocationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPlanToLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExecutePlan drives a Plan (typically from PlanToPoint or PlanToLocation).
     * While navigating, the active path is available on GetNavigationStatus. Rejected if
     * the path is empty.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.ExecutePlanResponse executePlan(com.viam.service.navigation.v1.Navigation.ExecutePlanRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getExecutePlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GoToLocation drives directly to a saved location with a closed-loop
     * controller, without full path planning. Intended for short hops and
     * docking. With wait false, returns immediately while navigating.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GoToLocationResponse goToLocation(com.viam.service.navigation.v1.Navigation.GoToLocationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGoToLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GoToPoint drives directly to a Position with a closed-loop controller,
     * without full path planning. Intended for short hops and docking. With wait
     * false, returns immediately while navigating.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GoToPointResponse goToPoint(com.viam.service.navigation.v1.Navigation.GoToPointRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGoToPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Suspend stops motion but remembers the current goal, including the current
     * waypoint and loop setting for routes. A suspended goal must be canceled
     * before a new one starts.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.SuspendResponse suspend(com.viam.service.navigation.v1.Navigation.SuspendRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSuspendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resume resumes the suspended goal the same way it was started: planned
     * navigation, simple go-to, or a route from its current waypoint.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.ResumeResponse resume(com.viam.service.navigation.v1.Navigation.ResumeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getResumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel stops all motion and discards both the active goal and any
     * suspended goal.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.CancelResponse cancel(com.viam.service.navigation.v1.Navigation.CancelRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPosition returns the robot's current position on the active map. Use
     * this for frequent position polling; GetNavigationStatus reports the same position
     * alongside the rest of the navigation state.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetPositionResponse getPosition(com.viam.service.navigation.v1.Navigation.GetPositionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetNavigationStatus returns the full navigation state, including the robot's
     * current position and the latest goal.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetNavigationStatusResponse getNavigationStatus(com.viam.service.navigation.v1.Navigation.GetNavigationStatusRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetNavigationStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProperties returns the map type the service operates on and robot
     * properties. These values do not change while the service is running.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetPropertiesResponse getProperties(com.viam.service.navigation.v1.Navigation.GetPropertiesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCostmap returns the local or global costmap as a downsampled grid, for
     * display in UIs.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetCostmapResponse getCostmap(com.viam.service.navigation.v1.Navigation.GetCostmapRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetCostmapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    public com.viam.common.v1.Common.DoCommandResponse doCommand(com.viam.common.v1.Common.DoCommandRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDoCommandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetStatus returns the status of the resource
     * </pre>
     */
    public com.viam.common.v1.Common.GetStatusResponse getStatus(com.viam.common.v1.Common.GetStatusRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service NavigationService.
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service.
   * Each service instance is bound to exactly one controllable base and one map
   * type (local SLAM or GPS). Apps save named locations, routes, and zones, then
   * navigate with plan-then-drive or direct go-to motion.
   * </pre>
   */
  public static final class NavigationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NavigationServiceBlockingStub> {
    private NavigationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavigationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NavigationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * AddLocation saves a named position on the active map. If position is
     * omitted, the robot's current position from GetPosition is saved.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.AddLocationResponse addLocation(com.viam.service.navigation.v1.Navigation.AddLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLocation returns a saved location by name. This does not return the
     * robot's current position; use GetPosition for that.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetLocationResponse getLocation(com.viam.service.navigation.v1.Navigation.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListLocations lists all saved locations on the active map.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.ListLocationsResponse listLocations(com.viam.service.navigation.v1.Navigation.ListLocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateLocation changes a saved location's position or name. Renaming a
     * location updates every route waypoint that references it.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.UpdateLocationResponse updateLocation(com.viam.service.navigation.v1.Navigation.UpdateLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteLocation deletes a saved location. The location is also removed from
     * every route that references it.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.DeleteLocationResponse deleteLocation(com.viam.service.navigation.v1.Navigation.DeleteLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddRoute creates a named route from an ordered list of waypoints. Every
     * referenced location must already exist.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.AddRouteResponse addRoute(com.viam.service.navigation.v1.Navigation.AddRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetRoute returns a route by name.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetRouteResponse getRoute(com.viam.service.navigation.v1.Navigation.GetRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListRoutes lists all routes on the active map.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.ListRoutesResponse listRoutes(com.viam.service.navigation.v1.Navigation.ListRoutesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRoutesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRoute renames a route and/or replaces its waypoints. An unset
     * waypoints list leaves the waypoints unchanged. A set list, including an
     * empty one, replaces them.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.UpdateRouteResponse updateRoute(com.viam.service.navigation.v1.Navigation.UpdateRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRoute deletes a route. The locations it references are not affected.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.DeleteRouteResponse deleteRoute(com.viam.service.navigation.v1.Navigation.DeleteRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddZone creates a keep-out or speed-limit zone on the active map. The
     * planner avoids keep-out zones and caps speed inside speed-limit zones.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.AddZoneResponse addZone(com.viam.service.navigation.v1.Navigation.AddZoneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddZoneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetZone returns a zone by name.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetZoneResponse getZone(com.viam.service.navigation.v1.Navigation.GetZoneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZoneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListZones lists zones on the active map, optionally filtered by type.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.ListZonesResponse listZones(com.viam.service.navigation.v1.Navigation.ListZonesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListZonesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateZone changes a zone's type, geometry, speed limit, or name.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.UpdateZoneResponse updateZone(com.viam.service.navigation.v1.Navigation.UpdateZoneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateZoneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteZone deletes a zone.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.DeleteZoneResponse deleteZone(com.viam.service.navigation.v1.Navigation.DeleteZoneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteZoneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NavigateToLocation plans an obstacle-aware path to a saved location and
     * starts driving it. Returns once the goal is accepted; track progress with
     * GetNavigationStatus.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.NavigateToLocationResponse navigateToLocation(com.viam.service.navigation.v1.Navigation.NavigateToLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNavigateToLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NavigateToPoint plans an obstacle-aware path to a Position and starts
     * driving it. Returns once the goal is accepted; track progress with
     * GetNavigationStatus. On a Pose, theta defaults to 0 if omitted.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.NavigateToPointResponse navigateToPoint(com.viam.service.navigation.v1.Navigation.NavigateToPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNavigateToPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NavigateRoute drives a route one waypoint at a time using the
     * obstacle-aware planner. Provide either route_name (a saved route) or
     * waypoints (an inline list).
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.NavigateRouteResponse navigateRoute(com.viam.service.navigation.v1.Navigation.NavigateRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNavigateRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PlanToPoint computes a path from the robot (or a given start) to a
     * Position without moving. Pass a feasible result to ExecutePlan to drive it.
     * Raises an error if no path exists.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.PlanToPointResponse planToPoint(com.viam.service.navigation.v1.Navigation.PlanToPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlanToPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PlanToLocation computes a path to a saved location without moving. Accepts
     * the same optional start as PlanToPoint. Raises an error if no path exists.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.PlanToLocationResponse planToLocation(com.viam.service.navigation.v1.Navigation.PlanToLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlanToLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExecutePlan drives a Plan (typically from PlanToPoint or PlanToLocation).
     * While navigating, the active path is available on GetNavigationStatus. Rejected if
     * the path is empty.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.ExecutePlanResponse executePlan(com.viam.service.navigation.v1.Navigation.ExecutePlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecutePlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GoToLocation drives directly to a saved location with a closed-loop
     * controller, without full path planning. Intended for short hops and
     * docking. With wait false, returns immediately while navigating.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GoToLocationResponse goToLocation(com.viam.service.navigation.v1.Navigation.GoToLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGoToLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GoToPoint drives directly to a Position with a closed-loop controller,
     * without full path planning. Intended for short hops and docking. With wait
     * false, returns immediately while navigating.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GoToPointResponse goToPoint(com.viam.service.navigation.v1.Navigation.GoToPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGoToPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Suspend stops motion but remembers the current goal, including the current
     * waypoint and loop setting for routes. A suspended goal must be canceled
     * before a new one starts.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.SuspendResponse suspend(com.viam.service.navigation.v1.Navigation.SuspendRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuspendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resume resumes the suspended goal the same way it was started: planned
     * navigation, simple go-to, or a route from its current waypoint.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.ResumeResponse resume(com.viam.service.navigation.v1.Navigation.ResumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel stops all motion and discards both the active goal and any
     * suspended goal.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.CancelResponse cancel(com.viam.service.navigation.v1.Navigation.CancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPosition returns the robot's current position on the active map. Use
     * this for frequent position polling; GetNavigationStatus reports the same position
     * alongside the rest of the navigation state.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetPositionResponse getPosition(com.viam.service.navigation.v1.Navigation.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetNavigationStatus returns the full navigation state, including the robot's
     * current position and the latest goal.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetNavigationStatusResponse getNavigationStatus(com.viam.service.navigation.v1.Navigation.GetNavigationStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNavigationStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProperties returns the map type the service operates on and robot
     * properties. These values do not change while the service is running.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetPropertiesResponse getProperties(com.viam.service.navigation.v1.Navigation.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCostmap returns the local or global costmap as a downsampled grid, for
     * display in UIs.
     * </pre>
     */
    public com.viam.service.navigation.v1.Navigation.GetCostmapResponse getCostmap(com.viam.service.navigation.v1.Navigation.GetCostmapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCostmapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    public com.viam.common.v1.Common.DoCommandResponse doCommand(com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoCommandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetStatus returns the status of the resource
     * </pre>
     */
    public com.viam.common.v1.Common.GetStatusResponse getStatus(com.viam.common.v1.Common.GetStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NavigationService.
   * <pre>
   * A NavigationService declares the gRPC contract for a Navigation service.
   * Each service instance is bound to exactly one controllable base and one map
   * type (local SLAM or GPS). Apps save named locations, routes, and zones, then
   * navigate with plan-then-drive or direct go-to motion.
   * </pre>
   */
  public static final class NavigationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<NavigationServiceFutureStub> {
    private NavigationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavigationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NavigationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * AddLocation saves a named position on the active map. If position is
     * omitted, the robot's current position from GetPosition is saved.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.AddLocationResponse> addLocation(
        com.viam.service.navigation.v1.Navigation.AddLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLocation returns a saved location by name. This does not return the
     * robot's current position; use GetPosition for that.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GetLocationResponse> getLocation(
        com.viam.service.navigation.v1.Navigation.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListLocations lists all saved locations on the active map.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.ListLocationsResponse> listLocations(
        com.viam.service.navigation.v1.Navigation.ListLocationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLocationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateLocation changes a saved location's position or name. Renaming a
     * location updates every route waypoint that references it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.UpdateLocationResponse> updateLocation(
        com.viam.service.navigation.v1.Navigation.UpdateLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteLocation deletes a saved location. The location is also removed from
     * every route that references it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.DeleteLocationResponse> deleteLocation(
        com.viam.service.navigation.v1.Navigation.DeleteLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddRoute creates a named route from an ordered list of waypoints. Every
     * referenced location must already exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.AddRouteResponse> addRoute(
        com.viam.service.navigation.v1.Navigation.AddRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetRoute returns a route by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GetRouteResponse> getRoute(
        com.viam.service.navigation.v1.Navigation.GetRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListRoutes lists all routes on the active map.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.ListRoutesResponse> listRoutes(
        com.viam.service.navigation.v1.Navigation.ListRoutesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRoutesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateRoute renames a route and/or replaces its waypoints. An unset
     * waypoints list leaves the waypoints unchanged. A set list, including an
     * empty one, replaces them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.UpdateRouteResponse> updateRoute(
        com.viam.service.navigation.v1.Navigation.UpdateRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRoute deletes a route. The locations it references are not affected.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.DeleteRouteResponse> deleteRoute(
        com.viam.service.navigation.v1.Navigation.DeleteRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddZone creates a keep-out or speed-limit zone on the active map. The
     * planner avoids keep-out zones and caps speed inside speed-limit zones.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.AddZoneResponse> addZone(
        com.viam.service.navigation.v1.Navigation.AddZoneRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddZoneMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetZone returns a zone by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GetZoneResponse> getZone(
        com.viam.service.navigation.v1.Navigation.GetZoneRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZoneMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListZones lists zones on the active map, optionally filtered by type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.ListZonesResponse> listZones(
        com.viam.service.navigation.v1.Navigation.ListZonesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListZonesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateZone changes a zone's type, geometry, speed limit, or name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.UpdateZoneResponse> updateZone(
        com.viam.service.navigation.v1.Navigation.UpdateZoneRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateZoneMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteZone deletes a zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.DeleteZoneResponse> deleteZone(
        com.viam.service.navigation.v1.Navigation.DeleteZoneRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteZoneMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NavigateToLocation plans an obstacle-aware path to a saved location and
     * starts driving it. Returns once the goal is accepted; track progress with
     * GetNavigationStatus.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.NavigateToLocationResponse> navigateToLocation(
        com.viam.service.navigation.v1.Navigation.NavigateToLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNavigateToLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NavigateToPoint plans an obstacle-aware path to a Position and starts
     * driving it. Returns once the goal is accepted; track progress with
     * GetNavigationStatus. On a Pose, theta defaults to 0 if omitted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.NavigateToPointResponse> navigateToPoint(
        com.viam.service.navigation.v1.Navigation.NavigateToPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNavigateToPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NavigateRoute drives a route one waypoint at a time using the
     * obstacle-aware planner. Provide either route_name (a saved route) or
     * waypoints (an inline list).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.NavigateRouteResponse> navigateRoute(
        com.viam.service.navigation.v1.Navigation.NavigateRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNavigateRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PlanToPoint computes a path from the robot (or a given start) to a
     * Position without moving. Pass a feasible result to ExecutePlan to drive it.
     * Raises an error if no path exists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.PlanToPointResponse> planToPoint(
        com.viam.service.navigation.v1.Navigation.PlanToPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlanToPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PlanToLocation computes a path to a saved location without moving. Accepts
     * the same optional start as PlanToPoint. Raises an error if no path exists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.PlanToLocationResponse> planToLocation(
        com.viam.service.navigation.v1.Navigation.PlanToLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlanToLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExecutePlan drives a Plan (typically from PlanToPoint or PlanToLocation).
     * While navigating, the active path is available on GetNavigationStatus. Rejected if
     * the path is empty.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.ExecutePlanResponse> executePlan(
        com.viam.service.navigation.v1.Navigation.ExecutePlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecutePlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GoToLocation drives directly to a saved location with a closed-loop
     * controller, without full path planning. Intended for short hops and
     * docking. With wait false, returns immediately while navigating.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GoToLocationResponse> goToLocation(
        com.viam.service.navigation.v1.Navigation.GoToLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGoToLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GoToPoint drives directly to a Position with a closed-loop controller,
     * without full path planning. Intended for short hops and docking. With wait
     * false, returns immediately while navigating.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GoToPointResponse> goToPoint(
        com.viam.service.navigation.v1.Navigation.GoToPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGoToPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Suspend stops motion but remembers the current goal, including the current
     * waypoint and loop setting for routes. A suspended goal must be canceled
     * before a new one starts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.SuspendResponse> suspend(
        com.viam.service.navigation.v1.Navigation.SuspendRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuspendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resume resumes the suspended goal the same way it was started: planned
     * navigation, simple go-to, or a route from its current waypoint.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.ResumeResponse> resume(
        com.viam.service.navigation.v1.Navigation.ResumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel stops all motion and discards both the active goal and any
     * suspended goal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.CancelResponse> cancel(
        com.viam.service.navigation.v1.Navigation.CancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPosition returns the robot's current position on the active map. Use
     * this for frequent position polling; GetNavigationStatus reports the same position
     * alongside the rest of the navigation state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GetPositionResponse> getPosition(
        com.viam.service.navigation.v1.Navigation.GetPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetNavigationStatus returns the full navigation state, including the robot's
     * current position and the latest goal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GetNavigationStatusResponse> getNavigationStatus(
        com.viam.service.navigation.v1.Navigation.GetNavigationStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNavigationStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProperties returns the map type the service operates on and robot
     * properties. These values do not change while the service is running.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GetPropertiesResponse> getProperties(
        com.viam.service.navigation.v1.Navigation.GetPropertiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCostmap returns the local or global costmap as a downsampled grid, for
     * display in UIs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.service.navigation.v1.Navigation.GetCostmapResponse> getCostmap(
        com.viam.service.navigation.v1.Navigation.GetCostmapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCostmapMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DoCommand sends/receives arbitrary commands
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.DoCommandResponse> doCommand(
        com.viam.common.v1.Common.DoCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoCommandMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetStatus returns the status of the resource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viam.common.v1.Common.GetStatusResponse> getStatus(
        com.viam.common.v1.Common.GetStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_LOCATION = 0;
  private static final int METHODID_GET_LOCATION = 1;
  private static final int METHODID_LIST_LOCATIONS = 2;
  private static final int METHODID_UPDATE_LOCATION = 3;
  private static final int METHODID_DELETE_LOCATION = 4;
  private static final int METHODID_ADD_ROUTE = 5;
  private static final int METHODID_GET_ROUTE = 6;
  private static final int METHODID_LIST_ROUTES = 7;
  private static final int METHODID_UPDATE_ROUTE = 8;
  private static final int METHODID_DELETE_ROUTE = 9;
  private static final int METHODID_ADD_ZONE = 10;
  private static final int METHODID_GET_ZONE = 11;
  private static final int METHODID_LIST_ZONES = 12;
  private static final int METHODID_UPDATE_ZONE = 13;
  private static final int METHODID_DELETE_ZONE = 14;
  private static final int METHODID_NAVIGATE_TO_LOCATION = 15;
  private static final int METHODID_NAVIGATE_TO_POINT = 16;
  private static final int METHODID_NAVIGATE_ROUTE = 17;
  private static final int METHODID_PLAN_TO_POINT = 18;
  private static final int METHODID_PLAN_TO_LOCATION = 19;
  private static final int METHODID_EXECUTE_PLAN = 20;
  private static final int METHODID_GO_TO_LOCATION = 21;
  private static final int METHODID_GO_TO_POINT = 22;
  private static final int METHODID_SUSPEND = 23;
  private static final int METHODID_RESUME = 24;
  private static final int METHODID_CANCEL = 25;
  private static final int METHODID_GET_POSITION = 26;
  private static final int METHODID_GET_NAVIGATION_STATUS = 27;
  private static final int METHODID_GET_PROPERTIES = 28;
  private static final int METHODID_GET_COSTMAP = 29;
  private static final int METHODID_DO_COMMAND = 30;
  private static final int METHODID_GET_STATUS = 31;

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
        case METHODID_ADD_LOCATION:
          serviceImpl.addLocation((com.viam.service.navigation.v1.Navigation.AddLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.AddLocationResponse>) responseObserver);
          break;
        case METHODID_GET_LOCATION:
          serviceImpl.getLocation((com.viam.service.navigation.v1.Navigation.GetLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetLocationResponse>) responseObserver);
          break;
        case METHODID_LIST_LOCATIONS:
          serviceImpl.listLocations((com.viam.service.navigation.v1.Navigation.ListLocationsRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ListLocationsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LOCATION:
          serviceImpl.updateLocation((com.viam.service.navigation.v1.Navigation.UpdateLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.UpdateLocationResponse>) responseObserver);
          break;
        case METHODID_DELETE_LOCATION:
          serviceImpl.deleteLocation((com.viam.service.navigation.v1.Navigation.DeleteLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.DeleteLocationResponse>) responseObserver);
          break;
        case METHODID_ADD_ROUTE:
          serviceImpl.addRoute((com.viam.service.navigation.v1.Navigation.AddRouteRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.AddRouteResponse>) responseObserver);
          break;
        case METHODID_GET_ROUTE:
          serviceImpl.getRoute((com.viam.service.navigation.v1.Navigation.GetRouteRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetRouteResponse>) responseObserver);
          break;
        case METHODID_LIST_ROUTES:
          serviceImpl.listRoutes((com.viam.service.navigation.v1.Navigation.ListRoutesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ListRoutesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROUTE:
          serviceImpl.updateRoute((com.viam.service.navigation.v1.Navigation.UpdateRouteRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.UpdateRouteResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROUTE:
          serviceImpl.deleteRoute((com.viam.service.navigation.v1.Navigation.DeleteRouteRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.DeleteRouteResponse>) responseObserver);
          break;
        case METHODID_ADD_ZONE:
          serviceImpl.addZone((com.viam.service.navigation.v1.Navigation.AddZoneRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.AddZoneResponse>) responseObserver);
          break;
        case METHODID_GET_ZONE:
          serviceImpl.getZone((com.viam.service.navigation.v1.Navigation.GetZoneRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetZoneResponse>) responseObserver);
          break;
        case METHODID_LIST_ZONES:
          serviceImpl.listZones((com.viam.service.navigation.v1.Navigation.ListZonesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ListZonesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ZONE:
          serviceImpl.updateZone((com.viam.service.navigation.v1.Navigation.UpdateZoneRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.UpdateZoneResponse>) responseObserver);
          break;
        case METHODID_DELETE_ZONE:
          serviceImpl.deleteZone((com.viam.service.navigation.v1.Navigation.DeleteZoneRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.DeleteZoneResponse>) responseObserver);
          break;
        case METHODID_NAVIGATE_TO_LOCATION:
          serviceImpl.navigateToLocation((com.viam.service.navigation.v1.Navigation.NavigateToLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.NavigateToLocationResponse>) responseObserver);
          break;
        case METHODID_NAVIGATE_TO_POINT:
          serviceImpl.navigateToPoint((com.viam.service.navigation.v1.Navigation.NavigateToPointRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.NavigateToPointResponse>) responseObserver);
          break;
        case METHODID_NAVIGATE_ROUTE:
          serviceImpl.navigateRoute((com.viam.service.navigation.v1.Navigation.NavigateRouteRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.NavigateRouteResponse>) responseObserver);
          break;
        case METHODID_PLAN_TO_POINT:
          serviceImpl.planToPoint((com.viam.service.navigation.v1.Navigation.PlanToPointRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.PlanToPointResponse>) responseObserver);
          break;
        case METHODID_PLAN_TO_LOCATION:
          serviceImpl.planToLocation((com.viam.service.navigation.v1.Navigation.PlanToLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.PlanToLocationResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_PLAN:
          serviceImpl.executePlan((com.viam.service.navigation.v1.Navigation.ExecutePlanRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ExecutePlanResponse>) responseObserver);
          break;
        case METHODID_GO_TO_LOCATION:
          serviceImpl.goToLocation((com.viam.service.navigation.v1.Navigation.GoToLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GoToLocationResponse>) responseObserver);
          break;
        case METHODID_GO_TO_POINT:
          serviceImpl.goToPoint((com.viam.service.navigation.v1.Navigation.GoToPointRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GoToPointResponse>) responseObserver);
          break;
        case METHODID_SUSPEND:
          serviceImpl.suspend((com.viam.service.navigation.v1.Navigation.SuspendRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.SuspendResponse>) responseObserver);
          break;
        case METHODID_RESUME:
          serviceImpl.resume((com.viam.service.navigation.v1.Navigation.ResumeRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.ResumeResponse>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((com.viam.service.navigation.v1.Navigation.CancelRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.CancelResponse>) responseObserver);
          break;
        case METHODID_GET_POSITION:
          serviceImpl.getPosition((com.viam.service.navigation.v1.Navigation.GetPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetPositionResponse>) responseObserver);
          break;
        case METHODID_GET_NAVIGATION_STATUS:
          serviceImpl.getNavigationStatus((com.viam.service.navigation.v1.Navigation.GetNavigationStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetNavigationStatusResponse>) responseObserver);
          break;
        case METHODID_GET_PROPERTIES:
          serviceImpl.getProperties((com.viam.service.navigation.v1.Navigation.GetPropertiesRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetPropertiesResponse>) responseObserver);
          break;
        case METHODID_GET_COSTMAP:
          serviceImpl.getCostmap((com.viam.service.navigation.v1.Navigation.GetCostmapRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.service.navigation.v1.Navigation.GetCostmapResponse>) responseObserver);
          break;
        case METHODID_DO_COMMAND:
          serviceImpl.doCommand((com.viam.common.v1.Common.DoCommandRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.DoCommandResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((com.viam.common.v1.Common.GetStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.viam.common.v1.Common.GetStatusResponse>) responseObserver);
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
          getAddLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.AddLocationRequest,
              com.viam.service.navigation.v1.Navigation.AddLocationResponse>(
                service, METHODID_ADD_LOCATION)))
        .addMethod(
          getGetLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GetLocationRequest,
              com.viam.service.navigation.v1.Navigation.GetLocationResponse>(
                service, METHODID_GET_LOCATION)))
        .addMethod(
          getListLocationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.ListLocationsRequest,
              com.viam.service.navigation.v1.Navigation.ListLocationsResponse>(
                service, METHODID_LIST_LOCATIONS)))
        .addMethod(
          getUpdateLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.UpdateLocationRequest,
              com.viam.service.navigation.v1.Navigation.UpdateLocationResponse>(
                service, METHODID_UPDATE_LOCATION)))
        .addMethod(
          getDeleteLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.DeleteLocationRequest,
              com.viam.service.navigation.v1.Navigation.DeleteLocationResponse>(
                service, METHODID_DELETE_LOCATION)))
        .addMethod(
          getAddRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.AddRouteRequest,
              com.viam.service.navigation.v1.Navigation.AddRouteResponse>(
                service, METHODID_ADD_ROUTE)))
        .addMethod(
          getGetRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GetRouteRequest,
              com.viam.service.navigation.v1.Navigation.GetRouteResponse>(
                service, METHODID_GET_ROUTE)))
        .addMethod(
          getListRoutesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.ListRoutesRequest,
              com.viam.service.navigation.v1.Navigation.ListRoutesResponse>(
                service, METHODID_LIST_ROUTES)))
        .addMethod(
          getUpdateRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.UpdateRouteRequest,
              com.viam.service.navigation.v1.Navigation.UpdateRouteResponse>(
                service, METHODID_UPDATE_ROUTE)))
        .addMethod(
          getDeleteRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.DeleteRouteRequest,
              com.viam.service.navigation.v1.Navigation.DeleteRouteResponse>(
                service, METHODID_DELETE_ROUTE)))
        .addMethod(
          getAddZoneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.AddZoneRequest,
              com.viam.service.navigation.v1.Navigation.AddZoneResponse>(
                service, METHODID_ADD_ZONE)))
        .addMethod(
          getGetZoneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GetZoneRequest,
              com.viam.service.navigation.v1.Navigation.GetZoneResponse>(
                service, METHODID_GET_ZONE)))
        .addMethod(
          getListZonesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.ListZonesRequest,
              com.viam.service.navigation.v1.Navigation.ListZonesResponse>(
                service, METHODID_LIST_ZONES)))
        .addMethod(
          getUpdateZoneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.UpdateZoneRequest,
              com.viam.service.navigation.v1.Navigation.UpdateZoneResponse>(
                service, METHODID_UPDATE_ZONE)))
        .addMethod(
          getDeleteZoneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.DeleteZoneRequest,
              com.viam.service.navigation.v1.Navigation.DeleteZoneResponse>(
                service, METHODID_DELETE_ZONE)))
        .addMethod(
          getNavigateToLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.NavigateToLocationRequest,
              com.viam.service.navigation.v1.Navigation.NavigateToLocationResponse>(
                service, METHODID_NAVIGATE_TO_LOCATION)))
        .addMethod(
          getNavigateToPointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.NavigateToPointRequest,
              com.viam.service.navigation.v1.Navigation.NavigateToPointResponse>(
                service, METHODID_NAVIGATE_TO_POINT)))
        .addMethod(
          getNavigateRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.NavigateRouteRequest,
              com.viam.service.navigation.v1.Navigation.NavigateRouteResponse>(
                service, METHODID_NAVIGATE_ROUTE)))
        .addMethod(
          getPlanToPointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.PlanToPointRequest,
              com.viam.service.navigation.v1.Navigation.PlanToPointResponse>(
                service, METHODID_PLAN_TO_POINT)))
        .addMethod(
          getPlanToLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.PlanToLocationRequest,
              com.viam.service.navigation.v1.Navigation.PlanToLocationResponse>(
                service, METHODID_PLAN_TO_LOCATION)))
        .addMethod(
          getExecutePlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.ExecutePlanRequest,
              com.viam.service.navigation.v1.Navigation.ExecutePlanResponse>(
                service, METHODID_EXECUTE_PLAN)))
        .addMethod(
          getGoToLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GoToLocationRequest,
              com.viam.service.navigation.v1.Navigation.GoToLocationResponse>(
                service, METHODID_GO_TO_LOCATION)))
        .addMethod(
          getGoToPointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GoToPointRequest,
              com.viam.service.navigation.v1.Navigation.GoToPointResponse>(
                service, METHODID_GO_TO_POINT)))
        .addMethod(
          getSuspendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.SuspendRequest,
              com.viam.service.navigation.v1.Navigation.SuspendResponse>(
                service, METHODID_SUSPEND)))
        .addMethod(
          getResumeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.ResumeRequest,
              com.viam.service.navigation.v1.Navigation.ResumeResponse>(
                service, METHODID_RESUME)))
        .addMethod(
          getCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.CancelRequest,
              com.viam.service.navigation.v1.Navigation.CancelResponse>(
                service, METHODID_CANCEL)))
        .addMethod(
          getGetPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GetPositionRequest,
              com.viam.service.navigation.v1.Navigation.GetPositionResponse>(
                service, METHODID_GET_POSITION)))
        .addMethod(
          getGetNavigationStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GetNavigationStatusRequest,
              com.viam.service.navigation.v1.Navigation.GetNavigationStatusResponse>(
                service, METHODID_GET_NAVIGATION_STATUS)))
        .addMethod(
          getGetPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GetPropertiesRequest,
              com.viam.service.navigation.v1.Navigation.GetPropertiesResponse>(
                service, METHODID_GET_PROPERTIES)))
        .addMethod(
          getGetCostmapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.service.navigation.v1.Navigation.GetCostmapRequest,
              com.viam.service.navigation.v1.Navigation.GetCostmapResponse>(
                service, METHODID_GET_COSTMAP)))
        .addMethod(
          getDoCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.DoCommandRequest,
              com.viam.common.v1.Common.DoCommandResponse>(
                service, METHODID_DO_COMMAND)))
        .addMethod(
          getGetStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viam.common.v1.Common.GetStatusRequest,
              com.viam.common.v1.Common.GetStatusResponse>(
                service, METHODID_GET_STATUS)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NavigationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getAddLocationMethod())
              .addMethod(getGetLocationMethod())
              .addMethod(getListLocationsMethod())
              .addMethod(getUpdateLocationMethod())
              .addMethod(getDeleteLocationMethod())
              .addMethod(getAddRouteMethod())
              .addMethod(getGetRouteMethod())
              .addMethod(getListRoutesMethod())
              .addMethod(getUpdateRouteMethod())
              .addMethod(getDeleteRouteMethod())
              .addMethod(getAddZoneMethod())
              .addMethod(getGetZoneMethod())
              .addMethod(getListZonesMethod())
              .addMethod(getUpdateZoneMethod())
              .addMethod(getDeleteZoneMethod())
              .addMethod(getNavigateToLocationMethod())
              .addMethod(getNavigateToPointMethod())
              .addMethod(getNavigateRouteMethod())
              .addMethod(getPlanToPointMethod())
              .addMethod(getPlanToLocationMethod())
              .addMethod(getExecutePlanMethod())
              .addMethod(getGoToLocationMethod())
              .addMethod(getGoToPointMethod())
              .addMethod(getSuspendMethod())
              .addMethod(getResumeMethod())
              .addMethod(getCancelMethod())
              .addMethod(getGetPositionMethod())
              .addMethod(getGetNavigationStatusMethod())
              .addMethod(getGetPropertiesMethod())
              .addMethod(getGetCostmapMethod())
              .addMethod(getDoCommandMethod())
              .addMethod(getGetStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
