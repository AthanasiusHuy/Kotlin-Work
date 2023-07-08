fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Input number of rows: ")
    val rows = scanner.nextInt()
    scanner.close()

    for (i in 0 until rows) {
        var number = 1
        val spaces = " ".repeat((rows - i) * 2)
        print(spaces)
        for (j in 0..i) {
            System.out.format("%4d", number)
            number = number * (i - j) / (j + 1)
        }

        println()
    }
}