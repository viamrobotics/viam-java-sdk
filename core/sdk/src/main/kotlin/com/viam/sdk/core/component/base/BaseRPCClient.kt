package com.viam.sdk.core.component.base

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.GetGeometriesRequest
import com.viam.component.base.v1.BaseServiceGrpc
import com.viam.component.base.v1.BaseServiceGrpc.BaseServiceBlockingStub
import com.viam.component.base.v1.Base.*
import com.viam.sdk.core.rpc.Channel
import java.util.*
import kotlin.jvm.optionals.getOrDefault

class BaseRPCClient(name: String, channel: Channel) : Base(name) {
    private val client: BaseServiceBlockingStub

    init {
        val client = BaseServiceGrpc.newBlockingStub(channel)
        if (channel.callCredentials.isPresent) {
            this.client = client.withCallCredentials(channel.callCredentials.get())
        } else {
            this.client = client
        }
    }

    override fun moveStraight(distance: Long, velocity: Double, extra: Struct) {
        val request = MoveStraightRequest.newBuilder().setName(this.name.name).setExtra(extra).setDistanceMm(distance).setMmPerSec(velocity).build()
        client.moveStraight(request)
    }

    override fun spin(angle: Double, velocity: Double, extra: Struct) {
        val request = SpinRequest.newBuilder().setName(this.name.name).setAngleDeg(angle).setDegsPerSec(velocity).setExtra(extra).build()
        client.spin(request)
    }

    override fun setPower(linear: Common.Vector3, angular: Common.Vector3, extra: Struct) {
        val request = SetPowerRequest.newBuilder().setName(this.name.name).setLinear(linear).setAngular(angular).setExtra(extra).build()
        client.setPower(request)
    }

    override fun setVelocity(linear: Common.Vector3, angular: Common.Vector3, extra: Struct) {
       val request = SetVelocityRequest.newBuilder().setName(this.name.name).setLinear(linear).setAngular(angular).setExtra(extra).build()
        client.setVelocity(request)
    }

    override fun stop(extra: Struct) {
        val request = StopRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        this.client.stop(request)
    }
    override fun isMoving(): Boolean {
        val request = IsMovingRequest.newBuilder().setName(this.name.name).build()
        val response = this.client.isMoving(request)
        return response.isMoving
    }

    override fun getProperties(): Properties {
        val request = GetPropertiesRequest.newBuilder().setName(this.name.name).build()
        return client.getProperties(request)
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
