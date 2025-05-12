class Solution {
    fun solution(X: String, Y: String): String {
        val answer = StringBuilder()
        val aCount = IntArray(10)
        val bCount = IntArray(10)

        for (ch in X) aCount[ch - '0']++
        for (ch in Y) bCount[ch - '0']++

        for (i in 9 downTo 0) {
            val minC = minOf(aCount[i], bCount[i])
            repeat(minC) {
                answer.append(i)
            }
        }

        if (answer.isEmpty()) return "-1"
        if (answer.toString().all { it == '0' }) return "0"


        return answer.toString()
    }
}