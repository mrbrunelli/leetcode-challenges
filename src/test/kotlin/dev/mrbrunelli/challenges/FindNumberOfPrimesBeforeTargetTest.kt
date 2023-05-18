package dev.mrbrunelli.challenges

import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals

class FindNumberOfPrimesBeforeTargetTest {
    private val p = Primes()
    private val sut = FindNumberOfPrimesBeforeTarget()

    @Test
    fun `generate primes`() {
        Assert.assertArrayEquals(
            intArrayOf(
                2,
                3,
                5,
                7,
                11,
                13,
                17,
                19,
                23,
                29,
                31,
                37,
                41,
                43,
                47,
                53,
                59,
                61,
                67,
                71,
                73,
                79,
                83,
                89,
                97
            ), p.genPrimes(25)
        )
    }

    @Test
    fun `number of primes before 67 found using a linear search approach should be equal to 18`() {
        val primes = p.genPrimes(25)
        assertEquals(18, sut.linearApproach(primes, 67))
    }

    @Test
    fun `number of primes before 67 found using a binary search approach should be equal to 18`() {
        val primes = p.genPrimes(25)
        assertEquals(18, sut.binaryApproach(primes, 67))
    }
}