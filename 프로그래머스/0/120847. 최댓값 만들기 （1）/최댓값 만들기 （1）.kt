class Solution {
     fun solution(numbers: IntArray) = numbers.sortedDescending().let { it[0] * it[1] }
}