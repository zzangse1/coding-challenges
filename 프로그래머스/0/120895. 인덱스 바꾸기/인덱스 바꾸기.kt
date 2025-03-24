import java.lang.StringBuilder

class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        val result = StringBuilder(my_string)
        val temp = result[num1]
        result[num1] = result[num2]
        result[num2] = temp
        return result.toString()
    }
}