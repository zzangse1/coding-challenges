class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        val total = price.toLong() * count * (count + 1) / 2
        return if (total <= money) 0L else total - money
    }
}