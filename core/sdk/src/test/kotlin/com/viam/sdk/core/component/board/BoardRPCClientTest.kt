package com.viam.sdk.core.component.board

import com.google.protobuf.Value
import com.viam.component.board.v1.Board.PowerMode
import com.viam.sdk.core.exception.MethodNotImplementedException
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.rpc.BasicManagedChannel
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

class BoardRPCClientTest {
    private lateinit var board: MockBoard
    private lateinit var client: BoardRPCClient

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
        val channel = grpcCleanup.register(
            InProcessChannelBuilder.forName(serviceName).directExecutor().build()
        )
        client = BoardRPCClient("testBoard", BasicManagedChannel(channel))
    }


    @Test
    fun setGpioState() {
        val pinName = "test-pin"
        val funName = "setGpioState"
        client.setGpioState(pinName, false, getExtra(funName))
        assertFalse(board.gpios.getValue(pinName))
        assertEquals(board.extra?.fieldsMap?.getValue(EXTRA_KEY)?.stringValue, funName)
    }

    @Test
    fun getGpioState() {
        val pinName = "test-pin"

        assertThrows<StatusRuntimeException> {
            client.getGpioState(pinName, Optional.empty())
        }

        board.setGpioState(pinName, true, Optional.empty())
        val high = client.getGpioState(pinName, Optional.empty())
        assertTrue(high)
    }

    @Test
    fun setPwm() {
        val pinName = "test-pin"
        val dutyCyclePct = Random.nextDouble()
        client.setPwm(pinName, dutyCyclePct, Optional.empty())
        assertEquals(board.pwms.getValue(pinName), dutyCyclePct)
    }

    @Test
    fun getPwm() {
        val pinName = "test-pin"
        val dutyCyclePct = Random.nextDouble()

        assertThrows<StatusRuntimeException> {
            client.getPwm(pinName, Optional.empty())
        }

        board.setPwm(pinName, dutyCyclePct, Optional.empty())
        val result = client.getPwm(pinName, Optional.empty())
        assertEquals(result, dutyCyclePct)
    }

    @Test
    fun setPwmFrequency() {
        val pinName = "test-pin"
        val frequencyHz = Random.nextInt()
        client.setPwmFrequency(pinName, frequencyHz, Optional.empty())
        assertEquals(board.freqs.getValue(pinName), frequencyHz)
    }

    @Test
    fun getPwmFrequency() {
        val pinName = "test-pin"
        val frequencyHz = Random.nextInt()

        assertThrows<StatusRuntimeException> {
            client.getPwmFrequency(pinName, Optional.empty())
        }

        board.setPwmFrequency(pinName, frequencyHz, Optional.empty())
        val result = client.getPwmFrequency(pinName, Optional.empty())
        assertEquals(result, frequencyHz)
    }

    @Test
    fun writeAnalog() {
        val readerName = "reader-name"
        val value = Random.nextInt()
        client.writeAnalog(readerName, value, Optional.empty())
        assertEquals(board.analogs.getValue(readerName), value)
    }

    @Test
    fun getAnalogReaderValue() {
        val readerName = "reader-name"
        val value = Random.nextInt()

        assertThrows<StatusRuntimeException> {
            client.getAnalogReaderValue(readerName, Optional.empty())
        }

        board.writeAnalog(readerName, value, Optional.empty())
        val result = client.getAnalogReaderValue(readerName, Optional.empty())
        assertEquals(result, value)
    }

    @Test
    fun getDigitalInterruptValue() {
        val interruptName = "interrupt-name"
        val value = Random.nextInt()

        assertThrows<StatusRuntimeException> {
            client.getDigitalInterruptValue(interruptName, Optional.empty())
        }

        board.interrupts[interruptName] = value
        val result = client.getDigitalInterruptValue(interruptName, Optional.empty())
        assertEquals(result, value)
    }

    @Test
    fun streamTicks() {
        val interruptNames = listOf("interrupt-1", "interrupt-2", "interrupt-3")
        val ticks = client.streamTicks(interruptNames, Optional.empty())
        for (tick in ticks) {
            assertTrue(interruptNames.contains(tick.pinName))
        }
    }

    @Test
    fun addCallback() {
        assertThrows<MethodNotImplementedException> {
            client.addCallbacks(listOf(), PriorityQueue(), Optional.empty())
        }
    }

    @Test
    fun setPowerMode() {
        val powerMode = PowerMode.POWER_MODE_OFFLINE_DEEP
        val powerModeDuration = Random.nextInt().toDuration(DurationUnit.NANOSECONDS)

        assertNotEquals(board.powerMode, powerMode)
        assertNotEquals(board.powerModeDuration, powerModeDuration)

        client.setPowerMode(powerMode, powerModeDuration, Optional.empty())

        assertEquals(board.powerMode, powerMode)
        assertEquals(board.powerModeDuration, powerModeDuration)
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        val response = client.doCommand(command)
        assertEquals(response.fieldsMap, command)
    }

    @Test
    fun getGeometries() {
        val funName = "getGeometries"
        client.getGeometries(getExtra(funName))
        assertEquals(board.extra?.fieldsMap?.getValue(EXTRA_KEY)?.stringValue, funName)
    }
}
