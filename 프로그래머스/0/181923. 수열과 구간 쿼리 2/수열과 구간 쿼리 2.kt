class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer = IntArray(queries.size)
        for (i in queries.indices) {
            val s = queries[i][0]
            val e = queries[i][1]
            val k = queries[i][2]
            var min = Int.MAX_VALUE
            for (j in s..e) {
                if (arr[j] > k && arr[j] < min) {
                    min = arr[j]
                }
            }
            answer[i] = if (min == Int.MAX_VALUE) -1 else min
        }
        return answer
    }
}