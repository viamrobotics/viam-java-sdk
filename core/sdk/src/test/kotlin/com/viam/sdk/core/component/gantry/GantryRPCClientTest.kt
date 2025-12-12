package com.viam.sdk.core.component.gantry

import com.google.protobuf.ByteString
import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common.Geometry
import com.viam.common.v1.Common.KinematicsFileFormat
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.rpc.BasicManagedChannel
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.util.*

class GantryRPCClientTest {
    private lateinit var gantry: Gantry
    private lateinit var client: GantryRPCClient

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
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = GantryRPCClient("mock-gantry", BasicManagedChannel(channel))
    }


    @Test
    fun getPosition(){
        `when`(gantry.getPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(listOf(2.3, 1.2))
        val pos = client.getPosition()
        verify(gantry).getPosition(Struct.getDefaultInstance())
        assertEquals(listOf(2.3, 1.2), pos)

    }

    @Test
    fun moveToPosition(){
        client.moveToPosition(listOf(1.2, 3.4), listOf(5.6, 7.8))
        verify(gantry).moveToPosition( listOf(1.2, 3.4), listOf(5.6, 7.8), Struct.getDefaultInstance())

    }

    @Test
    fun home(){
        `when`(gantry.home(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(true)
        val home = client.home()
        verify(gantry).home(Struct.getDefaultInstance())
        assertEquals(true, home)

    }

    @Test
    fun getLengths(){
        `when`(gantry.getLengths(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(listOf(32.1))
        val response = client.getLengths()
        verify(gantry).getLengths(Struct.getDefaultInstance())
        assertEquals(listOf(32.1), response)
    }

    @Test
    fun stop(){
        client.stop()
        verify(gantry).stop(Struct.getDefaultInstance())

    }

    @Test
    fun isMoving(){
        `when`(gantry.isMoving()).thenReturn(false)
        val isMoving = client.isMoving()
        verify(gantry).isMoving()
        assertFalse(isMoving)

    }
    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(gantry).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(gantry).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(gantry).getGeometries(any())
        client.getGeometries(Optional.empty())
        verify(gantry).getGeometries(any())
    }

    @Test
    fun getKinematics() {
        val kinematics = (KinematicsFileFormat.KINEMATICS_FILE_FORMAT_SVA to ByteString.copyFromUtf8("abc"))
        `when`(gantry.getKinematics(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(kinematics)
        val response = client.getKinematics()
        verify(gantry).getKinematics(Struct.getDefaultInstance())
        assertEquals(kinematics, response)
    }
}