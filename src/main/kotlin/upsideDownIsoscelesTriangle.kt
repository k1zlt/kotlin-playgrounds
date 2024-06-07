fun main() {
    val a = 9
    for (i in a downTo 1) {
        for (s in a-i downTo 1) {
            print(' ')
        }
        for (j in 1..<2 * i) {
            print('*')
        }
        println()
    }
}
