fun main() {
    var scanner = java.util.Scanner(System.`in`)
    print("Enter first number: ")
    var a = scanner.nextInt()
    print("Enter second number: ")
    var b = scanner.nextInt()
    return when {
        a >= b -> println(a)
        else -> println(b)
    }
}