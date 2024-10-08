package com.viam.sdk.core.component.posetracker;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.component.v1.PoseTracker.GetPosesRequest;
import com.viam.component.v1.PoseTrackerServiceGrpc;
import com.viam.sdk.core.rpc.Channel;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PoseTrackerRPCClient extends PoseTracker {
    private final PoseTrackerServiceGrpc.PoseTrackerServiceBlockingStub client;

    public PoseTrackerRPCClient(final String name, final Channel chan) {
        super(name);
        final PoseTrackerServiceGrpc.PoseTrackerServiceBlockingStub client = PoseTrackerServiceGrpc.newBlockingStub(chan);
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
    public Map<String, Common.PoseInFrame> getPoses(List<String> bodyNames, Struct extra) {
        final GetPosesRequest request = GetPosesRequest.newBuilder().setName(getName().getName()).setExtra(extra).addAllBodyNames(bodyNames).build();
        return client.getPoses(request).getBodyPosesMap();
    }

    @Override
    public List<Common.Geometry> getGeometries(Optional<Struct> extra) {
        final Common.GetGeometriesRequest.Builder builder = Common.GetGeometriesRequest.newBuilder().
                setName(getName().getName());
        extra.ifPresent(builder::setExtra);
        return client.getGeometries(builder.build()).getGeometriesList();
    }
}
