package com.viam.sdk.core.component.input

import com.google.protobuf.Struct
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Answers
import org.mockito.Mockito.*
import java.time.Instant

class InputTest {
    private lateinit var inputController: Controller

    @BeforeEach
    fun setup() {
        inputController = mock(Controller::class.java, Answers.CALLS_REAL_METHODS)
    }

    @Test
    fun getControls() {
        val controls = listOf(Control.ABSOLUTE_X)
        `when`(inputController.getControls(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(controls)
        val response = inputController.getControls()
        verify(inputController).getControls()
        assertEquals(controls, response)
    }

    @Test
    fun getEvents() {
        val events =
            mapOf(Control.ABSOLUTE_X to Event(Instant.now().epochSecond, EventType.CONNECT, Control.ABSOLUTE_X, 0.0))
        `when`(inputController.getEvents(any(Struct::class.java) ?: Struct.getDefaultInstance())).thenReturn(events)
        val response = inputController.getEvents()
        verify(inputController).getEvents()
        assertEquals(events, response)
    }

    @Test
    fun triggerEvent() {
        val event = Event(Instant.now().epochSecond, EventType.CONNECT, Control.ABSOLUTE_X, 0.0)
        inputController.triggerEvent(event)
        verify(inputController).triggerEvent(
            (any(Event::class.java) ?: event),
            eq(Struct.getDefaultInstance()) ?: Struct.getDefaultInstance()
        )
    }

    @Test
    fun registerControlCallback() {
        val testEventFun = fun(ev: Event) { return Unit }
        inputController.registerControlCallback(Control.BUTTON_START, listOf(EventType.BUTTON_RELEASE), testEventFun)
        verify(inputController).registerControlCallback(
            Control.BUTTON_START,
            listOf(EventType.BUTTON_RELEASE),
            testEventFun,
            Struct.getDefaultInstance()
        )
    }
}