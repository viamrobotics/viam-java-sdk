package com.viam.sdk.core.service;

import com.viam.common.v1.Common;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;

public abstract class Service extends Resource {

  public Service(Subtype subtype, Common.ResourceName name) {
    super(subtype, name);
  }
}
