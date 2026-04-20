package com.viam.sdk.core.component.audioin

import com.google.protobuf.ByteString
import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.common.v1.Common.GetPropertiesResponse
import com.viam.component.audioin.v1.AudioInServiceGrpc
import com.viam.component.audioin.v1.Audioin
import com.viam.component.audioin.v1.Audioin.GetAudioResponse
import com.viam.sdk.core.resource.ResourceManager
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.util.*

class AudioInRPCServiceTest {
    private lateinit var audioInput: AudioIn
    private lateinit var client: AudioInServiceGrpc.AudioInServiceBlockingStub

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
        client = AudioInServiceGrpc.newBlockingStub(
            grpcCleanupRule.register(
                InProcessChannelBuilder.forName(serviceName).build()
            )
        )
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

        val request = Audioin.GetAudioRequest.newBuilder().setName(audioInput.name.name).build()
        `when`(audioInput.getAudio()).thenReturn(expected.iterator())
        val responses = client.getAudio(request)
        verify(audioInput).getAudio()
        for ((index, value) in responses.withIndex()) {
            assertEquals(expected[index], value)
        }
    }

    @Test
    fun getProperties() {
        val properties = GetPropertiesResponse
            .newBuilder().addAllSupportedCodecs(listOf("pcm16, mp3")).setSampleRateHz(44100).setNumChannels(2).build()
        `when`(audioInput.getProperties()).thenReturn(properties)
        val request = Common.GetPropertiesRequest.newBuilder().setName(audioInput.name.name).build()
        val response = client.getProperties(request)
        verify(audioInput).getProperties()
        assertEquals(properties, response)
    }

    @Test
    fun doCommand() {
        val command =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        doReturn(command).`when`(audioInput).doCommand(anyMap())
        val request = Common.DoCommandRequest.newBuilder().setName(audioInput.name.name).setCommand(command).build()
        val response = client.doCommand(request)
        verify(audioInput).doCommand(command.fieldsMap)
        assertEquals(command, response.result)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(audioInput).getGeometries(any())
        val request = Common.GetGeometriesRequest.newBuilder().setName(audioInput.name.name).build()
        client.getGeometries(request)
        verify(audioInput).getGeometries(Optional.of(Struct.getDefaultInstance()))
    }
}
