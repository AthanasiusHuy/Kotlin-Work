fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Enter first number: ")
    var a = scanner.nextInt()
    print("Enter second number: ")
    var b = scanner.nextInt()
    print("Enter third number: ")
    var c = scanner.nextInt()
    if (a == b && b == c) {
        println("All number are the same")
    } else if (a != b && b != c && a != c) {
        println("All numbers are different")
    } else {
        println("Neither all are equal nor different")
    }

}