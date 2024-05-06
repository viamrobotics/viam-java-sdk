package com.viam.sdk.core.component.board

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.component.board.v1.Board.*
import com.viam.component.board.v1.BoardServiceGrpc
import com.viam.component.board.v1.BoardServiceGrpc.BoardServiceBlockingStub
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.util.Durations
import io.grpc.StatusRuntimeException
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.util.*
import kotlin.random.Random
import kotlin.time.DurationUnit
import kotlin.time.toDuration


class BoardRPCServiceTest {

    private lateinit var board: MockBoard
    private lateinit var client: BoardServiceBlockingStub

    @JvmField
    @Rule
    val grpcCleanup: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        board = MockBoard("testBoard")

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
        val funName = "setGpioState"

        val request = SetGPIORequest.newBuilder().setName(board.name.name).setPin(pinName).setHigh(false).setExtra(
            getExtra(funName).get()
        ).build()
        client.setGPIO(request)

        assertFalse(board.gpios.getValue(pinName))
        assertEquals(board.extra?.fieldsMap?.getValue(EXTRA_KEY)?.stringValue, funName)
    }

    @Test
    fun getGpioState() {
        val pinName = "test-pin"

        val request = GetGPIORequest.newBuilder().setName(board.name.name).setPin(pinName).build()
        assertThrows<StatusRuntimeException> {
            client.getGPIO(request)
        }

        board.setGpioState(pinName, true, Optional.empty())
        val response = client.getGPIO(request)
        assertTrue(response.high)
    }

    @Test
    fun setPwm() {
        val pinName = "test-pin"
        val dutyCyclePct = Random.nextDouble()

        val request =
            SetPWMRequest.newBuilder().setName(board.name.name).setPin(pinName).setDutyCyclePct(dutyCyclePct).build()
        client.setPWM(request)

        assertEquals(board.pwms.getValue(pinName), dutyCyclePct)
    }

    @Test
    fun getPwm() {
        val pinName = "test-pin"
        val dutyCyclePct = Random.nextDouble()

        val request = PWMRequest.newBuilder().setName(board.name.name).setPin(pinName).build()
        assertThrows<StatusRuntimeException> {
            client.pWM(request)
        }

        board.setPwm(pinName, dutyCyclePct, Optional.empty())
        val response = client.pWM(request)
        assertEquals(response.dutyCyclePct, dutyCyclePct)
    }

    @Test
    fun setPwmFrequency() {
        val pinName = "test-pin"
        val frequencyHz = Random.nextInt()
        val request = SetPWMFrequencyRequest.newBuilder().setName(board.name.name).setPin(pinName)
            .setFrequencyHz(frequencyHz.toLong()).build()
        client.setPWMFrequency(request)
        assertEquals(board.freqs.getValue(pinName), frequencyHz)
    }

    @Test
    fun getPwmFrequency() {
        val pinName = "test-pin"
        val frequencyHz = Random.nextInt()

        val request = PWMFrequencyRequest.newBuilder().setName(board.name.name).setPin(pinName).build()
//        assertThrows<StatusRuntimeException> {
//            client.pWMFrequency(request)
//        }

        board.setPwmFrequency(pinName, frequencyHz, Optional.empty())
        val response = client.pWMFrequency(request)
        assertEquals(response.frequencyHz, frequencyHz.toLong())
    }

    @Test
    fun writeAnalog() {
        val readerName = "reader-name"
        val value = Random.nextInt()
        val request =
            WriteAnalogRequest.newBuilder().setName(board.name.name).setPin(readerName).setValue(value).build()
        client.writeAnalog(request)
        assertEquals(board.analogs.getValue(readerName), value)
    }

    @Test
    fun getAnalogReaderValue() {
        val readerName = "reader-name"
        val value = Random.nextInt()

        val request =
            ReadAnalogReaderRequest.newBuilder().setBoardName(board.name.name).setAnalogReaderName(readerName).build()
        assertThrows<StatusRuntimeException> {
            client.readAnalogReader(request)
        }

        board.writeAnalog(readerName, value, Optional.empty())
        val response = client.readAnalogReader(request)
        assertEquals(response.value, value)
    }

    @Test
    fun getDigitalInterruptValue() {
        val interruptName = "interrupt-name"
        val value = Random.nextInt()

        val request = GetDigitalInterruptValueRequest.newBuilder().setBoardName(board.name.name)
            .setDigitalInterruptName(interruptName).build()
        assertThrows<StatusRuntimeException> {
            client.getDigitalInterruptValue(request)
        }

        board.interrupts[interruptName] = value
        val response = client.getDigitalInterruptValue(request)
        assertEquals(response.value, value.toLong())
    }

    @Test
    fun streamTicks() {
        val interruptNames = listOf("interrupt-1", "interrupt-2", "interrupt-3")
        val request = StreamTicksRequest.newBuilder().setName(board.name.name).addAllPinNames(interruptNames).build()
        val ticks = client.streamTicks(request)
        for (tick in ticks) {
            assertTrue(interruptNames.contains(tick.pinName))
        }
    }

    @Test
    fun setPowerMode() {
        val powerMode = PowerMode.POWER_MODE_OFFLINE_DEEP
        val powerModeDuration = Random.nextInt().toDuration(DurationUnit.NANOSECONDS)

        assertNotEquals(board.powerMode, powerMode)
        assertNotEquals(board.powerModeDuration, powerModeDuration)

        val request = SetPowerModeRequest.newBuilder().setName(board.name.name).setPowerMode(powerMode)
            .setDuration(Durations.fromNanos(powerModeDuration.inWholeNanoseconds)).build()
        client.setPowerMode(request)

        assertEquals(board.powerMode, powerMode)
        assertEquals(board.powerModeDuration, powerModeDuration)
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        val commandStruct = Struct.newBuilder().putAllFields(command).build()
        val request = Common.DoCommandRequest.newBuilder().setName(board.name.name).setCommand(commandStruct).build()
        val response = client.doCommand(request)
        assertEquals(response.result, commandStruct)
    }

    @Test
    fun getGeometries() {
        val funName = "getGeometries"
        val request =
            Common.GetGeometriesRequest.newBuilder().setName(board.name.name).setExtra(getExtra(funName).get()).build()
        client.getGeometries(request)
        assertEquals(board.extra?.fieldsMap?.getValue(EXTRA_KEY)?.stringValue, funName)
    }
}
