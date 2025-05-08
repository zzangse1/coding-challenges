fun main() {
    val dy = listOf(-1, 0, 1, 0)
    val dx = listOf(0, 1, 0, -1)
    val (n, m) = readln().split(" ").map { it.toInt() }
    val miro = List(n) {
        readln().map { it.digitToInt() }
    }
    val visited = Array(n) { IntArray(m) }
    val queue: ArrayDeque<Pair<Int, Int>> = ArrayDeque()
    visited[0][0] = 1
    queue.add(Pair(0, 0))

    while (queue.isNotEmpty()) {
        val (y, x) = queue.removeFirst()
        for (i in 0 until 4) {
            val ny = dy[i] + y
            val nx = dx[i] + x
            if (ny !in 0 until n || nx !in 0 until m || miro[ny][nx] == 0) continue
            if (visited[ny][nx] != 0) continue
            visited[ny][nx] = visited[y][x] + 1
            queue.add(Pair(ny, nx))
        }
    }
    println("${visited[n-1][m-1]}")
}
