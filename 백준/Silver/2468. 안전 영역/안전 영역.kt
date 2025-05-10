fun main() {
    val input = readln().toInt()
    val board = Array(input) {
        readln().split(" ").map { it.toInt() }.toIntArray()
    }

    var maxSafeZone = 0
    for (height in 0..100) {
        var count = 0
        val visited = Array(input) {
            BooleanArray(input)
        }
        for (y in 0 until input) {
            for (x in 0 until input) {
                if (board[y][x] > height && !visited[y][x]) {
                    dfsTest(height, y, x, board, visited)
                    count++
                }
            }
        }
        maxSafeZone = maxOf(maxSafeZone, count)
    }
    println(maxSafeZone)

}

fun dfsTest(n: Int, y: Int, x: Int, board: Array<IntArray>, visited: Array<BooleanArray>) {
    val dy = listOf(-1, 0, 1, 0)
    val dx = listOf(0, 1, 0, -1)

    val row = board.size
    val col = board[0].size
    visited[y][x] = true

    for (i in 0 until 4) {
        val ny = y + dy[i]
        val nx = x + dx[i]
        if (ny !in 0 until row || nx !in 0 until col || board[ny][nx] <= n) continue
        if (visited[ny][nx]) continue
        dfsTest(n, ny, nx, board, visited)
    }
}