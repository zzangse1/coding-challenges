class Solution {
    fun solution(cipher: String, code: Int): String {
        val result = StringBuilder()
        for (i in code..cipher.length step code) {
            result.append(cipher[i-1])
        }
        return result.toString()
    }
}