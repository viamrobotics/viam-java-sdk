package com.viam.sdk.core.component.powersensor

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Answers
import org.mockito.Mockito.*
import java.util.*

class PowerSensorTest {
    private lateinit var powerSensor: PowerSensor
    val extra =
        Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()

    @BeforeEach
    fun setup() {
        powerSensor = mock(PowerSensor::class.java, Answers.CALLS_REAL_METHODS)
    }

    @Test
    fun getVoltage(){
        `when`(powerSensor.getVoltage(any<Optional<Struct>>())).thenReturn(AbstractMap.SimpleEntry(3.0, true))
        val voltage = powerSensor.getVoltage(Optional.of(extra))
        verify(powerSensor).getVoltage(Optional.of(extra))
        assertEquals(3.0, voltage.key)
        assertTrue(voltage.value)

    }

    @Test
    fun getCurrent(){
        `when`(powerSensor.getCurrent(any<Optional<Struct>>())).thenReturn(AbstractMap.SimpleEntry(5.0, false))
        val curr = powerSensor.getCurrent(Optional.of(extra))
        verify(powerSensor).getCurrent(Optional.of(extra))
        assertEquals(5.0, curr.key)
        assertFalse(curr.value)

    }

    @Test
    fun getPower(){
        `when`(powerSensor.getPower(any<Optional<Struct>>())).thenReturn(4.2)
        val power = powerSensor.getPower(Optional.of(Struct.getDefaultInstance()))
        verify(powerSensor).getPower(Optional.of(Struct.getDefaultInstance()))
        assertEquals(4.2, power)

    }

    @Test
    fun getReadings(){
        val readings = mapOf(
            "a" to 1,
            "b" to 2,
            "c" to 3,
            "d" to mapOf("d1" to "vec3" to Common.Vector3.newBuilder().setX(1.0).setY(1.0).setZ(1.0).build())
        )
        `when`(powerSensor.getReadings(any<Optional<Struct>>())).thenReturn(readings)
        val result = powerSensor.getReadings(Optional.of(extra))
        verify(powerSensor).getReadings(Optional.of(extra))
        assertEquals(readings, result)
    }
}