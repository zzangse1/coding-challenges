class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var result = -1
        var i = idx
        while (true) {
            if (arr[i] == 1) {
                result = i
                break
            } else if (i == arr.size - 1) {
                break
            }
            i++
        }
        return result
    }
}