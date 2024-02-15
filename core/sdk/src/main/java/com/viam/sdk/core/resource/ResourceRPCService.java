package com.viam.sdk.core.resource;

import com.viam.common.v1.Common;

public interface ResourceRPCService<ResourceT> extends io.grpc.BindableService {

  Class<ResourceT> getResourceClass();

  ResourceManager getManager();

  /**
   * Return the resource with the given name if it exists in the registry. If the resource does not
   * exist in the registry, this function will throw an exception
   *
   * @param name Name of the resource
   * @return The resource
   */
  default ResourceT getResource(final Common.ResourceName name) {
    return getManager().getResource(getResourceClass(), name);
  }
}
