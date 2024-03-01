package com.viam.sdk.core.service.mlmodel;

import com.viam.sdk.core.resource.ResourceRegistration;
import com.viam.service.mlmodel.v1.MLModelServiceGrpc;

public class Registry {

  public static boolean registered;

  public synchronized static void useService() {
    if (registered) {
      return;
    }
    registered = true;
    com.viam.sdk.core.resource.Registry.registerSubtype(new ResourceRegistration<>(
        MLModel.SUBTYPE,
        MLModelServiceGrpc.SERVICE_NAME,
        MLModelRPCService::new,
        MLModelRPCClient::new
    ));
  }
}
