fun factorialWHILELOOPS(n: Int): Int {
    var result = 1
    var i = 1
    while (i <= n) {
        result *= i
        i++
    }
    return result
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("Enter number to find Factorial")
    var n = scanner.nextInt()
    val factorialResult = factorialWHILELOOPS(n)
    println("Factorial of $n is: $factorialResult")
}