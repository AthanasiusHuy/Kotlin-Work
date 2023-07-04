fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("ax + b = 0, find x")
    println("Enter a")
    var a = scanner.nextDouble()
    println("Enter b")
    var b = scanner.nextDouble()
    var x = -b / a
    println("x = $x")
}