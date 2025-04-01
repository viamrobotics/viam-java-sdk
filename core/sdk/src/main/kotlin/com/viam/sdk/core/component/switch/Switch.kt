package com.viam.sdk.core.component.switch

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common.*
import com.viam.sdk.core.component.Component
import com.viam.sdk.core.resource.Resource
import com.viam.sdk.core.resource.Subtype
import com.viam.sdk.core.robot.RobotClient

/**
 * A Switch represents a physical or virtual switch that can be set to different positions.
 */
abstract class Switch(name: String) : Component(SUBTYPE, named(name)) {
    companion object {
        @JvmField
        val SUBTYPE = Subtype(Subtype.NAMESPACE_RDK, Subtype.RESOURCE_TYPE_COMPONENT, "switch")

        /**
         * Get the ResourceName of the component
         * @param name the name of the component
         * @return     the component's ResourceName
         */
        @JvmStatic
        fun named(name: String): ResourceName {
            return Resource.named(SUBTYPE, name)
        }

        /**
         * Get the component with the provided name from the provided robot.
         * @param robot the RobotClient
         * @param name  the name of the component
         * @return      the component
         */
        @JvmStatic
        fun fromRobot(robot: RobotClient, name: String): Switch {
            return robot.getResource(Switch::class.java, named(name))
        }
    }

    /**
     * Get the current position of the switch.
     * @param extra Additional arguments to the method
     * @return The current position
     */
    abstract fun getPosition(extra: Struct): UInt

    /**
     * Get the current position of the switch.
     * @return The current position
     */
    fun getPosition(): UInt {
        return getPosition(Struct.getDefaultInstance())
    }

    /**
     * Set the switch to the specified position.
     * @param position The position to set
     * @param extra Additional arguments to the method
     */
    abstract fun setPosition(position: UInt, extra: Struct)

    /**
     * Set the switch to the specified position.
     * @param position The position to set
     */
    fun setPosition(position: UInt) {
        setPosition(position, Struct.getDefaultInstance())
    }

    /**
     * Get the number of positions supported by the switch.
     * @param extra Additional arguments to the method
     * @return The number of supported positions
     */
    abstract fun getNumberOfPositions(extra: Struct): UInt

    /**
     * Get the number of positions supported by the switch.
     * @return The number of supported positions
     */
    fun getNumberOfPositions(): UInt {
        return getNumberOfPositions(Struct.getDefaultInstance())
    }
}
