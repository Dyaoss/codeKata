class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        var arr = IntArray(included.size, {0})
        var n = 0
        
        for (n in 0 until included.size){
            arr[n] = a + (d*(n))
            if(included[n] == true){
                answer += arr[n].toInt()
            }
            
        }
        
        return answer
    }
}