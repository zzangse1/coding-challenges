class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        var i = m-1
        val score = score.sortedDescending().toMutableList()
        while (i < score.size){
            if (score[i] > k ) score[i] = k
            answer += score[i] * m
            i = i + m
        }
        return answer
    }
}