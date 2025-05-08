fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val s = HashSet<String>()
    repeat(n) {
        s.add(readln())
    }
    var answer = 0
    repeat(m) {
        if (s.contains(readln())) answer++
    }
    println(answer)
}