class Main {
    fun a(str: String): String {
        val sb = StringBuilder()
        str.forEach { c ->
            sb.append(
                when {
                    c in 'a'..'z' -> 'a' + (c - 'a' + 13) % 26
                    c in 'A'..'Z' -> 'A' + (c - 'A' + 13) % 26
                    else -> c
                }
            )
        }
        return sb.toString()
    }
}

fun main() {
    val main = Main()
    val input = readln()
    println(main.a(input))
}