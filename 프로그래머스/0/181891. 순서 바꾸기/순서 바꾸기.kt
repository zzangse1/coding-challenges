class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        val after = num_list.filterIndexed { index, i -> index >= n }
        val before = num_list.filterIndexed { index, i -> index < n }
        return (after + before).toIntArray()
    }
}