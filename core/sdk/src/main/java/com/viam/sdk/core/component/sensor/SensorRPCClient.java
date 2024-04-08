package com.viam.sdk.core.component.sensor;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.GetReadingsRequest;
import com.viam.common.v1.Common.GetReadingsResponse;
import com.viam.component.sensor.v1.SensorServiceGrpc;

import com.viam.sdk.core.rpc.Channel;

import java.util.Map;
import java.util.Optional;

public class SensorRPCClient extends Sensor {
    private final SensorServiceGrpc.SensorServiceBlockingStub client;

    public SensorRPCClient(final String name, final Channel chan) {
        super(name);
        final SensorServiceGrpc.SensorServiceBlockingStub client = SensorServiceGrpc.newBlockingStub(chan);
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
    public GetReadingsResponse getReadings(final Optional<Struct> extra) {
        final GetReadingsRequest.Builder builder = GetReadingsRequest.newBuilder().
                setName(getName().getName());
        extra.ifPresent(builder::setExtra);
        return client.getReadings(builder.build());
    }
}
