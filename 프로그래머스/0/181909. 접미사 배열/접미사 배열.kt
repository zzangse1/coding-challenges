class Solution {
    fun solution(my_string: String): Array<String> {
        val answer = mutableListOf<String>()
        val tempStr = StringBuilder()
        for (i in my_string.length - 1 downTo 0) {
            tempStr.insert(0, my_string[i])
            answer.add(tempStr.toString())
        }
        return answer.sorted().toTypedArray()
    }
}