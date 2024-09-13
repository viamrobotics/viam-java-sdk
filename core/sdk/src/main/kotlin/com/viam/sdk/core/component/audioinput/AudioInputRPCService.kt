package com.viam.sdk.core.component.audioinput

import com.google.api.HttpBody
import com.viam.common.v1.Common.*
import com.viam.component.audioinput.v1.AudioInputServiceGrpc
import com.viam.component.audioinput.v1.Audioinput
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.resource.ResourceRPCService
import io.grpc.stub.StreamObserver
import java.util.*

internal class AudioInputRPCService(private val manager: ResourceManager) :
    AudioInputServiceGrpc.AudioInputServiceImplBase(),
    ResourceRPCService<AudioInput> {

    override fun chunks(
        request: Audioinput.ChunksRequest,
        responseObserver: StreamObserver<Audioinput.ChunksResponse>
    ) {
        val audioInput = getResource(AudioInput.named(request.name))
        val response = audioInput.stream()
        for (chunk in response) {
            responseObserver.onNext(chunk)
        }
        responseObserver.onCompleted()
    }

    override fun properties(
        request: Audioinput.PropertiesRequest,
        responseObserver: StreamObserver<Audioinput.PropertiesResponse>
    ) {
        val audioInput = getResource(AudioInput.named(request.name))
        val result = audioInput.getProperties()
        responseObserver.onNext(result)
        responseObserver.onCompleted()
    }

    override fun record(request: Audioinput.RecordRequest?, responseObserver: StreamObserver<HttpBody>?) {
        throw UnsupportedOperationException()
    }

    override fun doCommand(
        request: DoCommandRequest, responseObserver: StreamObserver<DoCommandResponse>
    ) {
        val audioInput = getResource(AudioInput.named(request.name))
        val result = audioInput.doCommand(request.command.fieldsMap)
        responseObserver.onNext(DoCommandResponse.newBuilder().setResult(result).build())
        responseObserver.onCompleted()
    }

    override fun getGeometries(
        request: GetGeometriesRequest, responseObserver: StreamObserver<GetGeometriesResponse>
    ) {
        val audioInput = getResource(AudioInput.named(request.name))
        val result = audioInput.getGeometries(Optional.of(request.extra))
        responseObserver.onNext(GetGeometriesResponse.newBuilder().addAllGeometries(result).build())
        responseObserver.onCompleted()
    }

    override fun getResourceClass(): Class<AudioInput> {
        return AudioInput::class.java
    }

    override fun getManager(): ResourceManager {
        return this.manager
    }

}