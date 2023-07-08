fun check(a: Float) = if (a >= 0) "Positive" else "Negative"
fun checkState(a: Float): String {
    return when {
        Math.abs(a) < 1 -> "Small"
        Math.abs(a) > 1_000_000 -> "Large"
        else -> ""
    }
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("Enter Input")
    var input = scanner.nextFloat()
    if (input == 0f) {
        println(" Zero")
    } else {
        println("${checkState(input)} ${check(input)}")
    }
}