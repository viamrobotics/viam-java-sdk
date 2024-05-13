package com.viam.sdk.core.component.motor

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.component.motor.v1.Motor.*
import com.viam.component.motor.v1.MotorServiceGrpc
import com.viam.component.motor.v1.MotorServiceGrpc.MotorServiceBlockingStub
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

class MotorRPCServiceTest {
    private lateinit var motor: Motor
    private lateinit var client: MotorServiceBlockingStub

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        motor = mock(
            Motor::class.java, withSettings().useConstructor("mock-motor").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )

        val resourceManager = ResourceManager(listOf(motor))
        val service = MotorRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        client = MotorServiceGrpc.newBlockingStub(
            grpcCleanupRule.register(
                InProcessChannelBuilder.forName(serviceName).build()
            )
        )
    }

    @Test
    fun setPower() {
        val extra =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        val request = SetPowerRequest.newBuilder().setName(motor.name.name).setPowerPct(1.82).setExtra(extra).build()
        client.setPower(request)
        verify(motor).setPower(1.82, extra)
    }

    @Test
    fun goFor() {
        val request = GoForRequest.newBuilder().setName(motor.name.name).setRpm(1.23).setRevolutions(2.34).build()
        client.goFor(request)
        verify(motor).goFor(1.23, 2.34, Struct.getDefaultInstance())
    }

    @Test
    fun goTo() {
        val request =
            GoToRequest.newBuilder().setName(motor.name.name).setRpm(1.01).setPositionRevolutions(2.02).build()
        client.goTo(request)
        verify(motor).goTo(1.01, 2.02, Struct.getDefaultInstance())
    }

    @Test
    fun resetZeroPosition() {
        val request = ResetZeroPositionRequest.newBuilder().setName(motor.name.name).setOffset(2.22).build()
        client.resetZeroPosition(request)
        verify(motor).resetZeroPosition(2.22, Struct.getDefaultInstance())
    }

    @Test
    fun getPosition() {
        `when`(motor.getPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(78.6)
        val request = GetPositionRequest.newBuilder().setName(motor.name.name).build()
        val response = client.getPosition(request)
        verify(motor).getPosition(Struct.getDefaultInstance())
        assertEquals(78.6, response.position)
    }

    @Test
    fun getProperties() {
        `when`(motor.getProperties(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(
            Motor.Properties(
                true
            )
        )
        val request = GetPropertiesRequest.newBuilder().setName(motor.name.name).build()
        val response = client.getProperties(request)
        verify(motor).getProperties(Struct.getDefaultInstance())
        assertTrue(response.positionReporting)
    }

    @Test
    fun stop() {
        val request = StopRequest.newBuilder().setName(motor.name.name).build()
        client.stop(request)
        verify(motor).stop(Struct.getDefaultInstance())
    }

    @Test
    fun isPowered() {
        `when`(motor.isPowered(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(Pair(true, 10.1))
        val request = IsPoweredRequest.newBuilder().setName(motor.name.name).build()
        val response = client.isPowered(request)
        verify(motor).isPowered(Struct.getDefaultInstance())
        assertTrue(response.isOn)
        assertEquals(10.1, response.powerPct)
    }

    @Test
    fun isMoving() {
        `when`(motor.isMoving()).thenReturn(false)
        val request = IsMovingRequest.newBuilder().setName(motor.name.name).build()
        val response = client.isMoving(request)
        assertFalse(response.isMoving)
    }

    @Test
    fun doCommand() {
        val command =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        doReturn(command).`when`(motor).doCommand(anyMap())
        val request = Common.DoCommandRequest.newBuilder().setName(motor.name.name).setCommand(command).build()
        val response = client.doCommand(request)
        verify(motor).doCommand(command.fieldsMap)
        assertEquals(command, response.result)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(motor).getGeometries(any())
        val request = Common.GetGeometriesRequest.newBuilder().setName(motor.name.name).build()
        client.getGeometries(request)
        verify(motor).getGeometries(Optional.of(Struct.getDefaultInstance()))
    }
}
