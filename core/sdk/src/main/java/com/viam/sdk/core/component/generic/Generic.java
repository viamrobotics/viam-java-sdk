package com.viam.sdk.core.component.generic;

import com.viam.common.v1.Common;
import com.viam.sdk.core.component.Component;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;

public abstract class Generic extends Component {

  public static final Subtype SUBTYPE = new Subtype(
      Subtype.NAMESPACE_RDK,
      Subtype.RESOURCE_TYPE_COMPONENT,
      "generic");

  public Generic(final String name) {
    super(SUBTYPE, named(name));
  }

  public static Common.ResourceName named(final String name) {
    return Resource.named(SUBTYPE, name);
  }

  public static Generic fromRobot(final RobotClient robot, final String name) {
    return robot.getResource(Generic.class, named(name));
  }
}
