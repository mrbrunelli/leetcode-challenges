package dev.mrbrunelli.challenges

import org.junit.Test
import kotlin.system.measureTimeMillis
import kotlin.test.assertEquals

class BinarySearchTest {
    private val sut = BinarySearch()

    @Test
    fun `case 1`() {
        assertEquals(32, sut.binary(33, (1..100).toList()))
    }

    @Test
    fun `case 2`() {
        assertEquals(1, sut.binary(3, listOf(1, 3, 5, 7, 9)))
    }

    @Test
    fun `case 3`() {
        assertEquals(4, sut.binary(25, listOf(3, 8, 11, 17, 25, 41, 58, 100)))
    }

    @Test
    fun `case 4`() {
        assertEquals(null, sut.binary(-1, (5..10).toList()))
    }

    @Test
    fun `case 5`() {
        assertEquals(72, sut.linear(73, (1..100).toList()))
    }

    @Test
    fun `case 6`() {
        assertEquals(72, sut.binary(73, (1..100).toList()))
    }

    @Test
    fun `case 7`() {
        val list = (1..1_000_000).toList()
        val binaryTime = measureTimeMillis {
            sut.binary(600_000, list)
        }
        val linearTime = measureTimeMillis {
            sut.linear(600_000, list)
        }
        println("binary time: $binaryTime ms")
        println("linear time: $linearTime ms")
        assert(binaryTime < linearTime)
    }
}