package com.viam.sdk.core.component.button

import com.viam.common.v1.Common.*
import com.viam.component.button.v1.ButtonServiceGrpc
import com.viam.component.button.v1.PushRequest
import com.viam.component.button.v1.PushResponse
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.resource.ResourceRPCService
import io.grpc.stub.StreamObserver

internal class ButtonRPCService(private val manager: ResourceManager) : ButtonServiceGrpc.ButtonServiceImplBase(),
    ResourceRPCService<Button> {
    
    override fun push(
        request: PushRequest,
        responseObserver: StreamObserver<PushResponse>
    ) {
        val button = getResource(Button.named(request.name))
        button.push(request.extra)
        responseObserver.onNext(PushResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun doCommand(
        request: DoCommandRequest, responseObserver: StreamObserver<DoCommandResponse>
    ) {
        val button = getResource(Button.named(request.name))
        val result = button.doCommand(request.command.fieldsMap)
        responseObserver.onNext(DoCommandResponse.newBuilder().setResult(result).build())
        responseObserver.onCompleted()
    }

    override fun getResourceClass(): Class<Button> {
        return Button::class.java
    }

    override fun getManager(): ResourceManager {
        return this.manager
    }
}
