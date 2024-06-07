class Solution {
    fun solution(n: Int): IntArray {
        var temp = n

        var list = mutableListOf<Int>()
        
        list.add(n)
        
        while(temp != 1){
            if(temp % 2 == 0){
                temp = temp / 2
                list.add(temp)
            } else{
                temp = (3 * temp + 1)
                list.add(temp)
            }
        }

        return list.toIntArray()
    }
}