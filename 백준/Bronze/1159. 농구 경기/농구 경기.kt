import java.lang.StringBuilder

fun main() {
    val input = readln().toInt()
    val wordList = IntArray(26)
    val nameList = mutableListOf<String>()
    val st = StringBuilder()
    repeat(input) {
        nameList.add(readln())
    }
    nameList.forEach {
        wordList[it[0] - 'a']++
    }
    wordList.forEachIndexed { index, i ->
        if (i >= 5) {
            st.append('a' + index)
        }
    }
    if (st.toString().isNotEmpty()) {
        println(st.toString())
    } else {
        println("PREDAJA")
    }
}