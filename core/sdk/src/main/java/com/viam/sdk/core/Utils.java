package com.viam.sdk.core;

import com.google.common.base.Strings;
import com.viam.common.v1.Common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    private Utils() {}
    // TODO(erd): verify pattern. see problems in IDE
    private static final Pattern resourceNamePattern = Pattern.compile("^([\\w-]+:[\\w-]+:(?:[\\w-]+))\\/?([\\w-]+:(?:[\\w-]+:)*)?(.+)?$");

    /**
     * Create a ResourceName from its string representation ("namespace:resource_type:resource_subtype/[optional_remote]:>name)
     * @param str The ResourceName as a string
     * @return The new ResourceName
     */
    public static Common.ResourceName resourceNameFromString(final String str) {
        final Matcher matcher = resourceNamePattern.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(String.format("%s is not a valid ResourceName", str));
        }
        final String name;
        final String[] parts = matcher.group(1).split(":");
        if (parts.length != 3) {
            throw new IllegalArgumentException(String.format("%s is not a valid ResourceName", str));
        }
        if (!Strings.isNullOrEmpty(matcher.group(2))) {
            name = String.format("%s%s", matcher.group(2), matcher.group(3));
        } else {
            name = matcher.group(3);
        }
        return Common.ResourceName.newBuilder().
                setNamespace(parts[0]).
                setType(parts[1]).
                setSubtype(parts[2]).
                setName(name).
                build();
    }
}
