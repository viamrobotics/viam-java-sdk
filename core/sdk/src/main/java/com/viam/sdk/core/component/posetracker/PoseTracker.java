package com.viam.sdk.core.component.posetracker;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.sdk.core.component.Component;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;

import java.util.List;
import java.util.Map;

/**
 * PoseTracker represents a physical pose or motion tracking device.
 */
public abstract class PoseTracker extends Component {

    public static final Subtype SUBTYPE = new Subtype(
            Subtype.NAMESPACE_RDK,
            Subtype.RESOURCE_TYPE_COMPONENT,
            "poseTracker");

    public PoseTracker(final String name) {
        super(SUBTYPE, named(name));
    }

    public PoseTracker(Subtype subtype, Common.ResourceName name) {
        super(subtype, name);
        throw new UnsupportedOperationException();
    }

    /**
     * Get the ResourceName of the component
     *
     * @param name the name of the component
     * @return     the component's ResourceName
     */
    public static Common.ResourceName named(final String name) {
        return Resource.named(SUBTYPE, name);
    }

    /**
     * Get the component with the provided name from the provided robot.
     * @param robot the RobotClient
     * @param name  the name of the component
     * @return      the component
     */
    public static PoseTracker fromRobot(final RobotClient robot, final String name) {
        return robot.getResource(PoseTracker.class, named(name));
    }

    /**
     * Returns the current pose of each body tracked by the pose tracker.
     * @param bodyNames Names of the bodies whose poses are being requested. In the event this parameter is not supplied or is
     *                 an empty list, all available poses are returned.
     * @return
     */
    public abstract Map<String, Common.PoseInFrame> getPoses(List<String> bodyNames, Struct extra);


    /**
     * Returns the current pose of each body tracked by the pose tracker.
     * @param bodyNames Names of the bodies whose poses are being requested. In the event this parameter is not supplied or is
     *                 an empty list, all available poses are returned.
     * @return
     */
    public  Map<String, Common.PoseInFrame> getPoses(List<String> bodyNames){
        return getPoses(bodyNames,Struct.getDefaultInstance());
    }


}
