fun main() {
    val input = readln().lowercase()
    val mainList = IntArray(27)

    for (element in input) {
        val word = element - 'a' + 1
        mainList[word]++
    }

    val maxValue = mainList.maxOrNull() ?: 0

    val maxIndices = mainList
        .mapIndexed { index, value -> if (value == maxValue) index else null }
        .filterNotNull()

    if (maxIndices.size > 1) {
        println("?")
    } else {
        println((maxIndices.first() + 64).toChar())
    }
}