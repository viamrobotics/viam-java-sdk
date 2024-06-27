package com.viam.sdk.core.component.board

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common.Geometry
import com.viam.component.board.v1.Board.PowerMode
import com.viam.sdk.core.exception.MethodNotImplementedException
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
import org.junit.jupiter.api.assertThrows
import org.mockito.Mockito.*
import java.time.Instant
import java.util.*
import kotlin.random.Random
import kotlin.time.DurationUnit
import kotlin.time.toDuration

class BoardRPCClientTest {
    private lateinit var board: Board
    private lateinit var client: BoardRPCClient

    @JvmField
    @Rule
    val grpcCleanup: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        board = mock(Board::class.java, withSettings().useConstructor("mock-board").defaultAnswer(CALLS_REAL_METHODS))

        val resourceManager = ResourceManager(listOf(board))
        val service = BoardRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanup.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        val channel = grpcCleanup.register(
            InProcessChannelBuilder.forName(serviceName).directExecutor().build()
        )
        client = BoardRPCClient("mock-board", BasicManagedChannel(channel))
    }

    @Test
    fun setGpioState() {
        val pinName = "test-pin"
        val extra =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        client.setGpioState(pinName, false, extra)
        verify(board).setGpioState(pinName, false, extra)
    }

    @Test
    fun getGpioState() {
        val pinName = "test-pin"
        `when`(
            board.getGpioState(
                eq(pinName) ?: pinName, any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(true)
        val high = client.getGpioState(pinName)
        verify(board).getGpioState(pinName, Struct.getDefaultInstance())
        assertTrue(high)
    }

    @Test
    fun setPwm() {
        val pinName = "test-pin"
        val dutyCyclePct = Random.nextDouble()
        client.setPwm(pinName, dutyCyclePct)
        verify(board).setPwm(pinName, dutyCyclePct, Struct.getDefaultInstance())
    }

    @Test
    fun getPwm() {
        val pinName = "test-pin"
        val dutyCyclePct = Random.nextDouble()
        `when`(board.getPwm(eq(pinName) ?: pinName, any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(
            dutyCyclePct
        )
        val result = client.getPwm(pinName)
        verify(board).getPwm(pinName, Struct.getDefaultInstance())
        assertEquals(result, dutyCyclePct)
    }

    @Test
    fun setPwmFrequency() {
        val pinName = "test-pin"
        val frequencyHz = Random.nextInt()
        client.setPwmFrequency(pinName, frequencyHz)
        verify(board).setPwmFrequency(pinName, frequencyHz, Struct.getDefaultInstance())
    }

    @Test
    fun getPwmFrequency() {
        val pinName = "test-pin"
        val frequencyHz = Random.nextInt()
        `when`(
            board.getPwmFrequency(
                eq(pinName) ?: pinName, any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(frequencyHz)
        val result = client.getPwmFrequency(pinName)
        verify(board).getPwmFrequency(pinName, Struct.getDefaultInstance())
        assertEquals(result, frequencyHz)
    }

    @Test
    fun writeAnalog() {
        val readerName = "reader-name"
        val value = Random.nextInt()
        client.writeAnalog(readerName, value)
        verify(board).writeAnalog(readerName, value, Struct.getDefaultInstance())
    }

    @Test
    fun getAnalogReaderValue() {
        val readerName = "reader-name"
        val value = Random.nextInt()
        `when`(
            board.getAnalogReaderValue(
                eq(readerName) ?: readerName, any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(value)
        val result = client.getAnalogReaderValue(readerName)
        verify(board).getAnalogReaderValue(readerName, Struct.getDefaultInstance())
        assertEquals(result, value)
    }

    @Test
    fun getDigitalInterruptValue() {
        val interruptName = "interrupt-name"
        val value = Random.nextInt()
        `when`(
            board.getDigitalInterruptValue(
                eq(interruptName) ?: interruptName, any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(value)
        val result = client.getDigitalInterruptValue(interruptName)
        verify(board).getDigitalInterruptValue(interruptName, Struct.getDefaultInstance())
        assertEquals(result, value)
    }

    @Test
    fun streamTicks() {
        fun createTicks(interrupts: List<String>): Iterator<Tick> {
            val ticks: MutableList<Tick> = mutableListOf()
            for (i in 0..(interrupts.size * 5)) {
                val idx = i % interrupts.size
                val interrupt = interrupts[idx]
                val value = Random.nextBoolean()
                val time = Instant.now().epochSecond
                ticks.add(Tick.newBuilder().setPinName(interrupt).setHigh(value).setTime(time).build())
            }
            return ticks.iterator()
        }

        val interruptNames = listOf("interrupt-1", "interrupt-2", "interrupt-3")
        `when`(
            board.streamTicks(
                eq(interruptNames) ?: interruptNames, any(Struct::class.java) ?: Struct.getDefaultInstance()
            )
        ).thenReturn(createTicks(interruptNames))
        val ticks = client.streamTicks(interruptNames)
        verify(board).streamTicks(interruptNames, Struct.getDefaultInstance())
        for (tick in ticks) {
            assertTrue(interruptNames.contains(tick.pinName))
        }
    }

    @Test
    fun addCallback() {
        assertThrows<MethodNotImplementedException> {
            client.addCallbacks(listOf(), PriorityQueue())
        }
    }

    @Test
    fun setPowerMode() {
        val powerMode = PowerMode.POWER_MODE_OFFLINE_DEEP
        val powerModeDuration = Random.nextInt().toDuration(DurationUnit.NANOSECONDS)
        client.setPowerMode(powerMode, powerModeDuration)
        verify(board).setPowerMode(powerMode, powerModeDuration, Struct.getDefaultInstance())
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(board).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(board).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(board).getGeometries(any())
        client.getGeometries(Optional.empty())
        verify(board).getGeometries(any())
    }
}
