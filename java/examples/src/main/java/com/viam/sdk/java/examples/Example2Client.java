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
    dialOpts.webrtcOptions.signalingServerAddress = "app.viam.com:443";
    dialOpts.webrtcOptions.signalingAuthEntity = "<API_KEY_ID>";
    dialOpts.webrtcOptions.signalingCredentials = Auth.Credentials.newBuilder()
        .setType("api-key")
        .setPayload("<API_KEY>")
        .build();

    final Logger logger = Logger.getAnonymousLogger();
    robotClientFactory.dialWebRTC("<CLOUD_URL>",
            new Options.Builder<MediaStream>().setDialOptions(dialOpts).build())
        .thenAcceptAsync((client) -> {
          logger.info(client.getResourceNames().toString());

          client.close();
          robotClientFactory.close();
        }).exceptionally((t) -> {
          t.printStackTrace();
          logger.warning("failed to dial: " + t);
          return null;
        }).get();
  }
}
