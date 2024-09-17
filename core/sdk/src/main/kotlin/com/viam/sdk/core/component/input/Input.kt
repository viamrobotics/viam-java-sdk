package com.viam.sdk.core.component.input

import com.google.protobuf.Struct
import com.google.protobuf.Timestamp
import com.viam.common.v1.Common.ResourceName
import com.viam.component.inputcontroller.v1.InputController
import com.viam.sdk.core.component.Component
import com.viam.sdk.core.resource.Resource
import com.viam.sdk.core.resource.Subtype
import com.viam.sdk.core.robot.RobotClient


/**
 *  EventType represents the type of input event.
 */
enum class EventType(val value: String) {

    /** Callbacks registered for this event will be called in ADDITION to other registered event callbacks.*/
    ALL_EVENTS("AllEvents"),

    /** Sent at controller initialization, and on reconnects. */
    CONNECT("Connect"),

    /** If unplugged, or wireless/network times out.*/
    DISCONNECT("Disconnect"),

    /** Typical key press.*/
    BUTTON_PRESS("ButtonPress"),

    /** Key release */
    BUTTON_RELEASE("ButtonRelease"),

    /** Key is held down. This wil likely be a repeated event.*/
    BUTTON_HOLD("ButtonHold"),

    /** Both up and down for convenience during registration, not typically emitted.*/
    BUTTON_CHANGE("ButtonChange"),

    /** Absolute position is reported via Value, a la joysticks. */
    POSITION_CHANGE_ABSOLUTE("PositionChangeAbs"),

    /** Relative position is reported via Value, a la mice, or simulating axes with up/down buttons. */
    POSITION_CHANGE_RELATIVE("PositionChangeRel");

    companion object {
        fun fromValue(value: String): EventType = when (value) {
            "AllEvents" -> EventType.ALL_EVENTS
            "Connect" -> EventType.CONNECT
            "Disconnect" -> EventType.DISCONNECT
            "ButtonPress" -> EventType.BUTTON_PRESS
            "ButtonRelease" -> EventType.BUTTON_RELEASE
            "ButtonHold" -> EventType.BUTTON_HOLD
            "ButtonChange" -> EventType.BUTTON_CHANGE
            "PositionChangeAbs" -> EventType.POSITION_CHANGE_ABSOLUTE
            "PositionChangeRel" -> EventType.POSITION_CHANGE_RELATIVE
            else -> throw IllegalArgumentException("Unknown event type $value")
        }
    }
}


/**
 * Control identifies the input (specific Axis or Button) of a controller.
 */
enum class Control(val value: String) {

    // Axes
    ABSOLUTE_X("AbsoluteX"),
    ABSOLUTE_Y("AbsoluteY"),
    ABSOLUTE_Z("AbsoluteZ"),
    ABSOLUTE_RX("AbsoluteRX"),
    ABSOLUTE_RY("AbsoluteRY"),
    ABSOLUTE_RZ("AbsoluteRZ"),
    ABSOLUTE_HAT0_X("AbsoluteHat0X"),
    ABSOLUTE_HAT0_Y("AbsoluteHat0Y"),

    // Buttons
    BUTTON_SOUTH("ButtonSouth"),
    BUTTON_EAST("ButtonEast"),
    BUTTON_WEST("ButtonWest"),
    BUTTON_NORTH("ButtonNorth"),
    BUTTON_LT("ButtonLT"),
    BUTTON_RT("ButtonRT"),
    BUTTON_LT2("ButtonLT2"),
    BUTTON_RT2("ButtonRT2"),
    BUTTON_L_THUMB("ButtonLThumb"),
    BUTTON_R_THUMB("ButtonRThumb"),
    BUTTON_SELECT("ButtonSelect"),
    BUTTON_START("ButtonStart"),
    BUTTON_MENU("ButtonMenu"),
    BUTTON_RECORD("ButtonRecord"),
    BUTTON_E_STOP("ButtonEStop"),

    // Pedals
    ABSOLUTE_PEDAL_ACCELERATOR("AbsolutePedalAccelerator"),
    ABSOLUTE_PEDAL_BRAKE("AbsolutePedalBrake"),
    ABSOLUTE_PEDAL_CLUTCH("AbsolutePedalClutch");

    companion object {
        fun fromValue(value: String): Control = when (value) {
            "AbsoluteX" -> ABSOLUTE_X
            "AbsoluteY" -> ABSOLUTE_Y
            "AbsoluteZ" -> ABSOLUTE_Z
            "AbsoluteRX" -> ABSOLUTE_RX
            "AbsoluteRY" -> ABSOLUTE_RY
            "AbsoluteRZ" -> ABSOLUTE_RZ
            "AbsoluteHat0X" -> ABSOLUTE_HAT0_X
            "AbsoluteHat0Y" -> ABSOLUTE_HAT0_Y
            "ButtonSouth" -> BUTTON_SOUTH
            "ButtonEast" -> BUTTON_EAST
            "ButtonWest" -> BUTTON_WEST
            "ButtonNorth" -> BUTTON_NORTH
            "ButtonLT" -> BUTTON_LT
            "ButtonRT" -> BUTTON_RT
            "ButtonLT2" -> BUTTON_LT2
            "ButtonRT2" -> BUTTON_RT2
            "ButtonLThumb" -> BUTTON_L_THUMB
            "ButtonRThumb" -> BUTTON_R_THUMB
            "ButtonSelect" -> BUTTON_SELECT
            "ButtonStart" -> BUTTON_START
            "ButtonMenu" -> BUTTON_MENU
            "ButtonRecord" -> BUTTON_RECORD
            "ButtonEStop" -> BUTTON_E_STOP
            "AbsolutePedalAccelerator" -> ABSOLUTE_PEDAL_ACCELERATOR
            "AbsolutePedalBrake" -> ABSOLUTE_PEDAL_BRAKE
            "AbsolutePedalClutch" -> ABSOLUTE_PEDAL_CLUTCH
            else -> {
                throw IllegalArgumentException("Unknown control  $value")
            }
        }
    }

}

class Event(val time: Long, val event: EventType, val control: Control, val value: Double) {

    fun proto(): InputController.Event {
        return InputController.Event.newBuilder().setEvent(event.value).setControl(control.value).setValue(value)
            .setTime(Timestamp.newBuilder().setSeconds(time).build()).build()
    }

    companion object { //not sure if im converting time correctly
        fun fromProto(proto: InputController.Event): Event {
            return Event(
                proto.time.seconds,
                EventType.fromValue(proto.event),
                Control.fromValue(proto.control),
                proto.value
            )
        }
    }
}
typealias ControlFunction = (Event) -> Unit

/**
 * Controller is a logical "container" more than an actual device
 * Could be a single gamepad, or a collection of digitalInterrupts and analogReaders, a keyboard, etc.
 */
abstract class Controller(name: String) : Component(SUBTYPE, named(name)) {
    companion object {
        @JvmField
        val SUBTYPE = Subtype(Subtype.NAMESPACE_RDK, Subtype.RESOURCE_TYPE_COMPONENT, "input_controller")

        /**
         * Get the ResourceName of the component
         * @param name the name of the component
         * @return     the component's ResourceName
         */
        @JvmStatic
        fun named(name: String): ResourceName {
            return Resource.named(SUBTYPE, name)
        }

        /**
         * Get the component with the provided name from the provided robot.
         * @param robot the RobotClient
         * @param name  the name of the component
         * @return      the component
         */
        @JvmStatic
        fun fromRobot(robot: RobotClient, name: String): Controller {
            return robot.getResource(Controller::class.java, named(name))
        }
    }

    /**
     * Returns a list of Controls provided by the Controller
     * @return List of controls provided by the Controller
     */
    abstract fun getControls(extra: Struct): List<Control>

    /**
     * Returns a list of Controls provided by the Controller
     * @return List of controls provided by the Controller
     */
    fun getControls(): List<Control> {
        return getControls(Struct.getDefaultInstance())
    }


    /**
     * Returns the most recent Event for each input (which should be the current state)
     * @return the most recent event for each input
     */
    abstract fun getEvents(extra: Struct): Map<Control, Event>

    /**
     * Returns the most recent Event for each input (which should be the current state)
     * @return the most recent event for each input
     */
    fun getEvents(): Map<Control, Event> {
        return getEvents(Struct.getDefaultInstance());
    }

    /**
     * Register a function that will fire on given EventTypes for a given Control
     * @param control  the control to register the function for
     * @param triggers the events that will trigger the function
     * @param function the function to run on specific triggers
     */
    abstract fun registerControlCallback(
        control: Control,
        triggers: List<EventType>,
        function: ControlFunction?,
        extra: Struct
    )

    /**
     * Register a function that will fire on given EventTypes for a given Control
     * @param control  the control to register the function for
     * @param triggers the events that will trigger the function
     * @param function the function to run on specific triggers
     */
    fun registerControlCallback(control: Control, triggers: List<EventType>, function: ControlFunction?) {
        registerControlCallback(control, triggers, function, Struct.getDefaultInstance())
    }

    /**
     * Directly send an Event (such as a button press) from external code
     * @param event the event to trigger
     */
    abstract fun triggerEvent(event: Event, extra: Struct)

    /**
     * Directly send an Event (such as a button press) from external code
     * @param event the event to trigger
     */
    fun triggerEvent(event: Event) {
        triggerEvent(event, Struct.getDefaultInstance())
    }


}

