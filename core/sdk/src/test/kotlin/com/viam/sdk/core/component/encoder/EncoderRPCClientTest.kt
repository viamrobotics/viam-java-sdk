package com.viam.sdk.core.component.encoder

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common.Geometry
import com.viam.component.encoder.v1.Encoder.GetPropertiesResponse
import com.viam.component.encoder.v1.Encoder.PositionType
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.rpc.BasicManagedChannel
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.util.*

class EncoderRPCClientTest {
    private lateinit var encoder: Encoder
    private lateinit var client: EncoderRPCClient

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        encoder = mock(
            Encoder::class.java, withSettings().useConstructor("mock-encoder").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )
        val resourceManager = ResourceManager(listOf(encoder))
        val service = EncoderRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = EncoderRPCClient("mock-encoder", BasicManagedChannel(channel))
    }

    @Test
    fun getPosition() {
        `when`(
            encoder.getPosition(
                eq(null),
                any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(23.0f to PositionType.POSITION_TYPE_TICKS_COUNT)
        var pos = client.getPosition()
        verify(encoder).getPosition(Struct.getDefaultInstance())
        assertEquals(23.0f, pos.first)
        assertEquals(PositionType.POSITION_TYPE_TICKS_COUNT, pos.second)

        `when`(
            encoder.getPosition(
                eq(PositionType.POSITION_TYPE_ANGLE_DEGREES),
                any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(23.0f to PositionType.POSITION_TYPE_ANGLE_DEGREES)
        pos = client.getPosition(PositionType.POSITION_TYPE_ANGLE_DEGREES)
        verify(encoder).getPosition(PositionType.POSITION_TYPE_ANGLE_DEGREES, Struct.getDefaultInstance())
        assertEquals(23.0f, pos.first)
        assertEquals(PositionType.POSITION_TYPE_ANGLE_DEGREES, pos.second)
    }

    @Test
    fun resetPosition() {
        client.resetPosition()
        verify(encoder).resetPosition(Struct.getDefaultInstance())
    }

    @Test
    fun getProperties() {
        `when`(encoder.getProperties(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(
            GetPropertiesResponse.newBuilder().setAngleDegreesSupported(true).setTicksCountSupported(true).build()
        )
        val properties = client.getProperties()
        verify(encoder).getProperties(Struct.getDefaultInstance())
        assertTrue(properties.ticksCountSupported)
        assertTrue(properties.angleDegreesSupported)
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(encoder).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(encoder).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(encoder).getGeometries(any())
        client.getGeometries(Optional.empty())
        verify(encoder).getGeometries(any())
    }
}