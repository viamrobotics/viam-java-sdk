package com.viam.sdk.core.component.generic;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.sdk.core.ResourceManager;
import com.viam.sdk.core.ResourceRPCService;
import com.viam.component.generic.v1.GenericServiceGrpc;

import io.grpc.stub.StreamObserver;

public class GenericRPCService extends GenericServiceGrpc.GenericServiceImplBase implements ResourceRPCService<Generic> {

    private final ResourceManager manager;

    public GenericRPCService(final ResourceManager manager) {
        this.manager = manager;
    }

    @Override
    public void doCommand(Common.DoCommandRequest request, StreamObserver<Common.DoCommandResponse> responseObserver) {
        final Generic generic = getResource(Generic.named(request.getName()));
        final Struct result = generic.doCommand(request.getCommand().getFieldsMap());
        responseObserver.onNext(Common.DoCommandResponse.newBuilder().setResult(result).build());
        responseObserver.onCompleted();
    }

    @Override
    public Class<Generic> getResourceClass() {
        return Generic.class;
    }

    @Override
    public ResourceManager getManager() {
        return manager;
    }
}
