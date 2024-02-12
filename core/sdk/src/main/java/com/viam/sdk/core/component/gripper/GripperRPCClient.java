package com.viam.sdk.core.component.gripper;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.component.gripper.v1.Gripper.GrabRequest;
import com.viam.component.gripper.v1.Gripper.IsMovingRequest;
import com.viam.component.gripper.v1.Gripper.OpenRequest;
import com.viam.component.gripper.v1.Gripper.StopRequest;
import com.viam.component.gripper.v1.GripperServiceGrpc;
import com.viam.sdk.core.Channel;

import java.util.List;
import java.util.Map;

public class GripperRPCClient extends Gripper {

    private final GripperServiceGrpc.GripperServiceBlockingStub client;

    public GripperRPCClient(final String name, final Channel chan) {
        super(name);
        final GripperServiceGrpc.GripperServiceBlockingStub client = GripperServiceGrpc.newBlockingStub(chan);
        if (chan.getCallCredentials().isPresent()) {
            this.client = client.withCallCredentials(chan.getCallCredentials().get());
        } else {
            this.client = client;
        }
    }

    @Override
    public void open() {
        client.open(OpenRequest.newBuilder().setName(getName().getName()).build());
    }

    @Override
    public boolean grab() {
        return client.grab(GrabRequest.newBuilder().setName(getName().getName()).build()).getSuccess();
    }

    @Override
    public void stop() {
        client.stop(StopRequest.newBuilder().setName(getName().getName()).build());
    }

    @Override
    public boolean isMoving() {
        return client.isMoving(IsMovingRequest.newBuilder().setName(getName().getName()).build()).getIsMoving();
    }

    @Override
    public Struct doCommand(final Map<String, Value> command) {
        return client.doCommand(Common.DoCommandRequest.newBuilder().
                setName(getName().getName()).
                setCommand(Struct.newBuilder().putAllFields(command).build()).
                build()).getResult();
    }

    @Override
    public List<Common.Geometry> getGeometries() {
        return client.getGeometries(Common.GetGeometriesRequest.newBuilder().
                setName(getName().getName()).
                build()).getGeometriesList();
    }
}
