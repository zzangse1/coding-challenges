class Solution {
    fun solution(price: Int): Int {
        val result: Double = if (price >= 500000) {
            price - price * 0.2
        } else if (price >= 300000) {
            price - price * 0.1
        } else if (price >= 100000) {
            price - price * 0.05
        } else {
            price.toDouble()
        }
        return result.toInt()
    }
}