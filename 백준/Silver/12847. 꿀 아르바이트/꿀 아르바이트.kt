fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr = readln().split(" ").map { it.toLong() }.take(n)

    var sum = arr.take(m).sum()
    var maxSum = sum

    for (i in m..<n) {
        sum = sum - arr[i - m] + arr[i]
        maxSum = maxOf(sum, maxSum)
    }
    println(maxSum)
}