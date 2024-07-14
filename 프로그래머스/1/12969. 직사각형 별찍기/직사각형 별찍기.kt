fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    
    repeat(b.toInt()){
        repeat(a.toInt()){
            print('*')
        }
        println("")
    }
}