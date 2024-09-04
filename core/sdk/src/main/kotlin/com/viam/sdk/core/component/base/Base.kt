package com.viam.sdk.core.component.base

import com.google.protobuf.Struct
import com.viam.common.v1.Common.ResourceName
import com.viam.common.v1.Common.Vector3
import com.viam.component.base.v1.Base.GetPropertiesResponse
import com.viam.sdk.core.component.Component
import com.viam.sdk.core.resource.Resource
import com.viam.sdk.core.resource.Subtype
import com.viam.sdk.core.robot.RobotClient

typealias Properties = GetPropertiesResponse

/**
 *  Base represents a physical base of a robot.
 */
abstract class Base(name: String) : Component(SUBTYPE, named(name)) {


    companion object {
        @JvmField
        val SUBTYPE = Subtype(Subtype.NAMESPACE_RDK, Subtype.RESOURCE_TYPE_COMPONENT, "base")

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
        fun fromRobot(robot: RobotClient, name: String): Base {
            return robot.getResource(Base::class.java, named(name))
        }
    }
    /**
     * Move the base in a straight line the given ``distance``, expressed in millimeters,
     * at the given ``velocity``, expressed in millimeters per second.
     * When ``distance`` or ``velocity`` is 0, the base will stop.
     * This method blocks until completed or cancelled.
     * @param distance The distance (in millimeters) to move. Negative implies backwards.
     * @param velocity The velocity (in millimeters per second) to move.
     *                 Negative implies backwards.
     */
    abstract fun moveStraight(distance: Long, velocity: Double, extra: Struct)


    /**
     * Move the base in a straight line the given ``distance``, expressed in millimeters,
     * at the given ``velocity``, expressed in millimeters per second.
     * When ``distance`` or ``velocity`` is 0, the base will stop.
     * This method blocks until completed or cancelled.
     * @param distance The distance (in millimeters) to move. Negative implies backwards.
     * @param velocity The velocity (in millimeters per second) to move.
     *                 Negative implies backwards.
     */
    fun moveStraight(distance: Long, velocity: Double) {
        moveStraight(distance, velocity, Struct.getDefaultInstance())
    }


    /**
     *  Spin the base in place ``angle`` degrees, at the given angular ``velocity``,
     *  expressed in degrees per second.
     *  When ``velocity`` is 0, the base will stop.
     *  This method blocks until completed or cancelled.
     *  @param angle    The angle (in degrees) to spin.
     *  @param velocity The angular velocity (in degrees per second) to spin.
     *                  Given a positive angle and a positive velocity, the base will turn to the left.
     */
    abstract fun spin(angle: Double, velocity: Double, extra: Struct)

    /**
     *  Spin the base in place ``angle`` degrees, at the given angular ``velocity``,
     *  expressed in degrees per second.
     *  When ``velocity`` is 0, the base will stop.
     *  This method blocks until completed or cancelled.
     *  @param angle    The angle (in degrees) to spin.
     *  @param velocity The angular velocity (in degrees per second) to spin.
     *                  Given a positive angle and a positive velocity, the base will turn to the left.
     */
    fun spin(angle: Double, velocity: Double) {
        spin(angle, velocity, Struct.getDefaultInstance())
    }

    /**
     * Set the linear and angular velocity of the Base
     * When ``linear`` is 0, the the base will spin.
     * When ``angular`` is 0, the the base will move in a straight line.
     * When both ``linear`` and ``angular`` are 0, the base will stop.
     * When ``linear`` and ``angular`` are both nonzero, the base will move in an arc, with a tighter radius if angular
     * power is greater than linear power.
     * @param linear    The linear component. Only the Y component is used for wheeled base. Positive implies forwards.
     * @param angular   The angular component. Only the Z component is used
     *                  for wheeled base. Positive turns left; negative turns right.
     */
    abstract fun setPower(linear: Vector3, angular: Vector3, extra: Struct)

    /**
     * Set the linear and angular velocity of the Base
     * When ``linear`` is 0, the the base will spin.
     * When ``angular`` is 0, the the base will move in a straight line.
     * When both ``linear`` and ``angular`` are 0, the base will stop.
     * When ``linear`` and ``angular`` are both nonzero, the base will move in an arc, with a tighter radius if angular
     * power is greater than linear power.
     * @param linear    The linear component. Only the Y component is used for wheeled base. Positive implies forwards.
     * @param angular   The angular component. Only the Z component is used
     *                  for wheeled base. Positive turns left; negative turns right.
     */
    fun setPower(linear: Vector3, angular: Vector3) {
        setPower(linear, angular, Struct.getDefaultInstance())
    }

    /**
     * Set the linear and angular velocities of the base.
     * @param linear    The velocity in mm/sec
     * @param angular   The velocity in mm/sec
     */
    abstract fun setVelocity(linear: Vector3, angular: Vector3, extra: Struct)

    /**
     * Set the linear and angular velocities of the base.
     * @param linear    The velocity in mm/sec
     * @param angular   The velocity in mm/sec
     */
    fun setVelocity(linear: Vector3, angular: Vector3) {
        setVelocity(linear, angular, Struct.getDefaultInstance())
    }

    /**
     * Stops the base.
     */
    abstract fun stop(extra: Struct)

    /**
     * Stops the base.
     */
    fun stop(){
        stop(Struct.getDefaultInstance())
    }

    /**
     * Get if the base is currently moving.
     * @return Whether the base is moving.
     */
    abstract fun isMoving(): Boolean

    /**
     * Get the base width and turning radius
     * @return the properties of the base
     */
    abstract fun getProperties(): Properties

}