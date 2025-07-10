class Solution {
    fun solution(emergency: IntArray): IntArray {
        val answer = IntArray(emergency.size) { 1 }
        for (i in emergency.indices) {
            for (j in emergency.indices) {
                if (emergency[i] < emergency[j]) answer[i]++
            }
        }
        return answer
    }
}