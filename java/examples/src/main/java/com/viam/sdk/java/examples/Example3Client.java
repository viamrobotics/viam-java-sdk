package com.viam.sdk.java.examples;

import com.viam.component.movementsensor.v1.MovementSensorServiceGrpc;
import com.viam.component.movementsensor.v1.Movementsensor;
import com.viam.robot.v1.Robot;
import com.viam.robot.v1.RobotServiceGrpc;
import com.viam.sdk.core.Channel;
import com.viam.sdk.core.DialOptions;
import com.viam.sdk.java.Dialer;

import java.util.logging.Logger;

import proto.rpc.v1.Auth;

// Connects to an authenticated server.
@SuppressWarnings("OptionalGetWithoutIsPresent")
public class Example3Client {
	public static void main(final String[] args) {
		final Dialer dialer = new Dialer();

		final DialOptions dialOpts = new DialOptions();
		dialOpts.insecure = true;
		dialOpts.authEntity = "something-unique";
		dialOpts.credentials = Auth.Credentials.newBuilder().setType("api-key").setPayload("sosecret").build();

		final Logger logger = Logger.getAnonymousLogger();
		final Channel chan = dialer.dialDirectGRPC("localhost:8080", dialOpts);

		final RobotServiceGrpc.RobotServiceBlockingStub robotClient = RobotServiceGrpc.newBlockingStub(chan)
				.withCallCredentials(chan.getCallCredentials().get());
		final Robot.ResourceNamesResponse resp = robotClient.resourceNames(Robot.ResourceNamesRequest.newBuilder().build());
		logger.info(resp.toString());

		final MovementSensorServiceGrpc.MovementSensorServiceBlockingStub msClient = MovementSensorServiceGrpc
				.newBlockingStub(chan).withCallCredentials(chan.getCallCredentials().get());
		final Movementsensor.GetPositionResponse msResp = msClient
				.getPosition(Movementsensor.GetPositionRequest.newBuilder().setName("gps1").build());
		logger.info(msResp.getCoordinate().toString());

		chan.close();
		dialer.close();
	}
}
