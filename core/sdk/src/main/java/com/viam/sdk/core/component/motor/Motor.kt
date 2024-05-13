package com.viam.sdk.core.component.motor

import com.google.protobuf.Struct
import com.viam.common.v1.Common.ResourceName
import com.viam.sdk.core.component.Component
import com.viam.sdk.core.resource.Resource
import com.viam.sdk.core.resource.Subtype
import com.viam.sdk.core.robot.RobotClient
import java.util.*

/**
 * A [Motor] represents a physical motor
 */
abstract class Motor(name: String) : Component(SUBTYPE, named(name)) {

    @JvmInline
    value class Properties(val positionReporting: Boolean)

    companion object {
        @JvmStatic
        val SUBTYPE = Subtype(Subtype.NAMESPACE_RDK, Subtype.RESOURCE_TYPE_COMPONENT, "motor")

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
        fun fromRobot(robot: RobotClient, name: String): Motor {
            return robot.getResource(Motor::class.java, named(name))
        }
    }

    /**
     * Sets the "percentage" of power the motor should employ between -1 and 1.
     * When [power] is negative, the rotation will be in the backward direction.
     * @param power the power percent, between -1 and 1 (negative indicating backwards rotation)
     */
    abstract fun setPower(power: Double, extra: Struct)

    /**
     * Sets the "percentage" of power the motor should employ between -1 and 1.
     * When [power] is negative, the rotation will be in the backward direction.
     * @param power the power percent, between -1 and 1 (negative indicating backwards rotation)
     */
    fun setPower(power: Double) {
        setPower(power, Struct.getDefaultInstance())
    }

    /**
     * Spin the motor the specified number of [revolutions] at specified [rpm].
     * When [rpm] or [revolutions] is a negative value, the rotation will be in the backward direction.
     * Note: if both [rpm] and [revolutions] are negative, the motor will spin in the forward direction.
     * @param rpm         speed at which the motor should move in rotations per minute (negative implies backwards)
     * @param revolutions number of revolutions the motor should run for (negative implies backwards)
     */
    abstract fun goFor(rpm: Double, revolutions: Double, extra: Struct)

    /**
     * Spin the motor the specified number of [revolutions] at specified [rpm].
     * When [rpm] or [revolutions] is a negative value, the rotation will be in the backward direction.
     * Note: if both [rpm] and [revolutions] are negative, the motor will spin in the forward direction.
     * @param rpm         speed at which the motor should move in rotations per minute (negative implies backwards)
     * @param revolutions number of revolutions the motor should run for (negative implies backwards)
     */
    fun goFor(rpm: Double, revolutions: Double) {
        goFor(rpm, revolutions, Struct.getDefaultInstance())
    }

    /**
     * Spin the motor to the specified position (provided in revolutions from home/zero),
     * at the specified speed, in revolutions per minute.
     * Regardless of the directionality of the [rpm] this function will move
     * the motor towards the specified position.
     * @param rpm                 speed at which the motor should move in rotations per minute (negative implies backwards)
     * @param positionRevolutions target position relative to home/zero, in revolutions
     */
    abstract fun goTo(rpm: Double, positionRevolutions: Double, extra: Struct)

    /**
     * Spin the motor to the specified position (provided in revolutions from home/zero),
     * at the specified speed, in revolutions per minute.
     * Regardless of the directionality of the [rpm] this function will move
     * the motor towards the specified position.
     * @param rpm                 speed at which the motor should move in rotations per minute (negative implies backwards)
     * @param positionRevolutions target position relative to home/zero, in revolutions
     */
    fun goTo(rpm: Double, positionRevolutions: Double) {
        goTo(rpm, positionRevolutions, Struct.getDefaultInstance())
    }

    /**
     * Set the current position (modified by [offset]) to be the new zero (home) position.
     * @param offset the offset from the current position to new home/zero position
     */
    abstract fun resetZeroPosition(offset: Double, extra: Struct)

    /**
     * Set the current position (modified by [offset]) to be the new zero (home) position.
     * @param offset the offset from the current position to new home/zero position
     */
    fun resetZeroPosition(offset: Double) {
        resetZeroPosition(offset, Struct.getDefaultInstance())
    }

    /**
     * Report the position of the motor based on its encoder.
     * The value returned is the number of revolutions relative to its zero position.
     * This method will raise an exception if position reporting is not supported by the motor.
     * @returns number of revolutions the motor is away from zero/home
     */
    abstract fun getPosition(extra: Struct): Double

    /**
     * Report the position of the motor based on its encoder.
     * The value returned is the number of revolutions relative to its zero position.
     * This method will raise an exception if position reporting is not supported by the motor.
     * @returns number of revolutions the motor is away from zero/home
     */
    fun getPosition(): Double {
        return this.getPosition(Struct.getDefaultInstance())
    }

    /**
     * Report which optional properties are supported by this motor
     * @returns the optional features and if they are supported by this motor
     */
    abstract fun getProperties(extra: Struct): Properties

    /**
     * Report which optional properties are supported by this motor
     * @returns the optional features and if they are supported by this motor
     */
    fun getProperties(): Properties {
        return this.getProperties(Struct.getDefaultInstance())
    }

    /**
     * Stop the motor immediately, without any gradual step down.
     */
    abstract fun stop(extra: Struct)

    /**
     * Stop the motor immediately, without any gradual step down.
     */
    fun stop() {
        stop(Struct.getDefaultInstance())
    }

    /**
     * Check to see if the motor is currently running and its current power level.
     * @returns if the motor is currently powered and its power level
     */
    abstract fun isPowered(extra: Struct): Pair<Boolean, Double>

    /**
     * Check to see if the motor is currently running and its current power level.
     * @returns if the motor is currently powered and its power level
     */
    fun isPowered(): Pair<Boolean, Double> {
        return isPowered(Struct.getDefaultInstance())
    }

    /**
     * Get if the motor is currently moving.
     * @returns if the motor is moving
     */
    abstract fun isMoving(): Boolean
}
