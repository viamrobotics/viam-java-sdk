package com.viam.sdk.core.component.audioin

import com.google.protobuf.ByteString
import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.component.audioin.v1.Audioin
import com.viam.component.audioin.v1.Audioin.GetAudioResponse
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.rpc.BasicManagedChannel
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.util.*

class AudioInRPCClientTest {
    private lateinit var audioInput: AudioIn
    private lateinit var client: AudioInRPCClient

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        audioInput = mock(
            AudioIn::class.java, withSettings().useConstructor("mock-audioInput").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )
        val resourceManager = ResourceManager(listOf(audioInput))
        val service = AudioInRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = AudioInRPCClient("mock-audioInput", BasicManagedChannel(channel))
    }

    @Test
    fun getAudio() {
        fun createResponses(): MutableList<GetAudioResponse> {
            val responses = mutableListOf<GetAudioResponse>()
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

        `when`(audioInput.getAudio()).thenReturn(expected.iterator())
        val chunks = client.getAudio()
        verify(audioInput).getAudio()
        for ((index, value) in chunks.withIndex()) {
            assertEquals(expected[index], value)
        }

    }

    @Test
    fun getProperties() {
        val properties = Common.GetPropertiesResponse.newBuilder().setSampleRateHz(2)
                .setNumChannels(2).addAllSupportedCodecs(listOf("pcm16, mp3"))
                .build()
        `when`(audioInput.getProperties()).thenReturn(properties)
        val response = client.getProperties()
        verify(audioInput).getProperties()
        assertEquals(properties, response)
    }

    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(audioInput).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(audioInput).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(audioInput).getGeometries(any())
        client.getGeometries(Optional.empty())
        verify(audioInput).getGeometries(any())
    }
}
