class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var total: Long = 0
        for (i in 1..count) {
            total += (price * i)
        }
        answer = -((money - total).toLong())
        if (answer <= 0) return 0
        else return answer
    }
}