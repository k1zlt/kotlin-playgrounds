fun main()
{
    var weekday = "Monday"
    var time = when (weekday) {
        "Monday" -> "8 AM to 12 PM (8:00 - 12:00)"
        "Tuesday" -> "8 AM to 6 PM (8:00 - 18:00)"
        "Wednesday" -> "8 AM to 6 PM (8:00 - 18:00)"
        "Thursday" -> "8 AM to 6 PM (8:00 - 18:00)"
        "Friday" -> "8 AM to 9 PM (8:00 - 21:00)"
        "Saturday" -> "9 AM to 4 PM (9:00 - 16:00)"
        "Sundat" -> "8 AM to 4 PM (8:00 - 16:00)"
        else -> "What?"
    }
    println("On $weekday, the opening hours are $time.")
}