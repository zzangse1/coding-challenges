class Solution {
    fun solution(arr: Array<IntArray>): Int {
        var answer: Int = 0
        loop@ for (i in arr.indices) {
            for (j in arr.indices) {
                if (arr[i][j] == arr[j][i]) {
                    answer = 1
                } else {
                    answer = 0
                    break@loop
                }
            }
        }
        return answer
    }
}