class Solution {
    fun solution(n: Int): String {
        val list = listOf("수", "박")
        val a = StringBuilder()
        for (i in 0 until n) {
            if (i%2==0) a.append(list[0]) else a.append(list[1])
        }
        return a.toString()
    }
}