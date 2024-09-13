package com.viam.sdk.core.component.audioinput

import com.google.protobuf.ByteString
import com.google.protobuf.Duration
import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common.Geometry
import com.viam.component.audioinput.v1.Audioinput
import com.viam.component.audioinput.v1.Audioinput.ChunksResponse
import com.viam.component.audioinput.v1.Audioinput.PropertiesResponse
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

class AudioInputRPCClientTest {
    private lateinit var audioInput: AudioInput
    private lateinit var client: AudioInputRPCClient

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        audioInput = mock(
            AudioInput::class.java, withSettings().useConstructor("mock-audioInput").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )
        val resourceManager = ResourceManager(listOf(audioInput))
        val service = AudioInputRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = AudioInputRPCClient("mock-audioInput", BasicManagedChannel(channel))
    }

    @Test
    fun stream() {

        fun createChunks(): MutableList<ChunksResponse> {
            val chunks: MutableList<ChunksResponse> = mutableListOf()
            for (i in 0..5) {
                val chunk =
                    Audioinput.AudioChunk.newBuilder().setData(ByteString.copyFromUtf8(i.toString())).setLength(2)
                        .build()
                val info = Audioinput.AudioChunkInfo.newBuilder().setChannels(4)
                    .setSampleFormat(Audioinput.SampleFormat.SAMPLE_FORMAT_FLOAT32_INTERLEAVED).setSamplingRate(1000L)
                    .build()
                val audioChunk = ChunksResponse.newBuilder().setChunk(chunk).setInfo(info).build()
                chunks.add(audioChunk)
            }
            return chunks
        }

        val expected = createChunks()

        `when`(audioInput.stream()).thenReturn(expected.iterator())
        val chunks = client.stream()
        verify(audioInput).stream()
        for ((index, value) in chunks.withIndex()) {
            assertEquals(expected[index], value)
        }

    }

    @Test
    fun getProperties() {
        val properties =
            PropertiesResponse.newBuilder().setLatency(Duration.newBuilder().setSeconds(3000L).build()).setSampleRate(2)
                .setSampleSize(3).setIsFloat(true).setChannelCount(4).setIsBigEndian(true).setIsInterleaved(true)
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