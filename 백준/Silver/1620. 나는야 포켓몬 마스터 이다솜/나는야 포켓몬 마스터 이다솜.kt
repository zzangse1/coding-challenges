class Main {
    fun a(pokemonNumberMap: Map<Int, String>, pokemonNameMap: Map<String, Int>, find: List<String>): List<String> {
        val answer = mutableListOf<String>()
        find.forEach {
            val result = if (it.all { ch -> ch.isDigit() }) {
                pokemonNumberMap[it.toInt()] ?: ""
            } else {
                pokemonNameMap[it]?.toString() ?: ""
            }
            answer.add(result)
        }
        return answer
    }
}

fun main() {
    val a = Main()
    val (n, m) = readln().split(" ")
    val pokemonIntMap = mutableMapOf<Int, String>()
    val pokemonStringMap = mutableMapOf<String, Int>()
    val findList = mutableListOf<String>()
    for (i in 1..n.toInt()) {
        val name = readln()
        pokemonIntMap[i] = name
        pokemonStringMap[name] = i
    }

    repeat(m.toInt()) {
        findList.add(readln())
    }
    println(a.a(pokemonIntMap, pokemonStringMap, findList).joinToString("\n"))
}