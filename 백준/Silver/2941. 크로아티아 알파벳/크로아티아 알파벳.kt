fun main() {
    val wordlist = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var input = readln()
    wordlist.forEach {
        if (input.contains(it)) {
            input = input.replace(Regex(it), "#")
        }
    }
    println( input.length)
}