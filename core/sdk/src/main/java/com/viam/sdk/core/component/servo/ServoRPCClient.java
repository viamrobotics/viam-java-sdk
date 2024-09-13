package com.viam.sdk.core.component.servo;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.component.servo.v1.ServoServiceGrpc;

import com.viam.sdk.core.rpc.Channel;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ServoRPCClient extends Servo{
    private final ServoServiceGrpc.ServoServiceBlockingStub client;

    public ServoRPCClient(final String name, final Channel chan) {
        super(name);
        final ServoServiceGrpc.ServoServiceBlockingStub client = ServoServiceGrpc.newBlockingStub(chan);
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
    public void move(int angle, Struct extra) {
        com.viam.component.servo.v1.Servo.MoveRequest moveRequest = com.viam.component.servo.v1.Servo.MoveRequest.newBuilder().setName(this.getName().getName()).setAngleDeg(angle).setExtra(extra).build();
        client.move(moveRequest);
    }

    @Override
    public int getPosition(Struct extra) {
        com.viam.component.servo.v1.Servo.GetPositionRequest getPositionRequest = com.viam.component.servo.v1.Servo.GetPositionRequest.newBuilder().setName(this.getName().getName()).setExtra(extra).build();
        return client.getPosition(getPositionRequest).getPositionDeg();
    }


    @Override
    public void stop(Struct extra) {
        com.viam.component.servo.v1.Servo.StopRequest stopRequest = com.viam.component.servo.v1.Servo.StopRequest.newBuilder().setName(this.getName().getName()).setExtra(extra).build();
        client.stop(stopRequest);
    }

    @Override
    public boolean isMoving() {
        com.viam.component.servo.v1.Servo.IsMovingRequest isMovingRequest = com.viam.component.servo.v1.Servo.IsMovingRequest.newBuilder().setName(this.getName().getName()).build();
        return client.isMoving(isMovingRequest).getIsMoving();
    }

    @Override
    public List<Common.Geometry> getGeometries(Optional<Struct> extra){
        Common.GetGeometriesRequest.Builder builder = Common.GetGeometriesRequest.newBuilder().setName(this.getName().getName());
        extra.ifPresent(builder::setExtra);
        return client.getGeometries(builder.build()).getGeometriesList();

    }
}

