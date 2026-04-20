package com.viam.sdk.core.component.audioin

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.GetPropertiesRequest
import com.viam.common.v1.Common.GetGeometriesRequest
import com.viam.component.audioin.v1.AudioInServiceGrpc
import com.viam.component.audioin.v1.AudioInServiceGrpc.AudioInServiceBlockingStub
import com.viam.component.audioin.v1.Audioin
import com.viam.sdk.core.rpc.Channel
import java.util.*
import kotlin.jvm.optionals.getOrDefault

class AudioInRPCClient(name: String, channel: Channel) : AudioIn(name) {
    private val client: AudioInServiceBlockingStub

    init {
        val client = AudioInServiceGrpc.newBlockingStub(channel)
        if (channel.callCredentials.isPresent) {
            this.client = client.withCallCredentials(channel.callCredentials.get())
        } else {
            this.client = client
        }
    }

    override fun getAudio(): AudioStream {
        val request = Audioin.GetAudioRequest.newBuilder().setName(this.name.name).build()
        return this.client.getAudio(request)
    }

    override fun getProperties(): Properties {
        val request = GetPropertiesRequest.newBuilder().setName(this.name.name).build()
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
