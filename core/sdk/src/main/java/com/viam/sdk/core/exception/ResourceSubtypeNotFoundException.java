package com.viam.sdk.core.exception;

import com.viam.sdk.core.resource.Subtype;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

public class ResourceSubtypeNotFoundException extends StatusRuntimeException {

  public ResourceSubtypeNotFoundException(final Subtype subtype) {
    super(Status.NOT_FOUND.withDescription(
        String.format(
            "No %s with subtype \"%s\" found in the registry; did you forget to call Registry.registerSubtype?",
            subtype.getResourceType(),
            subtype.getResourceSubtype())));
  }
}
