class Solution {
    fun solution(num: Int, k: Int): Int {
        val result = num.toString().indexOf(k.toString())
        if (result >= 0) {
            return result + 1
        }
        return result
    }
}