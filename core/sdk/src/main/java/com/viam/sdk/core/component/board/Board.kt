package com.viam.sdk.core.component.board

import com.google.protobuf.Struct
import com.viam.common.v1.Common.ResourceName
import com.viam.component.board.v1.Board
import com.viam.sdk.core.component.Component
import com.viam.sdk.core.resource.Resource
import com.viam.sdk.core.resource.Subtype
import java.util.Optional
import java.util.Queue
import java.util.stream.Stream
import kotlin.time.Duration

public typealias Tick = Board.StreamTicksResponse

/**
 * A Board represents a physical general purpose board that contains various
 * components such as analog readers and digital interrupts.
 */
public abstract class Board(name: String) : Component(SUBTYPE, named(name)) {
    public companion object {
        public val SUBTYPE = Subtype(Subtype.NAMESPACE_RDK, Subtype.RESOURCE_TYPE_COMPONENT, "board")

        /**
         * Get the ResourceName of the component
         * @param name the name of the component
         * @return     the component's ResourceName
         */
        public fun named(name: String): ResourceName {
            return Resource.named(SUBTYPE, name)
        }
    }

    /**
     * Set the high/low state of the given pin of a board.
     * @param pin the name of the GPIO pin
     * @param high when true, sets the pin to high. When false, sets the pin to low.
     */
    public abstract fun setGpioState(pin: String, high: Boolean, extra: Optional<Struct>)

    /**
     * Get the high/low state of the given pin of a board.
     * @param pin the name of the GPIO pin
     * @return    the state of the pin: true if high, false otherwise.
     */
    public abstract fun getGpioState(pin: String, extra: Optional<Struct>): Boolean

    /**
     * Set the duty cycle of the given pin of a board.
     * @param pin          the name of the GPIO pin
     * @param dutyCyclePct the duty cycle percent
     */
    public abstract fun setPwm(pin: String, dutyCyclePct: Double, extra: Optional<Struct>)

    /**
     * Get the duty cycle of the given pin of a board.
     * @param pin the name of the pin
     * @returns   the duty cycle percent
     */
    public abstract fun getPwm(pin: String, extra: Optional<Struct>): Double

    /**
     * Set the PWM frequency of the given pin of a board.
     * @param pin         the name of the pin
     * @param frequencyHz the frequency to set
     */
    public abstract fun setPwmFrequency(pin: String, frequencyHz: Int, extra: Optional<Struct>)

    /**
     * Get the PWM frequency of the given pin of a board.
     * @param pin the name of the pin
     * @returns   the frequency of the pin in Hz
     */
    public abstract fun getPwmFrequency(pin: String, extra: Optional<Struct>): Int

    /**
     * Read the current value of an analog reader of a board.
     * @param analogReader the name of the analog reader
     * @returns            the current value of the analog reader
     */
    public abstract fun getAnalogReaderValue(analogReader: String, extra: Optional<Struct>): Int

    /**
     * Return the current value of the interrupt which is based on the type of Interrupt.
     * @param digitalInterrupt the name of the digital interrupt
     * @returns                the current value of the digital reader
     */
    public abstract fun getDigitalInterruptValue(digitalInterrupt: String, extra: Optional<Struct>): Int

    /**
     * Stream digital interrupts ticks.
     * @param interrupts the list of digital interrupts names from which to receive ticks
     * @returns          a [Stream] of [Tick] objects
     */
    public abstract fun streamTicks(interrupts: List<String>, extra: Optional<Struct>): Stream<Tick>

    /**
     * Add a listener for the digital interrupts.
     * @param interrupts the list of digital interrupts names from which to receive ticks
     * @param tickQueue  an object to receive values from the callback
     */
    public abstract fun addCallbacks(interrupts: List<String>, tickQueue: Queue<Tick>, extra: Optional<Struct>)

    /**
     * Set the board to the indicated power mode.
     * @param powerMode the power mode to set
     * @param duration  if provided, the board will exist the given power mode after this duration
     */
    public abstract fun setPowerMode(powerMode: Board.PowerMode, duration: Duration, extra: Optional<Struct>)

    /**
     * Write analog value to pin.
     * @param pin   the name of the pin
     * @param value the value to set
     */
    public abstract fun writeAnalog(pin: String, value: Int, extra: Optional<Struct>)

}
