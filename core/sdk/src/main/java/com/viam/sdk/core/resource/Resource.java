package com.viam.sdk.core.resource;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.robot.v1.Robot.Status;
import com.viam.sdk.core.exception.MethodNotImplementedException;
import java.util.Map;
import java.util.Optional;
import viam.app.v1.Robot.ComponentConfig;

public abstract class Resource {

  private final Subtype subtype;
  private final Common.ResourceName name;

  public Resource(final Subtype subtype, final Common.ResourceName name) {
    this.subtype = subtype;
    this.name = name;
  }

  protected static Common.ResourceName named(final Subtype subtype, final String name) {
    return Common.ResourceName.newBuilder().
        setNamespace(subtype.getNamespace()).
        setType(subtype.getResourceType()).
        setSubtype(subtype.getResourceSubtype()).
        setName(name).
        build();
  }

  public Subtype getSubtype() {
    return subtype;
  }

  public Common.ResourceName getName() {
    return name;
  }

  public Struct doCommand(Map<String, Value> command) {
    throw new MethodNotImplementedException("do_command");
  }

  public Status createStatus() {
    return Status.newBuilder()
        .setName(getName())
        .setStatus(Struct.newBuilder().build())
        .build();
  }

  public void close() {

  }

  public interface Stoppable {

    void stop(final Optional<Struct> extra);
  }

  public interface Reconfigurable {

    void reconfigure(final ComponentConfig config,
        final Map<Common.ResourceName, Resource> dependencies);
  }
}
