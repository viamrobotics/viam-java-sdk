package com.viam.sdk.core.service.sensors;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.ResourceName;
import com.viam.sdk.core.rpc.Channel;
import com.viam.service.sensors.v1.Sensors.GetReadingsRequest;
import com.viam.service.sensors.v1.Sensors.GetSensorsRequest;
import com.viam.service.sensors.v1.Sensors.Readings;
import com.viam.service.sensors.v1.SensorsServiceGrpc;
import com.viam.service.sensors.v1.SensorsServiceGrpc.SensorsServiceBlockingStub;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Deprecated
public class SensorsRPCClient extends Sensors {

  private final SensorsServiceBlockingStub client;

  public SensorsRPCClient(final String name, final Channel chan) {
    super(name);
    final SensorsServiceGrpc.SensorsServiceBlockingStub client = SensorsServiceGrpc.newBlockingStub(
        chan);
    if (chan.getCallCredentials().isPresent()) {
      this.client = client.withCallCredentials(chan.getCallCredentials().get());
    } else {
      this.client = client;
    }
  }

  @Deprecated
  public List<ResourceName> getSensors(Optional<Struct> extra) {
    final GetSensorsRequest.Builder builder = GetSensorsRequest.newBuilder().build().newBuilder()
        .setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getSensors(builder.build()).getSensorNamesList();
  }

  @Deprecated
  public List<Readings> getReadings(final List<ResourceName> sensors,
      final Optional<Struct> extra) {
    final GetReadingsRequest.Builder builder = GetReadingsRequest.newBuilder()
        .setName(getName().getName()).addAllSensorNames(sensors);
    extra.ifPresent(builder::setExtra);
    return client.getReadings(builder.build()).getReadingsList();
  }

  @Deprecated
  public Struct doCommand(final Map<String, Value> command) {
    return client.doCommand(Common.DoCommandRequest.newBuilder().
        setName(getName().getName()).
        setCommand(Struct.newBuilder().putAllFields(command).build()).
        build()).getResult();
  }
}
