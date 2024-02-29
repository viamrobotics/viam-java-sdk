package com.viam.sdk.android.examples.module;


import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.sdk.android.module.Module;
import com.viam.sdk.core.component.generic.Generic;
import com.viam.sdk.core.resource.Model;
import com.viam.sdk.core.resource.ModelFamily;
import com.viam.sdk.core.resource.Registry;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.ResourceCreatorRegistration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import viam.app.v1.Robot.ComponentConfig;

public class MyModule {

  public static void main(String[] args) {
    Registry.registerResourceCreator(
        Generic.SUBTYPE,
        MyGeneric.MODEL,
        new ResourceCreatorRegistration(MyGeneric::new, MyGeneric::validateConfig)
    );
    final Module module = new Module(args);
    module.start();
  }

  public static class MyGeneric extends Generic {

    public static final Model MODEL = new Model(new ModelFamily("viam", "generic"), "mygeneric");

    public MyGeneric(ComponentConfig config, Map<Common.ResourceName, Resource> dependencies) {
      super(config.getName());
    }

    public static Set<String> validateConfig(final ComponentConfig config) {
      return new HashSet<>();
    }

    @Override
    public Struct doCommand(Map<String, Value> command) {
      final Struct.Builder builder = Struct.newBuilder();
      return builder.putFields("hello", Value.newBuilder().setBoolValue(true).build()).build();
    }
  }
}
