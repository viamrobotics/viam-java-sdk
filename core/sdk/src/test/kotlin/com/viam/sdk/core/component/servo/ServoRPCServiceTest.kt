package com.viam.sdk.core.component.servo

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.component.servo.v1.Servo.StopRequest
import com.viam.component.servo.v1.Servo.GetPositionRequest
import com.viam.component.servo.v1.Servo.IsMovingRequest
import com.viam.component.servo.v1.ServoServiceGrpc
import com.viam.component.servo.v1.ServoServiceGrpc.ServoServiceBlockingStub
import com.viam.sdk.core.resource.ResourceManager
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.util.*

class ServoRPCServiceTest {
    private lateinit var servo: Servo
    private lateinit var client: ServoServiceBlockingStub

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        servo = mock(
            Servo::class.java, withSettings().useConstructor("mock-servo").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )

        val resourceManager = ResourceManager(listOf(servo))
        val service = ServoRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        client = ServoServiceGrpc.newBlockingStub(
            grpcCleanupRule.register(
                InProcessChannelBuilder.forName(serviceName).build()
            )
        )
    }

    @Test
    fun move(){
        val extra =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        val request = com.viam.component.servo.v1.Servo.MoveRequest.newBuilder().setName(servo.name.name).setAngleDeg(20).setExtra(extra).build()
        client.move(request)
        verify(servo).move(20, extra)
    }

    @Test
    fun isMoving(){
        `when`(servo.isMoving()).thenReturn(false)
        val request = IsMovingRequest.newBuilder().setName(servo.name.name).build()
        val response = client.isMoving(request)
        verify(servo).isMoving()
        assertFalse(response.isMoving)
    }

    @Test
    fun getPosition(){
        `when`(servo.getPosition(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(80)
        val request = GetPositionRequest.newBuilder().setName(servo.name.name).build()
        val response = client.getPosition(request)
        verify(servo).getPosition(Struct.getDefaultInstance())
        assertEquals(80, response.positionDeg)
    }

    @Test
    fun stop(){
        val request = StopRequest.newBuilder().setName(servo.name.name).build()
        client.stop(request)
        verify(servo).stop()
    }
    
    @Test
    fun getGeometries(){
        doReturn(listOf<Geometry>()).`when`(servo).getGeometries(any())
        val request = Common.GetGeometriesRequest.newBuilder().setName(servo.name.name).build()
        client.getGeometries(request)
        verify(servo).getGeometries(Optional.of(Struct.getDefaultInstance()))
    }

}