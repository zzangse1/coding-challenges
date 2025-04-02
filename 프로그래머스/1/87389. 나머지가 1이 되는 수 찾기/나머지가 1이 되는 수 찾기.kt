class Solution {
    fun solution(n: Int): Int {
        val a = (1 until n).filter { n % it == 1 }
        return a[0]
    }
}