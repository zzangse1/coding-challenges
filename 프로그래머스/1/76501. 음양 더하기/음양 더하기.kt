class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        return absolutes.mapIndexed { index, i ->
            if (signs[index]) {
                println(signs[index])
                i
            } else {
                println("${signs[index]}, i = ${i * -1}")
                i * -1
            }
        }.sum()
    }
}