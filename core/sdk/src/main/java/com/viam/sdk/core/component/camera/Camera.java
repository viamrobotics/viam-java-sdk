package com.viam.sdk.core.component.camera;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.component.camera.v1.Camera.Image;
import com.viam.sdk.core.component.Component;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * MovementSensor reports information about the robot's direction, position, and speed
 */
public abstract class Camera extends Component {

  public static final Subtype SUBTYPE = new Subtype(
      Subtype.NAMESPACE_RDK,
      Subtype.RESOURCE_TYPE_COMPONENT,
      "camera");

  public Camera(final String name) {
    super(SUBTYPE, named(name));
  }

  /**
   * Get the ResourceName of the component
   *
   * @param name the name of the component
   * @return the component's ResourceName
   */
  public static Common.ResourceName named(final String name) {
    return Resource.named(SUBTYPE, name);
  }

  /**
   * Get the component with the provided name from the provided robot.
   *
   * @param robot the RobotClient
   * @param name  the name of the component
   * @return the component
   */
  public static Camera fromRobot(final RobotClient robot, final String name) {
    return robot.getResource(Camera.class, named(name));
  }

  public abstract Entry<List<Image>, Common.ResponseMetadata> getImages(
      final Optional<List<String>> filterSourceNames,
      final Optional<Struct> extra);

  public Entry<List<Image>, Common.ResponseMetadata> getImages() {
    return getImages(Optional.empty(), Optional.empty());
  }

}
