fun reverseString(input: String): String {
    var reversed = StringBuilder()

    for (i in input.length - 1 downTo 0) {
        reversed.append(input[i])
    }

    return reversed.toString()
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("Enter String for Input")
    var input = scanner.nextLine()
    var reversed = reverseString(input)
    println(reversed)
}
