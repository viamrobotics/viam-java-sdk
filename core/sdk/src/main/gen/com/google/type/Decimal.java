// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/type/decimal.proto
// Protobuf Java Version: 4.27.2

package com.google.type;

/**
 * <pre>
 * A representation of a decimal value, such as 2.5. Clients may convert values
 * into language-native decimal formats, such as Java's [BigDecimal][] or
 * Python's [decimal.Decimal][].
 *
 * [BigDecimal]:
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/math/BigDecimal.html
 * [decimal.Decimal]: https://docs.python.org/3/library/decimal.html
 * </pre>
 *
 * Protobuf type {@code google.type.Decimal}
 */
public  final class Decimal extends
    com.google.protobuf.GeneratedMessageLite<
        Decimal, Decimal.Builder> implements
    // @@protoc_insertion_point(message_implements:google.type.Decimal)
    DecimalOrBuilder {
  private Decimal() {
    value_ = "";
  }
  public static final int VALUE_FIELD_NUMBER = 1;
  private java.lang.String value_;
  /**
   * <pre>
   * The decimal value, as a string.
   *
   * The string representation consists of an optional sign, `+` (`U+002B`)
   * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
   * ("the integer"), optionally followed by a fraction, optionally followed
   * by an exponent.
   *
   * The fraction consists of a decimal point followed by zero or more decimal
   * digits. The string must contain at least one digit in either the integer
   * or the fraction. The number formed by the sign, the integer and the
   * fraction is referred to as the significand.
   *
   * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
   * followed by one or more decimal digits.
   *
   * Services **should** normalize decimal values before storing them by:
   *
   * - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
   * - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
   * - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
   * - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
   *
   * Services **may** perform additional normalization based on its own needs
   * and the internal decimal implementation selected, such as shifting the
   * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
   * Additionally, services **may** preserve trailing zeroes in the fraction
   * to indicate increased precision, but are not required to do so.
   *
   * Note that only the `.` character is supported to divide the integer
   * and the fraction; `,` **should not** be supported regardless of locale.
   * Additionally, thousand separators **should not** be supported. If a
   * service does support them, values **must** be normalized.
   *
   * The ENBF grammar is:
   *
   * DecimalString =
   * [Sign] Significand [Exponent];
   *
   * Sign = '+' | '-';
   *
   * Significand =
   * Digits ['.'] [Digits] | [Digits] '.' Digits;
   *
   * Exponent = ('e' | 'E') [Sign] Digits;
   *
   * Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
   *
   * Services **should** clearly document the range of supported values, the
   * maximum supported precision (total number of digits), and, if applicable,
   * the scale (number of digits after the decimal point), as well as how it
   * behaves when receiving out-of-bounds values.
   *
   * Services **may** choose to accept values passed as input even when the
   * value has a higher precision or scale than the service supports, and
   * **should** round the value to fit the supported scale. Alternatively, the
   * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
   * if precision would be lost.
   *
   * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
   * gRPC) if the service receives a value outside of the supported range.
   * </pre>
   *
   * <code>string value = 1 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    return value_;
  }
  /**
   * <pre>
   * The decimal value, as a string.
   *
   * The string representation consists of an optional sign, `+` (`U+002B`)
   * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
   * ("the integer"), optionally followed by a fraction, optionally followed
   * by an exponent.
   *
   * The fraction consists of a decimal point followed by zero or more decimal
   * digits. The string must contain at least one digit in either the integer
   * or the fraction. The number formed by the sign, the integer and the
   * fraction is referred to as the significand.
   *
   * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
   * followed by one or more decimal digits.
   *
   * Services **should** normalize decimal values before storing them by:
   *
   * - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
   * - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
   * - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
   * - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
   *
   * Services **may** perform additional normalization based on its own needs
   * and the internal decimal implementation selected, such as shifting the
   * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
   * Additionally, services **may** preserve trailing zeroes in the fraction
   * to indicate increased precision, but are not required to do so.
   *
   * Note that only the `.` character is supported to divide the integer
   * and the fraction; `,` **should not** be supported regardless of locale.
   * Additionally, thousand separators **should not** be supported. If a
   * service does support them, values **must** be normalized.
   *
   * The ENBF grammar is:
   *
   * DecimalString =
   * [Sign] Significand [Exponent];
   *
   * Sign = '+' | '-';
   *
   * Significand =
   * Digits ['.'] [Digits] | [Digits] '.' Digits;
   *
   * Exponent = ('e' | 'E') [Sign] Digits;
   *
   * Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
   *
   * Services **should** clearly document the range of supported values, the
   * maximum supported precision (total number of digits), and, if applicable,
   * the scale (number of digits after the decimal point), as well as how it
   * behaves when receiving out-of-bounds values.
   *
   * Services **may** choose to accept values passed as input even when the
   * value has a higher precision or scale than the service supports, and
   * **should** round the value to fit the supported scale. Alternatively, the
   * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
   * if precision would be lost.
   *
   * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
   * gRPC) if the service receives a value outside of the supported range.
   * </pre>
   *
   * <code>string value = 1 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(value_);
  }
  /**
   * <pre>
   * The decimal value, as a string.
   *
   * The string representation consists of an optional sign, `+` (`U+002B`)
   * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
   * ("the integer"), optionally followed by a fraction, optionally followed
   * by an exponent.
   *
   * The fraction consists of a decimal point followed by zero or more decimal
   * digits. The string must contain at least one digit in either the integer
   * or the fraction. The number formed by the sign, the integer and the
   * fraction is referred to as the significand.
   *
   * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
   * followed by one or more decimal digits.
   *
   * Services **should** normalize decimal values before storing them by:
   *
   * - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
   * - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
   * - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
   * - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
   *
   * Services **may** perform additional normalization based on its own needs
   * and the internal decimal implementation selected, such as shifting the
   * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
   * Additionally, services **may** preserve trailing zeroes in the fraction
   * to indicate increased precision, but are not required to do so.
   *
   * Note that only the `.` character is supported to divide the integer
   * and the fraction; `,` **should not** be supported regardless of locale.
   * Additionally, thousand separators **should not** be supported. If a
   * service does support them, values **must** be normalized.
   *
   * The ENBF grammar is:
   *
   * DecimalString =
   * [Sign] Significand [Exponent];
   *
   * Sign = '+' | '-';
   *
   * Significand =
   * Digits ['.'] [Digits] | [Digits] '.' Digits;
   *
   * Exponent = ('e' | 'E') [Sign] Digits;
   *
   * Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
   *
   * Services **should** clearly document the range of supported values, the
   * maximum supported precision (total number of digits), and, if applicable,
   * the scale (number of digits after the decimal point), as well as how it
   * behaves when receiving out-of-bounds values.
   *
   * Services **may** choose to accept values passed as input even when the
   * value has a higher precision or scale than the service supports, and
   * **should** round the value to fit the supported scale. Alternatively, the
   * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
   * if precision would be lost.
   *
   * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
   * gRPC) if the service receives a value outside of the supported range.
   * </pre>
   *
   * <code>string value = 1 [json_name = "value"];</code>
   * @param value The value to set.
   */
  private void setValue(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    value_ = value;
  }
  /**
   * <pre>
   * The decimal value, as a string.
   *
   * The string representation consists of an optional sign, `+` (`U+002B`)
   * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
   * ("the integer"), optionally followed by a fraction, optionally followed
   * by an exponent.
   *
   * The fraction consists of a decimal point followed by zero or more decimal
   * digits. The string must contain at least one digit in either the integer
   * or the fraction. The number formed by the sign, the integer and the
   * fraction is referred to as the significand.
   *
   * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
   * followed by one or more decimal digits.
   *
   * Services **should** normalize decimal values before storing them by:
   *
   * - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
   * - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
   * - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
   * - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
   *
   * Services **may** perform additional normalization based on its own needs
   * and the internal decimal implementation selected, such as shifting the
   * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
   * Additionally, services **may** preserve trailing zeroes in the fraction
   * to indicate increased precision, but are not required to do so.
   *
   * Note that only the `.` character is supported to divide the integer
   * and the fraction; `,` **should not** be supported regardless of locale.
   * Additionally, thousand separators **should not** be supported. If a
   * service does support them, values **must** be normalized.
   *
   * The ENBF grammar is:
   *
   * DecimalString =
   * [Sign] Significand [Exponent];
   *
   * Sign = '+' | '-';
   *
   * Significand =
   * Digits ['.'] [Digits] | [Digits] '.' Digits;
   *
   * Exponent = ('e' | 'E') [Sign] Digits;
   *
   * Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
   *
   * Services **should** clearly document the range of supported values, the
   * maximum supported precision (total number of digits), and, if applicable,
   * the scale (number of digits after the decimal point), as well as how it
   * behaves when receiving out-of-bounds values.
   *
   * Services **may** choose to accept values passed as input even when the
   * value has a higher precision or scale than the service supports, and
   * **should** round the value to fit the supported scale. Alternatively, the
   * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
   * if precision would be lost.
   *
   * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
   * gRPC) if the service receives a value outside of the supported range.
   * </pre>
   *
   * <code>string value = 1 [json_name = "value"];</code>
   */
  private void clearValue() {

    value_ = getDefaultInstance().getValue();
  }
  /**
   * <pre>
   * The decimal value, as a string.
   *
   * The string representation consists of an optional sign, `+` (`U+002B`)
   * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
   * ("the integer"), optionally followed by a fraction, optionally followed
   * by an exponent.
   *
   * The fraction consists of a decimal point followed by zero or more decimal
   * digits. The string must contain at least one digit in either the integer
   * or the fraction. The number formed by the sign, the integer and the
   * fraction is referred to as the significand.
   *
   * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
   * followed by one or more decimal digits.
   *
   * Services **should** normalize decimal values before storing them by:
   *
   * - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
   * - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
   * - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
   * - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
   *
   * Services **may** perform additional normalization based on its own needs
   * and the internal decimal implementation selected, such as shifting the
   * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
   * Additionally, services **may** preserve trailing zeroes in the fraction
   * to indicate increased precision, but are not required to do so.
   *
   * Note that only the `.` character is supported to divide the integer
   * and the fraction; `,` **should not** be supported regardless of locale.
   * Additionally, thousand separators **should not** be supported. If a
   * service does support them, values **must** be normalized.
   *
   * The ENBF grammar is:
   *
   * DecimalString =
   * [Sign] Significand [Exponent];
   *
   * Sign = '+' | '-';
   *
   * Significand =
   * Digits ['.'] [Digits] | [Digits] '.' Digits;
   *
   * Exponent = ('e' | 'E') [Sign] Digits;
   *
   * Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
   *
   * Services **should** clearly document the range of supported values, the
   * maximum supported precision (total number of digits), and, if applicable,
   * the scale (number of digits after the decimal point), as well as how it
   * behaves when receiving out-of-bounds values.
   *
   * Services **may** choose to accept values passed as input even when the
   * value has a higher precision or scale than the service supports, and
   * **should** round the value to fit the supported scale. Alternatively, the
   * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
   * if precision would be lost.
   *
   * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
   * gRPC) if the service receives a value outside of the supported range.
   * </pre>
   *
   * <code>string value = 1 [json_name = "value"];</code>
   * @param value The bytes for value to set.
   */
  private void setValueBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    value_ = value.toStringUtf8();

  }

  public static com.google.type.Decimal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.Decimal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.Decimal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.Decimal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.Decimal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.Decimal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.Decimal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.Decimal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.type.Decimal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.type.Decimal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.type.Decimal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.Decimal parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.type.Decimal prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A representation of a decimal value, such as 2.5. Clients may convert values
   * into language-native decimal formats, such as Java's [BigDecimal][] or
   * Python's [decimal.Decimal][].
   *
   * [BigDecimal]:
   * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/math/BigDecimal.html
   * [decimal.Decimal]: https://docs.python.org/3/library/decimal.html
   * </pre>
   *
   * Protobuf type {@code google.type.Decimal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.type.Decimal, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.Decimal)
      com.google.type.DecimalOrBuilder {
    // Construct using com.google.type.Decimal.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The decimal value, as a string.
     *
     * The string representation consists of an optional sign, `+` (`U+002B`)
     * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
     * ("the integer"), optionally followed by a fraction, optionally followed
     * by an exponent.
     *
     * The fraction consists of a decimal point followed by zero or more decimal
     * digits. The string must contain at least one digit in either the integer
     * or the fraction. The number formed by the sign, the integer and the
     * fraction is referred to as the significand.
     *
     * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
     * followed by one or more decimal digits.
     *
     * Services **should** normalize decimal values before storing them by:
     *
     * - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
     * - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
     * - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
     * - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
     *
     * Services **may** perform additional normalization based on its own needs
     * and the internal decimal implementation selected, such as shifting the
     * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
     * Additionally, services **may** preserve trailing zeroes in the fraction
     * to indicate increased precision, but are not required to do so.
     *
     * Note that only the `.` character is supported to divide the integer
     * and the fraction; `,` **should not** be supported regardless of locale.
     * Additionally, thousand separators **should not** be supported. If a
     * service does support them, values **must** be normalized.
     *
     * The ENBF grammar is:
     *
     * DecimalString =
     * [Sign] Significand [Exponent];
     *
     * Sign = '+' | '-';
     *
     * Significand =
     * Digits ['.'] [Digits] | [Digits] '.' Digits;
     *
     * Exponent = ('e' | 'E') [Sign] Digits;
     *
     * Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
     *
     * Services **should** clearly document the range of supported values, the
     * maximum supported precision (total number of digits), and, if applicable,
     * the scale (number of digits after the decimal point), as well as how it
     * behaves when receiving out-of-bounds values.
     *
     * Services **may** choose to accept values passed as input even when the
     * value has a higher precision or scale than the service supports, and
     * **should** round the value to fit the supported scale. Alternatively, the
     * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
     * if precision would be lost.
     *
     * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
     * gRPC) if the service receives a value outside of the supported range.
     * </pre>
     *
     * <code>string value = 1 [json_name = "value"];</code>
     * @return The value.
     */
    @java.lang.Override
    public java.lang.String getValue() {
      return instance.getValue();
    }
    /**
     * <pre>
     * The decimal value, as a string.
     *
     * The string representation consists of an optional sign, `+` (`U+002B`)
     * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
     * ("the integer"), optionally followed by a fraction, optionally followed
     * by an exponent.
     *
     * The fraction consists of a decimal point followed by zero or more decimal
     * digits. The string must contain at least one digit in either the integer
     * or the fraction. The number formed by the sign, the integer and the
     * fraction is referred to as the significand.
     *
     * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
     * followed by one or more decimal digits.
     *
     * Services **should** normalize decimal values before storing them by:
     *
     * - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
     * - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
     * - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
     * - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
     *
     * Services **may** perform additional normalization based on its own needs
     * and the internal decimal implementation selected, such as shifting the
     * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
     * Additionally, services **may** preserve trailing zeroes in the fraction
     * to indicate increased precision, but are not required to do so.
     *
     * Note that only the `.` character is supported to divide the integer
     * and the fraction; `,` **should not** be supported regardless of locale.
     * Additionally, thousand separators **should not** be supported. If a
     * service does support them, values **must** be normalized.
     *
     * The ENBF grammar is:
     *
     * DecimalString =
     * [Sign] Significand [Exponent];
     *
     * Sign = '+' | '-';
     *
     * Significand =
     * Digits ['.'] [Digits] | [Digits] '.' Digits;
     *
     * Exponent = ('e' | 'E') [Sign] Digits;
     *
     * Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
     *
     * Services **should** clearly document the range of supported values, the
     * maximum supported precision (total number of digits), and, if applicable,
     * the scale (number of digits after the decimal point), as well as how it
     * behaves when receiving out-of-bounds values.
     *
     * Services **may** choose to accept values passed as input even when the
     * value has a higher precision or scale than the service supports, and
     * **should** round the value to fit the supported scale. Alternatively, the
     * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
     * if precision would be lost.
     *
     * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
     * gRPC) if the service receives a value outside of the supported range.
     * </pre>
     *
     * <code>string value = 1 [json_name = "value"];</code>
     * @return The bytes for value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getValueBytes() {
      return instance.getValueBytes();
    }
    /**
     * <pre>
     * The decimal value, as a string.
     *
     * The string representation consists of an optional sign, `+` (`U+002B`)
     * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
     * ("the integer"), optionally followed by a fraction, optionally followed
     * by an exponent.
     *
     * The fraction consists of a decimal point followed by zero or more decimal
     * digits. The string must contain at least one digit in either the integer
     * or the fraction. The number formed by the sign, the integer and the
     * fraction is referred to as the significand.
     *
     * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
     * followed by one or more decimal digits.
     *
     * Services **should** normalize decimal values before storing them by:
     *
     * - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
     * - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
     * - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
     * - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
     *
     * Services **may** perform additional normalization based on its own needs
     * and the internal decimal implementation selected, such as shifting the
     * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
     * Additionally, services **may** preserve trailing zeroes in the fraction
     * to indicate increased precision, but are not required to do so.
     *
     * Note that only the `.` character is supported to divide the integer
     * and the fraction; `,` **should not** be supported regardless of locale.
     * Additionally, thousand separators **should not** be supported. If a
     * service does support them, values **must** be normalized.
     *
     * The ENBF grammar is:
     *
     * DecimalString =
     * [Sign] Significand [Exponent];
     *
     * Sign = '+' | '-';
     *
     * Significand =
     * Digits ['.'] [Digits] | [Digits] '.' Digits;
     *
     * Exponent = ('e' | 'E') [Sign] Digits;
     *
     * Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
     *
     * Services **should** clearly document the range of supported values, the
     * maximum supported precision (total number of digits), and, if applicable,
     * the scale (number of digits after the decimal point), as well as how it
     * behaves when receiving out-of-bounds values.
     *
     * Services **may** choose to accept values passed as input even when the
     * value has a higher precision or scale than the service supports, and
     * **should** round the value to fit the supported scale. Alternatively, the
     * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
     * if precision would be lost.
     *
     * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
     * gRPC) if the service receives a value outside of the supported range.
     * </pre>
     *
     * <code>string value = 1 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
    }
    /**
     * <pre>
     * The decimal value, as a string.
     *
     * The string representation consists of an optional sign, `+` (`U+002B`)
     * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
     * ("the integer"), optionally followed by a fraction, optionally followed
     * by an exponent.
     *
     * The fraction consists of a decimal point followed by zero or more decimal
     * digits. The string must contain at least one digit in either the integer
     * or the fraction. The number formed by the sign, the integer and the
     * fraction is referred to as the significand.
     *
     * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
     * followed by one or more decimal digits.
     *
     * Services **should** normalize decimal values before storing them by:
     *
     * - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
     * - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
     * - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
     * - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
     *
     * Services **may** perform additional normalization based on its own needs
     * and the internal decimal implementation selected, such as shifting the
     * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
     * Additionally, services **may** preserve trailing zeroes in the fraction
     * to indicate increased precision, but are not required to do so.
     *
     * Note that only the `.` character is supported to divide the integer
     * and the fraction; `,` **should not** be supported regardless of locale.
     * Additionally, thousand separators **should not** be supported. If a
     * service does support them, values **must** be normalized.
     *
     * The ENBF grammar is:
     *
     * DecimalString =
     * [Sign] Significand [Exponent];
     *
     * Sign = '+' | '-';
     *
     * Significand =
     * Digits ['.'] [Digits] | [Digits] '.' Digits;
     *
     * Exponent = ('e' | 'E') [Sign] Digits;
     *
     * Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
     *
     * Services **should** clearly document the range of supported values, the
     * maximum supported precision (total number of digits), and, if applicable,
     * the scale (number of digits after the decimal point), as well as how it
     * behaves when receiving out-of-bounds values.
     *
     * Services **may** choose to accept values passed as input even when the
     * value has a higher precision or scale than the service supports, and
     * **should** round the value to fit the supported scale. Alternatively, the
     * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
     * if precision would be lost.
     *
     * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
     * gRPC) if the service receives a value outside of the supported range.
     * </pre>
     *
     * <code>string value = 1 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      copyOnWrite();
      instance.clearValue();
      return this;
    }
    /**
     * <pre>
     * The decimal value, as a string.
     *
     * The string representation consists of an optional sign, `+` (`U+002B`)
     * or `-` (`U+002D`), followed by a sequence of zero or more decimal digits
     * ("the integer"), optionally followed by a fraction, optionally followed
     * by an exponent.
     *
     * The fraction consists of a decimal point followed by zero or more decimal
     * digits. The string must contain at least one digit in either the integer
     * or the fraction. The number formed by the sign, the integer and the
     * fraction is referred to as the significand.
     *
     * The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`)
     * followed by one or more decimal digits.
     *
     * Services **should** normalize decimal values before storing them by:
     *
     * - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`).
     * - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`).
     * - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`).
     * - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`).
     *
     * Services **may** perform additional normalization based on its own needs
     * and the internal decimal implementation selected, such as shifting the
     * decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`).
     * Additionally, services **may** preserve trailing zeroes in the fraction
     * to indicate increased precision, but are not required to do so.
     *
     * Note that only the `.` character is supported to divide the integer
     * and the fraction; `,` **should not** be supported regardless of locale.
     * Additionally, thousand separators **should not** be supported. If a
     * service does support them, values **must** be normalized.
     *
     * The ENBF grammar is:
     *
     * DecimalString =
     * [Sign] Significand [Exponent];
     *
     * Sign = '+' | '-';
     *
     * Significand =
     * Digits ['.'] [Digits] | [Digits] '.' Digits;
     *
     * Exponent = ('e' | 'E') [Sign] Digits;
     *
     * Digits = { '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' };
     *
     * Services **should** clearly document the range of supported values, the
     * maximum supported precision (total number of digits), and, if applicable,
     * the scale (number of digits after the decimal point), as well as how it
     * behaves when receiving out-of-bounds values.
     *
     * Services **may** choose to accept values passed as input even when the
     * value has a higher precision or scale than the service supports, and
     * **should** round the value to fit the supported scale. Alternatively, the
     * service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC)
     * if precision would be lost.
     *
     * Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in
     * gRPC) if the service receives a value outside of the supported range.
     * </pre>
     *
     * <code>string value = 1 [json_name = "value"];</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setValueBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.type.Decimal)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.type.Decimal();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "value_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.type.Decimal> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.type.Decimal.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.type.Decimal>(
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


  // @@protoc_insertion_point(class_scope:google.type.Decimal)
  private static final com.google.type.Decimal DEFAULT_INSTANCE;
  static {
    Decimal defaultInstance = new Decimal();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Decimal.class, defaultInstance);
  }

  public static com.google.type.Decimal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Decimal> PARSER;

  public static com.google.protobuf.Parser<Decimal> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
