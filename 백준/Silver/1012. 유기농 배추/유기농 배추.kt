fun main() {
    val input = readln().toInt()
    for (i in 0 until input) {
        val (n, m, c) = readln().split(" ").map { it.toInt() }
        val board = Array(m) {
            IntArray(n)
        }
        val visited = Array(m) { BooleanArray(n) }
        repeat(c) {
            val (x, y) = readln().split(" ").map { it.toInt() }
            board[y][x] = 1
        }


        var count = 0
        for (y in 0 until m) {
            for (x in 0 until n) {
                if (board[y][x] == 1 && !visited[y][x]) {
                    dfs(y, x, board, visited)
                    count++
                }
            }
        }
        println(count)
    }
}

fun dfs(y: Int, x: Int, board: Array<IntArray>, visited: Array<BooleanArray>) {
    val dy = listOf(-1, 0, 1, 0)
    val dx = listOf(0, 1, 0, -1)
    visited[y][x] = true
    for (i in 0 until 4) {
        val ny = y + dy[i]
        val nx = x + dx[i]


        if (ny !in board.indices || nx !in board[0].indices) continue
        if (board[ny][nx] == 0 || visited[ny][nx]) continue

        dfs(ny, nx, board, visited)
    }
}