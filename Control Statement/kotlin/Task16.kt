fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Input number of rows: ")
    val rows: Int = scanner.nextInt()
    for (i in 1..rows) {
        for (j in 1..i) {
            print(j)
        }
        println()
    }
}