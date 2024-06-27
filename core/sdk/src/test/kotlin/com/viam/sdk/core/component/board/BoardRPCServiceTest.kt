package com.viam.sdk.core.component.board

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.component.board.v1.Board.*
import com.viam.component.board.v1.BoardServiceGrpc
import com.viam.component.board.v1.BoardServiceGrpc.BoardServiceBlockingStub
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.util.Durations
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.time.Instant
import java.util.*
import kotlin.random.Random
import kotlin.time.DurationUnit
import kotlin.time.toDuration


class BoardRPCServiceTest {

    private lateinit var board: Board
    private lateinit var client: BoardServiceBlockingStub

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
        client = BoardServiceGrpc.newBlockingStub(
            grpcCleanup.register(
                InProcessChannelBuilder.forName(serviceName).directExecutor().build()
            )
        )
    }


    @Test
    fun setGpioState() {
        val pinName = "test-pin"
        val extra =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        val request =
            SetGPIORequest.newBuilder().setName(board.name.name).setPin(pinName).setHigh(false).setExtra(extra).build()
        client.setGPIO(request)
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
        val request = GetGPIORequest.newBuilder().setName(board.name.name).setPin(pinName).build()
        val response = client.getGPIO(request)
        verify(board).getGpioState(pinName, Struct.getDefaultInstance())
        assertTrue(response.high)
    }

    @Test
    fun setPwm() {
        val pinName = "test-pin"
        val dutyCyclePct = Random.nextDouble()
        val request =
            SetPWMRequest.newBuilder().setName(board.name.name).setPin(pinName).setDutyCyclePct(dutyCyclePct).build()
        client.setPWM(request)
        verify(board).setPwm(pinName, dutyCyclePct, Struct.getDefaultInstance())
    }

    @Test
    fun getPwm() {
        val pinName = "test-pin"
        val dutyCyclePct = Random.nextDouble()
        `when`(board.getPwm(eq(pinName) ?: pinName, any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(
            dutyCyclePct
        )
        val request = PWMRequest.newBuilder().setName(board.name.name).setPin(pinName).build()
        val result = client.pWM(request)
        verify(board).getPwm(pinName, Struct.getDefaultInstance())
        assertEquals(result.dutyCyclePct, dutyCyclePct)
    }

    @Test
    fun setPwmFrequency() {
        val pinName = "test-pin"
        val frequencyHz = Random.nextInt()
        val request = SetPWMFrequencyRequest.newBuilder().setName(board.name.name).setPin(pinName)
            .setFrequencyHz(frequencyHz.toLong()).build()
        client.setPWMFrequency(request)
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
        val request = PWMFrequencyRequest.newBuilder().setName(board.name.name).setPin(pinName).build()
        val result = client.pWMFrequency(request)
        verify(board).getPwmFrequency(pinName, Struct.getDefaultInstance())
        assertEquals(result.frequencyHz.toInt(), frequencyHz)
    }

    @Test
    fun writeAnalog() {
        val readerName = "reader-name"
        val value = Random.nextInt()
        val request =
            WriteAnalogRequest.newBuilder().setName(board.name.name).setPin(readerName).setValue(value).build()
        client.writeAnalog(request)
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
        val request =
            ReadAnalogReaderRequest.newBuilder().setBoardName(board.name.name).setAnalogReaderName(readerName).build()
        val result = client.readAnalogReader(request)
        verify(board).getAnalogReaderValue(readerName, Struct.getDefaultInstance())
        assertEquals(result.value, value)
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
        val request = GetDigitalInterruptValueRequest.newBuilder().setBoardName(board.name.name)
            .setDigitalInterruptName(interruptName).build()
        val result = client.getDigitalInterruptValue(request)
        verify(board).getDigitalInterruptValue(interruptName, Struct.getDefaultInstance())
        assertEquals(result.value.toInt(), value)
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
        val request = StreamTicksRequest.newBuilder().setName(board.name.name).addAllPinNames(interruptNames).build()
        val response = client.streamTicks(request)
        verify(board).streamTicks(interruptNames, Struct.getDefaultInstance())
        for (tick in response) {
            assertTrue(interruptNames.contains(tick.pinName))
        }
    }

    @Test
    fun setPowerMode() {
        val powerMode = PowerMode.POWER_MODE_OFFLINE_DEEP
        val powerModeDuration = Random.nextInt().toDuration(DurationUnit.NANOSECONDS)
        val request = SetPowerModeRequest.newBuilder().setName(board.name.name).setPowerMode(powerMode)
            .setDuration(Durations.fromNanos(powerModeDuration.inWholeNanoseconds)).build()
        client.setPowerMode(request)
        verify(board).setPowerMode(powerMode, powerModeDuration, Struct.getDefaultInstance())
    }

    @Test
    fun doCommand() {
        val command =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        doReturn(command).`when`(board).doCommand(anyMap())
        val request = Common.DoCommandRequest.newBuilder().setName(board.name.name).setCommand(command).build()
        val response = client.doCommand(request)
        verify(board).doCommand(command.fieldsMap)
        assertEquals(command, response.result)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(board).getGeometries(any())
        val request = Common.GetGeometriesRequest.newBuilder().setName(board.name.name).build()
        client.getGeometries(request)
        verify(board).getGeometries(Optional.of(Struct.getDefaultInstance()))
    }
}
