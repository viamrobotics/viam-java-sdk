package com.viam.sdk.java.examples;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.sdk.core.component.generic.Generic;
import com.viam.sdk.core.rpc.Server;
import io.grpc.ServerBuilder;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

public class Example1Server {

  public static void main(final String[] args) {
    int port = 50051;
    if (args.length > 0) {
      port = Integer.parseInt(args[0]);
    }

    final Logger logger = Logger.getAnonymousLogger();
    logger.info(String.format(Locale.getDefault(), "Serving on localhost:%d", port));
    final Generic generic = new MyGeneric("generic1");
    try (Server server = new Server(List.of(generic), ServerBuilder.forPort(port))) {
      server.start();
    }
  }

  public static class MyGeneric extends Generic {

    public MyGeneric(final String name) {
      super(name);
    }

    @Override
    public Struct doCommand(Map<String, Value> command) {
      final Struct.Builder builder = Struct.newBuilder();
      return builder.putFields("hello", Value.newBuilder().setBoolValue(true).build()).build();
    }
  }
}
