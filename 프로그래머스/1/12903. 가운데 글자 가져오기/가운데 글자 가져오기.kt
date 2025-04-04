class Solution {
    fun solution(s: String): String {
        val index = s.length / 2
        return if (s.length % 2 == 0) {
            "${s[index - 1]}${s[index]}"
        } else {
            "${s[index]}"
        }
    }
}