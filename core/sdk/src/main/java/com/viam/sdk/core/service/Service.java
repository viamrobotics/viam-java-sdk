package com.viam.sdk.core.service;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.sdk.core.exception.MethodNotImplementedException;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import java.util.Map;

public abstract class Service extends Resource {

  public Service(Subtype subtype, Common.ResourceName name) {
    super(subtype, name);
  }

  public Struct doCommand(Map<String, Value> command) {
    throw new MethodNotImplementedException("do_command");
  }
}
