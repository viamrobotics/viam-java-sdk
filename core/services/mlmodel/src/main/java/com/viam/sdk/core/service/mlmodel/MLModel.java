package com.viam.sdk.core.service.mlmodel;

import ai.djl.ndarray.NDArray;
import ai.djl.ndarray.NDManager;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common.ResourceName;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Subtype;
import com.viam.sdk.core.robot.RobotClient;
import com.viam.sdk.core.service.Service;
import java.util.Map;
import java.util.Optional;

public abstract class MLModel extends Service {

  public static final Subtype SUBTYPE = new Subtype(
      Subtype.NAMESPACE_RDK,
      Subtype.RESOURCE_TYPE_SERVICE,
      "mlmodel");

  public MLModel(final String name) {
    super(SUBTYPE, named(name));
  }

  public static ResourceName named(final String name) {
    return Resource.named(SUBTYPE, name);
  }

  public static MLModel fromRobot(final RobotClient robot, final String name) {
    return robot.getResource(MLModel.class, named(name));
  }

  @Override
  public final Struct doCommand(final Map<String, Value> command) {
    throw new UnsupportedOperationException();
  }

  public abstract Map<String, NDArray> infer(
      final Map<String, NDArray> inputTensors,
      final NDManager manager,
      final Optional<Struct> extra);

  public abstract Metadata getMetadata(final Optional<Struct> extra);


}
