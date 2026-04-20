package com.viam.sdk.core.component.audioin

import com.google.protobuf.ByteString
import com.viam.common.v1.Common
import com.viam.component.audioin.v1.Audioin
import com.viam.component.audioin.v1.Audioin.GetAudioResponse
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Answers
import org.mockito.Mockito.*

class AudioInTest {
    private lateinit var audioinput: AudioIn

    @BeforeEach
    fun setup() {
        audioinput = mock(AudioIn::class.java, Answers.CALLS_REAL_METHODS)
    }

    @Test
    fun getAudio() {
        fun createResponses(): MutableList<GetAudioResponse> {
            val responses: MutableList<GetAudioResponse> = mutableListOf()
            for (i in 0..5) {
                val info = Common.AudioInfo.newBuilder().setCodec("mp3").setNumChannels(2)
                    .setSampleRateHz(44100).build()
                val chunk = Audioin.AudioChunk.newBuilder()
                    .setAudioData(ByteString.copyFromUtf8(i.toString())).setAudioInfo(info).build()
                val resp = GetAudioResponse.newBuilder().setAudio(chunk).build()
                responses.add(resp)
            }
            return responses
        }

        val expected = createResponses()

        `when`(audioinput.getAudio()).thenReturn(expected.iterator())
        val responses = audioinput.getAudio()
        verify(audioinput).getAudio()
        for ((index, value) in responses.withIndex()) {
            assertEquals(expected[index], value)
        }
    }

    @Test
    fun getProperties() {
        val properties =
            Common.GetPropertiesResponse.newBuilder().addAllSupportedCodecs(listOf("pcm16", "mp3")).setSampleRateHz(44100).setNumChannels(2).build()
        `when`(audioinput.getProperties()).thenReturn(properties)
        val response = audioinput.getProperties()
        verify(audioinput).getProperties()
        assertEquals(properties, response)
    }

}
