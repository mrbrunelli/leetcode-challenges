package dev.mrbrunelli.challenges

class BinarySearch {
    // Binary search O(log(n)) is better than linear search O(N)
    // To search a number in 128 numbers using a O(N), we need to iterate a maximum of 128 times
    // To search a number in 128 numbers using a O(log(n)), we need to iterate a maximum of 7 times, which equals 2^7 = 128
    fun play(n: Int, list: List<Int>): Int? {
        var left = 0
        var right = list.lastIndex
        while (left <= right) {
            val mid = (left + right) / 2
            val bet = list[mid]
            when {
                bet == n -> return mid
                bet > n -> right = mid - 1
                else -> left = mid + 1
            }
        }
        return null
    }
}