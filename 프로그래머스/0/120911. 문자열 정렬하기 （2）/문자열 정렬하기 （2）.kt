import java.lang.StringBuilder

class Solution {
    fun solution(my_string: String): String {
        val answer = StringBuilder()
        my_string.forEach { word ->
            answer.append(word.lowercase())
        }
        return answer.toList().sorted().joinToString("")
    }
}