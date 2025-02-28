// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/type/calendar_period.proto
// Protobuf Java Version: 4.28.3

package com.google.type;

/**
 * <pre>
 * A `CalendarPeriod` represents the abstract concept of a time period that has
 * a canonical start. Grammatically, "the start of the current
 * `CalendarPeriod`." All calendar times begin at midnight UTC.
 * </pre>
 *
 * Protobuf enum {@code google.type.CalendarPeriod}
 */
public enum CalendarPeriod
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <pre>
   * Undefined period, raises an error.
   * </pre>
   *
   * <code>CALENDAR_PERIOD_UNSPECIFIED = 0;</code>
   */
  CALENDAR_PERIOD_UNSPECIFIED(0),
  /**
   * <pre>
   * A day.
   * </pre>
   *
   * <code>DAY = 1;</code>
   */
  DAY(1),
  /**
   * <pre>
   * A week. Weeks begin on Monday, following
   * [ISO 8601](https://en.wikipedia.org/wiki/ISO_week_date).
   * </pre>
   *
   * <code>WEEK = 2;</code>
   */
  WEEK(2),
  /**
   * <pre>
   * A fortnight. The first calendar fortnight of the year begins at the start
   * of week 1 according to
   * [ISO 8601](https://en.wikipedia.org/wiki/ISO_week_date).
   * </pre>
   *
   * <code>FORTNIGHT = 3;</code>
   */
  FORTNIGHT(3),
  /**
   * <pre>
   * A month.
   * </pre>
   *
   * <code>MONTH = 4;</code>
   */
  MONTH(4),
  /**
   * <pre>
   * A quarter. Quarters start on dates 1-Jan, 1-Apr, 1-Jul, and 1-Oct of each
   * year.
   * </pre>
   *
   * <code>QUARTER = 5;</code>
   */
  QUARTER(5),
  /**
   * <pre>
   * A half-year. Half-years start on dates 1-Jan and 1-Jul.
   * </pre>
   *
   * <code>HALF = 6;</code>
   */
  HALF(6),
  /**
   * <pre>
   * A year.
   * </pre>
   *
   * <code>YEAR = 7;</code>
   */
  YEAR(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Undefined period, raises an error.
   * </pre>
   *
   * <code>CALENDAR_PERIOD_UNSPECIFIED = 0;</code>
   */
  public static final int CALENDAR_PERIOD_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * A day.
   * </pre>
   *
   * <code>DAY = 1;</code>
   */
  public static final int DAY_VALUE = 1;
  /**
   * <pre>
   * A week. Weeks begin on Monday, following
   * [ISO 8601](https://en.wikipedia.org/wiki/ISO_week_date).
   * </pre>
   *
   * <code>WEEK = 2;</code>
   */
  public static final int WEEK_VALUE = 2;
  /**
   * <pre>
   * A fortnight. The first calendar fortnight of the year begins at the start
   * of week 1 according to
   * [ISO 8601](https://en.wikipedia.org/wiki/ISO_week_date).
   * </pre>
   *
   * <code>FORTNIGHT = 3;</code>
   */
  public static final int FORTNIGHT_VALUE = 3;
  /**
   * <pre>
   * A month.
   * </pre>
   *
   * <code>MONTH = 4;</code>
   */
  public static final int MONTH_VALUE = 4;
  /**
   * <pre>
   * A quarter. Quarters start on dates 1-Jan, 1-Apr, 1-Jul, and 1-Oct of each
   * year.
   * </pre>
   *
   * <code>QUARTER = 5;</code>
   */
  public static final int QUARTER_VALUE = 5;
  /**
   * <pre>
   * A half-year. Half-years start on dates 1-Jan and 1-Jul.
   * </pre>
   *
   * <code>HALF = 6;</code>
   */
  public static final int HALF_VALUE = 6;
  /**
   * <pre>
   * A year.
   * </pre>
   *
   * <code>YEAR = 7;</code>
   */
  public static final int YEAR_VALUE = 7;


  @java.lang.Override
  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The number of the enum to look for.
   * @return The enum associated with the given number.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CalendarPeriod valueOf(int value) {
    return forNumber(value);
  }

  public static CalendarPeriod forNumber(int value) {
    switch (value) {
      case 0: return CALENDAR_PERIOD_UNSPECIFIED;
      case 1: return DAY;
      case 2: return WEEK;
      case 3: return FORTNIGHT;
      case 4: return MONTH;
      case 5: return QUARTER;
      case 6: return HALF;
      case 7: return YEAR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CalendarPeriod>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CalendarPeriod> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CalendarPeriod>() {
          @java.lang.Override
          public CalendarPeriod findValueByNumber(int number) {
            return CalendarPeriod.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return CalendarPeriodVerifier.INSTANCE;
  }

  private static final class CalendarPeriodVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new CalendarPeriodVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return CalendarPeriod.forNumber(number) != null;
          }
        };

  private final int value;

  private CalendarPeriod(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.type.CalendarPeriod)
}

