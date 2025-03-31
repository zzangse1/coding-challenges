class Solution {
    fun solution(n: Int, control: String): Int {
        var a = n
        control.forEach {
            when (it) {
                'w' -> a += 1
                's' -> a -= 1
                'd' -> a += 10
                'a' -> a -= 10
            }
        }
        return a
    }
}