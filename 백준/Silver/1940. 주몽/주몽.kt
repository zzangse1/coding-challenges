fun main() {
    val n = readln().toInt()
    val m = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }.take(n)

    val sortArr = arr.sorted()
    var cnt = 0
    for (i in sortArr.indices) {
        for (j in i + 1..<sortArr.size) {
            if (sortArr[i] + sortArr[j] == m) cnt++
        }
    }
    println(cnt)

}