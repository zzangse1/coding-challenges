class Solution {
    fun solution(my_string: String) = my_string.filter { it.isDigit() }.map { it.toString().toInt() }.sum()
}