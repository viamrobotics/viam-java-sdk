package com.viam.sdk.core.component.nswitch

import com.google.protobuf.Struct
import com.google.protobuf.Value
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

class SwitchRPCClientTest {
    private lateinit var switch: Switch
    private lateinit var client: SwitchRPCClient

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        switch = mock(
            Switch::class.java, withSettings().useConstructor("mock-switch").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )
        val resourceManager = ResourceManager(listOf(switch))
        val service = SwitchRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = SwitchRPCClient("mock-switch", BasicManagedChannel(channel))
    }

    @Test
    fun setPosition() {
        val position = 2u
        client.setPosition(position)
        verify(switch).setPosition(position, Struct.getDefaultInstance())
    }

    @Test
    fun getPosition() {
        val position = 3u
        `when`(switch.getPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(position)
        val response = client.getPosition()
        verify(switch).getPosition(Struct.getDefaultInstance())
        assertEquals(position, response)
    }

    @Test
    fun getNumberOfPositions() {
        val positions = 10u
        `when`(switch.getNumberOfPositions(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(positions)
        val response = client.getNumberOfPositions()
        verify(switch).getNumberOfPositions(Struct.getDefaultInstance())
        assertEquals(positions, response)
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(switch).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(switch).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }
}
