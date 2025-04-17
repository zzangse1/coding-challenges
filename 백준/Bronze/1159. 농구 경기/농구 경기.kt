import java.lang.StringBuilder

class Main {
    fun a(str: List<String>): String {
        val seenList = IntArray(26) { 0 }
        val result = StringBuilder()
        str.forEach {
            seenList[it[0] - 'a']++
        }

        seenList.forEachIndexed { index, i ->
            if (i >= 5) {
                result.append('a' + index)
            }
        }
        return if (result.toString() == "") {
            "PREDAJA"
        } else {
            result.toString()
        }
    }
}


fun main() {
    val main = Main()
    val num = readln().toInt()
    val nameList = mutableListOf<String>()
    repeat(num) {
        nameList.add(readln())
    }
    println(main.a(nameList))
}