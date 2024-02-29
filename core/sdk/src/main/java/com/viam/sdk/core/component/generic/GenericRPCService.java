package com.viam.sdk.core.component.generic;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.Geometry;
import com.viam.common.v1.Common.GetGeometriesRequest;
import com.viam.common.v1.Common.GetGeometriesResponse;
import com.viam.component.generic.v1.GenericServiceGrpc;
import com.viam.sdk.core.resource.ResourceManager;
import com.viam.sdk.core.resource.ResourceRPCService;
import io.grpc.stub.StreamObserver;
import java.util.List;
import java.util.Optional;

public class GenericRPCService extends GenericServiceGrpc.GenericServiceImplBase implements
    ResourceRPCService<Generic> {

  private final ResourceManager manager;

  public GenericRPCService(final ResourceManager manager) {
    this.manager = manager;
  }

  @Override
  public void doCommand(Common.DoCommandRequest request,
      StreamObserver<Common.DoCommandResponse> responseObserver) {
    final Generic generic = getResource(Generic.named(request.getName()));
    final Struct result = generic.doCommand(request.getCommand().getFieldsMap());
    responseObserver.onNext(Common.DoCommandResponse.newBuilder().setResult(result).build());
    responseObserver.onCompleted();
  }

  @Override
  public void getGeometries(GetGeometriesRequest request,
      StreamObserver<GetGeometriesResponse> responseObserver) {
    final Generic generic = getResource(Generic.named(request.getName()));
    final List<Geometry> result = generic.getGeometries(Optional.of(request.getExtra()));
    responseObserver.onNext(GetGeometriesResponse.newBuilder().addAllGeometries(result).build());
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
