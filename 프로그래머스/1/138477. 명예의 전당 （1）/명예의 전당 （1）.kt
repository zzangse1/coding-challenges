class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val answer = IntArray(score.size)
        val topList = mutableListOf<Int>()
        score.forEachIndexed { index, i ->
            topList.add(i)
            topList.sortDescending()
            if (topList.size > k) {
                topList.removeLast()
            }
            answer[index] = topList.last()
        }
        return answer
    }
}