package com.viam.sdk.core.component.sensor;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.GetReadingsResponse;
import com.viam.common.v1.Common.ResourceName;
import com.viam.sdk.core.component.Component;
import com.viam.sdk.core.component.generic.Generic;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;

import java.util.Map;
import java.util.Optional;

/**
 * Sensor represents a physical sensing device that can provide measurement readings
 */
public abstract class Sensor extends Component {

  public static final Subtype SUBTYPE = new Subtype(
      Subtype.NAMESPACE_RDK,
      Subtype.RESOURCE_TYPE_COMPONENT,
      "sensor");

  public Sensor(final String name) {
    super(SUBTYPE, named(name));
  }

  public Sensor(Subtype subtype, ResourceName name) {
    super(subtype, name);
    throw new UnsupportedOperationException();
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
  public static Sensor fromRobot(final RobotClient robot, final String name) {
    return robot.getResource(Sensor.class, named(name));
  }

  public abstract GetReadingsResponse getReadings(final Optional<Struct> extra);
}
