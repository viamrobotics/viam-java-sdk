package com.viam.sdk.core.component.motor

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common.Geometry
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

class MotorRPCClientTest {
    private lateinit var motor: Motor
    private lateinit var client: MotorRPCClient

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        motor = mock(
            Motor::class.java, withSettings().useConstructor("mock-motor").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )
        val resourceManager = ResourceManager(listOf(motor))
        val service = MotorRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = MotorRPCClient("mock-motor", BasicManagedChannel(channel))
    }

    @Test
    fun setPower() {
        val extra =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        client.setPower(1.82, extra)
        verify(motor).setPower(1.82, extra)
    }

    @Test
    fun goTo() {
        client.goTo(1.23, 2.34)
        verify(motor).goTo(1.23, 2.34, Struct.getDefaultInstance())
    }

    @Test
    fun resetZeroPosition() {
        client.resetZeroPosition(44.0)
        verify(motor).resetZeroPosition(44.0, Struct.getDefaultInstance())
    }

    @Test
    fun getPosition() {
        `when`(motor.getPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(78.6)
        val pos = client.getPosition()
        verify(motor).getPosition(Struct.getDefaultInstance())
        assertEquals(78.6, pos)
    }

    @Test
    fun getProperties() {
        `when`(motor.getProperties(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(
            Motor.Properties(
                positionReporting = true
            )
        )
        val properties = client.getProperties()
        verify(motor).getProperties(Struct.getDefaultInstance())
        assertTrue(properties.positionReporting)
    }

    @Test
    fun stop() {
        client.stop()
        verify(motor).stop(Struct.getDefaultInstance())
    }

    @Test
    fun isPowered() {
        `when`(motor.isPowered(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(Pair(true, 10.1))
        val isPowered = client.isPowered()
        verify(motor).isPowered(Struct.getDefaultInstance())
        assertTrue(isPowered.first)
        assertEquals(10.1, isPowered.second)
    }

    @Test
    fun isMoving() {
        `when`(motor.isMoving()).thenReturn(false)
        val isMoving = client.isMoving()
        verify(motor).isMoving()
        assertFalse(isMoving)
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(motor).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(motor).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(motor).getGeometries(any())
        client.getGeometries(Optional.empty())
        verify(motor).getGeometries(any())
    }
}
