package com.viam.sdk.core.component.powersensor;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.component.powersensor.v1.PowerSensorServiceGrpc;
import com.viam.component.powersensor.v1.Powersensor;
import com.viam.sdk.core.resource.ResourceManager;
import com.viam.sdk.core.resource.ResourceRPCService;
import com.viam.sdk.core.util.Utils;
import io.grpc.stub.StreamObserver;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class PowerSensorRPCService extends PowerSensorServiceGrpc.PowerSensorServiceImplBase implements ResourceRPCService<PowerSensor> {

    private final ResourceManager manager;

    public PowerSensorRPCService(ResourceManager manager) {
        this.manager = manager;
    }

    @Override
    public Class<PowerSensor> getResourceClass() {
        return PowerSensor.class;
    }

    @Override
    public ResourceManager getManager() {
        return manager;
    }


    @Override
    public void getVoltage(Powersensor.GetVoltageRequest request, StreamObserver<Powersensor.GetVoltageResponse> responseObserver) {
        PowerSensor powerSensor = getResource(PowerSensor.named(request.getName()));
        Entry<Double, Boolean> voltage = powerSensor.getVoltage(Optional.of(request.getExtra()));
        responseObserver.onNext(com.viam.component.powersensor.v1.Powersensor.GetVoltageResponse.newBuilder().setVolts(voltage.getKey()).setIsAc(voltage.getValue()).build());
        responseObserver.onCompleted();
    }

    @Override
    public void getCurrent(Powersensor.GetCurrentRequest request, StreamObserver<Powersensor.GetCurrentResponse> responseObserver) {
        PowerSensor powerSensor = getResource(PowerSensor.named(request.getName()));
        Entry<Double, Boolean> current = powerSensor.getCurrent(Optional.of(request.getExtra()));
        responseObserver.onNext(com.viam.component.powersensor.v1.Powersensor.GetCurrentResponse.newBuilder().setAmperes(current.getKey()).setIsAc(current.getValue()).build());
        responseObserver.onCompleted();
    }

    @Override
    public void getPower(Powersensor.GetPowerRequest request, StreamObserver<Powersensor.GetPowerResponse> responseObserver) {
        PowerSensor powerSensor = getResource(PowerSensor.named(request.getName()));
        double power = powerSensor.getPower(Optional.of(request.getExtra()));
        responseObserver.onNext(com.viam.component.powersensor.v1.Powersensor.GetPowerResponse.newBuilder().setWatts(power).build());
        responseObserver.onCompleted();
    }

    @Override
    public void getReadings(Common.GetReadingsRequest request, StreamObserver<Common.GetReadingsResponse> responseObserver) {
        PowerSensor powerSensor = getResource(PowerSensor.named(request.getName()));
        Map<String, Value> readings = Utils.sensorReadingsNativeToValue(powerSensor.getReadings(Optional.of(request.getExtra())));
        responseObserver.onNext(Common.GetReadingsResponse.newBuilder().putAllReadings(readings).build());
        responseObserver.onCompleted();
    }
    @Override
    public void doCommand(Common.DoCommandRequest request,
                          StreamObserver<Common.DoCommandResponse> responseObserver) {

        PowerSensor powerSensor = getResource(PowerSensor.named(request.getName()));
        Struct result = powerSensor.doCommand(request.getCommand().getFieldsMap());
        responseObserver.onNext(Common.DoCommandResponse.newBuilder().setResult(result).build());
        responseObserver.onCompleted();
    }

}

