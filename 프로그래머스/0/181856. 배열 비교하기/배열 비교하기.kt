class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        return when {
            arr1.size == arr2.size -> {
                diffArr(arr1.sum(), arr2.sum())
            }

            else -> diffSize(arr1.size, arr2.size)
        }
    }
}

fun diffArr(sum1: Int, sum2: Int): Int {
    return when {
        sum1 > sum2 -> 1
        sum1 < sum2 -> -1
        else -> 0
    }
}

fun diffSize(sum1: Int, sum2: Int): Int {
    return when {
        sum1 > sum2 -> 1
        sum1 < sum2 -> -1
        else -> 0
    }
}