import java.lang.StringBuilder

class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val skipSet = skip.toSet()
        val answer = StringBuilder()
        for (ch in s) {
            var move = 0
            var nextChar = ch
            while (move < index) {
                nextChar++
                if (nextChar > 'z') nextChar = 'a'
                if (nextChar !in skipSet) move++
            }
            answer.append(nextChar)
        }
        return answer.toString()
    }
}


fun main() {
    val s = Solution()
    println(s.solution("aukks", "wbqd", 5))
}