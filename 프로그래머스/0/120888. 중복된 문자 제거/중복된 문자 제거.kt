class Solution {
    fun solution(my_string: String): String {
        val list = mutableSetOf<Char>()
        my_string.forEach {
            list.add(it)
        }
        return list.joinToString("")
    }
}
