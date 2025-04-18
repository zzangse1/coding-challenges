import kotlin.math.sign

class Main {
    fun a(regex: String, str: List<String>): List<String> {
        val (pre, suf) = regex.split("*")
        val answer = mutableListOf<String>()
        for (s in str) {
            if (s.length < pre.length + suf.length) {
                answer.add("NE")
                continue
            }
            val prefix = s.startsWith(pre)
            val suffix = s.endsWith(suf)

            if (prefix && suffix) {
                answer.add("DA")
            } else {
                answer.add("NE")
            }
        }
        return answer
    }
}

fun main() {
    val main = Main()
    val input = readln().toInt()
    val regex = readln()
    val list = mutableListOf<String>()
    repeat(input) {
        list.add(readln())
    }
    val a = (main.a(regex, list))
    for (i in 0 until a.size) {
        println(a[i])
    }
}