// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/client.proto
// Protobuf Java Version: 4.28.3

package com.google.api;

public interface SelectiveGapicGenerationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.SelectiveGapicGeneration)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * An allowlist of the fully qualified names of RPCs that should be included
   * on public client surfaces.
   * </pre>
   *
   * <code>repeated string methods = 1 [json_name = "methods"];</code>
   * @return A list containing the methods.
   */
  java.util.List<java.lang.String>
      getMethodsList();
  /**
   * <pre>
   * An allowlist of the fully qualified names of RPCs that should be included
   * on public client surfaces.
   * </pre>
   *
   * <code>repeated string methods = 1 [json_name = "methods"];</code>
   * @return The count of methods.
   */
  int getMethodsCount();
  /**
   * <pre>
   * An allowlist of the fully qualified names of RPCs that should be included
   * on public client surfaces.
   * </pre>
   *
   * <code>repeated string methods = 1 [json_name = "methods"];</code>
   * @param index The index of the element to return.
   * @return The methods at the given index.
   */
  java.lang.String getMethods(int index);
  /**
   * <pre>
   * An allowlist of the fully qualified names of RPCs that should be included
   * on public client surfaces.
   * </pre>
   *
   * <code>repeated string methods = 1 [json_name = "methods"];</code>
   * @param index The index of the element to return.
   * @return The methods at the given index.
   */
  com.google.protobuf.ByteString
      getMethodsBytes(int index);

  /**
   * <pre>
   * Setting this to true indicates to the client generators that methods
   * that would be excluded from the generation should instead be generated
   * in a way that indicates these methods should not be consumed by
   * end users. How this is expressed is up to individual language
   * implementations to decide. Some examples may be: added annotations,
   * obfuscated identifiers, or other language idiomatic patterns.
   * </pre>
   *
   * <code>bool generate_omitted_as_internal = 2 [json_name = "generateOmittedAsInternal"];</code>
   * @return The generateOmittedAsInternal.
   */
  boolean getGenerateOmittedAsInternal();
}
