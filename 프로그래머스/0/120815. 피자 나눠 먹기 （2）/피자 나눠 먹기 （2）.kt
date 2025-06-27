class Solution {
    fun solution(n: Int): Int {
        var pizza = 1
        while (pizza * 6 % n != 0) {
            pizza++
        }
        return pizza
    }
}