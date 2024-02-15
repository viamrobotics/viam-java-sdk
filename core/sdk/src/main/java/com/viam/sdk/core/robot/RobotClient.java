package com.viam.sdk.core.robot;

import static com.viam.sdk.core.resource.Subtype.RESOURCE_TYPE_COMPONENT;
import static com.viam.sdk.core.resource.Subtype.RESOURCE_TYPE_SERVICE;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.robot.v1.Robot;
import com.viam.robot.v1.RobotServiceGrpc;
import com.viam.sdk.core.component.Component;
import com.viam.sdk.core.exception.ResourceSubtypeNotFoundException;
import com.viam.sdk.core.resource.Registry;
import com.viam.sdk.core.resource.ResourceManager;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.rpc.BasicManagedChannel;
import com.viam.sdk.core.rpc.Channel;
import com.viam.sdk.core.service.Service;
import io.grpc.ManagedChannel;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

// TODO: implement session support
public class RobotClient implements Closeable {

  private static final Logger LOGGER = Logger.getLogger(RobotClient.class.getName());
  final Channel chan;
  final RobotServiceGrpc.RobotServiceBlockingStub robotClient;
  private final ResourceManager manager = new ResourceManager(Collections.emptyList());
  private final List<Common.ResourceName> resourceNames = new ArrayList<>();
  private boolean closed;

  public RobotClient(final Channel chan) {
    this.chan = chan;
    final RobotServiceGrpc.RobotServiceBlockingStub client = RobotServiceGrpc.newBlockingStub(chan);
    if (chan.getCallCredentials().isPresent()) {
      robotClient = client.withCallCredentials(chan.getCallCredentials().get());
    } else {
      robotClient = client;
    }

    try {
      refresh();
    } catch (final Throwable t) {
      LOGGER.severe(
          "Unable to establish a connection to the robot. Ensure the robot is online and reachable and try again.");
      try {
        this.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      throw t;
    }

    // TODO(erd): configurable
    // TODO(erd): handle refresh interval stuff
    new Thread(() -> {
      while (true) {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        refresh();
      }
    }).start();
  }

  public RobotClient(final ManagedChannel chan) {
    this(new BasicManagedChannel(chan));
  }

  public void refresh() {
    final List<Common.ResourceName> resourceNames = robotClient.resourceNames(
        Robot.ResourceNamesRequest.newBuilder().build()).getResourcesList();
    synchronized (this) {
      if (this.resourceNames.equals(resourceNames)) {
        return;
      }
      for (final Common.ResourceName name : resourceNames) {
        if (!(name.getType().equals(RESOURCE_TYPE_COMPONENT) || name.getType()
            .equals(RESOURCE_TYPE_SERVICE))) {
          continue;
        }
        if (name.getSubtype().equals("remote")) {
          continue;
        }
        // TODO(erd): movement sensor logic
        try {
          createOrResetClient(name);
        } catch (final Throwable t) {
          LOGGER.severe(String.format("Error creating or resetting client for %s: %s", name, t));
        }
      }

      for (final Common.ResourceName name : this.resourceNames) {
        if (!resourceNames.contains(name)) {
          manager.removeResource(name);
        }
      }

      this.resourceNames.clear();
      this.resourceNames.addAll(resourceNames);
    }
    LOGGER.fine(String.format("refreshed %d resources", resourceNames.size()));
  }

  private void createOrResetClient(final Common.ResourceName name) {
    if (manager.isManaging(name)) {
      // TODO(erd): handle resetting channel on reconnect with a ReconfigurableChannel
//            manager.removeResource(name);
//            manager.add(Registry.
//                    lookupSubtype(Subtype.fromResourceName(name)).
//                    getCreateRPCClient().
//                    apply(name.getName(), chan));
    } else {
      try {
        manager.add(Registry.
            lookupSubtype(Subtype.fromResourceName(name)).
            getCreateRPCClient().
            apply(name.getName(), chan));
      } catch (final ResourceSubtypeNotFoundException ignored) {
        LOGGER.info(String.format(
            "Failed to create client for %s because the subtype has no registered RPC client",
            name));
      }
    }
  }

  public synchronized Component getComponent(final Common.ResourceName name) {
    if (!name.getType().equals(RESOURCE_TYPE_COMPONENT)) {
      throw new IllegalArgumentException(
          String.format("ResourceName does not describe a component: %s", name));
    }
    return manager.getResource(Component.class, name);
  }

  public synchronized Service getService(final Common.ResourceName name) {
    if (!name.getType().equals(RESOURCE_TYPE_SERVICE)) {
      throw new IllegalArgumentException(
          String.format("ResourceName does not describe a service: %s", name));
    }
    return manager.getResource(Service.class, name);
  }

  public synchronized <ResourceT> ResourceT getResource(Class<ResourceT> resourceClass,
      Common.ResourceName name) {
    return manager.getResource(resourceClass, name);
  }

  public synchronized List<Common.ResourceName> getResourceNames() {
    return new ArrayList<>(resourceNames);
  }

  public List<Robot.Status> getStatus() {
    return getStatus(Collections.emptyList());
  }

  public List<Robot.Status> getStatus(final List<Common.ResourceName> resourceNames) {
    final Robot.GetStatusRequest request = Robot.GetStatusRequest.newBuilder().
        addAllResourceNames(resourceNames).
        build();
    final Robot.GetStatusResponse response = robotClient.getStatus(request);
    return response.getStatusList();
  }

  public List<Robot.Operation> getOperations() {
    return robotClient.getOperations(Robot.GetOperationsRequest.newBuilder().build())
        .getOperationsList();
  }

  public void cancelOperation(final String id) {
    final Robot.CancelOperationRequest request = Robot.CancelOperationRequest.newBuilder()
        .setId(id)
        .build();
    robotClient.cancelOperation(request);
  }

  public void blockForOperation(final String id) {
    final Robot.BlockForOperationRequest request = Robot.BlockForOperationRequest.newBuilder()
        .setId(id)
        .build();
    robotClient.blockForOperation(request);
  }

  public List<Robot.FrameSystemConfig> getFrameSystemConfig() {
    return getFrameSystemConfig(Collections.emptyList());
  }

  public List<Robot.FrameSystemConfig> getFrameSystemConfig(
      final List<Common.Transform> additionalTransforms) {
    final Robot.FrameSystemConfigRequest request = Robot.FrameSystemConfigRequest.newBuilder()
        .addAllSupplementalTransforms(additionalTransforms)
        .build();
    return robotClient.frameSystemConfig(request).getFrameSystemConfigsList();
  }

  public Common.PoseInFrame transformPose(final Common.PoseInFrame query,
      final String destination) {
    return transformPose(query, destination, Collections.emptyList());
  }

  public Common.PoseInFrame transformPose(final Common.PoseInFrame query, final String destination,
      final List<Common.Transform> additionalTransforms) {
    final Robot.TransformPoseRequest request = Robot.TransformPoseRequest.newBuilder()
        .setSource(query)
        .setDestination(destination)
        .addAllSupplementalTransforms(additionalTransforms)
        .build();
    return robotClient.transformPose(request).getPose();
  }

  public void transformPointCloud() {
    throw new UnsupportedOperationException();
  }

  public List<Robot.Discovery> discoverComponents(final List<Robot.DiscoveryQuery> queries) {
    return robotClient.discoverComponents(
            Robot.DiscoverComponentsRequest.newBuilder().addAllQueries(queries).build())
        .getDiscoveryList();
  }

  public void stopAll() {
    stopAll(Collections.emptyMap());
  }

  public void stopAll(final Map<Common.ResourceName, Map<String, Value>> extra) {
    final List<Robot.StopExtraParameters> ep = new ArrayList<>();
    for (final Map.Entry<Common.ResourceName, Map<String, Value>> entry : extra.entrySet()) {
      ep.add(Robot.StopExtraParameters.newBuilder()
          .setName(entry.getKey())
          .setParams(Struct.newBuilder().putAllFields(entry.getValue()))
          .build());
    }
    robotClient.stopAll(Robot.StopAllRequest.newBuilder().addAllExtra(ep).build());
  }

  @Override
  public synchronized void close() throws IOException {
    LOGGER.fine("Closing RobotClient");
    if (closed) {
      LOGGER.fine("RobotClient is already closed");
      return;
    }
    closed = true;
    // TODO(erd): impl more?
  }
}
