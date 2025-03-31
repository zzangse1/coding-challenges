class Solution {
    fun solution(n: Int): IntArray {
        var num = n
        val resultList = mutableListOf<Int>()
        while (num != 1) {
            resultList.add(num)
            num = if (num % 2 == 0) num / 2 else 3 * num + 1
        }
        resultList.add(1)
        return resultList.toIntArray()
    }
}