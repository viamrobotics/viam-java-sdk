// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1beta1/eval.proto

// Protobuf Java Version: 3.25.2
package com.google.api.expr.v1beta1;

/**
 * <pre>
 * A set of expressions for which the value is unknown.
 *
 * The unknowns included depend on the context. See `ExprValue.unknown`.
 * </pre>
 *
 * Protobuf type {@code google.api.expr.v1beta1.UnknownSet}
 */
public  final class UnknownSet extends
    com.google.protobuf.GeneratedMessageLite<
        UnknownSet, UnknownSet.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.expr.v1beta1.UnknownSet)
    UnknownSetOrBuilder {
  private UnknownSet() {
    exprs_ = emptyProtobufList();
  }
  public static final int EXPRS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.google.api.expr.v1beta1.IdRef> exprs_;
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.expr.v1beta1.IdRef> getExprsList() {
    return exprs_;
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
   */
  public java.util.List<? extends com.google.api.expr.v1beta1.IdRefOrBuilder> 
      getExprsOrBuilderList() {
    return exprs_;
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
   */
  @java.lang.Override
  public int getExprsCount() {
    return exprs_.size();
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
   */
  @java.lang.Override
  public com.google.api.expr.v1beta1.IdRef getExprs(int index) {
    return exprs_.get(index);
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
   */
  public com.google.api.expr.v1beta1.IdRefOrBuilder getExprsOrBuilder(
      int index) {
    return exprs_.get(index);
  }
  private void ensureExprsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.google.api.expr.v1beta1.IdRef> tmp = exprs_;
    if (!tmp.isModifiable()) {
      exprs_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
   */
  private void setExprs(
      int index, com.google.api.expr.v1beta1.IdRef value) {
    value.getClass();
  ensureExprsIsMutable();
    exprs_.set(index, value);
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
   */
  private void addExprs(com.google.api.expr.v1beta1.IdRef value) {
    value.getClass();
  ensureExprsIsMutable();
    exprs_.add(value);
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
   */
  private void addExprs(
      int index, com.google.api.expr.v1beta1.IdRef value) {
    value.getClass();
  ensureExprsIsMutable();
    exprs_.add(index, value);
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
   */
  private void addAllExprs(
      java.lang.Iterable<? extends com.google.api.expr.v1beta1.IdRef> values) {
    ensureExprsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, exprs_);
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
   */
  private void clearExprs() {
    exprs_ = emptyProtobufList();
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
   */
  private void removeExprs(int index) {
    ensureExprsIsMutable();
    exprs_.remove(index);
  }

  public static com.google.api.expr.v1beta1.UnknownSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1beta1.UnknownSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.UnknownSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1beta1.UnknownSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.UnknownSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1beta1.UnknownSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.UnknownSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.expr.v1beta1.UnknownSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.api.expr.v1beta1.UnknownSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.api.expr.v1beta1.UnknownSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.UnknownSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.expr.v1beta1.UnknownSet parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.api.expr.v1beta1.UnknownSet prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A set of expressions for which the value is unknown.
   *
   * The unknowns included depend on the context. See `ExprValue.unknown`.
   * </pre>
   *
   * Protobuf type {@code google.api.expr.v1beta1.UnknownSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.expr.v1beta1.UnknownSet, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.expr.v1beta1.UnknownSet)
      com.google.api.expr.v1beta1.UnknownSetOrBuilder {
    // Construct using com.google.api.expr.v1beta1.UnknownSet.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
     */
    @java.lang.Override
    public java.util.List<com.google.api.expr.v1beta1.IdRef> getExprsList() {
      return java.util.Collections.unmodifiableList(
          instance.getExprsList());
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
     */
    @java.lang.Override
    public int getExprsCount() {
      return instance.getExprsCount();
    }/**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
     */
    @java.lang.Override
    public com.google.api.expr.v1beta1.IdRef getExprs(int index) {
      return instance.getExprs(index);
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
     */
    public Builder setExprs(
        int index, com.google.api.expr.v1beta1.IdRef value) {
      copyOnWrite();
      instance.setExprs(index, value);
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
     */
    public Builder setExprs(
        int index, com.google.api.expr.v1beta1.IdRef.Builder builderForValue) {
      copyOnWrite();
      instance.setExprs(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
     */
    public Builder addExprs(com.google.api.expr.v1beta1.IdRef value) {
      copyOnWrite();
      instance.addExprs(value);
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
     */
    public Builder addExprs(
        int index, com.google.api.expr.v1beta1.IdRef value) {
      copyOnWrite();
      instance.addExprs(index, value);
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
     */
    public Builder addExprs(
        com.google.api.expr.v1beta1.IdRef.Builder builderForValue) {
      copyOnWrite();
      instance.addExprs(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
     */
    public Builder addExprs(
        int index, com.google.api.expr.v1beta1.IdRef.Builder builderForValue) {
      copyOnWrite();
      instance.addExprs(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
     */
    public Builder addAllExprs(
        java.lang.Iterable<? extends com.google.api.expr.v1beta1.IdRef> values) {
      copyOnWrite();
      instance.addAllExprs(values);
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
     */
    public Builder clearExprs() {
      copyOnWrite();
      instance.clearExprs();
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated .google.api.expr.v1beta1.IdRef exprs = 1 [json_name = "exprs"];</code>
     */
    public Builder removeExprs(int index) {
      copyOnWrite();
      instance.removeExprs(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.expr.v1beta1.UnknownSet)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.expr.v1beta1.UnknownSet();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "exprs_",
            com.google.api.expr.v1beta1.IdRef.class,
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.api.expr.v1beta1.UnknownSet> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.api.expr.v1beta1.UnknownSet.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.api.expr.v1beta1.UnknownSet>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.api.expr.v1beta1.UnknownSet)
  private static final com.google.api.expr.v1beta1.UnknownSet DEFAULT_INSTANCE;
  static {
    UnknownSet defaultInstance = new UnknownSet();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      UnknownSet.class, defaultInstance);
  }

  public static com.google.api.expr.v1beta1.UnknownSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UnknownSet> PARSER;

  public static com.google.protobuf.Parser<UnknownSet> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
