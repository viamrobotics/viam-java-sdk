package com.viam.sdk.core.component.movementsensor;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.Orientation;
import com.viam.common.v1.Common.Vector3;
import com.viam.component.movementsensor.v1.Movementsensor.GetAccuracyResponse;
import com.viam.component.movementsensor.v1.Movementsensor.GetPositionResponse;
import com.viam.component.movementsensor.v1.Movementsensor.GetPropertiesResponse;
import com.viam.sdk.core.component.Component;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;
import java.util.Map;
import java.util.Optional;

public abstract class MovementSensor extends Component {

  public static final Subtype SUBTYPE = new Subtype(
      Subtype.NAMESPACE_RDK,
      Subtype.RESOURCE_TYPE_COMPONENT,
      "movement_sensor");

  public MovementSensor(final String name) {
    super(SUBTYPE, named(name));
  }

  public static Common.ResourceName named(final String name) {
    return Resource.named(SUBTYPE, name);
  }

  public static MovementSensor fromRobot(final RobotClient robot, final String name) {
    return robot.getResource(MovementSensor.class, named(name));
  }

  public abstract Vector3 getLinearVelocity(final Optional<Struct> extra);

  public abstract Vector3 getAngularVelocity(final Optional<Struct> extra);

  public abstract double getCompassHeading(final Optional<Struct> extra);

  public abstract Orientation getOrientation(final Optional<Struct> extra);

  public abstract GetPositionResponse getPosition(final Optional<Struct> extra);

  public abstract GetPropertiesResponse getProperties(final Optional<Struct> extra);

  public abstract GetAccuracyResponse getAccuracy(final Optional<Struct> extra);

  public abstract Vector3 getLinearAcceleration(final Optional<Struct> extra);

  public abstract Map<String, Value> getReadings(final Optional<Struct> extra);
}
