class Solution {
    fun solution(num_list: IntArray): IntArray {
        return intArrayOf(
            num_list.count { it % 2 == 0 },
            num_list.count { it % 2 != 0 }
        )
    }
}