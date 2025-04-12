import java.lang.StringBuilder

class Solution {
    fun solution(food: IntArray): String {
        val answer = StringBuilder()
        val a = food.map { it / 2 }
        for (i in 1..food.size - 1) {
            repeat(a[i]) {
                answer.append(i)
            }
        }
        answer.append("0" + answer.reversed())
        return answer.toString()
    }
}