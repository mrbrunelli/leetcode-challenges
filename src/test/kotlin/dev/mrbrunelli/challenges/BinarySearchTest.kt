package dev.mrbrunelli.challenges

import org.junit.Test
import kotlin.test.assertEquals

class BinarySearchTest {
    private val sut = BinarySearch()

    @Test
    fun `should find index of provided number from a list`() {
        assertEquals(32, sut.play(33, (1..100).toList()))
        assertEquals(1, sut.play(3, listOf(1, 3, 5, 7, 9)))
        assertEquals(4, sut.play(25, listOf(3, 8, 11, 17, 25, 41, 58, 100)))
        assertEquals(null, sut.play(-1, (5..10).toList()))
    }
}