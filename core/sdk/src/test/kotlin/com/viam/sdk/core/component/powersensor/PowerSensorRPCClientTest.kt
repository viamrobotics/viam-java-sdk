package com.viam.sdk.core.component.powersensor

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
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
import java.util.AbstractMap

class PowerSensorRPCClientTest {
    private lateinit var powerSensor: PowerSensor
    private lateinit var client: PowerSensorRPCClient

    val extra =
        Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        powerSensor = mock(
            PowerSensor::class.java, withSettings().useConstructor("mock-powersensor").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )
        val resourceManager = ResourceManager(listOf(powerSensor))
        val service = PowerSensorRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = PowerSensorRPCClient("mock-powersensor", BasicManagedChannel(channel))
    }

    @Test
    fun getVoltage() {
        `when`(powerSensor.getVoltage(any<Optional<Struct>>())).thenReturn(AbstractMap.SimpleEntry(3.0, true))
        val response = client.getVoltage(Optional.of(extra))
        verify(powerSensor).getVoltage(Optional.of(extra))
        assertEquals(3.0, response.key)
        assertTrue(response.value)
    }

    @Test
    fun getCurrent() {
        `when`(powerSensor.getCurrent(any<Optional<Struct>>())).thenReturn(AbstractMap.SimpleEntry(3.0, true))
        val response = client.getCurrent(Optional.of(extra))
        verify(powerSensor).getCurrent(Optional.of(extra))
        assertEquals(3.0, response.key)
        assertTrue(response.value)

    }

    @Test
    fun getPower() {
        `when`(powerSensor.getPower(any<Optional<Struct>>())).thenReturn(2.1)
        val response = client.getPower(Optional.of(extra))
        verify(powerSensor).getPower(Optional.of(extra))
        assertEquals(2.1, response)
    }

    @Test
    fun getReadings() {
        val readings = mapOf(
            "a" to 1.0,
            "b" to 2.0,
            "c" to 3.0,
            "d" to mapOf("vec3" to Common.Vector3.newBuilder().setX(1.0).setY(1.0).setZ(1.0).build())
        )
        `when`(powerSensor.getReadings(any<Optional<Struct>>())).thenReturn(readings)
        val response = client.getReadings(Optional.of(extra))
        verify(powerSensor).getReadings(Optional.of(extra))
        assertEquals(readings, response)

    }

    @Test
    fun doCommand() {
        val command = mapOf("abc" to Value.newBuilder().setStringValue("123").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(powerSensor).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(powerSensor).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }

}