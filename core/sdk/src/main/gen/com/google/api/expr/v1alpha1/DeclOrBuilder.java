// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/expr/v1alpha1/checked.proto
// Protobuf Java Version: 4.28.3

package com.google.api.expr.v1alpha1;

public interface DeclOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1alpha1.Decl)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The fully qualified name of the declaration.
   *
   * Declarations are organized in containers and this represents the full path
   * to the declaration in its container, as in `google.api.expr.Decl`.
   *
   * Declarations used as
   * [FunctionDecl.Overload][google.api.expr.v1alpha1.Decl.FunctionDecl.Overload]
   * parameters may or may not have a name depending on whether the overload is
   * function declaration or a function definition containing a result
   * [Expr][google.api.expr.v1alpha1.Expr].
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The fully qualified name of the declaration.
   *
   * Declarations are organized in containers and this represents the full path
   * to the declaration in its container, as in `google.api.expr.Decl`.
   *
   * Declarations used as
   * [FunctionDecl.Overload][google.api.expr.v1alpha1.Decl.FunctionDecl.Overload]
   * parameters may or may not have a name depending on whether the overload is
   * function declaration or a function definition containing a result
   * [Expr][google.api.expr.v1alpha1.Expr].
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Identifier declaration.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Decl.IdentDecl ident = 2 [json_name = "ident"];</code>
   * @return Whether the ident field is set.
   */
  boolean hasIdent();
  /**
   * <pre>
   * Identifier declaration.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Decl.IdentDecl ident = 2 [json_name = "ident"];</code>
   * @return The ident.
   */
  com.google.api.expr.v1alpha1.Decl.IdentDecl getIdent();

  /**
   * <pre>
   * Function declaration.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Decl.FunctionDecl function = 3 [json_name = "function"];</code>
   * @return Whether the function field is set.
   */
  boolean hasFunction();
  /**
   * <pre>
   * Function declaration.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Decl.FunctionDecl function = 3 [json_name = "function"];</code>
   * @return The function.
   */
  com.google.api.expr.v1alpha1.Decl.FunctionDecl getFunction();

  public com.google.api.expr.v1alpha1.Decl.DeclKindCase getDeclKindCase();
}