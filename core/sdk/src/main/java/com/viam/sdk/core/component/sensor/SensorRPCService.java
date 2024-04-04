package com.viam.sdk.core.component.sensor;

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
import com.viam.component.sensor.v1.SensorServiceGrpc;
import com.viam.sdk.core.resource.ResourceManager;
import com.viam.sdk.core.resource.ResourceRPCService;
import io.grpc.stub.StreamObserver;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SensorRPCService extends SensorServiceGrpc.SensorServiceImplBase
        implements ResourceRPCService<Sensor> {

    private final ResourceManager manager;

    public SensorRPCService(final ResourceManager manager) {
        this.manager = manager;
    }

    @Override
    public void getReadings(GetReadingsRequest request,
                           StreamObserver<GetReadingsResponse> responseObserver) {
        final com.viam.sdk.core.component.sensor.Sensor sensor = getResource(
                com.viam.sdk.core.component.sensor.Sensor.named(request.getName())
        );
        final GetReadingsResponse result = sensor.getReadings(Optional.of(request.getExtra()));
        responseObserver.onNext(GetReadingsResponse.newBuilder().putAllReadings(result.getReadingsMap()).build());
        responseObserver.onCompleted();
    }

    @Override
    public Class<Sensor> getResourceClass() {
        return Sensor.class;
    }

    @Override
    public ResourceManager getManager() {
        return manager;
    }
}
