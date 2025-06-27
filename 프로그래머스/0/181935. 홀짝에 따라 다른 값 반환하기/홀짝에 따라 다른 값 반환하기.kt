class Solution {
    fun solution(n: Int): Int {
        return if (n % 2 == 0) {
            (2..n step 2).sumOf { it * it }
        } else {
            (1..n step 2).sum()
        }
    }
}