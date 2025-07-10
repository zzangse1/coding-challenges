fun main() {
    val arr = IntArray(104)
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    repeat(3) {
        val (s, e) = readln().split(" ").map { it.toInt() }
        for (i in s..<e) {
            arr[i]++
        }
    }

    val result = arr.sumOf {
        when (it) {
            0 -> 0
            1 -> 1 * a
            2 -> 2 * b
            else -> 3 * c
        }
    }
    println(result)
}