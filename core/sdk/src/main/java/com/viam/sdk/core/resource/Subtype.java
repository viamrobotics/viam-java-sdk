package com.viam.sdk.core.resource;

import com.viam.common.v1.Common;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Represents a known component/service (resource) API
 */
public class Subtype {

  public static final String NAMESPACE_RDK = "rdk";
  public static final String RESOURCE_TYPE_COMPONENT = "component";
  public static final String RESOURCE_TYPE_SERVICE = "service";
  private static final Pattern pattern = Pattern.compile("^([\\w-]+):([\\w-]+):([\\w-]+)$");
  /**
   * The namespace of the resource
   */
  private final String namespace;
  /**
   * The type of the resource, e.g. `component` or `service`
   */
  private final String resourceType;
  /**
   * The subtype of the resource e.g. `servo`, `arm`, `vision`
   */
  private final String resourceSubtype;

  public Subtype(final String namespace, final String resourceType, final String resourceSubtype) {
    this.namespace = namespace;
    this.resourceType = resourceType;
    this.resourceSubtype = resourceSubtype;
  }

  /**
   * Create a Subtype from its string representation (namespace:resource_type:resource_subtype)
   *
   * @param string The Subtype as a string
   */
  public Subtype(final String string) {
    final Matcher matcher = pattern.matcher(string);
    if (!matcher.matches()) {
      throw new IllegalArgumentException(String.format("%s is not a valid Subtype", string));
    }
    this.namespace = matcher.group(1);
    this.resourceType = matcher.group(2);
    this.resourceSubtype = matcher.group(3);
  }

  /**
   * Convert a ResourceName into a Subtype
   *
   * @param resourceName The ResourceName to convert
   * @return A new Subtype
   */
  public static Subtype fromResourceName(final Common.ResourceName resourceName) {
    return new Subtype(resourceName.getNamespace(), resourceName.getType(),
        resourceName.getSubtype());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subtype subtype = (Subtype) o;
    return Objects.equals(namespace, subtype.namespace) && Objects.equals(resourceType,
        subtype.resourceType) && Objects.equals(resourceSubtype, subtype.resourceSubtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, resourceType, resourceSubtype);
  }

  public String getNamespace() {
    return namespace;
  }

  public String getResourceType() {
    return resourceType;
  }

  public String getResourceSubtype() {
    return resourceSubtype;
  }

  @Override
  public String toString() {
    return String.format("%s:%s:%s", namespace, resourceType, resourceSubtype);
  }
}
