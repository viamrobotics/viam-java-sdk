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
import com.viam.sdk.core.component.generic.Generic;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;
import java.util.Map;
import java.util.Optional;

/**
 * MovementSensor reports information about the robot's direction, position, and speed
 */
public abstract class MovementSensor extends Component {

  public static final Subtype SUBTYPE = new Subtype(
      Subtype.NAMESPACE_RDK,
      Subtype.RESOURCE_TYPE_COMPONENT,
      "movement_sensor");

  public MovementSensor(final String name) {
    super(SUBTYPE, named(name));
  }

  /**
   * Get the ResourceName of the component
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
  public static MovementSensor fromRobot(final RobotClient robot, final String name) {
    return robot.getResource(MovementSensor.class, named(name));
  }

  /**
   * Get the current linear velocity as a Vector3 with x, y, and z axes represented in m/sec
   * @return the Vector3 representation of the linear velocity in m/sec
   */
  public abstract Vector3 getLinearVelocity(final Optional<Struct> extra);

  /**
   * Get the current angular velocity as a Vector3 with x, y, and z axes represented in degrees/sec
   * @return The Vector3 representation of the angular velocity in degrees/sec
   */
  public abstract Vector3 getAngularVelocity(final Optional<Struct> extra);

  /**
   * Get the current compass heading in degrees
   * @return the compass heading in degrees
   */
  public abstract double getCompassHeading(final Optional<Struct> extra);

  /**
   * Get the current orientation
   * @return the orientation
   */
  public abstract Orientation getOrientation(final Optional<Struct> extra);

  /**
   * Get the current GeoPoint (latitude, longitude) and altitude (m)
   * @return the Position response
   */
  public abstract GetPositionResponse getPosition(final Optional<Struct> extra);

  /**
   * Get the supported properties of this sensor
   * @return the Properties response
   */
  public abstract GetPropertiesResponse getProperties(final Optional<Struct> extra);

  /**
   * Get the accuracy of the various sensors
   * @return the accuracies of the sensor
   */
  public abstract GetAccuracyResponse getAccuracy(final Optional<Struct> extra);

  /**
   * Get the current linear acceleration as a Vector3 with x, y, and z axes represented in m/sec^2
   *
   * @return the Vector3 representation of the linear acceleration in m/sec^2
   */
  public abstract Vector3 getLinearAcceleration(final Optional<Struct> extra);

  /**
   * Obtain the measurements/data specific to this sensor.
   * If a sensor is not configured to have a measurement or fails to read a piece of data, it will not appear in the readings dictionary.
   * @return the readings for the MovementSensor
   */
  public abstract Map<String, Value> getReadings(final Optional<Struct> extra);
}
