package dev.mrbrunelli.challenges

class TwoSum {
    fun sol3(list: IntArray, target: Int): IntArray {
        val m = hashMapOf<Int, Int>()
        val r = IntArray(2)
        for (i in list.indices) {
            val diff = target - list[i]
            if (m.contains(diff)) {
                r[0] = m[diff] ?: 0
                r[1] = i
                return r
            } else {
                m[list[i]] = i
            }
        }
        return r
    }

    fun sol2(list: IntArray, target: Int): IntArray {
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

    fun sol1(list: IntArray, target: Int): IntArray? {
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