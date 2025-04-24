import kotlin.math.sqrt

class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        val n = nums.size
        for (i in 0 until n - 2) {
            for (j in i + 1 until n - 1) {
                for (k in j + 1 until n) {
                    val sum = nums[i] + nums[j] + nums[k]
                    answer += test(sum)
                }
            }
        }
        return answer
    }

    fun test(a: Int): Int {
        if (a < 2) return 0
        for (i in 2..sqrt(a.toDouble()).toInt()) {
            if (a % i == 0) return 0
        }
        return 1
    }
}