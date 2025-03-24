package com.viam.sdk.core.component.button

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.component.button.v1.ButtonServiceGrpc
import com.viam.component.button.v1.ButtonServiceGrpc.ButtonServiceBlockingStub
import com.viam.component.button.v1.PushRequest
import com.viam.sdk.core.resource.ResourceManager
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class ButtonRPCServiceTest {

    private lateinit var button: Button
    private lateinit var client: ButtonServiceBlockingStub

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
        client = ButtonServiceGrpc.newBlockingStub(
            grpcCleanupRule.register(
                InProcessChannelBuilder.forName(serviceName).build()
            )
        )
    }

    @Test
    fun push() {
        val request = PushRequest.newBuilder().setName(button.name.name).build()
        client.push(request)
        verify(button).push(Struct.getDefaultInstance())
    }

    @Test
    fun doCommand() {
        val command =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        doReturn(command).`when`(button).doCommand(anyMap())
        val request = Common.DoCommandRequest.newBuilder().setName(button.name.name).setCommand(command).build()
        val response = client.doCommand(request)
        verify(button).doCommand(command.fieldsMap)
        assertEquals(command, response.result)
    }
}
