package com.viam.sdk.core.util

import java.nio.ByteBuffer

class ImageDimension(val width: Int, val height: Int) {
    override fun toString(): String {
        return "$width x $height"
    }
}

fun getDimensions(image: Iterable<Byte>, mimeType: String): ImageDimension {
    if (mimeType.contains("(?i)jpe?g".toRegex())) {
        return getDimensionsFromJPEG(image)
    }
    if (mimeType.contains("png", ignoreCase = true)) {
        return getDimensionsFromPNG(image)
    }
    if (mimeType.contains("viam.rgba", ignoreCase = true)) {
        return getDimensionsFromViamRGBA(image)
    }
    throw IllegalArgumentException("Unsupported mime type: $mimeType")
}

private fun ByteArray.getShort(byteIndex: Int = 0): Short {
    return ByteBuffer.wrap(this).getShort(byteIndex)
}

private fun ByteArray.getInt(byteIndex: Int = 0): Int {
    return ByteBuffer.wrap(this).getInt(byteIndex)
}

private fun getDimensionsFromJPEG(image: Iterable<Byte>): ImageDimension {
    var offset = 0
    while (offset < image.count()) {
        while (image.elementAt(offset) == 0xFF.toByte()) {
            offset += 1
        }
        val marker = image.elementAt(offset)
        offset += 1
        if (marker == 0x01.toByte()) {
            offset += 1
            continue
        }
        if (marker.toInt() in 0xD0..0xD7) {
            offset += 1
            continue
        }
        if (marker == 0xD8.toByte()) {
            offset += 1
            continue
        }
        if (marker == 0xD9.toByte()) {
            break
        }
        val len = image.filterIndexed { index, _ -> (offset..offset + 1).contains(index) }.toByteArray().getShort()
        if (marker == 0xC0.toByte() || marker == 0xC2.toByte()) {
            val height =
                image.filterIndexed { index, _ -> (offset + 3..offset + 4).contains(index) }.toByteArray().getShort()
            val width =
                image.filterIndexed { index, _ -> (offset + 5..offset + 6).contains(index) }.toByteArray().getShort()
            return ImageDimension(width.toInt(), height.toInt())
        }
        offset += len
    }
    throw IllegalArgumentException("Invalid JPEG: Could not extract dimensions")
}

private fun getDimensionsFromPNG(image: Iterable<Byte>): ImageDimension {
    if (image.take(8) != listOf(
            0x89.toByte(),
            0x50.toByte(),
            0x4E.toByte(),
            0x47.toByte(),
            0x0D.toByte(),
            0x0A.toByte(),
            0x1A.toByte(),
            0x0A.toByte()
        )
    ) {
        throw IllegalArgumentException("Invalid PNG: Invalid headers")
    }
    var offset = 8
    while (offset < image.count()) {
        val chunkSize = image.filterIndexed { idx, _ -> (offset..offset + 3).contains(idx) }.toByteArray().getInt()
        val chunkType =
            image.filterIndexed { idx, _ -> (offset + 4..offset + 7).contains(idx) }.toByteArray().decodeToString()
        if (chunkType != "IHDR") {
            offset += chunkSize
            continue
        }
        val width = image.filterIndexed { idx, _ -> (offset + 8..offset + 11).contains(idx) }.toByteArray().getInt()
        val height = image.filterIndexed { idx, _ -> (offset + 12..offset + 15).contains(idx) }.toByteArray().getInt()
        return ImageDimension(width, height)
    }
    throw IllegalArgumentException("Invalid PNG: Could not extract dimensions")
}

private fun getDimensionsFromViamRGBA(image: Iterable<Byte>): ImageDimension {
    return ImageDimension(0, 0)
}
