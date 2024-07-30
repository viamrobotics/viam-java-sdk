@file:JvmName("Metadata")
package com.viam.sdk.core.util

import io.grpc.Metadata

/**
 * Metadata containing client and API versions
 */
val VERSION_METADATA: Metadata
    get() {
        val md = Metadata()
        md.put(Metadata.Key.of("viam_client", Metadata.ASCII_STRING_MARSHALLER), "java;$SDK_VERSION;$API_VERSION")
        return md;
    }
