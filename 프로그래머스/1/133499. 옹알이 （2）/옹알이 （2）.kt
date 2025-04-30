class Solution{
    fun solution(babbling: Array<String>)= babbling.count {
        it.matches("^(aya(?!aya)|ye(?!ye)|woo(?!wo)|ma(?!ma))+$".toRegex())
    }
}