class Solution {
    fun solution(my_string: String, is_prefix: String): Int {
        val list = mutableListOf<String>()
        var mainString = ""
        my_string.forEach {
            mainString += it
            list.add(mainString)
        }
        list.forEach {
            if (it == is_prefix) {
                return 1
            }
        }
        return 0
    }
}