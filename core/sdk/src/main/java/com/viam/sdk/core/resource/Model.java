package com.viam.sdk.core.resource;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Represents a specific model within a family of models
 */
public class Model {

  private static final Pattern pattern = Pattern.compile("^([\\w-]+):([\\w-]+):([\\w-]+)$");
  /**
   * The family to which this model belongs
   */
  private final ModelFamily modelFamily;
  /**
   * The name of the model
   */
  private final String name;

  public Model(final ModelFamily modelFamily, final String name) {
    this.modelFamily = modelFamily;
    this.name = name;
  }

  /**
   * Create a Model from its string representation (namespace:family:name)
   *
   * @param string The Model as a string
   */
  public Model(final String string) {
    this(string, false);
  }

  /**
   * Create a Model from its string representation (namespace:family:name)
   *
   * @param model        The Model as a string
   * @param ignoreErrors If namespace or family are not found in the string, default to empty string
   *                     rather than throw an exception.
   */
  public Model(final String model, final boolean ignoreErrors) {
    final Matcher matcher = pattern.matcher(model);
    final ModelFamily family;
    final String name;
    if (!matcher.matches()) {
      if (ignoreErrors) {
        family = new ModelFamily("", "");
        name = model;
      }
      throw new IllegalArgumentException(String.format("%s is not a valid model", model));
    } else {
      family = new ModelFamily(matcher.group(1), matcher.group(2));
      name = matcher.group(3);
    }
    this.modelFamily = family;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model model = (Model) o;
    return Objects.equals(modelFamily, model.modelFamily) && Objects.equals(name, model.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelFamily, name);
  }

  @Override
  public String toString() {
    return String.format("%s:%s", modelFamily, name);
  }
}
