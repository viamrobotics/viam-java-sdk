// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/expr/v1beta1/value.proto
// Protobuf Java Version: 4.27.2

package com.google.api.expr.v1beta1;

public interface ListValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1beta1.ListValue)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The ordered values in the list.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.Value values = 1 [json_name = "values"];</code>
   */
  java.util.List<com.google.api.expr.v1beta1.Value> 
      getValuesList();
  /**
   * <pre>
   * The ordered values in the list.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.Value values = 1 [json_name = "values"];</code>
   */
  com.google.api.expr.v1beta1.Value getValues(int index);
  /**
   * <pre>
   * The ordered values in the list.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.Value values = 1 [json_name = "values"];</code>
   */
  int getValuesCount();
}