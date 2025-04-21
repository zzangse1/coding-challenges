fun main() {
    val t = readln().toInt() // 테스트 케이스 수
    repeat(t) {
        val n = readln().toInt()
        val map = mutableMapOf<String, Int>()
        repeat(n) {
            val (_, kind) = readln().split(" ")
            map[kind] = map.getOrDefault(kind, 0) + 1
        }
        var result = 1
        for (item in map.values) {
            result *= (item + 1)
        }
        println(result-1)
    }
}