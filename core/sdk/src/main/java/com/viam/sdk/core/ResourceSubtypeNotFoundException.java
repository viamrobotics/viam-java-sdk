package com.viam.sdk.core;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;

public class ResourceSubtypeNotFoundException extends StatusRuntimeException {
    public ResourceSubtypeNotFoundException(final Subtype subtype) {
        super(Status.NOT_FOUND.withDescription(String.format("No %s with subtype \"%s\" found in the registry", subtype.getResourceType(), subtype.getResourceSubtype())));
    }
}
