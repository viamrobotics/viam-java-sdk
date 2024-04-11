package com.viam.sdk.core.component.camera;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.ResponseMetadata;
import com.viam.component.camera.v1.Camera.Format;
import com.viam.component.camera.v1.Camera.Image;
import com.viam.sdk.core.component.Component;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.Collections;
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

  public abstract Image getImage(final Format format,
      final Optional<Struct> extra);

  public Entry<List<Image>, Common.ResponseMetadata> getImages() {
    return new SimpleEntry<>(
        Collections.singletonList(getImage(Format.FORMAT_UNSPECIFIED, Optional.empty())),
        ResponseMetadata.newBuilder().build());
  }

  static Format mimeToFormat(final String mimeType) {
    switch (mimeType) {
      case "image/jpeg":
        return Format.FORMAT_JPEG;
      case "image/png":
        return Format.FORMAT_PNG;
      case "image/vnd.viam.rgba":
        return Format.FORMAT_RAW_RGBA;
      case "image/vnd.viam.dep":
        return Format.FORMAT_RAW_DEPTH;
      default:
        return Format.FORMAT_UNSPECIFIED;
    }
  }

  static String formatToMime(final Format format) {
    switch (format) {
      case FORMAT_JPEG:
        return "image/jpeg";
      case FORMAT_PNG:
        return "image/png";
      case FORMAT_RAW_RGBA:
        return "image/vnd.viam.rgba";
      case FORMAT_RAW_DEPTH:
        return "image/vnd.viam.dep";
      default:
        return "unknown";
    }
  }
}
