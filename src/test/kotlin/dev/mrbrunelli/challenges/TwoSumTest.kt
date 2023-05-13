package dev.mrbrunelli.challenges

import org.junit.Test
import kotlin.system.measureTimeMillis
import kotlin.test.assertContentEquals

class TwoSumTest {
    private val sut = TwoSum()

    @Test
    fun `case 1`() {
        assertContentEquals(intArrayOf(0, 1), sut.n2solution(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun `case 2`() {
        assertContentEquals(intArrayOf(1, 2), sut.n2solution(intArrayOf(3, 2, 4), 6))
    }

    @Test
    fun `case 3`() {
        assertContentEquals(intArrayOf(0, 1), sut.n2solution(intArrayOf(3, 3), 6))
    }

    @Test
    fun `case 4`() {
        assertContentEquals(intArrayOf(0, 1), sut.solution(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun `case 5`() {
        assertContentEquals(intArrayOf(1, 2), sut.solution(intArrayOf(3, 2, 4), 6))
    }

    @Test
    fun `case 6`() {
        assertContentEquals(intArrayOf(0, 1), sut.solution(intArrayOf(3, 3), 6))
    }

    @Test
    fun `measure n2solution time`() {
        val list = intArrayOf(2, 7, 11, 15)
        val t1 = measureTimeMillis {
            sut.solution(list, 9)
        }
        val t2 = measureTimeMillis {
            sut.n2solution(list, 9)
        }
        println("solutionTime $t1 ms")
        println("n2solutionTime $t2 ms")
        assert(t1 < t2)
    }
}