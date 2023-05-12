package dev.mrbrunelli.challenges

import org.junit.Test
import kotlin.test.assertEquals

class LongestCommonPrefixTest {
    private val sut = LongestCommonPrefix()

    @Test
    fun `should return 'fl' prefix from flower, flow, flight`() {
        assertEquals("fl", sut.play(listOf("flower", "flow", "flight")))
    }

    @Test
    fun `should return empty string if provided list doesn't have common prefix`() {
        assertEquals("", sut.play(listOf("dog", "racecar", "car")))
    }

    @Test
    fun `should return the 'a' if only prefix is provided`() {
        assertEquals("a", sut.play(listOf("a")))
    }

    @Test
    fun `should return the 'a' prefix from ab, a`() {
        assertEquals("a", sut.play(listOf("ab", "a")))
    }
}