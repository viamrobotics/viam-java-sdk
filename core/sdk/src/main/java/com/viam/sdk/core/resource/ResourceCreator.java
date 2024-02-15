package com.viam.sdk.core.resource;

import com.viam.common.v1.Common;
import java.util.Map;
import java.util.function.BiFunction;
import viam.app.v1.Robot;

public interface ResourceCreator extends
    BiFunction<Robot.ComponentConfig, Map<Common.ResourceName, Resource>, Resource> {

}
