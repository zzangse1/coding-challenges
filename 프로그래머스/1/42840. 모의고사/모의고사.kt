class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        val test = IntArray(3)
        val numA = intArrayOf(1, 2, 3, 4, 5)
        val numB = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val numC = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        for (i in answers.indices) {
            if (answers[i] == numA[i % numA.size]) {
                test[0]++
            }
            if (answers[i] == numB[i % numB.size]) {
                test[1]++
            }
            if (answers[i] == numC[i % numC.size]) {
                test[2]++
            }
        }
        val maxCount = test.maxOrNull()
        for (i in test.indices) {
            if (test[i] == maxCount) {
                answer += i + 1
            }
        }

        return answer
    }
}