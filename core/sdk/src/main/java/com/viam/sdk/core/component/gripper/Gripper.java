package com.viam.sdk.core.component.gripper;

import com.viam.common.v1.Common;
import com.viam.sdk.core.Component;
import com.viam.sdk.core.Resource;
import com.viam.sdk.core.Subtype;

public abstract class Gripper extends Component {

    public static final Subtype SUBTYPE = new Subtype(
            Subtype.NAMESPACE_RDK,
            Subtype.RESOURCE_TYPE_COMPONENT,
            "gripper");

    public Gripper(final String name) {
        super(SUBTYPE, named(name));
    }

    /**
     * Open the gripper.
     */
    public abstract void open();

    /**
     * Instruct the gripper to grab.
     *
     * @return Indicates if the gripper grabbed something.
     */
    public abstract boolean grab();

    /**
     * Stop the gripper. It is assumed the gripper stops immediately.
     */
    public abstract void stop();

    /**
     * Get if the gripper is currently moving.
     *
     * @return Whether the gripper is moving.
     */
    public abstract boolean isMoving();

    public static Common.ResourceName named(final String name) {
        return Resource.named(SUBTYPE, name);
    }
}
