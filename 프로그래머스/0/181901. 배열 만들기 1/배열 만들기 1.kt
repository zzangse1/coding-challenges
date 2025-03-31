class Solution {
    fun solution(n: Int, k: Int): IntArray {
        val list = mutableListOf<Int>()
        for (i in k..n step k) {
            list.add(i)
        }
        return list.toIntArray()
    }
}