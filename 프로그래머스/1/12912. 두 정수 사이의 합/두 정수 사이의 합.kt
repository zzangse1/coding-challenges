class Solution {
    fun solution(a: Int, b: Int): Long {
        val first = a.toLong()
        val last = b.toLong()
        return if (first < last) {
            (first..last).sumOf { it }
        } else if (first > last) {
            (last..first).sumOf { it }
        } else {
            first
        }
    }
}