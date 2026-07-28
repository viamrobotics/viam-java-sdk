package com.viam.sdk.core.component.sensor

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common.Geometry
import com.viam.common.v1.Common.GetReadingsResponse
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

class SensorRPCClientTest {
    private lateinit var sensor: Sensor
    private lateinit var client: SensorRPCClient

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
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = SensorRPCClient("mock-sensor", BasicManagedChannel(channel))
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(sensor).getGeometries(any())
        client.getGeometries(Optional.empty())
        verify(sensor).getGeometries(any())
    }

    @Test
    fun getReadings() {
        val readings = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(GetReadingsResponse.newBuilder().putAllReadings(readings).build()).`when`(sensor).getReadings(any())
        val response = client.getReadings(Optional.empty())
        verify(sensor).getReadings(any())
        assertEquals(readings, response.readingsMap)
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(sensor).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(sensor).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }
}
