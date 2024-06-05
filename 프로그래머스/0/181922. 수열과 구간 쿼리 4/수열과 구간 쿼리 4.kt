class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for (i in 0 until queries.size) {
            val s = queries[i][0]
            val e = queries[i][1]
            val k = queries[i][2]
            for (j in s..e) {
                if (j % k == 0) {
                    arr[j]++
                }
            }
        }

        return arr
    }
}