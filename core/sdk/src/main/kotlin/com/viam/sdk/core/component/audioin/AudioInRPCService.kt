package com.viam.sdk.core.component.audioin

import com.viam.common.v1.Common.*
import com.viam.component.audioin.v1.AudioInServiceGrpc
import com.viam.component.audioin.v1.Audioin
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.resource.ResourceRPCService
import io.grpc.stub.StreamObserver
import java.util.*

internal class AudioInRPCService(private val manager: ResourceManager) :
    AudioInServiceGrpc.AudioInServiceImplBase(),
    ResourceRPCService<AudioIn> {

    override fun getAudio(request: Audioin.GetAudioRequest, responseObserver: StreamObserver<Audioin.GetAudioResponse>) {
        val audioIn = getResource(AudioIn.named(request.name))
        val response = audioIn.getAudio()
        for (resp in response) {
            responseObserver.onNext(resp)
        }
        responseObserver.onCompleted()
    }

    override fun getProperties(request: GetPropertiesRequest, responseObserver: StreamObserver<GetPropertiesResponse>) {
        val audioInput = getResource(AudioIn.named(request.name))
        val result = audioInput.getProperties()
        responseObserver.onNext(result)
        responseObserver.onCompleted()
    }

    override fun doCommand(
        request: DoCommandRequest, responseObserver: StreamObserver<DoCommandResponse>
    ) {
        val audioInput = getResource(AudioIn.named(request.name))
        val result = audioInput.doCommand(request.command.fieldsMap)
        responseObserver.onNext(DoCommandResponse.newBuilder().setResult(result).build())
        responseObserver.onCompleted()
    }

    override fun getGeometries(
        request: GetGeometriesRequest, responseObserver: StreamObserver<GetGeometriesResponse>
    ) {
        val audioInput = getResource(AudioIn.named(request.name))
        val result = audioInput.getGeometries(Optional.of(request.extra))
        responseObserver.onNext(GetGeometriesResponse.newBuilder().addAllGeometries(result).build())
        responseObserver.onCompleted()
    }

    override fun getResourceClass(): Class<AudioIn> {
        return AudioIn::class.java
    }

    override fun getManager(): ResourceManager {
        return this.manager
    }

}
