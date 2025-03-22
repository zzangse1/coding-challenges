class Solution {
    fun solution(dot: IntArray): Int {
        val (x, y) = dot
        return when {
            x > 0 && y > 0 -> 1
            x < 0 && y > 0 -> 2
            x < 0 && y < 0 -> 3
            else -> 4
        }
    }
}