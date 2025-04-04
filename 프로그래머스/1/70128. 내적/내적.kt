class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        return a.mapIndexed { index, i ->
            i * b[index]
        }.sum()
    }
}