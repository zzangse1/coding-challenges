class Solution {
    fun solution(a: Int, b: Int): Int {
        val first = (a.toString() + b.toString()).toInt()
        val last = 2 * a * b
        return if (first >= last) {
            first
        } else {
            last
        }
    }
}