package com.viam.sdk.java.examples;

import com.viam.sdk.core.component.movementsensor.MovementSensor;
import com.viam.sdk.core.robot.RobotClient.Options;
import com.viam.sdk.core.rpc.DialOptions;
import com.viam.sdk.core.webrtc.DialWebRTCOptions;
import com.viam.sdk.java.RobotClientFactory;
import dev.onvoid.webrtc.media.MediaStream;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;
import proto.rpc.v1.Auth;

// Connects to an authenticated server over WebRTC.
public class Example2Client {

  public static void main(final String[] args) throws ExecutionException, InterruptedException {
    @SuppressWarnings("resource") final RobotClientFactory robotClientFactory = new RobotClientFactory();

    final DialOptions<MediaStream> dialOpts = new DialOptions<>();
    dialOpts.webrtcOptions = new DialWebRTCOptions<>();
    dialOpts.webrtcOptions.signalingInsecure = true;
    dialOpts.webrtcOptions.signalingServerAddress = "localhost:8080";
    dialOpts.webrtcOptions.signalingCredentials = Auth.Credentials.newBuilder()
        .setType("api-key")
        .setPayload("sosecret")
        .build();

    final Logger logger = Logger.getAnonymousLogger();
    robotClientFactory.dialWebRTC("something-unique",
            new Options.Builder<MediaStream>().setDialOptions(dialOpts).build())
        .thenAcceptAsync((client) -> {
          logger.info(client.getResourceNames().toString());

          client.addStream("camera1");

          final MovementSensor sensor = MovementSensor.fromRobot(client, "gps1");
          logger.info(sensor.getPosition(Optional.empty()).getCoordinate().toString());

          client.close();
          robotClientFactory.close();
        }).exceptionally((t) -> {
          t.printStackTrace();
          logger.warning("failed to dial: " + t);
          return null;
        }).get();
  }
}
