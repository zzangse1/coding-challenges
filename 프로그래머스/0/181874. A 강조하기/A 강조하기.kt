class Solution {
    fun solution(myString: String): String {
        return myString.map {
            when (it) {
                'a' -> it.uppercaseChar()
                'A' -> it
                else -> it.lowercaseChar()
            }
        }.joinToString("")
    }
}