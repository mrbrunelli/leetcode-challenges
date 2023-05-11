package dev.mrbrunelli.challenges

import org.junit.Test
import kotlin.test.assertEquals

class RomanToIntegerTest {
    private val sut = RomanToInteger()

    @Test
    fun `should I is equal to 1`() {
        assertEquals(1, sut.play("I"))
    }

    @Test
    fun `should II is equal to 2`() {
        assertEquals(2, sut.play("II"))
    }

    @Test
    fun `should III is equal to 3`() {
        assertEquals(3, sut.play("III"))
    }

    @Test
    fun `should IV is equal to 4`() {
        assertEquals(4, sut.play("IV"))
    }

    @Test
    fun `should V is equal to 5`() {
        assertEquals(5, sut.play("V"))
    }

    @Test
    fun `should VI is equal to 6`() {
        assertEquals(6, sut.play("VI"))
    }

    @Test
    fun `should IX is equal to 9`() {
        assertEquals(9, sut.play("IX"))
    }

    @Test
    fun `should X is equal to 10`() {
        assertEquals(10, sut.play("X"))
    }

    @Test
    fun `should XI is equal to 11`() {
        assertEquals(11, sut.play("XI"))
    }

    @Test
    fun `should XII is equal to 11`() {
        assertEquals(12, sut.play("XII"))
    }

    @Test
    fun `should XIV is equal to 14`() {
        assertEquals(14, sut.play("XIV"))
    }

    @Test
    fun `should XIX is equal to 19`() {
        assertEquals(19, sut.play("XIX"))
    }

    @Test
    fun `should LVIII is equal to 58`() {
        assertEquals(58, sut.play("LVIII"))
    }

    @Test
    fun `should MCMXCIV is equal to 1994`() {
        assertEquals(1994, sut.play("MCMXCIV"))
    }
}