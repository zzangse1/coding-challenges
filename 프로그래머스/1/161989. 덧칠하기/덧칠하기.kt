class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var lastPainted = 0
        for (start in section) {
            if (start > lastPainted) {
                answer++
                lastPainted = start+m-1
            }
        }

        return answer
    }
}