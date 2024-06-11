import javax.swing.text.Position

class Employee(
    val name: String,
    var position: String
)

fun main() {
    val employee1 = Employee("Firuz", "Backend Developer")
    var employee2 = Employee("Raul", "DevOps Engineer")

    println(employee1)
    employee1.position = "Django Backend Developer"
    println(employee1.name)
    println(employee1.position)
    println(employee2)
    employee2.position = "Security Manager"
    println(employee2.name)
    println(employee2.position)
}