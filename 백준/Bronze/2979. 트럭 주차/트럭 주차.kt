class Main {
    fun a(cost: List<Int>, car: List<Int>): Int {
        val price = IntArray(car.max()) { 0 }
        for (i in car.indices step 2) {
            val start = car[i]
            val end = car[i + 1]
            for (j in start until end) {
                price[j]++
            }
        }
        return price.sumOf {
            when (it) {
                0 -> 0
                1 -> it * cost[0]
                2 -> it * cost[1]
                else -> it * cost[2]
            }
        }
    }
}


fun main() {
    val main = Main()
    val cost = readln().split(" ").map { it.toInt() }.toMutableList()
    val carList = mutableListOf<Int>()


    repeat(3) {
        val input = readln().split(" ").map { it.toInt() }
        carList.addAll(input)
    }
    println(main.a(cost, carList))
}