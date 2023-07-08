fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("Enter Input")
    var input = scanner.nextInt()
    var date:String = when{
        input == 1 -> "Monday"
        input == 2 -> "Tuesday"
        input == 3 -> "Wednesday"
        input == 4 -> "Thursday"
        input == 5 -> "Friday"
        input == 6 -> "Saturday"
        input == 7 -> "Sunday"
        else -> "Please Enter input from 1 to 7"
    }
    println(date)
}