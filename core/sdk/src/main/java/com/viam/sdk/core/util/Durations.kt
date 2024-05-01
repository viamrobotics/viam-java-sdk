// Some methods from Google's protobuf:java-utils/Durations.java
//
// Protocol Buffers - Google's data interchange format
// Copyright 2008 Google Inc.  All rights reserved.
//
// Use of this source code is governed by a BSD-style
// license that can be found in the LICENSE file or at
// https://developers.google.com/open-source/licenses/bsd

package com.viam.sdk.core.util

import com.google.common.math.LongMath.checkedAdd
import com.google.common.math.LongMath.checkedMultiply
import com.google.protobuf.Duration


/**
 * Utilities to help create/manipulate `protobuf/duration.proto`.
 */
object Durations {
    const val NANOS_PER_SECOND = 1000000000
    const val DURATION_SECONDS_MIN = -315576000000L
    const val DURATION_SECONDS_MAX = 315576000000L

    fun fromNanos(nanoseconds: Long): Duration {
        return normalizedDuration(
            nanoseconds / NANOS_PER_SECOND, (nanoseconds % NANOS_PER_SECOND).toInt()
        )
    }

    fun toNanos(duration: Duration): Long {
        checkValid(duration)
        return checkedAdd(
            checkedMultiply(duration.seconds, NANOS_PER_SECOND.toLong()), duration.nanos.toLong()
        )
    }

    fun normalizedDuration(seconds: Long, nanos: Int): Duration {
        var secondsVar = seconds
        var nanosVar = nanos
        if (nanosVar <= -NANOS_PER_SECOND || nanosVar >= NANOS_PER_SECOND) {
            secondsVar = checkedAdd(secondsVar, (nanosVar / NANOS_PER_SECOND).toLong())
            nanosVar %= NANOS_PER_SECOND
        }
        if (secondsVar > 0 && nanosVar < 0) {
            nanosVar += NANOS_PER_SECOND // no overflow since nanos is negative (and we're adding)
            secondsVar-- // no overflow since seconds is positive (and we're decrementing)
        }
        if (secondsVar < 0 && nanosVar > 0) {
            nanosVar -= NANOS_PER_SECOND // no overflow since nanos is positive (and we're subtracting)
            secondsVar++ // no overflow since seconds is negative (and we're incrementing)
        }
        val duration = Duration.newBuilder().setSeconds(secondsVar).setNanos(nanosVar).build()
        return checkValid(duration)
    }

    fun isValid(seconds: Long, nanos: Int): Boolean {
        if (seconds < DURATION_SECONDS_MIN || seconds > DURATION_SECONDS_MAX) {
            return false
        }
        if (nanos < -999999999L || nanos >= NANOS_PER_SECOND) {
            return false
        }
        if (seconds < 0 || nanos < 0) {
            if (seconds > 0 || nanos > 0) {
                return false
            }
        }
        return true
    }

    /** Throws an [IllegalArgumentException] if the given [Duration] is not valid.  */
    fun checkValid(duration: Duration): Duration {
        val seconds = duration.seconds
        val nanos = duration.nanos
        require(isValid(seconds, nanos)) {
            String.format(
                "Duration is not valid. See proto definition for valid values. "
                        + "Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. "
                        + "Nanos (%s) must be in range [-999,999,999, +999,999,999]. "
                        + "Nanos must have the same sign as seconds",
                seconds, nanos
            )
        }
        return duration
    }
}
