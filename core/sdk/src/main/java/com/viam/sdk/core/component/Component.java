package com.viam.sdk.core.component;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.sdk.core.exception.MethodNotImplementedException;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import java.util.List;
import java.util.Optional;

public abstract class Component extends Resource {

  public Component(Subtype subtype, Common.ResourceName name) {
    super(subtype, name);
  }

  public List<Common.Geometry> getGeometries(Optional<Struct> extra) {
    throw new MethodNotImplementedException("get_geometries");
  }
}
