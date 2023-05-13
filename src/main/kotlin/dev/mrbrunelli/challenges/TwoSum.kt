package dev.mrbrunelli.challenges

class TwoSum {
    fun solution(list: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        for (i in list.indices) {
            var c = i + 1
            while (c < list.size) {
                if (list[i] + list[c] == target) {
                    result[0] = i
                    result[1] = c
                    break
                }
                c++
            }
        }
        return result
    }

    fun n2solution(list: IntArray, target: Int): IntArray? {
        for (item in list.withIndex()) {
            for (subItem in list.withIndex()) {
                val sum = item.value + subItem.value
                if (sum == target && item.index != subItem.index) {
                    return intArrayOf(item.index, subItem.index)
                }
            }
        }
        return null
    }


}