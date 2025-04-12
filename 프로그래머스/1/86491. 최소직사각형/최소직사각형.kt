class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var a = 0
        var b = 0
        sizes.map {
            var temp = 0
            if (it.last() > it.first()) {
                temp = it.first()
                it[0] = it.last()
                it[1] = temp
            } else {
                it
            }
        }
    

        for (i in 0 until sizes.size) {
            if (a < sizes[i][0]) {
                a = sizes[i][0]
            }
            for (j in 0..1) {
                if (b < sizes[i][1]) {
                    b = sizes[i][1]
                }
            }
        }
        return a * b
    }
}