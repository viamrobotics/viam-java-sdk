package com.viam.sdk.core.util

import io.grpc.Metadata
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class MetadataTest {

    @Test
    fun getVersionMetadata() {
        val metadata = VERSION_METADATA
        val versionString = metadata.get(Metadata.Key.of("viam_client", Metadata.ASCII_STRING_MARSHALLER))
        assertNotNull(versionString)
        val components = versionString!!.split(";")
        assertEquals(components[0], "java")
        assertTrue(components[1].matches("v[0-9]+\\.[0-9]+\\.[0-9]+".toRegex()))
        assertTrue(components[2].matches("(v[0-9]+\\.[0-9]+\\.[0-9]+)|unreleased".toRegex()))
    }
}
