class Solution {
    fun solution(n: Int, control: String): Int {
        var answer: Int = n
        var char: Array<String> = control.toCharArray().map { it.toString() }.toTypedArray() //String을 char 형태로 쪼갠 후 String으로 맵핑 ->  toTypedArray를 통해 array 형태로 바꾸면 쉽게 형변환을 할 수 있다.

        
        for(i in 0 until char.size){
            when(char[i].toString()){
                "w" -> answer += 1
                "s" -> answer -= 1
                "d" -> answer += 10
                else -> answer -= 10
            }
        }
       
        return answer
    }
}