package com.viam.sdk.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

import viam.app.v1.Robot;

/**
 * The global registry of robotic parts.
 * **NB** The Registry should almost never be used directly
 * The Registry keeps track of the types of Resources that are available on robots using this SDK. All the base resource types are
 * pre-registered (e.g. Arm, Motor).
 * If you create a new resource type that is not an extension of any of the existing base resource types, then you must register said
 * resource using Registry.register(...)
 */
public class Registry {
    private static final Map<Subtype, ResourceRegistration<?>> subtypes = new HashMap<>();
    private static final Map<String, ResourceCreatorRegistration> resources = new HashMap<>();

    /**
     * Register a Subtype with the Registry
     *
     * @param registration Object containing registration data for the subtype
     * @param <ResourceT> The resource type
     * @throws DuplicateResourceSubtypeException Thrown if the Subtype to register is already in the registry
     */
    public static synchronized <ResourceT extends Resource> void registerSubtype(ResourceRegistration<ResourceT> registration) throws DuplicateResourceSubtypeException {
        if (subtypes.containsKey(registration.getSubtype())) {
            throw new DuplicateResourceSubtypeException(registration.getSubtype());
        }

        subtypes.put(registration.getSubtype(), registration);
    }

    /**
     * Register a specific Model and validator function for the specific resource Subtype with the Registry
     * @param subtype The Subtype of the resource
     * @param model The Model of the resource
     * @param registration The registration functions of the model
     * @throws DuplicateModelException Thrown if the Subtype and Model pairing is already registered
     */
    public static synchronized void registerResourceCreator(final Subtype subtype, final Model model, final ResourceCreatorRegistration registration) throws DuplicateModelException {
        final String key = String.format("%s/%s", subtype, model);
        if (resources.containsKey(key)) {
            throw new DuplicateModelException(key);
        }

        resources.put(key, registration);
    }

    /**
     * Lookup and retrieve a registered Subtype by its name
     *
     * @param subtype The subtype of the resource
     * @return The registration object of the resource
     */
    public static synchronized ResourceRegistration<?> lookupSubtype(final Subtype subtype) {
        if (!subtypes.containsKey(subtype)) {
            throw new ResourceSubtypeNotFoundException(subtype);
        }
        return subtypes.get(subtype);
    }

    public static synchronized ResourceCreator lookupResourceCreator(final Subtype subtype, final Model model) {
        final String key = String.format("%s/%s", subtype, model);
        if (!resources.containsKey(key)) {
            throw new ModelNotFoundException(subtype, model);
        }
        return resources.get(key).getCreator();
    }

    /**
     * Lookup and retrieve a registered validator function by its subtype and model. If there is none, return None
     *
     * @param subtype The Subtype of the resource
     * @param model The Model of the resource
     * @return The function to validate the resource
     */
    static synchronized Optional<Function<Robot.ComponentConfig, Set<String>>> lookupValidator(final Subtype subtype, final Model model) {
        final String key = String.format("%s/%s", subtype, model);
        if (!resources.containsKey(key)) {
            return Optional.empty();
        }
        return Optional.of(resources.get(key).getValidateConfig());
    }

    /**
     * The dictionary of all registered resources
     * - Key: Subtype of the resource
     * - Value: The registration object for the resource
     *
     * @return All registered resources
     */
    public static synchronized Map<Subtype, ResourceRegistration<?>> registeredSubtypes() {
        return new HashMap<>(subtypes);
    }

    /**
     * The dictionary of all registered resources
     * - Key: subtype/model
     * - Value: The ResourceCreatorRegistration for the resource
     *
     * @return All registered resources
     */
    public static synchronized Map<String, ResourceCreatorRegistration> registeredResourceCreators() {
        return new HashMap<>(resources);
    }
}
