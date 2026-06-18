package com.viam.sdk.core.component.sensor

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.common.v1.Common.GetReadingsRequest
import com.viam.common.v1.Common.GetReadingsResponse
import com.viam.component.sensor.v1.SensorServiceGrpc
import com.viam.component.sensor.v1.SensorServiceGrpc.SensorServiceBlockingStub
import com.viam.sdk.core.resource.ResourceManager
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.util.*

class SensorRPCServiceTest {
    private lateinit var sensor: Sensor
    private lateinit var client: SensorServiceBlockingStub

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        sensor = mock(
            Sensor::class.java, withSettings().useConstructor("mock-sensor").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )

        val resourceManager = ResourceManager(listOf(sensor))
        val service = SensorRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        client = SensorServiceGrpc.newBlockingStub(
            grpcCleanupRule.register(
                InProcessChannelBuilder.forName(serviceName).build()
            )
        )
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(sensor).getGeometries(any())
        val request = Common.GetGeometriesRequest.newBuilder().setName(sensor.name.name).build()
        client.getGeometries(request)
        verify(sensor).getGeometries(Optional.of(Struct.getDefaultInstance()))
    }

    @Test
    fun getReadings() {
        val readings = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(GetReadingsResponse.newBuilder().putAllReadings(readings).build()).`when`(sensor).getReadings(any())
        val request = GetReadingsRequest.newBuilder().setName(sensor.name.name).build()
        val response = client.getReadings(request)
        verify(sensor).getReadings(Optional.of(Struct.getDefaultInstance()))
        assertEquals(readings, response.readingsMap)
    }

    @Test
    fun doCommand() {
        val command =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        doReturn(command).`when`(sensor).doCommand(anyMap())
        val request = Common.DoCommandRequest.newBuilder().setName(sensor.name.name).setCommand(command).build()
        val response = client.doCommand(request)
        verify(sensor).doCommand(command.fieldsMap)
        assertEquals(command, response.result)
    }
}
