class Solution {
    fun solution(num_list: IntArray): Int {
        val odd = num_list.filterIndexed { index, i ->
            (index % 2 == 0)
        }.sum()
        val even = num_list.filterIndexed { index, i ->
            (index % 2 != 0)
        }.sum()
        return if (odd > even) odd else even
    }
}
