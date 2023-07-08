fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Enter a 4-digit number: ")
    val number = scanner.nextInt()

    if (number in 1000..9999) {
        val digit1 = number / 1000
        val digit2 = (number / 100) % 10
        val digit3 = (number / 10) % 10
        val digit4 = number % 10

        val reversedNumber = digit4 * 1000 + digit3 * 100 + digit2 * 10 + digit1
        println("Reversed number: $reversedNumber")
    } else {
        println("Invalid input! Please enter a 4-digit number.")
    }
}
