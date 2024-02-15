package com.viam.sdk.core.module;

import static com.viam.sdk.core.resource.Subtype.RESOURCE_TYPE_COMPONENT;
import static com.viam.sdk.core.resource.Subtype.RESOURCE_TYPE_SERVICE;

import com.viam.common.v1.Common;
import com.viam.common.v1.Common.ResourceName;
import com.viam.robot.v1.Robot;
import com.viam.sdk.core.resource.Model;
import com.viam.sdk.core.resource.Registry;
import com.viam.sdk.core.resource.Registry.SubtypeModel;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Resource.Reconfigurable;
import com.viam.sdk.core.resource.Resource.Stoppable;
import com.viam.sdk.core.resource.ResourceCreator;
import com.viam.sdk.core.resource.ResourceRegistration;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.resource.Utils;
import com.viam.sdk.core.robot.RobotClient;
import com.viam.sdk.core.rpc.Server;
import io.grpc.ForwardingServerCallListener;
import io.grpc.Metadata;
import io.grpc.ServerBuilder;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import viam.app.v1.Robot.ComponentConfig;
import viam.module.v1.Module.AddResourceRequest;
import viam.module.v1.Module.HandlerDefinition;
import viam.module.v1.Module.HandlerMap;
import viam.module.v1.Module.ReadyRequest;
import viam.module.v1.Module.ReadyResponse;
import viam.module.v1.Module.ReconfigureResourceRequest;
import viam.module.v1.Module.RemoveResourceRequest;
import viam.module.v1.Module.ValidateConfigRequest;
import viam.module.v1.ModuleServiceGrpc;

public abstract class BaseModule extends ModuleServiceGrpc.ModuleServiceImplBase {

  private static final Logger LOGGER = Logger.getLogger("module");

  protected final String address;
  private final Server server;
  private boolean isReady = true;
  private final Level logLevel;

  /**
   * Create a new Module with the args provided in the command line. The first argument after the
   * command must be the socket path. If the second argument after the command is
   * "--log-level=debug", the Module's logger will be DEBUG level. Otherwise, it will be INFO level.
   * See LogLevel documentation in the RDK for more information on how to start modules with a
   * "log-level" commandline argument.
   */
  public BaseModule(final String[] args) {
    if (args.length < 1) {
      throw new IllegalArgumentException("Need socket path as command line argument");
    }
    address = args[0];

    if (args.length == 2 && args[1].endsWith("=debug")) {
      logLevel = Level.FINE;
    } else {
      logLevel = Level.INFO;
    }
    ConsoleHandler logHandler = new ConsoleHandler();
    Logger rootLogger = LogManager.getLogManager().getLogger("");
    rootLogger.setLevel(logLevel);
    logHandler.setLevel(logLevel);
    rootLogger.addHandler(logHandler);

    Thread.setDefaultUncaughtExceptionHandler(
        (thread, throwable) -> LOGGER.severe("[ERROR] Uncaught exception: " + throwable));
    server = new Server(Collections.emptyList(), getServerBuilder(), new ModuleRPCService(this));
  }

  protected Level getLogLevel() {
    return logLevel;
  }

  abstract protected ServerBuilder<?> getServerBuilder();

  public synchronized void setReady(boolean ready) {
    this.isReady = ready;
  }

  protected abstract void setParentAddress(final String parentAddress);

  protected abstract RobotClient getParent();

  private Resource getResource(final Common.ResourceName name) {
    getParent().refresh();
    if (name.getType().equals(RESOURCE_TYPE_COMPONENT)) {
      return getParent().getComponent(name);
    } else if (name.getType().equals(RESOURCE_TYPE_SERVICE)) {
      return getParent().getService(name);
    }
    throw new IllegalArgumentException("Dependency does not describe a component nor a service");
  }

  private Map<Common.ResourceName, Resource> getDependencies(final Set<String> dependencies) {
    Map<Common.ResourceName, Resource> resDeps = new HashMap<>();
    for (final String dep : dependencies) {
      final Common.ResourceName name = Utils.resourceNameFromString(dep);
      resDeps.put(name, getResource(name));
    }
    return resDeps;
  }

  /**
   * Start the module service and gRPC server
   */
  public void start() {
    try {
      server.start();
    } finally {
      stop();
    }
  }

  private void stop() {
    LOGGER.fine("Shutting down module");
    try {
      if (getParent() != null) {
        getParent().close();
      }
    } catch (final Throwable t) {
      LOGGER.severe("Encountered error while shutting down module: " + t);
    }
  }

  public synchronized void addResource(final AddResourceRequest request) {
    final Map<Common.ResourceName, Resource> deps = getDependencies(
        new HashSet<>(request.getDependenciesList()));
    final ComponentConfig config = request.getConfig();
    final Subtype subtype = new Subtype(config.getApi());
    final Model model = new Model(config.getModel());
    final ResourceCreator creator = Registry.lookupResourceCreator(subtype, model);
    final Resource resource = creator.apply(config, deps);
    server.add(resource);
  }

  public void reconfigureResource(final ReconfigureResourceRequest request) {
    final Map<Common.ResourceName, Resource> deps = getDependencies(
        new HashSet<>(request.getDependenciesList()));
    final ComponentConfig config = request.getConfig();
    final Subtype subtype = new Subtype(config.getApi());
    final ResourceName name = ResourceName.newBuilder()
        .setNamespace(subtype.getNamespace())
        .setType(subtype.getResourceType())
        .setSubtype(subtype.getResourceSubtype())
        .setName(config.getName())
        .build();
    final Resource resource = server.getResource(Resource.class, name);
    if (resource instanceof Reconfigurable) {
      ((Reconfigurable) resource).reconfigure(config, deps);
    } else {
      if (resource instanceof Stoppable) {
        ((Stoppable) resource).stop(Optional.empty());
      }
      server.removeResource(name);
      this.addResource(AddResourceRequest.newBuilder()
          .setConfig(config)
          .addAllDependencies(request.getDependenciesList())
          .build());
    }
  }

  public void removeResource(final RemoveResourceRequest request) {
    final ResourceName name = Utils.resourceNameFromString(request.getName());
    final Resource resource = server.getResource(Resource.class, name);
    try {
      if (resource instanceof Stoppable) {
        ((Stoppable) resource).stop(Optional.empty());
      }
    } finally {
      server.removeResource(name);
    }
  }

  public synchronized ReadyResponse ready(final ReadyRequest request) {
    setParentAddress(request.getParentAddress());

    final Map<protoServiceSubtypePair, List<Model>> svcNameToModels = new HashMap<>();
    for (final SubtypeModel subtypeModel : Registry.registeredResourceCreators().keySet()) {
      final ResourceRegistration<?> registration = Registry.lookupSubtype(subtypeModel.subtype);
      final String serviceName = registration.getProtoServiceName();

      final protoServiceSubtypePair pair = new protoServiceSubtypePair(serviceName,
          subtypeModel.subtype);
      final List<Model> models = svcNameToModels.getOrDefault(pair, new ArrayList<>());
      models.add(subtypeModel.model);
      svcNameToModels.put(pair, models);
    }

    final List<HandlerDefinition> handlers = new ArrayList<>();
    for (final Map.Entry<protoServiceSubtypePair, List<Model>> entry : svcNameToModels.entrySet()) {
      final Robot.ResourceRPCSubtype rpcSubtype = Robot.ResourceRPCSubtype.newBuilder().
          setSubtype(Common.ResourceName.newBuilder().
              setNamespace(entry.getKey().subtype.getNamespace()).
              setType(entry.getKey().subtype.getResourceType()).
              setSubtype(entry.getKey().subtype.getResourceSubtype()).
              setName("").
              build()).
          setProtoService(entry.getKey().serviceName).
          build();
      handlers.add(HandlerDefinition.newBuilder().
          setSubtype(rpcSubtype).
          addAllModels(entry.getValue().stream().map(Model::toString).collect(Collectors.toList())).
          build());
    }
    final HandlerMap handlerMap = HandlerMap.newBuilder().
        addAllHandlers(handlers).build();
    return ReadyResponse.newBuilder().setReady(isReady).setHandlermap(handlerMap).build();
  }

  public Set<String> validateConfig(ValidateConfigRequest request) {
    final ComponentConfig config = request.getConfig();
    final Subtype subtype = new Subtype(config.getApi());
    final Model model = new Model(config.getModel());
    final Optional<Function<ComponentConfig, Set<String>>> validator =
        Registry.lookupValidator(subtype, model);
    if (!validator.isPresent()) {
      return Collections.emptySet();
    }
    return validator.get().apply(config);
  }

  private static class protoServiceSubtypePair {

    public final String serviceName;
    public final Subtype subtype;

    private protoServiceSubtypePair(String serviceName, Subtype subtype) {
      this.serviceName = serviceName;
      this.subtype = subtype;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      protoServiceSubtypePair that = (protoServiceSubtypePair) o;
      return Objects.equals(serviceName, that.serviceName) && Objects.equals(subtype, that.subtype);
    }

    @Override
    public int hashCode() {
      return Objects.hash(serviceName, subtype);
    }
  }

  public static class ExceptionInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
        ServerCall<ReqT, RespT> serverCall,
        Metadata metadata,
        ServerCallHandler<ReqT, RespT> serverCallHandler
    ) {
      ServerCall.Listener<ReqT> listener = serverCallHandler.startCall(serverCall, metadata);
      return new ExceptionHandlingServerCallListener<>(listener, serverCall);
    }

    private static class ExceptionHandlingServerCallListener<ReqT, RespT>
        extends ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT> {

      private final ServerCall<ReqT, RespT> serverCall;

      ExceptionHandlingServerCallListener(ServerCall.Listener<ReqT> listener,
          ServerCall<ReqT, RespT> serverCall) {
        super(listener);
        this.serverCall = serverCall;
      }

      @Override
      public void onHalfClose() {
        try {
          super.onHalfClose();
        } catch (final Throwable t) {
          handleException(t);
          throw t;
        }
      }

      @Override
      public void onReady() {
        try {
          super.onReady();
        } catch (final Throwable t) {
          handleException(t);
          throw t;
        }
      }

      private void handleException(final Throwable t) {
        Metadata metadata = Status.trailersFromThrowable(t);
        if (metadata == null) {
          metadata = new Metadata();
        }
        serverCall.close(Status.fromThrowable(t), metadata);
      }
    }
  }
}
