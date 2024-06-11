enum class PizzaEnum(
    val sizeInCm: Int
) {
    SMALL(10),
    MEDIUM(20),
    LARGE(30),
    EXTRALARGE(40)
}

fun main() {
    for (pizzaSize in PizzaEnum.entries) {
        println("$pizzaSize is ${pizzaSize.sizeInCm}")
    }
}