class Solution {
    fun solution(sides: IntArray): Int {
        val list = sides.sortedArray()
        return if (list[0] + list[1] > list[2]) {
            1
        } else {
            2
        }
    }
}
