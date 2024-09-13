package com.viam.sdk.core.component.audioinput

import com.google.protobuf.ByteString
import com.google.protobuf.Duration
import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.component.audioinput.v1.AudioInputServiceGrpc
import com.viam.component.audioinput.v1.Audioinput
import com.viam.component.audioinput.v1.Audioinput.ChunksResponse
import com.viam.component.audioinput.v1.Audioinput.PropertiesResponse
import com.viam.sdk.core.resource.ResourceManager
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.time.Instant
import java.util.*

class AudioInputRPCServiceTest {
    private lateinit var audioInput: AudioInput
    private lateinit var client: AudioInputServiceGrpc.AudioInputServiceBlockingStub

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
        client = AudioInputServiceGrpc.newBlockingStub(
            grpcCleanupRule.register(
                InProcessChannelBuilder.forName(serviceName).build()
            )
        )
    }

    @Test
    fun chunks() {
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
                val time = Instant.now().epochSecond
                chunks.add(audioChunk)
            }
            return chunks
        }

        val expected = createChunks()
        val request = Audioinput.ChunksRequest.newBuilder().setName(audioInput.name.name).build()

        `when`(audioInput.stream()).thenReturn(expected.iterator())
        val chunks = client.chunks(request)

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
        val request = Audioinput.PropertiesRequest.newBuilder().setName(audioInput.name.name).build()
        val response = client.properties(request)
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