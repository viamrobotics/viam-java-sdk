// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/visibility.proto
// Protobuf Java Version: 4.27.2

package com.google.api;

public interface VisibilityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Visibility)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1 [json_name = "rules"];</code>
   */
  java.util.List<com.google.api.VisibilityRule> 
      getRulesList();
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1 [json_name = "rules"];</code>
   */
  com.google.api.VisibilityRule getRules(int index);
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1 [json_name = "rules"];</code>
   */
  int getRulesCount();
}