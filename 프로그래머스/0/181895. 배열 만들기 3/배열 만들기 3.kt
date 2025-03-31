class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        val result = mutableListOf<Int>()
        intervals.forEach {
            it.first()
            for (i in it.first() .. it.last()) {
                result.add(arr[i])
            }
        }
        return result.toIntArray()
    }
}