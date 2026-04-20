package com.viam.sdk.core.component.audioin

import com.viam.common.v1.Common.ResourceName
import com.viam.component.audioin.v1.Audioin.GetAudioResponse
import com.viam.common.v1.Common.GetPropertiesResponse
import com.viam.sdk.core.component.Component
import com.viam.sdk.core.resource.Resource
import com.viam.sdk.core.resource.Subtype
import com.viam.sdk.core.robot.RobotClient

typealias  AudioResponse = GetAudioResponse
typealias AudioStream = Iterator<AudioResponse>
typealias Properties = GetPropertiesResponse

/**
 * AudioInput represents a component that can capture audio.
 */
abstract class AudioIn(name: String) : Component(SUBTYPE, named(name)) {

    companion object {
        @JvmField
        val SUBTYPE = Subtype(Subtype.NAMESPACE_RDK, Subtype.RESOURCE_TYPE_COMPONENT, "audio_in")

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
        fun fromRobot(robot: RobotClient, name: String): AudioIn {
            return robot.getResource(AudioIn::class.java, named(name))
        }
    }

    /**
     * Stream audio samples from the audio input of the underlying robot
     */
    abstract fun getAudio(): AudioStream

    /**
     * Get the properties of the audio input of the underlying robot
     */
    abstract fun getProperties(): Properties

}
