class Solution {
    fun solution(x: Int, n: Int) = (1..n).map { (x * it.toLong()) }.toLongArray()
}