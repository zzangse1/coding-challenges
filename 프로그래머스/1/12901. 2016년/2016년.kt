class Solution {
    fun solution(a: Int, b: Int): String {
        val monthList = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val dayList = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
        val monthSum = monthList.take(a - 1).sum() + b - 1
        return dayList[monthSum % 7]
    }
}