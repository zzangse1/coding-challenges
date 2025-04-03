class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val list = arr.filter { it % divisor == 0 }.sorted().toIntArray()
        return if (list.isEmpty()) {
            intArrayOf(-1)
        } else {
            list
        }
    }
}