class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answerList = mutableListOf<Int>()
        for (i in commands.indices) {
            val (start, end, k) = commands[i]
            val slice = array.slice((start - 1)..(end - 1)).sorted()
            answerList.add(slice[k - 1])
        }
        return answerList.toIntArray()
    }
}