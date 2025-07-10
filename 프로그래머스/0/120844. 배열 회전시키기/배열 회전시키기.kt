class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        val list = numbers.toList()
        return when (direction) {
            "right" -> list.takeLast(1) + list.dropLast(1)
            else -> list.drop(1) + list.take(1)
        }.toIntArray()
    }
}