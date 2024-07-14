import kotlin.math.pow
import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var toBase3 = MakeBase3(n)
        var toBase10 = ReverseArray(toBase3)
        answer = ConvertToBase10(toBase10)

        return answer
    }
}

fun MakeBase3(x: Int): MutableList<Int> {
    var a = x
    var base3 = mutableListOf<Int>()

    while (a / 3 > 0) {
        base3.add(a % 3)
        a = (a / 3)
    }
    base3.add(a % 3)

    return base3
}

fun ReverseArray(x: MutableList<Int>): MutableList<Int> {
    return x.reversed().toMutableList()
}

fun ConvertToBase10(x: MutableList<Int>): Int {
    var total = 0

    for (i in 0..x.size - 1) {
        total += x[i] * 3.0.pow(i).toInt()
    }
    return total
}