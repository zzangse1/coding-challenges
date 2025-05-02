class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val stageList = IntArray(N + 2)
        val personList = IntArray(N + 2)
        val percentList = DoubleArray(N + 2)

        var person = stages.size
        stages.forEach {
            stageList[it]++
        }
        for (i in 1..N) {
            personList[i] = person
            person -= stageList[i]
        }


        for (i in 1..N) {
            percentList[i] = if (personList[i] == 0) 0.0 else stageList[i] / personList[i].toDouble()
        }


        return (1..N).sortedByDescending { percentList[it] }.toIntArray()
    }
}
