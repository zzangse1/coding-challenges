class Solution {
    fun solution(my_string: String, n: Int): String {
        var a = ""
        for (element in my_string) {
            for (j in 0 until n) {
                a += element
            }
        }
        return a
    }
}

fun main() {
    val a = Solution()
    println(a.solution("hello", 3))
}