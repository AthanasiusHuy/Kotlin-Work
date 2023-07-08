fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("Enter a")
    var a = scanner.nextDouble()
    println("Enter b")
    var b = scanner.nextDouble()
    println("Enter c")
    var c = scanner.nextDouble()
    var max = 0.0
    when {
        a > b && a > c -> max = a
        b > a && b > c -> max = b
        c > b && c > a -> max = c
    }
    println("Greatest Number $max")
}

