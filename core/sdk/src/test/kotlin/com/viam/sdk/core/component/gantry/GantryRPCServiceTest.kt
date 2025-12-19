package com.viam.sdk.core.component.gantry

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.common.v1.Common.KinematicsFileFormat
import com.viam.component.gantry.v1.GantryServiceGrpc
import com.viam.component.gantry.v1.GantryServiceGrpc.GantryServiceBlockingStub
import com.viam.component.gantry.v1.Gantry.*
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

class GantryRPCServiceTest {
    private lateinit var gantry: Gantry
    private lateinit var client: GantryServiceBlockingStub

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        gantry = mock(
            Gantry::class.java, withSettings().useConstructor("mock-gantry").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )

        val resourceManager = ResourceManager(listOf(gantry))
        val service = GantryRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        client = GantryServiceGrpc.newBlockingStub(
            grpcCleanupRule.register(
                InProcessChannelBuilder.forName(serviceName).build()
            )
        )
    }
    
    @Test
    fun getPosition(){
        `when`(gantry.getPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(listOf(32.1))
        val request = GetPositionRequest.newBuilder().setName(gantry.name.name).build()
        val response = client.getPosition(request)
        verify(gantry).getPosition(Struct.getDefaultInstance())
        assertEquals(listOf(32.1), response.positionsMmList)

    }

    @Test
    fun moveToPosition(){
        val request = MoveToPositionRequest.newBuilder().setName(gantry.name.name).addAllPositionsMm(listOf(1.2, 3.4)).addAllSpeedsMmPerSec(listOf(5.6, 7.8)).build()
        client.moveToPosition(request)
        verify(gantry).moveToPosition( listOf(1.2, 3.4), listOf(5.6, 7.8), Struct.getDefaultInstance())
    }

    @Test
    fun home(){
        `when`(gantry.home(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(true)
        val request = HomeRequest.newBuilder().setName(gantry.name.name).build()
        val home = client.home(request)
        verify(gantry).home(Struct.getDefaultInstance())
        assertEquals(true, home.homed)

    }

    @Test
    fun getLengths(){
        `when`(gantry.getLengths(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(listOf(32.1))
        val request = GetLengthsRequest.newBuilder().setName(gantry.name.name).build()
        val response = client.getLengths(request)
        verify(gantry).getLengths(Struct.getDefaultInstance())
        assertEquals(listOf(32.1), response.lengthsMmList)

    }

    @Test
    fun stop(){
        val request = StopRequest.newBuilder().setName(gantry.name.name).build()
        client.stop(request)
        verify(gantry).stop(Struct.getDefaultInstance())

    }

    @Test
    fun isMoving(){
        `when`(gantry.isMoving()).thenReturn(false)
        val request = IsMovingRequest.newBuilder().setName(gantry.name.name).build()
        val response = client.isMoving(request)
        verify(gantry).isMoving()
        assertFalse(response.isMoving)

    }

    @Test
    fun doCommand() {
        val command =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        doReturn(command).`when`(gantry).doCommand(anyMap())
        val request = Common.DoCommandRequest.newBuilder().setName(gantry.name.name).setCommand(command).build()
        val response = client.doCommand(request)
        verify(gantry).doCommand(command.fieldsMap)
        assertEquals(command, response.result)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(gantry).getGeometries(any())
        val request = Common.GetGeometriesRequest.newBuilder().setName(gantry.name.name).build()
        client.getGeometries(request)
        verify(gantry).getGeometries(Optional.of(Struct.getDefaultInstance()))
    }

    @Test
    fun getKinematics() {
        val kinematics = (KinematicsFileFormat.KINEMATICS_FILE_FORMAT_SVA to "abc".toByteArray())
        `when`(gantry.getKinematics(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(kinematics)
        val request = Common.GetKinematicsRequest.newBuilder().setName(gantry.name.name).build()
        val response = this.client.getKinematics(request)
        verify(gantry).getKinematics(Struct.getDefaultInstance())
        assertEquals(kinematics.first, response.format)
        assertTrue(kinematics.second.contentEquals(response.kinematicsData.toByteArray()))

    }
}