class Player(val name: String, val lastname: String, var totalScore: Int = 0, var personalBestScore: Int = 0) {
    fun fullName(): String{
        return "${this.name} ${this.lastname}"
    }
}

class Score(var totalScore: Int = 0, var personalBestScore: Int = 0) {
    fun updateScore(newScore: Int) {
        if (personalBestScore < newScore) {
            personalBestScore = newScore
        }
        totalScore+= newScore
    }

    fun getBest(current: Int): Int {
        if (personalBestScore < current) return current
        return personalBestScore
    }
}

fun main() {
    val P1 = Player("Firuz", "Azizbekov")
    val P2 = Player("Elon", "Musk")
    println(P1.fullName())
    println(P2.fullName())

    var lvlScore = 0
}