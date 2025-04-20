fun main() {
    val n = readln().toInt()
    val list = mutableSetOf<Int>()
    repeat(n) {
        list.add(readln().toInt())
    }
    println(list.sorted().joinToString("\n"))
}