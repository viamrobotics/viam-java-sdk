package com.viam.sdk.core.service.mlmodel;

import java.util.Collections;
import java.util.List;

public class Metadata {

  private final String name;
  private final String type;
  private final String description;

  private final List<TensorInfo> inputs;

  private final List<TensorInfo> outputs;

  private Metadata(Builder builder) {
    name = builder.name;
    type = builder.type;
    description = builder.description;
    inputs = builder.inputs;
    outputs = builder.outputs;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public String getDescription() {
    return description;
  }

  public List<TensorInfo> getInputs() {
    if (inputs == null) {
      return Collections.emptyList();
    }
    return inputs;
  }

  public List<TensorInfo> getOutputs() {
    if (outputs == null) {
      return Collections.emptyList();
    }
    return outputs;
  }

  public static final class Builder {

    private String name;
    private String type;
    private String description;
    private List<TensorInfo> inputs;
    private List<TensorInfo> outputs;

    public Builder() {
    }

    public Builder setName(String val) {
      name = val;
      return this;
    }

    public Builder setType(String val) {
      type = val;
      return this;
    }

    public Builder setDescription(String val) {
      description = val;
      return this;
    }

    public Builder setInputs(List<TensorInfo> val) {
      inputs = val;
      return this;
    }

    public Builder setOutputs(List<TensorInfo> val) {
      outputs = val;
      return this;
    }

    public Metadata build() {
      return new Metadata(this);
    }
  }
}
