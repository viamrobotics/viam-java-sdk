package com.viam.sdk.core.component.gantry

import com.viam.common.v1.Common.*
import com.viam.component.gantry.v1.Gantry.*
import com.viam.component.gantry.v1.GantryServiceGrpc
import com.viam.sdk.core.component.motor.Motor
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.resource.ResourceRPCService
import io.grpc.stub.StreamObserver
import java.util.*

internal class GantryRPCService(private val manager: ResourceManager) : GantryServiceGrpc.GantryServiceImplBase(),
    ResourceRPCService<Gantry> {

    override fun getPosition(
        request: GetPositionRequest, responseObserver: StreamObserver<GetPositionResponse>
    ) {
        val gantry = getResource(Gantry.named(request.name))
        val position = gantry.getPosition(request.extra)
        responseObserver.onNext(GetPositionResponse.newBuilder().addAllPositionsMm(position).build())
        responseObserver.onCompleted()
    }

    override fun moveToPosition(
        request: MoveToPositionRequest, responseObserver: StreamObserver<MoveToPositionResponse>
    ) {
        val gantry = getResource(Gantry.named(request.name))
        gantry.moveToPosition(request.positionsMmList, request.speedsMmPerSecList, request.extra)
        responseObserver.onNext(MoveToPositionResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun home(request: HomeRequest, responseObserver: StreamObserver<HomeResponse>) {
        val gantry = getResource(Gantry.named(request.name))
        val homed = gantry.home(request.extra)
        responseObserver.onNext(HomeResponse.newBuilder().setHomed(homed).build())
        responseObserver.onCompleted()
    }

    override fun getLengths(request: GetLengthsRequest, responseObserver: StreamObserver<GetLengthsResponse>) {
        val gantry = getResource(Gantry.named(request.name))
        val lengths = gantry.getLengths(request.extra)
        responseObserver.onNext(GetLengthsResponse.newBuilder().addAllLengthsMm(lengths).build())
        responseObserver.onCompleted()
    }

    override fun stop(request: StopRequest, responseObserver: StreamObserver<StopResponse>) {
        val gantry = getResource(Gantry.named(request.name))
        gantry.stop(request.extra)
        responseObserver.onNext(StopResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun isMoving(request: IsMovingRequest, responseObserver: StreamObserver<IsMovingResponse>) {
        val gantry = getResource(Gantry.named(request.name))
        val bool = gantry.isMoving()
        responseObserver.onNext(IsMovingResponse.newBuilder().setIsMoving(bool).build())
        responseObserver.onCompleted()
    }

    override fun doCommand(
        request: DoCommandRequest, responseObserver: StreamObserver<DoCommandResponse>
    ) {
        val gantry = getResource(Gantry.named(request.name))
        val result = gantry.doCommand(request.command.fieldsMap)
        responseObserver.onNext(DoCommandResponse.newBuilder().setResult(result).build())
        responseObserver.onCompleted()
    }

    override fun getGeometries(
        request: GetGeometriesRequest, responseObserver: StreamObserver<GetGeometriesResponse>
    ) {
        val motor = getResource(Gantry.named(request.name))
        val result = motor.getGeometries(Optional.of(request.extra))
        responseObserver.onNext(GetGeometriesResponse.newBuilder().addAllGeometries(result).build())
        responseObserver.onCompleted()
    }


    override fun getResourceClass(): Class<Gantry> {
        return Gantry::class.java
    }

    override fun getManager(): ResourceManager {
        return this.manager
    }

}