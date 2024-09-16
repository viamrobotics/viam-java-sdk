package com.viam.sdk.core.component.encoder

import com.google.protobuf.Struct
import com.viam.component.encoder.v1.Encoder.GetPropertiesResponse
import com.viam.component.encoder.v1.Encoder.PositionType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Answers
import org.mockito.Mockito.*

class EncoderTest {
    private lateinit var encoder: Encoder

    @BeforeEach
    fun setup() {
        encoder = mock(Encoder::class.java, Answers.CALLS_REAL_METHODS)
    }

    @Test
    fun getPosition() {
        //test no position type given
        `when`(
            encoder.getPosition(
                eq(null),
                any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(23.0f to PositionType.POSITION_TYPE_TICKS_COUNT)
        var pos = encoder.getPosition()
        verify(encoder).getPosition()
        assertEquals(23.0f, pos.first)
        assertEquals(PositionType.POSITION_TYPE_TICKS_COUNT, pos.second)

        //test position type given
        `when`(
            encoder.getPosition(
                eq(PositionType.POSITION_TYPE_ANGLE_DEGREES),
                any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(23.0f to PositionType.POSITION_TYPE_ANGLE_DEGREES)
        pos = encoder.getPosition(PositionType.POSITION_TYPE_ANGLE_DEGREES)
        verify(encoder).getPosition(PositionType.POSITION_TYPE_ANGLE_DEGREES)
        assertEquals(23.0f, pos.first)
        assertEquals(PositionType.POSITION_TYPE_ANGLE_DEGREES, pos.second)
    }

    @Test
    fun resetPosition() {
        encoder.resetPosition()
        verify(encoder).resetPosition()
    }

    @Test
    fun getProperties() {
        `when`(encoder.getProperties(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(
            GetPropertiesResponse.newBuilder().setAngleDegreesSupported(true).setTicksCountSupported(true).build()
        )
        val properties = encoder.getProperties()
        verify(encoder).getProperties()
        assertTrue(properties.ticksCountSupported)
        assertTrue(properties.angleDegreesSupported)
    }
}