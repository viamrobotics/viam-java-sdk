package com.viam.sdk.java.examples;

import com.viam.sdk.core.robot.RobotClient;
import com.viam.sdk.core.robot.RobotClient.Options;
import com.viam.sdk.core.rpc.DialOptions;
import com.viam.sdk.java.RobotClientFactory;
import dev.onvoid.webrtc.media.MediaStream;
import java.util.logging.Logger;

public class Example1Client {

  public static void main(final String[] args) {
    if (args.length < 1) {
      System.err.println("must supply grpc address");
      return;
    }
    final String grpcAddress = args[0];

    try (final RobotClientFactory robotClientFactory = new RobotClientFactory()) {
      final DialOptions<MediaStream> dialOpts = new DialOptions<>();
      dialOpts.insecure = true;

      final Logger logger = Logger.getAnonymousLogger();
      try (final RobotClient robotClient = robotClientFactory.dialDirectGRPC(
          grpcAddress,
          new Options.Builder<MediaStream>().setDialOptions(dialOpts).build())) {
        logger.info(robotClient.getResourceNames().toString());
      }
    }
  }
}
