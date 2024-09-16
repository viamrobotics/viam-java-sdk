package com.viam.sdk.core.component.base

import com.google.protobuf.Struct
import com.viam.common.v1.Common
import com.viam.component.base.v1.Base.GetPropertiesResponse
import com.viam.sdk.core.component.base.Base
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Answers
import org.mockito.Mockito.*

class BaseTest {
    private lateinit var base: Base

    @BeforeEach
    fun setup() {
        base = mock(Base::class.java, Answers.CALLS_REAL_METHODS)
    }

    @Test
    fun moveStraight(){
        base.moveStraight(22, 3.0)
        verify(base).moveStraight(22, 3.0, Struct.getDefaultInstance())
    }

    @Test
    fun spin(){
        base.spin(22.2, 33.3)
        verify(base).spin(22.2, 33.3, Struct.getDefaultInstance())
    }

    @Test
    fun setPower(){
        val linear = Common.Vector3.newBuilder().setX(22.0).setY(22.0).setZ(22.0).build()
        val angular = Common.Vector3.newBuilder().setX(11.0).setY(11.0).setZ(11.0).build()
        base.setPower(linear,angular)
        verify(base).setPower(linear,angular)
    }

    @Test
    fun setVelocity(){
        val linear = Common.Vector3.newBuilder().setX(22.0).setY(22.0).setZ(22.0).build()
        val angular = Common.Vector3.newBuilder().setX(11.0).setY(11.0).setZ(11.0).build()
        base.setVelocity(linear, angular)
        verify(base).setVelocity(linear,angular)
    }

    @Test
    fun stop(){
        base.stop()
        verify(base).stop()

    }

    @Test
    fun isMoving(){
        `when`(base.isMoving()).thenReturn(false)
        val isMoving = base.isMoving()
        verify(base).isMoving()
        assertFalse(isMoving)
    }

    @Test
    fun getProperties(){
        val properties =  GetPropertiesResponse.newBuilder().setWheelCircumferenceMeters(1.2).setWidthMeters(2.3).setTurningRadiusMeters(3.4).build()

        `when`(base.getProperties()).thenReturn(properties)
        val result = base.getProperties()
        verify(base).getProperties()
        assertEquals(properties, result)
        
    }
}
