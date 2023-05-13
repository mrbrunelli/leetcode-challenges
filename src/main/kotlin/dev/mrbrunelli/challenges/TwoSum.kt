package dev.mrbrunelli.challenges

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
// 7 + 2 = 9

class TwoSum {
    fun play(list: IntArray, target: Int): IntArray? {
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