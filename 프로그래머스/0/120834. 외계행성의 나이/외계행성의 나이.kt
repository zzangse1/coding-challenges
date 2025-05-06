class Solution {
    fun solution(age: Int): String {
        val list = ('a'..'z').map { it }
        val a = age.toString().map {
            println(it)
            println(it.digitToInt())
            list[it.digitToInt()]
        }
        return a.joinToString("")
    }
}