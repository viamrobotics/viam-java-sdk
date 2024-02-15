package com.viam.sdk.core.component.generic;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.component.generic.v1.GenericServiceGrpc;
import com.viam.sdk.core.rpc.Channel;
import java.util.List;
import java.util.Map;

public class GenericRPCClient extends Generic {

  private final GenericServiceGrpc.GenericServiceBlockingStub client;

  public GenericRPCClient(final String name, final Channel chan) {
    super(name);
    final GenericServiceGrpc.GenericServiceBlockingStub client =
        GenericServiceGrpc.newBlockingStub(chan);
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
  public List<Common.Geometry> getGeometries() {
    return client.getGeometries(Common.GetGeometriesRequest.newBuilder().
        setName(getName().getName()).
        build()).getGeometriesList();
  }
}
