class Solution {
    fun solution(s: String): String {
        var index = 0
        val result = s.map { c ->
            if (c == ' ') {
                index = 0
                c
            } else {
                val trans = if (index % 2 == 0) c.uppercaseChar() else c.lowercaseChar()
                index++
                trans
            }
        }.joinToString("")
        return result
    }
}
