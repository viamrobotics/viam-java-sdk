package com.viam.sdk.core.exception;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;

public class ResourceNotFoundException extends StatusRuntimeException {

  public ResourceNotFoundException(String subtype, String name) {
    super(Status.NOT_FOUND.withDescription(
        String.format("No %s with name \"%s\" found in the manager", subtype, name)));
  }
}
