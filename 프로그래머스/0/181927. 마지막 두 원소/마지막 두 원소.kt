class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        if(num_list[num_list.lastIndex] > num_list[num_list.lastIndex - 1]){
            answer = num_list + (num_list[num_list.lastIndex] - num_list[num_list.lastIndex - 1])
        } else {
            answer = num_list + num_list[num_list.lastIndex] * 2
        }
        return answer
    }
}