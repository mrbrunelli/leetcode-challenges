package dev.mrbrunelli.challenges

import org.junit.Test
import kotlin.test.assertContentEquals

class TwoSumTest {
    private val sut = TwoSum()

    @Test
    fun `case 1`() {
        assertContentEquals(intArrayOf(0, 1), sut.play(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun `case 2`() {
        assertContentEquals(intArrayOf(1, 2), sut.play(intArrayOf(3, 2, 4), 6))
    }

    @Test
    fun `case 3`() {
        assertContentEquals(intArrayOf(0, 1), sut.play(intArrayOf(3, 3), 6))
    }
}