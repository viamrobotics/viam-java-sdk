package com.viam.sdk.java.examples;

import com.viam.rdk.proto.api.component.gps.v1.GPSServiceGrpc;
import com.viam.rdk.proto.api.component.gps.v1.Gps;
import com.viam.rdk.proto.api.robot.v1.Robot;
import com.viam.rdk.proto.api.robot.v1.RobotServiceGrpc;
import com.viam.sdk.core.Channel;
import com.viam.sdk.core.DialOptions;
import com.viam.sdk.java.Dialer;
import proto.rpc.v1.Auth;

import java.util.logging.Logger;

// Connects to an authenticated server.
public class Example3Client {
    public static void main(final String[] args) {
        final Dialer dialer = new Dialer();

        final DialOptions dialOpts = new DialOptions();
        dialOpts.insecure = true;
        dialOpts.authEntity = "something-unique";
        dialOpts.credentials = Auth.Credentials.newBuilder()
                .setType("api-key")
                .setPayload("sosecret")
                .build();

        final Logger logger = Logger.getAnonymousLogger();
        final Channel chan = dialer.dialDirectGRPC("localhost:8080", dialOpts);

        final RobotServiceGrpc.RobotServiceBlockingStub robotClient = RobotServiceGrpc.newBlockingStub(chan).withCallCredentials(chan.getCallCredentials().get());
        final Robot.ResourceNamesResponse resp = robotClient.resourceNames(Robot.ResourceNamesRequest.newBuilder().build());
        logger.info(resp.toString());

        final GPSServiceGrpc.GPSServiceBlockingStub gpsClient = GPSServiceGrpc.newBlockingStub(chan).withCallCredentials(chan.getCallCredentials().get());
        final Gps.ReadLocationResponse gpsResp = gpsClient.readLocation(Gps.ReadLocationRequest.newBuilder().setName("gps1").build());
        logger.info(gpsResp.getCoordinate().toString());

        chan.close();
        dialer.close();
    }
}
