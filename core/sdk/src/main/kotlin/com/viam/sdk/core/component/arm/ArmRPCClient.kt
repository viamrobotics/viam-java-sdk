package com.viam.sdk.core.component.arm

import com.google.protobuf.ByteString
import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.GetGeometriesRequest
import com.viam.common.v1.Common.GetKinematicsRequest
import com.viam.component.arm.v1.Arm.*
import com.viam.component.arm.v1.ArmServiceGrpc
import com.viam.component.arm.v1.ArmServiceGrpc.ArmServiceBlockingStub
import com.viam.sdk.core.rpc.Channel
import java.util.*
import kotlin.jvm.optionals.getOrDefault

class ArmRPCClient(name: String, channel: Channel) : Arm(name) {
    private val client: ArmServiceBlockingStub

    init {
        val client = ArmServiceGrpc.newBlockingStub(channel)
        if (channel.callCredentials.isPresent) {
            this.client = client.withCallCredentials(channel.callCredentials.get())
        } else {
            this.client = client
        }
    }

    override fun getEndPosition(extra: Struct): Common.Pose {
        val request = GetEndPositionRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        val response = this.client.getEndPosition(request)
        return response.pose
    }

    override fun moveToPosition(pose: Common.Pose, extra: Struct) {
        val request = MoveToPositionRequest.newBuilder().setName(this.name.name).setTo(pose).setExtra(extra).build()
        this.client.moveToPosition(request)

    }

    override fun moveToJointPositions(positions: JointPositions, extra: Struct) {
        val request = MoveToJointPositionsRequest.newBuilder().setName(this.name.name).setPositions(positions).setExtra(extra).build()
        this.client.moveToJointPositions(request)
    }

    override fun getJointPositions(extra: Struct): JointPositions {
        val request = GetJointPositionsRequest.newBuilder().setName(this.name.name).setExtra(extra).build()
        val response = this.client.getJointPositions(request)
        return response.positions
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