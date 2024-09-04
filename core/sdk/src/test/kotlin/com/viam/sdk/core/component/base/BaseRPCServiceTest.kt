package com.viam.sdk.core.component.base

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.component.base.v1.BaseServiceGrpc
import com.viam.component.base.v1.BaseServiceGrpc.BaseServiceBlockingStub
import com.viam.component.base.v1.Base.*
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

class BaseRPCServiceTest {
    private lateinit var base: Base
    private lateinit var client: BaseServiceBlockingStub

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        base = mock(
            Base::class.java, withSettings().useConstructor("mock-base").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )

        val resourceManager = ResourceManager(listOf(base))
        val service = BaseRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        client = BaseServiceGrpc.newBlockingStub(
            grpcCleanupRule.register(
                InProcessChannelBuilder.forName(serviceName).build()
            )
        )
    }

    @Test
    fun moveStraight(){
        val request = MoveStraightRequest.newBuilder().setName(base.name.name).setDistanceMm(22).setMmPerSec(3.0).build()
        client.moveStraight(request)
        verify(base).moveStraight(22, 3.0, Struct.getDefaultInstance())
    }

    @Test
    fun spin(){
        val request = SpinRequest.newBuilder().setName(base.name.name).setAngleDeg(22.2).setDegsPerSec(33.3).build()
        client.spin(request)
        verify(base).spin(22.2, 33.3, Struct.getDefaultInstance())
    }

    @Test
    fun setPower(){
        val linear = Common.Vector3.newBuilder().setX(22.0).setY(22.0).setZ(22.0).build()
        val angular = Common.Vector3.newBuilder().setX(11.0).setY(11.0).setZ(11.0).build()
        val request = SetPowerRequest.newBuilder().setName(base.name.name).setLinear(linear).setAngular(angular).build()
        client.setPower(request)
        verify(base).setPower(linear,angular, Struct.getDefaultInstance())
    }

    @Test
    fun setVelocity(){
        val linear = Common.Vector3.newBuilder().setX(22.0).setY(22.0).setZ(22.0).build()
        val angular = Common.Vector3.newBuilder().setX(11.0).setY(11.0).setZ(11.0).build()
        val request = SetVelocityRequest.newBuilder().setName(base.name.name).setLinear(linear).setAngular(angular).build()
        client.setVelocity(request)
        verify(base).setVelocity(linear,angular, Struct.getDefaultInstance())
    }

    @Test
    fun getProperties(){
        val properties =  GetPropertiesResponse.newBuilder().setWheelCircumferenceMeters(1.2).setWidthMeters(2.3).setTurningRadiusMeters(3.4).build()
        `when`(base.getProperties()).thenReturn(properties)
        val request = GetPropertiesRequest.newBuilder().setName(base.name.name).build()
        val result = client.getProperties(request)
        verify(base).getProperties()
        assertEquals(properties, result)

    }


    @Test
    fun stop() {
        val request = StopRequest.newBuilder().setName(base.name.name).build()
        client.stop(request)
        verify(base).stop(Struct.getDefaultInstance())
    }

    @Test
    fun isMoving() {
        `when`(base.isMoving()).thenReturn(false)
        val request = IsMovingRequest.newBuilder().setName(base.name.name).build()
        val response = client.isMoving(request)
        verify(base).isMoving()
        assertFalse(response.isMoving)
    }

    @Test
    fun doCommand() {
        val command =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        doReturn(command).`when`(base).doCommand(anyMap())
        val request = Common.DoCommandRequest.newBuilder().setName(base.name.name).setCommand(command).build()
        val response = client.doCommand(request)
        verify(base).doCommand(command.fieldsMap)
        assertEquals(command, response.result)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(base).getGeometries(any())
        val request = Common.GetGeometriesRequest.newBuilder().setName(base.name.name).build()
        client.getGeometries(request)
        verify(base).getGeometries(Optional.of(Struct.getDefaultInstance()))
    }
}