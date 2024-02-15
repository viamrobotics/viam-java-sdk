package com.viam.sdk.core.rpc;

import com.viam.sdk.core.module.BaseModule;
import com.viam.sdk.core.module.ModuleRPCService;
import com.viam.sdk.core.resource.Registry;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.ResourceManager;
import com.viam.sdk.core.resource.ResourceRegistration;
import com.viam.sdk.core.robot.RobotRPCService;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import proto.rpc.webrtc.v1.SignalingServiceGrpc.SignalingServiceImplBase;

/**
 * gRPC Server
 */
public class Server extends ResourceManager {

  private static final Logger LOGGER = Logger.getLogger(Server.class.getName());
  private final io.grpc.Server server;

  /**
   * Initialize the Server with a list of resources to be managed.
   *
   * @param resources     List of resources to be managed
   * @param serverBuilder a gRPC ServerBuilder
   */
  public Server(List<Resource> resources, ServerBuilder<?> serverBuilder) {
    this(resources, serverBuilder, null);
  }

  /**
   * Initialize the Server with a list of resources to be managed.
   *
   * @param resources     List of resources to be managed
   * @param serverBuilder a gRPC ServerBuilder
   * @param moduleService Module service in use
   */
  public Server(List<Resource> resources, ServerBuilder<?> serverBuilder,
      final ModuleRPCService moduleService) {
    super(resources);

    serverBuilder.intercept(new BaseModule.ExceptionInterceptor()).
        addService(new SignalingServiceImplBase() {
          // unimplemented to signal no support
        }).
        addService(new RobotRPCService(this)).
        addService(ProtoReflectionService.newInstance());
    if (moduleService != null) {
      serverBuilder.addService(moduleService);
    }
    for (final ResourceRegistration<?> registration : Registry.registeredSubtypes().values()) {
      if (!registration.getCreateRPCService().isPresent()) {
        continue;
      }
      serverBuilder.addService(registration.getCreateRPCService().get().apply(this));
    }

    server = serverBuilder.build();
  }

  public void start() {
    LOGGER.fine("Starting gRPC server");
    try {
      server.start();
      server.awaitTermination();
    } catch (IOException | InterruptedException e) {
      LOGGER.severe("Error starting server: " + e);
      throw new RuntimeException(e);
    } finally {
      LOGGER.fine("gRPC server closed");
    }
  }
}
