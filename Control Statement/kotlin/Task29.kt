fun countDigits(number: Long): Int {
    if (number == 0L) {
        return 1
    }

    var count = 0
    var tempNumber = number
    while (tempNumber != 0L) {
        tempNumber /= 10
        count++
    }
    return count
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Enter a positive integer (less than ten billion): ")
    val number = scanner.nextLong()
    scanner.close()

    if (number in 0..9999999999) {
        val count = countDigits(number)
        println("Number of digits: $count")
    } else {
        println("Invalid input! Please enter a positive integer less than ten billion.")
    }
}

