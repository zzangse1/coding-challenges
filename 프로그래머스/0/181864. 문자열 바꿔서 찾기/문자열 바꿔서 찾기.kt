class Solution {
    fun solution(myString: String, pat: String): Int {
        val real = StringBuilder()
        myString.map {
            when (it) {
                'A' -> real.append('B')
                else -> real.append('A')
            }
        }
        println(real)
        return if (real.contains(pat)) 1 else 0
    }
}