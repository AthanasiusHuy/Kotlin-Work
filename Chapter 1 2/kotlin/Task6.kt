fun main() {
    val scanner = java.util.Scanner(System.`in`)
    print("Enter the first number: ")
    var a = scanner.nextInt()

    print("Enter the second number: ")
    var b = scanner.nextInt()

    println("Before swapping:")
    println("a = $a, b = $b")

    a = a xor b
    b = a xor b
    a = a xor b

    println("After swapping:")
    println("a = $a, b = $b")
}