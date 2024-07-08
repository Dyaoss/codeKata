class Solution {
    fun solution(s: String): Boolean {
        var answer = true

        if (s.length in 1..8) {
            if (s.length == 4 || s.length == 6) {
                if (s.all { it.isDigit() }) {
                    answer = true
                } else answer = false
            }else answer = false
        }else answer = false
        return answer
    }
}