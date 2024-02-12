package com.viam.sdk.core;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;

import java.util.Map;

public abstract class Resource {
    private final Subtype subtype;
    private final Common.ResourceName name;

    public Resource(final Subtype subtype, final Common.ResourceName name) {
        this.subtype = subtype;
        this.name = name;
    }

    public Subtype getSubtype() {
        return subtype;
    }

    public Common.ResourceName getName() {
        return name;
    }

    public Struct doCommand(Map<String, Value> command) {
        throw new MethodNotImplementedException("do_command");
    }

    public void close() {

    }
    protected static Common.ResourceName named(final Subtype subtype, final String name) {
        return Common.ResourceName.newBuilder().
                setNamespace(subtype.getNamespace()).
                setType(subtype.getResourceType()).
                setSubtype(subtype.getResourceSubtype()).
                setName(name).
                build();
    }
}
