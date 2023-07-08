fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Input number of rows: ")
    val rows: Int = scanner.nextInt()
    var number: Int = 1
    for (i in 1..rows) {
        for (j in 1..i) {
            print("$number ");
            number++;
        }
        println()
    }
}