package com.viam.sdk.core;

import com.viam.common.v1.Common;

public class DuplicateResourceException extends RuntimeException {
    public DuplicateResourceException(Common.ResourceName name) {
        super(String.format("Cannot add resource with duplicate name \"%s\" to the manager", name));
    }
}
