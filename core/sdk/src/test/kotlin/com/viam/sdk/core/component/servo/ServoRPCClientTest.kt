package com.viam.sdk.core.component.servo

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common.Geometry
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

class ServoRPCClientTest {
    private lateinit var servo: Servo
    private lateinit var client: ServoRPCClient

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        servo = mock(
            Servo::class.java, withSettings().useConstructor("mock-servo").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )
        val resourceManager = ResourceManager(listOf(servo))
        val service = ServoRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = ServoRPCClient("mock-servo", BasicManagedChannel(channel))
    }

    @Test
    fun move(){
        val extra =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        client.move(20, extra)
        verify(servo).move(20, extra)

    }

    @Test
    fun stop() {
        client.stop()
        verify(servo).stop(Struct.getDefaultInstance())
    }

    @Test
    fun isMoving() {
        `when`(servo.isMoving()).thenReturn(false)
        val isMoving = client.isMoving()
        verify(servo).isMoving()
        assertFalse(isMoving)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(servo).getGeometries(any())
        client.getGeometries(Optional.empty())
        verify(servo).getGeometries(any())
    }

    @Test
    fun getPosition() {
        `when`(servo.getPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(80)
        val pos = client.getPosition()
        verify(servo).getPosition(Struct.getDefaultInstance())
        assertEquals(80, pos)
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(servo).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(servo).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }


}
