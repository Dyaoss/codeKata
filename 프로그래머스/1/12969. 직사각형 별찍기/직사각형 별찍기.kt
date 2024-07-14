fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    for (i in 1..b.toInt()) {
        for (i in 1..a.toInt()) {
            print('*')
        }
        println("")
    }
}