package com.viam.sdk.core.component.gantry

import com.google.protobuf.Struct
import com.viam.common.v1.Common.KinematicsFileFormat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Answers
import org.mockito.Mockito.*

class GantryTest {
    private lateinit var gantry: Gantry

    @BeforeEach
    fun setup() {
        gantry = mock(Gantry::class.java, Answers.CALLS_REAL_METHODS)
    }

    @Test
    fun getPosition(){
        `when`(gantry.getPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(listOf(12.3, 23.4))
        val pos = gantry.getPosition()
        verify(gantry).getPosition()
        assertEquals(listOf(12.3, 23.4), pos)

    }

    @Test
    fun moveToPosition(){
        gantry.moveToPosition(listOf(2.0, 3.0), listOf(1.0, 2.0, 3.0))
        verify(gantry).moveToPosition(listOf(2.0, 3.0), listOf(1.0, 2.0, 3.0))

    }

    @Test
    fun home(){
        `when`(gantry.home(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(true)
        val home = gantry.home()
        verify(gantry).home()
        assertEquals(true, home)

    }

    @Test
    fun getLengths(){
        `when`(gantry.getLengths(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(listOf(12.3, 23.4))
        val lengths = gantry.getLengths()
        verify(gantry).getLengths()
        assertEquals(listOf(12.3, 23.4), lengths)

    }

    @Test
    fun stop(){
        gantry.stop()
        verify(gantry).stop()

    }

    @Test
    fun isMoving(){
        `when`(gantry.isMoving()).thenReturn(false)
        val isMoving = gantry.isMoving()
        verify(gantry).isMoving()
        assertFalse(isMoving)

    }

    @Test
    fun getKinematics() {
        val kinematics = (KinematicsFileFormat.KINEMATICS_FILE_FORMAT_SVA to "abc".toByteArray())
        `when`(gantry.getKinematics(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(kinematics)
        val result = gantry.getKinematics()
        verify(gantry).getKinematics()
        assertEquals(kinematics.first, result.first)
        assertTrue(kinematics.second.contentEquals(result.second))
    }
}