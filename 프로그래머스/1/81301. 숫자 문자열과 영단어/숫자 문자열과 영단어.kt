class Solution {
    fun solution(s: String): Int {
        val str = StringBuilder()
        val wordMap = mutableMapOf(
            "zero" to 0,
            "one" to 1,
            "two" to 2,
            "three" to 3,
            "four" to 4,
            "five" to 5,
            "six" to 6,
            "seven" to 7,
            "eight" to 8,
            "nine" to 9
        )
        var word = ""
        s.forEach { ch ->
            if (ch.isDigit()) {
                str.append(ch)
                word = ""
            } else {
                word += ch
                if (wordMap.containsKey(word)) {
                    str.append(wordMap[word])
                    word = ""
                }
            }
        }
        return str.toString().toInt()
    }
}