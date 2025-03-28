class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        val a = mutableListOf<String>()
        todo_list.forEachIndexed { index, s ->
            if (!finished[index]) {
                a.add(s)
            }
        }
        return a.toTypedArray()
    }
}