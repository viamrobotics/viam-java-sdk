package com.viam.sdk.core.component.movementsensor;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.GetGeometriesRequest;
import com.viam.common.v1.Common.GetReadingsRequest;
import com.viam.common.v1.Common.Orientation;
import com.viam.common.v1.Common.Vector3;
import com.viam.component.movementsensor.v1.MovementSensorServiceGrpc;
import com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse;
import com.viam.component.movementsensor.v1.Movementsensor.GetAngularVelocityRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetCompassHeadingRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetLinearAccelerationRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetLinearVelocityRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetOrientationRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetPositionRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse;
import com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesRequest;
import com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse;
import com.viam.sdk.core.rpc.Channel;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * gRPC Client for a MovementSensor component
 */
public class MovementSensorRPCClient extends MovementSensor {

  private final MovementSensorServiceGrpc.MovementSensorServiceBlockingStub client;

  public MovementSensorRPCClient(final String name, final Channel chan) {
    super(name);
    final MovementSensorServiceGrpc.MovementSensorServiceBlockingStub client = MovementSensorServiceGrpc.newBlockingStub(
        chan);
    if (chan.getCallCredentials().isPresent()) {
      this.client = client.withCallCredentials(chan.getCallCredentials().get());
    } else {
      this.client = client;
    }
  }

  @Override
  public Struct doCommand(final Map<String, Value> command) {
    return client.doCommand(Common.DoCommandRequest.newBuilder().
        setName(getName().getName()).
        setCommand(Struct.newBuilder().putAllFields(command).build()).
        build()).getResult();
  }

  @Override
  public List<Common.Geometry> getGeometries(final Optional<Struct> extra) {
    final GetGeometriesRequest.Builder builder = Common.GetGeometriesRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getGeometries(builder.build()).getGeometriesList();
  }

  @Override
  public Vector3 getLinearVelocity(final Optional<Struct> extra) {
    final GetLinearVelocityRequest.Builder builder = GetLinearVelocityRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getLinearVelocity(builder.build()).getLinearVelocity();
  }

  @Override
  public Vector3 getAngularVelocity(final Optional<Struct> extra) {
    final GetAngularVelocityRequest.Builder builder = GetAngularVelocityRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getAngularVelocity(builder.build()).getAngularVelocity();
  }

  @Override
  public double getCompassHeading(final Optional<Struct> extra) {
    final GetCompassHeadingRequest.Builder builder = GetCompassHeadingRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getCompassHeading(builder.build()).getValue();
  }

  @Override
  public GetPropertiesResponse getProperties(final Optional<Struct> extra) {
    final GetPropertiesRequest.Builder builder = GetPropertiesRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getProperties(builder.build());
  }

  @Override
  public GetAccuracyResponse getAccuracy(final Optional<Struct> extra) {
    final GetAccuracyRequest.Builder builder = GetAccuracyRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getAccuracy(builder.build());
  }

  @Override
  public Vector3 getLinearAcceleration(final Optional<Struct> extra) {
    final GetLinearAccelerationRequest.Builder builder = GetLinearAccelerationRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getLinearAcceleration(builder.build()).getLinearAcceleration();
  }

  @Override
  public Orientation getOrientation(final Optional<Struct> extra) {
    final GetOrientationRequest.Builder builder = GetOrientationRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getOrientation(builder.build()).getOrientation();
  }

  @Override
  public GetPositionResponse getPosition(final Optional<Struct> extra) {
    final GetPositionRequest.Builder builder = GetPositionRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getPosition(builder.build());
  }

  @Override
  public Map<String, Value> getReadings(final Optional<Struct> extra) {
    final GetReadingsRequest.Builder builder = GetReadingsRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getReadings(builder.build()).getReadingsMap();
  }
}
