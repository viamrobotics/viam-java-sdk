package com.viam.sdk.core.service.datamanager;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common.ResourceName;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;
import com.viam.sdk.core.service.Service;
import java.util.Optional;

public abstract class DataManager extends Service {

  public static final Subtype SUBTYPE = new Subtype(
      Subtype.NAMESPACE_RDK,
      Subtype.RESOURCE_TYPE_SERVICE,
      "data_manager");

  public DataManager(final String name) {
    super(SUBTYPE, named(name));
  }

  public static ResourceName named(final String name) {
    return Resource.named(SUBTYPE, name);
  }

  public static DataManager fromRobot(final RobotClient robot, final String name) {
    return robot.getResource(DataManager.class, named(name));
  }

  public abstract void sync(final Optional<Struct> extra);
}
