class Solution {
    fun solution(numLog: IntArray): String {
        val list = mutableListOf<String>()

        for (i in 0 until numLog.size - 1) {
            when ((numLog[i + 1]) - (numLog[i])) {
                1 -> list.add("w")
                -1 -> list.add("s")
                10 -> list.add("d")
                else -> list.add("a")
            }
        }
        return list.joinToString("")
    }
}