package dev.mrbrunelli.challenges

class FindNumberOfPrimesBeforeTarget {
    fun linearApproach(primes: IntArray, target: Int): Int {
        for (i in primes.indices) {
            if (primes[i] == target) {
                return i
            }
        }
        return -1
    }

    fun binaryApproach(primes: IntArray, target: Int): Int {
        var left = 0
        var right = primes.lastIndex
        while (left <= right) {
            val mid = (left + right) / 2
            val attempt = primes[mid]
            when {
                attempt == target -> return mid
                attempt > target -> right = mid - 1
                else -> left = mid + 1
            }
        }
        return -1
    }
}

class Primes {
    private fun isPrime(n: Int) = (2 until n).none { n % it == 0 } && n > 1

    fun genPrimes(size: Int): IntArray {
        val primes = mutableListOf<Int>()
        var n = 2
        while (primes.size < size) {
            if (isPrime(n)) {
                primes.add(n)
            }
            n++
        }
        return primes.toIntArray()
    }
}

