class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        var kim = "Kim"
        
        for (i in 0 .. seoul.size - 1){
            if(seoul[i] == kim){
                answer = "김서방은 ${i}에 있다"
            }
        }
        return answer
    }
}