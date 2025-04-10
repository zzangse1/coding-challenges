class Solution {
    fun solution(s: String): IntArray {
        val resultList = mutableListOf<Int>()
        val seenMap = mutableMapOf<Char, Int>()
        s.forEachIndexed { index, c ->
            val lastIndex = seenMap[c]
            if (lastIndex != null) {
                resultList.add(index - lastIndex)
            } else {
                resultList.add(-1)
            }
            seenMap[c] = index
        }
        return resultList.toIntArray()
    }
}