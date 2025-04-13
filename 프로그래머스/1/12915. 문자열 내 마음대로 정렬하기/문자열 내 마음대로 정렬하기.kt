class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        val list = strings.sortedWith(compareBy({ it[n] }, { it }))
        return list.toTypedArray()
    }
}