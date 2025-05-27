import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val maxSize: Int = 10001
    val cntList: List<Int> = List(maxSize) { 0 } 
    val cntArr = cntList.toIntArray()
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    var numIndex: Int = 0

    for (i in 1..n) {
        numIndex = br.readLine()!!.toInt()
        cntArr[numIndex]++
    }

    var cnt: Int = 0
    val bufferWriter = System.out.bufferedWriter()

    for (i in 1 until maxSize) {
        cnt = cntArr[i]
        for (j in 1..cnt) {
            bufferWriter.write(i.toString())
            bufferWriter.write("\n")
        }
    }
    bufferWriter.flush()
    bufferWriter.close()
}