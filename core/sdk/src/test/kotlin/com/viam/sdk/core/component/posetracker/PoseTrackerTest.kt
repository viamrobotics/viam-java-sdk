package com.viam.sdk.core.component.posetracker

import com.google.protobuf.Struct
import com.viam.common.v1.Common
import com.viam.common.v1.Common.PoseInFrame
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Answers
import org.mockito.Mockito.*

class PoseTrackerTest {
    private lateinit var poseTracker: PoseTracker

    @BeforeEach
    fun setup() {
        poseTracker = mock(PoseTracker::class.java, Answers.CALLS_REAL_METHODS)
    }

    @Test
    fun getPoses(){
        val bodyNames = listOf("a", "b")
        val pose = Common.Pose.newBuilder().setX(1.0).setY(1.0).setZ(1.0).setOX(2.0).setOY(2.0).setOZ(2.0).setTheta(3.0).build()
        val poseFrames = mapOf("a" to PoseInFrame.newBuilder().setPose(pose).setReferenceFrame("0").build(),
            "b" to PoseInFrame.newBuilder().setPose(pose).setReferenceFrame("1").build())
        `when`(poseTracker.getPoses(eq(bodyNames), any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(poseFrames)
        val res = poseTracker.getPoses(bodyNames)
        verify(poseTracker).getPoses(bodyNames, Struct.getDefaultInstance())
        assertEquals(poseFrames, res)
    }
}