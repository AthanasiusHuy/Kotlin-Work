fun multi(a: Int, b: Int) = a * b
fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Enter the first number: ")
    val a = scanner.nextInt()

    print("Enter the second number: ")
    val b = scanner.nextInt()
    println("Result ${multi(a,b)}")
}