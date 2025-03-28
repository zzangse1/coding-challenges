class Solution {
    fun solution(names: Array<String>): Array<String> {
        val a = mutableListOf<String>()
        for (i in names.indices) {
            if (i % 5 == 0) {
                a.add(names[i])
            }
        }
        return a.toTypedArray()
    }
}