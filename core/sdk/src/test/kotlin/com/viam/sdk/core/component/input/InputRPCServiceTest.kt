package com.viam.sdk.core.component.input

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.Geometry
import com.viam.component.inputcontroller.v1.InputController
import com.viam.component.inputcontroller.v1.InputController.*
import com.viam.component.inputcontroller.v1.InputControllerServiceGrpc
import com.viam.component.inputcontroller.v1.InputControllerServiceGrpc.InputControllerServiceBlockingStub
import com.viam.sdk.core.resource.ResourceManager
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.testing.GrpcCleanupRule
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.time.Instant
import java.util.*
import kotlin.random.Random

class InputRPCServiceTest {

    private lateinit var inputController: Controller
    private lateinit var client: InputControllerServiceBlockingStub

    @JvmField
    @Rule
    val grpcCleanup: GrpcCleanupRule = GrpcCleanupRule()

    @BeforeEach
    fun setup() {
        inputController = mock(
            Controller::class.java,
            withSettings().useConstructor("mock-inputController").defaultAnswer(CALLS_REAL_METHODS)
        )

        val resourceManager = ResourceManager(listOf(inputController))
        val service = InputControllerRPCService(resourceManager)
        val serviceName = InProcessServerBuilder.generateName()
        grpcCleanup.register(
            InProcessServerBuilder.forName(serviceName).directExecutor().addService(service).build().start()
        )
        client = InputControllerServiceGrpc.newBlockingStub(
            grpcCleanup.register(
                InProcessChannelBuilder.forName(serviceName).directExecutor().build()
            )
        )
    }


    @Test
    fun getControls() {
        val controls = listOf(Control.ABSOLUTE_X)
        `when`(inputController.getControls(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(controls)
        val request = GetControlsRequest.newBuilder().setController(inputController.name.name)
            .setExtra(Struct.getDefaultInstance()).build()
        val response = client.getControls(request)
        verify(inputController).getControls(Struct.getDefaultInstance())
        assertEquals(controls[0], Control.fromValue(response.controlsList[0]))

    }

    @Test
    fun getEvents() {
        val events =
            mapOf(Control.ABSOLUTE_X to Event(Instant.now().epochSecond, EventType.CONNECT, Control.ABSOLUTE_X, 0.0))
        `when`(inputController.getEvents(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(events)
        val request =
            GetEventsRequest.newBuilder().setController(inputController.name.name).setExtra(Struct.getDefaultInstance())
                .build()
        val response = client.getEvents(request)
        verify(inputController).getEvents(Struct.getDefaultInstance())
        assertEquals(events.values.toList()[0].time, Event.fromProto(response.eventsList[0]).time)
        assertEquals(events.values.toList()[0].control, Event.fromProto(response.eventsList[0]).control)
        assertEquals(events.values.toList()[0].event, Event.fromProto(response.eventsList[0]).event)
        assertEquals(events.values.toList()[0].value, Event.fromProto(response.eventsList[0]).value)
    }

    @Test
    fun triggerEvents() {
        val event = Event(Instant.now().epochSecond, EventType.CONNECT, Control.ABSOLUTE_X, 0.0).proto()
        val request =
            InputController.TriggerEventRequest.newBuilder().setController(inputController.name.name).setEvent(event)
                .setExtra(Struct.getDefaultInstance()).build()
        client.triggerEvent(request)
        verify(inputController).triggerEvent(
            (any(Event::class.java) ?: Event.fromProto(event)),
            eq(Struct.getDefaultInstance()) ?: Struct.getDefaultInstance()
        )
    }

    @Test
    fun streamEvents() = runBlocking {
        val callbacks: MutableMap<Control, Map<EventType, ControlFunction?>> = mutableMapOf()
        var expected = mutableListOf<StreamEventsResponse>()
        fun createEvents(): MutableList<StreamEventsResponse> {
            val responses: MutableList<StreamEventsResponse> = mutableListOf()
            for (i in 1..5) {
                var value = Random.nextDouble()
                var ev = Event(Instant.now().epochSecond, EventType.BUTTON_RELEASE, Control.BUTTON_START, value)
                inputController.triggerEvent(ev)
                responses.add(StreamEventsResponse.newBuilder().setEvent(ev.proto()).build())

            }
            return responses
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
                Instant.now().epochSecond, EventType.BUTTON_RELEASE, Control.BUTTON_START, 1.0
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
            expected = createEvents()
        }
        val events = listOf(
            StreamEventsRequest.Events.newBuilder().setControl(Control.BUTTON_START.value)
                .addAllEvents(listOf(EventType.BUTTON_RELEASE.value)).build()
        )
        val request =
            StreamEventsRequest.newBuilder().setController(inputController.name.name).addAllEvents(events).build()
        val response = client.streamEvents(request)
        for ((index, value) in response.withIndex()) {
            assertEquals(expected[index], value)
        }

        //check unregistered callbacks
        assertNull(callbacks[Control.BUTTON_START]!![EventType.BUTTON_RELEASE])
    }

    @Test
    fun doCommand() {
        val command =
            Struct.newBuilder().putAllFields(mapOf("foo" to Value.newBuilder().setStringValue("bar").build())).build()
        doReturn(command).`when`(inputController).doCommand(anyMap())
        val request =
            Common.DoCommandRequest.newBuilder().setName(inputController.name.name).setCommand(command).build()
        val response = client.doCommand(request)
        verify(inputController).doCommand(command.fieldsMap)
        assertEquals(command, response.result)
    }

    @Test
    fun getGeometries() {
        doReturn(listOf<Geometry>()).`when`(inputController).getGeometries(any())
        val request = Common.GetGeometriesRequest.newBuilder().setName(inputController.name.name).build()
        client.getGeometries(request)
        verify(inputController).getGeometries(Optional.of(Struct.getDefaultInstance()))
    }
}