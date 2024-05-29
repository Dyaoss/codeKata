class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var sumNum: Int = 0
        var mulNum: Int = 1
        
        for(i in 0 until num_list.size){
            sumNum += num_list[i]
        }
        
        for(j in 0 until num_list.size){
            mulNum = mulNum * num_list[j]
        }
        
        if( mulNum < (sumNum*sumNum) ){
            answer = 1
        }else{ answer = 0 }
        return answer
    }
}