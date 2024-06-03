class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach { innerArr ->
            val temp = arr[innerArr[0]]
            arr[innerArr[0]] = arr[innerArr[1]]
            arr[innerArr[1]] = temp
        }

        return arr
    }
}