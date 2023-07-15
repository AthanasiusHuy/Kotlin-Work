fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("Enter Dividend")
    var dividend = scanner.nextInt()
    println("Enter Divisor")
    var divisor = scanner.nextInt()

    var quotient = dividend / divisor
    var remainder = dividend % divisor

    println("Dividend: $dividend")
    println("Divisor: $divisor")
    println("Quotient: $quotient")
    println("Remainder: $remainder")
}