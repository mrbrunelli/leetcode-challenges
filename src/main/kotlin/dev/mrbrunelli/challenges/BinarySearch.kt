package dev.mrbrunelli.challenges

class BinarySearch {
    // Binary search O(log(n)) is better than linear search O(N)
    // To search a number in 128 numbers using a O(N), we need to iterate a maximum of 128 times
    // To search a number in 128 numbers using a O(log(n)), we need to iterate a maximum of 7 times, which equals 2^7 = 128
    fun play(target: Int, list: List<Int>): Int? {
        var leftPointer = 0
        var rightPointer = list.lastIndex
        while (leftPointer <= rightPointer) {
            val middlePointer = (leftPointer + rightPointer) / 2
            val attempt = list[middlePointer]
            when {
                attempt == target -> return middlePointer
                attempt > target -> rightPointer = middlePointer - 1
                else -> leftPointer = middlePointer + 1
            }
        }
        return null
    }
}