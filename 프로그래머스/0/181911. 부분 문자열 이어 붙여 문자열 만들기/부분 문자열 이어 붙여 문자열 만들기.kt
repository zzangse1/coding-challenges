import java.lang.StringBuilder

class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        val answer = StringBuilder()
        my_strings.forEachIndexed { index, s ->
            answer.append(s.substring(parts[index].first(), parts[index].last() + 1))
        }
        return answer.toString()
    }
}