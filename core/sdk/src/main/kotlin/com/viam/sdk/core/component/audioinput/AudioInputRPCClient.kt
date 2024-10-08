package com.viam.sdk.core.component.audioinput

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.GetGeometriesRequest
import com.viam.component.audioinput.v1.AudioInputServiceGrpc
import com.viam.component.audioinput.v1.AudioInputServiceGrpc.AudioInputServiceBlockingStub
import com.viam.component.audioinput.v1.Audioinput
import com.viam.sdk.core.rpc.Channel
import java.util.*
import kotlin.jvm.optionals.getOrDefault

class AudioInputRPCClient(name: String, channel: Channel) : AudioInput(name) {
    private val client: AudioInputServiceBlockingStub

    init {
        val client = AudioInputServiceGrpc.newBlockingStub(channel)
        if (channel.callCredentials.isPresent) {
            this.client = client.withCallCredentials(channel.callCredentials.get())
        } else {
            this.client = client
        }
    }

    override fun stream(): AudioStream {
        val request = Audioinput.ChunksRequest.newBuilder().setName(this.name.name)
            .setSampleFormat(Audioinput.SampleFormat.SAMPLE_FORMAT_FLOAT32_INTERLEAVED).build()
        val response = this.client.chunks(request)
        return response
    }

    override fun getProperties(): Properties {
        val request = Audioinput.PropertiesRequest.newBuilder().setName(this.name.name).build()
        return this.client.properties(request)
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
