package com.viam.sdk.core.exception;

import com.viam.sdk.core.resource.Model;
import com.viam.sdk.core.resource.Subtype;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

public class ModelNotFoundException extends StatusRuntimeException {

  public ModelNotFoundException(final Subtype subtype, final Model model) {
    super(Status.NOT_FOUND.withDescription(
        String.format("No %s with model \"%s\" found in the registry", subtype, model)));
  }
}
