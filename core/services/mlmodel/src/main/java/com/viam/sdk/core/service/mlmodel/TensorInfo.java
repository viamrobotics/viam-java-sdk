package com.viam.sdk.core.service.mlmodel;

import com.google.protobuf.Struct;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class TensorInfo {

  private final String name;
  private final String description;
  private final DataType dataType;
  private final List<Integer> shape;
  private final List<File> associatedFiles;

  private final Struct extra;

  private TensorInfo(Builder builder) {
    name = builder.name;
    description = builder.description;
    dataType = builder.dataType;
    shape = builder.shape;
    associatedFiles = builder.associatedFiles;
    extra = builder.extra;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public List<Integer> getShape() {
    return shape;
  }

  public List<File> getAssociatedFiles() {
    if (associatedFiles == null) {
      return Collections.emptyList();
    }
    return associatedFiles;
  }

  public Optional<Struct> getExtra() {
    return Optional.ofNullable(extra);
  }

  public DataType getDataType() {
    return dataType;
  }

  public static class File {

    private final String name;
    private final String description;

    private final LabelType labelType;

    private File(Builder builder) {
      name = builder.name;
      description = builder.description;
      labelType = builder.labelType;
    }

    public String getName() {
      return name;
    }

    public String getDescription() {
      return description;
    }

    public LabelType getLabelType() {
      return labelType;
    }

    public enum LabelType {
      TENSOR_VALUE,
      TENSOR_AXIS
    }

    public static final class Builder {

      private String name;
      private String description;
      private LabelType labelType;

      public Builder() {
      }

      public Builder setName(String val) {
        name = val;
        return this;
      }

      public Builder setDescription(String val) {
        description = val;
        return this;
      }

      public Builder setLabelType(LabelType val) {
        labelType = val;
        return this;
      }

      public File build() {
        return new File(this);
      }
    }
  }

  public enum DataType {
    INT_8,
    UINT_8,
    INT_16,
    UINT_16,
    INT_32,
    UINT_32,
    INT_64,
    UINT_64,
    FLOAT_32,
    FLOAT_64;

    public static DataType from(ai.djl.ndarray.types.DataType dt) {
      switch (dt) {
        case FLOAT32:
          return FLOAT_32;
        case FLOAT64:
          return FLOAT_64;
        case UINT8:
          return UINT_8;
        case INT32:
          return INT_32;
        case INT8:
          return INT_8;
        case INT64:
          return INT_64;
        case UINT64:
          return UINT_64;
        case UINT32:
          return UINT_32;
        case UINT16:
          return UINT_16;
        case INT16:
          return INT_16;
        default:
          throw new IllegalArgumentException("unsupported data type: " + dt);
      }
    }
  }

  public static final class Builder {

    private String name;
    private String description;
    private DataType dataType;
    private List<Integer> shape;
    private List<File> associatedFiles;
    private Struct extra;

    public Builder() {
    }

    public Builder setName(String val) {
      name = val;
      return this;
    }

    public Builder setDescription(String val) {
      description = val;
      return this;
    }

    public Builder setDataType(DataType val) {
      dataType = val;
      return this;
    }

    public Builder setShape(List<Integer> val) {
      shape = val;
      return this;
    }

    public Builder setAssociatedFiles(List<File> val) {
      associatedFiles = val;
      return this;
    }

    public Builder setExtra(Struct val) {
      extra = val;
      return this;
    }

    public TensorInfo build() {
      return new TensorInfo(this);
    }
  }
}
