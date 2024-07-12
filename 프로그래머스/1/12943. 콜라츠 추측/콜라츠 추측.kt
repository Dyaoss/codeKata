class Solution {
    fun solution(num: Int): Int {
        var firstNum = num.toLong()
        var count = 0

        while (firstNum > 1) {

            if (firstNum % 2 == 0L) {
                firstNum = firstNum / 2
                count++
            } else {
                firstNum = (firstNum * 3) + 1
                count++
            }

            if (count > 500)
                return -1
        }
        return count
    }
}