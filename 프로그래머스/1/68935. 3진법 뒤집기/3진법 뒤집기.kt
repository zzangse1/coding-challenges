import kotlin.math.pow

class Solution {
    fun solution(n: Int): Int {
        var realNumber = n
        val numList = mutableListOf<Int>()
        while (realNumber > 0) {
            numList.add(realNumber % 3)
            realNumber /= 3
        }

        for (i in 0 until numList.size) {
            val power = 3.0.pow(i).toInt()
            numList[numList.size-i-1] = numList[numList.size-i-1] * power
        }
        return numList.sum()
    }
}
