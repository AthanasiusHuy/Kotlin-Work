fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("Input number of rows: ")
    val rows = scanner.nextInt()
    for (i in 1..rows) {
        for (j in 1..i) {
            print(" ")
        }
        for (k in rows downTo i) {
            print("* ")
        }
        println()
    }
}