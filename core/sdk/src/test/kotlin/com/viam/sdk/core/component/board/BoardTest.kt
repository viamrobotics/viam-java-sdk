package com.viam.sdk.core.component.board

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.component.board.v1.Board.PowerMode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Answers
import org.mockito.Mockito.*
import java.time.Instant
import java.util.*
import kotlin.random.Random
import kotlin.time.DurationUnit
import kotlin.time.toDuration
import kotlin.time.toJavaDuration

class BoardTest {
    private lateinit var board: Board

    @BeforeEach
    fun setup() {
        board = mock(Board::class.java, Answers.CALLS_REAL_METHODS)
    }

    @Test
    fun setGpioState() {
        val pinName = "test-pin"
        val extra =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        board.setGpioState(pinName, false, extra)
        verify(board).setGpioState(pinName, false, extra)
    }

    @Test
    fun getGpioState() {
        val pinName = "test-pin"
        `when`(
            board.getGpioState(
                eq(pinName) ?: pinName, any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(true)
        val high = board.getGpioState(pinName)
        verify(board).getGpioState(pinName, Struct.getDefaultInstance())
        assertTrue(high)
    }

    @Test
    fun setPwm() {
        val pinName = "test-pin"
        val dutyCyclePct = Random.nextDouble()
        board.setPwm(pinName, dutyCyclePct)
        verify(board).setPwm(pinName, dutyCyclePct)
    }

    @Test
    fun getPwm() {
        val pinName = "test-pin"
        val dutyCyclePct = Random.nextDouble()
        `when`(board.getPwm(eq(pinName) ?: pinName, any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(
            dutyCyclePct
        )
        val result = board.getPwm(pinName)
        verify(board).getPwm(pinName, Struct.getDefaultInstance())
        assertEquals(result, dutyCyclePct)
    }

    @Test
    fun setPwmFrequency() {
        val pinName = "test-pin"
        val frequencyHz = Random.nextInt()
        board.setPwmFrequency(pinName, frequencyHz)
        verify(board).setPwmFrequency(pinName, frequencyHz)
    }

    @Test
    fun getPwmFrequency() {
        val pinName = "test-pin"
        val frequencyHz = Random.nextInt()
        `when`(
            board.getPwmFrequency(
                eq(pinName) ?: pinName, any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(frequencyHz)
        val result = board.getPwmFrequency(pinName)
        verify(board).getPwmFrequency(pinName, Struct.getDefaultInstance())
        assertEquals(result, frequencyHz)
    }

    @Test
    fun writeAnalog() {
        val readerName = "reader-name"
        val value = Random.nextInt()
        board.writeAnalog(readerName, value)
        verify(board).writeAnalog(readerName, value)
    }

    @Test
    fun getAnalogReaderValue() {
        val readerName = "reader-name"
        val value = Random.nextInt()
        `when`(
            board.getAnalogReaderValue(
                eq(readerName) ?: readerName, any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(value)
        val result = board.getAnalogReaderValue(readerName)
        verify(board).getAnalogReaderValue(readerName, Struct.getDefaultInstance())
        assertEquals(result, value)
    }

    @Test
    fun getDigitalInterruptValue() {
        val interruptName = "interrupt-name"
        val value = Random.nextInt()
        `when`(
            board.getDigitalInterruptValue(
                eq(interruptName) ?: interruptName, any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(value)
        val result = board.getDigitalInterruptValue(interruptName)
        verify(board).getDigitalInterruptValue(interruptName, Struct.getDefaultInstance())
        assertEquals(result, value)
    }

    @Test
    fun streamTicks() {
        fun createTicks(interrupts: List<String>): Iterator<Tick> {
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

        val interruptNames = listOf("interrupt-1", "interrupt-2", "interrupt-3")
        `when`(
            board.streamTicks(
                eq(interruptNames) ?: interruptNames, any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(createTicks(interruptNames))
        val ticks = board.streamTicks(interruptNames)
        verify(board).streamTicks(interruptNames, Struct.getDefaultInstance())
        for (tick in ticks) {
            assertTrue(interruptNames.contains(tick.pinName))
        }
    }

    @Test
    fun addCallback() {
        val list = listOf<String>()
        val queue = PriorityQueue<Tick>()
        board.addCallbacks(list, queue)
        verify(board).addCallbacks(list, queue, Struct.getDefaultInstance())
    }

    @Test
    fun setPowerMode() {
        val powerMode = PowerMode.POWER_MODE_OFFLINE_DEEP
        val powerModeDuration = Random.nextInt().toDuration(DurationUnit.NANOSECONDS)
        board.setPowerMode(powerMode, powerModeDuration)
        verify(board).setPowerMode(powerMode, powerModeDuration.toJavaDuration(), Struct.getDefaultInstance())
    }
}
