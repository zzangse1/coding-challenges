
fun main() {
    val n = readln().toInt()
    val wordList = mutableListOf<String>()
    repeat(n) {
        wordList.add(readln())
    }
    val sortedUniqueWords = wordList
        .distinct()
        .sortedWith(compareBy({ it.length }, { it }))

    sortedUniqueWords.forEach {
        println(it)
    }
}