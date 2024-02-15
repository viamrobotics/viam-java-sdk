package com.viam.sdk.core.service.sensors;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.ResourceName;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;
import com.viam.sdk.core.service.Service;
import com.viam.service.sensors.v1.Sensors.Readings;
import java.util.List;
import java.util.Optional;

public abstract class Sensors extends Service {

  public static final Subtype SUBTYPE = new Subtype(
      Subtype.NAMESPACE_RDK,
      Subtype.RESOURCE_TYPE_SERVICE,
      "sensors");

  public Sensors(final String name) {
    super(SUBTYPE, named(name));
  }

  public static Common.ResourceName named(final String name) {
    return Resource.named(SUBTYPE, name);
  }

  public static Sensors fromRobot(final RobotClient robot, final String name) {
    return robot.getResource(Sensors.class, named(name));
  }

  public abstract List<ResourceName> getSensors(final Optional<Struct> extra);

  public abstract List<Readings> getReadings(final List<ResourceName> sensors,
      final Optional<Struct> extra);
}
