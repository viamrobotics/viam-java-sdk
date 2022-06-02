package com.viam.sdk.android.examples.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.viam.rdk.proto.api.component.gps.v1.GPSServiceGrpc;
import com.viam.rdk.proto.api.component.gps.v1.Gps;
import com.viam.rdk.proto.api.robot.v1.Robot;
import com.viam.rdk.proto.api.robot.v1.RobotServiceGrpc;
import com.viam.sdk.core.DialOptions;
import com.viam.sdk.android.Dialer;
import com.viam.sdk.core.webrtc.DialWebRTCOptions;
import com.viam.sdk.core.webrtc.PeerConnection;
import org.webrtc.*;
import proto.rpc.v1.Auth;
import proto.stream.v1.Stream;
import proto.stream.v1.StreamServiceGrpc;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    static SurfaceViewRenderer fullscreenRenderer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Dialer dialer = new Dialer(this);

        fullscreenRenderer = findViewById(R.id.fullscreen_video_view);
        fullscreenRenderer.init(
                dialer.getEGLBase().getEglBaseContext(),
                null,
                EglBase.CONFIG_PLAIN,
                new GlRectDrawer());

        final DialOptions dialOpts = new DialOptions();
        dialOpts.webrtcOptions = new DialWebRTCOptions();
        dialOpts.webrtcOptions.signalingInsecure = true;
        dialOpts.webrtcOptions.signalingCredentials = Auth.Credentials.newBuilder()
                .setType("api-key")
                .setPayload("sosecret")
                .build();

        final Logger logger = Logger.getAnonymousLogger();
        dialer.dialWebRTC(
                "10.0.2.2:8080",
                "something-unique",
                dialOpts,
                new PeerConnection.MediaStreamObserver<MediaStream>() {
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
                }).thenAcceptAsync((chan) -> {
            final RobotServiceGrpc.RobotServiceBlockingStub robotClient = RobotServiceGrpc.newBlockingStub(chan);
            final Robot.ResourceNamesResponse resp = robotClient.resourceNames(Robot.ResourceNamesRequest.newBuilder().build());
            logger.info(resp.toString());

            final StreamServiceGrpc.StreamServiceBlockingStub streamClient = StreamServiceGrpc.newBlockingStub(chan);
            final Stream.AddStreamResponse streamResp = streamClient.addStream(Stream.AddStreamRequest.newBuilder().setName("camera1").build());
            logger.info(streamResp.toString());

            final GPSServiceGrpc.GPSServiceBlockingStub gpsClient = GPSServiceGrpc.newBlockingStub(chan);
            final Gps.ReadLocationResponse gpsResp = gpsClient.readLocation(Gps.ReadLocationRequest.newBuilder().setName("gps1").build());
            logger.info(gpsResp.getCoordinate().toString());
        }).exceptionally((t) -> {
            t.printStackTrace();
            logger.warning("failed to dial: " + t);
            return null;
        });
    }
}