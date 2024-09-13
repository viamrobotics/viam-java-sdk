package com.viam.sdk.core.component.powersensor;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.component.powersensor.v1.PowerSensorServiceGrpc;
import com.viam.component.powersensor.v1.Powersensor;
import com.viam.sdk.core.rpc.Channel;
import com.viam.sdk.core.util.Utils;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class PowerSensorRPCClient extends PowerSensor {
    private final PowerSensorServiceGrpc.PowerSensorServiceBlockingStub client;

    public PowerSensorRPCClient(final String name, final Channel chan) {
        super(name);
        final PowerSensorServiceGrpc.PowerSensorServiceBlockingStub client = PowerSensorServiceGrpc.newBlockingStub(chan);
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
    public Entry<Double, Boolean> getVoltage(Optional<Struct> extra) {
        Powersensor.GetVoltageRequest.Builder builder = com.viam.component.powersensor.v1.Powersensor.GetVoltageRequest.newBuilder().setName(this.getName().getName());
        extra.ifPresent(builder::setExtra);
        Powersensor.GetVoltageResponse response = client.getVoltage(builder.build());
        return Map.entry(response.getVolts(), response.getIsAc());
    }

    @Override
    public Map.Entry<Double, Boolean> getCurrent(Optional<Struct> extra) {
        Powersensor.GetCurrentRequest.Builder builder = com.viam.component.powersensor.v1.Powersensor.GetCurrentRequest.newBuilder().setName(this.getName().getName());
        extra.ifPresent(builder::setExtra);
        Powersensor.GetCurrentResponse response = client.getCurrent(builder.build());
        return Map.entry(response.getAmperes(), response.getIsAc());
    }

    @Override
    public double getPower(Optional<Struct> extra) {
        Powersensor.GetPowerRequest.Builder builder = com.viam.component.powersensor.v1.Powersensor.GetPowerRequest.newBuilder().setName(this.getName().getName());
        extra.ifPresent(builder::setExtra);
        return client.getPower(builder.build()).getWatts();
    }

    @Override
    public Map<String, Object> getReadings(Optional<Struct> extra) {
        Common.GetReadingsRequest.Builder builder = Common.GetReadingsRequest.newBuilder().setName(this.getName().getName());
        extra.ifPresent(builder::setExtra);
        return Utils.sensorReadingsValueToNative(client.getReadings(builder.build()).getReadingsMap());

    }
}
