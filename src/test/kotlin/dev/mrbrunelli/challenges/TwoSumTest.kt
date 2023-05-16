package dev.mrbrunelli.challenges

import org.junit.Test
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis
import kotlin.test.assertContentEquals

class TwoSumTest {
    private val sut = TwoSum()

    @Test
    fun `case 1`() {
        assertContentEquals(intArrayOf(0, 1), sut.sol1(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun `case 2`() {
        assertContentEquals(intArrayOf(1, 2), sut.sol1(intArrayOf(3, 2, 4), 6))
    }

    @Test
    fun `case 3`() {
        assertContentEquals(intArrayOf(0, 1), sut.sol1(intArrayOf(3, 3), 6))
    }

    @Test
    fun `case 4`() {
        assertContentEquals(intArrayOf(0, 1), sut.sol2(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun `case 5`() {
        assertContentEquals(intArrayOf(1, 2), sut.sol2(intArrayOf(3, 2, 4), 6))
    }

    @Test
    fun `case 6`() {
        assertContentEquals(intArrayOf(0, 1), sut.sol2(intArrayOf(3, 3), 6))
    }

    @Test
    fun `case 7`() {
        assertContentEquals(intArrayOf(0, 1), sut.sol3(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun `case 8`() {
        assertContentEquals(intArrayOf(1, 2), sut.sol3(intArrayOf(3, 2, 4), 6))
    }

    @Test
    fun `case 9`() {
        assertContentEquals(intArrayOf(0, 1), sut.sol3(intArrayOf(3, 3), 6))
    }

    @Test
    fun `measure solutions time`() {
        val list = intArrayOf(2, 7, 11, 15)
        val t1 = measureNanoTime {
            sut.sol2(list, 9)
        }
        val t2 = measureNanoTime {
            sut.sol1(list, 9)
        }
        val t3 = measureNanoTime {
            sut.sol3(list, 9)
        }
        println("sol1 $t1 ns")
        println("sol2 $t2 ns")
        println("sol3 $t3 ns")
        assert(t1 < t2)
        assert(t3 < t1)
    }
}