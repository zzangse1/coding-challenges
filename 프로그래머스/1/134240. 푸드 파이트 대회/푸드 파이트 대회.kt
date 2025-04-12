import java.lang.StringBuilder

class Solution {
    fun solution(food: IntArray): String {
        val answer = StringBuilder()
        for (i in 1..food.lastIndex) {
            repeat(food[i] / 2) {
                answer.append(i)
            }
        }
        answer.append("0" + answer.reversed())
        return answer.toString()
    }
}