package com.viam.sdk.core.service.mlmodel;

import ai.djl.ndarray.NDArray;
import ai.djl.ndarray.NDManager;
import ai.djl.ndarray.types.Shape;
import ai.djl.util.Pair;
import com.google.protobuf.ByteString;
import com.viam.sdk.core.resource.ResourceManager;
import com.viam.sdk.core.resource.ResourceRPCService;
import com.viam.sdk.core.service.mlmodel.TensorInfo.DataType;
import com.viam.sdk.core.service.mlmodel.TensorInfo.File;
import com.viam.service.mlmodel.v1.MLModelServiceGrpc;
import com.viam.service.mlmodel.v1.Mlmodel;
import com.viam.service.mlmodel.v1.Mlmodel.FlatTensor;
import com.viam.service.mlmodel.v1.Mlmodel.FlatTensorDataDouble;
import com.viam.service.mlmodel.v1.Mlmodel.FlatTensorDataFloat;
import com.viam.service.mlmodel.v1.Mlmodel.FlatTensorDataInt16;
import com.viam.service.mlmodel.v1.Mlmodel.FlatTensorDataInt32;
import com.viam.service.mlmodel.v1.Mlmodel.FlatTensorDataInt64;
import com.viam.service.mlmodel.v1.Mlmodel.FlatTensorDataInt8;
import com.viam.service.mlmodel.v1.Mlmodel.FlatTensorDataUInt16;
import com.viam.service.mlmodel.v1.Mlmodel.FlatTensorDataUInt32;
import com.viam.service.mlmodel.v1.Mlmodel.FlatTensorDataUInt64;
import com.viam.service.mlmodel.v1.Mlmodel.FlatTensorDataUInt8;
import com.viam.service.mlmodel.v1.Mlmodel.FlatTensors;
import com.viam.service.mlmodel.v1.Mlmodel.InferRequest;
import com.viam.service.mlmodel.v1.Mlmodel.InferResponse;
import com.viam.service.mlmodel.v1.Mlmodel.LabelType;
import com.viam.service.mlmodel.v1.Mlmodel.MetadataRequest;
import com.viam.service.mlmodel.v1.Mlmodel.MetadataResponse;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MLModelRPCService extends
    MLModelServiceGrpc.MLModelServiceImplBase implements
    ResourceRPCService<MLModel> {

  private static NDManager ndManager = NDManager.newBaseManager();

  private final ResourceManager manager;

  public MLModelRPCService(final ResourceManager manager) {
    this.manager = manager;
  }

  public synchronized static void setNDManager(NDManager ndManager) {
    MLModelRPCService.ndManager = ndManager;
  }

  @Override
  public void infer(InferRequest request,
      io.grpc.stub.StreamObserver<InferResponse> responseObserver) {
    final MLModel model = getResource(MLModel.named(request.getName()));
    final Map<String, NDArray> result = model.infer(
        ndArraysFromProto(request.getInputTensors()), ndManager,
        Optional.of(request.getExtra()));
    responseObserver.onNext(
        InferResponse.newBuilder().setOutputTensors(ndArraysToProto(result)).build());
    responseObserver.onCompleted();
  }

  @Override
  public void metadata(MetadataRequest request,
      io.grpc.stub.StreamObserver<MetadataResponse> responseObserver) {
    final MLModel model = getResource(MLModel.named(request.getName()));
    final Metadata md = model.getMetadata(Optional.of(request.getExtra()));
    responseObserver.onNext(MetadataResponse.newBuilder().setMetadata(metadataToProto(md)).build());
    responseObserver.onCompleted();
  }

  @Override
  public Class<MLModel> getResourceClass() {
    return MLModel.class;
  }

  @Override
  public ResourceManager getManager() {
    return manager;
  }

  static Metadata metadataFromProto(final Mlmodel.Metadata mdProto) {
    final Metadata.Builder builder = new Metadata.Builder();
    builder.setName(mdProto.getName());
    builder.setType(mdProto.getType());
    builder.setDescription(mdProto.getDescription());

    final List<TensorInfo> inputs = new ArrayList<>();
    for (final Mlmodel.TensorInfo infoProto : mdProto.getInputInfoList()) {
      inputs.add(tensorInfoFromProto(infoProto));
    }
    builder.setInputs(inputs);

    final List<TensorInfo> outputs = new ArrayList<>();
    for (final Mlmodel.TensorInfo infoProto : mdProto.getOutputInfoList()) {
      outputs.add(tensorInfoFromProto(infoProto));
    }
    builder.setOutputs(outputs);

    return builder.build();
  }

  private static Mlmodel.Metadata metadataToProto(final Metadata md) {
    final Mlmodel.Metadata.Builder mdBuilder = Mlmodel.Metadata.newBuilder();
    mdBuilder.setName(md.getName());
    if (md.getType() != null) {
      mdBuilder.setType(md.getType());
    }
    if (md.getDescription() != null) {
      mdBuilder.setDescription(md.getDescription());
    }

    for (final TensorInfo input : md.getInputs()) {
      mdBuilder.addInputInfo(tensorInfoToProto(input));
    }
    for (final TensorInfo output : md.getOutputs()) {
      mdBuilder.addOutputInfo(tensorInfoToProto(output));
    }

    return mdBuilder.build();
  }

  private static TensorInfo tensorInfoFromProto(final Mlmodel.TensorInfo infoProto) {
    final TensorInfo.Builder infoBuilder = new TensorInfo.Builder();
    infoBuilder.setName(infoProto.getName());
    infoBuilder.setDescription((infoProto.getDescription()));
    switch (infoProto.getDataType()) {
      case "int8":
        infoBuilder.setDataType(DataType.INT_8);
        break;
      case "uint8":
        infoBuilder.setDataType(DataType.UINT_8);
        break;
      case "int16":
        infoBuilder.setDataType(DataType.INT_16);
        break;
      case "uint16":
        infoBuilder.setDataType(DataType.UINT_16);
        break;
      case "int32":
        infoBuilder.setDataType(DataType.INT_32);
        break;
      case "uint32":
        infoBuilder.setDataType(DataType.UINT_32);
        break;
      case "int64":
        infoBuilder.setDataType(DataType.INT_64);
        break;
      case "uint64":
        infoBuilder.setDataType(DataType.UINT_64);
        break;
      case "float32":
        infoBuilder.setDataType(DataType.FLOAT_32);
        break;
      case "float64":
        infoBuilder.setDataType(DataType.FLOAT_64);
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + infoProto.getDataType());
    }
    infoBuilder.setShape(infoProto.getShapeList());
    final List<File> associatedFiles = new ArrayList<>();
    for (final Mlmodel.File fileProto : infoProto.getAssociatedFilesList()) {
      final File.Builder fileBuilder = new File.Builder();
      fileBuilder.setName(fileProto.getName());
      fileBuilder.setDescription(fileProto.getDescription());
      switch (fileProto.getLabelType()) {
        case LABEL_TYPE_TENSOR_VALUE:
          fileBuilder.setLabelType(File.LabelType.TENSOR_VALUE);
          break;
        case LABEL_TYPE_TENSOR_AXIS:
          fileBuilder.setLabelType(File.LabelType.TENSOR_AXIS);
          break;
        default:
          throw new IllegalStateException("Unexpected value: " + fileProto.getLabelType());
      }
      associatedFiles.add(fileBuilder.build());
    }
    infoBuilder.setAssociatedFiles(associatedFiles);
    infoBuilder.setExtra(infoProto.getExtra());
    return infoBuilder.build();
  }

  private static Mlmodel.TensorInfo tensorInfoToProto(final TensorInfo info) {
    final Mlmodel.TensorInfo.Builder builder = Mlmodel.TensorInfo.newBuilder();
    builder.setName(info.getName());
    if (info.getDescription() != null) {
      builder.setDescription(info.getDescription());
    }
    switch (info.getDataType()) {
      case INT_8:
        builder.setDataType("int8");
        break;
      case UINT_8:
        builder.setDataType("uint8");
        break;
      case INT_16:
        builder.setDataType("int16");
        break;
      case UINT_16:
        builder.setDataType("uint16");
        break;
      case INT_32:
        builder.setDataType("int32");
        break;
      case UINT_32:
        builder.setDataType("uint32");
        break;
      case INT_64:
        builder.setDataType("int64");
        break;
      case UINT_64:
        builder.setDataType("uint64");
        break;
      case FLOAT_32:
        builder.setDataType("float32");
        break;
      case FLOAT_64:
        builder.setDataType("float64");
        break;
    }
    builder.addAllShape(info.getShape());
    for (final File file : info.getAssociatedFiles()) {
      final Mlmodel.File.Builder fileBuilder = Mlmodel.File.newBuilder();
      fileBuilder.setName(file.getName());
      if (file.getDescription() != null) {
        fileBuilder.setDescription(file.getDescription());
      }
      switch (file.getLabelType()) {
        case TENSOR_VALUE:
          fileBuilder.setLabelType(LabelType.LABEL_TYPE_TENSOR_VALUE);
          break;
        case TENSOR_AXIS:
          fileBuilder.setLabelType(LabelType.LABEL_TYPE_TENSOR_AXIS);
          break;
        default:
          fileBuilder.setLabelType(LabelType.LABEL_TYPE_UNSPECIFIED);
          break;
      }
      builder.addAssociatedFiles(fileBuilder.build());
    }
    info.getExtra().ifPresent(builder::setExtra);
    return builder.build();
  }

  static Map<String, NDArray> ndArraysFromProto(final FlatTensors flatTensors) {
    final Map<String, NDArray> ndArrays = new HashMap<>();
    for (final Entry<String, FlatTensor> entry : flatTensors.getTensorsMap().entrySet()) {
      final FlatTensor flatTensor = entry.getValue();

      final ai.djl.ndarray.types.DataType dataType;
      final Buffer data;
      switch (flatTensor.getTensorCase()) {
        case INT8_TENSOR:
          dataType = ai.djl.ndarray.types.DataType.INT8;
          data = ByteBuffer.wrap(flatTensor.getInt8Tensor().getData().toByteArray());
          break;
        case UINT8_TENSOR:
          dataType = ai.djl.ndarray.types.DataType.UINT8;
          data = ByteBuffer.wrap(flatTensor.getUint8Tensor().getData().toByteArray());
          break;
        case INT16_TENSOR: {
          dataType = ai.djl.ndarray.types.DataType.INT16;
          final List<Integer> dataList = flatTensor.getInt16Tensor().getDataList();
          final ShortBuffer buf = ByteBuffer.allocateDirect(dataList.size() * 2).asShortBuffer();
          for (final Integer i : dataList) {
            buf.put(i.shortValue());
          }
          data = buf;
        }
        break;
        case UINT16_TENSOR: {
          dataType = ai.djl.ndarray.types.DataType.UINT16;
          final List<Integer> dataList = flatTensor.getUint16Tensor().getDataList();
          final ShortBuffer buf = ByteBuffer.allocateDirect(dataList.size() * 2).asShortBuffer();
          for (final Integer i : dataList) {
            buf.put(i.shortValue());
          }
          data = buf;
        }
        break;
        case INT32_TENSOR: {
          dataType = ai.djl.ndarray.types.DataType.INT32;
          final List<Integer> dataList = flatTensor.getInt32Tensor().getDataList();
          final IntBuffer buf = ByteBuffer.allocateDirect(dataList.size() * 4).asIntBuffer();
          for (final Integer i : dataList) {
            buf.put(i);
          }
          data = buf;
        }
        break;
        case UINT32_TENSOR: {
          dataType = ai.djl.ndarray.types.DataType.UINT32;
          final List<Integer> dataList = flatTensor.getUint32Tensor().getDataList();
          final IntBuffer buf = ByteBuffer.allocateDirect(dataList.size() * 4).asIntBuffer();
          for (final Integer i : dataList) {
            buf.put(i);
          }
          data = buf;
        }
        break;
        case INT64_TENSOR: {
          dataType = ai.djl.ndarray.types.DataType.INT64;
          final List<Long> dataList = flatTensor.getInt64Tensor().getDataList();
          final LongBuffer buf = ByteBuffer.allocateDirect(dataList.size() * 8).asLongBuffer();
          for (final Long l : dataList) {
            buf.put(l);
          }
          data = buf;
        }
        break;
        case UINT64_TENSOR: {
          dataType = ai.djl.ndarray.types.DataType.UINT64;
          final List<Long> dataList = flatTensor.getUint64Tensor().getDataList();
          final LongBuffer buf = ByteBuffer.allocateDirect(dataList.size() * 8).asLongBuffer();
          for (final Long l : dataList) {
            buf.put(l);
          }
          data = buf;
        }
        break;
        case FLOAT_TENSOR: {
          dataType = ai.djl.ndarray.types.DataType.FLOAT32;
          final List<Float> dataList = flatTensor.getFloatTensor().getDataList();
          final FloatBuffer buf = ByteBuffer.allocateDirect(dataList.size() * 4).asFloatBuffer();
          for (final Float f : dataList) {
            buf.put(f);
          }
          data = buf;
        }
        break;
        case DOUBLE_TENSOR: {
          dataType = ai.djl.ndarray.types.DataType.FLOAT64;
          final List<Double> dataList = flatTensor.getDoubleTensor().getDataList();
          final DoubleBuffer buf = ByteBuffer.allocateDirect(dataList.size() * 8).asDoubleBuffer();
          for (final Double d : dataList) {
            buf.put(d);
          }
          data = buf;
        }
        break;
        case TENSOR_NOT_SET:
        default:
          throw new IllegalStateException("Unexpected value: " + flatTensor.getTensorCase());
      }
      final NDArray ndArray = ndManager.create(new Shape(flatTensor.getShapeList()), dataType);
      ndArray.set(data.position(0));
      ndArrays.put(entry.getKey(), ndArray);
    }
    return ndArrays;
  }

  static synchronized FlatTensors ndArraysToProto(final Map<String, NDArray> ndArrays) {
    final FlatTensors.Builder builder = FlatTensors.newBuilder();
    final Map<String, FlatTensor> flatTensors = new HashMap<>();

    for (final Entry<String, NDArray> entry : ndArrays.entrySet()) {
      final FlatTensor.Builder flatTensorBuilder = FlatTensor.newBuilder();
      final NDArray ndArray = entry.getValue();

      flatTensorBuilder.addAllShape(
          ndArray.getShape().stream().map(Pair::getKey).collect(Collectors.toList()));

      switch (ndArray.getDataType()) {
        case INT8:
          flatTensorBuilder.setInt8Tensor(FlatTensorDataInt8.newBuilder()
              .setData(ByteString.copyFrom(ndArray.toByteArray()))
              .build());
          break;
        case UINT8:
          flatTensorBuilder.setUint8Tensor(FlatTensorDataUInt8.newBuilder()
              .setData(ByteString.copyFrom(ndArray.toByteArray()))
              .build());
          break;
        case INT16:
          flatTensorBuilder.setInt16Tensor(FlatTensorDataInt16.newBuilder()
              .addAllData(Arrays.stream(ndArray.toIntArray()).boxed().collect(Collectors.toList()))
              .build());
          break;
        case UINT16:
          flatTensorBuilder.setUint16Tensor(FlatTensorDataUInt16.newBuilder()
              .addAllData(Arrays.stream(ndArray.toIntArray()).boxed().collect(Collectors.toList()))
              .build());
          break;
        case INT32:
          flatTensorBuilder.setInt32Tensor(FlatTensorDataInt32.newBuilder()
              .addAllData(Arrays.stream(ndArray.toIntArray()).boxed().collect(Collectors.toList()))
              .build());
          break;
        case UINT32:
          flatTensorBuilder.setUint32Tensor(FlatTensorDataUInt32.newBuilder()
              .addAllData(Arrays.stream(ndArray.toIntArray()).boxed().collect(Collectors.toList()))
              .build());
          break;
        case INT64:
          flatTensorBuilder.setInt64Tensor(FlatTensorDataInt64.newBuilder()
              .addAllData(Arrays.stream(ndArray.toLongArray()).boxed().collect(Collectors.toList()))
              .build());
          break;
        case UINT64:
          flatTensorBuilder.setUint64Tensor(FlatTensorDataUInt64.newBuilder()
              .addAllData(Arrays.stream(ndArray.toLongArray()).boxed().collect(Collectors.toList()))
              .build());
          break;
        case FLOAT32:
          final float[] flatDataUnboxed = ndArray.toFloatArray();
          final List<Float> boxed = new ArrayList<>(flatDataUnboxed.length);
          for (float data : flatDataUnboxed) {
            boxed.add(data);
          }
          flatTensorBuilder.setFloatTensor(FlatTensorDataFloat.newBuilder()
              .addAllData(boxed)
              .build());
          break;
        case FLOAT64:
          flatTensorBuilder.setDoubleTensor(FlatTensorDataDouble.newBuilder()
              .addAllData(
                  Arrays.stream(ndArray.toDoubleArray()).boxed().collect(
                      Collectors.toList()))
              .build());
          break;
        case UNKNOWN:
          break;
        default:
          throw new IllegalStateException("Unexpected value: " + ndArray.getDataType());
      }
      flatTensors.put(entry.getKey(), flatTensorBuilder.build());
    }
    return builder.putAllTensors(flatTensors).build();
  }
}
