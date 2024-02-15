package com.viam.sdk.java.examples;

import com.viam.robot.v1.Robot;
import com.viam.robot.v1.RobotServiceGrpc;
import com.viam.sdk.core.rpc.Channel;
import com.viam.sdk.core.rpc.DialOptions;
import com.viam.sdk.java.Dialer;
import java.util.logging.Logger;

public class Example1Client {

  public static void main(final String[] args) {
    if (args.length < 1) {
      System.err.println("must supply grpc address");
      return;
    }
    final String grpcAddress = args[0];

    final Dialer dialer = new Dialer();

    final DialOptions dialOpts = new DialOptions();
    dialOpts.insecure = true;

    final Logger logger = Logger.getAnonymousLogger();
    final Channel chan = dialer.dialDirectGRPC(grpcAddress, dialOpts);

    final RobotServiceGrpc.RobotServiceBlockingStub robotClient = RobotServiceGrpc.newBlockingStub(
        chan);
    final Robot.ResourceNamesResponse resp = robotClient.resourceNames(
        Robot.ResourceNamesRequest.newBuilder().build());
    logger.info(resp.toString());

    chan.close();
    dialer.close();
  }
}
