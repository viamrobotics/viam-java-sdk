package com.viam.sdk.core.component.movementsensor;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.Geometry;
import com.viam.common.v1.Common.GetGeometriesResponse;
import com.viam.common.v1.Common.GetReadingsRequest;
import com.viam.common.v1.Common.GetReadingsResponse;
import com.viam.common.v1.Common.Orientation;
import com.viam.common.v1.Common.Vector3;
import com.viam.component.movementsensor.v1.MovementSensorServiceGrpc;
import com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse;
import com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityResponse;
import com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingResponse;
import com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationResponse;
import com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityResponse;
import com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetOrientationResponse;
import com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse;
import com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse;
import com.viam.sdk.core.resource.ResourceManager;
import com.viam.sdk.core.resource.ResourceRPCService;
import io.grpc.stub.StreamObserver;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * gRPC Service for a MovementSensor component
 */
public class MovementSensorRPCService extends
    MovementSensorServiceGrpc.MovementSensorServiceImplBase implements
    ResourceRPCService<MovementSensor> {

  private final ResourceManager manager;

  public MovementSensorRPCService(final ResourceManager manager) {
    this.manager = manager;
  }

  @Override
  public void getLinearVelocity(GetLinearVelocityRequest request,
      StreamObserver<GetLinearVelocityResponse> responseObserver) {
    final com.viam.sdk.core.component.movementsensor.MovementSensor sensor = getResource(
        com.viam.sdk.core.component.movementsensor.MovementSensor.named(request.getName()));
    final Vector3 result = sensor.getLinearVelocity(Optional.of(request.getExtra()));
    responseObserver.onNext(
        GetLinearVelocityResponse.newBuilder().setLinearVelocity(result).build());
    responseObserver.onCompleted();
  }

  @Override
  public void getAngularVelocity(GetAngularVelocityRequest request,
      StreamObserver<GetAngularVelocityResponse> responseObserver) {
    final com.viam.sdk.core.component.movementsensor.MovementSensor sensor = getResource(
        com.viam.sdk.core.component.movementsensor.MovementSensor.named(request.getName()));
    final Vector3 result = sensor.getAngularVelocity(Optional.of(request.getExtra()));
    responseObserver.onNext(
        GetAngularVelocityResponse.newBuilder().setAngularVelocity(result).build());
    responseObserver.onCompleted();
  }

  @Override
  public void getCompassHeading(GetCompassHeadingRequest request,
      StreamObserver<GetCompassHeadingResponse> responseObserver) {
    final com.viam.sdk.core.component.movementsensor.MovementSensor sensor = getResource(
        com.viam.sdk.core.component.movementsensor.MovementSensor.named(request.getName()));
    final double result = sensor.getCompassHeading(Optional.of(request.getExtra()));
    responseObserver.onNext(GetCompassHeadingResponse.newBuilder().setValue(result).build());
    responseObserver.onCompleted();
  }

  @Override
  public void getOrientation(GetOrientationRequest request,
      StreamObserver<GetOrientationResponse> responseObserver) {
    final com.viam.sdk.core.component.movementsensor.MovementSensor sensor = getResource(
        com.viam.sdk.core.component.movementsensor.MovementSensor.named(request.getName()));
    final Orientation result = sensor.getOrientation(Optional.of(request.getExtra()));
    responseObserver.onNext(GetOrientationResponse.newBuilder().setOrientation(result).build());
    responseObserver.onCompleted();
  }

  @Override
  public void getPosition(GetPositionRequest request,
      StreamObserver<GetPositionResponse> responseObserver) {
    final com.viam.sdk.core.component.movementsensor.MovementSensor sensor = getResource(
        com.viam.sdk.core.component.movementsensor.MovementSensor.named(request.getName()));
    final GetPositionResponse result = sensor.getPosition(Optional.of(request.getExtra()));
    responseObserver.onNext(result);
    responseObserver.onCompleted();
  }

  @Override
  public void getProperties(GetPropertiesRequest request,
      StreamObserver<GetPropertiesResponse> responseObserver) {
    final com.viam.sdk.core.component.movementsensor.MovementSensor sensor = getResource(
        com.viam.sdk.core.component.movementsensor.MovementSensor.named(request.getName()));
    final GetPropertiesResponse result = sensor.getProperties(Optional.of(request.getExtra()));
    responseObserver.onNext(result);
    responseObserver.onCompleted();
  }

  @Override
  public void getAccuracy(GetAccuracyRequest request,
      StreamObserver<GetAccuracyResponse> responseObserver) {
    final com.viam.sdk.core.component.movementsensor.MovementSensor sensor = getResource(
        com.viam.sdk.core.component.movementsensor.MovementSensor.named(request.getName()));
    final GetAccuracyResponse result = sensor.getAccuracy(Optional.of(request.getExtra()));
    responseObserver.onNext(result);
    responseObserver.onCompleted();
  }

  @Override
  public void getLinearAcceleration(GetLinearAccelerationRequest request,
      StreamObserver<GetLinearAccelerationResponse> responseObserver) {
    final com.viam.sdk.core.component.movementsensor.MovementSensor sensor = getResource(
        com.viam.sdk.core.component.movementsensor.MovementSensor.named(request.getName()));
    final Vector3 result = sensor.getLinearAcceleration(Optional.of(request.getExtra()));
    responseObserver.onNext(
        GetLinearAccelerationResponse.newBuilder().setLinearAcceleration(result).build());
    responseObserver.onCompleted();
  }

  @Override
  public void getReadings(GetReadingsRequest request,
      StreamObserver<GetReadingsResponse> responseObserver) {
    final com.viam.sdk.core.component.movementsensor.MovementSensor sensor = getResource(
        com.viam.sdk.core.component.movementsensor.MovementSensor.named(request.getName()));
    final Map<String, Value> result = sensor.getReadings(Optional.of(request.getExtra()));
    responseObserver.onNext(GetReadingsResponse.newBuilder().putAllReadings(result).build());
    responseObserver.onCompleted();
  }

  @Override
  public void doCommand(Common.DoCommandRequest request,
      StreamObserver<Common.DoCommandResponse> responseObserver) {
    final com.viam.sdk.core.component.movementsensor.MovementSensor sensor = getResource(
        com.viam.sdk.core.component.movementsensor.MovementSensor.named(request.getName()));
    final Struct result = sensor.doCommand(request.getCommand().getFieldsMap());
    responseObserver.onNext(Common.DoCommandResponse.newBuilder().setResult(result).build());
    responseObserver.onCompleted();
  }

  @Override
  public void getGeometries(Common.GetGeometriesRequest request,
      StreamObserver<Common.GetGeometriesResponse> responseObserver) {
    final com.viam.sdk.core.component.movementsensor.MovementSensor sensor = getResource(
        com.viam.sdk.core.component.movementsensor.MovementSensor.named(request.getName()));
    final List<Geometry> result = sensor.getGeometries(Optional.of(request.getExtra()));
    responseObserver.onNext(GetGeometriesResponse.newBuilder().addAllGeometries(result).build());
    responseObserver.onCompleted();
  }

  @Override
  public Class<MovementSensor> getResourceClass() {
    return MovementSensor.class;
  }

  @Override
  public ResourceManager getManager() {
    return manager;
  }
}
