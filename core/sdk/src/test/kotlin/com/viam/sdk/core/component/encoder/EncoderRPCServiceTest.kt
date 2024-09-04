package com.viam.sdk.core.component.encoder

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.component.encoder.v1.EncoderServiceGrpc
import com.viam.component.encoder.v1.EncoderServiceGrpc.EncoderServiceBlockingStub
import com.viam.component.encoder.v1.Encoder.*
import com.viam.sdk.core.resource.ResourceManager
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

class EncoderRPCServiceTest {
    private lateinit var encoder: Encoder
    private lateinit var client: EncoderServiceBlockingStub

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
        client = EncoderServiceGrpc.newBlockingStub(
            grpcCleanupRule.register(
                InProcessChannelBuilder.forName(serviceName).build()
            )
        )
    }

    @Test
    fun getPosition(){
        `when`(encoder.getPosition(eq(null),any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(23.0f to PositionType.POSITION_TYPE_TICKS_COUNT)
        var request = GetPositionRequest.newBuilder().setName(encoder.name.name).build()
        var pos = client.getPosition(request)
        verify(encoder).getPosition(Struct.getDefaultInstance())
        assertEquals(23.0f, pos.value)
        assertEquals(PositionType.POSITION_TYPE_TICKS_COUNT, pos.positionType)

        `when`(encoder.getPosition(eq(PositionType.POSITION_TYPE_ANGLE_DEGREES),any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(23.0f to PositionType.POSITION_TYPE_ANGLE_DEGREES)
        request = GetPositionRequest.newBuilder().setName(encoder.name.name).setPositionType(PositionType.POSITION_TYPE_ANGLE_DEGREES).build()
        pos = client.getPosition(request)
        verify(encoder).getPosition(PositionType.POSITION_TYPE_ANGLE_DEGREES, Struct.getDefaultInstance())
        assertEquals(23.0f, pos.value)
        assertEquals(PositionType.POSITION_TYPE_ANGLE_DEGREES, pos.positionType)
    }
    
    @Test
    fun resetPosition(){
        val request = ResetPositionRequest.newBuilder().setName(encoder.name.name).build()
        client.resetPosition(request)
        verify(encoder).resetPosition(Struct.getDefaultInstance())
    }
    
    @Test
    fun getProperties(){
        `when`(encoder.getProperties(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(
            GetPropertiesResponse.newBuilder().setAngleDegreesSupported(true).setTicksCountSupported(true).build())
        val request = GetPropertiesRequest.newBuilder().setName(encoder.name.name).build()
        val properties = client.getProperties(request)
        verify(encoder).getProperties(Struct.getDefaultInstance())
        assertTrue(properties.ticksCountSupported)
        assertTrue(properties.angleDegreesSupported)
    }
    
    @Test
    fun doCommand(){
        val command =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        doReturn(command).`when`(encoder).doCommand(anyMap())
        val request = Common.DoCommandRequest.newBuilder().setName(encoder.name.name).setCommand(command).build()
        val response = client.doCommand(request)
        verify(encoder).doCommand(command.fieldsMap)
        assertEquals(command, response.result)
    }
    
    @Test
    fun getGeometries(){
        doReturn(listOf<Geometry>()).`when`(encoder).getGeometries(any())
        val request = Common.GetGeometriesRequest.newBuilder().setName(encoder.name.name).build()
        client.getGeometries(request)
        verify(encoder).getGeometries(Optional.of(Struct.getDefaultInstance()))
    }
}