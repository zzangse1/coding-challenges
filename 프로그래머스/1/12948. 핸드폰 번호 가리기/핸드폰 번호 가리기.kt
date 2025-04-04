class Solution {
    fun solution(phone_number: String): String {
        val a = StringBuilder()
        for (i in 0 until phone_number.length - 4) {
            a.append("*")
        }
        return a.append(phone_number.substring(phone_number.length - 4, phone_number.length)).toString()
    }
}