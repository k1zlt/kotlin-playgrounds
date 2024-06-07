fun main() {
    print("Input a number: ")
    var i = readln().toInt()
    while (i>0) {
        println("Left ${--i} line(s)")
    }
}