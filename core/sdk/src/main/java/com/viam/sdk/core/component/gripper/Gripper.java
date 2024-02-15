package com.viam.sdk.core.component.gripper;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.Struct.Builder;
import com.google.protobuf.util.JsonFormat;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.ActuatorStatus;
import com.viam.robot.v1.Robot.Status;
import com.viam.sdk.core.component.Component;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;
import java.util.Optional;

public abstract class Gripper extends Component {

  public static final Subtype SUBTYPE = new Subtype(
      Subtype.NAMESPACE_RDK,
      Subtype.RESOURCE_TYPE_COMPONENT,
      "gripper");

  @Override
  public Status createStatus() {
    ActuatorStatus actuatorStatus = ActuatorStatus.newBuilder()
        .setIsMoving(isMoving()).build();
    final Builder s = Struct.newBuilder();
    try {
      final String json = JsonFormat.printer().print(actuatorStatus);
      JsonFormat.parser().ignoringUnknownFields().merge(json, s);
    } catch (InvalidProtocolBufferException e) {
      throw new RuntimeException(e);
    }
    return Status.newBuilder().setName(getName()).setStatus(s.build()).build();
  }

  public Gripper(final String name) {
    super(SUBTYPE, named(name));
  }

  public static Common.ResourceName named(final String name) {
    return Resource.named(SUBTYPE, name);
  }

  public static Gripper fromRobot(final RobotClient robot, final String name) {
    return robot.getResource(Gripper.class, named(name));
  }

  /**
   * Open the gripper.
   */
  public abstract void open(final Optional<Struct> extra);

  /**
   * Instruct the gripper to grab.
   *
   * @return Indicates if the gripper grabbed something.
   */
  public abstract boolean grab(final Optional<Struct> extra);

  /**
   * Stop the gripper. It is assumed the gripper stops immediately.
   */
  public abstract void stop(final Optional<Struct> extra);

  /**
   * Get if the gripper is currently moving.
   *
   * @return Whether the gripper is moving.
   */
  public abstract boolean isMoving();
}
