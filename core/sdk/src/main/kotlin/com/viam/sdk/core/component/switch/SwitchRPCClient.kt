package com.viam.sdk.core.component.switch

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.GetGeometriesRequest
import com.viam.component.switch.v1.SwitchServiceGrpc
import com.viam.component.switch.v1.SwitchServiceGrpc.SwitchServiceBlockingStub
import com.viam.component.switch.v1.Switch.*
import com.viam.sdk.core.rpc.Channel
import java.util.*
import kotlin.jvm.optionals.getOrDefault

class SwitchRPCClient(name: String, channel: Channel) : Switch(name) {
    private val client: SwitchServiceBlockingStub

    init {
        val client = SwitchServiceGrpc.newBlockingStub(channel)
        if (channel.callCredentials.isPresent) {
            this.client = client.withCallCredentials(channel.callCredentials.get())
        } else {
            this.client = client
        }
    }

    override fun setPosition(position: UInt, extra: Struct) {
        val request = SetPositionRequest.newBuilder()
            .setName(this.name.name)
            .setPosition(position.toInt())
            .setExtra(extra)
            .build()
        this.client.setPosition(request)
    }

    override fun getPosition(extra: Struct): UInt {
        val request = GetPositionRequest.newBuilder()
            .setName(this.name.name)
            .setExtra(extra)
            .build()
        val response = this.client.getPosition(request)
        return response.position.toUInt()
    }

    override fun getNumberOfPositions(extra: Struct): UInt {
        val request = GetNumberOfPositionsRequest.newBuilder()
            .setName(this.name.name)
            .setExtra(extra)
            .build()
        val response = this.client.getNumberOfPositions(request)
        return response.numberOfPositions.toUInt()
    }

    override fun doCommand(command: Map<String, Value>?): Struct {
        val request = Common.DoCommandRequest.newBuilder().setName(this.name.name)
            .setCommand(Struct.newBuilder().putAllFields(command).build()).build()
        val response = this.client.doCommand(request)
        return response.result
    }
}
