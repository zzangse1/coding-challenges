class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val charToMinIndex = mutableMapOf<Char, Int>()

        for (key in keymap) {
            key.forEachIndexed { index, c ->
                val position = index + 1
                charToMinIndex[c] = minOf(charToMinIndex.getOrDefault(c, Int.MAX_VALUE), position)
            }
        }

        return targets.map { word ->
            var total = 0
            for (ch in word) {
                val cost = charToMinIndex[ch]
                if (cost == null) {
                    total = -1
                    break
                }
                total += cost
            }
            total
        }.toIntArray()
    }
}