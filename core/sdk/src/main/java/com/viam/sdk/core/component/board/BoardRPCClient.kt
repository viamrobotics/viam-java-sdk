package com.viam.sdk.core.component.board

import com.google.protobuf.Struct
import com.viam.component.board.v1.Board.*
import com.viam.component.board.v1.BoardServiceGrpc
import com.viam.component.board.v1.BoardServiceGrpc.BoardServiceBlockingStub
import com.viam.sdk.core.exception.MethodNotImplementedException
import com.viam.sdk.core.rpc.Channel
import com.viam.sdk.core.util.Durations
import java.util.*
import kotlin.jvm.optionals.getOrDefault
import kotlin.time.Duration

/**
 * gRPC Client for a Board component
 */
class BoardRPCClient(name: String, channel: Channel) : Board(name) {
    private val client: BoardServiceBlockingStub

    init {
        val client = BoardServiceGrpc.newBlockingStub(channel)
        if (channel.callCredentials.isPresent) {
            this.client = client.withCallCredentials(channel.callCredentials.get())
        } else {
            this.client = client
        }
    }

    override fun setGpioState(pin: String, high: Boolean, extra: Optional<Struct>) {
        val request = SetGPIORequest.newBuilder()
            .setName(this.name.name)
            .setPin(pin).setHigh(high)
            .setExtra(extra.getOrDefault(Struct.getDefaultInstance()))
            .build()
        this.client.setGPIO(request)
    }

    override fun getGpioState(pin: String, extra: Optional<Struct>): Boolean {
        val request = GetGPIORequest.newBuilder()
            .setName(this.name.name)
            .setPin(pin)
            .setExtra(extra.getOrDefault(Struct.getDefaultInstance()))
            .build()
        return this.client.getGPIO(request).high
    }

    override fun setPwm(pin: String, dutyCyclePct: Double, extra: Optional<Struct>) {
        val request = SetPWMRequest.newBuilder()
            .setName(this.name.name)
            .setPin(pin)
            .setDutyCyclePct(dutyCyclePct)
            .setExtra(extra.getOrDefault(Struct.getDefaultInstance()))
            .build()
        this.client.setPWM(request)
    }

    override fun getPwm(pin: String, extra: Optional<Struct>): Double {
        val request = PWMRequest.newBuilder()
            .setName(this.name.name)
            .setPin(pin)
            .setExtra(extra.getOrDefault(Struct.getDefaultInstance()))
            .build()
        return this.client.pWM(request).dutyCyclePct
    }

    override fun setPwmFrequency(pin: String, frequencyHz: Int, extra: Optional<Struct>) {
        val request = SetPWMFrequencyRequest.newBuilder()
            .setName(this.name.name)
            .setPin(pin)
            .setFrequencyHz(frequencyHz.toLong())
            .setExtra(extra.getOrDefault(Struct.getDefaultInstance()))
            .build()
        this.client.setPWMFrequency(request)
    }

    override fun getPwmFrequency(pin: String, extra: Optional<Struct>): Int {
        val request = PWMFrequencyRequest.newBuilder()
            .setName(this.name.name)
            .setPin(pin)
            .setExtra(extra.getOrDefault(Struct.getDefaultInstance()))
            .build()
        return this.client.pWMFrequency(request).frequencyHz.toInt()
    }

    override fun writeAnalog(pin: String, value: Int, extra: Optional<Struct>) {
        val request = WriteAnalogRequest.newBuilder()
            .setName(this.name.name)
            .setPin(pin)
            .setValue(value)
            .setExtra(extra.getOrDefault(Struct.getDefaultInstance()))
            .build()
        this.client.writeAnalog(request)
    }

    override fun getAnalogReaderValue(analogReader: String, extra: Optional<Struct>): Int {
        val request = ReadAnalogReaderRequest.newBuilder()
            .setBoardName(this.name.name)
            .setAnalogReaderName(analogReader)
            .setExtra(extra.getOrDefault(Struct.getDefaultInstance()))
            .build()
        return this.client.readAnalogReader(request).value
    }

    override fun getDigitalInterruptValue(digitalInterrupt: String, extra: Optional<Struct>): Int {
        val request = GetDigitalInterruptValueRequest.newBuilder()
            .setBoardName(this.name.name)
            .setDigitalInterruptName(digitalInterrupt)
            .setExtra(extra.getOrDefault(Struct.getDefaultInstance()))
            .build()
        return this.client.getDigitalInterruptValue(request).value.toInt()
    }

    override fun streamTicks(interrupts: List<String>, extra: Optional<Struct>): Iterator<Tick> {
        val request = StreamTicksRequest.newBuilder()
            .setName(this.name.name)
            .addAllPinNames(interrupts)
            .setExtra(extra.getOrDefault(Struct.getDefaultInstance()))
            .build()
        return this.client.streamTicks(request)
    }

    override fun addCallbacks(
        interrupts: List<String>,
        tickQueue: Queue<Tick>,
        extra: Optional<Struct>
    ) {
        throw MethodNotImplementedException("BoardRPCClient.addCallbacks")
    }

    override fun setPowerMode(
        powerMode: com.viam.component.board.v1.Board.PowerMode,
        duration: Duration,
        extra: Optional<Struct>
    ) {
        val request = SetPowerModeRequest.newBuilder()
            .setName(this.name.name)
            .setPowerMode(powerMode)
            .setDuration(Durations.fromNanos(duration.inWholeNanoseconds))
            .setExtra(extra.getOrDefault(Struct.getDefaultInstance()))
            .build()
        this.client.setPowerMode(request)
    }

}
