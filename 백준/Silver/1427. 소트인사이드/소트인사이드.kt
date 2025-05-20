fun main() {
    val input = readln().map { it.digitToInt() }
    println(input.sortedDescending().joinToString(""))
}