package com.viam.sdk.core.component.gantry

import com.google.protobuf.ByteString
import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.GetGeometriesRequest
import com.viam.common.v1.Common.GetKinematicsRequest
import com.viam.component.gantry.v1.Gantry.*
import com.viam.component.gantry.v1.GantryServiceGrpc
import com.viam.component.gantry.v1.GantryServiceGrpc.GantryServiceBlockingStub
import com.viam.sdk.core.rpc.Channel
import java.util.*
import kotlin.jvm.optionals.getOrDefault

class GantryRPCClient(name: String, channel: Channel) : Gantry(name) {
    private val client: GantryServiceBlockingStub

    init {
        val client = GantryServiceGrpc.newBlockingStub(channel)
        if (channel.callCredentials.isPresent) {
            this.client = client.withCallCredentials(channel.callCredentials.get())
        } else {
            this.client = client
        }
    }

    override fun getPosition(extra: Struct): List<Double> {
        val request = GetPositionRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        val response = this.client.getPosition(request)
        return response.positionsMmList
    }

    override fun moveToPosition(positions: List<Double>, speeds: List<Double>, extra: Struct) {
        val request =MoveToPositionRequest.newBuilder().setName(this.name.name).setExtra(extra).addAllPositionsMm(positions).addAllSpeedsMmPerSec(speeds).build()
        this.client.moveToPosition(request)
    }

    override fun home(extra: Struct): Boolean {
        val request = HomeRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        val response = this.client.home(request)
        return response.homed
    }

    override fun getLengths(extra: Struct): List<Double> {
        val request = GetLengthsRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        val response = this.client.getLengths(request)
        return response.lengthsMmList
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

    override fun getKinematics(extra: Struct): Pair<Common.KinematicsFileFormat, ByteString> {
        val request = GetKinematicsRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        val response = this.client.getKinematics(request)
        return (response.format to response.kinematicsData)
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