package dev.mrbrunelli.challenges

class BinarySearch {
    fun play(n: Int, lst: List<Int>): Int? {
        var low = 0
        var high = lst.lastIndex
        while (low <= high) {
            val mid = (low + high) / 2
            val bet = lst[mid]
            if (bet == n) {
                return mid
            }
            if (bet > n) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }
        return null
    }
}