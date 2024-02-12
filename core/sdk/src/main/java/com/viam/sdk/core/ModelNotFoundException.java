package com.viam.sdk.core;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;

public class ModelNotFoundException extends StatusRuntimeException {
    public ModelNotFoundException(final Subtype subtype, final Model model) {
        super(Status.NOT_FOUND.withDescription(String.format("No %s with subtype \"%s\" found in the registry", subtype, model)));
    }
}
