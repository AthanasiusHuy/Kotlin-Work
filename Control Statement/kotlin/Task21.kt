fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Enter the number of rows: ")
    val rows = scanner.nextInt()
    scanner.close()

    var spaces = rows - 1
    var stars = 1

    // Upper half
    for (i in 1..rows) {
        repeat(spaces) {
            print(" ")
        }
        repeat(stars) {
            print("*")
        }
        println()
        spaces--
        stars += 2
    }

    spaces = 1
    stars = rows * 2 - 3

    // Lower half
    for (i in 1 until rows) {
        repeat(spaces) {
            print(" ")
        }

        repeat(stars) {
            print("*")
        }
        println()
        spaces++
        stars -= 2
    }
}
