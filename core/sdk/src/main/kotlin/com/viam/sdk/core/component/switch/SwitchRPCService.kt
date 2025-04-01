package com.viam.sdk.core.component.switch

import com.viam.common.v1.Common.*
import com.viam.component.switch.v1.Switch.*
import com.viam.component.switch.v1.SwitchServiceGrpc
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.resource.ResourceRPCService
import io.grpc.stub.StreamObserver

internal class SwitchRPCService(private val manager: ResourceManager) : SwitchServiceGrpc.SwitchServiceImplBase(),
    ResourceRPCService<Switch> {

    override fun setPosition(
        request: SetPositionRequest,
        responseObserver: StreamObserver<SetPositionResponse>
    ) {
        val switch = getResource(Switch.named(request.name))
        switch.setPosition(request.position.toUInt(), request.extra)
        responseObserver.onNext(SetPositionResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun getPosition(
        request: GetPositionRequest,
        responseObserver: StreamObserver<GetPositionResponse>
    ) {
        val switch = getResource(Switch.named(request.name))
        val position = switch.getPosition(request.extra)
        responseObserver.onNext(GetPositionResponse.newBuilder().setPosition(position.toInt()).build())
        responseObserver.onCompleted()
    }

    override fun getNumberOfPositions(
        request: GetNumberOfPositionsRequest,
        responseObserver: StreamObserver<GetNumberOfPositionsResponse>
    ) {
        val switch = getResource(Switch.named(request.name))
        val numberOfPositions = switch.getNumberOfPositions(request.extra)
        responseObserver.onNext(GetNumberOfPositionsResponse.newBuilder().setNumberOfPositions(numberOfPositions.toInt()).build())
        responseObserver.onCompleted()
    }

    override fun doCommand(
        request: DoCommandRequest, responseObserver: StreamObserver<DoCommandResponse>
    ) {
        val switch = getResource(Switch.named(request.name))
        val result = switch.doCommand(request.command.fieldsMap)
        responseObserver.onNext(DoCommandResponse.newBuilder().setResult(result).build())
        responseObserver.onCompleted()
    }

    override fun getResourceClass(): Class<Switch> {
        return Switch::class.java
    }

    override fun getManager(): ResourceManager {
        return this.manager
    }
}
