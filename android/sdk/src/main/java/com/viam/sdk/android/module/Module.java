package com.viam.sdk.android.module;

import android.net.LocalSocketAddress;
import com.viam.sdk.core.module.BaseModule;
import com.viam.sdk.core.robot.RobotClient;
import io.grpc.ManagedChannel;
import io.grpc.ServerBuilder;
import io.grpc.android.UdsChannelBuilder;

public class Module extends BaseModule {

  RobotClient parent;

  /**
   * Create a new Module with the args provided in the command line. The first argument after the
   * command must be the socket path. If the second argument after the command is
   * "--log-level=debug", the Module's logger will be DEBUG level. Otherwise, it will be INFO level.
   * See LogLevel documentation in the RDK for more information on how to start modules with a
   * "log-level" commandline argument.
   */
  public Module(final String[] args) {
    super(args);
  }

  @Override
  protected void setParentAddress(final String parentAddress) {
    final ManagedChannel chan = UdsChannelBuilder.forPath(parentAddress,
        LocalSocketAddress.Namespace.FILESYSTEM).build();
    parent = new RobotClient(chan);
  }

  @Override
  protected RobotClient getParent() {
    return parent;
  }

  @Override
  public ServerBuilder<?> getServerBuilder() {
    return UdsServerBuilder.
        forPath(address, LocalSocketAddress.Namespace.FILESYSTEM);
  }
}
