import kotlin.math.max

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val arr = readln().split(" ").map { it.toInt() }.take(n)

    var sum = arr.take(k).sum()
    var maxSum = sum
    var maxCount = 1

    for (i in k until arr.size) {
        sum = sum - arr[i - k] + arr[i]
        if (sum > maxSum) {
            maxSum = sum
            maxCount = 1
        } else if (sum == maxSum) {
            maxCount++
        }
    }
    if (maxSum == 0) {
        println("SAD")
    } else {
        println(maxSum)
        println(maxCount)
    }
}