class Solution {
    fun solution(my_string: String): String {
        return my_string.map { if (it.isUpperCase()) it.lowercase() else it.uppercase() }.joinToString("")
    }
}