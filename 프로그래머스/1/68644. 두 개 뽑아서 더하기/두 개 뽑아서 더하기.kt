class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        for (i in 0 until numbers.size ) {
            for (j in i + 1 until numbers.size) {
                answer.add(numbers[i] + numbers[j])
            }
        }
        return answer.distinct().toIntArray().sortedArray()
    }
}