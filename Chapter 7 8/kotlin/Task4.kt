fun checkLeapYear(year: Int): String {
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return "Leap Year"
            } else {
                return "Not Leap Year"
            }
        } else {
            return "Leap Year"
        }
    } else {
        return "Not Leap Year"
    }
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Enter the year: ")
    val year = scanner.nextInt()
    println(checkLeapYear(year))
}