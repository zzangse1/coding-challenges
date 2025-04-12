
class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        val lowerList = ('a'..'z').map { it }
        val upperList = ('A'..'Z').map { it }
        s.map {
            answer += if (it.isLowerCase()) {
                val idx = lowerList.indexOf(it)
                lowerList[(idx + n) % 26]
            } else if (it.isUpperCase()) {
                val idx = upperList.indexOf(it)
                upperList[(idx + n) % 26]
            } else {
                it
            }
        }
        return answer
    }
}