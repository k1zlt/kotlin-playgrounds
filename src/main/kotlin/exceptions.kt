class MyError: Throwable("My throwable exception")

fun somefunc() {
    throw MyError()
    println("Will not be printed")
}

fun main() {
    try {
        somefunc()
    } catch (t: MyError) {
        println("Caught: $t")
    }
}