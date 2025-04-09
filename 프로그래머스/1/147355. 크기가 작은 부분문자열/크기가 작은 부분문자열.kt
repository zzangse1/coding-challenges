class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        val n = t
        for (i in 0..t.length - p.length) {
            if (p >= t.substring(i, i + p.length)) {
                answer++
            }
        }
        return answer
    }
}