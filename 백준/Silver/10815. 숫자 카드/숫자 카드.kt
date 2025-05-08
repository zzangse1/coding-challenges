fun main() {
    val n = readln().toInt()
    val haveCard = readln().split(" ").map { it.toInt() }.toSet()
    val m = readln().toInt()
    val noCard = readln().split(" ").map { it.toInt() }
    val result = mutableListOf<Int>()

    noCard.forEach {
        result.add(
            if (haveCard.contains(it)) 1 else 0
        )
    }
    println(result.joinToString(" "))
}