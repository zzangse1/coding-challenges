class Solution {
    fun solution(num_list: IntArray): Int {
        return if (num_list.size <= 10) {
            num_list.reduce { acc, i -> acc * i }
        } else {
            num_list.sum()
        }
    }
}