class Solution {
    fun solution(s: String): String {
        var answer = ""
        var char = s.toCharArray()
        var temp: CharArray = charArrayOf()
        var length: Int = char.size / 2

        if (char.size % 2 == 0) {
            temp += char[length - 1]
            temp += char[length]
        }else{
            temp += char[length]
        }
        answer = String(temp)
        return answer
    }
}