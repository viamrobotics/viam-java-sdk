// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1alpha1/eval.proto

// Protobuf Java Version: 3.25.2
package com.google.api.expr.v1alpha1;

public interface EvalStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1alpha1.EvalState)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The unique values referenced in this message.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.ExprValue values = 1 [json_name = "values"];</code>
   */
  java.util.List<com.google.api.expr.v1alpha1.ExprValue> 
      getValuesList();
  /**
   * <pre>
   * The unique values referenced in this message.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.ExprValue values = 1 [json_name = "values"];</code>
   */
  com.google.api.expr.v1alpha1.ExprValue getValues(int index);
  /**
   * <pre>
   * The unique values referenced in this message.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.ExprValue values = 1 [json_name = "values"];</code>
   */
  int getValuesCount();

  /**
   * <pre>
   * An ordered list of results.
   *
   * Tracks the flow of evaluation through the expression.
   * May be sparse.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.EvalState.Result results = 3 [json_name = "results"];</code>
   */
  java.util.List<com.google.api.expr.v1alpha1.EvalState.Result> 
      getResultsList();
  /**
   * <pre>
   * An ordered list of results.
   *
   * Tracks the flow of evaluation through the expression.
   * May be sparse.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.EvalState.Result results = 3 [json_name = "results"];</code>
   */
  com.google.api.expr.v1alpha1.EvalState.Result getResults(int index);
  /**
   * <pre>
   * An ordered list of results.
   *
   * Tracks the flow of evaluation through the expression.
   * May be sparse.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.EvalState.Result results = 3 [json_name = "results"];</code>
   */
  int getResultsCount();
}