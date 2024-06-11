fun main() {
    val height = 5;
    for (i in 1..5) printStarts(i)
}

fun printStarts(n: Int) {
    for (i in 1..n) print('*')
    println()
}