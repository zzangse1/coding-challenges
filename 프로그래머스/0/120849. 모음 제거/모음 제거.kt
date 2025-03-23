class Solution {
    fun solution(my_string: String): String {
        return my_string.replace("[aeiou]".toRegex(), "")
    }
}
