package com.viam.sdk.java.examples;

import com.viam.sdk.core.component.movementsensor.MovementSensor;
import com.viam.sdk.core.robot.RobotClient;
import com.viam.sdk.core.robot.RobotClient.Options;
import com.viam.sdk.core.rpc.DialOptions;
import com.viam.sdk.java.RobotClientFactory;
import dev.onvoid.webrtc.media.MediaStream;
import java.util.Optional;
import java.util.logging.Logger;
import proto.rpc.v1.Auth;

// Connects to an authenticated server.
public class Example3Client {

  public static void main(final String[] args) {
    try (final RobotClientFactory robotClientFactory = new RobotClientFactory()) {
      final DialOptions<MediaStream> dialOpts = new DialOptions<>();
      dialOpts.insecure = true;
      dialOpts.authEntity = "something-unique";
      dialOpts.credentials = Auth.Credentials.newBuilder().setType("api-key").setPayload("sosecret")
          .build();

      final Logger logger = Logger.getAnonymousLogger();
      try (final RobotClient client = robotClientFactory.dialDirectGRPC("localhost:8080",
          new Options.Builder<MediaStream>().setDialOptions(dialOpts).build())) {
        logger.info(client.getResourceNames().toString());

        final MovementSensor sensor = MovementSensor.fromRobot(client, "gps1");
        logger.info(sensor.getPosition(Optional.empty()).getCoordinate().toString());
      }
    }
  }
}
