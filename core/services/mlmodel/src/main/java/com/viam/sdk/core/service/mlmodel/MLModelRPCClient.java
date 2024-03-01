package com.viam.sdk.core.service.mlmodel;

import static com.viam.sdk.core.service.mlmodel.MLModelRPCService.metadataFromProto;
import static com.viam.sdk.core.service.mlmodel.MLModelRPCService.ndArraysFromProto;
import static com.viam.sdk.core.service.mlmodel.MLModelRPCService.ndArraysToProto;

import ai.djl.ndarray.NDArray;
import ai.djl.ndarray.NDManager;
import com.google.protobuf.Struct;
import com.viam.sdk.core.rpc.Channel;
import com.viam.service.mlmodel.v1.MLModelServiceGrpc;
import com.viam.service.mlmodel.v1.MLModelServiceGrpc.MLModelServiceBlockingStub;
import com.viam.service.mlmodel.v1.Mlmodel.InferRequest;
import com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest;
import java.util.Map;
import java.util.Optional;

public class MLModelRPCClient extends MLModel {

  private final MLModelServiceBlockingStub client;

  public MLModelRPCClient(final String name, final Channel chan) {
    super(name);
    final MLModelServiceBlockingStub client = MLModelServiceGrpc.newBlockingStub(
        chan);
    if (chan.getCallCredentials().isPresent()) {
      this.client = client.withCallCredentials(chan.getCallCredentials().get());
    } else {
      this.client = client;
    }
  }

  @Override
  public Map<String, NDArray> infer(Map<String, NDArray> inputTensors,
      NDManager manager, final Optional<Struct> extra) {
    final InferRequest.Builder builder = InferRequest.newBuilder().setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    builder.setInputTensors(ndArraysToProto(inputTensors));
    return ndArraysFromProto(client.infer(builder.build()).getOutputTensors());
  }

  @Override
  public Metadata getMetadata(final Optional<Struct> extra) {
    final MetadataRequest.Builder builder = MetadataRequest.newBuilder()
        .setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return metadataFromProto(client.metadata(builder.build()).getMetadata());
  }
}
