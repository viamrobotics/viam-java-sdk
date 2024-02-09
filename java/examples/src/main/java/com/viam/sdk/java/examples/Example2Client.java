package com.viam.sdk.java.examples;

import com.viam.component.movementsensor.v1.MovementSensorServiceGrpc;
import com.viam.component.movementsensor.v1.Movementsensor;
import com.viam.robot.v1.Robot;
import com.viam.robot.v1.RobotServiceGrpc;
import com.viam.sdk.core.DialOptions;
import com.viam.sdk.core.webrtc.DialWebRTCOptions;
import com.viam.sdk.java.Dialer;

import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

import proto.rpc.v1.Auth;
import proto.stream.v1.Stream;
import proto.stream.v1.StreamServiceGrpc;

// Connects to an authenticated server over WebRTC.
public class Example2Client {
    public static void main(final String[] args) throws ExecutionException, InterruptedException {
        final Dialer dialer = new Dialer();

        final DialOptions dialOpts = new DialOptions();
        dialOpts.webrtcOptions = new DialWebRTCOptions();
        dialOpts.webrtcOptions.signalingInsecure = true;
        dialOpts.webrtcOptions.signalingCredentials = Auth.Credentials.newBuilder()
                .setType("api-key")
                .setPayload("sosecret")
                .build();

        final Logger logger = Logger.getAnonymousLogger();
        dialer.dialWebRTC("localhost:8080", "something-unique", dialOpts).thenAcceptAsync((chan) -> {
            final RobotServiceGrpc.RobotServiceBlockingStub robotClient = RobotServiceGrpc.newBlockingStub(chan);
            final Robot.ResourceNamesResponse resp = robotClient.resourceNames(Robot.ResourceNamesRequest.newBuilder().build());
            logger.info(resp.toString());

            final StreamServiceGrpc.StreamServiceBlockingStub streamClient = StreamServiceGrpc.newBlockingStub(chan);
            final Stream.AddStreamResponse streamResp = streamClient.addStream(Stream.AddStreamRequest.newBuilder().setName("camera1").build());
            logger.info(streamResp.toString());

            final MovementSensorServiceGrpc.MovementSensorServiceBlockingStub msClient = MovementSensorServiceGrpc.newBlockingStub(chan);
            final Movementsensor.GetPositionResponse msResp = msClient.getPosition(Movementsensor.GetPositionRequest.newBuilder().setName("gps1").build());
            logger.info(msResp.getCoordinate().toString());

            chan.close();
            dialer.close();
        }).exceptionally((t) -> {
            t.printStackTrace();
            logger.warning("failed to dial: " + t);
            return null;
        }).get();
    }
}
