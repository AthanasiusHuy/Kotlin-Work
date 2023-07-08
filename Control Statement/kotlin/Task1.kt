fun check(a: Int) = if (a >= 0) "Positive" else "Negative"
fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("Enter Input")
    var input = scanner.nextInt()
    println("Number is ${check(input)}")



}