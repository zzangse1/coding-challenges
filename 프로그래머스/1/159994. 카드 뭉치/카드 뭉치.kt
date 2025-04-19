class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var index1 = 0
        var index2 = 0

        for (word in goal) {
            when {
                index1 < cards1.size && cards1[index1] == word -> index1++
                index2 < cards2.size && cards2[index2] == word -> index2++
                else -> return "No"
            }
        }
        return "Yes"
    }
}

fun main() {
    val a = Solution()
    val card1 = arrayOf("i", "drink", "water")
    val card2 = arrayOf("want", "to")
    val goal = arrayOf("i", "want", "to", "drink", "water")
    println(a.solution(card1, card2, goal))  // 출력: Yes
}