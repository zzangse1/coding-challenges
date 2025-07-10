class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val mapList = mutableMapOf<String, Int>()

        for (i in clothes) {
            val (_, kind) = i
            mapList[kind] = mapList.getOrDefault(kind, 0) + 1
        }
        for (i in mapList.values) {
            answer *= (i + 1)
        }
        return answer-1
    }
}