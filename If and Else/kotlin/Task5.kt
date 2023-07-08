fun main() {
    var scanner = java.util.Scanner(System.`in`)
    print("Enter mark: ")
    var mark = scanner.nextInt()
    return when {
        mark > 80 -> println("A")
        mark in 61..80 -> println("B")
        mark in 51..60 -> println("C")
        mark in 46..50 -> println("D")
        mark in 25..45 -> println("E")
        else -> println("F")
    }
}