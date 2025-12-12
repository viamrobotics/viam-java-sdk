package com.viam.sdk.core.component.gantry

import com.google.protobuf.ByteString
import com.google.protobuf.Struct
import com.viam.common.v1.Common.KinematicsFileFormat
import com.viam.common.v1.Common.ResourceName
import com.viam.sdk.core.component.Component
import com.viam.sdk.core.resource.Resource
import com.viam.sdk.core.resource.Subtype
import com.viam.sdk.core.robot.RobotClient

abstract class Gantry(name: String) : Component(SUBTYPE, Gantry.named(name)) {
    companion object {
        @JvmField
        val SUBTYPE = Subtype(Subtype.NAMESPACE_RDK, Subtype.RESOURCE_TYPE_COMPONENT, "gantry")

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
        fun fromRobot(robot: RobotClient, name: String): Gantry {
            return robot.getResource(Gantry::class.java, named(name))
        }
    }

    /**
     * Get the positions of the axes of the gantry in millimeters.
     * @return the list of the position of the axes of the gantry in millimeters
     */
    abstract fun getPosition(extra: Struct): List<Double>

    /**
     * Get the positions of the axes of the gantry in millimeters.
     * @return the list of the position of the axes of the gantry in millimeters
     */
    fun getPosition(): List<Double> {
        return getPosition(Struct.getDefaultInstance())
    }

    /**
     * Move the axes of the gantry to the desired positions (mm) at the requested speeds (mm/sec).
     * @param positions the list of positions for the axes of the gantry to move to, in millimeters
     * @param speeds    the list of speeds in millimeters per second for the gantry to move at respective to each axis
     */
    abstract fun moveToPosition(positions: List<Double>, speeds: List<Double>, extra: Struct)

    /**
     * Move the axes of the gantry to the desired positions (mm) at the requested speeds (mm/sec).
     * @param positions the list of positions for the axes of the gantry to move to, in millimeters
     * @param speeds    the list of speeds in millimeters per second for the gantry to move at respective to each axis
     */
    fun moveToPosition(positions: List<Double>, speeds: List<Double>) {
        return moveToPosition(positions, speeds, Struct.getDefaultInstance())
    }

    /**
     * Run the homing sequence of the gantry to re-calibrate the axes with respect to the limit switches.
     * @return whether the gantry has run the homing sequence successfully
     */
    abstract fun home(extra: Struct): Boolean

    /**
     * Run the homing sequence of the gantry to re-calibrate the axes with respect to the limit switches.
     * @return whether the gantry has run the homing sequence successfully
     */
    fun home(): Boolean {
        return home(Struct.getDefaultInstance())
    }

    /**
     * Get the lengths of the axes of the gantry in millimeters.
     * @return the list of the lengths of the axes of the gantry in millimeters
     */
    abstract fun getLengths(extra: Struct): List<Double>

    /**
     * Get the lengths of the axes of the gantry in millimeters.
     * @return the list of the lengths of the axes of the gantry in millimeters
     */
    fun getLengths(): List<Double> {
        return getLengths(Struct.getDefaultInstance())
    }

    /**
     *Stop all motion of the gantry. It is assumed that the gantry stops immediately.
     */
    abstract fun stop(extra: Struct)

    /**
     * Stop all motion of the gantry. It is assumed that the gantry stops immediately.
     */
    fun stop() {
        stop(Struct.getDefaultInstance())
    }

    /**
     * Get if the gantry is currently moving.
     * @returns if the gantry is moving
     */
    abstract fun isMoving(): Boolean

    /**
     * Get the kinematics information associated with the gantry.
     * @return  A pair containing two values; the first [0] value represents the format of the
     *          file, either in URDF format (``KinematicsFileFormat.KINEMATICS_FILE_FORMAT_URDF``) or
     *          Viam's kinematic parameter format (spatial vector algebra) (``KinematicsFileFormat.KINEMATICS_FILE_FORMAT_SVA``),
     *          and the second [1] value represents the byte contents of the file.
     */
    abstract fun getKinematics(extra: Struct): Pair<KinematicsFileFormat, ByteString>

    /**
     * Get the kinematics information associated with the gantry.
     * @return  A pair containing two values; the first [0] value represents the format of the
     *          file, either in URDF format (``KinematicsFileFormat.KINEMATICS_FILE_FORMAT_URDF``) or
     *          Viam's kinematic parameter format (spatial vector algebra) (``KinematicsFileFormat.KINEMATICS_FILE_FORMAT_SVA``),
     *          and the second [1] value represents the byte contents of the file.
     */
    fun getKinematics(): Pair<KinematicsFileFormat, ByteString> {
        return getKinematics(Struct.getDefaultInstance())
    }
}