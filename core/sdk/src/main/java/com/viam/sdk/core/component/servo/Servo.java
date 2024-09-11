package com.viam.sdk.core.component.servo;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.sdk.core.component.Component;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;


/**
 * Servo represents a physical servo
 */
public abstract class Servo extends Component {
    public static final Subtype SUBTYPE = new Subtype(
            Subtype.NAMESPACE_RDK,
            Subtype.RESOURCE_TYPE_COMPONENT,
            "servo");

    public Servo(final String name) {
        super(SUBTYPE, named(name));
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
    public static Servo fromRobot(final RobotClient robot, final String name) {
        return robot.getResource(Servo.class, named(name));
    }

    /**
     * Move the servo to the provided angle.
     * @param angle the desired angle of the servo in degrees
     */
    public abstract void move(int angle, Struct extra);

    /**
     * Move the servo to the provided angle.
     * @param angle the desired angle of the servo in degrees
     */
    public void move(int angle){
        move(angle, Struct.getDefaultInstance());
    }

    /**
     * Get the current angle (degrees) of the servo.
     * @return the current angle of the servo in degrees
     */
    public abstract int getPosition(Struct extra);

    /**
     * Get the current angle (degrees) of the servo.
     * @return the current angle of the servo in degrees
     */
    public int getPosition(){
        return getPosition(Struct.getDefaultInstance());
    }

    /**
     *  Stop the servo. It is assumed that the servo stops immediately.
     */
    public abstract void stop(Struct extra);

    /**
     *  Stop the servo. It is assumed that the servo stops immediately.
     */
    public void stop(){
        stop(Struct.getDefaultInstance());
    }


    /**
     *  Get if the servo is currently moving.
     *  @return whether the servo is moving
     */
    public abstract boolean isMoving();


}

