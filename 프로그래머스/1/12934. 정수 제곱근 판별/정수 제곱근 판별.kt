import kotlin.math.pow
import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        val root = sqrt(n.toDouble())
        return if (root % 1 == 0.0) {
            (root + 1).pow(2).toLong()
        } else {
            -1
        }
    }
}