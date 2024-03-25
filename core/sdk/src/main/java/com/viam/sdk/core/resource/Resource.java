package com.viam.sdk.core.resource;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.robot.v1.Robot.Status;
import com.viam.sdk.core.exception.MethodNotImplementedException;
import java.util.Map;
import java.util.Optional;
import viam.app.v1.Robot.ComponentConfig;

/**
 * The base requirements for a Resource
 */
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

  /**
   * Get the ResourceName of the Resource
   * @return Resource's ResourceName
   */
  public Common.ResourceName getName() {
    return name;
  }

  /**
   * Send/Receive arbitrary commands to the Resource
   *
   * @param command the command to execute
   * @return        result of the executed command
   */
  public Struct doCommand(Map<String, Value> command) {
    throw new MethodNotImplementedException("do_command");
  }

  /**
   * Create a generic Status for the Resource
   * @return a Status
   */
  public Status createStatus() {
    return Status.newBuilder()
        .setName(getName())
        .setStatus(Struct.newBuilder().build())
        .build();
  }

  /**
   * Safely shutdown the Resource and prevent further use.
   * This function must be idempotent.
   */
  public void close() {

  }

  /**
   * Defines the requirements for a Resource to be Stoppable.
   * All Resources that physically move should be Stoppable.
   */
  public interface Stoppable {

    /**
     * Stop the Resource.
     * This function must be idempotent.
     *
     * @param extra optional parameters that may be needed to safely stop the Resource
     */
    void stop(final Optional<Struct> extra);
  }

  /**
   * Defines the requirements for a Resource to be Reconfigurable.
   */
  public interface Reconfigurable {

    /**
     * Reconfigure a Resource
     * @param config       new configuration for the Resource
     * @param dependencies any other Resources that this Resource depends on
     */
    void reconfigure(final ComponentConfig config,
        final Map<Common.ResourceName, Resource> dependencies);
  }
}
