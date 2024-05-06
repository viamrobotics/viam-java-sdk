package com.viam.sdk.core.component.board

import com.viam.common.v1.Common
import com.viam.common.v1.Common.DoCommandResponse
import com.viam.common.v1.Common.GetGeometriesResponse
import com.viam.component.board.v1.BoardServiceGrpc
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.resource.ResourceRPCService
import com.viam.sdk.core.util.Durations
import io.grpc.stub.StreamObserver
import java.util.*
import kotlin.time.DurationUnit
import kotlin.time.toDuration

class BoardRPCService(private val manager: ResourceManager) :
    BoardServiceGrpc.BoardServiceImplBase(), ResourceRPCService<Board> {

    override fun setGPIO(
        request: com.viam.component.board.v1.Board.SetGPIORequest,
        responseObserver: StreamObserver<com.viam.component.board.v1.Board.SetGPIOResponse>
    ) {
        val board = getResource(Board.named(request.name))
        board.setGpioState(request.pin, request.high, Optional.of(request.extra))
        responseObserver.onNext(
            com.viam.component.board.v1.Board.SetGPIOResponse.newBuilder().build()
        )
        responseObserver.onCompleted()
    }

    override fun getGPIO(
        request: com.viam.component.board.v1.Board.GetGPIORequest,
        responseObserver: StreamObserver<com.viam.component.board.v1.Board.GetGPIOResponse>
    ) {
        val board = getResource(Board.named(request.name))
        val state = board.getGpioState(request.pin, Optional.of(request.extra))
        responseObserver.onNext(
            com.viam.component.board.v1.Board.GetGPIOResponse.newBuilder().setHigh(state).build()
        )
        responseObserver.onCompleted()
    }

    override fun setPWM(
        request: com.viam.component.board.v1.Board.SetPWMRequest,
        responseObserver: StreamObserver<com.viam.component.board.v1.Board.SetPWMResponse>
    ) {
        val board = getResource(Board.named(request.name))
        board.setPwm(request.pin, request.dutyCyclePct, Optional.of(request.extra))
        responseObserver.onNext(
            com.viam.component.board.v1.Board.SetPWMResponse.newBuilder().build()
        )
        responseObserver.onCompleted()
    }

    override fun pWM(
        request: com.viam.component.board.v1.Board.PWMRequest,
        responseObserver: StreamObserver<com.viam.component.board.v1.Board.PWMResponse>
    ) {
        val board = getResource(Board.named(request.name))
        val pwm = board.getPwm(request.pin, Optional.of(request.extra))
        responseObserver.onNext(
            com.viam.component.board.v1.Board.PWMResponse.newBuilder().setDutyCyclePct(pwm).build()
        )
        responseObserver.onCompleted()
    }

    override fun setPWMFrequency(
        request: com.viam.component.board.v1.Board.SetPWMFrequencyRequest,
        responseObserver: StreamObserver<com.viam.component.board.v1.Board.SetPWMFrequencyResponse>
    ) {
        val board = getResource(Board.named(request.name))
        board.setPwmFrequency(request.pin, request.frequencyHz.toInt(), Optional.of(request.extra))
        responseObserver.onNext(
            com.viam.component.board.v1.Board.SetPWMFrequencyResponse.newBuilder().build()
        )
        responseObserver.onCompleted()
    }

    override fun pWMFrequency(
        request: com.viam.component.board.v1.Board.PWMFrequencyRequest,
        responseObserver: StreamObserver<com.viam.component.board.v1.Board.PWMFrequencyResponse>
    ) {
        val board = getResource(Board.named(request.name))
        val freq = board.getPwmFrequency(request.pin, Optional.of(request.extra))
        responseObserver.onNext(
            com.viam.component.board.v1.Board.PWMFrequencyResponse.newBuilder()
                .setFrequencyHz(freq.toLong()).build()
        )
        responseObserver.onCompleted()
    }

    override fun writeAnalog(
        request: com.viam.component.board.v1.Board.WriteAnalogRequest,
        responseObserver: StreamObserver<com.viam.component.board.v1.Board.WriteAnalogResponse>
    ) {
        val board = getResource(Board.named(request.name))
        board.writeAnalog(request.pin, request.value, Optional.of(request.extra))
        responseObserver.onNext(
            com.viam.component.board.v1.Board.WriteAnalogResponse.newBuilder().build()
        )
        responseObserver.onCompleted()
    }

    override fun readAnalogReader(
        request: com.viam.component.board.v1.Board.ReadAnalogReaderRequest,
        responseObserver: StreamObserver<com.viam.component.board.v1.Board.ReadAnalogReaderResponse>
    ) {
        val board = getResource(Board.named(request.boardName))
        val value = board.getAnalogReaderValue(request.analogReaderName, Optional.of(request.extra))
        responseObserver.onNext(
            com.viam.component.board.v1.Board.ReadAnalogReaderResponse.newBuilder().setValue(value)
                .build()
        )
        responseObserver.onCompleted()
    }

    override fun streamTicks(
        request: com.viam.component.board.v1.Board.StreamTicksRequest,
        responseObserver: StreamObserver<com.viam.component.board.v1.Board.StreamTicksResponse>
    ) {
        val board = getResource(Board.named(request.name))
        val ticksStream = board.streamTicks(request.pinNamesList, Optional.of(request.extra))
        for (tick in ticksStream) {
            responseObserver.onNext(tick)
        }
        responseObserver.onCompleted()
    }

    override fun setPowerMode(
        request: com.viam.component.board.v1.Board.SetPowerModeRequest,
        responseObserver: StreamObserver<com.viam.component.board.v1.Board.SetPowerModeResponse>
    ) {
        val board = getResource(Board.named(request.name))
        board.setPowerMode(
            request.powerMode,
            Durations.toNanos(request.duration).toDuration(DurationUnit.NANOSECONDS),
            Optional.of(request.extra)
        )
        responseObserver.onNext(
            com.viam.component.board.v1.Board.SetPowerModeResponse.newBuilder().build()
        )
        responseObserver.onCompleted()
    }

    override fun getDigitalInterruptValue(
        request: com.viam.component.board.v1.Board.GetDigitalInterruptValueRequest,
        responseObserver: StreamObserver<com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse>
    ) {
        val board = getResource(Board.named(request.boardName))
        val value =
            board.getDigitalInterruptValue(request.digitalInterruptName, Optional.of(request.extra))
        responseObserver.onNext(
            com.viam.component.board.v1.Board.GetDigitalInterruptValueResponse.newBuilder()
                .setValue(value.toLong()).build()
        )
        responseObserver.onCompleted()
    }

    override fun doCommand(
        request: Common.DoCommandRequest,
        responseObserver: StreamObserver<DoCommandResponse>
    ) {
        val board = getResource(Board.named(request.name))
        val result = board.doCommand(request.command.fieldsMap)
        responseObserver.onNext(DoCommandResponse.newBuilder().setResult(result).build())
        responseObserver.onCompleted()
    }

    override fun getGeometries(
        request: Common.GetGeometriesRequest,
        responseObserver: StreamObserver<GetGeometriesResponse>
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
