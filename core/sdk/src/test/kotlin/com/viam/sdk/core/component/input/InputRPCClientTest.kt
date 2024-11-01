package com.viam.sdk.core.component.input

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common.Geometry
import com.viam.sdk.core.component.input.Controller
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.rpc.BasicManagedChannel
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.time.Instant
import java.util.*

class InputRPCClientTest {

    private lateinit var inputController: Controller
    private lateinit var client: InputControllerRPCClient

    @JvmField
    @Rule
    val grpcCleanupRule: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        inputController = mock(
            Controller::class.java, withSettings().useConstructor("mock-inputController").defaultAnswer(
                CALLS_REAL_METHODS
            )
        )
        val resourceManager = ResourceManager(listOf(inputController))
        val service = InputControllerRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanupRule.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        val channel = grpcCleanupRule.register(InProcessChannelBuilder.forName(serviceName).directExecutor().build())
        client = InputControllerRPCClient("mock-inputController", BasicManagedChannel(channel))
    }

    @Test
    fun getControls() {
        val controls = listOf(Control.ABSOLUTE_X)
        `when`(inputController.getControls(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(controls)
        val response = client.getControls()
        verify(inputController).getControls(Struct.getDefaultInstance())
        assertEquals(controls, response)
    }

    @Test
    fun getEvents() {
        val events =
            mapOf(Control.ABSOLUTE_X to Event(Instant.now().epochSecond, EventType.CONNECT, Control.ABSOLUTE_X, 0.0))
        `when`(inputController.getEvents(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(events)
        val response = client.getEvents()
        verify(inputController).getEvents(Struct.getDefaultInstance())
        assertEquals(events.keys, response.keys)

    }

    @Test
    fun triggerEvent() {
        val event = Event(Instant.now().epochSecond, EventType.CONNECT, Control.ABSOLUTE_X, 0.0)
        client.triggerEvent(event)
        verify(inputController).triggerEvent(
            (any(Event::class.java) ?: event),
            eq(Struct.getDefaultInstance()) ?: Struct.getDefaultInstance()
        )

    }

    @Test
    fun registerControlCallback() = runBlocking {
        val callbacks = mutableMapOf<Control, Map<EventType, ControlFunction?>>()
        var callbackCount = 1
        val testEventFun = fun(ev: Event) {
            callbackCount += 1
        }

        doAnswer {
            val event = it.arguments[0] as Event
            val func = callbacks[event.control]?.get(event.event)
            if (func != null) {
                func(event)
            }
            null
        }.`when`(inputController).triggerEvent(
            any(Event::class.java) ?: Event(
                Instant.now().epochSecond,
                EventType.BUTTON_RELEASE,
                Control.BUTTON_START,
                1.0
            )
        )

        doAnswer {
            val control = it.arguments[0] as Control
            val triggers = it.arguments[1] as List<EventType>
            val func = it.arguments[2] as ControlFunction?
            callbacks[control] = triggers.associateWith { func }
            null
        }.`when`(inputController).registerControlCallback(
            eq(Control.BUTTON_START) ?: Control.BUTTON_START,
            eq(listOf(EventType.BUTTON_RELEASE)) ?: listOf(EventType.BUTTON_RELEASE),
            any(),
            any(Struct::class.java) ?: Struct.getDefaultInstance()
        )


        launch {
            delay(2000L)
            for (i in 1..5) {
                var ev = Event(Instant.now().epochSecond, EventType.BUTTON_RELEASE, Control.BUTTON_START, i.toDouble())
                inputController.triggerEvent(ev)
            }
        }

        client.registerControlCallback(Control.BUTTON_START, listOf(EventType.BUTTON_RELEASE), testEventFun)
        verify(inputController, times(2)).registerControlCallback(
            eq(Control.BUTTON_START) ?: Control.BUTTON_START,
            eq(listOf(EventType.BUTTON_RELEASE)) ?: listOf(EventType.BUTTON_RELEASE),
            any(),
            eq(Struct.getDefaultInstance()) ?: Struct.getDefaultInstance()
        )   // occurs twice: once for registering, once for unregistering during cleanup since this calls streamEvent
        assertEquals(callbackCount, 6)

    }


    @Test
    fun doCommand() {
        val command = mapOf("foo" to Value.newBuilder().setStringValue("bar").build())
        doReturn(Struct.newBuilder().putAllFields(command).build()).`when`(inputController).doCommand(anyMap())
        val response = client.doCommand(command)
        verify(inputController).doCommand(command)
        assertEquals(command, response.fieldsMap)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(inputController).getGeometries(any())
        client.getGeometries(Optional.empty())
        verify(inputController).getGeometries(any())
    }
}