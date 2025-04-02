class Solution {
    fun solution(a: Int, b: Int, flag: Boolean): Int {
        return when (flag) {
            true -> a+b
            false -> a-b
        }
    }
}