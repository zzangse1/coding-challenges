class Solution {
    fun solution(new_id: String): String {
        val allowedChars = ('a'..'z') + ('0'..'9') + listOf('-', '_', '.')
        var newId = new_id.lowercase()
            .filter { it in allowedChars }
            .replace(Regex("\\.{2,}"), ".")
            .trim('.')

        if (newId.isEmpty()) newId = "a"
        if (newId.length > 15) newId = newId.substring(0, 15).trimEnd('.')
        while (newId.length < 3) newId += newId.last()

        return newId
    }
}