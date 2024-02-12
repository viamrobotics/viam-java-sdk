package com.viam.sdk.core;

public class DuplicateResourceSubtypeException extends RuntimeException {
    public DuplicateResourceSubtypeException(Subtype subtype) {
        super(String.format("Cannot add resource subtype \"%s\" more than once to the registry", subtype.toString()));
    }
}
