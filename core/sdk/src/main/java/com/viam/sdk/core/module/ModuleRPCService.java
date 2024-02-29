package com.viam.sdk.core.module;

import io.grpc.stub.StreamObserver;
import java.util.Set;
import viam.module.v1.Module;
import viam.module.v1.ModuleServiceGrpc;

public class ModuleRPCService extends ModuleServiceGrpc.ModuleServiceImplBase {

  private final BaseModule module;

  public ModuleRPCService(final BaseModule module) {
    this.module = module;
  }

  @Override
  public void addResource(Module.AddResourceRequest request,
      StreamObserver<Module.AddResourceResponse> responseObserver) {
    module.addResource(request);
    responseObserver.onNext(Module.AddResourceResponse.newBuilder().build());
    responseObserver.onCompleted();
  }

  @Override
  public void reconfigureResource(Module.ReconfigureResourceRequest request,
      StreamObserver<Module.ReconfigureResourceResponse> responseObserver) {
    module.reconfigureResource(request);
    responseObserver.onNext(Module.ReconfigureResourceResponse.newBuilder().build());
    responseObserver.onCompleted();
  }

  @Override
  public void removeResource(Module.RemoveResourceRequest request,
      StreamObserver<Module.RemoveResourceResponse> responseObserver) {
    module.removeResource(request);
    responseObserver.onNext(Module.RemoveResourceResponse.newBuilder().build());
    responseObserver.onCompleted();
  }

  @Override
  public void ready(Module.ReadyRequest request,
      StreamObserver<Module.ReadyResponse> responseObserver) {
    final Module.ReadyResponse response = module.ready(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void validateConfig(Module.ValidateConfigRequest request,
      StreamObserver<Module.ValidateConfigResponse> responseObserver) {
    final Set<String> dependencies = module.validateConfig(request);
    responseObserver.onNext(Module.ValidateConfigResponse.newBuilder().
        addAllDependencies(dependencies).build());
    responseObserver.onCompleted();
  }
}
