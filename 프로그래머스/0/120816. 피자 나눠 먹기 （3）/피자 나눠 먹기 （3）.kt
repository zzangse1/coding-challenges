import kotlin.math.ceil
class Solution {
    fun solution(slice: Int, n: Int) = ceil(n.toDouble() / slice).toInt()
}