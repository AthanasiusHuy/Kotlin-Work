import java.math.BigInteger

fun factorial(n: Int): BigInteger {
    var result = BigInteger.ONE
    for (i in 2..n) {
        result = result.multiply(BigInteger.valueOf(i.toLong()))
    }
    return result
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("Enter number to find Factorial")
    var n = scanner.nextInt()
    val factorialResult = factorial(n)
    println("Factorial of $n is: $factorialResult")
}