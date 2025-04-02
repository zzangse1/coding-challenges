class Solution {
    fun solution(n: Long) = n.toString().map { it.toString() }.sortedDescending().joinToString("").toLong()
}