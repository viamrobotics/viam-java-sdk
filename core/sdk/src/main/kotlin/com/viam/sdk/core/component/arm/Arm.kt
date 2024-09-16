package com.viam.sdk.core.component.arm

import com.google.protobuf.ByteString
import com.google.protobuf.Struct
import com.viam.common.v1.Common.*
import com.viam.component.arm.v1.Arm.JointPositions
import com.viam.sdk.core.component.Component
import com.viam.sdk.core.component.arm.Arm
import com.viam.sdk.core.resource.Resource
import com.viam.sdk.core.resource.Subtype
import com.viam.sdk.core.robot.RobotClient

/**
 * An Arm represents a physical robot arm that exists in three-dimensional space.
 */
abstract class Arm(name: String) : Component(SUBTYPE, named(name)) {
    companion object {
        @JvmField
        val SUBTYPE = Subtype(Subtype.NAMESPACE_RDK, Subtype.RESOURCE_TYPE_COMPONENT, "arm")

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
        fun fromRobot(robot: RobotClient, name: String): Arm {
            return robot.getResource(Arm::class.java, named(name))
        }
    }

    /**
     * Get the current position of the end of the arm expressed as a ``Pose``.
     * @return     A representation of the arm's current position as a 6 DOF (six degrees of freedom) pose.
     *             The ``Pose`` is composed of values for location and orientation with respect to the origin.
     *             Location is expressed as distance, which is represented by x, y, and z coordinate values.
     *             Orientation is expressed as an orientation vector, which is represented by o_x, o_y, o_z, and theta values.
     */
    abstract fun getEndPosition(extra: Struct): Pose

    /**
     * Get the current position of the end of the arm expressed as a ``Pose``.
     * @return     A representation of the arm's current position as a 6 DOF (six degrees of freedom) pose.
     *             The ``Pose`` is composed of values for location and orientation with respect to the origin.
     *             Location is expressed as distance, which is represented by x, y, and z coordinate values.
     *             Orientation is expressed as an orientation vector, which is represented by o_x, o_y, o_z, and theta values.
     */
    fun getEndPosition(): Pose {
        return getEndPosition(Struct.getDefaultInstance())
    }

    /**
     * Move the end of the arm to the Pose specified in ``pose``.
     * @param pose The destination ``Pose`` for the arm. The ``Pose`` is composed of values for location and orientation
     *             with respect to the origin.
     *             Location is expressed as distance, which is represented by x, y, and z coordinate values.
     *             Orientation is expressed as an orientation vector, which is represented by o_x, o_y, o_z, and theta values.

     */
    abstract fun moveToPosition(pose: Pose, extra: Struct)

    /**
     * Move the end of the arm to the Pose specified in ``pose``.
     * @param pose The destination ``Pose`` for the arm. The ``Pose`` is composed of values for location and orientation
     *             with respect to the origin.
     *             Location is expressed as distance, which is represented by x, y, and z coordinate values.
     *             Orientation is expressed as an orientation vector, which is represented by o_x, o_y, o_z, and theta values.

     */
    fun moveToPosition(pose: Pose) {
        moveToPosition(pose, Struct.getDefaultInstance())
    }

    /**
     * Move each joint on the arm to the corresponding angle specified in ``positions``.
     * @param positions the destination ``JointPositions`` for the arm
     */
    abstract fun moveToJointPositions(positions: JointPositions, extra: Struct)

    /**
     * Move each joint on the arm to the corresponding angle specified in ``positions``.
     * @param positions the destination ``JointPositions`` for the arm
     */
    fun moveToJointPositions(positions: JointPositions) {
        return moveToJointPositions(positions, Struct.getDefaultInstance())
    }

    /**
     * Get the JointPositions representing the current position of the arm.
     * @return The current ``JointPositions`` for the arm.
     *          ``JointPositions`` can have one attribute, ``values``, a list of joint positions with rotational values (degrees)
     *           and translational values (mm).
     */
    abstract fun getJointPositions(extra: Struct): JointPositions

    /**
     * Get the JointPositions representing the current position of the arm.
     * @return The current ``JointPositions`` for the arm.
     *          ``JointPositions`` can have one attribute, ``values``, a list of joint positions with rotational values (degrees)
     *           and translational values (mm).
     */
    fun getJointPositions(): JointPositions {
        return getJointPositions(Struct.getDefaultInstance())
    }


    /**
     * Stop all motion of the arm. It is assumed that the arm stops immediately.
     */
    abstract fun stop(extra: Struct)

    /**
     * Stop all motion of the arm. It is assumed that the arm stops immediately.
     */
    fun stop() {
        stop(Struct.getDefaultInstance())
    }

    /**
     * Get if the arm is currently moving.
     * @return whether the arm is moving
     */
    abstract fun isMoving(): Boolean


    /**
     * Get the kinematics information associated with the arm.
     * @return  A pair containing two values; the first [0] value represents the format of the
     *          file, either in URDF format (``KinematicsFileFormat.KINEMATICS_FILE_FORMAT_URDF``) or
     *          Viam's kinematic parameter format (spatial vector algebra) (``KinematicsFileFormat.KINEMATICS_FILE_FORMAT_SVA``),
     *          and the second [1] value represents the byte contents of the file.
     */
    abstract fun getKinematics(extra: Struct): Pair<KinematicsFileFormat, ByteString>

    /**
     * Get the kinematics information associated with the arm.
     * @return  A pair containing two values; the first [0] value represents the format of the
     *          file, either in URDF format (``KinematicsFileFormat.KINEMATICS_FILE_FORMAT_URDF``) or
     *          Viam's kinematic parameter format (spatial vector algebra) (``KinematicsFileFormat.KINEMATICS_FILE_FORMAT_SVA``),
     *          and the second [1] value represents the byte contents of the file.
     */
    fun getKinematics(): Pair<KinematicsFileFormat, ByteString> {
        return getKinematics(Struct.getDefaultInstance())
    }


}