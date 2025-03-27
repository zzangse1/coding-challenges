class Solution {
    fun solution(arr: IntArray): IntArray {
        val list = mutableListOf<Int>()
        for (i in 0 until arr.size) {
            for (j in 0 until arr[i]) {
                list.add(arr[i])
            }
        }
        return list.toIntArray()
    }
}