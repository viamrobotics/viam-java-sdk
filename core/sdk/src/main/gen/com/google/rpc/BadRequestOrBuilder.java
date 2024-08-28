// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/rpc/error_details.proto
// Protobuf Java Version: 4.27.2

package com.google.rpc;

public interface BadRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.BadRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Describes all violations in a client request.
   * </pre>
   *
   * <code>repeated .google.rpc.BadRequest.FieldViolation field_violations = 1 [json_name = "fieldViolations"];</code>
   */
  java.util.List<com.google.rpc.BadRequest.FieldViolation> 
      getFieldViolationsList();
  /**
   * <pre>
   * Describes all violations in a client request.
   * </pre>
   *
   * <code>repeated .google.rpc.BadRequest.FieldViolation field_violations = 1 [json_name = "fieldViolations"];</code>
   */
  com.google.rpc.BadRequest.FieldViolation getFieldViolations(int index);
  /**
   * <pre>
   * Describes all violations in a client request.
   * </pre>
   *
   * <code>repeated .google.rpc.BadRequest.FieldViolation field_violations = 1 [json_name = "fieldViolations"];</code>
   */
  int getFieldViolationsCount();
}