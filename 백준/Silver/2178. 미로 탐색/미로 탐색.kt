fun main() {
    val dy = arrayOf(-1, 0, 1, 0)
    val dx = arrayOf(0, 1, 0, -1)
    val (n, m) = readln().split(" ").map { it.toInt() }
    val matrix = Array(n) {
        readln().map { it.digitToInt() }
    }
    val visited = Array(n) { IntArray(m) }
    val queue = ArrayDeque<Pair<Int, Int>>()
    visited[0][0] = 1
    queue.add(Pair(0, 0))

    while (queue.isNotEmpty()) {
        val (y, x) = queue.removeFirst()
        for (i in 0..<4) {
            val ny = dy[i] + y
            val nx = dx[i] + x
            if (ny !in 0..<n || nx !in 0..<m || matrix[ny][nx] == 0) continue
            if (visited[ny][nx] != 0) continue
            visited[ny][nx] = visited[y][x] + 1
            queue.add(Pair(ny, nx))
        }
    }
    println("${visited[n - 1][m - 1]}")
}