fun main() {
    val (A, B) = readln().split(" ")
    var minDiff = Int.MAX_VALUE

    for (i in 0..(B.length - A.length)) {
        val sub = B.substring(i, i + A.length)
        val diff = A.zip(sub).count { it.first != it.second }
        minDiff = minOf(minDiff, diff)
    }

    println(minDiff)
}