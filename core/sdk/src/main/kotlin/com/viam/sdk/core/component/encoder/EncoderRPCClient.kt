package com.viam.sdk.core.component.encoder

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.GetGeometriesRequest
import com.viam.component.encoder.v1.Encoder.*
import com.viam.component.encoder.v1.EncoderServiceGrpc
import com.viam.component.encoder.v1.EncoderServiceGrpc.EncoderServiceBlockingStub
import com.viam.sdk.core.rpc.Channel
import java.util.*
import kotlin.jvm.optionals.getOrDefault

class EncoderRPCClient(name: String, channel: Channel) : Encoder(name) {
    private val client: EncoderServiceBlockingStub

    init {
        val client = EncoderServiceGrpc.newBlockingStub(channel)
        if (channel.callCredentials.isPresent) {
            this.client = client.withCallCredentials(channel.callCredentials.get())
        } else {
            this.client = client
        }
    }

    override fun resetPosition(extra: Struct) {
        val request = ResetPositionRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        this.client.resetPosition(request)
    }

    override fun getPosition(positionType: PositionType?, extra: Struct): Pair<Float, PositionType> {
        val request = GetPositionRequest.newBuilder().setName(this.name.name).setExtra(extra)
        if (positionType != null) {
            request.setPositionType(positionType)
        }
        val response = this.client.getPosition(request.build())
        return (response.value to response.positionType)

    }

    override fun getProperties(extra: Struct): Properties {
        val request = GetPropertiesRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        return this.client.getProperties(request)
    }

    override fun doCommand(command: Map<String, Value>?): Struct {
        val request = Common.DoCommandRequest.newBuilder().setName(this.name.name)
            .setCommand(Struct.newBuilder().putAllFields(command).build()).build()
        val response = this.client.doCommand(request)
        return response.result
    }

    override fun getGeometries(extra: Optional<Struct>): List<Common.Geometry> {
        val request = GetGeometriesRequest.newBuilder().setName(this.name.name)
            .setExtra(extra.getOrDefault(Struct.getDefaultInstance())).build()
        val response = this.client.getGeometries(request)
        return response.geometriesList
    }
}