import java.util.Scanner

fun isLeapYear(year: Int): Boolean {
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true
            } else {
                return false
            }
        } else {
            return true
        }
    } else {
        return false
    }
}

fun getDaysInMonth(month: Int, year: Int): Int {
    return when (month) {
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        2 -> if (isLeapYear(year)) 29 else 28
        else -> -1 // Invalid month
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the year: ")
    val year = scanner.nextInt()
    print("Enter the month: ")
    val month = scanner.nextInt()
    val daysInMonth = getDaysInMonth(month, year)
    println("Number of days: $daysInMonth")
}



