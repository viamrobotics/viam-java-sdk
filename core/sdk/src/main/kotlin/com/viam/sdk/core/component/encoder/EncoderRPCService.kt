package com.viam.sdk.core.component.encoder

import com.viam.common.v1.Common.*
import com.viam.component.encoder.v1.Encoder.*
import com.viam.component.encoder.v1.EncoderServiceGrpc
import com.viam.sdk.core.component.encoder.Encoder
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.resource.ResourceRPCService
import io.grpc.stub.StreamObserver
import java.util.*

internal class EncoderRPCService(private val manager: ResourceManager) : EncoderServiceGrpc.EncoderServiceImplBase(),
    ResourceRPCService<Encoder> {

    override fun resetPosition(
        request: ResetPositionRequest,
        responseObserver: StreamObserver<ResetPositionResponse>
    ) {
        val encoder = getResource(Encoder.named(request.name))
        encoder.resetPosition(request.extra)
        responseObserver.onNext(ResetPositionResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun getPosition(request: GetPositionRequest, responseObserver: StreamObserver<GetPositionResponse>) {
        val encoder = getResource(Encoder.named(request.name))
        val position: Pair<Float, PositionType> = if (request.hasPositionType())
            encoder.getPosition(request.positionType, request.extra)
        else
            encoder.getPosition(request.extra)
        responseObserver.onNext(
            GetPositionResponse.newBuilder().setPositionType(position.second).setValue(position.first).build()
        )
        responseObserver.onCompleted()
    }

    override fun getProperties(
        request: GetPropertiesRequest,
        responseObserver: StreamObserver<GetPropertiesResponse>
    ) {
        val encoder = getResource(Encoder.named(request.name))
        val properties = encoder.getProperties(request.extra)
        responseObserver.onNext(
            GetPropertiesResponse.newBuilder().setTicksCountSupported(properties.ticksCountSupported)
                .setAngleDegreesSupported(properties.angleDegreesSupported).build()
        )
        responseObserver.onCompleted()
    }

    override fun doCommand(
        request: DoCommandRequest, responseObserver: StreamObserver<DoCommandResponse>
    ) {
        val encoder = getResource(Encoder.named(request.name))
        val result = encoder.doCommand(request.command.fieldsMap)
        responseObserver.onNext(DoCommandResponse.newBuilder().setResult(result).build())
        responseObserver.onCompleted()
    }

    override fun getGeometries(
        request: GetGeometriesRequest, responseObserver: StreamObserver<GetGeometriesResponse>
    ) {
        val encoder = getResource(Encoder.named(request.name))
        val result = encoder.getGeometries(Optional.of(request.extra))
        responseObserver.onNext(GetGeometriesResponse.newBuilder().addAllGeometries(result).build())
        responseObserver.onCompleted()
    }

    override fun getResourceClass(): Class<Encoder> {
        return Encoder::class.java
    }

    override fun getManager(): ResourceManager {
        return this.manager
    }
}