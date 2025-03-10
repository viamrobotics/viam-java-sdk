// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/geo/type/viewport.proto
// Protobuf Java Version: 4.28.3

package com.google.geo.type;

public interface ViewportOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.geo.type.Viewport)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Required. The low point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng low = 1 [json_name = "low"];</code>
   * @return Whether the low field is set.
   */
  boolean hasLow();
  /**
   * <pre>
   * Required. The low point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng low = 1 [json_name = "low"];</code>
   * @return The low.
   */
  com.google.type.LatLng getLow();

  /**
   * <pre>
   * Required. The high point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng high = 2 [json_name = "high"];</code>
   * @return Whether the high field is set.
   */
  boolean hasHigh();
  /**
   * <pre>
   * Required. The high point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng high = 2 [json_name = "high"];</code>
   * @return The high.
   */
  com.google.type.LatLng getHigh();
}
