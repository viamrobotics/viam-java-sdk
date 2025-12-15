package com.viam.sdk.core.component.arm

import com.google.protobuf.Struct
import com.viam.common.v1.Common
import com.viam.common.v1.Common.KinematicsFileFormat
import com.viam.component.arm.v1.Arm.JointPositions
import com.viam.sdk.core.component.arm.Arm
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Answers
import org.mockito.Mockito.*

class ArmTest {
    private lateinit var arm: Arm

    @BeforeEach
    fun setup() {
        arm = mock(Arm::class.java, Answers.CALLS_REAL_METHODS)
    }

    @Test
    fun getEndPosition() {
        val pose = Common.Pose.newBuilder().setX(5.0).setY(5.0).setZ(5.0).setTheta(5.0).setOX(5.0).setOY(5.0).setOZ(5.0)
            .build()
        `when`(arm.getEndPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(pose)
        val endPos = arm.getEndPosition()
        verify(arm).getEndPosition()
        assertEquals(pose, endPos)
    }

    @Test
    fun moveToPosition() {
        val pose = Common.Pose.newBuilder().setX(5.0).setY(5.0).setZ(5.0).setTheta(5.0).setOX(5.0).setOY(5.0).setOZ(5.0)
            .build()
        arm.moveToPosition(pose)
        verify(arm).moveToPosition(pose)
    }

    @Test
    fun moveToJointPositions() {
        val positions = JointPositions.newBuilder().addAllValues(listOf(1.0, 8.0, 2.0)).build()
        arm.moveToJointPositions(positions)
        verify(arm).moveToJointPositions(positions)
    }

    @Test
    fun getJointPositions() {
        val positions = JointPositions.newBuilder().addAllValues(listOf(1.0, 8.0, 2.0)).build()
        `when`(arm.getJointPositions(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(positions)
        val jointPos = arm.getJointPositions()
        verify(arm).getJointPositions()
        assertEquals(positions, jointPos)
    }

    @Test
    fun getKinematics() {
        val kinematics = (KinematicsFileFormat.KINEMATICS_FILE_FORMAT_SVA to "abc".toByteArray())
        `when`(arm.getKinematics(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(kinematics)
        val result = arm.getKinematics()
        verify(arm).getKinematics()
        assertEquals(kinematics.first, result.first)
        assertTrue(kinematics.second.contentEquals(result.second))
    }

    @Test
    fun stop() {
        arm.stop()
        verify(arm).stop()
    }

    @Test
    fun isMoving() {
        `when`(arm.isMoving()).thenReturn(false)
        val isMoving = arm.isMoving()
        verify(arm).isMoving()
        assertFalse(isMoving)
    }

}