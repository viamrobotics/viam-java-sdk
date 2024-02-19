package com.viam.sdk.core.service.datamanager;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.sdk.core.rpc.Channel;
import com.viam.service.datamanager.v1.DataManager.SyncRequest;
import com.viam.service.datamanager.v1.DataManagerServiceGrpc;
import com.viam.service.datamanager.v1.DataManagerServiceGrpc.DataManagerServiceBlockingStub;
import java.util.Map;
import java.util.Optional;

public class DataManagerRPCClient extends DataManager {

  private final DataManagerServiceBlockingStub client;

  public DataManagerRPCClient(final String name, final Channel chan) {
    super(name);
    final DataManagerServiceBlockingStub client = DataManagerServiceGrpc.newBlockingStub(
        chan);
    if (chan.getCallCredentials().isPresent()) {
      this.client = client.withCallCredentials(chan.getCallCredentials().get());
    } else {
      this.client = client;
    }
  }

  public void sync(final Optional<Struct> extra) {
    final SyncRequest.Builder builder = SyncRequest.newBuilder().setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    //noinspection ResultOfMethodCallIgnored
    client.sync(builder.build());
  }

  public Struct doCommand(final Map<String, Value> command) {
    return client.doCommand(Common.DoCommandRequest.newBuilder().
        setName(getName().getName()).
        setCommand(Struct.newBuilder().putAllFields(command).build()).
        build()).getResult();
  }
}
