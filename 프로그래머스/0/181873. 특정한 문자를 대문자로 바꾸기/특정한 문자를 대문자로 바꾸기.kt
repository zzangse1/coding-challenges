class Solution {
    fun solution(my_string: String, alp: String): String {
        return my_string.map {
            if (it == alp[0]) {
                it.uppercaseChar()
            } else {
                it
            }
        }.joinToString("")
    }
}