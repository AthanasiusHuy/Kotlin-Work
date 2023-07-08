fun main() {
    val scanner = java.util.Scanner(System.`in`)
    var sum: Int = 0
    print("Enter n terms of natural number: ")
    var n = scanner.nextInt()
    for (i in 1..n*2) {
        if (i % 2 == 1) {
            println(i)
            sum += i
        }
    }
    println("Sum $sum")
}
