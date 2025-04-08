import kotlin.math.sqrt

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer = 0
        println(sqrt(left.toDouble()))
        for (i in left..right) {
            if (sqrt(i.toDouble()) % 1 == 0.0) {
                answer -= i
            } else {
                answer += i
            }
        }
        return answer
    }
}