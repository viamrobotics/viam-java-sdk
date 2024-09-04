package com.viam.sdk.core.component.arm

import com.google.protobuf.ByteString
import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.common.v1.Common.KinematicsFileFormat
import com.viam.component.arm.v1.Arm.*
import com.viam.sdk.core.component.arm.Arm
import com.viam.sdk.core.component.arm.ArmRPCClient
import com.viam.sdk.core.component.arm.ArmRPCService
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.rpc.BasicManagedChannel
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.util.*

class ArmRPCClientTest {
    private lateinit var arm: Arm
    private lateinit var client: ArmRPCClient

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
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = ArmRPCClient("mock-arm", BasicManagedChannel(channel))
    }


    @Test
    fun moveToPosition(){
        val pose = Common.Pose.newBuilder().setX(5.0).setY(5.0).setZ(5.0).setTheta(5.0).setOX(5.0).setOY(5.0).setOZ(5.0).build()
        client.moveToPosition(pose)
        verify(arm).moveToPosition(pose, Struct.getDefaultInstance())

    }
    @Test
    fun getEndPosition(){
        val pose = Common.Pose.newBuilder().setX(5.0).setY(5.0).setZ(5.0).setTheta(5.0).setOX(5.0).setOY(5.0).setOZ(5.0).build()
        `when`(arm.getEndPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(pose)
        val response = client.getEndPosition()
        verify(arm).getEndPosition(Struct.getDefaultInstance())
        assertEquals(pose, response)
    }

    @Test
    fun moveToJointPositions(){
        val positions = JointPositions.newBuilder().addAllValues(listOf(1.0, 8.0, 2.0)).build()
        client.moveToJointPositions(positions)
        verify(arm).moveToJointPositions(positions, Struct.getDefaultInstance())
    }

    @Test
    fun getJointPositions(){
        val positions = JointPositions.newBuilder().addAllValues(listOf(1.0, 8.0, 2.0)).build()
        `when`(arm.getJointPositions(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(positions)
        val response = client.getJointPositions()
        verify(arm).getJointPositions(Struct.getDefaultInstance())
        assertEquals(positions, response)
    }

    @Test
    fun getKinematics(){
        val kinematics = (KinematicsFileFormat.KINEMATICS_FILE_FORMAT_SVA to ByteString.copyFromUtf8("abc"))
        `when`(arm.getKinematics(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(kinematics)
        val response = client.getKinematics()
        verify(arm).getKinematics(Struct.getDefaultInstance())
        assertEquals(kinematics, response)

    }


    @Test
    fun stop() {
        client.stop()
        verify(arm).stop(Struct.getDefaultInstance())
    }

    @Test
    fun isMoving() {
        `when`(arm.isMoving()).thenReturn(false)
        val isMoving = client.isMoving()
        verify(arm).isMoving()
        assertFalse(isMoving)
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(arm).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(arm).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(arm).getGeometries(any())
        client.getGeometries(Optional.empty())
        verify(arm).getGeometries(any())
    }
}