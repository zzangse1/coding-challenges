val br = System.`in`.bufferedReader()

fun main() = with(System.out.bufferedWriter()){
    val (n,k) = br.readLine().split(' ').map{it.toInt()}
    val pSum = br.readLine().split(' ').map{it.toInt()}.toIntArray()
    for(i in 1 until n){
        pSum[i] = pSum[i-1]+pSum[i]
    }
    var answer = pSum[k-1]
    for(i in 0 until n-k){
        answer = answer.coerceAtLeast(pSum[i+k]-pSum[i])
    }
    write("$answer")


    close()
}