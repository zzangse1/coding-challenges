fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val arr = readln().split(" ").map { it.toInt() }.take(n)

    var sum = arr.take(k).sum()
    var maxSum = sum
    for (i in 1 until n) {
        sum = sum - arr[(i - 1) % n] + arr[(i + k - 1) % n]
        maxSum = maxOf(sum, maxSum)
    }
    println(maxSum)
}