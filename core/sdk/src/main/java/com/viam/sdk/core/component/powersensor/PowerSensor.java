package com.viam.sdk.core.component.powersensor;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.sdk.core.component.Component;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;

import java.util.Map.Entry;


import java.util.Map;
import java.util.Optional;

/**
 * PowerSensor reports information about voltage, current and power.
 */
public abstract class PowerSensor extends Component {
    public static final Subtype SUBTYPE = new Subtype(
            Subtype.NAMESPACE_RDK,
            Subtype.RESOURCE_TYPE_COMPONENT,
            "power_sensor");

    public PowerSensor(final String name) {
        super(SUBTYPE, named(name));
    }

    /**
     * Get the ResourceName of the component
     *
     * @param name the name of the component
     * @return the component's ResourceName
     */
    public static Common.ResourceName named(final String name) {
        return Resource.named(SUBTYPE, name);
    }

    /**
     * Get the component with the provided name from the provided robot.
     *
     * @param robot the RobotClient
     * @param name  the name of the component
     * @return the component
     */
    public static PowerSensor fromRobot(final RobotClient robot, final String name) {
        return robot.getResource(PowerSensor.class, named(name));
    }

    /**
     * Return the voltage reading of a specified device and whether it is AC or DC.
     *
     * @return the pair where the first double representing the voltage reading in V, the second bool indicating whether the voltage is AC (`true`) or DC
     * (`false`).
     */
    public abstract Entry<Double, Boolean> getVoltage(Optional<Struct> extra);

    /**
     * Return the current of a specified device and whether it is AC or DC.
     *
     * @return the pair where the first double representing the current reading in V, the second bool indicating whether the current is AC (`true`) or DC
     * *             (`false`).
     */
    public abstract Entry<Double, Boolean> getCurrent(Optional<Struct> extra);

    /**
     * Return the power reading in watts.
     *
     * @return the power reading in watts
     */
    public abstract double getPower(Optional<Struct> extra);


    /**
     * Get the measurements or readings that this power sensor provides. If a sensor is not configured correctly or fails to read a
     * piece of data, it will not appear in the readings dictionary.
     *
     * @return The readings for the PowerSensor. Object should be of type Vector3, GeoPoint, Orientation, or any Value type. Includes voltage in volts (float), current in
     * amperes (float), is_ac (bool), and power in watts (float).
     */
    public abstract Map<String, Object> getReadings(Optional<Struct> extra);


}