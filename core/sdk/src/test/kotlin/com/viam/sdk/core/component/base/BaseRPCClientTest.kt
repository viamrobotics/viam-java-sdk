package com.viam.sdk.core.component.base

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.component.base.v1.Base.*
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.rpc.BasicManagedChannel
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.util.*

class BaseRPCClientTest {

    private lateinit var base: Base
    private lateinit var client: BaseRPCClient

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
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = BaseRPCClient("mock-base", BasicManagedChannel(channel))
    }

    @Test
    fun moveStraight(){
        val extra =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        client.moveStraight(22, 3.0, extra)
        verify(base).moveStraight(22, 3.0, extra)
    }

    @Test
    fun spin(){
        client.spin(22.2, 33.3)
        verify(base).spin(22.2, 33.3, Struct.getDefaultInstance())
    }

    @Test
    fun setPower(){
        val linear = Common.Vector3.newBuilder().setX(22.0).setY(22.0).setZ(22.0).build()
        val angular = Common.Vector3.newBuilder().setX(11.0).setY(11.0).setZ(11.0).build()
        client.setPower(linear, angular)
        verify(base).setPower(linear,angular, Struct.getDefaultInstance())
    }

    @Test
    fun setVelocity(){
        val linear = Common.Vector3.newBuilder().setX(22.0).setY(22.0).setZ(22.0).build()
        val angular = Common.Vector3.newBuilder().setX(11.0).setY(11.0).setZ(11.0).build()
        client.setVelocity(linear, angular)
        verify(base).setVelocity(linear,angular, Struct.getDefaultInstance())
    }

    @Test
    fun getProperties(){
        val properties =  GetPropertiesResponse.newBuilder().setWheelCircumferenceMeters(1.2).setWidthMeters(2.3).setTurningRadiusMeters(3.4).build()
        `when`(base.getProperties()).thenReturn(properties)
        val result = client.getProperties()
        verify(base).getProperties()
        assertEquals(properties, result)

    }

    @Test
    fun stop() {
        client.stop()
        verify(base).stop(Struct.getDefaultInstance())
    }

    @Test
    fun isMoving() {
        `when`(base.isMoving()).thenReturn(false)
        val isMoving = client.isMoving()
        verify(base).isMoving()
        assertFalse(isMoving)
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(base).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(base).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(base).getGeometries(any())
        client.getGeometries(Optional.empty())
        verify(base).getGeometries(any())
    }

}