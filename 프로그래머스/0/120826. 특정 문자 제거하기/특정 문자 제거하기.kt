class Solution {
    fun solution(my_string: String, letter: String): String {
        var result = ""
        for (i in my_string) {
            if (i.toString() != letter) {
                result += i
            }
        }
        return result
    }
}