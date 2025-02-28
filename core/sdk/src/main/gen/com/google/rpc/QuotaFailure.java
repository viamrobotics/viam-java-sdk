// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/rpc/error_details.proto
// Protobuf Java Version: 4.28.3

package com.google.rpc;

/**
 * <pre>
 * Describes how a quota check failed.
 *
 * For example if a daily limit was exceeded for the calling project,
 * a service could respond with a QuotaFailure detail containing the project
 * id and the description of the quota limit that was exceeded.  If the
 * calling project hasn't enabled the service in the developer console, then
 * a service could respond with the project id and set `service_disabled`
 * to true.
 *
 * Also see RetryInfo and Help types for other details about handling a
 * quota failure.
 * </pre>
 *
 * Protobuf type {@code google.rpc.QuotaFailure}
 */
public  final class QuotaFailure extends
    com.google.protobuf.GeneratedMessageLite<
        QuotaFailure, QuotaFailure.Builder> implements
    // @@protoc_insertion_point(message_implements:google.rpc.QuotaFailure)
    QuotaFailureOrBuilder {
  private QuotaFailure() {
    violations_ = emptyProtobufList();
  }
  public interface ViolationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.rpc.QuotaFailure.Violation)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * The subject on which the quota check failed.
     * For example, "clientip:&lt;ip address of client&gt;" or "project:&lt;Google
     * developer project id&gt;".
     * </pre>
     *
     * <code>string subject = 1 [json_name = "subject"];</code>
     * @return The subject.
     */
    java.lang.String getSubject();
    /**
     * <pre>
     * The subject on which the quota check failed.
     * For example, "clientip:&lt;ip address of client&gt;" or "project:&lt;Google
     * developer project id&gt;".
     * </pre>
     *
     * <code>string subject = 1 [json_name = "subject"];</code>
     * @return The bytes for subject.
     */
    com.google.protobuf.ByteString
        getSubjectBytes();

    /**
     * <pre>
     * A description of how the quota check failed. Clients can use this
     * description to find more about the quota configuration in the service's
     * public documentation, or find the relevant quota limit to adjust through
     * developer console.
     *
     * For example: "Service disabled" or "Daily Limit for read operations
     * exceeded".
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @return The description.
     */
    java.lang.String getDescription();
    /**
     * <pre>
     * A description of how the quota check failed. Clients can use this
     * description to find more about the quota configuration in the service's
     * public documentation, or find the relevant quota limit to adjust through
     * developer console.
     *
     * For example: "Service disabled" or "Daily Limit for read operations
     * exceeded".
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    com.google.protobuf.ByteString
        getDescriptionBytes();
  }
  /**
   * <pre>
   * A message type used to describe a single quota violation.  For example, a
   * daily quota or a custom quota that was exceeded.
   * </pre>
   *
   * Protobuf type {@code google.rpc.QuotaFailure.Violation}
   */
  public  static final class Violation extends
      com.google.protobuf.GeneratedMessageLite<
          Violation, Violation.Builder> implements
      // @@protoc_insertion_point(message_implements:google.rpc.QuotaFailure.Violation)
      ViolationOrBuilder {
    private Violation() {
      subject_ = "";
      description_ = "";
    }
    public static final int SUBJECT_FIELD_NUMBER = 1;
    private java.lang.String subject_;
    /**
     * <pre>
     * The subject on which the quota check failed.
     * For example, "clientip:&lt;ip address of client&gt;" or "project:&lt;Google
     * developer project id&gt;".
     * </pre>
     *
     * <code>string subject = 1 [json_name = "subject"];</code>
     * @return The subject.
     */
    @java.lang.Override
    public java.lang.String getSubject() {
      return subject_;
    }
    /**
     * <pre>
     * The subject on which the quota check failed.
     * For example, "clientip:&lt;ip address of client&gt;" or "project:&lt;Google
     * developer project id&gt;".
     * </pre>
     *
     * <code>string subject = 1 [json_name = "subject"];</code>
     * @return The bytes for subject.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSubjectBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(subject_);
    }
    /**
     * <pre>
     * The subject on which the quota check failed.
     * For example, "clientip:&lt;ip address of client&gt;" or "project:&lt;Google
     * developer project id&gt;".
     * </pre>
     *
     * <code>string subject = 1 [json_name = "subject"];</code>
     * @param value The subject to set.
     */
    private void setSubject(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      subject_ = value;
    }
    /**
     * <pre>
     * The subject on which the quota check failed.
     * For example, "clientip:&lt;ip address of client&gt;" or "project:&lt;Google
     * developer project id&gt;".
     * </pre>
     *
     * <code>string subject = 1 [json_name = "subject"];</code>
     */
    private void clearSubject() {

      subject_ = getDefaultInstance().getSubject();
    }
    /**
     * <pre>
     * The subject on which the quota check failed.
     * For example, "clientip:&lt;ip address of client&gt;" or "project:&lt;Google
     * developer project id&gt;".
     * </pre>
     *
     * <code>string subject = 1 [json_name = "subject"];</code>
     * @param value The bytes for subject to set.
     */
    private void setSubjectBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      subject_ = value.toStringUtf8();

    }

    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private java.lang.String description_;
    /**
     * <pre>
     * A description of how the quota check failed. Clients can use this
     * description to find more about the quota configuration in the service's
     * public documentation, or find the relevant quota limit to adjust through
     * developer console.
     *
     * For example: "Service disabled" or "Daily Limit for read operations
     * exceeded".
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @return The description.
     */
    @java.lang.Override
    public java.lang.String getDescription() {
      return description_;
    }
    /**
     * <pre>
     * A description of how the quota check failed. Clients can use this
     * description to find more about the quota configuration in the service's
     * public documentation, or find the relevant quota limit to adjust through
     * developer console.
     *
     * For example: "Service disabled" or "Daily Limit for read operations
     * exceeded".
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(description_);
    }
    /**
     * <pre>
     * A description of how the quota check failed. Clients can use this
     * description to find more about the quota configuration in the service's
     * public documentation, or find the relevant quota limit to adjust through
     * developer console.
     *
     * For example: "Service disabled" or "Daily Limit for read operations
     * exceeded".
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @param value The description to set.
     */
    private void setDescription(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      description_ = value;
    }
    /**
     * <pre>
     * A description of how the quota check failed. Clients can use this
     * description to find more about the quota configuration in the service's
     * public documentation, or find the relevant quota limit to adjust through
     * developer console.
     *
     * For example: "Service disabled" or "Daily Limit for read operations
     * exceeded".
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     */
    private void clearDescription() {

      description_ = getDefaultInstance().getDescription();
    }
    /**
     * <pre>
     * A description of how the quota check failed. Clients can use this
     * description to find more about the quota configuration in the service's
     * public documentation, or find the relevant quota limit to adjust through
     * developer console.
     *
     * For example: "Service disabled" or "Daily Limit for read operations
     * exceeded".
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     */
    private void setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      description_ = value.toStringUtf8();

    }

    public static com.google.rpc.QuotaFailure.Violation parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.rpc.QuotaFailure.Violation parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.rpc.QuotaFailure.Violation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.rpc.QuotaFailure.Violation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.rpc.QuotaFailure.Violation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.rpc.QuotaFailure.Violation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.rpc.QuotaFailure.Violation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.google.rpc.QuotaFailure.Violation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.rpc.QuotaFailure.Violation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.rpc.QuotaFailure.Violation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.google.rpc.QuotaFailure.Violation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.google.rpc.QuotaFailure.Violation parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.google.rpc.QuotaFailure.Violation prototype) {
      return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * A message type used to describe a single quota violation.  For example, a
     * daily quota or a custom quota that was exceeded.
     * </pre>
     *
     * Protobuf type {@code google.rpc.QuotaFailure.Violation}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.google.rpc.QuotaFailure.Violation, Builder> implements
        // @@protoc_insertion_point(builder_implements:google.rpc.QuotaFailure.Violation)
        com.google.rpc.QuotaFailure.ViolationOrBuilder {
      // Construct using com.google.rpc.QuotaFailure.Violation.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * The subject on which the quota check failed.
       * For example, "clientip:&lt;ip address of client&gt;" or "project:&lt;Google
       * developer project id&gt;".
       * </pre>
       *
       * <code>string subject = 1 [json_name = "subject"];</code>
       * @return The subject.
       */
      @java.lang.Override
      public java.lang.String getSubject() {
        return instance.getSubject();
      }
      /**
       * <pre>
       * The subject on which the quota check failed.
       * For example, "clientip:&lt;ip address of client&gt;" or "project:&lt;Google
       * developer project id&gt;".
       * </pre>
       *
       * <code>string subject = 1 [json_name = "subject"];</code>
       * @return The bytes for subject.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getSubjectBytes() {
        return instance.getSubjectBytes();
      }
      /**
       * <pre>
       * The subject on which the quota check failed.
       * For example, "clientip:&lt;ip address of client&gt;" or "project:&lt;Google
       * developer project id&gt;".
       * </pre>
       *
       * <code>string subject = 1 [json_name = "subject"];</code>
       * @param value The subject to set.
       * @return This builder for chaining.
       */
      public Builder setSubject(
          java.lang.String value) {
        copyOnWrite();
        instance.setSubject(value);
        return this;
      }
      /**
       * <pre>
       * The subject on which the quota check failed.
       * For example, "clientip:&lt;ip address of client&gt;" or "project:&lt;Google
       * developer project id&gt;".
       * </pre>
       *
       * <code>string subject = 1 [json_name = "subject"];</code>
       * @return This builder for chaining.
       */
      public Builder clearSubject() {
        copyOnWrite();
        instance.clearSubject();
        return this;
      }
      /**
       * <pre>
       * The subject on which the quota check failed.
       * For example, "clientip:&lt;ip address of client&gt;" or "project:&lt;Google
       * developer project id&gt;".
       * </pre>
       *
       * <code>string subject = 1 [json_name = "subject"];</code>
       * @param value The bytes for subject to set.
       * @return This builder for chaining.
       */
      public Builder setSubjectBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSubjectBytes(value);
        return this;
      }

      /**
       * <pre>
       * A description of how the quota check failed. Clients can use this
       * description to find more about the quota configuration in the service's
       * public documentation, or find the relevant quota limit to adjust through
       * developer console.
       *
       * For example: "Service disabled" or "Daily Limit for read operations
       * exceeded".
       * </pre>
       *
       * <code>string description = 2 [json_name = "description"];</code>
       * @return The description.
       */
      @java.lang.Override
      public java.lang.String getDescription() {
        return instance.getDescription();
      }
      /**
       * <pre>
       * A description of how the quota check failed. Clients can use this
       * description to find more about the quota configuration in the service's
       * public documentation, or find the relevant quota limit to adjust through
       * developer console.
       *
       * For example: "Service disabled" or "Daily Limit for read operations
       * exceeded".
       * </pre>
       *
       * <code>string description = 2 [json_name = "description"];</code>
       * @return The bytes for description.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getDescriptionBytes() {
        return instance.getDescriptionBytes();
      }
      /**
       * <pre>
       * A description of how the quota check failed. Clients can use this
       * description to find more about the quota configuration in the service's
       * public documentation, or find the relevant quota limit to adjust through
       * developer console.
       *
       * For example: "Service disabled" or "Daily Limit for read operations
       * exceeded".
       * </pre>
       *
       * <code>string description = 2 [json_name = "description"];</code>
       * @param value The description to set.
       * @return This builder for chaining.
       */
      public Builder setDescription(
          java.lang.String value) {
        copyOnWrite();
        instance.setDescription(value);
        return this;
      }
      /**
       * <pre>
       * A description of how the quota check failed. Clients can use this
       * description to find more about the quota configuration in the service's
       * public documentation, or find the relevant quota limit to adjust through
       * developer console.
       *
       * For example: "Service disabled" or "Daily Limit for read operations
       * exceeded".
       * </pre>
       *
       * <code>string description = 2 [json_name = "description"];</code>
       * @return This builder for chaining.
       */
      public Builder clearDescription() {
        copyOnWrite();
        instance.clearDescription();
        return this;
      }
      /**
       * <pre>
       * A description of how the quota check failed. Clients can use this
       * description to find more about the quota configuration in the service's
       * public documentation, or find the relevant quota limit to adjust through
       * developer console.
       *
       * For example: "Service disabled" or "Daily Limit for read operations
       * exceeded".
       * </pre>
       *
       * <code>string description = 2 [json_name = "description"];</code>
       * @param value The bytes for description to set.
       * @return This builder for chaining.
       */
      public Builder setDescriptionBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setDescriptionBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:google.rpc.QuotaFailure.Violation)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.google.rpc.QuotaFailure.Violation();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "subject_",
              "description_",
            };
            java.lang.String info =
                "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.google.rpc.QuotaFailure.Violation> parser = PARSER;
          if (parser == null) {
            synchronized (com.google.rpc.QuotaFailure.Violation.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.google.rpc.QuotaFailure.Violation>(
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


    // @@protoc_insertion_point(class_scope:google.rpc.QuotaFailure.Violation)
    private static final com.google.rpc.QuotaFailure.Violation DEFAULT_INSTANCE;
    static {
      Violation defaultInstance = new Violation();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Violation.class, defaultInstance);
    }

    public static com.google.rpc.QuotaFailure.Violation getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Violation> PARSER;

    public static com.google.protobuf.Parser<Violation> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public static final int VIOLATIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.google.rpc.QuotaFailure.Violation> violations_;
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.rpc.QuotaFailure.Violation> getViolationsList() {
    return violations_;
  }
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  public java.util.List<? extends com.google.rpc.QuotaFailure.ViolationOrBuilder> 
      getViolationsOrBuilderList() {
    return violations_;
  }
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  @java.lang.Override
  public int getViolationsCount() {
    return violations_.size();
  }
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  @java.lang.Override
  public com.google.rpc.QuotaFailure.Violation getViolations(int index) {
    return violations_.get(index);
  }
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  public com.google.rpc.QuotaFailure.ViolationOrBuilder getViolationsOrBuilder(
      int index) {
    return violations_.get(index);
  }
  private void ensureViolationsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.google.rpc.QuotaFailure.Violation> tmp = violations_;
    if (!tmp.isModifiable()) {
      violations_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  private void setViolations(
      int index, com.google.rpc.QuotaFailure.Violation value) {
    value.getClass();
  ensureViolationsIsMutable();
    violations_.set(index, value);
  }
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  private void addViolations(com.google.rpc.QuotaFailure.Violation value) {
    value.getClass();
  ensureViolationsIsMutable();
    violations_.add(value);
  }
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  private void addViolations(
      int index, com.google.rpc.QuotaFailure.Violation value) {
    value.getClass();
  ensureViolationsIsMutable();
    violations_.add(index, value);
  }
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  private void addAllViolations(
      java.lang.Iterable<? extends com.google.rpc.QuotaFailure.Violation> values) {
    ensureViolationsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, violations_);
  }
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  private void clearViolations() {
    violations_ = emptyProtobufList();
  }
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
   */
  private void removeViolations(int index) {
    ensureViolationsIsMutable();
    violations_.remove(index);
  }

  public static com.google.rpc.QuotaFailure parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.rpc.QuotaFailure parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.rpc.QuotaFailure parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.rpc.QuotaFailure parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.rpc.QuotaFailure parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.rpc.QuotaFailure parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.rpc.QuotaFailure parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.rpc.QuotaFailure parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.rpc.QuotaFailure parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.rpc.QuotaFailure parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.rpc.QuotaFailure parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.rpc.QuotaFailure parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.rpc.QuotaFailure prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Describes how a quota check failed.
   *
   * For example if a daily limit was exceeded for the calling project,
   * a service could respond with a QuotaFailure detail containing the project
   * id and the description of the quota limit that was exceeded.  If the
   * calling project hasn't enabled the service in the developer console, then
   * a service could respond with the project id and set `service_disabled`
   * to true.
   *
   * Also see RetryInfo and Help types for other details about handling a
   * quota failure.
   * </pre>
   *
   * Protobuf type {@code google.rpc.QuotaFailure}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.rpc.QuotaFailure, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.rpc.QuotaFailure)
      com.google.rpc.QuotaFailureOrBuilder {
    // Construct using com.google.rpc.QuotaFailure.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Describes all quota violations.
     * </pre>
     *
     * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
     */
    @java.lang.Override
    public java.util.List<com.google.rpc.QuotaFailure.Violation> getViolationsList() {
      return java.util.Collections.unmodifiableList(
          instance.getViolationsList());
    }
    /**
     * <pre>
     * Describes all quota violations.
     * </pre>
     *
     * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
     */
    @java.lang.Override
    public int getViolationsCount() {
      return instance.getViolationsCount();
    }/**
     * <pre>
     * Describes all quota violations.
     * </pre>
     *
     * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
     */
    @java.lang.Override
    public com.google.rpc.QuotaFailure.Violation getViolations(int index) {
      return instance.getViolations(index);
    }
    /**
     * <pre>
     * Describes all quota violations.
     * </pre>
     *
     * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder setViolations(
        int index, com.google.rpc.QuotaFailure.Violation value) {
      copyOnWrite();
      instance.setViolations(index, value);
      return this;
    }
    /**
     * <pre>
     * Describes all quota violations.
     * </pre>
     *
     * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder setViolations(
        int index, com.google.rpc.QuotaFailure.Violation.Builder builderForValue) {
      copyOnWrite();
      instance.setViolations(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Describes all quota violations.
     * </pre>
     *
     * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder addViolations(com.google.rpc.QuotaFailure.Violation value) {
      copyOnWrite();
      instance.addViolations(value);
      return this;
    }
    /**
     * <pre>
     * Describes all quota violations.
     * </pre>
     *
     * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder addViolations(
        int index, com.google.rpc.QuotaFailure.Violation value) {
      copyOnWrite();
      instance.addViolations(index, value);
      return this;
    }
    /**
     * <pre>
     * Describes all quota violations.
     * </pre>
     *
     * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder addViolations(
        com.google.rpc.QuotaFailure.Violation.Builder builderForValue) {
      copyOnWrite();
      instance.addViolations(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Describes all quota violations.
     * </pre>
     *
     * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder addViolations(
        int index, com.google.rpc.QuotaFailure.Violation.Builder builderForValue) {
      copyOnWrite();
      instance.addViolations(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Describes all quota violations.
     * </pre>
     *
     * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder addAllViolations(
        java.lang.Iterable<? extends com.google.rpc.QuotaFailure.Violation> values) {
      copyOnWrite();
      instance.addAllViolations(values);
      return this;
    }
    /**
     * <pre>
     * Describes all quota violations.
     * </pre>
     *
     * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder clearViolations() {
      copyOnWrite();
      instance.clearViolations();
      return this;
    }
    /**
     * <pre>
     * Describes all quota violations.
     * </pre>
     *
     * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder removeViolations(int index) {
      copyOnWrite();
      instance.removeViolations(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.rpc.QuotaFailure)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.rpc.QuotaFailure();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "violations_",
            com.google.rpc.QuotaFailure.Violation.class,
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
        com.google.protobuf.Parser<com.google.rpc.QuotaFailure> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.rpc.QuotaFailure.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.rpc.QuotaFailure>(
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


  // @@protoc_insertion_point(class_scope:google.rpc.QuotaFailure)
  private static final com.google.rpc.QuotaFailure DEFAULT_INSTANCE;
  static {
    QuotaFailure defaultInstance = new QuotaFailure();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      QuotaFailure.class, defaultInstance);
  }

  public static com.google.rpc.QuotaFailure getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<QuotaFailure> PARSER;

  public static com.google.protobuf.Parser<QuotaFailure> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

