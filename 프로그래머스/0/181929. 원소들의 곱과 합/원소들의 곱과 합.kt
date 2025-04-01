import kotlin.math.pow

class Solution {
    fun solution(num_list: IntArray): Int {
        val sum = num_list.sum().toDouble().pow(2).toInt()
        val times = num_list.fold(1) { acc, i ->
            acc * i
        }
        return if (sum > times) {
            1
        } else {
            0
        }
    }
}