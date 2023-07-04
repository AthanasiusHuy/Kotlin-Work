fun discriminant(a: Double, b: Double, c: Double) = (b * b - 4 * a * c)

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("ax^2 + bx + c = 0, find x")
    println("Enter a")
    var a = scanner.nextDouble()
    println("Enter b")
    var b = scanner.nextDouble()
    println("Enter c")
    var c = scanner.nextDouble()

    val disc = discriminant(a, b, c)

    var x1: Double
    var x2: Double

    when {
        disc > 0 -> {
            x1 = (-b + Math.sqrt(disc)) / (2 * a)
            x2 = (-b - Math.sqrt(disc)) / (2 * a)
            println("Two Solutions:")
            println("x1 = $x1")
            println("x2 = $x2")
        }

        disc == 0.0 -> {
            x1 = -b / (2 * a)
            println("One solution:")
            println("x = $x1")
        }

        else -> {
            println("No Solution")
        }
    }
}