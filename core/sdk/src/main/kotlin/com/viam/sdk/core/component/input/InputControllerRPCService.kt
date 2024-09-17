package com.viam.sdk.core.component.input

import com.viam.common.v1.Common.*
import com.viam.component.inputcontroller.v1.InputController
import com.viam.component.inputcontroller.v1.InputController.*
import com.viam.component.inputcontroller.v1.InputControllerServiceGrpc
import com.viam.sdk.core.resource.ResourceManager
import com.viam.sdk.core.resource.ResourceRPCService
import io.grpc.stub.StreamObserver
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.*

internal class InputControllerRPCService(private val manager: ResourceManager) :
    InputControllerServiceGrpc.InputControllerServiceImplBase(), ResourceRPCService<Controller> {

    @OptIn(ExperimentalCoroutinesApi::class)
    override fun streamEvents(
        request: StreamEventsRequest, responseObserver: StreamObserver<StreamEventsResponse>
    ) = runBlocking {
        val controller = getResource(Controller.named(request.controller))
        val channel = Channel<InputController.Event>(1024)

        fun cleanup() {
            channel.close()
            coroutineContext.cancelChildren()
            //unregister events
            for (event in request.eventsList) {
                val triggers = event.eventsList.map { EventType.fromValue(it) }
                if (triggers.isNotEmpty()) controller.registerControlCallback(
                    Control.fromValue(event.control), triggers, null, request.extra
                )
            }
        }

        val ctrlFunc = fun(ev: Event) {
            launch {
                try {
                    val response = ev.proto()
                    channel.send(response)
                } catch (e: Exception) {
                    cleanup()
                }
            }
        }

        for (event in request.eventsList) {
            val triggers = event.eventsList.map { EventType.fromValue(it) } //handle eerror
            if (triggers.isNotEmpty()) controller.registerControlCallback(
                Control.fromValue(event.control),
                triggers,
                ctrlFunc,
                request.extra
            )
            val cancelledTriggers = event.cancelledEventsList.map { EventType.fromValue(it) }
            if (cancelledTriggers.isNotEmpty()) controller.registerControlCallback(
                Control.fromValue(event.control), cancelledTriggers, null, request.extra
            )
        }

        while (true) {
            val receive = channel.receive()
            responseObserver.onNext(StreamEventsResponse.newBuilder().setEvent(receive).build())
            if (channel.isEmpty) {
                break
            }
        }

        cleanup()
        responseObserver.onCompleted()
    }

    override fun getControls(
        request: GetControlsRequest, responseObserver: StreamObserver<GetControlsResponse>
    ) {
        val controller = getResource(Controller.named(request.controller))
        val controls = controller.getControls(request.extra)
        responseObserver.onNext(GetControlsResponse.newBuilder().addAllControls(controls.map { it.value }).build())
        responseObserver.onCompleted()
    }

    override fun getEvents(
        request: GetEventsRequest, responseObserver: StreamObserver<GetEventsResponse>
    ) {
        val controller = getResource(Controller.named(request.controller))
        val events = controller.getEvents(request.extra)
        responseObserver.onNext(GetEventsResponse.newBuilder().addAllEvents(events.values.map { it.proto() }).build())
        responseObserver.onCompleted()
    }

    override fun triggerEvent(
        request: TriggerEventRequest, responseObserver: StreamObserver<TriggerEventResponse>
    ) {
        val controller = getResource(Controller.named(request.controller))
        try {
            controller.triggerEvent(Event.fromProto(request.event), request.extra)
        } catch (e: Exception) {
            throw e
        }
        responseObserver.onNext(TriggerEventResponse.newBuilder().build())
        responseObserver.onCompleted()
    }

    override fun doCommand(
        request: DoCommandRequest, responseObserver: StreamObserver<DoCommandResponse>
    ) {
        val controller = getResource(Controller.named(request.name))
        val result = controller.doCommand(request.command.fieldsMap)
        responseObserver.onNext(DoCommandResponse.newBuilder().setResult(result).build())
        responseObserver.onCompleted()
    }

    override fun getGeometries(
        request: GetGeometriesRequest, responseObserver: StreamObserver<GetGeometriesResponse>
    ) {
        val controller = getResource(Controller.named(request.name))
        val result = controller.getGeometries(Optional.of(request.extra))
        responseObserver.onNext(GetGeometriesResponse.newBuilder().addAllGeometries(result).build())
        responseObserver.onCompleted()
    }

    override fun getResourceClass(): Class<Controller> {
        return Controller::class.java
    }

    override fun getManager(): ResourceManager {
        return this.manager
    }
}