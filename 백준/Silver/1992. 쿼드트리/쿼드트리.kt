fun main() {
    val n = readLine()!!.toInt()
    val board = Array(n) {
        readLine()!!.toCharArray()
    }

    fun quard(y: Int, x: Int, size: Int): String {
        if (size == 1) return board[y][x].toString()
        val first = board[y][x]
        for (i in y until y + size) {
            for (j in x until x + size) {
                if (board[i][j] != first) {
                    return "(" +
                            quard(y, x, size / 2) +
                            quard(y, x + size / 2, size / 2) +
                            quard(y + size / 2, x, size / 2) +
                            quard(y + size / 2, x + size / 2, size / 2) +
                            ")"
                }
            }
        }
        return first.toString()
    }

    println(quard(0, 0, n))
}