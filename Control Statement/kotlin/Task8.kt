import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter character: ")
    val input = scanner.nextLine()

    if (input.length == 1 && input[0].isLetter()) {
        val character = input[0].toUpperCase()

        if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            println("Vowel")
        } else {
            println("Consonant")
        }
    } else {
        println("Error: Single Character from Alphabet only.")
    }
}