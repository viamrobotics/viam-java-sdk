package com.viam.sdk.core.component.gripper

import com.google.protobuf.Struct
import com.google.protobuf.Value
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.*

class MockGripper(name: String) : Gripper(name) {
    var isOpen = false
    private var isInMotion = false
    var extra: Struct? = null

    override fun open(extra: Optional<Struct>?) {
        this.isOpen = true
        this.isInMotion = true
        this.extra = extra?.orElse(null)
    }

    override fun grab(extra: Optional<Struct>?): Boolean {
        this.isOpen = false
        this.isInMotion = true
        this.extra = extra?.orElse(null)
        return true
    }

    override fun stop(extra: Optional<Struct>?) {
        this.isInMotion = false
        this.extra = extra?.orElse(null)
    }

    override fun isMoving(): Boolean {
        return this.isInMotion
    }
}

class GripperTest {

    private lateinit var gripper: MockGripper

    @BeforeEach
    fun setup() {
        gripper = MockGripper("testGripper")
    }

    @Test
    fun open() {
        assertFalse(gripper.isOpen)
        assertFalse(gripper.isMoving)
        assertNull(gripper.extra)

        val extraMap = mapOf<String, Value>("foo" to Value.newBuilder().setStringValue("bar").build())
        gripper.open(Optional.of(Struct.newBuilder().putAllFields(extraMap).build()))

        assertTrue(gripper.isOpen)
        assertTrue(gripper.isMoving)
        assertEquals(extraMap, gripper.extra?.fieldsMap)
    }

    @Test
    fun grab() {
        open()

        gripper.grab(null)

        assertFalse(gripper.isOpen)
        assertTrue(gripper.isMoving)
    }

    @Test
    fun stop() {
        grab()

        gripper.stop(null)

        assertFalse(gripper.isOpen)
        assertFalse(gripper.isMoving)
    }
}
