class Solution {
    fun solution(s: String): Int {
        return when (s) {
            "+" -> s.substring(1, s.length).toInt()
            "-" -> s.substring(1, s.length).toInt() * -1
            else -> s.toInt()
        }
    }
}