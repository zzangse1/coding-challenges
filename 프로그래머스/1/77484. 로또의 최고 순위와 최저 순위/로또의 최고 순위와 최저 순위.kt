class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val answer = IntArray(2)
        val tempList = intArrayOf(6, 5, 4, 3, 2, 1)
        println(lottos.sorted())
        println(win_nums.sorted())
        var count = 0
        var zeroCount = 0
        lottos.forEachIndexed { index, i ->
            if (i == 0) zeroCount++
            for (num in win_nums) {
                if (i == num) count++
            }
        }
        println("zero: $zeroCount")
        println("count: $count")

        answer[0] = tempList.getOrElse(zeroCount + count - 1) { 6 }
        answer[1] = tempList.getOrElse(count - 1) { 6 }


        return answer
    }
}