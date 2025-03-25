package com.viam.sdk.core.component.button

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

class ButtonRPCClientTest {
    private lateinit var button: Button
    private lateinit var client: ButtonRPCClient

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        button = mock(
            Button::class.java, withSettings().useConstructor("mock-button").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )
        val resourceManager = ResourceManager(listOf(button))
        val service = ButtonRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = ButtonRPCClient("mock-button", BasicManagedChannel(channel))
    }

    @Test
    fun push() {
        client.push()
        verify(button).push(Struct.getDefaultInstance())
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(button).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(button).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }
}
