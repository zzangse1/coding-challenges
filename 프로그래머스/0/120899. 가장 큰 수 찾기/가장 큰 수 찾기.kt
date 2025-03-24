class Solution {
    fun solution(array: IntArray): IntArray {
        val max = array.maxOf { it }
        val index = array.indexOf(max)
        return intArrayOf(max, index)
    }
}