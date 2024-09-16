package com.viam.sdk.core.component.base

import com.viam.common.v1.Common.*
import com.viam.component.base.v1.BaseServiceGrpc
import com.viam.component.base.v1.Base.*
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.resource.ResourceRPCService
import io.grpc.stub.StreamObserver
import java.util.*


internal class BaseRPCService(private val manager: ResourceManager) : BaseServiceGrpc.BaseServiceImplBase(),
    ResourceRPCService<Base> {

    override fun moveStraight(request: MoveStraightRequest, responseObserver: StreamObserver<MoveStraightResponse>) {
       val base = getResource(Base.named(request.name))
        base.moveStraight(request.distanceMm, request.mmPerSec, request.extra)
        responseObserver.onNext(MoveStraightResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun spin(request: SpinRequest, responseObserver: StreamObserver<SpinResponse>) {
        val base = getResource(Base.named(request.name))
        base.spin(request.angleDeg, request.degsPerSec, request.extra)
        responseObserver.onNext(SpinResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun setPower(request: SetPowerRequest, responseObserver: StreamObserver<SetPowerResponse>) {
        val base = getResource(Base.named(request.name))
        base.setPower(request.linear, request.angular, request.extra)
        responseObserver.onNext(SetPowerResponse.newBuilder().build())
        responseObserver.onCompleted()
    }
    override fun setVelocity(request: SetVelocityRequest, responseObserver: StreamObserver<SetVelocityResponse>) {
        val base = getResource(Base.named(request.name))
        base.setVelocity(request.linear, request.angular, request.extra)
        responseObserver.onNext(SetVelocityResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun stop(
        request: StopRequest, responseObserver: StreamObserver<StopResponse>
    ) {
        val base = getResource(Base.named(request.name))
        base.stop(request.extra)
        responseObserver.onNext(StopResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun isMoving(
        request: IsMovingRequest, responseObserver: StreamObserver<IsMovingResponse>
    ) {
        val base = getResource(Base.named(request.name))
        val isMoving = base.isMoving()
        responseObserver.onNext(
            IsMovingResponse.newBuilder().setIsMoving(isMoving).build()
        )
        responseObserver.onCompleted()
    }

    override fun getProperties(
        request: GetPropertiesRequest,
        responseObserver: StreamObserver<GetPropertiesResponse>
    ) {
        val base = getResource(Base.named(request.name))
        val result = base.getProperties()
        responseObserver.onNext(GetPropertiesResponse.newBuilder().setWidthMeters(result.widthMeters).setTurningRadiusMeters(result.turningRadiusMeters).setWheelCircumferenceMeters(result.wheelCircumferenceMeters).build())
        responseObserver.onCompleted()
    }

    override fun doCommand(
        request: DoCommandRequest, responseObserver: StreamObserver<DoCommandResponse>
    ) {
        val base = getResource(Base.named(request.name))
        val result = base.doCommand(request.command.fieldsMap)
        responseObserver.onNext(DoCommandResponse.newBuilder().setResult(result).build())
        responseObserver.onCompleted()
    }

    override fun getGeometries(
        request: GetGeometriesRequest, responseObserver: StreamObserver<GetGeometriesResponse>
    ) {
        val base = getResource(Base.named(request.name))
        val result = base.getGeometries(Optional.of(request.extra))
        responseObserver.onNext(GetGeometriesResponse.newBuilder().addAllGeometries(result).build())
        responseObserver.onCompleted()
    }
    
    override fun getResourceClass(): Class<Base> {
        return Base::class.java
    }

    override fun getManager(): ResourceManager {
        return this.manager
    }
}