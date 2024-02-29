package com.viam.sdk.android.examples.simple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.viam.sdk.android.RobotClientFactory;
import com.viam.sdk.core.component.movementsensor.MovementSensor;
import com.viam.sdk.core.robot.RobotClient.Options;
import com.viam.sdk.core.rpc.DialOptions;
import com.viam.sdk.core.webrtc.DialWebRTCOptions;
import com.viam.sdk.core.webrtc.PeerConnection;
import java.util.Optional;
import java.util.logging.Logger;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.MediaStream;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoTrack;
import proto.rpc.v1.Auth;

public class MainActivity extends AppCompatActivity {

  static SurfaceViewRenderer fullscreenRenderer;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //noinspection resource
    final RobotClientFactory robotClientFactory = new RobotClientFactory(this);

    fullscreenRenderer = findViewById(R.id.fullscreen_video_view);
    fullscreenRenderer.init(
        robotClientFactory.getEGLBase().getEglBaseContext(),
        null,
        EglBase.CONFIG_PLAIN,
        new GlRectDrawer());

    final DialOptions<MediaStream> dialOpts = new DialOptions<>();
    dialOpts.webrtcOptions = new DialWebRTCOptions<>();
    dialOpts.webrtcOptions.signalingServerAddress = "10.0.2.2:8080";

    // use normal creds?
    dialOpts.webrtcOptions.signalingInsecure = true;
    dialOpts.webrtcOptions.signalingCredentials = Auth.Credentials.newBuilder()
        .setType("api-key")
        .setPayload("sosecret")
        .build();

    final Logger logger = Logger.getAnonymousLogger();
    dialOpts.webrtcOptions.mediaStreamObserver = new PeerConnection.MediaStreamObserver<>() {
      @Override
      public void onAddStream(final MediaStream mediaStream) {
        final VideoTrack vt = mediaStream.videoTracks.get(0);
        vt.setEnabled(true);
        vt.addSink(MainActivity.fullscreenRenderer);
      }

      @Override
      public void onRemoveStream(final MediaStream mediaStream) {
        logger.info("MainActivity:onRemoveStream");
      }
    };

    final Options<MediaStream> options = new Options.Builder<MediaStream>().setDialOptions(dialOpts)
        .build();
    robotClientFactory.dialWebRTC("something-unique", options)
        .thenAcceptAsync((client) -> {
          logger.info(client.getResourceNames().toString());

          client.addStream("camera1");

          final MovementSensor sensor = MovementSensor.fromRobot(client, "gps1");
          logger.info(sensor.getPosition(Optional.empty()).getCoordinate().toString());
        }).exceptionally((t) -> {
          t.printStackTrace();
          logger.warning("failed to dial: " + t);
          return null;
        });
  }
}