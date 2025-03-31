import kotlin.math.pow

class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        val sum = a + b + c
        val pow2Sum = listOf(a, b, c).sumOf { it.toDouble().pow(2).toInt() }
        val pow3Sum = listOf(a, b, c).sumOf { it.toDouble().pow(3).toInt() }
        return when {
            a == b && a == c -> pow3Sum * pow2Sum * sum
            a == b || a == c || b == c -> pow2Sum * sum
            else -> sum
        }
    }
}