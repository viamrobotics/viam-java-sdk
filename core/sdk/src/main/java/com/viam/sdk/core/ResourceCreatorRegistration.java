package com.viam.sdk.core;

import java.util.Set;
import java.util.function.Function;

import viam.app.v1.Robot;

/**
 * An object representing a resource creator to be registered.
 * If creating a custom Resource creator, you should register the creator by creating a ResourceCreatorRegistration object and
 * registering it to the Registry.
 */
public class ResourceCreatorRegistration {
    private final ResourceCreator creator;
    private final Function<Robot.ComponentConfig, Set<String>> validateConfig;

    public ResourceCreatorRegistration(
            final ResourceCreator creator,
            final Function<Robot.ComponentConfig, Set<String>> validateConfig
    ) {
        this.creator = creator;
        this.validateConfig = validateConfig;
    }

    public ResourceCreator getCreator() {
        return creator;
    }

    public Function<Robot.ComponentConfig, Set<String>> getValidateConfig() {
        return validateConfig;
    }
}
