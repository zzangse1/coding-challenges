fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr = List(n) {
        readln().split(" ").map { it.toInt() }
    }
    val k = readln().toInt()
    val arr2 = IntArray(m) { 0 }
    for (i in arr) {
        for (j in 0..<m) {
            arr2[j] += i[j]
        }
    }
    var sum = arr2.take(k).sum()
    var maxSum = sum
    for (i in k..<m) {
        sum = sum - arr2[i - k] + arr2[i]
        maxSum = maxOf(sum, maxSum)
    }
    println(maxSum)
}