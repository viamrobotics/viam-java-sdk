package com.viam.sdk.core.component.gripper;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.component.gripper.v1.Gripper;
import com.viam.component.gripper.v1.GripperServiceGrpc;
import com.viam.sdk.core.ResourceManager;
import com.viam.sdk.core.ResourceRPCService;

import io.grpc.stub.StreamObserver;

public class GripperRPCService extends GripperServiceGrpc.GripperServiceImplBase implements ResourceRPCService<com.viam.sdk.core.component.gripper.Gripper> {

    private final ResourceManager manager;

    public GripperRPCService(final ResourceManager manager) {
        this.manager = manager;
    }

    @Override
    public void open(Gripper.OpenRequest request, StreamObserver<Gripper.OpenResponse> responseObserver) {
        final com.viam.sdk.core.component.gripper.Gripper gripper = getResource(com.viam.sdk.core.component.gripper.Gripper.named(request.getName()));
        gripper.open();
        responseObserver.onNext(Gripper.OpenResponse.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void grab(Gripper.GrabRequest request, StreamObserver<Gripper.GrabResponse> responseObserver) {
        final com.viam.sdk.core.component.gripper.Gripper gripper = getResource(com.viam.sdk.core.component.gripper.Gripper.named(request.getName()));
        final boolean success = gripper.grab();
        responseObserver.onNext(Gripper.GrabResponse.newBuilder().setSuccess(success).build());
        responseObserver.onCompleted();
    }

    @Override
    public void stop(Gripper.StopRequest request, StreamObserver<Gripper.StopResponse> responseObserver) {
        final com.viam.sdk.core.component.gripper.Gripper gripper = getResource(com.viam.sdk.core.component.gripper.Gripper.named(request.getName()));
        gripper.stop();
        responseObserver.onNext(Gripper.StopResponse.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void isMoving(Gripper.IsMovingRequest request, StreamObserver<Gripper.IsMovingResponse> responseObserver) {
        final com.viam.sdk.core.component.gripper.Gripper gripper = getResource(com.viam.sdk.core.component.gripper.Gripper.named(request.getName()));
        final boolean isMoving = gripper.isMoving();
        responseObserver.onNext(Gripper.IsMovingResponse.newBuilder().setIsMoving(isMoving).build());
        responseObserver.onCompleted();
    }

    @Override
    public void doCommand(Common.DoCommandRequest request, StreamObserver<Common.DoCommandResponse> responseObserver) {
        final com.viam.sdk.core.component.gripper.Gripper gripper = getResource(com.viam.sdk.core.component.gripper.Gripper.named(request.getName()));
        final Struct result = gripper.doCommand(request.getCommand().getFieldsMap());
        responseObserver.onNext(Common.DoCommandResponse.newBuilder().setResult(result).build());
        responseObserver.onCompleted();
    }

    @Override
    public void getGeometries(Common.GetGeometriesRequest request, StreamObserver<Common.GetGeometriesResponse> responseObserver) {
        super.getGeometries(request, responseObserver);
    }

    @Override
    public Class<com.viam.sdk.core.component.gripper.Gripper> getResourceClass() {
        return com.viam.sdk.core.component.gripper.Gripper.class;
    }

    @Override
    public ResourceManager getManager() {
        return manager;
    }
}
