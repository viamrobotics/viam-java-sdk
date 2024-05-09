@file:JvmName("MediaUtils")

package com.viam.sdk.core.util

import com.viam.component.camera.v1.Camera.Format
import com.viam.component.camera.v1.Camera.Image
import java.nio.ByteBuffer

/**
 * The dimensions of an [Image] (width x height)
 */
data class ImageDimensions(val width: Int, val height: Int) {
    override fun toString(): String {
        return "$width x $height"
    }
}

/**
 * Get the dimensions of an image from its data and mime-type.
 *
 * Only specific mime-types are supported: PNG, JPEG, and a custom vnd.viam.rgba.
 * The corresponding [Format] are [Format.FORMAT_PNG], [Format.FORMAT_JPEG], and [Format.FORMAT_RAW_RGBA].
 *
 * @param image    the byte data of the image
 * @param mimeType the mime-type of the image
 */
fun getDimensions(image: Iterable<Byte>, mimeType: String): ImageDimensions {
    if (mimeType.contains("(?i)jpe?g".toRegex())) {
        return getDimensionsFromJPEG(image)
    }
    if (mimeType.contains("png", ignoreCase = true)) {
        return getDimensionsFromPNG(image)
    }
    if (mimeType.contains("viam.rgba", ignoreCase = true) || mimeType.contains("FORMAT_RAW_RGBA", ignoreCase = true)) {
        return getDimensionsFromViamRGBA(image)
    }
    throw IllegalArgumentException("Unsupported mime type: $mimeType")
}

/**
 * The dimensions of the image, if [Image.getFormat] returns a supported [Format].
 * See [getDimensions] for more details.
 */
val Image.dimensions: ImageDimensions?
    get() = try {
        getDimensions(this.image, this.format.name)
    } catch (e: Exception) {
        null
    }

/**
 * The width of the image, if [Image.getFormat] returns a supported [Format].
 * See [getDimensions] for more details.
 */
val Image.width: Int?
    get() = this.dimensions?.width

/**
 * The height of the image, if [Image.getFormat] returns a supported [Format].
 * See [getDimensions] for more details.
 */
val Image.height: Int?
    get() = this.dimensions?.height

private fun ByteArray.getShort(byteIndex: Int = 0): Short {
    return ByteBuffer.wrap(this).getShort(byteIndex)
}

private fun ByteArray.getInt(byteIndex: Int = 0): Int {
    return ByteBuffer.wrap(this).getInt(byteIndex)
}

private fun getDimensionsFromJPEG(image: Iterable<Byte>): ImageDimensions {
    // JPEG Specification: https://www.w3.org/Graphics/JPEG/itu-t81.pdf
    // Specification for markers: Table B.1
    var offset = 0
    while (offset < image.count()) {
        while (image.elementAt(offset) == 0xFF.toByte()) {
            // Skip all 0xFF bytes
            offset += 1
        }
        val marker = image.elementAt(offset)
        offset += 1
        if (marker == 0x01.toByte()) {
            // Temporary/private use marker
            offset += 1
            continue
        }
        if (marker.toInt() in 0xD0..0xD7) {
            // Restart (RST) maker
            offset += 1
            continue
        }
        if (marker == 0xD8.toByte()) {
            // Start of image (SOI) marker
            offset += 1
            continue
        }
        if (marker == 0xD9.toByte()) {
            // End of image (EOI) marker
            break
        }
        val len = image.filterIndexed { index, _ -> (offset..offset + 1).contains(index) }
            .toByteArray()
            .getShort() // The length of the section
        if (marker == 0xC0.toByte() || marker == 0xC2.toByte()) { // The two most popular Start of frame (SOF) markers
            val height =
                image.filterIndexed { index, _ -> (offset + 3..offset + 4).contains(index) }.toByteArray().getShort()
            val width =
                image.filterIndexed { index, _ -> (offset + 5..offset + 6).contains(index) }.toByteArray().getShort()
            return ImageDimensions(width.toInt(), height.toInt())
        }
        offset += len
    }
    throw IllegalArgumentException("Invalid JPEG: Could not extract dimensions")
}

private fun getDimensionsFromPNG(image: Iterable<Byte>): ImageDimensions {
    // PNG Specification: https://www.w3.org/TR/png/

    // PNG will always start with this signature
    val signature = image.take(8)
    if (signature != listOf(
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
        throw IllegalArgumentException("Invalid PNG: Invalid signature")
    }

    /*
        Get only the values from the header (IHDR) chunk that we care about.
        IHDR is always the first chunk after the signature.
        In the header, the sections are as follows:
            * 4 bytes: Size of chunk
            * 4 bytes: Type*
            * 4 bytes: Width*
            * 4 bytes: Height*
            * ... remaining bytes
        Because we only care about the Type, Width, and Height, we can skip the first 4 bytes
     */
    val header = image.filterIndexed { index, _ -> (12..24).contains(index) }.toByteArray()
    val type = header.decodeToString(endIndex = 4)
    if (type != "IHDR") {
        throw IllegalArgumentException("Invalid PNG: Invalid headers")
    }
    val width = header.getInt(4)
    val height = header.getInt(8)
    return ImageDimensions(width, height)

}

private fun getDimensionsFromViamRGBA(image: Iterable<Byte>): ImageDimensions {
    // Viam RGBA header comes in 3 4-byte chunks:
    // * Magic Number/Signature
    // * Width
    // * Height
    val header = image.take(12)
    val chunks = header.chunked(4)

    val magicNumber = chunks[0]
    if (magicNumber.toByteArray().decodeToString() != "RGBA") {
        throw IllegalArgumentException("Invalid VIAM RGBA: Invalid headers")
    }

    val width = chunks[1].toByteArray().getInt()
    val height = chunks[2].toByteArray().getInt()
    return ImageDimensions(width, height)
}
