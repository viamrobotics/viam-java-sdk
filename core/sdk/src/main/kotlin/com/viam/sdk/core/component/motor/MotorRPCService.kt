package com.viam.sdk.core.component.motor

import com.viam.common.v1.Common.*
import com.viam.component.motor.v1.Motor.*
import com.viam.component.motor.v1.MotorServiceGrpc
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.resource.ResourceRPCService
import io.grpc.stub.StreamObserver
import java.util.*

internal class MotorRPCService(private val manager: ResourceManager) : MotorServiceGrpc.MotorServiceImplBase(),
    ResourceRPCService<Motor> {

    override fun setPower(
        request: SetPowerRequest, responseObserver: StreamObserver<SetPowerResponse>
    ) {
        val motor = getResource(Motor.named(request.name))
        motor.setPower(request.powerPct, request.extra)
        responseObserver.onNext(SetPowerResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun goFor(
        request: GoForRequest, responseObserver: StreamObserver<GoForResponse>
    ) {
        val motor = getResource(Motor.named(request.name))
        motor.goFor(request.rpm, request.revolutions, request.extra)
        responseObserver.onNext(GoForResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun goTo(
        request: GoToRequest, responseObserver: StreamObserver<GoToResponse>
    ) {
        val motor = getResource(Motor.named(request.name))
        motor.goTo(request.rpm, request.positionRevolutions, request.extra)
        responseObserver.onNext(GoToResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun resetZeroPosition(
        request: ResetZeroPositionRequest, responseObserver: StreamObserver<ResetZeroPositionResponse>
    ) {
        val motor = getResource(Motor.named(request.name))
        motor.resetZeroPosition(request.offset, request.extra)
        responseObserver.onNext(ResetZeroPositionResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun getPosition(
        request: GetPositionRequest, responseObserver: StreamObserver<GetPositionResponse>
    ) {
        val motor = getResource(Motor.named(request.name))
        val position = motor.getPosition(request.extra)
        responseObserver.onNext(GetPositionResponse.newBuilder().setPosition(position).build())
        responseObserver.onCompleted()
    }

    override fun getProperties(
        request: GetPropertiesRequest, responseObserver: StreamObserver<GetPropertiesResponse>
    ) {
        val motor = getResource(Motor.named(request.name))
        val properties = motor.getProperties(request.extra)
        responseObserver.onNext(
            GetPropertiesResponse.newBuilder().setPositionReporting(properties.positionReporting).build()
        )
        responseObserver.onCompleted()
    }

    override fun stop(
        request: StopRequest, responseObserver: StreamObserver<StopResponse>
    ) {
        val motor = getResource(Motor.named(request.name))
        motor.stop(request.extra)
        responseObserver.onNext(StopResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun isPowered(
        request: IsPoweredRequest, responseObserver: StreamObserver<IsPoweredResponse>
    ) {
        val motor = getResource(Motor.named(request.name))
        val isPoweredResponse = motor.isPowered(request.extra)
        responseObserver.onNext(
            IsPoweredResponse.newBuilder().setIsOn(isPoweredResponse.first).setPowerPct(isPoweredResponse.second)
                .build()
        )
        responseObserver.onCompleted()
    }

    override fun isMoving(
        request: IsMovingRequest, responseObserver: StreamObserver<IsMovingResponse>
    ) {
        val motor = getResource(Motor.named(request.name))
        val isMoving = motor.isMoving()
        responseObserver.onNext(
            IsMovingResponse.newBuilder().setIsMoving(isMoving).build()
        )
        responseObserver.onCompleted()
    }

    override fun doCommand(
        request: DoCommandRequest, responseObserver: StreamObserver<DoCommandResponse>
    ) {
        val motor = getResource(Motor.named(request.name))
        val result = motor.doCommand(request.command.fieldsMap)
        responseObserver.onNext(DoCommandResponse.newBuilder().setResult(result).build())
        responseObserver.onCompleted()
    }

    override fun getGeometries(
        request: GetGeometriesRequest, responseObserver: StreamObserver<GetGeometriesResponse>
    ) {
        val motor = getResource(Motor.named(request.name))
        val result = motor.getGeometries(Optional.of(request.extra))
        responseObserver.onNext(GetGeometriesResponse.newBuilder().addAllGeometries(result).build())
        responseObserver.onCompleted()
    }

    override fun getResourceClass(): Class<Motor> {
        return Motor::class.java
    }

    override fun getManager(): ResourceManager {
        return this.manager
    }
}
