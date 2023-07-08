fun main() {
    var scanner = java.util.Scanner(System.`in`)
    print("Enter first number: ")
    var a = scanner.nextInt()
    if (a >= 0) {
        println(a)
    } else {
        println(-a)
    }
}