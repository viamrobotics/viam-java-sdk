package com.viam.sdk.core.component.posetracker

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.common.v1.Common.PoseInFrame
import com.viam.component.v1.PoseTrackerServiceGrpc
import com.viam.component.v1.PoseTrackerServiceGrpc.PoseTrackerServiceBlockingStub
import com.viam.sdk.core.resource.ResourceManager
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.util.*

class PoseTrackerRPCServiceTest {
    private lateinit var poseTracker: PoseTracker
    private lateinit var client: PoseTrackerServiceBlockingStub

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
        client = PoseTrackerServiceGrpc.newBlockingStub(
            grpcCleanupRule.register(
                InProcessChannelBuilder.forName(serviceName).build()
            )
        )
    }

    @Test
    fun getPoses(){
        val bodyNames = listOf("a", "b")
        val pose = Common.Pose.newBuilder().setX(1.0).setY(1.0).setZ(1.0).setOX(2.0).setOY(2.0).setOZ(2.0).setTheta(3.0).build()
        val poseFrames = mapOf("a" to PoseInFrame.newBuilder().setPose(pose).setReferenceFrame("0").build(),
            "b" to PoseInFrame.newBuilder().setPose(pose).setReferenceFrame("1").build())
        `when`(poseTracker.getPoses(eq(bodyNames), any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(poseFrames)
        val request = com.viam.component.v1.PoseTracker.GetPosesRequest.newBuilder().setName(poseTracker.name.name).addAllBodyNames(bodyNames).build()
        val res = client.getPoses(request)
        verify(poseTracker).getPoses(bodyNames, Struct.getDefaultInstance())
        assertEquals(poseFrames, res.bodyPosesMap)
    }
    @Test
    fun doCommand() {
        val command =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        doReturn(command).`when`(poseTracker).doCommand(anyMap())
        val request = Common.DoCommandRequest.newBuilder().setName(poseTracker.name.name).setCommand(command).build()
        val response = client.doCommand(request)
        verify(poseTracker).doCommand(command.fieldsMap)
        assertEquals(command, response.result)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(poseTracker).getGeometries(any())
        val request = Common.GetGeometriesRequest.newBuilder().setName(poseTracker.name.name).build()
        client.getGeometries(request)
        verify(poseTracker).getGeometries(Optional.of(Struct.getDefaultInstance()))
    }
}