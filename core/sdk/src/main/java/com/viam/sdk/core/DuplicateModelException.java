package com.viam.sdk.core;

public class DuplicateModelException extends RuntimeException {
    public DuplicateModelException(final String name) {
        super(String.format("Cannot add model with duplicate name \"%s\" to the registry", name));
    }
}
