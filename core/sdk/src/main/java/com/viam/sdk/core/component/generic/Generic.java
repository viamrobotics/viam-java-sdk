package com.viam.sdk.core.component.generic;

import com.viam.common.v1.Common;
import com.viam.sdk.core.component.Component;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;

/**
 * Generic component, which represents any type of component that can execute arbitrary commands.
 */
public abstract class Generic extends Component {

  public static final Subtype SUBTYPE = new Subtype(
      Subtype.NAMESPACE_RDK,
      Subtype.RESOURCE_TYPE_COMPONENT,
      "generic");

  public Generic(final String name) {
    super(SUBTYPE, named(name));
  }

  /**
   * Get the ResourceName of the component
   *
   * @param name the name of the component
   * @return     the component's ResourceName
   */
  public static Common.ResourceName named(final String name) {
    return Resource.named(SUBTYPE, name);
  }

  /**
   * Get the component with the provided name from the provided robot.
   * @param robot the RobotClient
   * @param name  the name of the component
   * @return      the component
   */
  public static Generic fromRobot(final RobotClient robot, final String name) {
    return robot.getResource(Generic.class, named(name));
  }
}
