fun main() {
    for (i in 1..10) {
        var spaces = 10 - i - 5
        if (spaces < 0) spaces = -spaces
        for (space in 1..spaces) print(' ')
        var stars = i
        if (stars >= 6) {
            stars = 10 - stars
        }
        for (star in 1..stars) print('*')
        println()
    }
}