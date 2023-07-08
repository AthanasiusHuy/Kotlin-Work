fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Enter the number of rows: ")
    val rows = scanner.nextInt()
    scanner.close()

    // Upper half
    for (i in 1..rows) {
        for (j in 1..rows - i) {
            print(" ")
        }

        for (j in 1..i) {
            print(('A' + j - 1).toChar())
        }

        for (j in i - 1 downTo 1) {
            print(('A' + j - 1).toChar())
        }

        println()
    }

    // Lower half
    for (i in rows - 1 downTo 1) {
        for (j in 1..rows - i) {
            print(" ")
        }

        for (j in 1..i) {
            print(('A' + j - 1).toChar())
        }

        for (j in i - 1 downTo 1) {
            print(('A' + j - 1).toChar())
        }

        println()
    }
}
