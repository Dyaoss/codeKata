class Solution {
    fun solution(n: Int): String {
        var answer = ""

        if (n % 2 == 0) {
            repeat(n / 2) {
                answer += "수박"
            }
        } else if (n == 1) {
            answer = "수"
        } else if (n % 2 == 1) {
            answer = "수"
            repeat(n / 2) {
                answer += "박수"
            }
        }
        return answer
    }
}