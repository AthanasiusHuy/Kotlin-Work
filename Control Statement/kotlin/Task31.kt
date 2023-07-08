fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Enter first number: ")
    var a = scanner.nextInt()
    print("Enter second number: ")
    var b = scanner.nextInt()
    print("Enter third number: ")
    var c = scanner.nextInt()
    if (a < b && b < c) {
        println("Increasing Order")
    } else if (a > b && b > c) {
        println("Decreasing Order")
    } else {
        println("Neither increasing or decreasing order")
    }

}