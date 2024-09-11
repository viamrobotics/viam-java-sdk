package com.viam.sdk.core.component.encoder

import com.google.protobuf.Struct
import com.viam.common.v1.Common.ResourceName
import com.viam.component.encoder.v1.Encoder.GetPropertiesResponse
import com.viam.component.encoder.v1.Encoder.PositionType
import com.viam.sdk.core.component.Component
import com.viam.sdk.core.resource.Resource
import com.viam.sdk.core.resource.Subtype
import com.viam.sdk.core.robot.RobotClient

typealias Properties = GetPropertiesResponse


/**
 * An [Encoder] represents a physical encoder.
 */
abstract class Encoder(name: String) : Component(SUBTYPE, named(name)) {

    companion object {
        @JvmField
        val SUBTYPE = Subtype(Subtype.NAMESPACE_RDK, Subtype.RESOURCE_TYPE_COMPONENT, "encoder")

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
        fun fromRobot(robot: RobotClient, name: String): Encoder {
            return robot.getResource(Encoder::class.java, named(name))
        }
    }

    /**
     * Set the current position to be the new zero (home) position.
     */
    abstract fun resetPosition(extra: Struct)

    /**
     * Set the current position to be the new zero (home) position.
     */
    fun resetPosition() {
        resetPosition(Struct.getDefaultInstance())
    }

    /**
     * Report the position of the encoder.
     * The value returned is the current position in terms of its ``position_type``.
     * If no position type is given, the supported position type will be returned.
     * The position will be either in relative units (ticks away from a zero position) for
     * ``PositionType.POSITION_TYPE_TICKS_COUNT`` or absolute units (degrees along a circle)
     * for ``PositionType.POSITION_TYPE_ANGLE_DEGREES``.
     * @param positionType The desired output type of the position.
     * @return A tuple containing two values; the first [0] the position of the encoder which can either be
     *             ticks since last zeroing for a relative encoder or degrees for an absolute encoder, and the second [1] the type of
     *             position the encoder returns (ticks or degrees).
     *
     */
    abstract fun getPosition(positionType: PositionType?, extra: Struct): Pair<Float, PositionType>

    /**
     * Report the position of the encoder.
     * The value returned is the current position in terms of its ``position_type``.
     * If no position type is given, the supported position type will be returned.
     * The position will be either in relative units (ticks away from a zero position) for
     * ``PositionType.POSITION_TYPE_TICKS_COUNT`` or absolute units (degrees along a circle)
     * for ``PositionType.POSITION_TYPE_ANGLE_DEGREES``.
     * @return A tuple containing two values; the first [0] the position of the encoder which can either be
     *             ticks since last zeroing for a relative encoder or degrees for an absolute encoder, and the second [1] the type of
     *             position the encoder returns (ticks or degrees).
     */
    fun getPosition(positionType: PositionType): Pair<Float, PositionType> {
        return getPosition(positionType, Struct.getDefaultInstance())
    }

    /**
     * Report the position of the encoder.
     * The value returned is the current position in terms of its ``position_type``.
     * If no position type is given, the supported position type will be returned.
     * The position will be either in relative units (ticks away from a zero position) for
     * ``PositionType.POSITION_TYPE_TICKS_COUNT`` or absolute units (degrees along a circle)
     * for ``PositionType.POSITION_TYPE_ANGLE_DEGREES``.
     * @return A tuple containing two values; the first [0] the position of the encoder which can either be
     *             ticks since last zeroing for a relative encoder or degrees for an absolute encoder, and the second [1] the type of
     *             position the encoder returns (ticks or degrees).
     *
     */
    fun getPosition(extra: Struct): Pair<Float, PositionType> {
        return getPosition(null, extra)
    }

    /**
     * Report the position of the encoder.
     * The value returned is the current position in terms of its ``position_type``.
     * If no position type is given, the supported position type will be returned.
     * The position will be either in relative units (ticks away from a zero position) for
     * ``PositionType.POSITION_TYPE_TICKS_COUNT`` or absolute units (degrees along a circle)
     * for ``PositionType.POSITION_TYPE_ANGLE_DEGREES``.
     * @return A tuple containing two values; the first [0] the position of the encoder which can either be
     *             ticks since last zeroing for a relative encoder or degrees for an absolute encoder, and the second [1] the type of
     *             position the encoder returns (ticks or degrees).
     */
    fun getPosition(): Pair<Float, PositionType> {
        return getPosition(null, Struct.getDefaultInstance())
    }


    /**
     * Return a dictionary of the types of position reporting this encoder supports.
     * @return a map of position types to supported status.
     */
    abstract fun getProperties(extra: Struct): Properties

    /**
     * Return a dictionary of the types of position reporting this encoder supports.
     * @return a map of position types to supported status.
     */
    fun getProperties(): Properties {
        return getProperties(Struct.getDefaultInstance())
    }
}