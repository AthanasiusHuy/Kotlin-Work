fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("Enter First Float Number")
    var num1 = scanner.nextFloat()
    println("Enter Second Float Number")
    var num2 = scanner.nextFloat()
    val roundedNumber1 = Math.round(num1 * 1000f) / 1000f
    val roundedNumber2 = Math.round(num2 * 1000f) / 1000f
    if (roundedNumber1 == roundedNumber2) {
        println("The numbers are the same up to three decimal places.")
    } else {
        println("The numbers are different.")
    }
}