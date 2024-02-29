package com.viam.sdk.core.resource;

import com.viam.sdk.core.rpc.Channel;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * An object representing a resource to be registered. This object is generic over the ResourceBase,
 * and it includes various functionality for the resource, such as creating its RPC client or
 * status. If creating a custom Resource type, you should register the resource by creating a
 * ResourceRegistration object and registering it to the Registry.
 */
public class ResourceRegistration<ResourceT extends Resource> {

  private final Subtype subtype;
  private final String protoServiceName;
  private final Function<ResourceManager, ResourceRPCService<ResourceT>> createRPCService;
  private final BiFunction<String, Channel, ResourceT> createRPCClient;

  public ResourceRegistration(
      final Subtype subtype,
      final String protoServiceName,
      final Function<ResourceManager, ResourceRPCService<ResourceT>> createRPCService,
      final BiFunction<String, Channel, ResourceT> createRPCClient
  ) {
    this.subtype = subtype;
    this.protoServiceName = protoServiceName;
    this.createRPCService = createRPCService;
    this.createRPCClient = createRPCClient;
  }

  public ResourceRegistration(
      final Subtype subtype,
      final String protoServiceName,
      final BiFunction<String, Channel, ResourceT> createRPCClient
  ) {
    this.subtype = subtype;
    this.protoServiceName = protoServiceName;
    this.createRPCService = null;
    this.createRPCClient = createRPCClient;
  }

  public Optional<Function<ResourceManager, ResourceRPCService<ResourceT>>> getCreateRPCService() {
    return Optional.ofNullable(createRPCService);
  }

  public BiFunction<String, Channel, ResourceT> getCreateRPCClient() {
    return createRPCClient;
  }

  public Subtype getSubtype() {
    return subtype;
  }

  public String getProtoServiceName() {
    return protoServiceName;
  }
}
