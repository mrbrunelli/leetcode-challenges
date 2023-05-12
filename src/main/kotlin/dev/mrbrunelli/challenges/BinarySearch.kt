package dev.mrbrunelli.challenges

class BinarySearch {
    // O(log(n)) is better than O(N)
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