class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        var flag = true
        val popList = mutableListOf<Int>()

        for (i in moves) {
            flag = true
            var zero = 0
            while (flag && zero < board.size) {
                if (board[zero][i - 1] == 0) {
                    zero++
                } else {
                    val doll = board[zero][i - 1]
                    board[zero][i - 1] = 0
                    if (popList.isNotEmpty() && popList.last() == doll) {
                        popList.removeLast()
                        answer += 2
                    } else {
                        popList.add(doll)
                    }
                    flag = false
                }
            }
        }
        return answer
    }
}