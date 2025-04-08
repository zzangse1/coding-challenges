class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val answer = Array(arr1.size) {
            IntArray(arr1[0].size)
        }
        arr1.forEachIndexed { i, row ->
            row.forEachIndexed { j, value ->
                answer[i][j] = value + arr2[i][j]
            }
        }
        return answer
    }
}
