// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/reflection/v1alpha/reflection.proto

// Protobuf Java Version: 3.25.2
package com.viam.sdk.core.rpc.reflectionv1alpha;

/**
 * <pre>
 * The type name and extension number sent by the client when requesting
 * file_containing_extension.
 * </pre>
 * <p>
 * Protobuf type {@code grpc.reflection.v1alpha.ExtensionRequest}
 */
public final class ExtensionRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ExtensionRequest, ExtensionRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:grpc.reflection.v1alpha.ExtensionRequest)
    ExtensionRequestOrBuilder {

  private ExtensionRequest() {
    containingType_ = "";
  }

  public static final int CONTAINING_TYPE_FIELD_NUMBER = 1;
  private String containingType_;

  /**
   * <pre>
   * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
   * </pre>
   *
   * <code>string containing_type = 1 [json_name = "containingType"];</code>
   *
   * @return The containingType.
   */
  @Override
  public String getContainingType() {
    return containingType_;
  }

  /**
   * <pre>
   * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
   * </pre>
   *
   * <code>string containing_type = 1 [json_name = "containingType"];</code>
   *
   * @return The bytes for containingType.
   */
  @Override
  public com.google.protobuf.ByteString
  getContainingTypeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(containingType_);
  }

  /**
   * <pre>
   * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
   * </pre>
   *
   * <code>string containing_type = 1 [json_name = "containingType"];</code>
   *
   * @param value The containingType to set.
   */
  private void setContainingType(
      String value) {
    Class<?> valueClass = value.getClass();

    containingType_ = value;
  }

  /**
   * <pre>
   * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
   * </pre>
   *
   * <code>string containing_type = 1 [json_name = "containingType"];</code>
   */
  private void clearContainingType() {

    containingType_ = getDefaultInstance().getContainingType();
  }

  /**
   * <pre>
   * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
   * </pre>
   *
   * <code>string containing_type = 1 [json_name = "containingType"];</code>
   *
   * @param value The bytes for containingType to set.
   */
  private void setContainingTypeBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    containingType_ = value.toStringUtf8();

  }

  public static final int EXTENSION_NUMBER_FIELD_NUMBER = 2;
  private int extensionNumber_;

  /**
   * <code>int32 extension_number = 2 [json_name = "extensionNumber"];</code>
   *
   * @return The extensionNumber.
   */
  @Override
  public int getExtensionNumber() {
    return extensionNumber_;
  }

  /**
   * <code>int32 extension_number = 2 [json_name = "extensionNumber"];</code>
   *
   * @param value The extensionNumber to set.
   */
  private void setExtensionNumber(int value) {

    extensionNumber_ = value;
  }

  /**
   * <code>int32 extension_number = 2 [json_name = "extensionNumber"];</code>
   */
  private void clearExtensionNumber() {

    extensionNumber_ = 0;
  }

  public static ExtensionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }

  public static ExtensionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }

  public static ExtensionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }

  public static ExtensionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }

  public static ExtensionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }

  public static ExtensionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }

  public static ExtensionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }

  public static ExtensionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static ExtensionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static ExtensionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static ExtensionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }

  public static ExtensionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.createBuilder();
  }

  public static Builder newBuilder(ExtensionRequest prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The type name and extension number sent by the client when requesting
   * file_containing_extension.
   * </pre>
   * <p>
   * Protobuf type {@code grpc.reflection.v1alpha.ExtensionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
          ExtensionRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.reflection.v1alpha.ExtensionRequest)
      ExtensionRequestOrBuilder {

    // Construct using io.grpc.reflection.v1alpha.ExtensionRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string containing_type = 1 [json_name = "containingType"];</code>
     *
     * @return The containingType.
     */
    @Override
    public String getContainingType() {
      return instance.getContainingType();
    }

    /**
     * <pre>
     * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string containing_type = 1 [json_name = "containingType"];</code>
     *
     * @return The bytes for containingType.
     */
    @Override
    public com.google.protobuf.ByteString
    getContainingTypeBytes() {
      return instance.getContainingTypeBytes();
    }

    /**
     * <pre>
     * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string containing_type = 1 [json_name = "containingType"];</code>
     *
     * @param value The containingType to set.
     * @return This builder for chaining.
     */
    public Builder setContainingType(
        String value) {
      copyOnWrite();
      instance.setContainingType(value);
      return this;
    }

    /**
     * <pre>
     * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string containing_type = 1 [json_name = "containingType"];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContainingType() {
      copyOnWrite();
      instance.clearContainingType();
      return this;
    }

    /**
     * <pre>
     * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string containing_type = 1 [json_name = "containingType"];</code>
     *
     * @param value The bytes for containingType to set.
     * @return This builder for chaining.
     */
    public Builder setContainingTypeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setContainingTypeBytes(value);
      return this;
    }

    /**
     * <code>int32 extension_number = 2 [json_name = "extensionNumber"];</code>
     *
     * @return The extensionNumber.
     */
    @Override
    public int getExtensionNumber() {
      return instance.getExtensionNumber();
    }

    /**
     * <code>int32 extension_number = 2 [json_name = "extensionNumber"];</code>
     *
     * @param value The extensionNumber to set.
     * @return This builder for chaining.
     */
    public Builder setExtensionNumber(int value) {
      copyOnWrite();
      instance.setExtensionNumber(value);
      return this;
    }

    /**
     * <code>int32 extension_number = 2 [json_name = "extensionNumber"];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExtensionNumber() {
      copyOnWrite();
      instance.clearExtensionNumber();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:grpc.reflection.v1alpha.ExtensionRequest)
  }

  @Override
  @SuppressWarnings({"unchecked", "fallthrough"})
  protected Object dynamicMethod(
      MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ExtensionRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
        Object[] objects = new Object[]{
            "containingType_",
            "extensionNumber_",
        };
        String info =
            "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0004";
        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ExtensionRequest> parser = PARSER;
        if (parser == null) {
          synchronized (ExtensionRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ExtensionRequest>(
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


  // @@protoc_insertion_point(class_scope:grpc.reflection.v1alpha.ExtensionRequest)
  private static final ExtensionRequest DEFAULT_INSTANCE;

  static {
    ExtensionRequest defaultInstance = new ExtensionRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        ExtensionRequest.class, defaultInstance);
  }

  public static ExtensionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ExtensionRequest> PARSER;

  public static com.google.protobuf.Parser<ExtensionRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
