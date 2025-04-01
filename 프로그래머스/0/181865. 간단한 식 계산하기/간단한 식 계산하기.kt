class Solution {
    fun solution(binomial: String): Int {
        val operator = binomial.find { it == '+' || it == '-' || it == '*' }.toString()
        val numList = binomial.split(operator).map { it.trim() }
        val first = numList[0].toInt()
        val last = numList[1].toInt()
        return when (operator) {
            "+" -> first + last
            "-" -> first - last
            "*" -> first * last
            else -> throw IllegalArgumentException("Unsupported operator")
        }
    }
}