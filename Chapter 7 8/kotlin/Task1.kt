fun checkString(input: String) {
    if (input.isNotEmpty()) {
        val hasAlphabet = input.any { it in 'a'..'z' || it in 'A'..'Z' }

        when {
            hasAlphabet -> println("The string contains alphabetic characters.")
            else -> println("The string does not contain alphabetic characters.")
        }
    } else {
        println("The string is empty.")
    }
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("Enter Input")
    var string = scanner.nextLine()
    checkString(string)
}