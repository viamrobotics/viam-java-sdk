package com.viam.sdk.core.robot;

import static com.viam.sdk.core.resource.Subtype.RESOURCE_TYPE_COMPONENT;
import static com.viam.sdk.core.resource.Subtype.RESOURCE_TYPE_SERVICE;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common.PoseInFrame;
import com.viam.common.v1.Common.ResourceName;
import com.viam.common.v1.Common.Transform;
import com.viam.robot.v1.Robot.BlockForOperationRequest;
import com.viam.robot.v1.Robot.CancelOperationRequest;
import com.viam.robot.v1.Robot.DiscoverComponentsRequest;
import com.viam.robot.v1.Robot.Discovery;
import com.viam.robot.v1.Robot.DiscoveryQuery;
import com.viam.robot.v1.Robot.FrameSystemConfig;
import com.viam.robot.v1.Robot.FrameSystemConfigRequest;
import com.viam.robot.v1.Robot.GetOperationsRequest;
import com.viam.robot.v1.Robot.GetStatusRequest;
import com.viam.robot.v1.Robot.GetStatusResponse;
import com.viam.robot.v1.Robot.Operation;
import com.viam.robot.v1.Robot.ResourceNamesRequest;
import com.viam.robot.v1.Robot.Status;
import com.viam.robot.v1.Robot.StopAllRequest;
import com.viam.robot.v1.Robot.StopExtraParameters;
import com.viam.robot.v1.Robot.TransformPoseRequest;
import com.viam.robot.v1.RobotServiceGrpc;
import com.viam.robot.v1.RobotServiceGrpc.RobotServiceBlockingStub;
import com.viam.sdk.core.component.Component;
import com.viam.sdk.core.component.movementsensor.MovementSensor;
import com.viam.sdk.core.component.sensor.Sensor;
import com.viam.sdk.core.exception.ResourceSubtypeNotFoundException;
import com.viam.sdk.core.resource.Registry;
import com.viam.sdk.core.resource.ResourceManager;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.rpc.BasicManagedChannel;
import com.viam.sdk.core.rpc.Channel;
import com.viam.sdk.core.rpc.DialOptions;
import com.viam.sdk.core.service.Service;
import io.grpc.ManagedChannel;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import proto.rpc.v1.Auth;
import proto.stream.v1.Stream.AddStreamRequest;
import proto.stream.v1.Stream.RemoveStreamRequest;
import proto.stream.v1.StreamServiceGrpc;
import proto.stream.v1.StreamServiceGrpc.StreamServiceBlockingStub;

// TODO: implement session support
public class RobotClient implements Closeable {

  private static final Logger LOGGER = Logger.getLogger(RobotClient.class.getName());
  final Channel chan;
  final RobotServiceBlockingStub robotClient;
  final StreamServiceBlockingStub streamClient;
  private final ResourceManager manager = new ResourceManager(Collections.emptyList());
  private final List<ResourceName> resourceNames = new ArrayList<>();
  private Thread refreshIntervalThread;
  private boolean closed;

  public RobotClient(final Channel chan) {
    this(chan, new Options.Builder<Void>().build());
  }

  public <MediaStreamT> RobotClient(final Channel chan, Options<MediaStreamT> options) {
    if (options == null) {
      options = new Options.Builder<MediaStreamT>().build();
    }
    this.chan = chan;
    final RobotServiceBlockingStub robotClient = RobotServiceGrpc.newBlockingStub(chan);
    final StreamServiceBlockingStub streamClient = StreamServiceGrpc.newBlockingStub(chan);
    if (chan.getCallCredentials().isPresent()) {
      this.robotClient = robotClient.withCallCredentials(chan.getCallCredentials().get());
      this.streamClient = streamClient.withCallCredentials(chan.getCallCredentials().get());
    } else {
      this.robotClient = robotClient;
      this.streamClient = streamClient;
    }

    try {
      refresh();
    } catch (final Throwable t) {
      LOGGER.severe(
          "Unable to establish a connection to the robot. Ensure the robot is online and reachable and try again.");
      this.close();
      throw t;
    }

    if (options.getRefreshInterval() > 0) {
      Options<MediaStreamT> finalOptions = options;
      refreshIntervalThread = new Thread(() -> {
        while (true) {
          try {
            Thread.sleep(finalOptions.getRefreshInterval() * 1000L);
          } catch (InterruptedException e) {
            return;
          }
          refresh();
        }
      });
      refreshIntervalThread.start();
    }

    //noinspection StatementWithEmptyBody
    if (options.getCheckConnectionInterval() > 0 || options.getAttemptReconnectInterval() > 0) {
      // TODO: reconnect - implement reconnect thread
    }
  }

  public RobotClient(final ManagedChannel chan) {
    this(new BasicManagedChannel(chan));
  }

  public void refresh() {
    final List<ResourceName> resourceNames = robotClient.resourceNames(
        ResourceNamesRequest.newBuilder().build()).getResourcesList();
    synchronized (this) {
      if (this.resourceNames.equals(resourceNames)) {
        return;
      }
      for (final ResourceName name : resourceNames) {
        if (!(name.getType().equals(RESOURCE_TYPE_COMPONENT) || name.getType()
            .equals(RESOURCE_TYPE_SERVICE))) {
          continue;
        }
        if (name.getSubtype().equals("remote")) {
          continue;
        }

        // If the resource is a MovementSensor, DO NOT include Sensor as well (it will get added via MovementSensor)
        if (name.getSubtype().equals(Sensor.SUBTYPE.getResourceSubtype()) && resourceNames.contains(
            MovementSensor.named(name.getName()))) {
          continue;
        }
        try {
          createOrResetClient(name);
        } catch (final Throwable t) {
          LOGGER.severe(String.format("Error creating or resetting client for %s: %s", name, t));
        }
      }

      for (final ResourceName name : this.resourceNames) {
        if (!resourceNames.contains(name)) {
          manager.removeResource(name);
        }
      }

      this.resourceNames.clear();
      this.resourceNames.addAll(resourceNames);
    }
    LOGGER.fine(String.format(Locale.getDefault(), "refreshed %d resources", resourceNames.size()));
  }

  private void createOrResetClient(final ResourceName name) {
    //noinspection StatementWithEmptyBody
    if (manager.isManaging(name)) {
      // TODO: reconnect - handle resetting channel on reconnect with a ReconfigurableChannel
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

  public synchronized Component getComponent(final ResourceName name) {
    if (!name.getType().equals(RESOURCE_TYPE_COMPONENT)) {
      throw new IllegalArgumentException(
          String.format("ResourceName does not describe a component: %s", name));
    }
    return manager.getResource(Component.class, name);
  }

  public synchronized Service getService(final ResourceName name) {
    if (!name.getType().equals(RESOURCE_TYPE_SERVICE)) {
      throw new IllegalArgumentException(
          String.format("ResourceName does not describe a service: %s", name));
    }
    return manager.getResource(Service.class, name);
  }

  public synchronized <ResourceT> ResourceT getResource(Class<ResourceT> resourceClass,
      ResourceName name) {
    return manager.getResource(resourceClass, name);
  }

  public synchronized List<ResourceName> getResourceNames() {
    return new ArrayList<>(resourceNames);
  }

  public List<Status> getStatus() {
    return getStatus(Collections.emptyList());
  }

  public List<Status> getStatus(final List<ResourceName> resourceNames) {
    final GetStatusRequest request = GetStatusRequest.newBuilder().
        addAllResourceNames(resourceNames).
        build();
    final GetStatusResponse response = robotClient.getStatus(request);
    return response.getStatusList();
  }

  public List<Operation> getOperations() {
    return robotClient.getOperations(GetOperationsRequest.newBuilder().build())
        .getOperationsList();
  }

  public void cancelOperation(final String id) {
    final CancelOperationRequest request = CancelOperationRequest.newBuilder()
        .setId(id)
        .build();
    //noinspection ResultOfMethodCallIgnored
    robotClient.cancelOperation(request);
  }

  public void blockForOperation(final String id) {
    final BlockForOperationRequest request = BlockForOperationRequest.newBuilder()
        .setId(id)
        .build();
    //noinspection ResultOfMethodCallIgnored
    robotClient.blockForOperation(request);
  }

  public List<FrameSystemConfig> getFrameSystemConfig() {
    return getFrameSystemConfig(Collections.emptyList());
  }

  public List<FrameSystemConfig> getFrameSystemConfig(
      final List<Transform> additionalTransforms) {
    final FrameSystemConfigRequest request = FrameSystemConfigRequest.newBuilder()
        .addAllSupplementalTransforms(additionalTransforms)
        .build();
    return robotClient.frameSystemConfig(request).getFrameSystemConfigsList();
  }

  public PoseInFrame transformPose(final PoseInFrame query,
      final String destination) {
    return transformPose(query, destination, Collections.emptyList());
  }

  public PoseInFrame transformPose(final PoseInFrame query, final String destination,
      final List<Transform> additionalTransforms) {
    final TransformPoseRequest request = TransformPoseRequest.newBuilder()
        .setSource(query)
        .setDestination(destination)
        .addAllSupplementalTransforms(additionalTransforms)
        .build();
    return robotClient.transformPose(request).getPose();
  }

  public void transformPointCloud() {
    throw new UnsupportedOperationException();
  }

  public List<Discovery> discoverComponents(final List<DiscoveryQuery> queries) {
    return robotClient.discoverComponents(
            DiscoverComponentsRequest.newBuilder().addAllQueries(queries).build())
        .getDiscoveryList();
  }

  public void stopAll() {
    stopAll(Collections.emptyMap());
  }

  public void stopAll(final Map<ResourceName, Map<String, Value>> extra) {
    final List<StopExtraParameters> ep = new ArrayList<>();
    for (final Entry<ResourceName, Map<String, Value>> entry : extra.entrySet()) {
      ep.add(StopExtraParameters.newBuilder()
          .setName(entry.getKey())
          .setParams(Struct.newBuilder().putAllFields(entry.getValue()))
          .build());
    }
    //noinspection ResultOfMethodCallIgnored
    robotClient.stopAll(StopAllRequest.newBuilder().addAllExtra(ep).build());
  }

  public void addStream(final String name) {
    //noinspection ResultOfMethodCallIgnored
    streamClient.addStream(AddStreamRequest.newBuilder().setName(name).build());
  }

  public void removeStream(final String name) {
    //noinspection ResultOfMethodCallIgnored
    streamClient.removeStream(RemoveStreamRequest.newBuilder().setName(name).build());
  }

  @Override
  public synchronized void close() {
    LOGGER.fine("Closing RobotClient");
    if (closed) {
      LOGGER.fine("RobotClient is already closed");
      return;
    }
    if (refreshIntervalThread != null) {
      refreshIntervalThread.interrupt();
    }
    chan.close();
    closed = true;
    // TODO: maybe implement not closing of channel if constructor has a shouldCloseChannel
  }

  public static class Options<MediaStreamT> {

    private final int refreshInterval;
    private final DialOptions<MediaStreamT> dialOptions;
    private final Level logLevel;
    private final int checkConnectionInterval;
    private final int attemptReconnectInterval;
    private final boolean disableSessions;

    private Options(Builder<MediaStreamT> builder) {
      refreshInterval = builder.refreshInterval;
      dialOptions = builder.dialOptions;
      logLevel = builder.logLevel;
      checkConnectionInterval = builder.checkConnectionInterval;
      attemptReconnectInterval = builder.attemptReconnectInterval;
      disableSessions = builder.disableSessions;
    }

    public int getRefreshInterval() {
      return refreshInterval;
    }

    public DialOptions<MediaStreamT> getDialOptions() {
      return dialOptions;
    }

    public Level getLogLevel() {
      return logLevel;
    }

    public int getCheckConnectionInterval() {
      return checkConnectionInterval;
    }

    public int getAttemptReconnectInterval() {
      return attemptReconnectInterval;
    }

    public boolean isDisableSessions() {
      return disableSessions;
    }

    public static final class Builder<MediaStreamT> {

      private int refreshInterval = 0;
      private DialOptions<MediaStreamT> dialOptions = null;
      private Level logLevel = Level.INFO;
      private int checkConnectionInterval = 10;
      private int attemptReconnectInterval = 1;
      private boolean disableSessions = false;

      public Builder() {
      }

      public Builder<MediaStreamT> setRefreshInterval(final int refreshInterval) {
        this.refreshInterval = refreshInterval;
        return this;
      }

      public Builder<MediaStreamT> setDialOptions(final DialOptions<MediaStreamT> dialOptions) {
        this.dialOptions = dialOptions;
        return this;
      }

      public Builder<MediaStreamT> setLogLevel(Level logLevel) {
        this.logLevel = logLevel;
        return this;
      }

      public Builder<MediaStreamT> setCheckConnectionInterval(int checkConnectionInterval) {
        this.checkConnectionInterval = checkConnectionInterval;
        return this;
      }

      public Builder<MediaStreamT> setAttemptReconnectInterval(int attemptReconnectInterval) {
        this.attemptReconnectInterval = attemptReconnectInterval;
        return this;
      }

      public Builder<MediaStreamT> setDisableSessions(boolean disableSessions) {
        this.disableSessions = disableSessions;
        return this;
      }

      public Builder<MediaStreamT> setAPIKey(final String apiKeyID, final String apiKey) {
        if (this.dialOptions == null) {
          this.dialOptions = new DialOptions<>();
        }
        this.dialOptions.authEntity = apiKeyID;
        this.dialOptions.credentials = Auth.Credentials.newBuilder()
            .setType("api-key")
            .setPayload(apiKey)
            .build();
        return this;
      }

      public Options<MediaStreamT> build() {
        return new Options<>(this);
      }
    }
  }
}
