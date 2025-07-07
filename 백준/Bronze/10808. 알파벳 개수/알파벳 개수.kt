fun main() {
    val wordList = IntArray(26)
    val word = readln()
    word.forEach {
        wordList[it-'a']++
    }
    println(wordList.joinToString(" "))
}