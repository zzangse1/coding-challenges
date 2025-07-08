fun main() {
    val input = readln()
    val cnt = IntArray(104)
    var oddCount = 0
    var oddChar = ' '
    // 문자 개수 카운트
    for (c in input) cnt[c.code]++

    // 홀수 판단
    for (c in 'A'..'Z') {
        if (cnt[c.code] % 2 != 0) {
            oddCount++
            oddChar = c
        }
    }

    // 팰린드롬 판단
    if (oddCount > 1) {
        println("I'm Sorry Hansoo")
        return
    }
    val sb = StringBuilder()
    for (i in 'A'..'Z') {
        repeat(cnt[i.code] / 2) {
            sb.append(i)
        }
    }

    val first = sb.toString()
    val last = sb.reverse().toString()

    if (oddCount == 1) {
        println(first + oddChar + last)
    } else {
        println(first+last)
    }
}