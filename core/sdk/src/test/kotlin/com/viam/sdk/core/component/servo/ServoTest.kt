package com.viam.sdk.core.component.servo

import com.google.protobuf.Struct
import com.google.protobuf.Value
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Answers
import org.mockito.Mockito.*

class ServoTest {
    private lateinit var servo: Servo

    @BeforeEach
    fun setup() {
        servo = mock(Servo::class.java, Answers.CALLS_REAL_METHODS)
    }
    @Test
    fun move(){
        val extra =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        servo.move(20, extra)
        verify(servo).move(20, extra)
    }
    @Test
    fun isMoving(){
        `when`(servo.isMoving()).thenReturn(false)
        val isMoving = servo.isMoving()
        verify(servo).isMoving()
        assertFalse(isMoving)

    }

    @Test
    fun getPosition(){
        val extra =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        `when`(servo.getPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(80)
        val pos = servo.getPosition(extra)
        verify(servo).getPosition(extra)
        assertEquals(80, pos)

    }

    @Test
    fun stop(){
        servo.stop()
        verify(servo).stop()
    }

}