package com.viam.sdk.core.component.board

import com.google.protobuf.Struct
import com.viam.common.v1.Common.ResourceName
import com.viam.component.board.v1.Board.PowerMode
import com.viam.component.board.v1.Board.StreamTicksResponse
import com.viam.sdk.core.component.Component
import com.viam.sdk.core.resource.Resource
import com.viam.sdk.core.resource.Subtype
import com.viam.sdk.core.robot.RobotClient
import java.util.*
import java.util.stream.Stream
import kotlin.time.Duration

typealias Tick = StreamTicksResponse

/**
 * A Board represents a physical general purpose board that contains various
 * components such as analog readers and digital interrupts.
 */
abstract class Board(name: String) : Component(SUBTYPE, named(name)) {
    companion object {
        @JvmStatic
        val SUBTYPE =
            Subtype(Subtype.NAMESPACE_RDK, Subtype.RESOURCE_TYPE_COMPONENT, "board")

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
        fun fromRobot(robot: RobotClient, name: String): Board {
            return robot.getResource(Board::class.java, named(name))
        }
    }

    /**
     * Set the high/low state of the given pin of a board.
     * @param pin the name of the GPIO pin
     * @param high when true, sets the pin to high. When false, sets the pin to low.
     */
    abstract fun setGpioState(pin: String, high: Boolean, extra: Optional<Struct>)

    /**
     * Get the high/low state of the given pin of a board.
     * @param pin the name of the GPIO pin
     * @return    the state of the pin: true if high, false otherwise.
     */
    abstract fun getGpioState(pin: String, extra: Optional<Struct>): Boolean

    /**
     * Set the duty cycle of the given pin of a board.
     * @param pin          the name of the GPIO pin
     * @param dutyCyclePct the duty cycle percent
     */
    abstract fun setPwm(pin: String, dutyCyclePct: Double, extra: Optional<Struct>)

    /**
     * Get the duty cycle of the given pin of a board.
     * @param pin the name of the pin
     * @returns   the duty cycle percent
     */
    abstract fun getPwm(pin: String, extra: Optional<Struct>): Double

    /**
     * Set the PWM frequency of the given pin of a board.
     * @param pin         the name of the pin
     * @param frequencyHz the frequency to set
     */
    abstract fun setPwmFrequency(pin: String, frequencyHz: Int, extra: Optional<Struct>)

    /**
     * Get the PWM frequency of the given pin of a board.
     * @param pin the name of the pin
     * @returns   the frequency of the pin in Hz
     */
    abstract fun getPwmFrequency(pin: String, extra: Optional<Struct>): Int

    /**
     * Write analog value to pin.
     * @param pin   the name of the pin
     * @param value the value to set
     */
    abstract fun writeAnalog(pin: String, value: Int, extra: Optional<Struct>)

    /**
     * Read the current value of an analog reader of a board.
     * @param analogReader the name of the analog reader
     * @returns            the current value of the analog reader
     */
    abstract fun getAnalogReaderValue(analogReader: String, extra: Optional<Struct>): Int

    /**
     * Return the current value of the interrupt which is based on the type of Interrupt.
     * @param digitalInterrupt the name of the digital interrupt
     * @returns                the current value of the digital reader
     */
    abstract fun getDigitalInterruptValue(
        digitalInterrupt: String,
        extra: Optional<Struct>
    ): Int

    /**
     * Stream digital interrupts ticks.
     * @param interrupts the list of digital interrupts names from which to receive ticks
     * @returns          a [Stream] of [Tick] objects
     */
    abstract fun streamTicks(interrupts: List<String>, extra: Optional<Struct>): Iterator<Tick>

    /**
     * Add a listener for the digital interrupts.
     * @param interrupts the list of digital interrupts names from which to receive ticks
     * @param tickQueue  an object to receive values from the callback
     */
    abstract fun addCallbacks(
        interrupts: List<String>,
        tickQueue: Queue<Tick>,
        extra: Optional<Struct>
    )

    /**
     * Set the board to the indicated power mode.
     * @param powerMode the power mode to set
     * @param duration  if provided, the board will exit the given power mode after this duration
     */
    abstract fun setPowerMode(
        powerMode: PowerMode,
        duration: Duration,
        extra: Optional<Struct>
    )

}
