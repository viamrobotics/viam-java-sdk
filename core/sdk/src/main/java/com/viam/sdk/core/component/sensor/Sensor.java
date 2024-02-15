package com.viam.sdk.core.component.sensor;

import com.viam.common.v1.Common;
import com.viam.common.v1.Common.ResourceName;
import com.viam.sdk.core.component.Component;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;

public class Sensor extends Component {

  public static final Subtype SUBTYPE = new Subtype(
      Subtype.NAMESPACE_RDK,
      Subtype.RESOURCE_TYPE_COMPONENT,
      "sensor");

  public Sensor(Subtype subtype, ResourceName name) {
    super(subtype, name);
    throw new UnsupportedOperationException();
  }

  public static Common.ResourceName named(final String name) {
    return Resource.named(SUBTYPE, name);
  }
}
