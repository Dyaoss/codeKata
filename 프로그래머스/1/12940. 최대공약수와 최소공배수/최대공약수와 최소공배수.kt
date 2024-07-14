class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf()
        answer += gcd(n, m).toInt()
        answer += (n * m) / gcd(n, m).toInt()

        return answer
    }
}

fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a