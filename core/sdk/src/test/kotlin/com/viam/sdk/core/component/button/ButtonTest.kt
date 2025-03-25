package com.viam.sdk.core.component.button

import com.google.protobuf.Struct
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Answers
import org.mockito.Mockito.*

class ButtonTest {
    private lateinit var button: Button

    @BeforeEach
    fun setup() {
        button = mock(Button::class.java, Answers.CALLS_REAL_METHODS)
    }

    @Test
    fun push() {
        button.push()
        verify(button).push()
    }

    @Test
    fun pushWithExtra() {
        val extra = Struct.getDefaultInstance()
        button.push(extra)
        verify(button).push(extra)
    }
}
