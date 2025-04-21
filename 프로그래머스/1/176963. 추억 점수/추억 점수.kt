class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val answer = IntArray(photo.size)
        val pointMap = mutableMapOf<String, Int>()
        for (i in 0 until name.size) {
            pointMap[name[i]] = yearning[i]
        }
        photo.mapIndexed { index, strings ->
            var point = 0
            strings.map {
                if (pointMap.containsKey(it)) {
                    point += pointMap.getValue(it)
                    answer[index] = point
                }
            }
        }
        println(pointMap)
        return answer
    }
}