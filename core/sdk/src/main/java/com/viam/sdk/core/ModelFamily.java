package com.viam.sdk.core;

import java.util.Objects;

/**
 * Represents a family of related models
 */
public class ModelFamily {
    /**
     *The namespace of the model family
     */
    private final String namespace;

    /**
     * The family name
     */
    private final String family;

    public ModelFamily(final String namespace, final String family) {
        this.namespace = namespace;
        this.family = family;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModelFamily that = (ModelFamily) o;
        return Objects.equals(namespace, that.namespace) && Objects.equals(family, that.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, family);
    }

    @Override
    public String toString() {
        return String.format("%s:%s", namespace, family);
    }
}
