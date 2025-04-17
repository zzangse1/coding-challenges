class Main {
    fun a(str: String) = if (str == str.reversed()) 1 else 0
}


fun main() {
    val main = Main()
    println(main.a(readln()))
}