package com.viam.sdk.core.util

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class MediaTest {
    private val testDir = "${System.getProperty("user.dir")}/src/test/kotlin/com/viam/sdk/core/util/"

    private val testJPEG = File("$testDir/test_jpeg.jpg").readBytes().toList()
    private val jpegWidth = 190
    private val jpegHeight = 191

    private val testPNG = File("$testDir/test_png.png").readBytes().toList()
    private val pngWidth = 431
    private val pngHeight = 577

    private val testViamRGBA = File("$testDir/test_viam_rgba").readBytes().toList()
    private val rgbaWidth = 640
    private val rgbaHeight = 480

    @Test
    fun getDimensionsJPEG() {
        val dims = getDimensions(testJPEG, "image/jpeg")
        assertEquals(jpegWidth, dims.width)
        assertEquals(jpegHeight, dims.height)
    }

    @Test
    fun getDimensionsPNG() {
        val dims = getDimensions(testPNG, "image/png")
        assertEquals(pngWidth, dims.width)
        assertEquals(pngHeight, dims.height)
    }

    @Test
    fun getDimensionsRGBA() {
        val dims = getDimensions(testViamRGBA, "image/vnd.viam.rgba")
        assertEquals(rgbaWidth, dims.width)
        assertEquals(rgbaHeight, dims.height)
    }
}
