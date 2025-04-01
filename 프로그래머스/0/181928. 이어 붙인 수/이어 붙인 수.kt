import java.lang.StringBuilder

class Solution {
    fun solution(num_list: IntArray): Int {
        val a = StringBuilder()
        val b = StringBuilder()
        num_list.filter { it % 2 == 0 }.forEach { a.append(it) }
        num_list.filter { it % 2 != 0 }.forEach { b.append(it) }
        val result = a.toString().toInt() + b.toString().toInt()
        return result
    }
}
