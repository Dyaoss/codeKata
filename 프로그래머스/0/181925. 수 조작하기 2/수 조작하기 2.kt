class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        var sb = StringBuilder()
        
        for(i in 1 until numLog.size){
            when((numLog[i].toInt())-(numLog[i-1].toInt())){
                1 -> sb.append("w")
                -1 -> sb.append("s")
                10 -> sb.append("d")
                else -> sb.append("a")
            }
        }
        
        
        return sb.toString()
    }
}