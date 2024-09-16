package com.viam.sdk.core.component.powersensor
import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.component.powersensor.v1.Powersensor.*
import com.viam.component.powersensor.v1.PowerSensorServiceGrpc
import com.viam.component.powersensor.v1.PowerSensorServiceGrpc.PowerSensorServiceBlockingStub
import com.viam.sdk.core.resource.ResourceManager
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.util.*
class PowerSensorRPCServiceTest {
    private lateinit var powerSensor: PowerSensor
    private lateinit var client: PowerSensorServiceBlockingStub

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
        client = PowerSensorServiceGrpc.newBlockingStub(
            grpcCleanupRule.register(
                InProcessChannelBuilder.forName(serviceName).build()
            )
        )
    }
    @Test
    fun getVoltage(){
        `when`(powerSensor.getVoltage(any<Optional<Struct>>())).thenReturn(AbstractMap.SimpleEntry(3.0, true))
        val request = GetVoltageRequest.newBuilder().setName(powerSensor.name.name).setExtra(extra).build()
        val response = client.getVoltage(request)
        verify(powerSensor).getVoltage(Optional.of(extra))
        assertEquals(3.0, response.volts)
        assertTrue(response.isAc)

    }
    @Test
    fun getCurrent(){
        `when`(powerSensor.getCurrent(any<Optional<Struct>>())).thenReturn(AbstractMap.SimpleEntry(3.0, true))
        val request = GetCurrentRequest.newBuilder().setName(powerSensor.name.name).setExtra(extra).build()
        val response = client.getCurrent(request)
        verify(powerSensor).getCurrent(Optional.of(extra))
        assertEquals(3.0, response.amperes)
        assertTrue(response.isAc)
    }
    @Test
    fun getPower(){
        `when`(powerSensor.getPower(any<Optional<Struct>>())).thenReturn(2.0)
        val request = GetPowerRequest.newBuilder().setName(powerSensor.name.name).setExtra(extra).build()
        val response = client.getPower(request)
        verify(powerSensor).getPower(Optional.of(extra))
        assertEquals(2.0, response.watts)

    }
    @Test
    fun getReadings(){
        val readings = mapOf(
            "a" to 1.0,
            "b" to 2.0,
            "c" to 3.0,
            "d" to mapOf("vec3" to Common.Vector3.newBuilder().setX(1.0).setY(1.0).setZ(1.0).build())
        )
        val struct = Struct.newBuilder().apply{
            putFields("x", Value.newBuilder().setNumberValue(1.0).build())
            putFields("y", Value.newBuilder().setNumberValue(1.0).build())
            putFields("z", Value.newBuilder().setNumberValue(1.0).build())
            putFields("_type", Value.newBuilder().setStringValue("vector3").build())
        }.build()

        val valueReadings = mapOf("a" to Value.newBuilder().setNumberValue(1.0).build(),
            "b" to Value.newBuilder().setNumberValue(2.0).build(),
            "c" to Value.newBuilder().setNumberValue(3.0).build(),
            "d" to Value.newBuilder().setStructValue(Struct.newBuilder().putAllFields(mapOf("vec3" to Value.newBuilder().setStructValue(struct).build()))).build())
        `when`(powerSensor.getReadings(any<Optional<Struct>>())).thenReturn(readings)
        val request = Common.GetReadingsRequest.newBuilder().setName(powerSensor.name.name).setExtra(extra).build()
        val response = client.getReadings(request)
        verify(powerSensor).getReadings(Optional.of(extra))
        assertEquals(valueReadings, response.readingsMap)


    }

    @Test
    fun doCommand() {
        val command =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        doReturn(command).`when`(powerSensor).doCommand(anyMap())
        val request = Common.DoCommandRequest.newBuilder().setName(powerSensor.name.name).setCommand(command).build()
        val response = client.doCommand(request)
        verify(powerSensor).doCommand(command.fieldsMap)
        assertEquals(command, response.result)
    }


}