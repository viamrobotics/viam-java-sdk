package com.viam.sdk.core;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;

import java.util.List;
import java.util.Map;

public abstract class Component extends Resource {
    public Component(Subtype subtype, Common.ResourceName name) {
        super(subtype, name);
    }

    public List<Common.Geometry> getGeometries() {
        throw new MethodNotImplementedException("get_geometries");
    }
}
