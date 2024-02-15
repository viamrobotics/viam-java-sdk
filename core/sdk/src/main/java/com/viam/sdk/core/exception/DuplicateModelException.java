package com.viam.sdk.core.exception;

import com.viam.sdk.core.resource.Model;
import com.viam.sdk.core.resource.Subtype;

public class DuplicateModelException extends RuntimeException {

  public DuplicateModelException(final Subtype subtype, final Model model) {
    super(String.format(
        "Cannot add model with duplicate name \"%s/%s\" to the registry",
        subtype,
        model));
  }
}
