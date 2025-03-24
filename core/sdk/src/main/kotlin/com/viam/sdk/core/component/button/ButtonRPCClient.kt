package com.viam.sdk.core.component.button

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.GetGeometriesRequest
import com.viam.component.button.v1.ButtonServiceGrpc
import com.viam.component.button.v1.ButtonServiceGrpc.ButtonServiceBlockingStub
import com.viam.component.button.v1.PushRequest
import com.viam.sdk.core.rpc.Channel
import java.util.*
import kotlin.jvm.optionals.getOrDefault

class ButtonRPCClient(name: String, channel: Channel) : Button(name) {
    private val client: ButtonServiceBlockingStub

    init {
        val client = ButtonServiceGrpc.newBlockingStub(channel)
        if (channel.callCredentials.isPresent) {
            this.client = client.withCallCredentials(channel.callCredentials.get())
        } else {
            this.client = client
        }
    }

    override fun push(extra: Struct) {
        val request = PushRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        this.client.push(request)
    }

    override fun doCommand(command: Map<String, Value>?): Struct {
        val request = Common.DoCommandRequest.newBuilder().setName(this.name.name)
            .setCommand(Struct.newBuilder().putAllFields(command).build()).build()
        val response = this.client.doCommand(request)
        return response.result
    }
}
