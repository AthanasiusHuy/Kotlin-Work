fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("Enter first number: ")
    val a = scanner.nextDouble()
    println("Enter second number: ")
    val b = scanner.nextDouble()
    println("Enter third number: ")
    val c = scanner.nextDouble()
    println("Enter fourth number: ")
    val d = scanner.nextDouble()
    println("Enter fifth number: ")
    val e = scanner.nextDouble()
    var sum = a + b + c + d + e
    var avg = sum / 5
    println("Sum $sum")
    println("Average $avg")
}