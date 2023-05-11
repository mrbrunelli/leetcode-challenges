package dev.mrbrunelli.challenges

class RomanToInteger {
    private fun cvt(c: Char): Int {
        return when (c) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }

    fun play(s: String): Int {
        var acc = 0
        s.forEachIndexed { i, c ->
            val cv = cvt(c)
            if (i < s.lastIndex && cv < cvt(s[i + 1])) {
                acc -= cv
            } else {
                acc += cv
            }
        }
        return acc
    }
}