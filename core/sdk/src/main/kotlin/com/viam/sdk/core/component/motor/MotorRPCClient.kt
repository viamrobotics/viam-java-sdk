package com.viam.sdk.core.component.motor

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.GetGeometriesRequest
import com.viam.component.motor.v1.Motor.*
import com.viam.component.motor.v1.MotorServiceGrpc
import com.viam.component.motor.v1.MotorServiceGrpc.MotorServiceBlockingStub
import com.viam.sdk.core.rpc.Channel
import java.util.*
import kotlin.jvm.optionals.getOrDefault

class MotorRPCClient(name: String, channel: Channel) : Motor(name) {
    private val client: MotorServiceBlockingStub

    init {
        val client = MotorServiceGrpc.newBlockingStub(channel)
        if (channel.callCredentials.isPresent) {
            this.client = client.withCallCredentials(channel.callCredentials.get())
        } else {
            this.client = client
        }
    }

    override fun setPower(power: Double, extra: Struct) {
        val request = SetPowerRequest.newBuilder().setName(this.name.name).setPowerPct(power).setExtra(extra).build()
        this.client.setPower(request)
    }

    override fun goFor(rpm: Double, revolutions: Double, extra: Struct) {
        val request =
            GoForRequest.newBuilder().setName(this.name.name).setRpm(rpm).setRevolutions(revolutions).setExtra(extra)
                .build()
        this.client.goFor(request)
    }

    override fun goTo(rpm: Double, positionRevolutions: Double, extra: Struct) {
        val request =
            GoToRequest.newBuilder().setName(this.name.name).setRpm(rpm).setPositionRevolutions(positionRevolutions)
                .setExtra(extra).build()
        this.client.goTo(request)
    }

    override fun resetZeroPosition(offset: Double, extra: Struct) {
        val request =
            ResetZeroPositionRequest.newBuilder().setName(this.name.name).setOffset(offset).setExtra(extra).build()
        this.client.resetZeroPosition(request)
    }

    override fun getPosition(extra: Struct): Double {
        val request = GetPositionRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        val response = this.client.getPosition(request)
        return response.position
    }

    override fun getProperties(extra: Struct): Properties {
        val request = GetPropertiesRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        val response = this.client.getProperties(request)
        return Properties(positionReporting = response.positionReporting)
    }

    override fun stop(extra: Struct) {
        val request = StopRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        this.client.stop(request)
    }

    override fun isPowered(extra: Struct): Pair<Boolean, Double> {
        val request = IsPoweredRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        val response = this.client.isPowered(request)
        return Pair(response.isOn, response.powerPct)
    }

    override fun isMoving(): Boolean {
        val request = IsMovingRequest.newBuilder().setName(this.name.name).build()
        val response = this.client.isMoving(request)
        return response.isMoving
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
