package com.viam.sdk.core;

import java.util.function.BiFunction;
import java.util.function.Function;

import io.grpc.ManagedChannel;

/**
 * An object representing a resource to be registered.
*  This object is generic over the ResourceBase, and it includes various functionality for the resource,
*  such as creating its RPC client or status.
*  If creating a custom Resource type, you should register the resource by creating a ResourceRegistration object and registering it
*  to the Registry.
 */
public class ResourceRegistration<ResourceT extends Resource> {
    private final Subtype subtype;
    private final Class<ResourceT> resourceCls;
    private final String protoServiceName;
    private final Function<ResourceManager, ResourceRPCService<ResourceT>> createRPCService;
    private final BiFunction<String, Channel, ResourceT> createRPCClient;

    // TODO(erd): createStatus
    public ResourceRegistration(
            final Subtype subtype,
            final Class<ResourceT> resourceCls,
            final String protoServiceName,
            final Function<ResourceManager, ResourceRPCService<ResourceT>> createRPCService,
            final BiFunction<String, Channel, ResourceT> createRPCClient) {
        this.subtype = subtype;
        this.resourceCls = resourceCls;
        this.protoServiceName = protoServiceName;
        this.createRPCService = createRPCService;
        this.createRPCClient = createRPCClient;
    }

    public Class<ResourceT> getResourceCls() {
        return resourceCls;
    }

    public Function<ResourceManager, ResourceRPCService<ResourceT>> getCreateRPCService() {
        return createRPCService;
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
