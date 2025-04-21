import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        val numList = mutableListOf<Int>()
        for (i in 1..number) {
            numList.add(countDivisors(i))
        }
        numList.forEachIndexed { index, i ->
            if (i > limit) {
                numList[index] = power
            }
        }
        return numList.sum()
    }

    private fun countDivisors(n: Int): Int {
        var count = 0
        for (i in 1..sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                count += if (i * i == n) 1 else 2
            }
        }
        return count
    }
}