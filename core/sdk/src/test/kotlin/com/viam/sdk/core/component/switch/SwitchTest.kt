package com.viam.sdk.core.component.switch

import com.google.protobuf.Struct
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.mockito.Answers
import org.mockito.Mockito.*

class SwitchTest {
    private lateinit var switch: Switch

    @BeforeEach
    fun setup() {
        switch = mock(Switch::class.java, Answers.CALLS_REAL_METHODS)
    }

    @Test
    fun getPosition() {
        val position = 3u
        `when`(switch.getPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(position)
        val result = switch.getPosition()
        verify(switch).getPosition()
        assertEquals(position, result)
    }

    @Test
    fun setPosition() {
        val position = 2u
        switch.setPosition(position)
        verify(switch).setPosition(position)
    }

    @Test
    fun getNumberOfPositions() {
        val positions = 10u
        `when`(switch.getNumberOfPositions(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(positions)
        val result = switch.getNumberOfPositions()
        verify(switch).getNumberOfPositions()
        assertEquals(positions, result)
    }
}
