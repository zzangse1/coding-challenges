fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    val arr = List(n) {
        readln().trim().map { it.digitToInt() }
    }
    var result = 0
    for (i in arr) {
        var sum = i.take(k).sum()
        if (sum == 0) result++
        for (j in k..<i.size) {
            sum = sum - i[j - k] + i[j]

            if (sum == 0) result++
        }

    }
    println(result)

}