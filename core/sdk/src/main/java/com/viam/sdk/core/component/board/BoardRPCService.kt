package com.viam.sdk.core.component.board

import com.viam.common.v1.Common
import com.viam.common.v1.Common.DoCommandResponse
import com.viam.common.v1.Common.GetGeometriesResponse
import com.viam.component.board.v1.Board.*
import com.viam.component.board.v1.BoardServiceGrpc
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.resource.ResourceRPCService
import com.viam.sdk.core.util.Durations
import io.grpc.stub.StreamObserver
import java.util.*
import kotlin.time.DurationUnit
import kotlin.time.toDuration

class BoardRPCService(private val manager: ResourceManager) : BoardServiceGrpc.BoardServiceImplBase(),
    ResourceRPCService<Board> {

    override fun setGPIO(
        request: SetGPIORequest,
        responseObserver: StreamObserver<SetGPIOResponse>
    ) {
        val board = getResource(Board.named(request.name))
        board.setGpioState(request.pin, request.high, Optional.of(request.extra))
        responseObserver.onNext(
            SetGPIOResponse.newBuilder().build()
        )
        responseObserver.onCompleted()
    }

    override fun getGPIO(
        request: GetGPIORequest,
        responseObserver: StreamObserver<GetGPIOResponse>
    ) {
        val board = getResource(Board.named(request.name))
        val state = board.getGpioState(request.pin, Optional.of(request.extra))
        responseObserver.onNext(
            GetGPIOResponse.newBuilder().setHigh(state).build()
        )
        responseObserver.onCompleted()
    }

    override fun setPWM(
        request: SetPWMRequest,
        responseObserver: StreamObserver<SetPWMResponse>
    ) {
        val board = getResource(Board.named(request.name))
        board.setPwm(request.pin, request.dutyCyclePct, Optional.of(request.extra))
        responseObserver.onNext(
            SetPWMResponse.newBuilder().build()
        )
        responseObserver.onCompleted()
    }

    override fun pWM(
        request: PWMRequest,
        responseObserver: StreamObserver<PWMResponse>
    ) {
        val board = getResource(Board.named(request.name))
        val pwm = board.getPwm(request.pin, Optional.of(request.extra))
        responseObserver.onNext(
            PWMResponse.newBuilder().setDutyCyclePct(pwm).build()
        )
        responseObserver.onCompleted()
    }

    override fun setPWMFrequency(
        request: SetPWMFrequencyRequest,
        responseObserver: StreamObserver<SetPWMFrequencyResponse>
    ) {
        val board = getResource(Board.named(request.name))
        board.setPwmFrequency(request.pin, request.frequencyHz.toInt(), Optional.of(request.extra))
        responseObserver.onNext(
            SetPWMFrequencyResponse.newBuilder().build()
        )
        responseObserver.onCompleted()
    }

    override fun pWMFrequency(
        request: PWMFrequencyRequest,
        responseObserver: StreamObserver<PWMFrequencyResponse>
    ) {
        val board = getResource(Board.named(request.name))
        val freq = board.getPwmFrequency(request.pin, Optional.of(request.extra))
        responseObserver.onNext(
            PWMFrequencyResponse.newBuilder().setFrequencyHz(freq.toLong()).build()
        )
        responseObserver.onCompleted()
    }

    override fun writeAnalog(
        request: WriteAnalogRequest,
        responseObserver: StreamObserver<WriteAnalogResponse>
    ) {
        val board = getResource(Board.named(request.name))
        board.writeAnalog(request.pin, request.value, Optional.of(request.extra))
        responseObserver.onNext(
            WriteAnalogResponse.newBuilder().build()
        )
        responseObserver.onCompleted()
    }

    override fun readAnalogReader(
        request: ReadAnalogReaderRequest,
        responseObserver: StreamObserver<ReadAnalogReaderResponse>
    ) {
        val board = getResource(Board.named(request.boardName))
        val value = board.getAnalogReaderValue(request.analogReaderName, Optional.of(request.extra))
        responseObserver.onNext(
            ReadAnalogReaderResponse.newBuilder().setValue(value).build()
        )
        responseObserver.onCompleted()
    }

    override fun streamTicks(
        request: StreamTicksRequest,
        responseObserver: StreamObserver<StreamTicksResponse>
    ) {
        val board = getResource(Board.named(request.name))
        val ticksStream = board.streamTicks(request.pinNamesList, Optional.of(request.extra))
        for (tick in ticksStream) {
            responseObserver.onNext(tick)
        }
        responseObserver.onCompleted()
    }

    override fun setPowerMode(
        request: SetPowerModeRequest,
        responseObserver: StreamObserver<SetPowerModeResponse>
    ) {
        val board = getResource(Board.named(request.name))
        board.setPowerMode(
            request.powerMode,
            Durations.toNanos(request.duration).toDuration(DurationUnit.NANOSECONDS),
            Optional.of(request.extra)
        )
        responseObserver.onNext(
            SetPowerModeResponse.newBuilder().build()
        )
        responseObserver.onCompleted()
    }

    override fun getDigitalInterruptValue(
        request: GetDigitalInterruptValueRequest,
        responseObserver: StreamObserver<GetDigitalInterruptValueResponse>
    ) {
        val board = getResource(Board.named(request.boardName))
        val value = board.getDigitalInterruptValue(request.digitalInterruptName, Optional.of(request.extra))
        responseObserver.onNext(
            GetDigitalInterruptValueResponse.newBuilder().setValue(value.toLong())
                .build()
        )
        responseObserver.onCompleted()
    }

    override fun doCommand(
        request: Common.DoCommandRequest, responseObserver: StreamObserver<DoCommandResponse>
    ) {
        val board = getResource(Board.named(request.name))
        val result = board.doCommand(request.command.fieldsMap)
        responseObserver.onNext(DoCommandResponse.newBuilder().setResult(result).build())
        responseObserver.onCompleted()
    }

    override fun getGeometries(
        request: Common.GetGeometriesRequest, responseObserver: StreamObserver<GetGeometriesResponse>
    ) {
        val board = getResource(Board.named(request.name))
        val result = board.getGeometries(Optional.of(request.extra))
        responseObserver.onNext(GetGeometriesResponse.newBuilder().addAllGeometries(result).build())
        responseObserver.onCompleted()
    }

    override fun getResourceClass(): Class<Board> {
        return Board::class.java
    }

    override fun getManager(): ResourceManager {
        return this.manager
    }

}
