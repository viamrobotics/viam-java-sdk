package com.viam.sdk.core.component.button

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common.*
import com.viam.sdk.core.component.Component
import com.viam.sdk.core.resource.Resource
import com.viam.sdk.core.resource.Subtype
import com.viam.sdk.core.robot.RobotClient

/**
 * A Button represents a physical or virtual button that can be pushed.
 */
abstract class Button(name: String) : Component(SUBTYPE, named(name)) {
    companion object {
        @JvmField
        val SUBTYPE = Subtype(Subtype.NAMESPACE_RDK, Subtype.RESOURCE_TYPE_COMPONENT, "button")

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
        fun fromRobot(robot: RobotClient, name: String): Button {
            return robot.getResource(Button::class.java, named(name))
        }
    }

    /**
     * Push the button.
     * @param extra Additional arguments to the method
     */
    abstract fun push(extra: Struct)

    /**
     * Push the button.
     */
    fun push() {
        push(Struct.getDefaultInstance())
    }
}
