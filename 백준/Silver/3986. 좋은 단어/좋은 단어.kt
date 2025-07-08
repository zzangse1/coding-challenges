import java.util.Stack

fun main() {
    var cnt = 0
    repeat(readln().toInt()) {
        val string = readln()
        val stack = Stack<Char>()
        for (i in string) {
            if (stack.isNotEmpty() && stack.peek() == i) {
                stack.pop()
            } else {
                stack.push(i)
            }
        }
        if (stack.isEmpty()) cnt++
    }
    println(cnt)

}