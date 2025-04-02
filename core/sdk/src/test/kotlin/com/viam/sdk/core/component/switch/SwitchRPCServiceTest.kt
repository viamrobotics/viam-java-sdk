package com.viam.sdk.core.component.nswitch

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.component.nswitch.v1.*
import com.viam.component.nswitch.v1.SwitchServiceGrpc
import com.viam.component.nswitch.v1.SwitchServiceGrpc.SwitchServiceBlockingStub
import com.viam.sdk.core.resource.ResourceManager
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class SwitchRPCServiceTest {

    private lateinit var switch: Switch
    private lateinit var client: SwitchServiceBlockingStub

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
        client = SwitchServiceGrpc.newBlockingStub(
            grpcCleanupRule.register(
                InProcessChannelBuilder.forName(serviceName).build()
            )
        )
    }

    @Test
    fun setPosition() {
        val position = 2u
        val request = SetPositionRequest.newBuilder()
            .setName(switch.name.name)
            .setPosition(position.toInt())
            .build()
        client.setPosition(request)
        verify(switch).setPosition(position, Struct.getDefaultInstance())
    }

    @Test
    fun getPosition() {
        val position = 3u
        `when`(switch.getPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(position)
        val request = GetPositionRequest.newBuilder().setName(switch.name.name).build()
        val response = client.getPosition(request)
        verify(switch).getPosition(Struct.getDefaultInstance())
        assertEquals(position.toInt(), response.position)
    }

    @Test
    fun getNumberOfPositions() {
        val positions = 10u
        `when`(switch.getNumberOfPositions(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(positions)
        val request = GetNumberOfPositionsRequest.newBuilder().setName(switch.name.name).build()
        val response = client.getNumberOfPositions(request)
        verify(switch).getNumberOfPositions(Struct.getDefaultInstance())
        assertEquals(positions.toInt(), response.numberOfPositions)
    }

    @Test
    fun doCommand() {
        val command =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        doReturn(command).`when`(switch).doCommand(anyMap())
        val request = Common.DoCommandRequest.newBuilder().setName(switch.name.name).setCommand(command).build()
        val response = client.doCommand(request)
        verify(switch).doCommand(command.fieldsMap)
        assertEquals(command, response.result)
    }
}
