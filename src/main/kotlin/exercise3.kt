import kotlin.jvm.Throws

data class Student(
    val id: Int,
    val fullName: String,
    val grade: Double
)

val listOfStudents = listOf<Student>(
    Student(223, "John", 140.0),
    Student(548, "Mark", 120.0),
    Student(342, "Natali", 150.0),
    Student(781, "Sara", 130.0),
)

@Throws(NullPointerException::class)
fun getStudentById(id:Int):Student {
    return listOfStudents.find { it.id == id } !!
}

fun searchInStudents(search:String):Student? {
    return listOfStudents.find { it.fullName == search }
}

fun main() {
    print("ID?: ")
    val id: Int = readln().toInt()
    println(getStudentById(id))
    print("FullName?: ")
    val name: String = readln()
    println(searchInStudents(name))
}