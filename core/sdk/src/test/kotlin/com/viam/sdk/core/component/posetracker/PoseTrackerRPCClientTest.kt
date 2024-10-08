package com.viam.sdk.core.component.posetracker

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.common.v1.Common.PoseInFrame
import com.viam.sdk.core.component.posetracker.*;
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.rpc.BasicManagedChannel
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.util.*

class PoseTrackerRPCClientTest {
    private lateinit var poseTracker: PoseTracker
    private lateinit var client: PoseTrackerRPCClient

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        poseTracker = mock(
            PoseTracker::class.java, withSettings().useConstructor("mock-poseTracker").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )
        val resourceManager = ResourceManager(listOf(poseTracker))
        val service = PoseTrackerRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = PoseTrackerRPCClient("mock-poseTracker", BasicManagedChannel(channel))
    }

    @Test
    fun getPoses(){
        val bodyNames = listOf("a", "b")
        val pose = Common.Pose.newBuilder().setX(1.0).setY(1.0).setZ(1.0).setOX(2.0).setOY(2.0).setOZ(2.0).setTheta(3.0).build()
        val poseFrames = mapOf("a" to PoseInFrame.newBuilder().setPose(pose).setReferenceFrame("0").build(),
            "b" to PoseInFrame.newBuilder().setPose(pose).setReferenceFrame("1").build())
        `when`(poseTracker.getPoses(eq(bodyNames), any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(poseFrames)
        val res = client.getPoses(bodyNames)
        verify(poseTracker).getPoses(bodyNames, Struct.getDefaultInstance())
        assertEquals(poseFrames, res)
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(poseTracker).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(poseTracker).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(poseTracker).getGeometries(any())
        client.getGeometries(Optional.empty())
        verify(poseTracker).getGeometries(any())
    }
}