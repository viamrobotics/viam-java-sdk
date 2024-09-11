package com.viam.sdk.core.component.audioinput

import com.viam.common.v1.Common.ResourceName
import com.viam.component.audioinput.v1.Audioinput.ChunksResponse
import com.viam.component.audioinput.v1.Audioinput.PropertiesResponse
import com.viam.sdk.core.component.Component
import com.viam.sdk.core.resource.Resource
import com.viam.sdk.core.resource.Subtype
import com.viam.sdk.core.robot.RobotClient

typealias AudioStream = Iterator<ChunksResponse>
typealias Properties = PropertiesResponse

/**
 * AudioInput represents a component that can capture audio.
 */
abstract class AudioInput(name: String) : Component(SUBTYPE, named(name)) {

    companion object {
        @JvmField
        val SUBTYPE = Subtype(Subtype.NAMESPACE_RDK, Subtype.RESOURCE_TYPE_COMPONENT, "audioInput")

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
        fun fromRobot(robot: RobotClient, name: String): AudioInput {
            return robot.getResource(AudioInput::class.java, named(name))
        }
    }

    /**
     * Stream audio samples from the audio input of the underlying robot
     */
    abstract fun stream() : AudioStream

    /**
     * Get the properties of the audio input of the underlying robot
     */
    abstract fun getProperties() : Properties

}