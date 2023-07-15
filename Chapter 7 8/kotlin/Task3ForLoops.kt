fun factorialFORLOOPS(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("Enter number to find Factorial")
    var n = scanner.nextInt()
    val factorialResult = factorialFORLOOPS(n)
    println("Factorial of $n is: $factorialResult")
}