package com.viam.sdk.core.component.arm

import com.viam.common.v1.Common.*
import com.viam.component.arm.v1.Arm.*
import com.viam.component.arm.v1.ArmServiceGrpc
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.resource.ResourceRPCService
import io.grpc.stub.StreamObserver
import java.util.*

internal class ArmRPCService(private val manager: ResourceManager) : ArmServiceGrpc.ArmServiceImplBase(),
    ResourceRPCService<Arm> {
    override fun getEndPosition(
        request: GetEndPositionRequest,
        responseObserver: StreamObserver<GetEndPositionResponse>
    ) {
        val arm = getResource(Arm.named(request.name))
        val endPosition = arm.getEndPosition(request.extra)
        responseObserver.onNext(GetEndPositionResponse.newBuilder().setPose(endPosition).build())
        responseObserver.onCompleted()
    }

    override fun moveToPosition(
        request: MoveToPositionRequest,
        responseObserver: StreamObserver<MoveToPositionResponse>
    ) {
        val arm = getResource(Arm.named(request.name))
        arm.moveToPosition(request.to, request.extra)
        responseObserver.onNext(MoveToPositionResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun getJointPositions(
        request: GetJointPositionsRequest,
        responseObserver: StreamObserver<GetJointPositionsResponse>
    ) {
        val arm = getResource(Arm.named(request.name))
        val positions = arm.getJointPositions(request.extra)
        responseObserver.onNext(GetJointPositionsResponse.newBuilder().setPositions(positions).build())
        responseObserver.onCompleted()
    }

    override fun moveToJointPositions(
        request: MoveToJointPositionsRequest,
        responseObserver: StreamObserver<MoveToJointPositionsResponse>
    ) {
        val arm = getResource(Arm.named(request.name))
        arm.moveToJointPositions(request.positions, request.extra)
        responseObserver.onNext(MoveToJointPositionsResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun getKinematics(
        request: GetKinematicsRequest,
        responseObserver: StreamObserver<GetKinematicsResponse>
    ) {
        val arm = getResource(Arm.named(request.name))
        val kinematics = arm.getKinematics(request.extra)
        responseObserver.onNext(
            GetKinematicsResponse.newBuilder().setFormat(kinematics.first).setKinematicsData(kinematics.second).build()
        )
        responseObserver.onCompleted()
    }

    override fun stop(
        request: StopRequest, responseObserver: StreamObserver<StopResponse>
    ) {
        val arm = getResource(Arm.named(request.name))
        arm.stop(request.extra)
        responseObserver.onNext(StopResponse.newBuilder().build())
        responseObserver.onCompleted()
    }


    override fun isMoving(
        request: IsMovingRequest, responseObserver: StreamObserver<IsMovingResponse>
    ) {
        val arm = getResource(Arm.named(request.name))
        val isMoving = arm.isMoving()
        responseObserver.onNext(
            IsMovingResponse.newBuilder().setIsMoving(isMoving).build()
        )
        responseObserver.onCompleted()
    }

    override fun doCommand(
        request: DoCommandRequest, responseObserver: StreamObserver<DoCommandResponse>
    ) {
        val arm = getResource(Arm.named(request.name))
        val result = arm.doCommand(request.command.fieldsMap)
        responseObserver.onNext(DoCommandResponse.newBuilder().setResult(result).build())
        responseObserver.onCompleted()
    }

    override fun getGeometries(
        request: GetGeometriesRequest, responseObserver: StreamObserver<GetGeometriesResponse>
    ) {
        val arm = getResource(Arm.named(request.name))
        val result = arm.getGeometries(Optional.of(request.extra))
        responseObserver.onNext(GetGeometriesResponse.newBuilder().addAllGeometries(result).build())
        responseObserver.onCompleted()
    }

    override fun getResourceClass(): Class<Arm> {
        return Arm::class.java
    }

    override fun getManager(): ResourceManager {
        return this.manager
    }
}