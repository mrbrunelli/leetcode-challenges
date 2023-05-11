package dev.mrbrunelli.challenges

class RomanToInteger {
    private val dict = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    private fun getDict(c: Char): Int {
        return dict[c] ?: 0
    }

    fun play(s: String): Int {
        var result = 0
        for ((currentIndex, char) in s.withIndex()) {
            val currentValue = getDict(char)
            if (currentIndex < s.lastIndex) {
                if (currentValue < getDict(s[currentIndex + 1])) {
                    result -= currentValue
                } else {
                    result += currentValue
                }
            } else {
                result += currentValue
            }
        }
        return result
    }
}