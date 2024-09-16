package com.viam.sdk.core.component.posetracker;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.component.v1.PoseTrackerServiceGrpc;
import com.viam.sdk.core.resource.ResourceManager;
import com.viam.sdk.core.resource.ResourceRPCService;
import io.grpc.stub.StreamObserver;
import com.viam.sdk.core.component.posetracker.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PoseTrackerRPCService extends PoseTrackerServiceGrpc.PoseTrackerServiceImplBase
        implements ResourceRPCService<PoseTracker> {

    private final ResourceManager manager;

    public PoseTrackerRPCService(final ResourceManager manager) {
        this.manager = manager;
    }

    @Override
    public void getPoses(com.viam.component.v1.PoseTracker.GetPosesRequest request, StreamObserver<com.viam.component.v1.PoseTracker.GetPosesResponse> responseObserver) {
        final PoseTracker poseTracker = getResource(PoseTracker.named(request.getName()));
        final Map<String, Common.PoseInFrame> result = poseTracker.getPoses(request.getBodyNamesList(), request.getExtra());
        responseObserver.onNext(com.viam.component.v1.PoseTracker.GetPosesResponse.newBuilder().putAllBodyPoses(result).build());
        responseObserver.onCompleted();
    }

    @Override
    public void doCommand(Common.DoCommandRequest request,
                          StreamObserver<Common.DoCommandResponse> responseObserver) {
        final PoseTracker poseTracker = getResource(
                PoseTracker.named(request.getName())
        );
        final Struct result = poseTracker.doCommand(request.getCommand().getFieldsMap());
        responseObserver.onNext(Common.DoCommandResponse.newBuilder().setResult(result).build());
        responseObserver.onCompleted();
    }

    @Override
    public void getGeometries(Common.GetGeometriesRequest request, StreamObserver<Common.GetGeometriesResponse> responseObserver) {
        final PoseTracker poseTracker = getResource(
                PoseTracker.named(request.getName()));
        final List<Common.Geometry> result = poseTracker.getGeometries(Optional.of(request.getExtra()));
        responseObserver.onNext(Common.GetGeometriesResponse.newBuilder().addAllGeometries(result).build());
        responseObserver.onCompleted();
    }

    @Override
    public Class<PoseTracker> getResourceClass() {
        return PoseTracker.class;
    }

    @Override
    public ResourceManager getManager() {
        return manager;
    }

}