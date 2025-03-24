import kotlin.math.abs
import kotlin.math.pow

class Solution {
    fun solution(a: Int, b: Int): Int {
        return when {
            a % 2 != 0 && b % 2 != 0 -> (a.toDouble().pow(2) + b.toDouble().pow(2)).toInt()
            a % 2 != 0 || b % 2 != 0 -> 2 * (a + b)
            else -> abs(a - b)
        }
    }
}