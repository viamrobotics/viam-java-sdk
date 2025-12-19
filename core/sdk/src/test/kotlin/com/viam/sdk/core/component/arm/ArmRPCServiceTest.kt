package com.viam.sdk.core.component.arm

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.common.v1.Common.KinematicsFileFormat
import com.viam.component.arm.v1.Arm.*
import com.viam.component.arm.v1.ArmServiceGrpc
import com.viam.component.arm.v1.ArmServiceGrpc.ArmServiceBlockingStub
import com.viam.sdk.core.component.arm.Arm
import com.viam.sdk.core.resource.ResourceManager
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.util.*

class ArmRPCServiceTest {

    private lateinit var arm: Arm
    private lateinit var client: ArmServiceBlockingStub

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        arm = mock(
            Arm::class.java, withSettings().useConstructor("mock-arm").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )

        val resourceManager = ResourceManager(listOf(arm))
        val service = ArmRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        client = ArmServiceGrpc.newBlockingStub(
            grpcCleanupRule.register(
                InProcessChannelBuilder.forName(serviceName).build()
            )
        )
    }

    @Test
    fun moveToPosition() {
        val pose = Common.Pose.newBuilder().setX(5.0).setY(5.0).setZ(5.0).setTheta(5.0).setOX(5.0).setOY(5.0).setOZ(5.0)
            .build()
        val request = MoveToPositionRequest.newBuilder().setName(arm.name.name).setTo(pose).build()
        this.client.moveToPosition(request)
        verify(arm).moveToPosition(pose, Struct.getDefaultInstance())
    }

    @Test
    fun getEndPosition() {
        val pose = Common.Pose.newBuilder().setX(5.0).setY(5.0).setZ(5.0).setTheta(5.0).setOX(5.0).setOY(5.0).setOZ(5.0)
            .build()
        `when`(arm.getEndPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(pose)
        val request = GetEndPositionRequest.newBuilder().setName(arm.name.name).build()
        val response = this.client.getEndPosition(request)
        verify(arm).getEndPosition(Struct.getDefaultInstance())
        assertEquals(pose, response.pose)
    }

    @Test
    fun moveToJointPositions() {
        val positions = JointPositions.newBuilder().addAllValues(listOf(1.0, 8.0, 2.0)).build()
        val request = MoveToJointPositionsRequest.newBuilder().setName(arm.name.name).setPositions(positions).build()
        this.client.moveToJointPositions(request)
        verify(arm).moveToJointPositions(positions, Struct.getDefaultInstance())
    }

    @Test
    fun getJointPositions() {
        val positions = JointPositions.newBuilder().addAllValues(listOf(1.0, 8.0, 2.0)).build()
        `when`(arm.getJointPositions(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(positions)
        val request = GetJointPositionsRequest.newBuilder().setName(arm.name.name).build()
        val response = this.client.getJointPositions(request)
        verify(arm).getJointPositions(Struct.getDefaultInstance())
        assertEquals(positions, response.positions)
    }

    @Test
    fun getKinematics() {
        val kinematics = (KinematicsFileFormat.KINEMATICS_FILE_FORMAT_SVA to "abc".toByteArray())
        `when`(arm.getKinematics(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(kinematics)
        val request = Common.GetKinematicsRequest.newBuilder().setName(arm.name.name).build()
        val response = this.client.getKinematics(request)
        verify(arm).getKinematics(Struct.getDefaultInstance())
        assertEquals(kinematics.first, response.format)
        assertTrue(kinematics.second.contentEquals(response.kinematicsData.toByteArray()))

    }

    @Test
    fun stop() {
        val request = StopRequest.newBuilder().setName(arm.name.name).build()
        client.stop(request)
        verify(arm).stop(Struct.getDefaultInstance())
    }


    @Test
    fun isMoving() {
        `when`(arm.isMoving()).thenReturn(false)
        val request = IsMovingRequest.newBuilder().setName(arm.name.name).build()
        val response = client.isMoving(request)
        assertFalse(response.isMoving)
    }

    @Test
    fun doCommand() {
        val command =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        doReturn(command).`when`(arm).doCommand(anyMap())
        val request = Common.DoCommandRequest.newBuilder().setName(arm.name.name).setCommand(command).build()
        val response = client.doCommand(request)
        verify(arm).doCommand(command.fieldsMap)
        assertEquals(command, response.result)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(arm).getGeometries(any())
        val request = Common.GetGeometriesRequest.newBuilder().setName(arm.name.name).build()
        client.getGeometries(request)
        verify(arm).getGeometries(Optional.of(Struct.getDefaultInstance()))
    }
}