package com.viam.sdk.core.component.board

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.component.board.v1.Board.PowerMode
import com.viam.sdk.core.exception.MethodNotImplementedException
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.time.Instant
import java.util.*
import kotlin.random.Random
import kotlin.time.Duration
import kotlin.time.DurationUnit
import kotlin.time.toDuration

class MockBoard(name: String) : Board(name) {
    var gpios: MutableMap<String, Boolean> = mutableMapOf()
    var pwms: MutableMap<String, Double> = mutableMapOf()
    var freqs: MutableMap<String, Int> = mutableMapOf()
    var analogs: MutableMap<String, Int> = mutableMapOf()
    var interrupts: MutableMap<String, Int> = mutableMapOf()
    var powerMode: PowerMode = PowerMode.POWER_MODE_UNSPECIFIED
    var powerModeDuration: Duration = Duration.ZERO
    var extra: Struct? = null

    override fun setGpioState(pin: String, high: Boolean, extra: Optional<Struct>) {
        gpios[pin] = high
        this.extra = extra.orElse(null)
    }

    override fun getGpioState(pin: String, extra: Optional<Struct>): Boolean {
        this.extra = extra.orElse(null)
        return gpios.getValue(pin)
    }

    override fun setPwm(pin: String, dutyCyclePct: Double, extra: Optional<Struct>) {
        pwms[pin] = dutyCyclePct
        this.extra = extra.orElse(null)
    }

    override fun getPwm(pin: String, extra: Optional<Struct>): Double {
        this.extra = extra.orElse(null)
        return pwms.getValue(pin)
    }

    override fun setPwmFrequency(pin: String, frequencyHz: Int, extra: Optional<Struct>) {
        freqs[pin] = frequencyHz
        this.extra = extra.orElse(null)
    }

    override fun getPwmFrequency(pin: String, extra: Optional<Struct>): Int {
        this.extra = extra.orElse(null)
        return freqs.getValue(pin)
    }

    override fun writeAnalog(pin: String, value: Int, extra: Optional<Struct>) {
        analogs[pin] = value
        this.extra = extra.orElse(null)
    }

    override fun getAnalogReaderValue(analogReader: String, extra: Optional<Struct>): Int {
        this.extra = extra.orElse(null)
        return analogs.getValue(analogReader)
    }

    override fun getDigitalInterruptValue(digitalInterrupt: String, extra: Optional<Struct>): Int {
        this.extra = extra.orElse(null)
        return interrupts.getValue(digitalInterrupt)
    }

    override fun streamTicks(interrupts: List<String>, extra: Optional<Struct>): Iterator<Tick> {
        this.extra = extra.orElse(null)
        val ticks: MutableList<Tick> = mutableListOf()
        for (i in 0..(interrupts.size * 5)) {
            val idx = i % interrupts.size
            val interrupt = interrupts[idx]
            val value = Random.nextBoolean()
            val time = Instant.now().epochSecond
            ticks.add(Tick.newBuilder().setPinName(interrupt).setHigh(value).setTime(time).build())
        }
        return ticks.iterator()
    }

    override fun addCallbacks(interrupts: List<String>, tickQueue: Queue<Tick>, extra: Optional<Struct>) {
        throw MethodNotImplementedException("MockBoard.addCallbacks")
    }

    override fun setPowerMode(
        powerMode: PowerMode, duration: Duration, extra: Optional<Struct>
    ) {
        this.powerMode = powerMode
        powerModeDuration = duration
        this.extra = extra.orElse(null)
    }

    override fun doCommand(command: Map<String, Value>): Struct {
        return Struct.newBuilder().putAllFields(command).build()
    }

    override fun getGeometries(extra: Optional<Struct>): List<Common.Geometry> {
        this.extra = extra.orElse(null)
        return listOf()
    }
}


internal const val EXTRA_KEY = "funName"
internal fun getExtra(funName: String): Optional<Struct> {
    return Optional.of(
        Struct.newBuilder().putAllFields(mapOf(EXTRA_KEY to Value.newBuilder().setStringValue(funName).build())).build()
    )
}

class BoardTest {
    private lateinit var board: MockBoard

    @BeforeEach
    fun setup() {
        board = MockBoard("testBoard")
    }

    @Test
    fun setGpioState() {
        val pinName = "test-pin"
        val funName = "setGpioState"
        board.setGpioState(pinName, false, getExtra(funName))
        assertFalse(board.gpios.getValue(pinName))
        assertEquals(board.extra?.fieldsMap?.getValue(EXTRA_KEY)?.stringValue, funName)
    }

    @Test
    fun getGpioState() {
        val pinName = "test-pin"

        assertThrows<NoSuchElementException> {
            board.getGpioState(pinName, Optional.empty())
        }

        board.setGpioState(pinName, true, Optional.empty())
        val high = board.getGpioState(pinName, Optional.empty())
        assertTrue(high)
    }

    @Test
    fun setPwm() {
        val pinName = "test-pin"
        val dutyCyclePct = Random.nextDouble()
        board.setPwm(pinName, dutyCyclePct, Optional.empty())
        assertEquals(board.pwms.getValue(pinName), dutyCyclePct)
    }

    @Test
    fun getPwm() {
        val pinName = "test-pin"
        val dutyCyclePct = Random.nextDouble()

        assertThrows<NoSuchElementException> {
            board.getPwm(pinName, Optional.empty())
        }

        board.setPwm(pinName, dutyCyclePct, Optional.empty())
        val result = board.getPwm(pinName, Optional.empty())
        assertEquals(result, dutyCyclePct)
    }

    @Test
    fun setPwmFrequency() {
        val pinName = "test-pin"
        val frequencyHz = Random.nextInt()
        board.setPwmFrequency(pinName, frequencyHz, Optional.empty())
        assertEquals(board.freqs.getValue(pinName), frequencyHz)
    }

    @Test
    fun getPwmFrequency() {
        val pinName = "test-pin"
        val frequencyHz = Random.nextInt()

        assertThrows<NoSuchElementException> {
            board.getPwmFrequency(pinName, Optional.empty())
        }

        board.setPwmFrequency(pinName, frequencyHz, Optional.empty())
        val result = board.getPwmFrequency(pinName, Optional.empty())
        assertEquals(result, frequencyHz)
    }

    @Test
    fun writeAnalog() {
        val readerName = "reader-name"
        val value = Random.nextInt()
        board.writeAnalog(readerName, value, Optional.empty())
        assertEquals(board.analogs.getValue(readerName), value)
    }

    @Test
    fun getAnalogReaderValue() {
        val readerName = "reader-name"
        val value = Random.nextInt()

        assertThrows<NoSuchElementException> {
            board.getAnalogReaderValue(readerName, Optional.empty())
        }

        board.writeAnalog(readerName, value, Optional.empty())
        val result = board.getAnalogReaderValue(readerName, Optional.empty())
        assertEquals(result, value)
    }

    @Test
    fun getDigitalInterruptValue() {
        val interruptName = "interrupt-name"
        val value = Random.nextInt()

        assertThrows<NoSuchElementException> {
            board.getDigitalInterruptValue(interruptName, Optional.empty())
        }

        board.interrupts[interruptName] = value
        val result = board.getDigitalInterruptValue(interruptName, Optional.empty())
        assertEquals(result, value)
    }

    @Test
    fun streamTicks() {
        val interruptNames = listOf("interrupt-1", "interrupt-2", "interrupt-3")
        val ticks = board.streamTicks(interruptNames, Optional.empty())
        for (tick in ticks) {
            assertTrue(interruptNames.contains(tick.pinName))
        }
    }

    @Test
    fun addCallback() {
        assertThrows<MethodNotImplementedException> {
            board.addCallbacks(listOf(), PriorityQueue(), Optional.empty())
        }
    }

    @Test
    fun setPowerMode() {
        val powerMode = PowerMode.POWER_MODE_OFFLINE_DEEP
        val powerModeDuration = Random.nextInt().toDuration(DurationUnit.NANOSECONDS)

        assertNotEquals(board.powerMode, powerMode)
        assertNotEquals(board.powerModeDuration, powerModeDuration)

        board.setPowerMode(powerMode, powerModeDuration, Optional.empty())

        assertEquals(board.powerMode, powerMode)
        assertEquals(board.powerModeDuration, powerModeDuration)
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        val response = board.doCommand(command)
        assertEquals(response.fieldsMap, command)
    }

    @Test
    fun getGeometries() {
        val funName = "getGeometries"
        board.getGeometries(getExtra(funName))
        assertEquals(board.extra?.fieldsMap?.getValue(EXTRA_KEY)?.stringValue, funName)
    }
}
