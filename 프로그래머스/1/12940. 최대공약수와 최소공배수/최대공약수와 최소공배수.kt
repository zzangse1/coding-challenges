class Solution {
    fun solution(n: Int, m: Int): IntArray {
        return intArrayOf(gcd(n, m), lcm(n, m))
    }

    fun gcd(a: Int, b: Int): Int {
        return if (a == 0) b else gcd(b % a, a)
    }

    fun lcm(a: Int, b: Int): Int {
        return (a * b) / gcd(a, b)
    }
}