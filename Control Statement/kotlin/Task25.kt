fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Input number of rows: ")
    val rows = scanner.nextInt()
    scanner.close()

    // Upper half
    for (i in 1..rows) {
        for (j in 1..rows - i) {
            print(" ")
        }

        for (j in i downTo 1) {
            print(j)
        }

        for (j in 2..i) {
            print(j)
        }

        println()
    }

    // Lower half
    for (i in rows - 1 downTo 1) {
        for (j in 1..rows - i) {
            print(" ")
        }

        for (j in i downTo 1) {
            print(j)
        }

        for (j in 2..i) {
            print(j)
        }

        println()
    }
}
