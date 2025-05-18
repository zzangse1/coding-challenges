class Solution {
    fun solution(num: Int): Int {
        var current = num.toLong()
        return (0 until 500).firstOrNull {
            if (current == 1L) true
            else {
                current = if (current % 2 == 0L) current / 2 else current * 3 + 1
                false
            }
        } ?: -1
    }
}