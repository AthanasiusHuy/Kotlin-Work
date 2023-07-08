fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Enter n of terms: ")
    val n = scanner.nextInt()
    for (i in 1..n) {
        var result = i * n
        println("$n X $i = $result")
    }
}