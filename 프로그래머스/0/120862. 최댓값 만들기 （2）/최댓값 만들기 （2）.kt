class Solution {
    fun solution(numbers: IntArray): Int {
        val list = numbers.sorted()
        println(list)
        val first = list[0] * list[1]
        val second = list.last() * list[list.lastIndex - 1]
        return if (first > second) first else second
    }
}
