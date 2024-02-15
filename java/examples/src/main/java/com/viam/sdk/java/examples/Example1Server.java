package com.viam.sdk.java.examples;

import com.viam.common.v1.Common;
import com.viam.robot.v1.Robot;
import com.viam.robot.v1.RobotServiceGrpc;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import java.io.IOException;
import java.util.logging.Logger;

public class Example1Server {

  public static void main(final String[] args) {
    int port = 50051;
    if (args.length > 0) {
      port = Integer.parseInt(args[0]);
    }

    final Logger logger = Logger.getAnonymousLogger();
    logger.info(String.format("Serving on localhost:%d", port));
    final io.grpc.Server server = ServerBuilder.forPort(port).
        addService(ProtoReflectionService.newInstance()).
        addService(new RobotService()).build();
    try {
      server.start();
      server.awaitTermination();
    } catch (final IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static class RobotService extends RobotServiceGrpc.RobotServiceImplBase {

    public void resourceNames(final Robot.ResourceNamesRequest request,
        final io.grpc.stub.StreamObserver<Robot.ResourceNamesResponse> responseObserver) {
      responseObserver.onNext(Robot.ResourceNamesResponse.newBuilder().
          addResources(Common.ResourceName.newBuilder().
              setNamespace("rdk").
              setType("component").
              setSubtype("base").
              setName("base1").build()).build());
      responseObserver.onCompleted();
    }
  }
}
