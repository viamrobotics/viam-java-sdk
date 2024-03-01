package com.viam.sdk.android.examples.module;


import ai.djl.MalformedModelException;
import ai.djl.basicmodelzoo.basic.Mlp;
import ai.djl.inference.Predictor;
import ai.djl.modality.Classifications;
import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.ImageFactory;
import ai.djl.modality.cv.transform.ToTensor;
import ai.djl.modality.cv.translator.ImageClassificationTranslator;
import ai.djl.ndarray.NDArray;
import ai.djl.ndarray.NDManager;
import ai.djl.translate.TranslateException;
import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.sdk.android.module.Module;
import com.viam.sdk.core.resource.Model;
import com.viam.sdk.core.resource.ModelFamily;
import com.viam.sdk.core.resource.Registry;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.ResourceCreatorRegistration;
import com.viam.sdk.core.service.mlmodel.MLModel;
import com.viam.sdk.core.service.mlmodel.Metadata;
import com.viam.sdk.core.service.mlmodel.TensorInfo;
import com.viam.sdk.core.service.mlmodel.TensorInfo.DataType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.compress.utils.IOUtils;
import viam.app.v1.Robot.ComponentConfig;

public class MNISTMLModelModule {

  public static void main(String[] args) {
    Registry.registerResourceCreator(
        MLModel.SUBTYPE,
        MyMLModel.MODEL,
        new ResourceCreatorRegistration(MyMLModel::new, MyMLModel::validateConfig)
    );
    com.viam.sdk.core.service.mlmodel.Registry.useService();
    final Module module = new Module(args);
    module.start();
  }

  public static class MyMLModel extends MLModel {

    public static final Model MODEL = new Model(new ModelFamily("viam", "mlmodel"), "mnist");
    private final ai.djl.Model model;
    private final ImageClassificationTranslator translator;

    public MyMLModel(ComponentConfig config, Map<Common.ResourceName, Resource> dependencies) {
      super(config.getName());

      final String modelFileName = "mlp-0002.params";
      final InputStream modelStream = getClass().getResourceAsStream("/" + modelFileName);

      final File modelFile;
      final Path currentPath = Paths.get(System.getProperty("user.dir"));
      final Path tmpPath = Paths.get(currentPath.toString(), "tmp");
      try {
        Files.createDirectories(tmpPath);
        modelFile = Paths.get(tmpPath.toString(), modelFileName).toFile();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      modelFile.deleteOnExit();
      try (FileOutputStream out = new FileOutputStream(modelFile)) {
        IOUtils.copy(modelStream, out);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }

      final String modelName = "mlp";
      model = ai.djl.Model.newInstance(modelName);
      model.setBlock(new Mlp(28 * 28, 10, new int[]{128, 64}));

      try {
        model.load(tmpPath);
      } catch (IOException | MalformedModelException e) {
        throw new RuntimeException(e);
      }

      final List<String> classes =
          IntStream.range(0, 10).mapToObj(String::valueOf).collect(Collectors.toList());
      translator =
          ImageClassificationTranslator.builder()
              .addTransform(new ToTensor())
              .optSynset(classes)
              .optApplySoftmax(true)
              .build();
    }

    public static Set<String> validateConfig(final ComponentConfig config) {
      return new HashSet<>();
    }

    @Override
    public Map<String, NDArray> infer(
        final Map<String, NDArray> inputTensors,
        final NDManager manager,
        final Optional<Struct> extra
    ) {
      if (!inputTensors.containsKey("image")) {
        throw new IllegalArgumentException("expected image input");
      }

      final Image img = ImageFactory.getInstance().fromNDArray(inputTensors.get("image"));

      final Classifications classifications;
      try (Predictor<Image, Classifications> predictor = model.newPredictor(translator)) {
        try {
          classifications = predictor.predict(img);
        } catch (TranslateException e) {
          throw new RuntimeException(e);
        }
      }

      final Map<String, NDArray> result = new HashMap<>();
      final float[] pFloats = new float[classifications.getProbabilities().size()];
      for (int i = 0; i < classifications.getProbabilities().size(); i++) {
        pFloats[i] = classifications.getProbabilities().get(i).floatValue();
      }
      result.put("classifications", manager.create(pFloats));

      return result;
    }

    @Override
    public Metadata getMetadata(Optional<Struct> extra) {
      final Metadata.Builder builder = new Metadata.Builder();

      builder.setName(model.getName());

      final List<TensorInfo> tensorInputs = new ArrayList<>();
      tensorInputs.add(new TensorInfo.Builder()
          .setName("image")
          .setShape(List.of(28, 28, 3))
          .setDataType(DataType.from(model.getDataType())).build());
      builder.setInputs(tensorInputs);

      final List<TensorInfo> tensorOutputs = new ArrayList<>();
      tensorOutputs.add(new TensorInfo.Builder()
          .setName("classifications")
          .setShape(List.of(10))
          .setDataType(DataType.from(model.getDataType())).build());
      builder.setOutputs(tensorOutputs);

      return builder.build();
    }
  }
}
