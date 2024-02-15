package com.viam.sdk.core.exception;

import com.viam.sdk.core.resource.Subtype;

public class DuplicateResourceSubtypeException extends RuntimeException {

  public DuplicateResourceSubtypeException(Subtype subtype) {
    super(String.format("Cannot add resource subtype \"%s\" more than once to the registry",
        subtype.toString()));
  }
}
