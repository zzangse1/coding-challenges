class Solution {
    fun solution(num_list: IntArray): IntArray {
        val list = num_list.copyOf().toMutableList()
        list.add(
            if (num_list[num_list.lastIndex] > num_list[num_list.lastIndex - 1]) {
                num_list.last() - num_list[num_list.lastIndex - 1]
            } else {
                num_list.last() * 2
            }
        )
        return list.toIntArray()
    }
}