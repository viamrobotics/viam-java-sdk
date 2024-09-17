package com.viam.sdk.core.component.input

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.common.v1.Common.GetGeometriesRequest
import com.viam.component.inputcontroller.v1.InputController
import com.viam.component.inputcontroller.v1.InputController.TriggerEventRequest
import com.viam.component.inputcontroller.v1.InputControllerServiceGrpc
import com.viam.component.inputcontroller.v1.InputControllerServiceGrpc.InputControllerServiceBlockingStub
import com.viam.sdk.core.rpc.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.Instant
import java.util.*
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReadWriteLock
import java.util.concurrent.locks.ReentrantLock
import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.withLock
import kotlin.jvm.optionals.getOrDefault

class InputControllerRPCClient(name: String, channel: Channel) : Controller(name) {
    private val client: InputControllerServiceBlockingStub
    private var callbacks: MutableMap<Control, Map<EventType, ControlFunction?>>
    private var isStreaming: Boolean
    private var lock: ReadWriteLock
    private var streamLock: Lock

    init {
        val client = InputControllerServiceGrpc.newBlockingStub(channel)
        if (channel.callCredentials.isPresent) {
            this.client = client.withCallCredentials(channel.callCredentials.get())
        } else {
            this.client = client
        }
        this.callbacks = mutableMapOf()
        this.lock = ReentrantReadWriteLock() //ensures only one thread edits properties
        this.streamLock = ReentrantLock() //ensures only one stream active
        this.isStreaming = false
    }

    override fun getControls(extra: Struct): List<Control> {
        val request =
            InputController.GetControlsRequest.newBuilder().setController(this.name.name).setExtra(extra).build()
        val response = client.getControls(request)
        return response.controlsList.map { control -> Control.fromValue(control) }
    }

    override fun getEvents(extra: Struct): Map<Control, Event> {
        val request =
            InputController.GetEventsRequest.newBuilder().setController(this.name.name).setExtra(extra).build()
        val response = client.getEvents(request)
        return response.eventsList.associate { event ->
            Control.fromValue(event.control) to Event.fromProto(event)
        }
    }

    override fun registerControlCallback(
        control: Control,
        triggers: List<EventType>,
        function: ControlFunction?,
        extra: Struct
    ): Unit = runBlocking {
        lock.writeLock().lock()
        for (trigger in triggers) {
            if (trigger == EventType.BUTTON_CHANGE)
                callbacks[control] =
                    mutableMapOf(EventType.BUTTON_PRESS to function, EventType.BUTTON_RELEASE to function)
            else
                callbacks[control] = mutableMapOf(trigger to function)
        }
        lock.writeLock().unlock()

        launch {
            streamEvents(extra)
        }
    }

    private suspend fun streamEvents(extra: Struct) {
        streamLock.withLock {
            if (this.isStreaming) return
            this.isStreaming = true
        }
        if (this.callbacks.isEmpty()) return
        val request = InputController.StreamEventsRequest.newBuilder().setController(this.name.name)
            .addAllEvents(listOf()).setExtra(extra)

        lock.writeLock().lock()
        for ((c, cb) in this.callbacks.entries) {
            val evs: List<String> = cb.entries.filter { (_, func) -> func != null }.map { (et, _) -> et.value }
            val cancelled = cb.entries.filter { (_, func) -> func == null }.map { (et, _) -> et.value }
            val event = InputController.StreamEventsRequest.Events.newBuilder().setControl(c.value).addAllEvents(evs)
                .addAllCancelledEvents(cancelled).build()
            request.addEvents(event)
        }
        lock.writeLock().unlock()

        try {
            val response = this.client.streamEvents(request.build())
            sendConnectionStatus(true)
            for (r in response) {
                executeCallback(Event.fromProto(r.event))
            }

        } catch (e: Exception) {
            System.err.println(e)
        } finally {
            sendConnectionStatus(false)
            streamLock.withLock {
                this.isStreaming = false
            }
        }
    }

    private fun sendConnectionStatus(connected: Boolean) {
        for (control in this.callbacks.keys) {
            val eventType = if (connected) EventType.CONNECT else EventType.DISCONNECT
            val event = Event(Instant.now().epochSecond, eventType, control, value = 0.0)
            executeCallback(event)
        }
    }

    private fun executeCallback(event: Event) {
        try {
            val cbMap = callbacks[event.control]
            val cb = cbMap?.getOrDefault(event.event, null)
            val allCB = cbMap?.getOrDefault(EventType.ALL_EVENTS, null)
            if (cb != null) {
                cb(event)
            }
            if (allCB != null) {
                allCB(event)
            }
        } catch (e: Exception) {
            return
        }
    }

    override fun triggerEvent(event: Event, extra: Struct) {
        val request =
            TriggerEventRequest.newBuilder().setController(this.name.name).setEvent(event.proto()).setExtra(extra)
                .build()
        this.client.triggerEvent(request)
    }

    override fun doCommand(command: Map<String, Value>?): Struct {
        val request = Common.DoCommandRequest.newBuilder().setName(this.name.name)
            .setCommand(Struct.newBuilder().putAllFields(command).build()).build()
        val response = this.client.doCommand(request)
        return response.result
    }

    override fun getGeometries(extra: Optional<Struct>): List<Common.Geometry> {
        val request = GetGeometriesRequest.newBuilder().setName(this.name.name)
            .setExtra(extra.getOrDefault(Struct.getDefaultInstance())).build()
        val response = this.client.getGeometries(request)
        return response.geometriesList
    }

}
