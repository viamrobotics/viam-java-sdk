package com.viam.sdk.core.component;

import com.viam.common.v1.Common;
import com.viam.sdk.core.exception.MethodNotImplementedException;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import java.util.List;

public abstract class Component extends Resource {

  public Component(Subtype subtype, Common.ResourceName name) {
    super(subtype, name);
  }

  public List<Common.Geometry> getGeometries() {
    throw new MethodNotImplementedException("get_geometries");
  }
}
