package dev.mrbrunelli.challenges

class LongestCommonPrefix {
    fun play(strs: List<String>): String {
        val (first, rest) = strs.first() to strs.drop(1)
        var i = 0
        var w = ""
        if (rest.isEmpty()) {
            return first
        }
        outer@ while (i < first.length) {
            for (r in rest) {
                if (r.length > i && first.substring(0, i + 1) == r.substring(0, i + 1)) {
                    w = first.substring(0, i + 1)
                } else {
                    w = first.substring(0, i)
                    break@outer
                }
            }
            i++
        }
        return w
    }
}