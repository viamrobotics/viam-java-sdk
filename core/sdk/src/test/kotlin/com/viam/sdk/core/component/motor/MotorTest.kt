package com.viam.sdk.core.component.motor

import com.google.protobuf.Struct
import com.google.protobuf.Value
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Answers
import org.mockito.Mockito.*

class MotorTest {
    private lateinit var motor: Motor

    @BeforeEach
    fun setup() {
        motor = mock(Motor::class.java, Answers.CALLS_REAL_METHODS)
    }

    @Test
    fun setPower() {
        val extra =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        motor.setPower(1.82, extra)
        verify(motor).setPower(1.82, extra)
    }

    @Test
    fun goTo() {
        motor.goTo(1.23, 2.34)
        verify(motor).goTo(1.23, 2.34)
    }

    @Test
    fun resetZeroPosition() {
        motor.resetZeroPosition(44.0)
        verify(motor).resetZeroPosition(44.0)
    }

    @Test
    fun getPosition() {
        `when`(motor.getPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(78.6)
        val pos = motor.getPosition()
        verify(motor).getPosition()
        assertEquals(78.6, pos)
    }

    @Test
    fun getProperties() {
        `when`(motor.getProperties(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(
            Motor.Properties(
                positionReporting = true
            )
        )
        val properties = motor.getProperties()
        verify(motor).getProperties()
        assertTrue(properties.positionReporting)
    }

    @Test
    fun stop() {
        motor.stop()
        verify(motor).stop()
    }

    @Test
    fun isPowered() {
        `when`(motor.isPowered(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(Pair(true, 10.1))
        val isPowered = motor.isPowered()
        verify(motor).isPowered()
        assertTrue(isPowered.first)
        assertEquals(10.1, isPowered.second)
    }

    @Test
    fun isMoving() {
        `when`(motor.isMoving()).thenReturn(false)
        val isMoving = motor.isMoving()
        verify(motor).isMoving()
        assertFalse(isMoving)
    }
}
