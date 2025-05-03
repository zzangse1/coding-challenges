import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println(BufferedReader(InputStreamReader(System.`in`)).readLine().toInt().countOneBits())
}