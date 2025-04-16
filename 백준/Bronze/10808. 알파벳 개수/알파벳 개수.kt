class Main {
    fun a(str: String): String {
        val list = Array<Int>(26) { 0 }
        str.forEachIndexed { index, i ->
            list[i - 'a']++
        }
        return list.map { it }.joinToString(" ")
    }
}


fun main() {
    val main = Main()
    val input = readln()
    println(main.a(input))
}