package com.viam.sdk.core.component;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.sdk.core.exception.MethodNotImplementedException;
import com.viam.sdk.core.resource.Subtype;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ComponentTest {

    private Component component;

    @BeforeEach
    void setup() {
        Subtype subtype = new Subtype("testNamespace", "testType", "testSubtype");
        Common.ResourceName resourceName = Common.ResourceName.newBuilder().
                setNamespace(subtype.getNamespace()).
                setType(subtype.getResourceType()).
                setSubtype(subtype.getResourceSubtype()).
                setName("testComponent").
                build();
        component = new Component(subtype, resourceName) {
            @Override
            public List<Common.Geometry> getGeometries(Optional<Struct> extra) {
                return super.getGeometries(extra);
            }
        };
    }

    @Test
    void getGeometries() {
        Exception exception = assertThrows(MethodNotImplementedException.class, () -> {
            component.getGeometries(Optional.empty());
        });
        assertTrue(exception.getMessage().contains("get_geometries"));
    }
}