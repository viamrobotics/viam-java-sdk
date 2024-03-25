package com.viam.sdk.core.component.generic;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.GetGeometriesRequest;
import com.viam.component.generic.v1.GenericServiceGrpc;
import com.viam.sdk.core.rpc.Channel;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * gRPC client for the Generic component
 */
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
  public List<Common.Geometry> getGeometries(Optional<Struct> extra) {
    final GetGeometriesRequest.Builder builder = Common.GetGeometriesRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getGeometries(builder.build()).getGeometriesList();
  }
}
