class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = arr.filter { it % divisor == 0 }.sorted().toIntArray()
        if (answer.isEmpty()) {
            return intArrayOf(-1)
        } else {
            return answer
        }
    }
}