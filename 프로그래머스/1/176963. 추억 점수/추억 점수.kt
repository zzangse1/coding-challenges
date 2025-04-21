class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val answer = IntArray(photo.size)
        val pointMap = mutableMapOf<String, Int>()
        for (i in 0 until name.size) {
            pointMap[name[i]] = yearning[i]
        }
        photo.forEachIndexed { index, strings ->
            var point = 0
            strings.forEach {
                if (pointMap.containsKey(it)) {
                    point += pointMap.getValue(it)
                }
            }
            answer[index] = point
        }
        return answer
    }
}