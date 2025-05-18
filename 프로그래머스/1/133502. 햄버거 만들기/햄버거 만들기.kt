class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        val stack = mutableListOf<Int>()
        for (i in ingredient) {
            stack.add(i)
            if (stack.size >= 4 && stack.takeLast(4) == listOf(1, 2, 3, 1)) {
                repeat(4) { stack.removeLast() }
                answer++
            }
        }
        return answer
    }
}