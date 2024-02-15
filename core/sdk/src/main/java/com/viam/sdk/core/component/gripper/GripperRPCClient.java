package com.viam.sdk.core.component.gripper;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.GetGeometriesRequest;
import com.viam.component.gripper.v1.Gripper.GrabRequest;
import com.viam.component.gripper.v1.Gripper.IsMovingRequest;
import com.viam.component.gripper.v1.Gripper.OpenRequest;
import com.viam.component.gripper.v1.Gripper.StopRequest;
import com.viam.component.gripper.v1.GripperServiceGrpc;
import com.viam.sdk.core.rpc.Channel;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class GripperRPCClient extends Gripper {

  private final GripperServiceGrpc.GripperServiceBlockingStub client;

  public GripperRPCClient(final String name, final Channel chan) {
    super(name);
    final GripperServiceGrpc.GripperServiceBlockingStub client = GripperServiceGrpc.newBlockingStub(
        chan);
    if (chan.getCallCredentials().isPresent()) {
      this.client = client.withCallCredentials(chan.getCallCredentials().get());
    } else {
      this.client = client;
    }
  }

  @Override
  public void open(Optional<Struct> extra) {
    final OpenRequest.Builder builder = OpenRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    client.open(builder.build());
  }

  @Override
  public boolean grab(Optional<Struct> extra) {
    final GrabRequest.Builder builder = GrabRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.grab(builder.build()).getSuccess();
  }

  @Override
  public void stop(Optional<Struct> extra) {
    final StopRequest.Builder builder = StopRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    client.stop(builder.build());
  }

  @Override
  public boolean isMoving() {
    return client.isMoving(IsMovingRequest.newBuilder().setName(getName().getName()).build())
        .getIsMoving();
  }

  @Override
  public Struct doCommand(final Map<String, Value> command) {
    return client.doCommand(Common.DoCommandRequest.newBuilder().
        setName(getName().getName()).
        setCommand(Struct.newBuilder().putAllFields(command).build()).
        build()).getResult();
  }

  @Override
  public List<Common.Geometry> getGeometries(Optional<Struct> extra) {
    final GetGeometriesRequest.Builder builder = Common.GetGeometriesRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getGeometries(builder.build()).getGeometriesList();
  }
}
