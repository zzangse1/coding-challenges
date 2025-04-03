class Solution {
    fun solution(num: Int): Int {
        if (num == 1) return 0
        var count = 0
        var current = num.toLong()
        while (current != 1L && count < 500) {
            current = if (current % 2 == 0L) current / 2 else current * 3 + 1
            count++
        }
        return if (current == 1L) count else -1
    }
}