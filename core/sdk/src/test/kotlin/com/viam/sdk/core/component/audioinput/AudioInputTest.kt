package com.viam.sdk.core.component.audioinput

import com.google.protobuf.ByteString
import com.google.protobuf.Duration
import com.viam.component.audioinput.v1.Audioinput
import com.viam.component.audioinput.v1.Audioinput.ChunksResponse
import com.viam.component.audioinput.v1.Audioinput.PropertiesResponse
import com.viam.sdk.core.component.audioinput.AudioInput
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Answers
import org.mockito.Mockito.*

class AudioInputTest {
    private lateinit var audioinput: AudioInput

    @BeforeEach
    fun setup() {
        audioinput = mock(AudioInput::class.java, Answers.CALLS_REAL_METHODS)
    }

    @Test
    fun stream(){
   
        fun createChunks(): MutableList<ChunksResponse> {
            val chunks: MutableList<ChunksResponse> = mutableListOf()
            for (i in 0..5) {
                val chunk = Audioinput.AudioChunk.newBuilder().setData(ByteString.copyFromUtf8(i.toString())).setLength(2).build()
                val info = Audioinput.AudioChunkInfo.newBuilder().setChannels(4).setSampleFormat(Audioinput.SampleFormat.SAMPLE_FORMAT_FLOAT32_INTERLEAVED).setSamplingRate(1000L).build()
                val audioChunk = ChunksResponse.newBuilder().setChunk(chunk).setInfo(info).build()
                chunks.add(audioChunk)
            }
            return chunks
        }

        val expected = createChunks()

        `when`(audioinput.stream()).thenReturn(expected.iterator())
        val chunks = audioinput.stream()
        verify(audioinput).stream()
        for ((index, value) in chunks.withIndex()) {
            assertEquals(expected[index], value)
        }
    }

    @Test
    fun getProperties() {
        val properties = PropertiesResponse.newBuilder().setLatency(Duration.newBuilder().setSeconds(3000L).build()).setSampleRate(2).setSampleSize(3).setIsFloat(true).setChannelCount(4).setIsBigEndian(true).setIsInterleaved(true).build()
        `when`(audioinput.getProperties()).thenReturn(properties)
        val response = audioinput.getProperties()
        verify(audioinput).getProperties()
        assertEquals(properties, response)

    }
    
}