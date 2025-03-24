class Solution {
    fun solution(array: IntArray): Int {
        val list = array.sortedArray()
        val center = array.size
        return list[center / 2]
    }
}