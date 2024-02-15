package com.viam.sdk.core.resource;

import com.viam.common.v1.Common;
import com.viam.common.v1.Common.ResourceName;
import com.viam.sdk.core.exception.DuplicateResourceException;
import com.viam.sdk.core.exception.ResourceNotFoundException;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Manager containing all resources registered to this server.
 */
public class ResourceManager implements Closeable {

  private static final Logger LOGGER = Logger.getLogger(ResourceManager.class.getName());

  protected final Map<Common.ResourceName, Resource> resources;
  final Map<String, List<Common.ResourceName>> shortToLongName = new HashMap<>();

  public ResourceManager(final List<Resource> resources) {
    this.resources = new HashMap<>();
    for (Resource resource : resources) {
      add(resource);
    }
  }

  /**
   * Adds a new resource with the manager. Resources may not have the same name. If a resource is
   * remote and the short name is unique, save a short name version.
   *
   * @param resource The resource to add
   */
  public synchronized void add(final Resource resource) throws DuplicateResourceException {
    Registry.lookupSubtype(resource.getSubtype());

    final Common.ResourceName name = resource.getName();
    if (resources.containsKey(name)) {
      throw new DuplicateResourceException(name);
    }

    final String shortName;
    if (name.getName().contains(":")) {
      final String[] parts = name.getName().split("-");
      shortName = parts[parts.length - 1];
    } else {
      shortName = name.getName();
    }

    if (shortToLongName.containsKey(shortName) && !shortToLongName.get(shortName).contains(name)) {
      shortToLongName.get(shortName).add(name);
    } else if (!shortToLongName.containsKey(shortName)) {
      shortToLongName.put(shortName, new ArrayList<>());
    }

    resources.put(name, resource);
  }


  /**
   * Return a resource from the manager. If a unique short name version is given, return a remote
   * resource with the name.
   *
   * @param name        The name of the resource
   * @param <ResourceT> The type of the resource
   * @return The resource
   */
  public synchronized <ResourceT> ResourceT getResource(Class<ResourceT> resourceClass,
      Common.ResourceName name) {
    if (resources.containsKey(name)) {
      final Resource resourceRaw = resources.get(name);
      if (resourceClass.isAssignableFrom(resourceRaw.getClass())) {
        return resourceClass.cast(resourceRaw);
      }
    }
    if (shortToLongName.containsKey(name.getName())
        && shortToLongName.get(name.getName()).size() == 1) {
      return getResource(resourceClass, shortToLongName.get(name.getName()).get(0));
    }
    throw new ResourceNotFoundException(name.getSubtype(), name.getName());
  }

  /**
   * Remove the resource with the specified ResourceName.
   *
   * @param name The ResourceName of the resource
   */
  public synchronized void removeResource(final Common.ResourceName name) {
    if (!resources.containsKey(name)) {
      return;
    }
    try {
      final Resource resource = resources.get(name);
      resource.close();
    } finally {
      resources.remove(name);
    }
  }

  public synchronized boolean isManaging(Common.ResourceName name) {
    return resources.containsKey(name);
  }

  public synchronized Set<ResourceName> resourceNames() {
    return new HashSet<>(resources.keySet());
  }

  /**
   * Close the resource manager by removing all resources. Please note that any errors will not
   * throw an exception. Errors will still be logged.
   */
  @Override
  public synchronized void close() {
    for (Common.ResourceName name : resources.keySet()) {
      try {
        removeResource(name);
      } catch (final Throwable t) {
        LOGGER.severe(String.format("Error while closing %s: %s", name, t));
      }
    }
  }
}
