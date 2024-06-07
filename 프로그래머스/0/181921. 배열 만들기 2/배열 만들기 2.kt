class Solution {
   fun solution(l: Int, r: Int): IntArray {
    val result = mutableListOf<Int>()

    var found = false
    for (i in l..r) {
        if (containsOnly05(i)) {
            result.add(i)
            found = true
        }
    }

    return if (found) result.toIntArray() else intArrayOf(-1)
}

fun containsOnly05(num: Int): Boolean {
    var n = num
    while (n > 0) {
        val digit = n % 10
        if (digit != 0 && digit != 5) {
            return false
        }
        n /= 10
    }
    return true
}

fun main() {
    val l = 10
    val r = 50
    val result = solution(l, r)
    println(result.joinToString(", "))
}

}